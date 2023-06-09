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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Response message for ListAudiences RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.ListAudiencesResponse}
 */
public final class ListAudiencesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.ListAudiencesResponse)
    ListAudiencesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListAudiencesResponse.newBuilder() to construct.
  private ListAudiencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAudiencesResponse() {
    audiences_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAudiencesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ListAudiencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ListAudiencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.ListAudiencesResponse.class,
            com.google.analytics.admin.v1alpha.ListAudiencesResponse.Builder.class);
  }

  public static final int AUDIENCES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.analytics.admin.v1alpha.Audience> audiences_;
  /**
   *
   *
   * <pre>
   * List of Audiences.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1alpha.Audience> getAudiencesList() {
    return audiences_;
  }
  /**
   *
   *
   * <pre>
   * List of Audiences.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1alpha.AudienceOrBuilder>
      getAudiencesOrBuilderList() {
    return audiences_;
  }
  /**
   *
   *
   * <pre>
   * List of Audiences.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
   */
  @java.lang.Override
  public int getAudiencesCount() {
    return audiences_.size();
  }
  /**
   *
   *
   * <pre>
   * List of Audiences.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.Audience getAudiences(int index) {
    return audiences_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of Audiences.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AudienceOrBuilder getAudiencesOrBuilder(int index) {
    return audiences_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
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
    for (int i = 0; i < audiences_.size(); i++) {
      output.writeMessage(1, audiences_.get(i));
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
    for (int i = 0; i < audiences_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, audiences_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.ListAudiencesResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.ListAudiencesResponse other =
        (com.google.analytics.admin.v1alpha.ListAudiencesResponse) obj;

    if (!getAudiencesList().equals(other.getAudiencesList())) return false;
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
    if (getAudiencesCount() > 0) {
      hash = (37 * hash) + AUDIENCES_FIELD_NUMBER;
      hash = (53 * hash) + getAudiencesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.ListAudiencesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListAudiencesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListAudiencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListAudiencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListAudiencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListAudiencesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListAudiencesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListAudiencesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListAudiencesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListAudiencesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListAudiencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListAudiencesResponse parseFrom(
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
      com.google.analytics.admin.v1alpha.ListAudiencesResponse prototype) {
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
   * Response message for ListAudiences RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.ListAudiencesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.ListAudiencesResponse)
      com.google.analytics.admin.v1alpha.ListAudiencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListAudiencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListAudiencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.ListAudiencesResponse.class,
              com.google.analytics.admin.v1alpha.ListAudiencesResponse.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.ListAudiencesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (audiencesBuilder_ == null) {
        audiences_ = java.util.Collections.emptyList();
      } else {
        audiences_ = null;
        audiencesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListAudiencesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListAudiencesResponse getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.ListAudiencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListAudiencesResponse build() {
      com.google.analytics.admin.v1alpha.ListAudiencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListAudiencesResponse buildPartial() {
      com.google.analytics.admin.v1alpha.ListAudiencesResponse result =
          new com.google.analytics.admin.v1alpha.ListAudiencesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.analytics.admin.v1alpha.ListAudiencesResponse result) {
      if (audiencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          audiences_ = java.util.Collections.unmodifiableList(audiences_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.audiences_ = audiences_;
      } else {
        result.audiences_ = audiencesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.analytics.admin.v1alpha.ListAudiencesResponse result) {
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
      if (other instanceof com.google.analytics.admin.v1alpha.ListAudiencesResponse) {
        return mergeFrom((com.google.analytics.admin.v1alpha.ListAudiencesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.ListAudiencesResponse other) {
      if (other == com.google.analytics.admin.v1alpha.ListAudiencesResponse.getDefaultInstance())
        return this;
      if (audiencesBuilder_ == null) {
        if (!other.audiences_.isEmpty()) {
          if (audiences_.isEmpty()) {
            audiences_ = other.audiences_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAudiencesIsMutable();
            audiences_.addAll(other.audiences_);
          }
          onChanged();
        }
      } else {
        if (!other.audiences_.isEmpty()) {
          if (audiencesBuilder_.isEmpty()) {
            audiencesBuilder_.dispose();
            audiencesBuilder_ = null;
            audiences_ = other.audiences_;
            bitField0_ = (bitField0_ & ~0x00000001);
            audiencesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAudiencesFieldBuilder()
                    : null;
          } else {
            audiencesBuilder_.addAllMessages(other.audiences_);
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
                com.google.analytics.admin.v1alpha.Audience m =
                    input.readMessage(
                        com.google.analytics.admin.v1alpha.Audience.parser(), extensionRegistry);
                if (audiencesBuilder_ == null) {
                  ensureAudiencesIsMutable();
                  audiences_.add(m);
                } else {
                  audiencesBuilder_.addMessage(m);
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

    private java.util.List<com.google.analytics.admin.v1alpha.Audience> audiences_ =
        java.util.Collections.emptyList();

    private void ensureAudiencesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        audiences_ =
            new java.util.ArrayList<com.google.analytics.admin.v1alpha.Audience>(audiences_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.Audience,
            com.google.analytics.admin.v1alpha.Audience.Builder,
            com.google.analytics.admin.v1alpha.AudienceOrBuilder>
        audiencesBuilder_;

    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.Audience> getAudiencesList() {
      if (audiencesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(audiences_);
      } else {
        return audiencesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public int getAudiencesCount() {
      if (audiencesBuilder_ == null) {
        return audiences_.size();
      } else {
        return audiencesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.Audience getAudiences(int index) {
      if (audiencesBuilder_ == null) {
        return audiences_.get(index);
      } else {
        return audiencesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public Builder setAudiences(int index, com.google.analytics.admin.v1alpha.Audience value) {
      if (audiencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudiencesIsMutable();
        audiences_.set(index, value);
        onChanged();
      } else {
        audiencesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public Builder setAudiences(
        int index, com.google.analytics.admin.v1alpha.Audience.Builder builderForValue) {
      if (audiencesBuilder_ == null) {
        ensureAudiencesIsMutable();
        audiences_.set(index, builderForValue.build());
        onChanged();
      } else {
        audiencesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public Builder addAudiences(com.google.analytics.admin.v1alpha.Audience value) {
      if (audiencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudiencesIsMutable();
        audiences_.add(value);
        onChanged();
      } else {
        audiencesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public Builder addAudiences(int index, com.google.analytics.admin.v1alpha.Audience value) {
      if (audiencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAudiencesIsMutable();
        audiences_.add(index, value);
        onChanged();
      } else {
        audiencesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public Builder addAudiences(
        com.google.analytics.admin.v1alpha.Audience.Builder builderForValue) {
      if (audiencesBuilder_ == null) {
        ensureAudiencesIsMutable();
        audiences_.add(builderForValue.build());
        onChanged();
      } else {
        audiencesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public Builder addAudiences(
        int index, com.google.analytics.admin.v1alpha.Audience.Builder builderForValue) {
      if (audiencesBuilder_ == null) {
        ensureAudiencesIsMutable();
        audiences_.add(index, builderForValue.build());
        onChanged();
      } else {
        audiencesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public Builder addAllAudiences(
        java.lang.Iterable<? extends com.google.analytics.admin.v1alpha.Audience> values) {
      if (audiencesBuilder_ == null) {
        ensureAudiencesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, audiences_);
        onChanged();
      } else {
        audiencesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public Builder clearAudiences() {
      if (audiencesBuilder_ == null) {
        audiences_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        audiencesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public Builder removeAudiences(int index) {
      if (audiencesBuilder_ == null) {
        ensureAudiencesIsMutable();
        audiences_.remove(index);
        onChanged();
      } else {
        audiencesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.Audience.Builder getAudiencesBuilder(int index) {
      return getAudiencesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.AudienceOrBuilder getAudiencesOrBuilder(int index) {
      if (audiencesBuilder_ == null) {
        return audiences_.get(index);
      } else {
        return audiencesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.admin.v1alpha.AudienceOrBuilder>
        getAudiencesOrBuilderList() {
      if (audiencesBuilder_ != null) {
        return audiencesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(audiences_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.Audience.Builder addAudiencesBuilder() {
      return getAudiencesFieldBuilder()
          .addBuilder(com.google.analytics.admin.v1alpha.Audience.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.Audience.Builder addAudiencesBuilder(int index) {
      return getAudiencesFieldBuilder()
          .addBuilder(index, com.google.analytics.admin.v1alpha.Audience.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of Audiences.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.Audience audiences = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.Audience.Builder>
        getAudiencesBuilderList() {
      return getAudiencesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.Audience,
            com.google.analytics.admin.v1alpha.Audience.Builder,
            com.google.analytics.admin.v1alpha.AudienceOrBuilder>
        getAudiencesFieldBuilder() {
      if (audiencesBuilder_ == null) {
        audiencesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.admin.v1alpha.Audience,
                com.google.analytics.admin.v1alpha.Audience.Builder,
                com.google.analytics.admin.v1alpha.AudienceOrBuilder>(
                audiences_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        audiences_ = null;
      }
      return audiencesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.ListAudiencesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.ListAudiencesResponse)
  private static final com.google.analytics.admin.v1alpha.ListAudiencesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.ListAudiencesResponse();
  }

  public static com.google.analytics.admin.v1alpha.ListAudiencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAudiencesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListAudiencesResponse>() {
        @java.lang.Override
        public ListAudiencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAudiencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAudiencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ListAudiencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
