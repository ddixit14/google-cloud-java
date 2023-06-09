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

public interface UpdateWorkflowTemplateRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.UpdateWorkflowTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The updated workflow template.
   *
   * The `template.version` field must match the current version.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the template field is set.
   */
  boolean hasTemplate();
  /**
   *
   *
   * <pre>
   * Required. The updated workflow template.
   *
   * The `template.version` field must match the current version.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The template.
   */
  com.google.cloud.dataproc.v1.WorkflowTemplate getTemplate();
  /**
   *
   *
   * <pre>
   * Required. The updated workflow template.
   *
   * The `template.version` field must match the current version.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowTemplate template = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1.WorkflowTemplateOrBuilder getTemplateOrBuilder();
}
