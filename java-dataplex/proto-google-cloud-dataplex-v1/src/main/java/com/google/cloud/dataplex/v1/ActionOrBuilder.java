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
// source: google/cloud/dataplex/v1/resources.proto

package com.google.cloud.dataplex.v1;

public interface ActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.Action)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The category of issue associated with the action.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.Category category = 1;</code>
   *
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   *
   *
   * <pre>
   * The category of issue associated with the action.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.Category category = 1;</code>
   *
   * @return The category.
   */
  com.google.cloud.dataplex.v1.Action.Category getCategory();

  /**
   *
   *
   * <pre>
   * Detailed description of the issue requiring action.
   * </pre>
   *
   * <code>string issue = 2;</code>
   *
   * @return The issue.
   */
  java.lang.String getIssue();
  /**
   *
   *
   * <pre>
   * Detailed description of the issue requiring action.
   * </pre>
   *
   * <code>string issue = 2;</code>
   *
   * @return The bytes for issue.
   */
  com.google.protobuf.ByteString getIssueBytes();

  /**
   *
   *
   * <pre>
   * The time that the issue was detected.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp detect_time = 4;</code>
   *
   * @return Whether the detectTime field is set.
   */
  boolean hasDetectTime();
  /**
   *
   *
   * <pre>
   * The time that the issue was detected.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp detect_time = 4;</code>
   *
   * @return The detectTime.
   */
  com.google.protobuf.Timestamp getDetectTime();
  /**
   *
   *
   * <pre>
   * The time that the issue was detected.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp detect_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDetectTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the action, of the form:
   * `projects/{project}/locations/{location}/lakes/{lake}/actions/{action}`
   * `projects/{project}/locations/{location}/lakes/{lake}/zones/{zone}/actions/{action}`
   * `projects/{project}/locations/{location}/lakes/{lake}/zones/{zone}/assets/{asset}/actions/{action}`.
   * </pre>
   *
   * <code>
   * string name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the action, of the form:
   * `projects/{project}/locations/{location}/lakes/{lake}/actions/{action}`
   * `projects/{project}/locations/{location}/lakes/{lake}/zones/{zone}/actions/{action}`
   * `projects/{project}/locations/{location}/lakes/{lake}/zones/{zone}/assets/{asset}/actions/{action}`.
   * </pre>
   *
   * <code>
   * string name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the lake, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>
   * string lake = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The lake.
   */
  java.lang.String getLake();
  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the lake, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`.
   * </pre>
   *
   * <code>
   * string lake = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for lake.
   */
  com.google.protobuf.ByteString getLakeBytes();

  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the zone, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
   * </pre>
   *
   * <code>
   * string zone = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the zone, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
   * </pre>
   *
   * <code>
   * string zone = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the asset, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/assets/{asset_id}`.
   * </pre>
   *
   * <code>
   * string asset = 8 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the asset, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/assets/{asset_id}`.
   * </pre>
   *
   * <code>
   * string asset = 8 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString getAssetBytes();

  /**
   *
   *
   * <pre>
   * The list of data locations associated with this action. Cloud Storage
   * locations are represented as URI paths(E.g.
   * `gs://bucket/table1/year=2020/month=Jan/`). BigQuery locations refer to
   * resource names(E.g.
   * `bigquery.googleapis.com/projects/project-id/datasets/dataset-id`).
   * </pre>
   *
   * <code>repeated string data_locations = 9;</code>
   *
   * @return A list containing the dataLocations.
   */
  java.util.List<java.lang.String> getDataLocationsList();
  /**
   *
   *
   * <pre>
   * The list of data locations associated with this action. Cloud Storage
   * locations are represented as URI paths(E.g.
   * `gs://bucket/table1/year=2020/month=Jan/`). BigQuery locations refer to
   * resource names(E.g.
   * `bigquery.googleapis.com/projects/project-id/datasets/dataset-id`).
   * </pre>
   *
   * <code>repeated string data_locations = 9;</code>
   *
   * @return The count of dataLocations.
   */
  int getDataLocationsCount();
  /**
   *
   *
   * <pre>
   * The list of data locations associated with this action. Cloud Storage
   * locations are represented as URI paths(E.g.
   * `gs://bucket/table1/year=2020/month=Jan/`). BigQuery locations refer to
   * resource names(E.g.
   * `bigquery.googleapis.com/projects/project-id/datasets/dataset-id`).
   * </pre>
   *
   * <code>repeated string data_locations = 9;</code>
   *
   * @param index The index of the element to return.
   * @return The dataLocations at the given index.
   */
  java.lang.String getDataLocations(int index);
  /**
   *
   *
   * <pre>
   * The list of data locations associated with this action. Cloud Storage
   * locations are represented as URI paths(E.g.
   * `gs://bucket/table1/year=2020/month=Jan/`). BigQuery locations refer to
   * resource names(E.g.
   * `bigquery.googleapis.com/projects/project-id/datasets/dataset-id`).
   * </pre>
   *
   * <code>repeated string data_locations = 9;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the dataLocations at the given index.
   */
  com.google.protobuf.ByteString getDataLocationsBytes(int index);

  /**
   *
   *
   * <pre>
   * Details for issues related to invalid or unsupported data formats.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.InvalidDataFormat invalid_data_format = 10;</code>
   *
   * @return Whether the invalidDataFormat field is set.
   */
  boolean hasInvalidDataFormat();
  /**
   *
   *
   * <pre>
   * Details for issues related to invalid or unsupported data formats.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.InvalidDataFormat invalid_data_format = 10;</code>
   *
   * @return The invalidDataFormat.
   */
  com.google.cloud.dataplex.v1.Action.InvalidDataFormat getInvalidDataFormat();
  /**
   *
   *
   * <pre>
   * Details for issues related to invalid or unsupported data formats.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.InvalidDataFormat invalid_data_format = 10;</code>
   */
  com.google.cloud.dataplex.v1.Action.InvalidDataFormatOrBuilder getInvalidDataFormatOrBuilder();

  /**
   *
   *
   * <pre>
   * Details for issues related to incompatible schemas detected within data.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.IncompatibleDataSchema incompatible_data_schema = 11;
   * </code>
   *
   * @return Whether the incompatibleDataSchema field is set.
   */
  boolean hasIncompatibleDataSchema();
  /**
   *
   *
   * <pre>
   * Details for issues related to incompatible schemas detected within data.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.IncompatibleDataSchema incompatible_data_schema = 11;
   * </code>
   *
   * @return The incompatibleDataSchema.
   */
  com.google.cloud.dataplex.v1.Action.IncompatibleDataSchema getIncompatibleDataSchema();
  /**
   *
   *
   * <pre>
   * Details for issues related to incompatible schemas detected within data.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.IncompatibleDataSchema incompatible_data_schema = 11;
   * </code>
   */
  com.google.cloud.dataplex.v1.Action.IncompatibleDataSchemaOrBuilder
      getIncompatibleDataSchemaOrBuilder();

  /**
   *
   *
   * <pre>
   * Details for issues related to invalid or unsupported data partition
   * structure.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.InvalidDataPartition invalid_data_partition = 12;</code>
   *
   * @return Whether the invalidDataPartition field is set.
   */
  boolean hasInvalidDataPartition();
  /**
   *
   *
   * <pre>
   * Details for issues related to invalid or unsupported data partition
   * structure.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.InvalidDataPartition invalid_data_partition = 12;</code>
   *
   * @return The invalidDataPartition.
   */
  com.google.cloud.dataplex.v1.Action.InvalidDataPartition getInvalidDataPartition();
  /**
   *
   *
   * <pre>
   * Details for issues related to invalid or unsupported data partition
   * structure.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.InvalidDataPartition invalid_data_partition = 12;</code>
   */
  com.google.cloud.dataplex.v1.Action.InvalidDataPartitionOrBuilder
      getInvalidDataPartitionOrBuilder();

  /**
   *
   *
   * <pre>
   * Details for issues related to absence of data within managed resources.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.MissingData missing_data = 13;</code>
   *
   * @return Whether the missingData field is set.
   */
  boolean hasMissingData();
  /**
   *
   *
   * <pre>
   * Details for issues related to absence of data within managed resources.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.MissingData missing_data = 13;</code>
   *
   * @return The missingData.
   */
  com.google.cloud.dataplex.v1.Action.MissingData getMissingData();
  /**
   *
   *
   * <pre>
   * Details for issues related to absence of data within managed resources.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.MissingData missing_data = 13;</code>
   */
  com.google.cloud.dataplex.v1.Action.MissingDataOrBuilder getMissingDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Details for issues related to absence of a managed resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.MissingResource missing_resource = 14;</code>
   *
   * @return Whether the missingResource field is set.
   */
  boolean hasMissingResource();
  /**
   *
   *
   * <pre>
   * Details for issues related to absence of a managed resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.MissingResource missing_resource = 14;</code>
   *
   * @return The missingResource.
   */
  com.google.cloud.dataplex.v1.Action.MissingResource getMissingResource();
  /**
   *
   *
   * <pre>
   * Details for issues related to absence of a managed resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.MissingResource missing_resource = 14;</code>
   */
  com.google.cloud.dataplex.v1.Action.MissingResourceOrBuilder getMissingResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Details for issues related to lack of permissions to access data
   * resources.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.UnauthorizedResource unauthorized_resource = 15;</code>
   *
   * @return Whether the unauthorizedResource field is set.
   */
  boolean hasUnauthorizedResource();
  /**
   *
   *
   * <pre>
   * Details for issues related to lack of permissions to access data
   * resources.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.UnauthorizedResource unauthorized_resource = 15;</code>
   *
   * @return The unauthorizedResource.
   */
  com.google.cloud.dataplex.v1.Action.UnauthorizedResource getUnauthorizedResource();
  /**
   *
   *
   * <pre>
   * Details for issues related to lack of permissions to access data
   * resources.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.UnauthorizedResource unauthorized_resource = 15;</code>
   */
  com.google.cloud.dataplex.v1.Action.UnauthorizedResourceOrBuilder
      getUnauthorizedResourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Details for issues related to applying security policy.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Action.FailedSecurityPolicyApply failed_security_policy_apply = 21;
   * </code>
   *
   * @return Whether the failedSecurityPolicyApply field is set.
   */
  boolean hasFailedSecurityPolicyApply();
  /**
   *
   *
   * <pre>
   * Details for issues related to applying security policy.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Action.FailedSecurityPolicyApply failed_security_policy_apply = 21;
   * </code>
   *
   * @return The failedSecurityPolicyApply.
   */
  com.google.cloud.dataplex.v1.Action.FailedSecurityPolicyApply getFailedSecurityPolicyApply();
  /**
   *
   *
   * <pre>
   * Details for issues related to applying security policy.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.Action.FailedSecurityPolicyApply failed_security_policy_apply = 21;
   * </code>
   */
  com.google.cloud.dataplex.v1.Action.FailedSecurityPolicyApplyOrBuilder
      getFailedSecurityPolicyApplyOrBuilder();

  /**
   *
   *
   * <pre>
   * Details for issues related to invalid data arrangement.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.InvalidDataOrganization invalid_data_organization = 22;
   * </code>
   *
   * @return Whether the invalidDataOrganization field is set.
   */
  boolean hasInvalidDataOrganization();
  /**
   *
   *
   * <pre>
   * Details for issues related to invalid data arrangement.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.InvalidDataOrganization invalid_data_organization = 22;
   * </code>
   *
   * @return The invalidDataOrganization.
   */
  com.google.cloud.dataplex.v1.Action.InvalidDataOrganization getInvalidDataOrganization();
  /**
   *
   *
   * <pre>
   * Details for issues related to invalid data arrangement.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Action.InvalidDataOrganization invalid_data_organization = 22;
   * </code>
   */
  com.google.cloud.dataplex.v1.Action.InvalidDataOrganizationOrBuilder
      getInvalidDataOrganizationOrBuilder();

  com.google.cloud.dataplex.v1.Action.DetailsCase getDetailsCase();
}
