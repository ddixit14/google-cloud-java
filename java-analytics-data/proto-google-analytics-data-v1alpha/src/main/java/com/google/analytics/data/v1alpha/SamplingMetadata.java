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
 * If funnel report results are
 * [sampled](https://support.google.com/analytics/answer/2637192), this
 * metadata describes what percentage of events were used in this funnel
 * report for a date range. Sampling is the practice of analyzing a subset of
 * all data in order to uncover the meaningful information in the larger data
 * set.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.SamplingMetadata}
 */
public final class SamplingMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.SamplingMetadata)
    SamplingMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SamplingMetadata.newBuilder() to construct.
  private SamplingMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SamplingMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SamplingMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_SamplingMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_SamplingMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.SamplingMetadata.class,
            com.google.analytics.data.v1alpha.SamplingMetadata.Builder.class);
  }

  public static final int SAMPLES_READ_COUNT_FIELD_NUMBER = 1;
  private long samplesReadCount_ = 0L;
  /**
   *
   *
   * <pre>
   * The total number of events read in this sampled report for a date range.
   * This is the size of the subset this property's data that was analyzed in
   * this funnel report.
   * </pre>
   *
   * <code>int64 samples_read_count = 1;</code>
   *
   * @return The samplesReadCount.
   */
  @java.lang.Override
  public long getSamplesReadCount() {
    return samplesReadCount_;
  }

  public static final int SAMPLING_SPACE_SIZE_FIELD_NUMBER = 2;
  private long samplingSpaceSize_ = 0L;
  /**
   *
   *
   * <pre>
   * The total number of events present in this property's data that could
   * have been analyzed in this funnel report for a date range. Sampling
   * uncovers the meaningful information about the larger data set, and this
   * is the size of the larger data set.
   *
   * To calculate the percentage of available data that was used in this
   * funnel report, compute `samplesReadCount/samplingSpaceSize`.
   * </pre>
   *
   * <code>int64 sampling_space_size = 2;</code>
   *
   * @return The samplingSpaceSize.
   */
  @java.lang.Override
  public long getSamplingSpaceSize() {
    return samplingSpaceSize_;
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
    if (samplesReadCount_ != 0L) {
      output.writeInt64(1, samplesReadCount_);
    }
    if (samplingSpaceSize_ != 0L) {
      output.writeInt64(2, samplingSpaceSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (samplesReadCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, samplesReadCount_);
    }
    if (samplingSpaceSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, samplingSpaceSize_);
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.SamplingMetadata)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.SamplingMetadata other =
        (com.google.analytics.data.v1alpha.SamplingMetadata) obj;

    if (getSamplesReadCount() != other.getSamplesReadCount()) return false;
    if (getSamplingSpaceSize() != other.getSamplingSpaceSize()) return false;
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
    hash = (37 * hash) + SAMPLES_READ_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getSamplesReadCount());
    hash = (37 * hash) + SAMPLING_SPACE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getSamplingSpaceSize());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.SamplingMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.SamplingMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SamplingMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.SamplingMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SamplingMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.SamplingMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SamplingMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.SamplingMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SamplingMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.SamplingMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.SamplingMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.SamplingMetadata parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.SamplingMetadata prototype) {
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
   * If funnel report results are
   * [sampled](https://support.google.com/analytics/answer/2637192), this
   * metadata describes what percentage of events were used in this funnel
   * report for a date range. Sampling is the practice of analyzing a subset of
   * all data in order to uncover the meaningful information in the larger data
   * set.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.SamplingMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.SamplingMetadata)
      com.google.analytics.data.v1alpha.SamplingMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_SamplingMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_SamplingMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.SamplingMetadata.class,
              com.google.analytics.data.v1alpha.SamplingMetadata.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.SamplingMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      samplesReadCount_ = 0L;
      samplingSpaceSize_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_SamplingMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.SamplingMetadata getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.SamplingMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.SamplingMetadata build() {
      com.google.analytics.data.v1alpha.SamplingMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.SamplingMetadata buildPartial() {
      com.google.analytics.data.v1alpha.SamplingMetadata result =
          new com.google.analytics.data.v1alpha.SamplingMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.SamplingMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.samplesReadCount_ = samplesReadCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.samplingSpaceSize_ = samplingSpaceSize_;
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
      if (other instanceof com.google.analytics.data.v1alpha.SamplingMetadata) {
        return mergeFrom((com.google.analytics.data.v1alpha.SamplingMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.SamplingMetadata other) {
      if (other == com.google.analytics.data.v1alpha.SamplingMetadata.getDefaultInstance())
        return this;
      if (other.getSamplesReadCount() != 0L) {
        setSamplesReadCount(other.getSamplesReadCount());
      }
      if (other.getSamplingSpaceSize() != 0L) {
        setSamplingSpaceSize(other.getSamplingSpaceSize());
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
                samplesReadCount_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                samplingSpaceSize_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private long samplesReadCount_;
    /**
     *
     *
     * <pre>
     * The total number of events read in this sampled report for a date range.
     * This is the size of the subset this property's data that was analyzed in
     * this funnel report.
     * </pre>
     *
     * <code>int64 samples_read_count = 1;</code>
     *
     * @return The samplesReadCount.
     */
    @java.lang.Override
    public long getSamplesReadCount() {
      return samplesReadCount_;
    }
    /**
     *
     *
     * <pre>
     * The total number of events read in this sampled report for a date range.
     * This is the size of the subset this property's data that was analyzed in
     * this funnel report.
     * </pre>
     *
     * <code>int64 samples_read_count = 1;</code>
     *
     * @param value The samplesReadCount to set.
     * @return This builder for chaining.
     */
    public Builder setSamplesReadCount(long value) {

      samplesReadCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The total number of events read in this sampled report for a date range.
     * This is the size of the subset this property's data that was analyzed in
     * this funnel report.
     * </pre>
     *
     * <code>int64 samples_read_count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSamplesReadCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      samplesReadCount_ = 0L;
      onChanged();
      return this;
    }

    private long samplingSpaceSize_;
    /**
     *
     *
     * <pre>
     * The total number of events present in this property's data that could
     * have been analyzed in this funnel report for a date range. Sampling
     * uncovers the meaningful information about the larger data set, and this
     * is the size of the larger data set.
     *
     * To calculate the percentage of available data that was used in this
     * funnel report, compute `samplesReadCount/samplingSpaceSize`.
     * </pre>
     *
     * <code>int64 sampling_space_size = 2;</code>
     *
     * @return The samplingSpaceSize.
     */
    @java.lang.Override
    public long getSamplingSpaceSize() {
      return samplingSpaceSize_;
    }
    /**
     *
     *
     * <pre>
     * The total number of events present in this property's data that could
     * have been analyzed in this funnel report for a date range. Sampling
     * uncovers the meaningful information about the larger data set, and this
     * is the size of the larger data set.
     *
     * To calculate the percentage of available data that was used in this
     * funnel report, compute `samplesReadCount/samplingSpaceSize`.
     * </pre>
     *
     * <code>int64 sampling_space_size = 2;</code>
     *
     * @param value The samplingSpaceSize to set.
     * @return This builder for chaining.
     */
    public Builder setSamplingSpaceSize(long value) {

      samplingSpaceSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The total number of events present in this property's data that could
     * have been analyzed in this funnel report for a date range. Sampling
     * uncovers the meaningful information about the larger data set, and this
     * is the size of the larger data set.
     *
     * To calculate the percentage of available data that was used in this
     * funnel report, compute `samplesReadCount/samplingSpaceSize`.
     * </pre>
     *
     * <code>int64 sampling_space_size = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSamplingSpaceSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      samplingSpaceSize_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.SamplingMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.SamplingMetadata)
  private static final com.google.analytics.data.v1alpha.SamplingMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.SamplingMetadata();
  }

  public static com.google.analytics.data.v1alpha.SamplingMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SamplingMetadata> PARSER =
      new com.google.protobuf.AbstractParser<SamplingMetadata>() {
        @java.lang.Override
        public SamplingMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<SamplingMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SamplingMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.SamplingMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
