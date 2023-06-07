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
// source: google/cloud/eventarc/v1/trigger.proto

package com.google.cloud.eventarc.v1;

/**
 *
 *
 * <pre>
 * Filters events based on exact matches on the CloudEvents attributes.
 * </pre>
 *
 * Protobuf type {@code google.cloud.eventarc.v1.EventFilter}
 */
public final class EventFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.eventarc.v1.EventFilter)
    EventFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EventFilter.newBuilder() to construct.
  private EventFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EventFilter() {
    attribute_ = "";
    value_ = "";
    operator_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EventFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.eventarc.v1.TriggerProto
        .internal_static_google_cloud_eventarc_v1_EventFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.eventarc.v1.TriggerProto
        .internal_static_google_cloud_eventarc_v1_EventFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.eventarc.v1.EventFilter.class,
            com.google.cloud.eventarc.v1.EventFilter.Builder.class);
  }

  public static final int ATTRIBUTE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object attribute_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes
   * are supported for filtering.
   *
   * All triggers MUST provide a filter for the 'type' attribute.
   * </pre>
   *
   * <code>string attribute = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The attribute.
   */
  @java.lang.Override
  public java.lang.String getAttribute() {
    java.lang.Object ref = attribute_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      attribute_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes
   * are supported for filtering.
   *
   * All triggers MUST provide a filter for the 'type' attribute.
   * </pre>
   *
   * <code>string attribute = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for attribute.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAttributeBytes() {
    java.lang.Object ref = attribute_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      attribute_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object value_ = "";
  /**
   *
   *
   * <pre>
   * Required. The value for the attribute.
   * </pre>
   *
   * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The value for the attribute.
   * </pre>
   *
   * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPERATOR_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object operator_ = "";
  /**
   *
   *
   * <pre>
   * Optional. The operator used for matching the events with the value of the
   * filter. If not specified, only events that have an exact key-value pair
   * specified in the filter are matched. The only allowed value is
   * `match-path-pattern`.
   * </pre>
   *
   * <code>string operator = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The operator.
   */
  @java.lang.Override
  public java.lang.String getOperator() {
    java.lang.Object ref = operator_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      operator_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The operator used for matching the events with the value of the
   * filter. If not specified, only events that have an exact key-value pair
   * specified in the filter are matched. The only allowed value is
   * `match-path-pattern`.
   * </pre>
   *
   * <code>string operator = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for operator.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOperatorBytes() {
    java.lang.Object ref = operator_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      operator_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attribute_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, attribute_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operator_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, operator_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attribute_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, attribute_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(operator_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, operator_);
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
    if (!(obj instanceof com.google.cloud.eventarc.v1.EventFilter)) {
      return super.equals(obj);
    }
    com.google.cloud.eventarc.v1.EventFilter other = (com.google.cloud.eventarc.v1.EventFilter) obj;

    if (!getAttribute().equals(other.getAttribute())) return false;
    if (!getValue().equals(other.getValue())) return false;
    if (!getOperator().equals(other.getOperator())) return false;
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
    hash = (37 * hash) + ATTRIBUTE_FIELD_NUMBER;
    hash = (53 * hash) + getAttribute().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
    hash = (53 * hash) + getOperator().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.eventarc.v1.EventFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.EventFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.EventFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.EventFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.EventFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.EventFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.EventFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.EventFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.EventFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.EventFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.EventFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.EventFilter parseFrom(
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

  public static Builder newBuilder(com.google.cloud.eventarc.v1.EventFilter prototype) {
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
   * Filters events based on exact matches on the CloudEvents attributes.
   * </pre>
   *
   * Protobuf type {@code google.cloud.eventarc.v1.EventFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.eventarc.v1.EventFilter)
      com.google.cloud.eventarc.v1.EventFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.eventarc.v1.TriggerProto
          .internal_static_google_cloud_eventarc_v1_EventFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.eventarc.v1.TriggerProto
          .internal_static_google_cloud_eventarc_v1_EventFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.eventarc.v1.EventFilter.class,
              com.google.cloud.eventarc.v1.EventFilter.Builder.class);
    }

    // Construct using com.google.cloud.eventarc.v1.EventFilter.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      attribute_ = "";
      value_ = "";
      operator_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.eventarc.v1.TriggerProto
          .internal_static_google_cloud_eventarc_v1_EventFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.EventFilter getDefaultInstanceForType() {
      return com.google.cloud.eventarc.v1.EventFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.EventFilter build() {
      com.google.cloud.eventarc.v1.EventFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.EventFilter buildPartial() {
      com.google.cloud.eventarc.v1.EventFilter result =
          new com.google.cloud.eventarc.v1.EventFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.eventarc.v1.EventFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attribute_ = attribute_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = value_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.operator_ = operator_;
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
      if (other instanceof com.google.cloud.eventarc.v1.EventFilter) {
        return mergeFrom((com.google.cloud.eventarc.v1.EventFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.eventarc.v1.EventFilter other) {
      if (other == com.google.cloud.eventarc.v1.EventFilter.getDefaultInstance()) return this;
      if (!other.getAttribute().isEmpty()) {
        attribute_ = other.attribute_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getOperator().isEmpty()) {
        operator_ = other.operator_;
        bitField0_ |= 0x00000004;
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
            case 10:
              {
                attribute_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                value_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                operator_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
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

    private int bitField0_;

    private java.lang.Object attribute_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes
     * are supported for filtering.
     *
     * All triggers MUST provide a filter for the 'type' attribute.
     * </pre>
     *
     * <code>string attribute = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The attribute.
     */
    public java.lang.String getAttribute() {
      java.lang.Object ref = attribute_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attribute_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes
     * are supported for filtering.
     *
     * All triggers MUST provide a filter for the 'type' attribute.
     * </pre>
     *
     * <code>string attribute = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for attribute.
     */
    public com.google.protobuf.ByteString getAttributeBytes() {
      java.lang.Object ref = attribute_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        attribute_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes
     * are supported for filtering.
     *
     * All triggers MUST provide a filter for the 'type' attribute.
     * </pre>
     *
     * <code>string attribute = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The attribute to set.
     * @return This builder for chaining.
     */
    public Builder setAttribute(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      attribute_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes
     * are supported for filtering.
     *
     * All triggers MUST provide a filter for the 'type' attribute.
     * </pre>
     *
     * <code>string attribute = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAttribute() {
      attribute_ = getDefaultInstance().getAttribute();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of a CloudEvents attribute. Currently, only a subset of attributes
     * are supported for filtering.
     *
     * All triggers MUST provide a filter for the 'type' attribute.
     * </pre>
     *
     * <code>string attribute = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for attribute to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      attribute_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     *
     *
     * <pre>
     * Required. The value for the attribute.
     * </pre>
     *
     * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The value for the attribute.
     * </pre>
     *
     * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The value for the attribute.
     * </pre>
     *
     * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      value_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The value for the attribute.
     * </pre>
     *
     * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = getDefaultInstance().getValue();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The value for the attribute.
     * </pre>
     *
     * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      value_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object operator_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The operator used for matching the events with the value of the
     * filter. If not specified, only events that have an exact key-value pair
     * specified in the filter are matched. The only allowed value is
     * `match-path-pattern`.
     * </pre>
     *
     * <code>string operator = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The operator.
     */
    public java.lang.String getOperator() {
      java.lang.Object ref = operator_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        operator_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The operator used for matching the events with the value of the
     * filter. If not specified, only events that have an exact key-value pair
     * specified in the filter are matched. The only allowed value is
     * `match-path-pattern`.
     * </pre>
     *
     * <code>string operator = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for operator.
     */
    public com.google.protobuf.ByteString getOperatorBytes() {
      java.lang.Object ref = operator_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        operator_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The operator used for matching the events with the value of the
     * filter. If not specified, only events that have an exact key-value pair
     * specified in the filter are matched. The only allowed value is
     * `match-path-pattern`.
     * </pre>
     *
     * <code>string operator = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperator(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      operator_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The operator used for matching the events with the value of the
     * filter. If not specified, only events that have an exact key-value pair
     * specified in the filter are matched. The only allowed value is
     * `match-path-pattern`.
     * </pre>
     *
     * <code>string operator = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOperator() {
      operator_ = getDefaultInstance().getOperator();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The operator used for matching the events with the value of the
     * filter. If not specified, only events that have an exact key-value pair
     * specified in the filter are matched. The only allowed value is
     * `match-path-pattern`.
     * </pre>
     *
     * <code>string operator = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      operator_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.eventarc.v1.EventFilter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.EventFilter)
  private static final com.google.cloud.eventarc.v1.EventFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.eventarc.v1.EventFilter();
  }

  public static com.google.cloud.eventarc.v1.EventFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventFilter> PARSER =
      new com.google.protobuf.AbstractParser<EventFilter>() {
        @java.lang.Override
        public EventFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.eventarc.v1.EventFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
