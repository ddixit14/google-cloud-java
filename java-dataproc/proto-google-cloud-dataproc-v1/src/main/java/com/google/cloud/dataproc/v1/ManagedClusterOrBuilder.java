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
// source: google/cloud/dataproc/v1/workflow_templates.proto

package com.google.cloud.dataproc.v1;

public interface ManagedClusterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ManagedCluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The cluster name prefix. A unique cluster name will be formed by
   * appending a random suffix.
   *
   * The name must contain only lower-case letters (a-z), numbers (0-9),
   * and hyphens (-). Must begin with a letter. Cannot begin or end with
   * hyphen. Must consist of between 2 and 35 characters.
   * </pre>
   *
   * <code>string cluster_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The clusterName.
   */
  java.lang.String getClusterName();
  /**
   *
   *
   * <pre>
   * Required. The cluster name prefix. A unique cluster name will be formed by
   * appending a random suffix.
   *
   * The name must contain only lower-case letters (a-z), numbers (0-9),
   * and hyphens (-). Must begin with a letter. Cannot begin or end with
   * hyphen. Must consist of between 2 and 35 characters.
   * </pre>
   *
   * <code>string cluster_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString getClusterNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The cluster configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterConfig config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * Required. The cluster configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterConfig config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The config.
   */
  com.google.cloud.dataproc.v1.ClusterConfig getConfig();
  /**
   *
   *
   * <pre>
   * Required. The cluster configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterConfig config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1.ClusterConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this cluster.
   *
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following PCRE regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   *
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following PCRE regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   *
   * No more than 32 labels can be associated with a given cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this cluster.
   *
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following PCRE regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   *
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following PCRE regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   *
   * No more than 32 labels can be associated with a given cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this cluster.
   *
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following PCRE regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   *
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following PCRE regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   *
   * No more than 32 labels can be associated with a given cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this cluster.
   *
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following PCRE regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   *
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following PCRE regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   *
   * No more than 32 labels can be associated with a given cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this cluster.
   *
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following PCRE regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   *
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following PCRE regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   *
   * No more than 32 labels can be associated with a given cluster.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
