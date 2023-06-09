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
// source: google/monitoring/v3/group.proto

package com.google.monitoring.v3;

public interface GroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.Group)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of this group. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   *
   * When creating a group, this field is ignored and a new name is created
   * consisting of the project specified in the call to `CreateGroup`
   * and a unique `[GROUP_ID]` that is generated automatically.
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
   * Output only. The name of this group. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   *
   * When creating a group, this field is ignored and a new name is created
   * consisting of the project specified in the call to `CreateGroup`
   * and a unique `[GROUP_ID]` that is generated automatically.
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
   * A user-assigned name for this group, used only for display purposes.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * A user-assigned name for this group, used only for display purposes.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The name of the group's parent, if it has one. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   *
   * For groups with no parent, `parent_name` is the empty string, `""`.
   * </pre>
   *
   * <code>string parent_name = 3;</code>
   *
   * @return The parentName.
   */
  java.lang.String getParentName();
  /**
   *
   *
   * <pre>
   * The name of the group's parent, if it has one. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]
   *
   * For groups with no parent, `parent_name` is the empty string, `""`.
   * </pre>
   *
   * <code>string parent_name = 3;</code>
   *
   * @return The bytes for parentName.
   */
  com.google.protobuf.ByteString getParentNameBytes();

  /**
   *
   *
   * <pre>
   * The filter used to determine which monitored resources belong to this
   * group.
   * </pre>
   *
   * <code>string filter = 5;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * The filter used to determine which monitored resources belong to this
   * group.
   * </pre>
   *
   * <code>string filter = 5;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * If true, the members of this group are considered to be a cluster.
   * The system can perform additional analysis on groups that are clusters.
   * </pre>
   *
   * <code>bool is_cluster = 6;</code>
   *
   * @return The isCluster.
   */
  boolean getIsCluster();
}
