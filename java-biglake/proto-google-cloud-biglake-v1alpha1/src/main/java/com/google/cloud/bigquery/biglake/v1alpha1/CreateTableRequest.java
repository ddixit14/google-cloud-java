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
// source: google/cloud/bigquery/biglake/v1alpha1/metastore.proto

package com.google.cloud.bigquery.biglake.v1alpha1;

/**
 *
 *
 * <pre>
 * Request message for the CreateTable method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest}
 */
public final class CreateTableRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest)
    CreateTableRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateTableRequest.newBuilder() to construct.
  private CreateTableRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateTableRequest() {
    parent_ = "";
    tableId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateTableRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
        .internal_static_google_cloud_bigquery_biglake_v1alpha1_CreateTableRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
        .internal_static_google_cloud_bigquery_biglake_v1alpha1_CreateTableRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest.class,
            com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this table will be created.
   * Format:
   * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}/databases/{database_id}
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
   * Required. The parent resource where this table will be created.
   * Format:
   * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}/databases/{database_id}
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

  public static final int TABLE_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.biglake.v1alpha1.Table table_;
  /**
   *
   *
   * <pre>
   * Required. The table to create. The `name` field does not need to be
   * provided for the table creation.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the table field is set.
   */
  @java.lang.Override
  public boolean hasTable() {
    return table_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The table to create. The `name` field does not need to be
   * provided for the table creation.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The table.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.biglake.v1alpha1.Table getTable() {
    return table_ == null
        ? com.google.cloud.bigquery.biglake.v1alpha1.Table.getDefaultInstance()
        : table_;
  }
  /**
   *
   *
   * <pre>
   * Required. The table to create. The `name` field does not need to be
   * provided for the table creation.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.biglake.v1alpha1.TableOrBuilder getTableOrBuilder() {
    return table_ == null
        ? com.google.cloud.bigquery.biglake.v1alpha1.Table.getDefaultInstance()
        : table_;
  }

  public static final int TABLE_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object tableId_ = "";
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the table, which will become the final
   * component of the table's resource name.
   * </pre>
   *
   * <code>string table_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The tableId.
   */
  @java.lang.Override
  public java.lang.String getTableId() {
    java.lang.Object ref = tableId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the table, which will become the final
   * component of the table's resource name.
   * </pre>
   *
   * <code>string table_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for tableId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTableIdBytes() {
    java.lang.Object ref = tableId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tableId_ = b;
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
    if (table_ != null) {
      output.writeMessage(2, getTable());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tableId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, tableId_);
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
    if (table_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTable());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tableId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, tableId_);
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
    if (!(obj instanceof com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest other =
        (com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasTable() != other.hasTable()) return false;
    if (hasTable()) {
      if (!getTable().equals(other.getTable())) return false;
    }
    if (!getTableId().equals(other.getTableId())) return false;
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
    if (hasTable()) {
      hash = (37 * hash) + TABLE_FIELD_NUMBER;
      hash = (53 * hash) + getTable().hashCode();
    }
    hash = (37 * hash) + TABLE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTableId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest parseFrom(
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
      com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest prototype) {
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
   * Request message for the CreateTable method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest)
      com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
          .internal_static_google_cloud_bigquery_biglake_v1alpha1_CreateTableRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
          .internal_static_google_cloud_bigquery_biglake_v1alpha1_CreateTableRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest.class,
              com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      table_ = null;
      if (tableBuilder_ != null) {
        tableBuilder_.dispose();
        tableBuilder_ = null;
      }
      tableId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.biglake.v1alpha1.MetastoreProto
          .internal_static_google_cloud_bigquery_biglake_v1alpha1_CreateTableRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest build() {
      com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest buildPartial() {
      com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest result =
          new com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.table_ = tableBuilder_ == null ? table_ : tableBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.tableId_ = tableId_;
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
      if (other instanceof com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest) {
        return mergeFrom((com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest other) {
      if (other
          == com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasTable()) {
        mergeTable(other.getTable());
      }
      if (!other.getTableId().isEmpty()) {
        tableId_ = other.tableId_;
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
                input.readMessage(getTableFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                tableId_ = input.readStringRequireUtf8();
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
     * Required. The parent resource where this table will be created.
     * Format:
     * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}/databases/{database_id}
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
     * Required. The parent resource where this table will be created.
     * Format:
     * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}/databases/{database_id}
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
     * Required. The parent resource where this table will be created.
     * Format:
     * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}/databases/{database_id}
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
     * Required. The parent resource where this table will be created.
     * Format:
     * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}/databases/{database_id}
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
     * Required. The parent resource where this table will be created.
     * Format:
     * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}/databases/{database_id}
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

    private com.google.cloud.bigquery.biglake.v1alpha1.Table table_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.biglake.v1alpha1.Table,
            com.google.cloud.bigquery.biglake.v1alpha1.Table.Builder,
            com.google.cloud.bigquery.biglake.v1alpha1.TableOrBuilder>
        tableBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The table to create. The `name` field does not need to be
     * provided for the table creation.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the table field is set.
     */
    public boolean hasTable() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The table to create. The `name` field does not need to be
     * provided for the table creation.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The table.
     */
    public com.google.cloud.bigquery.biglake.v1alpha1.Table getTable() {
      if (tableBuilder_ == null) {
        return table_ == null
            ? com.google.cloud.bigquery.biglake.v1alpha1.Table.getDefaultInstance()
            : table_;
      } else {
        return tableBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The table to create. The `name` field does not need to be
     * provided for the table creation.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTable(com.google.cloud.bigquery.biglake.v1alpha1.Table value) {
      if (tableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        table_ = value;
      } else {
        tableBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The table to create. The `name` field does not need to be
     * provided for the table creation.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTable(
        com.google.cloud.bigquery.biglake.v1alpha1.Table.Builder builderForValue) {
      if (tableBuilder_ == null) {
        table_ = builderForValue.build();
      } else {
        tableBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The table to create. The `name` field does not need to be
     * provided for the table creation.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeTable(com.google.cloud.bigquery.biglake.v1alpha1.Table value) {
      if (tableBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && table_ != null
            && table_ != com.google.cloud.bigquery.biglake.v1alpha1.Table.getDefaultInstance()) {
          getTableBuilder().mergeFrom(value);
        } else {
          table_ = value;
        }
      } else {
        tableBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The table to create. The `name` field does not need to be
     * provided for the table creation.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearTable() {
      bitField0_ = (bitField0_ & ~0x00000002);
      table_ = null;
      if (tableBuilder_ != null) {
        tableBuilder_.dispose();
        tableBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The table to create. The `name` field does not need to be
     * provided for the table creation.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.biglake.v1alpha1.Table.Builder getTableBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTableFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The table to create. The `name` field does not need to be
     * provided for the table creation.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.biglake.v1alpha1.TableOrBuilder getTableOrBuilder() {
      if (tableBuilder_ != null) {
        return tableBuilder_.getMessageOrBuilder();
      } else {
        return table_ == null
            ? com.google.cloud.bigquery.biglake.v1alpha1.Table.getDefaultInstance()
            : table_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The table to create. The `name` field does not need to be
     * provided for the table creation.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.biglake.v1alpha1.Table table = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.biglake.v1alpha1.Table,
            com.google.cloud.bigquery.biglake.v1alpha1.Table.Builder,
            com.google.cloud.bigquery.biglake.v1alpha1.TableOrBuilder>
        getTableFieldBuilder() {
      if (tableBuilder_ == null) {
        tableBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.biglake.v1alpha1.Table,
                com.google.cloud.bigquery.biglake.v1alpha1.Table.Builder,
                com.google.cloud.bigquery.biglake.v1alpha1.TableOrBuilder>(
                getTable(), getParentForChildren(), isClean());
        table_ = null;
      }
      return tableBuilder_;
    }

    private java.lang.Object tableId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the table, which will become the final
     * component of the table's resource name.
     * </pre>
     *
     * <code>string table_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The tableId.
     */
    public java.lang.String getTableId() {
      java.lang.Object ref = tableId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the table, which will become the final
     * component of the table's resource name.
     * </pre>
     *
     * <code>string table_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for tableId.
     */
    public com.google.protobuf.ByteString getTableIdBytes() {
      java.lang.Object ref = tableId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tableId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the table, which will become the final
     * component of the table's resource name.
     * </pre>
     *
     * <code>string table_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The tableId to set.
     * @return This builder for chaining.
     */
    public Builder setTableId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      tableId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the table, which will become the final
     * component of the table's resource name.
     * </pre>
     *
     * <code>string table_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTableId() {
      tableId_ = getDefaultInstance().getTableId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID to use for the table, which will become the final
     * component of the table's resource name.
     * </pre>
     *
     * <code>string table_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for tableId to set.
     * @return This builder for chaining.
     */
    public Builder setTableIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      tableId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest)
  private static final com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest();
  }

  public static com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTableRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateTableRequest>() {
        @java.lang.Override
        public CreateTableRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTableRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTableRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.biglake.v1alpha1.CreateTableRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
