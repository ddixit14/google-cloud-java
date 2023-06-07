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
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

package com.google.cloud.gkemulticloud.v1;

/**
 *
 *
 * <pre>
 * Details of a proxy config stored in AWS Secret Manager.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.AwsProxyConfig}
 */
public final class AwsProxyConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.AwsProxyConfig)
    AwsProxyConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AwsProxyConfig.newBuilder() to construct.
  private AwsProxyConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AwsProxyConfig() {
    secretArn_ = "";
    secretVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AwsProxyConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AwsProxyConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AwsProxyConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.AwsProxyConfig.class,
            com.google.cloud.gkemulticloud.v1.AwsProxyConfig.Builder.class);
  }

  public static final int SECRET_ARN_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object secretArn_ = "";
  /**
   *
   *
   * <pre>
   * The ARN of the AWS Secret Manager secret that contains the HTTP(S) proxy
   * configuration.
   *
   * The secret must be a JSON encoded proxy configuration
   * as described in
   * https://cloud.google.com/anthos/clusters/docs/multi-cloud/aws/how-to/use-a-proxy#create_a_proxy_configuration_file
   * </pre>
   *
   * <code>string secret_arn = 1;</code>
   *
   * @return The secretArn.
   */
  @java.lang.Override
  public java.lang.String getSecretArn() {
    java.lang.Object ref = secretArn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      secretArn_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ARN of the AWS Secret Manager secret that contains the HTTP(S) proxy
   * configuration.
   *
   * The secret must be a JSON encoded proxy configuration
   * as described in
   * https://cloud.google.com/anthos/clusters/docs/multi-cloud/aws/how-to/use-a-proxy#create_a_proxy_configuration_file
   * </pre>
   *
   * <code>string secret_arn = 1;</code>
   *
   * @return The bytes for secretArn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSecretArnBytes() {
    java.lang.Object ref = secretArn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      secretArn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECRET_VERSION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object secretVersion_ = "";
  /**
   *
   *
   * <pre>
   * The version string of the AWS Secret Manager secret that contains the
   * HTTP(S) proxy configuration.
   * </pre>
   *
   * <code>string secret_version = 2;</code>
   *
   * @return The secretVersion.
   */
  @java.lang.Override
  public java.lang.String getSecretVersion() {
    java.lang.Object ref = secretVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      secretVersion_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The version string of the AWS Secret Manager secret that contains the
   * HTTP(S) proxy configuration.
   * </pre>
   *
   * <code>string secret_version = 2;</code>
   *
   * @return The bytes for secretVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSecretVersionBytes() {
    java.lang.Object ref = secretVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      secretVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secretArn_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, secretArn_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secretVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, secretVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secretArn_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, secretArn_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secretVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, secretVersion_);
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.AwsProxyConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.AwsProxyConfig other =
        (com.google.cloud.gkemulticloud.v1.AwsProxyConfig) obj;

    if (!getSecretArn().equals(other.getSecretArn())) return false;
    if (!getSecretVersion().equals(other.getSecretVersion())) return false;
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
    hash = (37 * hash) + SECRET_ARN_FIELD_NUMBER;
    hash = (53 * hash) + getSecretArn().hashCode();
    hash = (37 * hash) + SECRET_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getSecretVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.AwsProxyConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsProxyConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsProxyConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsProxyConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsProxyConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsProxyConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsProxyConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsProxyConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsProxyConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsProxyConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsProxyConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AwsProxyConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkemulticloud.v1.AwsProxyConfig prototype) {
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
   * Details of a proxy config stored in AWS Secret Manager.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.AwsProxyConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.AwsProxyConfig)
      com.google.cloud.gkemulticloud.v1.AwsProxyConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AwsProxyConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AwsProxyConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.AwsProxyConfig.class,
              com.google.cloud.gkemulticloud.v1.AwsProxyConfig.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.AwsProxyConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      secretArn_ = "";
      secretVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AwsResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AwsProxyConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsProxyConfig getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.AwsProxyConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsProxyConfig build() {
      com.google.cloud.gkemulticloud.v1.AwsProxyConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AwsProxyConfig buildPartial() {
      com.google.cloud.gkemulticloud.v1.AwsProxyConfig result =
          new com.google.cloud.gkemulticloud.v1.AwsProxyConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkemulticloud.v1.AwsProxyConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.secretArn_ = secretArn_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.secretVersion_ = secretVersion_;
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.AwsProxyConfig) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.AwsProxyConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.AwsProxyConfig other) {
      if (other == com.google.cloud.gkemulticloud.v1.AwsProxyConfig.getDefaultInstance())
        return this;
      if (!other.getSecretArn().isEmpty()) {
        secretArn_ = other.secretArn_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSecretVersion().isEmpty()) {
        secretVersion_ = other.secretVersion_;
        bitField0_ |= 0x00000002;
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
                secretArn_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                secretVersion_ = input.readStringRequireUtf8();
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

    private java.lang.Object secretArn_ = "";
    /**
     *
     *
     * <pre>
     * The ARN of the AWS Secret Manager secret that contains the HTTP(S) proxy
     * configuration.
     *
     * The secret must be a JSON encoded proxy configuration
     * as described in
     * https://cloud.google.com/anthos/clusters/docs/multi-cloud/aws/how-to/use-a-proxy#create_a_proxy_configuration_file
     * </pre>
     *
     * <code>string secret_arn = 1;</code>
     *
     * @return The secretArn.
     */
    public java.lang.String getSecretArn() {
      java.lang.Object ref = secretArn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secretArn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ARN of the AWS Secret Manager secret that contains the HTTP(S) proxy
     * configuration.
     *
     * The secret must be a JSON encoded proxy configuration
     * as described in
     * https://cloud.google.com/anthos/clusters/docs/multi-cloud/aws/how-to/use-a-proxy#create_a_proxy_configuration_file
     * </pre>
     *
     * <code>string secret_arn = 1;</code>
     *
     * @return The bytes for secretArn.
     */
    public com.google.protobuf.ByteString getSecretArnBytes() {
      java.lang.Object ref = secretArn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        secretArn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ARN of the AWS Secret Manager secret that contains the HTTP(S) proxy
     * configuration.
     *
     * The secret must be a JSON encoded proxy configuration
     * as described in
     * https://cloud.google.com/anthos/clusters/docs/multi-cloud/aws/how-to/use-a-proxy#create_a_proxy_configuration_file
     * </pre>
     *
     * <code>string secret_arn = 1;</code>
     *
     * @param value The secretArn to set.
     * @return This builder for chaining.
     */
    public Builder setSecretArn(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      secretArn_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ARN of the AWS Secret Manager secret that contains the HTTP(S) proxy
     * configuration.
     *
     * The secret must be a JSON encoded proxy configuration
     * as described in
     * https://cloud.google.com/anthos/clusters/docs/multi-cloud/aws/how-to/use-a-proxy#create_a_proxy_configuration_file
     * </pre>
     *
     * <code>string secret_arn = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSecretArn() {
      secretArn_ = getDefaultInstance().getSecretArn();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ARN of the AWS Secret Manager secret that contains the HTTP(S) proxy
     * configuration.
     *
     * The secret must be a JSON encoded proxy configuration
     * as described in
     * https://cloud.google.com/anthos/clusters/docs/multi-cloud/aws/how-to/use-a-proxy#create_a_proxy_configuration_file
     * </pre>
     *
     * <code>string secret_arn = 1;</code>
     *
     * @param value The bytes for secretArn to set.
     * @return This builder for chaining.
     */
    public Builder setSecretArnBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      secretArn_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object secretVersion_ = "";
    /**
     *
     *
     * <pre>
     * The version string of the AWS Secret Manager secret that contains the
     * HTTP(S) proxy configuration.
     * </pre>
     *
     * <code>string secret_version = 2;</code>
     *
     * @return The secretVersion.
     */
    public java.lang.String getSecretVersion() {
      java.lang.Object ref = secretVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secretVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The version string of the AWS Secret Manager secret that contains the
     * HTTP(S) proxy configuration.
     * </pre>
     *
     * <code>string secret_version = 2;</code>
     *
     * @return The bytes for secretVersion.
     */
    public com.google.protobuf.ByteString getSecretVersionBytes() {
      java.lang.Object ref = secretVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        secretVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The version string of the AWS Secret Manager secret that contains the
     * HTTP(S) proxy configuration.
     * </pre>
     *
     * <code>string secret_version = 2;</code>
     *
     * @param value The secretVersion to set.
     * @return This builder for chaining.
     */
    public Builder setSecretVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      secretVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version string of the AWS Secret Manager secret that contains the
     * HTTP(S) proxy configuration.
     * </pre>
     *
     * <code>string secret_version = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSecretVersion() {
      secretVersion_ = getDefaultInstance().getSecretVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The version string of the AWS Secret Manager secret that contains the
     * HTTP(S) proxy configuration.
     * </pre>
     *
     * <code>string secret_version = 2;</code>
     *
     * @param value The bytes for secretVersion to set.
     * @return This builder for chaining.
     */
    public Builder setSecretVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      secretVersion_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.AwsProxyConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.AwsProxyConfig)
  private static final com.google.cloud.gkemulticloud.v1.AwsProxyConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.AwsProxyConfig();
  }

  public static com.google.cloud.gkemulticloud.v1.AwsProxyConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AwsProxyConfig> PARSER =
      new com.google.protobuf.AbstractParser<AwsProxyConfig>() {
        @java.lang.Override
        public AwsProxyConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AwsProxyConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AwsProxyConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AwsProxyConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
