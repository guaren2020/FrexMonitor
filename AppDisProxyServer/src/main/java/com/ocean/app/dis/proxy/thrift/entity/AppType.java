/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ocean.app.dis.proxy.thrift.entity;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum AppType implements org.apache.thrift.TEnum {
  TYPE_APP(1),
  TYPE_GAME(2);

  private final int value;

  private AppType(int value) {
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
  public static AppType findByValue(int value) { 
    switch (value) {
      case 1:
        return TYPE_APP;
      case 2:
        return TYPE_GAME;
      default:
        return null;
    }
  }
}
