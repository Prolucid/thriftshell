#ThriftShell
Loosely based on [Protoshell](https://github.com/jsgilmore/protoshell)

ThriftShell implements a protocol buffer serializer for Storm's multi-language
support that greatly improves Storm's multilang throughput over the build-in
JSON serializer.

ThriftShell is a binary communications protocol, as opposed to the text-based
communications protocol used in Storm's JSON serializer.
It transfers tuples as union fields, as supported by thrift.

ThriftShell is built against v0.10.0 of Storm.

#Performance
ThriftShell currently provides three to fives times higher throughput, when compared to the standard Storm JSON multilang protocol.

#The protocol
ThriftStorm formalizes multilang protocol via unions:
 - StormMsg for messages that could be sent from Storm
 - ShellMsg for messages that could be sent from a shell spout or a bolt

The exchange follows the documented [JSON script](http://storm.apache.org/documentation/Multilang-protocol.html).