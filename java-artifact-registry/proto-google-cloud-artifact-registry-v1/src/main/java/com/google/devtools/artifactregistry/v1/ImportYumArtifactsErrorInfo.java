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
// source: google/devtools/artifactregistry/v1/yum_artifact.proto

package com.google.devtools.artifactregistry.v1;

/**
 *
 *
 * <pre>
 * Error information explaining why a package was not imported.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo}
 */
public final class ImportYumArtifactsErrorInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo)
    ImportYumArtifactsErrorInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportYumArtifactsErrorInfo.newBuilder() to construct.
  private ImportYumArtifactsErrorInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportYumArtifactsErrorInfo() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportYumArtifactsErrorInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.artifactregistry.v1.YumArtifactProto
        .internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1.YumArtifactProto
        .internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo.class,
            com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo.Builder.class);
  }

  private int sourceCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object source_;

  public enum SourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_SOURCE(1),
    SOURCE_NOT_SET(0);
    private final int value;

    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 1:
          return GCS_SOURCE;
        case 0:
          return SOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase getSourceCase() {
    return SourceCase.forNumber(sourceCase_);
  }

  public static final int GCS_SOURCE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Google Cloud Storage location requested.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  @java.lang.Override
  public boolean hasGcsSource() {
    return sourceCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Google Cloud Storage location requested.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource getGcsSource() {
    if (sourceCase_ == 1) {
      return (com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource) source_;
    }
    return com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Google Cloud Storage location requested.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource gcs_source = 1;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSourceOrBuilder
      getGcsSourceOrBuilder() {
    if (sourceCase_ == 1) {
      return (com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource) source_;
    }
    return com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource.getDefaultInstance();
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private com.google.rpc.Status error_;
  /**
   *
   *
   * <pre>
   * The detailed error status.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   *
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return error_ != null;
  }
  /**
   *
   *
   * <pre>
   * The detailed error status.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   *
   * @return The error.
   */
  @java.lang.Override
  public com.google.rpc.Status getError() {
    return error_ == null ? com.google.rpc.Status.getDefaultInstance() : error_;
  }
  /**
   *
   *
   * <pre>
   * The detailed error status.
   * </pre>
   *
   * <code>.google.rpc.Status error = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getErrorOrBuilder() {
    return error_ == null ? com.google.rpc.Status.getDefaultInstance() : error_;
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
    if (sourceCase_ == 1) {
      output.writeMessage(
          1, (com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource) source_);
    }
    if (error_ != null) {
      output.writeMessage(2, getError());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource) source_);
    }
    if (error_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getError());
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo other =
        (com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo) obj;

    if (hasError() != other.hasError()) return false;
    if (hasError()) {
      if (!getError().equals(other.getError())) return false;
    }
    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 1:
        if (!getGcsSource().equals(other.getGcsSource())) return false;
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
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    switch (sourceCase_) {
      case 1:
        hash = (37 * hash) + GCS_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getGcsSource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo parseFrom(
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
      com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo prototype) {
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
   * Error information explaining why a package was not imported.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo)
      com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.artifactregistry.v1.YumArtifactProto
          .internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1.YumArtifactProto
          .internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo.class,
              com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo.Builder.class);
    }

    // Construct using
    // com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (gcsSourceBuilder_ != null) {
        gcsSourceBuilder_.clear();
      }
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1.YumArtifactProto
          .internal_static_google_devtools_artifactregistry_v1_ImportYumArtifactsErrorInfo_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo
        getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo build() {
      com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo buildPartial() {
      com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo result =
          new com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.error_ = errorBuilder_ == null ? error_ : errorBuilder_.build();
      }
    }

    private void buildPartialOneofs(
        com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo result) {
      result.sourceCase_ = sourceCase_;
      result.source_ = this.source_;
      if (sourceCase_ == 1 && gcsSourceBuilder_ != null) {
        result.source_ = gcsSourceBuilder_.build();
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
      if (other instanceof com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo) {
        return mergeFrom(
            (com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo other) {
      if (other
          == com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo
              .getDefaultInstance()) return this;
      if (other.hasError()) {
        mergeError(other.getError());
      }
      switch (other.getSourceCase()) {
        case GCS_SOURCE:
          {
            mergeGcsSource(other.getGcsSource());
            break;
          }
        case SOURCE_NOT_SET:
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
            case 10:
              {
                input.readMessage(getGcsSourceFieldBuilder().getBuilder(), extensionRegistry);
                sourceCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getErrorFieldBuilder().getBuilder(), extensionRegistry);
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

    private int sourceCase_ = 0;
    private java.lang.Object source_;

    public SourceCase getSourceCase() {
      return SourceCase.forNumber(sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource,
            com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource.Builder,
            com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSourceOrBuilder>
        gcsSourceBuilder_;
    /**
     *
     *
     * <pre>
     * Google Cloud Storage location requested.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource gcs_source = 1;</code>
     *
     * @return Whether the gcsSource field is set.
     */
    @java.lang.Override
    public boolean hasGcsSource() {
      return sourceCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage location requested.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource gcs_source = 1;</code>
     *
     * @return The gcsSource.
     */
    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource getGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1) {
          return (com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource) source_;
        }
        return com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource
            .getDefaultInstance();
      } else {
        if (sourceCase_ == 1) {
          return gcsSourceBuilder_.getMessage();
        }
        return com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource
            .getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage location requested.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(
        com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage location requested.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(
        com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource.Builder
            builderForValue) {
      if (gcsSourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage location requested.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource gcs_source = 1;</code>
     */
    public Builder mergeGcsSource(
        com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1
            && source_
                != com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource
                    .getDefaultInstance()) {
          source_ =
              com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource.newBuilder(
                      (com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource) source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 1) {
          gcsSourceBuilder_.mergeFrom(value);
        } else {
          gcsSourceBuilder_.setMessage(value);
        }
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage location requested.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource gcs_source = 1;</code>
     */
    public Builder clearGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
        }
        gcsSourceBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage location requested.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource gcs_source = 1;</code>
     */
    public com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource.Builder
        getGcsSourceBuilder() {
      return getGcsSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage location requested.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource gcs_source = 1;</code>
     */
    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSourceOrBuilder
        getGcsSourceOrBuilder() {
      if ((sourceCase_ == 1) && (gcsSourceBuilder_ != null)) {
        return gcsSourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 1) {
          return (com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource) source_;
        }
        return com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource
            .getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Google Cloud Storage location requested.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource gcs_source = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource,
            com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource.Builder,
            com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSourceOrBuilder>
        getGcsSourceFieldBuilder() {
      if (gcsSourceBuilder_ == null) {
        if (!(sourceCase_ == 1)) {
          source_ =
              com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource
                  .getDefaultInstance();
        }
        gcsSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource,
                com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource.Builder,
                com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSourceOrBuilder>(
                (com.google.devtools.artifactregistry.v1.ImportYumArtifactsGcsSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 1;
      onChanged();
      return gcsSourceBuilder_;
    }

    private com.google.rpc.Status error_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        errorBuilder_;
    /**
     *
     *
     * <pre>
     * The detailed error status.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     *
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The detailed error status.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     *
     * @return The error.
     */
    public com.google.rpc.Status getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.google.rpc.Status.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The detailed error status.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     */
    public Builder setError(com.google.rpc.Status value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
      } else {
        errorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detailed error status.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     */
    public Builder setError(com.google.rpc.Status.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detailed error status.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     */
    public Builder mergeError(com.google.rpc.Status value) {
      if (errorBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && error_ != null
            && error_ != com.google.rpc.Status.getDefaultInstance()) {
          getErrorBuilder().mergeFrom(value);
        } else {
          error_ = value;
        }
      } else {
        errorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detailed error status.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     */
    public Builder clearError() {
      bitField0_ = (bitField0_ & ~0x00000002);
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The detailed error status.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     */
    public com.google.rpc.Status.Builder getErrorBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The detailed error status.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     */
    public com.google.rpc.StatusOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ? com.google.rpc.Status.getDefaultInstance() : error_;
      }
    }
    /**
     *
     *
     * <pre>
     * The detailed error status.
     * </pre>
     *
     * <code>.google.rpc.Status error = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(getError(), getParentForChildren(), isClean());
        error_ = null;
      }
      return errorBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo)
  private static final com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo();
  }

  public static com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportYumArtifactsErrorInfo> PARSER =
      new com.google.protobuf.AbstractParser<ImportYumArtifactsErrorInfo>() {
        @java.lang.Override
        public ImportYumArtifactsErrorInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportYumArtifactsErrorInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportYumArtifactsErrorInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.ImportYumArtifactsErrorInfo
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
