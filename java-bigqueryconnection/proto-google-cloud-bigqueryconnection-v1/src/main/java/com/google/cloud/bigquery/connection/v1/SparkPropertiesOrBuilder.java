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
// source: google/cloud/bigquery/connection/v1/connection.proto

package com.google.cloud.bigquery.connection.v1;

public interface SparkPropertiesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.connection.v1.SparkProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The account ID of the service created for the purpose of this
   * connection.
   *
   * The service account does not have any permissions associated with it when
   * it is created. After creation, customers delegate permissions to the
   * service account. When the connection is used in the context of a stored
   * procedure for Apache Spark in BigQuery, the service account will be used to
   * connect to the desired resources in Google Cloud.
   *
   * The account ID is in the form of:
   * bqcx-&lt;projectnumber&gt;-&lt;uniqueid&gt;&#64;gcp-sa-bigquery-consp.iam.gserviceaccount.com
   * </pre>
   *
   * <code>string service_account_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The serviceAccountId.
   */
  java.lang.String getServiceAccountId();
  /**
   *
   *
   * <pre>
   * Output only. The account ID of the service created for the purpose of this
   * connection.
   *
   * The service account does not have any permissions associated with it when
   * it is created. After creation, customers delegate permissions to the
   * service account. When the connection is used in the context of a stored
   * procedure for Apache Spark in BigQuery, the service account will be used to
   * connect to the desired resources in Google Cloud.
   *
   * The account ID is in the form of:
   * bqcx-&lt;projectnumber&gt;-&lt;uniqueid&gt;&#64;gcp-sa-bigquery-consp.iam.gserviceaccount.com
   * </pre>
   *
   * <code>string service_account_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for serviceAccountId.
   */
  com.google.protobuf.ByteString getServiceAccountIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Dataproc Metastore Service configuration for the connection.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.MetastoreServiceConfig metastore_service_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the metastoreServiceConfig field is set.
   */
  boolean hasMetastoreServiceConfig();
  /**
   *
   *
   * <pre>
   * Optional. Dataproc Metastore Service configuration for the connection.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.MetastoreServiceConfig metastore_service_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The metastoreServiceConfig.
   */
  com.google.cloud.bigquery.connection.v1.MetastoreServiceConfig getMetastoreServiceConfig();
  /**
   *
   *
   * <pre>
   * Optional. Dataproc Metastore Service configuration for the connection.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.MetastoreServiceConfig metastore_service_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.bigquery.connection.v1.MetastoreServiceConfigOrBuilder
      getMetastoreServiceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Spark History Server configuration for the connection.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.SparkHistoryServerConfig spark_history_server_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sparkHistoryServerConfig field is set.
   */
  boolean hasSparkHistoryServerConfig();
  /**
   *
   *
   * <pre>
   * Optional. Spark History Server configuration for the connection.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.SparkHistoryServerConfig spark_history_server_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sparkHistoryServerConfig.
   */
  com.google.cloud.bigquery.connection.v1.SparkHistoryServerConfig getSparkHistoryServerConfig();
  /**
   *
   *
   * <pre>
   * Optional. Spark History Server configuration for the connection.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.connection.v1.SparkHistoryServerConfig spark_history_server_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.bigquery.connection.v1.SparkHistoryServerConfigOrBuilder
      getSparkHistoryServerConfigOrBuilder();
}
