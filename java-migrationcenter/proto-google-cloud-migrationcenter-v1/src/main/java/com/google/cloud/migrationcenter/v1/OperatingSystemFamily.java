/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

/**
 *
 *
 * <pre>
 * Known categories of operating systems.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.migrationcenter.v1.OperatingSystemFamily}
 */
public enum OperatingSystemFamily implements com.google.protobuf.ProtocolMessageEnum {
  /** <code>OS_FAMILY_UNKNOWN = 0;</code> */
  OS_FAMILY_UNKNOWN(0),
  /**
   *
   *
   * <pre>
   * Microsoft Windows Server and Desktop.
   * </pre>
   *
   * <code>OS_FAMILY_WINDOWS = 1;</code>
   */
  OS_FAMILY_WINDOWS(1),
  /**
   *
   *
   * <pre>
   * Various Linux flavors.
   * </pre>
   *
   * <code>OS_FAMILY_LINUX = 2;</code>
   */
  OS_FAMILY_LINUX(2),
  /**
   *
   *
   * <pre>
   * Non-Linux Unix flavors.
   * </pre>
   *
   * <code>OS_FAMILY_UNIX = 3;</code>
   */
  OS_FAMILY_UNIX(3),
  UNRECOGNIZED(-1),
  ;

  /** <code>OS_FAMILY_UNKNOWN = 0;</code> */
  public static final int OS_FAMILY_UNKNOWN_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Microsoft Windows Server and Desktop.
   * </pre>
   *
   * <code>OS_FAMILY_WINDOWS = 1;</code>
   */
  public static final int OS_FAMILY_WINDOWS_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Various Linux flavors.
   * </pre>
   *
   * <code>OS_FAMILY_LINUX = 2;</code>
   */
  public static final int OS_FAMILY_LINUX_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Non-Linux Unix flavors.
   * </pre>
   *
   * <code>OS_FAMILY_UNIX = 3;</code>
   */
  public static final int OS_FAMILY_UNIX_VALUE = 3;

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
  public static OperatingSystemFamily valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OperatingSystemFamily forNumber(int value) {
    switch (value) {
      case 0:
        return OS_FAMILY_UNKNOWN;
      case 1:
        return OS_FAMILY_WINDOWS;
      case 2:
        return OS_FAMILY_LINUX;
      case 3:
        return OS_FAMILY_UNIX;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OperatingSystemFamily>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<OperatingSystemFamily>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OperatingSystemFamily>() {
            public OperatingSystemFamily findValueByNumber(int number) {
              return OperatingSystemFamily.forNumber(number);
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
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final OperatingSystemFamily[] VALUES = values();

  public static OperatingSystemFamily valueOf(
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

  private OperatingSystemFamily(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.migrationcenter.v1.OperatingSystemFamily)
}
