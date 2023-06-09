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
// source: google/cloud/aiplatform/v1beta1/service_networking.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Represents configuration for private service connect.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig}
 */
public final class PrivateServiceConnectConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig)
    PrivateServiceConnectConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PrivateServiceConnectConfig.newBuilder() to construct.
  private PrivateServiceConnectConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PrivateServiceConnectConfig() {
    projectAllowlist_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PrivateServiceConnectConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto
        .internal_static_google_cloud_aiplatform_v1beta1_PrivateServiceConnectConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto
        .internal_static_google_cloud_aiplatform_v1beta1_PrivateServiceConnectConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig.class,
            com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig.Builder.class);
  }

  public static final int ENABLE_PRIVATE_SERVICE_CONNECT_FIELD_NUMBER = 1;
  private boolean enablePrivateServiceConnect_ = false;
  /**
   *
   *
   * <pre>
   * Required. If true, expose the IndexEndpoint via private service connect.
   * </pre>
   *
   * <code>bool enable_private_service_connect = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The enablePrivateServiceConnect.
   */
  @java.lang.Override
  public boolean getEnablePrivateServiceConnect() {
    return enablePrivateServiceConnect_;
  }

  public static final int PROJECT_ALLOWLIST_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList projectAllowlist_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * A list of Projects from which the forwarding rule will target the service
   * attachment.
   * </pre>
   *
   * <code>repeated string project_allowlist = 2;</code>
   *
   * @return A list containing the projectAllowlist.
   */
  public com.google.protobuf.ProtocolStringList getProjectAllowlistList() {
    return projectAllowlist_;
  }
  /**
   *
   *
   * <pre>
   * A list of Projects from which the forwarding rule will target the service
   * attachment.
   * </pre>
   *
   * <code>repeated string project_allowlist = 2;</code>
   *
   * @return The count of projectAllowlist.
   */
  public int getProjectAllowlistCount() {
    return projectAllowlist_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of Projects from which the forwarding rule will target the service
   * attachment.
   * </pre>
   *
   * <code>repeated string project_allowlist = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The projectAllowlist at the given index.
   */
  public java.lang.String getProjectAllowlist(int index) {
    return projectAllowlist_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of Projects from which the forwarding rule will target the service
   * attachment.
   * </pre>
   *
   * <code>repeated string project_allowlist = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the projectAllowlist at the given index.
   */
  public com.google.protobuf.ByteString getProjectAllowlistBytes(int index) {
    return projectAllowlist_.getByteString(index);
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
    if (enablePrivateServiceConnect_ != false) {
      output.writeBool(1, enablePrivateServiceConnect_);
    }
    for (int i = 0; i < projectAllowlist_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, projectAllowlist_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enablePrivateServiceConnect_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(1, enablePrivateServiceConnect_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < projectAllowlist_.size(); i++) {
        dataSize += computeStringSizeNoTag(projectAllowlist_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getProjectAllowlistList().size();
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig other =
        (com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig) obj;

    if (getEnablePrivateServiceConnect() != other.getEnablePrivateServiceConnect()) return false;
    if (!getProjectAllowlistList().equals(other.getProjectAllowlistList())) return false;
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
    hash = (37 * hash) + ENABLE_PRIVATE_SERVICE_CONNECT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnablePrivateServiceConnect());
    if (getProjectAllowlistCount() > 0) {
      hash = (37 * hash) + PROJECT_ALLOWLIST_FIELD_NUMBER;
      hash = (53 * hash) + getProjectAllowlistList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig prototype) {
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
   * Represents configuration for private service connect.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig)
      com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto
          .internal_static_google_cloud_aiplatform_v1beta1_PrivateServiceConnectConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto
          .internal_static_google_cloud_aiplatform_v1beta1_PrivateServiceConnectConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig.class,
              com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enablePrivateServiceConnect_ = false;
      projectAllowlist_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto
          .internal_static_google_cloud_aiplatform_v1beta1_PrivateServiceConnectConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig build() {
      com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig buildPartial() {
      com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig result =
          new com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enablePrivateServiceConnect_ = enablePrivateServiceConnect_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        projectAllowlist_.makeImmutable();
        result.projectAllowlist_ = projectAllowlist_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig.getDefaultInstance())
        return this;
      if (other.getEnablePrivateServiceConnect() != false) {
        setEnablePrivateServiceConnect(other.getEnablePrivateServiceConnect());
      }
      if (!other.projectAllowlist_.isEmpty()) {
        if (projectAllowlist_.isEmpty()) {
          projectAllowlist_ = other.projectAllowlist_;
          bitField0_ |= 0x00000002;
        } else {
          ensureProjectAllowlistIsMutable();
          projectAllowlist_.addAll(other.projectAllowlist_);
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
            case 8:
              {
                enablePrivateServiceConnect_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureProjectAllowlistIsMutable();
                projectAllowlist_.add(s);
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

    private boolean enablePrivateServiceConnect_;
    /**
     *
     *
     * <pre>
     * Required. If true, expose the IndexEndpoint via private service connect.
     * </pre>
     *
     * <code>bool enable_private_service_connect = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enablePrivateServiceConnect.
     */
    @java.lang.Override
    public boolean getEnablePrivateServiceConnect() {
      return enablePrivateServiceConnect_;
    }
    /**
     *
     *
     * <pre>
     * Required. If true, expose the IndexEndpoint via private service connect.
     * </pre>
     *
     * <code>bool enable_private_service_connect = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enablePrivateServiceConnect to set.
     * @return This builder for chaining.
     */
    public Builder setEnablePrivateServiceConnect(boolean value) {

      enablePrivateServiceConnect_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. If true, expose the IndexEndpoint via private service connect.
     * </pre>
     *
     * <code>bool enable_private_service_connect = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnablePrivateServiceConnect() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enablePrivateServiceConnect_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList projectAllowlist_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureProjectAllowlistIsMutable() {
      if (!projectAllowlist_.isModifiable()) {
        projectAllowlist_ = new com.google.protobuf.LazyStringArrayList(projectAllowlist_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * A list of Projects from which the forwarding rule will target the service
     * attachment.
     * </pre>
     *
     * <code>repeated string project_allowlist = 2;</code>
     *
     * @return A list containing the projectAllowlist.
     */
    public com.google.protobuf.ProtocolStringList getProjectAllowlistList() {
      projectAllowlist_.makeImmutable();
      return projectAllowlist_;
    }
    /**
     *
     *
     * <pre>
     * A list of Projects from which the forwarding rule will target the service
     * attachment.
     * </pre>
     *
     * <code>repeated string project_allowlist = 2;</code>
     *
     * @return The count of projectAllowlist.
     */
    public int getProjectAllowlistCount() {
      return projectAllowlist_.size();
    }
    /**
     *
     *
     * <pre>
     * A list of Projects from which the forwarding rule will target the service
     * attachment.
     * </pre>
     *
     * <code>repeated string project_allowlist = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The projectAllowlist at the given index.
     */
    public java.lang.String getProjectAllowlist(int index) {
      return projectAllowlist_.get(index);
    }
    /**
     *
     *
     * <pre>
     * A list of Projects from which the forwarding rule will target the service
     * attachment.
     * </pre>
     *
     * <code>repeated string project_allowlist = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the projectAllowlist at the given index.
     */
    public com.google.protobuf.ByteString getProjectAllowlistBytes(int index) {
      return projectAllowlist_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * A list of Projects from which the forwarding rule will target the service
     * attachment.
     * </pre>
     *
     * <code>repeated string project_allowlist = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The projectAllowlist to set.
     * @return This builder for chaining.
     */
    public Builder setProjectAllowlist(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureProjectAllowlistIsMutable();
      projectAllowlist_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Projects from which the forwarding rule will target the service
     * attachment.
     * </pre>
     *
     * <code>repeated string project_allowlist = 2;</code>
     *
     * @param value The projectAllowlist to add.
     * @return This builder for chaining.
     */
    public Builder addProjectAllowlist(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureProjectAllowlistIsMutable();
      projectAllowlist_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Projects from which the forwarding rule will target the service
     * attachment.
     * </pre>
     *
     * <code>repeated string project_allowlist = 2;</code>
     *
     * @param values The projectAllowlist to add.
     * @return This builder for chaining.
     */
    public Builder addAllProjectAllowlist(java.lang.Iterable<java.lang.String> values) {
      ensureProjectAllowlistIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, projectAllowlist_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Projects from which the forwarding rule will target the service
     * attachment.
     * </pre>
     *
     * <code>repeated string project_allowlist = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProjectAllowlist() {
      projectAllowlist_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of Projects from which the forwarding rule will target the service
     * attachment.
     * </pre>
     *
     * <code>repeated string project_allowlist = 2;</code>
     *
     * @param value The bytes of the projectAllowlist to add.
     * @return This builder for chaining.
     */
    public Builder addProjectAllowlistBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureProjectAllowlistIsMutable();
      projectAllowlist_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig)
  private static final com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig();
  }

  public static com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrivateServiceConnectConfig> PARSER =
      new com.google.protobuf.AbstractParser<PrivateServiceConnectConfig>() {
        @java.lang.Override
        public PrivateServiceConnectConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<PrivateServiceConnectConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrivateServiceConnectConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
