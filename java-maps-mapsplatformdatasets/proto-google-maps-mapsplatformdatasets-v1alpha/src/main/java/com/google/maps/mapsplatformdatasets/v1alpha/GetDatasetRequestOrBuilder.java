/*
 * Copyright 2023 Google LLC
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
// source: google/maps/mapsplatformdatasets/v1alpha/maps_platform_datasets.proto

package com.google.maps.mapsplatformdatasets.v1alpha;

public interface GetDatasetRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.mapsplatformdatasets.v1alpha.GetDatasetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name. Can also fetch a specified version
   * projects/{project}/datasets/{dataset_id}
   * projects/{project}/datasets/{dataset_id}&#64;{version-id}
   *
   * In order to retrieve a previous version of the dataset, also provide
   * the version ID.
   * Example: projects/123/datasets/assisted-driving-preferences&#64;c7cfa2a8
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Resource name. Can also fetch a specified version
   * projects/{project}/datasets/{dataset_id}
   * projects/{project}/datasets/{dataset_id}&#64;{version-id}
   *
   * In order to retrieve a previous version of the dataset, also provide
   * the version ID.
   * Example: projects/123/datasets/assisted-driving-preferences&#64;c7cfa2a8
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * If specified, will fetch the dataset details of the version published for
   * the specified use case rather than the latest, if one exists. If a
   * published version does not exist, will default to getting the dataset
   * details of the latest version.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.Usage published_usage = 2;</code>
   *
   * @return The enum numeric value on the wire for publishedUsage.
   */
  int getPublishedUsageValue();
  /**
   *
   *
   * <pre>
   * If specified, will fetch the dataset details of the version published for
   * the specified use case rather than the latest, if one exists. If a
   * published version does not exist, will default to getting the dataset
   * details of the latest version.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1alpha.Usage published_usage = 2;</code>
   *
   * @return The publishedUsage.
   */
  com.google.maps.mapsplatformdatasets.v1alpha.Usage getPublishedUsage();
}
