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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * Provides links to documentation or for performing an out of band action. For example, if a quota check failed with an error indicating the calling project hasn't enabled the accessed service, this can contain a URL pointing directly to the right place in the developer console to flip the bit.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.Help}
 */
public final class Help extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.Help)
    HelpOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Help.newBuilder() to construct.
  private Help(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Help() {
    links_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Help();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_Help_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_Help_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.Help.class, com.google.cloud.compute.v1.Help.Builder.class);
  }

  public static final int LINKS_FIELD_NUMBER = 102977465;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.HelpLink> links_;
  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.HelpLink> getLinksList() {
    return links_;
  }
  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.HelpLinkOrBuilder>
      getLinksOrBuilderList() {
    return links_;
  }
  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
   */
  @java.lang.Override
  public int getLinksCount() {
    return links_.size();
  }
  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.HelpLink getLinks(int index) {
    return links_.get(index);
  }
  /**
   *
   *
   * <pre>
   * URL(s) pointing to additional information on handling the current error.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.HelpLinkOrBuilder getLinksOrBuilder(int index) {
    return links_.get(index);
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
    for (int i = 0; i < links_.size(); i++) {
      output.writeMessage(102977465, links_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < links_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(102977465, links_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.Help)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.Help other = (com.google.cloud.compute.v1.Help) obj;

    if (!getLinksList().equals(other.getLinksList())) return false;
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
    if (getLinksCount() > 0) {
      hash = (37 * hash) + LINKS_FIELD_NUMBER;
      hash = (53 * hash) + getLinksList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.Help parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Help parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Help parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Help parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Help parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.Help parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Help parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Help parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Help parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Help parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.Help parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.Help parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.Help prototype) {
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
   * Provides links to documentation or for performing an out of band action. For example, if a quota check failed with an error indicating the calling project hasn't enabled the accessed service, this can contain a URL pointing directly to the right place in the developer console to flip the bit.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.Help}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.Help)
      com.google.cloud.compute.v1.HelpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Help_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Help_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.Help.class,
              com.google.cloud.compute.v1.Help.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.Help.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (linksBuilder_ == null) {
        links_ = java.util.Collections.emptyList();
      } else {
        links_ = null;
        linksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_Help_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Help getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.Help.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Help build() {
      com.google.cloud.compute.v1.Help result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.Help buildPartial() {
      com.google.cloud.compute.v1.Help result = new com.google.cloud.compute.v1.Help(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.compute.v1.Help result) {
      if (linksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          links_ = java.util.Collections.unmodifiableList(links_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.links_ = links_;
      } else {
        result.links_ = linksBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.Help result) {
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
      if (other instanceof com.google.cloud.compute.v1.Help) {
        return mergeFrom((com.google.cloud.compute.v1.Help) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.Help other) {
      if (other == com.google.cloud.compute.v1.Help.getDefaultInstance()) return this;
      if (linksBuilder_ == null) {
        if (!other.links_.isEmpty()) {
          if (links_.isEmpty()) {
            links_ = other.links_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLinksIsMutable();
            links_.addAll(other.links_);
          }
          onChanged();
        }
      } else {
        if (!other.links_.isEmpty()) {
          if (linksBuilder_.isEmpty()) {
            linksBuilder_.dispose();
            linksBuilder_ = null;
            links_ = other.links_;
            bitField0_ = (bitField0_ & ~0x00000001);
            linksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getLinksFieldBuilder()
                    : null;
          } else {
            linksBuilder_.addAllMessages(other.links_);
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
            case 823819722:
              {
                com.google.cloud.compute.v1.HelpLink m =
                    input.readMessage(
                        com.google.cloud.compute.v1.HelpLink.parser(), extensionRegistry);
                if (linksBuilder_ == null) {
                  ensureLinksIsMutable();
                  links_.add(m);
                } else {
                  linksBuilder_.addMessage(m);
                }
                break;
              } // case 823819722
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

    private java.util.List<com.google.cloud.compute.v1.HelpLink> links_ =
        java.util.Collections.emptyList();

    private void ensureLinksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        links_ = new java.util.ArrayList<com.google.cloud.compute.v1.HelpLink>(links_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.HelpLink,
            com.google.cloud.compute.v1.HelpLink.Builder,
            com.google.cloud.compute.v1.HelpLinkOrBuilder>
        linksBuilder_;

    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.HelpLink> getLinksList() {
      if (linksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(links_);
      } else {
        return linksBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public int getLinksCount() {
      if (linksBuilder_ == null) {
        return links_.size();
      } else {
        return linksBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public com.google.cloud.compute.v1.HelpLink getLinks(int index) {
      if (linksBuilder_ == null) {
        return links_.get(index);
      } else {
        return linksBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public Builder setLinks(int index, com.google.cloud.compute.v1.HelpLink value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.set(index, value);
        onChanged();
      } else {
        linksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public Builder setLinks(
        int index, com.google.cloud.compute.v1.HelpLink.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.set(index, builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public Builder addLinks(com.google.cloud.compute.v1.HelpLink value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.add(value);
        onChanged();
      } else {
        linksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public Builder addLinks(int index, com.google.cloud.compute.v1.HelpLink value) {
      if (linksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLinksIsMutable();
        links_.add(index, value);
        onChanged();
      } else {
        linksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public Builder addLinks(com.google.cloud.compute.v1.HelpLink.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.add(builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public Builder addLinks(
        int index, com.google.cloud.compute.v1.HelpLink.Builder builderForValue) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.add(index, builderForValue.build());
        onChanged();
      } else {
        linksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public Builder addAllLinks(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.HelpLink> values) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, links_);
        onChanged();
      } else {
        linksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public Builder clearLinks() {
      if (linksBuilder_ == null) {
        links_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        linksBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public Builder removeLinks(int index) {
      if (linksBuilder_ == null) {
        ensureLinksIsMutable();
        links_.remove(index);
        onChanged();
      } else {
        linksBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public com.google.cloud.compute.v1.HelpLink.Builder getLinksBuilder(int index) {
      return getLinksFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public com.google.cloud.compute.v1.HelpLinkOrBuilder getLinksOrBuilder(int index) {
      if (linksBuilder_ == null) {
        return links_.get(index);
      } else {
        return linksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.HelpLinkOrBuilder>
        getLinksOrBuilderList() {
      if (linksBuilder_ != null) {
        return linksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(links_);
      }
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public com.google.cloud.compute.v1.HelpLink.Builder addLinksBuilder() {
      return getLinksFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.HelpLink.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public com.google.cloud.compute.v1.HelpLink.Builder addLinksBuilder(int index) {
      return getLinksFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.HelpLink.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * URL(s) pointing to additional information on handling the current error.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.HelpLink links = 102977465;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.HelpLink.Builder> getLinksBuilderList() {
      return getLinksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.HelpLink,
            com.google.cloud.compute.v1.HelpLink.Builder,
            com.google.cloud.compute.v1.HelpLinkOrBuilder>
        getLinksFieldBuilder() {
      if (linksBuilder_ == null) {
        linksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.HelpLink,
                com.google.cloud.compute.v1.HelpLink.Builder,
                com.google.cloud.compute.v1.HelpLinkOrBuilder>(
                links_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        links_ = null;
      }
      return linksBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.Help)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.Help)
  private static final com.google.cloud.compute.v1.Help DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.Help();
  }

  public static com.google.cloud.compute.v1.Help getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Help> PARSER =
      new com.google.protobuf.AbstractParser<Help>() {
        @java.lang.Override
        public Help parsePartialFrom(
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

  public static com.google.protobuf.Parser<Help> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Help> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.Help getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
