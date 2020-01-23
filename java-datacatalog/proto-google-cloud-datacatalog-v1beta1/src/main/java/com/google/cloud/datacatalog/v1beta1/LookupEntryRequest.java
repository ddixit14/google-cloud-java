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
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [LookupEntry][google.cloud.datacatalog.v1beta1.DataCatalog.LookupEntry].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.LookupEntryRequest}
 */
public final class LookupEntryRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.LookupEntryRequest)
    LookupEntryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LookupEntryRequest.newBuilder() to construct.
  private LookupEntryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LookupEntryRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LookupEntryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LookupEntryRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();
              targetNameCase_ = 1;
              targetName_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();
              targetNameCase_ = 3;
              targetName_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1beta1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1beta1_LookupEntryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1beta1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1beta1_LookupEntryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1beta1.LookupEntryRequest.class,
            com.google.cloud.datacatalog.v1beta1.LookupEntryRequest.Builder.class);
  }

  private int targetNameCase_ = 0;
  private java.lang.Object targetName_;

  public enum TargetNameCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    LINKED_RESOURCE(1),
    SQL_RESOURCE(3),
    TARGETNAME_NOT_SET(0);
    private final int value;

    private TargetNameCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TargetNameCase valueOf(int value) {
      return forNumber(value);
    }

    public static TargetNameCase forNumber(int value) {
      switch (value) {
        case 1:
          return LINKED_RESOURCE;
        case 3:
          return SQL_RESOURCE;
        case 0:
          return TARGETNAME_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public TargetNameCase getTargetNameCase() {
    return TargetNameCase.forNumber(targetNameCase_);
  }

  public static final int LINKED_RESOURCE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * The full name of the Google Cloud Platform resource the Data Catalog
   * entry represents. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name.
   * Full names are case-sensitive.
   * Examples:
   *  * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
   *  * //pubsub.googleapis.com/projects/projectId/topics/topicId
   * </pre>
   *
   * <code>string linked_resource = 1;</code>
   *
   * @return The linkedResource.
   */
  public java.lang.String getLinkedResource() {
    java.lang.Object ref = "";
    if (targetNameCase_ == 1) {
      ref = targetName_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (targetNameCase_ == 1) {
        targetName_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The full name of the Google Cloud Platform resource the Data Catalog
   * entry represents. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name.
   * Full names are case-sensitive.
   * Examples:
   *  * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
   *  * //pubsub.googleapis.com/projects/projectId/topics/topicId
   * </pre>
   *
   * <code>string linked_resource = 1;</code>
   *
   * @return The bytes for linkedResource.
   */
  public com.google.protobuf.ByteString getLinkedResourceBytes() {
    java.lang.Object ref = "";
    if (targetNameCase_ == 1) {
      ref = targetName_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (targetNameCase_ == 1) {
        targetName_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SQL_RESOURCE_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * The SQL name of the entry. SQL names are case-sensitive.
   * Examples:
   *   * `cloud_pubsub.project_id.topic_id`
   *   * ``pubsub.project_id.`topic.id.with.dots` ``
   *   * `bigquery.table.project_id.dataset_id.table_id`
   *   * `bigquery.dataset.project_id.dataset_id`
   *   * `datacatalog.project_id.location_id.entry_group_id.entry_id`
   * `*_id`s shoud satisfy the standard SQL rules for identifiers.
   * https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical.
   * </pre>
   *
   * <code>string sql_resource = 3;</code>
   *
   * @return The sqlResource.
   */
  public java.lang.String getSqlResource() {
    java.lang.Object ref = "";
    if (targetNameCase_ == 3) {
      ref = targetName_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (targetNameCase_ == 3) {
        targetName_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The SQL name of the entry. SQL names are case-sensitive.
   * Examples:
   *   * `cloud_pubsub.project_id.topic_id`
   *   * ``pubsub.project_id.`topic.id.with.dots` ``
   *   * `bigquery.table.project_id.dataset_id.table_id`
   *   * `bigquery.dataset.project_id.dataset_id`
   *   * `datacatalog.project_id.location_id.entry_group_id.entry_id`
   * `*_id`s shoud satisfy the standard SQL rules for identifiers.
   * https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical.
   * </pre>
   *
   * <code>string sql_resource = 3;</code>
   *
   * @return The bytes for sqlResource.
   */
  public com.google.protobuf.ByteString getSqlResourceBytes() {
    java.lang.Object ref = "";
    if (targetNameCase_ == 3) {
      ref = targetName_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (targetNameCase_ == 3) {
        targetName_ = b;
      }
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
    if (targetNameCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, targetName_);
    }
    if (targetNameCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, targetName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetNameCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, targetName_);
    }
    if (targetNameCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, targetName_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.datacatalog.v1beta1.LookupEntryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1beta1.LookupEntryRequest other =
        (com.google.cloud.datacatalog.v1beta1.LookupEntryRequest) obj;

    if (!getTargetNameCase().equals(other.getTargetNameCase())) return false;
    switch (targetNameCase_) {
      case 1:
        if (!getLinkedResource().equals(other.getLinkedResource())) return false;
        break;
      case 3:
        if (!getSqlResource().equals(other.getSqlResource())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (targetNameCase_) {
      case 1:
        hash = (37 * hash) + LINKED_RESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getLinkedResource().hashCode();
        break;
      case 3:
        hash = (37 * hash) + SQL_RESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getSqlResource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1beta1.LookupEntryRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.LookupEntryRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.LookupEntryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.LookupEntryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.LookupEntryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.LookupEntryRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.LookupEntryRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.LookupEntryRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.LookupEntryRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.LookupEntryRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.LookupEntryRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.LookupEntryRequest parseFrom(
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
      com.google.cloud.datacatalog.v1beta1.LookupEntryRequest prototype) {
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
   * [LookupEntry][google.cloud.datacatalog.v1beta1.DataCatalog.LookupEntry].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.LookupEntryRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.LookupEntryRequest)
      com.google.cloud.datacatalog.v1beta1.LookupEntryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_LookupEntryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_LookupEntryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1beta1.LookupEntryRequest.class,
              com.google.cloud.datacatalog.v1beta1.LookupEntryRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1beta1.LookupEntryRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      targetNameCase_ = 0;
      targetName_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1beta1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1beta1_LookupEntryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.LookupEntryRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1beta1.LookupEntryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.LookupEntryRequest build() {
      com.google.cloud.datacatalog.v1beta1.LookupEntryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.LookupEntryRequest buildPartial() {
      com.google.cloud.datacatalog.v1beta1.LookupEntryRequest result =
          new com.google.cloud.datacatalog.v1beta1.LookupEntryRequest(this);
      if (targetNameCase_ == 1) {
        result.targetName_ = targetName_;
      }
      if (targetNameCase_ == 3) {
        result.targetName_ = targetName_;
      }
      result.targetNameCase_ = targetNameCase_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.datacatalog.v1beta1.LookupEntryRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1beta1.LookupEntryRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1beta1.LookupEntryRequest other) {
      if (other == com.google.cloud.datacatalog.v1beta1.LookupEntryRequest.getDefaultInstance())
        return this;
      switch (other.getTargetNameCase()) {
        case LINKED_RESOURCE:
          {
            targetNameCase_ = 1;
            targetName_ = other.targetName_;
            onChanged();
            break;
          }
        case SQL_RESOURCE:
          {
            targetNameCase_ = 3;
            targetName_ = other.targetName_;
            onChanged();
            break;
          }
        case TARGETNAME_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.datacatalog.v1beta1.LookupEntryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datacatalog.v1beta1.LookupEntryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int targetNameCase_ = 0;
    private java.lang.Object targetName_;

    public TargetNameCase getTargetNameCase() {
      return TargetNameCase.forNumber(targetNameCase_);
    }

    public Builder clearTargetName() {
      targetNameCase_ = 0;
      targetName_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The full name of the Google Cloud Platform resource the Data Catalog
     * entry represents. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name.
     * Full names are case-sensitive.
     * Examples:
     *  * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
     *  * //pubsub.googleapis.com/projects/projectId/topics/topicId
     * </pre>
     *
     * <code>string linked_resource = 1;</code>
     *
     * @return The linkedResource.
     */
    public java.lang.String getLinkedResource() {
      java.lang.Object ref = "";
      if (targetNameCase_ == 1) {
        ref = targetName_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (targetNameCase_ == 1) {
          targetName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The full name of the Google Cloud Platform resource the Data Catalog
     * entry represents. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name.
     * Full names are case-sensitive.
     * Examples:
     *  * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
     *  * //pubsub.googleapis.com/projects/projectId/topics/topicId
     * </pre>
     *
     * <code>string linked_resource = 1;</code>
     *
     * @return The bytes for linkedResource.
     */
    public com.google.protobuf.ByteString getLinkedResourceBytes() {
      java.lang.Object ref = "";
      if (targetNameCase_ == 1) {
        ref = targetName_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (targetNameCase_ == 1) {
          targetName_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The full name of the Google Cloud Platform resource the Data Catalog
     * entry represents. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name.
     * Full names are case-sensitive.
     * Examples:
     *  * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
     *  * //pubsub.googleapis.com/projects/projectId/topics/topicId
     * </pre>
     *
     * <code>string linked_resource = 1;</code>
     *
     * @param value The linkedResource to set.
     * @return This builder for chaining.
     */
    public Builder setLinkedResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      targetNameCase_ = 1;
      targetName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The full name of the Google Cloud Platform resource the Data Catalog
     * entry represents. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name.
     * Full names are case-sensitive.
     * Examples:
     *  * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
     *  * //pubsub.googleapis.com/projects/projectId/topics/topicId
     * </pre>
     *
     * <code>string linked_resource = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLinkedResource() {
      if (targetNameCase_ == 1) {
        targetNameCase_ = 0;
        targetName_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The full name of the Google Cloud Platform resource the Data Catalog
     * entry represents. See:
     * https://cloud.google.com/apis/design/resource_names#full_resource_name.
     * Full names are case-sensitive.
     * Examples:
     *  * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
     *  * //pubsub.googleapis.com/projects/projectId/topics/topicId
     * </pre>
     *
     * <code>string linked_resource = 1;</code>
     *
     * @param value The bytes for linkedResource to set.
     * @return This builder for chaining.
     */
    public Builder setLinkedResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      targetNameCase_ = 1;
      targetName_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SQL name of the entry. SQL names are case-sensitive.
     * Examples:
     *   * `cloud_pubsub.project_id.topic_id`
     *   * ``pubsub.project_id.`topic.id.with.dots` ``
     *   * `bigquery.table.project_id.dataset_id.table_id`
     *   * `bigquery.dataset.project_id.dataset_id`
     *   * `datacatalog.project_id.location_id.entry_group_id.entry_id`
     * `*_id`s shoud satisfy the standard SQL rules for identifiers.
     * https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical.
     * </pre>
     *
     * <code>string sql_resource = 3;</code>
     *
     * @return The sqlResource.
     */
    public java.lang.String getSqlResource() {
      java.lang.Object ref = "";
      if (targetNameCase_ == 3) {
        ref = targetName_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (targetNameCase_ == 3) {
          targetName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The SQL name of the entry. SQL names are case-sensitive.
     * Examples:
     *   * `cloud_pubsub.project_id.topic_id`
     *   * ``pubsub.project_id.`topic.id.with.dots` ``
     *   * `bigquery.table.project_id.dataset_id.table_id`
     *   * `bigquery.dataset.project_id.dataset_id`
     *   * `datacatalog.project_id.location_id.entry_group_id.entry_id`
     * `*_id`s shoud satisfy the standard SQL rules for identifiers.
     * https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical.
     * </pre>
     *
     * <code>string sql_resource = 3;</code>
     *
     * @return The bytes for sqlResource.
     */
    public com.google.protobuf.ByteString getSqlResourceBytes() {
      java.lang.Object ref = "";
      if (targetNameCase_ == 3) {
        ref = targetName_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (targetNameCase_ == 3) {
          targetName_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The SQL name of the entry. SQL names are case-sensitive.
     * Examples:
     *   * `cloud_pubsub.project_id.topic_id`
     *   * ``pubsub.project_id.`topic.id.with.dots` ``
     *   * `bigquery.table.project_id.dataset_id.table_id`
     *   * `bigquery.dataset.project_id.dataset_id`
     *   * `datacatalog.project_id.location_id.entry_group_id.entry_id`
     * `*_id`s shoud satisfy the standard SQL rules for identifiers.
     * https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical.
     * </pre>
     *
     * <code>string sql_resource = 3;</code>
     *
     * @param value The sqlResource to set.
     * @return This builder for chaining.
     */
    public Builder setSqlResource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      targetNameCase_ = 3;
      targetName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The SQL name of the entry. SQL names are case-sensitive.
     * Examples:
     *   * `cloud_pubsub.project_id.topic_id`
     *   * ``pubsub.project_id.`topic.id.with.dots` ``
     *   * `bigquery.table.project_id.dataset_id.table_id`
     *   * `bigquery.dataset.project_id.dataset_id`
     *   * `datacatalog.project_id.location_id.entry_group_id.entry_id`
     * `*_id`s shoud satisfy the standard SQL rules for identifiers.
     * https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical.
     * </pre>
     *
     * <code>string sql_resource = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSqlResource() {
      if (targetNameCase_ == 3) {
        targetNameCase_ = 0;
        targetName_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The SQL name of the entry. SQL names are case-sensitive.
     * Examples:
     *   * `cloud_pubsub.project_id.topic_id`
     *   * ``pubsub.project_id.`topic.id.with.dots` ``
     *   * `bigquery.table.project_id.dataset_id.table_id`
     *   * `bigquery.dataset.project_id.dataset_id`
     *   * `datacatalog.project_id.location_id.entry_group_id.entry_id`
     * `*_id`s shoud satisfy the standard SQL rules for identifiers.
     * https://cloud.google.com/bigquery/docs/reference/standard-sql/lexical.
     * </pre>
     *
     * <code>string sql_resource = 3;</code>
     *
     * @param value The bytes for sqlResource to set.
     * @return This builder for chaining.
     */
    public Builder setSqlResourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      targetNameCase_ = 3;
      targetName_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.LookupEntryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.LookupEntryRequest)
  private static final com.google.cloud.datacatalog.v1beta1.LookupEntryRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1beta1.LookupEntryRequest();
  }

  public static com.google.cloud.datacatalog.v1beta1.LookupEntryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LookupEntryRequest> PARSER =
      new com.google.protobuf.AbstractParser<LookupEntryRequest>() {
        @java.lang.Override
        public LookupEntryRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LookupEntryRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LookupEntryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LookupEntryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.LookupEntryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
