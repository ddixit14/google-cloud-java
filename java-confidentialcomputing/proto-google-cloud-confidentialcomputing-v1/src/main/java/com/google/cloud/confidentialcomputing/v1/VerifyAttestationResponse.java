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
// source: google/cloud/confidentialcomputing/v1/service.proto

package com.google.cloud.confidentialcomputing.v1;

/**
 *
 *
 * <pre>
 * A response once an attestation has been successfully verified, containing a
 * signed OIDC token.
 * </pre>
 *
 * Protobuf type {@code google.cloud.confidentialcomputing.v1.VerifyAttestationResponse}
 */
public final class VerifyAttestationResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.confidentialcomputing.v1.VerifyAttestationResponse)
    VerifyAttestationResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VerifyAttestationResponse.newBuilder() to construct.
  private VerifyAttestationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VerifyAttestationResponse() {
    oidcClaimsToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VerifyAttestationResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.confidentialcomputing.v1.ServiceProto
        .internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.confidentialcomputing.v1.ServiceProto
        .internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse.class,
            com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse.Builder.class);
  }

  public static final int OIDC_CLAIMS_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object oidcClaimsToken_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Same as claims_token, but as a string.
   * </pre>
   *
   * <code>string oidc_claims_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The oidcClaimsToken.
   */
  @java.lang.Override
  public java.lang.String getOidcClaimsToken() {
    java.lang.Object ref = oidcClaimsToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oidcClaimsToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Same as claims_token, but as a string.
   * </pre>
   *
   * <code>string oidc_claims_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for oidcClaimsToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOidcClaimsTokenBytes() {
    java.lang.Object ref = oidcClaimsToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      oidcClaimsToken_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oidcClaimsToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, oidcClaimsToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oidcClaimsToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, oidcClaimsToken_);
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
    if (!(obj instanceof com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse other =
        (com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse) obj;

    if (!getOidcClaimsToken().equals(other.getOidcClaimsToken())) return false;
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
    hash = (37 * hash) + OIDC_CLAIMS_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getOidcClaimsToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse parseFrom(
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
      com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse prototype) {
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
   * A response once an attestation has been successfully verified, containing a
   * signed OIDC token.
   * </pre>
   *
   * Protobuf type {@code google.cloud.confidentialcomputing.v1.VerifyAttestationResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.confidentialcomputing.v1.VerifyAttestationResponse)
      com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse.class,
              com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      oidcClaimsToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.confidentialcomputing.v1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse
        getDefaultInstanceForType() {
      return com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse build() {
      com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse buildPartial() {
      com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse result =
          new com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.oidcClaimsToken_ = oidcClaimsToken_;
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
      if (other instanceof com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse) {
        return mergeFrom(
            (com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse other) {
      if (other
          == com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse
              .getDefaultInstance()) return this;
      if (!other.getOidcClaimsToken().isEmpty()) {
        oidcClaimsToken_ = other.oidcClaimsToken_;
        bitField0_ |= 0x00000001;
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
            case 18:
              {
                oidcClaimsToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
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

    private java.lang.Object oidcClaimsToken_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Same as claims_token, but as a string.
     * </pre>
     *
     * <code>string oidc_claims_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The oidcClaimsToken.
     */
    public java.lang.String getOidcClaimsToken() {
      java.lang.Object ref = oidcClaimsToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oidcClaimsToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Same as claims_token, but as a string.
     * </pre>
     *
     * <code>string oidc_claims_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for oidcClaimsToken.
     */
    public com.google.protobuf.ByteString getOidcClaimsTokenBytes() {
      java.lang.Object ref = oidcClaimsToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        oidcClaimsToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Same as claims_token, but as a string.
     * </pre>
     *
     * <code>string oidc_claims_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The oidcClaimsToken to set.
     * @return This builder for chaining.
     */
    public Builder setOidcClaimsToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      oidcClaimsToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Same as claims_token, but as a string.
     * </pre>
     *
     * <code>string oidc_claims_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOidcClaimsToken() {
      oidcClaimsToken_ = getDefaultInstance().getOidcClaimsToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Same as claims_token, but as a string.
     * </pre>
     *
     * <code>string oidc_claims_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for oidcClaimsToken to set.
     * @return This builder for chaining.
     */
    public Builder setOidcClaimsTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      oidcClaimsToken_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.confidentialcomputing.v1.VerifyAttestationResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.confidentialcomputing.v1.VerifyAttestationResponse)
  private static final com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse();
  }

  public static com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VerifyAttestationResponse> PARSER =
      new com.google.protobuf.AbstractParser<VerifyAttestationResponse>() {
        @java.lang.Override
        public VerifyAttestationResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<VerifyAttestationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VerifyAttestationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.confidentialcomputing.v1.VerifyAttestationResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
