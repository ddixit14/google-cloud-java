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
// source: google/dataflow/v1beta3/metrics.proto

package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * JobMetrics contains a collection of metrics describing the detailed progress
 * of a Dataflow job. Metrics correspond to user-defined and system-defined
 * metrics in the job.
 *
 * This resource captures only the most recent values of each metric;
 * time-series data can be queried for them (under the same metric names)
 * from Cloud Monitoring.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.JobMetrics}
 */
public final class JobMetrics extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.JobMetrics)
    JobMetricsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use JobMetrics.newBuilder() to construct.
  private JobMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private JobMetrics() {
    metrics_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new JobMetrics();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.MetricsProto
        .internal_static_google_dataflow_v1beta3_JobMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.MetricsProto
        .internal_static_google_dataflow_v1beta3_JobMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.JobMetrics.class,
            com.google.dataflow.v1beta3.JobMetrics.Builder.class);
  }

  public static final int METRIC_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp metricTime_;
  /**
   *
   *
   * <pre>
   * Timestamp as of which metric values are current.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp metric_time = 1;</code>
   *
   * @return Whether the metricTime field is set.
   */
  @java.lang.Override
  public boolean hasMetricTime() {
    return metricTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Timestamp as of which metric values are current.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp metric_time = 1;</code>
   *
   * @return The metricTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getMetricTime() {
    return metricTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : metricTime_;
  }
  /**
   *
   *
   * <pre>
   * Timestamp as of which metric values are current.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp metric_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getMetricTimeOrBuilder() {
    return metricTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : metricTime_;
  }

  public static final int METRICS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<com.google.dataflow.v1beta3.MetricUpdate> metrics_;
  /**
   *
   *
   * <pre>
   * All metrics for this job.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.dataflow.v1beta3.MetricUpdate> getMetricsList() {
    return metrics_;
  }
  /**
   *
   *
   * <pre>
   * All metrics for this job.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.dataflow.v1beta3.MetricUpdateOrBuilder>
      getMetricsOrBuilderList() {
    return metrics_;
  }
  /**
   *
   *
   * <pre>
   * All metrics for this job.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
   */
  @java.lang.Override
  public int getMetricsCount() {
    return metrics_.size();
  }
  /**
   *
   *
   * <pre>
   * All metrics for this job.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.MetricUpdate getMetrics(int index) {
    return metrics_.get(index);
  }
  /**
   *
   *
   * <pre>
   * All metrics for this job.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.MetricUpdateOrBuilder getMetricsOrBuilder(int index) {
    return metrics_.get(index);
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
    if (metricTime_ != null) {
      output.writeMessage(1, getMetricTime());
    }
    for (int i = 0; i < metrics_.size(); i++) {
      output.writeMessage(2, metrics_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metricTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetricTime());
    }
    for (int i = 0; i < metrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, metrics_.get(i));
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
    if (!(obj instanceof com.google.dataflow.v1beta3.JobMetrics)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.JobMetrics other = (com.google.dataflow.v1beta3.JobMetrics) obj;

    if (hasMetricTime() != other.hasMetricTime()) return false;
    if (hasMetricTime()) {
      if (!getMetricTime().equals(other.getMetricTime())) return false;
    }
    if (!getMetricsList().equals(other.getMetricsList())) return false;
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
    if (hasMetricTime()) {
      hash = (37 * hash) + METRIC_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMetricTime().hashCode();
    }
    if (getMetricsCount() > 0) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.JobMetrics parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.JobMetrics parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.JobMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.JobMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.JobMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.JobMetrics parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.JobMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.JobMetrics parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.JobMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.JobMetrics parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.JobMetrics parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.JobMetrics parseFrom(
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

  public static Builder newBuilder(com.google.dataflow.v1beta3.JobMetrics prototype) {
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
   * JobMetrics contains a collection of metrics describing the detailed progress
   * of a Dataflow job. Metrics correspond to user-defined and system-defined
   * metrics in the job.
   *
   * This resource captures only the most recent values of each metric;
   * time-series data can be queried for them (under the same metric names)
   * from Cloud Monitoring.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.JobMetrics}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.JobMetrics)
      com.google.dataflow.v1beta3.JobMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.MetricsProto
          .internal_static_google_dataflow_v1beta3_JobMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.MetricsProto
          .internal_static_google_dataflow_v1beta3_JobMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.JobMetrics.class,
              com.google.dataflow.v1beta3.JobMetrics.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.JobMetrics.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      metricTime_ = null;
      if (metricTimeBuilder_ != null) {
        metricTimeBuilder_.dispose();
        metricTimeBuilder_ = null;
      }
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
      } else {
        metrics_ = null;
        metricsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.MetricsProto
          .internal_static_google_dataflow_v1beta3_JobMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.JobMetrics getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.JobMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.JobMetrics build() {
      com.google.dataflow.v1beta3.JobMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.JobMetrics buildPartial() {
      com.google.dataflow.v1beta3.JobMetrics result =
          new com.google.dataflow.v1beta3.JobMetrics(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.dataflow.v1beta3.JobMetrics result) {
      if (metricsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          metrics_ = java.util.Collections.unmodifiableList(metrics_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.metrics_ = metrics_;
      } else {
        result.metrics_ = metricsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.dataflow.v1beta3.JobMetrics result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metricTime_ = metricTimeBuilder_ == null ? metricTime_ : metricTimeBuilder_.build();
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
      if (other instanceof com.google.dataflow.v1beta3.JobMetrics) {
        return mergeFrom((com.google.dataflow.v1beta3.JobMetrics) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.JobMetrics other) {
      if (other == com.google.dataflow.v1beta3.JobMetrics.getDefaultInstance()) return this;
      if (other.hasMetricTime()) {
        mergeMetricTime(other.getMetricTime());
      }
      if (metricsBuilder_ == null) {
        if (!other.metrics_.isEmpty()) {
          if (metrics_.isEmpty()) {
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMetricsIsMutable();
            metrics_.addAll(other.metrics_);
          }
          onChanged();
        }
      } else {
        if (!other.metrics_.isEmpty()) {
          if (metricsBuilder_.isEmpty()) {
            metricsBuilder_.dispose();
            metricsBuilder_ = null;
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000002);
            metricsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMetricsFieldBuilder()
                    : null;
          } else {
            metricsBuilder_.addAllMessages(other.metrics_);
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
                input.readMessage(getMetricTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.dataflow.v1beta3.MetricUpdate m =
                    input.readMessage(
                        com.google.dataflow.v1beta3.MetricUpdate.parser(), extensionRegistry);
                if (metricsBuilder_ == null) {
                  ensureMetricsIsMutable();
                  metrics_.add(m);
                } else {
                  metricsBuilder_.addMessage(m);
                }
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

    private com.google.protobuf.Timestamp metricTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        metricTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Timestamp as of which metric values are current.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp metric_time = 1;</code>
     *
     * @return Whether the metricTime field is set.
     */
    public boolean hasMetricTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Timestamp as of which metric values are current.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp metric_time = 1;</code>
     *
     * @return The metricTime.
     */
    public com.google.protobuf.Timestamp getMetricTime() {
      if (metricTimeBuilder_ == null) {
        return metricTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : metricTime_;
      } else {
        return metricTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Timestamp as of which metric values are current.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp metric_time = 1;</code>
     */
    public Builder setMetricTime(com.google.protobuf.Timestamp value) {
      if (metricTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metricTime_ = value;
      } else {
        metricTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Timestamp as of which metric values are current.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp metric_time = 1;</code>
     */
    public Builder setMetricTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (metricTimeBuilder_ == null) {
        metricTime_ = builderForValue.build();
      } else {
        metricTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Timestamp as of which metric values are current.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp metric_time = 1;</code>
     */
    public Builder mergeMetricTime(com.google.protobuf.Timestamp value) {
      if (metricTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && metricTime_ != null
            && metricTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getMetricTimeBuilder().mergeFrom(value);
        } else {
          metricTime_ = value;
        }
      } else {
        metricTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Timestamp as of which metric values are current.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp metric_time = 1;</code>
     */
    public Builder clearMetricTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      metricTime_ = null;
      if (metricTimeBuilder_ != null) {
        metricTimeBuilder_.dispose();
        metricTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Timestamp as of which metric values are current.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp metric_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getMetricTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMetricTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Timestamp as of which metric values are current.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp metric_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getMetricTimeOrBuilder() {
      if (metricTimeBuilder_ != null) {
        return metricTimeBuilder_.getMessageOrBuilder();
      } else {
        return metricTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : metricTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Timestamp as of which metric values are current.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp metric_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getMetricTimeFieldBuilder() {
      if (metricTimeBuilder_ == null) {
        metricTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getMetricTime(), getParentForChildren(), isClean());
        metricTime_ = null;
      }
      return metricTimeBuilder_;
    }

    private java.util.List<com.google.dataflow.v1beta3.MetricUpdate> metrics_ =
        java.util.Collections.emptyList();

    private void ensureMetricsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        metrics_ = new java.util.ArrayList<com.google.dataflow.v1beta3.MetricUpdate>(metrics_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.dataflow.v1beta3.MetricUpdate,
            com.google.dataflow.v1beta3.MetricUpdate.Builder,
            com.google.dataflow.v1beta3.MetricUpdateOrBuilder>
        metricsBuilder_;

    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public java.util.List<com.google.dataflow.v1beta3.MetricUpdate> getMetricsList() {
      if (metricsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metrics_);
      } else {
        return metricsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public int getMetricsCount() {
      if (metricsBuilder_ == null) {
        return metrics_.size();
      } else {
        return metricsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public com.google.dataflow.v1beta3.MetricUpdate getMetrics(int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);
      } else {
        return metricsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public Builder setMetrics(int index, com.google.dataflow.v1beta3.MetricUpdate value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.set(index, value);
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public Builder setMetrics(
        int index, com.google.dataflow.v1beta3.MetricUpdate.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.set(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public Builder addMetrics(com.google.dataflow.v1beta3.MetricUpdate value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public Builder addMetrics(int index, com.google.dataflow.v1beta3.MetricUpdate value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(index, value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public Builder addMetrics(com.google.dataflow.v1beta3.MetricUpdate.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public Builder addMetrics(
        int index, com.google.dataflow.v1beta3.MetricUpdate.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public Builder addAllMetrics(
        java.lang.Iterable<? extends com.google.dataflow.v1beta3.MetricUpdate> values) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, metrics_);
        onChanged();
      } else {
        metricsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public Builder clearMetrics() {
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        metricsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public Builder removeMetrics(int index) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.remove(index);
        onChanged();
      } else {
        metricsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public com.google.dataflow.v1beta3.MetricUpdate.Builder getMetricsBuilder(int index) {
      return getMetricsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public com.google.dataflow.v1beta3.MetricUpdateOrBuilder getMetricsOrBuilder(int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);
      } else {
        return metricsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public java.util.List<? extends com.google.dataflow.v1beta3.MetricUpdateOrBuilder>
        getMetricsOrBuilderList() {
      if (metricsBuilder_ != null) {
        return metricsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metrics_);
      }
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public com.google.dataflow.v1beta3.MetricUpdate.Builder addMetricsBuilder() {
      return getMetricsFieldBuilder()
          .addBuilder(com.google.dataflow.v1beta3.MetricUpdate.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public com.google.dataflow.v1beta3.MetricUpdate.Builder addMetricsBuilder(int index) {
      return getMetricsFieldBuilder()
          .addBuilder(index, com.google.dataflow.v1beta3.MetricUpdate.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * All metrics for this job.
     * </pre>
     *
     * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 2;</code>
     */
    public java.util.List<com.google.dataflow.v1beta3.MetricUpdate.Builder>
        getMetricsBuilderList() {
      return getMetricsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.dataflow.v1beta3.MetricUpdate,
            com.google.dataflow.v1beta3.MetricUpdate.Builder,
            com.google.dataflow.v1beta3.MetricUpdateOrBuilder>
        getMetricsFieldBuilder() {
      if (metricsBuilder_ == null) {
        metricsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.dataflow.v1beta3.MetricUpdate,
                com.google.dataflow.v1beta3.MetricUpdate.Builder,
                com.google.dataflow.v1beta3.MetricUpdateOrBuilder>(
                metrics_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        metrics_ = null;
      }
      return metricsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.JobMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.JobMetrics)
  private static final com.google.dataflow.v1beta3.JobMetrics DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.JobMetrics();
  }

  public static com.google.dataflow.v1beta3.JobMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobMetrics> PARSER =
      new com.google.protobuf.AbstractParser<JobMetrics>() {
        @java.lang.Override
        public JobMetrics parsePartialFrom(
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

  public static com.google.protobuf.Parser<JobMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.JobMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
