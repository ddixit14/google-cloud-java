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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Replace each input value with a given `Value`.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.ReplaceValueConfig}
 */
public final class ReplaceValueConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.ReplaceValueConfig)
    ReplaceValueConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReplaceValueConfig.newBuilder() to construct.
  private ReplaceValueConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReplaceValueConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReplaceValueConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ReplaceValueConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ReplaceValueConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.ReplaceValueConfig.class,
            com.google.privacy.dlp.v2.ReplaceValueConfig.Builder.class);
  }

  public static final int NEW_VALUE_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.Value newValue_;
  /**
   *
   *
   * <pre>
   * Value to replace it with.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
   *
   * @return Whether the newValue field is set.
   */
  @java.lang.Override
  public boolean hasNewValue() {
    return newValue_ != null;
  }
  /**
   *
   *
   * <pre>
   * Value to replace it with.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
   *
   * @return The newValue.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.Value getNewValue() {
    return newValue_ == null ? com.google.privacy.dlp.v2.Value.getDefaultInstance() : newValue_;
  }
  /**
   *
   *
   * <pre>
   * Value to replace it with.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.ValueOrBuilder getNewValueOrBuilder() {
    return newValue_ == null ? com.google.privacy.dlp.v2.Value.getDefaultInstance() : newValue_;
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
    if (newValue_ != null) {
      output.writeMessage(1, getNewValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (newValue_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getNewValue());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.ReplaceValueConfig)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.ReplaceValueConfig other =
        (com.google.privacy.dlp.v2.ReplaceValueConfig) obj;

    if (hasNewValue() != other.hasNewValue()) return false;
    if (hasNewValue()) {
      if (!getNewValue().equals(other.getNewValue())) return false;
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
    if (hasNewValue()) {
      hash = (37 * hash) + NEW_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getNewValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.ReplaceValueConfig prototype) {
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
   * Replace each input value with a given `Value`.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.ReplaceValueConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.ReplaceValueConfig)
      com.google.privacy.dlp.v2.ReplaceValueConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ReplaceValueConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ReplaceValueConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.ReplaceValueConfig.class,
              com.google.privacy.dlp.v2.ReplaceValueConfig.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.ReplaceValueConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      newValue_ = null;
      if (newValueBuilder_ != null) {
        newValueBuilder_.dispose();
        newValueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ReplaceValueConfig_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ReplaceValueConfig getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.ReplaceValueConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ReplaceValueConfig build() {
      com.google.privacy.dlp.v2.ReplaceValueConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ReplaceValueConfig buildPartial() {
      com.google.privacy.dlp.v2.ReplaceValueConfig result =
          new com.google.privacy.dlp.v2.ReplaceValueConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.ReplaceValueConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.newValue_ = newValueBuilder_ == null ? newValue_ : newValueBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.ReplaceValueConfig) {
        return mergeFrom((com.google.privacy.dlp.v2.ReplaceValueConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.ReplaceValueConfig other) {
      if (other == com.google.privacy.dlp.v2.ReplaceValueConfig.getDefaultInstance()) return this;
      if (other.hasNewValue()) {
        mergeNewValue(other.getNewValue());
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
                input.readMessage(getNewValueFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.privacy.dlp.v2.Value newValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.Value,
            com.google.privacy.dlp.v2.Value.Builder,
            com.google.privacy.dlp.v2.ValueOrBuilder>
        newValueBuilder_;
    /**
     *
     *
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     *
     * @return Whether the newValue field is set.
     */
    public boolean hasNewValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     *
     * @return The newValue.
     */
    public com.google.privacy.dlp.v2.Value getNewValue() {
      if (newValueBuilder_ == null) {
        return newValue_ == null ? com.google.privacy.dlp.v2.Value.getDefaultInstance() : newValue_;
      } else {
        return newValueBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    public Builder setNewValue(com.google.privacy.dlp.v2.Value value) {
      if (newValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        newValue_ = value;
      } else {
        newValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    public Builder setNewValue(com.google.privacy.dlp.v2.Value.Builder builderForValue) {
      if (newValueBuilder_ == null) {
        newValue_ = builderForValue.build();
      } else {
        newValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    public Builder mergeNewValue(com.google.privacy.dlp.v2.Value value) {
      if (newValueBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && newValue_ != null
            && newValue_ != com.google.privacy.dlp.v2.Value.getDefaultInstance()) {
          getNewValueBuilder().mergeFrom(value);
        } else {
          newValue_ = value;
        }
      } else {
        newValueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    public Builder clearNewValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      newValue_ = null;
      if (newValueBuilder_ != null) {
        newValueBuilder_.dispose();
        newValueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    public com.google.privacy.dlp.v2.Value.Builder getNewValueBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNewValueFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    public com.google.privacy.dlp.v2.ValueOrBuilder getNewValueOrBuilder() {
      if (newValueBuilder_ != null) {
        return newValueBuilder_.getMessageOrBuilder();
      } else {
        return newValue_ == null ? com.google.privacy.dlp.v2.Value.getDefaultInstance() : newValue_;
      }
    }
    /**
     *
     *
     * <pre>
     * Value to replace it with.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.Value new_value = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.Value,
            com.google.privacy.dlp.v2.Value.Builder,
            com.google.privacy.dlp.v2.ValueOrBuilder>
        getNewValueFieldBuilder() {
      if (newValueBuilder_ == null) {
        newValueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.Value,
                com.google.privacy.dlp.v2.Value.Builder,
                com.google.privacy.dlp.v2.ValueOrBuilder>(
                getNewValue(), getParentForChildren(), isClean());
        newValue_ = null;
      }
      return newValueBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.ReplaceValueConfig)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.ReplaceValueConfig)
  private static final com.google.privacy.dlp.v2.ReplaceValueConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.ReplaceValueConfig();
  }

  public static com.google.privacy.dlp.v2.ReplaceValueConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplaceValueConfig> PARSER =
      new com.google.protobuf.AbstractParser<ReplaceValueConfig>() {
        @java.lang.Override
        public ReplaceValueConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReplaceValueConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplaceValueConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.ReplaceValueConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
