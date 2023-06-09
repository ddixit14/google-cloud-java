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
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [CloudChannelService.CreateCustomerRepricingConfig][google.cloud.channel.v1.CloudChannelService.CreateCustomerRepricingConfig].
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.CreateCustomerRepricingConfigRequest}
 */
public final class CreateCustomerRepricingConfigRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.CreateCustomerRepricingConfigRequest)
    CreateCustomerRepricingConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateCustomerRepricingConfigRequest.newBuilder() to construct.
  private CreateCustomerRepricingConfigRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateCustomerRepricingConfigRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateCustomerRepricingConfigRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_CreateCustomerRepricingConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_CreateCustomerRepricingConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest.class,
            com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the customer that will receive this
   * repricing config. Parent uses the format:
   * accounts/{account_id}/customers/{customer_id}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the customer that will receive this
   * repricing config. Parent uses the format:
   * accounts/{account_id}/customers/{customer_id}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOMER_REPRICING_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.channel.v1.CustomerRepricingConfig customerRepricingConfig_;
  /**
   *
   *
   * <pre>
   * Required. The CustomerRepricingConfig object to update.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the customerRepricingConfig field is set.
   */
  @java.lang.Override
  public boolean hasCustomerRepricingConfig() {
    return customerRepricingConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The CustomerRepricingConfig object to update.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The customerRepricingConfig.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.CustomerRepricingConfig getCustomerRepricingConfig() {
    return customerRepricingConfig_ == null
        ? com.google.cloud.channel.v1.CustomerRepricingConfig.getDefaultInstance()
        : customerRepricingConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The CustomerRepricingConfig object to update.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.CustomerRepricingConfigOrBuilder
      getCustomerRepricingConfigOrBuilder() {
    return customerRepricingConfig_ == null
        ? com.google.cloud.channel.v1.CustomerRepricingConfig.getDefaultInstance()
        : customerRepricingConfig_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (customerRepricingConfig_ != null) {
      output.writeMessage(2, getCustomerRepricingConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (customerRepricingConfig_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCustomerRepricingConfig());
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
    if (!(obj instanceof com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest other =
        (com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasCustomerRepricingConfig() != other.hasCustomerRepricingConfig()) return false;
    if (hasCustomerRepricingConfig()) {
      if (!getCustomerRepricingConfig().equals(other.getCustomerRepricingConfig())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasCustomerRepricingConfig()) {
      hash = (37 * hash) + CUSTOMER_REPRICING_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getCustomerRepricingConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest prototype) {
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
   * Request message for
   * [CloudChannelService.CreateCustomerRepricingConfig][google.cloud.channel.v1.CloudChannelService.CreateCustomerRepricingConfig].
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.CreateCustomerRepricingConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.CreateCustomerRepricingConfigRequest)
      com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CreateCustomerRepricingConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CreateCustomerRepricingConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest.class,
              com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      customerRepricingConfig_ = null;
      if (customerRepricingConfigBuilder_ != null) {
        customerRepricingConfigBuilder_.dispose();
        customerRepricingConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_CreateCustomerRepricingConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest
        getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest build() {
      com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest buildPartial() {
      com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest result =
          new com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.customerRepricingConfig_ =
            customerRepricingConfigBuilder_ == null
                ? customerRepricingConfig_
                : customerRepricingConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest) {
        return mergeFrom((com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest other) {
      if (other
          == com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCustomerRepricingConfig()) {
        mergeCustomerRepricingConfig(other.getCustomerRepricingConfig());
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
            case 10:
              {
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getCustomerRepricingConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
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

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the customer that will receive this
     * repricing config. Parent uses the format:
     * accounts/{account_id}/customers/{customer_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the customer that will receive this
     * repricing config. Parent uses the format:
     * accounts/{account_id}/customers/{customer_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the customer that will receive this
     * repricing config. Parent uses the format:
     * accounts/{account_id}/customers/{customer_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the customer that will receive this
     * repricing config. Parent uses the format:
     * accounts/{account_id}/customers/{customer_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the customer that will receive this
     * repricing config. Parent uses the format:
     * accounts/{account_id}/customers/{customer_id}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.channel.v1.CustomerRepricingConfig customerRepricingConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.CustomerRepricingConfig,
            com.google.cloud.channel.v1.CustomerRepricingConfig.Builder,
            com.google.cloud.channel.v1.CustomerRepricingConfigOrBuilder>
        customerRepricingConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the customerRepricingConfig field is set.
     */
    public boolean hasCustomerRepricingConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The customerRepricingConfig.
     */
    public com.google.cloud.channel.v1.CustomerRepricingConfig getCustomerRepricingConfig() {
      if (customerRepricingConfigBuilder_ == null) {
        return customerRepricingConfig_ == null
            ? com.google.cloud.channel.v1.CustomerRepricingConfig.getDefaultInstance()
            : customerRepricingConfig_;
      } else {
        return customerRepricingConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCustomerRepricingConfig(
        com.google.cloud.channel.v1.CustomerRepricingConfig value) {
      if (customerRepricingConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customerRepricingConfig_ = value;
      } else {
        customerRepricingConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCustomerRepricingConfig(
        com.google.cloud.channel.v1.CustomerRepricingConfig.Builder builderForValue) {
      if (customerRepricingConfigBuilder_ == null) {
        customerRepricingConfig_ = builderForValue.build();
      } else {
        customerRepricingConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeCustomerRepricingConfig(
        com.google.cloud.channel.v1.CustomerRepricingConfig value) {
      if (customerRepricingConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && customerRepricingConfig_ != null
            && customerRepricingConfig_
                != com.google.cloud.channel.v1.CustomerRepricingConfig.getDefaultInstance()) {
          getCustomerRepricingConfigBuilder().mergeFrom(value);
        } else {
          customerRepricingConfig_ = value;
        }
      } else {
        customerRepricingConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCustomerRepricingConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      customerRepricingConfig_ = null;
      if (customerRepricingConfigBuilder_ != null) {
        customerRepricingConfigBuilder_.dispose();
        customerRepricingConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.channel.v1.CustomerRepricingConfig.Builder
        getCustomerRepricingConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCustomerRepricingConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.channel.v1.CustomerRepricingConfigOrBuilder
        getCustomerRepricingConfigOrBuilder() {
      if (customerRepricingConfigBuilder_ != null) {
        return customerRepricingConfigBuilder_.getMessageOrBuilder();
      } else {
        return customerRepricingConfig_ == null
            ? com.google.cloud.channel.v1.CustomerRepricingConfig.getDefaultInstance()
            : customerRepricingConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The CustomerRepricingConfig object to update.
     * </pre>
     *
     * <code>
     * .google.cloud.channel.v1.CustomerRepricingConfig customer_repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.channel.v1.CustomerRepricingConfig,
            com.google.cloud.channel.v1.CustomerRepricingConfig.Builder,
            com.google.cloud.channel.v1.CustomerRepricingConfigOrBuilder>
        getCustomerRepricingConfigFieldBuilder() {
      if (customerRepricingConfigBuilder_ == null) {
        customerRepricingConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.channel.v1.CustomerRepricingConfig,
                com.google.cloud.channel.v1.CustomerRepricingConfig.Builder,
                com.google.cloud.channel.v1.CustomerRepricingConfigOrBuilder>(
                getCustomerRepricingConfig(), getParentForChildren(), isClean());
        customerRepricingConfig_ = null;
      }
      return customerRepricingConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.CreateCustomerRepricingConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.CreateCustomerRepricingConfigRequest)
  private static final com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest();
  }

  public static com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCustomerRepricingConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateCustomerRepricingConfigRequest>() {
        @java.lang.Override
        public CreateCustomerRepricingConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCustomerRepricingConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCustomerRepricingConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.CreateCustomerRepricingConfigRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
