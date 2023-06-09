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
// source: google/cloud/aiplatform/v1/data_labeling_job.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Active learning data sampling config. For every active learning labeling
 * iteration, it will select a batch of data based on the sampling strategy.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.SampleConfig}
 */
public final class SampleConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.SampleConfig)
    SampleConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SampleConfig.newBuilder() to construct.
  private SampleConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SampleConfig() {
    sampleStrategy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SampleConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.DataLabelingJobProto
        .internal_static_google_cloud_aiplatform_v1_SampleConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.DataLabelingJobProto
        .internal_static_google_cloud_aiplatform_v1_SampleConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.SampleConfig.class,
            com.google.cloud.aiplatform.v1.SampleConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Sample strategy decides which subset of DataItems should be selected for
   * human labeling in every batch.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.aiplatform.v1.SampleConfig.SampleStrategy}
   */
  public enum SampleStrategy implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default will be treated as UNCERTAINTY.
     * </pre>
     *
     * <code>SAMPLE_STRATEGY_UNSPECIFIED = 0;</code>
     */
    SAMPLE_STRATEGY_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Sample the most uncertain data to label.
     * </pre>
     *
     * <code>UNCERTAINTY = 1;</code>
     */
    UNCERTAINTY(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default will be treated as UNCERTAINTY.
     * </pre>
     *
     * <code>SAMPLE_STRATEGY_UNSPECIFIED = 0;</code>
     */
    public static final int SAMPLE_STRATEGY_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Sample the most uncertain data to label.
     * </pre>
     *
     * <code>UNCERTAINTY = 1;</code>
     */
    public static final int UNCERTAINTY_VALUE = 1;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SampleStrategy valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SampleStrategy forNumber(int value) {
      switch (value) {
        case 0:
          return SAMPLE_STRATEGY_UNSPECIFIED;
        case 1:
          return UNCERTAINTY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SampleStrategy> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<SampleStrategy> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SampleStrategy>() {
          public SampleStrategy findValueByNumber(int number) {
            return SampleStrategy.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.SampleConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final SampleStrategy[] VALUES = values();

    public static SampleStrategy valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SampleStrategy(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1.SampleConfig.SampleStrategy)
  }

  private int initialBatchSampleSizeCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object initialBatchSampleSize_;

  public enum InitialBatchSampleSizeCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INITIAL_BATCH_SAMPLE_PERCENTAGE(1),
    INITIALBATCHSAMPLESIZE_NOT_SET(0);
    private final int value;

    private InitialBatchSampleSizeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static InitialBatchSampleSizeCase valueOf(int value) {
      return forNumber(value);
    }

    public static InitialBatchSampleSizeCase forNumber(int value) {
      switch (value) {
        case 1:
          return INITIAL_BATCH_SAMPLE_PERCENTAGE;
        case 0:
          return INITIALBATCHSAMPLESIZE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public InitialBatchSampleSizeCase getInitialBatchSampleSizeCase() {
    return InitialBatchSampleSizeCase.forNumber(initialBatchSampleSizeCase_);
  }

  private int followingBatchSampleSizeCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object followingBatchSampleSize_;

  public enum FollowingBatchSampleSizeCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    FOLLOWING_BATCH_SAMPLE_PERCENTAGE(3),
    FOLLOWINGBATCHSAMPLESIZE_NOT_SET(0);
    private final int value;

    private FollowingBatchSampleSizeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FollowingBatchSampleSizeCase valueOf(int value) {
      return forNumber(value);
    }

    public static FollowingBatchSampleSizeCase forNumber(int value) {
      switch (value) {
        case 3:
          return FOLLOWING_BATCH_SAMPLE_PERCENTAGE;
        case 0:
          return FOLLOWINGBATCHSAMPLESIZE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public FollowingBatchSampleSizeCase getFollowingBatchSampleSizeCase() {
    return FollowingBatchSampleSizeCase.forNumber(followingBatchSampleSizeCase_);
  }

  public static final int INITIAL_BATCH_SAMPLE_PERCENTAGE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * The percentage of data needed to be labeled in the first batch.
   * </pre>
   *
   * <code>int32 initial_batch_sample_percentage = 1;</code>
   *
   * @return Whether the initialBatchSamplePercentage field is set.
   */
  @java.lang.Override
  public boolean hasInitialBatchSamplePercentage() {
    return initialBatchSampleSizeCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * The percentage of data needed to be labeled in the first batch.
   * </pre>
   *
   * <code>int32 initial_batch_sample_percentage = 1;</code>
   *
   * @return The initialBatchSamplePercentage.
   */
  @java.lang.Override
  public int getInitialBatchSamplePercentage() {
    if (initialBatchSampleSizeCase_ == 1) {
      return (java.lang.Integer) initialBatchSampleSize_;
    }
    return 0;
  }

  public static final int FOLLOWING_BATCH_SAMPLE_PERCENTAGE_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * The percentage of data needed to be labeled in each following batch
   * (except the first batch).
   * </pre>
   *
   * <code>int32 following_batch_sample_percentage = 3;</code>
   *
   * @return Whether the followingBatchSamplePercentage field is set.
   */
  @java.lang.Override
  public boolean hasFollowingBatchSamplePercentage() {
    return followingBatchSampleSizeCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * The percentage of data needed to be labeled in each following batch
   * (except the first batch).
   * </pre>
   *
   * <code>int32 following_batch_sample_percentage = 3;</code>
   *
   * @return The followingBatchSamplePercentage.
   */
  @java.lang.Override
  public int getFollowingBatchSamplePercentage() {
    if (followingBatchSampleSizeCase_ == 3) {
      return (java.lang.Integer) followingBatchSampleSize_;
    }
    return 0;
  }

  public static final int SAMPLE_STRATEGY_FIELD_NUMBER = 5;
  private int sampleStrategy_ = 0;
  /**
   *
   *
   * <pre>
   * Field to choose sampling strategy. Sampling strategy will decide which data
   * should be selected for human labeling in every batch.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy sample_strategy = 5;</code>
   *
   * @return The enum numeric value on the wire for sampleStrategy.
   */
  @java.lang.Override
  public int getSampleStrategyValue() {
    return sampleStrategy_;
  }
  /**
   *
   *
   * <pre>
   * Field to choose sampling strategy. Sampling strategy will decide which data
   * should be selected for human labeling in every batch.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy sample_strategy = 5;</code>
   *
   * @return The sampleStrategy.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy getSampleStrategy() {
    com.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy result =
        com.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy.forNumber(sampleStrategy_);
    return result == null
        ? com.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy.UNRECOGNIZED
        : result;
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
    if (initialBatchSampleSizeCase_ == 1) {
      output.writeInt32(1, (int) ((java.lang.Integer) initialBatchSampleSize_));
    }
    if (followingBatchSampleSizeCase_ == 3) {
      output.writeInt32(3, (int) ((java.lang.Integer) followingBatchSampleSize_));
    }
    if (sampleStrategy_
        != com.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy.SAMPLE_STRATEGY_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(5, sampleStrategy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (initialBatchSampleSizeCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt32Size(
              1, (int) ((java.lang.Integer) initialBatchSampleSize_));
    }
    if (followingBatchSampleSizeCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt32Size(
              3, (int) ((java.lang.Integer) followingBatchSampleSize_));
    }
    if (sampleStrategy_
        != com.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy.SAMPLE_STRATEGY_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(5, sampleStrategy_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.SampleConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.SampleConfig other =
        (com.google.cloud.aiplatform.v1.SampleConfig) obj;

    if (sampleStrategy_ != other.sampleStrategy_) return false;
    if (!getInitialBatchSampleSizeCase().equals(other.getInitialBatchSampleSizeCase()))
      return false;
    switch (initialBatchSampleSizeCase_) {
      case 1:
        if (getInitialBatchSamplePercentage() != other.getInitialBatchSamplePercentage())
          return false;
        break;
      case 0:
      default:
    }
    if (!getFollowingBatchSampleSizeCase().equals(other.getFollowingBatchSampleSizeCase()))
      return false;
    switch (followingBatchSampleSizeCase_) {
      case 3:
        if (getFollowingBatchSamplePercentage() != other.getFollowingBatchSamplePercentage())
          return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + SAMPLE_STRATEGY_FIELD_NUMBER;
    hash = (53 * hash) + sampleStrategy_;
    switch (initialBatchSampleSizeCase_) {
      case 1:
        hash = (37 * hash) + INITIAL_BATCH_SAMPLE_PERCENTAGE_FIELD_NUMBER;
        hash = (53 * hash) + getInitialBatchSamplePercentage();
        break;
      case 0:
      default:
    }
    switch (followingBatchSampleSizeCase_) {
      case 3:
        hash = (37 * hash) + FOLLOWING_BATCH_SAMPLE_PERCENTAGE_FIELD_NUMBER;
        hash = (53 * hash) + getFollowingBatchSamplePercentage();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.SampleConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.SampleConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SampleConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.SampleConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SampleConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.SampleConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SampleConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.SampleConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SampleConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.SampleConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SampleConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.SampleConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.SampleConfig prototype) {
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
   * Active learning data sampling config. For every active learning labeling
   * iteration, it will select a batch of data based on the sampling strategy.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.SampleConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.SampleConfig)
      com.google.cloud.aiplatform.v1.SampleConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.DataLabelingJobProto
          .internal_static_google_cloud_aiplatform_v1_SampleConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.DataLabelingJobProto
          .internal_static_google_cloud_aiplatform_v1_SampleConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.SampleConfig.class,
              com.google.cloud.aiplatform.v1.SampleConfig.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.SampleConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sampleStrategy_ = 0;
      initialBatchSampleSizeCase_ = 0;
      initialBatchSampleSize_ = null;
      followingBatchSampleSizeCase_ = 0;
      followingBatchSampleSize_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.DataLabelingJobProto
          .internal_static_google_cloud_aiplatform_v1_SampleConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SampleConfig getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.SampleConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SampleConfig build() {
      com.google.cloud.aiplatform.v1.SampleConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SampleConfig buildPartial() {
      com.google.cloud.aiplatform.v1.SampleConfig result =
          new com.google.cloud.aiplatform.v1.SampleConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.SampleConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sampleStrategy_ = sampleStrategy_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.aiplatform.v1.SampleConfig result) {
      result.initialBatchSampleSizeCase_ = initialBatchSampleSizeCase_;
      result.initialBatchSampleSize_ = this.initialBatchSampleSize_;
      result.followingBatchSampleSizeCase_ = followingBatchSampleSizeCase_;
      result.followingBatchSampleSize_ = this.followingBatchSampleSize_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.SampleConfig) {
        return mergeFrom((com.google.cloud.aiplatform.v1.SampleConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.SampleConfig other) {
      if (other == com.google.cloud.aiplatform.v1.SampleConfig.getDefaultInstance()) return this;
      if (other.sampleStrategy_ != 0) {
        setSampleStrategyValue(other.getSampleStrategyValue());
      }
      switch (other.getInitialBatchSampleSizeCase()) {
        case INITIAL_BATCH_SAMPLE_PERCENTAGE:
          {
            setInitialBatchSamplePercentage(other.getInitialBatchSamplePercentage());
            break;
          }
        case INITIALBATCHSAMPLESIZE_NOT_SET:
          {
            break;
          }
      }
      switch (other.getFollowingBatchSampleSizeCase()) {
        case FOLLOWING_BATCH_SAMPLE_PERCENTAGE:
          {
            setFollowingBatchSamplePercentage(other.getFollowingBatchSamplePercentage());
            break;
          }
        case FOLLOWINGBATCHSAMPLESIZE_NOT_SET:
          {
            break;
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
            case 8:
              {
                initialBatchSampleSize_ = input.readInt32();
                initialBatchSampleSizeCase_ = 1;
                break;
              } // case 8
            case 24:
              {
                followingBatchSampleSize_ = input.readInt32();
                followingBatchSampleSizeCase_ = 3;
                break;
              } // case 24
            case 40:
              {
                sampleStrategy_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
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

    private int initialBatchSampleSizeCase_ = 0;
    private java.lang.Object initialBatchSampleSize_;

    public InitialBatchSampleSizeCase getInitialBatchSampleSizeCase() {
      return InitialBatchSampleSizeCase.forNumber(initialBatchSampleSizeCase_);
    }

    public Builder clearInitialBatchSampleSize() {
      initialBatchSampleSizeCase_ = 0;
      initialBatchSampleSize_ = null;
      onChanged();
      return this;
    }

    private int followingBatchSampleSizeCase_ = 0;
    private java.lang.Object followingBatchSampleSize_;

    public FollowingBatchSampleSizeCase getFollowingBatchSampleSizeCase() {
      return FollowingBatchSampleSizeCase.forNumber(followingBatchSampleSizeCase_);
    }

    public Builder clearFollowingBatchSampleSize() {
      followingBatchSampleSizeCase_ = 0;
      followingBatchSampleSize_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * The percentage of data needed to be labeled in the first batch.
     * </pre>
     *
     * <code>int32 initial_batch_sample_percentage = 1;</code>
     *
     * @return Whether the initialBatchSamplePercentage field is set.
     */
    public boolean hasInitialBatchSamplePercentage() {
      return initialBatchSampleSizeCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * The percentage of data needed to be labeled in the first batch.
     * </pre>
     *
     * <code>int32 initial_batch_sample_percentage = 1;</code>
     *
     * @return The initialBatchSamplePercentage.
     */
    public int getInitialBatchSamplePercentage() {
      if (initialBatchSampleSizeCase_ == 1) {
        return (java.lang.Integer) initialBatchSampleSize_;
      }
      return 0;
    }
    /**
     *
     *
     * <pre>
     * The percentage of data needed to be labeled in the first batch.
     * </pre>
     *
     * <code>int32 initial_batch_sample_percentage = 1;</code>
     *
     * @param value The initialBatchSamplePercentage to set.
     * @return This builder for chaining.
     */
    public Builder setInitialBatchSamplePercentage(int value) {

      initialBatchSampleSizeCase_ = 1;
      initialBatchSampleSize_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The percentage of data needed to be labeled in the first batch.
     * </pre>
     *
     * <code>int32 initial_batch_sample_percentage = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInitialBatchSamplePercentage() {
      if (initialBatchSampleSizeCase_ == 1) {
        initialBatchSampleSizeCase_ = 0;
        initialBatchSampleSize_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The percentage of data needed to be labeled in each following batch
     * (except the first batch).
     * </pre>
     *
     * <code>int32 following_batch_sample_percentage = 3;</code>
     *
     * @return Whether the followingBatchSamplePercentage field is set.
     */
    public boolean hasFollowingBatchSamplePercentage() {
      return followingBatchSampleSizeCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * The percentage of data needed to be labeled in each following batch
     * (except the first batch).
     * </pre>
     *
     * <code>int32 following_batch_sample_percentage = 3;</code>
     *
     * @return The followingBatchSamplePercentage.
     */
    public int getFollowingBatchSamplePercentage() {
      if (followingBatchSampleSizeCase_ == 3) {
        return (java.lang.Integer) followingBatchSampleSize_;
      }
      return 0;
    }
    /**
     *
     *
     * <pre>
     * The percentage of data needed to be labeled in each following batch
     * (except the first batch).
     * </pre>
     *
     * <code>int32 following_batch_sample_percentage = 3;</code>
     *
     * @param value The followingBatchSamplePercentage to set.
     * @return This builder for chaining.
     */
    public Builder setFollowingBatchSamplePercentage(int value) {

      followingBatchSampleSizeCase_ = 3;
      followingBatchSampleSize_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The percentage of data needed to be labeled in each following batch
     * (except the first batch).
     * </pre>
     *
     * <code>int32 following_batch_sample_percentage = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFollowingBatchSamplePercentage() {
      if (followingBatchSampleSizeCase_ == 3) {
        followingBatchSampleSizeCase_ = 0;
        followingBatchSampleSize_ = null;
        onChanged();
      }
      return this;
    }

    private int sampleStrategy_ = 0;
    /**
     *
     *
     * <pre>
     * Field to choose sampling strategy. Sampling strategy will decide which data
     * should be selected for human labeling in every batch.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy sample_strategy = 5;</code>
     *
     * @return The enum numeric value on the wire for sampleStrategy.
     */
    @java.lang.Override
    public int getSampleStrategyValue() {
      return sampleStrategy_;
    }
    /**
     *
     *
     * <pre>
     * Field to choose sampling strategy. Sampling strategy will decide which data
     * should be selected for human labeling in every batch.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy sample_strategy = 5;</code>
     *
     * @param value The enum numeric value on the wire for sampleStrategy to set.
     * @return This builder for chaining.
     */
    public Builder setSampleStrategyValue(int value) {
      sampleStrategy_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Field to choose sampling strategy. Sampling strategy will decide which data
     * should be selected for human labeling in every batch.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy sample_strategy = 5;</code>
     *
     * @return The sampleStrategy.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy getSampleStrategy() {
      com.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy result =
          com.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy.forNumber(sampleStrategy_);
      return result == null
          ? com.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Field to choose sampling strategy. Sampling strategy will decide which data
     * should be selected for human labeling in every batch.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy sample_strategy = 5;</code>
     *
     * @param value The sampleStrategy to set.
     * @return This builder for chaining.
     */
    public Builder setSampleStrategy(
        com.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      sampleStrategy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Field to choose sampling strategy. Sampling strategy will decide which data
     * should be selected for human labeling in every batch.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.SampleConfig.SampleStrategy sample_strategy = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSampleStrategy() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sampleStrategy_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.SampleConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.SampleConfig)
  private static final com.google.cloud.aiplatform.v1.SampleConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.SampleConfig();
  }

  public static com.google.cloud.aiplatform.v1.SampleConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SampleConfig> PARSER =
      new com.google.protobuf.AbstractParser<SampleConfig>() {
        @java.lang.Override
        public SampleConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<SampleConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SampleConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.SampleConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
