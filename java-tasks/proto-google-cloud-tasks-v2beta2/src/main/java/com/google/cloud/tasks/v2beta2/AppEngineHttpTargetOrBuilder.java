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
// source: google/cloud/tasks/v2beta2/target.proto

package com.google.cloud.tasks.v2beta2;

public interface AppEngineHttpTargetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.AppEngineHttpTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Overrides for the
   * [task-level
   * app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   *
   * If set, `app_engine_routing_override` is used for all tasks in
   * the queue, no matter what the setting is for the
   * [task-level
   * app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
   *
   * @return Whether the appEngineRoutingOverride field is set.
   */
  boolean hasAppEngineRoutingOverride();
  /**
   *
   *
   * <pre>
   * Overrides for the
   * [task-level
   * app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   *
   * If set, `app_engine_routing_override` is used for all tasks in
   * the queue, no matter what the setting is for the
   * [task-level
   * app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
   *
   * @return The appEngineRoutingOverride.
   */
  com.google.cloud.tasks.v2beta2.AppEngineRouting getAppEngineRoutingOverride();
  /**
   *
   *
   * <pre>
   * Overrides for the
   * [task-level
   * app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   *
   * If set, `app_engine_routing_override` is used for all tasks in
   * the queue, no matter what the setting is for the
   * [task-level
   * app_engine_routing][google.cloud.tasks.v2beta2.AppEngineHttpRequest.app_engine_routing].
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.AppEngineRouting app_engine_routing_override = 1;</code>
   */
  com.google.cloud.tasks.v2beta2.AppEngineRoutingOrBuilder getAppEngineRoutingOverrideOrBuilder();
}
