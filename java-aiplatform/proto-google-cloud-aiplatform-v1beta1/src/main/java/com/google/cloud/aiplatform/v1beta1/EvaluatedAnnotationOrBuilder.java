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
// source: google/cloud/aiplatform/v1beta1/evaluated_annotation.proto

package com.google.cloud.aiplatform.v1beta1;

public interface EvaluatedAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.EvaluatedAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Type of the EvaluatedAnnotation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.EvaluatedAnnotationType type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. Type of the EvaluatedAnnotation.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.EvaluatedAnnotationType type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.EvaluatedAnnotationType getType();

  /**
   *
   *
   * <pre>
   * Output only. The model predicted annotations.
   *
   * For true positive, there is one and only one prediction, which matches the
   * only one ground truth annotation in
   * [ground_truths][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.ground_truths].
   *
   * For false positive, there is one and only one prediction, which doesn't
   * match any ground truth annotation of the corresponding
   * [data_item_view_id][EvaluatedAnnotation.data_item_view_id].
   *
   * For false negative, there are zero or more predictions which are similar to
   * the only ground truth annotation in
   * [ground_truths][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.ground_truths]
   * but not enough for a match.
   *
   * The schema of the prediction is stored in
   * [ModelEvaluation.annotation_schema_uri][]
   * </pre>
   *
   * <code>
   * repeated .google.protobuf.Value predictions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.protobuf.Value> getPredictionsList();
  /**
   *
   *
   * <pre>
   * Output only. The model predicted annotations.
   *
   * For true positive, there is one and only one prediction, which matches the
   * only one ground truth annotation in
   * [ground_truths][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.ground_truths].
   *
   * For false positive, there is one and only one prediction, which doesn't
   * match any ground truth annotation of the corresponding
   * [data_item_view_id][EvaluatedAnnotation.data_item_view_id].
   *
   * For false negative, there are zero or more predictions which are similar to
   * the only ground truth annotation in
   * [ground_truths][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.ground_truths]
   * but not enough for a match.
   *
   * The schema of the prediction is stored in
   * [ModelEvaluation.annotation_schema_uri][]
   * </pre>
   *
   * <code>
   * repeated .google.protobuf.Value predictions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.Value getPredictions(int index);
  /**
   *
   *
   * <pre>
   * Output only. The model predicted annotations.
   *
   * For true positive, there is one and only one prediction, which matches the
   * only one ground truth annotation in
   * [ground_truths][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.ground_truths].
   *
   * For false positive, there is one and only one prediction, which doesn't
   * match any ground truth annotation of the corresponding
   * [data_item_view_id][EvaluatedAnnotation.data_item_view_id].
   *
   * For false negative, there are zero or more predictions which are similar to
   * the only ground truth annotation in
   * [ground_truths][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.ground_truths]
   * but not enough for a match.
   *
   * The schema of the prediction is stored in
   * [ModelEvaluation.annotation_schema_uri][]
   * </pre>
   *
   * <code>
   * repeated .google.protobuf.Value predictions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getPredictionsCount();
  /**
   *
   *
   * <pre>
   * Output only. The model predicted annotations.
   *
   * For true positive, there is one and only one prediction, which matches the
   * only one ground truth annotation in
   * [ground_truths][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.ground_truths].
   *
   * For false positive, there is one and only one prediction, which doesn't
   * match any ground truth annotation of the corresponding
   * [data_item_view_id][EvaluatedAnnotation.data_item_view_id].
   *
   * For false negative, there are zero or more predictions which are similar to
   * the only ground truth annotation in
   * [ground_truths][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.ground_truths]
   * but not enough for a match.
   *
   * The schema of the prediction is stored in
   * [ModelEvaluation.annotation_schema_uri][]
   * </pre>
   *
   * <code>
   * repeated .google.protobuf.Value predictions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.protobuf.ValueOrBuilder> getPredictionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The model predicted annotations.
   *
   * For true positive, there is one and only one prediction, which matches the
   * only one ground truth annotation in
   * [ground_truths][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.ground_truths].
   *
   * For false positive, there is one and only one prediction, which doesn't
   * match any ground truth annotation of the corresponding
   * [data_item_view_id][EvaluatedAnnotation.data_item_view_id].
   *
   * For false negative, there are zero or more predictions which are similar to
   * the only ground truth annotation in
   * [ground_truths][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.ground_truths]
   * but not enough for a match.
   *
   * The schema of the prediction is stored in
   * [ModelEvaluation.annotation_schema_uri][]
   * </pre>
   *
   * <code>
   * repeated .google.protobuf.Value predictions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.ValueOrBuilder getPredictionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The ground truth Annotations, i.e. the Annotations that exist
   * in the test data the Model is evaluated on.
   *
   * For true positive, there is one and only one ground truth annotation, which
   * matches the only prediction in
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions].
   *
   * For false positive, there are zero or more ground truth annotations that
   * are similar to the only prediction in
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions],
   * but not enough for a match.
   *
   * For false negative, there is one and only one ground truth annotation,
   * which doesn't match any predictions created by the model.
   *
   * The schema of the ground truth is stored in
   * [ModelEvaluation.annotation_schema_uri][]
   * </pre>
   *
   * <code>
   * repeated .google.protobuf.Value ground_truths = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.protobuf.Value> getGroundTruthsList();
  /**
   *
   *
   * <pre>
   * Output only. The ground truth Annotations, i.e. the Annotations that exist
   * in the test data the Model is evaluated on.
   *
   * For true positive, there is one and only one ground truth annotation, which
   * matches the only prediction in
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions].
   *
   * For false positive, there are zero or more ground truth annotations that
   * are similar to the only prediction in
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions],
   * but not enough for a match.
   *
   * For false negative, there is one and only one ground truth annotation,
   * which doesn't match any predictions created by the model.
   *
   * The schema of the ground truth is stored in
   * [ModelEvaluation.annotation_schema_uri][]
   * </pre>
   *
   * <code>
   * repeated .google.protobuf.Value ground_truths = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.Value getGroundTruths(int index);
  /**
   *
   *
   * <pre>
   * Output only. The ground truth Annotations, i.e. the Annotations that exist
   * in the test data the Model is evaluated on.
   *
   * For true positive, there is one and only one ground truth annotation, which
   * matches the only prediction in
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions].
   *
   * For false positive, there are zero or more ground truth annotations that
   * are similar to the only prediction in
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions],
   * but not enough for a match.
   *
   * For false negative, there is one and only one ground truth annotation,
   * which doesn't match any predictions created by the model.
   *
   * The schema of the ground truth is stored in
   * [ModelEvaluation.annotation_schema_uri][]
   * </pre>
   *
   * <code>
   * repeated .google.protobuf.Value ground_truths = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getGroundTruthsCount();
  /**
   *
   *
   * <pre>
   * Output only. The ground truth Annotations, i.e. the Annotations that exist
   * in the test data the Model is evaluated on.
   *
   * For true positive, there is one and only one ground truth annotation, which
   * matches the only prediction in
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions].
   *
   * For false positive, there are zero or more ground truth annotations that
   * are similar to the only prediction in
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions],
   * but not enough for a match.
   *
   * For false negative, there is one and only one ground truth annotation,
   * which doesn't match any predictions created by the model.
   *
   * The schema of the ground truth is stored in
   * [ModelEvaluation.annotation_schema_uri][]
   * </pre>
   *
   * <code>
   * repeated .google.protobuf.Value ground_truths = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.protobuf.ValueOrBuilder> getGroundTruthsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The ground truth Annotations, i.e. the Annotations that exist
   * in the test data the Model is evaluated on.
   *
   * For true positive, there is one and only one ground truth annotation, which
   * matches the only prediction in
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions].
   *
   * For false positive, there are zero or more ground truth annotations that
   * are similar to the only prediction in
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions],
   * but not enough for a match.
   *
   * For false negative, there is one and only one ground truth annotation,
   * which doesn't match any predictions created by the model.
   *
   * The schema of the ground truth is stored in
   * [ModelEvaluation.annotation_schema_uri][]
   * </pre>
   *
   * <code>
   * repeated .google.protobuf.Value ground_truths = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.ValueOrBuilder getGroundTruthsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The data item payload that the Model predicted this
   * EvaluatedAnnotation on.
   * </pre>
   *
   * <code>
   * .google.protobuf.Value data_item_payload = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the dataItemPayload field is set.
   */
  boolean hasDataItemPayload();
  /**
   *
   *
   * <pre>
   * Output only. The data item payload that the Model predicted this
   * EvaluatedAnnotation on.
   * </pre>
   *
   * <code>
   * .google.protobuf.Value data_item_payload = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The dataItemPayload.
   */
  com.google.protobuf.Value getDataItemPayload();
  /**
   *
   *
   * <pre>
   * Output only. The data item payload that the Model predicted this
   * EvaluatedAnnotation on.
   * </pre>
   *
   * <code>
   * .google.protobuf.Value data_item_payload = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.ValueOrBuilder getDataItemPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. ID of the EvaluatedDataItemView under the same ancestor
   * ModelEvaluation. The EvaluatedDataItemView consists of all ground truths
   * and predictions on
   * [data_item_payload][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.data_item_payload].
   * </pre>
   *
   * <code>string evaluated_data_item_view_id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The evaluatedDataItemViewId.
   */
  java.lang.String getEvaluatedDataItemViewId();
  /**
   *
   *
   * <pre>
   * Output only. ID of the EvaluatedDataItemView under the same ancestor
   * ModelEvaluation. The EvaluatedDataItemView consists of all ground truths
   * and predictions on
   * [data_item_payload][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.data_item_payload].
   * </pre>
   *
   * <code>string evaluated_data_item_view_id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for evaluatedDataItemViewId.
   */
  com.google.protobuf.ByteString getEvaluatedDataItemViewIdBytes();

  /**
   *
   *
   * <pre>
   * Explanations of
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions].
   * Each element of the explanations indicates the explanation for one
   * explanation Method.
   *
   * The attributions list in the
   * [EvaluatedAnnotationExplanation.explanation][google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation.explanation]
   * object corresponds to the
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions]
   * list. For example, the second element in the attributions list explains the
   * second element in the predictions list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation explanations = 8;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation>
      getExplanationsList();
  /**
   *
   *
   * <pre>
   * Explanations of
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions].
   * Each element of the explanations indicates the explanation for one
   * explanation Method.
   *
   * The attributions list in the
   * [EvaluatedAnnotationExplanation.explanation][google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation.explanation]
   * object corresponds to the
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions]
   * list. For example, the second element in the attributions list explains the
   * second element in the predictions list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation explanations = 8;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation getExplanations(int index);
  /**
   *
   *
   * <pre>
   * Explanations of
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions].
   * Each element of the explanations indicates the explanation for one
   * explanation Method.
   *
   * The attributions list in the
   * [EvaluatedAnnotationExplanation.explanation][google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation.explanation]
   * object corresponds to the
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions]
   * list. For example, the second element in the attributions list explains the
   * second element in the predictions list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation explanations = 8;
   * </code>
   */
  int getExplanationsCount();
  /**
   *
   *
   * <pre>
   * Explanations of
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions].
   * Each element of the explanations indicates the explanation for one
   * explanation Method.
   *
   * The attributions list in the
   * [EvaluatedAnnotationExplanation.explanation][google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation.explanation]
   * object corresponds to the
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions]
   * list. For example, the second element in the attributions list explains the
   * second element in the predictions list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation explanations = 8;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanationOrBuilder>
      getExplanationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Explanations of
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions].
   * Each element of the explanations indicates the explanation for one
   * explanation Method.
   *
   * The attributions list in the
   * [EvaluatedAnnotationExplanation.explanation][google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation.explanation]
   * object corresponds to the
   * [predictions][google.cloud.aiplatform.v1beta1.EvaluatedAnnotation.predictions]
   * list. For example, the second element in the attributions list explains the
   * second element in the predictions list.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation explanations = 8;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanationOrBuilder
      getExplanationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Annotations of model error analysis results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ErrorAnalysisAnnotation error_analysis_annotations = 9;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ErrorAnalysisAnnotation>
      getErrorAnalysisAnnotationsList();
  /**
   *
   *
   * <pre>
   * Annotations of model error analysis results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ErrorAnalysisAnnotation error_analysis_annotations = 9;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ErrorAnalysisAnnotation getErrorAnalysisAnnotations(
      int index);
  /**
   *
   *
   * <pre>
   * Annotations of model error analysis results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ErrorAnalysisAnnotation error_analysis_annotations = 9;
   * </code>
   */
  int getErrorAnalysisAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Annotations of model error analysis results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ErrorAnalysisAnnotation error_analysis_annotations = 9;
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ErrorAnalysisAnnotationOrBuilder>
      getErrorAnalysisAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Annotations of model error analysis results.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ErrorAnalysisAnnotation error_analysis_annotations = 9;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ErrorAnalysisAnnotationOrBuilder
      getErrorAnalysisAnnotationsOrBuilder(int index);
}
