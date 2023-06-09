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
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface UpdateClusterRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.UpdateClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project the
   * cluster belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project the
   * cluster belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * Required. The Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * Required. The cluster name.
   * </pre>
   *
   * <code>string cluster_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The clusterName.
   */
  java.lang.String getClusterName();
  /**
   *
   *
   * <pre>
   * Required. The cluster name.
   * </pre>
   *
   * <code>string cluster_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString getClusterNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The changes to the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the cluster field is set.
   */
  boolean hasCluster();
  /**
   *
   *
   * <pre>
   * Required. The changes to the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The cluster.
   */
  com.google.cloud.dataproc.v1.Cluster getCluster();
  /**
   *
   *
   * <pre>
   * Required. The changes to the cluster.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.Cluster cluster = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1.ClusterOrBuilder getClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Timeout for graceful YARN decommissioning. Graceful
   * decommissioning allows removing nodes from the cluster without
   * interrupting jobs in progress. Timeout specifies how long to wait for jobs
   * in progress to finish before forcefully removing nodes (and potentially
   * interrupting jobs). Default timeout is 0 (for forceful decommission), and
   * the maximum allowed timeout is 1 day. (see JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   *
   * Only supported on Dataproc image versions 1.2 and higher.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration graceful_decommission_timeout = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the gracefulDecommissionTimeout field is set.
   */
  boolean hasGracefulDecommissionTimeout();
  /**
   *
   *
   * <pre>
   * Optional. Timeout for graceful YARN decommissioning. Graceful
   * decommissioning allows removing nodes from the cluster without
   * interrupting jobs in progress. Timeout specifies how long to wait for jobs
   * in progress to finish before forcefully removing nodes (and potentially
   * interrupting jobs). Default timeout is 0 (for forceful decommission), and
   * the maximum allowed timeout is 1 day. (see JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   *
   * Only supported on Dataproc image versions 1.2 and higher.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration graceful_decommission_timeout = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The gracefulDecommissionTimeout.
   */
  com.google.protobuf.Duration getGracefulDecommissionTimeout();
  /**
   *
   *
   * <pre>
   * Optional. Timeout for graceful YARN decommissioning. Graceful
   * decommissioning allows removing nodes from the cluster without
   * interrupting jobs in progress. Timeout specifies how long to wait for jobs
   * in progress to finish before forcefully removing nodes (and potentially
   * interrupting jobs). Default timeout is 0 (for forceful decommission), and
   * the maximum allowed timeout is 1 day. (see JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   *
   * Only supported on Dataproc image versions 1.2 and higher.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration graceful_decommission_timeout = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getGracefulDecommissionTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Specifies the path, relative to `Cluster`, of
   * the field to update. For example, to change the number of workers
   * in a cluster to 5, the `update_mask` parameter would be
   * specified as `config.worker_config.num_instances`,
   * and the `PATCH` request body would specify the new value, as follows:
   *
   *     {
   *       "config":{
   *         "workerConfig":{
   *           "numInstances":"5"
   *         }
   *       }
   *     }
   * Similarly, to change the number of preemptible workers in a cluster to 5,
   * the `update_mask` parameter would be
   * `config.secondary_worker_config.num_instances`, and the `PATCH` request
   * body would be set as follows:
   *
   *     {
   *       "config":{
   *         "secondaryWorkerConfig":{
   *           "numInstances":"5"
   *         }
   *       }
   *     }
   * &lt;strong&gt;Note:&lt;/strong&gt; Currently, only the following fields can be updated:
   *
   *  &lt;table&gt;
   *  &lt;tbody&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;&lt;strong&gt;Mask&lt;/strong&gt;&lt;/td&gt;
   *  &lt;td&gt;&lt;strong&gt;Purpose&lt;/strong&gt;&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;&lt;strong&gt;&lt;em&gt;labels&lt;/em&gt;&lt;/strong&gt;&lt;/td&gt;
   *  &lt;td&gt;Update labels&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;&lt;strong&gt;&lt;em&gt;config.worker_config.num_instances&lt;/em&gt;&lt;/strong&gt;&lt;/td&gt;
   *  &lt;td&gt;Resize primary worker group&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;&lt;strong&gt;&lt;em&gt;config.secondary_worker_config.num_instances&lt;/em&gt;&lt;/strong&gt;&lt;/td&gt;
   *  &lt;td&gt;Resize secondary worker group&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;config.autoscaling_config.policy_uri&lt;/td&gt;&lt;td&gt;Use, stop using, or
   *  change autoscaling policies&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;/tbody&gt;
   *  &lt;/table&gt;
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Specifies the path, relative to `Cluster`, of
   * the field to update. For example, to change the number of workers
   * in a cluster to 5, the `update_mask` parameter would be
   * specified as `config.worker_config.num_instances`,
   * and the `PATCH` request body would specify the new value, as follows:
   *
   *     {
   *       "config":{
   *         "workerConfig":{
   *           "numInstances":"5"
   *         }
   *       }
   *     }
   * Similarly, to change the number of preemptible workers in a cluster to 5,
   * the `update_mask` parameter would be
   * `config.secondary_worker_config.num_instances`, and the `PATCH` request
   * body would be set as follows:
   *
   *     {
   *       "config":{
   *         "secondaryWorkerConfig":{
   *           "numInstances":"5"
   *         }
   *       }
   *     }
   * &lt;strong&gt;Note:&lt;/strong&gt; Currently, only the following fields can be updated:
   *
   *  &lt;table&gt;
   *  &lt;tbody&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;&lt;strong&gt;Mask&lt;/strong&gt;&lt;/td&gt;
   *  &lt;td&gt;&lt;strong&gt;Purpose&lt;/strong&gt;&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;&lt;strong&gt;&lt;em&gt;labels&lt;/em&gt;&lt;/strong&gt;&lt;/td&gt;
   *  &lt;td&gt;Update labels&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;&lt;strong&gt;&lt;em&gt;config.worker_config.num_instances&lt;/em&gt;&lt;/strong&gt;&lt;/td&gt;
   *  &lt;td&gt;Resize primary worker group&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;&lt;strong&gt;&lt;em&gt;config.secondary_worker_config.num_instances&lt;/em&gt;&lt;/strong&gt;&lt;/td&gt;
   *  &lt;td&gt;Resize secondary worker group&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;config.autoscaling_config.policy_uri&lt;/td&gt;&lt;td&gt;Use, stop using, or
   *  change autoscaling policies&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;/tbody&gt;
   *  &lt;/table&gt;
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Specifies the path, relative to `Cluster`, of
   * the field to update. For example, to change the number of workers
   * in a cluster to 5, the `update_mask` parameter would be
   * specified as `config.worker_config.num_instances`,
   * and the `PATCH` request body would specify the new value, as follows:
   *
   *     {
   *       "config":{
   *         "workerConfig":{
   *           "numInstances":"5"
   *         }
   *       }
   *     }
   * Similarly, to change the number of preemptible workers in a cluster to 5,
   * the `update_mask` parameter would be
   * `config.secondary_worker_config.num_instances`, and the `PATCH` request
   * body would be set as follows:
   *
   *     {
   *       "config":{
   *         "secondaryWorkerConfig":{
   *           "numInstances":"5"
   *         }
   *       }
   *     }
   * &lt;strong&gt;Note:&lt;/strong&gt; Currently, only the following fields can be updated:
   *
   *  &lt;table&gt;
   *  &lt;tbody&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;&lt;strong&gt;Mask&lt;/strong&gt;&lt;/td&gt;
   *  &lt;td&gt;&lt;strong&gt;Purpose&lt;/strong&gt;&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;&lt;strong&gt;&lt;em&gt;labels&lt;/em&gt;&lt;/strong&gt;&lt;/td&gt;
   *  &lt;td&gt;Update labels&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;&lt;strong&gt;&lt;em&gt;config.worker_config.num_instances&lt;/em&gt;&lt;/strong&gt;&lt;/td&gt;
   *  &lt;td&gt;Resize primary worker group&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;&lt;strong&gt;&lt;em&gt;config.secondary_worker_config.num_instances&lt;/em&gt;&lt;/strong&gt;&lt;/td&gt;
   *  &lt;td&gt;Resize secondary worker group&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;tr&gt;
   *  &lt;td&gt;config.autoscaling_config.policy_uri&lt;/td&gt;&lt;td&gt;Use, stop using, or
   *  change autoscaling policies&lt;/td&gt;
   *  &lt;/tr&gt;
   *  &lt;/tbody&gt;
   *  &lt;/table&gt;
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A unique ID used to identify the request. If the server
   * receives two
   * [UpdateClusterRequest](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#google.cloud.dataproc.v1.UpdateClusterRequest)s
   * with the same id, then the second request will be ignored and the
   * first [google.longrunning.Operation][google.longrunning.Operation] created
   * and stored in the backend is returned.
   *
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. A unique ID used to identify the request. If the server
   * receives two
   * [UpdateClusterRequest](https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#google.cloud.dataproc.v1.UpdateClusterRequest)s
   * with the same id, then the second request will be ignored and the
   * first [google.longrunning.Operation][google.longrunning.Operation] created
   * and stored in the backend is returned.
   *
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string request_id = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
