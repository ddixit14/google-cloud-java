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
// source: google/cloud/retail/v2beta/promotion.proto

package com.google.cloud.retail.v2beta;

public interface PromotionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.Promotion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * ID of the promotion. For example, "free gift".
   *
   * The value must be a UTF-8 encoded string with a length limit of 128
   * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
   * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   *
   * Google Merchant Center property
   * [promotion](https://support.google.com/merchants/answer/7050148).
   * </pre>
   *
   * <code>string promotion_id = 1;</code>
   *
   * @return The promotionId.
   */
  java.lang.String getPromotionId();
  /**
   *
   *
   * <pre>
   * ID of the promotion. For example, "free gift".
   *
   * The value must be a UTF-8 encoded string with a length limit of 128
   * characters, and match the pattern: `[a-zA-Z][a-zA-Z0-9_]*`. For example,
   * id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   *
   * Google Merchant Center property
   * [promotion](https://support.google.com/merchants/answer/7050148).
   * </pre>
   *
   * <code>string promotion_id = 1;</code>
   *
   * @return The bytes for promotionId.
   */
  com.google.protobuf.ByteString getPromotionIdBytes();
}
