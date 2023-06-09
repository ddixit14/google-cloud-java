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
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

public interface DeleteRoleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.DeleteRoleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The `name` parameter's value depends on the target resource for the
   * request, namely
   * [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles)
   * or
   * [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles).
   * Each resource type's `name` value format is described below:
   *
   * * [`projects.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/delete):
   *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method deletes only
   *   [custom
   *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
   *   have been created at the project level. Example request URL:
   *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
   *
   * * [`organizations.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/delete):
   *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
   *   deletes only [custom
   *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
   *   have been created at the organization level. Example request URL:
   *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
   *
   * Note: Wildcard (*) values are invalid; you must specify a complete project
   * ID or organization ID.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The `name` parameter's value depends on the target resource for the
   * request, namely
   * [`projects`](https://cloud.google.com/iam/reference/rest/v1/projects.roles)
   * or
   * [`organizations`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles).
   * Each resource type's `name` value format is described below:
   *
   * * [`projects.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/projects.roles/delete):
   *   `projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`. This method deletes only
   *   [custom
   *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
   *   have been created at the project level. Example request URL:
   *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles/{CUSTOM_ROLE_ID}`
   *
   * * [`organizations.roles.delete()`](https://cloud.google.com/iam/reference/rest/v1/organizations.roles/delete):
   *   `organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`. This method
   *   deletes only [custom
   *   roles](https://cloud.google.com/iam/docs/understanding-custom-roles) that
   *   have been created at the organization level. Example request URL:
   *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles/{CUSTOM_ROLE_ID}`
   *
   * Note: Wildcard (*) values are invalid; you must specify a complete project
   * ID or organization ID.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Used to perform a consistent read-modify-write.
   * </pre>
   *
   * <code>bytes etag = 2;</code>
   *
   * @return The etag.
   */
  com.google.protobuf.ByteString getEtag();
}
