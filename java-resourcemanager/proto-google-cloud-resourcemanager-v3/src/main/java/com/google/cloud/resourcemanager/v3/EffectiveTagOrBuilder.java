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
// source: google/cloud/resourcemanager/v3/tag_bindings.proto

package com.google.cloud.resourcemanager.v3;

public interface EffectiveTagOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.EffectiveTag)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name for TagValue in the format `tagValues/456`.
   * </pre>
   *
   * <code>string tag_value = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The tagValue.
   */
  java.lang.String getTagValue();
  /**
   *
   *
   * <pre>
   * Resource name for TagValue in the format `tagValues/456`.
   * </pre>
   *
   * <code>string tag_value = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for tagValue.
   */
  com.google.protobuf.ByteString getTagValueBytes();

  /**
   *
   *
   * <pre>
   * The namespaced name of the TagValue. Can be in the form
   * `{organization_id}/{tag_key_short_name}/{tag_value_short_name}` or
   * `{project_id}/{tag_key_short_name}/{tag_value_short_name}` or
   * `{project_number}/{tag_key_short_name}/{tag_value_short_name}`.
   * </pre>
   *
   * <code>string namespaced_tag_value = 2;</code>
   *
   * @return The namespacedTagValue.
   */
  java.lang.String getNamespacedTagValue();
  /**
   *
   *
   * <pre>
   * The namespaced name of the TagValue. Can be in the form
   * `{organization_id}/{tag_key_short_name}/{tag_value_short_name}` or
   * `{project_id}/{tag_key_short_name}/{tag_value_short_name}` or
   * `{project_number}/{tag_key_short_name}/{tag_value_short_name}`.
   * </pre>
   *
   * <code>string namespaced_tag_value = 2;</code>
   *
   * @return The bytes for namespacedTagValue.
   */
  com.google.protobuf.ByteString getNamespacedTagValueBytes();

  /**
   *
   *
   * <pre>
   * The name of the TagKey, in the format `tagKeys/{id}`, such as
   * `tagKeys/123`.
   * </pre>
   *
   * <code>string tag_key = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The tagKey.
   */
  java.lang.String getTagKey();
  /**
   *
   *
   * <pre>
   * The name of the TagKey, in the format `tagKeys/{id}`, such as
   * `tagKeys/123`.
   * </pre>
   *
   * <code>string tag_key = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for tagKey.
   */
  com.google.protobuf.ByteString getTagKeyBytes();

  /**
   *
   *
   * <pre>
   * The namespaced name of the TagKey. Can be in the form
   * `{organization_id}/{tag_key_short_name}` or
   * `{project_id}/{tag_key_short_name}` or
   * `{project_number}/{tag_key_short_name}`.
   * </pre>
   *
   * <code>string namespaced_tag_key = 4;</code>
   *
   * @return The namespacedTagKey.
   */
  java.lang.String getNamespacedTagKey();
  /**
   *
   *
   * <pre>
   * The namespaced name of the TagKey. Can be in the form
   * `{organization_id}/{tag_key_short_name}` or
   * `{project_id}/{tag_key_short_name}` or
   * `{project_number}/{tag_key_short_name}`.
   * </pre>
   *
   * <code>string namespaced_tag_key = 4;</code>
   *
   * @return The bytes for namespacedTagKey.
   */
  com.google.protobuf.ByteString getNamespacedTagKeyBytes();

  /**
   *
   *
   * <pre>
   * The parent name of the tag key.
   * Must be in the format `organizations/{organization_id}` or
   * `projects/{project_number}`
   * </pre>
   *
   * <code>string tag_key_parent_name = 6;</code>
   *
   * @return The tagKeyParentName.
   */
  java.lang.String getTagKeyParentName();
  /**
   *
   *
   * <pre>
   * The parent name of the tag key.
   * Must be in the format `organizations/{organization_id}` or
   * `projects/{project_number}`
   * </pre>
   *
   * <code>string tag_key_parent_name = 6;</code>
   *
   * @return The bytes for tagKeyParentName.
   */
  com.google.protobuf.ByteString getTagKeyParentNameBytes();

  /**
   *
   *
   * <pre>
   * Indicates the inheritance status of a tag value
   * attached to the given resource. If the tag value is inherited from one of
   * the resource's ancestors, inherited will be true. If false, then the tag
   * value is directly attached to the resource, inherited will be false.
   * </pre>
   *
   * <code>bool inherited = 5;</code>
   *
   * @return The inherited.
   */
  boolean getInherited();
}
