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
// source: google/cloud/aiplatform/v1/featurestore_online_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [FeaturestoreOnlineServingService.ReadFeatureValues][google.cloud.aiplatform.v1.FeaturestoreOnlineServingService.ReadFeatureValues].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ReadFeatureValuesRequest}
 */
public final class ReadFeatureValuesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ReadFeatureValuesRequest)
    ReadFeatureValuesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReadFeatureValuesRequest.newBuilder() to construct.
  private ReadFeatureValuesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReadFeatureValuesRequest() {
    entityType_ = "";
    entityId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReadFeatureValuesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.FeaturestoreOnlineServiceProto
        .internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.FeaturestoreOnlineServiceProto
        .internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest.class,
            com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest.Builder.class);
  }

  public static final int ENTITY_TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object entityType_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the EntityType for the entity being read.
   * Value format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entityType}`.
   * For example, for a machine learning model predicting user clicks on a
   * website, an EntityType ID could be `user`.
   * </pre>
   *
   * <code>
   * string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The entityType.
   */
  @java.lang.Override
  public java.lang.String getEntityType() {
    java.lang.Object ref = entityType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the EntityType for the entity being read.
   * Value format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entityType}`.
   * For example, for a machine learning model predicting user clicks on a
   * website, an EntityType ID could be `user`.
   * </pre>
   *
   * <code>
   * string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for entityType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEntityTypeBytes() {
    java.lang.Object ref = entityType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      entityType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITY_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object entityId_ = "";
  /**
   *
   *
   * <pre>
   * Required. ID for a specific entity. For example,
   * for a machine learning model predicting user clicks on a website, an entity
   * ID could be `user_123`.
   * </pre>
   *
   * <code>string entity_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The entityId.
   */
  @java.lang.Override
  public java.lang.String getEntityId() {
    java.lang.Object ref = entityId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. ID for a specific entity. For example,
   * for a machine learning model predicting user clicks on a website, an entity
   * ID could be `user_123`.
   * </pre>
   *
   * <code>string entity_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for entityId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEntityIdBytes() {
    java.lang.Object ref = entityId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      entityId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FEATURE_SELECTOR_FIELD_NUMBER = 3;
  private com.google.cloud.aiplatform.v1.FeatureSelector featureSelector_;
  /**
   *
   *
   * <pre>
   * Required. Selector choosing Features of the target EntityType.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the featureSelector field is set.
   */
  @java.lang.Override
  public boolean hasFeatureSelector() {
    return featureSelector_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Selector choosing Features of the target EntityType.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The featureSelector.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.FeatureSelector getFeatureSelector() {
    return featureSelector_ == null
        ? com.google.cloud.aiplatform.v1.FeatureSelector.getDefaultInstance()
        : featureSelector_;
  }
  /**
   *
   *
   * <pre>
   * Required. Selector choosing Features of the target EntityType.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.FeatureSelectorOrBuilder getFeatureSelectorOrBuilder() {
    return featureSelector_ == null
        ? com.google.cloud.aiplatform.v1.FeatureSelector.getDefaultInstance()
        : featureSelector_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, entityType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, entityId_);
    }
    if (featureSelector_ != null) {
      output.writeMessage(3, getFeatureSelector());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, entityType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, entityId_);
    }
    if (featureSelector_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getFeatureSelector());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest other =
        (com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest) obj;

    if (!getEntityType().equals(other.getEntityType())) return false;
    if (!getEntityId().equals(other.getEntityId())) return false;
    if (hasFeatureSelector() != other.hasFeatureSelector()) return false;
    if (hasFeatureSelector()) {
      if (!getFeatureSelector().equals(other.getFeatureSelector())) return false;
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
    hash = (37 * hash) + ENTITY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getEntityType().hashCode();
    hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEntityId().hashCode();
    if (hasFeatureSelector()) {
      hash = (37 * hash) + FEATURE_SELECTOR_FIELD_NUMBER;
      hash = (53 * hash) + getFeatureSelector().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest parseFrom(
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
      com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest prototype) {
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
   * [FeaturestoreOnlineServingService.ReadFeatureValues][google.cloud.aiplatform.v1.FeaturestoreOnlineServingService.ReadFeatureValues].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ReadFeatureValuesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ReadFeatureValuesRequest)
      com.google.cloud.aiplatform.v1.ReadFeatureValuesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.FeaturestoreOnlineServiceProto
          .internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.FeaturestoreOnlineServiceProto
          .internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest.class,
              com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      entityType_ = "";
      entityId_ = "";
      featureSelector_ = null;
      if (featureSelectorBuilder_ != null) {
        featureSelectorBuilder_.dispose();
        featureSelectorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.FeaturestoreOnlineServiceProto
          .internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest build() {
      com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest buildPartial() {
      com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest result =
          new com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entityType_ = entityType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.entityId_ = entityId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.featureSelector_ =
            featureSelectorBuilder_ == null ? featureSelector_ : featureSelectorBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest other) {
      if (other == com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest.getDefaultInstance())
        return this;
      if (!other.getEntityType().isEmpty()) {
        entityType_ = other.entityType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEntityId().isEmpty()) {
        entityId_ = other.entityId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasFeatureSelector()) {
        mergeFeatureSelector(other.getFeatureSelector());
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
                entityType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                entityId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getFeatureSelectorFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object entityType_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the EntityType for the entity being read.
     * Value format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entityType}`.
     * For example, for a machine learning model predicting user clicks on a
     * website, an EntityType ID could be `user`.
     * </pre>
     *
     * <code>
     * string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The entityType.
     */
    public java.lang.String getEntityType() {
      java.lang.Object ref = entityType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the EntityType for the entity being read.
     * Value format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entityType}`.
     * For example, for a machine learning model predicting user clicks on a
     * website, an EntityType ID could be `user`.
     * </pre>
     *
     * <code>
     * string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for entityType.
     */
    public com.google.protobuf.ByteString getEntityTypeBytes() {
      java.lang.Object ref = entityType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        entityType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the EntityType for the entity being read.
     * Value format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entityType}`.
     * For example, for a machine learning model predicting user clicks on a
     * website, an EntityType ID could be `user`.
     * </pre>
     *
     * <code>
     * string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The entityType to set.
     * @return This builder for chaining.
     */
    public Builder setEntityType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      entityType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the EntityType for the entity being read.
     * Value format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entityType}`.
     * For example, for a machine learning model predicting user clicks on a
     * website, an EntityType ID could be `user`.
     * </pre>
     *
     * <code>
     * string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntityType() {
      entityType_ = getDefaultInstance().getEntityType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the EntityType for the entity being read.
     * Value format:
     * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entityType}`.
     * For example, for a machine learning model predicting user clicks on a
     * website, an EntityType ID could be `user`.
     * </pre>
     *
     * <code>
     * string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for entityType to set.
     * @return This builder for chaining.
     */
    public Builder setEntityTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      entityType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object entityId_ = "";
    /**
     *
     *
     * <pre>
     * Required. ID for a specific entity. For example,
     * for a machine learning model predicting user clicks on a website, an entity
     * ID could be `user_123`.
     * </pre>
     *
     * <code>string entity_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The entityId.
     */
    public java.lang.String getEntityId() {
      java.lang.Object ref = entityId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. ID for a specific entity. For example,
     * for a machine learning model predicting user clicks on a website, an entity
     * ID could be `user_123`.
     * </pre>
     *
     * <code>string entity_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for entityId.
     */
    public com.google.protobuf.ByteString getEntityIdBytes() {
      java.lang.Object ref = entityId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        entityId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. ID for a specific entity. For example,
     * for a machine learning model predicting user clicks on a website, an entity
     * ID could be `user_123`.
     * </pre>
     *
     * <code>string entity_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      entityId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. ID for a specific entity. For example,
     * for a machine learning model predicting user clicks on a website, an entity
     * ID could be `user_123`.
     * </pre>
     *
     * <code>string entity_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntityId() {
      entityId_ = getDefaultInstance().getEntityId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. ID for a specific entity. For example,
     * for a machine learning model predicting user clicks on a website, an entity
     * ID could be `user_123`.
     * </pre>
     *
     * <code>string entity_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      entityId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1.FeatureSelector featureSelector_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.FeatureSelector,
            com.google.cloud.aiplatform.v1.FeatureSelector.Builder,
            com.google.cloud.aiplatform.v1.FeatureSelectorOrBuilder>
        featureSelectorBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Selector choosing Features of the target EntityType.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the featureSelector field is set.
     */
    public boolean hasFeatureSelector() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Selector choosing Features of the target EntityType.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The featureSelector.
     */
    public com.google.cloud.aiplatform.v1.FeatureSelector getFeatureSelector() {
      if (featureSelectorBuilder_ == null) {
        return featureSelector_ == null
            ? com.google.cloud.aiplatform.v1.FeatureSelector.getDefaultInstance()
            : featureSelector_;
      } else {
        return featureSelectorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Selector choosing Features of the target EntityType.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFeatureSelector(com.google.cloud.aiplatform.v1.FeatureSelector value) {
      if (featureSelectorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        featureSelector_ = value;
      } else {
        featureSelectorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Selector choosing Features of the target EntityType.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFeatureSelector(
        com.google.cloud.aiplatform.v1.FeatureSelector.Builder builderForValue) {
      if (featureSelectorBuilder_ == null) {
        featureSelector_ = builderForValue.build();
      } else {
        featureSelectorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Selector choosing Features of the target EntityType.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeFeatureSelector(com.google.cloud.aiplatform.v1.FeatureSelector value) {
      if (featureSelectorBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && featureSelector_ != null
            && featureSelector_
                != com.google.cloud.aiplatform.v1.FeatureSelector.getDefaultInstance()) {
          getFeatureSelectorBuilder().mergeFrom(value);
        } else {
          featureSelector_ = value;
        }
      } else {
        featureSelectorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Selector choosing Features of the target EntityType.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearFeatureSelector() {
      bitField0_ = (bitField0_ & ~0x00000004);
      featureSelector_ = null;
      if (featureSelectorBuilder_ != null) {
        featureSelectorBuilder_.dispose();
        featureSelectorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Selector choosing Features of the target EntityType.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.FeatureSelector.Builder getFeatureSelectorBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getFeatureSelectorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Selector choosing Features of the target EntityType.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.FeatureSelectorOrBuilder getFeatureSelectorOrBuilder() {
      if (featureSelectorBuilder_ != null) {
        return featureSelectorBuilder_.getMessageOrBuilder();
      } else {
        return featureSelector_ == null
            ? com.google.cloud.aiplatform.v1.FeatureSelector.getDefaultInstance()
            : featureSelector_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Selector choosing Features of the target EntityType.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.FeatureSelector,
            com.google.cloud.aiplatform.v1.FeatureSelector.Builder,
            com.google.cloud.aiplatform.v1.FeatureSelectorOrBuilder>
        getFeatureSelectorFieldBuilder() {
      if (featureSelectorBuilder_ == null) {
        featureSelectorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.FeatureSelector,
                com.google.cloud.aiplatform.v1.FeatureSelector.Builder,
                com.google.cloud.aiplatform.v1.FeatureSelectorOrBuilder>(
                getFeatureSelector(), getParentForChildren(), isClean());
        featureSelector_ = null;
      }
      return featureSelectorBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ReadFeatureValuesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ReadFeatureValuesRequest)
  private static final com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest();
  }

  public static com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadFeatureValuesRequest> PARSER =
      new com.google.protobuf.AbstractParser<ReadFeatureValuesRequest>() {
        @java.lang.Override
        public ReadFeatureValuesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReadFeatureValuesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadFeatureValuesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ReadFeatureValuesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
