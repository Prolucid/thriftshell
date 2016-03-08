/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.prolucid.thriftshell.messages;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-03-09")
public class StreamIn implements org.apache.thrift.TBase<StreamIn, StreamIn._Fields>, java.io.Serializable, Cloneable, Comparable<StreamIn> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StreamIn");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COMP_FIELD_DESC = new org.apache.thrift.protocol.TField("comp", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField STREAM_FIELD_DESC = new org.apache.thrift.protocol.TField("stream", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField TASK_FIELD_DESC = new org.apache.thrift.protocol.TField("task", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField TUPLE_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StreamInStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StreamInTupleSchemeFactory());
  }

  public String id; // required
  public String comp; // required
  public String stream; // required
  public int task; // required
  public List<Variant> tuple; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    COMP((short)2, "comp"),
    STREAM((short)4, "stream"),
    TASK((short)5, "task"),
    TUPLE((short)6, "tuple");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // COMP
          return COMP;
        case 4: // STREAM
          return STREAM;
        case 5: // TASK
          return TASK;
        case 6: // TUPLE
          return TUPLE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TASK_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMP, new org.apache.thrift.meta_data.FieldMetaData("comp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STREAM, new org.apache.thrift.meta_data.FieldMetaData("stream", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TASK, new org.apache.thrift.meta_data.FieldMetaData("task", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TUPLE, new org.apache.thrift.meta_data.FieldMetaData("tuple", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Variant.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StreamIn.class, metaDataMap);
  }

  public StreamIn() {
  }

  public StreamIn(
    String id,
    String comp,
    String stream,
    int task,
    List<Variant> tuple)
  {
    this();
    this.id = id;
    this.comp = comp;
    this.stream = stream;
    this.task = task;
    setTaskIsSet(true);
    this.tuple = tuple;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StreamIn(StreamIn other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetComp()) {
      this.comp = other.comp;
    }
    if (other.isSetStream()) {
      this.stream = other.stream;
    }
    this.task = other.task;
    if (other.isSetTuple()) {
      List<Variant> __this__tuple = new ArrayList<Variant>(other.tuple.size());
      for (Variant other_element : other.tuple) {
        __this__tuple.add(new Variant(other_element));
      }
      this.tuple = __this__tuple;
    }
  }

  public StreamIn deepCopy() {
    return new StreamIn(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.comp = null;
    this.stream = null;
    setTaskIsSet(false);
    this.task = 0;
    this.tuple = null;
  }

  public String getId() {
    return this.id;
  }

  public StreamIn setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public String getComp() {
    return this.comp;
  }

  public StreamIn setComp(String comp) {
    this.comp = comp;
    return this;
  }

  public void unsetComp() {
    this.comp = null;
  }

  /** Returns true if field comp is set (has been assigned a value) and false otherwise */
  public boolean isSetComp() {
    return this.comp != null;
  }

  public void setCompIsSet(boolean value) {
    if (!value) {
      this.comp = null;
    }
  }

  public String getStream() {
    return this.stream;
  }

  public StreamIn setStream(String stream) {
    this.stream = stream;
    return this;
  }

  public void unsetStream() {
    this.stream = null;
  }

  /** Returns true if field stream is set (has been assigned a value) and false otherwise */
  public boolean isSetStream() {
    return this.stream != null;
  }

  public void setStreamIsSet(boolean value) {
    if (!value) {
      this.stream = null;
    }
  }

  public int getTask() {
    return this.task;
  }

  public StreamIn setTask(int task) {
    this.task = task;
    setTaskIsSet(true);
    return this;
  }

  public void unsetTask() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TASK_ISSET_ID);
  }

  /** Returns true if field task is set (has been assigned a value) and false otherwise */
  public boolean isSetTask() {
    return EncodingUtils.testBit(__isset_bitfield, __TASK_ISSET_ID);
  }

  public void setTaskIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TASK_ISSET_ID, value);
  }

  public int getTupleSize() {
    return (this.tuple == null) ? 0 : this.tuple.size();
  }

  public java.util.Iterator<Variant> getTupleIterator() {
    return (this.tuple == null) ? null : this.tuple.iterator();
  }

  public void addToTuple(Variant elem) {
    if (this.tuple == null) {
      this.tuple = new ArrayList<Variant>();
    }
    this.tuple.add(elem);
  }

  public List<Variant> getTuple() {
    return this.tuple;
  }

  public StreamIn setTuple(List<Variant> tuple) {
    this.tuple = tuple;
    return this;
  }

  public void unsetTuple() {
    this.tuple = null;
  }

  /** Returns true if field tuple is set (has been assigned a value) and false otherwise */
  public boolean isSetTuple() {
    return this.tuple != null;
  }

  public void setTupleIsSet(boolean value) {
    if (!value) {
      this.tuple = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    case COMP:
      if (value == null) {
        unsetComp();
      } else {
        setComp((String)value);
      }
      break;

    case STREAM:
      if (value == null) {
        unsetStream();
      } else {
        setStream((String)value);
      }
      break;

    case TASK:
      if (value == null) {
        unsetTask();
      } else {
        setTask((Integer)value);
      }
      break;

    case TUPLE:
      if (value == null) {
        unsetTuple();
      } else {
        setTuple((List<Variant>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case COMP:
      return getComp();

    case STREAM:
      return getStream();

    case TASK:
      return getTask();

    case TUPLE:
      return getTuple();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case COMP:
      return isSetComp();
    case STREAM:
      return isSetStream();
    case TASK:
      return isSetTask();
    case TUPLE:
      return isSetTuple();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StreamIn)
      return this.equals((StreamIn)that);
    return false;
  }

  public boolean equals(StreamIn that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_comp = true && this.isSetComp();
    boolean that_present_comp = true && that.isSetComp();
    if (this_present_comp || that_present_comp) {
      if (!(this_present_comp && that_present_comp))
        return false;
      if (!this.comp.equals(that.comp))
        return false;
    }

    boolean this_present_stream = true && this.isSetStream();
    boolean that_present_stream = true && that.isSetStream();
    if (this_present_stream || that_present_stream) {
      if (!(this_present_stream && that_present_stream))
        return false;
      if (!this.stream.equals(that.stream))
        return false;
    }

    boolean this_present_task = true;
    boolean that_present_task = true;
    if (this_present_task || that_present_task) {
      if (!(this_present_task && that_present_task))
        return false;
      if (this.task != that.task)
        return false;
    }

    boolean this_present_tuple = true && this.isSetTuple();
    boolean that_present_tuple = true && that.isSetTuple();
    if (this_present_tuple || that_present_tuple) {
      if (!(this_present_tuple && that_present_tuple))
        return false;
      if (!this.tuple.equals(that.tuple))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_comp = true && (isSetComp());
    list.add(present_comp);
    if (present_comp)
      list.add(comp);

    boolean present_stream = true && (isSetStream());
    list.add(present_stream);
    if (present_stream)
      list.add(stream);

    boolean present_task = true;
    list.add(present_task);
    if (present_task)
      list.add(task);

    boolean present_tuple = true && (isSetTuple());
    list.add(present_tuple);
    if (present_tuple)
      list.add(tuple);

    return list.hashCode();
  }

  @Override
  public int compareTo(StreamIn other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComp()).compareTo(other.isSetComp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comp, other.comp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStream()).compareTo(other.isSetStream());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStream()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stream, other.stream);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTask()).compareTo(other.isSetTask());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTask()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.task, other.task);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTuple()).compareTo(other.isSetTuple());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTuple()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuple, other.tuple);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("StreamIn(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("comp:");
    if (this.comp == null) {
      sb.append("null");
    } else {
      sb.append(this.comp);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stream:");
    if (this.stream == null) {
      sb.append("null");
    } else {
      sb.append(this.stream);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("task:");
    sb.append(this.task);
    first = false;
    if (!first) sb.append(", ");
    sb.append("tuple:");
    if (this.tuple == null) {
      sb.append("null");
    } else {
      sb.append(this.tuple);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StreamInStandardSchemeFactory implements SchemeFactory {
    public StreamInStandardScheme getScheme() {
      return new StreamInStandardScheme();
    }
  }

  private static class StreamInStandardScheme extends StandardScheme<StreamIn> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StreamIn struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.comp = iprot.readString();
              struct.setCompIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STREAM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stream = iprot.readString();
              struct.setStreamIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TASK
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.task = iprot.readI32();
              struct.setTaskIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TUPLE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list20 = iprot.readListBegin();
                struct.tuple = new ArrayList<Variant>(_list20.size);
                Variant _elem21;
                for (int _i22 = 0; _i22 < _list20.size; ++_i22)
                {
                  _elem21 = new Variant();
                  _elem21.read(iprot);
                  struct.tuple.add(_elem21);
                }
                iprot.readListEnd();
              }
              struct.setTupleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, StreamIn struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.comp != null) {
        oprot.writeFieldBegin(COMP_FIELD_DESC);
        oprot.writeString(struct.comp);
        oprot.writeFieldEnd();
      }
      if (struct.stream != null) {
        oprot.writeFieldBegin(STREAM_FIELD_DESC);
        oprot.writeString(struct.stream);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TASK_FIELD_DESC);
      oprot.writeI32(struct.task);
      oprot.writeFieldEnd();
      if (struct.tuple != null) {
        oprot.writeFieldBegin(TUPLE_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tuple.size()));
          for (Variant _iter23 : struct.tuple)
          {
            _iter23.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StreamInTupleSchemeFactory implements SchemeFactory {
    public StreamInTupleScheme getScheme() {
      return new StreamInTupleScheme();
    }
  }

  private static class StreamInTupleScheme extends TupleScheme<StreamIn> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StreamIn struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetComp()) {
        optionals.set(1);
      }
      if (struct.isSetStream()) {
        optionals.set(2);
      }
      if (struct.isSetTask()) {
        optionals.set(3);
      }
      if (struct.isSetTuple()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetComp()) {
        oprot.writeString(struct.comp);
      }
      if (struct.isSetStream()) {
        oprot.writeString(struct.stream);
      }
      if (struct.isSetTask()) {
        oprot.writeI32(struct.task);
      }
      if (struct.isSetTuple()) {
        {
          oprot.writeI32(struct.tuple.size());
          for (Variant _iter24 : struct.tuple)
          {
            _iter24.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StreamIn struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.comp = iprot.readString();
        struct.setCompIsSet(true);
      }
      if (incoming.get(2)) {
        struct.stream = iprot.readString();
        struct.setStreamIsSet(true);
      }
      if (incoming.get(3)) {
        struct.task = iprot.readI32();
        struct.setTaskIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list25 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.tuple = new ArrayList<Variant>(_list25.size);
          Variant _elem26;
          for (int _i27 = 0; _i27 < _list25.size; ++_i27)
          {
            _elem26 = new Variant();
            _elem26.read(iprot);
            struct.tuple.add(_elem26);
          }
        }
        struct.setTupleIsSet(true);
      }
    }
  }

}

