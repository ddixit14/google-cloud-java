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
// source: google/analytics/admin/v1beta/access_report.proto

package com.google.analytics.admin.v1beta;

/**
 *
 *
 * <pre>
 * To represent a number.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.NumericValue}
 */
public final class NumericValue extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.NumericValue)
    NumericValueOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NumericValue.newBuilder() to construct.
  private NumericValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NumericValue() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NumericValue();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1beta.AccessReportProto
        .internal_static_google_analytics_admin_v1beta_NumericValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.AccessReportProto
        .internal_static_google_analytics_admin_v1beta_NumericValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.NumericValue.class,
            com.google.analytics.admin.v1beta.NumericValue.Builder.class);
  }

  private int oneValueCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object oneValue_;

  public enum OneValueCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INT64_VALUE(1),
    DOUBLE_VALUE(2),
    ONEVALUE_NOT_SET(0);
    private final int value;

    private OneValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OneValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static OneValueCase forNumber(int value) {
      switch (value) {
        case 1:
          return INT64_VALUE;
        case 2:
          return DOUBLE_VALUE;
        case 0:
          return ONEVALUE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public OneValueCase getOneValueCase() {
    return OneValueCase.forNumber(oneValueCase_);
  }

  public static final int INT64_VALUE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Integer value
   * </pre>
   *
   * <code>int64 int64_value = 1;</code>
   *
   * @return Whether the int64Value field is set.
   */
  @java.lang.Override
  public boolean hasInt64Value() {
    return oneValueCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Integer value
   * </pre>
   *
   * <code>int64 int64_value = 1;</code>
   *
   * @return The int64Value.
   */
  @java.lang.Override
  public long getInt64Value() {
    if (oneValueCase_ == 1) {
      return (java.lang.Long) oneValue_;
    }
    return 0L;
  }

  public static final int DOUBLE_VALUE_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Double value
   * </pre>
   *
   * <code>double double_value = 2;</code>
   *
   * @return Whether the doubleValue field is set.
   */
  @java.lang.Override
  public boolean hasDoubleValue() {
    return oneValueCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Double value
   * </pre>
   *
   * <code>double double_value = 2;</code>
   *
   * @return The doubleValue.
   */
  @java.lang.Override
  public double getDoubleValue() {
    if (oneValueCase_ == 2) {
      return (java.lang.Double) oneValue_;
    }
    return 0D;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (oneValueCase_ == 1) {
      output.writeInt64(1, (long) ((java.lang.Long) oneValue_));
    }
    if (oneValueCase_ == 2) {
      output.writeDouble(2, (double) ((java.lang.Double) oneValue_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oneValueCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt64Size(
              1, (long) ((java.lang.Long) oneValue_));
    }
    if (oneValueCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeDoubleSize(
              2, (double) ((java.lang.Double) oneValue_));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.analytics.admin.v1beta.NumericValue)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.NumericValue other =
        (com.google.analytics.admin.v1beta.NumericValue) obj;

    if (!getOneValueCase().equals(other.getOneValueCase())) return false;
    switch (oneValueCase_) {
      case 1:
        if (getInt64Value() != other.getInt64Value()) return false;
        break;
      case 2:
        if (java.lang.Double.doubleToLongBits(getDoubleValue())
            != java.lang.Double.doubleToLongBits(other.getDoubleValue())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (oneValueCase_) {
      case 1:
        hash = (37 * hash) + INT64_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getInt64Value());
        break;
      case 2:
        hash = (37 * hash) + DOUBLE_VALUE_FIELD_NUMBER;
        hash =
            (53 * hash)
                + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getDoubleValue()));
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.NumericValue parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.NumericValue parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.NumericValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.NumericValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.NumericValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.NumericValue parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.NumericValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.NumericValue parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.NumericValue parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.NumericValue parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.NumericValue parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.NumericValue parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.analytics.admin.v1beta.NumericValue prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * To represent a number.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.NumericValue}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.NumericValue)
      com.google.analytics.admin.v1beta.NumericValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1beta.AccessReportProto
          .internal_static_google_analytics_admin_v1beta_NumericValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.AccessReportProto
          .internal_static_google_analytics_admin_v1beta_NumericValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.NumericValue.class,
              com.google.analytics.admin.v1beta.NumericValue.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.NumericValue.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      oneValueCase_ = 0;
      oneValue_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1beta.AccessReportProto
          .internal_static_google_analytics_admin_v1beta_NumericValue_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.NumericValue getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.NumericValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.NumericValue build() {
      com.google.analytics.admin.v1beta.NumericValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.NumericValue buildPartial() {
      com.google.analytics.admin.v1beta.NumericValue result =
          new com.google.analytics.admin.v1beta.NumericValue(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1beta.NumericValue result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.analytics.admin.v1beta.NumericValue result) {
      result.oneValueCase_ = oneValueCase_;
      result.oneValue_ = this.oneValue_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.analytics.admin.v1beta.NumericValue) {
        return mergeFrom((com.google.analytics.admin.v1beta.NumericValue) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.NumericValue other) {
      if (other == com.google.analytics.admin.v1beta.NumericValue.getDefaultInstance()) return this;
      switch (other.getOneValueCase()) {
        case INT64_VALUE:
          {
            setInt64Value(other.getInt64Value());
            break;
          }
        case DOUBLE_VALUE:
          {
            setDoubleValue(other.getDoubleValue());
            break;
          }
        case ONEVALUE_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                oneValue_ = input.readInt64();
                oneValueCase_ = 1;
                break;
              } // case 8
            case 17:
              {
                oneValue_ = input.readDouble();
                oneValueCase_ = 2;
                break;
              } // case 17
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int oneValueCase_ = 0;
    private java.lang.Object oneValue_;

    public OneValueCase getOneValueCase() {
      return OneValueCase.forNumber(oneValueCase_);
    }

    public Builder clearOneValue() {
      oneValueCase_ = 0;
      oneValue_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Integer value
     * </pre>
     *
     * <code>int64 int64_value = 1;</code>
     *
     * @return Whether the int64Value field is set.
     */
    public boolean hasInt64Value() {
      return oneValueCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Integer value
     * </pre>
     *
     * <code>int64 int64_value = 1;</code>
     *
     * @return The int64Value.
     */
    public long getInt64Value() {
      if (oneValueCase_ == 1) {
        return (java.lang.Long) oneValue_;
      }
      return 0L;
    }
    /**
     *
     *
     * <pre>
     * Integer value
     * </pre>
     *
     * <code>int64 int64_value = 1;</code>
     *
     * @param value The int64Value to set.
     * @return This builder for chaining.
     */
    public Builder setInt64Value(long value) {

      oneValueCase_ = 1;
      oneValue_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Integer value
     * </pre>
     *
     * <code>int64 int64_value = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInt64Value() {
      if (oneValueCase_ == 1) {
        oneValueCase_ = 0;
        oneValue_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Double value
     * </pre>
     *
     * <code>double double_value = 2;</code>
     *
     * @return Whether the doubleValue field is set.
     */
    public boolean hasDoubleValue() {
      return oneValueCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Double value
     * </pre>
     *
     * <code>double double_value = 2;</code>
     *
     * @return The doubleValue.
     */
    public double getDoubleValue() {
      if (oneValueCase_ == 2) {
        return (java.lang.Double) oneValue_;
      }
      return 0D;
    }
    /**
     *
     *
     * <pre>
     * Double value
     * </pre>
     *
     * <code>double double_value = 2;</code>
     *
     * @param value The doubleValue to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleValue(double value) {

      oneValueCase_ = 2;
      oneValue_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Double value
     * </pre>
     *
     * <code>double double_value = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDoubleValue() {
      if (oneValueCase_ == 2) {
        oneValueCase_ = 0;
        oneValue_ = null;
        onChanged();
      }
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.NumericValue)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.NumericValue)
  private static final com.google.analytics.admin.v1beta.NumericValue DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.NumericValue();
  }

  public static com.google.analytics.admin.v1beta.NumericValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NumericValue> PARSER =
      new com.google.protobuf.AbstractParser<NumericValue>() {
        @java.lang.Override
        public NumericValue parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<NumericValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NumericValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.NumericValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
