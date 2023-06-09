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
// source: google/cloud/recommendationengine/v1beta1/user_event_service.proto

package com.google.cloud.recommendationengine.v1beta1;

/**
 *
 *
 * <pre>
 * Response of the PurgeUserEventsRequest. If the long running operation is
 * successfully done, then this message is returned by the
 * google.longrunning.Operations.response field.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse}
 */
public final class PurgeUserEventsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse)
    PurgeUserEventsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PurgeUserEventsResponse.newBuilder() to construct.
  private PurgeUserEventsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PurgeUserEventsResponse() {
    userEventsSample_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PurgeUserEventsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
        .internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
        .internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse.class,
            com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse.Builder.class);
  }

  public static final int PURGED_EVENTS_COUNT_FIELD_NUMBER = 1;
  private long purgedEventsCount_ = 0L;
  /**
   *
   *
   * <pre>
   * The total count of events purged as a result of the operation.
   * </pre>
   *
   * <code>int64 purged_events_count = 1;</code>
   *
   * @return The purgedEventsCount.
   */
  @java.lang.Override
  public long getPurgedEventsCount() {
    return purgedEventsCount_;
  }

  public static final int USER_EVENTS_SAMPLE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent> userEventsSample_;
  /**
   *
   *
   * <pre>
   * A sampling of events deleted (or will be deleted) depending on the `force`
   * property in the request. Max of 500 items will be returned.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent>
      getUserEventsSampleList() {
    return userEventsSample_;
  }
  /**
   *
   *
   * <pre>
   * A sampling of events deleted (or will be deleted) depending on the `force`
   * property in the request. Max of 500 items will be returned.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder>
      getUserEventsSampleOrBuilderList() {
    return userEventsSample_;
  }
  /**
   *
   *
   * <pre>
   * A sampling of events deleted (or will be deleted) depending on the `force`
   * property in the request. Max of 500 items will be returned.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
   * </code>
   */
  @java.lang.Override
  public int getUserEventsSampleCount() {
    return userEventsSample_.size();
  }
  /**
   *
   *
   * <pre>
   * A sampling of events deleted (or will be deleted) depending on the `force`
   * property in the request. Max of 500 items will be returned.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.UserEvent getUserEventsSample(int index) {
    return userEventsSample_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A sampling of events deleted (or will be deleted) depending on the `force`
   * property in the request. Max of 500 items will be returned.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder
      getUserEventsSampleOrBuilder(int index) {
    return userEventsSample_.get(index);
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
    if (purgedEventsCount_ != 0L) {
      output.writeInt64(1, purgedEventsCount_);
    }
    for (int i = 0; i < userEventsSample_.size(); i++) {
      output.writeMessage(2, userEventsSample_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (purgedEventsCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, purgedEventsCount_);
    }
    for (int i = 0; i < userEventsSample_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, userEventsSample_.get(i));
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
    if (!(obj instanceof com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse other =
        (com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse) obj;

    if (getPurgedEventsCount() != other.getPurgedEventsCount()) return false;
    if (!getUserEventsSampleList().equals(other.getUserEventsSampleList())) return false;
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
    hash = (37 * hash) + PURGED_EVENTS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getPurgedEventsCount());
    if (getUserEventsSampleCount() > 0) {
      hash = (37 * hash) + USER_EVENTS_SAMPLE_FIELD_NUMBER;
      hash = (53 * hash) + getUserEventsSampleList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse parseFrom(
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
      com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse prototype) {
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
   * Response of the PurgeUserEventsRequest. If the long running operation is
   * successfully done, then this message is returned by the
   * google.longrunning.Operations.response field.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse)
      com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
          .internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
          .internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse.class,
              com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      purgedEventsCount_ = 0L;
      if (userEventsSampleBuilder_ == null) {
        userEventsSample_ = java.util.Collections.emptyList();
      } else {
        userEventsSample_ = null;
        userEventsSampleBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommendationengine.v1beta1.UserEventServiceOuterClass
          .internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse build() {
      com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse buildPartial() {
      com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse result =
          new com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse result) {
      if (userEventsSampleBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          userEventsSample_ = java.util.Collections.unmodifiableList(userEventsSample_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.userEventsSample_ = userEventsSample_;
      } else {
        result.userEventsSample_ = userEventsSampleBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.purgedEventsCount_ = purgedEventsCount_;
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
      if (other instanceof com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse) {
        return mergeFrom(
            (com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse other) {
      if (other
          == com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse
              .getDefaultInstance()) return this;
      if (other.getPurgedEventsCount() != 0L) {
        setPurgedEventsCount(other.getPurgedEventsCount());
      }
      if (userEventsSampleBuilder_ == null) {
        if (!other.userEventsSample_.isEmpty()) {
          if (userEventsSample_.isEmpty()) {
            userEventsSample_ = other.userEventsSample_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureUserEventsSampleIsMutable();
            userEventsSample_.addAll(other.userEventsSample_);
          }
          onChanged();
        }
      } else {
        if (!other.userEventsSample_.isEmpty()) {
          if (userEventsSampleBuilder_.isEmpty()) {
            userEventsSampleBuilder_.dispose();
            userEventsSampleBuilder_ = null;
            userEventsSample_ = other.userEventsSample_;
            bitField0_ = (bitField0_ & ~0x00000002);
            userEventsSampleBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getUserEventsSampleFieldBuilder()
                    : null;
          } else {
            userEventsSampleBuilder_.addAllMessages(other.userEventsSample_);
          }
        }
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
                purgedEventsCount_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                com.google.cloud.recommendationengine.v1beta1.UserEvent m =
                    input.readMessage(
                        com.google.cloud.recommendationengine.v1beta1.UserEvent.parser(),
                        extensionRegistry);
                if (userEventsSampleBuilder_ == null) {
                  ensureUserEventsSampleIsMutable();
                  userEventsSample_.add(m);
                } else {
                  userEventsSampleBuilder_.addMessage(m);
                }
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

    private long purgedEventsCount_;
    /**
     *
     *
     * <pre>
     * The total count of events purged as a result of the operation.
     * </pre>
     *
     * <code>int64 purged_events_count = 1;</code>
     *
     * @return The purgedEventsCount.
     */
    @java.lang.Override
    public long getPurgedEventsCount() {
      return purgedEventsCount_;
    }
    /**
     *
     *
     * <pre>
     * The total count of events purged as a result of the operation.
     * </pre>
     *
     * <code>int64 purged_events_count = 1;</code>
     *
     * @param value The purgedEventsCount to set.
     * @return This builder for chaining.
     */
    public Builder setPurgedEventsCount(long value) {

      purgedEventsCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The total count of events purged as a result of the operation.
     * </pre>
     *
     * <code>int64 purged_events_count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPurgedEventsCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      purgedEventsCount_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent>
        userEventsSample_ = java.util.Collections.emptyList();

    private void ensureUserEventsSampleIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        userEventsSample_ =
            new java.util.ArrayList<com.google.cloud.recommendationengine.v1beta1.UserEvent>(
                userEventsSample_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.recommendationengine.v1beta1.UserEvent,
            com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder,
            com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder>
        userEventsSampleBuilder_;

    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent>
        getUserEventsSampleList() {
      if (userEventsSampleBuilder_ == null) {
        return java.util.Collections.unmodifiableList(userEventsSample_);
      } else {
        return userEventsSampleBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public int getUserEventsSampleCount() {
      if (userEventsSampleBuilder_ == null) {
        return userEventsSample_.size();
      } else {
        return userEventsSampleBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEvent getUserEventsSample(int index) {
      if (userEventsSampleBuilder_ == null) {
        return userEventsSample_.get(index);
      } else {
        return userEventsSampleBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public Builder setUserEventsSample(
        int index, com.google.cloud.recommendationengine.v1beta1.UserEvent value) {
      if (userEventsSampleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserEventsSampleIsMutable();
        userEventsSample_.set(index, value);
        onChanged();
      } else {
        userEventsSampleBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public Builder setUserEventsSample(
        int index,
        com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder builderForValue) {
      if (userEventsSampleBuilder_ == null) {
        ensureUserEventsSampleIsMutable();
        userEventsSample_.set(index, builderForValue.build());
        onChanged();
      } else {
        userEventsSampleBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public Builder addUserEventsSample(
        com.google.cloud.recommendationengine.v1beta1.UserEvent value) {
      if (userEventsSampleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserEventsSampleIsMutable();
        userEventsSample_.add(value);
        onChanged();
      } else {
        userEventsSampleBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public Builder addUserEventsSample(
        int index, com.google.cloud.recommendationengine.v1beta1.UserEvent value) {
      if (userEventsSampleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserEventsSampleIsMutable();
        userEventsSample_.add(index, value);
        onChanged();
      } else {
        userEventsSampleBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public Builder addUserEventsSample(
        com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder builderForValue) {
      if (userEventsSampleBuilder_ == null) {
        ensureUserEventsSampleIsMutable();
        userEventsSample_.add(builderForValue.build());
        onChanged();
      } else {
        userEventsSampleBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public Builder addUserEventsSample(
        int index,
        com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder builderForValue) {
      if (userEventsSampleBuilder_ == null) {
        ensureUserEventsSampleIsMutable();
        userEventsSample_.add(index, builderForValue.build());
        onChanged();
      } else {
        userEventsSampleBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public Builder addAllUserEventsSample(
        java.lang.Iterable<? extends com.google.cloud.recommendationengine.v1beta1.UserEvent>
            values) {
      if (userEventsSampleBuilder_ == null) {
        ensureUserEventsSampleIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, userEventsSample_);
        onChanged();
      } else {
        userEventsSampleBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public Builder clearUserEventsSample() {
      if (userEventsSampleBuilder_ == null) {
        userEventsSample_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        userEventsSampleBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public Builder removeUserEventsSample(int index) {
      if (userEventsSampleBuilder_ == null) {
        ensureUserEventsSampleIsMutable();
        userEventsSample_.remove(index);
        onChanged();
      } else {
        userEventsSampleBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder
        getUserEventsSampleBuilder(int index) {
      return getUserEventsSampleFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder
        getUserEventsSampleOrBuilder(int index) {
      if (userEventsSampleBuilder_ == null) {
        return userEventsSample_.get(index);
      } else {
        return userEventsSampleBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder>
        getUserEventsSampleOrBuilderList() {
      if (userEventsSampleBuilder_ != null) {
        return userEventsSampleBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(userEventsSample_);
      }
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder
        addUserEventsSampleBuilder() {
      return getUserEventsSampleFieldBuilder()
          .addBuilder(com.google.cloud.recommendationengine.v1beta1.UserEvent.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder
        addUserEventsSampleBuilder(int index) {
      return getUserEventsSampleFieldBuilder()
          .addBuilder(
              index, com.google.cloud.recommendationengine.v1beta1.UserEvent.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A sampling of events deleted (or will be deleted) depending on the `force`
     * property in the request. Max of 500 items will be returned.
     * </pre>
     *
     * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events_sample = 2;
     * </code>
     */
    public java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder>
        getUserEventsSampleBuilderList() {
      return getUserEventsSampleFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.recommendationengine.v1beta1.UserEvent,
            com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder,
            com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder>
        getUserEventsSampleFieldBuilder() {
      if (userEventsSampleBuilder_ == null) {
        userEventsSampleBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.recommendationengine.v1beta1.UserEvent,
                com.google.cloud.recommendationengine.v1beta1.UserEvent.Builder,
                com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder>(
                userEventsSample_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        userEventsSample_ = null;
      }
      return userEventsSampleBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse)
  private static final com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse();
  }

  public static com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PurgeUserEventsResponse> PARSER =
      new com.google.protobuf.AbstractParser<PurgeUserEventsResponse>() {
        @java.lang.Override
        public PurgeUserEventsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<PurgeUserEventsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PurgeUserEventsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.PurgeUserEventsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
