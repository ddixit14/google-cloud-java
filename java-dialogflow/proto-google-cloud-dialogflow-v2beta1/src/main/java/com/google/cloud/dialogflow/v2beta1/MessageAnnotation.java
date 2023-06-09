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
// source: google/cloud/dialogflow/v2beta1/participant.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * Represents the result of annotation for the message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.MessageAnnotation}
 */
public final class MessageAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.MessageAnnotation)
    MessageAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MessageAnnotation.newBuilder() to construct.
  private MessageAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MessageAnnotation() {
    parts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MessageAnnotation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.ParticipantProto
        .internal_static_google_cloud_dialogflow_v2beta1_MessageAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.ParticipantProto
        .internal_static_google_cloud_dialogflow_v2beta1_MessageAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.MessageAnnotation.class,
            com.google.cloud.dialogflow.v2beta1.MessageAnnotation.Builder.class);
  }

  public static final int PARTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart> parts_;
  /**
   *
   *
   * <pre>
   * Optional. The collection of annotated message parts ordered by their
   * position in the message. You can recover the annotated message by
   * concatenating [AnnotatedMessagePart.text].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart> getPartsList() {
    return parts_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The collection of annotated message parts ordered by their
   * position in the message. You can recover the annotated message by
   * concatenating [AnnotatedMessagePart.text].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePartOrBuilder>
      getPartsOrBuilderList() {
    return parts_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The collection of annotated message parts ordered by their
   * position in the message. You can recover the annotated message by
   * concatenating [AnnotatedMessagePart.text].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
   */
  @java.lang.Override
  public int getPartsCount() {
    return parts_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. The collection of annotated message parts ordered by their
   * position in the message. You can recover the annotated message by
   * concatenating [AnnotatedMessagePart.text].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart getParts(int index) {
    return parts_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. The collection of annotated message parts ordered by their
   * position in the message. You can recover the annotated message by
   * concatenating [AnnotatedMessagePart.text].
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePartOrBuilder getPartsOrBuilder(
      int index) {
    return parts_.get(index);
  }

  public static final int CONTAIN_ENTITIES_FIELD_NUMBER = 2;
  private boolean containEntities_ = false;
  /**
   *
   *
   * <pre>
   * Required. Indicates whether the text message contains entities.
   * </pre>
   *
   * <code>bool contain_entities = 2;</code>
   *
   * @return The containEntities.
   */
  @java.lang.Override
  public boolean getContainEntities() {
    return containEntities_;
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
    for (int i = 0; i < parts_.size(); i++) {
      output.writeMessage(1, parts_.get(i));
    }
    if (containEntities_ != false) {
      output.writeBool(2, containEntities_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < parts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, parts_.get(i));
    }
    if (containEntities_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, containEntities_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.MessageAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.MessageAnnotation other =
        (com.google.cloud.dialogflow.v2beta1.MessageAnnotation) obj;

    if (!getPartsList().equals(other.getPartsList())) return false;
    if (getContainEntities() != other.getContainEntities()) return false;
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
    if (getPartsCount() > 0) {
      hash = (37 * hash) + PARTS_FIELD_NUMBER;
      hash = (53 * hash) + getPartsList().hashCode();
    }
    hash = (37 * hash) + CONTAIN_ENTITIES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getContainEntities());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.MessageAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.MessageAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.MessageAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.MessageAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.MessageAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.MessageAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.MessageAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.MessageAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.MessageAnnotation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.MessageAnnotation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.MessageAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.MessageAnnotation parseFrom(
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
      com.google.cloud.dialogflow.v2beta1.MessageAnnotation prototype) {
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
   * Represents the result of annotation for the message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.MessageAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.MessageAnnotation)
      com.google.cloud.dialogflow.v2beta1.MessageAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2beta1_MessageAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2beta1_MessageAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.MessageAnnotation.class,
              com.google.cloud.dialogflow.v2beta1.MessageAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.MessageAnnotation.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (partsBuilder_ == null) {
        parts_ = java.util.Collections.emptyList();
      } else {
        parts_ = null;
        partsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      containEntities_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.ParticipantProto
          .internal_static_google_cloud_dialogflow_v2beta1_MessageAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.MessageAnnotation getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.MessageAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.MessageAnnotation build() {
      com.google.cloud.dialogflow.v2beta1.MessageAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.MessageAnnotation buildPartial() {
      com.google.cloud.dialogflow.v2beta1.MessageAnnotation result =
          new com.google.cloud.dialogflow.v2beta1.MessageAnnotation(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.dialogflow.v2beta1.MessageAnnotation result) {
      if (partsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          parts_ = java.util.Collections.unmodifiableList(parts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.parts_ = parts_;
      } else {
        result.parts_ = partsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2beta1.MessageAnnotation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.containEntities_ = containEntities_;
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.MessageAnnotation) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.MessageAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.MessageAnnotation other) {
      if (other == com.google.cloud.dialogflow.v2beta1.MessageAnnotation.getDefaultInstance())
        return this;
      if (partsBuilder_ == null) {
        if (!other.parts_.isEmpty()) {
          if (parts_.isEmpty()) {
            parts_ = other.parts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePartsIsMutable();
            parts_.addAll(other.parts_);
          }
          onChanged();
        }
      } else {
        if (!other.parts_.isEmpty()) {
          if (partsBuilder_.isEmpty()) {
            partsBuilder_.dispose();
            partsBuilder_ = null;
            parts_ = other.parts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            partsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPartsFieldBuilder()
                    : null;
          } else {
            partsBuilder_.addAllMessages(other.parts_);
          }
        }
      }
      if (other.getContainEntities() != false) {
        setContainEntities(other.getContainEntities());
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
                com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart m =
                    input.readMessage(
                        com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.parser(),
                        extensionRegistry);
                if (partsBuilder_ == null) {
                  ensurePartsIsMutable();
                  parts_.add(m);
                } else {
                  partsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 16:
              {
                containEntities_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private java.util.List<com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart> parts_ =
        java.util.Collections.emptyList();

    private void ensurePartsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        parts_ =
            new java.util.ArrayList<com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart>(
                parts_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart,
            com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.Builder,
            com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePartOrBuilder>
        partsBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart> getPartsList() {
      if (partsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(parts_);
      } else {
        return partsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public int getPartsCount() {
      if (partsBuilder_ == null) {
        return parts_.size();
      } else {
        return partsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart getParts(int index) {
      if (partsBuilder_ == null) {
        return parts_.get(index);
      } else {
        return partsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public Builder setParts(
        int index, com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.set(index, value);
        onChanged();
      } else {
        partsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public Builder setParts(
        int index,
        com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.set(index, builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public Builder addParts(com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.add(value);
        onChanged();
      } else {
        partsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public Builder addParts(
        int index, com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.add(index, value);
        onChanged();
      } else {
        partsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public Builder addParts(
        com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.add(builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public Builder addParts(
        int index,
        com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.add(index, builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public Builder addAllParts(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart>
            values) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, parts_);
        onChanged();
      } else {
        partsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public Builder clearParts() {
      if (partsBuilder_ == null) {
        parts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        partsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public Builder removeParts(int index) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.remove(index);
        onChanged();
      } else {
        partsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.Builder getPartsBuilder(
        int index) {
      return getPartsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePartOrBuilder getPartsOrBuilder(
        int index) {
      if (partsBuilder_ == null) {
        return parts_.get(index);
      } else {
        return partsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public java.util.List<
            ? extends com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePartOrBuilder>
        getPartsOrBuilderList() {
      if (partsBuilder_ != null) {
        return partsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(parts_);
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.Builder addPartsBuilder() {
      return getPartsFieldBuilder()
          .addBuilder(
              com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.Builder addPartsBuilder(
        int index) {
      return getPartsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Optional. The collection of annotated message parts ordered by their
     * position in the message. You can recover the annotated message by
     * concatenating [AnnotatedMessagePart.text].
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2beta1.AnnotatedMessagePart parts = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.Builder>
        getPartsBuilderList() {
      return getPartsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart,
            com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.Builder,
            com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePartOrBuilder>
        getPartsFieldBuilder() {
      if (partsBuilder_ == null) {
        partsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart,
                com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePart.Builder,
                com.google.cloud.dialogflow.v2beta1.AnnotatedMessagePartOrBuilder>(
                parts_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        parts_ = null;
      }
      return partsBuilder_;
    }

    private boolean containEntities_;
    /**
     *
     *
     * <pre>
     * Required. Indicates whether the text message contains entities.
     * </pre>
     *
     * <code>bool contain_entities = 2;</code>
     *
     * @return The containEntities.
     */
    @java.lang.Override
    public boolean getContainEntities() {
      return containEntities_;
    }
    /**
     *
     *
     * <pre>
     * Required. Indicates whether the text message contains entities.
     * </pre>
     *
     * <code>bool contain_entities = 2;</code>
     *
     * @param value The containEntities to set.
     * @return This builder for chaining.
     */
    public Builder setContainEntities(boolean value) {

      containEntities_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Indicates whether the text message contains entities.
     * </pre>
     *
     * <code>bool contain_entities = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContainEntities() {
      bitField0_ = (bitField0_ & ~0x00000002);
      containEntities_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.MessageAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.MessageAnnotation)
  private static final com.google.cloud.dialogflow.v2beta1.MessageAnnotation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.MessageAnnotation();
  }

  public static com.google.cloud.dialogflow.v2beta1.MessageAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MessageAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<MessageAnnotation>() {
        @java.lang.Override
        public MessageAnnotation parsePartialFrom(
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

  public static com.google.protobuf.Parser<MessageAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MessageAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.MessageAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
