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
// source: google/cloud/datalabeling/v1beta1/evaluation.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Metrics calculated for an image object detection (bounding box) model.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics}
 */
public final class ObjectDetectionMetrics extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics)
    ObjectDetectionMetricsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ObjectDetectionMetrics.newBuilder() to construct.
  private ObjectDetectionMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ObjectDetectionMetrics() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ObjectDetectionMetrics();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.class,
            com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.Builder.class);
  }

  public static final int PR_CURVE_FIELD_NUMBER = 1;
  private com.google.cloud.datalabeling.v1beta1.PrCurve prCurve_;
  /**
   *
   *
   * <pre>
   * Precision-recall curve.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.PrCurve pr_curve = 1;</code>
   *
   * @return Whether the prCurve field is set.
   */
  @java.lang.Override
  public boolean hasPrCurve() {
    return prCurve_ != null;
  }
  /**
   *
   *
   * <pre>
   * Precision-recall curve.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.PrCurve pr_curve = 1;</code>
   *
   * @return The prCurve.
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.PrCurve getPrCurve() {
    return prCurve_ == null
        ? com.google.cloud.datalabeling.v1beta1.PrCurve.getDefaultInstance()
        : prCurve_;
  }
  /**
   *
   *
   * <pre>
   * Precision-recall curve.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.PrCurve pr_curve = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.PrCurveOrBuilder getPrCurveOrBuilder() {
    return prCurve_ == null
        ? com.google.cloud.datalabeling.v1beta1.PrCurve.getDefaultInstance()
        : prCurve_;
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
    if (prCurve_ != null) {
      output.writeMessage(1, getPrCurve());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (prCurve_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPrCurve());
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics other =
        (com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics) obj;

    if (hasPrCurve() != other.hasPrCurve()) return false;
    if (hasPrCurve()) {
      if (!getPrCurve().equals(other.getPrCurve())) return false;
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
    if (hasPrCurve()) {
      hash = (37 * hash) + PR_CURVE_FIELD_NUMBER;
      hash = (53 * hash) + getPrCurve().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics parseFrom(
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
      com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics prototype) {
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
   * Metrics calculated for an image object detection (bounding box) model.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics)
      com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.class,
              com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      prCurve_ = null;
      if (prCurveBuilder_ != null) {
        prCurveBuilder_.dispose();
        prCurveBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics
        getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics build() {
      com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics buildPartial() {
      com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics result =
          new com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.prCurve_ = prCurveBuilder_ == null ? prCurve_ : prCurveBuilder_.build();
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics other) {
      if (other
          == com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics.getDefaultInstance())
        return this;
      if (other.hasPrCurve()) {
        mergePrCurve(other.getPrCurve());
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
                input.readMessage(getPrCurveFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.cloud.datalabeling.v1beta1.PrCurve prCurve_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.PrCurve,
            com.google.cloud.datalabeling.v1beta1.PrCurve.Builder,
            com.google.cloud.datalabeling.v1beta1.PrCurveOrBuilder>
        prCurveBuilder_;
    /**
     *
     *
     * <pre>
     * Precision-recall curve.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.PrCurve pr_curve = 1;</code>
     *
     * @return Whether the prCurve field is set.
     */
    public boolean hasPrCurve() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Precision-recall curve.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.PrCurve pr_curve = 1;</code>
     *
     * @return The prCurve.
     */
    public com.google.cloud.datalabeling.v1beta1.PrCurve getPrCurve() {
      if (prCurveBuilder_ == null) {
        return prCurve_ == null
            ? com.google.cloud.datalabeling.v1beta1.PrCurve.getDefaultInstance()
            : prCurve_;
      } else {
        return prCurveBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Precision-recall curve.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.PrCurve pr_curve = 1;</code>
     */
    public Builder setPrCurve(com.google.cloud.datalabeling.v1beta1.PrCurve value) {
      if (prCurveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        prCurve_ = value;
      } else {
        prCurveBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Precision-recall curve.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.PrCurve pr_curve = 1;</code>
     */
    public Builder setPrCurve(
        com.google.cloud.datalabeling.v1beta1.PrCurve.Builder builderForValue) {
      if (prCurveBuilder_ == null) {
        prCurve_ = builderForValue.build();
      } else {
        prCurveBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Precision-recall curve.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.PrCurve pr_curve = 1;</code>
     */
    public Builder mergePrCurve(com.google.cloud.datalabeling.v1beta1.PrCurve value) {
      if (prCurveBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && prCurve_ != null
            && prCurve_ != com.google.cloud.datalabeling.v1beta1.PrCurve.getDefaultInstance()) {
          getPrCurveBuilder().mergeFrom(value);
        } else {
          prCurve_ = value;
        }
      } else {
        prCurveBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Precision-recall curve.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.PrCurve pr_curve = 1;</code>
     */
    public Builder clearPrCurve() {
      bitField0_ = (bitField0_ & ~0x00000001);
      prCurve_ = null;
      if (prCurveBuilder_ != null) {
        prCurveBuilder_.dispose();
        prCurveBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Precision-recall curve.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.PrCurve pr_curve = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.PrCurve.Builder getPrCurveBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPrCurveFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Precision-recall curve.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.PrCurve pr_curve = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.PrCurveOrBuilder getPrCurveOrBuilder() {
      if (prCurveBuilder_ != null) {
        return prCurveBuilder_.getMessageOrBuilder();
      } else {
        return prCurve_ == null
            ? com.google.cloud.datalabeling.v1beta1.PrCurve.getDefaultInstance()
            : prCurve_;
      }
    }
    /**
     *
     *
     * <pre>
     * Precision-recall curve.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.PrCurve pr_curve = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.PrCurve,
            com.google.cloud.datalabeling.v1beta1.PrCurve.Builder,
            com.google.cloud.datalabeling.v1beta1.PrCurveOrBuilder>
        getPrCurveFieldBuilder() {
      if (prCurveBuilder_ == null) {
        prCurveBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.PrCurve,
                com.google.cloud.datalabeling.v1beta1.PrCurve.Builder,
                com.google.cloud.datalabeling.v1beta1.PrCurveOrBuilder>(
                getPrCurve(), getParentForChildren(), isClean());
        prCurve_ = null;
      }
      return prCurveBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics)
  private static final com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics();
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ObjectDetectionMetrics> PARSER =
      new com.google.protobuf.AbstractParser<ObjectDetectionMetrics>() {
        @java.lang.Override
        public ObjectDetectionMetrics parsePartialFrom(
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

  public static com.google.protobuf.Parser<ObjectDetectionMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ObjectDetectionMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ObjectDetectionMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
