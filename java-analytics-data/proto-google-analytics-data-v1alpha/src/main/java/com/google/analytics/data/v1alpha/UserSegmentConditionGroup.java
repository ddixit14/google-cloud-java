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
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * Conditions tell Analytics what data to include in or exclude from the
 * segment.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.UserSegmentConditionGroup}
 */
public final class UserSegmentConditionGroup extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.UserSegmentConditionGroup)
    UserSegmentConditionGroupOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UserSegmentConditionGroup.newBuilder() to construct.
  private UserSegmentConditionGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UserSegmentConditionGroup() {
    conditionScoping_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UserSegmentConditionGroup();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_UserSegmentConditionGroup_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_UserSegmentConditionGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.UserSegmentConditionGroup.class,
            com.google.analytics.data.v1alpha.UserSegmentConditionGroup.Builder.class);
  }

  public static final int CONDITION_SCOPING_FIELD_NUMBER = 1;
  private int conditionScoping_ = 0;
  /**
   *
   *
   * <pre>
   * Data is included or excluded from the segment based on if it matches
   * the condition group. This scoping defines how many events the
   * `segmentFilterExpression` is evaluated on before the condition group
   * is determined to be matched or not. For example if `conditionScoping =
   * USER_CRITERIA_WITHIN_SAME_SESSION`, the expression is evaluated on all
   * events in a session, and then, the condition group is determined to be
   * matched or not for this user. For example if `conditionScoping =
   * USER_CRITERIA_WITHIN_SAME_EVENT`, the expression is evaluated on a single
   * event, and then, the condition group is determined to be matched or not for
   * this user.
   *
   * Optional. If unspecified, `conditionScoping = ACROSS_ALL_SESSIONS` is
   * used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserCriteriaScoping condition_scoping = 1;</code>
   *
   * @return The enum numeric value on the wire for conditionScoping.
   */
  @java.lang.Override
  public int getConditionScopingValue() {
    return conditionScoping_;
  }
  /**
   *
   *
   * <pre>
   * Data is included or excluded from the segment based on if it matches
   * the condition group. This scoping defines how many events the
   * `segmentFilterExpression` is evaluated on before the condition group
   * is determined to be matched or not. For example if `conditionScoping =
   * USER_CRITERIA_WITHIN_SAME_SESSION`, the expression is evaluated on all
   * events in a session, and then, the condition group is determined to be
   * matched or not for this user. For example if `conditionScoping =
   * USER_CRITERIA_WITHIN_SAME_EVENT`, the expression is evaluated on a single
   * event, and then, the condition group is determined to be matched or not for
   * this user.
   *
   * Optional. If unspecified, `conditionScoping = ACROSS_ALL_SESSIONS` is
   * used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserCriteriaScoping condition_scoping = 1;</code>
   *
   * @return The conditionScoping.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.UserCriteriaScoping getConditionScoping() {
    com.google.analytics.data.v1alpha.UserCriteriaScoping result =
        com.google.analytics.data.v1alpha.UserCriteriaScoping.forNumber(conditionScoping_);
    return result == null
        ? com.google.analytics.data.v1alpha.UserCriteriaScoping.UNRECOGNIZED
        : result;
  }

  public static final int SEGMENT_FILTER_EXPRESSION_FIELD_NUMBER = 2;
  private com.google.analytics.data.v1alpha.SegmentFilterExpression segmentFilterExpression_;
  /**
   *
   *
   * <pre>
   * Data is included or excluded from the segment based on if it matches
   * this expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
   * </code>
   *
   * @return Whether the segmentFilterExpression field is set.
   */
  @java.lang.Override
  public boolean hasSegmentFilterExpression() {
    return segmentFilterExpression_ != null;
  }
  /**
   *
   *
   * <pre>
   * Data is included or excluded from the segment based on if it matches
   * this expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
   * </code>
   *
   * @return The segmentFilterExpression.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.SegmentFilterExpression getSegmentFilterExpression() {
    return segmentFilterExpression_ == null
        ? com.google.analytics.data.v1alpha.SegmentFilterExpression.getDefaultInstance()
        : segmentFilterExpression_;
  }
  /**
   *
   *
   * <pre>
   * Data is included or excluded from the segment based on if it matches
   * this expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.SegmentFilterExpressionOrBuilder
      getSegmentFilterExpressionOrBuilder() {
    return segmentFilterExpression_ == null
        ? com.google.analytics.data.v1alpha.SegmentFilterExpression.getDefaultInstance()
        : segmentFilterExpression_;
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
    if (conditionScoping_
        != com.google.analytics.data.v1alpha.UserCriteriaScoping.USER_CRITERIA_SCOPING_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, conditionScoping_);
    }
    if (segmentFilterExpression_ != null) {
      output.writeMessage(2, getSegmentFilterExpression());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (conditionScoping_
        != com.google.analytics.data.v1alpha.UserCriteriaScoping.USER_CRITERIA_SCOPING_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, conditionScoping_);
    }
    if (segmentFilterExpression_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSegmentFilterExpression());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.UserSegmentConditionGroup)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.UserSegmentConditionGroup other =
        (com.google.analytics.data.v1alpha.UserSegmentConditionGroup) obj;

    if (conditionScoping_ != other.conditionScoping_) return false;
    if (hasSegmentFilterExpression() != other.hasSegmentFilterExpression()) return false;
    if (hasSegmentFilterExpression()) {
      if (!getSegmentFilterExpression().equals(other.getSegmentFilterExpression())) return false;
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
    hash = (37 * hash) + CONDITION_SCOPING_FIELD_NUMBER;
    hash = (53 * hash) + conditionScoping_;
    if (hasSegmentFilterExpression()) {
      hash = (37 * hash) + SEGMENT_FILTER_EXPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getSegmentFilterExpression().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.UserSegmentConditionGroup parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentConditionGroup parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentConditionGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentConditionGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentConditionGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentConditionGroup parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentConditionGroup parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentConditionGroup parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentConditionGroup parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentConditionGroup parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentConditionGroup parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.UserSegmentConditionGroup parseFrom(
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
      com.google.analytics.data.v1alpha.UserSegmentConditionGroup prototype) {
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
   * Conditions tell Analytics what data to include in or exclude from the
   * segment.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.UserSegmentConditionGroup}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.UserSegmentConditionGroup)
      com.google.analytics.data.v1alpha.UserSegmentConditionGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_UserSegmentConditionGroup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_UserSegmentConditionGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.UserSegmentConditionGroup.class,
              com.google.analytics.data.v1alpha.UserSegmentConditionGroup.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.UserSegmentConditionGroup.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      conditionScoping_ = 0;
      segmentFilterExpression_ = null;
      if (segmentFilterExpressionBuilder_ != null) {
        segmentFilterExpressionBuilder_.dispose();
        segmentFilterExpressionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_UserSegmentConditionGroup_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.UserSegmentConditionGroup getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.UserSegmentConditionGroup.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.UserSegmentConditionGroup build() {
      com.google.analytics.data.v1alpha.UserSegmentConditionGroup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.UserSegmentConditionGroup buildPartial() {
      com.google.analytics.data.v1alpha.UserSegmentConditionGroup result =
          new com.google.analytics.data.v1alpha.UserSegmentConditionGroup(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.UserSegmentConditionGroup result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.conditionScoping_ = conditionScoping_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.segmentFilterExpression_ =
            segmentFilterExpressionBuilder_ == null
                ? segmentFilterExpression_
                : segmentFilterExpressionBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.UserSegmentConditionGroup) {
        return mergeFrom((com.google.analytics.data.v1alpha.UserSegmentConditionGroup) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.UserSegmentConditionGroup other) {
      if (other == com.google.analytics.data.v1alpha.UserSegmentConditionGroup.getDefaultInstance())
        return this;
      if (other.conditionScoping_ != 0) {
        setConditionScopingValue(other.getConditionScopingValue());
      }
      if (other.hasSegmentFilterExpression()) {
        mergeSegmentFilterExpression(other.getSegmentFilterExpression());
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
            case 8:
              {
                conditionScoping_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(
                    getSegmentFilterExpressionFieldBuilder().getBuilder(), extensionRegistry);
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

    private int conditionScoping_ = 0;
    /**
     *
     *
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * the condition group. This scoping defines how many events the
     * `segmentFilterExpression` is evaluated on before the condition group
     * is determined to be matched or not. For example if `conditionScoping =
     * USER_CRITERIA_WITHIN_SAME_SESSION`, the expression is evaluated on all
     * events in a session, and then, the condition group is determined to be
     * matched or not for this user. For example if `conditionScoping =
     * USER_CRITERIA_WITHIN_SAME_EVENT`, the expression is evaluated on a single
     * event, and then, the condition group is determined to be matched or not for
     * this user.
     *
     * Optional. If unspecified, `conditionScoping = ACROSS_ALL_SESSIONS` is
     * used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserCriteriaScoping condition_scoping = 1;</code>
     *
     * @return The enum numeric value on the wire for conditionScoping.
     */
    @java.lang.Override
    public int getConditionScopingValue() {
      return conditionScoping_;
    }
    /**
     *
     *
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * the condition group. This scoping defines how many events the
     * `segmentFilterExpression` is evaluated on before the condition group
     * is determined to be matched or not. For example if `conditionScoping =
     * USER_CRITERIA_WITHIN_SAME_SESSION`, the expression is evaluated on all
     * events in a session, and then, the condition group is determined to be
     * matched or not for this user. For example if `conditionScoping =
     * USER_CRITERIA_WITHIN_SAME_EVENT`, the expression is evaluated on a single
     * event, and then, the condition group is determined to be matched or not for
     * this user.
     *
     * Optional. If unspecified, `conditionScoping = ACROSS_ALL_SESSIONS` is
     * used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserCriteriaScoping condition_scoping = 1;</code>
     *
     * @param value The enum numeric value on the wire for conditionScoping to set.
     * @return This builder for chaining.
     */
    public Builder setConditionScopingValue(int value) {
      conditionScoping_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * the condition group. This scoping defines how many events the
     * `segmentFilterExpression` is evaluated on before the condition group
     * is determined to be matched or not. For example if `conditionScoping =
     * USER_CRITERIA_WITHIN_SAME_SESSION`, the expression is evaluated on all
     * events in a session, and then, the condition group is determined to be
     * matched or not for this user. For example if `conditionScoping =
     * USER_CRITERIA_WITHIN_SAME_EVENT`, the expression is evaluated on a single
     * event, and then, the condition group is determined to be matched or not for
     * this user.
     *
     * Optional. If unspecified, `conditionScoping = ACROSS_ALL_SESSIONS` is
     * used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserCriteriaScoping condition_scoping = 1;</code>
     *
     * @return The conditionScoping.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.UserCriteriaScoping getConditionScoping() {
      com.google.analytics.data.v1alpha.UserCriteriaScoping result =
          com.google.analytics.data.v1alpha.UserCriteriaScoping.forNumber(conditionScoping_);
      return result == null
          ? com.google.analytics.data.v1alpha.UserCriteriaScoping.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * the condition group. This scoping defines how many events the
     * `segmentFilterExpression` is evaluated on before the condition group
     * is determined to be matched or not. For example if `conditionScoping =
     * USER_CRITERIA_WITHIN_SAME_SESSION`, the expression is evaluated on all
     * events in a session, and then, the condition group is determined to be
     * matched or not for this user. For example if `conditionScoping =
     * USER_CRITERIA_WITHIN_SAME_EVENT`, the expression is evaluated on a single
     * event, and then, the condition group is determined to be matched or not for
     * this user.
     *
     * Optional. If unspecified, `conditionScoping = ACROSS_ALL_SESSIONS` is
     * used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserCriteriaScoping condition_scoping = 1;</code>
     *
     * @param value The conditionScoping to set.
     * @return This builder for chaining.
     */
    public Builder setConditionScoping(
        com.google.analytics.data.v1alpha.UserCriteriaScoping value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      conditionScoping_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * the condition group. This scoping defines how many events the
     * `segmentFilterExpression` is evaluated on before the condition group
     * is determined to be matched or not. For example if `conditionScoping =
     * USER_CRITERIA_WITHIN_SAME_SESSION`, the expression is evaluated on all
     * events in a session, and then, the condition group is determined to be
     * matched or not for this user. For example if `conditionScoping =
     * USER_CRITERIA_WITHIN_SAME_EVENT`, the expression is evaluated on a single
     * event, and then, the condition group is determined to be matched or not for
     * this user.
     *
     * Optional. If unspecified, `conditionScoping = ACROSS_ALL_SESSIONS` is
     * used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserCriteriaScoping condition_scoping = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConditionScoping() {
      bitField0_ = (bitField0_ & ~0x00000001);
      conditionScoping_ = 0;
      onChanged();
      return this;
    }

    private com.google.analytics.data.v1alpha.SegmentFilterExpression segmentFilterExpression_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.SegmentFilterExpression,
            com.google.analytics.data.v1alpha.SegmentFilterExpression.Builder,
            com.google.analytics.data.v1alpha.SegmentFilterExpressionOrBuilder>
        segmentFilterExpressionBuilder_;
    /**
     *
     *
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
     * </code>
     *
     * @return Whether the segmentFilterExpression field is set.
     */
    public boolean hasSegmentFilterExpression() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
     * </code>
     *
     * @return The segmentFilterExpression.
     */
    public com.google.analytics.data.v1alpha.SegmentFilterExpression getSegmentFilterExpression() {
      if (segmentFilterExpressionBuilder_ == null) {
        return segmentFilterExpression_ == null
            ? com.google.analytics.data.v1alpha.SegmentFilterExpression.getDefaultInstance()
            : segmentFilterExpression_;
      } else {
        return segmentFilterExpressionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
     * </code>
     */
    public Builder setSegmentFilterExpression(
        com.google.analytics.data.v1alpha.SegmentFilterExpression value) {
      if (segmentFilterExpressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        segmentFilterExpression_ = value;
      } else {
        segmentFilterExpressionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
     * </code>
     */
    public Builder setSegmentFilterExpression(
        com.google.analytics.data.v1alpha.SegmentFilterExpression.Builder builderForValue) {
      if (segmentFilterExpressionBuilder_ == null) {
        segmentFilterExpression_ = builderForValue.build();
      } else {
        segmentFilterExpressionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
     * </code>
     */
    public Builder mergeSegmentFilterExpression(
        com.google.analytics.data.v1alpha.SegmentFilterExpression value) {
      if (segmentFilterExpressionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && segmentFilterExpression_ != null
            && segmentFilterExpression_
                != com.google.analytics.data.v1alpha.SegmentFilterExpression.getDefaultInstance()) {
          getSegmentFilterExpressionBuilder().mergeFrom(value);
        } else {
          segmentFilterExpression_ = value;
        }
      } else {
        segmentFilterExpressionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
     * </code>
     */
    public Builder clearSegmentFilterExpression() {
      bitField0_ = (bitField0_ & ~0x00000002);
      segmentFilterExpression_ = null;
      if (segmentFilterExpressionBuilder_ != null) {
        segmentFilterExpressionBuilder_.dispose();
        segmentFilterExpressionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
     * </code>
     */
    public com.google.analytics.data.v1alpha.SegmentFilterExpression.Builder
        getSegmentFilterExpressionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSegmentFilterExpressionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
     * </code>
     */
    public com.google.analytics.data.v1alpha.SegmentFilterExpressionOrBuilder
        getSegmentFilterExpressionOrBuilder() {
      if (segmentFilterExpressionBuilder_ != null) {
        return segmentFilterExpressionBuilder_.getMessageOrBuilder();
      } else {
        return segmentFilterExpression_ == null
            ? com.google.analytics.data.v1alpha.SegmentFilterExpression.getDefaultInstance()
            : segmentFilterExpression_;
      }
    }
    /**
     *
     *
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.SegmentFilterExpression,
            com.google.analytics.data.v1alpha.SegmentFilterExpression.Builder,
            com.google.analytics.data.v1alpha.SegmentFilterExpressionOrBuilder>
        getSegmentFilterExpressionFieldBuilder() {
      if (segmentFilterExpressionBuilder_ == null) {
        segmentFilterExpressionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.SegmentFilterExpression,
                com.google.analytics.data.v1alpha.SegmentFilterExpression.Builder,
                com.google.analytics.data.v1alpha.SegmentFilterExpressionOrBuilder>(
                getSegmentFilterExpression(), getParentForChildren(), isClean());
        segmentFilterExpression_ = null;
      }
      return segmentFilterExpressionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.UserSegmentConditionGroup)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.UserSegmentConditionGroup)
  private static final com.google.analytics.data.v1alpha.UserSegmentConditionGroup DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.UserSegmentConditionGroup();
  }

  public static com.google.analytics.data.v1alpha.UserSegmentConditionGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserSegmentConditionGroup> PARSER =
      new com.google.protobuf.AbstractParser<UserSegmentConditionGroup>() {
        @java.lang.Override
        public UserSegmentConditionGroup parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserSegmentConditionGroup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserSegmentConditionGroup> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.UserSegmentConditionGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
