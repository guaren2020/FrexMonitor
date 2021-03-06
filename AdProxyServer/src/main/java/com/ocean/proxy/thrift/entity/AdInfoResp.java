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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-7-5")
public class AdInfoResp implements org.apache.thrift.TBase<AdInfoResp, AdInfoResp._Fields>, java.io.Serializable, Cloneable, Comparable<AdInfoResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AdInfoResp");

  private static final org.apache.thrift.protocol.TField RETCODE_FIELD_DESC = new org.apache.thrift.protocol.TField("retcode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AdInfoRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AdInfoRespTupleSchemeFactory());
  }

  /**
   * 
   * @see AdResponseCode
   */
  public AdResponseCode retcode; // required
  public List<com.ocean.proxy.thrift.entity.AdContent> data; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see AdResponseCode
     */
    RETCODE((short)1, "retcode"),
    DATA((short)2, "data");

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
        case 1: // RETCODE
          return RETCODE;
        case 2: // DATA
          return DATA;
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
    tmpMap.put(_Fields.RETCODE, new org.apache.thrift.meta_data.FieldMetaData("retcode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, AdResponseCode.class)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.ocean.proxy.thrift.entity.AdContent.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AdInfoResp.class, metaDataMap);
  }

  public AdInfoResp() {
  }

  public AdInfoResp(
    AdResponseCode retcode,
    List<com.ocean.proxy.thrift.entity.AdContent> data)
  {
    this();
    this.retcode = retcode;
    this.data = data;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AdInfoResp(AdInfoResp other) {
    if (other.isSetRetcode()) {
      this.retcode = other.retcode;
    }
    if (other.isSetData()) {
      List<com.ocean.proxy.thrift.entity.AdContent> __this__data = new ArrayList<com.ocean.proxy.thrift.entity.AdContent>(other.data.size());
      for (com.ocean.proxy.thrift.entity.AdContent other_element : other.data) {
        __this__data.add(new com.ocean.proxy.thrift.entity.AdContent(other_element));
      }
      this.data = __this__data;
    }
  }

  public AdInfoResp deepCopy() {
    return new AdInfoResp(this);
  }

 
  public void clear() {
    this.retcode = null;
    this.data = null;
  }

  /**
   * 
   * @see AdResponseCode
   */
  public AdResponseCode getRetcode() {
    return this.retcode;
  }

  /**
   * 
   * @see AdResponseCode
   */
  public AdInfoResp setRetcode(AdResponseCode retcode) {
    this.retcode = retcode;
    return this;
  }

  public void unsetRetcode() {
    this.retcode = null;
  }

  /** Returns true if field retcode is set (has been assigned a value) and false otherwise */
  public boolean isSetRetcode() {
    return this.retcode != null;
  }

  public void setRetcodeIsSet(boolean value) {
    if (!value) {
      this.retcode = null;
    }
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public java.util.Iterator<com.ocean.proxy.thrift.entity.AdContent> getDataIterator() {
    return (this.data == null) ? null : this.data.iterator();
  }

  public void addToData(com.ocean.proxy.thrift.entity.AdContent elem) {
    if (this.data == null) {
      this.data = new ArrayList<com.ocean.proxy.thrift.entity.AdContent>();
    }
    this.data.add(elem);
  }

  public List<com.ocean.proxy.thrift.entity.AdContent> getData() {
    return this.data;
  }

  public AdInfoResp setData(List<com.ocean.proxy.thrift.entity.AdContent> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RETCODE:
      if (value == null) {
        unsetRetcode();
      } else {
        setRetcode((AdResponseCode)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((List<com.ocean.proxy.thrift.entity.AdContent>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RETCODE:
      return getRetcode();

    case DATA:
      return getData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RETCODE:
      return isSetRetcode();
    case DATA:
      return isSetData();
    }
    throw new IllegalStateException();
  }

 
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AdInfoResp)
      return this.equals((AdInfoResp)that);
    return false;
  }

  public boolean equals(AdInfoResp that) {
    if (that == null)
      return false;

    boolean this_present_retcode = true && this.isSetRetcode();
    boolean that_present_retcode = true && that.isSetRetcode();
    if (this_present_retcode || that_present_retcode) {
      if (!(this_present_retcode && that_present_retcode))
        return false;
      if (!this.retcode.equals(that.retcode))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    return true;
  }

 
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_retcode = true && (isSetRetcode());
    list.add(present_retcode);
    if (present_retcode)
      list.add(retcode.getValue());

    boolean present_data = true && (isSetData());
    list.add(present_data);
    if (present_data)
      list.add(data);

    return list.hashCode();
  }

 
  public int compareTo(AdInfoResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRetcode()).compareTo(other.isSetRetcode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRetcode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.retcode, other.retcode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
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
    StringBuilder sb = new StringBuilder("AdInfoResp(");
    boolean first = true;

    sb.append("retcode:");
    if (this.retcode == null) {
      sb.append("null");
    } else {
      sb.append(this.retcode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (retcode == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'retcode' was not present! Struct: " + toString());
    }
    if (data == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'data' was not present! Struct: " + toString());
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

  private static class AdInfoRespStandardSchemeFactory implements SchemeFactory {
    public AdInfoRespStandardScheme getScheme() {
      return new AdInfoRespStandardScheme();
    }
  }

  private static class AdInfoRespStandardScheme extends StandardScheme<AdInfoResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AdInfoResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RETCODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.retcode = com.ocean.proxy.thrift.entity.AdResponseCode.findByValue(iprot.readI32());
              struct.setRetcodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.data = new ArrayList<com.ocean.proxy.thrift.entity.AdContent>(_list32.size);
                com.ocean.proxy.thrift.entity.AdContent _elem33;
                for (int _i34 = 0; _i34 < _list32.size; ++_i34)
                {
                  _elem33 = new com.ocean.proxy.thrift.entity.AdContent();
                  _elem33.read(iprot);
                  struct.data.add(_elem33);
                }
                iprot.readListEnd();
              }
              struct.setDataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AdInfoResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.retcode != null) {
        oprot.writeFieldBegin(RETCODE_FIELD_DESC);
        oprot.writeI32(struct.retcode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.data.size()));
          for (com.ocean.proxy.thrift.entity.AdContent _iter35 : struct.data)
          {
            _iter35.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AdInfoRespTupleSchemeFactory implements SchemeFactory {
    public AdInfoRespTupleScheme getScheme() {
      return new AdInfoRespTupleScheme();
    }
  }

  private static class AdInfoRespTupleScheme extends TupleScheme<AdInfoResp> {

   
    public void write(org.apache.thrift.protocol.TProtocol prot, AdInfoResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.retcode.getValue());
      {
        oprot.writeI32(struct.data.size());
        for (com.ocean.proxy.thrift.entity.AdContent _iter36 : struct.data)
        {
          _iter36.write(oprot);
        }
      }
    }

   
    public void read(org.apache.thrift.protocol.TProtocol prot, AdInfoResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.retcode = com.ocean.proxy.thrift.entity.AdResponseCode.findByValue(iprot.readI32());
      struct.setRetcodeIsSet(true);
      {
        org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.data = new ArrayList<com.ocean.proxy.thrift.entity.AdContent>(_list37.size);
        com.ocean.proxy.thrift.entity.AdContent _elem38;
        for (int _i39 = 0; _i39 < _list37.size; ++_i39)
        {
          _elem38 = new com.ocean.proxy.thrift.entity.AdContent();
          _elem38.read(iprot);
          struct.data.add(_elem38);
        }
      }
      struct.setDataIsSet(true);
    }
  }

}

