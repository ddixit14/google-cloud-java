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
// source: google/cloud/aiplatform/v1/metadata_service.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [MetadataService.UpdateExecution][google.cloud.aiplatform.v1.MetadataService.UpdateExecution].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.UpdateExecutionRequest}
 */
public final class UpdateExecutionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.UpdateExecutionRequest)
    UpdateExecutionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateExecutionRequest.newBuilder() to construct.
  private UpdateExecutionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateExecutionRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateExecutionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.MetadataServiceProto
        .internal_static_google_cloud_aiplatform_v1_UpdateExecutionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.MetadataServiceProto
        .internal_static_google_cloud_aiplatform_v1_UpdateExecutionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.UpdateExecutionRequest.class,
            com.google.cloud.aiplatform.v1.UpdateExecutionRequest.Builder.class);
  }

  public static final int EXECUTION_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.Execution execution_;
  /**
   *
   *
   * <pre>
   * Required. The Execution containing updates.
   * The Execution's [Execution.name][google.cloud.aiplatform.v1.Execution.name]
   * field is used to identify the Execution to be updated. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the execution field is set.
   */
  @java.lang.Override
  public boolean hasExecution() {
    return execution_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The Execution containing updates.
   * The Execution's [Execution.name][google.cloud.aiplatform.v1.Execution.name]
   * field is used to identify the Execution to be updated. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The execution.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Execution getExecution() {
    return execution_ == null
        ? com.google.cloud.aiplatform.v1.Execution.getDefaultInstance()
        : execution_;
  }
  /**
   *
   *
   * <pre>
   * Required. The Execution containing updates.
   * The Execution's [Execution.name][google.cloud.aiplatform.v1.Execution.name]
   * field is used to identify the Execution to be updated. Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ExecutionOrBuilder getExecutionOrBuilder() {
    return execution_ == null
        ? com.google.cloud.aiplatform.v1.Execution.getDefaultInstance()
        : execution_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Optional. A FieldMask indicating which fields should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. A FieldMask indicating which fields should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Optional. A FieldMask indicating which fields should be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int ALLOW_MISSING_FIELD_NUMBER = 3;
  private boolean allowMissing_ = false;
  /**
   *
   *
   * <pre>
   * If set to true, and the [Execution][google.cloud.aiplatform.v1.Execution]
   * is not found, a new [Execution][google.cloud.aiplatform.v1.Execution] is
   * created.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   *
   * @return The allowMissing.
   */
  @java.lang.Override
  public boolean getAllowMissing() {
    return allowMissing_;
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
    if (execution_ != null) {
      output.writeMessage(1, getExecution());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    if (allowMissing_ != false) {
      output.writeBool(3, allowMissing_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (execution_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getExecution());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    if (allowMissing_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, allowMissing_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.UpdateExecutionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.UpdateExecutionRequest other =
        (com.google.cloud.aiplatform.v1.UpdateExecutionRequest) obj;

    if (hasExecution() != other.hasExecution()) return false;
    if (hasExecution()) {
      if (!getExecution().equals(other.getExecution())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (getAllowMissing() != other.getAllowMissing()) return false;
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
    if (hasExecution()) {
      hash = (37 * hash) + EXECUTION_FIELD_NUMBER;
      hash = (53 * hash) + getExecution().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + ALLOW_MISSING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowMissing());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.UpdateExecutionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExecutionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExecutionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExecutionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExecutionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExecutionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExecutionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExecutionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExecutionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExecutionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExecutionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExecutionRequest parseFrom(
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
      com.google.cloud.aiplatform.v1.UpdateExecutionRequest prototype) {
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
   * [MetadataService.UpdateExecution][google.cloud.aiplatform.v1.MetadataService.UpdateExecution].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.UpdateExecutionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.UpdateExecutionRequest)
      com.google.cloud.aiplatform.v1.UpdateExecutionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1_UpdateExecutionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1_UpdateExecutionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.UpdateExecutionRequest.class,
              com.google.cloud.aiplatform.v1.UpdateExecutionRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.UpdateExecutionRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      execution_ = null;
      if (executionBuilder_ != null) {
        executionBuilder_.dispose();
        executionBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      allowMissing_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1_UpdateExecutionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateExecutionRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.UpdateExecutionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateExecutionRequest build() {
      com.google.cloud.aiplatform.v1.UpdateExecutionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateExecutionRequest buildPartial() {
      com.google.cloud.aiplatform.v1.UpdateExecutionRequest result =
          new com.google.cloud.aiplatform.v1.UpdateExecutionRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.UpdateExecutionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.execution_ = executionBuilder_ == null ? execution_ : executionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.allowMissing_ = allowMissing_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.UpdateExecutionRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.UpdateExecutionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.UpdateExecutionRequest other) {
      if (other == com.google.cloud.aiplatform.v1.UpdateExecutionRequest.getDefaultInstance())
        return this;
      if (other.hasExecution()) {
        mergeExecution(other.getExecution());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getAllowMissing() != false) {
        setAllowMissing(other.getAllowMissing());
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
                input.readMessage(getExecutionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                allowMissing_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private com.google.cloud.aiplatform.v1.Execution execution_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Execution,
            com.google.cloud.aiplatform.v1.Execution.Builder,
            com.google.cloud.aiplatform.v1.ExecutionOrBuilder>
        executionBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The Execution containing updates.
     * The Execution's [Execution.name][google.cloud.aiplatform.v1.Execution.name]
     * field is used to identify the Execution to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the execution field is set.
     */
    public boolean hasExecution() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The Execution containing updates.
     * The Execution's [Execution.name][google.cloud.aiplatform.v1.Execution.name]
     * field is used to identify the Execution to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The execution.
     */
    public com.google.cloud.aiplatform.v1.Execution getExecution() {
      if (executionBuilder_ == null) {
        return execution_ == null
            ? com.google.cloud.aiplatform.v1.Execution.getDefaultInstance()
            : execution_;
      } else {
        return executionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Execution containing updates.
     * The Execution's [Execution.name][google.cloud.aiplatform.v1.Execution.name]
     * field is used to identify the Execution to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setExecution(com.google.cloud.aiplatform.v1.Execution value) {
      if (executionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        execution_ = value;
      } else {
        executionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Execution containing updates.
     * The Execution's [Execution.name][google.cloud.aiplatform.v1.Execution.name]
     * field is used to identify the Execution to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setExecution(com.google.cloud.aiplatform.v1.Execution.Builder builderForValue) {
      if (executionBuilder_ == null) {
        execution_ = builderForValue.build();
      } else {
        executionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Execution containing updates.
     * The Execution's [Execution.name][google.cloud.aiplatform.v1.Execution.name]
     * field is used to identify the Execution to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeExecution(com.google.cloud.aiplatform.v1.Execution value) {
      if (executionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && execution_ != null
            && execution_ != com.google.cloud.aiplatform.v1.Execution.getDefaultInstance()) {
          getExecutionBuilder().mergeFrom(value);
        } else {
          execution_ = value;
        }
      } else {
        executionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Execution containing updates.
     * The Execution's [Execution.name][google.cloud.aiplatform.v1.Execution.name]
     * field is used to identify the Execution to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearExecution() {
      bitField0_ = (bitField0_ & ~0x00000001);
      execution_ = null;
      if (executionBuilder_ != null) {
        executionBuilder_.dispose();
        executionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Execution containing updates.
     * The Execution's [Execution.name][google.cloud.aiplatform.v1.Execution.name]
     * field is used to identify the Execution to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.Execution.Builder getExecutionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getExecutionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The Execution containing updates.
     * The Execution's [Execution.name][google.cloud.aiplatform.v1.Execution.name]
     * field is used to identify the Execution to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.ExecutionOrBuilder getExecutionOrBuilder() {
      if (executionBuilder_ != null) {
        return executionBuilder_.getMessageOrBuilder();
      } else {
        return execution_ == null
            ? com.google.cloud.aiplatform.v1.Execution.getDefaultInstance()
            : execution_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Execution containing updates.
     * The Execution's [Execution.name][google.cloud.aiplatform.v1.Execution.name]
     * field is used to identify the Execution to be updated. Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/executions/{execution}`
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.Execution execution = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Execution,
            com.google.cloud.aiplatform.v1.Execution.Builder,
            com.google.cloud.aiplatform.v1.ExecutionOrBuilder>
        getExecutionFieldBuilder() {
      if (executionBuilder_ == null) {
        executionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.Execution,
                com.google.cloud.aiplatform.v1.Execution.Builder,
                com.google.cloud.aiplatform.v1.ExecutionOrBuilder>(
                getExecution(), getParentForChildren(), isClean());
        execution_ = null;
      }
      return executionBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A FieldMask indicating which fields should be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private boolean allowMissing_;
    /**
     *
     *
     * <pre>
     * If set to true, and the [Execution][google.cloud.aiplatform.v1.Execution]
     * is not found, a new [Execution][google.cloud.aiplatform.v1.Execution] is
     * created.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     *
     * @return The allowMissing.
     */
    @java.lang.Override
    public boolean getAllowMissing() {
      return allowMissing_;
    }
    /**
     *
     *
     * <pre>
     * If set to true, and the [Execution][google.cloud.aiplatform.v1.Execution]
     * is not found, a new [Execution][google.cloud.aiplatform.v1.Execution] is
     * created.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     *
     * @param value The allowMissing to set.
     * @return This builder for chaining.
     */
    public Builder setAllowMissing(boolean value) {

      allowMissing_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set to true, and the [Execution][google.cloud.aiplatform.v1.Execution]
     * is not found, a new [Execution][google.cloud.aiplatform.v1.Execution] is
     * created.
     * </pre>
     *
     * <code>bool allow_missing = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowMissing() {
      bitField0_ = (bitField0_ & ~0x00000004);
      allowMissing_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.UpdateExecutionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.UpdateExecutionRequest)
  private static final com.google.cloud.aiplatform.v1.UpdateExecutionRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.UpdateExecutionRequest();
  }

  public static com.google.cloud.aiplatform.v1.UpdateExecutionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateExecutionRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateExecutionRequest>() {
        @java.lang.Override
        public UpdateExecutionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateExecutionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateExecutionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.UpdateExecutionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
