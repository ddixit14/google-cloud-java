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
// source: google/cloud/channel/v1/repricing.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * A type that represents the various adjustments you can apply to a bill.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.RepricingAdjustment}
 */
public final class RepricingAdjustment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.RepricingAdjustment)
    RepricingAdjustmentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RepricingAdjustment.newBuilder() to construct.
  private RepricingAdjustment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RepricingAdjustment() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RepricingAdjustment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.RepricingProto
        .internal_static_google_cloud_channel_v1_RepricingAdjustment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.RepricingProto
        .internal_static_google_cloud_channel_v1_RepricingAdjustment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.RepricingAdjustment.class,
            com.google.cloud.channel.v1.RepricingAdjustment.Builder.class);
  }

  private int adjustmentCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object adjustment_;

  public enum AdjustmentCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PERCENTAGE_ADJUSTMENT(2),
    ADJUSTMENT_NOT_SET(0);
    private final int value;

    private AdjustmentCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AdjustmentCase valueOf(int value) {
      return forNumber(value);
    }

    public static AdjustmentCase forNumber(int value) {
      switch (value) {
        case 2:
          return PERCENTAGE_ADJUSTMENT;
        case 0:
          return ADJUSTMENT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public AdjustmentCase getAdjustmentCase() {
    return AdjustmentCase.forNumber(adjustmentCase_);
  }

  public static final int PERCENTAGE_ADJUSTMENT_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Flat markup or markdown on an entire bill.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.PercentageAdjustment percentage_adjustment = 2;</code>
   *
   * @return Whether the percentageAdjustment field is set.
   */
  @java.lang.Override
  public boolean hasPercentageAdjustment() {
    return adjustmentCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Flat markup or markdown on an entire bill.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.PercentageAdjustment percentage_adjustment = 2;</code>
   *
   * @return The percentageAdjustment.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.PercentageAdjustment getPercentageAdjustment() {
    if (adjustmentCase_ == 2) {
      return (com.google.cloud.channel.v1.PercentageAdjustment) adjustment_;
    }
    return com.google.cloud.channel.v1.PercentageAdjustment.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Flat markup or markdown on an entire bill.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.PercentageAdjustment percentage_adjustment = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.PercentageAdjustmentOrBuilder
      getPercentageAdjustmentOrBuilder() {
    if (adjustmentCase_ == 2) {
      return (com.google.cloud.channel.v1.PercentageAdjustment) adjustment_;
    }
    return com.google.cloud.channel.v1.PercentageAdjustment.getDefaultInstance();
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
    if (adjustmentCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.channel.v1.PercentageAdjustment) adjustment_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adjustmentCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.channel.v1.PercentageAdjustment) adjustment_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.RepricingAdjustment)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.RepricingAdjustment other =
        (com.google.cloud.channel.v1.RepricingAdjustment) obj;

    if (!getAdjustmentCase().equals(other.getAdjustmentCase())) return false;
    switch (adjustmentCase_) {
      case 2:
        if (!getPercentageAdjustment().equals(other.getPercentageAdjustment())) return false;
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
    switch (adjustmentCase_) {
      case 2:
        hash = (37 * hash) + PERCENTAGE_ADJUSTMENT_FIELD_NUMBER;
        hash = (53 * hash) + getPercentageAdjustment().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.RepricingAdjustment parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.RepricingAdjustment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.RepricingAdjustment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.RepricingAdjustment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.RepricingAdjustment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.RepricingAdjustment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.RepricingAdjustment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.RepricingAdjustment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.RepricingAdjustment parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.RepricingAdjustment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.RepricingAdjustment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.RepricingAdjustment parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.RepricingAdjustment prototype) {
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
   * A type that represents the various adjustments you can apply to a bill.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.RepricingAdjustment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.RepricingAdjustment)
      com.google.cloud.channel.v1.RepricingAdjustmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.RepricingProto
          .internal_static_google_cloud_channel_v1_RepricingAdjustment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.RepricingProto
          .internal_static_google_cloud_channel_v1_RepricingAdjustment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.RepricingAdjustment.class,
              com.google.cloud.channel.v1.RepricingAdjustment.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.RepricingAdjustment.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (percentageAdjustmentBuilder_ != null) {
        percentageAdjustmentBuilder_.clear();
      }
      adjustmentCase_ = 0;
      adjustment_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.RepricingProto
          .internal_static_google_cloud_channel_v1_RepricingAdjustment_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.RepricingAdjustment getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.RepricingAdjustment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.RepricingAdjustment build() {
      com.google.cloud.channel.v1.RepricingAdjustment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.RepricingAdjustment buildPartial() {
      com.google.cloud.channel.v1.RepricingAdjustment result =
          new com.google.cloud.channel.v1.RepricingAdjustment(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.channel.v1.RepricingAdjustment result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.channel.v1.RepricingAdjustment result) {
      result.adjustmentCase_ = adjustmentCase_;
      result.adjustment_ = this.adjustment_;
      if (adjustmentCase_ == 2 && percentageAdjustmentBuilder_ != null) {
        result.adjustment_ = percentageAdjustmentBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.channel.v1.RepricingAdjustment) {
        return mergeFrom((com.google.cloud.channel.v1.RepricingAdjustment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.RepricingAdjustment other) {
      if (other == com.google.cloud.channel.v1.RepricingAdjustment.getDefaultInstance())
        return this;
      switch (other.getAdjustmentCase()) {
        case PERCENTAGE_ADJUSTMENT:
          {
            mergePercentageAdjustment(other.getPercentageAdjustment());
            break;
          }
        case ADJUSTMENT_NOT_SET:
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
            case 18:
              {
                input.readMessage(
                    getPercentageAdjustmentFieldBuilder().getBuilder(), extensionRegistry);
                adjustmentCase_ = 2;
                break;
              } // case 18
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

    private int adjustmentCase_ = 0;
    private java.lang.Object adjustment_;

    public AdjustmentCase getAdjustmentCase() {
      return AdjustmentCase.forNumber(adjustmentCase_);
    }

    public Builder clearAdjustment() {
      adjustmentCase_ = 0;
      adjustment_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.PercentageAdjustment,
            com.google.cloud.channel.v1.PercentageAdjustment.Builder,
            com.google.cloud.channel.v1.PercentageAdjustmentOrBuilder>
        percentageAdjustmentBuilder_;
    /**
     *
     *
     * <pre>
     * Flat markup or markdown on an entire bill.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.PercentageAdjustment percentage_adjustment = 2;</code>
     *
     * @return Whether the percentageAdjustment field is set.
     */
    @java.lang.Override
    public boolean hasPercentageAdjustment() {
      return adjustmentCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Flat markup or markdown on an entire bill.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.PercentageAdjustment percentage_adjustment = 2;</code>
     *
     * @return The percentageAdjustment.
     */
    @java.lang.Override
    public com.google.cloud.channel.v1.PercentageAdjustment getPercentageAdjustment() {
      if (percentageAdjustmentBuilder_ == null) {
        if (adjustmentCase_ == 2) {
          return (com.google.cloud.channel.v1.PercentageAdjustment) adjustment_;
        }
        return com.google.cloud.channel.v1.PercentageAdjustment.getDefaultInstance();
      } else {
        if (adjustmentCase_ == 2) {
          return percentageAdjustmentBuilder_.getMessage();
        }
        return com.google.cloud.channel.v1.PercentageAdjustment.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Flat markup or markdown on an entire bill.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.PercentageAdjustment percentage_adjustment = 2;</code>
     */
    public Builder setPercentageAdjustment(com.google.cloud.channel.v1.PercentageAdjustment value) {
      if (percentageAdjustmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adjustment_ = value;
        onChanged();
      } else {
        percentageAdjustmentBuilder_.setMessage(value);
      }
      adjustmentCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Flat markup or markdown on an entire bill.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.PercentageAdjustment percentage_adjustment = 2;</code>
     */
    public Builder setPercentageAdjustment(
        com.google.cloud.channel.v1.PercentageAdjustment.Builder builderForValue) {
      if (percentageAdjustmentBuilder_ == null) {
        adjustment_ = builderForValue.build();
        onChanged();
      } else {
        percentageAdjustmentBuilder_.setMessage(builderForValue.build());
      }
      adjustmentCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Flat markup or markdown on an entire bill.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.PercentageAdjustment percentage_adjustment = 2;</code>
     */
    public Builder mergePercentageAdjustment(
        com.google.cloud.channel.v1.PercentageAdjustment value) {
      if (percentageAdjustmentBuilder_ == null) {
        if (adjustmentCase_ == 2
            && adjustment_
                != com.google.cloud.channel.v1.PercentageAdjustment.getDefaultInstance()) {
          adjustment_ =
              com.google.cloud.channel.v1.PercentageAdjustment.newBuilder(
                      (com.google.cloud.channel.v1.PercentageAdjustment) adjustment_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          adjustment_ = value;
        }
        onChanged();
      } else {
        if (adjustmentCase_ == 2) {
          percentageAdjustmentBuilder_.mergeFrom(value);
        } else {
          percentageAdjustmentBuilder_.setMessage(value);
        }
      }
      adjustmentCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Flat markup or markdown on an entire bill.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.PercentageAdjustment percentage_adjustment = 2;</code>
     */
    public Builder clearPercentageAdjustment() {
      if (percentageAdjustmentBuilder_ == null) {
        if (adjustmentCase_ == 2) {
          adjustmentCase_ = 0;
          adjustment_ = null;
          onChanged();
        }
      } else {
        if (adjustmentCase_ == 2) {
          adjustmentCase_ = 0;
          adjustment_ = null;
        }
        percentageAdjustmentBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Flat markup or markdown on an entire bill.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.PercentageAdjustment percentage_adjustment = 2;</code>
     */
    public com.google.cloud.channel.v1.PercentageAdjustment.Builder
        getPercentageAdjustmentBuilder() {
      return getPercentageAdjustmentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Flat markup or markdown on an entire bill.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.PercentageAdjustment percentage_adjustment = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.channel.v1.PercentageAdjustmentOrBuilder
        getPercentageAdjustmentOrBuilder() {
      if ((adjustmentCase_ == 2) && (percentageAdjustmentBuilder_ != null)) {
        return percentageAdjustmentBuilder_.getMessageOrBuilder();
      } else {
        if (adjustmentCase_ == 2) {
          return (com.google.cloud.channel.v1.PercentageAdjustment) adjustment_;
        }
        return com.google.cloud.channel.v1.PercentageAdjustment.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Flat markup or markdown on an entire bill.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.PercentageAdjustment percentage_adjustment = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.PercentageAdjustment,
            com.google.cloud.channel.v1.PercentageAdjustment.Builder,
            com.google.cloud.channel.v1.PercentageAdjustmentOrBuilder>
        getPercentageAdjustmentFieldBuilder() {
      if (percentageAdjustmentBuilder_ == null) {
        if (!(adjustmentCase_ == 2)) {
          adjustment_ = com.google.cloud.channel.v1.PercentageAdjustment.getDefaultInstance();
        }
        percentageAdjustmentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.channel.v1.PercentageAdjustment,
                com.google.cloud.channel.v1.PercentageAdjustment.Builder,
                com.google.cloud.channel.v1.PercentageAdjustmentOrBuilder>(
                (com.google.cloud.channel.v1.PercentageAdjustment) adjustment_,
                getParentForChildren(),
                isClean());
        adjustment_ = null;
      }
      adjustmentCase_ = 2;
      onChanged();
      return percentageAdjustmentBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.RepricingAdjustment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.RepricingAdjustment)
  private static final com.google.cloud.channel.v1.RepricingAdjustment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.RepricingAdjustment();
  }

  public static com.google.cloud.channel.v1.RepricingAdjustment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RepricingAdjustment> PARSER =
      new com.google.protobuf.AbstractParser<RepricingAdjustment>() {
        @java.lang.Override
        public RepricingAdjustment parsePartialFrom(
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

  public static com.google.protobuf.Parser<RepricingAdjustment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RepricingAdjustment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.RepricingAdjustment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
