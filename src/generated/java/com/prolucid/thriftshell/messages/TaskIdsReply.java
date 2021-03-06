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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-03-14")
public class TaskIdsReply implements org.apache.thrift.TBase<TaskIdsReply, TaskIdsReply._Fields>, java.io.Serializable, Cloneable, Comparable<TaskIdsReply> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TaskIdsReply");

  private static final org.apache.thrift.protocol.TField TASK_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("taskIds", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TaskIdsReplyStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TaskIdsReplyTupleSchemeFactory());
  }

  public List<Integer> taskIds; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TASK_IDS((short)1, "taskIds");

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
        case 1: // TASK_IDS
          return TASK_IDS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_IDS, new org.apache.thrift.meta_data.FieldMetaData("taskIds", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TaskIdsReply.class, metaDataMap);
  }

  public TaskIdsReply() {
  }

  public TaskIdsReply(
    List<Integer> taskIds)
  {
    this();
    this.taskIds = taskIds;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskIdsReply(TaskIdsReply other) {
    if (other.isSetTaskIds()) {
      List<Integer> __this__taskIds = new ArrayList<Integer>(other.taskIds);
      this.taskIds = __this__taskIds;
    }
  }

  public TaskIdsReply deepCopy() {
    return new TaskIdsReply(this);
  }

  @Override
  public void clear() {
    this.taskIds = null;
  }

  public int getTaskIdsSize() {
    return (this.taskIds == null) ? 0 : this.taskIds.size();
  }

  public java.util.Iterator<Integer> getTaskIdsIterator() {
    return (this.taskIds == null) ? null : this.taskIds.iterator();
  }

  public void addToTaskIds(int elem) {
    if (this.taskIds == null) {
      this.taskIds = new ArrayList<Integer>();
    }
    this.taskIds.add(elem);
  }

  public List<Integer> getTaskIds() {
    return this.taskIds;
  }

  public TaskIdsReply setTaskIds(List<Integer> taskIds) {
    this.taskIds = taskIds;
    return this;
  }

  public void unsetTaskIds() {
    this.taskIds = null;
  }

  /** Returns true if field taskIds is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskIds() {
    return this.taskIds != null;
  }

  public void setTaskIdsIsSet(boolean value) {
    if (!value) {
      this.taskIds = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK_IDS:
      if (value == null) {
        unsetTaskIds();
      } else {
        setTaskIds((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_IDS:
      return getTaskIds();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK_IDS:
      return isSetTaskIds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TaskIdsReply)
      return this.equals((TaskIdsReply)that);
    return false;
  }

  public boolean equals(TaskIdsReply that) {
    if (that == null)
      return false;

    boolean this_present_taskIds = true && this.isSetTaskIds();
    boolean that_present_taskIds = true && that.isSetTaskIds();
    if (this_present_taskIds || that_present_taskIds) {
      if (!(this_present_taskIds && that_present_taskIds))
        return false;
      if (!this.taskIds.equals(that.taskIds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_taskIds = true && (isSetTaskIds());
    list.add(present_taskIds);
    if (present_taskIds)
      list.add(taskIds);

    return list.hashCode();
  }

  @Override
  public int compareTo(TaskIdsReply other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTaskIds()).compareTo(other.isSetTaskIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskIds, other.taskIds);
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
    StringBuilder sb = new StringBuilder("TaskIdsReply(");
    boolean first = true;

    sb.append("taskIds:");
    if (this.taskIds == null) {
      sb.append("null");
    } else {
      sb.append(this.taskIds);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (taskIds == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskIds' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TaskIdsReplyStandardSchemeFactory implements SchemeFactory {
    public TaskIdsReplyStandardScheme getScheme() {
      return new TaskIdsReplyStandardScheme();
    }
  }

  private static class TaskIdsReplyStandardScheme extends StandardScheme<TaskIdsReply> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TaskIdsReply struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASK_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list28 = iprot.readListBegin();
                struct.taskIds = new ArrayList<Integer>(_list28.size);
                int _elem29;
                for (int _i30 = 0; _i30 < _list28.size; ++_i30)
                {
                  _elem29 = iprot.readI32();
                  struct.taskIds.add(_elem29);
                }
                iprot.readListEnd();
              }
              struct.setTaskIdsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TaskIdsReply struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.taskIds != null) {
        oprot.writeFieldBegin(TASK_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.taskIds.size()));
          for (int _iter31 : struct.taskIds)
          {
            oprot.writeI32(_iter31);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TaskIdsReplyTupleSchemeFactory implements SchemeFactory {
    public TaskIdsReplyTupleScheme getScheme() {
      return new TaskIdsReplyTupleScheme();
    }
  }

  private static class TaskIdsReplyTupleScheme extends TupleScheme<TaskIdsReply> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TaskIdsReply struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.taskIds.size());
        for (int _iter32 : struct.taskIds)
        {
          oprot.writeI32(_iter32);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TaskIdsReply struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list33 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.taskIds = new ArrayList<Integer>(_list33.size);
        int _elem34;
        for (int _i35 = 0; _i35 < _list33.size; ++_i35)
        {
          _elem34 = iprot.readI32();
          struct.taskIds.add(_elem34);
        }
      }
      struct.setTaskIdsIsSet(true);
    }
  }

}

