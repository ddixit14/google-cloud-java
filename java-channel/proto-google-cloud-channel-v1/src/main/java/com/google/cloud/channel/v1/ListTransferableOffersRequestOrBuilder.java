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
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface ListTransferableOffersRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ListTransferableOffersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Customer's Cloud Identity ID
   * </pre>
   *
   * <code>string cloud_identity_id = 4;</code>
   *
   * @return Whether the cloudIdentityId field is set.
   */
  boolean hasCloudIdentityId();
  /**
   *
   *
   * <pre>
   * Customer's Cloud Identity ID
   * </pre>
   *
   * <code>string cloud_identity_id = 4;</code>
   *
   * @return The cloudIdentityId.
   */
  java.lang.String getCloudIdentityId();
  /**
   *
   *
   * <pre>
   * Customer's Cloud Identity ID
   * </pre>
   *
   * <code>string cloud_identity_id = 4;</code>
   *
   * @return The bytes for cloudIdentityId.
   */
  com.google.protobuf.ByteString getCloudIdentityIdBytes();

  /**
   *
   *
   * <pre>
   * A reseller should create a customer and use the resource name of
   * that customer here.
   * </pre>
   *
   * <code>string customer_name = 5;</code>
   *
   * @return Whether the customerName field is set.
   */
  boolean hasCustomerName();
  /**
   *
   *
   * <pre>
   * A reseller should create a customer and use the resource name of
   * that customer here.
   * </pre>
   *
   * <code>string customer_name = 5;</code>
   *
   * @return The customerName.
   */
  java.lang.String getCustomerName();
  /**
   *
   *
   * <pre>
   * A reseller should create a customer and use the resource name of
   * that customer here.
   * </pre>
   *
   * <code>string customer_name = 5;</code>
   *
   * @return The bytes for customerName.
   */
  com.google.protobuf.ByteString getCustomerNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the reseller's account.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the reseller's account.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Requested page size. Server might return fewer results than requested.
   * If unspecified, returns at most 100 offers.
   * The maximum value is 1000; the server will coerce values above 1000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A token for a page of results other than the first page.
   * Obtained using
   * [ListTransferableOffersResponse.next_page_token][google.cloud.channel.v1.ListTransferableOffersResponse.next_page_token]
   * of the previous
   * [CloudChannelService.ListTransferableOffers][google.cloud.channel.v1.CloudChannelService.ListTransferableOffers]
   * call.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A token for a page of results other than the first page.
   * Obtained using
   * [ListTransferableOffersResponse.next_page_token][google.cloud.channel.v1.ListTransferableOffersResponse.next_page_token]
   * of the previous
   * [CloudChannelService.ListTransferableOffers][google.cloud.channel.v1.CloudChannelService.ListTransferableOffers]
   * call.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Required. The SKU to look up Offers for.
   * </pre>
   *
   * <code>string sku = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The sku.
   */
  java.lang.String getSku();
  /**
   *
   *
   * <pre>
   * Required. The SKU to look up Offers for.
   * </pre>
   *
   * <code>string sku = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for sku.
   */
  com.google.protobuf.ByteString getSkuBytes();

  /**
   *
   *
   * <pre>
   * Optional. The BCP-47 language code. For example, "en-US". The
   * response will localize in the corresponding language code, if specified.
   * The default value is "en-US".
   * </pre>
   *
   * <code>string language_code = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The BCP-47 language code. For example, "en-US". The
   * response will localize in the corresponding language code, if specified.
   * The default value is "en-US".
   * </pre>
   *
   * <code>string language_code = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  com.google.cloud.channel.v1.ListTransferableOffersRequest.TransferredCustomerIdentityCase
      getTransferredCustomerIdentityCase();
}
