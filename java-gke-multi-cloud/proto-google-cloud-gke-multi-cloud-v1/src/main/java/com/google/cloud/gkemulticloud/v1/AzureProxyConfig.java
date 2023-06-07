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
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

package com.google.cloud.gkemulticloud.v1;

/**
 *
 *
 * <pre>
 * Details of a proxy config stored in Azure Key Vault.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkemulticloud.v1.AzureProxyConfig}
 */
public final class AzureProxyConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkemulticloud.v1.AzureProxyConfig)
    AzureProxyConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AzureProxyConfig.newBuilder() to construct.
  private AzureProxyConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AzureProxyConfig() {
    resourceGroupId_ = "";
    secretId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AzureProxyConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AzureProxyConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
        .internal_static_google_cloud_gkemulticloud_v1_AzureProxyConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkemulticloud.v1.AzureProxyConfig.class,
            com.google.cloud.gkemulticloud.v1.AzureProxyConfig.Builder.class);
  }

  public static final int RESOURCE_GROUP_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceGroupId_ = "";
  /**
   *
   *
   * <pre>
   * The ARM ID the of the resource group containing proxy keyvault.
   *
   * Resource group ids are formatted as
   * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-name&gt;`.
   * </pre>
   *
   * <code>string resource_group_id = 1;</code>
   *
   * @return The resourceGroupId.
   */
  @java.lang.Override
  public java.lang.String getResourceGroupId() {
    java.lang.Object ref = resourceGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceGroupId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ARM ID the of the resource group containing proxy keyvault.
   *
   * Resource group ids are formatted as
   * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-name&gt;`.
   * </pre>
   *
   * <code>string resource_group_id = 1;</code>
   *
   * @return The bytes for resourceGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceGroupIdBytes() {
    java.lang.Object ref = resourceGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resourceGroupId_ = b;
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
   * The URL the of the proxy setting secret with its version.
   *
   * The secret must be a JSON encoded proxy configuration
   * as described in
   * https://cloud.google.com/anthos/clusters/docs/multi-cloud/azure/how-to/use-a-proxy#create_a_proxy_configuration_file
   *
   * Secret ids are formatted as
   * `https://&lt;key-vault-name&gt;.vault.azure.net/secrets/&lt;secret-name&gt;/&lt;secret-version&gt;`.
   * </pre>
   *
   * <code>string secret_id = 2;</code>
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
   * The URL the of the proxy setting secret with its version.
   *
   * The secret must be a JSON encoded proxy configuration
   * as described in
   * https://cloud.google.com/anthos/clusters/docs/multi-cloud/azure/how-to/use-a-proxy#create_a_proxy_configuration_file
   *
   * Secret ids are formatted as
   * `https://&lt;key-vault-name&gt;.vault.azure.net/secrets/&lt;secret-name&gt;/&lt;secret-version&gt;`.
   * </pre>
   *
   * <code>string secret_id = 2;</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceGroupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceGroupId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secretId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, secretId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceGroupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceGroupId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secretId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, secretId_);
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
    if (!(obj instanceof com.google.cloud.gkemulticloud.v1.AzureProxyConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.gkemulticloud.v1.AzureProxyConfig other =
        (com.google.cloud.gkemulticloud.v1.AzureProxyConfig) obj;

    if (!getResourceGroupId().equals(other.getResourceGroupId())) return false;
    if (!getSecretId().equals(other.getSecretId())) return false;
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
    hash = (37 * hash) + RESOURCE_GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getResourceGroupId().hashCode();
    hash = (37 * hash) + SECRET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSecretId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkemulticloud.v1.AzureProxyConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureProxyConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureProxyConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureProxyConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureProxyConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureProxyConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureProxyConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureProxyConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureProxyConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureProxyConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureProxyConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkemulticloud.v1.AzureProxyConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkemulticloud.v1.AzureProxyConfig prototype) {
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
   * Details of a proxy config stored in Azure Key Vault.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkemulticloud.v1.AzureProxyConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkemulticloud.v1.AzureProxyConfig)
      com.google.cloud.gkemulticloud.v1.AzureProxyConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureProxyConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureProxyConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkemulticloud.v1.AzureProxyConfig.class,
              com.google.cloud.gkemulticloud.v1.AzureProxyConfig.Builder.class);
    }

    // Construct using com.google.cloud.gkemulticloud.v1.AzureProxyConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resourceGroupId_ = "";
      secretId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkemulticloud.v1.AzureResourcesProto
          .internal_static_google_cloud_gkemulticloud_v1_AzureProxyConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureProxyConfig getDefaultInstanceForType() {
      return com.google.cloud.gkemulticloud.v1.AzureProxyConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureProxyConfig build() {
      com.google.cloud.gkemulticloud.v1.AzureProxyConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkemulticloud.v1.AzureProxyConfig buildPartial() {
      com.google.cloud.gkemulticloud.v1.AzureProxyConfig result =
          new com.google.cloud.gkemulticloud.v1.AzureProxyConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkemulticloud.v1.AzureProxyConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceGroupId_ = resourceGroupId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.secretId_ = secretId_;
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
      if (other instanceof com.google.cloud.gkemulticloud.v1.AzureProxyConfig) {
        return mergeFrom((com.google.cloud.gkemulticloud.v1.AzureProxyConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkemulticloud.v1.AzureProxyConfig other) {
      if (other == com.google.cloud.gkemulticloud.v1.AzureProxyConfig.getDefaultInstance())
        return this;
      if (!other.getResourceGroupId().isEmpty()) {
        resourceGroupId_ = other.resourceGroupId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSecretId().isEmpty()) {
        secretId_ = other.secretId_;
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
                resourceGroupId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                secretId_ = input.readStringRequireUtf8();
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

    private java.lang.Object resourceGroupId_ = "";
    /**
     *
     *
     * <pre>
     * The ARM ID the of the resource group containing proxy keyvault.
     *
     * Resource group ids are formatted as
     * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-name&gt;`.
     * </pre>
     *
     * <code>string resource_group_id = 1;</code>
     *
     * @return The resourceGroupId.
     */
    public java.lang.String getResourceGroupId() {
      java.lang.Object ref = resourceGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ARM ID the of the resource group containing proxy keyvault.
     *
     * Resource group ids are formatted as
     * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-name&gt;`.
     * </pre>
     *
     * <code>string resource_group_id = 1;</code>
     *
     * @return The bytes for resourceGroupId.
     */
    public com.google.protobuf.ByteString getResourceGroupIdBytes() {
      java.lang.Object ref = resourceGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resourceGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ARM ID the of the resource group containing proxy keyvault.
     *
     * Resource group ids are formatted as
     * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-name&gt;`.
     * </pre>
     *
     * <code>string resource_group_id = 1;</code>
     *
     * @param value The resourceGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setResourceGroupId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resourceGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ARM ID the of the resource group containing proxy keyvault.
     *
     * Resource group ids are formatted as
     * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-name&gt;`.
     * </pre>
     *
     * <code>string resource_group_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceGroupId() {
      resourceGroupId_ = getDefaultInstance().getResourceGroupId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ARM ID the of the resource group containing proxy keyvault.
     *
     * Resource group ids are formatted as
     * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-name&gt;`.
     * </pre>
     *
     * <code>string resource_group_id = 1;</code>
     *
     * @param value The bytes for resourceGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setResourceGroupIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resourceGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object secretId_ = "";
    /**
     *
     *
     * <pre>
     * The URL the of the proxy setting secret with its version.
     *
     * The secret must be a JSON encoded proxy configuration
     * as described in
     * https://cloud.google.com/anthos/clusters/docs/multi-cloud/azure/how-to/use-a-proxy#create_a_proxy_configuration_file
     *
     * Secret ids are formatted as
     * `https://&lt;key-vault-name&gt;.vault.azure.net/secrets/&lt;secret-name&gt;/&lt;secret-version&gt;`.
     * </pre>
     *
     * <code>string secret_id = 2;</code>
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
     * The URL the of the proxy setting secret with its version.
     *
     * The secret must be a JSON encoded proxy configuration
     * as described in
     * https://cloud.google.com/anthos/clusters/docs/multi-cloud/azure/how-to/use-a-proxy#create_a_proxy_configuration_file
     *
     * Secret ids are formatted as
     * `https://&lt;key-vault-name&gt;.vault.azure.net/secrets/&lt;secret-name&gt;/&lt;secret-version&gt;`.
     * </pre>
     *
     * <code>string secret_id = 2;</code>
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
     * The URL the of the proxy setting secret with its version.
     *
     * The secret must be a JSON encoded proxy configuration
     * as described in
     * https://cloud.google.com/anthos/clusters/docs/multi-cloud/azure/how-to/use-a-proxy#create_a_proxy_configuration_file
     *
     * Secret ids are formatted as
     * `https://&lt;key-vault-name&gt;.vault.azure.net/secrets/&lt;secret-name&gt;/&lt;secret-version&gt;`.
     * </pre>
     *
     * <code>string secret_id = 2;</code>
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
     * The URL the of the proxy setting secret with its version.
     *
     * The secret must be a JSON encoded proxy configuration
     * as described in
     * https://cloud.google.com/anthos/clusters/docs/multi-cloud/azure/how-to/use-a-proxy#create_a_proxy_configuration_file
     *
     * Secret ids are formatted as
     * `https://&lt;key-vault-name&gt;.vault.azure.net/secrets/&lt;secret-name&gt;/&lt;secret-version&gt;`.
     * </pre>
     *
     * <code>string secret_id = 2;</code>
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
     * The URL the of the proxy setting secret with its version.
     *
     * The secret must be a JSON encoded proxy configuration
     * as described in
     * https://cloud.google.com/anthos/clusters/docs/multi-cloud/azure/how-to/use-a-proxy#create_a_proxy_configuration_file
     *
     * Secret ids are formatted as
     * `https://&lt;key-vault-name&gt;.vault.azure.net/secrets/&lt;secret-name&gt;/&lt;secret-version&gt;`.
     * </pre>
     *
     * <code>string secret_id = 2;</code>
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.gkemulticloud.v1.AzureProxyConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkemulticloud.v1.AzureProxyConfig)
  private static final com.google.cloud.gkemulticloud.v1.AzureProxyConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkemulticloud.v1.AzureProxyConfig();
  }

  public static com.google.cloud.gkemulticloud.v1.AzureProxyConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AzureProxyConfig> PARSER =
      new com.google.protobuf.AbstractParser<AzureProxyConfig>() {
        @java.lang.Override
        public AzureProxyConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AzureProxyConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AzureProxyConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkemulticloud.v1.AzureProxyConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
