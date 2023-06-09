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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface NodeKubeletConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.NodeKubeletConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Control the CPU management policy on the node.
   * See
   * https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/
   *
   * The following values are allowed.
   * * "none": the default, which represents the existing scheduling behavior.
   * * "static": allows pods with certain resource characteristics to be granted
   * increased CPU affinity and exclusivity on the node.
   * The default value is 'none' if unspecified.
   * </pre>
   *
   * <code>string cpu_manager_policy = 1;</code>
   *
   * @return The cpuManagerPolicy.
   */
  java.lang.String getCpuManagerPolicy();
  /**
   *
   *
   * <pre>
   * Control the CPU management policy on the node.
   * See
   * https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/
   *
   * The following values are allowed.
   * * "none": the default, which represents the existing scheduling behavior.
   * * "static": allows pods with certain resource characteristics to be granted
   * increased CPU affinity and exclusivity on the node.
   * The default value is 'none' if unspecified.
   * </pre>
   *
   * <code>string cpu_manager_policy = 1;</code>
   *
   * @return The bytes for cpuManagerPolicy.
   */
  com.google.protobuf.ByteString getCpuManagerPolicyBytes();

  /**
   *
   *
   * <pre>
   * Enable CPU CFS quota enforcement for containers that specify CPU limits.
   *
   * This option is enabled by default which makes kubelet use CFS quota
   * (https://www.kernel.org/doc/Documentation/scheduler/sched-bwc.txt) to
   * enforce container CPU limits. Otherwise, CPU limits will not be enforced at
   * all.
   *
   * Disable this option to mitigate CPU throttling problems while still having
   * your pods to be in Guaranteed QoS class by specifying the CPU limits.
   *
   * The default value is 'true' if unspecified.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue cpu_cfs_quota = 2;</code>
   *
   * @return Whether the cpuCfsQuota field is set.
   */
  boolean hasCpuCfsQuota();
  /**
   *
   *
   * <pre>
   * Enable CPU CFS quota enforcement for containers that specify CPU limits.
   *
   * This option is enabled by default which makes kubelet use CFS quota
   * (https://www.kernel.org/doc/Documentation/scheduler/sched-bwc.txt) to
   * enforce container CPU limits. Otherwise, CPU limits will not be enforced at
   * all.
   *
   * Disable this option to mitigate CPU throttling problems while still having
   * your pods to be in Guaranteed QoS class by specifying the CPU limits.
   *
   * The default value is 'true' if unspecified.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue cpu_cfs_quota = 2;</code>
   *
   * @return The cpuCfsQuota.
   */
  com.google.protobuf.BoolValue getCpuCfsQuota();
  /**
   *
   *
   * <pre>
   * Enable CPU CFS quota enforcement for containers that specify CPU limits.
   *
   * This option is enabled by default which makes kubelet use CFS quota
   * (https://www.kernel.org/doc/Documentation/scheduler/sched-bwc.txt) to
   * enforce container CPU limits. Otherwise, CPU limits will not be enforced at
   * all.
   *
   * Disable this option to mitigate CPU throttling problems while still having
   * your pods to be in Guaranteed QoS class by specifying the CPU limits.
   *
   * The default value is 'true' if unspecified.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue cpu_cfs_quota = 2;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getCpuCfsQuotaOrBuilder();

  /**
   *
   *
   * <pre>
   * Set the CPU CFS quota period value 'cpu.cfs_period_us'.
   *
   * The string must be a sequence of decimal numbers, each with optional
   * fraction and a unit suffix, such as "300ms".
   * Valid time units are "ns", "us" (or "µs"), "ms", "s", "m", "h".
   * The value must be a positive duration.
   * </pre>
   *
   * <code>string cpu_cfs_quota_period = 3;</code>
   *
   * @return The cpuCfsQuotaPeriod.
   */
  java.lang.String getCpuCfsQuotaPeriod();
  /**
   *
   *
   * <pre>
   * Set the CPU CFS quota period value 'cpu.cfs_period_us'.
   *
   * The string must be a sequence of decimal numbers, each with optional
   * fraction and a unit suffix, such as "300ms".
   * Valid time units are "ns", "us" (or "µs"), "ms", "s", "m", "h".
   * The value must be a positive duration.
   * </pre>
   *
   * <code>string cpu_cfs_quota_period = 3;</code>
   *
   * @return The bytes for cpuCfsQuotaPeriod.
   */
  com.google.protobuf.ByteString getCpuCfsQuotaPeriodBytes();

  /**
   *
   *
   * <pre>
   * Set the Pod PID limits. See
   * https://kubernetes.io/docs/concepts/policy/pid-limiting/#pod-pid-limits
   *
   * Controls the maximum number of processes allowed to run in a pod. The value
   * must be greater than or equal to 1024 and less than 4194304.
   * </pre>
   *
   * <code>int64 pod_pids_limit = 4;</code>
   *
   * @return The podPidsLimit.
   */
  long getPodPidsLimit();
}
