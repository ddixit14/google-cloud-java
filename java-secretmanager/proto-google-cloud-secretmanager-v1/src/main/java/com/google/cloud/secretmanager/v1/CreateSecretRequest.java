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
// source: google/cloud/secretmanager/v1/service.proto

package com.google.cloud.secretmanager.v1;

/**
 *
 *
 * <pre>
 * Request message for [SecretManagerService.CreateSecret][google.cloud.secretmanager.v1.SecretManagerService.CreateSecret].
 * </pre>
 *
 * Protobuf type {@code google.cloud.secretmanager.v1.CreateSecretRequest}
 */
public final class CreateSecretRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.secretmanager.v1.CreateSecretRequest)
    CreateSecretRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateSecretRequest.newBuilder() to construct.
  private CreateSecretRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateSecretRequest() {
    parent_ = "";
    secretId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateSecretRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.secretmanager.v1.ServiceProto
        .internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.secretmanager.v1.ServiceProto
        .internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.secretmanager.v1.CreateSecretRequest.class,
            com.google.cloud.secretmanager.v1.CreateSecretRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the project to associate with the
   * [Secret][google.cloud.secretmanager.v1.Secret], in the format `projects/&#42;`.
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
   * Required. The resource name of the project to associate with the
   * [Secret][google.cloud.secretmanager.v1.Secret], in the format `projects/&#42;`.
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

  public static final int SECRET_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object secretId_ = "";
  /**
   *
   *
   * <pre>
   * Required. This must be unique within the project.
   *
   * A secret ID is a string with a maximum length of 255 characters and can
   * contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and
   * underscore (`_`) characters.
   * </pre>
   *
   * <code>string secret_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The secretId.
   */
  @java.lang.Override
  public java.lang.String getSecretId() {
    java.lang.Object ref = secretId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      secretId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. This must be unique within the project.
   *
   * A secret ID is a string with a maximum length of 255 characters and can
   * contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and
   * underscore (`_`) characters.
   * </pre>
   *
   * <code>string secret_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for secretId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSecretIdBytes() {
    java.lang.Object ref = secretId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      secretId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECRET_FIELD_NUMBER = 3;
  private com.google.cloud.secretmanager.v1.Secret secret_;
  /**
   *
   *
   * <pre>
   * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
   * </pre>
   *
   * <code>
   * .google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the secret field is set.
   */
  @java.lang.Override
  public boolean hasSecret() {
    return secret_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
   * </pre>
   *
   * <code>
   * .google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The secret.
   */
  @java.lang.Override
  public com.google.cloud.secretmanager.v1.Secret getSecret() {
    return secret_ == null
        ? com.google.cloud.secretmanager.v1.Secret.getDefaultInstance()
        : secret_;
  }
  /**
   *
   *
   * <pre>
   * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
   * </pre>
   *
   * <code>
   * .google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.secretmanager.v1.SecretOrBuilder getSecretOrBuilder() {
    return secret_ == null
        ? com.google.cloud.secretmanager.v1.Secret.getDefaultInstance()
        : secret_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secretId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, secretId_);
    }
    if (secret_ != null) {
      output.writeMessage(3, getSecret());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secretId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, secretId_);
    }
    if (secret_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getSecret());
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
    if (!(obj instanceof com.google.cloud.secretmanager.v1.CreateSecretRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.secretmanager.v1.CreateSecretRequest other =
        (com.google.cloud.secretmanager.v1.CreateSecretRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getSecretId().equals(other.getSecretId())) return false;
    if (hasSecret() != other.hasSecret()) return false;
    if (hasSecret()) {
      if (!getSecret().equals(other.getSecret())) return false;
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
    hash = (37 * hash) + SECRET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSecretId().hashCode();
    if (hasSecret()) {
      hash = (37 * hash) + SECRET_FIELD_NUMBER;
      hash = (53 * hash) + getSecret().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.secretmanager.v1.CreateSecretRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.secretmanager.v1.CreateSecretRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1.CreateSecretRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.secretmanager.v1.CreateSecretRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1.CreateSecretRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.secretmanager.v1.CreateSecretRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1.CreateSecretRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.secretmanager.v1.CreateSecretRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1.CreateSecretRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.secretmanager.v1.CreateSecretRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.secretmanager.v1.CreateSecretRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.secretmanager.v1.CreateSecretRequest parseFrom(
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
      com.google.cloud.secretmanager.v1.CreateSecretRequest prototype) {
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
   * Request message for [SecretManagerService.CreateSecret][google.cloud.secretmanager.v1.SecretManagerService.CreateSecret].
   * </pre>
   *
   * Protobuf type {@code google.cloud.secretmanager.v1.CreateSecretRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.secretmanager.v1.CreateSecretRequest)
      com.google.cloud.secretmanager.v1.CreateSecretRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.secretmanager.v1.ServiceProto
          .internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.secretmanager.v1.ServiceProto
          .internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.secretmanager.v1.CreateSecretRequest.class,
              com.google.cloud.secretmanager.v1.CreateSecretRequest.Builder.class);
    }

    // Construct using com.google.cloud.secretmanager.v1.CreateSecretRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      secretId_ = "";
      secret_ = null;
      if (secretBuilder_ != null) {
        secretBuilder_.dispose();
        secretBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.secretmanager.v1.ServiceProto
          .internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1.CreateSecretRequest getDefaultInstanceForType() {
      return com.google.cloud.secretmanager.v1.CreateSecretRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1.CreateSecretRequest build() {
      com.google.cloud.secretmanager.v1.CreateSecretRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.secretmanager.v1.CreateSecretRequest buildPartial() {
      com.google.cloud.secretmanager.v1.CreateSecretRequest result =
          new com.google.cloud.secretmanager.v1.CreateSecretRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.secretmanager.v1.CreateSecretRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.secretId_ = secretId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.secret_ = secretBuilder_ == null ? secret_ : secretBuilder_.build();
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
      if (other instanceof com.google.cloud.secretmanager.v1.CreateSecretRequest) {
        return mergeFrom((com.google.cloud.secretmanager.v1.CreateSecretRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.secretmanager.v1.CreateSecretRequest other) {
      if (other == com.google.cloud.secretmanager.v1.CreateSecretRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSecretId().isEmpty()) {
        secretId_ = other.secretId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasSecret()) {
        mergeSecret(other.getSecret());
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
                secretId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getSecretFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The resource name of the project to associate with the
     * [Secret][google.cloud.secretmanager.v1.Secret], in the format `projects/&#42;`.
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
     * Required. The resource name of the project to associate with the
     * [Secret][google.cloud.secretmanager.v1.Secret], in the format `projects/&#42;`.
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
     * Required. The resource name of the project to associate with the
     * [Secret][google.cloud.secretmanager.v1.Secret], in the format `projects/&#42;`.
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
     * Required. The resource name of the project to associate with the
     * [Secret][google.cloud.secretmanager.v1.Secret], in the format `projects/&#42;`.
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
     * Required. The resource name of the project to associate with the
     * [Secret][google.cloud.secretmanager.v1.Secret], in the format `projects/&#42;`.
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

    private java.lang.Object secretId_ = "";
    /**
     *
     *
     * <pre>
     * Required. This must be unique within the project.
     *
     * A secret ID is a string with a maximum length of 255 characters and can
     * contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and
     * underscore (`_`) characters.
     * </pre>
     *
     * <code>string secret_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The secretId.
     */
    public java.lang.String getSecretId() {
      java.lang.Object ref = secretId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secretId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. This must be unique within the project.
     *
     * A secret ID is a string with a maximum length of 255 characters and can
     * contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and
     * underscore (`_`) characters.
     * </pre>
     *
     * <code>string secret_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for secretId.
     */
    public com.google.protobuf.ByteString getSecretIdBytes() {
      java.lang.Object ref = secretId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        secretId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. This must be unique within the project.
     *
     * A secret ID is a string with a maximum length of 255 characters and can
     * contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and
     * underscore (`_`) characters.
     * </pre>
     *
     * <code>string secret_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The secretId to set.
     * @return This builder for chaining.
     */
    public Builder setSecretId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      secretId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. This must be unique within the project.
     *
     * A secret ID is a string with a maximum length of 255 characters and can
     * contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and
     * underscore (`_`) characters.
     * </pre>
     *
     * <code>string secret_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSecretId() {
      secretId_ = getDefaultInstance().getSecretId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. This must be unique within the project.
     *
     * A secret ID is a string with a maximum length of 255 characters and can
     * contain uppercase and lowercase letters, numerals, and the hyphen (`-`) and
     * underscore (`_`) characters.
     * </pre>
     *
     * <code>string secret_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for secretId to set.
     * @return This builder for chaining.
     */
    public Builder setSecretIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      secretId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.secretmanager.v1.Secret secret_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.secretmanager.v1.Secret,
            com.google.cloud.secretmanager.v1.Secret.Builder,
            com.google.cloud.secretmanager.v1.SecretOrBuilder>
        secretBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the secret field is set.
     */
    public boolean hasSecret() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The secret.
     */
    public com.google.cloud.secretmanager.v1.Secret getSecret() {
      if (secretBuilder_ == null) {
        return secret_ == null
            ? com.google.cloud.secretmanager.v1.Secret.getDefaultInstance()
            : secret_;
      } else {
        return secretBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSecret(com.google.cloud.secretmanager.v1.Secret value) {
      if (secretBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        secret_ = value;
      } else {
        secretBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSecret(com.google.cloud.secretmanager.v1.Secret.Builder builderForValue) {
      if (secretBuilder_ == null) {
        secret_ = builderForValue.build();
      } else {
        secretBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSecret(com.google.cloud.secretmanager.v1.Secret value) {
      if (secretBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && secret_ != null
            && secret_ != com.google.cloud.secretmanager.v1.Secret.getDefaultInstance()) {
          getSecretBuilder().mergeFrom(value);
        } else {
          secret_ = value;
        }
      } else {
        secretBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSecret() {
      bitField0_ = (bitField0_ & ~0x00000004);
      secret_ = null;
      if (secretBuilder_ != null) {
        secretBuilder_.dispose();
        secretBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.secretmanager.v1.Secret.Builder getSecretBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getSecretFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.secretmanager.v1.SecretOrBuilder getSecretOrBuilder() {
      if (secretBuilder_ != null) {
        return secretBuilder_.getMessageOrBuilder();
      } else {
        return secret_ == null
            ? com.google.cloud.secretmanager.v1.Secret.getDefaultInstance()
            : secret_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A [Secret][google.cloud.secretmanager.v1.Secret] with initial field values.
     * </pre>
     *
     * <code>
     * .google.cloud.secretmanager.v1.Secret secret = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.secretmanager.v1.Secret,
            com.google.cloud.secretmanager.v1.Secret.Builder,
            com.google.cloud.secretmanager.v1.SecretOrBuilder>
        getSecretFieldBuilder() {
      if (secretBuilder_ == null) {
        secretBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.secretmanager.v1.Secret,
                com.google.cloud.secretmanager.v1.Secret.Builder,
                com.google.cloud.secretmanager.v1.SecretOrBuilder>(
                getSecret(), getParentForChildren(), isClean());
        secret_ = null;
      }
      return secretBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.secretmanager.v1.CreateSecretRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.CreateSecretRequest)
  private static final com.google.cloud.secretmanager.v1.CreateSecretRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.secretmanager.v1.CreateSecretRequest();
  }

  public static com.google.cloud.secretmanager.v1.CreateSecretRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSecretRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateSecretRequest>() {
        @java.lang.Override
        public CreateSecretRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSecretRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSecretRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.secretmanager.v1.CreateSecretRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
