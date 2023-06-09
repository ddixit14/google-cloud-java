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
// source: google/cloud/dialogflow/cx/v3/changelog.proto

package com.google.cloud.dialogflow.cx.v3;

/**
 *
 *
 * <pre>
 * The response message for
 * [Changelogs.ListChangelogs][google.cloud.dialogflow.cx.v3.Changelogs.ListChangelogs].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.ListChangelogsResponse}
 */
public final class ListChangelogsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.ListChangelogsResponse)
    ListChangelogsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListChangelogsResponse.newBuilder() to construct.
  private ListChangelogsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListChangelogsResponse() {
    changelogs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListChangelogsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.ChangelogProto
        .internal_static_google_cloud_dialogflow_cx_v3_ListChangelogsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.ChangelogProto
        .internal_static_google_cloud_dialogflow_cx_v3_ListChangelogsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse.class,
            com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse.Builder.class);
  }

  public static final int CHANGELOGS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.cx.v3.Changelog> changelogs_;
  /**
   *
   *
   * <pre>
   * The list of changelogs. There will be a maximum number of items returned
   * based on the page_size field in the request. The changelogs will be ordered
   * by timestamp.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.cx.v3.Changelog> getChangelogsList() {
    return changelogs_;
  }
  /**
   *
   *
   * <pre>
   * The list of changelogs. There will be a maximum number of items returned
   * based on the page_size field in the request. The changelogs will be ordered
   * by timestamp.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.cx.v3.ChangelogOrBuilder>
      getChangelogsOrBuilderList() {
    return changelogs_;
  }
  /**
   *
   *
   * <pre>
   * The list of changelogs. There will be a maximum number of items returned
   * based on the page_size field in the request. The changelogs will be ordered
   * by timestamp.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
   */
  @java.lang.Override
  public int getChangelogsCount() {
    return changelogs_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of changelogs. There will be a maximum number of items returned
   * based on the page_size field in the request. The changelogs will be ordered
   * by timestamp.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.Changelog getChangelogs(int index) {
    return changelogs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of changelogs. There will be a maximum number of items returned
   * based on the page_size field in the request. The changelogs will be ordered
   * by timestamp.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.ChangelogOrBuilder getChangelogsOrBuilder(int index) {
    return changelogs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
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
   * Token to retrieve the next page of results, or empty if there are no more
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
    for (int i = 0; i < changelogs_.size(); i++) {
      output.writeMessage(1, changelogs_.get(i));
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
    for (int i = 0; i < changelogs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, changelogs_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse other =
        (com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse) obj;

    if (!getChangelogsList().equals(other.getChangelogsList())) return false;
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
    if (getChangelogsCount() > 0) {
      hash = (37 * hash) + CHANGELOGS_FIELD_NUMBER;
      hash = (53 * hash) + getChangelogsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse parseFrom(
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
      com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse prototype) {
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
   * The response message for
   * [Changelogs.ListChangelogs][google.cloud.dialogflow.cx.v3.Changelogs.ListChangelogs].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.ListChangelogsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.ListChangelogsResponse)
      com.google.cloud.dialogflow.cx.v3.ListChangelogsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.ChangelogProto
          .internal_static_google_cloud_dialogflow_cx_v3_ListChangelogsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.ChangelogProto
          .internal_static_google_cloud_dialogflow_cx_v3_ListChangelogsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse.class,
              com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (changelogsBuilder_ == null) {
        changelogs_ = java.util.Collections.emptyList();
      } else {
        changelogs_ = null;
        changelogsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.ChangelogProto
          .internal_static_google_cloud_dialogflow_cx_v3_ListChangelogsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse build() {
      com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse buildPartial() {
      com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse result =
          new com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse result) {
      if (changelogsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          changelogs_ = java.util.Collections.unmodifiableList(changelogs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.changelogs_ = changelogs_;
      } else {
        result.changelogs_ = changelogsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse result) {
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse other) {
      if (other == com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse.getDefaultInstance())
        return this;
      if (changelogsBuilder_ == null) {
        if (!other.changelogs_.isEmpty()) {
          if (changelogs_.isEmpty()) {
            changelogs_ = other.changelogs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureChangelogsIsMutable();
            changelogs_.addAll(other.changelogs_);
          }
          onChanged();
        }
      } else {
        if (!other.changelogs_.isEmpty()) {
          if (changelogsBuilder_.isEmpty()) {
            changelogsBuilder_.dispose();
            changelogsBuilder_ = null;
            changelogs_ = other.changelogs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            changelogsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getChangelogsFieldBuilder()
                    : null;
          } else {
            changelogsBuilder_.addAllMessages(other.changelogs_);
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
                com.google.cloud.dialogflow.cx.v3.Changelog m =
                    input.readMessage(
                        com.google.cloud.dialogflow.cx.v3.Changelog.parser(), extensionRegistry);
                if (changelogsBuilder_ == null) {
                  ensureChangelogsIsMutable();
                  changelogs_.add(m);
                } else {
                  changelogsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dialogflow.cx.v3.Changelog> changelogs_ =
        java.util.Collections.emptyList();

    private void ensureChangelogsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        changelogs_ =
            new java.util.ArrayList<com.google.cloud.dialogflow.cx.v3.Changelog>(changelogs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.Changelog,
            com.google.cloud.dialogflow.cx.v3.Changelog.Builder,
            com.google.cloud.dialogflow.cx.v3.ChangelogOrBuilder>
        changelogsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3.Changelog> getChangelogsList() {
      if (changelogsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(changelogs_);
      } else {
        return changelogsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public int getChangelogsCount() {
      if (changelogsBuilder_ == null) {
        return changelogs_.size();
      } else {
        return changelogsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Changelog getChangelogs(int index) {
      if (changelogsBuilder_ == null) {
        return changelogs_.get(index);
      } else {
        return changelogsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public Builder setChangelogs(int index, com.google.cloud.dialogflow.cx.v3.Changelog value) {
      if (changelogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChangelogsIsMutable();
        changelogs_.set(index, value);
        onChanged();
      } else {
        changelogsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public Builder setChangelogs(
        int index, com.google.cloud.dialogflow.cx.v3.Changelog.Builder builderForValue) {
      if (changelogsBuilder_ == null) {
        ensureChangelogsIsMutable();
        changelogs_.set(index, builderForValue.build());
        onChanged();
      } else {
        changelogsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public Builder addChangelogs(com.google.cloud.dialogflow.cx.v3.Changelog value) {
      if (changelogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChangelogsIsMutable();
        changelogs_.add(value);
        onChanged();
      } else {
        changelogsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public Builder addChangelogs(int index, com.google.cloud.dialogflow.cx.v3.Changelog value) {
      if (changelogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChangelogsIsMutable();
        changelogs_.add(index, value);
        onChanged();
      } else {
        changelogsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public Builder addChangelogs(
        com.google.cloud.dialogflow.cx.v3.Changelog.Builder builderForValue) {
      if (changelogsBuilder_ == null) {
        ensureChangelogsIsMutable();
        changelogs_.add(builderForValue.build());
        onChanged();
      } else {
        changelogsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public Builder addChangelogs(
        int index, com.google.cloud.dialogflow.cx.v3.Changelog.Builder builderForValue) {
      if (changelogsBuilder_ == null) {
        ensureChangelogsIsMutable();
        changelogs_.add(index, builderForValue.build());
        onChanged();
      } else {
        changelogsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public Builder addAllChangelogs(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.cx.v3.Changelog> values) {
      if (changelogsBuilder_ == null) {
        ensureChangelogsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, changelogs_);
        onChanged();
      } else {
        changelogsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public Builder clearChangelogs() {
      if (changelogsBuilder_ == null) {
        changelogs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        changelogsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public Builder removeChangelogs(int index) {
      if (changelogsBuilder_ == null) {
        ensureChangelogsIsMutable();
        changelogs_.remove(index);
        onChanged();
      } else {
        changelogsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Changelog.Builder getChangelogsBuilder(int index) {
      return getChangelogsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.ChangelogOrBuilder getChangelogsOrBuilder(int index) {
      if (changelogsBuilder_ == null) {
        return changelogs_.get(index);
      } else {
        return changelogsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.cx.v3.ChangelogOrBuilder>
        getChangelogsOrBuilderList() {
      if (changelogsBuilder_ != null) {
        return changelogsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(changelogs_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Changelog.Builder addChangelogsBuilder() {
      return getChangelogsFieldBuilder()
          .addBuilder(com.google.cloud.dialogflow.cx.v3.Changelog.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3.Changelog.Builder addChangelogsBuilder(int index) {
      return getChangelogsFieldBuilder()
          .addBuilder(index, com.google.cloud.dialogflow.cx.v3.Changelog.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of changelogs. There will be a maximum number of items returned
     * based on the page_size field in the request. The changelogs will be ordered
     * by timestamp.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.cx.v3.Changelog changelogs = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.cx.v3.Changelog.Builder>
        getChangelogsBuilderList() {
      return getChangelogsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3.Changelog,
            com.google.cloud.dialogflow.cx.v3.Changelog.Builder,
            com.google.cloud.dialogflow.cx.v3.ChangelogOrBuilder>
        getChangelogsFieldBuilder() {
      if (changelogsBuilder_ == null) {
        changelogsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dialogflow.cx.v3.Changelog,
                com.google.cloud.dialogflow.cx.v3.Changelog.Builder,
                com.google.cloud.dialogflow.cx.v3.ChangelogOrBuilder>(
                changelogs_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        changelogs_ = null;
      }
      return changelogsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
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
     * Token to retrieve the next page of results, or empty if there are no more
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
     * Token to retrieve the next page of results, or empty if there are no more
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
     * Token to retrieve the next page of results, or empty if there are no more
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
     * Token to retrieve the next page of results, or empty if there are no more
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.ListChangelogsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.ListChangelogsResponse)
  private static final com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse();
  }

  public static com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListChangelogsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListChangelogsResponse>() {
        @java.lang.Override
        public ListChangelogsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListChangelogsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListChangelogsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.ListChangelogsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
