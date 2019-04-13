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
public class AdRankingInfo implements org.apache.thrift.TBase<AdRankingInfo, AdRankingInfo._Fields>, java.io.Serializable, Cloneable, Comparable<AdRankingInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AdRankingInfo");

  private static final org.apache.thrift.protocol.TField AD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("adId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SCORE_FIELD_DESC = new org.apache.thrift.protocol.TField("score", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField CLICK_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("clickCount", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField VIEW_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("viewCount", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField RECOMMEND_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("recommendType", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField AD_WEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("adWeight", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField MATCH_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("matchType", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField TM_IND_FIELD_DESC = new org.apache.thrift.protocol.TField("tmInd", org.apache.thrift.protocol.TType.STRUCT, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AdRankingInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AdRankingInfoTupleSchemeFactory());
  }

  public long adId; // required
  public long score; // required
  public long clickCount; // required
  public long viewCount; // required
  public int recommendType; // required
  public int adWeight; // required
  public int matchType; // optional
  public TimeIndex tmInd; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AD_ID((short)1, "adId"),
    SCORE((short)2, "score"),
    CLICK_COUNT((short)3, "clickCount"),
    VIEW_COUNT((short)4, "viewCount"),
    RECOMMEND_TYPE((short)5, "recommendType"),
    AD_WEIGHT((short)6, "adWeight"),
    MATCH_TYPE((short)7, "matchType"),
    TM_IND((short)8, "tmInd");

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
        case 1: // AD_ID
          return AD_ID;
        case 2: // SCORE
          return SCORE;
        case 3: // CLICK_COUNT
          return CLICK_COUNT;
        case 4: // VIEW_COUNT
          return VIEW_COUNT;
        case 5: // RECOMMEND_TYPE
          return RECOMMEND_TYPE;
        case 6: // AD_WEIGHT
          return AD_WEIGHT;
        case 7: // MATCH_TYPE
          return MATCH_TYPE;
        case 8: // TM_IND
          return TM_IND;
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
  private static final int __ADID_ISSET_ID = 0;
  private static final int __SCORE_ISSET_ID = 1;
  private static final int __CLICKCOUNT_ISSET_ID = 2;
  private static final int __VIEWCOUNT_ISSET_ID = 3;
  private static final int __RECOMMENDTYPE_ISSET_ID = 4;
  private static final int __ADWEIGHT_ISSET_ID = 5;
  private static final int __MATCHTYPE_ISSET_ID = 6;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MATCH_TYPE,_Fields.TM_IND};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AD_ID, new org.apache.thrift.meta_data.FieldMetaData("adId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SCORE, new org.apache.thrift.meta_data.FieldMetaData("score", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CLICK_COUNT, new org.apache.thrift.meta_data.FieldMetaData("clickCount", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VIEW_COUNT, new org.apache.thrift.meta_data.FieldMetaData("viewCount", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RECOMMEND_TYPE, new org.apache.thrift.meta_data.FieldMetaData("recommendType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AD_WEIGHT, new org.apache.thrift.meta_data.FieldMetaData("adWeight", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MATCH_TYPE, new org.apache.thrift.meta_data.FieldMetaData("matchType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TM_IND, new org.apache.thrift.meta_data.FieldMetaData("tmInd", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TimeIndex.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AdRankingInfo.class, metaDataMap);
  }

  public AdRankingInfo() {
  }

  public AdRankingInfo(
    long adId,
    long score,
    long clickCount,
    long viewCount,
    int recommendType,
    int adWeight)
  {
    this();
    this.adId = adId;
    setAdIdIsSet(true);
    this.score = score;
    setScoreIsSet(true);
    this.clickCount = clickCount;
    setClickCountIsSet(true);
    this.viewCount = viewCount;
    setViewCountIsSet(true);
    this.recommendType = recommendType;
    setRecommendTypeIsSet(true);
    this.adWeight = adWeight;
    setAdWeightIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AdRankingInfo(AdRankingInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.adId = other.adId;
    this.score = other.score;
    this.clickCount = other.clickCount;
    this.viewCount = other.viewCount;
    this.recommendType = other.recommendType;
    this.adWeight = other.adWeight;
    this.matchType = other.matchType;
    if (other.isSetTmInd()) {
      this.tmInd = new TimeIndex(other.tmInd);
    }
  }

  public AdRankingInfo deepCopy() {
    return new AdRankingInfo(this);
  }

  public void clear() {
    setAdIdIsSet(false);
    this.adId = 0;
    setScoreIsSet(false);
    this.score = 0;
    setClickCountIsSet(false);
    this.clickCount = 0;
    setViewCountIsSet(false);
    this.viewCount = 0;
    setRecommendTypeIsSet(false);
    this.recommendType = 0;
    setAdWeightIsSet(false);
    this.adWeight = 0;
    setMatchTypeIsSet(false);
    this.matchType = 0;
    this.tmInd = null;
  }

  public long getAdId() {
    return this.adId;
  }

  public AdRankingInfo setAdId(long adId) {
    this.adId = adId;
    setAdIdIsSet(true);
    return this;
  }

  public void unsetAdId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ADID_ISSET_ID);
  }

  /** Returns true if field adId is set (has been assigned a value) and false otherwise */
  public boolean isSetAdId() {
    return EncodingUtils.testBit(__isset_bitfield, __ADID_ISSET_ID);
  }

  public void setAdIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ADID_ISSET_ID, value);
  }

  public long getScore() {
    return this.score;
  }

  public AdRankingInfo setScore(long score) {
    this.score = score;
    setScoreIsSet(true);
    return this;
  }

  public void unsetScore() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SCORE_ISSET_ID);
  }

  /** Returns true if field score is set (has been assigned a value) and false otherwise */
  public boolean isSetScore() {
    return EncodingUtils.testBit(__isset_bitfield, __SCORE_ISSET_ID);
  }

  public void setScoreIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SCORE_ISSET_ID, value);
  }

  public long getClickCount() {
    return this.clickCount;
  }

  public AdRankingInfo setClickCount(long clickCount) {
    this.clickCount = clickCount;
    setClickCountIsSet(true);
    return this;
  }

  public void unsetClickCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CLICKCOUNT_ISSET_ID);
  }

  /** Returns true if field clickCount is set (has been assigned a value) and false otherwise */
  public boolean isSetClickCount() {
    return EncodingUtils.testBit(__isset_bitfield, __CLICKCOUNT_ISSET_ID);
  }

  public void setClickCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CLICKCOUNT_ISSET_ID, value);
  }

  public long getViewCount() {
    return this.viewCount;
  }

  public AdRankingInfo setViewCount(long viewCount) {
    this.viewCount = viewCount;
    setViewCountIsSet(true);
    return this;
  }

  public void unsetViewCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VIEWCOUNT_ISSET_ID);
  }

  /** Returns true if field viewCount is set (has been assigned a value) and false otherwise */
  public boolean isSetViewCount() {
    return EncodingUtils.testBit(__isset_bitfield, __VIEWCOUNT_ISSET_ID);
  }

  public void setViewCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VIEWCOUNT_ISSET_ID, value);
  }

  public int getRecommendType() {
    return this.recommendType;
  }

  public AdRankingInfo setRecommendType(int recommendType) {
    this.recommendType = recommendType;
    setRecommendTypeIsSet(true);
    return this;
  }

  public void unsetRecommendType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RECOMMENDTYPE_ISSET_ID);
  }

  /** Returns true if field recommendType is set (has been assigned a value) and false otherwise */
  public boolean isSetRecommendType() {
    return EncodingUtils.testBit(__isset_bitfield, __RECOMMENDTYPE_ISSET_ID);
  }

  public void setRecommendTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RECOMMENDTYPE_ISSET_ID, value);
  }

  public int getAdWeight() {
    return this.adWeight;
  }

  public AdRankingInfo setAdWeight(int adWeight) {
    this.adWeight = adWeight;
    setAdWeightIsSet(true);
    return this;
  }

  public void unsetAdWeight() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ADWEIGHT_ISSET_ID);
  }

  /** Returns true if field adWeight is set (has been assigned a value) and false otherwise */
  public boolean isSetAdWeight() {
    return EncodingUtils.testBit(__isset_bitfield, __ADWEIGHT_ISSET_ID);
  }

  public void setAdWeightIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ADWEIGHT_ISSET_ID, value);
  }

  public int getMatchType() {
    return this.matchType;
  }

  public AdRankingInfo setMatchType(int matchType) {
    this.matchType = matchType;
    setMatchTypeIsSet(true);
    return this;
  }

  public void unsetMatchType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MATCHTYPE_ISSET_ID);
  }

  /** Returns true if field matchType is set (has been assigned a value) and false otherwise */
  public boolean isSetMatchType() {
    return EncodingUtils.testBit(__isset_bitfield, __MATCHTYPE_ISSET_ID);
  }

  public void setMatchTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MATCHTYPE_ISSET_ID, value);
  }

  public TimeIndex getTmInd() {
    return this.tmInd;
  }

  public AdRankingInfo setTmInd(TimeIndex tmInd) {
    this.tmInd = tmInd;
    return this;
  }

  public void unsetTmInd() {
    this.tmInd = null;
  }

  /** Returns true if field tmInd is set (has been assigned a value) and false otherwise */
  public boolean isSetTmInd() {
    return this.tmInd != null;
  }

  public void setTmIndIsSet(boolean value) {
    if (!value) {
      this.tmInd = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AD_ID:
      if (value == null) {
        unsetAdId();
      } else {
        setAdId((Long)value);
      }
      break;

    case SCORE:
      if (value == null) {
        unsetScore();
      } else {
        setScore((Long)value);
      }
      break;

    case CLICK_COUNT:
      if (value == null) {
        unsetClickCount();
      } else {
        setClickCount((Long)value);
      }
      break;

    case VIEW_COUNT:
      if (value == null) {
        unsetViewCount();
      } else {
        setViewCount((Long)value);
      }
      break;

    case RECOMMEND_TYPE:
      if (value == null) {
        unsetRecommendType();
      } else {
        setRecommendType((Integer)value);
      }
      break;

    case AD_WEIGHT:
      if (value == null) {
        unsetAdWeight();
      } else {
        setAdWeight((Integer)value);
      }
      break;

    case MATCH_TYPE:
      if (value == null) {
        unsetMatchType();
      } else {
        setMatchType((Integer)value);
      }
      break;

    case TM_IND:
      if (value == null) {
        unsetTmInd();
      } else {
        setTmInd((TimeIndex)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AD_ID:
      return Long.valueOf(getAdId());

    case SCORE:
      return Long.valueOf(getScore());

    case CLICK_COUNT:
      return Long.valueOf(getClickCount());

    case VIEW_COUNT:
      return Long.valueOf(getViewCount());

    case RECOMMEND_TYPE:
      return Integer.valueOf(getRecommendType());

    case AD_WEIGHT:
      return Integer.valueOf(getAdWeight());

    case MATCH_TYPE:
      return Integer.valueOf(getMatchType());

    case TM_IND:
      return getTmInd();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AD_ID:
      return isSetAdId();
    case SCORE:
      return isSetScore();
    case CLICK_COUNT:
      return isSetClickCount();
    case VIEW_COUNT:
      return isSetViewCount();
    case RECOMMEND_TYPE:
      return isSetRecommendType();
    case AD_WEIGHT:
      return isSetAdWeight();
    case MATCH_TYPE:
      return isSetMatchType();
    case TM_IND:
      return isSetTmInd();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AdRankingInfo)
      return this.equals((AdRankingInfo)that);
    return false;
  }

  public boolean equals(AdRankingInfo that) {
    if (that == null)
      return false;

    boolean this_present_adId = true;
    boolean that_present_adId = true;
    if (this_present_adId || that_present_adId) {
      if (!(this_present_adId && that_present_adId))
        return false;
      if (this.adId != that.adId)
        return false;
    }

    boolean this_present_score = true;
    boolean that_present_score = true;
    if (this_present_score || that_present_score) {
      if (!(this_present_score && that_present_score))
        return false;
      if (this.score != that.score)
        return false;
    }

    boolean this_present_clickCount = true;
    boolean that_present_clickCount = true;
    if (this_present_clickCount || that_present_clickCount) {
      if (!(this_present_clickCount && that_present_clickCount))
        return false;
      if (this.clickCount != that.clickCount)
        return false;
    }

    boolean this_present_viewCount = true;
    boolean that_present_viewCount = true;
    if (this_present_viewCount || that_present_viewCount) {
      if (!(this_present_viewCount && that_present_viewCount))
        return false;
      if (this.viewCount != that.viewCount)
        return false;
    }

    boolean this_present_recommendType = true;
    boolean that_present_recommendType = true;
    if (this_present_recommendType || that_present_recommendType) {
      if (!(this_present_recommendType && that_present_recommendType))
        return false;
      if (this.recommendType != that.recommendType)
        return false;
    }

    boolean this_present_adWeight = true;
    boolean that_present_adWeight = true;
    if (this_present_adWeight || that_present_adWeight) {
      if (!(this_present_adWeight && that_present_adWeight))
        return false;
      if (this.adWeight != that.adWeight)
        return false;
    }

    boolean this_present_matchType = true && this.isSetMatchType();
    boolean that_present_matchType = true && that.isSetMatchType();
    if (this_present_matchType || that_present_matchType) {
      if (!(this_present_matchType && that_present_matchType))
        return false;
      if (this.matchType != that.matchType)
        return false;
    }

    boolean this_present_tmInd = true && this.isSetTmInd();
    boolean that_present_tmInd = true && that.isSetTmInd();
    if (this_present_tmInd || that_present_tmInd) {
      if (!(this_present_tmInd && that_present_tmInd))
        return false;
      if (!this.tmInd.equals(that.tmInd))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_adId = true;
    list.add(present_adId);
    if (present_adId)
      list.add(adId);

    boolean present_score = true;
    list.add(present_score);
    if (present_score)
      list.add(score);

    boolean present_clickCount = true;
    list.add(present_clickCount);
    if (present_clickCount)
      list.add(clickCount);

    boolean present_viewCount = true;
    list.add(present_viewCount);
    if (present_viewCount)
      list.add(viewCount);

    boolean present_recommendType = true;
    list.add(present_recommendType);
    if (present_recommendType)
      list.add(recommendType);

    boolean present_adWeight = true;
    list.add(present_adWeight);
    if (present_adWeight)
      list.add(adWeight);

    boolean present_matchType = true && (isSetMatchType());
    list.add(present_matchType);
    if (present_matchType)
      list.add(matchType);

    boolean present_tmInd = true && (isSetTmInd());
    list.add(present_tmInd);
    if (present_tmInd)
      list.add(tmInd);

    return list.hashCode();
  }

  public int compareTo(AdRankingInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAdId()).compareTo(other.isSetAdId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adId, other.adId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScore()).compareTo(other.isSetScore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.score, other.score);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClickCount()).compareTo(other.isSetClickCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClickCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clickCount, other.clickCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetViewCount()).compareTo(other.isSetViewCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetViewCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.viewCount, other.viewCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRecommendType()).compareTo(other.isSetRecommendType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecommendType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recommendType, other.recommendType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdWeight()).compareTo(other.isSetAdWeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdWeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adWeight, other.adWeight);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMatchType()).compareTo(other.isSetMatchType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMatchType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.matchType, other.matchType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTmInd()).compareTo(other.isSetTmInd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTmInd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tmInd, other.tmInd);
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
    StringBuilder sb = new StringBuilder("AdRankingInfo(");
    boolean first = true;

    sb.append("adId:");
    sb.append(this.adId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("score:");
    sb.append(this.score);
    first = false;
    if (!first) sb.append(", ");
    sb.append("clickCount:");
    sb.append(this.clickCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("viewCount:");
    sb.append(this.viewCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("recommendType:");
    sb.append(this.recommendType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("adWeight:");
    sb.append(this.adWeight);
    first = false;
    if (isSetMatchType()) {
      if (!first) sb.append(", ");
      sb.append("matchType:");
      sb.append(this.matchType);
      first = false;
    }
    if (isSetTmInd()) {
      if (!first) sb.append(", ");
      sb.append("tmInd:");
      if (this.tmInd == null) {
        sb.append("null");
      } else {
        sb.append(this.tmInd);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'adId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'score' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'clickCount' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'viewCount' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'recommendType' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'adWeight' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (tmInd != null) {
      tmInd.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AdRankingInfoStandardSchemeFactory implements SchemeFactory {
    public AdRankingInfoStandardScheme getScheme() {
      return new AdRankingInfoStandardScheme();
    }
  }

  private static class AdRankingInfoStandardScheme extends StandardScheme<AdRankingInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AdRankingInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AD_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.adId = iprot.readI64();
              struct.setAdIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SCORE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.score = iprot.readI64();
              struct.setScoreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CLICK_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.clickCount = iprot.readI64();
              struct.setClickCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VIEW_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.viewCount = iprot.readI64();
              struct.setViewCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RECOMMEND_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.recommendType = iprot.readI32();
              struct.setRecommendTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // AD_WEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.adWeight = iprot.readI32();
              struct.setAdWeightIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // MATCH_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.matchType = iprot.readI32();
              struct.setMatchTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // TM_IND
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.tmInd = new TimeIndex();
              struct.tmInd.read(iprot);
              struct.setTmIndIsSet(true);
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
      if (!struct.isSetAdId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'adId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetScore()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'score' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetClickCount()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'clickCount' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetViewCount()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'viewCount' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetRecommendType()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'recommendType' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetAdWeight()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'adWeight' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AdRankingInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(AD_ID_FIELD_DESC);
      oprot.writeI64(struct.adId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SCORE_FIELD_DESC);
      oprot.writeI64(struct.score);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CLICK_COUNT_FIELD_DESC);
      oprot.writeI64(struct.clickCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VIEW_COUNT_FIELD_DESC);
      oprot.writeI64(struct.viewCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RECOMMEND_TYPE_FIELD_DESC);
      oprot.writeI32(struct.recommendType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AD_WEIGHT_FIELD_DESC);
      oprot.writeI32(struct.adWeight);
      oprot.writeFieldEnd();
      if (struct.isSetMatchType()) {
        oprot.writeFieldBegin(MATCH_TYPE_FIELD_DESC);
        oprot.writeI32(struct.matchType);
        oprot.writeFieldEnd();
      }
      if (struct.tmInd != null) {
        if (struct.isSetTmInd()) {
          oprot.writeFieldBegin(TM_IND_FIELD_DESC);
          struct.tmInd.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AdRankingInfoTupleSchemeFactory implements SchemeFactory {
    public AdRankingInfoTupleScheme getScheme() {
      return new AdRankingInfoTupleScheme();
    }
  }

  private static class AdRankingInfoTupleScheme extends TupleScheme<AdRankingInfo> {

    public void write(org.apache.thrift.protocol.TProtocol prot, AdRankingInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.adId);
      oprot.writeI64(struct.score);
      oprot.writeI64(struct.clickCount);
      oprot.writeI64(struct.viewCount);
      oprot.writeI32(struct.recommendType);
      oprot.writeI32(struct.adWeight);
      BitSet optionals = new BitSet();
      if (struct.isSetMatchType()) {
        optionals.set(0);
      }
      if (struct.isSetTmInd()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMatchType()) {
        oprot.writeI32(struct.matchType);
      }
      if (struct.isSetTmInd()) {
        struct.tmInd.write(oprot);
      }
    }

    public void read(org.apache.thrift.protocol.TProtocol prot, AdRankingInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.adId = iprot.readI64();
      struct.setAdIdIsSet(true);
      struct.score = iprot.readI64();
      struct.setScoreIsSet(true);
      struct.clickCount = iprot.readI64();
      struct.setClickCountIsSet(true);
      struct.viewCount = iprot.readI64();
      struct.setViewCountIsSet(true);
      struct.recommendType = iprot.readI32();
      struct.setRecommendTypeIsSet(true);
      struct.adWeight = iprot.readI32();
      struct.setAdWeightIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.matchType = iprot.readI32();
        struct.setMatchTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tmInd = new TimeIndex();
        struct.tmInd.read(iprot);
        struct.setTmIndIsSet(true);
      }
    }
  }

}
