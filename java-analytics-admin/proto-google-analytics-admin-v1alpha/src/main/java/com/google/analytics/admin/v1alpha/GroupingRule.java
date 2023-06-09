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
// source: google/analytics/admin/v1alpha/channel_group.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * The rules that govern how traffic is grouped into one channel.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.GroupingRule}
 */
public final class GroupingRule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.GroupingRule)
    GroupingRuleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GroupingRule.newBuilder() to construct.
  private GroupingRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GroupingRule() {
    displayName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GroupingRule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.ChannelGroupProto
        .internal_static_google_analytics_admin_v1alpha_GroupingRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.ChannelGroupProto
        .internal_static_google_analytics_admin_v1alpha_GroupingRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.GroupingRule.class,
            com.google.analytics.admin.v1alpha.GroupingRule.Builder.class);
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object displayName_ = "";
  /**
   *
   *
   * <pre>
   * Required. Customer defined display name for the channel.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Customer defined display name for the channel.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPRESSION_FIELD_NUMBER = 2;
  private com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression expression_;
  /**
   *
   *
   * <pre>
   * Required. The Filter Expression that defines the Grouping Rule.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ChannelGroupFilterExpression expression = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the expression field is set.
   */
  @java.lang.Override
  public boolean hasExpression() {
    return expression_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The Filter Expression that defines the Grouping Rule.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ChannelGroupFilterExpression expression = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The expression.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression getExpression() {
    return expression_ == null
        ? com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression.getDefaultInstance()
        : expression_;
  }
  /**
   *
   *
   * <pre>
   * Required. The Filter Expression that defines the Grouping Rule.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ChannelGroupFilterExpression expression = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionOrBuilder
      getExpressionOrBuilder() {
    return expression_ == null
        ? com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression.getDefaultInstance()
        : expression_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, displayName_);
    }
    if (expression_ != null) {
      output.writeMessage(2, getExpression());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, displayName_);
    }
    if (expression_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getExpression());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.GroupingRule)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.GroupingRule other =
        (com.google.analytics.admin.v1alpha.GroupingRule) obj;

    if (!getDisplayName().equals(other.getDisplayName())) return false;
    if (hasExpression() != other.hasExpression()) return false;
    if (hasExpression()) {
      if (!getExpression().equals(other.getExpression())) return false;
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
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    if (hasExpression()) {
      hash = (37 * hash) + EXPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getExpression().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.GroupingRule parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.GroupingRule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GroupingRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.GroupingRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GroupingRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.GroupingRule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GroupingRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.GroupingRule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GroupingRule parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.GroupingRule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.GroupingRule parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.GroupingRule parseFrom(
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

  public static Builder newBuilder(com.google.analytics.admin.v1alpha.GroupingRule prototype) {
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
   * The rules that govern how traffic is grouped into one channel.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.GroupingRule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.GroupingRule)
      com.google.analytics.admin.v1alpha.GroupingRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.ChannelGroupProto
          .internal_static_google_analytics_admin_v1alpha_GroupingRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.ChannelGroupProto
          .internal_static_google_analytics_admin_v1alpha_GroupingRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.GroupingRule.class,
              com.google.analytics.admin.v1alpha.GroupingRule.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.GroupingRule.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      displayName_ = "";
      expression_ = null;
      if (expressionBuilder_ != null) {
        expressionBuilder_.dispose();
        expressionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.ChannelGroupProto
          .internal_static_google_analytics_admin_v1alpha_GroupingRule_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.GroupingRule getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.GroupingRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.GroupingRule build() {
      com.google.analytics.admin.v1alpha.GroupingRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.GroupingRule buildPartial() {
      com.google.analytics.admin.v1alpha.GroupingRule result =
          new com.google.analytics.admin.v1alpha.GroupingRule(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1alpha.GroupingRule result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.displayName_ = displayName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.expression_ = expressionBuilder_ == null ? expression_ : expressionBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.GroupingRule) {
        return mergeFrom((com.google.analytics.admin.v1alpha.GroupingRule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.GroupingRule other) {
      if (other == com.google.analytics.admin.v1alpha.GroupingRule.getDefaultInstance())
        return this;
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasExpression()) {
        mergeExpression(other.getExpression());
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
                displayName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getExpressionFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * Required. Customer defined display name for the channel.
     * </pre>
     *
     * <code>string display_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Customer defined display name for the channel.
     * </pre>
     *
     * <code>string display_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Customer defined display name for the channel.
     * </pre>
     *
     * <code>string display_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      displayName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Customer defined display name for the channel.
     * </pre>
     *
     * <code>string display_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      displayName_ = getDefaultInstance().getDisplayName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Customer defined display name for the channel.
     * </pre>
     *
     * <code>string display_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      displayName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression expression_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression,
            com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression.Builder,
            com.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionOrBuilder>
        expressionBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The Filter Expression that defines the Grouping Rule.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ChannelGroupFilterExpression expression = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the expression field is set.
     */
    public boolean hasExpression() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The Filter Expression that defines the Grouping Rule.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ChannelGroupFilterExpression expression = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The expression.
     */
    public com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression getExpression() {
      if (expressionBuilder_ == null) {
        return expression_ == null
            ? com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression.getDefaultInstance()
            : expression_;
      } else {
        return expressionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Filter Expression that defines the Grouping Rule.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ChannelGroupFilterExpression expression = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setExpression(
        com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression value) {
      if (expressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expression_ = value;
      } else {
        expressionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Filter Expression that defines the Grouping Rule.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ChannelGroupFilterExpression expression = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setExpression(
        com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression.Builder builderForValue) {
      if (expressionBuilder_ == null) {
        expression_ = builderForValue.build();
      } else {
        expressionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Filter Expression that defines the Grouping Rule.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ChannelGroupFilterExpression expression = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeExpression(
        com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression value) {
      if (expressionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && expression_ != null
            && expression_
                != com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression
                    .getDefaultInstance()) {
          getExpressionBuilder().mergeFrom(value);
        } else {
          expression_ = value;
        }
      } else {
        expressionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Filter Expression that defines the Grouping Rule.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ChannelGroupFilterExpression expression = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearExpression() {
      bitField0_ = (bitField0_ & ~0x00000002);
      expression_ = null;
      if (expressionBuilder_ != null) {
        expressionBuilder_.dispose();
        expressionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Filter Expression that defines the Grouping Rule.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ChannelGroupFilterExpression expression = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression.Builder
        getExpressionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExpressionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The Filter Expression that defines the Grouping Rule.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ChannelGroupFilterExpression expression = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionOrBuilder
        getExpressionOrBuilder() {
      if (expressionBuilder_ != null) {
        return expressionBuilder_.getMessageOrBuilder();
      } else {
        return expression_ == null
            ? com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression.getDefaultInstance()
            : expression_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Filter Expression that defines the Grouping Rule.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ChannelGroupFilterExpression expression = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression,
            com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression.Builder,
            com.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionOrBuilder>
        getExpressionFieldBuilder() {
      if (expressionBuilder_ == null) {
        expressionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression,
                com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression.Builder,
                com.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionOrBuilder>(
                getExpression(), getParentForChildren(), isClean());
        expression_ = null;
      }
      return expressionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.GroupingRule)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.GroupingRule)
  private static final com.google.analytics.admin.v1alpha.GroupingRule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.GroupingRule();
  }

  public static com.google.analytics.admin.v1alpha.GroupingRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupingRule> PARSER =
      new com.google.protobuf.AbstractParser<GroupingRule>() {
        @java.lang.Override
        public GroupingRule parsePartialFrom(
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

  public static com.google.protobuf.Parser<GroupingRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupingRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.GroupingRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
