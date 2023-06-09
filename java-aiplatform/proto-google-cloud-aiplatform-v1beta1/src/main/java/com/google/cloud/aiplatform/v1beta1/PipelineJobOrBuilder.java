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
// source: google/cloud/aiplatform/v1beta1/pipeline_job.proto

package com.google.cloud.aiplatform.v1beta1;

public interface PipelineJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.PipelineJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the PipelineJob.
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
   * Output only. The resource name of the PipelineJob.
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
   * The display name of the Pipeline.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the Pipeline.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Pipeline creation time.
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
   * Output only. Pipeline creation time.
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
   * Output only. Pipeline creation time.
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
   * Output only. Pipeline start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Pipeline start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Pipeline start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Pipeline end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Pipeline end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Pipeline end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this PipelineJob was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this PipelineJob was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this PipelineJob was most recently updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The spec of the pipeline.
   * </pre>
   *
   * <code>.google.protobuf.Struct pipeline_spec = 7;</code>
   *
   * @return Whether the pipelineSpec field is set.
   */
  boolean hasPipelineSpec();
  /**
   *
   *
   * <pre>
   * The spec of the pipeline.
   * </pre>
   *
   * <code>.google.protobuf.Struct pipeline_spec = 7;</code>
   *
   * @return The pipelineSpec.
   */
  com.google.protobuf.Struct getPipelineSpec();
  /**
   *
   *
   * <pre>
   * The spec of the pipeline.
   * </pre>
   *
   * <code>.google.protobuf.Struct pipeline_spec = 7;</code>
   */
  com.google.protobuf.StructOrBuilder getPipelineSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The detailed state of the job.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineState state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The detailed state of the job.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineState state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.aiplatform.v1beta1.PipelineState getState();

  /**
   *
   *
   * <pre>
   * Output only. The details of pipeline run. Not available in the list view.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineJobDetail job_detail = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the jobDetail field is set.
   */
  boolean hasJobDetail();
  /**
   *
   *
   * <pre>
   * Output only. The details of pipeline run. Not available in the list view.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineJobDetail job_detail = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The jobDetail.
   */
  com.google.cloud.aiplatform.v1beta1.PipelineJobDetail getJobDetail();
  /**
   *
   *
   * <pre>
   * Output only. The details of pipeline run. Not available in the list view.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineJobDetail job_detail = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.PipelineJobDetailOrBuilder getJobDetailOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The error that occurred during pipeline execution.
   * Only populated when the pipeline's state is FAILED or CANCELLED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Output only. The error that occurred during pipeline execution.
   * Only populated when the pipeline's state is FAILED or CANCELLED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Output only. The error that occurred during pipeline execution.
   * Only populated when the pipeline's state is FAILED or CANCELLED.
   * </pre>
   *
   * <code>.google.rpc.Status error = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize PipelineJob.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize PipelineJob.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize PipelineJob.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize PipelineJob.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
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
   * The labels with user-defined metadata to organize PipelineJob.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Runtime config of the pipeline.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PipelineJob.RuntimeConfig runtime_config = 12;</code>
   *
   * @return Whether the runtimeConfig field is set.
   */
  boolean hasRuntimeConfig();
  /**
   *
   *
   * <pre>
   * Runtime config of the pipeline.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PipelineJob.RuntimeConfig runtime_config = 12;</code>
   *
   * @return The runtimeConfig.
   */
  com.google.cloud.aiplatform.v1beta1.PipelineJob.RuntimeConfig getRuntimeConfig();
  /**
   *
   *
   * <pre>
   * Runtime config of the pipeline.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PipelineJob.RuntimeConfig runtime_config = 12;</code>
   */
  com.google.cloud.aiplatform.v1beta1.PipelineJob.RuntimeConfigOrBuilder
      getRuntimeConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a pipelineJob. If set, this
   * PipelineJob and all of its sub-resources will be secured by this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 16;</code>
   *
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a pipelineJob. If set, this
   * PipelineJob and all of its sub-resources will be secured by this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 16;</code>
   *
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1beta1.EncryptionSpec getEncryptionSpec();
  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a pipelineJob. If set, this
   * PipelineJob and all of its sub-resources will be secured by this key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EncryptionSpec encryption_spec = 16;</code>
   */
  com.google.cloud.aiplatform.v1beta1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * The service account that the pipeline workload runs as.
   * If not specified, the Compute Engine default service account in the project
   * will be used.
   * See
   * https://cloud.google.com/compute/docs/access/service-accounts#default_service_account
   *
   * Users starting the pipeline must have the `iam.serviceAccounts.actAs`
   * permission on this service account.
   * </pre>
   *
   * <code>string service_account = 17;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * The service account that the pipeline workload runs as.
   * If not specified, the Compute Engine default service account in the project
   * will be used.
   * See
   * https://cloud.google.com/compute/docs/access/service-accounts#default_service_account
   *
   * Users starting the pipeline must have the `iam.serviceAccounts.actAs`
   * permission on this service account.
   * </pre>
   *
   * <code>string service_account = 17;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * The full name of the Compute Engine
   * [network](/compute/docs/networks-and-firewalls#networks) to which the
   * Pipeline Job's workload should be peered. For example,
   * `projects/12345/global/networks/myVPC`.
   * [Format](/compute/docs/reference/rest/v1/networks/insert)
   * is of the form `projects/{project}/global/networks/{network}`.
   * Where {project} is a project number, as in `12345`, and {network} is a
   * network name.
   *
   * Private services access must already be configured for the network.
   * Pipeline job will apply the network configuration to the Google Cloud
   * resources being launched, if applied, such as Vertex AI
   * Training or Dataflow job. If left unspecified, the workload is not peered
   * with any network.
   * </pre>
   *
   * <code>string network = 18 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * The full name of the Compute Engine
   * [network](/compute/docs/networks-and-firewalls#networks) to which the
   * Pipeline Job's workload should be peered. For example,
   * `projects/12345/global/networks/myVPC`.
   * [Format](/compute/docs/reference/rest/v1/networks/insert)
   * is of the form `projects/{project}/global/networks/{network}`.
   * Where {project} is a project number, as in `12345`, and {network} is a
   * network name.
   *
   * Private services access must already be configured for the network.
   * Pipeline job will apply the network configuration to the Google Cloud
   * resources being launched, if applied, such as Vertex AI
   * Training or Dataflow job. If left unspecified, the workload is not peered
   * with any network.
   * </pre>
   *
   * <code>string network = 18 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * A template uri from where the
   * [PipelineJob.pipeline_spec][google.cloud.aiplatform.v1beta1.PipelineJob.pipeline_spec],
   * if empty, will be downloaded.
   * </pre>
   *
   * <code>string template_uri = 19;</code>
   *
   * @return The templateUri.
   */
  java.lang.String getTemplateUri();
  /**
   *
   *
   * <pre>
   * A template uri from where the
   * [PipelineJob.pipeline_spec][google.cloud.aiplatform.v1beta1.PipelineJob.pipeline_spec],
   * if empty, will be downloaded.
   * </pre>
   *
   * <code>string template_uri = 19;</code>
   *
   * @return The bytes for templateUri.
   */
  com.google.protobuf.ByteString getTemplateUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. Pipeline template metadata. Will fill up fields if
   * [PipelineJob.template_uri][google.cloud.aiplatform.v1beta1.PipelineJob.template_uri]
   * is from supported template registry.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineTemplateMetadata template_metadata = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the templateMetadata field is set.
   */
  boolean hasTemplateMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Pipeline template metadata. Will fill up fields if
   * [PipelineJob.template_uri][google.cloud.aiplatform.v1beta1.PipelineJob.template_uri]
   * is from supported template registry.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineTemplateMetadata template_metadata = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The templateMetadata.
   */
  com.google.cloud.aiplatform.v1beta1.PipelineTemplateMetadata getTemplateMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Pipeline template metadata. Will fill up fields if
   * [PipelineJob.template_uri][google.cloud.aiplatform.v1beta1.PipelineJob.template_uri]
   * is from supported template registry.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PipelineTemplateMetadata template_metadata = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.PipelineTemplateMetadataOrBuilder
      getTemplateMetadataOrBuilder();
}
