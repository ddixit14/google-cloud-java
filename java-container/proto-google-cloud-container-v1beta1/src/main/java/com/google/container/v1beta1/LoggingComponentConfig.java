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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * LoggingComponentConfig is cluster logging component configuration.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.LoggingComponentConfig}
 */
public final class LoggingComponentConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.LoggingComponentConfig)
    LoggingComponentConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LoggingComponentConfig.newBuilder() to construct.
  private LoggingComponentConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LoggingComponentConfig() {
    enableComponents_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LoggingComponentConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_LoggingComponentConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_LoggingComponentConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.LoggingComponentConfig.class,
            com.google.container.v1beta1.LoggingComponentConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * GKE components exposing logs
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.LoggingComponentConfig.Component}
   */
  public enum Component implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value. This shouldn't be used.
     * </pre>
     *
     * <code>COMPONENT_UNSPECIFIED = 0;</code>
     */
    COMPONENT_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * system components
     * </pre>
     *
     * <code>SYSTEM_COMPONENTS = 1;</code>
     */
    SYSTEM_COMPONENTS(1),
    /**
     *
     *
     * <pre>
     * workloads
     * </pre>
     *
     * <code>WORKLOADS = 2;</code>
     */
    WORKLOADS(2),
    /**
     *
     *
     * <pre>
     * kube-apiserver
     * </pre>
     *
     * <code>APISERVER = 3;</code>
     */
    APISERVER(3),
    /**
     *
     *
     * <pre>
     * kube-scheduler
     * </pre>
     *
     * <code>SCHEDULER = 4;</code>
     */
    SCHEDULER(4),
    /**
     *
     *
     * <pre>
     * kube-controller-manager
     * </pre>
     *
     * <code>CONTROLLER_MANAGER = 5;</code>
     */
    CONTROLLER_MANAGER(5),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value. This shouldn't be used.
     * </pre>
     *
     * <code>COMPONENT_UNSPECIFIED = 0;</code>
     */
    public static final int COMPONENT_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * system components
     * </pre>
     *
     * <code>SYSTEM_COMPONENTS = 1;</code>
     */
    public static final int SYSTEM_COMPONENTS_VALUE = 1;
    /**
     *
     *
     * <pre>
     * workloads
     * </pre>
     *
     * <code>WORKLOADS = 2;</code>
     */
    public static final int WORKLOADS_VALUE = 2;
    /**
     *
     *
     * <pre>
     * kube-apiserver
     * </pre>
     *
     * <code>APISERVER = 3;</code>
     */
    public static final int APISERVER_VALUE = 3;
    /**
     *
     *
     * <pre>
     * kube-scheduler
     * </pre>
     *
     * <code>SCHEDULER = 4;</code>
     */
    public static final int SCHEDULER_VALUE = 4;
    /**
     *
     *
     * <pre>
     * kube-controller-manager
     * </pre>
     *
     * <code>CONTROLLER_MANAGER = 5;</code>
     */
    public static final int CONTROLLER_MANAGER_VALUE = 5;

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
    public static Component valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Component forNumber(int value) {
      switch (value) {
        case 0:
          return COMPONENT_UNSPECIFIED;
        case 1:
          return SYSTEM_COMPONENTS;
        case 2:
          return WORKLOADS;
        case 3:
          return APISERVER;
        case 4:
          return SCHEDULER;
        case 5:
          return CONTROLLER_MANAGER;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Component> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Component> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Component>() {
          public Component findValueByNumber(int number) {
            return Component.forNumber(number);
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
      return com.google.container.v1beta1.LoggingComponentConfig.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Component[] VALUES = values();

    public static Component valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Component(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.LoggingComponentConfig.Component)
  }

  public static final int ENABLE_COMPONENTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> enableComponents_;

  private static final com.google.protobuf.Internal.ListAdapter.Converter<
          java.lang.Integer, com.google.container.v1beta1.LoggingComponentConfig.Component>
      enableComponents_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.container.v1beta1.LoggingComponentConfig.Component>() {
            public com.google.container.v1beta1.LoggingComponentConfig.Component convert(
                java.lang.Integer from) {
              com.google.container.v1beta1.LoggingComponentConfig.Component result =
                  com.google.container.v1beta1.LoggingComponentConfig.Component.forNumber(from);
              return result == null
                  ? com.google.container.v1beta1.LoggingComponentConfig.Component.UNRECOGNIZED
                  : result;
            }
          };
  /**
   *
   *
   * <pre>
   * Select components to collect logs. An empty set would disable all logging.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
   * </code>
   *
   * @return A list containing the enableComponents.
   */
  @java.lang.Override
  public java.util.List<com.google.container.v1beta1.LoggingComponentConfig.Component>
      getEnableComponentsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.container.v1beta1.LoggingComponentConfig.Component>(
        enableComponents_, enableComponents_converter_);
  }
  /**
   *
   *
   * <pre>
   * Select components to collect logs. An empty set would disable all logging.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
   * </code>
   *
   * @return The count of enableComponents.
   */
  @java.lang.Override
  public int getEnableComponentsCount() {
    return enableComponents_.size();
  }
  /**
   *
   *
   * <pre>
   * Select components to collect logs. An empty set would disable all logging.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The enableComponents at the given index.
   */
  @java.lang.Override
  public com.google.container.v1beta1.LoggingComponentConfig.Component getEnableComponents(
      int index) {
    return enableComponents_converter_.convert(enableComponents_.get(index));
  }
  /**
   *
   *
   * <pre>
   * Select components to collect logs. An empty set would disable all logging.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for enableComponents.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getEnableComponentsValueList() {
    return enableComponents_;
  }
  /**
   *
   *
   * <pre>
   * Select components to collect logs. An empty set would disable all logging.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of enableComponents at the given index.
   */
  @java.lang.Override
  public int getEnableComponentsValue(int index) {
    return enableComponents_.get(index);
  }

  private int enableComponentsMemoizedSerializedSize;

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
    getSerializedSize();
    if (getEnableComponentsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(enableComponentsMemoizedSerializedSize);
    }
    for (int i = 0; i < enableComponents_.size(); i++) {
      output.writeEnumNoTag(enableComponents_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < enableComponents_.size(); i++) {
        dataSize +=
            com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(enableComponents_.get(i));
      }
      size += dataSize;
      if (!getEnableComponentsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(dataSize);
      }
      enableComponentsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.container.v1beta1.LoggingComponentConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.LoggingComponentConfig other =
        (com.google.container.v1beta1.LoggingComponentConfig) obj;

    if (!enableComponents_.equals(other.enableComponents_)) return false;
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
    if (getEnableComponentsCount() > 0) {
      hash = (37 * hash) + ENABLE_COMPONENTS_FIELD_NUMBER;
      hash = (53 * hash) + enableComponents_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.LoggingComponentConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.LoggingComponentConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.LoggingComponentConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.LoggingComponentConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.LoggingComponentConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.LoggingComponentConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.LoggingComponentConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.LoggingComponentConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.LoggingComponentConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.LoggingComponentConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.LoggingComponentConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.LoggingComponentConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.LoggingComponentConfig prototype) {
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
   * LoggingComponentConfig is cluster logging component configuration.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.LoggingComponentConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.LoggingComponentConfig)
      com.google.container.v1beta1.LoggingComponentConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_LoggingComponentConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_LoggingComponentConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.LoggingComponentConfig.class,
              com.google.container.v1beta1.LoggingComponentConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.LoggingComponentConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enableComponents_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_LoggingComponentConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.LoggingComponentConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.LoggingComponentConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.LoggingComponentConfig build() {
      com.google.container.v1beta1.LoggingComponentConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.LoggingComponentConfig buildPartial() {
      com.google.container.v1beta1.LoggingComponentConfig result =
          new com.google.container.v1beta1.LoggingComponentConfig(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.container.v1beta1.LoggingComponentConfig result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        enableComponents_ = java.util.Collections.unmodifiableList(enableComponents_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.enableComponents_ = enableComponents_;
    }

    private void buildPartial0(com.google.container.v1beta1.LoggingComponentConfig result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.container.v1beta1.LoggingComponentConfig) {
        return mergeFrom((com.google.container.v1beta1.LoggingComponentConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.LoggingComponentConfig other) {
      if (other == com.google.container.v1beta1.LoggingComponentConfig.getDefaultInstance())
        return this;
      if (!other.enableComponents_.isEmpty()) {
        if (enableComponents_.isEmpty()) {
          enableComponents_ = other.enableComponents_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEnableComponentsIsMutable();
          enableComponents_.addAll(other.enableComponents_);
        }
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
            case 8:
              {
                int tmpRaw = input.readEnum();
                ensureEnableComponentsIsMutable();
                enableComponents_.add(tmpRaw);
                break;
              } // case 8
            case 10:
              {
                int length = input.readRawVarint32();
                int oldLimit = input.pushLimit(length);
                while (input.getBytesUntilLimit() > 0) {
                  int tmpRaw = input.readEnum();
                  ensureEnableComponentsIsMutable();
                  enableComponents_.add(tmpRaw);
                }
                input.popLimit(oldLimit);
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

    private java.util.List<java.lang.Integer> enableComponents_ = java.util.Collections.emptyList();

    private void ensureEnableComponentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        enableComponents_ = new java.util.ArrayList<java.lang.Integer>(enableComponents_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Select components to collect logs. An empty set would disable all logging.
     * </pre>
     *
     * <code>
     * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
     * </code>
     *
     * @return A list containing the enableComponents.
     */
    public java.util.List<com.google.container.v1beta1.LoggingComponentConfig.Component>
        getEnableComponentsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.container.v1beta1.LoggingComponentConfig.Component>(
          enableComponents_, enableComponents_converter_);
    }
    /**
     *
     *
     * <pre>
     * Select components to collect logs. An empty set would disable all logging.
     * </pre>
     *
     * <code>
     * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
     * </code>
     *
     * @return The count of enableComponents.
     */
    public int getEnableComponentsCount() {
      return enableComponents_.size();
    }
    /**
     *
     *
     * <pre>
     * Select components to collect logs. An empty set would disable all logging.
     * </pre>
     *
     * <code>
     * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
     * </code>
     *
     * @param index The index of the element to return.
     * @return The enableComponents at the given index.
     */
    public com.google.container.v1beta1.LoggingComponentConfig.Component getEnableComponents(
        int index) {
      return enableComponents_converter_.convert(enableComponents_.get(index));
    }
    /**
     *
     *
     * <pre>
     * Select components to collect logs. An empty set would disable all logging.
     * </pre>
     *
     * <code>
     * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The enableComponents to set.
     * @return This builder for chaining.
     */
    public Builder setEnableComponents(
        int index, com.google.container.v1beta1.LoggingComponentConfig.Component value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEnableComponentsIsMutable();
      enableComponents_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Select components to collect logs. An empty set would disable all logging.
     * </pre>
     *
     * <code>
     * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
     * </code>
     *
     * @param value The enableComponents to add.
     * @return This builder for chaining.
     */
    public Builder addEnableComponents(
        com.google.container.v1beta1.LoggingComponentConfig.Component value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEnableComponentsIsMutable();
      enableComponents_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Select components to collect logs. An empty set would disable all logging.
     * </pre>
     *
     * <code>
     * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
     * </code>
     *
     * @param values The enableComponents to add.
     * @return This builder for chaining.
     */
    public Builder addAllEnableComponents(
        java.lang.Iterable<? extends com.google.container.v1beta1.LoggingComponentConfig.Component>
            values) {
      ensureEnableComponentsIsMutable();
      for (com.google.container.v1beta1.LoggingComponentConfig.Component value : values) {
        enableComponents_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Select components to collect logs. An empty set would disable all logging.
     * </pre>
     *
     * <code>
     * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableComponents() {
      enableComponents_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Select components to collect logs. An empty set would disable all logging.
     * </pre>
     *
     * <code>
     * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
     * </code>
     *
     * @return A list containing the enum numeric values on the wire for enableComponents.
     */
    public java.util.List<java.lang.Integer> getEnableComponentsValueList() {
      return java.util.Collections.unmodifiableList(enableComponents_);
    }
    /**
     *
     *
     * <pre>
     * Select components to collect logs. An empty set would disable all logging.
     * </pre>
     *
     * <code>
     * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
     * </code>
     *
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of enableComponents at the given index.
     */
    public int getEnableComponentsValue(int index) {
      return enableComponents_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Select components to collect logs. An empty set would disable all logging.
     * </pre>
     *
     * <code>
     * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for enableComponents to set.
     * @return This builder for chaining.
     */
    public Builder setEnableComponentsValue(int index, int value) {
      ensureEnableComponentsIsMutable();
      enableComponents_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Select components to collect logs. An empty set would disable all logging.
     * </pre>
     *
     * <code>
     * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for enableComponents to add.
     * @return This builder for chaining.
     */
    public Builder addEnableComponentsValue(int value) {
      ensureEnableComponentsIsMutable();
      enableComponents_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Select components to collect logs. An empty set would disable all logging.
     * </pre>
     *
     * <code>
     * repeated .google.container.v1beta1.LoggingComponentConfig.Component enable_components = 1;
     * </code>
     *
     * @param values The enum numeric values on the wire for enableComponents to add.
     * @return This builder for chaining.
     */
    public Builder addAllEnableComponentsValue(java.lang.Iterable<java.lang.Integer> values) {
      ensureEnableComponentsIsMutable();
      for (int value : values) {
        enableComponents_.add(value);
      }
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.LoggingComponentConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.LoggingComponentConfig)
  private static final com.google.container.v1beta1.LoggingComponentConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.LoggingComponentConfig();
  }

  public static com.google.container.v1beta1.LoggingComponentConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoggingComponentConfig> PARSER =
      new com.google.protobuf.AbstractParser<LoggingComponentConfig>() {
        @java.lang.Override
        public LoggingComponentConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<LoggingComponentConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoggingComponentConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.LoggingComponentConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
