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
 * Cloud KMS metadata for the given
 * [google.cloud.location.Location][google.cloud.location.Location].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.LocationMetadata}
 */
public final class LocationMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.LocationMetadata)
    LocationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LocationMetadata.newBuilder() to construct.
  private LocationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LocationMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LocationMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_LocationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_LocationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.LocationMetadata.class,
            com.google.cloud.kms.v1.LocationMetadata.Builder.class);
  }

  public static final int HSM_AVAILABLE_FIELD_NUMBER = 1;
  private boolean hsmAvailable_ = false;
  /**
   *
   *
   * <pre>
   * Indicates whether [CryptoKeys][google.cloud.kms.v1.CryptoKey] with
   * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level]
   * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] can be created in this
   * location.
   * </pre>
   *
   * <code>bool hsm_available = 1;</code>
   *
   * @return The hsmAvailable.
   */
  @java.lang.Override
  public boolean getHsmAvailable() {
    return hsmAvailable_;
  }

  public static final int EKM_AVAILABLE_FIELD_NUMBER = 2;
  private boolean ekmAvailable_ = false;
  /**
   *
   *
   * <pre>
   * Indicates whether [CryptoKeys][google.cloud.kms.v1.CryptoKey] with
   * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level]
   * [EXTERNAL][google.cloud.kms.v1.ProtectionLevel.EXTERNAL] can be created in
   * this location.
   * </pre>
   *
   * <code>bool ekm_available = 2;</code>
   *
   * @return The ekmAvailable.
   */
  @java.lang.Override
  public boolean getEkmAvailable() {
    return ekmAvailable_;
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
    if (hsmAvailable_ != false) {
      output.writeBool(1, hsmAvailable_);
    }
    if (ekmAvailable_ != false) {
      output.writeBool(2, ekmAvailable_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hsmAvailable_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, hsmAvailable_);
    }
    if (ekmAvailable_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, ekmAvailable_);
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
    if (!(obj instanceof com.google.cloud.kms.v1.LocationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.LocationMetadata other = (com.google.cloud.kms.v1.LocationMetadata) obj;

    if (getHsmAvailable() != other.getHsmAvailable()) return false;
    if (getEkmAvailable() != other.getEkmAvailable()) return false;
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
    hash = (37 * hash) + HSM_AVAILABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getHsmAvailable());
    hash = (37 * hash) + EKM_AVAILABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEkmAvailable());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.LocationMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.LocationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.LocationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.LocationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.LocationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.LocationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.LocationMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.LocationMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.LocationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.LocationMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.kms.v1.LocationMetadata prototype) {
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
   * Cloud KMS metadata for the given
   * [google.cloud.location.Location][google.cloud.location.Location].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.LocationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.LocationMetadata)
      com.google.cloud.kms.v1.LocationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_LocationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_LocationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.LocationMetadata.class,
              com.google.cloud.kms.v1.LocationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.LocationMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      hsmAvailable_ = false;
      ekmAvailable_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_LocationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.LocationMetadata getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.LocationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.LocationMetadata build() {
      com.google.cloud.kms.v1.LocationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.LocationMetadata buildPartial() {
      com.google.cloud.kms.v1.LocationMetadata result =
          new com.google.cloud.kms.v1.LocationMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.kms.v1.LocationMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hsmAvailable_ = hsmAvailable_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ekmAvailable_ = ekmAvailable_;
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
      if (other instanceof com.google.cloud.kms.v1.LocationMetadata) {
        return mergeFrom((com.google.cloud.kms.v1.LocationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.LocationMetadata other) {
      if (other == com.google.cloud.kms.v1.LocationMetadata.getDefaultInstance()) return this;
      if (other.getHsmAvailable() != false) {
        setHsmAvailable(other.getHsmAvailable());
      }
      if (other.getEkmAvailable() != false) {
        setEkmAvailable(other.getEkmAvailable());
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
                hsmAvailable_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                ekmAvailable_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private boolean hsmAvailable_;
    /**
     *
     *
     * <pre>
     * Indicates whether [CryptoKeys][google.cloud.kms.v1.CryptoKey] with
     * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level]
     * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] can be created in this
     * location.
     * </pre>
     *
     * <code>bool hsm_available = 1;</code>
     *
     * @return The hsmAvailable.
     */
    @java.lang.Override
    public boolean getHsmAvailable() {
      return hsmAvailable_;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether [CryptoKeys][google.cloud.kms.v1.CryptoKey] with
     * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level]
     * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] can be created in this
     * location.
     * </pre>
     *
     * <code>bool hsm_available = 1;</code>
     *
     * @param value The hsmAvailable to set.
     * @return This builder for chaining.
     */
    public Builder setHsmAvailable(boolean value) {

      hsmAvailable_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether [CryptoKeys][google.cloud.kms.v1.CryptoKey] with
     * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level]
     * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] can be created in this
     * location.
     * </pre>
     *
     * <code>bool hsm_available = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHsmAvailable() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hsmAvailable_ = false;
      onChanged();
      return this;
    }

    private boolean ekmAvailable_;
    /**
     *
     *
     * <pre>
     * Indicates whether [CryptoKeys][google.cloud.kms.v1.CryptoKey] with
     * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level]
     * [EXTERNAL][google.cloud.kms.v1.ProtectionLevel.EXTERNAL] can be created in
     * this location.
     * </pre>
     *
     * <code>bool ekm_available = 2;</code>
     *
     * @return The ekmAvailable.
     */
    @java.lang.Override
    public boolean getEkmAvailable() {
      return ekmAvailable_;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether [CryptoKeys][google.cloud.kms.v1.CryptoKey] with
     * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level]
     * [EXTERNAL][google.cloud.kms.v1.ProtectionLevel.EXTERNAL] can be created in
     * this location.
     * </pre>
     *
     * <code>bool ekm_available = 2;</code>
     *
     * @param value The ekmAvailable to set.
     * @return This builder for chaining.
     */
    public Builder setEkmAvailable(boolean value) {

      ekmAvailable_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates whether [CryptoKeys][google.cloud.kms.v1.CryptoKey] with
     * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level]
     * [EXTERNAL][google.cloud.kms.v1.ProtectionLevel.EXTERNAL] can be created in
     * this location.
     * </pre>
     *
     * <code>bool ekm_available = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEkmAvailable() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ekmAvailable_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.LocationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.LocationMetadata)
  private static final com.google.cloud.kms.v1.LocationMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.LocationMetadata();
  }

  public static com.google.cloud.kms.v1.LocationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<LocationMetadata>() {
        @java.lang.Override
        public LocationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<LocationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.LocationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
