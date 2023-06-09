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
// source: google/cloud/dataproc/v1/workflow_templates.proto

package com.google.cloud.dataproc.v1;

/**
 *
 *
 * <pre>
 * The workflow graph.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.WorkflowGraph}
 */
public final class WorkflowGraph extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.WorkflowGraph)
    WorkflowGraphOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use WorkflowGraph.newBuilder() to construct.
  private WorkflowGraph(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WorkflowGraph() {
    nodes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new WorkflowGraph();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
        .internal_static_google_cloud_dataproc_v1_WorkflowGraph_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
        .internal_static_google_cloud_dataproc_v1_WorkflowGraph_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.WorkflowGraph.class,
            com.google.cloud.dataproc.v1.WorkflowGraph.Builder.class);
  }

  public static final int NODES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dataproc.v1.WorkflowNode> nodes_;
  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dataproc.v1.WorkflowNode> getNodesList() {
    return nodes_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dataproc.v1.WorkflowNodeOrBuilder>
      getNodesOrBuilderList() {
    return nodes_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public int getNodesCount() {
    return nodes_.size();
  }
  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.WorkflowNode getNodes(int index) {
    return nodes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Output only. The workflow nodes.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dataproc.v1.WorkflowNodeOrBuilder getNodesOrBuilder(int index) {
    return nodes_.get(index);
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
    for (int i = 0; i < nodes_.size(); i++) {
      output.writeMessage(1, nodes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nodes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, nodes_.get(i));
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.WorkflowGraph)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.WorkflowGraph other =
        (com.google.cloud.dataproc.v1.WorkflowGraph) obj;

    if (!getNodesList().equals(other.getNodesList())) return false;
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
    if (getNodesCount() > 0) {
      hash = (37 * hash) + NODES_FIELD_NUMBER;
      hash = (53 * hash) + getNodesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.WorkflowGraph parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.WorkflowGraph parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.WorkflowGraph parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.WorkflowGraph parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.WorkflowGraph parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataproc.v1.WorkflowGraph parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.WorkflowGraph parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.WorkflowGraph parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.WorkflowGraph parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.WorkflowGraph parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.WorkflowGraph parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.WorkflowGraph parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataproc.v1.WorkflowGraph prototype) {
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
   * The workflow graph.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.WorkflowGraph}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.WorkflowGraph)
      com.google.cloud.dataproc.v1.WorkflowGraphOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_WorkflowGraph_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_WorkflowGraph_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.WorkflowGraph.class,
              com.google.cloud.dataproc.v1.WorkflowGraph.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.WorkflowGraph.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (nodesBuilder_ == null) {
        nodes_ = java.util.Collections.emptyList();
      } else {
        nodes_ = null;
        nodesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataproc.v1.WorkflowTemplatesProto
          .internal_static_google_cloud_dataproc_v1_WorkflowGraph_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.WorkflowGraph getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.WorkflowGraph.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.WorkflowGraph build() {
      com.google.cloud.dataproc.v1.WorkflowGraph result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.WorkflowGraph buildPartial() {
      com.google.cloud.dataproc.v1.WorkflowGraph result =
          new com.google.cloud.dataproc.v1.WorkflowGraph(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dataproc.v1.WorkflowGraph result) {
      if (nodesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nodes_ = java.util.Collections.unmodifiableList(nodes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nodes_ = nodes_;
      } else {
        result.nodes_ = nodesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dataproc.v1.WorkflowGraph result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.dataproc.v1.WorkflowGraph) {
        return mergeFrom((com.google.cloud.dataproc.v1.WorkflowGraph) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.WorkflowGraph other) {
      if (other == com.google.cloud.dataproc.v1.WorkflowGraph.getDefaultInstance()) return this;
      if (nodesBuilder_ == null) {
        if (!other.nodes_.isEmpty()) {
          if (nodes_.isEmpty()) {
            nodes_ = other.nodes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNodesIsMutable();
            nodes_.addAll(other.nodes_);
          }
          onChanged();
        }
      } else {
        if (!other.nodes_.isEmpty()) {
          if (nodesBuilder_.isEmpty()) {
            nodesBuilder_.dispose();
            nodesBuilder_ = null;
            nodes_ = other.nodes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nodesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getNodesFieldBuilder()
                    : null;
          } else {
            nodesBuilder_.addAllMessages(other.nodes_);
          }
        }
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
                com.google.cloud.dataproc.v1.WorkflowNode m =
                    input.readMessage(
                        com.google.cloud.dataproc.v1.WorkflowNode.parser(), extensionRegistry);
                if (nodesBuilder_ == null) {
                  ensureNodesIsMutable();
                  nodes_.add(m);
                } else {
                  nodesBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.dataproc.v1.WorkflowNode> nodes_ =
        java.util.Collections.emptyList();

    private void ensureNodesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nodes_ = new java.util.ArrayList<com.google.cloud.dataproc.v1.WorkflowNode>(nodes_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataproc.v1.WorkflowNode,
            com.google.cloud.dataproc.v1.WorkflowNode.Builder,
            com.google.cloud.dataproc.v1.WorkflowNodeOrBuilder>
        nodesBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.dataproc.v1.WorkflowNode> getNodesList() {
      if (nodesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nodes_);
      } else {
        return nodesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public int getNodesCount() {
      if (nodesBuilder_ == null) {
        return nodes_.size();
      } else {
        return nodesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1.WorkflowNode getNodes(int index) {
      if (nodesBuilder_ == null) {
        return nodes_.get(index);
      } else {
        return nodesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setNodes(int index, com.google.cloud.dataproc.v1.WorkflowNode value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.set(index, value);
        onChanged();
      } else {
        nodesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setNodes(
        int index, com.google.cloud.dataproc.v1.WorkflowNode.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.set(index, builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addNodes(com.google.cloud.dataproc.v1.WorkflowNode value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.add(value);
        onChanged();
      } else {
        nodesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addNodes(int index, com.google.cloud.dataproc.v1.WorkflowNode value) {
      if (nodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNodesIsMutable();
        nodes_.add(index, value);
        onChanged();
      } else {
        nodesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addNodes(com.google.cloud.dataproc.v1.WorkflowNode.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.add(builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addNodes(
        int index, com.google.cloud.dataproc.v1.WorkflowNode.Builder builderForValue) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.add(index, builderForValue.build());
        onChanged();
      } else {
        nodesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addAllNodes(
        java.lang.Iterable<? extends com.google.cloud.dataproc.v1.WorkflowNode> values) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, nodes_);
        onChanged();
      } else {
        nodesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearNodes() {
      if (nodesBuilder_ == null) {
        nodes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nodesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder removeNodes(int index) {
      if (nodesBuilder_ == null) {
        ensureNodesIsMutable();
        nodes_.remove(index);
        onChanged();
      } else {
        nodesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1.WorkflowNode.Builder getNodesBuilder(int index) {
      return getNodesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1.WorkflowNodeOrBuilder getNodesOrBuilder(int index) {
      if (nodesBuilder_ == null) {
        return nodes_.get(index);
      } else {
        return nodesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.dataproc.v1.WorkflowNodeOrBuilder>
        getNodesOrBuilderList() {
      if (nodesBuilder_ != null) {
        return nodesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nodes_);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1.WorkflowNode.Builder addNodesBuilder() {
      return getNodesFieldBuilder()
          .addBuilder(com.google.cloud.dataproc.v1.WorkflowNode.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.dataproc.v1.WorkflowNode.Builder addNodesBuilder(int index) {
      return getNodesFieldBuilder()
          .addBuilder(index, com.google.cloud.dataproc.v1.WorkflowNode.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. The workflow nodes.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.dataproc.v1.WorkflowNode nodes = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.dataproc.v1.WorkflowNode.Builder> getNodesBuilderList() {
      return getNodesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataproc.v1.WorkflowNode,
            com.google.cloud.dataproc.v1.WorkflowNode.Builder,
            com.google.cloud.dataproc.v1.WorkflowNodeOrBuilder>
        getNodesFieldBuilder() {
      if (nodesBuilder_ == null) {
        nodesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dataproc.v1.WorkflowNode,
                com.google.cloud.dataproc.v1.WorkflowNode.Builder,
                com.google.cloud.dataproc.v1.WorkflowNodeOrBuilder>(
                nodes_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        nodes_ = null;
      }
      return nodesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.WorkflowGraph)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.WorkflowGraph)
  private static final com.google.cloud.dataproc.v1.WorkflowGraph DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.WorkflowGraph();
  }

  public static com.google.cloud.dataproc.v1.WorkflowGraph getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkflowGraph> PARSER =
      new com.google.protobuf.AbstractParser<WorkflowGraph>() {
        @java.lang.Override
        public WorkflowGraph parsePartialFrom(
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

  public static com.google.protobuf.Parser<WorkflowGraph> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkflowGraph> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.WorkflowGraph getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
