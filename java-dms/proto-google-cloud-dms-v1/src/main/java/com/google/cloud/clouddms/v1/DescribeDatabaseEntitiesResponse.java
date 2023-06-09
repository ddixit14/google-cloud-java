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
// source: google/cloud/clouddms/v1/clouddms.proto

package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * Response message for 'DescribeDatabaseEntities' request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse}
 */
public final class DescribeDatabaseEntitiesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse)
    DescribeDatabaseEntitiesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DescribeDatabaseEntitiesResponse.newBuilder() to construct.
  private DescribeDatabaseEntitiesResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DescribeDatabaseEntitiesResponse() {
    databaseEntities_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DescribeDatabaseEntitiesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.clouddms.v1.ClouddmsProto
        .internal_static_google_cloud_clouddms_v1_DescribeDatabaseEntitiesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ClouddmsProto
        .internal_static_google_cloud_clouddms_v1_DescribeDatabaseEntitiesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse.class,
            com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse.Builder.class);
  }

  public static final int DATABASE_ENTITIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.clouddms.v1.DatabaseEntity> databaseEntities_;
  /**
   *
   *
   * <pre>
   * The list of database entities for the conversion workspace.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.clouddms.v1.DatabaseEntity> getDatabaseEntitiesList() {
    return databaseEntities_;
  }
  /**
   *
   *
   * <pre>
   * The list of database entities for the conversion workspace.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.clouddms.v1.DatabaseEntityOrBuilder>
      getDatabaseEntitiesOrBuilderList() {
    return databaseEntities_;
  }
  /**
   *
   *
   * <pre>
   * The list of database entities for the conversion workspace.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
   */
  @java.lang.Override
  public int getDatabaseEntitiesCount() {
    return databaseEntities_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of database entities for the conversion workspace.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.clouddms.v1.DatabaseEntity getDatabaseEntities(int index) {
    return databaseEntities_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of database entities for the conversion workspace.
   * </pre>
   *
   * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.clouddms.v1.DatabaseEntityOrBuilder getDatabaseEntitiesOrBuilder(
      int index) {
    return databaseEntities_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < databaseEntities_.size(); i++) {
      output.writeMessage(1, databaseEntities_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < databaseEntities_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, databaseEntities_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse other =
        (com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse) obj;

    if (!getDatabaseEntitiesList().equals(other.getDatabaseEntitiesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getDatabaseEntitiesCount() > 0) {
      hash = (37 * hash) + DATABASE_ENTITIES_FIELD_NUMBER;
      hash = (53 * hash) + getDatabaseEntitiesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse parseFrom(
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
      com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse prototype) {
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
   * Response message for 'DescribeDatabaseEntities' request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse)
      com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.clouddms.v1.ClouddmsProto
          .internal_static_google_cloud_clouddms_v1_DescribeDatabaseEntitiesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ClouddmsProto
          .internal_static_google_cloud_clouddms_v1_DescribeDatabaseEntitiesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse.class,
              com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (databaseEntitiesBuilder_ == null) {
        databaseEntities_ = java.util.Collections.emptyList();
      } else {
        databaseEntities_ = null;
        databaseEntitiesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ClouddmsProto
          .internal_static_google_cloud_clouddms_v1_DescribeDatabaseEntitiesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse build() {
      com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse buildPartial() {
      com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse result =
          new com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse result) {
      if (databaseEntitiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          databaseEntities_ = java.util.Collections.unmodifiableList(databaseEntities_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.databaseEntities_ = databaseEntities_;
      } else {
        result.databaseEntities_ = databaseEntitiesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse) {
        return mergeFrom((com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse other) {
      if (other
          == com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse.getDefaultInstance())
        return this;
      if (databaseEntitiesBuilder_ == null) {
        if (!other.databaseEntities_.isEmpty()) {
          if (databaseEntities_.isEmpty()) {
            databaseEntities_ = other.databaseEntities_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDatabaseEntitiesIsMutable();
            databaseEntities_.addAll(other.databaseEntities_);
          }
          onChanged();
        }
      } else {
        if (!other.databaseEntities_.isEmpty()) {
          if (databaseEntitiesBuilder_.isEmpty()) {
            databaseEntitiesBuilder_.dispose();
            databaseEntitiesBuilder_ = null;
            databaseEntities_ = other.databaseEntities_;
            bitField0_ = (bitField0_ & ~0x00000001);
            databaseEntitiesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDatabaseEntitiesFieldBuilder()
                    : null;
          } else {
            databaseEntitiesBuilder_.addAllMessages(other.databaseEntities_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
                com.google.cloud.clouddms.v1.DatabaseEntity m =
                    input.readMessage(
                        com.google.cloud.clouddms.v1.DatabaseEntity.parser(), extensionRegistry);
                if (databaseEntitiesBuilder_ == null) {
                  ensureDatabaseEntitiesIsMutable();
                  databaseEntities_.add(m);
                } else {
                  databaseEntitiesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private java.util.List<com.google.cloud.clouddms.v1.DatabaseEntity> databaseEntities_ =
        java.util.Collections.emptyList();

    private void ensureDatabaseEntitiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        databaseEntities_ =
            new java.util.ArrayList<com.google.cloud.clouddms.v1.DatabaseEntity>(databaseEntities_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.clouddms.v1.DatabaseEntity,
            com.google.cloud.clouddms.v1.DatabaseEntity.Builder,
            com.google.cloud.clouddms.v1.DatabaseEntityOrBuilder>
        databaseEntitiesBuilder_;

    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public java.util.List<com.google.cloud.clouddms.v1.DatabaseEntity> getDatabaseEntitiesList() {
      if (databaseEntitiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(databaseEntities_);
      } else {
        return databaseEntitiesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public int getDatabaseEntitiesCount() {
      if (databaseEntitiesBuilder_ == null) {
        return databaseEntities_.size();
      } else {
        return databaseEntitiesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public com.google.cloud.clouddms.v1.DatabaseEntity getDatabaseEntities(int index) {
      if (databaseEntitiesBuilder_ == null) {
        return databaseEntities_.get(index);
      } else {
        return databaseEntitiesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public Builder setDatabaseEntities(
        int index, com.google.cloud.clouddms.v1.DatabaseEntity value) {
      if (databaseEntitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatabaseEntitiesIsMutable();
        databaseEntities_.set(index, value);
        onChanged();
      } else {
        databaseEntitiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public Builder setDatabaseEntities(
        int index, com.google.cloud.clouddms.v1.DatabaseEntity.Builder builderForValue) {
      if (databaseEntitiesBuilder_ == null) {
        ensureDatabaseEntitiesIsMutable();
        databaseEntities_.set(index, builderForValue.build());
        onChanged();
      } else {
        databaseEntitiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public Builder addDatabaseEntities(com.google.cloud.clouddms.v1.DatabaseEntity value) {
      if (databaseEntitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatabaseEntitiesIsMutable();
        databaseEntities_.add(value);
        onChanged();
      } else {
        databaseEntitiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public Builder addDatabaseEntities(
        int index, com.google.cloud.clouddms.v1.DatabaseEntity value) {
      if (databaseEntitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatabaseEntitiesIsMutable();
        databaseEntities_.add(index, value);
        onChanged();
      } else {
        databaseEntitiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public Builder addDatabaseEntities(
        com.google.cloud.clouddms.v1.DatabaseEntity.Builder builderForValue) {
      if (databaseEntitiesBuilder_ == null) {
        ensureDatabaseEntitiesIsMutable();
        databaseEntities_.add(builderForValue.build());
        onChanged();
      } else {
        databaseEntitiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public Builder addDatabaseEntities(
        int index, com.google.cloud.clouddms.v1.DatabaseEntity.Builder builderForValue) {
      if (databaseEntitiesBuilder_ == null) {
        ensureDatabaseEntitiesIsMutable();
        databaseEntities_.add(index, builderForValue.build());
        onChanged();
      } else {
        databaseEntitiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public Builder addAllDatabaseEntities(
        java.lang.Iterable<? extends com.google.cloud.clouddms.v1.DatabaseEntity> values) {
      if (databaseEntitiesBuilder_ == null) {
        ensureDatabaseEntitiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, databaseEntities_);
        onChanged();
      } else {
        databaseEntitiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public Builder clearDatabaseEntities() {
      if (databaseEntitiesBuilder_ == null) {
        databaseEntities_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        databaseEntitiesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public Builder removeDatabaseEntities(int index) {
      if (databaseEntitiesBuilder_ == null) {
        ensureDatabaseEntitiesIsMutable();
        databaseEntities_.remove(index);
        onChanged();
      } else {
        databaseEntitiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public com.google.cloud.clouddms.v1.DatabaseEntity.Builder getDatabaseEntitiesBuilder(
        int index) {
      return getDatabaseEntitiesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public com.google.cloud.clouddms.v1.DatabaseEntityOrBuilder getDatabaseEntitiesOrBuilder(
        int index) {
      if (databaseEntitiesBuilder_ == null) {
        return databaseEntities_.get(index);
      } else {
        return databaseEntitiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.clouddms.v1.DatabaseEntityOrBuilder>
        getDatabaseEntitiesOrBuilderList() {
      if (databaseEntitiesBuilder_ != null) {
        return databaseEntitiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(databaseEntities_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public com.google.cloud.clouddms.v1.DatabaseEntity.Builder addDatabaseEntitiesBuilder() {
      return getDatabaseEntitiesFieldBuilder()
          .addBuilder(com.google.cloud.clouddms.v1.DatabaseEntity.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public com.google.cloud.clouddms.v1.DatabaseEntity.Builder addDatabaseEntitiesBuilder(
        int index) {
      return getDatabaseEntitiesFieldBuilder()
          .addBuilder(index, com.google.cloud.clouddms.v1.DatabaseEntity.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of database entities for the conversion workspace.
     * </pre>
     *
     * <code>repeated .google.cloud.clouddms.v1.DatabaseEntity database_entities = 1;</code>
     */
    public java.util.List<com.google.cloud.clouddms.v1.DatabaseEntity.Builder>
        getDatabaseEntitiesBuilderList() {
      return getDatabaseEntitiesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.clouddms.v1.DatabaseEntity,
            com.google.cloud.clouddms.v1.DatabaseEntity.Builder,
            com.google.cloud.clouddms.v1.DatabaseEntityOrBuilder>
        getDatabaseEntitiesFieldBuilder() {
      if (databaseEntitiesBuilder_ == null) {
        databaseEntitiesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.clouddms.v1.DatabaseEntity,
                com.google.cloud.clouddms.v1.DatabaseEntity.Builder,
                com.google.cloud.clouddms.v1.DatabaseEntityOrBuilder>(
                databaseEntities_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        databaseEntities_ = null;
      }
      return databaseEntitiesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse)
  private static final com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse();
  }

  public static com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DescribeDatabaseEntitiesResponse> PARSER =
      new com.google.protobuf.AbstractParser<DescribeDatabaseEntitiesResponse>() {
        @java.lang.Override
        public DescribeDatabaseEntitiesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DescribeDatabaseEntitiesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DescribeDatabaseEntitiesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.DescribeDatabaseEntitiesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
