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
// source: google/cloud/clouddms/v1/clouddms.proto

package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * Request message for 'SearchBackgroundJobs' request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.SearchBackgroundJobsRequest}
 */
public final class SearchBackgroundJobsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.SearchBackgroundJobsRequest)
    SearchBackgroundJobsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchBackgroundJobsRequest.newBuilder() to construct.
  private SearchBackgroundJobsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchBackgroundJobsRequest() {
    conversionWorkspace_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchBackgroundJobsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.clouddms.v1.ClouddmsProto
        .internal_static_google_cloud_clouddms_v1_SearchBackgroundJobsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ClouddmsProto
        .internal_static_google_cloud_clouddms_v1_SearchBackgroundJobsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest.class,
            com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest.Builder.class);
  }

  public static final int CONVERSION_WORKSPACE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object conversionWorkspace_ = "";
  /**
   *
   *
   * <pre>
   * Required. Name of the conversion workspace resource whose jobs are listed,
   * in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
   * </pre>
   *
   * <code>
   * string conversion_workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The conversionWorkspace.
   */
  @java.lang.Override
  public java.lang.String getConversionWorkspace() {
    java.lang.Object ref = conversionWorkspace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      conversionWorkspace_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Name of the conversion workspace resource whose jobs are listed,
   * in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
   * </pre>
   *
   * <code>
   * string conversion_workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for conversionWorkspace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getConversionWorkspaceBytes() {
    java.lang.Object ref = conversionWorkspace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      conversionWorkspace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RETURN_MOST_RECENT_PER_JOB_TYPE_FIELD_NUMBER = 2;
  private boolean returnMostRecentPerJobType_ = false;
  /**
   *
   *
   * <pre>
   * Optional. Whether or not to return just the most recent job per job type,
   * </pre>
   *
   * <code>bool return_most_recent_per_job_type = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The returnMostRecentPerJobType.
   */
  @java.lang.Override
  public boolean getReturnMostRecentPerJobType() {
    return returnMostRecentPerJobType_;
  }

  public static final int MAX_SIZE_FIELD_NUMBER = 3;
  private int maxSize_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The maximum number of jobs to return. The service may return
   * fewer than this value. If unspecified, at most 100 jobs are
   * returned. The maximum value is 100; values above 100 are coerced to
   * 100.
   * </pre>
   *
   * <code>int32 max_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxSize.
   */
  @java.lang.Override
  public int getMaxSize() {
    return maxSize_;
  }

  public static final int COMPLETED_UNTIL_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp completedUntilTime_;
  /**
   *
   *
   * <pre>
   * Optional. If provided, only returns jobs that completed until (not
   * including) the given timestamp.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp completed_until_time = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the completedUntilTime field is set.
   */
  @java.lang.Override
  public boolean hasCompletedUntilTime() {
    return completedUntilTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. If provided, only returns jobs that completed until (not
   * including) the given timestamp.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp completed_until_time = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The completedUntilTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCompletedUntilTime() {
    return completedUntilTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : completedUntilTime_;
  }
  /**
   *
   *
   * <pre>
   * Optional. If provided, only returns jobs that completed until (not
   * including) the given timestamp.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp completed_until_time = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCompletedUntilTimeOrBuilder() {
    return completedUntilTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : completedUntilTime_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversionWorkspace_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, conversionWorkspace_);
    }
    if (returnMostRecentPerJobType_ != false) {
      output.writeBool(2, returnMostRecentPerJobType_);
    }
    if (maxSize_ != 0) {
      output.writeInt32(3, maxSize_);
    }
    if (completedUntilTime_ != null) {
      output.writeMessage(4, getCompletedUntilTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversionWorkspace_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, conversionWorkspace_);
    }
    if (returnMostRecentPerJobType_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, returnMostRecentPerJobType_);
    }
    if (maxSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, maxSize_);
    }
    if (completedUntilTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getCompletedUntilTime());
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest other =
        (com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest) obj;

    if (!getConversionWorkspace().equals(other.getConversionWorkspace())) return false;
    if (getReturnMostRecentPerJobType() != other.getReturnMostRecentPerJobType()) return false;
    if (getMaxSize() != other.getMaxSize()) return false;
    if (hasCompletedUntilTime() != other.hasCompletedUntilTime()) return false;
    if (hasCompletedUntilTime()) {
      if (!getCompletedUntilTime().equals(other.getCompletedUntilTime())) return false;
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
    hash = (37 * hash) + CONVERSION_WORKSPACE_FIELD_NUMBER;
    hash = (53 * hash) + getConversionWorkspace().hashCode();
    hash = (37 * hash) + RETURN_MOST_RECENT_PER_JOB_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getReturnMostRecentPerJobType());
    hash = (37 * hash) + MAX_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getMaxSize();
    if (hasCompletedUntilTime()) {
      hash = (37 * hash) + COMPLETED_UNTIL_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCompletedUntilTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest parseFrom(
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
      com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest prototype) {
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
   * Request message for 'SearchBackgroundJobs' request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.SearchBackgroundJobsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.SearchBackgroundJobsRequest)
      com.google.cloud.clouddms.v1.SearchBackgroundJobsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.clouddms.v1.ClouddmsProto
          .internal_static_google_cloud_clouddms_v1_SearchBackgroundJobsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ClouddmsProto
          .internal_static_google_cloud_clouddms_v1_SearchBackgroundJobsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest.class,
              com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      conversionWorkspace_ = "";
      returnMostRecentPerJobType_ = false;
      maxSize_ = 0;
      completedUntilTime_ = null;
      if (completedUntilTimeBuilder_ != null) {
        completedUntilTimeBuilder_.dispose();
        completedUntilTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ClouddmsProto
          .internal_static_google_cloud_clouddms_v1_SearchBackgroundJobsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest build() {
      com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest buildPartial() {
      com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest result =
          new com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.conversionWorkspace_ = conversionWorkspace_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.returnMostRecentPerJobType_ = returnMostRecentPerJobType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxSize_ = maxSize_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.completedUntilTime_ =
            completedUntilTimeBuilder_ == null
                ? completedUntilTime_
                : completedUntilTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest) {
        return mergeFrom((com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest other) {
      if (other == com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest.getDefaultInstance())
        return this;
      if (!other.getConversionWorkspace().isEmpty()) {
        conversionWorkspace_ = other.conversionWorkspace_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getReturnMostRecentPerJobType() != false) {
        setReturnMostRecentPerJobType(other.getReturnMostRecentPerJobType());
      }
      if (other.getMaxSize() != 0) {
        setMaxSize(other.getMaxSize());
      }
      if (other.hasCompletedUntilTime()) {
        mergeCompletedUntilTime(other.getCompletedUntilTime());
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
                conversionWorkspace_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                returnMostRecentPerJobType_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                maxSize_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                input.readMessage(
                    getCompletedUntilTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private java.lang.Object conversionWorkspace_ = "";
    /**
     *
     *
     * <pre>
     * Required. Name of the conversion workspace resource whose jobs are listed,
     * in the form of:
     * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
     * </pre>
     *
     * <code>
     * string conversion_workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The conversionWorkspace.
     */
    public java.lang.String getConversionWorkspace() {
      java.lang.Object ref = conversionWorkspace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        conversionWorkspace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the conversion workspace resource whose jobs are listed,
     * in the form of:
     * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
     * </pre>
     *
     * <code>
     * string conversion_workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for conversionWorkspace.
     */
    public com.google.protobuf.ByteString getConversionWorkspaceBytes() {
      java.lang.Object ref = conversionWorkspace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        conversionWorkspace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the conversion workspace resource whose jobs are listed,
     * in the form of:
     * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
     * </pre>
     *
     * <code>
     * string conversion_workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The conversionWorkspace to set.
     * @return This builder for chaining.
     */
    public Builder setConversionWorkspace(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      conversionWorkspace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the conversion workspace resource whose jobs are listed,
     * in the form of:
     * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
     * </pre>
     *
     * <code>
     * string conversion_workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConversionWorkspace() {
      conversionWorkspace_ = getDefaultInstance().getConversionWorkspace();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Name of the conversion workspace resource whose jobs are listed,
     * in the form of:
     * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
     * </pre>
     *
     * <code>
     * string conversion_workspace = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for conversionWorkspace to set.
     * @return This builder for chaining.
     */
    public Builder setConversionWorkspaceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      conversionWorkspace_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean returnMostRecentPerJobType_;
    /**
     *
     *
     * <pre>
     * Optional. Whether or not to return just the most recent job per job type,
     * </pre>
     *
     * <code>bool return_most_recent_per_job_type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The returnMostRecentPerJobType.
     */
    @java.lang.Override
    public boolean getReturnMostRecentPerJobType() {
      return returnMostRecentPerJobType_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Whether or not to return just the most recent job per job type,
     * </pre>
     *
     * <code>bool return_most_recent_per_job_type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The returnMostRecentPerJobType to set.
     * @return This builder for chaining.
     */
    public Builder setReturnMostRecentPerJobType(boolean value) {

      returnMostRecentPerJobType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Whether or not to return just the most recent job per job type,
     * </pre>
     *
     * <code>bool return_most_recent_per_job_type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReturnMostRecentPerJobType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      returnMostRecentPerJobType_ = false;
      onChanged();
      return this;
    }

    private int maxSize_;
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of jobs to return. The service may return
     * fewer than this value. If unspecified, at most 100 jobs are
     * returned. The maximum value is 100; values above 100 are coerced to
     * 100.
     * </pre>
     *
     * <code>int32 max_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The maxSize.
     */
    @java.lang.Override
    public int getMaxSize() {
      return maxSize_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of jobs to return. The service may return
     * fewer than this value. If unspecified, at most 100 jobs are
     * returned. The maximum value is 100; values above 100 are coerced to
     * 100.
     * </pre>
     *
     * <code>int32 max_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The maxSize to set.
     * @return This builder for chaining.
     */
    public Builder setMaxSize(int value) {

      maxSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of jobs to return. The service may return
     * fewer than this value. If unspecified, at most 100 jobs are
     * returned. The maximum value is 100; values above 100 are coerced to
     * 100.
     * </pre>
     *
     * <code>int32 max_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxSize_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp completedUntilTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        completedUntilTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. If provided, only returns jobs that completed until (not
     * including) the given timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp completed_until_time = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the completedUntilTime field is set.
     */
    public boolean hasCompletedUntilTime() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. If provided, only returns jobs that completed until (not
     * including) the given timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp completed_until_time = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The completedUntilTime.
     */
    public com.google.protobuf.Timestamp getCompletedUntilTime() {
      if (completedUntilTimeBuilder_ == null) {
        return completedUntilTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : completedUntilTime_;
      } else {
        return completedUntilTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. If provided, only returns jobs that completed until (not
     * including) the given timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp completed_until_time = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setCompletedUntilTime(com.google.protobuf.Timestamp value) {
      if (completedUntilTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        completedUntilTime_ = value;
      } else {
        completedUntilTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If provided, only returns jobs that completed until (not
     * including) the given timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp completed_until_time = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setCompletedUntilTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (completedUntilTimeBuilder_ == null) {
        completedUntilTime_ = builderForValue.build();
      } else {
        completedUntilTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If provided, only returns jobs that completed until (not
     * including) the given timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp completed_until_time = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeCompletedUntilTime(com.google.protobuf.Timestamp value) {
      if (completedUntilTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)
            && completedUntilTime_ != null
            && completedUntilTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getCompletedUntilTimeBuilder().mergeFrom(value);
        } else {
          completedUntilTime_ = value;
        }
      } else {
        completedUntilTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If provided, only returns jobs that completed until (not
     * including) the given timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp completed_until_time = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearCompletedUntilTime() {
      bitField0_ = (bitField0_ & ~0x00000008);
      completedUntilTime_ = null;
      if (completedUntilTimeBuilder_ != null) {
        completedUntilTimeBuilder_.dispose();
        completedUntilTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. If provided, only returns jobs that completed until (not
     * including) the given timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp completed_until_time = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.Timestamp.Builder getCompletedUntilTimeBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getCompletedUntilTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. If provided, only returns jobs that completed until (not
     * including) the given timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp completed_until_time = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.TimestampOrBuilder getCompletedUntilTimeOrBuilder() {
      if (completedUntilTimeBuilder_ != null) {
        return completedUntilTimeBuilder_.getMessageOrBuilder();
      } else {
        return completedUntilTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : completedUntilTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. If provided, only returns jobs that completed until (not
     * including) the given timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp completed_until_time = 4 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getCompletedUntilTimeFieldBuilder() {
      if (completedUntilTimeBuilder_ == null) {
        completedUntilTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getCompletedUntilTime(), getParentForChildren(), isClean());
        completedUntilTime_ = null;
      }
      return completedUntilTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.SearchBackgroundJobsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.SearchBackgroundJobsRequest)
  private static final com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest();
  }

  public static com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchBackgroundJobsRequest> PARSER =
      new com.google.protobuf.AbstractParser<SearchBackgroundJobsRequest>() {
        @java.lang.Override
        public SearchBackgroundJobsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchBackgroundJobsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchBackgroundJobsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.SearchBackgroundJobsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
