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
// source: google/cloud/dataplex/v1/datascans.proto

package com.google.cloud.dataplex.v1;

public interface GetDataScanRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.GetDataScanRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the dataScan:
   * projects/{project}/locations/{location_id}/dataScans/{data_scan_id}
   * where `{project}` refers to a project_id or project_number and
   * `location_id` refers to a GCP region.
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
   * Required. The resource name of the dataScan:
   * projects/{project}/locations/{location_id}/dataScans/{data_scan_id}
   * where `{project}` refers to a project_id or project_number and
   * `location_id` refers to a GCP region.
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
   * Optional. Used to select the subset of DataScan information to return.
   * Defaults to `BASIC`.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.GetDataScanRequest.DataScanView view = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * Optional. Used to select the subset of DataScan information to return.
   * Defaults to `BASIC`.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.GetDataScanRequest.DataScanView view = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The view.
   */
  com.google.cloud.dataplex.v1.GetDataScanRequest.DataScanView getView();
}
