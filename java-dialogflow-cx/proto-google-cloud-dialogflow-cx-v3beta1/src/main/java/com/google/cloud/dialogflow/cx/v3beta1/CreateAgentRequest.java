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
// source: google/cloud/dialogflow/cx/v3beta1/agent.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 *
 *
 * <pre>
 * The request message for
 * [Agents.CreateAgent][google.cloud.dialogflow.cx.v3beta1.Agents.CreateAgent].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest}
 */
public final class CreateAgentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest)
    CreateAgentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateAgentRequest.newBuilder() to construct.
  private CreateAgentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateAgentRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateAgentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.AgentProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateAgentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.AgentProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateAgentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest.class,
            com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The location to create a agent for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
   * Required. The location to create a agent for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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

  public static final int AGENT_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.cx.v3beta1.Agent agent_;
  /**
   *
   *
   * <pre>
   * Required. The agent to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Agent agent = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the agent field is set.
   */
  @java.lang.Override
  public boolean hasAgent() {
    return agent_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The agent to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Agent agent = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The agent.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.Agent getAgent() {
    return agent_ == null
        ? com.google.cloud.dialogflow.cx.v3beta1.Agent.getDefaultInstance()
        : agent_;
  }
  /**
   *
   *
   * <pre>
   * Required. The agent to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Agent agent = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.AgentOrBuilder getAgentOrBuilder() {
    return agent_ == null
        ? com.google.cloud.dialogflow.cx.v3beta1.Agent.getDefaultInstance()
        : agent_;
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
    if (agent_ != null) {
      output.writeMessage(2, getAgent());
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
    if (agent_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAgent());
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest other =
        (com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasAgent() != other.hasAgent()) return false;
    if (hasAgent()) {
      if (!getAgent().equals(other.getAgent())) return false;
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
    if (hasAgent()) {
      hash = (37 * hash) + AGENT_FIELD_NUMBER;
      hash = (53 * hash) + getAgent().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest parseFrom(
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
      com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest prototype) {
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
   * [Agents.CreateAgent][google.cloud.dialogflow.cx.v3beta1.Agents.CreateAgent].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest)
      com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.AgentProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateAgentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.AgentProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateAgentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest.class,
              com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      agent_ = null;
      if (agentBuilder_ != null) {
        agentBuilder_.dispose();
        agentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.AgentProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_CreateAgentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest build() {
      com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest result =
          new com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.agent_ = agentBuilder_ == null ? agent_ : agentBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAgent()) {
        mergeAgent(other.getAgent());
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
                input.readMessage(getAgentFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The location to create a agent for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
     * Required. The location to create a agent for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
     * Required. The location to create a agent for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
     * Required. The location to create a agent for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
     * Required. The location to create a agent for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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

    private com.google.cloud.dialogflow.cx.v3beta1.Agent agent_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.Agent,
            com.google.cloud.dialogflow.cx.v3beta1.Agent.Builder,
            com.google.cloud.dialogflow.cx.v3beta1.AgentOrBuilder>
        agentBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The agent to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Agent agent = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the agent field is set.
     */
    public boolean hasAgent() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Agent agent = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The agent.
     */
    public com.google.cloud.dialogflow.cx.v3beta1.Agent getAgent() {
      if (agentBuilder_ == null) {
        return agent_ == null
            ? com.google.cloud.dialogflow.cx.v3beta1.Agent.getDefaultInstance()
            : agent_;
      } else {
        return agentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Agent agent = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAgent(com.google.cloud.dialogflow.cx.v3beta1.Agent value) {
      if (agentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agent_ = value;
      } else {
        agentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Agent agent = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAgent(com.google.cloud.dialogflow.cx.v3beta1.Agent.Builder builderForValue) {
      if (agentBuilder_ == null) {
        agent_ = builderForValue.build();
      } else {
        agentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Agent agent = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAgent(com.google.cloud.dialogflow.cx.v3beta1.Agent value) {
      if (agentBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && agent_ != null
            && agent_ != com.google.cloud.dialogflow.cx.v3beta1.Agent.getDefaultInstance()) {
          getAgentBuilder().mergeFrom(value);
        } else {
          agent_ = value;
        }
      } else {
        agentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Agent agent = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAgent() {
      bitField0_ = (bitField0_ & ~0x00000002);
      agent_ = null;
      if (agentBuilder_ != null) {
        agentBuilder_.dispose();
        agentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Agent agent = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.Agent.Builder getAgentBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAgentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Agent agent = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.AgentOrBuilder getAgentOrBuilder() {
      if (agentBuilder_ != null) {
        return agentBuilder_.getMessageOrBuilder();
      } else {
        return agent_ == null
            ? com.google.cloud.dialogflow.cx.v3beta1.Agent.getDefaultInstance()
            : agent_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.Agent agent = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.Agent,
            com.google.cloud.dialogflow.cx.v3beta1.Agent.Builder,
            com.google.cloud.dialogflow.cx.v3beta1.AgentOrBuilder>
        getAgentFieldBuilder() {
      if (agentBuilder_ == null) {
        agentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.cx.v3beta1.Agent,
                com.google.cloud.dialogflow.cx.v3beta1.Agent.Builder,
                com.google.cloud.dialogflow.cx.v3beta1.AgentOrBuilder>(
                getAgent(), getParentForChildren(), isClean());
        agent_ = null;
      }
      return agentBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest)
  private static final com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAgentRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateAgentRequest>() {
        @java.lang.Override
        public CreateAgentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAgentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAgentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
