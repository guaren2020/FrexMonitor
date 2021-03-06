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
public class ProxyUserStatus implements org.apache.thrift.TBase<ProxyUserStatus, ProxyUserStatus._Fields>, java.io.Serializable, Cloneable, Comparable<ProxyUserStatus> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProxyUserStatus");

  private static final org.apache.thrift.protocol.TField FETCHING_FIELD_DESC = new org.apache.thrift.protocol.TField("fetching", org.apache.thrift.protocol.TType.BOOL, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProxyUserStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProxyUserStatusTupleSchemeFactory());
  }

  public boolean fetching; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FETCHING((short)1, "fetching");

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
        case 1: // FETCHING
          return FETCHING;
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
  private static final int __FETCHING_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.FETCHING};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FETCHING, new org.apache.thrift.meta_data.FieldMetaData("fetching", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProxyUserStatus.class, metaDataMap);
  }

  public ProxyUserStatus() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProxyUserStatus(ProxyUserStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    this.fetching = other.fetching;
  }

  public ProxyUserStatus deepCopy() {
    return new ProxyUserStatus(this);
  }

  
  public void clear() {
    setFetchingIsSet(false);
    this.fetching = false;
  }

  public boolean isFetching() {
    return this.fetching;
  }

  public ProxyUserStatus setFetching(boolean fetching) {
    this.fetching = fetching;
    setFetchingIsSet(true);
    return this;
  }

  public void unsetFetching() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FETCHING_ISSET_ID);
  }

  /** Returns true if field fetching is set (has been assigned a value) and false otherwise */
  public boolean isSetFetching() {
    return EncodingUtils.testBit(__isset_bitfield, __FETCHING_ISSET_ID);
  }

  public void setFetchingIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FETCHING_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FETCHING:
      if (value == null) {
        unsetFetching();
      } else {
        setFetching((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FETCHING:
      return Boolean.valueOf(isFetching());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FETCHING:
      return isSetFetching();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProxyUserStatus)
      return this.equals((ProxyUserStatus)that);
    return false;
  }

  public boolean equals(ProxyUserStatus that) {
    if (that == null)
      return false;

    boolean this_present_fetching = true && this.isSetFetching();
    boolean that_present_fetching = true && that.isSetFetching();
    if (this_present_fetching || that_present_fetching) {
      if (!(this_present_fetching && that_present_fetching))
        return false;
      if (this.fetching != that.fetching)
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_fetching = true && (isSetFetching());
    list.add(present_fetching);
    if (present_fetching)
      list.add(fetching);

    return list.hashCode();
  }

  
  public int compareTo(ProxyUserStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFetching()).compareTo(other.isSetFetching());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFetching()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fetching, other.fetching);
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

  
  public String toString() {
    StringBuilder sb = new StringBuilder("ProxyUserStatus(");
    boolean first = true;

    if (isSetFetching()) {
      sb.append("fetching:");
      sb.append(this.fetching);
      first = false;
    }
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

  private static class ProxyUserStatusStandardSchemeFactory implements SchemeFactory {
    public ProxyUserStatusStandardScheme getScheme() {
      return new ProxyUserStatusStandardScheme();
    }
  }

  private static class ProxyUserStatusStandardScheme extends StandardScheme<ProxyUserStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProxyUserStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FETCHING
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.fetching = iprot.readBool();
              struct.setFetchingIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProxyUserStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetFetching()) {
        oprot.writeFieldBegin(FETCHING_FIELD_DESC);
        oprot.writeBool(struct.fetching);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProxyUserStatusTupleSchemeFactory implements SchemeFactory {
    public ProxyUserStatusTupleScheme getScheme() {
      return new ProxyUserStatusTupleScheme();
    }
  }

  private static class ProxyUserStatusTupleScheme extends TupleScheme<ProxyUserStatus> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, ProxyUserStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFetching()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetFetching()) {
        oprot.writeBool(struct.fetching);
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, ProxyUserStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.fetching = iprot.readBool();
        struct.setFetchingIsSet(true);
      }
    }
  }

}

