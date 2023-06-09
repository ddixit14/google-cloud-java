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
// source: google/cloud/shell/v1/cloudshell.proto

package com.google.cloud.shell.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [StartEnvironment][google.cloud.shell.v1.CloudShellService.StartEnvironment].
 * </pre>
 *
 * Protobuf type {@code google.cloud.shell.v1.StartEnvironmentRequest}
 */
public final class StartEnvironmentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.shell.v1.StartEnvironmentRequest)
    StartEnvironmentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StartEnvironmentRequest.newBuilder() to construct.
  private StartEnvironmentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StartEnvironmentRequest() {
    name_ = "";
    accessToken_ = "";
    publicKeys_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StartEnvironmentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.shell.v1.CloudShellProto
        .internal_static_google_cloud_shell_v1_StartEnvironmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.shell.v1.CloudShellProto
        .internal_static_google_cloud_shell_v1_StartEnvironmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.shell.v1.StartEnvironmentRequest.class,
            com.google.cloud.shell.v1.StartEnvironmentRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Name of the resource that should be started, for example
   * `users/me/environments/default` or
   * `users/someone&#64;example.com/environments/default`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the resource that should be started, for example
   * `users/me/environments/default` or
   * `users/someone&#64;example.com/environments/default`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCESS_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object accessToken_ = "";
  /**
   *
   *
   * <pre>
   * The initial access token passed to the environment. If this is present and
   * valid, the environment will be pre-authenticated with gcloud so that the
   * user can run gcloud commands in Cloud Shell without having to log in. This
   * code can be updated later by calling AuthorizeEnvironment.
   * </pre>
   *
   * <code>string access_token = 2;</code>
   *
   * @return The accessToken.
   */
  @java.lang.Override
  public java.lang.String getAccessToken() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      accessToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The initial access token passed to the environment. If this is present and
   * valid, the environment will be pre-authenticated with gcloud so that the
   * user can run gcloud commands in Cloud Shell without having to log in. This
   * code can be updated later by calling AuthorizeEnvironment.
   * </pre>
   *
   * <code>string access_token = 2;</code>
   *
   * @return The bytes for accessToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAccessTokenBytes() {
    java.lang.Object ref = accessToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      accessToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLIC_KEYS_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList publicKeys_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Public keys that should be added to the environment before it is started.
   * </pre>
   *
   * <code>repeated string public_keys = 3;</code>
   *
   * @return A list containing the publicKeys.
   */
  public com.google.protobuf.ProtocolStringList getPublicKeysList() {
    return publicKeys_;
  }
  /**
   *
   *
   * <pre>
   * Public keys that should be added to the environment before it is started.
   * </pre>
   *
   * <code>repeated string public_keys = 3;</code>
   *
   * @return The count of publicKeys.
   */
  public int getPublicKeysCount() {
    return publicKeys_.size();
  }
  /**
   *
   *
   * <pre>
   * Public keys that should be added to the environment before it is started.
   * </pre>
   *
   * <code>repeated string public_keys = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The publicKeys at the given index.
   */
  public java.lang.String getPublicKeys(int index) {
    return publicKeys_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Public keys that should be added to the environment before it is started.
   * </pre>
   *
   * <code>repeated string public_keys = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the publicKeys at the given index.
   */
  public com.google.protobuf.ByteString getPublicKeysBytes(int index) {
    return publicKeys_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accessToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, accessToken_);
    }
    for (int i = 0; i < publicKeys_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, publicKeys_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accessToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, accessToken_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < publicKeys_.size(); i++) {
        dataSize += computeStringSizeNoTag(publicKeys_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPublicKeysList().size();
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
    if (!(obj instanceof com.google.cloud.shell.v1.StartEnvironmentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.shell.v1.StartEnvironmentRequest other =
        (com.google.cloud.shell.v1.StartEnvironmentRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getAccessToken().equals(other.getAccessToken())) return false;
    if (!getPublicKeysList().equals(other.getPublicKeysList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ACCESS_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAccessToken().hashCode();
    if (getPublicKeysCount() > 0) {
      hash = (37 * hash) + PUBLIC_KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getPublicKeysList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.shell.v1.StartEnvironmentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.shell.v1.StartEnvironmentRequest prototype) {
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
   * [StartEnvironment][google.cloud.shell.v1.CloudShellService.StartEnvironment].
   * </pre>
   *
   * Protobuf type {@code google.cloud.shell.v1.StartEnvironmentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.shell.v1.StartEnvironmentRequest)
      com.google.cloud.shell.v1.StartEnvironmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.shell.v1.CloudShellProto
          .internal_static_google_cloud_shell_v1_StartEnvironmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.shell.v1.CloudShellProto
          .internal_static_google_cloud_shell_v1_StartEnvironmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.shell.v1.StartEnvironmentRequest.class,
              com.google.cloud.shell.v1.StartEnvironmentRequest.Builder.class);
    }

    // Construct using com.google.cloud.shell.v1.StartEnvironmentRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      accessToken_ = "";
      publicKeys_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.shell.v1.CloudShellProto
          .internal_static_google_cloud_shell_v1_StartEnvironmentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.StartEnvironmentRequest getDefaultInstanceForType() {
      return com.google.cloud.shell.v1.StartEnvironmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.StartEnvironmentRequest build() {
      com.google.cloud.shell.v1.StartEnvironmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.StartEnvironmentRequest buildPartial() {
      com.google.cloud.shell.v1.StartEnvironmentRequest result =
          new com.google.cloud.shell.v1.StartEnvironmentRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.shell.v1.StartEnvironmentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.accessToken_ = accessToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        publicKeys_.makeImmutable();
        result.publicKeys_ = publicKeys_;
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
      if (other instanceof com.google.cloud.shell.v1.StartEnvironmentRequest) {
        return mergeFrom((com.google.cloud.shell.v1.StartEnvironmentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.shell.v1.StartEnvironmentRequest other) {
      if (other == com.google.cloud.shell.v1.StartEnvironmentRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAccessToken().isEmpty()) {
        accessToken_ = other.accessToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.publicKeys_.isEmpty()) {
        if (publicKeys_.isEmpty()) {
          publicKeys_ = other.publicKeys_;
          bitField0_ |= 0x00000004;
        } else {
          ensurePublicKeysIsMutable();
          publicKeys_.addAll(other.publicKeys_);
        }
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                accessToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensurePublicKeysIsMutable();
                publicKeys_.add(s);
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Name of the resource that should be started, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the resource that should be started, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the resource that should be started, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the resource that should be started, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the resource that should be started, for example
     * `users/me/environments/default` or
     * `users/someone&#64;example.com/environments/default`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object accessToken_ = "";
    /**
     *
     *
     * <pre>
     * The initial access token passed to the environment. If this is present and
     * valid, the environment will be pre-authenticated with gcloud so that the
     * user can run gcloud commands in Cloud Shell without having to log in. This
     * code can be updated later by calling AuthorizeEnvironment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     *
     * @return The accessToken.
     */
    public java.lang.String getAccessToken() {
      java.lang.Object ref = accessToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        accessToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The initial access token passed to the environment. If this is present and
     * valid, the environment will be pre-authenticated with gcloud so that the
     * user can run gcloud commands in Cloud Shell without having to log in. This
     * code can be updated later by calling AuthorizeEnvironment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     *
     * @return The bytes for accessToken.
     */
    public com.google.protobuf.ByteString getAccessTokenBytes() {
      java.lang.Object ref = accessToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        accessToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The initial access token passed to the environment. If this is present and
     * valid, the environment will be pre-authenticated with gcloud so that the
     * user can run gcloud commands in Cloud Shell without having to log in. This
     * code can be updated later by calling AuthorizeEnvironment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     *
     * @param value The accessToken to set.
     * @return This builder for chaining.
     */
    public Builder setAccessToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      accessToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The initial access token passed to the environment. If this is present and
     * valid, the environment will be pre-authenticated with gcloud so that the
     * user can run gcloud commands in Cloud Shell without having to log in. This
     * code can be updated later by calling AuthorizeEnvironment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAccessToken() {
      accessToken_ = getDefaultInstance().getAccessToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The initial access token passed to the environment. If this is present and
     * valid, the environment will be pre-authenticated with gcloud so that the
     * user can run gcloud commands in Cloud Shell without having to log in. This
     * code can be updated later by calling AuthorizeEnvironment.
     * </pre>
     *
     * <code>string access_token = 2;</code>
     *
     * @param value The bytes for accessToken to set.
     * @return This builder for chaining.
     */
    public Builder setAccessTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      accessToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList publicKeys_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensurePublicKeysIsMutable() {
      if (!publicKeys_.isModifiable()) {
        publicKeys_ = new com.google.protobuf.LazyStringArrayList(publicKeys_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     *
     *
     * <pre>
     * Public keys that should be added to the environment before it is started.
     * </pre>
     *
     * <code>repeated string public_keys = 3;</code>
     *
     * @return A list containing the publicKeys.
     */
    public com.google.protobuf.ProtocolStringList getPublicKeysList() {
      publicKeys_.makeImmutable();
      return publicKeys_;
    }
    /**
     *
     *
     * <pre>
     * Public keys that should be added to the environment before it is started.
     * </pre>
     *
     * <code>repeated string public_keys = 3;</code>
     *
     * @return The count of publicKeys.
     */
    public int getPublicKeysCount() {
      return publicKeys_.size();
    }
    /**
     *
     *
     * <pre>
     * Public keys that should be added to the environment before it is started.
     * </pre>
     *
     * <code>repeated string public_keys = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The publicKeys at the given index.
     */
    public java.lang.String getPublicKeys(int index) {
      return publicKeys_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Public keys that should be added to the environment before it is started.
     * </pre>
     *
     * <code>repeated string public_keys = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the publicKeys at the given index.
     */
    public com.google.protobuf.ByteString getPublicKeysBytes(int index) {
      return publicKeys_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Public keys that should be added to the environment before it is started.
     * </pre>
     *
     * <code>repeated string public_keys = 3;</code>
     *
     * @param index The index to set the value at.
     * @param value The publicKeys to set.
     * @return This builder for chaining.
     */
    public Builder setPublicKeys(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePublicKeysIsMutable();
      publicKeys_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Public keys that should be added to the environment before it is started.
     * </pre>
     *
     * <code>repeated string public_keys = 3;</code>
     *
     * @param value The publicKeys to add.
     * @return This builder for chaining.
     */
    public Builder addPublicKeys(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePublicKeysIsMutable();
      publicKeys_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Public keys that should be added to the environment before it is started.
     * </pre>
     *
     * <code>repeated string public_keys = 3;</code>
     *
     * @param values The publicKeys to add.
     * @return This builder for chaining.
     */
    public Builder addAllPublicKeys(java.lang.Iterable<java.lang.String> values) {
      ensurePublicKeysIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, publicKeys_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Public keys that should be added to the environment before it is started.
     * </pre>
     *
     * <code>repeated string public_keys = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPublicKeys() {
      publicKeys_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Public keys that should be added to the environment before it is started.
     * </pre>
     *
     * <code>repeated string public_keys = 3;</code>
     *
     * @param value The bytes of the publicKeys to add.
     * @return This builder for chaining.
     */
    public Builder addPublicKeysBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensurePublicKeysIsMutable();
      publicKeys_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.shell.v1.StartEnvironmentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.shell.v1.StartEnvironmentRequest)
  private static final com.google.cloud.shell.v1.StartEnvironmentRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.shell.v1.StartEnvironmentRequest();
  }

  public static com.google.cloud.shell.v1.StartEnvironmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartEnvironmentRequest> PARSER =
      new com.google.protobuf.AbstractParser<StartEnvironmentRequest>() {
        @java.lang.Override
        public StartEnvironmentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<StartEnvironmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartEnvironmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.shell.v1.StartEnvironmentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
