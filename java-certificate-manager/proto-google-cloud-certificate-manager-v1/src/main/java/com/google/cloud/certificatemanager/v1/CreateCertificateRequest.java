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
// source: google/cloud/certificatemanager/v1/certificate_manager.proto

package com.google.cloud.certificatemanager.v1;

/**
 *
 *
 * <pre>
 * Request for the `CreateCertificate` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.certificatemanager.v1.CreateCertificateRequest}
 */
public final class CreateCertificateRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.certificatemanager.v1.CreateCertificateRequest)
    CreateCertificateRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateCertificateRequest.newBuilder() to construct.
  private CreateCertificateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateCertificateRequest() {
    parent_ = "";
    certificateId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateCertificateRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.certificatemanager.v1.CertificateManagerProto
        .internal_static_google_cloud_certificatemanager_v1_CreateCertificateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.certificatemanager.v1.CertificateManagerProto
        .internal_static_google_cloud_certificatemanager_v1_CreateCertificateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.certificatemanager.v1.CreateCertificateRequest.class,
            com.google.cloud.certificatemanager.v1.CreateCertificateRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent resource of the certificate. Must be in the format
   * `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource of the certificate. Must be in the format
   * `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CERTIFICATE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object certificateId_ = "";
  /**
   *
   *
   * <pre>
   * Required. A user-provided name of the certificate.
   * </pre>
   *
   * <code>string certificate_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The certificateId.
   */
  @java.lang.Override
  public java.lang.String getCertificateId() {
    java.lang.Object ref = certificateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      certificateId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. A user-provided name of the certificate.
   * </pre>
   *
   * <code>string certificate_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for certificateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCertificateIdBytes() {
    java.lang.Object ref = certificateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      certificateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CERTIFICATE_FIELD_NUMBER = 3;
  private com.google.cloud.certificatemanager.v1.Certificate certificate_;
  /**
   *
   *
   * <pre>
   * Required. A definition of the certificate to create.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the certificate field is set.
   */
  @java.lang.Override
  public boolean hasCertificate() {
    return certificate_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. A definition of the certificate to create.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The certificate.
   */
  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.Certificate getCertificate() {
    return certificate_ == null
        ? com.google.cloud.certificatemanager.v1.Certificate.getDefaultInstance()
        : certificate_;
  }
  /**
   *
   *
   * <pre>
   * Required. A definition of the certificate to create.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.CertificateOrBuilder getCertificateOrBuilder() {
    return certificate_ == null
        ? com.google.cloud.certificatemanager.v1.Certificate.getDefaultInstance()
        : certificate_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(certificateId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, certificateId_);
    }
    if (certificate_ != null) {
      output.writeMessage(3, getCertificate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(certificateId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, certificateId_);
    }
    if (certificate_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCertificate());
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
    if (!(obj instanceof com.google.cloud.certificatemanager.v1.CreateCertificateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.certificatemanager.v1.CreateCertificateRequest other =
        (com.google.cloud.certificatemanager.v1.CreateCertificateRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getCertificateId().equals(other.getCertificateId())) return false;
    if (hasCertificate() != other.hasCertificate()) return false;
    if (hasCertificate()) {
      if (!getCertificate().equals(other.getCertificate())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + CERTIFICATE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCertificateId().hashCode();
    if (hasCertificate()) {
      hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
      hash = (53 * hash) + getCertificate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateRequest parseFrom(
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
      com.google.cloud.certificatemanager.v1.CreateCertificateRequest prototype) {
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
   * Request for the `CreateCertificate` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.certificatemanager.v1.CreateCertificateRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.certificatemanager.v1.CreateCertificateRequest)
      com.google.cloud.certificatemanager.v1.CreateCertificateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto
          .internal_static_google_cloud_certificatemanager_v1_CreateCertificateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto
          .internal_static_google_cloud_certificatemanager_v1_CreateCertificateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.certificatemanager.v1.CreateCertificateRequest.class,
              com.google.cloud.certificatemanager.v1.CreateCertificateRequest.Builder.class);
    }

    // Construct using com.google.cloud.certificatemanager.v1.CreateCertificateRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      certificateId_ = "";
      certificate_ = null;
      if (certificateBuilder_ != null) {
        certificateBuilder_.dispose();
        certificateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto
          .internal_static_google_cloud_certificatemanager_v1_CreateCertificateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.CreateCertificateRequest
        getDefaultInstanceForType() {
      return com.google.cloud.certificatemanager.v1.CreateCertificateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.CreateCertificateRequest build() {
      com.google.cloud.certificatemanager.v1.CreateCertificateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.CreateCertificateRequest buildPartial() {
      com.google.cloud.certificatemanager.v1.CreateCertificateRequest result =
          new com.google.cloud.certificatemanager.v1.CreateCertificateRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.certificatemanager.v1.CreateCertificateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.certificateId_ = certificateId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.certificate_ =
            certificateBuilder_ == null ? certificate_ : certificateBuilder_.build();
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
      if (other instanceof com.google.cloud.certificatemanager.v1.CreateCertificateRequest) {
        return mergeFrom((com.google.cloud.certificatemanager.v1.CreateCertificateRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.certificatemanager.v1.CreateCertificateRequest other) {
      if (other
          == com.google.cloud.certificatemanager.v1.CreateCertificateRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCertificateId().isEmpty()) {
        certificateId_ = other.certificateId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasCertificate()) {
        mergeCertificate(other.getCertificate());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                certificateId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getCertificateFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the certificate. Must be in the format
     * `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the certificate. Must be in the format
     * `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the certificate. Must be in the format
     * `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the certificate. Must be in the format
     * `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource of the certificate. Must be in the format
     * `projects/&#42;&#47;locations/&#42;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object certificateId_ = "";
    /**
     *
     *
     * <pre>
     * Required. A user-provided name of the certificate.
     * </pre>
     *
     * <code>string certificate_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The certificateId.
     */
    public java.lang.String getCertificateId() {
      java.lang.Object ref = certificateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        certificateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A user-provided name of the certificate.
     * </pre>
     *
     * <code>string certificate_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for certificateId.
     */
    public com.google.protobuf.ByteString getCertificateIdBytes() {
      java.lang.Object ref = certificateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        certificateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A user-provided name of the certificate.
     * </pre>
     *
     * <code>string certificate_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The certificateId to set.
     * @return This builder for chaining.
     */
    public Builder setCertificateId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      certificateId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A user-provided name of the certificate.
     * </pre>
     *
     * <code>string certificate_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCertificateId() {
      certificateId_ = getDefaultInstance().getCertificateId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A user-provided name of the certificate.
     * </pre>
     *
     * <code>string certificate_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for certificateId to set.
     * @return This builder for chaining.
     */
    public Builder setCertificateIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      certificateId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.certificatemanager.v1.Certificate certificate_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.certificatemanager.v1.Certificate,
            com.google.cloud.certificatemanager.v1.Certificate.Builder,
            com.google.cloud.certificatemanager.v1.CertificateOrBuilder>
        certificateBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the certificate field is set.
     */
    public boolean hasCertificate() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The certificate.
     */
    public com.google.cloud.certificatemanager.v1.Certificate getCertificate() {
      if (certificateBuilder_ == null) {
        return certificate_ == null
            ? com.google.cloud.certificatemanager.v1.Certificate.getDefaultInstance()
            : certificate_;
      } else {
        return certificateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCertificate(com.google.cloud.certificatemanager.v1.Certificate value) {
      if (certificateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        certificate_ = value;
      } else {
        certificateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCertificate(
        com.google.cloud.certificatemanager.v1.Certificate.Builder builderForValue) {
      if (certificateBuilder_ == null) {
        certificate_ = builderForValue.build();
      } else {
        certificateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeCertificate(com.google.cloud.certificatemanager.v1.Certificate value) {
      if (certificateBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && certificate_ != null
            && certificate_
                != com.google.cloud.certificatemanager.v1.Certificate.getDefaultInstance()) {
          getCertificateBuilder().mergeFrom(value);
        } else {
          certificate_ = value;
        }
      } else {
        certificateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCertificate() {
      bitField0_ = (bitField0_ & ~0x00000004);
      certificate_ = null;
      if (certificateBuilder_ != null) {
        certificateBuilder_.dispose();
        certificateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.certificatemanager.v1.Certificate.Builder getCertificateBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCertificateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.certificatemanager.v1.CertificateOrBuilder getCertificateOrBuilder() {
      if (certificateBuilder_ != null) {
        return certificateBuilder_.getMessageOrBuilder();
      } else {
        return certificate_ == null
            ? com.google.cloud.certificatemanager.v1.Certificate.getDefaultInstance()
            : certificate_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to create.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.certificatemanager.v1.Certificate,
            com.google.cloud.certificatemanager.v1.Certificate.Builder,
            com.google.cloud.certificatemanager.v1.CertificateOrBuilder>
        getCertificateFieldBuilder() {
      if (certificateBuilder_ == null) {
        certificateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.certificatemanager.v1.Certificate,
                com.google.cloud.certificatemanager.v1.Certificate.Builder,
                com.google.cloud.certificatemanager.v1.CertificateOrBuilder>(
                getCertificate(), getParentForChildren(), isClean());
        certificate_ = null;
      }
      return certificateBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.certificatemanager.v1.CreateCertificateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.certificatemanager.v1.CreateCertificateRequest)
  private static final com.google.cloud.certificatemanager.v1.CreateCertificateRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.certificatemanager.v1.CreateCertificateRequest();
  }

  public static com.google.cloud.certificatemanager.v1.CreateCertificateRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCertificateRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateCertificateRequest>() {
        @java.lang.Override
        public CreateCertificateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCertificateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCertificateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.CreateCertificateRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
