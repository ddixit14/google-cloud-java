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
// source: google/cloud/automl/v1/operations.proto

package com.google.cloud.automl.v1;

public interface OperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.OperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Details of a Delete operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.DeleteOperationMetadata delete_details = 8;</code>
   *
   * @return Whether the deleteDetails field is set.
   */
  boolean hasDeleteDetails();
  /**
   *
   *
   * <pre>
   * Details of a Delete operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.DeleteOperationMetadata delete_details = 8;</code>
   *
   * @return The deleteDetails.
   */
  com.google.cloud.automl.v1.DeleteOperationMetadata getDeleteDetails();
  /**
   *
   *
   * <pre>
   * Details of a Delete operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.DeleteOperationMetadata delete_details = 8;</code>
   */
  com.google.cloud.automl.v1.DeleteOperationMetadataOrBuilder getDeleteDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Details of a DeployModel operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.DeployModelOperationMetadata deploy_model_details = 24;</code>
   *
   * @return Whether the deployModelDetails field is set.
   */
  boolean hasDeployModelDetails();
  /**
   *
   *
   * <pre>
   * Details of a DeployModel operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.DeployModelOperationMetadata deploy_model_details = 24;</code>
   *
   * @return The deployModelDetails.
   */
  com.google.cloud.automl.v1.DeployModelOperationMetadata getDeployModelDetails();
  /**
   *
   *
   * <pre>
   * Details of a DeployModel operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.DeployModelOperationMetadata deploy_model_details = 24;</code>
   */
  com.google.cloud.automl.v1.DeployModelOperationMetadataOrBuilder getDeployModelDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Details of an UndeployModel operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.UndeployModelOperationMetadata undeploy_model_details = 25;
   * </code>
   *
   * @return Whether the undeployModelDetails field is set.
   */
  boolean hasUndeployModelDetails();
  /**
   *
   *
   * <pre>
   * Details of an UndeployModel operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.UndeployModelOperationMetadata undeploy_model_details = 25;
   * </code>
   *
   * @return The undeployModelDetails.
   */
  com.google.cloud.automl.v1.UndeployModelOperationMetadata getUndeployModelDetails();
  /**
   *
   *
   * <pre>
   * Details of an UndeployModel operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.UndeployModelOperationMetadata undeploy_model_details = 25;
   * </code>
   */
  com.google.cloud.automl.v1.UndeployModelOperationMetadataOrBuilder
      getUndeployModelDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Details of CreateModel operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.CreateModelOperationMetadata create_model_details = 10;</code>
   *
   * @return Whether the createModelDetails field is set.
   */
  boolean hasCreateModelDetails();
  /**
   *
   *
   * <pre>
   * Details of CreateModel operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.CreateModelOperationMetadata create_model_details = 10;</code>
   *
   * @return The createModelDetails.
   */
  com.google.cloud.automl.v1.CreateModelOperationMetadata getCreateModelDetails();
  /**
   *
   *
   * <pre>
   * Details of CreateModel operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.CreateModelOperationMetadata create_model_details = 10;</code>
   */
  com.google.cloud.automl.v1.CreateModelOperationMetadataOrBuilder getCreateModelDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Details of CreateDataset operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.CreateDatasetOperationMetadata create_dataset_details = 30;
   * </code>
   *
   * @return Whether the createDatasetDetails field is set.
   */
  boolean hasCreateDatasetDetails();
  /**
   *
   *
   * <pre>
   * Details of CreateDataset operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.CreateDatasetOperationMetadata create_dataset_details = 30;
   * </code>
   *
   * @return The createDatasetDetails.
   */
  com.google.cloud.automl.v1.CreateDatasetOperationMetadata getCreateDatasetDetails();
  /**
   *
   *
   * <pre>
   * Details of CreateDataset operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.CreateDatasetOperationMetadata create_dataset_details = 30;
   * </code>
   */
  com.google.cloud.automl.v1.CreateDatasetOperationMetadataOrBuilder
      getCreateDatasetDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Details of ImportData operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ImportDataOperationMetadata import_data_details = 15;</code>
   *
   * @return Whether the importDataDetails field is set.
   */
  boolean hasImportDataDetails();
  /**
   *
   *
   * <pre>
   * Details of ImportData operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ImportDataOperationMetadata import_data_details = 15;</code>
   *
   * @return The importDataDetails.
   */
  com.google.cloud.automl.v1.ImportDataOperationMetadata getImportDataDetails();
  /**
   *
   *
   * <pre>
   * Details of ImportData operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ImportDataOperationMetadata import_data_details = 15;</code>
   */
  com.google.cloud.automl.v1.ImportDataOperationMetadataOrBuilder getImportDataDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Details of BatchPredict operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictOperationMetadata batch_predict_details = 16;</code>
   *
   * @return Whether the batchPredictDetails field is set.
   */
  boolean hasBatchPredictDetails();
  /**
   *
   *
   * <pre>
   * Details of BatchPredict operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictOperationMetadata batch_predict_details = 16;</code>
   *
   * @return The batchPredictDetails.
   */
  com.google.cloud.automl.v1.BatchPredictOperationMetadata getBatchPredictDetails();
  /**
   *
   *
   * <pre>
   * Details of BatchPredict operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.BatchPredictOperationMetadata batch_predict_details = 16;</code>
   */
  com.google.cloud.automl.v1.BatchPredictOperationMetadataOrBuilder
      getBatchPredictDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Details of ExportData operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ExportDataOperationMetadata export_data_details = 21;</code>
   *
   * @return Whether the exportDataDetails field is set.
   */
  boolean hasExportDataDetails();
  /**
   *
   *
   * <pre>
   * Details of ExportData operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ExportDataOperationMetadata export_data_details = 21;</code>
   *
   * @return The exportDataDetails.
   */
  com.google.cloud.automl.v1.ExportDataOperationMetadata getExportDataDetails();
  /**
   *
   *
   * <pre>
   * Details of ExportData operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ExportDataOperationMetadata export_data_details = 21;</code>
   */
  com.google.cloud.automl.v1.ExportDataOperationMetadataOrBuilder getExportDataDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Details of ExportModel operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ExportModelOperationMetadata export_model_details = 22;</code>
   *
   * @return Whether the exportModelDetails field is set.
   */
  boolean hasExportModelDetails();
  /**
   *
   *
   * <pre>
   * Details of ExportModel operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ExportModelOperationMetadata export_model_details = 22;</code>
   *
   * @return The exportModelDetails.
   */
  com.google.cloud.automl.v1.ExportModelOperationMetadata getExportModelDetails();
  /**
   *
   *
   * <pre>
   * Details of ExportModel operation.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.ExportModelOperationMetadata export_model_details = 22;</code>
   */
  com.google.cloud.automl.v1.ExportModelOperationMetadataOrBuilder getExportModelDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Progress of operation. Range: [0, 100].
   * Not used currently.
   * </pre>
   *
   * <code>int32 progress_percent = 13;</code>
   *
   * @return The progressPercent.
   */
  int getProgressPercent();

  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * This field should never exceed 20 entries.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  java.util.List<com.google.rpc.Status> getPartialFailuresList();
  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * This field should never exceed 20 entries.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  com.google.rpc.Status getPartialFailures(int index);
  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * This field should never exceed 20 entries.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  int getPartialFailuresCount();
  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * This field should never exceed 20 entries.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getPartialFailuresOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * This field should never exceed 20 entries.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailuresOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was updated for the last time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was updated for the last time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was updated for the last time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  com.google.cloud.automl.v1.OperationMetadata.DetailsCase getDetailsCase();
}
