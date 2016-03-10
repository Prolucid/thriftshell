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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-03-10")
public class EmitCommand implements org.apache.thrift.TBase<EmitCommand, EmitCommand._Fields>, java.io.Serializable, Cloneable, Comparable<EmitCommand> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EmitCommand");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STREAM_FIELD_DESC = new org.apache.thrift.protocol.TField("stream", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TUPLE_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField ANCHORS_FIELD_DESC = new org.apache.thrift.protocol.TField("anchors", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField TASK_FIELD_DESC = new org.apache.thrift.protocol.TField("task", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField NEED_TASK_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("needTaskIds", org.apache.thrift.protocol.TType.BOOL, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EmitCommandStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EmitCommandTupleSchemeFactory());
  }

  public String id; // required
  public String stream; // required
  public List<Variant> tuple; // required
  public List<String> anchors; // required
  public int task; // required
  public boolean needTaskIds; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    STREAM((short)2, "stream"),
    TUPLE((short)3, "tuple"),
    ANCHORS((short)4, "anchors"),
    TASK((short)5, "task"),
    NEED_TASK_IDS((short)6, "needTaskIds");

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
        case 2: // STREAM
          return STREAM;
        case 3: // TUPLE
          return TUPLE;
        case 4: // ANCHORS
          return ANCHORS;
        case 5: // TASK
          return TASK;
        case 6: // NEED_TASK_IDS
          return NEED_TASK_IDS;
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
  private static final int __NEEDTASKIDS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STREAM, new org.apache.thrift.meta_data.FieldMetaData("stream", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TUPLE, new org.apache.thrift.meta_data.FieldMetaData("tuple", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Variant.class))));
    tmpMap.put(_Fields.ANCHORS, new org.apache.thrift.meta_data.FieldMetaData("anchors", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.TASK, new org.apache.thrift.meta_data.FieldMetaData("task", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NEED_TASK_IDS, new org.apache.thrift.meta_data.FieldMetaData("needTaskIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EmitCommand.class, metaDataMap);
  }

  public EmitCommand() {
  }

  public EmitCommand(
    String id,
    String stream,
    List<Variant> tuple,
    List<String> anchors,
    int task,
    boolean needTaskIds)
  {
    this();
    this.id = id;
    this.stream = stream;
    this.tuple = tuple;
    this.anchors = anchors;
    this.task = task;
    setTaskIsSet(true);
    this.needTaskIds = needTaskIds;
    setNeedTaskIdsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EmitCommand(EmitCommand other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetStream()) {
      this.stream = other.stream;
    }
    if (other.isSetTuple()) {
      List<Variant> __this__tuple = new ArrayList<Variant>(other.tuple.size());
      for (Variant other_element : other.tuple) {
        __this__tuple.add(new Variant(other_element));
      }
      this.tuple = __this__tuple;
    }
    if (other.isSetAnchors()) {
      List<String> __this__anchors = new ArrayList<String>(other.anchors);
      this.anchors = __this__anchors;
    }
    this.task = other.task;
    this.needTaskIds = other.needTaskIds;
  }

  public EmitCommand deepCopy() {
    return new EmitCommand(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.stream = null;
    this.tuple = null;
    this.anchors = null;
    setTaskIsSet(false);
    this.task = 0;
    setNeedTaskIdsIsSet(false);
    this.needTaskIds = false;
  }

  public String getId() {
    return this.id;
  }

  public EmitCommand setId(String id) {
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

  public String getStream() {
    return this.stream;
  }

  public EmitCommand setStream(String stream) {
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

  public EmitCommand setTuple(List<Variant> tuple) {
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

  public int getAnchorsSize() {
    return (this.anchors == null) ? 0 : this.anchors.size();
  }

  public java.util.Iterator<String> getAnchorsIterator() {
    return (this.anchors == null) ? null : this.anchors.iterator();
  }

  public void addToAnchors(String elem) {
    if (this.anchors == null) {
      this.anchors = new ArrayList<String>();
    }
    this.anchors.add(elem);
  }

  public List<String> getAnchors() {
    return this.anchors;
  }

  public EmitCommand setAnchors(List<String> anchors) {
    this.anchors = anchors;
    return this;
  }

  public void unsetAnchors() {
    this.anchors = null;
  }

  /** Returns true if field anchors is set (has been assigned a value) and false otherwise */
  public boolean isSetAnchors() {
    return this.anchors != null;
  }

  public void setAnchorsIsSet(boolean value) {
    if (!value) {
      this.anchors = null;
    }
  }

  public int getTask() {
    return this.task;
  }

  public EmitCommand setTask(int task) {
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

  public boolean isNeedTaskIds() {
    return this.needTaskIds;
  }

  public EmitCommand setNeedTaskIds(boolean needTaskIds) {
    this.needTaskIds = needTaskIds;
    setNeedTaskIdsIsSet(true);
    return this;
  }

  public void unsetNeedTaskIds() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NEEDTASKIDS_ISSET_ID);
  }

  /** Returns true if field needTaskIds is set (has been assigned a value) and false otherwise */
  public boolean isSetNeedTaskIds() {
    return EncodingUtils.testBit(__isset_bitfield, __NEEDTASKIDS_ISSET_ID);
  }

  public void setNeedTaskIdsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NEEDTASKIDS_ISSET_ID, value);
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

    case STREAM:
      if (value == null) {
        unsetStream();
      } else {
        setStream((String)value);
      }
      break;

    case TUPLE:
      if (value == null) {
        unsetTuple();
      } else {
        setTuple((List<Variant>)value);
      }
      break;

    case ANCHORS:
      if (value == null) {
        unsetAnchors();
      } else {
        setAnchors((List<String>)value);
      }
      break;

    case TASK:
      if (value == null) {
        unsetTask();
      } else {
        setTask((Integer)value);
      }
      break;

    case NEED_TASK_IDS:
      if (value == null) {
        unsetNeedTaskIds();
      } else {
        setNeedTaskIds((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case STREAM:
      return getStream();

    case TUPLE:
      return getTuple();

    case ANCHORS:
      return getAnchors();

    case TASK:
      return getTask();

    case NEED_TASK_IDS:
      return isNeedTaskIds();

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
    case STREAM:
      return isSetStream();
    case TUPLE:
      return isSetTuple();
    case ANCHORS:
      return isSetAnchors();
    case TASK:
      return isSetTask();
    case NEED_TASK_IDS:
      return isSetNeedTaskIds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EmitCommand)
      return this.equals((EmitCommand)that);
    return false;
  }

  public boolean equals(EmitCommand that) {
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

    boolean this_present_stream = true && this.isSetStream();
    boolean that_present_stream = true && that.isSetStream();
    if (this_present_stream || that_present_stream) {
      if (!(this_present_stream && that_present_stream))
        return false;
      if (!this.stream.equals(that.stream))
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

    boolean this_present_anchors = true && this.isSetAnchors();
    boolean that_present_anchors = true && that.isSetAnchors();
    if (this_present_anchors || that_present_anchors) {
      if (!(this_present_anchors && that_present_anchors))
        return false;
      if (!this.anchors.equals(that.anchors))
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

    boolean this_present_needTaskIds = true;
    boolean that_present_needTaskIds = true;
    if (this_present_needTaskIds || that_present_needTaskIds) {
      if (!(this_present_needTaskIds && that_present_needTaskIds))
        return false;
      if (this.needTaskIds != that.needTaskIds)
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

    boolean present_stream = true && (isSetStream());
    list.add(present_stream);
    if (present_stream)
      list.add(stream);

    boolean present_tuple = true && (isSetTuple());
    list.add(present_tuple);
    if (present_tuple)
      list.add(tuple);

    boolean present_anchors = true && (isSetAnchors());
    list.add(present_anchors);
    if (present_anchors)
      list.add(anchors);

    boolean present_task = true;
    list.add(present_task);
    if (present_task)
      list.add(task);

    boolean present_needTaskIds = true;
    list.add(present_needTaskIds);
    if (present_needTaskIds)
      list.add(needTaskIds);

    return list.hashCode();
  }

  @Override
  public int compareTo(EmitCommand other) {
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
    lastComparison = Boolean.valueOf(isSetAnchors()).compareTo(other.isSetAnchors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnchors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.anchors, other.anchors);
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
    lastComparison = Boolean.valueOf(isSetNeedTaskIds()).compareTo(other.isSetNeedTaskIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNeedTaskIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.needTaskIds, other.needTaskIds);
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
    StringBuilder sb = new StringBuilder("EmitCommand(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
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
    sb.append("tuple:");
    if (this.tuple == null) {
      sb.append("null");
    } else {
      sb.append(this.tuple);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("anchors:");
    if (this.anchors == null) {
      sb.append("null");
    } else {
      sb.append(this.anchors);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("task:");
    sb.append(this.task);
    first = false;
    if (!first) sb.append(", ");
    sb.append("needTaskIds:");
    sb.append(this.needTaskIds);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (stream == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'stream' was not present! Struct: " + toString());
    }
    if (tuple == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tuple' was not present! Struct: " + toString());
    }
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

  private static class EmitCommandStandardSchemeFactory implements SchemeFactory {
    public EmitCommandStandardScheme getScheme() {
      return new EmitCommandStandardScheme();
    }
  }

  private static class EmitCommandStandardScheme extends StandardScheme<EmitCommand> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EmitCommand struct) throws org.apache.thrift.TException {
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
          case 2: // STREAM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stream = iprot.readString();
              struct.setStreamIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TUPLE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list36 = iprot.readListBegin();
                struct.tuple = new ArrayList<Variant>(_list36.size);
                Variant _elem37;
                for (int _i38 = 0; _i38 < _list36.size; ++_i38)
                {
                  _elem37 = new Variant();
                  _elem37.read(iprot);
                  struct.tuple.add(_elem37);
                }
                iprot.readListEnd();
              }
              struct.setTupleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ANCHORS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list39 = iprot.readListBegin();
                struct.anchors = new ArrayList<String>(_list39.size);
                String _elem40;
                for (int _i41 = 0; _i41 < _list39.size; ++_i41)
                {
                  _elem40 = iprot.readString();
                  struct.anchors.add(_elem40);
                }
                iprot.readListEnd();
              }
              struct.setAnchorsIsSet(true);
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
          case 6: // NEED_TASK_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.needTaskIds = iprot.readBool();
              struct.setNeedTaskIdsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EmitCommand struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.stream != null) {
        oprot.writeFieldBegin(STREAM_FIELD_DESC);
        oprot.writeString(struct.stream);
        oprot.writeFieldEnd();
      }
      if (struct.tuple != null) {
        oprot.writeFieldBegin(TUPLE_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tuple.size()));
          for (Variant _iter42 : struct.tuple)
          {
            _iter42.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.anchors != null) {
        oprot.writeFieldBegin(ANCHORS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.anchors.size()));
          for (String _iter43 : struct.anchors)
          {
            oprot.writeString(_iter43);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TASK_FIELD_DESC);
      oprot.writeI32(struct.task);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NEED_TASK_IDS_FIELD_DESC);
      oprot.writeBool(struct.needTaskIds);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EmitCommandTupleSchemeFactory implements SchemeFactory {
    public EmitCommandTupleScheme getScheme() {
      return new EmitCommandTupleScheme();
    }
  }

  private static class EmitCommandTupleScheme extends TupleScheme<EmitCommand> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EmitCommand struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.stream);
      {
        oprot.writeI32(struct.tuple.size());
        for (Variant _iter44 : struct.tuple)
        {
          _iter44.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetAnchors()) {
        optionals.set(1);
      }
      if (struct.isSetTask()) {
        optionals.set(2);
      }
      if (struct.isSetNeedTaskIds()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetAnchors()) {
        {
          oprot.writeI32(struct.anchors.size());
          for (String _iter45 : struct.anchors)
          {
            oprot.writeString(_iter45);
          }
        }
      }
      if (struct.isSetTask()) {
        oprot.writeI32(struct.task);
      }
      if (struct.isSetNeedTaskIds()) {
        oprot.writeBool(struct.needTaskIds);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EmitCommand struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.stream = iprot.readString();
      struct.setStreamIsSet(true);
      {
        org.apache.thrift.protocol.TList _list46 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.tuple = new ArrayList<Variant>(_list46.size);
        Variant _elem47;
        for (int _i48 = 0; _i48 < _list46.size; ++_i48)
        {
          _elem47 = new Variant();
          _elem47.read(iprot);
          struct.tuple.add(_elem47);
        }
      }
      struct.setTupleIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list49 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.anchors = new ArrayList<String>(_list49.size);
          String _elem50;
          for (int _i51 = 0; _i51 < _list49.size; ++_i51)
          {
            _elem50 = iprot.readString();
            struct.anchors.add(_elem50);
          }
        }
        struct.setAnchorsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.task = iprot.readI32();
        struct.setTaskIsSet(true);
      }
      if (incoming.get(3)) {
        struct.needTaskIds = iprot.readBool();
        struct.setNeedTaskIdsIsSet(true);
      }
    }
  }

}

