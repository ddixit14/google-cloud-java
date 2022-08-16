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
// source: google/cloud/documentai/v1/document_processor_service.proto

package com.google.cloud.documentai.v1;

/**
 *
 *
 * <pre>
 * Response message for list processors.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1.ListProcessorsResponse}
 */
public final class ListProcessorsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1.ListProcessorsResponse)
    ListProcessorsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListProcessorsResponse.newBuilder() to construct.
  private ListProcessorsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListProcessorsResponse() {
    processors_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListProcessorsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListProcessorsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                processors_ = new java.util.ArrayList<com.google.cloud.documentai.v1.Processor>();
                mutable_bitField0_ |= 0x00000001;
              }
              processors_.add(
                  input.readMessage(
                      com.google.cloud.documentai.v1.Processor.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        processors_ = java.util.Collections.unmodifiableList(processors_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1_ListProcessorsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1_ListProcessorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1.ListProcessorsResponse.class,
            com.google.cloud.documentai.v1.ListProcessorsResponse.Builder.class);
  }

  public static final int PROCESSORS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.documentai.v1.Processor> processors_;
  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.documentai.v1.Processor> getProcessorsList() {
    return processors_;
  }
  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.documentai.v1.ProcessorOrBuilder>
      getProcessorsOrBuilderList() {
    return processors_;
  }
  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
   */
  @java.lang.Override
  public int getProcessorsCount() {
    return processors_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.Processor getProcessors(int index) {
    return processors_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of processors.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.ProcessorOrBuilder getProcessorsOrBuilder(int index) {
    return processors_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Points to the next processor, otherwise empty.
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
   * Points to the next processor, otherwise empty.
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
    for (int i = 0; i < processors_.size(); i++) {
      output.writeMessage(1, processors_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < processors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, processors_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.documentai.v1.ListProcessorsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1.ListProcessorsResponse other =
        (com.google.cloud.documentai.v1.ListProcessorsResponse) obj;

    if (!getProcessorsList().equals(other.getProcessorsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getProcessorsCount() > 0) {
      hash = (37 * hash) + PROCESSORS_FIELD_NUMBER;
      hash = (53 * hash) + getProcessorsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1.ListProcessorsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.ListProcessorsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ListProcessorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.ListProcessorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ListProcessorsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.ListProcessorsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ListProcessorsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.ListProcessorsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ListProcessorsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.ListProcessorsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.ListProcessorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.ListProcessorsResponse parseFrom(
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
      com.google.cloud.documentai.v1.ListProcessorsResponse prototype) {
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
   * Response message for list processors.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1.ListProcessorsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1.ListProcessorsResponse)
      com.google.cloud.documentai.v1.ListProcessorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_ListProcessorsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_ListProcessorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1.ListProcessorsResponse.class,
              com.google.cloud.documentai.v1.ListProcessorsResponse.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1.ListProcessorsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getProcessorsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (processorsBuilder_ == null) {
        processors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        processorsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_ListProcessorsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ListProcessorsResponse getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1.ListProcessorsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ListProcessorsResponse build() {
      com.google.cloud.documentai.v1.ListProcessorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.ListProcessorsResponse buildPartial() {
      com.google.cloud.documentai.v1.ListProcessorsResponse result =
          new com.google.cloud.documentai.v1.ListProcessorsResponse(this);
      int from_bitField0_ = bitField0_;
      if (processorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          processors_ = java.util.Collections.unmodifiableList(processors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.processors_ = processors_;
      } else {
        result.processors_ = processorsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.documentai.v1.ListProcessorsResponse) {
        return mergeFrom((com.google.cloud.documentai.v1.ListProcessorsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1.ListProcessorsResponse other) {
      if (other == com.google.cloud.documentai.v1.ListProcessorsResponse.getDefaultInstance())
        return this;
      if (processorsBuilder_ == null) {
        if (!other.processors_.isEmpty()) {
          if (processors_.isEmpty()) {
            processors_ = other.processors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProcessorsIsMutable();
            processors_.addAll(other.processors_);
          }
          onChanged();
        }
      } else {
        if (!other.processors_.isEmpty()) {
          if (processorsBuilder_.isEmpty()) {
            processorsBuilder_.dispose();
            processorsBuilder_ = null;
            processors_ = other.processors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            processorsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getProcessorsFieldBuilder()
                    : null;
          } else {
            processorsBuilder_.addAllMessages(other.processors_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.documentai.v1.ListProcessorsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.documentai.v1.ListProcessorsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.documentai.v1.Processor> processors_ =
        java.util.Collections.emptyList();

    private void ensureProcessorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        processors_ =
            new java.util.ArrayList<com.google.cloud.documentai.v1.Processor>(processors_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.documentai.v1.Processor,
            com.google.cloud.documentai.v1.Processor.Builder,
            com.google.cloud.documentai.v1.ProcessorOrBuilder>
        processorsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public java.util.List<com.google.cloud.documentai.v1.Processor> getProcessorsList() {
      if (processorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(processors_);
      } else {
        return processorsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public int getProcessorsCount() {
      if (processorsBuilder_ == null) {
        return processors_.size();
      } else {
        return processorsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public com.google.cloud.documentai.v1.Processor getProcessors(int index) {
      if (processorsBuilder_ == null) {
        return processors_.get(index);
      } else {
        return processorsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public Builder setProcessors(int index, com.google.cloud.documentai.v1.Processor value) {
      if (processorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorsIsMutable();
        processors_.set(index, value);
        onChanged();
      } else {
        processorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public Builder setProcessors(
        int index, com.google.cloud.documentai.v1.Processor.Builder builderForValue) {
      if (processorsBuilder_ == null) {
        ensureProcessorsIsMutable();
        processors_.set(index, builderForValue.build());
        onChanged();
      } else {
        processorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public Builder addProcessors(com.google.cloud.documentai.v1.Processor value) {
      if (processorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorsIsMutable();
        processors_.add(value);
        onChanged();
      } else {
        processorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public Builder addProcessors(int index, com.google.cloud.documentai.v1.Processor value) {
      if (processorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorsIsMutable();
        processors_.add(index, value);
        onChanged();
      } else {
        processorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public Builder addProcessors(com.google.cloud.documentai.v1.Processor.Builder builderForValue) {
      if (processorsBuilder_ == null) {
        ensureProcessorsIsMutable();
        processors_.add(builderForValue.build());
        onChanged();
      } else {
        processorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public Builder addProcessors(
        int index, com.google.cloud.documentai.v1.Processor.Builder builderForValue) {
      if (processorsBuilder_ == null) {
        ensureProcessorsIsMutable();
        processors_.add(index, builderForValue.build());
        onChanged();
      } else {
        processorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public Builder addAllProcessors(
        java.lang.Iterable<? extends com.google.cloud.documentai.v1.Processor> values) {
      if (processorsBuilder_ == null) {
        ensureProcessorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, processors_);
        onChanged();
      } else {
        processorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public Builder clearProcessors() {
      if (processorsBuilder_ == null) {
        processors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        processorsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public Builder removeProcessors(int index) {
      if (processorsBuilder_ == null) {
        ensureProcessorsIsMutable();
        processors_.remove(index);
        onChanged();
      } else {
        processorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public com.google.cloud.documentai.v1.Processor.Builder getProcessorsBuilder(int index) {
      return getProcessorsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public com.google.cloud.documentai.v1.ProcessorOrBuilder getProcessorsOrBuilder(int index) {
      if (processorsBuilder_ == null) {
        return processors_.get(index);
      } else {
        return processorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.documentai.v1.ProcessorOrBuilder>
        getProcessorsOrBuilderList() {
      if (processorsBuilder_ != null) {
        return processorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(processors_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public com.google.cloud.documentai.v1.Processor.Builder addProcessorsBuilder() {
      return getProcessorsFieldBuilder()
          .addBuilder(com.google.cloud.documentai.v1.Processor.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public com.google.cloud.documentai.v1.Processor.Builder addProcessorsBuilder(int index) {
      return getProcessorsFieldBuilder()
          .addBuilder(index, com.google.cloud.documentai.v1.Processor.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of processors.
     * </pre>
     *
     * <code>repeated .google.cloud.documentai.v1.Processor processors = 1;</code>
     */
    public java.util.List<com.google.cloud.documentai.v1.Processor.Builder>
        getProcessorsBuilderList() {
      return getProcessorsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.documentai.v1.Processor,
            com.google.cloud.documentai.v1.Processor.Builder,
            com.google.cloud.documentai.v1.ProcessorOrBuilder>
        getProcessorsFieldBuilder() {
      if (processorsBuilder_ == null) {
        processorsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.documentai.v1.Processor,
                com.google.cloud.documentai.v1.Processor.Builder,
                com.google.cloud.documentai.v1.ProcessorOrBuilder>(
                processors_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        processors_ = null;
      }
      return processorsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Points to the next processor, otherwise empty.
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
     * Points to the next processor, otherwise empty.
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
     * Points to the next processor, otherwise empty.
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Points to the next processor, otherwise empty.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Points to the next processor, otherwise empty.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1.ListProcessorsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1.ListProcessorsResponse)
  private static final com.google.cloud.documentai.v1.ListProcessorsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1.ListProcessorsResponse();
  }

  public static com.google.cloud.documentai.v1.ListProcessorsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListProcessorsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListProcessorsResponse>() {
        @java.lang.Override
        public ListProcessorsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListProcessorsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListProcessorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListProcessorsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1.ListProcessorsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
