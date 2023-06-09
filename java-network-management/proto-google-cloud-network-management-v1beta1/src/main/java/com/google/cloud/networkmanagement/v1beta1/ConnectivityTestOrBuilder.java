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
// source: google/cloud/networkmanagement/v1beta1/connectivity_test.proto

package com.google.cloud.networkmanagement.v1beta1;

public interface ConnectivityTestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1beta1.ConnectivityTest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Unique name of the resource using the form:
   *     `projects/{project_id}/locations/global/connectivityTests/{test}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Unique name of the resource using the form:
   *     `projects/{project_id}/locations/global/connectivityTests/{test}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The user-supplied description of the Connectivity Test.
   * Maximum of 512 characters.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The user-supplied description of the Connectivity Test.
   * Maximum of 512 characters.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. Source specification of the Connectivity Test.
   *
   * You can use a combination of source IP address, virtual machine
   * (VM) instance, or Compute Engine network to uniquely identify
   * the source location.
   *
   * Examples:
   * If the source IP address is an internal IP address within a Google Cloud
   * Virtual Private Cloud (VPC) network, then you must also specify the VPC
   * network. Otherwise, specify the VM instance, which already contains its
   * internal IP address and VPC network information.
   *
   * If the source of the test is within an on-premises network, then you must
   * provide the destination VPC network.
   *
   * If the source endpoint is a Compute Engine VM instance with multiple
   * network interfaces, the instance itself is not sufficient to identify the
   * endpoint. So, you must also specify the source IP address or VPC network.
   *
   * A reachability analysis proceeds even if the source location is
   * ambiguous. However, the test result may include endpoints that you don't
   * intend to test.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint source = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   *
   *
   * <pre>
   * Required. Source specification of the Connectivity Test.
   *
   * You can use a combination of source IP address, virtual machine
   * (VM) instance, or Compute Engine network to uniquely identify
   * the source location.
   *
   * Examples:
   * If the source IP address is an internal IP address within a Google Cloud
   * Virtual Private Cloud (VPC) network, then you must also specify the VPC
   * network. Otherwise, specify the VM instance, which already contains its
   * internal IP address and VPC network information.
   *
   * If the source of the test is within an on-premises network, then you must
   * provide the destination VPC network.
   *
   * If the source endpoint is a Compute Engine VM instance with multiple
   * network interfaces, the instance itself is not sufficient to identify the
   * endpoint. So, you must also specify the source IP address or VPC network.
   *
   * A reachability analysis proceeds even if the source location is
   * ambiguous. However, the test result may include endpoints that you don't
   * intend to test.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint source = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The source.
   */
  com.google.cloud.networkmanagement.v1beta1.Endpoint getSource();
  /**
   *
   *
   * <pre>
   * Required. Source specification of the Connectivity Test.
   *
   * You can use a combination of source IP address, virtual machine
   * (VM) instance, or Compute Engine network to uniquely identify
   * the source location.
   *
   * Examples:
   * If the source IP address is an internal IP address within a Google Cloud
   * Virtual Private Cloud (VPC) network, then you must also specify the VPC
   * network. Otherwise, specify the VM instance, which already contains its
   * internal IP address and VPC network information.
   *
   * If the source of the test is within an on-premises network, then you must
   * provide the destination VPC network.
   *
   * If the source endpoint is a Compute Engine VM instance with multiple
   * network interfaces, the instance itself is not sufficient to identify the
   * endpoint. So, you must also specify the source IP address or VPC network.
   *
   * A reachability analysis proceeds even if the source location is
   * ambiguous. However, the test result may include endpoints that you don't
   * intend to test.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint source = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networkmanagement.v1beta1.EndpointOrBuilder getSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Destination specification of the Connectivity Test.
   *
   * You can use a combination of destination IP address, Compute Engine
   * VM instance, or VPC network to uniquely identify the destination
   * location.
   *
   * Even if the destination IP address is not unique, the source IP
   * location is unique. Usually, the analysis can infer the destination
   * endpoint from route information.
   *
   * If the destination you specify is a VM instance and the instance has
   * multiple network interfaces, then you must also specify either
   * a destination IP address  or VPC network to identify the destination
   * interface.
   *
   * A reachability analysis proceeds even if the destination location is
   * ambiguous. However, the result can include endpoints that you don't
   * intend to test.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint destination = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   *
   *
   * <pre>
   * Required. Destination specification of the Connectivity Test.
   *
   * You can use a combination of destination IP address, Compute Engine
   * VM instance, or VPC network to uniquely identify the destination
   * location.
   *
   * Even if the destination IP address is not unique, the source IP
   * location is unique. Usually, the analysis can infer the destination
   * endpoint from route information.
   *
   * If the destination you specify is a VM instance and the instance has
   * multiple network interfaces, then you must also specify either
   * a destination IP address  or VPC network to identify the destination
   * interface.
   *
   * A reachability analysis proceeds even if the destination location is
   * ambiguous. However, the result can include endpoints that you don't
   * intend to test.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint destination = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The destination.
   */
  com.google.cloud.networkmanagement.v1beta1.Endpoint getDestination();
  /**
   *
   *
   * <pre>
   * Required. Destination specification of the Connectivity Test.
   *
   * You can use a combination of destination IP address, Compute Engine
   * VM instance, or VPC network to uniquely identify the destination
   * location.
   *
   * Even if the destination IP address is not unique, the source IP
   * location is unique. Usually, the analysis can infer the destination
   * endpoint from route information.
   *
   * If the destination you specify is a VM instance and the instance has
   * multiple network interfaces, then you must also specify either
   * a destination IP address  or VPC network to identify the destination
   * interface.
   *
   * A reachability analysis proceeds even if the destination location is
   * ambiguous. However, the result can include endpoints that you don't
   * intend to test.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.Endpoint destination = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networkmanagement.v1beta1.EndpointOrBuilder getDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * IP Protocol of the test. When not provided, "TCP" is assumed.
   * </pre>
   *
   * <code>string protocol = 5;</code>
   *
   * @return The protocol.
   */
  java.lang.String getProtocol();
  /**
   *
   *
   * <pre>
   * IP Protocol of the test. When not provided, "TCP" is assumed.
   * </pre>
   *
   * <code>string protocol = 5;</code>
   *
   * @return The bytes for protocol.
   */
  com.google.protobuf.ByteString getProtocolBytes();

  /**
   *
   *
   * <pre>
   * Other projects that may be relevant for reachability analysis.
   * This is applicable to scenarios where a test can cross project boundaries.
   * </pre>
   *
   * <code>repeated string related_projects = 6;</code>
   *
   * @return A list containing the relatedProjects.
   */
  java.util.List<java.lang.String> getRelatedProjectsList();
  /**
   *
   *
   * <pre>
   * Other projects that may be relevant for reachability analysis.
   * This is applicable to scenarios where a test can cross project boundaries.
   * </pre>
   *
   * <code>repeated string related_projects = 6;</code>
   *
   * @return The count of relatedProjects.
   */
  int getRelatedProjectsCount();
  /**
   *
   *
   * <pre>
   * Other projects that may be relevant for reachability analysis.
   * This is applicable to scenarios where a test can cross project boundaries.
   * </pre>
   *
   * <code>repeated string related_projects = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The relatedProjects at the given index.
   */
  java.lang.String getRelatedProjects(int index);
  /**
   *
   *
   * <pre>
   * Other projects that may be relevant for reachability analysis.
   * This is applicable to scenarios where a test can cross project boundaries.
   * </pre>
   *
   * <code>repeated string related_projects = 6;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the relatedProjects at the given index.
   */
  com.google.protobuf.ByteString getRelatedProjectsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The display name of a Connectivity Test.
   * </pre>
   *
   * <code>string display_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. The display name of a Connectivity Test.
   * </pre>
   *
   * <code>string display_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
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
   * Resource labels to represent user-provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The time the test was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the test was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the test was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time the test's configuration was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the test's configuration was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the test's configuration was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The reachability details of this test from the latest run.
   * The details are updated when creating a new test, updating an
   * existing test, or triggering a one-time rerun of an existing test.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.ReachabilityDetails reachability_details = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the reachabilityDetails field is set.
   */
  boolean hasReachabilityDetails();
  /**
   *
   *
   * <pre>
   * Output only. The reachability details of this test from the latest run.
   * The details are updated when creating a new test, updating an
   * existing test, or triggering a one-time rerun of an existing test.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.ReachabilityDetails reachability_details = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The reachabilityDetails.
   */
  com.google.cloud.networkmanagement.v1beta1.ReachabilityDetails getReachabilityDetails();
  /**
   *
   *
   * <pre>
   * Output only. The reachability details of this test from the latest run.
   * The details are updated when creating a new test, updating an
   * existing test, or triggering a one-time rerun of an existing test.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.ReachabilityDetails reachability_details = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.networkmanagement.v1beta1.ReachabilityDetailsOrBuilder
      getReachabilityDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The probing details of this test from the latest run, present
   * for applicable tests only. The details are updated when creating a new
   * test, updating an existing test, or triggering a one-time rerun of an
   * existing test.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.ProbingDetails probing_details = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the probingDetails field is set.
   */
  boolean hasProbingDetails();
  /**
   *
   *
   * <pre>
   * Output only. The probing details of this test from the latest run, present
   * for applicable tests only. The details are updated when creating a new
   * test, updating an existing test, or triggering a one-time rerun of an
   * existing test.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.ProbingDetails probing_details = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The probingDetails.
   */
  com.google.cloud.networkmanagement.v1beta1.ProbingDetails getProbingDetails();
  /**
   *
   *
   * <pre>
   * Output only. The probing details of this test from the latest run, present
   * for applicable tests only. The details are updated when creating a new
   * test, updating an existing test, or triggering a one-time rerun of an
   * existing test.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.ProbingDetails probing_details = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.networkmanagement.v1beta1.ProbingDetailsOrBuilder getProbingDetailsOrBuilder();
}
