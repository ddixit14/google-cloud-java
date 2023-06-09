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
// source: google/cloud/notebooks/v1beta1/environment.proto

package com.google.cloud.notebooks.v1beta1;

/**
 *
 *
 * <pre>
 * Definition of a custom Compute Engine virtual machine image for starting a
 * notebook instance with the environment installed directly on the VM.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1beta1.VmImage}
 */
public final class VmImage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1beta1.VmImage)
    VmImageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VmImage.newBuilder() to construct.
  private VmImage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VmImage() {
    project_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VmImage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.notebooks.v1beta1.EnvironmentProto
        .internal_static_google_cloud_notebooks_v1beta1_VmImage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1beta1.EnvironmentProto
        .internal_static_google_cloud_notebooks_v1beta1_VmImage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1beta1.VmImage.class,
            com.google.cloud.notebooks.v1beta1.VmImage.Builder.class);
  }

  private int imageCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object image_;

  public enum ImageCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    IMAGE_NAME(2),
    IMAGE_FAMILY(3),
    IMAGE_NOT_SET(0);
    private final int value;

    private ImageCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ImageCase valueOf(int value) {
      return forNumber(value);
    }

    public static ImageCase forNumber(int value) {
      switch (value) {
        case 2:
          return IMAGE_NAME;
        case 3:
          return IMAGE_FAMILY;
        case 0:
          return IMAGE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ImageCase getImageCase() {
    return ImageCase.forNumber(imageCase_);
  }

  public static final int PROJECT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object project_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the Google Cloud project that this VM image belongs to.
   * Format: `projects/{project_id}`
   * </pre>
   *
   * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the Google Cloud project that this VM image belongs to.
   * Format: `projects/{project_id}`
   * </pre>
   *
   * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGE_NAME_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Use VM image name to find the image.
   * </pre>
   *
   * <code>string image_name = 2;</code>
   *
   * @return Whether the imageName field is set.
   */
  public boolean hasImageName() {
    return imageCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Use VM image name to find the image.
   * </pre>
   *
   * <code>string image_name = 2;</code>
   *
   * @return The imageName.
   */
  public java.lang.String getImageName() {
    java.lang.Object ref = "";
    if (imageCase_ == 2) {
      ref = image_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (imageCase_ == 2) {
        image_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Use VM image name to find the image.
   * </pre>
   *
   * <code>string image_name = 2;</code>
   *
   * @return The bytes for imageName.
   */
  public com.google.protobuf.ByteString getImageNameBytes() {
    java.lang.Object ref = "";
    if (imageCase_ == 2) {
      ref = image_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (imageCase_ == 2) {
        image_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGE_FAMILY_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Use this VM image family to find the image; the newest image in this
   * family will be used.
   * </pre>
   *
   * <code>string image_family = 3;</code>
   *
   * @return Whether the imageFamily field is set.
   */
  public boolean hasImageFamily() {
    return imageCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * Use this VM image family to find the image; the newest image in this
   * family will be used.
   * </pre>
   *
   * <code>string image_family = 3;</code>
   *
   * @return The imageFamily.
   */
  public java.lang.String getImageFamily() {
    java.lang.Object ref = "";
    if (imageCase_ == 3) {
      ref = image_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (imageCase_ == 3) {
        image_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Use this VM image family to find the image; the newest image in this
   * family will be used.
   * </pre>
   *
   * <code>string image_family = 3;</code>
   *
   * @return The bytes for imageFamily.
   */
  public com.google.protobuf.ByteString getImageFamilyBytes() {
    java.lang.Object ref = "";
    if (imageCase_ == 3) {
      ref = image_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (imageCase_ == 3) {
        image_ = b;
      }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, project_);
    }
    if (imageCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, image_);
    }
    if (imageCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, image_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, project_);
    }
    if (imageCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, image_);
    }
    if (imageCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, image_);
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
    if (!(obj instanceof com.google.cloud.notebooks.v1beta1.VmImage)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1beta1.VmImage other =
        (com.google.cloud.notebooks.v1beta1.VmImage) obj;

    if (!getProject().equals(other.getProject())) return false;
    if (!getImageCase().equals(other.getImageCase())) return false;
    switch (imageCase_) {
      case 2:
        if (!getImageName().equals(other.getImageName())) return false;
        break;
      case 3:
        if (!getImageFamily().equals(other.getImageFamily())) return false;
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
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    switch (imageCase_) {
      case 2:
        hash = (37 * hash) + IMAGE_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getImageName().hashCode();
        break;
      case 3:
        hash = (37 * hash) + IMAGE_FAMILY_FIELD_NUMBER;
        hash = (53 * hash) + getImageFamily().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1beta1.VmImage parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1beta1.VmImage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.VmImage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1beta1.VmImage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.VmImage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1beta1.VmImage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.VmImage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1beta1.VmImage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.VmImage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1beta1.VmImage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1beta1.VmImage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1beta1.VmImage parseFrom(
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

  public static Builder newBuilder(com.google.cloud.notebooks.v1beta1.VmImage prototype) {
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
   * Definition of a custom Compute Engine virtual machine image for starting a
   * notebook instance with the environment installed directly on the VM.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1beta1.VmImage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1beta1.VmImage)
      com.google.cloud.notebooks.v1beta1.VmImageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v1beta1.EnvironmentProto
          .internal_static_google_cloud_notebooks_v1beta1_VmImage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1beta1.EnvironmentProto
          .internal_static_google_cloud_notebooks_v1beta1_VmImage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1beta1.VmImage.class,
              com.google.cloud.notebooks.v1beta1.VmImage.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1beta1.VmImage.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      project_ = "";
      imageCase_ = 0;
      image_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v1beta1.EnvironmentProto
          .internal_static_google_cloud_notebooks_v1beta1_VmImage_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1beta1.VmImage getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1beta1.VmImage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1beta1.VmImage build() {
      com.google.cloud.notebooks.v1beta1.VmImage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1beta1.VmImage buildPartial() {
      com.google.cloud.notebooks.v1beta1.VmImage result =
          new com.google.cloud.notebooks.v1beta1.VmImage(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.notebooks.v1beta1.VmImage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.project_ = project_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.notebooks.v1beta1.VmImage result) {
      result.imageCase_ = imageCase_;
      result.image_ = this.image_;
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
      if (other instanceof com.google.cloud.notebooks.v1beta1.VmImage) {
        return mergeFrom((com.google.cloud.notebooks.v1beta1.VmImage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1beta1.VmImage other) {
      if (other == com.google.cloud.notebooks.v1beta1.VmImage.getDefaultInstance()) return this;
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      switch (other.getImageCase()) {
        case IMAGE_NAME:
          {
            imageCase_ = 2;
            image_ = other.image_;
            onChanged();
            break;
          }
        case IMAGE_FAMILY:
          {
            imageCase_ = 3;
            image_ = other.image_;
            onChanged();
            break;
          }
        case IMAGE_NOT_SET:
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
                project_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                imageCase_ = 2;
                image_ = s;
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                imageCase_ = 3;
                image_ = s;
                break;
              } // case 26
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

    private int imageCase_ = 0;
    private java.lang.Object image_;

    public ImageCase getImageCase() {
      return ImageCase.forNumber(imageCase_);
    }

    public Builder clearImage() {
      imageCase_ = 0;
      image_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object project_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the Google Cloud project that this VM image belongs to.
     * Format: `projects/{project_id}`
     * </pre>
     *
     * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Google Cloud project that this VM image belongs to.
     * Format: `projects/{project_id}`
     * </pre>
     *
     * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Google Cloud project that this VM image belongs to.
     * Format: `projects/{project_id}`
     * </pre>
     *
     * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      project_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Google Cloud project that this VM image belongs to.
     * Format: `projects/{project_id}`
     * </pre>
     *
     * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProject() {
      project_ = getDefaultInstance().getProject();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the Google Cloud project that this VM image belongs to.
     * Format: `projects/{project_id}`
     * </pre>
     *
     * <code>string project = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      project_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Use VM image name to find the image.
     * </pre>
     *
     * <code>string image_name = 2;</code>
     *
     * @return Whether the imageName field is set.
     */
    @java.lang.Override
    public boolean hasImageName() {
      return imageCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Use VM image name to find the image.
     * </pre>
     *
     * <code>string image_name = 2;</code>
     *
     * @return The imageName.
     */
    @java.lang.Override
    public java.lang.String getImageName() {
      java.lang.Object ref = "";
      if (imageCase_ == 2) {
        ref = image_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (imageCase_ == 2) {
          image_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Use VM image name to find the image.
     * </pre>
     *
     * <code>string image_name = 2;</code>
     *
     * @return The bytes for imageName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getImageNameBytes() {
      java.lang.Object ref = "";
      if (imageCase_ == 2) {
        ref = image_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (imageCase_ == 2) {
          image_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Use VM image name to find the image.
     * </pre>
     *
     * <code>string image_name = 2;</code>
     *
     * @param value The imageName to set.
     * @return This builder for chaining.
     */
    public Builder setImageName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      imageCase_ = 2;
      image_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Use VM image name to find the image.
     * </pre>
     *
     * <code>string image_name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImageName() {
      if (imageCase_ == 2) {
        imageCase_ = 0;
        image_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Use VM image name to find the image.
     * </pre>
     *
     * <code>string image_name = 2;</code>
     *
     * @param value The bytes for imageName to set.
     * @return This builder for chaining.
     */
    public Builder setImageNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      imageCase_ = 2;
      image_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Use this VM image family to find the image; the newest image in this
     * family will be used.
     * </pre>
     *
     * <code>string image_family = 3;</code>
     *
     * @return Whether the imageFamily field is set.
     */
    @java.lang.Override
    public boolean hasImageFamily() {
      return imageCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * Use this VM image family to find the image; the newest image in this
     * family will be used.
     * </pre>
     *
     * <code>string image_family = 3;</code>
     *
     * @return The imageFamily.
     */
    @java.lang.Override
    public java.lang.String getImageFamily() {
      java.lang.Object ref = "";
      if (imageCase_ == 3) {
        ref = image_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (imageCase_ == 3) {
          image_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Use this VM image family to find the image; the newest image in this
     * family will be used.
     * </pre>
     *
     * <code>string image_family = 3;</code>
     *
     * @return The bytes for imageFamily.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getImageFamilyBytes() {
      java.lang.Object ref = "";
      if (imageCase_ == 3) {
        ref = image_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (imageCase_ == 3) {
          image_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Use this VM image family to find the image; the newest image in this
     * family will be used.
     * </pre>
     *
     * <code>string image_family = 3;</code>
     *
     * @param value The imageFamily to set.
     * @return This builder for chaining.
     */
    public Builder setImageFamily(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      imageCase_ = 3;
      image_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Use this VM image family to find the image; the newest image in this
     * family will be used.
     * </pre>
     *
     * <code>string image_family = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImageFamily() {
      if (imageCase_ == 3) {
        imageCase_ = 0;
        image_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Use this VM image family to find the image; the newest image in this
     * family will be used.
     * </pre>
     *
     * <code>string image_family = 3;</code>
     *
     * @param value The bytes for imageFamily to set.
     * @return This builder for chaining.
     */
    public Builder setImageFamilyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      imageCase_ = 3;
      image_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1beta1.VmImage)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1beta1.VmImage)
  private static final com.google.cloud.notebooks.v1beta1.VmImage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1beta1.VmImage();
  }

  public static com.google.cloud.notebooks.v1beta1.VmImage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VmImage> PARSER =
      new com.google.protobuf.AbstractParser<VmImage>() {
        @java.lang.Override
        public VmImage parsePartialFrom(
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

  public static com.google.protobuf.Parser<VmImage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VmImage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1beta1.VmImage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
