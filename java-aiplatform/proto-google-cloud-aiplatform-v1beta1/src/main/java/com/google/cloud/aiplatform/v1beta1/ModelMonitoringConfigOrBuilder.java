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
// source: google/cloud/aiplatform/v1beta1/model_monitoring.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ModelMonitoringConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ModelMonitoringConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Model monitoring objective config.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_configs = 3;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig>
      getObjectiveConfigsList();
  /**
   *
   *
   * <pre>
   * Model monitoring objective config.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_configs = 3;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig getObjectiveConfigs(int index);
  /**
   *
   *
   * <pre>
   * Model monitoring objective config.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_configs = 3;
   * </code>
   */
  int getObjectiveConfigsCount();
  /**
   *
   *
   * <pre>
   * Model monitoring objective config.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_configs = 3;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfigOrBuilder>
      getObjectiveConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Model monitoring objective config.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_configs = 3;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfigOrBuilder
      getObjectiveConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Model monitoring alert config.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig alert_config = 2;</code>
   *
   * @return Whether the alertConfig field is set.
   */
  boolean hasAlertConfig();
  /**
   *
   *
   * <pre>
   * Model monitoring alert config.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig alert_config = 2;</code>
   *
   * @return The alertConfig.
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig getAlertConfig();
  /**
   *
   *
   * <pre>
   * Model monitoring alert config.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfig alert_config = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelMonitoringAlertConfigOrBuilder getAlertConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * YAML schema file uri in Cloud Storage describing the format of a single
   * instance that you want Tensorflow Data Validation (TFDV) to analyze.
   *
   * If there are any data type differences between predict instance and TFDV
   * instance, this field can be used to override the schema.
   * For models trained with Vertex AI, this field must be set as all the
   * fields in predict instance formatted as string.
   * </pre>
   *
   * <code>string analysis_instance_schema_uri = 4;</code>
   *
   * @return The analysisInstanceSchemaUri.
   */
  java.lang.String getAnalysisInstanceSchemaUri();
  /**
   *
   *
   * <pre>
   * YAML schema file uri in Cloud Storage describing the format of a single
   * instance that you want Tensorflow Data Validation (TFDV) to analyze.
   *
   * If there are any data type differences between predict instance and TFDV
   * instance, this field can be used to override the schema.
   * For models trained with Vertex AI, this field must be set as all the
   * fields in predict instance formatted as string.
   * </pre>
   *
   * <code>string analysis_instance_schema_uri = 4;</code>
   *
   * @return The bytes for analysisInstanceSchemaUri.
   */
  com.google.protobuf.ByteString getAnalysisInstanceSchemaUriBytes();

  /**
   *
   *
   * <pre>
   * A Google Cloud Storage location for batch prediction model monitoring to
   * dump statistics and anomalies.
   * If not provided, a folder will be created in customer project to hold
   * statistics and anomalies.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination stats_anomalies_base_directory = 5;
   * </code>
   *
   * @return Whether the statsAnomaliesBaseDirectory field is set.
   */
  boolean hasStatsAnomaliesBaseDirectory();
  /**
   *
   *
   * <pre>
   * A Google Cloud Storage location for batch prediction model monitoring to
   * dump statistics and anomalies.
   * If not provided, a folder will be created in customer project to hold
   * statistics and anomalies.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination stats_anomalies_base_directory = 5;
   * </code>
   *
   * @return The statsAnomaliesBaseDirectory.
   */
  com.google.cloud.aiplatform.v1beta1.GcsDestination getStatsAnomaliesBaseDirectory();
  /**
   *
   *
   * <pre>
   * A Google Cloud Storage location for batch prediction model monitoring to
   * dump statistics and anomalies.
   * If not provided, a folder will be created in customer project to hold
   * statistics and anomalies.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination stats_anomalies_base_directory = 5;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.GcsDestinationOrBuilder
      getStatsAnomaliesBaseDirectoryOrBuilder();
}
