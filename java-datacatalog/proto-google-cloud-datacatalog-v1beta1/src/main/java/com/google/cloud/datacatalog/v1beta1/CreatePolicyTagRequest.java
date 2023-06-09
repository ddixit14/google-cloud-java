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
 * [CreatePolicyTag][google.cloud.datacatalog.v1beta1.PolicyTagManager.CreatePolicyTag].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest}
 */
public final class CreatePolicyTagRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest)
    CreatePolicyTagRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreatePolicyTagRequest.newBuilder() to construct.
  private CreatePolicyTagRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreatePolicyTagRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreatePolicyTagRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
        .internal_static_google_cloud_datacatalog_v1beta1_CreatePolicyTagRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
        .internal_static_google_cloud_datacatalog_v1beta1_CreatePolicyTagRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest.class,
            com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Resource name of the taxonomy that the policy tag will belong to.
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
   * Required. Resource name of the taxonomy that the policy tag will belong to.
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

  public static final int POLICY_TAG_FIELD_NUMBER = 2;
  private com.google.cloud.datacatalog.v1beta1.PolicyTag policyTag_;
  /**
   *
   *
   * <pre>
   * The policy tag to be created.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 2;</code>
   *
   * @return Whether the policyTag field is set.
   */
  @java.lang.Override
  public boolean hasPolicyTag() {
    return policyTag_ != null;
  }
  /**
   *
   *
   * <pre>
   * The policy tag to be created.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 2;</code>
   *
   * @return The policyTag.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.PolicyTag getPolicyTag() {
    return policyTag_ == null
        ? com.google.cloud.datacatalog.v1beta1.PolicyTag.getDefaultInstance()
        : policyTag_;
  }
  /**
   *
   *
   * <pre>
   * The policy tag to be created.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder getPolicyTagOrBuilder() {
    return policyTag_ == null
        ? com.google.cloud.datacatalog.v1beta1.PolicyTag.getDefaultInstance()
        : policyTag_;
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
    if (policyTag_ != null) {
      output.writeMessage(2, getPolicyTag());
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
    if (policyTag_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPolicyTag());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest other =
        (com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasPolicyTag() != other.hasPolicyTag()) return false;
    if (hasPolicyTag()) {
      if (!getPolicyTag().equals(other.getPolicyTag())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasPolicyTag()) {
      hash = (37 * hash) + POLICY_TAG_FIELD_NUMBER;
      hash = (53 * hash) + getPolicyTag().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest parseFrom(
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
      com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest prototype) {
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
   * [CreatePolicyTag][google.cloud.datacatalog.v1beta1.PolicyTagManager.CreatePolicyTag].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest)
      com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_CreatePolicyTagRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_CreatePolicyTagRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest.class,
              com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      policyTag_ = null;
      if (policyTagBuilder_ != null) {
        policyTagBuilder_.dispose();
        policyTagBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_CreatePolicyTagRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest build() {
      com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest buildPartial() {
      com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest result =
          new com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.policyTag_ = policyTagBuilder_ == null ? policyTag_ : policyTagBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest) {
        return mergeFrom((com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest other) {
      if (other == com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPolicyTag()) {
        mergePolicyTag(other.getPolicyTag());
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
                input.readMessage(getPolicyTagFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Resource name of the taxonomy that the policy tag will belong to.
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
     * Required. Resource name of the taxonomy that the policy tag will belong to.
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
     * Required. Resource name of the taxonomy that the policy tag will belong to.
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
     * Required. Resource name of the taxonomy that the policy tag will belong to.
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
     * Required. Resource name of the taxonomy that the policy tag will belong to.
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
     * The policy tag to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 2;</code>
     *
     * @return Whether the policyTag field is set.
     */
    public boolean hasPolicyTag() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The policy tag to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 2;</code>
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
     * The policy tag to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 2;</code>
     */
    public Builder setPolicyTag(com.google.cloud.datacatalog.v1beta1.PolicyTag value) {
      if (policyTagBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policyTag_ = value;
      } else {
        policyTagBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tag to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 2;</code>
     */
    public Builder setPolicyTag(
        com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder builderForValue) {
      if (policyTagBuilder_ == null) {
        policyTag_ = builderForValue.build();
      } else {
        policyTagBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tag to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 2;</code>
     */
    public Builder mergePolicyTag(com.google.cloud.datacatalog.v1beta1.PolicyTag value) {
      if (policyTagBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && policyTag_ != null
            && policyTag_ != com.google.cloud.datacatalog.v1beta1.PolicyTag.getDefaultInstance()) {
          getPolicyTagBuilder().mergeFrom(value);
        } else {
          policyTag_ = value;
        }
      } else {
        policyTagBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tag to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 2;</code>
     */
    public Builder clearPolicyTag() {
      bitField0_ = (bitField0_ & ~0x00000002);
      policyTag_ = null;
      if (policyTagBuilder_ != null) {
        policyTagBuilder_.dispose();
        policyTagBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tag to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 2;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder getPolicyTagBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPolicyTagFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The policy tag to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 2;</code>
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
     * The policy tag to be created.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.PolicyTag policy_tag = 2;</code>
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest)
  private static final com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest();
  }

  public static com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePolicyTagRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreatePolicyTagRequest>() {
        @java.lang.Override
        public CreatePolicyTagRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePolicyTagRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePolicyTagRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.CreatePolicyTagRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
