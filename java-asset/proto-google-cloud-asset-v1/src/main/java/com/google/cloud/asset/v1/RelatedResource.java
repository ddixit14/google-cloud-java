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
// source: google/cloud/asset/v1/assets.proto

package com.google.cloud.asset.v1;

/**
 *
 *
 * <pre>
 * The detailed related resource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.RelatedResource}
 */
public final class RelatedResource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.RelatedResource)
    RelatedResourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RelatedResource.newBuilder() to construct.
  private RelatedResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RelatedResource() {
    assetType_ = "";
    fullResourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RelatedResource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetProto
        .internal_static_google_cloud_asset_v1_RelatedResource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetProto
        .internal_static_google_cloud_asset_v1_RelatedResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.RelatedResource.class,
            com.google.cloud.asset.v1.RelatedResource.Builder.class);
  }

  public static final int ASSET_TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object assetType_ = "";
  /**
   *
   *
   * <pre>
   * The type of the asset. Example: `compute.googleapis.com/Instance`
   * </pre>
   *
   * <code>string asset_type = 1;</code>
   *
   * @return The assetType.
   */
  @java.lang.Override
  public java.lang.String getAssetType() {
    java.lang.Object ref = assetType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The type of the asset. Example: `compute.googleapis.com/Instance`
   * </pre>
   *
   * <code>string asset_type = 1;</code>
   *
   * @return The bytes for assetType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAssetTypeBytes() {
    java.lang.Object ref = assetType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      assetType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FULL_RESOURCE_NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object fullResourceName_ = "";
  /**
   *
   *
   * <pre>
   * The full resource name of the related resource. Example:
   * `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
   * </pre>
   *
   * <code>string full_resource_name = 2;</code>
   *
   * @return The fullResourceName.
   */
  @java.lang.Override
  public java.lang.String getFullResourceName() {
    java.lang.Object ref = fullResourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fullResourceName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The full resource name of the related resource. Example:
   * `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
   * </pre>
   *
   * <code>string full_resource_name = 2;</code>
   *
   * @return The bytes for fullResourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFullResourceNameBytes() {
    java.lang.Object ref = fullResourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      fullResourceName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, assetType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fullResourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fullResourceName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, assetType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fullResourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fullResourceName_);
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
    if (!(obj instanceof com.google.cloud.asset.v1.RelatedResource)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.RelatedResource other =
        (com.google.cloud.asset.v1.RelatedResource) obj;

    if (!getAssetType().equals(other.getAssetType())) return false;
    if (!getFullResourceName().equals(other.getFullResourceName())) return false;
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
    hash = (37 * hash) + ASSET_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getAssetType().hashCode();
    hash = (37 * hash) + FULL_RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFullResourceName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.RelatedResource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.RelatedResource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.RelatedResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.RelatedResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.RelatedResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.RelatedResource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.RelatedResource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.RelatedResource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.RelatedResource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.RelatedResource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.RelatedResource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.RelatedResource parseFrom(
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

  public static Builder newBuilder(com.google.cloud.asset.v1.RelatedResource prototype) {
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
   * The detailed related resource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.RelatedResource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.RelatedResource)
      com.google.cloud.asset.v1.RelatedResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_RelatedResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_RelatedResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.RelatedResource.class,
              com.google.cloud.asset.v1.RelatedResource.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.RelatedResource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      assetType_ = "";
      fullResourceName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetProto
          .internal_static_google_cloud_asset_v1_RelatedResource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.RelatedResource getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.RelatedResource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.RelatedResource build() {
      com.google.cloud.asset.v1.RelatedResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.RelatedResource buildPartial() {
      com.google.cloud.asset.v1.RelatedResource result =
          new com.google.cloud.asset.v1.RelatedResource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.asset.v1.RelatedResource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.assetType_ = assetType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fullResourceName_ = fullResourceName_;
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
      if (other instanceof com.google.cloud.asset.v1.RelatedResource) {
        return mergeFrom((com.google.cloud.asset.v1.RelatedResource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.RelatedResource other) {
      if (other == com.google.cloud.asset.v1.RelatedResource.getDefaultInstance()) return this;
      if (!other.getAssetType().isEmpty()) {
        assetType_ = other.assetType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFullResourceName().isEmpty()) {
        fullResourceName_ = other.fullResourceName_;
        bitField0_ |= 0x00000002;
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
                assetType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                fullResourceName_ = input.readStringRequireUtf8();
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

    private java.lang.Object assetType_ = "";
    /**
     *
     *
     * <pre>
     * The type of the asset. Example: `compute.googleapis.com/Instance`
     * </pre>
     *
     * <code>string asset_type = 1;</code>
     *
     * @return The assetType.
     */
    public java.lang.String getAssetType() {
      java.lang.Object ref = assetType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The type of the asset. Example: `compute.googleapis.com/Instance`
     * </pre>
     *
     * <code>string asset_type = 1;</code>
     *
     * @return The bytes for assetType.
     */
    public com.google.protobuf.ByteString getAssetTypeBytes() {
      java.lang.Object ref = assetType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        assetType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The type of the asset. Example: `compute.googleapis.com/Instance`
     * </pre>
     *
     * <code>string asset_type = 1;</code>
     *
     * @param value The assetType to set.
     * @return This builder for chaining.
     */
    public Builder setAssetType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      assetType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of the asset. Example: `compute.googleapis.com/Instance`
     * </pre>
     *
     * <code>string asset_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAssetType() {
      assetType_ = getDefaultInstance().getAssetType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of the asset. Example: `compute.googleapis.com/Instance`
     * </pre>
     *
     * <code>string asset_type = 1;</code>
     *
     * @param value The bytes for assetType to set.
     * @return This builder for chaining.
     */
    public Builder setAssetTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      assetType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object fullResourceName_ = "";
    /**
     *
     *
     * <pre>
     * The full resource name of the related resource. Example:
     * `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
     * </pre>
     *
     * <code>string full_resource_name = 2;</code>
     *
     * @return The fullResourceName.
     */
    public java.lang.String getFullResourceName() {
      java.lang.Object ref = fullResourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fullResourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The full resource name of the related resource. Example:
     * `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
     * </pre>
     *
     * <code>string full_resource_name = 2;</code>
     *
     * @return The bytes for fullResourceName.
     */
    public com.google.protobuf.ByteString getFullResourceNameBytes() {
      java.lang.Object ref = fullResourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        fullResourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The full resource name of the related resource. Example:
     * `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
     * </pre>
     *
     * <code>string full_resource_name = 2;</code>
     *
     * @param value The fullResourceName to set.
     * @return This builder for chaining.
     */
    public Builder setFullResourceName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      fullResourceName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The full resource name of the related resource. Example:
     * `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
     * </pre>
     *
     * <code>string full_resource_name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFullResourceName() {
      fullResourceName_ = getDefaultInstance().getFullResourceName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The full resource name of the related resource. Example:
     * `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123`
     * </pre>
     *
     * <code>string full_resource_name = 2;</code>
     *
     * @param value The bytes for fullResourceName to set.
     * @return This builder for chaining.
     */
    public Builder setFullResourceNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      fullResourceName_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.RelatedResource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.RelatedResource)
  private static final com.google.cloud.asset.v1.RelatedResource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.RelatedResource();
  }

  public static com.google.cloud.asset.v1.RelatedResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelatedResource> PARSER =
      new com.google.protobuf.AbstractParser<RelatedResource>() {
        @java.lang.Override
        public RelatedResource parsePartialFrom(
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

  public static com.google.protobuf.Parser<RelatedResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelatedResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.RelatedResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
