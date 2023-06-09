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
// source: google/cloud/dialogflow/v2/answer_record.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Response message for
 * [AnswerRecords.ListAnswerRecords][google.cloud.dialogflow.v2.AnswerRecords.ListAnswerRecords].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.ListAnswerRecordsResponse}
 */
public final class ListAnswerRecordsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.ListAnswerRecordsResponse)
    ListAnswerRecordsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListAnswerRecordsResponse.newBuilder() to construct.
  private ListAnswerRecordsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAnswerRecordsResponse() {
    answerRecords_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAnswerRecordsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.AnswerRecordsProto
        .internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.AnswerRecordsProto
        .internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse.class,
            com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse.Builder.class);
  }

  public static final int ANSWER_RECORDS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.v2.AnswerRecord> answerRecords_;
  /**
   *
   *
   * <pre>
   * The list of answer records.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.v2.AnswerRecord> getAnswerRecordsList() {
    return answerRecords_;
  }
  /**
   *
   *
   * <pre>
   * The list of answer records.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.v2.AnswerRecordOrBuilder>
      getAnswerRecordsOrBuilderList() {
    return answerRecords_;
  }
  /**
   *
   *
   * <pre>
   * The list of answer records.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
   */
  @java.lang.Override
  public int getAnswerRecordsCount() {
    return answerRecords_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of answer records.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.AnswerRecord getAnswerRecords(int index) {
    return answerRecords_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of answer records.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.AnswerRecordOrBuilder getAnswerRecordsOrBuilder(int index) {
    return answerRecords_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results. Or empty if there are no more
   * results.
   * Pass this value in the
   * [ListAnswerRecordsRequest.page_token][google.cloud.dialogflow.v2.ListAnswerRecordsRequest.page_token]
   * field in the subsequent call to `ListAnswerRecords` method to retrieve the
   * next page of results.
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
   * A token to retrieve next page of results. Or empty if there are no more
   * results.
   * Pass this value in the
   * [ListAnswerRecordsRequest.page_token][google.cloud.dialogflow.v2.ListAnswerRecordsRequest.page_token]
   * field in the subsequent call to `ListAnswerRecords` method to retrieve the
   * next page of results.
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
    for (int i = 0; i < answerRecords_.size(); i++) {
      output.writeMessage(1, answerRecords_.get(i));
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
    for (int i = 0; i < answerRecords_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, answerRecords_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse other =
        (com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse) obj;

    if (!getAnswerRecordsList().equals(other.getAnswerRecordsList())) return false;
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
    if (getAnswerRecordsCount() > 0) {
      hash = (37 * hash) + ANSWER_RECORDS_FIELD_NUMBER;
      hash = (53 * hash) + getAnswerRecordsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse parseFrom(
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
      com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse prototype) {
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
   * Response message for
   * [AnswerRecords.ListAnswerRecords][google.cloud.dialogflow.v2.AnswerRecords.ListAnswerRecords].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.ListAnswerRecordsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.ListAnswerRecordsResponse)
      com.google.cloud.dialogflow.v2.ListAnswerRecordsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.AnswerRecordsProto
          .internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.AnswerRecordsProto
          .internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse.class,
              com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (answerRecordsBuilder_ == null) {
        answerRecords_ = java.util.Collections.emptyList();
      } else {
        answerRecords_ = null;
        answerRecordsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.AnswerRecordsProto
          .internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse build() {
      com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse buildPartial() {
      com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse result =
          new com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse result) {
      if (answerRecordsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          answerRecords_ = java.util.Collections.unmodifiableList(answerRecords_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.answerRecords_ = answerRecords_;
      } else {
        result.answerRecords_ = answerRecordsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse result) {
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
      if (other instanceof com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse other) {
      if (other == com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse.getDefaultInstance())
        return this;
      if (answerRecordsBuilder_ == null) {
        if (!other.answerRecords_.isEmpty()) {
          if (answerRecords_.isEmpty()) {
            answerRecords_ = other.answerRecords_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnswerRecordsIsMutable();
            answerRecords_.addAll(other.answerRecords_);
          }
          onChanged();
        }
      } else {
        if (!other.answerRecords_.isEmpty()) {
          if (answerRecordsBuilder_.isEmpty()) {
            answerRecordsBuilder_.dispose();
            answerRecordsBuilder_ = null;
            answerRecords_ = other.answerRecords_;
            bitField0_ = (bitField0_ & ~0x00000001);
            answerRecordsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAnswerRecordsFieldBuilder()
                    : null;
          } else {
            answerRecordsBuilder_.addAllMessages(other.answerRecords_);
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
                com.google.cloud.dialogflow.v2.AnswerRecord m =
                    input.readMessage(
                        com.google.cloud.dialogflow.v2.AnswerRecord.parser(), extensionRegistry);
                if (answerRecordsBuilder_ == null) {
                  ensureAnswerRecordsIsMutable();
                  answerRecords_.add(m);
                } else {
                  answerRecordsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dialogflow.v2.AnswerRecord> answerRecords_ =
        java.util.Collections.emptyList();

    private void ensureAnswerRecordsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        answerRecords_ =
            new java.util.ArrayList<com.google.cloud.dialogflow.v2.AnswerRecord>(answerRecords_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.AnswerRecord,
            com.google.cloud.dialogflow.v2.AnswerRecord.Builder,
            com.google.cloud.dialogflow.v2.AnswerRecordOrBuilder>
        answerRecordsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.AnswerRecord> getAnswerRecordsList() {
      if (answerRecordsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(answerRecords_);
      } else {
        return answerRecordsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public int getAnswerRecordsCount() {
      if (answerRecordsBuilder_ == null) {
        return answerRecords_.size();
      } else {
        return answerRecordsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.AnswerRecord getAnswerRecords(int index) {
      if (answerRecordsBuilder_ == null) {
        return answerRecords_.get(index);
      } else {
        return answerRecordsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public Builder setAnswerRecords(int index, com.google.cloud.dialogflow.v2.AnswerRecord value) {
      if (answerRecordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnswerRecordsIsMutable();
        answerRecords_.set(index, value);
        onChanged();
      } else {
        answerRecordsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public Builder setAnswerRecords(
        int index, com.google.cloud.dialogflow.v2.AnswerRecord.Builder builderForValue) {
      if (answerRecordsBuilder_ == null) {
        ensureAnswerRecordsIsMutable();
        answerRecords_.set(index, builderForValue.build());
        onChanged();
      } else {
        answerRecordsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public Builder addAnswerRecords(com.google.cloud.dialogflow.v2.AnswerRecord value) {
      if (answerRecordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnswerRecordsIsMutable();
        answerRecords_.add(value);
        onChanged();
      } else {
        answerRecordsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public Builder addAnswerRecords(int index, com.google.cloud.dialogflow.v2.AnswerRecord value) {
      if (answerRecordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnswerRecordsIsMutable();
        answerRecords_.add(index, value);
        onChanged();
      } else {
        answerRecordsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public Builder addAnswerRecords(
        com.google.cloud.dialogflow.v2.AnswerRecord.Builder builderForValue) {
      if (answerRecordsBuilder_ == null) {
        ensureAnswerRecordsIsMutable();
        answerRecords_.add(builderForValue.build());
        onChanged();
      } else {
        answerRecordsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public Builder addAnswerRecords(
        int index, com.google.cloud.dialogflow.v2.AnswerRecord.Builder builderForValue) {
      if (answerRecordsBuilder_ == null) {
        ensureAnswerRecordsIsMutable();
        answerRecords_.add(index, builderForValue.build());
        onChanged();
      } else {
        answerRecordsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public Builder addAllAnswerRecords(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2.AnswerRecord> values) {
      if (answerRecordsBuilder_ == null) {
        ensureAnswerRecordsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, answerRecords_);
        onChanged();
      } else {
        answerRecordsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public Builder clearAnswerRecords() {
      if (answerRecordsBuilder_ == null) {
        answerRecords_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        answerRecordsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public Builder removeAnswerRecords(int index) {
      if (answerRecordsBuilder_ == null) {
        ensureAnswerRecordsIsMutable();
        answerRecords_.remove(index);
        onChanged();
      } else {
        answerRecordsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.AnswerRecord.Builder getAnswerRecordsBuilder(int index) {
      return getAnswerRecordsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.AnswerRecordOrBuilder getAnswerRecordsOrBuilder(
        int index) {
      if (answerRecordsBuilder_ == null) {
        return answerRecords_.get(index);
      } else {
        return answerRecordsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2.AnswerRecordOrBuilder>
        getAnswerRecordsOrBuilderList() {
      if (answerRecordsBuilder_ != null) {
        return answerRecordsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(answerRecords_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.AnswerRecord.Builder addAnswerRecordsBuilder() {
      return getAnswerRecordsFieldBuilder()
          .addBuilder(com.google.cloud.dialogflow.v2.AnswerRecord.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.AnswerRecord.Builder addAnswerRecordsBuilder(int index) {
      return getAnswerRecordsFieldBuilder()
          .addBuilder(index, com.google.cloud.dialogflow.v2.AnswerRecord.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of answer records.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.AnswerRecord answer_records = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.AnswerRecord.Builder>
        getAnswerRecordsBuilderList() {
      return getAnswerRecordsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.AnswerRecord,
            com.google.cloud.dialogflow.v2.AnswerRecord.Builder,
            com.google.cloud.dialogflow.v2.AnswerRecordOrBuilder>
        getAnswerRecordsFieldBuilder() {
      if (answerRecordsBuilder_ == null) {
        answerRecordsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dialogflow.v2.AnswerRecord,
                com.google.cloud.dialogflow.v2.AnswerRecord.Builder,
                com.google.cloud.dialogflow.v2.AnswerRecordOrBuilder>(
                answerRecords_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        answerRecords_ = null;
      }
      return answerRecordsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results. Or empty if there are no more
     * results.
     * Pass this value in the
     * [ListAnswerRecordsRequest.page_token][google.cloud.dialogflow.v2.ListAnswerRecordsRequest.page_token]
     * field in the subsequent call to `ListAnswerRecords` method to retrieve the
     * next page of results.
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
     * A token to retrieve next page of results. Or empty if there are no more
     * results.
     * Pass this value in the
     * [ListAnswerRecordsRequest.page_token][google.cloud.dialogflow.v2.ListAnswerRecordsRequest.page_token]
     * field in the subsequent call to `ListAnswerRecords` method to retrieve the
     * next page of results.
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
     * A token to retrieve next page of results. Or empty if there are no more
     * results.
     * Pass this value in the
     * [ListAnswerRecordsRequest.page_token][google.cloud.dialogflow.v2.ListAnswerRecordsRequest.page_token]
     * field in the subsequent call to `ListAnswerRecords` method to retrieve the
     * next page of results.
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
     * A token to retrieve next page of results. Or empty if there are no more
     * results.
     * Pass this value in the
     * [ListAnswerRecordsRequest.page_token][google.cloud.dialogflow.v2.ListAnswerRecordsRequest.page_token]
     * field in the subsequent call to `ListAnswerRecords` method to retrieve the
     * next page of results.
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
     * A token to retrieve next page of results. Or empty if there are no more
     * results.
     * Pass this value in the
     * [ListAnswerRecordsRequest.page_token][google.cloud.dialogflow.v2.ListAnswerRecordsRequest.page_token]
     * field in the subsequent call to `ListAnswerRecords` method to retrieve the
     * next page of results.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.ListAnswerRecordsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.ListAnswerRecordsResponse)
  private static final com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse();
  }

  public static com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAnswerRecordsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListAnswerRecordsResponse>() {
        @java.lang.Override
        public ListAnswerRecordsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAnswerRecordsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAnswerRecordsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ListAnswerRecordsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
