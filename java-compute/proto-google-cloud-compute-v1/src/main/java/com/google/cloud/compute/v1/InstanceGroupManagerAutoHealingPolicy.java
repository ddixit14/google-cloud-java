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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy}
 */
public final class InstanceGroupManagerAutoHealingPolicy
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy)
    InstanceGroupManagerAutoHealingPolicyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceGroupManagerAutoHealingPolicy.newBuilder() to construct.
  private InstanceGroupManagerAutoHealingPolicy(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceGroupManagerAutoHealingPolicy() {
    healthCheck_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceGroupManagerAutoHealingPolicy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerAutoHealingPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerAutoHealingPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy.class,
            com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy.Builder.class);
  }

  private int bitField0_;
  public static final int HEALTH_CHECK_FIELD_NUMBER = 308876645;

  @SuppressWarnings("serial")
  private volatile java.lang.Object healthCheck_ = "";
  /**
   *
   *
   * <pre>
   * The URL for the health check that signals autohealing.
   * </pre>
   *
   * <code>optional string health_check = 308876645;</code>
   *
   * @return Whether the healthCheck field is set.
   */
  @java.lang.Override
  public boolean hasHealthCheck() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The URL for the health check that signals autohealing.
   * </pre>
   *
   * <code>optional string health_check = 308876645;</code>
   *
   * @return The healthCheck.
   */
  @java.lang.Override
  public java.lang.String getHealthCheck() {
    java.lang.Object ref = healthCheck_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      healthCheck_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The URL for the health check that signals autohealing.
   * </pre>
   *
   * <code>optional string health_check = 308876645;</code>
   *
   * @return The bytes for healthCheck.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHealthCheckBytes() {
    java.lang.Object ref = healthCheck_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      healthCheck_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INITIAL_DELAY_SEC_FIELD_NUMBER = 263207002;
  private int initialDelaySec_ = 0;
  /**
   *
   *
   * <pre>
   * The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
   * </pre>
   *
   * <code>optional int32 initial_delay_sec = 263207002;</code>
   *
   * @return Whether the initialDelaySec field is set.
   */
  @java.lang.Override
  public boolean hasInitialDelaySec() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
   * </pre>
   *
   * <code>optional int32 initial_delay_sec = 263207002;</code>
   *
   * @return The initialDelaySec.
   */
  @java.lang.Override
  public int getInitialDelaySec() {
    return initialDelaySec_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(263207002, initialDelaySec_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 308876645, healthCheck_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(263207002, initialDelaySec_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(308876645, healthCheck_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy other =
        (com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy) obj;

    if (hasHealthCheck() != other.hasHealthCheck()) return false;
    if (hasHealthCheck()) {
      if (!getHealthCheck().equals(other.getHealthCheck())) return false;
    }
    if (hasInitialDelaySec() != other.hasInitialDelaySec()) return false;
    if (hasInitialDelaySec()) {
      if (getInitialDelaySec() != other.getInitialDelaySec()) return false;
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
    if (hasHealthCheck()) {
      hash = (37 * hash) + HEALTH_CHECK_FIELD_NUMBER;
      hash = (53 * hash) + getHealthCheck().hashCode();
    }
    if (hasInitialDelaySec()) {
      hash = (37 * hash) + INITIAL_DELAY_SEC_FIELD_NUMBER;
      hash = (53 * hash) + getInitialDelaySec();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy parseFrom(
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
      com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy)
      com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerAutoHealingPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerAutoHealingPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy.class,
              com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      healthCheck_ = "";
      initialDelaySec_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerAutoHealingPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy build() {
      com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy buildPartial() {
      com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy result =
          new com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.healthCheck_ = healthCheck_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.initialDelaySec_ = initialDelaySec_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy) {
        return mergeFrom((com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy other) {
      if (other
          == com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy.getDefaultInstance())
        return this;
      if (other.hasHealthCheck()) {
        healthCheck_ = other.healthCheck_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasInitialDelaySec()) {
        setInitialDelaySec(other.getInitialDelaySec());
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
            case 2105656016:
              {
                initialDelaySec_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 2105656016
            case -1823954134:
              {
                healthCheck_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case -1823954134
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

    private java.lang.Object healthCheck_ = "";
    /**
     *
     *
     * <pre>
     * The URL for the health check that signals autohealing.
     * </pre>
     *
     * <code>optional string health_check = 308876645;</code>
     *
     * @return Whether the healthCheck field is set.
     */
    public boolean hasHealthCheck() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The URL for the health check that signals autohealing.
     * </pre>
     *
     * <code>optional string health_check = 308876645;</code>
     *
     * @return The healthCheck.
     */
    public java.lang.String getHealthCheck() {
      java.lang.Object ref = healthCheck_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        healthCheck_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URL for the health check that signals autohealing.
     * </pre>
     *
     * <code>optional string health_check = 308876645;</code>
     *
     * @return The bytes for healthCheck.
     */
    public com.google.protobuf.ByteString getHealthCheckBytes() {
      java.lang.Object ref = healthCheck_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        healthCheck_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The URL for the health check that signals autohealing.
     * </pre>
     *
     * <code>optional string health_check = 308876645;</code>
     *
     * @param value The healthCheck to set.
     * @return This builder for chaining.
     */
    public Builder setHealthCheck(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      healthCheck_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL for the health check that signals autohealing.
     * </pre>
     *
     * <code>optional string health_check = 308876645;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHealthCheck() {
      healthCheck_ = getDefaultInstance().getHealthCheck();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The URL for the health check that signals autohealing.
     * </pre>
     *
     * <code>optional string health_check = 308876645;</code>
     *
     * @param value The bytes for healthCheck to set.
     * @return This builder for chaining.
     */
    public Builder setHealthCheckBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      healthCheck_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int initialDelaySec_;
    /**
     *
     *
     * <pre>
     * The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
     * </pre>
     *
     * <code>optional int32 initial_delay_sec = 263207002;</code>
     *
     * @return Whether the initialDelaySec field is set.
     */
    @java.lang.Override
    public boolean hasInitialDelaySec() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
     * </pre>
     *
     * <code>optional int32 initial_delay_sec = 263207002;</code>
     *
     * @return The initialDelaySec.
     */
    @java.lang.Override
    public int getInitialDelaySec() {
      return initialDelaySec_;
    }
    /**
     *
     *
     * <pre>
     * The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
     * </pre>
     *
     * <code>optional int32 initial_delay_sec = 263207002;</code>
     *
     * @param value The initialDelaySec to set.
     * @return This builder for chaining.
     */
    public Builder setInitialDelaySec(int value) {

      initialDelaySec_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
     * </pre>
     *
     * <code>optional int32 initial_delay_sec = 263207002;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInitialDelaySec() {
      bitField0_ = (bitField0_ & ~0x00000002);
      initialDelaySec_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy)
  private static final com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy();
  }

  public static com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceGroupManagerAutoHealingPolicy> PARSER =
      new com.google.protobuf.AbstractParser<InstanceGroupManagerAutoHealingPolicy>() {
        @java.lang.Override
        public InstanceGroupManagerAutoHealingPolicy parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstanceGroupManagerAutoHealingPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceGroupManagerAutoHealingPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupManagerAutoHealingPolicy
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
