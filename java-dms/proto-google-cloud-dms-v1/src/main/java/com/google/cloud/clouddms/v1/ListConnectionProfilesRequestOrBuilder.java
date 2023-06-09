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

public interface ListConnectionProfilesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.ListConnectionProfilesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent which owns this collection of connection profiles.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent which owns this collection of connection profiles.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of connection profiles to return. The service may return
   * fewer than this value. If unspecified, at most 50 connection profiles will
   * be returned. The maximum value is 1000; values above 1000 are coerced
   * to 1000.
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
   * A page token, received from a previous `ListConnectionProfiles` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListConnectionProfiles`
   * must match the call that provided the page token.
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
   * A page token, received from a previous `ListConnectionProfiles` call.
   * Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `ListConnectionProfiles`
   * must match the call that provided the page token.
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
   * A filter expression that filters connection profiles listed in the
   * response. The expression must specify the field name, a comparison
   * operator, and the value that you want to use for filtering. The value must
   * be a string, a number, or a boolean. The comparison operator must be either
   * =, !=, &gt;, or &lt;. For example, list connection profiles created this year by
   * specifying **createTime %gt; 2020-01-01T00:00:00.000000000Z**. You can
   * also filter nested fields. For example, you could specify **mySql.username
   * = %lt;my_username%gt;** to list all connection profiles configured to
   * connect with a specific username.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * A filter expression that filters connection profiles listed in the
   * response. The expression must specify the field name, a comparison
   * operator, and the value that you want to use for filtering. The value must
   * be a string, a number, or a boolean. The comparison operator must be either
   * =, !=, &gt;, or &lt;. For example, list connection profiles created this year by
   * specifying **createTime %gt; 2020-01-01T00:00:00.000000000Z**. You can
   * also filter nested fields. For example, you could specify **mySql.username
   * = %lt;my_username%gt;** to list all connection profiles configured to
   * connect with a specific username.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * A comma-separated list of fields to order results according to.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * A comma-separated list of fields to order results according to.
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
