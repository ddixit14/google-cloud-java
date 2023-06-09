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
// source: google/cloud/dialogflow/v2/conversation_model.proto

package com.google.cloud.dialogflow.v2;

public interface ConversationModelEvaluationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ConversationModelEvaluation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the evaluation. Format:
   * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model
   * ID&gt;/evaluations/&lt;Evaluation ID&gt;`
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
   * The resource name of the evaluation. Format:
   * `projects/&lt;Project ID&gt;/conversationModels/&lt;Conversation Model
   * ID&gt;/evaluations/&lt;Evaluation ID&gt;`
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
   * Optional. The display name of the model evaluation. At most 64 bytes long.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. The display name of the model evaluation. At most 64 bytes long.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The configuration of the evaluation task.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.EvaluationConfig evaluation_config = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the evaluationConfig field is set.
   */
  boolean hasEvaluationConfig();
  /**
   *
   *
   * <pre>
   * Optional. The configuration of the evaluation task.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.EvaluationConfig evaluation_config = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The evaluationConfig.
   */
  com.google.cloud.dialogflow.v2.EvaluationConfig getEvaluationConfig();
  /**
   *
   *
   * <pre>
   * Optional. The configuration of the evaluation task.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.EvaluationConfig evaluation_config = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.EvaluationConfigOrBuilder getEvaluationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Creation time of this model.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation time of this model.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Creation time of this model.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Only available when model is for smart reply.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.SmartReplyMetrics smart_reply_metrics = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the smartReplyMetrics field is set.
   */
  boolean hasSmartReplyMetrics();
  /**
   *
   *
   * <pre>
   * Output only. Only available when model is for smart reply.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.SmartReplyMetrics smart_reply_metrics = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The smartReplyMetrics.
   */
  com.google.cloud.dialogflow.v2.SmartReplyMetrics getSmartReplyMetrics();
  /**
   *
   *
   * <pre>
   * Output only. Only available when model is for smart reply.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.SmartReplyMetrics smart_reply_metrics = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dialogflow.v2.SmartReplyMetricsOrBuilder getSmartReplyMetricsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Human eval template in csv format.
   * It tooks real-world conversations provided through input dataset, generates
   * example suggestions for customer to verify quality of the model.
   * For Smart Reply, the generated csv file contains columns of
   * Context, (Suggestions,Q1,Q2)*3, Actual reply.
   * Context contains at most 10 latest messages in the conversation prior to
   * the current suggestion.
   * Q1: "Would you send it as the next message of agent?"
   * Evaluated based on whether the suggest is appropriate to be sent by
   * agent in current context.
   * Q2: "Does the suggestion move the conversation closer to resolution?"
   * Evaluated based on whether the suggestion provide solutions, or answers
   * customer's question or collect information from customer to resolve the
   * customer's issue.
   * Actual reply column contains the actual agent reply sent in the context.
   * </pre>
   *
   * <code>string raw_human_eval_template_csv = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The rawHumanEvalTemplateCsv.
   */
  java.lang.String getRawHumanEvalTemplateCsv();
  /**
   *
   *
   * <pre>
   * Output only. Human eval template in csv format.
   * It tooks real-world conversations provided through input dataset, generates
   * example suggestions for customer to verify quality of the model.
   * For Smart Reply, the generated csv file contains columns of
   * Context, (Suggestions,Q1,Q2)*3, Actual reply.
   * Context contains at most 10 latest messages in the conversation prior to
   * the current suggestion.
   * Q1: "Would you send it as the next message of agent?"
   * Evaluated based on whether the suggest is appropriate to be sent by
   * agent in current context.
   * Q2: "Does the suggestion move the conversation closer to resolution?"
   * Evaluated based on whether the suggestion provide solutions, or answers
   * customer's question or collect information from customer to resolve the
   * customer's issue.
   * Actual reply column contains the actual agent reply sent in the context.
   * </pre>
   *
   * <code>string raw_human_eval_template_csv = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for rawHumanEvalTemplateCsv.
   */
  com.google.protobuf.ByteString getRawHumanEvalTemplateCsvBytes();

  com.google.cloud.dialogflow.v2.ConversationModelEvaluation.MetricsCase getMetricsCase();
}
