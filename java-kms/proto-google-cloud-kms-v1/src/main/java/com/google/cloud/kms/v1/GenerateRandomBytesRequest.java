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
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [KeyManagementService.GenerateRandomBytes][google.cloud.kms.v1.KeyManagementService.GenerateRandomBytes].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.GenerateRandomBytesRequest}
 */
public final class GenerateRandomBytesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.GenerateRandomBytesRequest)
    GenerateRandomBytesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GenerateRandomBytesRequest.newBuilder() to construct.
  private GenerateRandomBytesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerateRandomBytesRequest() {
    location_ = "";
    protectionLevel_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenerateRandomBytesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_GenerateRandomBytesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_GenerateRandomBytesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.GenerateRandomBytesRequest.class,
            com.google.cloud.kms.v1.GenerateRandomBytesRequest.Builder.class);
  }

  public static final int LOCATION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object location_ = "";
  /**
   *
   *
   * <pre>
   * The project-specific location in which to generate random bytes.
   * For example, "projects/my-project/locations/us-central1".
   * </pre>
   *
   * <code>string location = 1;</code>
   *
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The project-specific location in which to generate random bytes.
   * For example, "projects/my-project/locations/us-central1".
   * </pre>
   *
   * <code>string location = 1;</code>
   *
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LENGTH_BYTES_FIELD_NUMBER = 2;
  private int lengthBytes_ = 0;
  /**
   *
   *
   * <pre>
   * The length in bytes of the amount of randomness to retrieve.  Minimum 8
   * bytes, maximum 1024 bytes.
   * </pre>
   *
   * <code>int32 length_bytes = 2;</code>
   *
   * @return The lengthBytes.
   */
  @java.lang.Override
  public int getLengthBytes() {
    return lengthBytes_;
  }

  public static final int PROTECTION_LEVEL_FIELD_NUMBER = 3;
  private int protectionLevel_ = 0;
  /**
   *
   *
   * <pre>
   * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when
   * generating the random data. Currently, only
   * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] protection level is
   * supported.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 3;</code>
   *
   * @return The enum numeric value on the wire for protectionLevel.
   */
  @java.lang.Override
  public int getProtectionLevelValue() {
    return protectionLevel_;
  }
  /**
   *
   *
   * <pre>
   * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when
   * generating the random data. Currently, only
   * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] protection level is
   * supported.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 3;</code>
   *
   * @return The protectionLevel.
   */
  @java.lang.Override
  public com.google.cloud.kms.v1.ProtectionLevel getProtectionLevel() {
    com.google.cloud.kms.v1.ProtectionLevel result =
        com.google.cloud.kms.v1.ProtectionLevel.forNumber(protectionLevel_);
    return result == null ? com.google.cloud.kms.v1.ProtectionLevel.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, location_);
    }
    if (lengthBytes_ != 0) {
      output.writeInt32(2, lengthBytes_);
    }
    if (protectionLevel_
        != com.google.cloud.kms.v1.ProtectionLevel.PROTECTION_LEVEL_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, protectionLevel_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, location_);
    }
    if (lengthBytes_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, lengthBytes_);
    }
    if (protectionLevel_
        != com.google.cloud.kms.v1.ProtectionLevel.PROTECTION_LEVEL_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, protectionLevel_);
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
    if (!(obj instanceof com.google.cloud.kms.v1.GenerateRandomBytesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.GenerateRandomBytesRequest other =
        (com.google.cloud.kms.v1.GenerateRandomBytesRequest) obj;

    if (!getLocation().equals(other.getLocation())) return false;
    if (getLengthBytes() != other.getLengthBytes()) return false;
    if (protectionLevel_ != other.protectionLevel_) return false;
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
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + LENGTH_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + getLengthBytes();
    hash = (37 * hash) + PROTECTION_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + protectionLevel_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.kms.v1.GenerateRandomBytesRequest prototype) {
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
   * [KeyManagementService.GenerateRandomBytes][google.cloud.kms.v1.KeyManagementService.GenerateRandomBytes].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.GenerateRandomBytesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.GenerateRandomBytesRequest)
      com.google.cloud.kms.v1.GenerateRandomBytesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_GenerateRandomBytesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_GenerateRandomBytesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.GenerateRandomBytesRequest.class,
              com.google.cloud.kms.v1.GenerateRandomBytesRequest.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.GenerateRandomBytesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      location_ = "";
      lengthBytes_ = 0;
      protectionLevel_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_GenerateRandomBytesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.GenerateRandomBytesRequest getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.GenerateRandomBytesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.GenerateRandomBytesRequest build() {
      com.google.cloud.kms.v1.GenerateRandomBytesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.GenerateRandomBytesRequest buildPartial() {
      com.google.cloud.kms.v1.GenerateRandomBytesRequest result =
          new com.google.cloud.kms.v1.GenerateRandomBytesRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.kms.v1.GenerateRandomBytesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.location_ = location_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.lengthBytes_ = lengthBytes_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.protectionLevel_ = protectionLevel_;
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
      if (other instanceof com.google.cloud.kms.v1.GenerateRandomBytesRequest) {
        return mergeFrom((com.google.cloud.kms.v1.GenerateRandomBytesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.GenerateRandomBytesRequest other) {
      if (other == com.google.cloud.kms.v1.GenerateRandomBytesRequest.getDefaultInstance())
        return this;
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getLengthBytes() != 0) {
        setLengthBytes(other.getLengthBytes());
      }
      if (other.protectionLevel_ != 0) {
        setProtectionLevelValue(other.getProtectionLevelValue());
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
                location_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                lengthBytes_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                protectionLevel_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object location_ = "";
    /**
     *
     *
     * <pre>
     * The project-specific location in which to generate random bytes.
     * For example, "projects/my-project/locations/us-central1".
     * </pre>
     *
     * <code>string location = 1;</code>
     *
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The project-specific location in which to generate random bytes.
     * For example, "projects/my-project/locations/us-central1".
     * </pre>
     *
     * <code>string location = 1;</code>
     *
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The project-specific location in which to generate random bytes.
     * For example, "projects/my-project/locations/us-central1".
     * </pre>
     *
     * <code>string location = 1;</code>
     *
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      location_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The project-specific location in which to generate random bytes.
     * For example, "projects/my-project/locations/us-central1".
     * </pre>
     *
     * <code>string location = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      location_ = getDefaultInstance().getLocation();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The project-specific location in which to generate random bytes.
     * For example, "projects/my-project/locations/us-central1".
     * </pre>
     *
     * <code>string location = 1;</code>
     *
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      location_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int lengthBytes_;
    /**
     *
     *
     * <pre>
     * The length in bytes of the amount of randomness to retrieve.  Minimum 8
     * bytes, maximum 1024 bytes.
     * </pre>
     *
     * <code>int32 length_bytes = 2;</code>
     *
     * @return The lengthBytes.
     */
    @java.lang.Override
    public int getLengthBytes() {
      return lengthBytes_;
    }
    /**
     *
     *
     * <pre>
     * The length in bytes of the amount of randomness to retrieve.  Minimum 8
     * bytes, maximum 1024 bytes.
     * </pre>
     *
     * <code>int32 length_bytes = 2;</code>
     *
     * @param value The lengthBytes to set.
     * @return This builder for chaining.
     */
    public Builder setLengthBytes(int value) {

      lengthBytes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The length in bytes of the amount of randomness to retrieve.  Minimum 8
     * bytes, maximum 1024 bytes.
     * </pre>
     *
     * <code>int32 length_bytes = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLengthBytes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      lengthBytes_ = 0;
      onChanged();
      return this;
    }

    private int protectionLevel_ = 0;
    /**
     *
     *
     * <pre>
     * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when
     * generating the random data. Currently, only
     * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] protection level is
     * supported.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 3;</code>
     *
     * @return The enum numeric value on the wire for protectionLevel.
     */
    @java.lang.Override
    public int getProtectionLevelValue() {
      return protectionLevel_;
    }
    /**
     *
     *
     * <pre>
     * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when
     * generating the random data. Currently, only
     * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] protection level is
     * supported.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 3;</code>
     *
     * @param value The enum numeric value on the wire for protectionLevel to set.
     * @return This builder for chaining.
     */
    public Builder setProtectionLevelValue(int value) {
      protectionLevel_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when
     * generating the random data. Currently, only
     * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] protection level is
     * supported.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 3;</code>
     *
     * @return The protectionLevel.
     */
    @java.lang.Override
    public com.google.cloud.kms.v1.ProtectionLevel getProtectionLevel() {
      com.google.cloud.kms.v1.ProtectionLevel result =
          com.google.cloud.kms.v1.ProtectionLevel.forNumber(protectionLevel_);
      return result == null ? com.google.cloud.kms.v1.ProtectionLevel.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when
     * generating the random data. Currently, only
     * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] protection level is
     * supported.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 3;</code>
     *
     * @param value The protectionLevel to set.
     * @return This builder for chaining.
     */
    public Builder setProtectionLevel(com.google.cloud.kms.v1.ProtectionLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      protectionLevel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The [ProtectionLevel][google.cloud.kms.v1.ProtectionLevel] to use when
     * generating the random data. Currently, only
     * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] protection level is
     * supported.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.ProtectionLevel protection_level = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProtectionLevel() {
      bitField0_ = (bitField0_ & ~0x00000004);
      protectionLevel_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.GenerateRandomBytesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.GenerateRandomBytesRequest)
  private static final com.google.cloud.kms.v1.GenerateRandomBytesRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.GenerateRandomBytesRequest();
  }

  public static com.google.cloud.kms.v1.GenerateRandomBytesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateRandomBytesRequest> PARSER =
      new com.google.protobuf.AbstractParser<GenerateRandomBytesRequest>() {
        @java.lang.Override
        public GenerateRandomBytesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateRandomBytesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateRandomBytesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.GenerateRandomBytesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
