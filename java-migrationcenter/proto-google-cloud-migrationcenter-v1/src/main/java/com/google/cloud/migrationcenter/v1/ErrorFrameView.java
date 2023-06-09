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
 * ErrorFrameView can be specified in ErrorFrames List and Get requests to
 * control the level of details that is returned for the original frame.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.migrationcenter.v1.ErrorFrameView}
 */
public enum ErrorFrameView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Value is unset. The system will fallback to the default value.
   * </pre>
   *
   * <code>ERROR_FRAME_VIEW_UNSPECIFIED = 0;</code>
   */
  ERROR_FRAME_VIEW_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Include basic frame data, but not the full contents.
   * </pre>
   *
   * <code>ERROR_FRAME_VIEW_BASIC = 1;</code>
   */
  ERROR_FRAME_VIEW_BASIC(1),
  /**
   *
   *
   * <pre>
   * Include everything.
   * </pre>
   *
   * <code>ERROR_FRAME_VIEW_FULL = 2;</code>
   */
  ERROR_FRAME_VIEW_FULL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Value is unset. The system will fallback to the default value.
   * </pre>
   *
   * <code>ERROR_FRAME_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int ERROR_FRAME_VIEW_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Include basic frame data, but not the full contents.
   * </pre>
   *
   * <code>ERROR_FRAME_VIEW_BASIC = 1;</code>
   */
  public static final int ERROR_FRAME_VIEW_BASIC_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Include everything.
   * </pre>
   *
   * <code>ERROR_FRAME_VIEW_FULL = 2;</code>
   */
  public static final int ERROR_FRAME_VIEW_FULL_VALUE = 2;

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
  public static ErrorFrameView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ErrorFrameView forNumber(int value) {
    switch (value) {
      case 0:
        return ERROR_FRAME_VIEW_UNSPECIFIED;
      case 1:
        return ERROR_FRAME_VIEW_BASIC;
      case 2:
        return ERROR_FRAME_VIEW_FULL;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ErrorFrameView> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ErrorFrameView> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ErrorFrameView>() {
        public ErrorFrameView findValueByNumber(int number) {
          return ErrorFrameView.forNumber(number);
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
        .get(4);
  }

  private static final ErrorFrameView[] VALUES = values();

  public static ErrorFrameView valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ErrorFrameView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.migrationcenter.v1.ErrorFrameView)
}
