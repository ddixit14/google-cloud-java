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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface RunAccessReportRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.RunAccessReportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Data Access Report supports requesting at the property level or account
   * level. If requested at the account level, Data Access Reports include all
   * access for all properties under that account.
   *
   * To request at the property level, entity should be for example
   * 'properties/123' if "123" is your GA4 property ID. To request at the
   * account level, entity should be for example 'accounts/1234' if "1234" is
   * your GA4 Account ID.
   * </pre>
   *
   * <code>string entity = 1;</code>
   *
   * @return The entity.
   */
  java.lang.String getEntity();
  /**
   *
   *
   * <pre>
   * The Data Access Report supports requesting at the property level or account
   * level. If requested at the account level, Data Access Reports include all
   * access for all properties under that account.
   *
   * To request at the property level, entity should be for example
   * 'properties/123' if "123" is your GA4 property ID. To request at the
   * account level, entity should be for example 'accounts/1234' if "1234" is
   * your GA4 Account ID.
   * </pre>
   *
   * <code>string entity = 1;</code>
   *
   * @return The bytes for entity.
   */
  com.google.protobuf.ByteString getEntityBytes();

  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed in the response. Requests are
   * allowed up to 9 dimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessDimension dimensions = 2;</code>
   */
  java.util.List<com.google.analytics.admin.v1alpha.AccessDimension> getDimensionsList();
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed in the response. Requests are
   * allowed up to 9 dimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessDimension dimensions = 2;</code>
   */
  com.google.analytics.admin.v1alpha.AccessDimension getDimensions(int index);
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed in the response. Requests are
   * allowed up to 9 dimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessDimension dimensions = 2;</code>
   */
  int getDimensionsCount();
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed in the response. Requests are
   * allowed up to 9 dimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessDimension dimensions = 2;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1alpha.AccessDimensionOrBuilder>
      getDimensionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The dimensions requested and displayed in the response. Requests are
   * allowed up to 9 dimensions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessDimension dimensions = 2;</code>
   */
  com.google.analytics.admin.v1alpha.AccessDimensionOrBuilder getDimensionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The metrics requested and displayed in the response. Requests are allowed
   * up to 10 metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessMetric metrics = 3;</code>
   */
  java.util.List<com.google.analytics.admin.v1alpha.AccessMetric> getMetricsList();
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed in the response. Requests are allowed
   * up to 10 metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessMetric metrics = 3;</code>
   */
  com.google.analytics.admin.v1alpha.AccessMetric getMetrics(int index);
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed in the response. Requests are allowed
   * up to 10 metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessMetric metrics = 3;</code>
   */
  int getMetricsCount();
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed in the response. Requests are allowed
   * up to 10 metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessMetric metrics = 3;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1alpha.AccessMetricOrBuilder>
      getMetricsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The metrics requested and displayed in the response. Requests are allowed
   * up to 10 metrics.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessMetric metrics = 3;</code>
   */
  com.google.analytics.admin.v1alpha.AccessMetricOrBuilder getMetricsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Date ranges of access records to read. If multiple date ranges are
   * requested, each response row will contain a zero based date range index. If
   * two date ranges overlap, the access records for the overlapping days is
   * included in the response rows for both date ranges. Requests are allowed up
   * to 2 date ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessDateRange date_ranges = 4;</code>
   */
  java.util.List<com.google.analytics.admin.v1alpha.AccessDateRange> getDateRangesList();
  /**
   *
   *
   * <pre>
   * Date ranges of access records to read. If multiple date ranges are
   * requested, each response row will contain a zero based date range index. If
   * two date ranges overlap, the access records for the overlapping days is
   * included in the response rows for both date ranges. Requests are allowed up
   * to 2 date ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessDateRange date_ranges = 4;</code>
   */
  com.google.analytics.admin.v1alpha.AccessDateRange getDateRanges(int index);
  /**
   *
   *
   * <pre>
   * Date ranges of access records to read. If multiple date ranges are
   * requested, each response row will contain a zero based date range index. If
   * two date ranges overlap, the access records for the overlapping days is
   * included in the response rows for both date ranges. Requests are allowed up
   * to 2 date ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessDateRange date_ranges = 4;</code>
   */
  int getDateRangesCount();
  /**
   *
   *
   * <pre>
   * Date ranges of access records to read. If multiple date ranges are
   * requested, each response row will contain a zero based date range index. If
   * two date ranges overlap, the access records for the overlapping days is
   * included in the response rows for both date ranges. Requests are allowed up
   * to 2 date ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessDateRange date_ranges = 4;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1alpha.AccessDateRangeOrBuilder>
      getDateRangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Date ranges of access records to read. If multiple date ranges are
   * requested, each response row will contain a zero based date range index. If
   * two date ranges overlap, the access records for the overlapping days is
   * included in the response rows for both date ranges. Requests are allowed up
   * to 2 date ranges.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessDateRange date_ranges = 4;</code>
   */
  com.google.analytics.admin.v1alpha.AccessDateRangeOrBuilder getDateRangesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Dimension filters let you restrict report response to specific
   * dimension values which match the filter. For example, filtering on access
   * records of a single user. To learn more, see [Fundamentals of Dimension
   * Filters](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#dimension_filters)
   * for examples. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessFilterExpression dimension_filter = 5;</code>
   *
   * @return Whether the dimensionFilter field is set.
   */
  boolean hasDimensionFilter();
  /**
   *
   *
   * <pre>
   * Dimension filters let you restrict report response to specific
   * dimension values which match the filter. For example, filtering on access
   * records of a single user. To learn more, see [Fundamentals of Dimension
   * Filters](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#dimension_filters)
   * for examples. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessFilterExpression dimension_filter = 5;</code>
   *
   * @return The dimensionFilter.
   */
  com.google.analytics.admin.v1alpha.AccessFilterExpression getDimensionFilter();
  /**
   *
   *
   * <pre>
   * Dimension filters let you restrict report response to specific
   * dimension values which match the filter. For example, filtering on access
   * records of a single user. To learn more, see [Fundamentals of Dimension
   * Filters](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#dimension_filters)
   * for examples. Metrics cannot be used in this filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessFilterExpression dimension_filter = 5;</code>
   */
  com.google.analytics.admin.v1alpha.AccessFilterExpressionOrBuilder getDimensionFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Metric filters allow you to restrict report response to specific metric
   * values which match the filter. Metric filters are applied after aggregating
   * the report's rows, similar to SQL having-clause. Dimensions cannot be used
   * in this filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessFilterExpression metric_filter = 6;</code>
   *
   * @return Whether the metricFilter field is set.
   */
  boolean hasMetricFilter();
  /**
   *
   *
   * <pre>
   * Metric filters allow you to restrict report response to specific metric
   * values which match the filter. Metric filters are applied after aggregating
   * the report's rows, similar to SQL having-clause. Dimensions cannot be used
   * in this filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessFilterExpression metric_filter = 6;</code>
   *
   * @return The metricFilter.
   */
  com.google.analytics.admin.v1alpha.AccessFilterExpression getMetricFilter();
  /**
   *
   *
   * <pre>
   * Metric filters allow you to restrict report response to specific metric
   * values which match the filter. Metric filters are applied after aggregating
   * the report's rows, similar to SQL having-clause. Dimensions cannot be used
   * in this filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessFilterExpression metric_filter = 6;</code>
   */
  com.google.analytics.admin.v1alpha.AccessFilterExpressionOrBuilder getMetricFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * The row count of the start row. The first row is counted as row 0. If
   * offset is unspecified, it is treated as 0. If offset is zero, then this
   * method will return the first page of results with `limit` entries.
   *
   * To learn more about this pagination parameter, see
   * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
   * </pre>
   *
   * <code>int64 offset = 7;</code>
   *
   * @return The offset.
   */
  long getOffset();

  /**
   *
   *
   * <pre>
   * The number of rows to return. If unspecified, 10,000 rows are returned. The
   * API returns a maximum of 100,000 rows per request, no matter how many you
   * ask for. `limit` must be positive.
   *
   * The API may return fewer rows than the requested `limit`, if there aren't
   * as many remaining rows as the `limit`. For instance, there are fewer than
   * 300 possible values for the dimension `country`, so when reporting on only
   * `country`, you can't get more than 300 rows, even if you set `limit` to a
   * higher value.
   *
   * To learn more about this pagination parameter, see
   * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
   * </pre>
   *
   * <code>int64 limit = 8;</code>
   *
   * @return The limit.
   */
  long getLimit();

  /**
   *
   *
   * <pre>
   * This request's time zone if specified. If unspecified, the property's time
   * zone is used. The request's time zone is used to interpret the start &amp; end
   * dates of the report.
   *
   * Formatted as strings from the IANA Time Zone database
   * (https://www.iana.org/time-zones); for example "America/New_York" or
   * "Asia/Tokyo".
   * </pre>
   *
   * <code>string time_zone = 9;</code>
   *
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   *
   *
   * <pre>
   * This request's time zone if specified. If unspecified, the property's time
   * zone is used. The request's time zone is used to interpret the start &amp; end
   * dates of the report.
   *
   * Formatted as strings from the IANA Time Zone database
   * (https://www.iana.org/time-zones); for example "America/New_York" or
   * "Asia/Tokyo".
   * </pre>
   *
   * <code>string time_zone = 9;</code>
   *
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessOrderBy order_bys = 10;</code>
   */
  java.util.List<com.google.analytics.admin.v1alpha.AccessOrderBy> getOrderBysList();
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessOrderBy order_bys = 10;</code>
   */
  com.google.analytics.admin.v1alpha.AccessOrderBy getOrderBys(int index);
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessOrderBy order_bys = 10;</code>
   */
  int getOrderBysCount();
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessOrderBy order_bys = 10;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1alpha.AccessOrderByOrBuilder>
      getOrderBysOrBuilderList();
  /**
   *
   *
   * <pre>
   * Specifies how rows are ordered in the response.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.AccessOrderBy order_bys = 10;</code>
   */
  com.google.analytics.admin.v1alpha.AccessOrderByOrBuilder getOrderBysOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Toggles whether to return the current state of this Analytics Property's
   * quota. Quota is returned in [AccessQuota](#AccessQuota). For account-level
   * requests, this field must be false.
   * </pre>
   *
   * <code>bool return_entity_quota = 11;</code>
   *
   * @return The returnEntityQuota.
   */
  boolean getReturnEntityQuota();
}
