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
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 *
 *
 * <pre>
 * The request message for
 * [TestCases.BatchDeleteTestCases][google.cloud.dialogflow.cx.v3beta1.TestCases.BatchDeleteTestCases].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest}
 */
public final class BatchDeleteTestCasesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest)
    BatchDeleteTestCasesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchDeleteTestCasesRequest.newBuilder() to construct.
  private BatchDeleteTestCasesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchDeleteTestCasesRequest() {
    parent_ = "";
    names_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchDeleteTestCasesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_BatchDeleteTestCasesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_BatchDeleteTestCasesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest.class,
            com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The agent to delete test cases from.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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
   * Required. The agent to delete test cases from.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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

  public static final int NAMES_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList names_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
   * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
   * </pre>
   *
   * <code>
   * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the names.
   */
  public com.google.protobuf.ProtocolStringList getNamesList() {
    return names_;
  }
  /**
   *
   *
   * <pre>
   * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
   * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
   * </pre>
   *
   * <code>
   * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of names.
   */
  public int getNamesCount() {
    return names_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
   * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
   * </pre>
   *
   * <code>
   * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  public java.lang.String getNames(int index) {
    return names_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
   * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
   * </pre>
   *
   * <code>
   * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  public com.google.protobuf.ByteString getNamesBytes(int index) {
    return names_.getByteString(index);
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
    for (int i = 0; i < names_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, names_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < names_.size(); i++) {
        dataSize += computeStringSizeNoTag(names_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNamesList().size();
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest other =
        (com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getNamesList().equals(other.getNamesList())) return false;
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
    if (getNamesCount() > 0) {
      hash = (37 * hash) + NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getNamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest parseFrom(
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
      com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest prototype) {
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
   * The request message for
   * [TestCases.BatchDeleteTestCases][google.cloud.dialogflow.cx.v3beta1.TestCases.BatchDeleteTestCases].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest)
      com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_BatchDeleteTestCasesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_BatchDeleteTestCasesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest.class,
              com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      names_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.TestCaseProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_BatchDeleteTestCasesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest build() {
      com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest result =
          new com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        names_.makeImmutable();
        result.names_ = names_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest) {
        return mergeFrom(
            (com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest other) {
      if (other
          == com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.names_.isEmpty()) {
        if (names_.isEmpty()) {
          names_ = other.names_;
          bitField0_ |= 0x00000002;
        } else {
          ensureNamesIsMutable();
          names_.addAll(other.names_);
        }
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
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureNamesIsMutable();
                names_.add(s);
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
     * Required. The agent to delete test cases from.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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
     * Required. The agent to delete test cases from.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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
     * Required. The agent to delete test cases from.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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
     * Required. The agent to delete test cases from.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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
     * Required. The agent to delete test cases from.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
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

    private com.google.protobuf.LazyStringArrayList names_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureNamesIsMutable() {
      if (!names_.isModifiable()) {
        names_ = new com.google.protobuf.LazyStringArrayList(names_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
     * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return A list containing the names.
     */
    public com.google.protobuf.ProtocolStringList getNamesList() {
      names_.makeImmutable();
      return names_;
    }
    /**
     *
     *
     * <pre>
     * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
     * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The count of names.
     */
    public int getNamesCount() {
      return names_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
     * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index of the element to return.
     * @return The names at the given index.
     */
    public java.lang.String getNames(int index) {
      return names_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
     * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the names at the given index.
     */
    public com.google.protobuf.ByteString getNamesBytes(int index) {
      return names_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
     * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The names to set.
     * @return This builder for chaining.
     */
    public Builder setNames(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNamesIsMutable();
      names_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
     * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The names to add.
     * @return This builder for chaining.
     */
    public Builder addNames(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNamesIsMutable();
      names_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
     * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param values The names to add.
     * @return This builder for chaining.
     */
    public Builder addAllNames(java.lang.Iterable<java.lang.String> values) {
      ensureNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, names_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
     * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNames() {
      names_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Format of test case names: `projects/&lt;Project ID&gt;/locations/
     * &lt;Location ID&gt;/agents/&lt;AgentID&gt;/testCases/&lt;TestCase ID&gt;`.
     * </pre>
     *
     * <code>
     * repeated string names = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes of the names to add.
     * @return This builder for chaining.
     */
    public Builder addNamesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureNamesIsMutable();
      names_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest)
  private static final com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchDeleteTestCasesRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchDeleteTestCasesRequest>() {
        @java.lang.Override
        public BatchDeleteTestCasesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchDeleteTestCasesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchDeleteTestCasesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.BatchDeleteTestCasesRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
