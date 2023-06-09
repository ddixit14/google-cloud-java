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
// source: google/cloud/automl/v1beta1/data_items.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * A representation of an image.
 * Only images up to 30MB in size are supported.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.Image}
 */
public final class Image extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.Image)
    ImageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Image.newBuilder() to construct.
  private Image(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Image() {
    thumbnailUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Image();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1beta1.DataItems
        .internal_static_google_cloud_automl_v1beta1_Image_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.DataItems
        .internal_static_google_cloud_automl_v1beta1_Image_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.Image.class,
            com.google.cloud.automl.v1beta1.Image.Builder.class);
  }

  private int dataCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object data_;

  public enum DataCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    IMAGE_BYTES(1),
    INPUT_CONFIG(6),
    DATA_NOT_SET(0);
    private final int value;

    private DataCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataCase valueOf(int value) {
      return forNumber(value);
    }

    public static DataCase forNumber(int value) {
      switch (value) {
        case 1:
          return IMAGE_BYTES;
        case 6:
          return INPUT_CONFIG;
        case 0:
          return DATA_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public DataCase getDataCase() {
    return DataCase.forNumber(dataCase_);
  }

  public static final int IMAGE_BYTES_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Image content represented as a stream of bytes.
   * Note: As with all `bytes` fields, protobuffers use a pure binary
   * representation, whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes image_bytes = 1;</code>
   *
   * @return Whether the imageBytes field is set.
   */
  @java.lang.Override
  public boolean hasImageBytes() {
    return dataCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Image content represented as a stream of bytes.
   * Note: As with all `bytes` fields, protobuffers use a pure binary
   * representation, whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes image_bytes = 1;</code>
   *
   * @return The imageBytes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getImageBytes() {
    if (dataCase_ == 1) {
      return (com.google.protobuf.ByteString) data_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int INPUT_CONFIG_FIELD_NUMBER = 6;
  /**
   *
   *
   * <pre>
   * An input config specifying the content of the image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
   *
   * @return Whether the inputConfig field is set.
   */
  @java.lang.Override
  public boolean hasInputConfig() {
    return dataCase_ == 6;
  }
  /**
   *
   *
   * <pre>
   * An input config specifying the content of the image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
   *
   * @return The inputConfig.
   */
  @java.lang.Override
  public com.google.cloud.automl.v1beta1.InputConfig getInputConfig() {
    if (dataCase_ == 6) {
      return (com.google.cloud.automl.v1beta1.InputConfig) data_;
    }
    return com.google.cloud.automl.v1beta1.InputConfig.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * An input config specifying the content of the image.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
   */
  @java.lang.Override
  public com.google.cloud.automl.v1beta1.InputConfigOrBuilder getInputConfigOrBuilder() {
    if (dataCase_ == 6) {
      return (com.google.cloud.automl.v1beta1.InputConfig) data_;
    }
    return com.google.cloud.automl.v1beta1.InputConfig.getDefaultInstance();
  }

  public static final int THUMBNAIL_URI_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object thumbnailUri_ = "";
  /**
   *
   *
   * <pre>
   * Output only. HTTP URI to the thumbnail image.
   * </pre>
   *
   * <code>string thumbnail_uri = 4;</code>
   *
   * @return The thumbnailUri.
   */
  @java.lang.Override
  public java.lang.String getThumbnailUri() {
    java.lang.Object ref = thumbnailUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      thumbnailUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. HTTP URI to the thumbnail image.
   * </pre>
   *
   * <code>string thumbnail_uri = 4;</code>
   *
   * @return The bytes for thumbnailUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getThumbnailUriBytes() {
    java.lang.Object ref = thumbnailUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      thumbnailUri_ = b;
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
    if (dataCase_ == 1) {
      output.writeBytes(1, (com.google.protobuf.ByteString) data_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(thumbnailUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, thumbnailUri_);
    }
    if (dataCase_ == 6) {
      output.writeMessage(6, (com.google.cloud.automl.v1beta1.InputConfig) data_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              1, (com.google.protobuf.ByteString) data_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(thumbnailUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, thumbnailUri_);
    }
    if (dataCase_ == 6) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              6, (com.google.cloud.automl.v1beta1.InputConfig) data_);
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.Image)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.Image other = (com.google.cloud.automl.v1beta1.Image) obj;

    if (!getThumbnailUri().equals(other.getThumbnailUri())) return false;
    if (!getDataCase().equals(other.getDataCase())) return false;
    switch (dataCase_) {
      case 1:
        if (!getImageBytes().equals(other.getImageBytes())) return false;
        break;
      case 6:
        if (!getInputConfig().equals(other.getInputConfig())) return false;
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
    hash = (37 * hash) + THUMBNAIL_URI_FIELD_NUMBER;
    hash = (53 * hash) + getThumbnailUri().hashCode();
    switch (dataCase_) {
      case 1:
        hash = (37 * hash) + IMAGE_BYTES_FIELD_NUMBER;
        hash = (53 * hash) + getImageBytes().hashCode();
        break;
      case 6:
        hash = (37 * hash) + INPUT_CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getInputConfig().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.Image parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.Image parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.Image parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.Image parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.Image parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.Image parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.Image parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.Image parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.Image parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.Image parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.Image parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.Image parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1beta1.Image prototype) {
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
   * A representation of an image.
   * Only images up to 30MB in size are supported.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.Image}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.Image)
      com.google.cloud.automl.v1beta1.ImageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.DataItems
          .internal_static_google_cloud_automl_v1beta1_Image_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.DataItems
          .internal_static_google_cloud_automl_v1beta1_Image_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.Image.class,
              com.google.cloud.automl.v1beta1.Image.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.Image.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (inputConfigBuilder_ != null) {
        inputConfigBuilder_.clear();
      }
      thumbnailUri_ = "";
      dataCase_ = 0;
      data_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.DataItems
          .internal_static_google_cloud_automl_v1beta1_Image_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.Image getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.Image.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.Image build() {
      com.google.cloud.automl.v1beta1.Image result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.Image buildPartial() {
      com.google.cloud.automl.v1beta1.Image result =
          new com.google.cloud.automl.v1beta1.Image(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.automl.v1beta1.Image result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.thumbnailUri_ = thumbnailUri_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.automl.v1beta1.Image result) {
      result.dataCase_ = dataCase_;
      result.data_ = this.data_;
      if (dataCase_ == 6 && inputConfigBuilder_ != null) {
        result.data_ = inputConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.automl.v1beta1.Image) {
        return mergeFrom((com.google.cloud.automl.v1beta1.Image) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.Image other) {
      if (other == com.google.cloud.automl.v1beta1.Image.getDefaultInstance()) return this;
      if (!other.getThumbnailUri().isEmpty()) {
        thumbnailUri_ = other.thumbnailUri_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      switch (other.getDataCase()) {
        case IMAGE_BYTES:
          {
            setImageBytes(other.getImageBytes());
            break;
          }
        case INPUT_CONFIG:
          {
            mergeInputConfig(other.getInputConfig());
            break;
          }
        case DATA_NOT_SET:
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
                data_ = input.readBytes();
                dataCase_ = 1;
                break;
              } // case 10
            case 34:
              {
                thumbnailUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 34
            case 50:
              {
                input.readMessage(getInputConfigFieldBuilder().getBuilder(), extensionRegistry);
                dataCase_ = 6;
                break;
              } // case 50
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

    private int dataCase_ = 0;
    private java.lang.Object data_;

    public DataCase getDataCase() {
      return DataCase.forNumber(dataCase_);
    }

    public Builder clearData() {
      dataCase_ = 0;
      data_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Image content represented as a stream of bytes.
     * Note: As with all `bytes` fields, protobuffers use a pure binary
     * representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes image_bytes = 1;</code>
     *
     * @return Whether the imageBytes field is set.
     */
    public boolean hasImageBytes() {
      return dataCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Image content represented as a stream of bytes.
     * Note: As with all `bytes` fields, protobuffers use a pure binary
     * representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes image_bytes = 1;</code>
     *
     * @return The imageBytes.
     */
    public com.google.protobuf.ByteString getImageBytes() {
      if (dataCase_ == 1) {
        return (com.google.protobuf.ByteString) data_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     *
     *
     * <pre>
     * Image content represented as a stream of bytes.
     * Note: As with all `bytes` fields, protobuffers use a pure binary
     * representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes image_bytes = 1;</code>
     *
     * @param value The imageBytes to set.
     * @return This builder for chaining.
     */
    public Builder setImageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      dataCase_ = 1;
      data_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Image content represented as a stream of bytes.
     * Note: As with all `bytes` fields, protobuffers use a pure binary
     * representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes image_bytes = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImageBytes() {
      if (dataCase_ == 1) {
        dataCase_ = 0;
        data_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.InputConfig,
            com.google.cloud.automl.v1beta1.InputConfig.Builder,
            com.google.cloud.automl.v1beta1.InputConfigOrBuilder>
        inputConfigBuilder_;
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
     *
     * @return Whether the inputConfig field is set.
     */
    @java.lang.Override
    public boolean hasInputConfig() {
      return dataCase_ == 6;
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
     *
     * @return The inputConfig.
     */
    @java.lang.Override
    public com.google.cloud.automl.v1beta1.InputConfig getInputConfig() {
      if (inputConfigBuilder_ == null) {
        if (dataCase_ == 6) {
          return (com.google.cloud.automl.v1beta1.InputConfig) data_;
        }
        return com.google.cloud.automl.v1beta1.InputConfig.getDefaultInstance();
      } else {
        if (dataCase_ == 6) {
          return inputConfigBuilder_.getMessage();
        }
        return com.google.cloud.automl.v1beta1.InputConfig.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
     */
    public Builder setInputConfig(com.google.cloud.automl.v1beta1.InputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        inputConfigBuilder_.setMessage(value);
      }
      dataCase_ = 6;
      return this;
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
     */
    public Builder setInputConfig(
        com.google.cloud.automl.v1beta1.InputConfig.Builder builderForValue) {
      if (inputConfigBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        inputConfigBuilder_.setMessage(builderForValue.build());
      }
      dataCase_ = 6;
      return this;
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
     */
    public Builder mergeInputConfig(com.google.cloud.automl.v1beta1.InputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (dataCase_ == 6
            && data_ != com.google.cloud.automl.v1beta1.InputConfig.getDefaultInstance()) {
          data_ =
              com.google.cloud.automl.v1beta1.InputConfig.newBuilder(
                      (com.google.cloud.automl.v1beta1.InputConfig) data_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        if (dataCase_ == 6) {
          inputConfigBuilder_.mergeFrom(value);
        } else {
          inputConfigBuilder_.setMessage(value);
        }
      }
      dataCase_ = 6;
      return this;
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
     */
    public Builder clearInputConfig() {
      if (inputConfigBuilder_ == null) {
        if (dataCase_ == 6) {
          dataCase_ = 0;
          data_ = null;
          onChanged();
        }
      } else {
        if (dataCase_ == 6) {
          dataCase_ = 0;
          data_ = null;
        }
        inputConfigBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
     */
    public com.google.cloud.automl.v1beta1.InputConfig.Builder getInputConfigBuilder() {
      return getInputConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
     */
    @java.lang.Override
    public com.google.cloud.automl.v1beta1.InputConfigOrBuilder getInputConfigOrBuilder() {
      if ((dataCase_ == 6) && (inputConfigBuilder_ != null)) {
        return inputConfigBuilder_.getMessageOrBuilder();
      } else {
        if (dataCase_ == 6) {
          return (com.google.cloud.automl.v1beta1.InputConfig) data_;
        }
        return com.google.cloud.automl.v1beta1.InputConfig.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * An input config specifying the content of the image.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 6;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.InputConfig,
            com.google.cloud.automl.v1beta1.InputConfig.Builder,
            com.google.cloud.automl.v1beta1.InputConfigOrBuilder>
        getInputConfigFieldBuilder() {
      if (inputConfigBuilder_ == null) {
        if (!(dataCase_ == 6)) {
          data_ = com.google.cloud.automl.v1beta1.InputConfig.getDefaultInstance();
        }
        inputConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1beta1.InputConfig,
                com.google.cloud.automl.v1beta1.InputConfig.Builder,
                com.google.cloud.automl.v1beta1.InputConfigOrBuilder>(
                (com.google.cloud.automl.v1beta1.InputConfig) data_,
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      dataCase_ = 6;
      onChanged();
      return inputConfigBuilder_;
    }

    private java.lang.Object thumbnailUri_ = "";
    /**
     *
     *
     * <pre>
     * Output only. HTTP URI to the thumbnail image.
     * </pre>
     *
     * <code>string thumbnail_uri = 4;</code>
     *
     * @return The thumbnailUri.
     */
    public java.lang.String getThumbnailUri() {
      java.lang.Object ref = thumbnailUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        thumbnailUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. HTTP URI to the thumbnail image.
     * </pre>
     *
     * <code>string thumbnail_uri = 4;</code>
     *
     * @return The bytes for thumbnailUri.
     */
    public com.google.protobuf.ByteString getThumbnailUriBytes() {
      java.lang.Object ref = thumbnailUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        thumbnailUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. HTTP URI to the thumbnail image.
     * </pre>
     *
     * <code>string thumbnail_uri = 4;</code>
     *
     * @param value The thumbnailUri to set.
     * @return This builder for chaining.
     */
    public Builder setThumbnailUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      thumbnailUri_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. HTTP URI to the thumbnail image.
     * </pre>
     *
     * <code>string thumbnail_uri = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearThumbnailUri() {
      thumbnailUri_ = getDefaultInstance().getThumbnailUri();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. HTTP URI to the thumbnail image.
     * </pre>
     *
     * <code>string thumbnail_uri = 4;</code>
     *
     * @param value The bytes for thumbnailUri to set.
     * @return This builder for chaining.
     */
    public Builder setThumbnailUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      thumbnailUri_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.Image)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.Image)
  private static final com.google.cloud.automl.v1beta1.Image DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.Image();
  }

  public static com.google.cloud.automl.v1beta1.Image getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Image> PARSER =
      new com.google.protobuf.AbstractParser<Image>() {
        @java.lang.Override
        public Image parsePartialFrom(
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

  public static com.google.protobuf.Parser<Image> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Image> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.Image getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
