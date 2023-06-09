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
// source: google/dataflow/v1beta3/jobs.proto

package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Defines a particular step within a Cloud Dataflow job.
 *
 * A job consists of multiple steps, each of which performs some
 * specific operation as part of the overall job.  Data is typically
 * passed from one step to another as part of the job.
 *
 * Here's an example of a sequence of steps which together implement a
 * Map-Reduce job:
 *
 *   * Read a collection of data from some source, parsing the
 *     collection's elements.
 *
 *   * Validate the elements.
 *
 *   * Apply a user-defined function to map each element to some value
 *     and extract an element-specific key value.
 *
 *   * Group elements with the same key into a single element with
 *     that key, transforming a multiply-keyed collection into a
 *     uniquely-keyed collection.
 *
 *   * Write the elements out to some data sink.
 *
 * Note that the Cloud Dataflow service may be used to run many different
 * types of jobs, not just Map-Reduce.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.Step}
 */
public final class Step extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.Step)
    StepOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Step.newBuilder() to construct.
  private Step(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Step() {
    kind_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Step();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.JobsProto
        .internal_static_google_dataflow_v1beta3_Step_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.JobsProto
        .internal_static_google_dataflow_v1beta3_Step_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.Step.class, com.google.dataflow.v1beta3.Step.Builder.class);
  }

  public static final int KIND_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object kind_ = "";
  /**
   *
   *
   * <pre>
   * The kind of step in the Cloud Dataflow job.
   * </pre>
   *
   * <code>string kind = 1;</code>
   *
   * @return The kind.
   */
  @java.lang.Override
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The kind of step in the Cloud Dataflow job.
   * </pre>
   *
   * <code>string kind = 1;</code>
   *
   * @return The bytes for kind.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      kind_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * The name that identifies the step. This must be unique for each
   * step with respect to all other steps in the Cloud Dataflow job.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name that identifies the step. This must be unique for each
   * step with respect to all other steps in the Cloud Dataflow job.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROPERTIES_FIELD_NUMBER = 3;
  private com.google.protobuf.Struct properties_;
  /**
   *
   *
   * <pre>
   * Named properties associated with the step. Each kind of
   * predefined step has its own required set of properties.
   * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
   * </pre>
   *
   * <code>.google.protobuf.Struct properties = 3;</code>
   *
   * @return Whether the properties field is set.
   */
  @java.lang.Override
  public boolean hasProperties() {
    return properties_ != null;
  }
  /**
   *
   *
   * <pre>
   * Named properties associated with the step. Each kind of
   * predefined step has its own required set of properties.
   * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
   * </pre>
   *
   * <code>.google.protobuf.Struct properties = 3;</code>
   *
   * @return The properties.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getProperties() {
    return properties_ == null ? com.google.protobuf.Struct.getDefaultInstance() : properties_;
  }
  /**
   *
   *
   * <pre>
   * Named properties associated with the step. Each kind of
   * predefined step has its own required set of properties.
   * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
   * </pre>
   *
   * <code>.google.protobuf.Struct properties = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getPropertiesOrBuilder() {
    return properties_ == null ? com.google.protobuf.Struct.getDefaultInstance() : properties_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kind_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (properties_ != null) {
      output.writeMessage(3, getProperties());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kind_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kind_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (properties_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getProperties());
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
    if (!(obj instanceof com.google.dataflow.v1beta3.Step)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.Step other = (com.google.dataflow.v1beta3.Step) obj;

    if (!getKind().equals(other.getKind())) return false;
    if (!getName().equals(other.getName())) return false;
    if (hasProperties() != other.hasProperties()) return false;
    if (hasProperties()) {
      if (!getProperties().equals(other.getProperties())) return false;
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
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasProperties()) {
      hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + getProperties().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.Step parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.Step parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.Step parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.Step parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.Step parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.Step parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.Step parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.Step parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.Step parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.Step parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.Step parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.Step parseFrom(
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

  public static Builder newBuilder(com.google.dataflow.v1beta3.Step prototype) {
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
   * Defines a particular step within a Cloud Dataflow job.
   *
   * A job consists of multiple steps, each of which performs some
   * specific operation as part of the overall job.  Data is typically
   * passed from one step to another as part of the job.
   *
   * Here's an example of a sequence of steps which together implement a
   * Map-Reduce job:
   *
   *   * Read a collection of data from some source, parsing the
   *     collection's elements.
   *
   *   * Validate the elements.
   *
   *   * Apply a user-defined function to map each element to some value
   *     and extract an element-specific key value.
   *
   *   * Group elements with the same key into a single element with
   *     that key, transforming a multiply-keyed collection into a
   *     uniquely-keyed collection.
   *
   *   * Write the elements out to some data sink.
   *
   * Note that the Cloud Dataflow service may be used to run many different
   * types of jobs, not just Map-Reduce.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.Step}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.Step)
      com.google.dataflow.v1beta3.StepOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_Step_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_Step_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.Step.class,
              com.google.dataflow.v1beta3.Step.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.Step.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      kind_ = "";
      name_ = "";
      properties_ = null;
      if (propertiesBuilder_ != null) {
        propertiesBuilder_.dispose();
        propertiesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_Step_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.Step getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.Step.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.Step build() {
      com.google.dataflow.v1beta3.Step result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.Step buildPartial() {
      com.google.dataflow.v1beta3.Step result = new com.google.dataflow.v1beta3.Step(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.dataflow.v1beta3.Step result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kind_ = kind_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.properties_ = propertiesBuilder_ == null ? properties_ : propertiesBuilder_.build();
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
      if (other instanceof com.google.dataflow.v1beta3.Step) {
        return mergeFrom((com.google.dataflow.v1beta3.Step) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.Step other) {
      if (other == com.google.dataflow.v1beta3.Step.getDefaultInstance()) return this;
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasProperties()) {
        mergeProperties(other.getProperties());
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
                kind_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getPropertiesFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object kind_ = "";
    /**
     *
     *
     * <pre>
     * The kind of step in the Cloud Dataflow job.
     * </pre>
     *
     * <code>string kind = 1;</code>
     *
     * @return The kind.
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The kind of step in the Cloud Dataflow job.
     * </pre>
     *
     * <code>string kind = 1;</code>
     *
     * @return The bytes for kind.
     */
    public com.google.protobuf.ByteString getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The kind of step in the Cloud Dataflow job.
     * </pre>
     *
     * <code>string kind = 1;</code>
     *
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      kind_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The kind of step in the Cloud Dataflow job.
     * </pre>
     *
     * <code>string kind = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      kind_ = getDefaultInstance().getKind();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The kind of step in the Cloud Dataflow job.
     * </pre>
     *
     * <code>string kind = 1;</code>
     *
     * @param value The bytes for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      kind_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The name that identifies the step. This must be unique for each
     * step with respect to all other steps in the Cloud Dataflow job.
     * </pre>
     *
     * <code>string name = 2;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name that identifies the step. This must be unique for each
     * step with respect to all other steps in the Cloud Dataflow job.
     * </pre>
     *
     * <code>string name = 2;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name that identifies the step. This must be unique for each
     * step with respect to all other steps in the Cloud Dataflow job.
     * </pre>
     *
     * <code>string name = 2;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name that identifies the step. This must be unique for each
     * step with respect to all other steps in the Cloud Dataflow job.
     * </pre>
     *
     * <code>string name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name that identifies the step. This must be unique for each
     * step with respect to all other steps in the Cloud Dataflow job.
     * </pre>
     *
     * <code>string name = 2;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct properties_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        propertiesBuilder_;
    /**
     *
     *
     * <pre>
     * Named properties associated with the step. Each kind of
     * predefined step has its own required set of properties.
     * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
     * </pre>
     *
     * <code>.google.protobuf.Struct properties = 3;</code>
     *
     * @return Whether the properties field is set.
     */
    public boolean hasProperties() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Named properties associated with the step. Each kind of
     * predefined step has its own required set of properties.
     * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
     * </pre>
     *
     * <code>.google.protobuf.Struct properties = 3;</code>
     *
     * @return The properties.
     */
    public com.google.protobuf.Struct getProperties() {
      if (propertiesBuilder_ == null) {
        return properties_ == null ? com.google.protobuf.Struct.getDefaultInstance() : properties_;
      } else {
        return propertiesBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Named properties associated with the step. Each kind of
     * predefined step has its own required set of properties.
     * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
     * </pre>
     *
     * <code>.google.protobuf.Struct properties = 3;</code>
     */
    public Builder setProperties(com.google.protobuf.Struct value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        properties_ = value;
      } else {
        propertiesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Named properties associated with the step. Each kind of
     * predefined step has its own required set of properties.
     * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
     * </pre>
     *
     * <code>.google.protobuf.Struct properties = 3;</code>
     */
    public Builder setProperties(com.google.protobuf.Struct.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        properties_ = builderForValue.build();
      } else {
        propertiesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Named properties associated with the step. Each kind of
     * predefined step has its own required set of properties.
     * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
     * </pre>
     *
     * <code>.google.protobuf.Struct properties = 3;</code>
     */
    public Builder mergeProperties(com.google.protobuf.Struct value) {
      if (propertiesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && properties_ != null
            && properties_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getPropertiesBuilder().mergeFrom(value);
        } else {
          properties_ = value;
        }
      } else {
        propertiesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Named properties associated with the step. Each kind of
     * predefined step has its own required set of properties.
     * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
     * </pre>
     *
     * <code>.google.protobuf.Struct properties = 3;</code>
     */
    public Builder clearProperties() {
      bitField0_ = (bitField0_ & ~0x00000004);
      properties_ = null;
      if (propertiesBuilder_ != null) {
        propertiesBuilder_.dispose();
        propertiesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Named properties associated with the step. Each kind of
     * predefined step has its own required set of properties.
     * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
     * </pre>
     *
     * <code>.google.protobuf.Struct properties = 3;</code>
     */
    public com.google.protobuf.Struct.Builder getPropertiesBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPropertiesFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Named properties associated with the step. Each kind of
     * predefined step has its own required set of properties.
     * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
     * </pre>
     *
     * <code>.google.protobuf.Struct properties = 3;</code>
     */
    public com.google.protobuf.StructOrBuilder getPropertiesOrBuilder() {
      if (propertiesBuilder_ != null) {
        return propertiesBuilder_.getMessageOrBuilder();
      } else {
        return properties_ == null ? com.google.protobuf.Struct.getDefaultInstance() : properties_;
      }
    }
    /**
     *
     *
     * <pre>
     * Named properties associated with the step. Each kind of
     * predefined step has its own required set of properties.
     * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
     * </pre>
     *
     * <code>.google.protobuf.Struct properties = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        getPropertiesFieldBuilder() {
      if (propertiesBuilder_ == null) {
        propertiesBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Struct,
                com.google.protobuf.Struct.Builder,
                com.google.protobuf.StructOrBuilder>(
                getProperties(), getParentForChildren(), isClean());
        properties_ = null;
      }
      return propertiesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.Step)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.Step)
  private static final com.google.dataflow.v1beta3.Step DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.Step();
  }

  public static com.google.dataflow.v1beta3.Step getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Step> PARSER =
      new com.google.protobuf.AbstractParser<Step>() {
        @java.lang.Override
        public Step parsePartialFrom(
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

  public static com.google.protobuf.Parser<Step> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Step> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.Step getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
