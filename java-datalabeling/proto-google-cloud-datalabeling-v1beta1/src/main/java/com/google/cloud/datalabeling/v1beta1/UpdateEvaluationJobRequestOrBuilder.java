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
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

public interface UpdateEvaluationJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Evaluation job that is going to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the evaluationJob field is set.
   */
  boolean hasEvaluationJob();
  /**
   *
   *
   * <pre>
   * Required. Evaluation job that is going to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The evaluationJob.
   */
  com.google.cloud.datalabeling.v1beta1.EvaluationJob getEvaluationJob();
  /**
   *
   *
   * <pre>
   * Required. Evaluation job that is going to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_job = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder getEvaluationJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Mask for which fields to update. You can only provide the
   * following fields:
   *
   * * `evaluationJobConfig.humanAnnotationConfig.instruction`
   * * `evaluationJobConfig.exampleCount`
   * * `evaluationJobConfig.exampleSamplePercentage`
   *
   * You can provide more than one of these fields by separating them with
   * commas.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Mask for which fields to update. You can only provide the
   * following fields:
   *
   * * `evaluationJobConfig.humanAnnotationConfig.instruction`
   * * `evaluationJobConfig.exampleCount`
   * * `evaluationJobConfig.exampleSamplePercentage`
   *
   * You can provide more than one of these fields by separating them with
   * commas.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Mask for which fields to update. You can only provide the
   * following fields:
   *
   * * `evaluationJobConfig.humanAnnotationConfig.instruction`
   * * `evaluationJobConfig.exampleCount`
   * * `evaluationJobConfig.exampleSamplePercentage`
   *
   * You can provide more than one of these fields by separating them with
   * commas.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
