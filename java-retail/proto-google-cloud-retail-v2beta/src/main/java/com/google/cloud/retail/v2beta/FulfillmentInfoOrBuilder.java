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
// source: google/cloud/retail/v2beta/common.proto

package com.google.cloud.retail.v2beta;

public interface FulfillmentInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.FulfillmentInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The fulfillment type, including commonly used types (such as pickup in
   * store and same day delivery), and custom types. Customers have to map
   * custom types to their display names before rendering UI.
   *
   * Supported values:
   *
   * * "pickup-in-store"
   * * "ship-to-store"
   * * "same-day-delivery"
   * * "next-day-delivery"
   * * "custom-type-1"
   * * "custom-type-2"
   * * "custom-type-3"
   * * "custom-type-4"
   * * "custom-type-5"
   *
   * If this field is set to an invalid value other than these, an
   * INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * The fulfillment type, including commonly used types (such as pickup in
   * store and same day delivery), and custom types. Customers have to map
   * custom types to their display names before rendering UI.
   *
   * Supported values:
   *
   * * "pickup-in-store"
   * * "ship-to-store"
   * * "same-day-delivery"
   * * "next-day-delivery"
   * * "custom-type-1"
   * * "custom-type-2"
   * * "custom-type-3"
   * * "custom-type-4"
   * * "custom-type-5"
   *
   * If this field is set to an invalid value other than these, an
   * INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * The IDs for this [type][google.cloud.retail.v2beta.FulfillmentInfo.type],
   * such as the store IDs for
   * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2beta.FulfillmentInfo.type]
   * or the region IDs for
   * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2beta.FulfillmentInfo.type].
   *
   * A maximum of 3000 values are allowed. Each value must be a string with a
   * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
   * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>repeated string place_ids = 2;</code>
   *
   * @return A list containing the placeIds.
   */
  java.util.List<java.lang.String> getPlaceIdsList();
  /**
   *
   *
   * <pre>
   * The IDs for this [type][google.cloud.retail.v2beta.FulfillmentInfo.type],
   * such as the store IDs for
   * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2beta.FulfillmentInfo.type]
   * or the region IDs for
   * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2beta.FulfillmentInfo.type].
   *
   * A maximum of 3000 values are allowed. Each value must be a string with a
   * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
   * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>repeated string place_ids = 2;</code>
   *
   * @return The count of placeIds.
   */
  int getPlaceIdsCount();
  /**
   *
   *
   * <pre>
   * The IDs for this [type][google.cloud.retail.v2beta.FulfillmentInfo.type],
   * such as the store IDs for
   * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2beta.FulfillmentInfo.type]
   * or the region IDs for
   * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2beta.FulfillmentInfo.type].
   *
   * A maximum of 3000 values are allowed. Each value must be a string with a
   * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
   * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>repeated string place_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The placeIds at the given index.
   */
  java.lang.String getPlaceIds(int index);
  /**
   *
   *
   * <pre>
   * The IDs for this [type][google.cloud.retail.v2beta.FulfillmentInfo.type],
   * such as the store IDs for
   * [FulfillmentInfo.type.pickup-in-store][google.cloud.retail.v2beta.FulfillmentInfo.type]
   * or the region IDs for
   * [FulfillmentInfo.type.same-day-delivery][google.cloud.retail.v2beta.FulfillmentInfo.type].
   *
   * A maximum of 3000 values are allowed. Each value must be a string with a
   * length limit of 30 characters, matching the pattern `[a-zA-Z0-9_-]+`, such
   * as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>repeated string place_ids = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the placeIds at the given index.
   */
  com.google.protobuf.ByteString getPlaceIdsBytes(int index);
}
