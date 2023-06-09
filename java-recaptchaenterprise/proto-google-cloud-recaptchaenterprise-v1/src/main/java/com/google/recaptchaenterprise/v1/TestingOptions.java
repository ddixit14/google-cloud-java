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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * Options for user acceptance testing.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.TestingOptions}
 */
public final class TestingOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.TestingOptions)
    TestingOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TestingOptions.newBuilder() to construct.
  private TestingOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TestingOptions() {
    testingChallenge_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TestingOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_TestingOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_TestingOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.TestingOptions.class,
            com.google.recaptchaenterprise.v1.TestingOptions.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Enum that represents the challenge option for challenge-based (CHECKBOX,
   * INVISIBLE) testing keys.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.recaptchaenterprise.v1.TestingOptions.TestingChallenge}
   */
  public enum TestingChallenge implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Perform the normal risk analysis and return either nocaptcha or a
     * challenge depending on risk and trust factors.
     * </pre>
     *
     * <code>TESTING_CHALLENGE_UNSPECIFIED = 0;</code>
     */
    TESTING_CHALLENGE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Challenge requests for this key always return a nocaptcha, which
     * does not require a solution.
     * </pre>
     *
     * <code>NOCAPTCHA = 1;</code>
     */
    NOCAPTCHA(1),
    /**
     *
     *
     * <pre>
     * Challenge requests for this key always return an unsolvable
     * challenge.
     * </pre>
     *
     * <code>UNSOLVABLE_CHALLENGE = 2;</code>
     */
    UNSOLVABLE_CHALLENGE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Perform the normal risk analysis and return either nocaptcha or a
     * challenge depending on risk and trust factors.
     * </pre>
     *
     * <code>TESTING_CHALLENGE_UNSPECIFIED = 0;</code>
     */
    public static final int TESTING_CHALLENGE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Challenge requests for this key always return a nocaptcha, which
     * does not require a solution.
     * </pre>
     *
     * <code>NOCAPTCHA = 1;</code>
     */
    public static final int NOCAPTCHA_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Challenge requests for this key always return an unsolvable
     * challenge.
     * </pre>
     *
     * <code>UNSOLVABLE_CHALLENGE = 2;</code>
     */
    public static final int UNSOLVABLE_CHALLENGE_VALUE = 2;

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
    public static TestingChallenge valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TestingChallenge forNumber(int value) {
      switch (value) {
        case 0:
          return TESTING_CHALLENGE_UNSPECIFIED;
        case 1:
          return NOCAPTCHA;
        case 2:
          return UNSOLVABLE_CHALLENGE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TestingChallenge> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<TestingChallenge>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<TestingChallenge>() {
              public TestingChallenge findValueByNumber(int number) {
                return TestingChallenge.forNumber(number);
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
      return com.google.recaptchaenterprise.v1.TestingOptions.getDescriptor().getEnumTypes().get(0);
    }

    private static final TestingChallenge[] VALUES = values();

    public static TestingChallenge valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TestingChallenge(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.recaptchaenterprise.v1.TestingOptions.TestingChallenge)
  }

  public static final int TESTING_SCORE_FIELD_NUMBER = 1;
  private float testingScore_ = 0F;
  /**
   *
   *
   * <pre>
   * All assessments for this Key will return this score. Must be between 0
   * (likely not legitimate) and 1 (likely legitimate) inclusive.
   * </pre>
   *
   * <code>float testing_score = 1;</code>
   *
   * @return The testingScore.
   */
  @java.lang.Override
  public float getTestingScore() {
    return testingScore_;
  }

  public static final int TESTING_CHALLENGE_FIELD_NUMBER = 2;
  private int testingChallenge_ = 0;
  /**
   *
   *
   * <pre>
   * For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests
   * for this site will return nocaptcha if NOCAPTCHA, or an unsolvable
   * challenge if CHALLENGE.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.TestingOptions.TestingChallenge testing_challenge = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for testingChallenge.
   */
  @java.lang.Override
  public int getTestingChallengeValue() {
    return testingChallenge_;
  }
  /**
   *
   *
   * <pre>
   * For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests
   * for this site will return nocaptcha if NOCAPTCHA, or an unsolvable
   * challenge if CHALLENGE.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.TestingOptions.TestingChallenge testing_challenge = 2;
   * </code>
   *
   * @return The testingChallenge.
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.TestingOptions.TestingChallenge getTestingChallenge() {
    com.google.recaptchaenterprise.v1.TestingOptions.TestingChallenge result =
        com.google.recaptchaenterprise.v1.TestingOptions.TestingChallenge.forNumber(
            testingChallenge_);
    return result == null
        ? com.google.recaptchaenterprise.v1.TestingOptions.TestingChallenge.UNRECOGNIZED
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
    if (java.lang.Float.floatToRawIntBits(testingScore_) != 0) {
      output.writeFloat(1, testingScore_);
    }
    if (testingChallenge_
        != com.google.recaptchaenterprise.v1.TestingOptions.TestingChallenge
            .TESTING_CHALLENGE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, testingChallenge_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(testingScore_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, testingScore_);
    }
    if (testingChallenge_
        != com.google.recaptchaenterprise.v1.TestingOptions.TestingChallenge
            .TESTING_CHALLENGE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, testingChallenge_);
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.TestingOptions)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.TestingOptions other =
        (com.google.recaptchaenterprise.v1.TestingOptions) obj;

    if (java.lang.Float.floatToIntBits(getTestingScore())
        != java.lang.Float.floatToIntBits(other.getTestingScore())) return false;
    if (testingChallenge_ != other.testingChallenge_) return false;
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
    hash = (37 * hash) + TESTING_SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getTestingScore());
    hash = (37 * hash) + TESTING_CHALLENGE_FIELD_NUMBER;
    hash = (53 * hash) + testingChallenge_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.TestingOptions parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.TestingOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.TestingOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.TestingOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.TestingOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.TestingOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.TestingOptions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.TestingOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.TestingOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.TestingOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.TestingOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.TestingOptions parseFrom(
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

  public static Builder newBuilder(com.google.recaptchaenterprise.v1.TestingOptions prototype) {
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
   * Options for user acceptance testing.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.TestingOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.TestingOptions)
      com.google.recaptchaenterprise.v1.TestingOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_TestingOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_TestingOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.TestingOptions.class,
              com.google.recaptchaenterprise.v1.TestingOptions.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.TestingOptions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      testingScore_ = 0F;
      testingChallenge_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_TestingOptions_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.TestingOptions getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.TestingOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.TestingOptions build() {
      com.google.recaptchaenterprise.v1.TestingOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.TestingOptions buildPartial() {
      com.google.recaptchaenterprise.v1.TestingOptions result =
          new com.google.recaptchaenterprise.v1.TestingOptions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.recaptchaenterprise.v1.TestingOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.testingScore_ = testingScore_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.testingChallenge_ = testingChallenge_;
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
      if (other instanceof com.google.recaptchaenterprise.v1.TestingOptions) {
        return mergeFrom((com.google.recaptchaenterprise.v1.TestingOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.TestingOptions other) {
      if (other == com.google.recaptchaenterprise.v1.TestingOptions.getDefaultInstance())
        return this;
      if (other.getTestingScore() != 0F) {
        setTestingScore(other.getTestingScore());
      }
      if (other.testingChallenge_ != 0) {
        setTestingChallengeValue(other.getTestingChallengeValue());
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
            case 13:
              {
                testingScore_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 13
            case 16:
              {
                testingChallenge_ = input.readEnum();
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

    private float testingScore_;
    /**
     *
     *
     * <pre>
     * All assessments for this Key will return this score. Must be between 0
     * (likely not legitimate) and 1 (likely legitimate) inclusive.
     * </pre>
     *
     * <code>float testing_score = 1;</code>
     *
     * @return The testingScore.
     */
    @java.lang.Override
    public float getTestingScore() {
      return testingScore_;
    }
    /**
     *
     *
     * <pre>
     * All assessments for this Key will return this score. Must be between 0
     * (likely not legitimate) and 1 (likely legitimate) inclusive.
     * </pre>
     *
     * <code>float testing_score = 1;</code>
     *
     * @param value The testingScore to set.
     * @return This builder for chaining.
     */
    public Builder setTestingScore(float value) {

      testingScore_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * All assessments for this Key will return this score. Must be between 0
     * (likely not legitimate) and 1 (likely legitimate) inclusive.
     * </pre>
     *
     * <code>float testing_score = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTestingScore() {
      bitField0_ = (bitField0_ & ~0x00000001);
      testingScore_ = 0F;
      onChanged();
      return this;
    }

    private int testingChallenge_ = 0;
    /**
     *
     *
     * <pre>
     * For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests
     * for this site will return nocaptcha if NOCAPTCHA, or an unsolvable
     * challenge if CHALLENGE.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.TestingOptions.TestingChallenge testing_challenge = 2;
     * </code>
     *
     * @return The enum numeric value on the wire for testingChallenge.
     */
    @java.lang.Override
    public int getTestingChallengeValue() {
      return testingChallenge_;
    }
    /**
     *
     *
     * <pre>
     * For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests
     * for this site will return nocaptcha if NOCAPTCHA, or an unsolvable
     * challenge if CHALLENGE.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.TestingOptions.TestingChallenge testing_challenge = 2;
     * </code>
     *
     * @param value The enum numeric value on the wire for testingChallenge to set.
     * @return This builder for chaining.
     */
    public Builder setTestingChallengeValue(int value) {
      testingChallenge_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests
     * for this site will return nocaptcha if NOCAPTCHA, or an unsolvable
     * challenge if CHALLENGE.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.TestingOptions.TestingChallenge testing_challenge = 2;
     * </code>
     *
     * @return The testingChallenge.
     */
    @java.lang.Override
    public com.google.recaptchaenterprise.v1.TestingOptions.TestingChallenge getTestingChallenge() {
      com.google.recaptchaenterprise.v1.TestingOptions.TestingChallenge result =
          com.google.recaptchaenterprise.v1.TestingOptions.TestingChallenge.forNumber(
              testingChallenge_);
      return result == null
          ? com.google.recaptchaenterprise.v1.TestingOptions.TestingChallenge.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests
     * for this site will return nocaptcha if NOCAPTCHA, or an unsolvable
     * challenge if CHALLENGE.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.TestingOptions.TestingChallenge testing_challenge = 2;
     * </code>
     *
     * @param value The testingChallenge to set.
     * @return This builder for chaining.
     */
    public Builder setTestingChallenge(
        com.google.recaptchaenterprise.v1.TestingOptions.TestingChallenge value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      testingChallenge_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests
     * for this site will return nocaptcha if NOCAPTCHA, or an unsolvable
     * challenge if CHALLENGE.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.TestingOptions.TestingChallenge testing_challenge = 2;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTestingChallenge() {
      bitField0_ = (bitField0_ & ~0x00000002);
      testingChallenge_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.TestingOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.TestingOptions)
  private static final com.google.recaptchaenterprise.v1.TestingOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.TestingOptions();
  }

  public static com.google.recaptchaenterprise.v1.TestingOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestingOptions> PARSER =
      new com.google.protobuf.AbstractParser<TestingOptions>() {
        @java.lang.Override
        public TestingOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<TestingOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestingOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.TestingOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
