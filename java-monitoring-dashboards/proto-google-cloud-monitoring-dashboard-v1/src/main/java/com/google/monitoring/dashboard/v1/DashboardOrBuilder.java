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
// source: google/monitoring/dashboard/v1/dashboard.proto

package com.google.monitoring.dashboard.v1;

public interface DashboardOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.Dashboard)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the dashboard.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the dashboard.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The mutable, human-readable name.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The mutable, human-readable name.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * `etag` is used for optimistic concurrency control as a way to help
   * prevent simultaneous updates of a policy from overwriting each other.
   * An `etag` is returned in the response to `GetDashboard`, and
   * users are expected to put that etag in the request to `UpdateDashboard` to
   * ensure that their change will be applied to the same version of the
   * Dashboard configuration. The field should not be passed during
   * dashboard creation.
   * </pre>
   *
   * <code>string etag = 4;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * `etag` is used for optimistic concurrency control as a way to help
   * prevent simultaneous updates of a policy from overwriting each other.
   * An `etag` is returned in the response to `GetDashboard`, and
   * users are expected to put that etag in the request to `UpdateDashboard` to
   * ensure that their change will be applied to the same version of the
   * Dashboard configuration. The field should not be passed during
   * dashboard creation.
   * </pre>
   *
   * <code>string etag = 4;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Content is arranged with a basic layout that re-flows a simple list of
   * informational elements like widgets or tiles.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.GridLayout grid_layout = 5;</code>
   *
   * @return Whether the gridLayout field is set.
   */
  boolean hasGridLayout();
  /**
   *
   *
   * <pre>
   * Content is arranged with a basic layout that re-flows a simple list of
   * informational elements like widgets or tiles.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.GridLayout grid_layout = 5;</code>
   *
   * @return The gridLayout.
   */
  com.google.monitoring.dashboard.v1.GridLayout getGridLayout();
  /**
   *
   *
   * <pre>
   * Content is arranged with a basic layout that re-flows a simple list of
   * informational elements like widgets or tiles.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.GridLayout grid_layout = 5;</code>
   */
  com.google.monitoring.dashboard.v1.GridLayoutOrBuilder getGridLayoutOrBuilder();

  /**
   *
   *
   * <pre>
   * The content is arranged as a grid of tiles, with each content widget
   * occupying one or more grid blocks.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.MosaicLayout mosaic_layout = 6;</code>
   *
   * @return Whether the mosaicLayout field is set.
   */
  boolean hasMosaicLayout();
  /**
   *
   *
   * <pre>
   * The content is arranged as a grid of tiles, with each content widget
   * occupying one or more grid blocks.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.MosaicLayout mosaic_layout = 6;</code>
   *
   * @return The mosaicLayout.
   */
  com.google.monitoring.dashboard.v1.MosaicLayout getMosaicLayout();
  /**
   *
   *
   * <pre>
   * The content is arranged as a grid of tiles, with each content widget
   * occupying one or more grid blocks.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.MosaicLayout mosaic_layout = 6;</code>
   */
  com.google.monitoring.dashboard.v1.MosaicLayoutOrBuilder getMosaicLayoutOrBuilder();

  /**
   *
   *
   * <pre>
   * The content is divided into equally spaced rows and the widgets are
   * arranged horizontally.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.RowLayout row_layout = 8;</code>
   *
   * @return Whether the rowLayout field is set.
   */
  boolean hasRowLayout();
  /**
   *
   *
   * <pre>
   * The content is divided into equally spaced rows and the widgets are
   * arranged horizontally.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.RowLayout row_layout = 8;</code>
   *
   * @return The rowLayout.
   */
  com.google.monitoring.dashboard.v1.RowLayout getRowLayout();
  /**
   *
   *
   * <pre>
   * The content is divided into equally spaced rows and the widgets are
   * arranged horizontally.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.RowLayout row_layout = 8;</code>
   */
  com.google.monitoring.dashboard.v1.RowLayoutOrBuilder getRowLayoutOrBuilder();

  /**
   *
   *
   * <pre>
   * The content is divided into equally spaced columns and the widgets are
   * arranged vertically.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.ColumnLayout column_layout = 9;</code>
   *
   * @return Whether the columnLayout field is set.
   */
  boolean hasColumnLayout();
  /**
   *
   *
   * <pre>
   * The content is divided into equally spaced columns and the widgets are
   * arranged vertically.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.ColumnLayout column_layout = 9;</code>
   *
   * @return The columnLayout.
   */
  com.google.monitoring.dashboard.v1.ColumnLayout getColumnLayout();
  /**
   *
   *
   * <pre>
   * The content is divided into equally spaced columns and the widgets are
   * arranged vertically.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.ColumnLayout column_layout = 9;</code>
   */
  com.google.monitoring.dashboard.v1.ColumnLayoutOrBuilder getColumnLayoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Filters to reduce the amount of data charted based on the filter criteria.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.DashboardFilter dashboard_filters = 11;</code>
   */
  java.util.List<com.google.monitoring.dashboard.v1.DashboardFilter> getDashboardFiltersList();
  /**
   *
   *
   * <pre>
   * Filters to reduce the amount of data charted based on the filter criteria.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.DashboardFilter dashboard_filters = 11;</code>
   */
  com.google.monitoring.dashboard.v1.DashboardFilter getDashboardFilters(int index);
  /**
   *
   *
   * <pre>
   * Filters to reduce the amount of data charted based on the filter criteria.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.DashboardFilter dashboard_filters = 11;</code>
   */
  int getDashboardFiltersCount();
  /**
   *
   *
   * <pre>
   * Filters to reduce the amount of data charted based on the filter criteria.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.DashboardFilter dashboard_filters = 11;</code>
   */
  java.util.List<? extends com.google.monitoring.dashboard.v1.DashboardFilterOrBuilder>
      getDashboardFiltersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Filters to reduce the amount of data charted based on the filter criteria.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.DashboardFilter dashboard_filters = 11;</code>
   */
  com.google.monitoring.dashboard.v1.DashboardFilterOrBuilder getDashboardFiltersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Labels applied to the dashboard
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels applied to the dashboard
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels applied to the dashboard
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels applied to the dashboard
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
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
   * Labels applied to the dashboard
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  com.google.monitoring.dashboard.v1.Dashboard.LayoutCase getLayoutCase();
}
