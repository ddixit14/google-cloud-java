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
// source: google/cloud/billing/v1/cloud_billing.proto

package com.google.cloud.billing.v1;

/**
 *
 *
 * <pre>
 * Request message for `UpdateBillingAccount`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.billing.v1.UpdateBillingAccountRequest}
 */
public final class UpdateBillingAccountRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.billing.v1.UpdateBillingAccountRequest)
    UpdateBillingAccountRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateBillingAccountRequest.newBuilder() to construct.
  private UpdateBillingAccountRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateBillingAccountRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateBillingAccountRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.billing.v1.CloudBillingProto
        .internal_static_google_cloud_billing_v1_UpdateBillingAccountRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.billing.v1.CloudBillingProto
        .internal_static_google_cloud_billing_v1_UpdateBillingAccountRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.billing.v1.UpdateBillingAccountRequest.class,
            com.google.cloud.billing.v1.UpdateBillingAccountRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the billing account resource to be updated.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the billing account resource to be updated.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCOUNT_FIELD_NUMBER = 2;
  private com.google.cloud.billing.v1.BillingAccount account_;
  /**
   *
   *
   * <pre>
   * Required. The billing account resource to replace the resource on the
   * server.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the account field is set.
   */
  @java.lang.Override
  public boolean hasAccount() {
    return account_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The billing account resource to replace the resource on the
   * server.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The account.
   */
  @java.lang.Override
  public com.google.cloud.billing.v1.BillingAccount getAccount() {
    return account_ == null
        ? com.google.cloud.billing.v1.BillingAccount.getDefaultInstance()
        : account_;
  }
  /**
   *
   *
   * <pre>
   * Required. The billing account resource to replace the resource on the
   * server.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.billing.v1.BillingAccountOrBuilder getAccountOrBuilder() {
    return account_ == null
        ? com.google.cloud.billing.v1.BillingAccount.getDefaultInstance()
        : account_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The update mask applied to the resource.
   * Only "display_name" is currently supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The update mask applied to the resource.
   * Only "display_name" is currently supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The update mask applied to the resource.
   * Only "display_name" is currently supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (account_ != null) {
      output.writeMessage(2, getAccount());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (account_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAccount());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.billing.v1.UpdateBillingAccountRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.billing.v1.UpdateBillingAccountRequest other =
        (com.google.cloud.billing.v1.UpdateBillingAccountRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasAccount() != other.hasAccount()) return false;
    if (hasAccount()) {
      if (!getAccount().equals(other.getAccount())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasAccount()) {
      hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAccount().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.billing.v1.UpdateBillingAccountRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.v1.UpdateBillingAccountRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.UpdateBillingAccountRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.v1.UpdateBillingAccountRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.UpdateBillingAccountRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.v1.UpdateBillingAccountRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.UpdateBillingAccountRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.v1.UpdateBillingAccountRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.UpdateBillingAccountRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.v1.UpdateBillingAccountRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.UpdateBillingAccountRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.v1.UpdateBillingAccountRequest parseFrom(
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
      com.google.cloud.billing.v1.UpdateBillingAccountRequest prototype) {
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
   * Request message for `UpdateBillingAccount`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.billing.v1.UpdateBillingAccountRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.billing.v1.UpdateBillingAccountRequest)
      com.google.cloud.billing.v1.UpdateBillingAccountRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.billing.v1.CloudBillingProto
          .internal_static_google_cloud_billing_v1_UpdateBillingAccountRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.billing.v1.CloudBillingProto
          .internal_static_google_cloud_billing_v1_UpdateBillingAccountRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.billing.v1.UpdateBillingAccountRequest.class,
              com.google.cloud.billing.v1.UpdateBillingAccountRequest.Builder.class);
    }

    // Construct using com.google.cloud.billing.v1.UpdateBillingAccountRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      account_ = null;
      if (accountBuilder_ != null) {
        accountBuilder_.dispose();
        accountBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.billing.v1.CloudBillingProto
          .internal_static_google_cloud_billing_v1_UpdateBillingAccountRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.UpdateBillingAccountRequest getDefaultInstanceForType() {
      return com.google.cloud.billing.v1.UpdateBillingAccountRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.UpdateBillingAccountRequest build() {
      com.google.cloud.billing.v1.UpdateBillingAccountRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.UpdateBillingAccountRequest buildPartial() {
      com.google.cloud.billing.v1.UpdateBillingAccountRequest result =
          new com.google.cloud.billing.v1.UpdateBillingAccountRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.billing.v1.UpdateBillingAccountRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.account_ = accountBuilder_ == null ? account_ : accountBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.billing.v1.UpdateBillingAccountRequest) {
        return mergeFrom((com.google.cloud.billing.v1.UpdateBillingAccountRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.billing.v1.UpdateBillingAccountRequest other) {
      if (other == com.google.cloud.billing.v1.UpdateBillingAccountRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAccount()) {
        mergeAccount(other.getAccount());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getAccountFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the billing account resource to be updated.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the billing account resource to be updated.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the billing account resource to be updated.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the billing account resource to be updated.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the billing account resource to be updated.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.billing.v1.BillingAccount account_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.billing.v1.BillingAccount,
            com.google.cloud.billing.v1.BillingAccount.Builder,
            com.google.cloud.billing.v1.BillingAccountOrBuilder>
        accountBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to replace the resource on the
     * server.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the account field is set.
     */
    public boolean hasAccount() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to replace the resource on the
     * server.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The account.
     */
    public com.google.cloud.billing.v1.BillingAccount getAccount() {
      if (accountBuilder_ == null) {
        return account_ == null
            ? com.google.cloud.billing.v1.BillingAccount.getDefaultInstance()
            : account_;
      } else {
        return accountBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to replace the resource on the
     * server.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAccount(com.google.cloud.billing.v1.BillingAccount value) {
      if (accountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        account_ = value;
      } else {
        accountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to replace the resource on the
     * server.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAccount(com.google.cloud.billing.v1.BillingAccount.Builder builderForValue) {
      if (accountBuilder_ == null) {
        account_ = builderForValue.build();
      } else {
        accountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to replace the resource on the
     * server.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAccount(com.google.cloud.billing.v1.BillingAccount value) {
      if (accountBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && account_ != null
            && account_ != com.google.cloud.billing.v1.BillingAccount.getDefaultInstance()) {
          getAccountBuilder().mergeFrom(value);
        } else {
          account_ = value;
        }
      } else {
        accountBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to replace the resource on the
     * server.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAccount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      account_ = null;
      if (accountBuilder_ != null) {
        accountBuilder_.dispose();
        accountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to replace the resource on the
     * server.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.billing.v1.BillingAccount.Builder getAccountBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAccountFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to replace the resource on the
     * server.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.billing.v1.BillingAccountOrBuilder getAccountOrBuilder() {
      if (accountBuilder_ != null) {
        return accountBuilder_.getMessageOrBuilder();
      } else {
        return account_ == null
            ? com.google.cloud.billing.v1.BillingAccount.getDefaultInstance()
            : account_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The billing account resource to replace the resource on the
     * server.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.v1.BillingAccount account = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.billing.v1.BillingAccount,
            com.google.cloud.billing.v1.BillingAccount.Builder,
            com.google.cloud.billing.v1.BillingAccountOrBuilder>
        getAccountFieldBuilder() {
      if (accountBuilder_ == null) {
        accountBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.billing.v1.BillingAccount,
                com.google.cloud.billing.v1.BillingAccount.Builder,
                com.google.cloud.billing.v1.BillingAccountOrBuilder>(
                getAccount(), getParentForChildren(), isClean());
        account_ = null;
      }
      return accountBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The update mask applied to the resource.
     * Only "display_name" is currently supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The update mask applied to the resource.
     * Only "display_name" is currently supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The update mask applied to the resource.
     * Only "display_name" is currently supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applied to the resource.
     * Only "display_name" is currently supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applied to the resource.
     * Only "display_name" is currently supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applied to the resource.
     * Only "display_name" is currently supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000004);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The update mask applied to the resource.
     * Only "display_name" is currently supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The update mask applied to the resource.
     * Only "display_name" is currently supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The update mask applied to the resource.
     * Only "display_name" is currently supported.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.billing.v1.UpdateBillingAccountRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.billing.v1.UpdateBillingAccountRequest)
  private static final com.google.cloud.billing.v1.UpdateBillingAccountRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.billing.v1.UpdateBillingAccountRequest();
  }

  public static com.google.cloud.billing.v1.UpdateBillingAccountRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateBillingAccountRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateBillingAccountRequest>() {
        @java.lang.Override
        public UpdateBillingAccountRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateBillingAccountRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateBillingAccountRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.billing.v1.UpdateBillingAccountRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
