/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

public interface FileValidationReportOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.FileValidationReport)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the file.
   * </pre>
   *
   * <code>string file_name = 1;</code>
   *
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   *
   *
   * <pre>
   * The name of the file.
   * </pre>
   *
   * <code>string file_name = 1;</code>
   *
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString getFileNameBytes();

  /**
   *
   *
   * <pre>
   * Partial list of rows that encountered validation error.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportRowError row_errors = 2;</code>
   */
  java.util.List<com.google.cloud.migrationcenter.v1.ImportRowError> getRowErrorsList();
  /**
   *
   *
   * <pre>
   * Partial list of rows that encountered validation error.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportRowError row_errors = 2;</code>
   */
  com.google.cloud.migrationcenter.v1.ImportRowError getRowErrors(int index);
  /**
   *
   *
   * <pre>
   * Partial list of rows that encountered validation error.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportRowError row_errors = 2;</code>
   */
  int getRowErrorsCount();
  /**
   *
   *
   * <pre>
   * Partial list of rows that encountered validation error.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportRowError row_errors = 2;</code>
   */
  java.util.List<? extends com.google.cloud.migrationcenter.v1.ImportRowErrorOrBuilder>
      getRowErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Partial list of rows that encountered validation error.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportRowError row_errors = 2;</code>
   */
  com.google.cloud.migrationcenter.v1.ImportRowErrorOrBuilder getRowErrorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Flag indicating that processing was aborted due to maximum number of
   * errors.
   * </pre>
   *
   * <code>bool partial_report = 3;</code>
   *
   * @return The partialReport.
   */
  boolean getPartialReport();

  /**
   *
   *
   * <pre>
   * List of file level errors.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportError file_errors = 4;</code>
   */
  java.util.List<com.google.cloud.migrationcenter.v1.ImportError> getFileErrorsList();
  /**
   *
   *
   * <pre>
   * List of file level errors.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportError file_errors = 4;</code>
   */
  com.google.cloud.migrationcenter.v1.ImportError getFileErrors(int index);
  /**
   *
   *
   * <pre>
   * List of file level errors.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportError file_errors = 4;</code>
   */
  int getFileErrorsCount();
  /**
   *
   *
   * <pre>
   * List of file level errors.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportError file_errors = 4;</code>
   */
  java.util.List<? extends com.google.cloud.migrationcenter.v1.ImportErrorOrBuilder>
      getFileErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of file level errors.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.ImportError file_errors = 4;</code>
   */
  com.google.cloud.migrationcenter.v1.ImportErrorOrBuilder getFileErrorsOrBuilder(int index);
}
