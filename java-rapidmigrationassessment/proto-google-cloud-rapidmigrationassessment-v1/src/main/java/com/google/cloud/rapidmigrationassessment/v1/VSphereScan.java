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
// source: google/cloud/rapidmigrationassessment/v1/api_entities.proto

package com.google.cloud.rapidmigrationassessment.v1;

/**
 *
 *
 * <pre>
 * Message describing a MC Source of type VSphere Scan.
 * </pre>
 *
 * Protobuf type {@code google.cloud.rapidmigrationassessment.v1.VSphereScan}
 */
public final class VSphereScan extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.rapidmigrationassessment.v1.VSphereScan)
    VSphereScanOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VSphereScan.newBuilder() to construct.
  private VSphereScan(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VSphereScan() {
    coreSource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VSphereScan();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.rapidmigrationassessment.v1.ApiEntitiesProto
        .internal_static_google_cloud_rapidmigrationassessment_v1_VSphereScan_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.rapidmigrationassessment.v1.ApiEntitiesProto
        .internal_static_google_cloud_rapidmigrationassessment_v1_VSphereScan_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.rapidmigrationassessment.v1.VSphereScan.class,
            com.google.cloud.rapidmigrationassessment.v1.VSphereScan.Builder.class);
  }

  public static final int CORE_SOURCE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object coreSource_ = "";
  /**
   *
   *
   * <pre>
   * reference to the corresponding VSphere Scan in MC Source.
   * </pre>
   *
   * <code>string core_source = 1;</code>
   *
   * @return The coreSource.
   */
  @java.lang.Override
  public java.lang.String getCoreSource() {
    java.lang.Object ref = coreSource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      coreSource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * reference to the corresponding VSphere Scan in MC Source.
   * </pre>
   *
   * <code>string core_source = 1;</code>
   *
   * @return The bytes for coreSource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCoreSourceBytes() {
    java.lang.Object ref = coreSource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      coreSource_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(coreSource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, coreSource_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(coreSource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, coreSource_);
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
    if (!(obj instanceof com.google.cloud.rapidmigrationassessment.v1.VSphereScan)) {
      return super.equals(obj);
    }
    com.google.cloud.rapidmigrationassessment.v1.VSphereScan other =
        (com.google.cloud.rapidmigrationassessment.v1.VSphereScan) obj;

    if (!getCoreSource().equals(other.getCoreSource())) return false;
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
    hash = (37 * hash) + CORE_SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getCoreSource().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.rapidmigrationassessment.v1.VSphereScan parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.rapidmigrationassessment.v1.VSphereScan parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.rapidmigrationassessment.v1.VSphereScan parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.rapidmigrationassessment.v1.VSphereScan parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.rapidmigrationassessment.v1.VSphereScan parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.rapidmigrationassessment.v1.VSphereScan parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.rapidmigrationassessment.v1.VSphereScan parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.rapidmigrationassessment.v1.VSphereScan parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.rapidmigrationassessment.v1.VSphereScan parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.rapidmigrationassessment.v1.VSphereScan parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.rapidmigrationassessment.v1.VSphereScan parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.rapidmigrationassessment.v1.VSphereScan parseFrom(
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
      com.google.cloud.rapidmigrationassessment.v1.VSphereScan prototype) {
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
   * Message describing a MC Source of type VSphere Scan.
   * </pre>
   *
   * Protobuf type {@code google.cloud.rapidmigrationassessment.v1.VSphereScan}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.rapidmigrationassessment.v1.VSphereScan)
      com.google.cloud.rapidmigrationassessment.v1.VSphereScanOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.rapidmigrationassessment.v1.ApiEntitiesProto
          .internal_static_google_cloud_rapidmigrationassessment_v1_VSphereScan_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.rapidmigrationassessment.v1.ApiEntitiesProto
          .internal_static_google_cloud_rapidmigrationassessment_v1_VSphereScan_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.rapidmigrationassessment.v1.VSphereScan.class,
              com.google.cloud.rapidmigrationassessment.v1.VSphereScan.Builder.class);
    }

    // Construct using com.google.cloud.rapidmigrationassessment.v1.VSphereScan.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      coreSource_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.rapidmigrationassessment.v1.ApiEntitiesProto
          .internal_static_google_cloud_rapidmigrationassessment_v1_VSphereScan_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.rapidmigrationassessment.v1.VSphereScan getDefaultInstanceForType() {
      return com.google.cloud.rapidmigrationassessment.v1.VSphereScan.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.rapidmigrationassessment.v1.VSphereScan build() {
      com.google.cloud.rapidmigrationassessment.v1.VSphereScan result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.rapidmigrationassessment.v1.VSphereScan buildPartial() {
      com.google.cloud.rapidmigrationassessment.v1.VSphereScan result =
          new com.google.cloud.rapidmigrationassessment.v1.VSphereScan(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.rapidmigrationassessment.v1.VSphereScan result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.coreSource_ = coreSource_;
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
      if (other instanceof com.google.cloud.rapidmigrationassessment.v1.VSphereScan) {
        return mergeFrom((com.google.cloud.rapidmigrationassessment.v1.VSphereScan) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.rapidmigrationassessment.v1.VSphereScan other) {
      if (other == com.google.cloud.rapidmigrationassessment.v1.VSphereScan.getDefaultInstance())
        return this;
      if (!other.getCoreSource().isEmpty()) {
        coreSource_ = other.coreSource_;
        bitField0_ |= 0x00000001;
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
                coreSource_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private java.lang.Object coreSource_ = "";
    /**
     *
     *
     * <pre>
     * reference to the corresponding VSphere Scan in MC Source.
     * </pre>
     *
     * <code>string core_source = 1;</code>
     *
     * @return The coreSource.
     */
    public java.lang.String getCoreSource() {
      java.lang.Object ref = coreSource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        coreSource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * reference to the corresponding VSphere Scan in MC Source.
     * </pre>
     *
     * <code>string core_source = 1;</code>
     *
     * @return The bytes for coreSource.
     */
    public com.google.protobuf.ByteString getCoreSourceBytes() {
      java.lang.Object ref = coreSource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        coreSource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * reference to the corresponding VSphere Scan in MC Source.
     * </pre>
     *
     * <code>string core_source = 1;</code>
     *
     * @param value The coreSource to set.
     * @return This builder for chaining.
     */
    public Builder setCoreSource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      coreSource_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * reference to the corresponding VSphere Scan in MC Source.
     * </pre>
     *
     * <code>string core_source = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCoreSource() {
      coreSource_ = getDefaultInstance().getCoreSource();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * reference to the corresponding VSphere Scan in MC Source.
     * </pre>
     *
     * <code>string core_source = 1;</code>
     *
     * @param value The bytes for coreSource to set.
     * @return This builder for chaining.
     */
    public Builder setCoreSourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      coreSource_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.rapidmigrationassessment.v1.VSphereScan)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.rapidmigrationassessment.v1.VSphereScan)
  private static final com.google.cloud.rapidmigrationassessment.v1.VSphereScan DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.rapidmigrationassessment.v1.VSphereScan();
  }

  public static com.google.cloud.rapidmigrationassessment.v1.VSphereScan getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VSphereScan> PARSER =
      new com.google.protobuf.AbstractParser<VSphereScan>() {
        @java.lang.Override
        public VSphereScan parsePartialFrom(
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

  public static com.google.protobuf.Parser<VSphereScan> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VSphereScan> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.rapidmigrationassessment.v1.VSphereScan getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
