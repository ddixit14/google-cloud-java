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
// source: google/cloud/filestore/v1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1;

public interface FileShareConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1.FileShareConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the file share (must be 16 characters or less).
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
   * The name of the file share (must be 16 characters or less).
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
   * File share capacity in gigabytes (GB).
   * Filestore defines 1 GB as 1024^3 bytes.
   * </pre>
   *
   * <code>int64 capacity_gb = 2;</code>
   *
   * @return The capacityGb.
   */
  long getCapacityGb();

  /**
   *
   *
   * <pre>
   * The resource name of the backup, in the format
   * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`,
   * that this file share has been restored from.
   * </pre>
   *
   * <code>string source_backup = 8 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the sourceBackup field is set.
   */
  boolean hasSourceBackup();
  /**
   *
   *
   * <pre>
   * The resource name of the backup, in the format
   * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`,
   * that this file share has been restored from.
   * </pre>
   *
   * <code>string source_backup = 8 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The sourceBackup.
   */
  java.lang.String getSourceBackup();
  /**
   *
   *
   * <pre>
   * The resource name of the backup, in the format
   * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`,
   * that this file share has been restored from.
   * </pre>
   *
   * <code>string source_backup = 8 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for sourceBackup.
   */
  com.google.protobuf.ByteString getSourceBackupBytes();

  /**
   *
   *
   * <pre>
   * Nfs Export Options.
   * There is a limit of 10 export options per file share.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1.NfsExportOptions nfs_export_options = 7;</code>
   */
  java.util.List<com.google.cloud.filestore.v1.NfsExportOptions> getNfsExportOptionsList();
  /**
   *
   *
   * <pre>
   * Nfs Export Options.
   * There is a limit of 10 export options per file share.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1.NfsExportOptions nfs_export_options = 7;</code>
   */
  com.google.cloud.filestore.v1.NfsExportOptions getNfsExportOptions(int index);
  /**
   *
   *
   * <pre>
   * Nfs Export Options.
   * There is a limit of 10 export options per file share.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1.NfsExportOptions nfs_export_options = 7;</code>
   */
  int getNfsExportOptionsCount();
  /**
   *
   *
   * <pre>
   * Nfs Export Options.
   * There is a limit of 10 export options per file share.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1.NfsExportOptions nfs_export_options = 7;</code>
   */
  java.util.List<? extends com.google.cloud.filestore.v1.NfsExportOptionsOrBuilder>
      getNfsExportOptionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Nfs Export Options.
   * There is a limit of 10 export options per file share.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1.NfsExportOptions nfs_export_options = 7;</code>
   */
  com.google.cloud.filestore.v1.NfsExportOptionsOrBuilder getNfsExportOptionsOrBuilder(int index);

  com.google.cloud.filestore.v1.FileShareConfig.SourceCase getSourceCase();
}
