#!/usr/local/bin/thrift --gen java:beans,nocamel,hashcode
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

namespace java com.prolucid.thriftshell.messages
namespace csharp Prolucid.ThriftShell.Messages

struct NoneStruct {
}

union Variant {
	1: string  strVal;
	2: i32     int32Val;
	3: i64     int64Val;
	4: i16     int16Val;
	5: double  doubleVal;
	6: byte    byteVal;
	7: bool	   boolVal;
	8: string  iso8601Val;
	9: binary  bytesVal;
	10:NoneStruct none;
}

struct Context {
	1: required i32 taskId;
	2: required map<i32,string> taskComponents;
	3: required string componentId;
}

struct Handshake {
	1: required string pidDir;
	2: required Context context;
	3: required map<string,Variant> config;
}

struct StreamIn {
	1: string id;
	2: string comp;
	4: string stream;
	5: i32 task;
	6: list<Variant> tuple;
}

struct TaskIdsReply {
	1: required list<i32> taskIds;
}

struct Heartbeat {
}

struct NextCommand {
}

struct AckCommand {
	1: required string id;
}

struct NackCommand {
	1: required string id;
}

union StormMsg {
	1: Handshake handshake;
	2: NextCommand nextCmd;
	3: AckCommand ackCmd;
	4: NackCommand nackCmd;
	5: StreamIn streamIn;
	6: TaskIdsReply taskIds;
	7: Heartbeat hearbeat;
}

struct OkReply {
	1: required string id;
}

struct FailReply {
	1: required string id;
}

struct EmitCommand {
	1: string id;
	2: required string stream;
	3: required list<Variant> tuple;
	4: list<string> anchors;
	5: i32 task;
	6: bool needTaskIds;
}

enum LogLevel {
    Trace = 0;
    Debug = 1;
    Info = 2;
    Warn = 3;
    Error = 4;
}

struct LogCommand {
	1: string message;
	2: LogLevel level;
}

struct PidReply {
	1: i32 pid;
}

struct SyncReply {
}

union ShellMsg {
    1: OkReply ok;
    2: FailReply fail;
    3: EmitCommand emit;
    4: PidReply pid;
    5: LogCommand log;
    6: SyncReply sync;
}
