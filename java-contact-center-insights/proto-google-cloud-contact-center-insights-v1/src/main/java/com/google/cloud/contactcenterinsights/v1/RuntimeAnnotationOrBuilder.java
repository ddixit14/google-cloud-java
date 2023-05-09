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
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

public interface RuntimeAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.RuntimeAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Agent Assist Article Suggestion data.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ArticleSuggestionData article_suggestion = 6;
   * </code>
   *
   * @return Whether the articleSuggestion field is set.
   */
  boolean hasArticleSuggestion();
  /**
   *
   *
   * <pre>
   * Agent Assist Article Suggestion data.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ArticleSuggestionData article_suggestion = 6;
   * </code>
   *
   * @return The articleSuggestion.
   */
  com.google.cloud.contactcenterinsights.v1.ArticleSuggestionData getArticleSuggestion();
  /**
   *
   *
   * <pre>
   * Agent Assist Article Suggestion data.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.ArticleSuggestionData article_suggestion = 6;
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.ArticleSuggestionDataOrBuilder
      getArticleSuggestionOrBuilder();

  /**
   *
   *
   * <pre>
   * Agent Assist FAQ answer data.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.FaqAnswerData faq_answer = 7;</code>
   *
   * @return Whether the faqAnswer field is set.
   */
  boolean hasFaqAnswer();
  /**
   *
   *
   * <pre>
   * Agent Assist FAQ answer data.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.FaqAnswerData faq_answer = 7;</code>
   *
   * @return The faqAnswer.
   */
  com.google.cloud.contactcenterinsights.v1.FaqAnswerData getFaqAnswer();
  /**
   *
   *
   * <pre>
   * Agent Assist FAQ answer data.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.FaqAnswerData faq_answer = 7;</code>
   */
  com.google.cloud.contactcenterinsights.v1.FaqAnswerDataOrBuilder getFaqAnswerOrBuilder();

  /**
   *
   *
   * <pre>
   * Agent Assist Smart Reply data.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SmartReplyData smart_reply = 8;</code>
   *
   * @return Whether the smartReply field is set.
   */
  boolean hasSmartReply();
  /**
   *
   *
   * <pre>
   * Agent Assist Smart Reply data.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SmartReplyData smart_reply = 8;</code>
   *
   * @return The smartReply.
   */
  com.google.cloud.contactcenterinsights.v1.SmartReplyData getSmartReply();
  /**
   *
   *
   * <pre>
   * Agent Assist Smart Reply data.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SmartReplyData smart_reply = 8;</code>
   */
  com.google.cloud.contactcenterinsights.v1.SmartReplyDataOrBuilder getSmartReplyOrBuilder();

  /**
   *
   *
   * <pre>
   * Agent Assist Smart Compose suggestion data.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.SmartComposeSuggestionData smart_compose_suggestion = 9;
   * </code>
   *
   * @return Whether the smartComposeSuggestion field is set.
   */
  boolean hasSmartComposeSuggestion();
  /**
   *
   *
   * <pre>
   * Agent Assist Smart Compose suggestion data.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.SmartComposeSuggestionData smart_compose_suggestion = 9;
   * </code>
   *
   * @return The smartComposeSuggestion.
   */
  com.google.cloud.contactcenterinsights.v1.SmartComposeSuggestionData getSmartComposeSuggestion();
  /**
   *
   *
   * <pre>
   * Agent Assist Smart Compose suggestion data.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.SmartComposeSuggestionData smart_compose_suggestion = 9;
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.SmartComposeSuggestionDataOrBuilder
      getSmartComposeSuggestionOrBuilder();

  /**
   *
   *
   * <pre>
   * Dialogflow interaction data.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.DialogflowInteractionData dialogflow_interaction = 10;
   * </code>
   *
   * @return Whether the dialogflowInteraction field is set.
   */
  boolean hasDialogflowInteraction();
  /**
   *
   *
   * <pre>
   * Dialogflow interaction data.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.DialogflowInteractionData dialogflow_interaction = 10;
   * </code>
   *
   * @return The dialogflowInteraction.
   */
  com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData getDialogflowInteraction();
  /**
   *
   *
   * <pre>
   * Dialogflow interaction data.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.DialogflowInteractionData dialogflow_interaction = 10;
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.DialogflowInteractionDataOrBuilder
      getDialogflowInteractionOrBuilder();

  /**
   *
   *
   * <pre>
   * Conversation summarization suggestion data.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.ConversationSummarizationSuggestionData conversation_summarization_suggestion = 12;
   * </code>
   *
   * @return Whether the conversationSummarizationSuggestion field is set.
   */
  boolean hasConversationSummarizationSuggestion();
  /**
   *
   *
   * <pre>
   * Conversation summarization suggestion data.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.ConversationSummarizationSuggestionData conversation_summarization_suggestion = 12;
   * </code>
   *
   * @return The conversationSummarizationSuggestion.
   */
  com.google.cloud.contactcenterinsights.v1.ConversationSummarizationSuggestionData
      getConversationSummarizationSuggestion();
  /**
   *
   *
   * <pre>
   * Conversation summarization suggestion data.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.ConversationSummarizationSuggestionData conversation_summarization_suggestion = 12;
   * </code>
   */
  com.google.cloud.contactcenterinsights.v1.ConversationSummarizationSuggestionDataOrBuilder
      getConversationSummarizationSuggestionOrBuilder();

  /**
   *
   *
   * <pre>
   * The unique identifier of the annotation.
   * Format:
   * projects/{project}/locations/{location}/conversationDatasets/{dataset}/conversationDataItems/{data_item}/conversationAnnotations/{annotation}
   * </pre>
   *
   * <code>string annotation_id = 1;</code>
   *
   * @return The annotationId.
   */
  java.lang.String getAnnotationId();
  /**
   *
   *
   * <pre>
   * The unique identifier of the annotation.
   * Format:
   * projects/{project}/locations/{location}/conversationDatasets/{dataset}/conversationDataItems/{data_item}/conversationAnnotations/{annotation}
   * </pre>
   *
   * <code>string annotation_id = 1;</code>
   *
   * @return The bytes for annotationId.
   */
  com.google.protobuf.ByteString getAnnotationIdBytes();

  /**
   *
   *
   * <pre>
   * The time at which this annotation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time at which this annotation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time at which this annotation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The boundary in the conversation where the annotation starts, inclusive.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnnotationBoundary start_boundary = 3;</code>
   *
   * @return Whether the startBoundary field is set.
   */
  boolean hasStartBoundary();
  /**
   *
   *
   * <pre>
   * The boundary in the conversation where the annotation starts, inclusive.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnnotationBoundary start_boundary = 3;</code>
   *
   * @return The startBoundary.
   */
  com.google.cloud.contactcenterinsights.v1.AnnotationBoundary getStartBoundary();
  /**
   *
   *
   * <pre>
   * The boundary in the conversation where the annotation starts, inclusive.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnnotationBoundary start_boundary = 3;</code>
   */
  com.google.cloud.contactcenterinsights.v1.AnnotationBoundaryOrBuilder getStartBoundaryOrBuilder();

  /**
   *
   *
   * <pre>
   * The boundary in the conversation where the annotation ends, inclusive.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnnotationBoundary end_boundary = 4;</code>
   *
   * @return Whether the endBoundary field is set.
   */
  boolean hasEndBoundary();
  /**
   *
   *
   * <pre>
   * The boundary in the conversation where the annotation ends, inclusive.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnnotationBoundary end_boundary = 4;</code>
   *
   * @return The endBoundary.
   */
  com.google.cloud.contactcenterinsights.v1.AnnotationBoundary getEndBoundary();
  /**
   *
   *
   * <pre>
   * The boundary in the conversation where the annotation ends, inclusive.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnnotationBoundary end_boundary = 4;</code>
   */
  com.google.cloud.contactcenterinsights.v1.AnnotationBoundaryOrBuilder getEndBoundaryOrBuilder();

  /**
   *
   *
   * <pre>
   * The feedback that the customer has about the answer in `data`.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnswerFeedback answer_feedback = 5;</code>
   *
   * @return Whether the answerFeedback field is set.
   */
  boolean hasAnswerFeedback();
  /**
   *
   *
   * <pre>
   * The feedback that the customer has about the answer in `data`.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnswerFeedback answer_feedback = 5;</code>
   *
   * @return The answerFeedback.
   */
  com.google.cloud.contactcenterinsights.v1.AnswerFeedback getAnswerFeedback();
  /**
   *
   *
   * <pre>
   * The feedback that the customer has about the answer in `data`.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.AnswerFeedback answer_feedback = 5;</code>
   */
  com.google.cloud.contactcenterinsights.v1.AnswerFeedbackOrBuilder getAnswerFeedbackOrBuilder();

  public com.google.cloud.contactcenterinsights.v1.RuntimeAnnotation.DataCase getDataCase();
}
