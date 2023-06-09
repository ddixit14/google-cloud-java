/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/document.proto

package com.google.cloud.contentwarehouse.v1;

public interface ValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Represents a float value.
   * </pre>
   *
   * <code>float float_value = 1;</code>
   *
   * @return Whether the floatValue field is set.
   */
  boolean hasFloatValue();
  /**
   *
   *
   * <pre>
   * Represents a float value.
   * </pre>
   *
   * <code>float float_value = 1;</code>
   *
   * @return The floatValue.
   */
  float getFloatValue();

  /**
   *
   *
   * <pre>
   * Represents a integer value.
   * </pre>
   *
   * <code>int32 int_value = 2;</code>
   *
   * @return Whether the intValue field is set.
   */
  boolean hasIntValue();
  /**
   *
   *
   * <pre>
   * Represents a integer value.
   * </pre>
   *
   * <code>int32 int_value = 2;</code>
   *
   * @return The intValue.
   */
  int getIntValue();

  /**
   *
   *
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   *
   *
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   *
   *
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString getStringValueBytes();

  /**
   *
   *
   * <pre>
   * Represents an enum value.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.EnumValue enum_value = 4;</code>
   *
   * @return Whether the enumValue field is set.
   */
  boolean hasEnumValue();
  /**
   *
   *
   * <pre>
   * Represents an enum value.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.EnumValue enum_value = 4;</code>
   *
   * @return The enumValue.
   */
  com.google.cloud.contentwarehouse.v1.EnumValue getEnumValue();
  /**
   *
   *
   * <pre>
   * Represents an enum value.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.EnumValue enum_value = 4;</code>
   */
  com.google.cloud.contentwarehouse.v1.EnumValueOrBuilder getEnumValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Represents a datetime value.
   * </pre>
   *
   * <code>.google.type.DateTime datetime_value = 5;</code>
   *
   * @return Whether the datetimeValue field is set.
   */
  boolean hasDatetimeValue();
  /**
   *
   *
   * <pre>
   * Represents a datetime value.
   * </pre>
   *
   * <code>.google.type.DateTime datetime_value = 5;</code>
   *
   * @return The datetimeValue.
   */
  com.google.type.DateTime getDatetimeValue();
  /**
   *
   *
   * <pre>
   * Represents a datetime value.
   * </pre>
   *
   * <code>.google.type.DateTime datetime_value = 5;</code>
   */
  com.google.type.DateTimeOrBuilder getDatetimeValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Represents a timestamp value.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.TimestampValue timestamp_value = 6;</code>
   *
   * @return Whether the timestampValue field is set.
   */
  boolean hasTimestampValue();
  /**
   *
   *
   * <pre>
   * Represents a timestamp value.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.TimestampValue timestamp_value = 6;</code>
   *
   * @return The timestampValue.
   */
  com.google.cloud.contentwarehouse.v1.TimestampValue getTimestampValue();
  /**
   *
   *
   * <pre>
   * Represents a timestamp value.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.TimestampValue timestamp_value = 6;</code>
   */
  com.google.cloud.contentwarehouse.v1.TimestampValueOrBuilder getTimestampValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Represents a boolean value.
   * </pre>
   *
   * <code>bool boolean_value = 7;</code>
   *
   * @return Whether the booleanValue field is set.
   */
  boolean hasBooleanValue();
  /**
   *
   *
   * <pre>
   * Represents a boolean value.
   * </pre>
   *
   * <code>bool boolean_value = 7;</code>
   *
   * @return The booleanValue.
   */
  boolean getBooleanValue();

  com.google.cloud.contentwarehouse.v1.Value.KindCase getKindCase();
}
