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
// source: google/cloud/dialogflow/v2/entity_type.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The request message for
 * [EntityTypes.BatchDeleteEntityTypes][google.cloud.dialogflow.v2.EntityTypes.BatchDeleteEntityTypes].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest}
 */
public final class BatchDeleteEntityTypesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest)
    BatchDeleteEntityTypesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchDeleteEntityTypesRequest.newBuilder() to construct.
  private BatchDeleteEntityTypesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchDeleteEntityTypesRequest() {
    parent_ = "";
    entityTypeNames_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchDeleteEntityTypesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.EntityTypeProto
        .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.EntityTypeProto
        .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.class,
            com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the agent to delete all entities types for. Format:
   * `projects/&lt;Project ID&gt;/agent`.
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
   * Required. The name of the agent to delete all entities types for. Format:
   * `projects/&lt;Project ID&gt;/agent`.
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

  public static final int ENTITY_TYPE_NAMES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList entityTypeNames_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the entityTypeNames.
   */
  public com.google.protobuf.ProtocolStringList getEntityTypeNamesList() {
    return entityTypeNames_;
  }
  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of entityTypeNames.
   */
  public int getEntityTypeNamesCount() {
    return entityTypeNames_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The entityTypeNames at the given index.
   */
  public java.lang.String getEntityTypeNames(int index) {
    return entityTypeNames_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. The names entity types to delete. All names must point to the
   * same agent as `parent`.
   * </pre>
   *
   * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the entityTypeNames at the given index.
   */
  public com.google.protobuf.ByteString getEntityTypeNamesBytes(int index) {
    return entityTypeNames_.getByteString(index);
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
    for (int i = 0; i < entityTypeNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, entityTypeNames_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < entityTypeNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(entityTypeNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEntityTypeNamesList().size();
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest other =
        (com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getEntityTypeNamesList().equals(other.getEntityTypeNamesList())) return false;
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
    if (getEntityTypeNamesCount() > 0) {
      hash = (37 * hash) + ENTITY_TYPE_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getEntityTypeNamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest parseFrom(
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
      com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest prototype) {
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
   * The request message for
   * [EntityTypes.BatchDeleteEntityTypes][google.cloud.dialogflow.v2.EntityTypes.BatchDeleteEntityTypes].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest)
      com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.class,
              com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      entityTypeNames_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_BatchDeleteEntityTypesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest build() {
      com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest buildPartial() {
      com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest result =
          new com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        entityTypeNames_.makeImmutable();
        result.entityTypeNames_ = entityTypeNames_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest other) {
      if (other
          == com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.entityTypeNames_.isEmpty()) {
        if (entityTypeNames_.isEmpty()) {
          entityTypeNames_ = other.entityTypeNames_;
          bitField0_ |= 0x00000002;
        } else {
          ensureEntityTypeNamesIsMutable();
          entityTypeNames_.addAll(other.entityTypeNames_);
        }
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureEntityTypeNamesIsMutable();
                entityTypeNames_.add(s);
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
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
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
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
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
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
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
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
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
     * Required. The name of the agent to delete all entities types for. Format:
     * `projects/&lt;Project ID&gt;/agent`.
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

    private com.google.protobuf.LazyStringArrayList entityTypeNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureEntityTypeNamesIsMutable() {
      if (!entityTypeNames_.isModifiable()) {
        entityTypeNames_ = new com.google.protobuf.LazyStringArrayList(entityTypeNames_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return A list containing the entityTypeNames.
     */
    public com.google.protobuf.ProtocolStringList getEntityTypeNamesList() {
      entityTypeNames_.makeImmutable();
      return entityTypeNames_;
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The count of entityTypeNames.
     */
    public int getEntityTypeNamesCount() {
      return entityTypeNames_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index of the element to return.
     * @return The entityTypeNames at the given index.
     */
    public java.lang.String getEntityTypeNames(int index) {
      return entityTypeNames_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the entityTypeNames at the given index.
     */
    public com.google.protobuf.ByteString getEntityTypeNamesBytes(int index) {
      return entityTypeNames_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index to set the value at.
     * @param value The entityTypeNames to set.
     * @return This builder for chaining.
     */
    public Builder setEntityTypeNames(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEntityTypeNamesIsMutable();
      entityTypeNames_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The entityTypeNames to add.
     * @return This builder for chaining.
     */
    public Builder addEntityTypeNames(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEntityTypeNamesIsMutable();
      entityTypeNames_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param values The entityTypeNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllEntityTypeNames(java.lang.Iterable<java.lang.String> values) {
      ensureEntityTypeNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, entityTypeNames_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntityTypeNames() {
      entityTypeNames_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The names entity types to delete. All names must point to the
     * same agent as `parent`.
     * </pre>
     *
     * <code>repeated string entity_type_names = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes of the entityTypeNames to add.
     * @return This builder for chaining.
     */
    public Builder addEntityTypeNamesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureEntityTypeNamesIsMutable();
      entityTypeNames_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest)
  private static final com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest();
  }

  public static com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchDeleteEntityTypesRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchDeleteEntityTypesRequest>() {
        @java.lang.Override
        public BatchDeleteEntityTypesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchDeleteEntityTypesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchDeleteEntityTypesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
