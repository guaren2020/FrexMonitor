/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ocean.lbs.entity;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum CoorType implements org.apache.thrift.TEnum {
  COOR_BD09LL(0),
  COOR_GCJ02(1),
  COOR_WGS84(2);

  private final int value;

  private CoorType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static CoorType findByValue(int value) { 
    switch (value) {
      case 0:
        return COOR_BD09LL;
      case 1:
        return COOR_GCJ02;
      case 2:
        return COOR_WGS84;
      default:
        return null;
    }
  }
}
