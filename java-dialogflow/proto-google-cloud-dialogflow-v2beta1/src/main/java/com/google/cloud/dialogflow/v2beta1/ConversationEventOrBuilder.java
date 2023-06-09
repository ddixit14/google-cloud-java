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
// source: google/cloud/dialogflow/v2beta1/conversation_event.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ConversationEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ConversationEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the conversation this notification
   * refers to.
   * Format: `projects/&lt;Project ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>string conversation = 1;</code>
   *
   * @return The conversation.
   */
  java.lang.String getConversation();
  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the conversation this notification
   * refers to.
   * Format: `projects/&lt;Project ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>string conversation = 1;</code>
   *
   * @return The bytes for conversation.
   */
  com.google.protobuf.ByteString getConversationBytes();

  /**
   *
   *
   * <pre>
   * Required. The type of the event that this notification refers to.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ConversationEvent.Type type = 2;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The type of the event that this notification refers to.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.ConversationEvent.Type type = 2;</code>
   *
   * @return The type.
   */
  com.google.cloud.dialogflow.v2beta1.ConversationEvent.Type getType();

  /**
   *
   *
   * <pre>
   * Optional. More detailed information about an error. Only set for type
   * UNRECOVERABLE_ERROR_IN_PHONE_CALL.
   * </pre>
   *
   * <code>.google.rpc.Status error_status = 3;</code>
   *
   * @return Whether the errorStatus field is set.
   */
  boolean hasErrorStatus();
  /**
   *
   *
   * <pre>
   * Optional. More detailed information about an error. Only set for type
   * UNRECOVERABLE_ERROR_IN_PHONE_CALL.
   * </pre>
   *
   * <code>.google.rpc.Status error_status = 3;</code>
   *
   * @return The errorStatus.
   */
  com.google.rpc.Status getErrorStatus();
  /**
   *
   *
   * <pre>
   * Optional. More detailed information about an error. Only set for type
   * UNRECOVERABLE_ERROR_IN_PHONE_CALL.
   * </pre>
   *
   * <code>.google.rpc.Status error_status = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Payload of NEW_MESSAGE event.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Message new_message_payload = 4;</code>
   *
   * @return Whether the newMessagePayload field is set.
   */
  boolean hasNewMessagePayload();
  /**
   *
   *
   * <pre>
   * Payload of NEW_MESSAGE event.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Message new_message_payload = 4;</code>
   *
   * @return The newMessagePayload.
   */
  com.google.cloud.dialogflow.v2beta1.Message getNewMessagePayload();
  /**
   *
   *
   * <pre>
   * Payload of NEW_MESSAGE event.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Message new_message_payload = 4;</code>
   */
  com.google.cloud.dialogflow.v2beta1.MessageOrBuilder getNewMessagePayloadOrBuilder();

  com.google.cloud.dialogflow.v2beta1.ConversationEvent.PayloadCase getPayloadCase();
}
