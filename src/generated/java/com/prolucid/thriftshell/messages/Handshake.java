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
public class Handshake implements org.apache.thrift.TBase<Handshake, Handshake._Fields>, java.io.Serializable, Cloneable, Comparable<Handshake> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Handshake");

  private static final org.apache.thrift.protocol.TField PID_DIR_FIELD_DESC = new org.apache.thrift.protocol.TField("pidDir", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CONTEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("context", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField CONFIG_FIELD_DESC = new org.apache.thrift.protocol.TField("config", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HandshakeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HandshakeTupleSchemeFactory());
  }

  public String pidDir; // required
  public Context context; // required
  public Map<String,Variant> config; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PID_DIR((short)1, "pidDir"),
    CONTEXT((short)2, "context"),
    CONFIG((short)3, "config");

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
        case 1: // PID_DIR
          return PID_DIR;
        case 2: // CONTEXT
          return CONTEXT;
        case 3: // CONFIG
          return CONFIG;
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
    tmpMap.put(_Fields.PID_DIR, new org.apache.thrift.meta_data.FieldMetaData("pidDir", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTEXT, new org.apache.thrift.meta_data.FieldMetaData("context", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Context.class)));
    tmpMap.put(_Fields.CONFIG, new org.apache.thrift.meta_data.FieldMetaData("config", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Variant.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Handshake.class, metaDataMap);
  }

  public Handshake() {
  }

  public Handshake(
    String pidDir,
    Context context,
    Map<String,Variant> config)
  {
    this();
    this.pidDir = pidDir;
    this.context = context;
    this.config = config;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Handshake(Handshake other) {
    if (other.isSetPidDir()) {
      this.pidDir = other.pidDir;
    }
    if (other.isSetContext()) {
      this.context = new Context(other.context);
    }
    if (other.isSetConfig()) {
      Map<String,Variant> __this__config = new HashMap<String,Variant>(other.config.size());
      for (Map.Entry<String, Variant> other_element : other.config.entrySet()) {

        String other_element_key = other_element.getKey();
        Variant other_element_value = other_element.getValue();

        String __this__config_copy_key = other_element_key;

        Variant __this__config_copy_value = new Variant(other_element_value);

        __this__config.put(__this__config_copy_key, __this__config_copy_value);
      }
      this.config = __this__config;
    }
  }

  public Handshake deepCopy() {
    return new Handshake(this);
  }

  @Override
  public void clear() {
    this.pidDir = null;
    this.context = null;
    this.config = null;
  }

  public String getPidDir() {
    return this.pidDir;
  }

  public Handshake setPidDir(String pidDir) {
    this.pidDir = pidDir;
    return this;
  }

  public void unsetPidDir() {
    this.pidDir = null;
  }

  /** Returns true if field pidDir is set (has been assigned a value) and false otherwise */
  public boolean isSetPidDir() {
    return this.pidDir != null;
  }

  public void setPidDirIsSet(boolean value) {
    if (!value) {
      this.pidDir = null;
    }
  }

  public Context getContext() {
    return this.context;
  }

  public Handshake setContext(Context context) {
    this.context = context;
    return this;
  }

  public void unsetContext() {
    this.context = null;
  }

  /** Returns true if field context is set (has been assigned a value) and false otherwise */
  public boolean isSetContext() {
    return this.context != null;
  }

  public void setContextIsSet(boolean value) {
    if (!value) {
      this.context = null;
    }
  }

  public int getConfigSize() {
    return (this.config == null) ? 0 : this.config.size();
  }

  public void putToConfig(String key, Variant val) {
    if (this.config == null) {
      this.config = new HashMap<String,Variant>();
    }
    this.config.put(key, val);
  }

  public Map<String,Variant> getConfig() {
    return this.config;
  }

  public Handshake setConfig(Map<String,Variant> config) {
    this.config = config;
    return this;
  }

  public void unsetConfig() {
    this.config = null;
  }

  /** Returns true if field config is set (has been assigned a value) and false otherwise */
  public boolean isSetConfig() {
    return this.config != null;
  }

  public void setConfigIsSet(boolean value) {
    if (!value) {
      this.config = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PID_DIR:
      if (value == null) {
        unsetPidDir();
      } else {
        setPidDir((String)value);
      }
      break;

    case CONTEXT:
      if (value == null) {
        unsetContext();
      } else {
        setContext((Context)value);
      }
      break;

    case CONFIG:
      if (value == null) {
        unsetConfig();
      } else {
        setConfig((Map<String,Variant>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PID_DIR:
      return getPidDir();

    case CONTEXT:
      return getContext();

    case CONFIG:
      return getConfig();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PID_DIR:
      return isSetPidDir();
    case CONTEXT:
      return isSetContext();
    case CONFIG:
      return isSetConfig();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Handshake)
      return this.equals((Handshake)that);
    return false;
  }

  public boolean equals(Handshake that) {
    if (that == null)
      return false;

    boolean this_present_pidDir = true && this.isSetPidDir();
    boolean that_present_pidDir = true && that.isSetPidDir();
    if (this_present_pidDir || that_present_pidDir) {
      if (!(this_present_pidDir && that_present_pidDir))
        return false;
      if (!this.pidDir.equals(that.pidDir))
        return false;
    }

    boolean this_present_context = true && this.isSetContext();
    boolean that_present_context = true && that.isSetContext();
    if (this_present_context || that_present_context) {
      if (!(this_present_context && that_present_context))
        return false;
      if (!this.context.equals(that.context))
        return false;
    }

    boolean this_present_config = true && this.isSetConfig();
    boolean that_present_config = true && that.isSetConfig();
    if (this_present_config || that_present_config) {
      if (!(this_present_config && that_present_config))
        return false;
      if (!this.config.equals(that.config))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_pidDir = true && (isSetPidDir());
    list.add(present_pidDir);
    if (present_pidDir)
      list.add(pidDir);

    boolean present_context = true && (isSetContext());
    list.add(present_context);
    if (present_context)
      list.add(context);

    boolean present_config = true && (isSetConfig());
    list.add(present_config);
    if (present_config)
      list.add(config);

    return list.hashCode();
  }

  @Override
  public int compareTo(Handshake other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPidDir()).compareTo(other.isSetPidDir());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPidDir()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pidDir, other.pidDir);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContext()).compareTo(other.isSetContext());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContext()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.context, other.context);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConfig()).compareTo(other.isSetConfig());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfig()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.config, other.config);
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
    StringBuilder sb = new StringBuilder("Handshake(");
    boolean first = true;

    sb.append("pidDir:");
    if (this.pidDir == null) {
      sb.append("null");
    } else {
      sb.append(this.pidDir);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("context:");
    if (this.context == null) {
      sb.append("null");
    } else {
      sb.append(this.context);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("config:");
    if (this.config == null) {
      sb.append("null");
    } else {
      sb.append(this.config);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (pidDir == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'pidDir' was not present! Struct: " + toString());
    }
    if (context == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'context' was not present! Struct: " + toString());
    }
    if (config == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'config' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (context != null) {
      context.validate();
    }
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

  private static class HandshakeStandardSchemeFactory implements SchemeFactory {
    public HandshakeStandardScheme getScheme() {
      return new HandshakeStandardScheme();
    }
  }

  private static class HandshakeStandardScheme extends StandardScheme<Handshake> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Handshake struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PID_DIR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pidDir = iprot.readString();
              struct.setPidDirIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CONTEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.context = new Context();
              struct.context.read(iprot);
              struct.setContextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONFIG
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map10 = iprot.readMapBegin();
                struct.config = new HashMap<String,Variant>(2*_map10.size);
                String _key11;
                Variant _val12;
                for (int _i13 = 0; _i13 < _map10.size; ++_i13)
                {
                  _key11 = iprot.readString();
                  _val12 = new Variant();
                  _val12.read(iprot);
                  struct.config.put(_key11, _val12);
                }
                iprot.readMapEnd();
              }
              struct.setConfigIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Handshake struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.pidDir != null) {
        oprot.writeFieldBegin(PID_DIR_FIELD_DESC);
        oprot.writeString(struct.pidDir);
        oprot.writeFieldEnd();
      }
      if (struct.context != null) {
        oprot.writeFieldBegin(CONTEXT_FIELD_DESC);
        struct.context.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.config != null) {
        oprot.writeFieldBegin(CONFIG_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.config.size()));
          for (Map.Entry<String, Variant> _iter14 : struct.config.entrySet())
          {
            oprot.writeString(_iter14.getKey());
            _iter14.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HandshakeTupleSchemeFactory implements SchemeFactory {
    public HandshakeTupleScheme getScheme() {
      return new HandshakeTupleScheme();
    }
  }

  private static class HandshakeTupleScheme extends TupleScheme<Handshake> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Handshake struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.pidDir);
      struct.context.write(oprot);
      {
        oprot.writeI32(struct.config.size());
        for (Map.Entry<String, Variant> _iter15 : struct.config.entrySet())
        {
          oprot.writeString(_iter15.getKey());
          _iter15.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Handshake struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.pidDir = iprot.readString();
      struct.setPidDirIsSet(true);
      struct.context = new Context();
      struct.context.read(iprot);
      struct.setContextIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map16 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.config = new HashMap<String,Variant>(2*_map16.size);
        String _key17;
        Variant _val18;
        for (int _i19 = 0; _i19 < _map16.size; ++_i19)
        {
          _key17 = iprot.readString();
          _val18 = new Variant();
          _val18.read(iprot);
          struct.config.put(_key17, _val18);
        }
      }
      struct.setConfigIsSet(true);
    }
  }

}

