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
// source: google/cloud/apigeeregistry/v1/registry_service.proto

package com.google.cloud.apigeeregistry.v1;

/**
 *
 *
 * <pre>
 * Response message for ListApiSpecRevisionsResponse.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse}
 */
public final class ListApiSpecRevisionsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse)
    ListApiSpecRevisionsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListApiSpecRevisionsResponse.newBuilder() to construct.
  private ListApiSpecRevisionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListApiSpecRevisionsResponse() {
    apiSpecs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListApiSpecRevisionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
        .internal_static_google_cloud_apigeeregistry_v1_ListApiSpecRevisionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
        .internal_static_google_cloud_apigeeregistry_v1_ListApiSpecRevisionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse.class,
            com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse.Builder.class);
  }

  public static final int API_SPECS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.apigeeregistry.v1.ApiSpec> apiSpecs_;
  /**
   *
   *
   * <pre>
   * The revisions of the spec.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.apigeeregistry.v1.ApiSpec> getApiSpecsList() {
    return apiSpecs_;
  }
  /**
   *
   *
   * <pre>
   * The revisions of the spec.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.apigeeregistry.v1.ApiSpecOrBuilder>
      getApiSpecsOrBuilderList() {
    return apiSpecs_;
  }
  /**
   *
   *
   * <pre>
   * The revisions of the spec.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
   */
  @java.lang.Override
  public int getApiSpecsCount() {
    return apiSpecs_.size();
  }
  /**
   *
   *
   * <pre>
   * The revisions of the spec.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ApiSpec getApiSpecs(int index) {
    return apiSpecs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The revisions of the spec.
   * </pre>
   *
   * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ApiSpecOrBuilder getApiSpecsOrBuilder(int index) {
    return apiSpecs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token that can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < apiSpecs_.size(); i++) {
      output.writeMessage(1, apiSpecs_.get(i));
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
    for (int i = 0; i < apiSpecs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, apiSpecs_.get(i));
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
    if (!(obj instanceof com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse other =
        (com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse) obj;

    if (!getApiSpecsList().equals(other.getApiSpecsList())) return false;
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
    if (getApiSpecsCount() > 0) {
      hash = (37 * hash) + API_SPECS_FIELD_NUMBER;
      hash = (53 * hash) + getApiSpecsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse parseFrom(
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
      com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse prototype) {
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
   * Response message for ListApiSpecRevisionsResponse.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse)
      com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_ListApiSpecRevisionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_ListApiSpecRevisionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse.class,
              com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse.Builder.class);
    }

    // Construct using com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (apiSpecsBuilder_ == null) {
        apiSpecs_ = java.util.Collections.emptyList();
      } else {
        apiSpecs_ = null;
        apiSpecsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.apigeeregistry.v1.RegistryServiceProto
          .internal_static_google_cloud_apigeeregistry_v1_ListApiSpecRevisionsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse build() {
      com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse buildPartial() {
      com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse result =
          new com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse result) {
      if (apiSpecsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          apiSpecs_ = java.util.Collections.unmodifiableList(apiSpecs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.apiSpecs_ = apiSpecs_;
      } else {
        result.apiSpecs_ = apiSpecsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse result) {
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
      if (other instanceof com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse) {
        return mergeFrom((com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse other) {
      if (other
          == com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse.getDefaultInstance())
        return this;
      if (apiSpecsBuilder_ == null) {
        if (!other.apiSpecs_.isEmpty()) {
          if (apiSpecs_.isEmpty()) {
            apiSpecs_ = other.apiSpecs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureApiSpecsIsMutable();
            apiSpecs_.addAll(other.apiSpecs_);
          }
          onChanged();
        }
      } else {
        if (!other.apiSpecs_.isEmpty()) {
          if (apiSpecsBuilder_.isEmpty()) {
            apiSpecsBuilder_.dispose();
            apiSpecsBuilder_ = null;
            apiSpecs_ = other.apiSpecs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            apiSpecsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getApiSpecsFieldBuilder()
                    : null;
          } else {
            apiSpecsBuilder_.addAllMessages(other.apiSpecs_);
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
                com.google.cloud.apigeeregistry.v1.ApiSpec m =
                    input.readMessage(
                        com.google.cloud.apigeeregistry.v1.ApiSpec.parser(), extensionRegistry);
                if (apiSpecsBuilder_ == null) {
                  ensureApiSpecsIsMutable();
                  apiSpecs_.add(m);
                } else {
                  apiSpecsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.apigeeregistry.v1.ApiSpec> apiSpecs_ =
        java.util.Collections.emptyList();

    private void ensureApiSpecsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        apiSpecs_ = new java.util.ArrayList<com.google.cloud.apigeeregistry.v1.ApiSpec>(apiSpecs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.apigeeregistry.v1.ApiSpec,
            com.google.cloud.apigeeregistry.v1.ApiSpec.Builder,
            com.google.cloud.apigeeregistry.v1.ApiSpecOrBuilder>
        apiSpecsBuilder_;

    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public java.util.List<com.google.cloud.apigeeregistry.v1.ApiSpec> getApiSpecsList() {
      if (apiSpecsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(apiSpecs_);
      } else {
        return apiSpecsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public int getApiSpecsCount() {
      if (apiSpecsBuilder_ == null) {
        return apiSpecs_.size();
      } else {
        return apiSpecsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiSpec getApiSpecs(int index) {
      if (apiSpecsBuilder_ == null) {
        return apiSpecs_.get(index);
      } else {
        return apiSpecsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public Builder setApiSpecs(int index, com.google.cloud.apigeeregistry.v1.ApiSpec value) {
      if (apiSpecsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiSpecsIsMutable();
        apiSpecs_.set(index, value);
        onChanged();
      } else {
        apiSpecsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public Builder setApiSpecs(
        int index, com.google.cloud.apigeeregistry.v1.ApiSpec.Builder builderForValue) {
      if (apiSpecsBuilder_ == null) {
        ensureApiSpecsIsMutable();
        apiSpecs_.set(index, builderForValue.build());
        onChanged();
      } else {
        apiSpecsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public Builder addApiSpecs(com.google.cloud.apigeeregistry.v1.ApiSpec value) {
      if (apiSpecsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiSpecsIsMutable();
        apiSpecs_.add(value);
        onChanged();
      } else {
        apiSpecsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public Builder addApiSpecs(int index, com.google.cloud.apigeeregistry.v1.ApiSpec value) {
      if (apiSpecsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiSpecsIsMutable();
        apiSpecs_.add(index, value);
        onChanged();
      } else {
        apiSpecsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public Builder addApiSpecs(com.google.cloud.apigeeregistry.v1.ApiSpec.Builder builderForValue) {
      if (apiSpecsBuilder_ == null) {
        ensureApiSpecsIsMutable();
        apiSpecs_.add(builderForValue.build());
        onChanged();
      } else {
        apiSpecsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public Builder addApiSpecs(
        int index, com.google.cloud.apigeeregistry.v1.ApiSpec.Builder builderForValue) {
      if (apiSpecsBuilder_ == null) {
        ensureApiSpecsIsMutable();
        apiSpecs_.add(index, builderForValue.build());
        onChanged();
      } else {
        apiSpecsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public Builder addAllApiSpecs(
        java.lang.Iterable<? extends com.google.cloud.apigeeregistry.v1.ApiSpec> values) {
      if (apiSpecsBuilder_ == null) {
        ensureApiSpecsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, apiSpecs_);
        onChanged();
      } else {
        apiSpecsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public Builder clearApiSpecs() {
      if (apiSpecsBuilder_ == null) {
        apiSpecs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        apiSpecsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public Builder removeApiSpecs(int index) {
      if (apiSpecsBuilder_ == null) {
        ensureApiSpecsIsMutable();
        apiSpecs_.remove(index);
        onChanged();
      } else {
        apiSpecsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiSpec.Builder getApiSpecsBuilder(int index) {
      return getApiSpecsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiSpecOrBuilder getApiSpecsOrBuilder(int index) {
      if (apiSpecsBuilder_ == null) {
        return apiSpecs_.get(index);
      } else {
        return apiSpecsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.apigeeregistry.v1.ApiSpecOrBuilder>
        getApiSpecsOrBuilderList() {
      if (apiSpecsBuilder_ != null) {
        return apiSpecsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(apiSpecs_);
      }
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiSpec.Builder addApiSpecsBuilder() {
      return getApiSpecsFieldBuilder()
          .addBuilder(com.google.cloud.apigeeregistry.v1.ApiSpec.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public com.google.cloud.apigeeregistry.v1.ApiSpec.Builder addApiSpecsBuilder(int index) {
      return getApiSpecsFieldBuilder()
          .addBuilder(index, com.google.cloud.apigeeregistry.v1.ApiSpec.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The revisions of the spec.
     * </pre>
     *
     * <code>repeated .google.cloud.apigeeregistry.v1.ApiSpec api_specs = 1;</code>
     */
    public java.util.List<com.google.cloud.apigeeregistry.v1.ApiSpec.Builder>
        getApiSpecsBuilderList() {
      return getApiSpecsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.apigeeregistry.v1.ApiSpec,
            com.google.cloud.apigeeregistry.v1.ApiSpec.Builder,
            com.google.cloud.apigeeregistry.v1.ApiSpecOrBuilder>
        getApiSpecsFieldBuilder() {
      if (apiSpecsBuilder_ == null) {
        apiSpecsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.apigeeregistry.v1.ApiSpec,
                com.google.cloud.apigeeregistry.v1.ApiSpec.Builder,
                com.google.cloud.apigeeregistry.v1.ApiSpecOrBuilder>(
                apiSpecs_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        apiSpecs_ = null;
      }
      return apiSpecsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token that can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse)
  private static final com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse();
  }

  public static com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListApiSpecRevisionsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListApiSpecRevisionsResponse>() {
        @java.lang.Override
        public ListApiSpecRevisionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListApiSpecRevisionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListApiSpecRevisionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apigeeregistry.v1.ListApiSpecRevisionsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
