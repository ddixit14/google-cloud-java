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

public interface ServiceAccountOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.ServiceAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the service account.
   *
   * Use one of the following formats:
   *
   * * `projects/{PROJECT_ID}/serviceAccounts/{EMAIL_ADDRESS}`
   * * `projects/{PROJECT_ID}/serviceAccounts/{UNIQUE_ID}`
   *
   * As an alternative, you can use the `-` wildcard character instead of the
   * project ID:
   *
   * * `projects/-/serviceAccounts/{EMAIL_ADDRESS}`
   * * `projects/-/serviceAccounts/{UNIQUE_ID}`
   *
   * When possible, avoid using the `-` wildcard character, because it can cause
   * response messages to contain misleading error codes. For example, if you
   * try to get the service account
   * `projects/-/serviceAccounts/fake&#64;example.com`, which does not exist, the
   * response contains an HTTP `403 Forbidden` error instead of a `404 Not
   * Found` error.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the service account.
   *
   * Use one of the following formats:
   *
   * * `projects/{PROJECT_ID}/serviceAccounts/{EMAIL_ADDRESS}`
   * * `projects/{PROJECT_ID}/serviceAccounts/{UNIQUE_ID}`
   *
   * As an alternative, you can use the `-` wildcard character instead of the
   * project ID:
   *
   * * `projects/-/serviceAccounts/{EMAIL_ADDRESS}`
   * * `projects/-/serviceAccounts/{UNIQUE_ID}`
   *
   * When possible, avoid using the `-` wildcard character, because it can cause
   * response messages to contain misleading error codes. For example, if you
   * try to get the service account
   * `projects/-/serviceAccounts/fake&#64;example.com`, which does not exist, the
   * response contains an HTTP `403 Forbidden` error instead of a `404 Not
   * Found` error.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The ID of the project that owns the service account.
   * </pre>
   *
   * <code>string project_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Output only. The ID of the project that owns the service account.
   * </pre>
   *
   * <code>string project_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The unique, stable numeric ID for the service account.
   *
   * Each service account retains its unique ID even if you delete the service
   * account. For example, if you delete a service account, then create a new
   * service account with the same name, the new service account has a different
   * unique ID than the deleted service account.
   * </pre>
   *
   * <code>string unique_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uniqueId.
   */
  java.lang.String getUniqueId();
  /**
   *
   *
   * <pre>
   * Output only. The unique, stable numeric ID for the service account.
   *
   * Each service account retains its unique ID even if you delete the service
   * account. For example, if you delete a service account, then create a new
   * service account with the same name, the new service account has a different
   * unique ID than the deleted service account.
   * </pre>
   *
   * <code>string unique_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uniqueId.
   */
  com.google.protobuf.ByteString getUniqueIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The email address of the service account.
   * </pre>
   *
   * <code>string email = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   *
   *
   * <pre>
   * Output only. The email address of the service account.
   * </pre>
   *
   * <code>string email = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString getEmailBytes();

  /**
   *
   *
   * <pre>
   * Optional. A user-specified, human-readable name for the service account. The maximum
   * length is 100 UTF-8 bytes.
   * </pre>
   *
   * <code>string display_name = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. A user-specified, human-readable name for the service account. The maximum
   * length is 100 UTF-8 bytes.
   * </pre>
   *
   * <code>string display_name = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. Do not use.
   * </pre>
   *
   * <code>bytes etag = 7 [deprecated = true];</code>
   *
   * @deprecated google.iam.admin.v1.ServiceAccount.etag is deprecated. See
   *     google/iam/admin/v1/iam.proto;l=538
   * @return The etag.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getEtag();

  /**
   *
   *
   * <pre>
   * Optional. A user-specified, human-readable description of the service account. The
   * maximum length is 256 UTF-8 bytes.
   * </pre>
   *
   * <code>string description = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. A user-specified, human-readable description of the service account. The
   * maximum length is 256 UTF-8 bytes.
   * </pre>
   *
   * <code>string description = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The OAuth 2.0 client ID for the service account.
   * </pre>
   *
   * <code>string oauth2_client_id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The oauth2ClientId.
   */
  java.lang.String getOauth2ClientId();
  /**
   *
   *
   * <pre>
   * Output only. The OAuth 2.0 client ID for the service account.
   * </pre>
   *
   * <code>string oauth2_client_id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for oauth2ClientId.
   */
  com.google.protobuf.ByteString getOauth2ClientIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Whether the service account is disabled.
   * </pre>
   *
   * <code>bool disabled = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();
}
