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
// source: google/cloud/confidentialcomputing/v1alpha1/service.proto

package com.google.cloud.confidentialcomputing.v1alpha1;

/**
 *
 *
 * <pre>
 * Credentials issued by GCP which are linked to the platform attestation. These
 * will be verified server-side as part of attestaion verification.
 * </pre>
 *
 * Protobuf type {@code google.cloud.confidentialcomputing.v1alpha1.GcpCredentials}
 */
public final class GcpCredentials extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.confidentialcomputing.v1alpha1.GcpCredentials)
    GcpCredentialsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GcpCredentials.newBuilder() to construct.
  private GcpCredentials(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GcpCredentials() {
    idTokens_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GcpCredentials();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.confidentialcomputing.v1alpha1.ServiceProto
        .internal_static_google_cloud_confidentialcomputing_v1alpha1_GcpCredentials_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.confidentialcomputing.v1alpha1.ServiceProto
        .internal_static_google_cloud_confidentialcomputing_v1alpha1_GcpCredentials_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials.class,
            com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials.Builder.class);
  }

  public static final int ID_TOKENS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.ByteString> idTokens_;
  /**
   *
   *
   * <pre>
   * A list of service account OpenID Connect ID tokens identifying which
   * service account identities should be included in the claims_token. These
   * can be generated by calling `serviceAccounts.generateIdToken`. The
   * Challenge.name must be used as the `audience` parameter, and the
   * `includeEmail` parameter must be `true`.
   * --
   * </pre>
   *
   * <code>repeated bytes id_tokens = 1;</code>
   *
   * @return A list containing the idTokens.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString> getIdTokensList() {
    return idTokens_;
  }
  /**
   *
   *
   * <pre>
   * A list of service account OpenID Connect ID tokens identifying which
   * service account identities should be included in the claims_token. These
   * can be generated by calling `serviceAccounts.generateIdToken`. The
   * Challenge.name must be used as the `audience` parameter, and the
   * `includeEmail` parameter must be `true`.
   * --
   * </pre>
   *
   * <code>repeated bytes id_tokens = 1;</code>
   *
   * @return The count of idTokens.
   */
  public int getIdTokensCount() {
    return idTokens_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of service account OpenID Connect ID tokens identifying which
   * service account identities should be included in the claims_token. These
   * can be generated by calling `serviceAccounts.generateIdToken`. The
   * Challenge.name must be used as the `audience` parameter, and the
   * `includeEmail` parameter must be `true`.
   * --
   * </pre>
   *
   * <code>repeated bytes id_tokens = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The idTokens at the given index.
   */
  public com.google.protobuf.ByteString getIdTokens(int index) {
    return idTokens_.get(index);
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
    for (int i = 0; i < idTokens_.size(); i++) {
      output.writeBytes(1, idTokens_.get(i));
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
      for (int i = 0; i < idTokens_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream.computeBytesSizeNoTag(idTokens_.get(i));
      }
      size += dataSize;
      size += 1 * getIdTokensList().size();
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
    if (!(obj instanceof com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials)) {
      return super.equals(obj);
    }
    com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials other =
        (com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials) obj;

    if (!getIdTokensList().equals(other.getIdTokensList())) return false;
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
    if (getIdTokensCount() > 0) {
      hash = (37 * hash) + ID_TOKENS_FIELD_NUMBER;
      hash = (53 * hash) + getIdTokensList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials parseFrom(
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
      com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials prototype) {
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
   * Credentials issued by GCP which are linked to the platform attestation. These
   * will be verified server-side as part of attestaion verification.
   * </pre>
   *
   * Protobuf type {@code google.cloud.confidentialcomputing.v1alpha1.GcpCredentials}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.confidentialcomputing.v1alpha1.GcpCredentials)
      com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentialsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.confidentialcomputing.v1alpha1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1alpha1_GcpCredentials_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.confidentialcomputing.v1alpha1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1alpha1_GcpCredentials_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials.class,
              com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials.Builder.class);
    }

    // Construct using com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      idTokens_ = java.util.Collections.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.confidentialcomputing.v1alpha1.ServiceProto
          .internal_static_google_cloud_confidentialcomputing_v1alpha1_GcpCredentials_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials
        getDefaultInstanceForType() {
      return com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials build() {
      com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials buildPartial() {
      com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials result =
          new com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        idTokens_ = java.util.Collections.unmodifiableList(idTokens_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.idTokens_ = idTokens_;
    }

    private void buildPartial0(
        com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials result) {
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
      if (other instanceof com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials) {
        return mergeFrom((com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials other) {
      if (other
          == com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials.getDefaultInstance())
        return this;
      if (!other.idTokens_.isEmpty()) {
        if (idTokens_.isEmpty()) {
          idTokens_ = other.idTokens_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIdTokensIsMutable();
          idTokens_.addAll(other.idTokens_);
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
            case 10:
              {
                com.google.protobuf.ByteString v = input.readBytes();
                ensureIdTokensIsMutable();
                idTokens_.add(v);
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

    private java.util.List<com.google.protobuf.ByteString> idTokens_ =
        java.util.Collections.emptyList();

    private void ensureIdTokensIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        idTokens_ = new java.util.ArrayList<com.google.protobuf.ByteString>(idTokens_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * A list of service account OpenID Connect ID tokens identifying which
     * service account identities should be included in the claims_token. These
     * can be generated by calling `serviceAccounts.generateIdToken`. The
     * Challenge.name must be used as the `audience` parameter, and the
     * `includeEmail` parameter must be `true`.
     * --
     * </pre>
     *
     * <code>repeated bytes id_tokens = 1;</code>
     *
     * @return A list containing the idTokens.
     */
    public java.util.List<com.google.protobuf.ByteString> getIdTokensList() {
      return ((bitField0_ & 0x00000001) != 0)
          ? java.util.Collections.unmodifiableList(idTokens_)
          : idTokens_;
    }
    /**
     *
     *
     * <pre>
     * A list of service account OpenID Connect ID tokens identifying which
     * service account identities should be included in the claims_token. These
     * can be generated by calling `serviceAccounts.generateIdToken`. The
     * Challenge.name must be used as the `audience` parameter, and the
     * `includeEmail` parameter must be `true`.
     * --
     * </pre>
     *
     * <code>repeated bytes id_tokens = 1;</code>
     *
     * @return The count of idTokens.
     */
    public int getIdTokensCount() {
      return idTokens_.size();
    }
    /**
     *
     *
     * <pre>
     * A list of service account OpenID Connect ID tokens identifying which
     * service account identities should be included in the claims_token. These
     * can be generated by calling `serviceAccounts.generateIdToken`. The
     * Challenge.name must be used as the `audience` parameter, and the
     * `includeEmail` parameter must be `true`.
     * --
     * </pre>
     *
     * <code>repeated bytes id_tokens = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The idTokens at the given index.
     */
    public com.google.protobuf.ByteString getIdTokens(int index) {
      return idTokens_.get(index);
    }
    /**
     *
     *
     * <pre>
     * A list of service account OpenID Connect ID tokens identifying which
     * service account identities should be included in the claims_token. These
     * can be generated by calling `serviceAccounts.generateIdToken`. The
     * Challenge.name must be used as the `audience` parameter, and the
     * `includeEmail` parameter must be `true`.
     * --
     * </pre>
     *
     * <code>repeated bytes id_tokens = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The idTokens to set.
     * @return This builder for chaining.
     */
    public Builder setIdTokens(int index, com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureIdTokensIsMutable();
      idTokens_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of service account OpenID Connect ID tokens identifying which
     * service account identities should be included in the claims_token. These
     * can be generated by calling `serviceAccounts.generateIdToken`. The
     * Challenge.name must be used as the `audience` parameter, and the
     * `includeEmail` parameter must be `true`.
     * --
     * </pre>
     *
     * <code>repeated bytes id_tokens = 1;</code>
     *
     * @param value The idTokens to add.
     * @return This builder for chaining.
     */
    public Builder addIdTokens(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureIdTokensIsMutable();
      idTokens_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of service account OpenID Connect ID tokens identifying which
     * service account identities should be included in the claims_token. These
     * can be generated by calling `serviceAccounts.generateIdToken`. The
     * Challenge.name must be used as the `audience` parameter, and the
     * `includeEmail` parameter must be `true`.
     * --
     * </pre>
     *
     * <code>repeated bytes id_tokens = 1;</code>
     *
     * @param values The idTokens to add.
     * @return This builder for chaining.
     */
    public Builder addAllIdTokens(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureIdTokensIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, idTokens_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of service account OpenID Connect ID tokens identifying which
     * service account identities should be included in the claims_token. These
     * can be generated by calling `serviceAccounts.generateIdToken`. The
     * Challenge.name must be used as the `audience` parameter, and the
     * `includeEmail` parameter must be `true`.
     * --
     * </pre>
     *
     * <code>repeated bytes id_tokens = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIdTokens() {
      idTokens_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.confidentialcomputing.v1alpha1.GcpCredentials)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.confidentialcomputing.v1alpha1.GcpCredentials)
  private static final com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials();
  }

  public static com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcpCredentials> PARSER =
      new com.google.protobuf.AbstractParser<GcpCredentials>() {
        @java.lang.Override
        public GcpCredentials parsePartialFrom(
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

  public static com.google.protobuf.Parser<GcpCredentials> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcpCredentials> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.confidentialcomputing.v1alpha1.GcpCredentials
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
