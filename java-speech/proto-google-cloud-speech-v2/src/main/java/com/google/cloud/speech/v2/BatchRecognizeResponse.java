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
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

/**
 *
 *
 * <pre>
 * Response message for
 * [BatchRecognize][google.cloud.speech.v2.Speech.BatchRecognize] that is
 * packaged into a longrunning [Operation][google.longrunning.Operation].
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v2.BatchRecognizeResponse}
 */
public final class BatchRecognizeResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v2.BatchRecognizeResponse)
    BatchRecognizeResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchRecognizeResponse.newBuilder() to construct.
  private BatchRecognizeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchRecognizeResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchRecognizeResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.speech.v2.CloudSpeechProto
        .internal_static_google_cloud_speech_v2_BatchRecognizeResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 1:
        return internalGetResults();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v2.CloudSpeechProto
        .internal_static_google_cloud_speech_v2_BatchRecognizeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v2.BatchRecognizeResponse.class,
            com.google.cloud.speech.v2.BatchRecognizeResponse.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 1;

  private static final class ResultsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
            java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
                    newDefaultInstance(
                        com.google.cloud.speech.v2.CloudSpeechProto
                            .internal_static_google_cloud_speech_v2_BatchRecognizeResponse_ResultsEntry_descriptor,
                        com.google.protobuf.WireFormat.FieldType.STRING,
                        "",
                        com.google.protobuf.WireFormat.FieldType.MESSAGE,
                        com.google.cloud.speech.v2.BatchRecognizeFileResult.getDefaultInstance());
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
          java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
      results_;

  private com.google.protobuf.MapField<
          java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
      internalGetResults() {
    if (results_ == null) {
      return com.google.protobuf.MapField.emptyMapField(ResultsDefaultEntryHolder.defaultEntry);
    }
    return results_;
  }

  public int getResultsCount() {
    return internalGetResults().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Map from filename to the final result for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
   */
  @java.lang.Override
  public boolean containsResults(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetResults().getMap().containsKey(key);
  }
  /** Use {@link #getResultsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
      getResults() {
    return getResultsMap();
  }
  /**
   *
   *
   * <pre>
   * Map from filename to the final result for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
      getResultsMap() {
    return internalGetResults().getMap();
  }
  /**
   *
   *
   * <pre>
   * Map from filename to the final result for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
   */
  @java.lang.Override
  public /* nullable */ com.google.cloud.speech.v2.BatchRecognizeFileResult getResultsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.speech.v2.BatchRecognizeFileResult defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult> map =
        internalGetResults().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Map from filename to the final result for that file.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.speech.v2.BatchRecognizeFileResult getResultsOrThrow(
      java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult> map =
        internalGetResults().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int TOTAL_BILLED_DURATION_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration totalBilledDuration_;
  /**
   *
   *
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_duration = 2;</code>
   *
   * @return Whether the totalBilledDuration field is set.
   */
  @java.lang.Override
  public boolean hasTotalBilledDuration() {
    return totalBilledDuration_ != null;
  }
  /**
   *
   *
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_duration = 2;</code>
   *
   * @return The totalBilledDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getTotalBilledDuration() {
    return totalBilledDuration_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : totalBilledDuration_;
  }
  /**
   *
   *
   * <pre>
   * When available, billed audio seconds for the corresponding request.
   * </pre>
   *
   * <code>.google.protobuf.Duration total_billed_duration = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getTotalBilledDurationOrBuilder() {
    return totalBilledDuration_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : totalBilledDuration_;
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetResults(), ResultsDefaultEntryHolder.defaultEntry, 1);
    if (totalBilledDuration_ != null) {
      output.writeMessage(2, getTotalBilledDuration());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
        entry : internalGetResults().getMap().entrySet()) {
      com.google.protobuf.MapEntry<
              java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
          results__ =
              ResultsDefaultEntryHolder.defaultEntry
                  .newBuilderForType()
                  .setKey(entry.getKey())
                  .setValue(entry.getValue())
                  .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, results__);
    }
    if (totalBilledDuration_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTotalBilledDuration());
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
    if (!(obj instanceof com.google.cloud.speech.v2.BatchRecognizeResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v2.BatchRecognizeResponse other =
        (com.google.cloud.speech.v2.BatchRecognizeResponse) obj;

    if (!internalGetResults().equals(other.internalGetResults())) return false;
    if (hasTotalBilledDuration() != other.hasTotalBilledDuration()) return false;
    if (hasTotalBilledDuration()) {
      if (!getTotalBilledDuration().equals(other.getTotalBilledDuration())) return false;
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
    if (!internalGetResults().getMap().isEmpty()) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetResults().hashCode();
    }
    if (hasTotalBilledDuration()) {
      hash = (37 * hash) + TOTAL_BILLED_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getTotalBilledDuration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v2.BatchRecognizeResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.speech.v2.BatchRecognizeResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.speech.v2.BatchRecognizeResponse prototype) {
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
   * Response message for
   * [BatchRecognize][google.cloud.speech.v2.Speech.BatchRecognize] that is
   * packaged into a longrunning [Operation][google.longrunning.Operation].
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v2.BatchRecognizeResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v2.BatchRecognizeResponse)
      com.google.cloud.speech.v2.BatchRecognizeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_BatchRecognizeResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 1:
          return internalGetResults();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMutableResults();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_BatchRecognizeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v2.BatchRecognizeResponse.class,
              com.google.cloud.speech.v2.BatchRecognizeResponse.Builder.class);
    }

    // Construct using com.google.cloud.speech.v2.BatchRecognizeResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableResults().clear();
      totalBilledDuration_ = null;
      if (totalBilledDurationBuilder_ != null) {
        totalBilledDurationBuilder_.dispose();
        totalBilledDurationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.speech.v2.CloudSpeechProto
          .internal_static_google_cloud_speech_v2_BatchRecognizeResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.BatchRecognizeResponse getDefaultInstanceForType() {
      return com.google.cloud.speech.v2.BatchRecognizeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.BatchRecognizeResponse build() {
      com.google.cloud.speech.v2.BatchRecognizeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.speech.v2.BatchRecognizeResponse buildPartial() {
      com.google.cloud.speech.v2.BatchRecognizeResponse result =
          new com.google.cloud.speech.v2.BatchRecognizeResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.speech.v2.BatchRecognizeResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.results_ = internalGetResults();
        result.results_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.totalBilledDuration_ =
            totalBilledDurationBuilder_ == null
                ? totalBilledDuration_
                : totalBilledDurationBuilder_.build();
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
      if (other instanceof com.google.cloud.speech.v2.BatchRecognizeResponse) {
        return mergeFrom((com.google.cloud.speech.v2.BatchRecognizeResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v2.BatchRecognizeResponse other) {
      if (other == com.google.cloud.speech.v2.BatchRecognizeResponse.getDefaultInstance())
        return this;
      internalGetMutableResults().mergeFrom(other.internalGetResults());
      bitField0_ |= 0x00000001;
      if (other.hasTotalBilledDuration()) {
        mergeTotalBilledDuration(other.getTotalBilledDuration());
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
                com.google.protobuf.MapEntry<
                        java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
                    results__ =
                        input.readMessage(
                            ResultsDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                internalGetMutableResults()
                    .getMutableMap()
                    .put(results__.getKey(), results__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getTotalBilledDurationFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
        results_;

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
        internalGetResults() {
      if (results_ == null) {
        return com.google.protobuf.MapField.emptyMapField(ResultsDefaultEntryHolder.defaultEntry);
      }
      return results_;
    }

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
        internalGetMutableResults() {
      if (results_ == null) {
        results_ = com.google.protobuf.MapField.newMapField(ResultsDefaultEntryHolder.defaultEntry);
      }
      if (!results_.isMutable()) {
        results_ = results_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return results_;
    }

    public int getResultsCount() {
      return internalGetResults().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Map from filename to the final result for that file.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
     */
    @java.lang.Override
    public boolean containsResults(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetResults().getMap().containsKey(key);
    }
    /** Use {@link #getResultsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
        getResults() {
      return getResultsMap();
    }
    /**
     *
     *
     * <pre>
     * Map from filename to the final result for that file.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
        getResultsMap() {
      return internalGetResults().getMap();
    }
    /**
     *
     *
     * <pre>
     * Map from filename to the final result for that file.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
     */
    @java.lang.Override
    public /* nullable */ com.google.cloud.speech.v2.BatchRecognizeFileResult getResultsOrDefault(
        java.lang.String key,
        /* nullable */
        com.google.cloud.speech.v2.BatchRecognizeFileResult defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult> map =
          internalGetResults().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Map from filename to the final result for that file.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.speech.v2.BatchRecognizeFileResult getResultsOrThrow(
        java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult> map =
          internalGetResults().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearResults() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableResults().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map from filename to the final result for that file.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
     */
    public Builder removeResults(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableResults().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
        getMutableResults() {
      bitField0_ |= 0x00000001;
      return internalGetMutableResults().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Map from filename to the final result for that file.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
     */
    public Builder putResults(
        java.lang.String key, com.google.cloud.speech.v2.BatchRecognizeFileResult value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableResults().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map from filename to the final result for that file.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.speech.v2.BatchRecognizeFileResult&gt; results = 1;</code>
     */
    public Builder putAllResults(
        java.util.Map<java.lang.String, com.google.cloud.speech.v2.BatchRecognizeFileResult>
            values) {
      internalGetMutableResults().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private com.google.protobuf.Duration totalBilledDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        totalBilledDurationBuilder_;
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 2;</code>
     *
     * @return Whether the totalBilledDuration field is set.
     */
    public boolean hasTotalBilledDuration() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 2;</code>
     *
     * @return The totalBilledDuration.
     */
    public com.google.protobuf.Duration getTotalBilledDuration() {
      if (totalBilledDurationBuilder_ == null) {
        return totalBilledDuration_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : totalBilledDuration_;
      } else {
        return totalBilledDurationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 2;</code>
     */
    public Builder setTotalBilledDuration(com.google.protobuf.Duration value) {
      if (totalBilledDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        totalBilledDuration_ = value;
      } else {
        totalBilledDurationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 2;</code>
     */
    public Builder setTotalBilledDuration(com.google.protobuf.Duration.Builder builderForValue) {
      if (totalBilledDurationBuilder_ == null) {
        totalBilledDuration_ = builderForValue.build();
      } else {
        totalBilledDurationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 2;</code>
     */
    public Builder mergeTotalBilledDuration(com.google.protobuf.Duration value) {
      if (totalBilledDurationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && totalBilledDuration_ != null
            && totalBilledDuration_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getTotalBilledDurationBuilder().mergeFrom(value);
        } else {
          totalBilledDuration_ = value;
        }
      } else {
        totalBilledDurationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 2;</code>
     */
    public Builder clearTotalBilledDuration() {
      bitField0_ = (bitField0_ & ~0x00000002);
      totalBilledDuration_ = null;
      if (totalBilledDurationBuilder_ != null) {
        totalBilledDurationBuilder_.dispose();
        totalBilledDurationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getTotalBilledDurationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTotalBilledDurationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getTotalBilledDurationOrBuilder() {
      if (totalBilledDurationBuilder_ != null) {
        return totalBilledDurationBuilder_.getMessageOrBuilder();
      } else {
        return totalBilledDuration_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : totalBilledDuration_;
      }
    }
    /**
     *
     *
     * <pre>
     * When available, billed audio seconds for the corresponding request.
     * </pre>
     *
     * <code>.google.protobuf.Duration total_billed_duration = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getTotalBilledDurationFieldBuilder() {
      if (totalBilledDurationBuilder_ == null) {
        totalBilledDurationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getTotalBilledDuration(), getParentForChildren(), isClean());
        totalBilledDuration_ = null;
      }
      return totalBilledDurationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v2.BatchRecognizeResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v2.BatchRecognizeResponse)
  private static final com.google.cloud.speech.v2.BatchRecognizeResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v2.BatchRecognizeResponse();
  }

  public static com.google.cloud.speech.v2.BatchRecognizeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchRecognizeResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchRecognizeResponse>() {
        @java.lang.Override
        public BatchRecognizeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchRecognizeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchRecognizeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.speech.v2.BatchRecognizeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
