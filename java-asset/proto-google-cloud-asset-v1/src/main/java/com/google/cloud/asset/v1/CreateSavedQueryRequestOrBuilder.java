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
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface CreateSavedQueryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.CreateSavedQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project/folder/organization where this
   * saved_query should be created in. It can only be an organization number
   * (such as "organizations/123"), a folder number (such as "folders/123"), a
   * project ID (such as "projects/my-project-id"), or a project number (such as
   * "projects/12345").
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
   * Required. The name of the project/folder/organization where this
   * saved_query should be created in. It can only be an organization number
   * (such as "organizations/123"), a folder number (such as "folders/123"), a
   * project ID (such as "projects/my-project-id"), or a project number (such as
   * "projects/12345").
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
   * Required. The saved_query details. The `name` field must be empty as it
   * will be generated based on the parent and saved_query_id.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the savedQuery field is set.
   */
  boolean hasSavedQuery();
  /**
   *
   *
   * <pre>
   * Required. The saved_query details. The `name` field must be empty as it
   * will be generated based on the parent and saved_query_id.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The savedQuery.
   */
  com.google.cloud.asset.v1.SavedQuery getSavedQuery();
  /**
   *
   *
   * <pre>
   * Required. The saved_query details. The `name` field must be empty as it
   * will be generated based on the parent and saved_query_id.
   * </pre>
   *
   * <code>
   * .google.cloud.asset.v1.SavedQuery saved_query = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.asset.v1.SavedQueryOrBuilder getSavedQueryOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the saved query, which must be unique in the
   * specified parent. It will become the final component of the saved query's
   * resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are `[a-z][0-9]-`.
   *
   * Notice that this field is required in the saved query creation, and the
   * `name` field of the `saved_query` will be ignored.
   * </pre>
   *
   * <code>string saved_query_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The savedQueryId.
   */
  java.lang.String getSavedQueryId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the saved query, which must be unique in the
   * specified parent. It will become the final component of the saved query's
   * resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are `[a-z][0-9]-`.
   *
   * Notice that this field is required in the saved query creation, and the
   * `name` field of the `saved_query` will be ignored.
   * </pre>
   *
   * <code>string saved_query_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for savedQueryId.
   */
  com.google.protobuf.ByteString getSavedQueryIdBytes();
}
