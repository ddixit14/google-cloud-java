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
// source: google/cloud/resourcemanager/v3/projects.proto

package com.google.cloud.resourcemanager.v3;

public interface SearchProjectsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.SearchProjectsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A query string for searching for projects that the caller has
   * `resourcemanager.projects.get` permission to. If multiple fields are
   * included in the query, then it will return results that match any of the
   * fields. Some eligible fields are:
   *
   * - **`displayName`, `name`**: Filters by displayName.
   * - **`parent`**: Project's parent (for example: `folders/123`,
   * `organizations/&#42;`). Prefer `parent` field over `parent.type` and
   * `parent.id`.
   * - **`parent.type`**: Parent's type: `folder` or `organization`.
   * - **`parent.id`**: Parent's id number (for example: `123`).
   * - **`id`, `projectId`**: Filters by projectId.
   * - **`state`, `lifecycleState`**: Filters by state.
   * - **`labels`**: Filters by label name or value.
   * - **`labels.&lt;key&gt;` (where `&lt;key&gt;` is the name of a label)**: Filters by label
   * name.
   *
   * Search expressions are case insensitive.
   *
   * Some examples queries:
   *
   *
   * - **`name:how*`**: The project's name starts with "how".
   * - **`name:Howl`**: The project's name is `Howl` or `howl`.
   * - **`name:HOWL`**: Equivalent to above.
   * - **`NAME:howl`**: Equivalent to above.
   * - **`labels.color:*`**: The project has the label `color`.
   * - **`labels.color:red`**:  The project's label `color` has the value `red`.
   * - **`labels.color:red labels.size:big`**: The project's label `color` has
   * the value `red` or its label `size` has the value `big`.
   *
   * If no query is specified, the call will return projects for which the user
   * has the `resourcemanager.projects.get` permission.
   * </pre>
   *
   * <code>string query = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Optional. A query string for searching for projects that the caller has
   * `resourcemanager.projects.get` permission to. If multiple fields are
   * included in the query, then it will return results that match any of the
   * fields. Some eligible fields are:
   *
   * - **`displayName`, `name`**: Filters by displayName.
   * - **`parent`**: Project's parent (for example: `folders/123`,
   * `organizations/&#42;`). Prefer `parent` field over `parent.type` and
   * `parent.id`.
   * - **`parent.type`**: Parent's type: `folder` or `organization`.
   * - **`parent.id`**: Parent's id number (for example: `123`).
   * - **`id`, `projectId`**: Filters by projectId.
   * - **`state`, `lifecycleState`**: Filters by state.
   * - **`labels`**: Filters by label name or value.
   * - **`labels.&lt;key&gt;` (where `&lt;key&gt;` is the name of a label)**: Filters by label
   * name.
   *
   * Search expressions are case insensitive.
   *
   * Some examples queries:
   *
   *
   * - **`name:how*`**: The project's name starts with "how".
   * - **`name:Howl`**: The project's name is `Howl` or `howl`.
   * - **`name:HOWL`**: Equivalent to above.
   * - **`NAME:howl`**: Equivalent to above.
   * - **`labels.color:*`**: The project has the label `color`.
   * - **`labels.color:red`**:  The project's label `color` has the value `red`.
   * - **`labels.color:red labels.size:big`**: The project's label `color` has
   * the value `red` or its label `size` has the value `big`.
   *
   * If no query is specified, the call will return projects for which the user
   * has the `resourcemanager.projects.get` permission.
   * </pre>
   *
   * <code>string query = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Optional. A pagination token returned from a previous call to
   * [ListProjects] [google.cloud.resourcemanager.v3.Projects.ListProjects] that
   * indicates from where listing should continue.
   * </pre>
   *
   * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A pagination token returned from a previous call to
   * [ListProjects] [google.cloud.resourcemanager.v3.Projects.ListProjects] that
   * indicates from where listing should continue.
   * </pre>
   *
   * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of projects to return in the response.
   * The server can return fewer projects than requested.
   * If unspecified, server picks an appropriate default.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();
}
