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
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

public interface BulkMuteFindingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.BulkMuteFindingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent, at which bulk action needs to be applied. Its format
   * is "organizations/[organization_id]", "folders/[folder_id]",
   * "projects/[project_id]".
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
   * Required. The parent, at which bulk action needs to be applied. Its format
   * is "organizations/[organization_id]", "folders/[folder_id]",
   * "projects/[project_id]".
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
   * Expression that identifies findings that should be updated.
   * The expression is a list of zero or more restrictions combined
   * via logical operators `AND` and `OR`. Parentheses are supported, and `OR`
   * has higher precedence than `AND`.
   *
   * Restrictions have the form `&lt;field&gt; &lt;operator&gt; &lt;value&gt;` and may have a
   * `-` character in front of them to indicate negation. The fields map to
   * those defined in the corresponding resource.
   *
   * The supported operators are:
   *
   * * `=` for all value types.
   * * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values.
   * * `:`, meaning substring matching, for strings.
   *
   * The supported value types are:
   *
   * * string literals in quotes.
   * * integer literals without quotes.
   * * boolean literals `true` and `false` without quotes.
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Expression that identifies findings that should be updated.
   * The expression is a list of zero or more restrictions combined
   * via logical operators `AND` and `OR`. Parentheses are supported, and `OR`
   * has higher precedence than `AND`.
   *
   * Restrictions have the form `&lt;field&gt; &lt;operator&gt; &lt;value&gt;` and may have a
   * `-` character in front of them to indicate negation. The fields map to
   * those defined in the corresponding resource.
   *
   * The supported operators are:
   *
   * * `=` for all value types.
   * * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values.
   * * `:`, meaning substring matching, for strings.
   *
   * The supported value types are:
   *
   * * string literals in quotes.
   * * integer literals without quotes.
   * * boolean literals `true` and `false` without quotes.
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * This can be a mute configuration name or any identifier for mute/unmute
   * of findings based on the filter.
   * </pre>
   *
   * <code>string mute_annotation = 3 [deprecated = true];</code>
   *
   * @deprecated google.cloud.securitycenter.v1.BulkMuteFindingsRequest.mute_annotation is
   *     deprecated. See google/cloud/securitycenter/v1/securitycenter_service.proto;l=763
   * @return The muteAnnotation.
   */
  @java.lang.Deprecated
  java.lang.String getMuteAnnotation();
  /**
   *
   *
   * <pre>
   * This can be a mute configuration name or any identifier for mute/unmute
   * of findings based on the filter.
   * </pre>
   *
   * <code>string mute_annotation = 3 [deprecated = true];</code>
   *
   * @deprecated google.cloud.securitycenter.v1.BulkMuteFindingsRequest.mute_annotation is
   *     deprecated. See google/cloud/securitycenter/v1/securitycenter_service.proto;l=763
   * @return The bytes for muteAnnotation.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getMuteAnnotationBytes();
}
