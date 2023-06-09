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
// source: google/monitoring/dashboard/v1/xychart.proto

package com.google.monitoring.dashboard.v1;

/**
 *
 *
 * <pre>
 * Options to control visual rendering of a chart.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.dashboard.v1.ChartOptions}
 */
public final class ChartOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.dashboard.v1.ChartOptions)
    ChartOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ChartOptions.newBuilder() to construct.
  private ChartOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ChartOptions() {
    mode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ChartOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.dashboard.v1.XyChartProto
        .internal_static_google_monitoring_dashboard_v1_ChartOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.dashboard.v1.XyChartProto
        .internal_static_google_monitoring_dashboard_v1_ChartOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.dashboard.v1.ChartOptions.class,
            com.google.monitoring.dashboard.v1.ChartOptions.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Chart mode options.
   * </pre>
   *
   * Protobuf enum {@code google.monitoring.dashboard.v1.ChartOptions.Mode}
   */
  public enum Mode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Mode is unspecified. The view will default to `COLOR`.
     * </pre>
     *
     * <code>MODE_UNSPECIFIED = 0;</code>
     */
    MODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The chart distinguishes data series using different color. Line
     * colors may get reused when there are many lines in the chart.
     * </pre>
     *
     * <code>COLOR = 1;</code>
     */
    COLOR(1),
    /**
     *
     *
     * <pre>
     * The chart uses the Stackdriver x-ray mode, in which each
     * data set is plotted using the same semi-transparent color.
     * </pre>
     *
     * <code>X_RAY = 2;</code>
     */
    X_RAY(2),
    /**
     *
     *
     * <pre>
     * The chart displays statistics such as average, median, 95th percentile,
     * and more.
     * </pre>
     *
     * <code>STATS = 3;</code>
     */
    STATS(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Mode is unspecified. The view will default to `COLOR`.
     * </pre>
     *
     * <code>MODE_UNSPECIFIED = 0;</code>
     */
    public static final int MODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The chart distinguishes data series using different color. Line
     * colors may get reused when there are many lines in the chart.
     * </pre>
     *
     * <code>COLOR = 1;</code>
     */
    public static final int COLOR_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The chart uses the Stackdriver x-ray mode, in which each
     * data set is plotted using the same semi-transparent color.
     * </pre>
     *
     * <code>X_RAY = 2;</code>
     */
    public static final int X_RAY_VALUE = 2;
    /**
     *
     *
     * <pre>
     * The chart displays statistics such as average, median, 95th percentile,
     * and more.
     * </pre>
     *
     * <code>STATS = 3;</code>
     */
    public static final int STATS_VALUE = 3;

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
    public static Mode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Mode forNumber(int value) {
      switch (value) {
        case 0:
          return MODE_UNSPECIFIED;
        case 1:
          return COLOR;
        case 2:
          return X_RAY;
        case 3:
          return STATS;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Mode> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Mode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Mode>() {
          public Mode findValueByNumber(int number) {
            return Mode.forNumber(number);
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
      return com.google.monitoring.dashboard.v1.ChartOptions.getDescriptor().getEnumTypes().get(0);
    }

    private static final Mode[] VALUES = values();

    public static Mode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Mode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.monitoring.dashboard.v1.ChartOptions.Mode)
  }

  public static final int MODE_FIELD_NUMBER = 1;
  private int mode_ = 0;
  /**
   *
   *
   * <pre>
   * The chart mode.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.ChartOptions.Mode mode = 1;</code>
   *
   * @return The enum numeric value on the wire for mode.
   */
  @java.lang.Override
  public int getModeValue() {
    return mode_;
  }
  /**
   *
   *
   * <pre>
   * The chart mode.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.ChartOptions.Mode mode = 1;</code>
   *
   * @return The mode.
   */
  @java.lang.Override
  public com.google.monitoring.dashboard.v1.ChartOptions.Mode getMode() {
    com.google.monitoring.dashboard.v1.ChartOptions.Mode result =
        com.google.monitoring.dashboard.v1.ChartOptions.Mode.forNumber(mode_);
    return result == null
        ? com.google.monitoring.dashboard.v1.ChartOptions.Mode.UNRECOGNIZED
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
    if (mode_
        != com.google.monitoring.dashboard.v1.ChartOptions.Mode.MODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, mode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mode_
        != com.google.monitoring.dashboard.v1.ChartOptions.Mode.MODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, mode_);
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
    if (!(obj instanceof com.google.monitoring.dashboard.v1.ChartOptions)) {
      return super.equals(obj);
    }
    com.google.monitoring.dashboard.v1.ChartOptions other =
        (com.google.monitoring.dashboard.v1.ChartOptions) obj;

    if (mode_ != other.mode_) return false;
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
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + mode_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.dashboard.v1.ChartOptions parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.ChartOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.ChartOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.ChartOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.ChartOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.dashboard.v1.ChartOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.ChartOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.ChartOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.ChartOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.ChartOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.dashboard.v1.ChartOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.dashboard.v1.ChartOptions parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.dashboard.v1.ChartOptions prototype) {
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
   * Options to control visual rendering of a chart.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.dashboard.v1.ChartOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.dashboard.v1.ChartOptions)
      com.google.monitoring.dashboard.v1.ChartOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.dashboard.v1.XyChartProto
          .internal_static_google_monitoring_dashboard_v1_ChartOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.dashboard.v1.XyChartProto
          .internal_static_google_monitoring_dashboard_v1_ChartOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.dashboard.v1.ChartOptions.class,
              com.google.monitoring.dashboard.v1.ChartOptions.Builder.class);
    }

    // Construct using com.google.monitoring.dashboard.v1.ChartOptions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      mode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.dashboard.v1.XyChartProto
          .internal_static_google_monitoring_dashboard_v1_ChartOptions_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.ChartOptions getDefaultInstanceForType() {
      return com.google.monitoring.dashboard.v1.ChartOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.ChartOptions build() {
      com.google.monitoring.dashboard.v1.ChartOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.dashboard.v1.ChartOptions buildPartial() {
      com.google.monitoring.dashboard.v1.ChartOptions result =
          new com.google.monitoring.dashboard.v1.ChartOptions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.dashboard.v1.ChartOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mode_ = mode_;
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
      if (other instanceof com.google.monitoring.dashboard.v1.ChartOptions) {
        return mergeFrom((com.google.monitoring.dashboard.v1.ChartOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.dashboard.v1.ChartOptions other) {
      if (other == com.google.monitoring.dashboard.v1.ChartOptions.getDefaultInstance())
        return this;
      if (other.mode_ != 0) {
        setModeValue(other.getModeValue());
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
            case 8:
              {
                mode_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int mode_ = 0;
    /**
     *
     *
     * <pre>
     * The chart mode.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.ChartOptions.Mode mode = 1;</code>
     *
     * @return The enum numeric value on the wire for mode.
     */
    @java.lang.Override
    public int getModeValue() {
      return mode_;
    }
    /**
     *
     *
     * <pre>
     * The chart mode.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.ChartOptions.Mode mode = 1;</code>
     *
     * @param value The enum numeric value on the wire for mode to set.
     * @return This builder for chaining.
     */
    public Builder setModeValue(int value) {
      mode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The chart mode.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.ChartOptions.Mode mode = 1;</code>
     *
     * @return The mode.
     */
    @java.lang.Override
    public com.google.monitoring.dashboard.v1.ChartOptions.Mode getMode() {
      com.google.monitoring.dashboard.v1.ChartOptions.Mode result =
          com.google.monitoring.dashboard.v1.ChartOptions.Mode.forNumber(mode_);
      return result == null
          ? com.google.monitoring.dashboard.v1.ChartOptions.Mode.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The chart mode.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.ChartOptions.Mode mode = 1;</code>
     *
     * @param value The mode to set.
     * @return This builder for chaining.
     */
    public Builder setMode(com.google.monitoring.dashboard.v1.ChartOptions.Mode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      mode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The chart mode.
     * </pre>
     *
     * <code>.google.monitoring.dashboard.v1.ChartOptions.Mode mode = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mode_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.dashboard.v1.ChartOptions)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.dashboard.v1.ChartOptions)
  private static final com.google.monitoring.dashboard.v1.ChartOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.dashboard.v1.ChartOptions();
  }

  public static com.google.monitoring.dashboard.v1.ChartOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChartOptions> PARSER =
      new com.google.protobuf.AbstractParser<ChartOptions>() {
        @java.lang.Override
        public ChartOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChartOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChartOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.dashboard.v1.ChartOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
