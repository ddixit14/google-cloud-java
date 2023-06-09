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
// source: google/cloud/gaming/v1/game_server_clusters.proto

package com.google.cloud.gaming.v1;

/**
 *
 *
 * <pre>
 * Request message for GameServerClustersService.PreviewDeleteGameServerCluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest}
 */
public final class PreviewDeleteGameServerClusterRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest)
    PreviewDeleteGameServerClusterRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PreviewDeleteGameServerClusterRequest.newBuilder() to construct.
  private PreviewDeleteGameServerClusterRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PreviewDeleteGameServerClusterRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PreviewDeleteGameServerClusterRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gaming.v1.GameServerClusters
        .internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1.GameServerClusters
        .internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest.class,
            com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the game server cluster to delete, in the following form:
   * `projects/{project}/locations/{location}/gameServerClusters/{cluster}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the game server cluster to delete, in the following form:
   * `projects/{project}/locations/{location}/gameServerClusters/{cluster}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREVIEW_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp previewTime_;
  /**
   *
   *
   * <pre>
   * Optional. The target timestamp to compute the preview.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the previewTime field is set.
   */
  @java.lang.Override
  public boolean hasPreviewTime() {
    return previewTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. The target timestamp to compute the preview.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The previewTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getPreviewTime() {
    return previewTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : previewTime_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The target timestamp to compute the preview.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getPreviewTimeOrBuilder() {
    return previewTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : previewTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (previewTime_ != null) {
      output.writeMessage(2, getPreviewTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (previewTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPreviewTime());
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
    if (!(obj instanceof com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest other =
        (com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasPreviewTime() != other.hasPreviewTime()) return false;
    if (hasPreviewTime()) {
      if (!getPreviewTime().equals(other.getPreviewTime())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasPreviewTime()) {
      hash = (37 * hash) + PREVIEW_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getPreviewTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest parseFrom(
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
      com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest prototype) {
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
   * Request message for GameServerClustersService.PreviewDeleteGameServerCluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest)
      com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gaming.v1.GameServerClusters
          .internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1.GameServerClusters
          .internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest.class,
              com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest.Builder.class);
    }

    // Construct using com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      previewTime_ = null;
      if (previewTimeBuilder_ != null) {
        previewTimeBuilder_.dispose();
        previewTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gaming.v1.GameServerClusters
          .internal_static_google_cloud_gaming_v1_PreviewDeleteGameServerClusterRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest
        getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest build() {
      com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest buildPartial() {
      com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest result =
          new com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.previewTime_ =
            previewTimeBuilder_ == null ? previewTime_ : previewTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest) {
        return mergeFrom((com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest other) {
      if (other
          == com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPreviewTime()) {
        mergePreviewTime(other.getPreviewTime());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getPreviewTimeFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the game server cluster to delete, in the following form:
     * `projects/{project}/locations/{location}/gameServerClusters/{cluster}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the game server cluster to delete, in the following form:
     * `projects/{project}/locations/{location}/gameServerClusters/{cluster}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the game server cluster to delete, in the following form:
     * `projects/{project}/locations/{location}/gameServerClusters/{cluster}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the game server cluster to delete, in the following form:
     * `projects/{project}/locations/{location}/gameServerClusters/{cluster}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the game server cluster to delete, in the following form:
     * `projects/{project}/locations/{location}/gameServerClusters/{cluster}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp previewTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        previewTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The target timestamp to compute the preview.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the previewTime field is set.
     */
    public boolean hasPreviewTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. The target timestamp to compute the preview.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The previewTime.
     */
    public com.google.protobuf.Timestamp getPreviewTime() {
      if (previewTimeBuilder_ == null) {
        return previewTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : previewTime_;
      } else {
        return previewTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The target timestamp to compute the preview.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setPreviewTime(com.google.protobuf.Timestamp value) {
      if (previewTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        previewTime_ = value;
      } else {
        previewTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The target timestamp to compute the preview.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setPreviewTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (previewTimeBuilder_ == null) {
        previewTime_ = builderForValue.build();
      } else {
        previewTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The target timestamp to compute the preview.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergePreviewTime(com.google.protobuf.Timestamp value) {
      if (previewTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && previewTime_ != null
            && previewTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getPreviewTimeBuilder().mergeFrom(value);
        } else {
          previewTime_ = value;
        }
      } else {
        previewTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The target timestamp to compute the preview.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearPreviewTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      previewTime_ = null;
      if (previewTimeBuilder_ != null) {
        previewTimeBuilder_.dispose();
        previewTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The target timestamp to compute the preview.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.Timestamp.Builder getPreviewTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPreviewTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The target timestamp to compute the preview.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.TimestampOrBuilder getPreviewTimeOrBuilder() {
      if (previewTimeBuilder_ != null) {
        return previewTimeBuilder_.getMessageOrBuilder();
      } else {
        return previewTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : previewTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The target timestamp to compute the preview.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp preview_time = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getPreviewTimeFieldBuilder() {
      if (previewTimeBuilder_ == null) {
        previewTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getPreviewTime(), getParentForChildren(), isClean());
        previewTime_ = null;
      }
      return previewTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest)
  private static final com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest();
  }

  public static com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PreviewDeleteGameServerClusterRequest> PARSER =
      new com.google.protobuf.AbstractParser<PreviewDeleteGameServerClusterRequest>() {
        @java.lang.Override
        public PreviewDeleteGameServerClusterRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PreviewDeleteGameServerClusterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PreviewDeleteGameServerClusterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1.PreviewDeleteGameServerClusterRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
