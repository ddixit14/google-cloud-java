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
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ImportAgentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ImportAgentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project that the agent to import is associated with.
   * Format: `projects/&lt;Project ID&gt;` or
   *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project that the agent to import is associated with.
   * Format: `projects/&lt;Project ID&gt;` or
   *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing the agent to import.
   * Note: The URI must start with "gs://".
   *
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   *
   * @return Whether the agentUri field is set.
   */
  boolean hasAgentUri();
  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing the agent to import.
   * Note: The URI must start with "gs://".
   *
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   *
   * @return The agentUri.
   */
  java.lang.String getAgentUri();
  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing the agent to import.
   * Note: The URI must start with "gs://".
   *
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   *
   * @return The bytes for agentUri.
   */
  com.google.protobuf.ByteString getAgentUriBytes();

  /**
   *
   *
   * <pre>
   * Zip compressed raw byte content for agent.
   * </pre>
   *
   * <code>bytes agent_content = 3;</code>
   *
   * @return Whether the agentContent field is set.
   */
  boolean hasAgentContent();
  /**
   *
   *
   * <pre>
   * Zip compressed raw byte content for agent.
   * </pre>
   *
   * <code>bytes agent_content = 3;</code>
   *
   * @return The agentContent.
   */
  com.google.protobuf.ByteString getAgentContent();

  com.google.cloud.dialogflow.v2beta1.ImportAgentRequest.AgentCase getAgentCase();
}
