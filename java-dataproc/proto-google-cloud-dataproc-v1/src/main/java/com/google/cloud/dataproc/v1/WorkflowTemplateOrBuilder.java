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

public interface WorkflowTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.WorkflowTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the workflow template, as described
   * in https://cloud.google.com/apis/design/resource_names.
   *
   * * For `projects.regions.workflowTemplates`, the resource name of the
   *   template has the following format:
   *   `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   *
   * * For `projects.locations.workflowTemplates`, the resource name of the
   *   template has the following format:
   *   `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the workflow template, as described
   * in https://cloud.google.com/apis/design/resource_names.
   *
   * * For `projects.regions.workflowTemplates`, the resource name of the
   *   template has the following format:
   *   `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   *
   * * For `projects.locations.workflowTemplates`, the resource name of the
   *   template has the following format:
   *   `projects/{project_id}/locations/{location}/workflowTemplates/{template_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Used to perform a consistent read-modify-write.
   *
   * This field should be left blank for a `CreateWorkflowTemplate` request. It
   * is required for an `UpdateWorkflowTemplate` request, and must match the
   * current server version. A typical update template flow would fetch the
   * current template with a `GetWorkflowTemplate` request, which will return
   * the current template with the `version` field filled in with the
   * current server version. The user updates other fields in the template,
   * then returns it as part of the `UpdateWorkflowTemplate` request.
   * </pre>
   *
   * <code>int32 version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The version.
   */
  int getVersion();

  /**
   *
   *
   * <pre>
   * Output only. The time template was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time template was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time template was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time template was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time template was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time template was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this template. These labels
   * will be propagated to all jobs and clusters created by the workflow
   * instance.
   *
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   *
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   *
   * No more than 32 labels can be associated with a template.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this template. These labels
   * will be propagated to all jobs and clusters created by the workflow
   * instance.
   *
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   *
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   *
   * No more than 32 labels can be associated with a template.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this template. These labels
   * will be propagated to all jobs and clusters created by the workflow
   * instance.
   *
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   *
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   *
   * No more than 32 labels can be associated with a template.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this template. These labels
   * will be propagated to all jobs and clusters created by the workflow
   * instance.
   *
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   *
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   *
   * No more than 32 labels can be associated with a template.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this template. These labels
   * will be propagated to all jobs and clusters created by the workflow
   * instance.
   *
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   *
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   *
   * No more than 32 labels can be associated with a template.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. WorkflowTemplate scheduling information.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowTemplatePlacement placement = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the placement field is set.
   */
  boolean hasPlacement();
  /**
   *
   *
   * <pre>
   * Required. WorkflowTemplate scheduling information.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowTemplatePlacement placement = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The placement.
   */
  com.google.cloud.dataproc.v1.WorkflowTemplatePlacement getPlacement();
  /**
   *
   *
   * <pre>
   * Required. WorkflowTemplate scheduling information.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.WorkflowTemplatePlacement placement = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1.WorkflowTemplatePlacementOrBuilder getPlacementOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The Directed Acyclic Graph of Jobs to submit.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.OrderedJob jobs = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.OrderedJob> getJobsList();
  /**
   *
   *
   * <pre>
   * Required. The Directed Acyclic Graph of Jobs to submit.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.OrderedJob jobs = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1.OrderedJob getJobs(int index);
  /**
   *
   *
   * <pre>
   * Required. The Directed Acyclic Graph of Jobs to submit.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.OrderedJob jobs = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getJobsCount();
  /**
   *
   *
   * <pre>
   * Required. The Directed Acyclic Graph of Jobs to submit.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.OrderedJob jobs = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.OrderedJobOrBuilder> getJobsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The Directed Acyclic Graph of Jobs to submit.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.OrderedJob jobs = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1.OrderedJobOrBuilder getJobsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Template parameters whose values are substituted into the
   * template. Values for parameters must be provided when the template is
   * instantiated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.TemplateParameter parameters = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.TemplateParameter> getParametersList();
  /**
   *
   *
   * <pre>
   * Optional. Template parameters whose values are substituted into the
   * template. Values for parameters must be provided when the template is
   * instantiated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.TemplateParameter parameters = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.TemplateParameter getParameters(int index);
  /**
   *
   *
   * <pre>
   * Optional. Template parameters whose values are substituted into the
   * template. Values for parameters must be provided when the template is
   * instantiated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.TemplateParameter parameters = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getParametersCount();
  /**
   *
   *
   * <pre>
   * Optional. Template parameters whose values are substituted into the
   * template. Values for parameters must be provided when the template is
   * instantiated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.TemplateParameter parameters = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.TemplateParameterOrBuilder>
      getParametersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Template parameters whose values are substituted into the
   * template. Values for parameters must be provided when the template is
   * instantiated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.TemplateParameter parameters = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.TemplateParameterOrBuilder getParametersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Timeout duration for the DAG of jobs, expressed in seconds (see
   * [JSON representation of
   * duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * The timeout duration must be from 10 minutes ("600s") to 24 hours
   * ("86400s"). The timer begins when the first job is submitted. If the
   * workflow is running at the end of the timeout period, any remaining jobs
   * are cancelled, the workflow is ended, and if the workflow was running on a
   * [managed
   * cluster](/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster),
   * the cluster is deleted.
   * </pre>
   *
   * <code>.google.protobuf.Duration dag_timeout = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the dagTimeout field is set.
   */
  boolean hasDagTimeout();
  /**
   *
   *
   * <pre>
   * Optional. Timeout duration for the DAG of jobs, expressed in seconds (see
   * [JSON representation of
   * duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * The timeout duration must be from 10 minutes ("600s") to 24 hours
   * ("86400s"). The timer begins when the first job is submitted. If the
   * workflow is running at the end of the timeout period, any remaining jobs
   * are cancelled, the workflow is ended, and if the workflow was running on a
   * [managed
   * cluster](/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster),
   * the cluster is deleted.
   * </pre>
   *
   * <code>.google.protobuf.Duration dag_timeout = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dagTimeout.
   */
  com.google.protobuf.Duration getDagTimeout();
  /**
   *
   *
   * <pre>
   * Optional. Timeout duration for the DAG of jobs, expressed in seconds (see
   * [JSON representation of
   * duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * The timeout duration must be from 10 minutes ("600s") to 24 hours
   * ("86400s"). The timer begins when the first job is submitted. If the
   * workflow is running at the end of the timeout period, any remaining jobs
   * are cancelled, the workflow is ended, and if the workflow was running on a
   * [managed
   * cluster](/dataproc/docs/concepts/workflows/using-workflows#configuring_or_selecting_a_cluster),
   * the cluster is deleted.
   * </pre>
   *
   * <code>.google.protobuf.Duration dag_timeout = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getDagTimeoutOrBuilder();
}
