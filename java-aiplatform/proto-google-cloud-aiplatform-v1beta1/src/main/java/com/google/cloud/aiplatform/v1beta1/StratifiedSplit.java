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
// source: google/cloud/aiplatform/v1beta1/training_pipeline.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Assigns input data to the training, validation, and test sets so that the
 * distribution of values found in the categorical column (as specified by the
 * `key` field) is mirrored within each split. The fraction values determine
 * the relative sizes of the splits.
 *
 * For example, if the specified column has three values, with 50% of the rows
 * having value "A", 25% value "B", and 25% value "C", and the split fractions
 * are specified as 80/10/10, then the training set will constitute 80% of the
 * training data, with about 50% of the training set rows having the value "A"
 * for the specified column, about 25% having the value "B", and about 25%
 * having the value "C".
 *
 * Only the top 500 occurring values are used; any values not in the top
 * 500 values are randomly assigned to a split. If less than three rows contain
 * a specific value, those rows are randomly assigned.
 *
 * Supported only for tabular Datasets.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.StratifiedSplit}
 */
public final class StratifiedSplit extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.StratifiedSplit)
    StratifiedSplitOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StratifiedSplit.newBuilder() to construct.
  private StratifiedSplit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StratifiedSplit() {
    key_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StratifiedSplit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.TrainingPipelineProto
        .internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.TrainingPipelineProto
        .internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.StratifiedSplit.class,
            com.google.cloud.aiplatform.v1beta1.StratifiedSplit.Builder.class);
  }

  public static final int TRAINING_FRACTION_FIELD_NUMBER = 1;
  private double trainingFraction_ = 0D;
  /**
   *
   *
   * <pre>
   * The fraction of the input data that is to be used to train the Model.
   * </pre>
   *
   * <code>double training_fraction = 1;</code>
   *
   * @return The trainingFraction.
   */
  @java.lang.Override
  public double getTrainingFraction() {
    return trainingFraction_;
  }

  public static final int VALIDATION_FRACTION_FIELD_NUMBER = 2;
  private double validationFraction_ = 0D;
  /**
   *
   *
   * <pre>
   * The fraction of the input data that is to be used to validate the Model.
   * </pre>
   *
   * <code>double validation_fraction = 2;</code>
   *
   * @return The validationFraction.
   */
  @java.lang.Override
  public double getValidationFraction() {
    return validationFraction_;
  }

  public static final int TEST_FRACTION_FIELD_NUMBER = 3;
  private double testFraction_ = 0D;
  /**
   *
   *
   * <pre>
   * The fraction of the input data that is to be used to evaluate the Model.
   * </pre>
   *
   * <code>double test_fraction = 3;</code>
   *
   * @return The testFraction.
   */
  @java.lang.Override
  public double getTestFraction() {
    return testFraction_;
  }

  public static final int KEY_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object key_ = "";
  /**
   *
   *
   * <pre>
   * Required. The key is a name of one of the Dataset's data columns.
   * The key provided must be for a categorical column.
   * </pre>
   *
   * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The key is a name of one of the Dataset's data columns.
   * The key provided must be for a categorical column.
   * </pre>
   *
   * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (java.lang.Double.doubleToRawLongBits(trainingFraction_) != 0) {
      output.writeDouble(1, trainingFraction_);
    }
    if (java.lang.Double.doubleToRawLongBits(validationFraction_) != 0) {
      output.writeDouble(2, validationFraction_);
    }
    if (java.lang.Double.doubleToRawLongBits(testFraction_) != 0) {
      output.writeDouble(3, testFraction_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, key_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(trainingFraction_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, trainingFraction_);
    }
    if (java.lang.Double.doubleToRawLongBits(validationFraction_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(2, validationFraction_);
    }
    if (java.lang.Double.doubleToRawLongBits(testFraction_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(3, testFraction_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, key_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.StratifiedSplit)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.StratifiedSplit other =
        (com.google.cloud.aiplatform.v1beta1.StratifiedSplit) obj;

    if (java.lang.Double.doubleToLongBits(getTrainingFraction())
        != java.lang.Double.doubleToLongBits(other.getTrainingFraction())) return false;
    if (java.lang.Double.doubleToLongBits(getValidationFraction())
        != java.lang.Double.doubleToLongBits(other.getValidationFraction())) return false;
    if (java.lang.Double.doubleToLongBits(getTestFraction())
        != java.lang.Double.doubleToLongBits(other.getTestFraction())) return false;
    if (!getKey().equals(other.getKey())) return false;
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
    hash = (37 * hash) + TRAINING_FRACTION_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getTrainingFraction()));
    hash = (37 * hash) + VALIDATION_FRACTION_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getValidationFraction()));
    hash = (37 * hash) + TEST_FRACTION_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getTestFraction()));
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.StratifiedSplit parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.StratifiedSplit parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.StratifiedSplit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.StratifiedSplit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.StratifiedSplit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.StratifiedSplit parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.StratifiedSplit parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.StratifiedSplit parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.StratifiedSplit parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.StratifiedSplit parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.StratifiedSplit parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.StratifiedSplit parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.StratifiedSplit prototype) {
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
   * Assigns input data to the training, validation, and test sets so that the
   * distribution of values found in the categorical column (as specified by the
   * `key` field) is mirrored within each split. The fraction values determine
   * the relative sizes of the splits.
   *
   * For example, if the specified column has three values, with 50% of the rows
   * having value "A", 25% value "B", and 25% value "C", and the split fractions
   * are specified as 80/10/10, then the training set will constitute 80% of the
   * training data, with about 50% of the training set rows having the value "A"
   * for the specified column, about 25% having the value "B", and about 25%
   * having the value "C".
   *
   * Only the top 500 occurring values are used; any values not in the top
   * 500 values are randomly assigned to a split. If less than three rows contain
   * a specific value, those rows are randomly assigned.
   *
   * Supported only for tabular Datasets.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.StratifiedSplit}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.StratifiedSplit)
      com.google.cloud.aiplatform.v1beta1.StratifiedSplitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.TrainingPipelineProto
          .internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.TrainingPipelineProto
          .internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.StratifiedSplit.class,
              com.google.cloud.aiplatform.v1beta1.StratifiedSplit.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.StratifiedSplit.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      trainingFraction_ = 0D;
      validationFraction_ = 0D;
      testFraction_ = 0D;
      key_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.TrainingPipelineProto
          .internal_static_google_cloud_aiplatform_v1beta1_StratifiedSplit_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.StratifiedSplit getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.StratifiedSplit.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.StratifiedSplit build() {
      com.google.cloud.aiplatform.v1beta1.StratifiedSplit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.StratifiedSplit buildPartial() {
      com.google.cloud.aiplatform.v1beta1.StratifiedSplit result =
          new com.google.cloud.aiplatform.v1beta1.StratifiedSplit(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.StratifiedSplit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.trainingFraction_ = trainingFraction_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.validationFraction_ = validationFraction_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.testFraction_ = testFraction_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.key_ = key_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.StratifiedSplit) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.StratifiedSplit) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.StratifiedSplit other) {
      if (other == com.google.cloud.aiplatform.v1beta1.StratifiedSplit.getDefaultInstance())
        return this;
      if (other.getTrainingFraction() != 0D) {
        setTrainingFraction(other.getTrainingFraction());
      }
      if (other.getValidationFraction() != 0D) {
        setValidationFraction(other.getValidationFraction());
      }
      if (other.getTestFraction() != 0D) {
        setTestFraction(other.getTestFraction());
      }
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        bitField0_ |= 0x00000008;
        onChanged();
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
            case 9:
              {
                trainingFraction_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
            case 17:
              {
                validationFraction_ = input.readDouble();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
            case 25:
              {
                testFraction_ = input.readDouble();
                bitField0_ |= 0x00000004;
                break;
              } // case 25
            case 34:
              {
                key_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private double trainingFraction_;
    /**
     *
     *
     * <pre>
     * The fraction of the input data that is to be used to train the Model.
     * </pre>
     *
     * <code>double training_fraction = 1;</code>
     *
     * @return The trainingFraction.
     */
    @java.lang.Override
    public double getTrainingFraction() {
      return trainingFraction_;
    }
    /**
     *
     *
     * <pre>
     * The fraction of the input data that is to be used to train the Model.
     * </pre>
     *
     * <code>double training_fraction = 1;</code>
     *
     * @param value The trainingFraction to set.
     * @return This builder for chaining.
     */
    public Builder setTrainingFraction(double value) {

      trainingFraction_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The fraction of the input data that is to be used to train the Model.
     * </pre>
     *
     * <code>double training_fraction = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTrainingFraction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      trainingFraction_ = 0D;
      onChanged();
      return this;
    }

    private double validationFraction_;
    /**
     *
     *
     * <pre>
     * The fraction of the input data that is to be used to validate the Model.
     * </pre>
     *
     * <code>double validation_fraction = 2;</code>
     *
     * @return The validationFraction.
     */
    @java.lang.Override
    public double getValidationFraction() {
      return validationFraction_;
    }
    /**
     *
     *
     * <pre>
     * The fraction of the input data that is to be used to validate the Model.
     * </pre>
     *
     * <code>double validation_fraction = 2;</code>
     *
     * @param value The validationFraction to set.
     * @return This builder for chaining.
     */
    public Builder setValidationFraction(double value) {

      validationFraction_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The fraction of the input data that is to be used to validate the Model.
     * </pre>
     *
     * <code>double validation_fraction = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidationFraction() {
      bitField0_ = (bitField0_ & ~0x00000002);
      validationFraction_ = 0D;
      onChanged();
      return this;
    }

    private double testFraction_;
    /**
     *
     *
     * <pre>
     * The fraction of the input data that is to be used to evaluate the Model.
     * </pre>
     *
     * <code>double test_fraction = 3;</code>
     *
     * @return The testFraction.
     */
    @java.lang.Override
    public double getTestFraction() {
      return testFraction_;
    }
    /**
     *
     *
     * <pre>
     * The fraction of the input data that is to be used to evaluate the Model.
     * </pre>
     *
     * <code>double test_fraction = 3;</code>
     *
     * @param value The testFraction to set.
     * @return This builder for chaining.
     */
    public Builder setTestFraction(double value) {

      testFraction_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The fraction of the input data that is to be used to evaluate the Model.
     * </pre>
     *
     * <code>double test_fraction = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTestFraction() {
      bitField0_ = (bitField0_ & ~0x00000004);
      testFraction_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object key_ = "";
    /**
     *
     *
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The key provided must be for a categorical column.
     * </pre>
     *
     * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The key provided must be for a categorical column.
     * </pre>
     *
     * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The key provided must be for a categorical column.
     * </pre>
     *
     * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      key_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The key provided must be for a categorical column.
     * </pre>
     *
     * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      key_ = getDefaultInstance().getKey();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The key is a name of one of the Dataset's data columns.
     * The key provided must be for a categorical column.
     * </pre>
     *
     * <code>string key = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      key_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.StratifiedSplit)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.StratifiedSplit)
  private static final com.google.cloud.aiplatform.v1beta1.StratifiedSplit DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.StratifiedSplit();
  }

  public static com.google.cloud.aiplatform.v1beta1.StratifiedSplit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StratifiedSplit> PARSER =
      new com.google.protobuf.AbstractParser<StratifiedSplit>() {
        @java.lang.Override
        public StratifiedSplit parsePartialFrom(
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

  public static com.google.protobuf.Parser<StratifiedSplit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StratifiedSplit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.StratifiedSplit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
