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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TIOStreamTransport;

public class ThriftSerializer implements ISerializer {
    public static Logger LOG = Logger.getLogger(ThriftSerializer.class);
	private TProtocol processIn;
	private TProtocol processOut;
	private static NoneStruct none = new NoneStruct();

	public void initialize(OutputStream processIn, InputStream processOut) {
		this.processIn = new TCompactProtocol(new TIOStreamTransport(processIn));
        this.processOut = new TCompactProtocol(new TIOStreamTransport(processOut));
	}
    
    Object ofVariant(Variant v) {
        return (v.getSetField() == Variant._Fields.ISO8601_VAL)
                ? (v.isSetIso8601Val() ? new DateTime(v.getIso8601Val()) : null)
                : v.getFieldValue();
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

	public Number connect(Map conf, TopologyContext context) throws IOException, NoOutputException {
        Context ctx = new Context(context.getThisTaskId(),context.getTaskToComponent(),context.getThisComponentId());
		Handshake handshake = new Handshake(context.getPIDDir(),ctx,toVariantMap(conf));

        LOG.info("Writing configuration to shell component");
        writeMessage(handshake);

        LOG.info("Waiting for pid from component");
		com.prolucid.thriftshell.messages.ShellMsg msg = new com.prolucid.thriftshell.messages.ShellMsg();
        readMessage(msg);
        LOG.info("Shell component connection established.");
        return msg.getPid().getPid();
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
		}
        writeMessage(stormMsg);
	}

	public void writeTaskIds(List<Integer> taskIds) throws IOException {
		StormMsg msg = new StormMsg();
		msg.setTaskIds(new TaskIdsReply(taskIds));
        writeMessage(msg);
	}

	private void writeMessage(TBase msg) throws IOException {
        try {
			msg.write(processIn);
            processIn.getTransport().flush();
		} catch (TException x) {
			throw new IOException("Unable to serialize",x);
		}
    }

	private void readMessage(TBase msg) throws IOException {
		try {
			msg.read(processOut);
		} catch (TException x) {
			throw new IOException("Unable to deserialize",x);
		}
    }
}
