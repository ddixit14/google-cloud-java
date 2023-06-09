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
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for CreateAnnotationSpecSet.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest}
 */
public final class CreateAnnotationSpecSetRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest)
    CreateAnnotationSpecSetRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateAnnotationSpecSetRequest.newBuilder() to construct.
  private CreateAnnotationSpecSetRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateAnnotationSpecSetRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateAnnotationSpecSetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_CreateAnnotationSpecSetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_CreateAnnotationSpecSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest.class,
            com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. AnnotationSpecSet resource parent, format:
   * projects/{project_id}
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
   * Required. AnnotationSpecSet resource parent, format:
   * projects/{project_id}
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

  public static final int ANNOTATION_SPEC_SET_FIELD_NUMBER = 2;
  private com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotationSpecSet_;
  /**
   *
   *
   * <pre>
   * Required. Annotation spec set to create. Annotation specs must be included.
   * Only one annotation spec will be accepted for annotation specs with same
   * display_name.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the annotationSpecSet field is set.
   */
  @java.lang.Override
  public boolean hasAnnotationSpecSet() {
    return annotationSpecSet_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Annotation spec set to create. Annotation specs must be included.
   * Only one annotation spec will be accepted for annotation specs with same
   * display_name.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The annotationSpecSet.
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet getAnnotationSpecSet() {
    return annotationSpecSet_ == null
        ? com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.getDefaultInstance()
        : annotationSpecSet_;
  }
  /**
   *
   *
   * <pre>
   * Required. Annotation spec set to create. Annotation specs must be included.
   * Only one annotation spec will be accepted for annotation specs with same
   * display_name.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder
      getAnnotationSpecSetOrBuilder() {
    return annotationSpecSet_ == null
        ? com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.getDefaultInstance()
        : annotationSpecSet_;
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
    if (annotationSpecSet_ != null) {
      output.writeMessage(2, getAnnotationSpecSet());
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
    if (annotationSpecSet_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAnnotationSpecSet());
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest other =
        (com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasAnnotationSpecSet() != other.hasAnnotationSpecSet()) return false;
    if (hasAnnotationSpecSet()) {
      if (!getAnnotationSpecSet().equals(other.getAnnotationSpecSet())) return false;
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
    if (hasAnnotationSpecSet()) {
      hash = (37 * hash) + ANNOTATION_SPEC_SET_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotationSpecSet().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest parseFrom(
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
      com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest prototype) {
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
   * Request message for CreateAnnotationSpecSet.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest)
      com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_CreateAnnotationSpecSetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_CreateAnnotationSpecSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest.class,
              com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      annotationSpecSet_ = null;
      if (annotationSpecSetBuilder_ != null) {
        annotationSpecSetBuilder_.dispose();
        annotationSpecSetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_CreateAnnotationSpecSetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest
        getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest build() {
      com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest buildPartial() {
      com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest result =
          new com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.annotationSpecSet_ =
            annotationSpecSetBuilder_ == null
                ? annotationSpecSet_
                : annotationSpecSetBuilder_.build();
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest) {
        return mergeFrom(
            (com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest other) {
      if (other
          == com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAnnotationSpecSet()) {
        mergeAnnotationSpecSet(other.getAnnotationSpecSet());
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
                input.readMessage(
                    getAnnotationSpecSetFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. AnnotationSpecSet resource parent, format:
     * projects/{project_id}
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
     * Required. AnnotationSpecSet resource parent, format:
     * projects/{project_id}
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
     * Required. AnnotationSpecSet resource parent, format:
     * projects/{project_id}
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
     * Required. AnnotationSpecSet resource parent, format:
     * projects/{project_id}
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
     * Required. AnnotationSpecSet resource parent, format:
     * projects/{project_id}
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

    private com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotationSpecSet_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder>
        annotationSpecSetBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set to create. Annotation specs must be included.
     * Only one annotation spec will be accepted for annotation specs with same
     * display_name.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the annotationSpecSet field is set.
     */
    public boolean hasAnnotationSpecSet() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set to create. Annotation specs must be included.
     * Only one annotation spec will be accepted for annotation specs with same
     * display_name.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The annotationSpecSet.
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet getAnnotationSpecSet() {
      if (annotationSpecSetBuilder_ == null) {
        return annotationSpecSet_ == null
            ? com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.getDefaultInstance()
            : annotationSpecSet_;
      } else {
        return annotationSpecSetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set to create. Annotation specs must be included.
     * Only one annotation spec will be accepted for annotation specs with same
     * display_name.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAnnotationSpecSet(
        com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet value) {
      if (annotationSpecSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        annotationSpecSet_ = value;
      } else {
        annotationSpecSetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set to create. Annotation specs must be included.
     * Only one annotation spec will be accepted for annotation specs with same
     * display_name.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAnnotationSpecSet(
        com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder builderForValue) {
      if (annotationSpecSetBuilder_ == null) {
        annotationSpecSet_ = builderForValue.build();
      } else {
        annotationSpecSetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set to create. Annotation specs must be included.
     * Only one annotation spec will be accepted for annotation specs with same
     * display_name.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAnnotationSpecSet(
        com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet value) {
      if (annotationSpecSetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && annotationSpecSet_ != null
            && annotationSpecSet_
                != com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.getDefaultInstance()) {
          getAnnotationSpecSetBuilder().mergeFrom(value);
        } else {
          annotationSpecSet_ = value;
        }
      } else {
        annotationSpecSetBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set to create. Annotation specs must be included.
     * Only one annotation spec will be accepted for annotation specs with same
     * display_name.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAnnotationSpecSet() {
      bitField0_ = (bitField0_ & ~0x00000002);
      annotationSpecSet_ = null;
      if (annotationSpecSetBuilder_ != null) {
        annotationSpecSetBuilder_.dispose();
        annotationSpecSetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set to create. Annotation specs must be included.
     * Only one annotation spec will be accepted for annotation specs with same
     * display_name.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder
        getAnnotationSpecSetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAnnotationSpecSetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set to create. Annotation specs must be included.
     * Only one annotation spec will be accepted for annotation specs with same
     * display_name.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder
        getAnnotationSpecSetOrBuilder() {
      if (annotationSpecSetBuilder_ != null) {
        return annotationSpecSetBuilder_.getMessageOrBuilder();
      } else {
        return annotationSpecSet_ == null
            ? com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.getDefaultInstance()
            : annotationSpecSet_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set to create. Annotation specs must be included.
     * Only one annotation spec will be accepted for annotation specs with same
     * display_name.
     * </pre>
     *
     * <code>
     * .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_set = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder>
        getAnnotationSpecSetFieldBuilder() {
      if (annotationSpecSetBuilder_ == null) {
        annotationSpecSetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet,
                com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder,
                com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder>(
                getAnnotationSpecSet(), getParentForChildren(), isClean());
        annotationSpecSet_ = null;
      }
      return annotationSpecSetBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest)
  private static final com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest();
  }

  public static com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAnnotationSpecSetRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateAnnotationSpecSetRequest>() {
        @java.lang.Override
        public CreateAnnotationSpecSetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAnnotationSpecSetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAnnotationSpecSetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
