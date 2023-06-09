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
// source: google/cloud/dialogflow/v2/conversation_profile.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The request message for [ConversationProfiles.ClearFeature][].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest}
 */
public final class ClearSuggestionFeatureConfigRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest)
    ClearSuggestionFeatureConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ClearSuggestionFeatureConfigRequest.newBuilder() to construct.
  private ClearSuggestionFeatureConfigRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ClearSuggestionFeatureConfigRequest() {
    conversationProfile_ = "";
    participantRole_ = 0;
    suggestionFeatureType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ClearSuggestionFeatureConfigRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationProfileProto
        .internal_static_google_cloud_dialogflow_v2_ClearSuggestionFeatureConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationProfileProto
        .internal_static_google_cloud_dialogflow_v2_ClearSuggestionFeatureConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest.class,
            com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest.Builder.class);
  }

  public static final int CONVERSATION_PROFILE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object conversationProfile_ = "";
  /**
   *
   *
   * <pre>
   * Required. The Conversation Profile to add or update the suggestion feature
   * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
   * </pre>
   *
   * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The conversationProfile.
   */
  @java.lang.Override
  public java.lang.String getConversationProfile() {
    java.lang.Object ref = conversationProfile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      conversationProfile_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The Conversation Profile to add or update the suggestion feature
   * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
   * </pre>
   *
   * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for conversationProfile.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getConversationProfileBytes() {
    java.lang.Object ref = conversationProfile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      conversationProfile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTICIPANT_ROLE_FIELD_NUMBER = 2;
  private int participantRole_ = 0;
  /**
   *
   *
   * <pre>
   * Required. The participant role to remove the suggestion feature
   * config. Only HUMAN_AGENT or END_USER can be used.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for participantRole.
   */
  @java.lang.Override
  public int getParticipantRoleValue() {
    return participantRole_;
  }
  /**
   *
   *
   * <pre>
   * Required. The participant role to remove the suggestion feature
   * config. Only HUMAN_AGENT or END_USER can be used.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The participantRole.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.Participant.Role getParticipantRole() {
    com.google.cloud.dialogflow.v2.Participant.Role result =
        com.google.cloud.dialogflow.v2.Participant.Role.forNumber(participantRole_);
    return result == null ? com.google.cloud.dialogflow.v2.Participant.Role.UNRECOGNIZED : result;
  }

  public static final int SUGGESTION_FEATURE_TYPE_FIELD_NUMBER = 3;
  private int suggestionFeatureType_ = 0;
  /**
   *
   *
   * <pre>
   * Required. The type of the suggestion feature to remove.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.SuggestionFeature.Type suggestion_feature_type = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for suggestionFeatureType.
   */
  @java.lang.Override
  public int getSuggestionFeatureTypeValue() {
    return suggestionFeatureType_;
  }
  /**
   *
   *
   * <pre>
   * Required. The type of the suggestion feature to remove.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.SuggestionFeature.Type suggestion_feature_type = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The suggestionFeatureType.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SuggestionFeature.Type getSuggestionFeatureType() {
    com.google.cloud.dialogflow.v2.SuggestionFeature.Type result =
        com.google.cloud.dialogflow.v2.SuggestionFeature.Type.forNumber(suggestionFeatureType_);
    return result == null
        ? com.google.cloud.dialogflow.v2.SuggestionFeature.Type.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversationProfile_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, conversationProfile_);
    }
    if (participantRole_
        != com.google.cloud.dialogflow.v2.Participant.Role.ROLE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, participantRole_);
    }
    if (suggestionFeatureType_
        != com.google.cloud.dialogflow.v2.SuggestionFeature.Type.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, suggestionFeatureType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversationProfile_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, conversationProfile_);
    }
    if (participantRole_
        != com.google.cloud.dialogflow.v2.Participant.Role.ROLE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, participantRole_);
    }
    if (suggestionFeatureType_
        != com.google.cloud.dialogflow.v2.SuggestionFeature.Type.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, suggestionFeatureType_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest other =
        (com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest) obj;

    if (!getConversationProfile().equals(other.getConversationProfile())) return false;
    if (participantRole_ != other.participantRole_) return false;
    if (suggestionFeatureType_ != other.suggestionFeatureType_) return false;
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
    hash = (37 * hash) + CONVERSATION_PROFILE_FIELD_NUMBER;
    hash = (53 * hash) + getConversationProfile().hashCode();
    hash = (37 * hash) + PARTICIPANT_ROLE_FIELD_NUMBER;
    hash = (53 * hash) + participantRole_;
    hash = (37 * hash) + SUGGESTION_FEATURE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + suggestionFeatureType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest parseFrom(
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
      com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest prototype) {
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
   * The request message for [ConversationProfiles.ClearFeature][].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest)
      com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto
          .internal_static_google_cloud_dialogflow_v2_ClearSuggestionFeatureConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto
          .internal_static_google_cloud_dialogflow_v2_ClearSuggestionFeatureConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest.class,
              com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      conversationProfile_ = "";
      participantRole_ = 0;
      suggestionFeatureType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationProfileProto
          .internal_static_google_cloud_dialogflow_v2_ClearSuggestionFeatureConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest build() {
      com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest buildPartial() {
      com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest result =
          new com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.conversationProfile_ = conversationProfile_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.participantRole_ = participantRole_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.suggestionFeatureType_ = suggestionFeatureType_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest) {
        return mergeFrom(
            (com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest other) {
      if (other
          == com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest
              .getDefaultInstance()) return this;
      if (!other.getConversationProfile().isEmpty()) {
        conversationProfile_ = other.conversationProfile_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.participantRole_ != 0) {
        setParticipantRoleValue(other.getParticipantRoleValue());
      }
      if (other.suggestionFeatureType_ != 0) {
        setSuggestionFeatureTypeValue(other.getSuggestionFeatureTypeValue());
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
                conversationProfile_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                participantRole_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                suggestionFeatureType_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object conversationProfile_ = "";
    /**
     *
     *
     * <pre>
     * Required. The Conversation Profile to add or update the suggestion feature
     * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
     * </pre>
     *
     * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The conversationProfile.
     */
    public java.lang.String getConversationProfile() {
      java.lang.Object ref = conversationProfile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        conversationProfile_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Conversation Profile to add or update the suggestion feature
     * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
     * </pre>
     *
     * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for conversationProfile.
     */
    public com.google.protobuf.ByteString getConversationProfileBytes() {
      java.lang.Object ref = conversationProfile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        conversationProfile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Conversation Profile to add or update the suggestion feature
     * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
     * </pre>
     *
     * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The conversationProfile to set.
     * @return This builder for chaining.
     */
    public Builder setConversationProfile(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      conversationProfile_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Conversation Profile to add or update the suggestion feature
     * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
     * </pre>
     *
     * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConversationProfile() {
      conversationProfile_ = getDefaultInstance().getConversationProfile();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Conversation Profile to add or update the suggestion feature
     * config. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationProfiles/&lt;Conversation Profile ID&gt;`.
     * </pre>
     *
     * <code>string conversation_profile = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for conversationProfile to set.
     * @return This builder for chaining.
     */
    public Builder setConversationProfileBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      conversationProfile_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int participantRole_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The participant role to remove the suggestion feature
     * config. Only HUMAN_AGENT or END_USER can be used.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for participantRole.
     */
    @java.lang.Override
    public int getParticipantRoleValue() {
      return participantRole_;
    }
    /**
     *
     *
     * <pre>
     * Required. The participant role to remove the suggestion feature
     * config. Only HUMAN_AGENT or END_USER can be used.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for participantRole to set.
     * @return This builder for chaining.
     */
    public Builder setParticipantRoleValue(int value) {
      participantRole_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The participant role to remove the suggestion feature
     * config. Only HUMAN_AGENT or END_USER can be used.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The participantRole.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.Participant.Role getParticipantRole() {
      com.google.cloud.dialogflow.v2.Participant.Role result =
          com.google.cloud.dialogflow.v2.Participant.Role.forNumber(participantRole_);
      return result == null ? com.google.cloud.dialogflow.v2.Participant.Role.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The participant role to remove the suggestion feature
     * config. Only HUMAN_AGENT or END_USER can be used.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The participantRole to set.
     * @return This builder for chaining.
     */
    public Builder setParticipantRole(com.google.cloud.dialogflow.v2.Participant.Role value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      participantRole_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The participant role to remove the suggestion feature
     * config. Only HUMAN_AGENT or END_USER can be used.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.Participant.Role participant_role = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParticipantRole() {
      bitField0_ = (bitField0_ & ~0x00000002);
      participantRole_ = 0;
      onChanged();
      return this;
    }

    private int suggestionFeatureType_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The type of the suggestion feature to remove.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.SuggestionFeature.Type suggestion_feature_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for suggestionFeatureType.
     */
    @java.lang.Override
    public int getSuggestionFeatureTypeValue() {
      return suggestionFeatureType_;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of the suggestion feature to remove.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.SuggestionFeature.Type suggestion_feature_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for suggestionFeatureType to set.
     * @return This builder for chaining.
     */
    public Builder setSuggestionFeatureTypeValue(int value) {
      suggestionFeatureType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of the suggestion feature to remove.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.SuggestionFeature.Type suggestion_feature_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The suggestionFeatureType.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SuggestionFeature.Type getSuggestionFeatureType() {
      com.google.cloud.dialogflow.v2.SuggestionFeature.Type result =
          com.google.cloud.dialogflow.v2.SuggestionFeature.Type.forNumber(suggestionFeatureType_);
      return result == null
          ? com.google.cloud.dialogflow.v2.SuggestionFeature.Type.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of the suggestion feature to remove.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.SuggestionFeature.Type suggestion_feature_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The suggestionFeatureType to set.
     * @return This builder for chaining.
     */
    public Builder setSuggestionFeatureType(
        com.google.cloud.dialogflow.v2.SuggestionFeature.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      suggestionFeatureType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The type of the suggestion feature to remove.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.SuggestionFeature.Type suggestion_feature_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSuggestionFeatureType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      suggestionFeatureType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest)
  private static final com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest();
  }

  public static com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClearSuggestionFeatureConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<ClearSuggestionFeatureConfigRequest>() {
        @java.lang.Override
        public ClearSuggestionFeatureConfigRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClearSuggestionFeatureConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClearSuggestionFeatureConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ClearSuggestionFeatureConfigRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
