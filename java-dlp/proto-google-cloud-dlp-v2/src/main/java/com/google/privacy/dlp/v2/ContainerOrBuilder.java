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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ContainerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.Container)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Container type, for example BigQuery or Cloud Storage.
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * Container type, for example BigQuery or Cloud Storage.
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * Project where the finding was found.
   * Can be different from the project that owns the finding.
   * </pre>
   *
   * <code>string project_id = 2;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Project where the finding was found.
   * Can be different from the project that owns the finding.
   * </pre>
   *
   * <code>string project_id = 2;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * A string representation of the full container name.
   * Examples:
   * - BigQuery: 'Project:DataSetId.TableId'
   * - Cloud Storage: 'gs://Bucket/folders/filename.txt'
   * </pre>
   *
   * <code>string full_path = 3;</code>
   *
   * @return The fullPath.
   */
  java.lang.String getFullPath();
  /**
   *
   *
   * <pre>
   * A string representation of the full container name.
   * Examples:
   * - BigQuery: 'Project:DataSetId.TableId'
   * - Cloud Storage: 'gs://Bucket/folders/filename.txt'
   * </pre>
   *
   * <code>string full_path = 3;</code>
   *
   * @return The bytes for fullPath.
   */
  com.google.protobuf.ByteString getFullPathBytes();

  /**
   *
   *
   * <pre>
   * The root of the container.
   * Examples:
   *
   * - For BigQuery table `project_id:dataset_id.table_id`, the root is
   *  `dataset_id`
   * - For Cloud Storage file `gs://bucket/folder/filename.txt`, the root
   *  is `gs://bucket`
   * </pre>
   *
   * <code>string root_path = 4;</code>
   *
   * @return The rootPath.
   */
  java.lang.String getRootPath();
  /**
   *
   *
   * <pre>
   * The root of the container.
   * Examples:
   *
   * - For BigQuery table `project_id:dataset_id.table_id`, the root is
   *  `dataset_id`
   * - For Cloud Storage file `gs://bucket/folder/filename.txt`, the root
   *  is `gs://bucket`
   * </pre>
   *
   * <code>string root_path = 4;</code>
   *
   * @return The bytes for rootPath.
   */
  com.google.protobuf.ByteString getRootPathBytes();

  /**
   *
   *
   * <pre>
   * The rest of the path after the root.
   * Examples:
   *
   * - For BigQuery table `project_id:dataset_id.table_id`, the relative path is
   *  `table_id`
   * - For Cloud Storage file `gs://bucket/folder/filename.txt`, the relative
   *  path is `folder/filename.txt`
   * </pre>
   *
   * <code>string relative_path = 5;</code>
   *
   * @return The relativePath.
   */
  java.lang.String getRelativePath();
  /**
   *
   *
   * <pre>
   * The rest of the path after the root.
   * Examples:
   *
   * - For BigQuery table `project_id:dataset_id.table_id`, the relative path is
   *  `table_id`
   * - For Cloud Storage file `gs://bucket/folder/filename.txt`, the relative
   *  path is `folder/filename.txt`
   * </pre>
   *
   * <code>string relative_path = 5;</code>
   *
   * @return The bytes for relativePath.
   */
  com.google.protobuf.ByteString getRelativePathBytes();

  /**
   *
   *
   * <pre>
   * Findings container modification timestamp, if applicable. For Cloud
   * Storage, this field contains the last file modification timestamp. For a
   * BigQuery table, this field contains the last_modified_time property. For
   * Datastore, this field isn't populated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Findings container modification timestamp, if applicable. For Cloud
   * Storage, this field contains the last file modification timestamp. For a
   * BigQuery table, this field contains the last_modified_time property. For
   * Datastore, this field isn't populated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Findings container modification timestamp, if applicable. For Cloud
   * Storage, this field contains the last file modification timestamp. For a
   * BigQuery table, this field contains the last_modified_time property. For
   * Datastore, this field isn't populated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Findings container version, if available
   * ("generation" for Cloud Storage).
   * </pre>
   *
   * <code>string version = 7;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Findings container version, if available
   * ("generation" for Cloud Storage).
   * </pre>
   *
   * <code>string version = 7;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();
}
