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
// source: google/dataflow/v1beta3/jobs.proto

package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Request to update a Cloud Dataflow job.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.UpdateJobRequest}
 */
public final class UpdateJobRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.UpdateJobRequest)
    UpdateJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateJobRequest.newBuilder() to construct.
  private UpdateJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateJobRequest() {
    projectId_ = "";
    jobId_ = "";
    location_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateJobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.JobsProto
        .internal_static_google_dataflow_v1beta3_UpdateJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.JobsProto
        .internal_static_google_dataflow_v1beta3_UpdateJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.UpdateJobRequest.class,
            com.google.dataflow.v1beta3.UpdateJobRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object projectId_ = "";
  /**
   *
   *
   * <pre>
   * The ID of the Cloud Platform project that the job belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ID of the Cloud Platform project that the job belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object jobId_ = "";
  /**
   *
   *
   * <pre>
   * The job ID.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   *
   * @return The jobId.
   */
  @java.lang.Override
  public java.lang.String getJobId() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The job ID.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   *
   * @return The bytes for jobId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getJobIdBytes() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      jobId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_FIELD_NUMBER = 3;
  private com.google.dataflow.v1beta3.Job job_;
  /**
   *
   *
   * <pre>
   * The updated job.
   * Only the job state is updatable; other fields will be ignored.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.Job job = 3;</code>
   *
   * @return Whether the job field is set.
   */
  @java.lang.Override
  public boolean hasJob() {
    return job_ != null;
  }
  /**
   *
   *
   * <pre>
   * The updated job.
   * Only the job state is updatable; other fields will be ignored.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.Job job = 3;</code>
   *
   * @return The job.
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.Job getJob() {
    return job_ == null ? com.google.dataflow.v1beta3.Job.getDefaultInstance() : job_;
  }
  /**
   *
   *
   * <pre>
   * The updated job.
   * Only the job state is updatable; other fields will be ignored.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.Job job = 3;</code>
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.JobOrBuilder getJobOrBuilder() {
    return job_ == null ? com.google.dataflow.v1beta3.Job.getDefaultInstance() : job_;
  }

  public static final int LOCATION_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object location_ = "";
  /**
   *
   *
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * contains this job.
   * </pre>
   *
   * <code>string location = 4;</code>
   *
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * contains this job.
   * </pre>
   *
   * <code>string location = 4;</code>
   *
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      location_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jobId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, jobId_);
    }
    if (job_ != null) {
      output.writeMessage(3, getJob());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, location_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jobId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, jobId_);
    }
    if (job_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getJob());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, location_);
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
    if (!(obj instanceof com.google.dataflow.v1beta3.UpdateJobRequest)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.UpdateJobRequest other =
        (com.google.dataflow.v1beta3.UpdateJobRequest) obj;

    if (!getProjectId().equals(other.getProjectId())) return false;
    if (!getJobId().equals(other.getJobId())) return false;
    if (hasJob() != other.hasJob()) return false;
    if (hasJob()) {
      if (!getJob().equals(other.getJob())) return false;
    }
    if (!getLocation().equals(other.getLocation())) return false;
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + JOB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJobId().hashCode();
    if (hasJob()) {
      hash = (37 * hash) + JOB_FIELD_NUMBER;
      hash = (53 * hash) + getJob().hashCode();
    }
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.UpdateJobRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.UpdateJobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.UpdateJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.UpdateJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.UpdateJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.UpdateJobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.UpdateJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.UpdateJobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.UpdateJobRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.UpdateJobRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.UpdateJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.UpdateJobRequest parseFrom(
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

  public static Builder newBuilder(com.google.dataflow.v1beta3.UpdateJobRequest prototype) {
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
   * Request to update a Cloud Dataflow job.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.UpdateJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.UpdateJobRequest)
      com.google.dataflow.v1beta3.UpdateJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_UpdateJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_UpdateJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.UpdateJobRequest.class,
              com.google.dataflow.v1beta3.UpdateJobRequest.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.UpdateJobRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      projectId_ = "";
      jobId_ = "";
      job_ = null;
      if (jobBuilder_ != null) {
        jobBuilder_.dispose();
        jobBuilder_ = null;
      }
      location_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_UpdateJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.UpdateJobRequest getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.UpdateJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.UpdateJobRequest build() {
      com.google.dataflow.v1beta3.UpdateJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.UpdateJobRequest buildPartial() {
      com.google.dataflow.v1beta3.UpdateJobRequest result =
          new com.google.dataflow.v1beta3.UpdateJobRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.dataflow.v1beta3.UpdateJobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.projectId_ = projectId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.jobId_ = jobId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.job_ = jobBuilder_ == null ? job_ : jobBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.location_ = location_;
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
      if (other instanceof com.google.dataflow.v1beta3.UpdateJobRequest) {
        return mergeFrom((com.google.dataflow.v1beta3.UpdateJobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.UpdateJobRequest other) {
      if (other == com.google.dataflow.v1beta3.UpdateJobRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getJobId().isEmpty()) {
        jobId_ = other.jobId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasJob()) {
        mergeJob(other.getJob());
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        bitField0_ |= 0x00000008;
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
                projectId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                jobId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getJobFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 34:
              {
                location_ = input.readStringRequireUtf8();
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

    private java.lang.Object projectId_ = "";
    /**
     *
     *
     * <pre>
     * The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      projectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      projectId_ = getDefaultInstance().getProjectId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      projectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object jobId_ = "";
    /**
     *
     *
     * <pre>
     * The job ID.
     * </pre>
     *
     * <code>string job_id = 2;</code>
     *
     * @return The jobId.
     */
    public java.lang.String getJobId() {
      java.lang.Object ref = jobId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The job ID.
     * </pre>
     *
     * <code>string job_id = 2;</code>
     *
     * @return The bytes for jobId.
     */
    public com.google.protobuf.ByteString getJobIdBytes() {
      java.lang.Object ref = jobId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        jobId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The job ID.
     * </pre>
     *
     * <code>string job_id = 2;</code>
     *
     * @param value The jobId to set.
     * @return This builder for chaining.
     */
    public Builder setJobId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      jobId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The job ID.
     * </pre>
     *
     * <code>string job_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearJobId() {
      jobId_ = getDefaultInstance().getJobId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The job ID.
     * </pre>
     *
     * <code>string job_id = 2;</code>
     *
     * @param value The bytes for jobId to set.
     * @return This builder for chaining.
     */
    public Builder setJobIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      jobId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.dataflow.v1beta3.Job job_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.dataflow.v1beta3.Job,
            com.google.dataflow.v1beta3.Job.Builder,
            com.google.dataflow.v1beta3.JobOrBuilder>
        jobBuilder_;
    /**
     *
     *
     * <pre>
     * The updated job.
     * Only the job state is updatable; other fields will be ignored.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 3;</code>
     *
     * @return Whether the job field is set.
     */
    public boolean hasJob() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The updated job.
     * Only the job state is updatable; other fields will be ignored.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 3;</code>
     *
     * @return The job.
     */
    public com.google.dataflow.v1beta3.Job getJob() {
      if (jobBuilder_ == null) {
        return job_ == null ? com.google.dataflow.v1beta3.Job.getDefaultInstance() : job_;
      } else {
        return jobBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The updated job.
     * Only the job state is updatable; other fields will be ignored.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 3;</code>
     */
    public Builder setJob(com.google.dataflow.v1beta3.Job value) {
      if (jobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        job_ = value;
      } else {
        jobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The updated job.
     * Only the job state is updatable; other fields will be ignored.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 3;</code>
     */
    public Builder setJob(com.google.dataflow.v1beta3.Job.Builder builderForValue) {
      if (jobBuilder_ == null) {
        job_ = builderForValue.build();
      } else {
        jobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The updated job.
     * Only the job state is updatable; other fields will be ignored.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 3;</code>
     */
    public Builder mergeJob(com.google.dataflow.v1beta3.Job value) {
      if (jobBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && job_ != null
            && job_ != com.google.dataflow.v1beta3.Job.getDefaultInstance()) {
          getJobBuilder().mergeFrom(value);
        } else {
          job_ = value;
        }
      } else {
        jobBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The updated job.
     * Only the job state is updatable; other fields will be ignored.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 3;</code>
     */
    public Builder clearJob() {
      bitField0_ = (bitField0_ & ~0x00000004);
      job_ = null;
      if (jobBuilder_ != null) {
        jobBuilder_.dispose();
        jobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The updated job.
     * Only the job state is updatable; other fields will be ignored.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 3;</code>
     */
    public com.google.dataflow.v1beta3.Job.Builder getJobBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getJobFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The updated job.
     * Only the job state is updatable; other fields will be ignored.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 3;</code>
     */
    public com.google.dataflow.v1beta3.JobOrBuilder getJobOrBuilder() {
      if (jobBuilder_ != null) {
        return jobBuilder_.getMessageOrBuilder();
      } else {
        return job_ == null ? com.google.dataflow.v1beta3.Job.getDefaultInstance() : job_;
      }
    }
    /**
     *
     *
     * <pre>
     * The updated job.
     * Only the job state is updatable; other fields will be ignored.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.Job job = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.dataflow.v1beta3.Job,
            com.google.dataflow.v1beta3.Job.Builder,
            com.google.dataflow.v1beta3.JobOrBuilder>
        getJobFieldBuilder() {
      if (jobBuilder_ == null) {
        jobBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.dataflow.v1beta3.Job,
                com.google.dataflow.v1beta3.Job.Builder,
                com.google.dataflow.v1beta3.JobOrBuilder>(
                getJob(), getParentForChildren(), isClean());
        job_ = null;
      }
      return jobBuilder_;
    }

    private java.lang.Object location_ = "";
    /**
     *
     *
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
     * contains this job.
     * </pre>
     *
     * <code>string location = 4;</code>
     *
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
     * contains this job.
     * </pre>
     *
     * <code>string location = 4;</code>
     *
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
     * contains this job.
     * </pre>
     *
     * <code>string location = 4;</code>
     *
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      location_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
     * contains this job.
     * </pre>
     *
     * <code>string location = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      location_ = getDefaultInstance().getLocation();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
     * contains this job.
     * </pre>
     *
     * <code>string location = 4;</code>
     *
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      location_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.UpdateJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.UpdateJobRequest)
  private static final com.google.dataflow.v1beta3.UpdateJobRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.UpdateJobRequest();
  }

  public static com.google.dataflow.v1beta3.UpdateJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateJobRequest>() {
        @java.lang.Override
        public UpdateJobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.UpdateJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
