/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/grafeas.proto

package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * Request to create a new note.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.CreateNoteRequest}
 */
public final class CreateNoteRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.CreateNoteRequest)
    CreateNoteRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateNoteRequest.newBuilder() to construct.
  private CreateNoteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateNoteRequest() {
    parent_ = "";
    noteId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateNoteRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.GrafeasOuterClass.internal_static_grafeas_v1_CreateNoteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.GrafeasOuterClass
        .internal_static_grafeas_v1_CreateNoteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.CreateNoteRequest.class, io.grafeas.v1.CreateNoteRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the note is to be created.
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
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the note is to be created.
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

  public static final int NOTE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object noteId_ = "";
  /**
   *
   *
   * <pre>
   * The ID to use for this note.
   * </pre>
   *
   * <code>string note_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The noteId.
   */
  @java.lang.Override
  public java.lang.String getNoteId() {
    java.lang.Object ref = noteId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      noteId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ID to use for this note.
   * </pre>
   *
   * <code>string note_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for noteId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNoteIdBytes() {
    java.lang.Object ref = noteId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      noteId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOTE_FIELD_NUMBER = 3;
  private io.grafeas.v1.Note note_;
  /**
   *
   *
   * <pre>
   * The note to create.
   * </pre>
   *
   * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the note field is set.
   */
  @java.lang.Override
  public boolean hasNote() {
    return note_ != null;
  }
  /**
   *
   *
   * <pre>
   * The note to create.
   * </pre>
   *
   * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The note.
   */
  @java.lang.Override
  public io.grafeas.v1.Note getNote() {
    return note_ == null ? io.grafeas.v1.Note.getDefaultInstance() : note_;
  }
  /**
   *
   *
   * <pre>
   * The note to create.
   * </pre>
   *
   * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public io.grafeas.v1.NoteOrBuilder getNoteOrBuilder() {
    return note_ == null ? io.grafeas.v1.Note.getDefaultInstance() : note_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(noteId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, noteId_);
    }
    if (note_ != null) {
      output.writeMessage(3, getNote());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(noteId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, noteId_);
    }
    if (note_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getNote());
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
    if (!(obj instanceof io.grafeas.v1.CreateNoteRequest)) {
      return super.equals(obj);
    }
    io.grafeas.v1.CreateNoteRequest other = (io.grafeas.v1.CreateNoteRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getNoteId().equals(other.getNoteId())) return false;
    if (hasNote() != other.hasNote()) return false;
    if (hasNote()) {
      if (!getNote().equals(other.getNote())) return false;
    }
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
    hash = (37 * hash) + NOTE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getNoteId().hashCode();
    if (hasNote()) {
      hash = (37 * hash) + NOTE_FIELD_NUMBER;
      hash = (53 * hash) + getNote().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.CreateNoteRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.CreateNoteRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.CreateNoteRequest parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.CreateNoteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.CreateNoteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.CreateNoteRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.CreateNoteRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.CreateNoteRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.CreateNoteRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.CreateNoteRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.CreateNoteRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.CreateNoteRequest parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1.CreateNoteRequest prototype) {
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
   * Request to create a new note.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.CreateNoteRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.CreateNoteRequest)
      io.grafeas.v1.CreateNoteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.GrafeasOuterClass
          .internal_static_grafeas_v1_CreateNoteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.GrafeasOuterClass
          .internal_static_grafeas_v1_CreateNoteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.CreateNoteRequest.class, io.grafeas.v1.CreateNoteRequest.Builder.class);
    }

    // Construct using io.grafeas.v1.CreateNoteRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      noteId_ = "";
      note_ = null;
      if (noteBuilder_ != null) {
        noteBuilder_.dispose();
        noteBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.GrafeasOuterClass
          .internal_static_grafeas_v1_CreateNoteRequest_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.CreateNoteRequest getDefaultInstanceForType() {
      return io.grafeas.v1.CreateNoteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.CreateNoteRequest build() {
      io.grafeas.v1.CreateNoteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.CreateNoteRequest buildPartial() {
      io.grafeas.v1.CreateNoteRequest result = new io.grafeas.v1.CreateNoteRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1.CreateNoteRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.noteId_ = noteId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.note_ = noteBuilder_ == null ? note_ : noteBuilder_.build();
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
      if (other instanceof io.grafeas.v1.CreateNoteRequest) {
        return mergeFrom((io.grafeas.v1.CreateNoteRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.CreateNoteRequest other) {
      if (other == io.grafeas.v1.CreateNoteRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getNoteId().isEmpty()) {
        noteId_ = other.noteId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasNote()) {
        mergeNote(other.getNote());
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
                noteId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getNoteFieldBuilder().getBuilder(), extensionRegistry);
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
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the note is to be created.
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
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the note is to be created.
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
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the note is to be created.
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
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the note is to be created.
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
     * The name of the project in the form of `projects/[PROJECT_ID]`, under which
     * the note is to be created.
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

    private java.lang.Object noteId_ = "";
    /**
     *
     *
     * <pre>
     * The ID to use for this note.
     * </pre>
     *
     * <code>string note_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The noteId.
     */
    public java.lang.String getNoteId() {
      java.lang.Object ref = noteId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        noteId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID to use for this note.
     * </pre>
     *
     * <code>string note_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for noteId.
     */
    public com.google.protobuf.ByteString getNoteIdBytes() {
      java.lang.Object ref = noteId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        noteId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID to use for this note.
     * </pre>
     *
     * <code>string note_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The noteId to set.
     * @return This builder for chaining.
     */
    public Builder setNoteId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      noteId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID to use for this note.
     * </pre>
     *
     * <code>string note_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNoteId() {
      noteId_ = getDefaultInstance().getNoteId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID to use for this note.
     * </pre>
     *
     * <code>string note_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for noteId to set.
     * @return This builder for chaining.
     */
    public Builder setNoteIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      noteId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private io.grafeas.v1.Note note_;
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1.Note, io.grafeas.v1.Note.Builder, io.grafeas.v1.NoteOrBuilder>
        noteBuilder_;
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the note field is set.
     */
    public boolean hasNote() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The note.
     */
    public io.grafeas.v1.Note getNote() {
      if (noteBuilder_ == null) {
        return note_ == null ? io.grafeas.v1.Note.getDefaultInstance() : note_;
      } else {
        return noteBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNote(io.grafeas.v1.Note value) {
      if (noteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        note_ = value;
      } else {
        noteBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setNote(io.grafeas.v1.Note.Builder builderForValue) {
      if (noteBuilder_ == null) {
        note_ = builderForValue.build();
      } else {
        noteBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeNote(io.grafeas.v1.Note value) {
      if (noteBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && note_ != null
            && note_ != io.grafeas.v1.Note.getDefaultInstance()) {
          getNoteBuilder().mergeFrom(value);
        } else {
          note_ = value;
        }
      } else {
        noteBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearNote() {
      bitField0_ = (bitField0_ & ~0x00000004);
      note_ = null;
      if (noteBuilder_ != null) {
        noteBuilder_.dispose();
        noteBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public io.grafeas.v1.Note.Builder getNoteBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getNoteFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public io.grafeas.v1.NoteOrBuilder getNoteOrBuilder() {
      if (noteBuilder_ != null) {
        return noteBuilder_.getMessageOrBuilder();
      } else {
        return note_ == null ? io.grafeas.v1.Note.getDefaultInstance() : note_;
      }
    }
    /**
     *
     *
     * <pre>
     * The note to create.
     * </pre>
     *
     * <code>.grafeas.v1.Note note = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1.Note, io.grafeas.v1.Note.Builder, io.grafeas.v1.NoteOrBuilder>
        getNoteFieldBuilder() {
      if (noteBuilder_ == null) {
        noteBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                io.grafeas.v1.Note, io.grafeas.v1.Note.Builder, io.grafeas.v1.NoteOrBuilder>(
                getNote(), getParentForChildren(), isClean());
        note_ = null;
      }
      return noteBuilder_;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1.CreateNoteRequest)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.CreateNoteRequest)
  private static final io.grafeas.v1.CreateNoteRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.CreateNoteRequest();
  }

  public static io.grafeas.v1.CreateNoteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateNoteRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateNoteRequest>() {
        @java.lang.Override
        public CreateNoteRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateNoteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateNoteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.CreateNoteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
