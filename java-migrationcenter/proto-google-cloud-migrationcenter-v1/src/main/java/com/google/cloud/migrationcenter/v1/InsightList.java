/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

/**
 *
 *
 * <pre>
 * Message containing insights list.
 * </pre>
 *
 * Protobuf type {@code google.cloud.migrationcenter.v1.InsightList}
 */
public final class InsightList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.migrationcenter.v1.InsightList)
    InsightListOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InsightList.newBuilder() to construct.
  private InsightList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InsightList() {
    insights_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InsightList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_InsightList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_InsightList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.migrationcenter.v1.InsightList.class,
            com.google.cloud.migrationcenter.v1.InsightList.Builder.class);
  }

  public static final int INSIGHTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.migrationcenter.v1.Insight> insights_;
  /**
   *
   *
   * <pre>
   * Output only. Insights of the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.migrationcenter.v1.Insight> getInsightsList() {
    return insights_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Insights of the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.migrationcenter.v1.InsightOrBuilder>
      getInsightsOrBuilderList() {
    return insights_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Insights of the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public int getInsightsCount() {
    return insights_.size();
  }
  /**
   *
   *
   * <pre>
   * Output only. Insights of the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.Insight getInsights(int index) {
    return insights_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Output only. Insights of the list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.InsightOrBuilder getInsightsOrBuilder(int index) {
    return insights_.get(index);
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * Output only. Update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. Update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
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
    for (int i = 0; i < insights_.size(); i++) {
      output.writeMessage(1, insights_.get(i));
    }
    if (updateTime_ != null) {
      output.writeMessage(2, getUpdateTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < insights_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, insights_.get(i));
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateTime());
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
    if (!(obj instanceof com.google.cloud.migrationcenter.v1.InsightList)) {
      return super.equals(obj);
    }
    com.google.cloud.migrationcenter.v1.InsightList other =
        (com.google.cloud.migrationcenter.v1.InsightList) obj;

    if (!getInsightsList().equals(other.getInsightsList())) return false;
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
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
    if (getInsightsCount() > 0) {
      hash = (37 * hash) + INSIGHTS_FIELD_NUMBER;
      hash = (53 * hash) + getInsightsList().hashCode();
    }
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.migrationcenter.v1.InsightList parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.InsightList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.InsightList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.InsightList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.InsightList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.InsightList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.InsightList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.InsightList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.InsightList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.InsightList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.InsightList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.InsightList parseFrom(
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

  public static Builder newBuilder(com.google.cloud.migrationcenter.v1.InsightList prototype) {
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
   * Message containing insights list.
   * </pre>
   *
   * Protobuf type {@code google.cloud.migrationcenter.v1.InsightList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.migrationcenter.v1.InsightList)
      com.google.cloud.migrationcenter.v1.InsightListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_InsightList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_InsightList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.migrationcenter.v1.InsightList.class,
              com.google.cloud.migrationcenter.v1.InsightList.Builder.class);
    }

    // Construct using com.google.cloud.migrationcenter.v1.InsightList.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (insightsBuilder_ == null) {
        insights_ = java.util.Collections.emptyList();
      } else {
        insights_ = null;
        insightsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_InsightList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.InsightList getDefaultInstanceForType() {
      return com.google.cloud.migrationcenter.v1.InsightList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.InsightList build() {
      com.google.cloud.migrationcenter.v1.InsightList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.InsightList buildPartial() {
      com.google.cloud.migrationcenter.v1.InsightList result =
          new com.google.cloud.migrationcenter.v1.InsightList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.migrationcenter.v1.InsightList result) {
      if (insightsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          insights_ = java.util.Collections.unmodifiableList(insights_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.insights_ = insights_;
      } else {
        result.insights_ = insightsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.migrationcenter.v1.InsightList result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateTime_ = updateTimeBuilder_ == null ? updateTime_ : updateTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.migrationcenter.v1.InsightList) {
        return mergeFrom((com.google.cloud.migrationcenter.v1.InsightList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.migrationcenter.v1.InsightList other) {
      if (other == com.google.cloud.migrationcenter.v1.InsightList.getDefaultInstance())
        return this;
      if (insightsBuilder_ == null) {
        if (!other.insights_.isEmpty()) {
          if (insights_.isEmpty()) {
            insights_ = other.insights_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInsightsIsMutable();
            insights_.addAll(other.insights_);
          }
          onChanged();
        }
      } else {
        if (!other.insights_.isEmpty()) {
          if (insightsBuilder_.isEmpty()) {
            insightsBuilder_.dispose();
            insightsBuilder_ = null;
            insights_ = other.insights_;
            bitField0_ = (bitField0_ & ~0x00000001);
            insightsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getInsightsFieldBuilder()
                    : null;
          } else {
            insightsBuilder_.addAllMessages(other.insights_);
          }
        }
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
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
                com.google.cloud.migrationcenter.v1.Insight m =
                    input.readMessage(
                        com.google.cloud.migrationcenter.v1.Insight.parser(), extensionRegistry);
                if (insightsBuilder_ == null) {
                  ensureInsightsIsMutable();
                  insights_.add(m);
                } else {
                  insightsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateTimeFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.util.List<com.google.cloud.migrationcenter.v1.Insight> insights_ =
        java.util.Collections.emptyList();

    private void ensureInsightsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        insights_ = new java.util.ArrayList<com.google.cloud.migrationcenter.v1.Insight>(insights_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.migrationcenter.v1.Insight,
            com.google.cloud.migrationcenter.v1.Insight.Builder,
            com.google.cloud.migrationcenter.v1.InsightOrBuilder>
        insightsBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.migrationcenter.v1.Insight> getInsightsList() {
      if (insightsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(insights_);
      } else {
        return insightsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public int getInsightsCount() {
      if (insightsBuilder_ == null) {
        return insights_.size();
      } else {
        return insightsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.migrationcenter.v1.Insight getInsights(int index) {
      if (insightsBuilder_ == null) {
        return insights_.get(index);
      } else {
        return insightsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setInsights(int index, com.google.cloud.migrationcenter.v1.Insight value) {
      if (insightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInsightsIsMutable();
        insights_.set(index, value);
        onChanged();
      } else {
        insightsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setInsights(
        int index, com.google.cloud.migrationcenter.v1.Insight.Builder builderForValue) {
      if (insightsBuilder_ == null) {
        ensureInsightsIsMutable();
        insights_.set(index, builderForValue.build());
        onChanged();
      } else {
        insightsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addInsights(com.google.cloud.migrationcenter.v1.Insight value) {
      if (insightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInsightsIsMutable();
        insights_.add(value);
        onChanged();
      } else {
        insightsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addInsights(int index, com.google.cloud.migrationcenter.v1.Insight value) {
      if (insightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInsightsIsMutable();
        insights_.add(index, value);
        onChanged();
      } else {
        insightsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addInsights(
        com.google.cloud.migrationcenter.v1.Insight.Builder builderForValue) {
      if (insightsBuilder_ == null) {
        ensureInsightsIsMutable();
        insights_.add(builderForValue.build());
        onChanged();
      } else {
        insightsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addInsights(
        int index, com.google.cloud.migrationcenter.v1.Insight.Builder builderForValue) {
      if (insightsBuilder_ == null) {
        ensureInsightsIsMutable();
        insights_.add(index, builderForValue.build());
        onChanged();
      } else {
        insightsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addAllInsights(
        java.lang.Iterable<? extends com.google.cloud.migrationcenter.v1.Insight> values) {
      if (insightsBuilder_ == null) {
        ensureInsightsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, insights_);
        onChanged();
      } else {
        insightsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearInsights() {
      if (insightsBuilder_ == null) {
        insights_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        insightsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder removeInsights(int index) {
      if (insightsBuilder_ == null) {
        ensureInsightsIsMutable();
        insights_.remove(index);
        onChanged();
      } else {
        insightsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.migrationcenter.v1.Insight.Builder getInsightsBuilder(int index) {
      return getInsightsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.migrationcenter.v1.InsightOrBuilder getInsightsOrBuilder(int index) {
      if (insightsBuilder_ == null) {
        return insights_.get(index);
      } else {
        return insightsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.migrationcenter.v1.InsightOrBuilder>
        getInsightsOrBuilderList() {
      if (insightsBuilder_ != null) {
        return insightsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(insights_);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.migrationcenter.v1.Insight.Builder addInsightsBuilder() {
      return getInsightsFieldBuilder()
          .addBuilder(com.google.cloud.migrationcenter.v1.Insight.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.migrationcenter.v1.Insight.Builder addInsightsBuilder(int index) {
      return getInsightsFieldBuilder()
          .addBuilder(index, com.google.cloud.migrationcenter.v1.Insight.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. Insights of the list.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.migrationcenter.v1.Insight insights = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.migrationcenter.v1.Insight.Builder>
        getInsightsBuilderList() {
      return getInsightsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.migrationcenter.v1.Insight,
            com.google.cloud.migrationcenter.v1.Insight.Builder,
            com.google.cloud.migrationcenter.v1.InsightOrBuilder>
        getInsightsFieldBuilder() {
      if (insightsBuilder_ == null) {
        insightsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.migrationcenter.v1.Insight,
                com.google.cloud.migrationcenter.v1.Insight.Builder,
                com.google.cloud.migrationcenter.v1.InsightOrBuilder>(
                insights_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        insights_ = null;
      }
      return insightsBuilder_;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. Update timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. Update timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Update timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
      } else {
        updateTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Update timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Update timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateTime_ != null
            && updateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getUpdateTimeBuilder().mergeFrom(value);
        } else {
          updateTime_ = value;
        }
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Update timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearUpdateTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Update timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. Update timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Update timestamp.
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.migrationcenter.v1.InsightList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.migrationcenter.v1.InsightList)
  private static final com.google.cloud.migrationcenter.v1.InsightList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.migrationcenter.v1.InsightList();
  }

  public static com.google.cloud.migrationcenter.v1.InsightList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InsightList> PARSER =
      new com.google.protobuf.AbstractParser<InsightList>() {
        @java.lang.Override
        public InsightList parsePartialFrom(
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

  public static com.google.protobuf.Parser<InsightList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InsightList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.InsightList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
