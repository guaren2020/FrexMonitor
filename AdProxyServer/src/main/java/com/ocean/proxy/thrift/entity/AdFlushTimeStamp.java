/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ocean.proxy.thrift.entity;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-1-13")
public class AdFlushTimeStamp implements org.apache.thrift.TBase<AdFlushTimeStamp, AdFlushTimeStamp._Fields>, java.io.Serializable, Cloneable, Comparable<AdFlushTimeStamp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AdFlushTimeStamp");

  private static final org.apache.thrift.protocol.TField TIME_STAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("time_stamp", org.apache.thrift.protocol.TType.I64, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AdFlushTimeStampStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AdFlushTimeStampTupleSchemeFactory());
  }

  public long time_stamp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TIME_STAMP((short)1, "time_stamp");

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
        case 1: // TIME_STAMP
          return TIME_STAMP;
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
  private static final int __TIME_STAMP_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIME_STAMP, new org.apache.thrift.meta_data.FieldMetaData("time_stamp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AdFlushTimeStamp.class, metaDataMap);
  }

  public AdFlushTimeStamp() {
  }

  public AdFlushTimeStamp(
    long time_stamp)
  {
    this();
    this.time_stamp = time_stamp;
    setTime_stampIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AdFlushTimeStamp(AdFlushTimeStamp other) {
    __isset_bitfield = other.__isset_bitfield;
    this.time_stamp = other.time_stamp;
  }

  public AdFlushTimeStamp deepCopy() {
    return new AdFlushTimeStamp(this);
  }

  public void clear() {
    setTime_stampIsSet(false);
    this.time_stamp = 0;
  }

  public long getTime_stamp() {
    return this.time_stamp;
  }

  public AdFlushTimeStamp setTime_stamp(long time_stamp) {
    this.time_stamp = time_stamp;
    setTime_stampIsSet(true);
    return this;
  }

  public void unsetTime_stamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIME_STAMP_ISSET_ID);
  }

  /** Returns true if field time_stamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTime_stamp() {
    return EncodingUtils.testBit(__isset_bitfield, __TIME_STAMP_ISSET_ID);
  }

  public void setTime_stampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIME_STAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIME_STAMP:
      if (value == null) {
        unsetTime_stamp();
      } else {
        setTime_stamp((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIME_STAMP:
      return Long.valueOf(getTime_stamp());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIME_STAMP:
      return isSetTime_stamp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AdFlushTimeStamp)
      return this.equals((AdFlushTimeStamp)that);
    return false;
  }

  public boolean equals(AdFlushTimeStamp that) {
    if (that == null)
      return false;

    boolean this_present_time_stamp = true;
    boolean that_present_time_stamp = true;
    if (this_present_time_stamp || that_present_time_stamp) {
      if (!(this_present_time_stamp && that_present_time_stamp))
        return false;
      if (this.time_stamp != that.time_stamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_time_stamp = true;
    list.add(present_time_stamp);
    if (present_time_stamp)
      list.add(time_stamp);

    return list.hashCode();
  }

  public int compareTo(AdFlushTimeStamp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTime_stamp()).compareTo(other.isSetTime_stamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTime_stamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time_stamp, other.time_stamp);
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
    StringBuilder sb = new StringBuilder("AdFlushTimeStamp(");
    boolean first = true;

    sb.append("time_stamp:");
    sb.append(this.time_stamp);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'time_stamp' because it's a primitive and you chose the non-beans generator.
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

  private static class AdFlushTimeStampStandardSchemeFactory implements SchemeFactory {
    public AdFlushTimeStampStandardScheme getScheme() {
      return new AdFlushTimeStampStandardScheme();
    }
  }

  private static class AdFlushTimeStampStandardScheme extends StandardScheme<AdFlushTimeStamp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AdFlushTimeStamp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TIME_STAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.time_stamp = iprot.readI64();
              struct.setTime_stampIsSet(true);
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
      if (!struct.isSetTime_stamp()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'time_stamp' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AdFlushTimeStamp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TIME_STAMP_FIELD_DESC);
      oprot.writeI64(struct.time_stamp);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AdFlushTimeStampTupleSchemeFactory implements SchemeFactory {
    public AdFlushTimeStampTupleScheme getScheme() {
      return new AdFlushTimeStampTupleScheme();
    }
  }

  private static class AdFlushTimeStampTupleScheme extends TupleScheme<AdFlushTimeStamp> {

    public void write(org.apache.thrift.protocol.TProtocol prot, AdFlushTimeStamp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.time_stamp);
    }

    public void read(org.apache.thrift.protocol.TProtocol prot, AdFlushTimeStamp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.time_stamp = iprot.readI64();
      struct.setTime_stampIsSet(true);
    }
  }

}

