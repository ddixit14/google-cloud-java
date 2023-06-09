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
 * Specification determining how headers are added to requests or responses.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.HttpHeaderOption}
 */
public final class HttpHeaderOption extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.HttpHeaderOption)
    HttpHeaderOptionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use HttpHeaderOption.newBuilder() to construct.
  private HttpHeaderOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HttpHeaderOption() {
    headerName_ = "";
    headerValue_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HttpHeaderOption();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_HttpHeaderOption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_HttpHeaderOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.HttpHeaderOption.class,
            com.google.cloud.compute.v1.HttpHeaderOption.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_NAME_FIELD_NUMBER = 110223613;

  @SuppressWarnings("serial")
  private volatile java.lang.Object headerName_ = "";
  /**
   *
   *
   * <pre>
   * The name of the header.
   * </pre>
   *
   * <code>optional string header_name = 110223613;</code>
   *
   * @return Whether the headerName field is set.
   */
  @java.lang.Override
  public boolean hasHeaderName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The name of the header.
   * </pre>
   *
   * <code>optional string header_name = 110223613;</code>
   *
   * @return The headerName.
   */
  @java.lang.Override
  public java.lang.String getHeaderName() {
    java.lang.Object ref = headerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      headerName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the header.
   * </pre>
   *
   * <code>optional string header_name = 110223613;</code>
   *
   * @return The bytes for headerName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHeaderNameBytes() {
    java.lang.Object ref = headerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      headerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEADER_VALUE_FIELD_NUMBER = 203094335;

  @SuppressWarnings("serial")
  private volatile java.lang.Object headerValue_ = "";
  /**
   *
   *
   * <pre>
   * The value of the header to add.
   * </pre>
   *
   * <code>optional string header_value = 203094335;</code>
   *
   * @return Whether the headerValue field is set.
   */
  @java.lang.Override
  public boolean hasHeaderValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The value of the header to add.
   * </pre>
   *
   * <code>optional string header_value = 203094335;</code>
   *
   * @return The headerValue.
   */
  @java.lang.Override
  public java.lang.String getHeaderValue() {
    java.lang.Object ref = headerValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      headerValue_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The value of the header to add.
   * </pre>
   *
   * <code>optional string header_value = 203094335;</code>
   *
   * @return The bytes for headerValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHeaderValueBytes() {
    java.lang.Object ref = headerValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      headerValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPLACE_FIELD_NUMBER = 20755124;
  private boolean replace_ = false;
  /**
   *
   *
   * <pre>
   * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header. The default value is false.
   * </pre>
   *
   * <code>optional bool replace = 20755124;</code>
   *
   * @return Whether the replace field is set.
   */
  @java.lang.Override
  public boolean hasReplace() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header. The default value is false.
   * </pre>
   *
   * <code>optional bool replace = 20755124;</code>
   *
   * @return The replace.
   */
  @java.lang.Override
  public boolean getReplace() {
    return replace_;
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
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeBool(20755124, replace_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 110223613, headerName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 203094335, headerValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(20755124, replace_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(110223613, headerName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(203094335, headerValue_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.HttpHeaderOption)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.HttpHeaderOption other =
        (com.google.cloud.compute.v1.HttpHeaderOption) obj;

    if (hasHeaderName() != other.hasHeaderName()) return false;
    if (hasHeaderName()) {
      if (!getHeaderName().equals(other.getHeaderName())) return false;
    }
    if (hasHeaderValue() != other.hasHeaderValue()) return false;
    if (hasHeaderValue()) {
      if (!getHeaderValue().equals(other.getHeaderValue())) return false;
    }
    if (hasReplace() != other.hasReplace()) return false;
    if (hasReplace()) {
      if (getReplace() != other.getReplace()) return false;
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
    if (hasHeaderName()) {
      hash = (37 * hash) + HEADER_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getHeaderName().hashCode();
    }
    if (hasHeaderValue()) {
      hash = (37 * hash) + HEADER_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getHeaderValue().hashCode();
    }
    if (hasReplace()) {
      hash = (37 * hash) + REPLACE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getReplace());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.HttpHeaderOption parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.HttpHeaderOption parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HttpHeaderOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.HttpHeaderOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HttpHeaderOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.HttpHeaderOption parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HttpHeaderOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.HttpHeaderOption parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HttpHeaderOption parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.HttpHeaderOption parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.HttpHeaderOption parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.HttpHeaderOption parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.HttpHeaderOption prototype) {
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
   * Specification determining how headers are added to requests or responses.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.HttpHeaderOption}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.HttpHeaderOption)
      com.google.cloud.compute.v1.HttpHeaderOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_HttpHeaderOption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_HttpHeaderOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.HttpHeaderOption.class,
              com.google.cloud.compute.v1.HttpHeaderOption.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.HttpHeaderOption.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      headerName_ = "";
      headerValue_ = "";
      replace_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_HttpHeaderOption_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HttpHeaderOption getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.HttpHeaderOption.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HttpHeaderOption build() {
      com.google.cloud.compute.v1.HttpHeaderOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.HttpHeaderOption buildPartial() {
      com.google.cloud.compute.v1.HttpHeaderOption result =
          new com.google.cloud.compute.v1.HttpHeaderOption(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.HttpHeaderOption result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.headerName_ = headerName_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.headerValue_ = headerValue_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.replace_ = replace_;
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
      if (other instanceof com.google.cloud.compute.v1.HttpHeaderOption) {
        return mergeFrom((com.google.cloud.compute.v1.HttpHeaderOption) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.HttpHeaderOption other) {
      if (other == com.google.cloud.compute.v1.HttpHeaderOption.getDefaultInstance()) return this;
      if (other.hasHeaderName()) {
        headerName_ = other.headerName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasHeaderValue()) {
        headerValue_ = other.headerValue_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasReplace()) {
        setReplace(other.getReplace());
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
            case 166040992:
              {
                replace_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 166040992
            case 881788906:
              {
                headerName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 881788906
            case 1624754682:
              {
                headerValue_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 1624754682
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

    private java.lang.Object headerName_ = "";
    /**
     *
     *
     * <pre>
     * The name of the header.
     * </pre>
     *
     * <code>optional string header_name = 110223613;</code>
     *
     * @return Whether the headerName field is set.
     */
    public boolean hasHeaderName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The name of the header.
     * </pre>
     *
     * <code>optional string header_name = 110223613;</code>
     *
     * @return The headerName.
     */
    public java.lang.String getHeaderName() {
      java.lang.Object ref = headerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        headerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the header.
     * </pre>
     *
     * <code>optional string header_name = 110223613;</code>
     *
     * @return The bytes for headerName.
     */
    public com.google.protobuf.ByteString getHeaderNameBytes() {
      java.lang.Object ref = headerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        headerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the header.
     * </pre>
     *
     * <code>optional string header_name = 110223613;</code>
     *
     * @param value The headerName to set.
     * @return This builder for chaining.
     */
    public Builder setHeaderName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      headerName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the header.
     * </pre>
     *
     * <code>optional string header_name = 110223613;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHeaderName() {
      headerName_ = getDefaultInstance().getHeaderName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the header.
     * </pre>
     *
     * <code>optional string header_name = 110223613;</code>
     *
     * @param value The bytes for headerName to set.
     * @return This builder for chaining.
     */
    public Builder setHeaderNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      headerName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object headerValue_ = "";
    /**
     *
     *
     * <pre>
     * The value of the header to add.
     * </pre>
     *
     * <code>optional string header_value = 203094335;</code>
     *
     * @return Whether the headerValue field is set.
     */
    public boolean hasHeaderValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The value of the header to add.
     * </pre>
     *
     * <code>optional string header_value = 203094335;</code>
     *
     * @return The headerValue.
     */
    public java.lang.String getHeaderValue() {
      java.lang.Object ref = headerValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        headerValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The value of the header to add.
     * </pre>
     *
     * <code>optional string header_value = 203094335;</code>
     *
     * @return The bytes for headerValue.
     */
    public com.google.protobuf.ByteString getHeaderValueBytes() {
      java.lang.Object ref = headerValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        headerValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The value of the header to add.
     * </pre>
     *
     * <code>optional string header_value = 203094335;</code>
     *
     * @param value The headerValue to set.
     * @return This builder for chaining.
     */
    public Builder setHeaderValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      headerValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The value of the header to add.
     * </pre>
     *
     * <code>optional string header_value = 203094335;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHeaderValue() {
      headerValue_ = getDefaultInstance().getHeaderValue();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The value of the header to add.
     * </pre>
     *
     * <code>optional string header_value = 203094335;</code>
     *
     * @param value The bytes for headerValue to set.
     * @return This builder for chaining.
     */
    public Builder setHeaderValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      headerValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean replace_;
    /**
     *
     *
     * <pre>
     * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header. The default value is false.
     * </pre>
     *
     * <code>optional bool replace = 20755124;</code>
     *
     * @return Whether the replace field is set.
     */
    @java.lang.Override
    public boolean hasReplace() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header. The default value is false.
     * </pre>
     *
     * <code>optional bool replace = 20755124;</code>
     *
     * @return The replace.
     */
    @java.lang.Override
    public boolean getReplace() {
      return replace_;
    }
    /**
     *
     *
     * <pre>
     * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header. The default value is false.
     * </pre>
     *
     * <code>optional bool replace = 20755124;</code>
     *
     * @param value The replace to set.
     * @return This builder for chaining.
     */
    public Builder setReplace(boolean value) {

      replace_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header. The default value is false.
     * </pre>
     *
     * <code>optional bool replace = 20755124;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReplace() {
      bitField0_ = (bitField0_ & ~0x00000004);
      replace_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.HttpHeaderOption)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.HttpHeaderOption)
  private static final com.google.cloud.compute.v1.HttpHeaderOption DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.HttpHeaderOption();
  }

  public static com.google.cloud.compute.v1.HttpHeaderOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpHeaderOption> PARSER =
      new com.google.protobuf.AbstractParser<HttpHeaderOption>() {
        @java.lang.Override
        public HttpHeaderOption parsePartialFrom(
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

  public static com.google.protobuf.Parser<HttpHeaderOption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpHeaderOption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.HttpHeaderOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
