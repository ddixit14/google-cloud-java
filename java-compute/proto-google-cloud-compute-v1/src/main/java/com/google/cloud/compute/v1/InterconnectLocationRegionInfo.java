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
 * Information about any potential InterconnectAttachments between an Interconnect at a specific InterconnectLocation, and a specific Cloud Region.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InterconnectLocationRegionInfo}
 */
public final class InterconnectLocationRegionInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InterconnectLocationRegionInfo)
    InterconnectLocationRegionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InterconnectLocationRegionInfo.newBuilder() to construct.
  private InterconnectLocationRegionInfo(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InterconnectLocationRegionInfo() {
    locationPresence_ = "";
    region_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InterconnectLocationRegionInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectLocationRegionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectLocationRegionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InterconnectLocationRegionInfo.class,
            com.google.cloud.compute.v1.InterconnectLocationRegionInfo.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Identifies the network presence of this location.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence}
   */
  public enum LocationPresence implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_LOCATION_PRESENCE = 0;</code>
     */
    UNDEFINED_LOCATION_PRESENCE(0),
    /**
     *
     *
     * <pre>
     * This region is not in any common network presence with this InterconnectLocation.
     * </pre>
     *
     * <code>GLOBAL = 494663587;</code>
     */
    GLOBAL(494663587),
    /**
     *
     *
     * <pre>
     * This region shares the same regional network presence as this InterconnectLocation.
     * </pre>
     *
     * <code>LOCAL_REGION = 403535464;</code>
     */
    LOCAL_REGION(403535464),
    /**
     *
     *
     * <pre>
     * [Deprecated] This region is not in any common network presence with this InterconnectLocation.
     * </pre>
     *
     * <code>LP_GLOBAL = 429584062;</code>
     */
    LP_GLOBAL(429584062),
    /**
     *
     *
     * <pre>
     * [Deprecated] This region shares the same regional network presence as this InterconnectLocation.
     * </pre>
     *
     * <code>LP_LOCAL_REGION = 488598851;</code>
     */
    LP_LOCAL_REGION(488598851),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_LOCATION_PRESENCE = 0;</code>
     */
    public static final int UNDEFINED_LOCATION_PRESENCE_VALUE = 0;
    /**
     *
     *
     * <pre>
     * This region is not in any common network presence with this InterconnectLocation.
     * </pre>
     *
     * <code>GLOBAL = 494663587;</code>
     */
    public static final int GLOBAL_VALUE = 494663587;
    /**
     *
     *
     * <pre>
     * This region shares the same regional network presence as this InterconnectLocation.
     * </pre>
     *
     * <code>LOCAL_REGION = 403535464;</code>
     */
    public static final int LOCAL_REGION_VALUE = 403535464;
    /**
     *
     *
     * <pre>
     * [Deprecated] This region is not in any common network presence with this InterconnectLocation.
     * </pre>
     *
     * <code>LP_GLOBAL = 429584062;</code>
     */
    public static final int LP_GLOBAL_VALUE = 429584062;
    /**
     *
     *
     * <pre>
     * [Deprecated] This region shares the same regional network presence as this InterconnectLocation.
     * </pre>
     *
     * <code>LP_LOCAL_REGION = 488598851;</code>
     */
    public static final int LP_LOCAL_REGION_VALUE = 488598851;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LocationPresence valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LocationPresence forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_LOCATION_PRESENCE;
        case 494663587:
          return GLOBAL;
        case 403535464:
          return LOCAL_REGION;
        case 429584062:
          return LP_GLOBAL;
        case 488598851:
          return LP_LOCAL_REGION;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LocationPresence> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<LocationPresence>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<LocationPresence>() {
              public LocationPresence findValueByNumber(int number) {
                return LocationPresence.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.compute.v1.InterconnectLocationRegionInfo.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final LocationPresence[] VALUES = values();

    public static LocationPresence valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LocationPresence(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.InterconnectLocationRegionInfo.LocationPresence)
  }

  private int bitField0_;
  public static final int EXPECTED_RTT_MS_FIELD_NUMBER = 422543866;
  private long expectedRttMs_ = 0L;
  /**
   *
   *
   * <pre>
   * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
   * </pre>
   *
   * <code>optional int64 expected_rtt_ms = 422543866;</code>
   *
   * @return Whether the expectedRttMs field is set.
   */
  @java.lang.Override
  public boolean hasExpectedRttMs() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
   * </pre>
   *
   * <code>optional int64 expected_rtt_ms = 422543866;</code>
   *
   * @return The expectedRttMs.
   */
  @java.lang.Override
  public long getExpectedRttMs() {
    return expectedRttMs_;
  }

  public static final int LOCATION_PRESENCE_FIELD_NUMBER = 101517893;

  @SuppressWarnings("serial")
  private volatile java.lang.Object locationPresence_ = "";
  /**
   *
   *
   * <pre>
   * Identifies the network presence of this location.
   * Check the LocationPresence enum for the list of possible values.
   * </pre>
   *
   * <code>optional string location_presence = 101517893;</code>
   *
   * @return Whether the locationPresence field is set.
   */
  @java.lang.Override
  public boolean hasLocationPresence() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Identifies the network presence of this location.
   * Check the LocationPresence enum for the list of possible values.
   * </pre>
   *
   * <code>optional string location_presence = 101517893;</code>
   *
   * @return The locationPresence.
   */
  @java.lang.Override
  public java.lang.String getLocationPresence() {
    java.lang.Object ref = locationPresence_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      locationPresence_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Identifies the network presence of this location.
   * Check the LocationPresence enum for the list of possible values.
   * </pre>
   *
   * <code>optional string location_presence = 101517893;</code>
   *
   * @return The bytes for locationPresence.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLocationPresenceBytes() {
    java.lang.Object ref = locationPresence_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      locationPresence_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGION_FIELD_NUMBER = 138946292;

  @SuppressWarnings("serial")
  private volatile java.lang.Object region_ = "";
  /**
   *
   *
   * <pre>
   * URL for the region of this location.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  @java.lang.Override
  public boolean hasRegion() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * URL for the region of this location.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The region.
   */
  @java.lang.Override
  public java.lang.String getRegion() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      region_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * URL for the region of this location.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRegionBytes() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      region_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 101517893, locationPresence_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 138946292, region_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(422543866, expectedRttMs_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(101517893, locationPresence_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(138946292, region_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(422543866, expectedRttMs_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InterconnectLocationRegionInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InterconnectLocationRegionInfo other =
        (com.google.cloud.compute.v1.InterconnectLocationRegionInfo) obj;

    if (hasExpectedRttMs() != other.hasExpectedRttMs()) return false;
    if (hasExpectedRttMs()) {
      if (getExpectedRttMs() != other.getExpectedRttMs()) return false;
    }
    if (hasLocationPresence() != other.hasLocationPresence()) return false;
    if (hasLocationPresence()) {
      if (!getLocationPresence().equals(other.getLocationPresence())) return false;
    }
    if (hasRegion() != other.hasRegion()) return false;
    if (hasRegion()) {
      if (!getRegion().equals(other.getRegion())) return false;
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
    if (hasExpectedRttMs()) {
      hash = (37 * hash) + EXPECTED_RTT_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getExpectedRttMs());
    }
    if (hasLocationPresence()) {
      hash = (37 * hash) + LOCATION_PRESENCE_FIELD_NUMBER;
      hash = (53 * hash) + getLocationPresence().hashCode();
    }
    if (hasRegion()) {
      hash = (37 * hash) + REGION_FIELD_NUMBER;
      hash = (53 * hash) + getRegion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo parseFrom(
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
      com.google.cloud.compute.v1.InterconnectLocationRegionInfo prototype) {
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
   * Information about any potential InterconnectAttachments between an Interconnect at a specific InterconnectLocation, and a specific Cloud Region.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InterconnectLocationRegionInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InterconnectLocationRegionInfo)
      com.google.cloud.compute.v1.InterconnectLocationRegionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectLocationRegionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectLocationRegionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InterconnectLocationRegionInfo.class,
              com.google.cloud.compute.v1.InterconnectLocationRegionInfo.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InterconnectLocationRegionInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      expectedRttMs_ = 0L;
      locationPresence_ = "";
      region_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectLocationRegionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectLocationRegionInfo getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InterconnectLocationRegionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectLocationRegionInfo build() {
      com.google.cloud.compute.v1.InterconnectLocationRegionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectLocationRegionInfo buildPartial() {
      com.google.cloud.compute.v1.InterconnectLocationRegionInfo result =
          new com.google.cloud.compute.v1.InterconnectLocationRegionInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.InterconnectLocationRegionInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.expectedRttMs_ = expectedRttMs_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.locationPresence_ = locationPresence_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.region_ = region_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.cloud.compute.v1.InterconnectLocationRegionInfo) {
        return mergeFrom((com.google.cloud.compute.v1.InterconnectLocationRegionInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.InterconnectLocationRegionInfo other) {
      if (other == com.google.cloud.compute.v1.InterconnectLocationRegionInfo.getDefaultInstance())
        return this;
      if (other.hasExpectedRttMs()) {
        setExpectedRttMs(other.getExpectedRttMs());
      }
      if (other.hasLocationPresence()) {
        locationPresence_ = other.locationPresence_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasRegion()) {
        region_ = other.region_;
        bitField0_ |= 0x00000004;
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
            case 812143146:
              {
                locationPresence_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 812143146
            case 1111570338:
              {
                region_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 1111570338
            case -914616368:
              {
                expectedRttMs_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case -914616368
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

    private long expectedRttMs_;
    /**
     *
     *
     * <pre>
     * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
     * </pre>
     *
     * <code>optional int64 expected_rtt_ms = 422543866;</code>
     *
     * @return Whether the expectedRttMs field is set.
     */
    @java.lang.Override
    public boolean hasExpectedRttMs() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
     * </pre>
     *
     * <code>optional int64 expected_rtt_ms = 422543866;</code>
     *
     * @return The expectedRttMs.
     */
    @java.lang.Override
    public long getExpectedRttMs() {
      return expectedRttMs_;
    }
    /**
     *
     *
     * <pre>
     * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
     * </pre>
     *
     * <code>optional int64 expected_rtt_ms = 422543866;</code>
     *
     * @param value The expectedRttMs to set.
     * @return This builder for chaining.
     */
    public Builder setExpectedRttMs(long value) {

      expectedRttMs_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
     * </pre>
     *
     * <code>optional int64 expected_rtt_ms = 422543866;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExpectedRttMs() {
      bitField0_ = (bitField0_ & ~0x00000001);
      expectedRttMs_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object locationPresence_ = "";
    /**
     *
     *
     * <pre>
     * Identifies the network presence of this location.
     * Check the LocationPresence enum for the list of possible values.
     * </pre>
     *
     * <code>optional string location_presence = 101517893;</code>
     *
     * @return Whether the locationPresence field is set.
     */
    public boolean hasLocationPresence() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Identifies the network presence of this location.
     * Check the LocationPresence enum for the list of possible values.
     * </pre>
     *
     * <code>optional string location_presence = 101517893;</code>
     *
     * @return The locationPresence.
     */
    public java.lang.String getLocationPresence() {
      java.lang.Object ref = locationPresence_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        locationPresence_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifies the network presence of this location.
     * Check the LocationPresence enum for the list of possible values.
     * </pre>
     *
     * <code>optional string location_presence = 101517893;</code>
     *
     * @return The bytes for locationPresence.
     */
    public com.google.protobuf.ByteString getLocationPresenceBytes() {
      java.lang.Object ref = locationPresence_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        locationPresence_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifies the network presence of this location.
     * Check the LocationPresence enum for the list of possible values.
     * </pre>
     *
     * <code>optional string location_presence = 101517893;</code>
     *
     * @param value The locationPresence to set.
     * @return This builder for chaining.
     */
    public Builder setLocationPresence(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      locationPresence_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifies the network presence of this location.
     * Check the LocationPresence enum for the list of possible values.
     * </pre>
     *
     * <code>optional string location_presence = 101517893;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocationPresence() {
      locationPresence_ = getDefaultInstance().getLocationPresence();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifies the network presence of this location.
     * Check the LocationPresence enum for the list of possible values.
     * </pre>
     *
     * <code>optional string location_presence = 101517893;</code>
     *
     * @param value The bytes for locationPresence to set.
     * @return This builder for chaining.
     */
    public Builder setLocationPresenceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      locationPresence_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object region_ = "";
    /**
     *
     *
     * <pre>
     * URL for the region of this location.
     * </pre>
     *
     * <code>optional string region = 138946292;</code>
     *
     * @return Whether the region field is set.
     */
    public boolean hasRegion() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * URL for the region of this location.
     * </pre>
     *
     * <code>optional string region = 138946292;</code>
     *
     * @return The region.
     */
    public java.lang.String getRegion() {
      java.lang.Object ref = region_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        region_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL for the region of this location.
     * </pre>
     *
     * <code>optional string region = 138946292;</code>
     *
     * @return The bytes for region.
     */
    public com.google.protobuf.ByteString getRegionBytes() {
      java.lang.Object ref = region_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        region_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * URL for the region of this location.
     * </pre>
     *
     * <code>optional string region = 138946292;</code>
     *
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      region_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL for the region of this location.
     * </pre>
     *
     * <code>optional string region = 138946292;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRegion() {
      region_ = getDefaultInstance().getRegion();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL for the region of this location.
     * </pre>
     *
     * <code>optional string region = 138946292;</code>
     *
     * @param value The bytes for region to set.
     * @return This builder for chaining.
     */
    public Builder setRegionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      region_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InterconnectLocationRegionInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InterconnectLocationRegionInfo)
  private static final com.google.cloud.compute.v1.InterconnectLocationRegionInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InterconnectLocationRegionInfo();
  }

  public static com.google.cloud.compute.v1.InterconnectLocationRegionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InterconnectLocationRegionInfo> PARSER =
      new com.google.protobuf.AbstractParser<InterconnectLocationRegionInfo>() {
        @java.lang.Override
        public InterconnectLocationRegionInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<InterconnectLocationRegionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InterconnectLocationRegionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectLocationRegionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
