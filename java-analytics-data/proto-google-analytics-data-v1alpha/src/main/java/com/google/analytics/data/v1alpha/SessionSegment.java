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
 * Session segments are subsets of the sessions that occurred on your site or
 * app: for example, all the sessions that originated from a particular
 * advertising campaign.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.SessionSegment}
 */
public final class SessionSegment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.SessionSegment)
    SessionSegmentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SessionSegment.newBuilder() to construct.
  private SessionSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SessionSegment() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SessionSegment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_SessionSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_SessionSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.SessionSegment.class,
            com.google.analytics.data.v1alpha.SessionSegment.Builder.class);
  }

  public static final int SESSION_INCLUSION_CRITERIA_FIELD_NUMBER = 1;
  private com.google.analytics.data.v1alpha.SessionSegmentCriteria sessionInclusionCriteria_;
  /**
   *
   *
   * <pre>
   * Defines which sessions are included in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_inclusion_criteria = 1;
   * </code>
   *
   * @return Whether the sessionInclusionCriteria field is set.
   */
  @java.lang.Override
  public boolean hasSessionInclusionCriteria() {
    return sessionInclusionCriteria_ != null;
  }
  /**
   *
   *
   * <pre>
   * Defines which sessions are included in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_inclusion_criteria = 1;
   * </code>
   *
   * @return The sessionInclusionCriteria.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.SessionSegmentCriteria getSessionInclusionCriteria() {
    return sessionInclusionCriteria_ == null
        ? com.google.analytics.data.v1alpha.SessionSegmentCriteria.getDefaultInstance()
        : sessionInclusionCriteria_;
  }
  /**
   *
   *
   * <pre>
   * Defines which sessions are included in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_inclusion_criteria = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.SessionSegmentCriteriaOrBuilder
      getSessionInclusionCriteriaOrBuilder() {
    return sessionInclusionCriteria_ == null
        ? com.google.analytics.data.v1alpha.SessionSegmentCriteria.getDefaultInstance()
        : sessionInclusionCriteria_;
  }

  public static final int EXCLUSION_FIELD_NUMBER = 2;
  private com.google.analytics.data.v1alpha.SessionSegmentExclusion exclusion_;
  /**
   *
   *
   * <pre>
   * Defines which sessions are excluded in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionSegmentExclusion exclusion = 2;</code>
   *
   * @return Whether the exclusion field is set.
   */
  @java.lang.Override
  public boolean hasExclusion() {
    return exclusion_ != null;
  }
  /**
   *
   *
   * <pre>
   * Defines which sessions are excluded in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionSegmentExclusion exclusion = 2;</code>
   *
   * @return The exclusion.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.SessionSegmentExclusion getExclusion() {
    return exclusion_ == null
        ? com.google.analytics.data.v1alpha.SessionSegmentExclusion.getDefaultInstance()
        : exclusion_;
  }
  /**
   *
   *
   * <pre>
   * Defines which sessions are excluded in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SessionSegmentExclusion exclusion = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.SessionSegmentExclusionOrBuilder
      getExclusionOrBuilder() {
    return exclusion_ == null
        ? com.google.analytics.data.v1alpha.SessionSegmentExclusion.getDefaultInstance()
        : exclusion_;
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
    if (sessionInclusionCriteria_ != null) {
      output.writeMessage(1, getSessionInclusionCriteria());
    }
    if (exclusion_ != null) {
      output.writeMessage(2, getExclusion());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sessionInclusionCriteria_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, getSessionInclusionCriteria());
    }
    if (exclusion_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getExclusion());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.SessionSegment)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.SessionSegment other =
        (com.google.analytics.data.v1alpha.SessionSegment) obj;

    if (hasSessionInclusionCriteria() != other.hasSessionInclusionCriteria()) return false;
    if (hasSessionInclusionCriteria()) {
      if (!getSessionInclusionCriteria().equals(other.getSessionInclusionCriteria())) return false;
    }
    if (hasExclusion() != other.hasExclusion()) return false;
    if (hasExclusion()) {
      if (!getExclusion().equals(other.getExclusion())) return false;
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
    if (hasSessionInclusionCriteria()) {
      hash = (37 * hash) + SESSION_INCLUSION_CRITERIA_FIELD_NUMBER;
      hash = (53 * hash) + getSessionInclusionCriteria().hashCode();
    }
    if (hasExclusion()) {
      hash = (37 * hash) + EXCLUSION_FIELD_NUMBER;
      hash = (53 * hash) + getExclusion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.SessionSegment parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.SessionSegment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SessionSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.SessionSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SessionSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.SessionSegment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SessionSegment parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.SessionSegment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SessionSegment parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.SessionSegment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SessionSegment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.SessionSegment parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.SessionSegment prototype) {
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
   * Session segments are subsets of the sessions that occurred on your site or
   * app: for example, all the sessions that originated from a particular
   * advertising campaign.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.SessionSegment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.SessionSegment)
      com.google.analytics.data.v1alpha.SessionSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_SessionSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_SessionSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.SessionSegment.class,
              com.google.analytics.data.v1alpha.SessionSegment.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.SessionSegment.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sessionInclusionCriteria_ = null;
      if (sessionInclusionCriteriaBuilder_ != null) {
        sessionInclusionCriteriaBuilder_.dispose();
        sessionInclusionCriteriaBuilder_ = null;
      }
      exclusion_ = null;
      if (exclusionBuilder_ != null) {
        exclusionBuilder_.dispose();
        exclusionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_SessionSegment_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.SessionSegment getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.SessionSegment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.SessionSegment build() {
      com.google.analytics.data.v1alpha.SessionSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.SessionSegment buildPartial() {
      com.google.analytics.data.v1alpha.SessionSegment result =
          new com.google.analytics.data.v1alpha.SessionSegment(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.SessionSegment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sessionInclusionCriteria_ =
            sessionInclusionCriteriaBuilder_ == null
                ? sessionInclusionCriteria_
                : sessionInclusionCriteriaBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.exclusion_ = exclusionBuilder_ == null ? exclusion_ : exclusionBuilder_.build();
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
      if (other instanceof com.google.analytics.data.v1alpha.SessionSegment) {
        return mergeFrom((com.google.analytics.data.v1alpha.SessionSegment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.SessionSegment other) {
      if (other == com.google.analytics.data.v1alpha.SessionSegment.getDefaultInstance())
        return this;
      if (other.hasSessionInclusionCriteria()) {
        mergeSessionInclusionCriteria(other.getSessionInclusionCriteria());
      }
      if (other.hasExclusion()) {
        mergeExclusion(other.getExclusion());
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
                input.readMessage(
                    getSessionInclusionCriteriaFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getExclusionFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.analytics.data.v1alpha.SessionSegmentCriteria sessionInclusionCriteria_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.SessionSegmentCriteria,
            com.google.analytics.data.v1alpha.SessionSegmentCriteria.Builder,
            com.google.analytics.data.v1alpha.SessionSegmentCriteriaOrBuilder>
        sessionInclusionCriteriaBuilder_;
    /**
     *
     *
     * <pre>
     * Defines which sessions are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_inclusion_criteria = 1;
     * </code>
     *
     * @return Whether the sessionInclusionCriteria field is set.
     */
    public boolean hasSessionInclusionCriteria() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_inclusion_criteria = 1;
     * </code>
     *
     * @return The sessionInclusionCriteria.
     */
    public com.google.analytics.data.v1alpha.SessionSegmentCriteria getSessionInclusionCriteria() {
      if (sessionInclusionCriteriaBuilder_ == null) {
        return sessionInclusionCriteria_ == null
            ? com.google.analytics.data.v1alpha.SessionSegmentCriteria.getDefaultInstance()
            : sessionInclusionCriteria_;
      } else {
        return sessionInclusionCriteriaBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_inclusion_criteria = 1;
     * </code>
     */
    public Builder setSessionInclusionCriteria(
        com.google.analytics.data.v1alpha.SessionSegmentCriteria value) {
      if (sessionInclusionCriteriaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sessionInclusionCriteria_ = value;
      } else {
        sessionInclusionCriteriaBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_inclusion_criteria = 1;
     * </code>
     */
    public Builder setSessionInclusionCriteria(
        com.google.analytics.data.v1alpha.SessionSegmentCriteria.Builder builderForValue) {
      if (sessionInclusionCriteriaBuilder_ == null) {
        sessionInclusionCriteria_ = builderForValue.build();
      } else {
        sessionInclusionCriteriaBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_inclusion_criteria = 1;
     * </code>
     */
    public Builder mergeSessionInclusionCriteria(
        com.google.analytics.data.v1alpha.SessionSegmentCriteria value) {
      if (sessionInclusionCriteriaBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && sessionInclusionCriteria_ != null
            && sessionInclusionCriteria_
                != com.google.analytics.data.v1alpha.SessionSegmentCriteria.getDefaultInstance()) {
          getSessionInclusionCriteriaBuilder().mergeFrom(value);
        } else {
          sessionInclusionCriteria_ = value;
        }
      } else {
        sessionInclusionCriteriaBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_inclusion_criteria = 1;
     * </code>
     */
    public Builder clearSessionInclusionCriteria() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sessionInclusionCriteria_ = null;
      if (sessionInclusionCriteriaBuilder_ != null) {
        sessionInclusionCriteriaBuilder_.dispose();
        sessionInclusionCriteriaBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_inclusion_criteria = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.SessionSegmentCriteria.Builder
        getSessionInclusionCriteriaBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSessionInclusionCriteriaFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_inclusion_criteria = 1;
     * </code>
     */
    public com.google.analytics.data.v1alpha.SessionSegmentCriteriaOrBuilder
        getSessionInclusionCriteriaOrBuilder() {
      if (sessionInclusionCriteriaBuilder_ != null) {
        return sessionInclusionCriteriaBuilder_.getMessageOrBuilder();
      } else {
        return sessionInclusionCriteria_ == null
            ? com.google.analytics.data.v1alpha.SessionSegmentCriteria.getDefaultInstance()
            : sessionInclusionCriteria_;
      }
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentCriteria session_inclusion_criteria = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.SessionSegmentCriteria,
            com.google.analytics.data.v1alpha.SessionSegmentCriteria.Builder,
            com.google.analytics.data.v1alpha.SessionSegmentCriteriaOrBuilder>
        getSessionInclusionCriteriaFieldBuilder() {
      if (sessionInclusionCriteriaBuilder_ == null) {
        sessionInclusionCriteriaBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.SessionSegmentCriteria,
                com.google.analytics.data.v1alpha.SessionSegmentCriteria.Builder,
                com.google.analytics.data.v1alpha.SessionSegmentCriteriaOrBuilder>(
                getSessionInclusionCriteria(), getParentForChildren(), isClean());
        sessionInclusionCriteria_ = null;
      }
      return sessionInclusionCriteriaBuilder_;
    }

    private com.google.analytics.data.v1alpha.SessionSegmentExclusion exclusion_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.SessionSegmentExclusion,
            com.google.analytics.data.v1alpha.SessionSegmentExclusion.Builder,
            com.google.analytics.data.v1alpha.SessionSegmentExclusionOrBuilder>
        exclusionBuilder_;
    /**
     *
     *
     * <pre>
     * Defines which sessions are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentExclusion exclusion = 2;</code>
     *
     * @return Whether the exclusion field is set.
     */
    public boolean hasExclusion() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentExclusion exclusion = 2;</code>
     *
     * @return The exclusion.
     */
    public com.google.analytics.data.v1alpha.SessionSegmentExclusion getExclusion() {
      if (exclusionBuilder_ == null) {
        return exclusion_ == null
            ? com.google.analytics.data.v1alpha.SessionSegmentExclusion.getDefaultInstance()
            : exclusion_;
      } else {
        return exclusionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentExclusion exclusion = 2;</code>
     */
    public Builder setExclusion(com.google.analytics.data.v1alpha.SessionSegmentExclusion value) {
      if (exclusionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        exclusion_ = value;
      } else {
        exclusionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentExclusion exclusion = 2;</code>
     */
    public Builder setExclusion(
        com.google.analytics.data.v1alpha.SessionSegmentExclusion.Builder builderForValue) {
      if (exclusionBuilder_ == null) {
        exclusion_ = builderForValue.build();
      } else {
        exclusionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentExclusion exclusion = 2;</code>
     */
    public Builder mergeExclusion(com.google.analytics.data.v1alpha.SessionSegmentExclusion value) {
      if (exclusionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && exclusion_ != null
            && exclusion_
                != com.google.analytics.data.v1alpha.SessionSegmentExclusion.getDefaultInstance()) {
          getExclusionBuilder().mergeFrom(value);
        } else {
          exclusion_ = value;
        }
      } else {
        exclusionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentExclusion exclusion = 2;</code>
     */
    public Builder clearExclusion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      exclusion_ = null;
      if (exclusionBuilder_ != null) {
        exclusionBuilder_.dispose();
        exclusionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentExclusion exclusion = 2;</code>
     */
    public com.google.analytics.data.v1alpha.SessionSegmentExclusion.Builder getExclusionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExclusionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentExclusion exclusion = 2;</code>
     */
    public com.google.analytics.data.v1alpha.SessionSegmentExclusionOrBuilder
        getExclusionOrBuilder() {
      if (exclusionBuilder_ != null) {
        return exclusionBuilder_.getMessageOrBuilder();
      } else {
        return exclusion_ == null
            ? com.google.analytics.data.v1alpha.SessionSegmentExclusion.getDefaultInstance()
            : exclusion_;
      }
    }
    /**
     *
     *
     * <pre>
     * Defines which sessions are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SessionSegmentExclusion exclusion = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.SessionSegmentExclusion,
            com.google.analytics.data.v1alpha.SessionSegmentExclusion.Builder,
            com.google.analytics.data.v1alpha.SessionSegmentExclusionOrBuilder>
        getExclusionFieldBuilder() {
      if (exclusionBuilder_ == null) {
        exclusionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.SessionSegmentExclusion,
                com.google.analytics.data.v1alpha.SessionSegmentExclusion.Builder,
                com.google.analytics.data.v1alpha.SessionSegmentExclusionOrBuilder>(
                getExclusion(), getParentForChildren(), isClean());
        exclusion_ = null;
      }
      return exclusionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.SessionSegment)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.SessionSegment)
  private static final com.google.analytics.data.v1alpha.SessionSegment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.SessionSegment();
  }

  public static com.google.analytics.data.v1alpha.SessionSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SessionSegment> PARSER =
      new com.google.protobuf.AbstractParser<SessionSegment>() {
        @java.lang.Override
        public SessionSegment parsePartialFrom(
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

  public static com.google.protobuf.Parser<SessionSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SessionSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.SessionSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
