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
// source: google/cloud/gkebackup/v1/common.proto

package com.google.cloud.gkebackup.v1;

/**
 *
 *
 * <pre>
 * A list of namespaced Kubernetes resources.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkebackup.v1.NamespacedNames}
 */
public final class NamespacedNames extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkebackup.v1.NamespacedNames)
    NamespacedNamesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NamespacedNames.newBuilder() to construct.
  private NamespacedNames(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NamespacedNames() {
    namespacedNames_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NamespacedNames();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkebackup.v1.CommonProto
        .internal_static_google_cloud_gkebackup_v1_NamespacedNames_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkebackup.v1.CommonProto
        .internal_static_google_cloud_gkebackup_v1_NamespacedNames_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkebackup.v1.NamespacedNames.class,
            com.google.cloud.gkebackup.v1.NamespacedNames.Builder.class);
  }

  public static final int NAMESPACED_NAMES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.gkebackup.v1.NamespacedName> namespacedNames_;
  /**
   *
   *
   * <pre>
   * A list of namespaced Kubernetes resources.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.gkebackup.v1.NamespacedName> getNamespacedNamesList() {
    return namespacedNames_;
  }
  /**
   *
   *
   * <pre>
   * A list of namespaced Kubernetes resources.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.gkebackup.v1.NamespacedNameOrBuilder>
      getNamespacedNamesOrBuilderList() {
    return namespacedNames_;
  }
  /**
   *
   *
   * <pre>
   * A list of namespaced Kubernetes resources.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
   */
  @java.lang.Override
  public int getNamespacedNamesCount() {
    return namespacedNames_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of namespaced Kubernetes resources.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkebackup.v1.NamespacedName getNamespacedNames(int index) {
    return namespacedNames_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of namespaced Kubernetes resources.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkebackup.v1.NamespacedNameOrBuilder getNamespacedNamesOrBuilder(
      int index) {
    return namespacedNames_.get(index);
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
    for (int i = 0; i < namespacedNames_.size(); i++) {
      output.writeMessage(1, namespacedNames_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < namespacedNames_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, namespacedNames_.get(i));
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
    if (!(obj instanceof com.google.cloud.gkebackup.v1.NamespacedNames)) {
      return super.equals(obj);
    }
    com.google.cloud.gkebackup.v1.NamespacedNames other =
        (com.google.cloud.gkebackup.v1.NamespacedNames) obj;

    if (!getNamespacedNamesList().equals(other.getNamespacedNamesList())) return false;
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
    if (getNamespacedNamesCount() > 0) {
      hash = (37 * hash) + NAMESPACED_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getNamespacedNamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkebackup.v1.NamespacedNames parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.NamespacedNames parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.NamespacedNames parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.NamespacedNames parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.NamespacedNames parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.NamespacedNames parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.NamespacedNames parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.NamespacedNames parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.NamespacedNames parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.NamespacedNames parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.NamespacedNames parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.NamespacedNames parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkebackup.v1.NamespacedNames prototype) {
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
   * A list of namespaced Kubernetes resources.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkebackup.v1.NamespacedNames}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkebackup.v1.NamespacedNames)
      com.google.cloud.gkebackup.v1.NamespacedNamesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkebackup.v1.CommonProto
          .internal_static_google_cloud_gkebackup_v1_NamespacedNames_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkebackup.v1.CommonProto
          .internal_static_google_cloud_gkebackup_v1_NamespacedNames_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkebackup.v1.NamespacedNames.class,
              com.google.cloud.gkebackup.v1.NamespacedNames.Builder.class);
    }

    // Construct using com.google.cloud.gkebackup.v1.NamespacedNames.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (namespacedNamesBuilder_ == null) {
        namespacedNames_ = java.util.Collections.emptyList();
      } else {
        namespacedNames_ = null;
        namespacedNamesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkebackup.v1.CommonProto
          .internal_static_google_cloud_gkebackup_v1_NamespacedNames_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.NamespacedNames getDefaultInstanceForType() {
      return com.google.cloud.gkebackup.v1.NamespacedNames.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.NamespacedNames build() {
      com.google.cloud.gkebackup.v1.NamespacedNames result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.NamespacedNames buildPartial() {
      com.google.cloud.gkebackup.v1.NamespacedNames result =
          new com.google.cloud.gkebackup.v1.NamespacedNames(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.gkebackup.v1.NamespacedNames result) {
      if (namespacedNamesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          namespacedNames_ = java.util.Collections.unmodifiableList(namespacedNames_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.namespacedNames_ = namespacedNames_;
      } else {
        result.namespacedNames_ = namespacedNamesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.gkebackup.v1.NamespacedNames result) {
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
      if (other instanceof com.google.cloud.gkebackup.v1.NamespacedNames) {
        return mergeFrom((com.google.cloud.gkebackup.v1.NamespacedNames) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkebackup.v1.NamespacedNames other) {
      if (other == com.google.cloud.gkebackup.v1.NamespacedNames.getDefaultInstance()) return this;
      if (namespacedNamesBuilder_ == null) {
        if (!other.namespacedNames_.isEmpty()) {
          if (namespacedNames_.isEmpty()) {
            namespacedNames_ = other.namespacedNames_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNamespacedNamesIsMutable();
            namespacedNames_.addAll(other.namespacedNames_);
          }
          onChanged();
        }
      } else {
        if (!other.namespacedNames_.isEmpty()) {
          if (namespacedNamesBuilder_.isEmpty()) {
            namespacedNamesBuilder_.dispose();
            namespacedNamesBuilder_ = null;
            namespacedNames_ = other.namespacedNames_;
            bitField0_ = (bitField0_ & ~0x00000001);
            namespacedNamesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getNamespacedNamesFieldBuilder()
                    : null;
          } else {
            namespacedNamesBuilder_.addAllMessages(other.namespacedNames_);
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
                com.google.cloud.gkebackup.v1.NamespacedName m =
                    input.readMessage(
                        com.google.cloud.gkebackup.v1.NamespacedName.parser(), extensionRegistry);
                if (namespacedNamesBuilder_ == null) {
                  ensureNamespacedNamesIsMutable();
                  namespacedNames_.add(m);
                } else {
                  namespacedNamesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.gkebackup.v1.NamespacedName> namespacedNames_ =
        java.util.Collections.emptyList();

    private void ensureNamespacedNamesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        namespacedNames_ =
            new java.util.ArrayList<com.google.cloud.gkebackup.v1.NamespacedName>(namespacedNames_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkebackup.v1.NamespacedName,
            com.google.cloud.gkebackup.v1.NamespacedName.Builder,
            com.google.cloud.gkebackup.v1.NamespacedNameOrBuilder>
        namespacedNamesBuilder_;

    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public java.util.List<com.google.cloud.gkebackup.v1.NamespacedName> getNamespacedNamesList() {
      if (namespacedNamesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(namespacedNames_);
      } else {
        return namespacedNamesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public int getNamespacedNamesCount() {
      if (namespacedNamesBuilder_ == null) {
        return namespacedNames_.size();
      } else {
        return namespacedNamesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.NamespacedName getNamespacedNames(int index) {
      if (namespacedNamesBuilder_ == null) {
        return namespacedNames_.get(index);
      } else {
        return namespacedNamesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public Builder setNamespacedNames(
        int index, com.google.cloud.gkebackup.v1.NamespacedName value) {
      if (namespacedNamesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamespacedNamesIsMutable();
        namespacedNames_.set(index, value);
        onChanged();
      } else {
        namespacedNamesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public Builder setNamespacedNames(
        int index, com.google.cloud.gkebackup.v1.NamespacedName.Builder builderForValue) {
      if (namespacedNamesBuilder_ == null) {
        ensureNamespacedNamesIsMutable();
        namespacedNames_.set(index, builderForValue.build());
        onChanged();
      } else {
        namespacedNamesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public Builder addNamespacedNames(com.google.cloud.gkebackup.v1.NamespacedName value) {
      if (namespacedNamesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamespacedNamesIsMutable();
        namespacedNames_.add(value);
        onChanged();
      } else {
        namespacedNamesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public Builder addNamespacedNames(
        int index, com.google.cloud.gkebackup.v1.NamespacedName value) {
      if (namespacedNamesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNamespacedNamesIsMutable();
        namespacedNames_.add(index, value);
        onChanged();
      } else {
        namespacedNamesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public Builder addNamespacedNames(
        com.google.cloud.gkebackup.v1.NamespacedName.Builder builderForValue) {
      if (namespacedNamesBuilder_ == null) {
        ensureNamespacedNamesIsMutable();
        namespacedNames_.add(builderForValue.build());
        onChanged();
      } else {
        namespacedNamesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public Builder addNamespacedNames(
        int index, com.google.cloud.gkebackup.v1.NamespacedName.Builder builderForValue) {
      if (namespacedNamesBuilder_ == null) {
        ensureNamespacedNamesIsMutable();
        namespacedNames_.add(index, builderForValue.build());
        onChanged();
      } else {
        namespacedNamesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public Builder addAllNamespacedNames(
        java.lang.Iterable<? extends com.google.cloud.gkebackup.v1.NamespacedName> values) {
      if (namespacedNamesBuilder_ == null) {
        ensureNamespacedNamesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, namespacedNames_);
        onChanged();
      } else {
        namespacedNamesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public Builder clearNamespacedNames() {
      if (namespacedNamesBuilder_ == null) {
        namespacedNames_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        namespacedNamesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public Builder removeNamespacedNames(int index) {
      if (namespacedNamesBuilder_ == null) {
        ensureNamespacedNamesIsMutable();
        namespacedNames_.remove(index);
        onChanged();
      } else {
        namespacedNamesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.NamespacedName.Builder getNamespacedNamesBuilder(
        int index) {
      return getNamespacedNamesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.NamespacedNameOrBuilder getNamespacedNamesOrBuilder(
        int index) {
      if (namespacedNamesBuilder_ == null) {
        return namespacedNames_.get(index);
      } else {
        return namespacedNamesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.gkebackup.v1.NamespacedNameOrBuilder>
        getNamespacedNamesOrBuilderList() {
      if (namespacedNamesBuilder_ != null) {
        return namespacedNamesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(namespacedNames_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.NamespacedName.Builder addNamespacedNamesBuilder() {
      return getNamespacedNamesFieldBuilder()
          .addBuilder(com.google.cloud.gkebackup.v1.NamespacedName.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.NamespacedName.Builder addNamespacedNamesBuilder(
        int index) {
      return getNamespacedNamesFieldBuilder()
          .addBuilder(index, com.google.cloud.gkebackup.v1.NamespacedName.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of namespaced Kubernetes resources.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
     */
    public java.util.List<com.google.cloud.gkebackup.v1.NamespacedName.Builder>
        getNamespacedNamesBuilderList() {
      return getNamespacedNamesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkebackup.v1.NamespacedName,
            com.google.cloud.gkebackup.v1.NamespacedName.Builder,
            com.google.cloud.gkebackup.v1.NamespacedNameOrBuilder>
        getNamespacedNamesFieldBuilder() {
      if (namespacedNamesBuilder_ == null) {
        namespacedNamesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.gkebackup.v1.NamespacedName,
                com.google.cloud.gkebackup.v1.NamespacedName.Builder,
                com.google.cloud.gkebackup.v1.NamespacedNameOrBuilder>(
                namespacedNames_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        namespacedNames_ = null;
      }
      return namespacedNamesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkebackup.v1.NamespacedNames)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkebackup.v1.NamespacedNames)
  private static final com.google.cloud.gkebackup.v1.NamespacedNames DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkebackup.v1.NamespacedNames();
  }

  public static com.google.cloud.gkebackup.v1.NamespacedNames getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NamespacedNames> PARSER =
      new com.google.protobuf.AbstractParser<NamespacedNames>() {
        @java.lang.Override
        public NamespacedNames parsePartialFrom(
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

  public static com.google.protobuf.Parser<NamespacedNames> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NamespacedNames> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkebackup.v1.NamespacedNames getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
