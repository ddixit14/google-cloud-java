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
// source: google/cloud/aiplatform/v1/explanation.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Neighbors for example-based explanations.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.Neighbor}
 */
public final class Neighbor extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.Neighbor)
    NeighborOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Neighbor.newBuilder() to construct.
  private Neighbor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Neighbor() {
    neighborId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Neighbor();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.ExplanationProto
        .internal_static_google_cloud_aiplatform_v1_Neighbor_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ExplanationProto
        .internal_static_google_cloud_aiplatform_v1_Neighbor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.Neighbor.class,
            com.google.cloud.aiplatform.v1.Neighbor.Builder.class);
  }

  public static final int NEIGHBOR_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object neighborId_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The neighbor id.
   * </pre>
   *
   * <code>string neighbor_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The neighborId.
   */
  @java.lang.Override
  public java.lang.String getNeighborId() {
    java.lang.Object ref = neighborId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      neighborId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The neighbor id.
   * </pre>
   *
   * <code>string neighbor_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for neighborId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNeighborIdBytes() {
    java.lang.Object ref = neighborId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      neighborId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEIGHBOR_DISTANCE_FIELD_NUMBER = 2;
  private double neighborDistance_ = 0D;
  /**
   *
   *
   * <pre>
   * Output only. The neighbor distance.
   * </pre>
   *
   * <code>double neighbor_distance = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The neighborDistance.
   */
  @java.lang.Override
  public double getNeighborDistance() {
    return neighborDistance_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(neighborId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, neighborId_);
    }
    if (java.lang.Double.doubleToRawLongBits(neighborDistance_) != 0) {
      output.writeDouble(2, neighborDistance_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(neighborId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, neighborId_);
    }
    if (java.lang.Double.doubleToRawLongBits(neighborDistance_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, neighborDistance_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.Neighbor)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.Neighbor other = (com.google.cloud.aiplatform.v1.Neighbor) obj;

    if (!getNeighborId().equals(other.getNeighborId())) return false;
    if (java.lang.Double.doubleToLongBits(getNeighborDistance())
        != java.lang.Double.doubleToLongBits(other.getNeighborDistance())) return false;
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
    hash = (37 * hash) + NEIGHBOR_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNeighborId().hashCode();
    hash = (37 * hash) + NEIGHBOR_DISTANCE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getNeighborDistance()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.Neighbor parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.Neighbor parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Neighbor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.Neighbor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Neighbor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.Neighbor parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Neighbor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.Neighbor parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Neighbor parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.Neighbor parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.Neighbor parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.Neighbor parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.Neighbor prototype) {
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
   * Neighbors for example-based explanations.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.Neighbor}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.Neighbor)
      com.google.cloud.aiplatform.v1.NeighborOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1_Neighbor_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1_Neighbor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.Neighbor.class,
              com.google.cloud.aiplatform.v1.Neighbor.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.Neighbor.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      neighborId_ = "";
      neighborDistance_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ExplanationProto
          .internal_static_google_cloud_aiplatform_v1_Neighbor_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.Neighbor getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.Neighbor.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.Neighbor build() {
      com.google.cloud.aiplatform.v1.Neighbor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.Neighbor buildPartial() {
      com.google.cloud.aiplatform.v1.Neighbor result =
          new com.google.cloud.aiplatform.v1.Neighbor(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.Neighbor result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.neighborId_ = neighborId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.neighborDistance_ = neighborDistance_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.Neighbor) {
        return mergeFrom((com.google.cloud.aiplatform.v1.Neighbor) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.Neighbor other) {
      if (other == com.google.cloud.aiplatform.v1.Neighbor.getDefaultInstance()) return this;
      if (!other.getNeighborId().isEmpty()) {
        neighborId_ = other.neighborId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getNeighborDistance() != 0D) {
        setNeighborDistance(other.getNeighborDistance());
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
                neighborId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 17:
              {
                neighborDistance_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
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

    private java.lang.Object neighborId_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The neighbor id.
     * </pre>
     *
     * <code>string neighbor_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The neighborId.
     */
    public java.lang.String getNeighborId() {
      java.lang.Object ref = neighborId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        neighborId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The neighbor id.
     * </pre>
     *
     * <code>string neighbor_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for neighborId.
     */
    public com.google.protobuf.ByteString getNeighborIdBytes() {
      java.lang.Object ref = neighborId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        neighborId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The neighbor id.
     * </pre>
     *
     * <code>string neighbor_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The neighborId to set.
     * @return This builder for chaining.
     */
    public Builder setNeighborId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      neighborId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The neighbor id.
     * </pre>
     *
     * <code>string neighbor_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNeighborId() {
      neighborId_ = getDefaultInstance().getNeighborId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The neighbor id.
     * </pre>
     *
     * <code>string neighbor_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for neighborId to set.
     * @return This builder for chaining.
     */
    public Builder setNeighborIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      neighborId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private double neighborDistance_;
    /**
     *
     *
     * <pre>
     * Output only. The neighbor distance.
     * </pre>
     *
     * <code>double neighbor_distance = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The neighborDistance.
     */
    @java.lang.Override
    public double getNeighborDistance() {
      return neighborDistance_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The neighbor distance.
     * </pre>
     *
     * <code>double neighbor_distance = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The neighborDistance to set.
     * @return This builder for chaining.
     */
    public Builder setNeighborDistance(double value) {

      neighborDistance_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The neighbor distance.
     * </pre>
     *
     * <code>double neighbor_distance = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNeighborDistance() {
      bitField0_ = (bitField0_ & ~0x00000002);
      neighborDistance_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.Neighbor)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.Neighbor)
  private static final com.google.cloud.aiplatform.v1.Neighbor DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.Neighbor();
  }

  public static com.google.cloud.aiplatform.v1.Neighbor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Neighbor> PARSER =
      new com.google.protobuf.AbstractParser<Neighbor>() {
        @java.lang.Override
        public Neighbor parsePartialFrom(
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

  public static com.google.protobuf.Parser<Neighbor> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Neighbor> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Neighbor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
