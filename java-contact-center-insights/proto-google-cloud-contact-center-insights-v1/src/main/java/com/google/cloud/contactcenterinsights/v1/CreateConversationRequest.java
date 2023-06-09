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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * Request to create a conversation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.CreateConversationRequest}
 */
public final class CreateConversationRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.CreateConversationRequest)
    CreateConversationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateConversationRequest.newBuilder() to construct.
  private CreateConversationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateConversationRequest() {
    parent_ = "";
    conversationId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateConversationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_CreateConversationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_CreateConversationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.CreateConversationRequest.class,
            com.google.cloud.contactcenterinsights.v1.CreateConversationRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource of the conversation.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource of the conversation.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONVERSATION_FIELD_NUMBER = 2;
  private com.google.cloud.contactcenterinsights.v1.Conversation conversation_;
  /**
   *
   *
   * <pre>
   * Required. The conversation resource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the conversation field is set.
   */
  @java.lang.Override
  public boolean hasConversation() {
    return conversation_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The conversation resource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The conversation.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.Conversation getConversation() {
    return conversation_ == null
        ? com.google.cloud.contactcenterinsights.v1.Conversation.getDefaultInstance()
        : conversation_;
  }
  /**
   *
   *
   * <pre>
   * Required. The conversation resource to create.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.ConversationOrBuilder
      getConversationOrBuilder() {
    return conversation_ == null
        ? com.google.cloud.contactcenterinsights.v1.Conversation.getDefaultInstance()
        : conversation_;
  }

  public static final int CONVERSATION_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object conversationId_ = "";
  /**
   *
   *
   * <pre>
   * A unique ID for the new conversation. This ID will become the final
   * component of the conversation's resource name. If no ID is specified, a
   * server-generated ID will be used.
   *
   * This value should be 4-64 characters and must match the regular
   * expression `^[a-z0-9-]{4,64}$`. Valid characters are `[a-z][0-9]-`
   * </pre>
   *
   * <code>string conversation_id = 3;</code>
   *
   * @return The conversationId.
   */
  @java.lang.Override
  public java.lang.String getConversationId() {
    java.lang.Object ref = conversationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      conversationId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A unique ID for the new conversation. This ID will become the final
   * component of the conversation's resource name. If no ID is specified, a
   * server-generated ID will be used.
   *
   * This value should be 4-64 characters and must match the regular
   * expression `^[a-z0-9-]{4,64}$`. Valid characters are `[a-z][0-9]-`
   * </pre>
   *
   * <code>string conversation_id = 3;</code>
   *
   * @return The bytes for conversationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getConversationIdBytes() {
    java.lang.Object ref = conversationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      conversationId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (conversation_ != null) {
      output.writeMessage(2, getConversation());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversationId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, conversationId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (conversation_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getConversation());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversationId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, conversationId_);
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.CreateConversationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.CreateConversationRequest other =
        (com.google.cloud.contactcenterinsights.v1.CreateConversationRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasConversation() != other.hasConversation()) return false;
    if (hasConversation()) {
      if (!getConversation().equals(other.getConversation())) return false;
    }
    if (!getConversationId().equals(other.getConversationId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasConversation()) {
      hash = (37 * hash) + CONVERSATION_FIELD_NUMBER;
      hash = (53 * hash) + getConversation().hashCode();
    }
    hash = (37 * hash) + CONVERSATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConversationId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateConversationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateConversationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateConversationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateConversationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateConversationRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateConversationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateConversationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateConversationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateConversationRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateConversationRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateConversationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateConversationRequest parseFrom(
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
      com.google.cloud.contactcenterinsights.v1.CreateConversationRequest prototype) {
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
   * Request to create a conversation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.CreateConversationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.CreateConversationRequest)
      com.google.cloud.contactcenterinsights.v1.CreateConversationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_CreateConversationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_CreateConversationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.CreateConversationRequest.class,
              com.google.cloud.contactcenterinsights.v1.CreateConversationRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.contactcenterinsights.v1.CreateConversationRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      conversation_ = null;
      if (conversationBuilder_ != null) {
        conversationBuilder_.dispose();
        conversationBuilder_ = null;
      }
      conversationId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_CreateConversationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CreateConversationRequest
        getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.CreateConversationRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CreateConversationRequest build() {
      com.google.cloud.contactcenterinsights.v1.CreateConversationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CreateConversationRequest buildPartial() {
      com.google.cloud.contactcenterinsights.v1.CreateConversationRequest result =
          new com.google.cloud.contactcenterinsights.v1.CreateConversationRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.contactcenterinsights.v1.CreateConversationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.conversation_ =
            conversationBuilder_ == null ? conversation_ : conversationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.conversationId_ = conversationId_;
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.CreateConversationRequest) {
        return mergeFrom(
            (com.google.cloud.contactcenterinsights.v1.CreateConversationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.contactcenterinsights.v1.CreateConversationRequest other) {
      if (other
          == com.google.cloud.contactcenterinsights.v1.CreateConversationRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasConversation()) {
        mergeConversation(other.getConversation());
      }
      if (!other.getConversationId().isEmpty()) {
        conversationId_ = other.conversationId_;
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
            case 10:
              {
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getConversationFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                conversationId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the conversation.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the conversation.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the conversation.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the conversation.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the conversation.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.contactcenterinsights.v1.Conversation conversation_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.Conversation,
            com.google.cloud.contactcenterinsights.v1.Conversation.Builder,
            com.google.cloud.contactcenterinsights.v1.ConversationOrBuilder>
        conversationBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The conversation resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the conversation field is set.
     */
    public boolean hasConversation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The conversation.
     */
    public com.google.cloud.contactcenterinsights.v1.Conversation getConversation() {
      if (conversationBuilder_ == null) {
        return conversation_ == null
            ? com.google.cloud.contactcenterinsights.v1.Conversation.getDefaultInstance()
            : conversation_;
      } else {
        return conversationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConversation(com.google.cloud.contactcenterinsights.v1.Conversation value) {
      if (conversationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversation_ = value;
      } else {
        conversationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConversation(
        com.google.cloud.contactcenterinsights.v1.Conversation.Builder builderForValue) {
      if (conversationBuilder_ == null) {
        conversation_ = builderForValue.build();
      } else {
        conversationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeConversation(com.google.cloud.contactcenterinsights.v1.Conversation value) {
      if (conversationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && conversation_ != null
            && conversation_
                != com.google.cloud.contactcenterinsights.v1.Conversation.getDefaultInstance()) {
          getConversationBuilder().mergeFrom(value);
        } else {
          conversation_ = value;
        }
      } else {
        conversationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearConversation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      conversation_ = null;
      if (conversationBuilder_ != null) {
        conversationBuilder_.dispose();
        conversationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.contactcenterinsights.v1.Conversation.Builder getConversationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getConversationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.contactcenterinsights.v1.ConversationOrBuilder
        getConversationOrBuilder() {
      if (conversationBuilder_ != null) {
        return conversationBuilder_.getMessageOrBuilder();
      } else {
        return conversation_ == null
            ? com.google.cloud.contactcenterinsights.v1.Conversation.getDefaultInstance()
            : conversation_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation resource to create.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.Conversation,
            com.google.cloud.contactcenterinsights.v1.Conversation.Builder,
            com.google.cloud.contactcenterinsights.v1.ConversationOrBuilder>
        getConversationFieldBuilder() {
      if (conversationBuilder_ == null) {
        conversationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.Conversation,
                com.google.cloud.contactcenterinsights.v1.Conversation.Builder,
                com.google.cloud.contactcenterinsights.v1.ConversationOrBuilder>(
                getConversation(), getParentForChildren(), isClean());
        conversation_ = null;
      }
      return conversationBuilder_;
    }

    private java.lang.Object conversationId_ = "";
    /**
     *
     *
     * <pre>
     * A unique ID for the new conversation. This ID will become the final
     * component of the conversation's resource name. If no ID is specified, a
     * server-generated ID will be used.
     *
     * This value should be 4-64 characters and must match the regular
     * expression `^[a-z0-9-]{4,64}$`. Valid characters are `[a-z][0-9]-`
     * </pre>
     *
     * <code>string conversation_id = 3;</code>
     *
     * @return The conversationId.
     */
    public java.lang.String getConversationId() {
      java.lang.Object ref = conversationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        conversationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A unique ID for the new conversation. This ID will become the final
     * component of the conversation's resource name. If no ID is specified, a
     * server-generated ID will be used.
     *
     * This value should be 4-64 characters and must match the regular
     * expression `^[a-z0-9-]{4,64}$`. Valid characters are `[a-z][0-9]-`
     * </pre>
     *
     * <code>string conversation_id = 3;</code>
     *
     * @return The bytes for conversationId.
     */
    public com.google.protobuf.ByteString getConversationIdBytes() {
      java.lang.Object ref = conversationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        conversationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A unique ID for the new conversation. This ID will become the final
     * component of the conversation's resource name. If no ID is specified, a
     * server-generated ID will be used.
     *
     * This value should be 4-64 characters and must match the regular
     * expression `^[a-z0-9-]{4,64}$`. Valid characters are `[a-z][0-9]-`
     * </pre>
     *
     * <code>string conversation_id = 3;</code>
     *
     * @param value The conversationId to set.
     * @return This builder for chaining.
     */
    public Builder setConversationId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      conversationId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A unique ID for the new conversation. This ID will become the final
     * component of the conversation's resource name. If no ID is specified, a
     * server-generated ID will be used.
     *
     * This value should be 4-64 characters and must match the regular
     * expression `^[a-z0-9-]{4,64}$`. Valid characters are `[a-z][0-9]-`
     * </pre>
     *
     * <code>string conversation_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConversationId() {
      conversationId_ = getDefaultInstance().getConversationId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A unique ID for the new conversation. This ID will become the final
     * component of the conversation's resource name. If no ID is specified, a
     * server-generated ID will be used.
     *
     * This value should be 4-64 characters and must match the regular
     * expression `^[a-z0-9-]{4,64}$`. Valid characters are `[a-z][0-9]-`
     * </pre>
     *
     * <code>string conversation_id = 3;</code>
     *
     * @param value The bytes for conversationId to set.
     * @return This builder for chaining.
     */
    public Builder setConversationIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      conversationId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.CreateConversationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.CreateConversationRequest)
  private static final com.google.cloud.contactcenterinsights.v1.CreateConversationRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.CreateConversationRequest();
  }

  public static com.google.cloud.contactcenterinsights.v1.CreateConversationRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateConversationRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateConversationRequest>() {
        @java.lang.Override
        public CreateConversationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateConversationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateConversationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.CreateConversationRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
