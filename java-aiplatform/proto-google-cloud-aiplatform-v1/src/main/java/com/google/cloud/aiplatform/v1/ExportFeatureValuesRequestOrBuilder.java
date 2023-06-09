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
// source: google/cloud/aiplatform/v1/featurestore_service.proto

package com.google.cloud.aiplatform.v1;

public interface ExportFeatureValuesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ExportFeatureValuesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Exports the latest Feature values of all entities of the EntityType
   * within a time range.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ExportFeatureValuesRequest.SnapshotExport snapshot_export = 3;
   * </code>
   *
   * @return Whether the snapshotExport field is set.
   */
  boolean hasSnapshotExport();
  /**
   *
   *
   * <pre>
   * Exports the latest Feature values of all entities of the EntityType
   * within a time range.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ExportFeatureValuesRequest.SnapshotExport snapshot_export = 3;
   * </code>
   *
   * @return The snapshotExport.
   */
  com.google.cloud.aiplatform.v1.ExportFeatureValuesRequest.SnapshotExport getSnapshotExport();
  /**
   *
   *
   * <pre>
   * Exports the latest Feature values of all entities of the EntityType
   * within a time range.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ExportFeatureValuesRequest.SnapshotExport snapshot_export = 3;
   * </code>
   */
  com.google.cloud.aiplatform.v1.ExportFeatureValuesRequest.SnapshotExportOrBuilder
      getSnapshotExportOrBuilder();

  /**
   *
   *
   * <pre>
   * Exports all historical values of all entities of the EntityType within a
   * time range
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportFeatureValuesRequest.FullExport full_export = 7;</code>
   *
   * @return Whether the fullExport field is set.
   */
  boolean hasFullExport();
  /**
   *
   *
   * <pre>
   * Exports all historical values of all entities of the EntityType within a
   * time range
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportFeatureValuesRequest.FullExport full_export = 7;</code>
   *
   * @return The fullExport.
   */
  com.google.cloud.aiplatform.v1.ExportFeatureValuesRequest.FullExport getFullExport();
  /**
   *
   *
   * <pre>
   * Exports all historical values of all entities of the EntityType within a
   * time range
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportFeatureValuesRequest.FullExport full_export = 7;</code>
   */
  com.google.cloud.aiplatform.v1.ExportFeatureValuesRequest.FullExportOrBuilder
      getFullExportOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the EntityType from which to export Feature
   * values. Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * </pre>
   *
   * <code>
   * string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The entityType.
   */
  java.lang.String getEntityType();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the EntityType from which to export Feature
   * values. Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}`
   * </pre>
   *
   * <code>
   * string entity_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for entityType.
   */
  com.google.protobuf.ByteString getEntityTypeBytes();

  /**
   *
   *
   * <pre>
   * Required. Specifies destination location and format.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureValueDestination destination = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   *
   *
   * <pre>
   * Required. Specifies destination location and format.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureValueDestination destination = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The destination.
   */
  com.google.cloud.aiplatform.v1.FeatureValueDestination getDestination();
  /**
   *
   *
   * <pre>
   * Required. Specifies destination location and format.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureValueDestination destination = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.FeatureValueDestinationOrBuilder getDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Selects Features to export values of.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the featureSelector field is set.
   */
  boolean hasFeatureSelector();
  /**
   *
   *
   * <pre>
   * Required. Selects Features to export values of.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The featureSelector.
   */
  com.google.cloud.aiplatform.v1.FeatureSelector getFeatureSelector();
  /**
   *
   *
   * <pre>
   * Required. Selects Features to export values of.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureSelector feature_selector = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.FeatureSelectorOrBuilder getFeatureSelectorOrBuilder();

  /**
   *
   *
   * <pre>
   * Per-Feature export settings.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DestinationFeatureSetting settings = 6;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.DestinationFeatureSetting> getSettingsList();
  /**
   *
   *
   * <pre>
   * Per-Feature export settings.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DestinationFeatureSetting settings = 6;</code>
   */
  com.google.cloud.aiplatform.v1.DestinationFeatureSetting getSettings(int index);
  /**
   *
   *
   * <pre>
   * Per-Feature export settings.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DestinationFeatureSetting settings = 6;</code>
   */
  int getSettingsCount();
  /**
   *
   *
   * <pre>
   * Per-Feature export settings.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DestinationFeatureSetting settings = 6;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.DestinationFeatureSettingOrBuilder>
      getSettingsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Per-Feature export settings.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.DestinationFeatureSetting settings = 6;</code>
   */
  com.google.cloud.aiplatform.v1.DestinationFeatureSettingOrBuilder getSettingsOrBuilder(int index);

  com.google.cloud.aiplatform.v1.ExportFeatureValuesRequest.ModeCase getModeCase();
}
