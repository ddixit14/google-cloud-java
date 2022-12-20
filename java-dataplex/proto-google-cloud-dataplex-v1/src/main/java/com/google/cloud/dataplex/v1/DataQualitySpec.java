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
// source: google/cloud/dataplex/v1/data_quality.proto

package com.google.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * DataQualityScan related setting.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataplex.v1.DataQualitySpec}
 */
public final class DataQualitySpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataplex.v1.DataQualitySpec)
    DataQualitySpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataQualitySpec.newBuilder() to construct.
  private DataQualitySpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataQualitySpec() {
    rules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataQualitySpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataplex.v1.DataQualityProto
        .internal_static_google_cloud_dataplex_v1_DataQualitySpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataplex.v1.DataQualityProto
        .internal_static_google_cloud_dataplex_v1_DataQualitySpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataplex.v1.DataQualitySpec.class,
            com.google.cloud.dataplex.v1.DataQualitySpec.Builder.class);
  }

  public static final int RULES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dataplex.v1.DataQualityRule> rules_;
  /**
   *
   *
   * <pre>
   * The list of rules to evaluate against a data source. At least one rule is
   * required.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dataplex.v1.DataQualityRule> getRulesList() {
    return rules_;
  }
  /**
   *
   *
   * <pre>
   * The list of rules to evaluate against a data source. At least one rule is
   * required.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dataplex.v1.DataQualityRuleOrBuilder>
      getRulesOrBuilderList() {
    return rules_;
  }
  /**
   *
   *
   * <pre>
   * The list of rules to evaluate against a data source. At least one rule is
   * required.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
   */
  @java.lang.Override
  public int getRulesCount() {
    return rules_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of rules to evaluate against a data source. At least one rule is
   * required.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.DataQualityRule getRules(int index) {
    return rules_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of rules to evaluate against a data source. At least one rule is
   * required.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataplex.v1.DataQualityRuleOrBuilder getRulesOrBuilder(int index) {
    return rules_.get(index);
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
    for (int i = 0; i < rules_.size(); i++) {
      output.writeMessage(1, rules_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, rules_.get(i));
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
    if (!(obj instanceof com.google.cloud.dataplex.v1.DataQualitySpec)) {
      return super.equals(obj);
    }
    com.google.cloud.dataplex.v1.DataQualitySpec other =
        (com.google.cloud.dataplex.v1.DataQualitySpec) obj;

    if (!getRulesList().equals(other.getRulesList())) return false;
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
    if (getRulesCount() > 0) {
      hash = (37 * hash) + RULES_FIELD_NUMBER;
      hash = (53 * hash) + getRulesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataplex.v1.DataQualitySpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.DataQualitySpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.DataQualitySpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.DataQualitySpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.DataQualitySpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataplex.v1.DataQualitySpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.DataQualitySpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.DataQualitySpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.DataQualitySpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.DataQualitySpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataplex.v1.DataQualitySpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataplex.v1.DataQualitySpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataplex.v1.DataQualitySpec prototype) {
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
   * DataQualityScan related setting.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataplex.v1.DataQualitySpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataplex.v1.DataQualitySpec)
      com.google.cloud.dataplex.v1.DataQualitySpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataplex.v1.DataQualityProto
          .internal_static_google_cloud_dataplex_v1_DataQualitySpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataplex.v1.DataQualityProto
          .internal_static_google_cloud_dataplex_v1_DataQualitySpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataplex.v1.DataQualitySpec.class,
              com.google.cloud.dataplex.v1.DataQualitySpec.Builder.class);
    }

    // Construct using com.google.cloud.dataplex.v1.DataQualitySpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
      } else {
        rules_ = null;
        rulesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataplex.v1.DataQualityProto
          .internal_static_google_cloud_dataplex_v1_DataQualitySpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.DataQualitySpec getDefaultInstanceForType() {
      return com.google.cloud.dataplex.v1.DataQualitySpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.DataQualitySpec build() {
      com.google.cloud.dataplex.v1.DataQualitySpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataplex.v1.DataQualitySpec buildPartial() {
      com.google.cloud.dataplex.v1.DataQualitySpec result =
          new com.google.cloud.dataplex.v1.DataQualitySpec(this);
      int from_bitField0_ = bitField0_;
      if (rulesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rules_ = rules_;
      } else {
        result.rules_ = rulesBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.dataplex.v1.DataQualitySpec) {
        return mergeFrom((com.google.cloud.dataplex.v1.DataQualitySpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataplex.v1.DataQualitySpec other) {
      if (other == com.google.cloud.dataplex.v1.DataQualitySpec.getDefaultInstance()) return this;
      if (rulesBuilder_ == null) {
        if (!other.rules_.isEmpty()) {
          if (rules_.isEmpty()) {
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRulesIsMutable();
            rules_.addAll(other.rules_);
          }
          onChanged();
        }
      } else {
        if (!other.rules_.isEmpty()) {
          if (rulesBuilder_.isEmpty()) {
            rulesBuilder_.dispose();
            rulesBuilder_ = null;
            rules_ = other.rules_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rulesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRulesFieldBuilder()
                    : null;
          } else {
            rulesBuilder_.addAllMessages(other.rules_);
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
                com.google.cloud.dataplex.v1.DataQualityRule m =
                    input.readMessage(
                        com.google.cloud.dataplex.v1.DataQualityRule.parser(), extensionRegistry);
                if (rulesBuilder_ == null) {
                  ensureRulesIsMutable();
                  rules_.add(m);
                } else {
                  rulesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dataplex.v1.DataQualityRule> rules_ =
        java.util.Collections.emptyList();

    private void ensureRulesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rules_ = new java.util.ArrayList<com.google.cloud.dataplex.v1.DataQualityRule>(rules_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataplex.v1.DataQualityRule,
            com.google.cloud.dataplex.v1.DataQualityRule.Builder,
            com.google.cloud.dataplex.v1.DataQualityRuleOrBuilder>
        rulesBuilder_;

    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public java.util.List<com.google.cloud.dataplex.v1.DataQualityRule> getRulesList() {
      if (rulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rules_);
      } else {
        return rulesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public int getRulesCount() {
      if (rulesBuilder_ == null) {
        return rules_.size();
      } else {
        return rulesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public com.google.cloud.dataplex.v1.DataQualityRule getRules(int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);
      } else {
        return rulesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public Builder setRules(int index, com.google.cloud.dataplex.v1.DataQualityRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.set(index, value);
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public Builder setRules(
        int index, com.google.cloud.dataplex.v1.DataQualityRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.set(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public Builder addRules(com.google.cloud.dataplex.v1.DataQualityRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public Builder addRules(int index, com.google.cloud.dataplex.v1.DataQualityRule value) {
      if (rulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRulesIsMutable();
        rules_.add(index, value);
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public Builder addRules(com.google.cloud.dataplex.v1.DataQualityRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public Builder addRules(
        int index, com.google.cloud.dataplex.v1.DataQualityRule.Builder builderForValue) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.add(index, builderForValue.build());
        onChanged();
      } else {
        rulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public Builder addAllRules(
        java.lang.Iterable<? extends com.google.cloud.dataplex.v1.DataQualityRule> values) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, rules_);
        onChanged();
      } else {
        rulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public Builder clearRules() {
      if (rulesBuilder_ == null) {
        rules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rulesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public Builder removeRules(int index) {
      if (rulesBuilder_ == null) {
        ensureRulesIsMutable();
        rules_.remove(index);
        onChanged();
      } else {
        rulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public com.google.cloud.dataplex.v1.DataQualityRule.Builder getRulesBuilder(int index) {
      return getRulesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public com.google.cloud.dataplex.v1.DataQualityRuleOrBuilder getRulesOrBuilder(int index) {
      if (rulesBuilder_ == null) {
        return rules_.get(index);
      } else {
        return rulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dataplex.v1.DataQualityRuleOrBuilder>
        getRulesOrBuilderList() {
      if (rulesBuilder_ != null) {
        return rulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rules_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public com.google.cloud.dataplex.v1.DataQualityRule.Builder addRulesBuilder() {
      return getRulesFieldBuilder()
          .addBuilder(com.google.cloud.dataplex.v1.DataQualityRule.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public com.google.cloud.dataplex.v1.DataQualityRule.Builder addRulesBuilder(int index) {
      return getRulesFieldBuilder()
          .addBuilder(index, com.google.cloud.dataplex.v1.DataQualityRule.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of rules to evaluate against a data source. At least one rule is
     * required.
     * </pre>
     *
     * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
     */
    public java.util.List<com.google.cloud.dataplex.v1.DataQualityRule.Builder>
        getRulesBuilderList() {
      return getRulesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataplex.v1.DataQualityRule,
            com.google.cloud.dataplex.v1.DataQualityRule.Builder,
            com.google.cloud.dataplex.v1.DataQualityRuleOrBuilder>
        getRulesFieldBuilder() {
      if (rulesBuilder_ == null) {
        rulesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dataplex.v1.DataQualityRule,
                com.google.cloud.dataplex.v1.DataQualityRule.Builder,
                com.google.cloud.dataplex.v1.DataQualityRuleOrBuilder>(
                rules_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        rules_ = null;
      }
      return rulesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataplex.v1.DataQualitySpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataplex.v1.DataQualitySpec)
  private static final com.google.cloud.dataplex.v1.DataQualitySpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataplex.v1.DataQualitySpec();
  }

  public static com.google.cloud.dataplex.v1.DataQualitySpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataQualitySpec> PARSER =
      new com.google.protobuf.AbstractParser<DataQualitySpec>() {
        @java.lang.Override
        public DataQualitySpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataQualitySpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataQualitySpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataplex.v1.DataQualitySpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
