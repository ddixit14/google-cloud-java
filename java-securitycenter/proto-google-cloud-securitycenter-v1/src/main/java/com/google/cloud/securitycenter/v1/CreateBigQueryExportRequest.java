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
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * Request message for creating a BigQuery export.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.CreateBigQueryExportRequest}
 */
public final class CreateBigQueryExportRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.CreateBigQueryExportRequest)
    CreateBigQueryExportRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateBigQueryExportRequest.newBuilder() to construct.
  private CreateBigQueryExportRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateBigQueryExportRequest() {
    parent_ = "";
    bigQueryExportId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateBigQueryExportRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1_CreateBigQueryExportRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1_CreateBigQueryExportRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest.class,
            com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the parent resource of the new BigQuery export. Its
   * format is "organizations/[organization_id]", "folders/[folder_id]", or
   * "projects/[project_id]".
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
   * Required. The name of the parent resource of the new BigQuery export. Its
   * format is "organizations/[organization_id]", "folders/[folder_id]", or
   * "projects/[project_id]".
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

  public static final int BIG_QUERY_EXPORT_FIELD_NUMBER = 2;
  private com.google.cloud.securitycenter.v1.BigQueryExport bigQueryExport_;
  /**
   *
   *
   * <pre>
   * Required. The BigQuery export being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the bigQueryExport field is set.
   */
  @java.lang.Override
  public boolean hasBigQueryExport() {
    return bigQueryExport_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The BigQuery export being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bigQueryExport.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.BigQueryExport getBigQueryExport() {
    return bigQueryExport_ == null
        ? com.google.cloud.securitycenter.v1.BigQueryExport.getDefaultInstance()
        : bigQueryExport_;
  }
  /**
   *
   *
   * <pre>
   * Required. The BigQuery export being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.BigQueryExportOrBuilder getBigQueryExportOrBuilder() {
    return bigQueryExport_ == null
        ? com.google.cloud.securitycenter.v1.BigQueryExport.getDefaultInstance()
        : bigQueryExport_;
  }

  public static final int BIG_QUERY_EXPORT_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object bigQueryExportId_ = "";
  /**
   *
   *
   * <pre>
   * Required. Unique identifier provided by the client within the parent scope.
   * It must consist of lower case letters, numbers, and hyphen, with the first
   * character a letter, the last a letter or a number, and a 63 character
   * maximum.
   * </pre>
   *
   * <code>string big_query_export_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bigQueryExportId.
   */
  @java.lang.Override
  public java.lang.String getBigQueryExportId() {
    java.lang.Object ref = bigQueryExportId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bigQueryExportId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Unique identifier provided by the client within the parent scope.
   * It must consist of lower case letters, numbers, and hyphen, with the first
   * character a letter, the last a letter or a number, and a 63 character
   * maximum.
   * </pre>
   *
   * <code>string big_query_export_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for bigQueryExportId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBigQueryExportIdBytes() {
    java.lang.Object ref = bigQueryExportId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      bigQueryExportId_ = b;
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
    if (bigQueryExport_ != null) {
      output.writeMessage(2, getBigQueryExport());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bigQueryExportId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, bigQueryExportId_);
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
    if (bigQueryExport_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getBigQueryExport());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bigQueryExportId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, bigQueryExportId_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest other =
        (com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasBigQueryExport() != other.hasBigQueryExport()) return false;
    if (hasBigQueryExport()) {
      if (!getBigQueryExport().equals(other.getBigQueryExport())) return false;
    }
    if (!getBigQueryExportId().equals(other.getBigQueryExportId())) return false;
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
    if (hasBigQueryExport()) {
      hash = (37 * hash) + BIG_QUERY_EXPORT_FIELD_NUMBER;
      hash = (53 * hash) + getBigQueryExport().hashCode();
    }
    hash = (37 * hash) + BIG_QUERY_EXPORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBigQueryExportId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest parseFrom(
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
      com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest prototype) {
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
   * Request message for creating a BigQuery export.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.CreateBigQueryExportRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.CreateBigQueryExportRequest)
      com.google.cloud.securitycenter.v1.CreateBigQueryExportRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_CreateBigQueryExportRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_CreateBigQueryExportRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest.class,
              com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      bigQueryExport_ = null;
      if (bigQueryExportBuilder_ != null) {
        bigQueryExportBuilder_.dispose();
        bigQueryExportBuilder_ = null;
      }
      bigQueryExportId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_CreateBigQueryExportRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest
        getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest build() {
      com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest buildPartial() {
      com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest result =
          new com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bigQueryExport_ =
            bigQueryExportBuilder_ == null ? bigQueryExport_ : bigQueryExportBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.bigQueryExportId_ = bigQueryExportId_;
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
      if (other instanceof com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest) {
        return mergeFrom((com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest other) {
      if (other
          == com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasBigQueryExport()) {
        mergeBigQueryExport(other.getBigQueryExport());
      }
      if (!other.getBigQueryExportId().isEmpty()) {
        bigQueryExportId_ = other.bigQueryExportId_;
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
                input.readMessage(getBigQueryExportFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                bigQueryExportId_ = input.readStringRequireUtf8();
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
     * Required. The name of the parent resource of the new BigQuery export. Its
     * format is "organizations/[organization_id]", "folders/[folder_id]", or
     * "projects/[project_id]".
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
     * Required. The name of the parent resource of the new BigQuery export. Its
     * format is "organizations/[organization_id]", "folders/[folder_id]", or
     * "projects/[project_id]".
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
     * Required. The name of the parent resource of the new BigQuery export. Its
     * format is "organizations/[organization_id]", "folders/[folder_id]", or
     * "projects/[project_id]".
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
     * Required. The name of the parent resource of the new BigQuery export. Its
     * format is "organizations/[organization_id]", "folders/[folder_id]", or
     * "projects/[project_id]".
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
     * Required. The name of the parent resource of the new BigQuery export. Its
     * format is "organizations/[organization_id]", "folders/[folder_id]", or
     * "projects/[project_id]".
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

    private com.google.cloud.securitycenter.v1.BigQueryExport bigQueryExport_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1.BigQueryExport,
            com.google.cloud.securitycenter.v1.BigQueryExport.Builder,
            com.google.cloud.securitycenter.v1.BigQueryExportOrBuilder>
        bigQueryExportBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The BigQuery export being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the bigQueryExport field is set.
     */
    public boolean hasBigQueryExport() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery export being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The bigQueryExport.
     */
    public com.google.cloud.securitycenter.v1.BigQueryExport getBigQueryExport() {
      if (bigQueryExportBuilder_ == null) {
        return bigQueryExport_ == null
            ? com.google.cloud.securitycenter.v1.BigQueryExport.getDefaultInstance()
            : bigQueryExport_;
      } else {
        return bigQueryExportBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery export being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBigQueryExport(com.google.cloud.securitycenter.v1.BigQueryExport value) {
      if (bigQueryExportBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bigQueryExport_ = value;
      } else {
        bigQueryExportBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery export being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBigQueryExport(
        com.google.cloud.securitycenter.v1.BigQueryExport.Builder builderForValue) {
      if (bigQueryExportBuilder_ == null) {
        bigQueryExport_ = builderForValue.build();
      } else {
        bigQueryExportBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery export being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeBigQueryExport(com.google.cloud.securitycenter.v1.BigQueryExport value) {
      if (bigQueryExportBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && bigQueryExport_ != null
            && bigQueryExport_
                != com.google.cloud.securitycenter.v1.BigQueryExport.getDefaultInstance()) {
          getBigQueryExportBuilder().mergeFrom(value);
        } else {
          bigQueryExport_ = value;
        }
      } else {
        bigQueryExportBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery export being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearBigQueryExport() {
      bitField0_ = (bitField0_ & ~0x00000002);
      bigQueryExport_ = null;
      if (bigQueryExportBuilder_ != null) {
        bigQueryExportBuilder_.dispose();
        bigQueryExportBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery export being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securitycenter.v1.BigQueryExport.Builder getBigQueryExportBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBigQueryExportFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery export being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securitycenter.v1.BigQueryExportOrBuilder getBigQueryExportOrBuilder() {
      if (bigQueryExportBuilder_ != null) {
        return bigQueryExportBuilder_.getMessageOrBuilder();
      } else {
        return bigQueryExport_ == null
            ? com.google.cloud.securitycenter.v1.BigQueryExport.getDefaultInstance()
            : bigQueryExport_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery export being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.BigQueryExport big_query_export = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1.BigQueryExport,
            com.google.cloud.securitycenter.v1.BigQueryExport.Builder,
            com.google.cloud.securitycenter.v1.BigQueryExportOrBuilder>
        getBigQueryExportFieldBuilder() {
      if (bigQueryExportBuilder_ == null) {
        bigQueryExportBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.securitycenter.v1.BigQueryExport,
                com.google.cloud.securitycenter.v1.BigQueryExport.Builder,
                com.google.cloud.securitycenter.v1.BigQueryExportOrBuilder>(
                getBigQueryExport(), getParentForChildren(), isClean());
        bigQueryExport_ = null;
      }
      return bigQueryExportBuilder_;
    }

    private java.lang.Object bigQueryExportId_ = "";
    /**
     *
     *
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * It must consist of lower case letters, numbers, and hyphen, with the first
     * character a letter, the last a letter or a number, and a 63 character
     * maximum.
     * </pre>
     *
     * <code>string big_query_export_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bigQueryExportId.
     */
    public java.lang.String getBigQueryExportId() {
      java.lang.Object ref = bigQueryExportId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bigQueryExportId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * It must consist of lower case letters, numbers, and hyphen, with the first
     * character a letter, the last a letter or a number, and a 63 character
     * maximum.
     * </pre>
     *
     * <code>string big_query_export_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for bigQueryExportId.
     */
    public com.google.protobuf.ByteString getBigQueryExportIdBytes() {
      java.lang.Object ref = bigQueryExportId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        bigQueryExportId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * It must consist of lower case letters, numbers, and hyphen, with the first
     * character a letter, the last a letter or a number, and a 63 character
     * maximum.
     * </pre>
     *
     * <code>string big_query_export_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bigQueryExportId to set.
     * @return This builder for chaining.
     */
    public Builder setBigQueryExportId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bigQueryExportId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * It must consist of lower case letters, numbers, and hyphen, with the first
     * character a letter, the last a letter or a number, and a 63 character
     * maximum.
     * </pre>
     *
     * <code>string big_query_export_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBigQueryExportId() {
      bigQueryExportId_ = getDefaultInstance().getBigQueryExportId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Unique identifier provided by the client within the parent scope.
     * It must consist of lower case letters, numbers, and hyphen, with the first
     * character a letter, the last a letter or a number, and a 63 character
     * maximum.
     * </pre>
     *
     * <code>string big_query_export_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for bigQueryExportId to set.
     * @return This builder for chaining.
     */
    public Builder setBigQueryExportIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bigQueryExportId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.CreateBigQueryExportRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.CreateBigQueryExportRequest)
  private static final com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest();
  }

  public static com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBigQueryExportRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateBigQueryExportRequest>() {
        @java.lang.Override
        public CreateBigQueryExportRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateBigQueryExportRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBigQueryExportRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
