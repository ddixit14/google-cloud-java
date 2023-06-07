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
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * Request for `BindDeviceToGateway`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.BindDeviceToGatewayRequest}
 */
public final class BindDeviceToGatewayRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.BindDeviceToGatewayRequest)
    BindDeviceToGatewayRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BindDeviceToGatewayRequest.newBuilder() to construct.
  private BindDeviceToGatewayRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BindDeviceToGatewayRequest() {
    parent_ = "";
    gatewayId_ = "";
    deviceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BindDeviceToGatewayRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iot.v1.DeviceManagerProto
        .internal_static_google_cloud_iot_v1_BindDeviceToGatewayRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.DeviceManagerProto
        .internal_static_google_cloud_iot_v1_BindDeviceToGatewayRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.BindDeviceToGatewayRequest.class,
            com.google.cloud.iot.v1.BindDeviceToGatewayRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the registry. For example,
   * `projects/example-project/locations/us-central1/registries/my-registry`.
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
   * Required. The name of the registry. For example,
   * `projects/example-project/locations/us-central1/registries/my-registry`.
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

  public static final int GATEWAY_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object gatewayId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The value of `gateway_id` can be either the device numeric ID or the
   * user-defined device identifier.
   * </pre>
   *
   * <code>string gateway_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The gatewayId.
   */
  @java.lang.Override
  public java.lang.String getGatewayId() {
    java.lang.Object ref = gatewayId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gatewayId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The value of `gateway_id` can be either the device numeric ID or the
   * user-defined device identifier.
   * </pre>
   *
   * <code>string gateway_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for gatewayId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getGatewayIdBytes() {
    java.lang.Object ref = gatewayId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      gatewayId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVICE_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object deviceId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The device to associate with the specified gateway. The value of
   * `device_id` can be either the device numeric ID or the user-defined device
   * identifier.
   * </pre>
   *
   * <code>string device_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The deviceId.
   */
  @java.lang.Override
  public java.lang.String getDeviceId() {
    java.lang.Object ref = deviceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The device to associate with the specified gateway. The value of
   * `device_id` can be either the device numeric ID or the user-defined device
   * identifier.
   * </pre>
   *
   * <code>string device_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for deviceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDeviceIdBytes() {
    java.lang.Object ref = deviceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      deviceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gatewayId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gatewayId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deviceId_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(gatewayId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gatewayId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, deviceId_);
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
    if (!(obj instanceof com.google.cloud.iot.v1.BindDeviceToGatewayRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.BindDeviceToGatewayRequest other =
        (com.google.cloud.iot.v1.BindDeviceToGatewayRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getGatewayId().equals(other.getGatewayId())) return false;
    if (!getDeviceId().equals(other.getDeviceId())) return false;
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
    hash = (37 * hash) + GATEWAY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGatewayId().hashCode();
    hash = (37 * hash) + DEVICE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.BindDeviceToGatewayRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.BindDeviceToGatewayRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.BindDeviceToGatewayRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.BindDeviceToGatewayRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.BindDeviceToGatewayRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.BindDeviceToGatewayRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.BindDeviceToGatewayRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.BindDeviceToGatewayRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.BindDeviceToGatewayRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.BindDeviceToGatewayRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.BindDeviceToGatewayRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.BindDeviceToGatewayRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.iot.v1.BindDeviceToGatewayRequest prototype) {
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
   * Request for `BindDeviceToGateway`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.BindDeviceToGatewayRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.BindDeviceToGatewayRequest)
      com.google.cloud.iot.v1.BindDeviceToGatewayRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_BindDeviceToGatewayRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_BindDeviceToGatewayRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.BindDeviceToGatewayRequest.class,
              com.google.cloud.iot.v1.BindDeviceToGatewayRequest.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.BindDeviceToGatewayRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      gatewayId_ = "";
      deviceId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_BindDeviceToGatewayRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.BindDeviceToGatewayRequest getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.BindDeviceToGatewayRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.BindDeviceToGatewayRequest build() {
      com.google.cloud.iot.v1.BindDeviceToGatewayRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.BindDeviceToGatewayRequest buildPartial() {
      com.google.cloud.iot.v1.BindDeviceToGatewayRequest result =
          new com.google.cloud.iot.v1.BindDeviceToGatewayRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.iot.v1.BindDeviceToGatewayRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.gatewayId_ = gatewayId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.deviceId_ = deviceId_;
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
      if (other instanceof com.google.cloud.iot.v1.BindDeviceToGatewayRequest) {
        return mergeFrom((com.google.cloud.iot.v1.BindDeviceToGatewayRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.BindDeviceToGatewayRequest other) {
      if (other == com.google.cloud.iot.v1.BindDeviceToGatewayRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getGatewayId().isEmpty()) {
        gatewayId_ = other.gatewayId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDeviceId().isEmpty()) {
        deviceId_ = other.deviceId_;
        bitField0_ |= 0x00000004;
        onChanged();
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
                gatewayId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                deviceId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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
     * Required. The name of the registry. For example,
     * `projects/example-project/locations/us-central1/registries/my-registry`.
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
     * Required. The name of the registry. For example,
     * `projects/example-project/locations/us-central1/registries/my-registry`.
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
     * Required. The name of the registry. For example,
     * `projects/example-project/locations/us-central1/registries/my-registry`.
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
     * Required. The name of the registry. For example,
     * `projects/example-project/locations/us-central1/registries/my-registry`.
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
     * Required. The name of the registry. For example,
     * `projects/example-project/locations/us-central1/registries/my-registry`.
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

    private java.lang.Object gatewayId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The value of `gateway_id` can be either the device numeric ID or the
     * user-defined device identifier.
     * </pre>
     *
     * <code>string gateway_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The gatewayId.
     */
    public java.lang.String getGatewayId() {
      java.lang.Object ref = gatewayId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gatewayId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The value of `gateway_id` can be either the device numeric ID or the
     * user-defined device identifier.
     * </pre>
     *
     * <code>string gateway_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for gatewayId.
     */
    public com.google.protobuf.ByteString getGatewayIdBytes() {
      java.lang.Object ref = gatewayId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        gatewayId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The value of `gateway_id` can be either the device numeric ID or the
     * user-defined device identifier.
     * </pre>
     *
     * <code>string gateway_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The gatewayId to set.
     * @return This builder for chaining.
     */
    public Builder setGatewayId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      gatewayId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The value of `gateway_id` can be either the device numeric ID or the
     * user-defined device identifier.
     * </pre>
     *
     * <code>string gateway_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGatewayId() {
      gatewayId_ = getDefaultInstance().getGatewayId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The value of `gateway_id` can be either the device numeric ID or the
     * user-defined device identifier.
     * </pre>
     *
     * <code>string gateway_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for gatewayId to set.
     * @return This builder for chaining.
     */
    public Builder setGatewayIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      gatewayId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object deviceId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The device to associate with the specified gateway. The value of
     * `device_id` can be either the device numeric ID or the user-defined device
     * identifier.
     * </pre>
     *
     * <code>string device_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The deviceId.
     */
    public java.lang.String getDeviceId() {
      java.lang.Object ref = deviceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The device to associate with the specified gateway. The value of
     * `device_id` can be either the device numeric ID or the user-defined device
     * identifier.
     * </pre>
     *
     * <code>string device_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for deviceId.
     */
    public com.google.protobuf.ByteString getDeviceIdBytes() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        deviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The device to associate with the specified gateway. The value of
     * `device_id` can be either the device numeric ID or the user-defined device
     * identifier.
     * </pre>
     *
     * <code>string device_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      deviceId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The device to associate with the specified gateway. The value of
     * `device_id` can be either the device numeric ID or the user-defined device
     * identifier.
     * </pre>
     *
     * <code>string device_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeviceId() {
      deviceId_ = getDefaultInstance().getDeviceId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The device to associate with the specified gateway. The value of
     * `device_id` can be either the device numeric ID or the user-defined device
     * identifier.
     * </pre>
     *
     * <code>string device_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      deviceId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
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

    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.BindDeviceToGatewayRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.BindDeviceToGatewayRequest)
  private static final com.google.cloud.iot.v1.BindDeviceToGatewayRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.BindDeviceToGatewayRequest();
  }

  public static com.google.cloud.iot.v1.BindDeviceToGatewayRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BindDeviceToGatewayRequest> PARSER =
      new com.google.protobuf.AbstractParser<BindDeviceToGatewayRequest>() {
        @java.lang.Override
        public BindDeviceToGatewayRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BindDeviceToGatewayRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BindDeviceToGatewayRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.BindDeviceToGatewayRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
