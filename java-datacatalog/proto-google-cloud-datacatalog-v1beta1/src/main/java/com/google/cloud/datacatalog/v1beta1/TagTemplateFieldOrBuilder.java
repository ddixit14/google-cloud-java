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
// source: google/cloud/datacatalog/v1beta1/tags.proto

package com.google.cloud.datacatalog.v1beta1;

public interface TagTemplateFieldOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.TagTemplateField)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the tag template field in URL format. Example:
   *
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field}
   *
   * Note that this TagTemplateField may not actually be stored in the location
   * in this name.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the tag template field in URL format. Example:
   *
   * * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field}
   *
   * Note that this TagTemplateField may not actually be stored in the location
   * in this name.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The display name for this field. Defaults to an empty string.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name for this field. Defaults to an empty string.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.datacatalog.v1beta1.FieldType getType();
  /**
   *
   *
   * <pre>
   * Required. The type of value this tag field can contain.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.FieldType type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.FieldTypeOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether this is a required field. Defaults to false.
   * </pre>
   *
   * <code>bool is_required = 3;</code>
   *
   * @return The isRequired.
   */
  boolean getIsRequired();

  /**
   *
   *
   * <pre>
   * The order of this field with respect to other fields in this tag
   * template.  A higher value indicates a more important field. The value can
   * be negative. Multiple fields can have the same order, and field orders
   * within a tag do not have to be sequential.
   * </pre>
   *
   * <code>int32 order = 5;</code>
   *
   * @return The order.
   */
  int getOrder();
}
