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
// source: google/cloud/filestore/v1beta1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1beta1;

/**
 *
 *
 * <pre>
 * CreateShareRequest creates a share.
 * </pre>
 *
 * Protobuf type {@code google.cloud.filestore.v1beta1.CreateShareRequest}
 */
public final class CreateShareRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.filestore.v1beta1.CreateShareRequest)
    CreateShareRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateShareRequest.newBuilder() to construct.
  private CreateShareRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateShareRequest() {
    parent_ = "";
    shareId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateShareRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
        .internal_static_google_cloud_filestore_v1beta1_CreateShareRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
        .internal_static_google_cloud_filestore_v1beta1_CreateShareRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.filestore.v1beta1.CreateShareRequest.class,
            com.google.cloud.filestore.v1beta1.CreateShareRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The Filestore Instance to create the share for, in the format
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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
   * Required. The Filestore Instance to create the share for, in the format
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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

  public static final int SHARE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object shareId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the share.
   * The ID must be unique within the specified instance.
   *
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string share_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The shareId.
   */
  @java.lang.Override
  public java.lang.String getShareId() {
    java.lang.Object ref = shareId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shareId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the share.
   * The ID must be unique within the specified instance.
   *
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string share_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for shareId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getShareIdBytes() {
    java.lang.Object ref = shareId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      shareId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHARE_FIELD_NUMBER = 3;
  private com.google.cloud.filestore.v1beta1.Share share_;
  /**
   *
   *
   * <pre>
   * Required. A share resource
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Share share = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the share field is set.
   */
  @java.lang.Override
  public boolean hasShare() {
    return share_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. A share resource
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Share share = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The share.
   */
  @java.lang.Override
  public com.google.cloud.filestore.v1beta1.Share getShare() {
    return share_ == null ? com.google.cloud.filestore.v1beta1.Share.getDefaultInstance() : share_;
  }
  /**
   *
   *
   * <pre>
   * Required. A share resource
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Share share = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.filestore.v1beta1.ShareOrBuilder getShareOrBuilder() {
    return share_ == null ? com.google.cloud.filestore.v1beta1.Share.getDefaultInstance() : share_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, shareId_);
    }
    if (share_ != null) {
      output.writeMessage(3, getShare());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shareId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, shareId_);
    }
    if (share_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getShare());
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
    if (!(obj instanceof com.google.cloud.filestore.v1beta1.CreateShareRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.filestore.v1beta1.CreateShareRequest other =
        (com.google.cloud.filestore.v1beta1.CreateShareRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getShareId().equals(other.getShareId())) return false;
    if (hasShare() != other.hasShare()) return false;
    if (hasShare()) {
      if (!getShare().equals(other.getShare())) return false;
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
    hash = (37 * hash) + SHARE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getShareId().hashCode();
    if (hasShare()) {
      hash = (37 * hash) + SHARE_FIELD_NUMBER;
      hash = (53 * hash) + getShare().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.filestore.v1beta1.CreateShareRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.filestore.v1beta1.CreateShareRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.CreateShareRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.filestore.v1beta1.CreateShareRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.CreateShareRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.filestore.v1beta1.CreateShareRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.CreateShareRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.filestore.v1beta1.CreateShareRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.CreateShareRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.filestore.v1beta1.CreateShareRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.filestore.v1beta1.CreateShareRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.filestore.v1beta1.CreateShareRequest parseFrom(
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
      com.google.cloud.filestore.v1beta1.CreateShareRequest prototype) {
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
   * CreateShareRequest creates a share.
   * </pre>
   *
   * Protobuf type {@code google.cloud.filestore.v1beta1.CreateShareRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.filestore.v1beta1.CreateShareRequest)
      com.google.cloud.filestore.v1beta1.CreateShareRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
          .internal_static_google_cloud_filestore_v1beta1_CreateShareRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
          .internal_static_google_cloud_filestore_v1beta1_CreateShareRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.filestore.v1beta1.CreateShareRequest.class,
              com.google.cloud.filestore.v1beta1.CreateShareRequest.Builder.class);
    }

    // Construct using com.google.cloud.filestore.v1beta1.CreateShareRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      shareId_ = "";
      share_ = null;
      if (shareBuilder_ != null) {
        shareBuilder_.dispose();
        shareBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.filestore.v1beta1.CloudFilestoreServiceProto
          .internal_static_google_cloud_filestore_v1beta1_CreateShareRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1beta1.CreateShareRequest getDefaultInstanceForType() {
      return com.google.cloud.filestore.v1beta1.CreateShareRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1beta1.CreateShareRequest build() {
      com.google.cloud.filestore.v1beta1.CreateShareRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.filestore.v1beta1.CreateShareRequest buildPartial() {
      com.google.cloud.filestore.v1beta1.CreateShareRequest result =
          new com.google.cloud.filestore.v1beta1.CreateShareRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.filestore.v1beta1.CreateShareRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.shareId_ = shareId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.share_ = shareBuilder_ == null ? share_ : shareBuilder_.build();
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
      if (other instanceof com.google.cloud.filestore.v1beta1.CreateShareRequest) {
        return mergeFrom((com.google.cloud.filestore.v1beta1.CreateShareRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.filestore.v1beta1.CreateShareRequest other) {
      if (other == com.google.cloud.filestore.v1beta1.CreateShareRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getShareId().isEmpty()) {
        shareId_ = other.shareId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasShare()) {
        mergeShare(other.getShare());
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
                shareId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getShareFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The Filestore Instance to create the share for, in the format
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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
     * Required. The Filestore Instance to create the share for, in the format
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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
     * Required. The Filestore Instance to create the share for, in the format
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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
     * Required. The Filestore Instance to create the share for, in the format
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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
     * Required. The Filestore Instance to create the share for, in the format
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
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

    private java.lang.Object shareId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the share.
     * The ID must be unique within the specified instance.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string share_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The shareId.
     */
    public java.lang.String getShareId() {
      java.lang.Object ref = shareId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shareId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the share.
     * The ID must be unique within the specified instance.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string share_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for shareId.
     */
    public com.google.protobuf.ByteString getShareIdBytes() {
      java.lang.Object ref = shareId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        shareId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the share.
     * The ID must be unique within the specified instance.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string share_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The shareId to set.
     * @return This builder for chaining.
     */
    public Builder setShareId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      shareId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the share.
     * The ID must be unique within the specified instance.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string share_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearShareId() {
      shareId_ = getDefaultInstance().getShareId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the share.
     * The ID must be unique within the specified instance.
     *
     * This value must start with a lowercase letter followed by up to 62
     * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
     * </pre>
     *
     * <code>string share_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for shareId to set.
     * @return This builder for chaining.
     */
    public Builder setShareIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      shareId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.filestore.v1beta1.Share share_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.filestore.v1beta1.Share,
            com.google.cloud.filestore.v1beta1.Share.Builder,
            com.google.cloud.filestore.v1beta1.ShareOrBuilder>
        shareBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A share resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Share share = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the share field is set.
     */
    public boolean hasShare() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. A share resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Share share = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The share.
     */
    public com.google.cloud.filestore.v1beta1.Share getShare() {
      if (shareBuilder_ == null) {
        return share_ == null
            ? com.google.cloud.filestore.v1beta1.Share.getDefaultInstance()
            : share_;
      } else {
        return shareBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A share resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Share share = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setShare(com.google.cloud.filestore.v1beta1.Share value) {
      if (shareBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        share_ = value;
      } else {
        shareBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A share resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Share share = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setShare(com.google.cloud.filestore.v1beta1.Share.Builder builderForValue) {
      if (shareBuilder_ == null) {
        share_ = builderForValue.build();
      } else {
        shareBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A share resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Share share = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeShare(com.google.cloud.filestore.v1beta1.Share value) {
      if (shareBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && share_ != null
            && share_ != com.google.cloud.filestore.v1beta1.Share.getDefaultInstance()) {
          getShareBuilder().mergeFrom(value);
        } else {
          share_ = value;
        }
      } else {
        shareBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A share resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Share share = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearShare() {
      bitField0_ = (bitField0_ & ~0x00000004);
      share_ = null;
      if (shareBuilder_ != null) {
        shareBuilder_.dispose();
        shareBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A share resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Share share = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.filestore.v1beta1.Share.Builder getShareBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getShareFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A share resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Share share = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.filestore.v1beta1.ShareOrBuilder getShareOrBuilder() {
      if (shareBuilder_ != null) {
        return shareBuilder_.getMessageOrBuilder();
      } else {
        return share_ == null
            ? com.google.cloud.filestore.v1beta1.Share.getDefaultInstance()
            : share_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A share resource
     * </pre>
     *
     * <code>
     * .google.cloud.filestore.v1beta1.Share share = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.filestore.v1beta1.Share,
            com.google.cloud.filestore.v1beta1.Share.Builder,
            com.google.cloud.filestore.v1beta1.ShareOrBuilder>
        getShareFieldBuilder() {
      if (shareBuilder_ == null) {
        shareBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.filestore.v1beta1.Share,
                com.google.cloud.filestore.v1beta1.Share.Builder,
                com.google.cloud.filestore.v1beta1.ShareOrBuilder>(
                getShare(), getParentForChildren(), isClean());
        share_ = null;
      }
      return shareBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.filestore.v1beta1.CreateShareRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.filestore.v1beta1.CreateShareRequest)
  private static final com.google.cloud.filestore.v1beta1.CreateShareRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.filestore.v1beta1.CreateShareRequest();
  }

  public static com.google.cloud.filestore.v1beta1.CreateShareRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateShareRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateShareRequest>() {
        @java.lang.Override
        public CreateShareRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateShareRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateShareRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.filestore.v1beta1.CreateShareRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
