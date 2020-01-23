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
// source: google/cloud/datacatalog/v1beta1/policytagmanager.proto

package com.google.cloud.datacatalog.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [UpdatePolicyTag][google.cloud.datacatalog.v1beta1.PolicyTagManager.UpdatePolicyTag].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest}
 */
public final class UpdatePolicyTagRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest)
    UpdatePolicyTagRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdatePolicyTagRequest.newBuilder() to construct.
  private UpdatePolicyTagRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdatePolicyTagRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdatePolicyTagRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdatePolicyTagRequest(
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
              com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder subBuilder = null;
              if (policyTag_ != null) {
                subBuilder = policyTag_.toBuilder();
              }
              policyTag_ =
                  input.readMessage(
                      com.google.cloud.datacatalog.v1beta1.PolicyTag.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(policyTag_);
                policyTag_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
        .internal_static_google_cloud_datacatalog_v1beta1_UpdatePolicyTagRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
        .internal_static_google_cloud_datacatalog_v1beta1_UpdatePolicyTagRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest.class,
            com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest.Builder.class);
  }

  public static final int POLICY_TAG_FIELD_NUMBER = 1;
  private com.google.cloud.datacatalog.v1beta1.PolicyTag policyTag_;
  /**
   *
   *
   * <pre>
   * The policy tag to update. Only the description, display_name, and
   * parent_policy_tag fields can be updated.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 1;</code>
   *
   * @return Whether the policyTag field is set.
   */
  public boolean hasPolicyTag() {
    return policyTag_ != null;
  }
  /**
   *
   *
   * <pre>
   * The policy tag to update. Only the description, display_name, and
   * parent_policy_tag fields can be updated.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 1;</code>
   *
   * @return The policyTag.
   */
  public com.google.cloud.datacatalog.v1beta1.PolicyTag getPolicyTag() {
    return policyTag_ == null
        ? com.google.cloud.datacatalog.v1beta1.PolicyTag.getDefaultInstance()
        : policyTag_;
  }
  /**
   *
   *
   * <pre>
   * The policy tag to update. Only the description, display_name, and
   * parent_policy_tag fields can be updated.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 1;</code>
   */
  public com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder getPolicyTagOrBuilder() {
    return getPolicyTag();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource. Only display_name, description and
   * parent_policy_tag can be updated and thus can be listed in the mask. If
   * update_mask is not provided, all allowed fields (i.e. display_name,
   * description and parent) will be updated. For more information including the
   * `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If not set, defaults to all of the fields that are allowed to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource. Only display_name, description and
   * parent_policy_tag can be updated and thus can be listed in the mask. If
   * update_mask is not provided, all allowed fields (i.e. display_name,
   * description and parent) will be updated. For more information including the
   * `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If not set, defaults to all of the fields that are allowed to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource. Only display_name, description and
   * parent_policy_tag can be updated and thus can be listed in the mask. If
   * update_mask is not provided, all allowed fields (i.e. display_name,
   * description and parent) will be updated. For more information including the
   * `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If not set, defaults to all of the fields that are allowed to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (policyTag_ != null) {
      output.writeMessage(1, getPolicyTag());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (policyTag_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPolicyTag());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest other =
        (com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest) obj;

    if (hasPolicyTag() != other.hasPolicyTag()) return false;
    if (hasPolicyTag()) {
      if (!getPolicyTag().equals(other.getPolicyTag())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasPolicyTag()) {
      hash = (37 * hash) + POLICY_TAG_FIELD_NUMBER;
      hash = (53 * hash) + getPolicyTag().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest parseFrom(
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
      com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest prototype) {
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
   * [UpdatePolicyTag][google.cloud.datacatalog.v1beta1.PolicyTagManager.UpdatePolicyTag].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest)
      com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_UpdatePolicyTagRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_UpdatePolicyTagRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest.class,
              com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest.newBuilder()
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
      if (policyTagBuilder_ == null) {
        policyTag_ = null;
      } else {
        policyTag_ = null;
        policyTagBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_UpdatePolicyTagRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest build() {
      com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest buildPartial() {
      com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest result =
          new com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest(this);
      if (policyTagBuilder_ == null) {
        result.policyTag_ = policyTag_;
      } else {
        result.policyTag_ = policyTagBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest other) {
      if (other == com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest.getDefaultInstance())
        return this;
      if (other.hasPolicyTag()) {
        mergePolicyTag(other.getPolicyTag());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.datacatalog.v1beta1.PolicyTag policyTag_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.PolicyTag,
            com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder,
            com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder>
        policyTagBuilder_;
    /**
     *
     *
     * <pre>
     * The policy tag to update. Only the description, display_name, and
     * parent_policy_tag fields can be updated.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 1;</code>
     *
     * @return Whether the policyTag field is set.
     */
    public boolean hasPolicyTag() {
      return policyTagBuilder_ != null || policyTag_ != null;
    }
    /**
     *
     *
     * <pre>
     * The policy tag to update. Only the description, display_name, and
     * parent_policy_tag fields can be updated.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 1;</code>
     *
     * @return The policyTag.
     */
    public com.google.cloud.datacatalog.v1beta1.PolicyTag getPolicyTag() {
      if (policyTagBuilder_ == null) {
        return policyTag_ == null
            ? com.google.cloud.datacatalog.v1beta1.PolicyTag.getDefaultInstance()
            : policyTag_;
      } else {
        return policyTagBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The policy tag to update. Only the description, display_name, and
     * parent_policy_tag fields can be updated.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 1;</code>
     */
    public Builder setPolicyTag(com.google.cloud.datacatalog.v1beta1.PolicyTag value) {
      if (policyTagBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policyTag_ = value;
        onChanged();
      } else {
        policyTagBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tag to update. Only the description, display_name, and
     * parent_policy_tag fields can be updated.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 1;</code>
     */
    public Builder setPolicyTag(
        com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder builderForValue) {
      if (policyTagBuilder_ == null) {
        policyTag_ = builderForValue.build();
        onChanged();
      } else {
        policyTagBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tag to update. Only the description, display_name, and
     * parent_policy_tag fields can be updated.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 1;</code>
     */
    public Builder mergePolicyTag(com.google.cloud.datacatalog.v1beta1.PolicyTag value) {
      if (policyTagBuilder_ == null) {
        if (policyTag_ != null) {
          policyTag_ =
              com.google.cloud.datacatalog.v1beta1.PolicyTag.newBuilder(policyTag_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          policyTag_ = value;
        }
        onChanged();
      } else {
        policyTagBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tag to update. Only the description, display_name, and
     * parent_policy_tag fields can be updated.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 1;</code>
     */
    public Builder clearPolicyTag() {
      if (policyTagBuilder_ == null) {
        policyTag_ = null;
        onChanged();
      } else {
        policyTag_ = null;
        policyTagBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tag to update. Only the description, display_name, and
     * parent_policy_tag fields can be updated.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder getPolicyTagBuilder() {

      onChanged();
      return getPolicyTagFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The policy tag to update. Only the description, display_name, and
     * parent_policy_tag fields can be updated.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder getPolicyTagOrBuilder() {
      if (policyTagBuilder_ != null) {
        return policyTagBuilder_.getMessageOrBuilder();
      } else {
        return policyTag_ == null
            ? com.google.cloud.datacatalog.v1beta1.PolicyTag.getDefaultInstance()
            : policyTag_;
      }
    }
    /**
     *
     *
     * <pre>
     * The policy tag to update. Only the description, display_name, and
     * parent_policy_tag fields can be updated.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.PolicyTag,
            com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder,
            com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder>
        getPolicyTagFieldBuilder() {
      if (policyTagBuilder_ == null) {
        policyTagBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1beta1.PolicyTag,
                com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder,
                com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder>(
                getPolicyTag(), getParentForChildren(), isClean());
        policyTag_ = null;
      }
      return policyTagBuilder_;
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
     * The update mask applies to the resource. Only display_name, description and
     * parent_policy_tag can be updated and thus can be listed in the mask. If
     * update_mask is not provided, all allowed fields (i.e. display_name,
     * description and parent) will be updated. For more information including the
     * `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If not set, defaults to all of the fields that are allowed to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource. Only display_name, description and
     * parent_policy_tag can be updated and thus can be listed in the mask. If
     * update_mask is not provided, all allowed fields (i.e. display_name,
     * description and parent) will be updated. For more information including the
     * `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If not set, defaults to all of the fields that are allowed to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The update mask applies to the resource. Only display_name, description and
     * parent_policy_tag can be updated and thus can be listed in the mask. If
     * update_mask is not provided, all allowed fields (i.e. display_name,
     * description and parent) will be updated. For more information including the
     * `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If not set, defaults to all of the fields that are allowed to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource. Only display_name, description and
     * parent_policy_tag can be updated and thus can be listed in the mask. If
     * update_mask is not provided, all allowed fields (i.e. display_name,
     * description and parent) will be updated. For more information including the
     * `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If not set, defaults to all of the fields that are allowed to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource. Only display_name, description and
     * parent_policy_tag can be updated and thus can be listed in the mask. If
     * update_mask is not provided, all allowed fields (i.e. display_name,
     * description and parent) will be updated. For more information including the
     * `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If not set, defaults to all of the fields that are allowed to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource. Only display_name, description and
     * parent_policy_tag can be updated and thus can be listed in the mask. If
     * update_mask is not provided, all allowed fields (i.e. display_name,
     * description and parent) will be updated. For more information including the
     * `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If not set, defaults to all of the fields that are allowed to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource. Only display_name, description and
     * parent_policy_tag can be updated and thus can be listed in the mask. If
     * update_mask is not provided, all allowed fields (i.e. display_name,
     * description and parent) will be updated. For more information including the
     * `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If not set, defaults to all of the fields that are allowed to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The update mask applies to the resource. Only display_name, description and
     * parent_policy_tag can be updated and thus can be listed in the mask. If
     * update_mask is not provided, all allowed fields (i.e. display_name,
     * description and parent) will be updated. For more information including the
     * `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If not set, defaults to all of the fields that are allowed to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * The update mask applies to the resource. Only display_name, description and
     * parent_policy_tag can be updated and thus can be listed in the mask. If
     * update_mask is not provided, all allowed fields (i.e. display_name,
     * description and parent) will be updated. For more information including the
     * `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If not set, defaults to all of the fields that are allowed to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest)
  private static final com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest();
  }

  public static com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePolicyTagRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdatePolicyTagRequest>() {
        @java.lang.Override
        public UpdatePolicyTagRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdatePolicyTagRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdatePolicyTagRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePolicyTagRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.UpdatePolicyTagRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
