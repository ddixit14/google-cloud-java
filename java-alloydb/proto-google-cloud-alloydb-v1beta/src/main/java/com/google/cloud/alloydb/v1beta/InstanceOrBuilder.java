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
// source: google/cloud/alloydb/v1beta/resources.proto

package com.google.cloud.alloydb.v1beta;

public interface InstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1beta.Instance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the instance resource with the format:
   *  * projects/{project}/locations/{region}/clusters/{cluster_id}/instances/{instance_id}
   * where the cluster and instance ID segments should satisfy the regex
   * expression `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`, e.g. 1-63 characters of
   * lowercase letters, numbers, and dashes, starting with a letter, and ending
   * with a letter or number. For more details see https://google.aip.dev/122.
   * The prefix of the instance resource name is the name of the parent
   * resource:
   *  * projects/{project}/locations/{region}/clusters/{cluster_id}
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
   * Output only. The name of the instance resource with the format:
   *  * projects/{project}/locations/{region}/clusters/{cluster_id}/instances/{instance_id}
   * where the cluster and instance ID segments should satisfy the regex
   * expression `[a-z]([a-z0-9-]{0,61}[a-z0-9])?`, e.g. 1-63 characters of
   * lowercase letters, numbers, and dashes, starting with a letter, and ending
   * with a letter or number. For more details see https://google.aip.dev/122.
   * The prefix of the instance resource name is the name of the parent
   * resource:
   *  * projects/{project}/locations/{region}/clusters/{cluster_id}
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
   * User-settable and human-readable display name for the Instance.
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
   * User-settable and human-readable display name for the Instance.
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
   * Output only. The system-generated UID of the resource. The UID is assigned
   * when the resource is created, and it is retained until it is deleted.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. The system-generated UID of the resource. The UID is assigned
   * when the resource is created, and it is retained until it is deleted.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. Create time stamp
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
   * Output only. Create time stamp
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
   * Output only. Create time stamp
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
   * Output only. Update time stamp
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
   * Output only. Update time stamp
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
   * Output only. Update time stamp
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
   * Output only. Delete time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. Delete time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. Delete time stamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
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
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. The current serving state of the instance.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.Instance.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The current serving state of the instance.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.Instance.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.alloydb.v1beta.Instance.State getState();

  /**
   *
   *
   * <pre>
   * Required. The type of the instance. Specified at creation time.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.Instance.InstanceType instance_type = 9 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for instanceType.
   */
  int getInstanceTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The type of the instance. Specified at creation time.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.Instance.InstanceType instance_type = 9 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The instanceType.
   */
  com.google.cloud.alloydb.v1beta.Instance.InstanceType getInstanceType();

  /**
   *
   *
   * <pre>
   * Configurations for the machines that host the underlying
   * database engine.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1beta.Instance.MachineConfig machine_config = 10;</code>
   *
   * @return Whether the machineConfig field is set.
   */
  boolean hasMachineConfig();
  /**
   *
   *
   * <pre>
   * Configurations for the machines that host the underlying
   * database engine.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1beta.Instance.MachineConfig machine_config = 10;</code>
   *
   * @return The machineConfig.
   */
  com.google.cloud.alloydb.v1beta.Instance.MachineConfig getMachineConfig();
  /**
   *
   *
   * <pre>
   * Configurations for the machines that host the underlying
   * database engine.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1beta.Instance.MachineConfig machine_config = 10;</code>
   */
  com.google.cloud.alloydb.v1beta.Instance.MachineConfigOrBuilder getMachineConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Availability type of an Instance.
   * Defaults to REGIONAL for both primary and read instances.
   * Note that primary and read instances can have different availability types.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1beta.Instance.AvailabilityType availability_type = 11;</code>
   *
   * @return The enum numeric value on the wire for availabilityType.
   */
  int getAvailabilityTypeValue();
  /**
   *
   *
   * <pre>
   * Availability type of an Instance.
   * Defaults to REGIONAL for both primary and read instances.
   * Note that primary and read instances can have different availability types.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1beta.Instance.AvailabilityType availability_type = 11;</code>
   *
   * @return The availabilityType.
   */
  com.google.cloud.alloydb.v1beta.Instance.AvailabilityType getAvailabilityType();

  /**
   *
   *
   * <pre>
   * The Compute Engine zone that the instance should serve from, per
   * https://cloud.google.com/compute/docs/regions-zones
   * This can ONLY be specified for ZONAL instances.
   * If present for a REGIONAL instance, an error will be thrown.
   * If this is absent for a ZONAL instance, instance is created in a random
   * zone with available capacity.
   * </pre>
   *
   * <code>string gce_zone = 12;</code>
   *
   * @return The gceZone.
   */
  java.lang.String getGceZone();
  /**
   *
   *
   * <pre>
   * The Compute Engine zone that the instance should serve from, per
   * https://cloud.google.com/compute/docs/regions-zones
   * This can ONLY be specified for ZONAL instances.
   * If present for a REGIONAL instance, an error will be thrown.
   * If this is absent for a ZONAL instance, instance is created in a random
   * zone with available capacity.
   * </pre>
   *
   * <code>string gce_zone = 12;</code>
   *
   * @return The bytes for gceZone.
   */
  com.google.protobuf.ByteString getGceZoneBytes();

  /**
   *
   *
   * <pre>
   * Database flags. Set at instance level.
   *  * They are copied from primary instance on read instance creation.
   *  * Read instances can set new or override existing flags that are relevant
   *    for reads, e.g. for enabling columnar cache on a read instance. Flags
   *    set on read instance may or may not be present on primary.
   *
   *
   * This is a list of "key": "value" pairs.
   * "key": The name of the flag. These flags are passed at instance setup time,
   * so include both server options and system variables for Postgres. Flags are
   * specified with underscores, not hyphens.
   * "value": The value of the flag. Booleans are set to **on** for true
   * and **off** for false. This field must be omitted if the flag
   * doesn't take a value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; database_flags = 13;</code>
   */
  int getDatabaseFlagsCount();
  /**
   *
   *
   * <pre>
   * Database flags. Set at instance level.
   *  * They are copied from primary instance on read instance creation.
   *  * Read instances can set new or override existing flags that are relevant
   *    for reads, e.g. for enabling columnar cache on a read instance. Flags
   *    set on read instance may or may not be present on primary.
   *
   *
   * This is a list of "key": "value" pairs.
   * "key": The name of the flag. These flags are passed at instance setup time,
   * so include both server options and system variables for Postgres. Flags are
   * specified with underscores, not hyphens.
   * "value": The value of the flag. Booleans are set to **on** for true
   * and **off** for false. This field must be omitted if the flag
   * doesn't take a value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; database_flags = 13;</code>
   */
  boolean containsDatabaseFlags(java.lang.String key);
  /** Use {@link #getDatabaseFlagsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getDatabaseFlags();
  /**
   *
   *
   * <pre>
   * Database flags. Set at instance level.
   *  * They are copied from primary instance on read instance creation.
   *  * Read instances can set new or override existing flags that are relevant
   *    for reads, e.g. for enabling columnar cache on a read instance. Flags
   *    set on read instance may or may not be present on primary.
   *
   *
   * This is a list of "key": "value" pairs.
   * "key": The name of the flag. These flags are passed at instance setup time,
   * so include both server options and system variables for Postgres. Flags are
   * specified with underscores, not hyphens.
   * "value": The value of the flag. Booleans are set to **on** for true
   * and **off** for false. This field must be omitted if the flag
   * doesn't take a value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; database_flags = 13;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getDatabaseFlagsMap();
  /**
   *
   *
   * <pre>
   * Database flags. Set at instance level.
   *  * They are copied from primary instance on read instance creation.
   *  * Read instances can set new or override existing flags that are relevant
   *    for reads, e.g. for enabling columnar cache on a read instance. Flags
   *    set on read instance may or may not be present on primary.
   *
   *
   * This is a list of "key": "value" pairs.
   * "key": The name of the flag. These flags are passed at instance setup time,
   * so include both server options and system variables for Postgres. Flags are
   * specified with underscores, not hyphens.
   * "value": The value of the flag. Booleans are set to **on** for true
   * and **off** for false. This field must be omitted if the flag
   * doesn't take a value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; database_flags = 13;</code>
   */
  /* nullable */
  java.lang.String getDatabaseFlagsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Database flags. Set at instance level.
   *  * They are copied from primary instance on read instance creation.
   *  * Read instances can set new or override existing flags that are relevant
   *    for reads, e.g. for enabling columnar cache on a read instance. Flags
   *    set on read instance may or may not be present on primary.
   *
   *
   * This is a list of "key": "value" pairs.
   * "key": The name of the flag. These flags are passed at instance setup time,
   * so include both server options and system variables for Postgres. Flags are
   * specified with underscores, not hyphens.
   * "value": The value of the flag. Booleans are set to **on** for true
   * and **off** for false. This field must be omitted if the flag
   * doesn't take a value.
   * </pre>
   *
   * <code>map&lt;string, string&gt; database_flags = 13;</code>
   */
  java.lang.String getDatabaseFlagsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. This is set for the read-write VM of the PRIMARY instance
   * only.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.Instance.Node writable_node = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the writableNode field is set.
   */
  boolean hasWritableNode();
  /**
   *
   *
   * <pre>
   * Output only. This is set for the read-write VM of the PRIMARY instance
   * only.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.Instance.Node writable_node = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The writableNode.
   */
  com.google.cloud.alloydb.v1beta.Instance.Node getWritableNode();
  /**
   *
   *
   * <pre>
   * Output only. This is set for the read-write VM of the PRIMARY instance
   * only.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.Instance.Node writable_node = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.alloydb.v1beta.Instance.NodeOrBuilder getWritableNodeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. List of available read-only VMs in this instance, including
   * the standby for a PRIMARY instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1beta.Instance.Node nodes = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.alloydb.v1beta.Instance.Node> getNodesList();
  /**
   *
   *
   * <pre>
   * Output only. List of available read-only VMs in this instance, including
   * the standby for a PRIMARY instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1beta.Instance.Node nodes = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.alloydb.v1beta.Instance.Node getNodes(int index);
  /**
   *
   *
   * <pre>
   * Output only. List of available read-only VMs in this instance, including
   * the standby for a PRIMARY instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1beta.Instance.Node nodes = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getNodesCount();
  /**
   *
   *
   * <pre>
   * Output only. List of available read-only VMs in this instance, including
   * the standby for a PRIMARY instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1beta.Instance.Node nodes = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.alloydb.v1beta.Instance.NodeOrBuilder>
      getNodesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. List of available read-only VMs in this instance, including
   * the standby for a PRIMARY instance.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.alloydb.v1beta.Instance.Node nodes = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.alloydb.v1beta.Instance.NodeOrBuilder getNodesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Configuration for query insights.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.Instance.QueryInsightsInstanceConfig query_insights_config = 21;
   * </code>
   *
   * @return Whether the queryInsightsConfig field is set.
   */
  boolean hasQueryInsightsConfig();
  /**
   *
   *
   * <pre>
   * Configuration for query insights.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.Instance.QueryInsightsInstanceConfig query_insights_config = 21;
   * </code>
   *
   * @return The queryInsightsConfig.
   */
  com.google.cloud.alloydb.v1beta.Instance.QueryInsightsInstanceConfig getQueryInsightsConfig();
  /**
   *
   *
   * <pre>
   * Configuration for query insights.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.Instance.QueryInsightsInstanceConfig query_insights_config = 21;
   * </code>
   */
  com.google.cloud.alloydb.v1beta.Instance.QueryInsightsInstanceConfigOrBuilder
      getQueryInsightsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Read pool specific config.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1beta.Instance.ReadPoolConfig read_pool_config = 14;</code>
   *
   * @return Whether the readPoolConfig field is set.
   */
  boolean hasReadPoolConfig();
  /**
   *
   *
   * <pre>
   * Read pool specific config.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1beta.Instance.ReadPoolConfig read_pool_config = 14;</code>
   *
   * @return The readPoolConfig.
   */
  com.google.cloud.alloydb.v1beta.Instance.ReadPoolConfig getReadPoolConfig();
  /**
   *
   *
   * <pre>
   * Read pool specific config.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1beta.Instance.ReadPoolConfig read_pool_config = 14;</code>
   */
  com.google.cloud.alloydb.v1beta.Instance.ReadPoolConfigOrBuilder getReadPoolConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The IP address for the Instance.
   * This is the connection endpoint for an end-user application.
   * </pre>
   *
   * <code>string ip_address = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * Output only. The IP address for the Instance.
   * This is the connection endpoint for an end-user application.
   * </pre>
   *
   * <code>string ip_address = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * Output only. Reconciling (https://google.aip.dev/128#reconciliation).
   * Set to true if the current state of Instance does not match the user's
   * intended state, and the service is actively updating the resource to
   * reconcile them. This can happen due to user-triggered updates or
   * system actions like failover or maintenance.
   * </pre>
   *
   * <code>bool reconciling = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * For Resource freshness validation (https://google.aip.dev/154)
   * </pre>
   *
   * <code>string etag = 17;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * For Resource freshness validation (https://google.aip.dev/154)
   * </pre>
   *
   * <code>string etag = 17;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 18;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 18;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 18;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 18;</code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Annotations to allow client tools to store small amount of arbitrary data.
   * This is distinct from labels.
   * https://google.aip.dev/128
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 18;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);
}
