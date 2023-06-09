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
// source: google/monitoring/v3/uptime.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The regions from which an Uptime check can be run.
 * </pre>
 *
 * Protobuf enum {@code google.monitoring.v3.UptimeCheckRegion}
 */
public enum UptimeCheckRegion implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value if no region is specified. Will result in Uptime checks
   * running from all regions.
   * </pre>
   *
   * <code>REGION_UNSPECIFIED = 0;</code>
   */
  REGION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Allows checks to run from locations within the United States of America.
   * </pre>
   *
   * <code>USA = 1;</code>
   */
  USA(1),
  /**
   *
   *
   * <pre>
   * Allows checks to run from locations within the continent of Europe.
   * </pre>
   *
   * <code>EUROPE = 2;</code>
   */
  EUROPE(2),
  /**
   *
   *
   * <pre>
   * Allows checks to run from locations within the continent of South
   * America.
   * </pre>
   *
   * <code>SOUTH_AMERICA = 3;</code>
   */
  SOUTH_AMERICA(3),
  /**
   *
   *
   * <pre>
   * Allows checks to run from locations within the Asia Pacific area (ex:
   * Singapore).
   * </pre>
   *
   * <code>ASIA_PACIFIC = 4;</code>
   */
  ASIA_PACIFIC(4),
  /**
   *
   *
   * <pre>
   * Allows checks to run from locations within the western United States of
   * America
   * </pre>
   *
   * <code>USA_OREGON = 5;</code>
   */
  USA_OREGON(5),
  /**
   *
   *
   * <pre>
   * Allows checks to run from locations within the central United States of
   * America
   * </pre>
   *
   * <code>USA_IOWA = 6;</code>
   */
  USA_IOWA(6),
  /**
   *
   *
   * <pre>
   * Allows checks to run from locations within the eastern United States of
   * America
   * </pre>
   *
   * <code>USA_VIRGINIA = 7;</code>
   */
  USA_VIRGINIA(7),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value if no region is specified. Will result in Uptime checks
   * running from all regions.
   * </pre>
   *
   * <code>REGION_UNSPECIFIED = 0;</code>
   */
  public static final int REGION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Allows checks to run from locations within the United States of America.
   * </pre>
   *
   * <code>USA = 1;</code>
   */
  public static final int USA_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Allows checks to run from locations within the continent of Europe.
   * </pre>
   *
   * <code>EUROPE = 2;</code>
   */
  public static final int EUROPE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Allows checks to run from locations within the continent of South
   * America.
   * </pre>
   *
   * <code>SOUTH_AMERICA = 3;</code>
   */
  public static final int SOUTH_AMERICA_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Allows checks to run from locations within the Asia Pacific area (ex:
   * Singapore).
   * </pre>
   *
   * <code>ASIA_PACIFIC = 4;</code>
   */
  public static final int ASIA_PACIFIC_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Allows checks to run from locations within the western United States of
   * America
   * </pre>
   *
   * <code>USA_OREGON = 5;</code>
   */
  public static final int USA_OREGON_VALUE = 5;
  /**
   *
   *
   * <pre>
   * Allows checks to run from locations within the central United States of
   * America
   * </pre>
   *
   * <code>USA_IOWA = 6;</code>
   */
  public static final int USA_IOWA_VALUE = 6;
  /**
   *
   *
   * <pre>
   * Allows checks to run from locations within the eastern United States of
   * America
   * </pre>
   *
   * <code>USA_VIRGINIA = 7;</code>
   */
  public static final int USA_VIRGINIA_VALUE = 7;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static UptimeCheckRegion valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UptimeCheckRegion forNumber(int value) {
    switch (value) {
      case 0:
        return REGION_UNSPECIFIED;
      case 1:
        return USA;
      case 2:
        return EUROPE;
      case 3:
        return SOUTH_AMERICA;
      case 4:
        return ASIA_PACIFIC;
      case 5:
        return USA_OREGON;
      case 6:
        return USA_IOWA;
      case 7:
        return USA_VIRGINIA;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UptimeCheckRegion> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<UptimeCheckRegion>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UptimeCheckRegion>() {
            public UptimeCheckRegion findValueByNumber(int number) {
              return UptimeCheckRegion.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.monitoring.v3.UptimeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final UptimeCheckRegion[] VALUES = values();

  public static UptimeCheckRegion valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private UptimeCheckRegion(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.monitoring.v3.UptimeCheckRegion)
}
