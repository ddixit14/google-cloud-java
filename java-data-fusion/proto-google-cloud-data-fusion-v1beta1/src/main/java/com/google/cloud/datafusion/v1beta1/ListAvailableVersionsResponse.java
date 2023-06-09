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
// source: google/cloud/datafusion/v1beta1/v1beta1.proto

package com.google.cloud.datafusion.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for the list available versions request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse}
 */
public final class ListAvailableVersionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse)
    ListAvailableVersionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListAvailableVersionsResponse.newBuilder() to construct.
  private ListAvailableVersionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAvailableVersionsResponse() {
    availableVersions_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAvailableVersionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datafusion.v1beta1.V1Beta1
        .internal_static_google_cloud_datafusion_v1beta1_ListAvailableVersionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datafusion.v1beta1.V1Beta1
        .internal_static_google_cloud_datafusion_v1beta1_ListAvailableVersionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse.class,
            com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse.Builder.class);
  }

  public static final int AVAILABLE_VERSIONS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.datafusion.v1beta1.Version> availableVersions_;
  /**
   *
   *
   * <pre>
   * Represents a list of versions that are supported.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datafusion.v1beta1.Version> getAvailableVersionsList() {
    return availableVersions_;
  }
  /**
   *
   *
   * <pre>
   * Represents a list of versions that are supported.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datafusion.v1beta1.VersionOrBuilder>
      getAvailableVersionsOrBuilderList() {
    return availableVersions_;
  }
  /**
   *
   *
   * <pre>
   * Represents a list of versions that are supported.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
   */
  @java.lang.Override
  public int getAvailableVersionsCount() {
    return availableVersions_.size();
  }
  /**
   *
   *
   * <pre>
   * Represents a list of versions that are supported.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datafusion.v1beta1.Version getAvailableVersions(int index) {
    return availableVersions_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Represents a list of versions that are supported.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datafusion.v1beta1.VersionOrBuilder getAvailableVersionsOrBuilder(
      int index) {
    return availableVersions_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < availableVersions_.size(); i++) {
      output.writeMessage(1, availableVersions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < availableVersions_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, availableVersions_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse other =
        (com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse) obj;

    if (!getAvailableVersionsList().equals(other.getAvailableVersionsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getAvailableVersionsCount() > 0) {
      hash = (37 * hash) + AVAILABLE_VERSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAvailableVersionsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse parseFrom(
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
      com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse prototype) {
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
   * Response message for the list available versions request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse)
      com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1
          .internal_static_google_cloud_datafusion_v1beta1_ListAvailableVersionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1
          .internal_static_google_cloud_datafusion_v1beta1_ListAvailableVersionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse.class,
              com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (availableVersionsBuilder_ == null) {
        availableVersions_ = java.util.Collections.emptyList();
      } else {
        availableVersions_ = null;
        availableVersionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1
          .internal_static_google_cloud_datafusion_v1beta1_ListAvailableVersionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse build() {
      com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse buildPartial() {
      com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse result =
          new com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse result) {
      if (availableVersionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          availableVersions_ = java.util.Collections.unmodifiableList(availableVersions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.availableVersions_ = availableVersions_;
      } else {
        result.availableVersions_ = availableVersionsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse) {
        return mergeFrom((com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse other) {
      if (other
          == com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse.getDefaultInstance())
        return this;
      if (availableVersionsBuilder_ == null) {
        if (!other.availableVersions_.isEmpty()) {
          if (availableVersions_.isEmpty()) {
            availableVersions_ = other.availableVersions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAvailableVersionsIsMutable();
            availableVersions_.addAll(other.availableVersions_);
          }
          onChanged();
        }
      } else {
        if (!other.availableVersions_.isEmpty()) {
          if (availableVersionsBuilder_.isEmpty()) {
            availableVersionsBuilder_.dispose();
            availableVersionsBuilder_ = null;
            availableVersions_ = other.availableVersions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            availableVersionsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAvailableVersionsFieldBuilder()
                    : null;
          } else {
            availableVersionsBuilder_.addAllMessages(other.availableVersions_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.datafusion.v1beta1.Version m =
                    input.readMessage(
                        com.google.cloud.datafusion.v1beta1.Version.parser(), extensionRegistry);
                if (availableVersionsBuilder_ == null) {
                  ensureAvailableVersionsIsMutable();
                  availableVersions_.add(m);
                } else {
                  availableVersionsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.datafusion.v1beta1.Version> availableVersions_ =
        java.util.Collections.emptyList();

    private void ensureAvailableVersionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        availableVersions_ =
            new java.util.ArrayList<com.google.cloud.datafusion.v1beta1.Version>(
                availableVersions_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datafusion.v1beta1.Version,
            com.google.cloud.datafusion.v1beta1.Version.Builder,
            com.google.cloud.datafusion.v1beta1.VersionOrBuilder>
        availableVersionsBuilder_;

    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public java.util.List<com.google.cloud.datafusion.v1beta1.Version> getAvailableVersionsList() {
      if (availableVersionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(availableVersions_);
      } else {
        return availableVersionsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public int getAvailableVersionsCount() {
      if (availableVersionsBuilder_ == null) {
        return availableVersions_.size();
      } else {
        return availableVersionsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public com.google.cloud.datafusion.v1beta1.Version getAvailableVersions(int index) {
      if (availableVersionsBuilder_ == null) {
        return availableVersions_.get(index);
      } else {
        return availableVersionsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public Builder setAvailableVersions(
        int index, com.google.cloud.datafusion.v1beta1.Version value) {
      if (availableVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAvailableVersionsIsMutable();
        availableVersions_.set(index, value);
        onChanged();
      } else {
        availableVersionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public Builder setAvailableVersions(
        int index, com.google.cloud.datafusion.v1beta1.Version.Builder builderForValue) {
      if (availableVersionsBuilder_ == null) {
        ensureAvailableVersionsIsMutable();
        availableVersions_.set(index, builderForValue.build());
        onChanged();
      } else {
        availableVersionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public Builder addAvailableVersions(com.google.cloud.datafusion.v1beta1.Version value) {
      if (availableVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAvailableVersionsIsMutable();
        availableVersions_.add(value);
        onChanged();
      } else {
        availableVersionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public Builder addAvailableVersions(
        int index, com.google.cloud.datafusion.v1beta1.Version value) {
      if (availableVersionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAvailableVersionsIsMutable();
        availableVersions_.add(index, value);
        onChanged();
      } else {
        availableVersionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public Builder addAvailableVersions(
        com.google.cloud.datafusion.v1beta1.Version.Builder builderForValue) {
      if (availableVersionsBuilder_ == null) {
        ensureAvailableVersionsIsMutable();
        availableVersions_.add(builderForValue.build());
        onChanged();
      } else {
        availableVersionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public Builder addAvailableVersions(
        int index, com.google.cloud.datafusion.v1beta1.Version.Builder builderForValue) {
      if (availableVersionsBuilder_ == null) {
        ensureAvailableVersionsIsMutable();
        availableVersions_.add(index, builderForValue.build());
        onChanged();
      } else {
        availableVersionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public Builder addAllAvailableVersions(
        java.lang.Iterable<? extends com.google.cloud.datafusion.v1beta1.Version> values) {
      if (availableVersionsBuilder_ == null) {
        ensureAvailableVersionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, availableVersions_);
        onChanged();
      } else {
        availableVersionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public Builder clearAvailableVersions() {
      if (availableVersionsBuilder_ == null) {
        availableVersions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        availableVersionsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public Builder removeAvailableVersions(int index) {
      if (availableVersionsBuilder_ == null) {
        ensureAvailableVersionsIsMutable();
        availableVersions_.remove(index);
        onChanged();
      } else {
        availableVersionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public com.google.cloud.datafusion.v1beta1.Version.Builder getAvailableVersionsBuilder(
        int index) {
      return getAvailableVersionsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public com.google.cloud.datafusion.v1beta1.VersionOrBuilder getAvailableVersionsOrBuilder(
        int index) {
      if (availableVersionsBuilder_ == null) {
        return availableVersions_.get(index);
      } else {
        return availableVersionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datafusion.v1beta1.VersionOrBuilder>
        getAvailableVersionsOrBuilderList() {
      if (availableVersionsBuilder_ != null) {
        return availableVersionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(availableVersions_);
      }
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public com.google.cloud.datafusion.v1beta1.Version.Builder addAvailableVersionsBuilder() {
      return getAvailableVersionsFieldBuilder()
          .addBuilder(com.google.cloud.datafusion.v1beta1.Version.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public com.google.cloud.datafusion.v1beta1.Version.Builder addAvailableVersionsBuilder(
        int index) {
      return getAvailableVersionsFieldBuilder()
          .addBuilder(index, com.google.cloud.datafusion.v1beta1.Version.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Represents a list of versions that are supported.
     * </pre>
     *
     * <code>repeated .google.cloud.datafusion.v1beta1.Version available_versions = 1;</code>
     */
    public java.util.List<com.google.cloud.datafusion.v1beta1.Version.Builder>
        getAvailableVersionsBuilderList() {
      return getAvailableVersionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datafusion.v1beta1.Version,
            com.google.cloud.datafusion.v1beta1.Version.Builder,
            com.google.cloud.datafusion.v1beta1.VersionOrBuilder>
        getAvailableVersionsFieldBuilder() {
      if (availableVersionsBuilder_ == null) {
        availableVersionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datafusion.v1beta1.Version,
                com.google.cloud.datafusion.v1beta1.Version.Builder,
                com.google.cloud.datafusion.v1beta1.VersionOrBuilder>(
                availableVersions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        availableVersions_ = null;
      }
      return availableVersionsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse)
  private static final com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse();
  }

  public static com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAvailableVersionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListAvailableVersionsResponse>() {
        @java.lang.Override
        public ListAvailableVersionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAvailableVersionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAvailableVersionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
