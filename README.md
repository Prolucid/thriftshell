#ThriftShell
Loosely based on [Protoshell](https://github.com/jsgilmore/protoshell)

ThriftShell implements Storm's multilang using Thrift serializer to improve throughput and decrease CPU when compared to default JSON serializer.
It uses compact binary communications protocol and transfers tuples as union fields, mapping Thrift supported types to Java types and vice versa.
When a type doesn't have Thrift representation it is mapped to byte[].

Current version of ThriftShell is built against v0.10.0 of Storm.

#Performance
ThriftShell currently provides TBD throughput, when compared to the standard Storm JSON multilang protocol.

#The protocol
ThriftStorm formalizes multilang protocol via unions:
 - StormMsg for messages that could be sent from Storm
 - ShellMsg for messages that could be sent from a shell spout or a bolt

The exchange follows the documented [JSON script](http://storm.apache.org/documentation/Multilang-protocol.html).