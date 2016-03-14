//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package com.prolucid.thriftshell;

import java.io.*;
import java.util.*;

import com.prolucid.thriftshell.messages.*;
import org.apache.log4j.Logger;

import backtype.storm.multilang.ShellMsg;
import backtype.storm.multilang.ISerializer;
import backtype.storm.multilang.BoltMsg;
import backtype.storm.multilang.NoOutputException;
import backtype.storm.multilang.SpoutMsg;
import backtype.storm.task.TopologyContext;

import org.apache.storm.shade.org.joda.time.DateTime;
import org.apache.storm.shade.org.joda.time.format.ISODateTimeFormat;
import org.apache.thrift.*;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TIOStreamTransport;

public class ThriftSerializer implements ISerializer {
    public static Logger LOG = Logger.getLogger(ThriftSerializer.class);
	private TProtocol protocol;
	private static NoneStruct none = new NoneStruct();

	public void initialize(OutputStream processIn, InputStream processOut) {
        this.protocol = new TBinaryProtocol(
				new TIOStreamTransport(
						new BufferedInputStream(processOut),
						new BufferedOutputStream(processIn)));
	}
    
    Object ofVariant(Variant v) {
		switch (v.getSetField()) {
			case ISO8601_VAL:
				return (v.isSetIso8601Val() ? new DateTime(v.getIso8601Val()) : null);
			case BYTES_VAL:
				return (v.isSetBytesVal() ? v.getBytesVal() : null);
			case NONE:
				return null;
			default:
				return v.getFieldValue();
		}
    }
    
    Variant toVariant(Object o) {
        Variant v = new Variant();
        if(o instanceof Boolean) {
            v.setBoolVal((Boolean)o);
        } else if(o instanceof Double) {
            v.setDoubleVal((Double)o);
        } else if(o instanceof Byte) {
            v.setByteVal((Byte)o);
        } else if(o instanceof Integer) {
            v.setInt32Val((Integer) o);
        } else if(o instanceof Long) {
            v.setInt64Val((Long)o);
        } else if(o instanceof String) {
            v.setStrVal((String)o);
        } else if(o instanceof DateTime) {
            v.setIso8601Val(((DateTime)o).toString(ISODateTimeFormat.dateTime()));
		} else if(o instanceof byte[]) {
			v.setBytesVal((byte[])o);
        } else {
			v.setNone(none);
		}
        return v;
    }

    Map<String,Variant> toVariantMap(Map map) {
        Map<String,Variant> varMap = new HashMap<String,Variant>();
        for(Object o:map.entrySet()){
            Map.Entry e = (Map.Entry)o;
            varMap.put(e.getKey().toString(),toVariant(e.getValue()));
        }
        return varMap;
    }

	private String compPid;

	public Number connect(Map conf, TopologyContext context) throws IOException, NoOutputException {
        Context ctx = new Context(context.getThisTaskId(),context.getTaskToComponent(),context.getThisComponentId());
		StormMsg outMsg = new StormMsg();
		outMsg.setHandshake(new Handshake(context.getPIDDir(),ctx,toVariantMap(conf)));

        LOG.info("Writing configuration to shell component");
        writeMessage(outMsg);

        LOG.info("Waiting for pid from component");
		com.prolucid.thriftshell.messages.ShellMsg inMsg = new com.prolucid.thriftshell.messages.ShellMsg();
        readMessage(inMsg);
        LOG.info("Shell component connection established.");
		this.compPid = "["+context.getThisComponentId() + "@" +inMsg.getPid().getPid()+"]: ";
        return inMsg.getPid().getPid();
	}

	public ShellMsg readShellMsg() throws IOException, NoOutputException {
		com.prolucid.thriftshell.messages.ShellMsg msg = new com.prolucid.thriftshell.messages.ShellMsg();
		readMessage(msg);

		ShellMsg shellMsg = new ShellMsg();
		if (msg.isSetEmit()) {
			EmitCommand cmd = msg.getEmit();
			shellMsg.setCommand("emit");
			shellMsg.setAnchors(cmd.getAnchors());
			shellMsg.setId(cmd.getId());
			shellMsg.setStream(cmd.getStream());
			shellMsg.setTask(cmd.getTask());
			shellMsg.setNeedTaskIds(cmd.isSetNeedTaskIds() && cmd.isNeedTaskIds());
            for (Variant v: cmd.getTuple()) {
                shellMsg.addTuple(ofVariant(v));
            }
        } else if (msg.isSetSync()) {
            shellMsg.setCommand("sync");
        } else if (msg.isSetFail()) {
            FailReply cmd = msg.getFail();
            shellMsg.setCommand("fail");
            shellMsg.setId(cmd.getId());
		} else if (msg.isSetOk()) {
			OkReply cmd = msg.getOk();
            shellMsg.setCommand("ack");
			shellMsg.setId(cmd.getId());
		} else if (msg.isSetLog()) {
			LogCommand cmd = msg.getLog();
            shellMsg.setCommand("log");
			shellMsg.setMsg(cmd.getMessage());
			shellMsg.setLogLevel(cmd.getLevel().getValue());
		}
// TODO: Metrics?
//		shellMsg.setMetricName(cmd.getName());
//		shellMsg.setMetricParams(cmd.getParamsList());

		return shellMsg;
	}

	public void writeBoltMsg(BoltMsg msg) throws IOException {
		StormMsg stormMsg = new StormMsg();
		if (msg.getStream() == "__heartbeat") {
			stormMsg.setHearbeat(new Heartbeat());
		} else {
			List<Variant> fields = new ArrayList<Variant>();
			for (Object o: msg.getTuple()) {
                fields.add(toVariant(o));
			}
			StreamIn cmd = new StreamIn(msg.getId(),msg.getComp(),msg.getStream(),(int)msg.getTask(),fields);
			stormMsg.setStreamIn(cmd);
		}
		writeMessage(stormMsg);
	}

	public void writeSpoutMsg(SpoutMsg msg) throws IOException {
		StormMsg stormMsg = new StormMsg();
		if (msg.getCommand() == "next") {
			stormMsg.setNextCmd(new NextCommand());
		} else if (msg.getCommand() == "ack") {
			stormMsg.setAckCmd(new AckCommand(msg.getId().toString()));
		} else if (msg.getCommand() == "fail") {
			stormMsg.setNackCmd(new NackCommand(msg.getId().toString()));
		} else {
			throw new IOException(this.compPid+"Unexpected spout message: "+msg.getCommand()	);
		}
        writeMessage(stormMsg);
	}

	public void writeTaskIds(List<Integer> taskIds) throws IOException {
		StormMsg msg = new StormMsg();
		msg.setTaskIds(new TaskIdsReply(taskIds));
        writeMessage(msg);
	}

	private void writeMessage(StormMsg msg) throws IOException {
        try {
			if(LOG.isDebugEnabled()) LOG.debug(this.compPid+"Sending: "+msg);
			msg.write(protocol);
            protocol.getTransport().flush();
		} catch (TException x) {
			throw new IOException(this.compPid+"Unable to write a message: "+x.getMessage(),x);
		}
    }

	private void readMessage(com.prolucid.thriftshell.messages.ShellMsg msg) throws IOException {
		try {
			msg.read(protocol);
		} catch (TException x) {
			throw new IOException(this.compPid+"Unable to read a message: "+x.getMessage(),x);
		}
    }
}
