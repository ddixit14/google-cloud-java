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
// source: google/cloud/bigquery/biglake/v1/metastore.proto

package com.google.cloud.bigquery.biglake.v1;

public interface HiveDatabaseOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.biglake.v1.HiveDatabaseOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cloud Storage folder URI where the database data is stored, starting with
   * "gs://".
   * </pre>
   *
   * <code>string location_uri = 1;</code>
   *
   * @return The locationUri.
   */
  java.lang.String getLocationUri();
  /**
   *
   *
   * <pre>
   * Cloud Storage folder URI where the database data is stored, starting with
   * "gs://".
   * </pre>
   *
   * <code>string location_uri = 1;</code>
   *
   * @return The bytes for locationUri.
   */
  com.google.protobuf.ByteString getLocationUriBytes();

  /**
   *
   *
   * <pre>
   * Stores user supplied Hive database parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  int getParametersCount();
  /**
   *
   *
   * <pre>
   * Stores user supplied Hive database parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  boolean containsParameters(java.lang.String key);
  /** Use {@link #getParametersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getParameters();
  /**
   *
   *
   * <pre>
   * Stores user supplied Hive database parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getParametersMap();
  /**
   *
   *
   * <pre>
   * Stores user supplied Hive database parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  /* nullable */
  java.lang.String getParametersOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Stores user supplied Hive database parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  java.lang.String getParametersOrThrow(java.lang.String key);
}
