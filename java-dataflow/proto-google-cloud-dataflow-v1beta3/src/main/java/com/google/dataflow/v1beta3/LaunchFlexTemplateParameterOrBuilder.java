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
// source: google/dataflow/v1beta3/templates.proto

package com.google.dataflow.v1beta3;

public interface LaunchFlexTemplateParameterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.LaunchFlexTemplateParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The job name to use for the created job. For update job request,
   * job name should be same as the existing running job.
   * </pre>
   *
   * <code>string job_name = 1;</code>
   *
   * @return The jobName.
   */
  java.lang.String getJobName();
  /**
   *
   *
   * <pre>
   * Required. The job name to use for the created job. For update job request,
   * job name should be same as the existing running job.
   * </pre>
   *
   * <code>string job_name = 1;</code>
   *
   * @return The bytes for jobName.
   */
  com.google.protobuf.ByteString getJobNameBytes();

  /**
   *
   *
   * <pre>
   * Spec about the container image to launch.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ContainerSpec container_spec = 4;</code>
   *
   * @return Whether the containerSpec field is set.
   */
  boolean hasContainerSpec();
  /**
   *
   *
   * <pre>
   * Spec about the container image to launch.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ContainerSpec container_spec = 4;</code>
   *
   * @return The containerSpec.
   */
  com.google.dataflow.v1beta3.ContainerSpec getContainerSpec();
  /**
   *
   *
   * <pre>
   * Spec about the container image to launch.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ContainerSpec container_spec = 4;</code>
   */
  com.google.dataflow.v1beta3.ContainerSpecOrBuilder getContainerSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Cloud Storage path to a file with json serialized ContainerSpec as
   * content.
   * </pre>
   *
   * <code>string container_spec_gcs_path = 5;</code>
   *
   * @return Whether the containerSpecGcsPath field is set.
   */
  boolean hasContainerSpecGcsPath();
  /**
   *
   *
   * <pre>
   * Cloud Storage path to a file with json serialized ContainerSpec as
   * content.
   * </pre>
   *
   * <code>string container_spec_gcs_path = 5;</code>
   *
   * @return The containerSpecGcsPath.
   */
  java.lang.String getContainerSpecGcsPath();
  /**
   *
   *
   * <pre>
   * Cloud Storage path to a file with json serialized ContainerSpec as
   * content.
   * </pre>
   *
   * <code>string container_spec_gcs_path = 5;</code>
   *
   * @return The bytes for containerSpecGcsPath.
   */
  com.google.protobuf.ByteString getContainerSpecGcsPathBytes();

  /**
   *
   *
   * <pre>
   * The parameters for FlexTemplate.
   * Ex. {"num_workers":"5"}
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  int getParametersCount();
  /**
   *
   *
   * <pre>
   * The parameters for FlexTemplate.
   * Ex. {"num_workers":"5"}
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  boolean containsParameters(java.lang.String key);
  /** Use {@link #getParametersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getParameters();
  /**
   *
   *
   * <pre>
   * The parameters for FlexTemplate.
   * Ex. {"num_workers":"5"}
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getParametersMap();
  /**
   *
   *
   * <pre>
   * The parameters for FlexTemplate.
   * Ex. {"num_workers":"5"}
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  /* nullable */
  java.lang.String getParametersOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The parameters for FlexTemplate.
   * Ex. {"num_workers":"5"}
   * </pre>
   *
   * <code>map&lt;string, string&gt; parameters = 2;</code>
   */
  java.lang.String getParametersOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Launch options for this flex template job. This is a common set of options
   * across languages and templates. This should not be used to pass job
   * parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; launch_options = 6;</code>
   */
  int getLaunchOptionsCount();
  /**
   *
   *
   * <pre>
   * Launch options for this flex template job. This is a common set of options
   * across languages and templates. This should not be used to pass job
   * parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; launch_options = 6;</code>
   */
  boolean containsLaunchOptions(java.lang.String key);
  /** Use {@link #getLaunchOptionsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLaunchOptions();
  /**
   *
   *
   * <pre>
   * Launch options for this flex template job. This is a common set of options
   * across languages and templates. This should not be used to pass job
   * parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; launch_options = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLaunchOptionsMap();
  /**
   *
   *
   * <pre>
   * Launch options for this flex template job. This is a common set of options
   * across languages and templates. This should not be used to pass job
   * parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; launch_options = 6;</code>
   */
  /* nullable */
  java.lang.String getLaunchOptionsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Launch options for this flex template job. This is a common set of options
   * across languages and templates. This should not be used to pass job
   * parameters.
   * </pre>
   *
   * <code>map&lt;string, string&gt; launch_options = 6;</code>
   */
  java.lang.String getLaunchOptionsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The runtime environment for the FlexTemplate job
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.FlexTemplateRuntimeEnvironment environment = 7;</code>
   *
   * @return Whether the environment field is set.
   */
  boolean hasEnvironment();
  /**
   *
   *
   * <pre>
   * The runtime environment for the FlexTemplate job
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.FlexTemplateRuntimeEnvironment environment = 7;</code>
   *
   * @return The environment.
   */
  com.google.dataflow.v1beta3.FlexTemplateRuntimeEnvironment getEnvironment();
  /**
   *
   *
   * <pre>
   * The runtime environment for the FlexTemplate job
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.FlexTemplateRuntimeEnvironment environment = 7;</code>
   */
  com.google.dataflow.v1beta3.FlexTemplateRuntimeEnvironmentOrBuilder getEnvironmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Set this to true if you are sending a request to update a running
   * streaming job. When set, the job name should be the same as the
   * running job.
   * </pre>
   *
   * <code>bool update = 8;</code>
   *
   * @return The update.
   */
  boolean getUpdate();

  /**
   *
   *
   * <pre>
   * Use this to pass transform_name_mappings for streaming update jobs.
   * Ex:{"oldTransformName":"newTransformName",...}'
   * </pre>
   *
   * <code>map&lt;string, string&gt; transform_name_mappings = 9;</code>
   */
  int getTransformNameMappingsCount();
  /**
   *
   *
   * <pre>
   * Use this to pass transform_name_mappings for streaming update jobs.
   * Ex:{"oldTransformName":"newTransformName",...}'
   * </pre>
   *
   * <code>map&lt;string, string&gt; transform_name_mappings = 9;</code>
   */
  boolean containsTransformNameMappings(java.lang.String key);
  /** Use {@link #getTransformNameMappingsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getTransformNameMappings();
  /**
   *
   *
   * <pre>
   * Use this to pass transform_name_mappings for streaming update jobs.
   * Ex:{"oldTransformName":"newTransformName",...}'
   * </pre>
   *
   * <code>map&lt;string, string&gt; transform_name_mappings = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getTransformNameMappingsMap();
  /**
   *
   *
   * <pre>
   * Use this to pass transform_name_mappings for streaming update jobs.
   * Ex:{"oldTransformName":"newTransformName",...}'
   * </pre>
   *
   * <code>map&lt;string, string&gt; transform_name_mappings = 9;</code>
   */
  /* nullable */
  java.lang.String getTransformNameMappingsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Use this to pass transform_name_mappings for streaming update jobs.
   * Ex:{"oldTransformName":"newTransformName",...}'
   * </pre>
   *
   * <code>map&lt;string, string&gt; transform_name_mappings = 9;</code>
   */
  java.lang.String getTransformNameMappingsOrThrow(java.lang.String key);

  com.google.dataflow.v1beta3.LaunchFlexTemplateParameter.TemplateCase getTemplateCase();
}
