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
// source: google/monitoring/v3/service.proto

package com.google.monitoring.v3;

public interface WindowsBasedSliOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.WindowsBasedSli)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` with `ValueType = BOOL`. The window is good if
   * any `true` values appear in the window.
   * </pre>
   *
   * <code>string good_bad_metric_filter = 5;</code>
   *
   * @return Whether the goodBadMetricFilter field is set.
   */
  boolean hasGoodBadMetricFilter();
  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` with `ValueType = BOOL`. The window is good if
   * any `true` values appear in the window.
   * </pre>
   *
   * <code>string good_bad_metric_filter = 5;</code>
   *
   * @return The goodBadMetricFilter.
   */
  java.lang.String getGoodBadMetricFilter();
  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` with `ValueType = BOOL`. The window is good if
   * any `true` values appear in the window.
   * </pre>
   *
   * <code>string good_bad_metric_filter = 5;</code>
   *
   * @return The bytes for goodBadMetricFilter.
   */
  com.google.protobuf.ByteString getGoodBadMetricFilterBytes();

  /**
   *
   *
   * <pre>
   * A window is good if its `performance` is high enough.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.WindowsBasedSli.PerformanceThreshold good_total_ratio_threshold = 2;
   * </code>
   *
   * @return Whether the goodTotalRatioThreshold field is set.
   */
  boolean hasGoodTotalRatioThreshold();
  /**
   *
   *
   * <pre>
   * A window is good if its `performance` is high enough.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.WindowsBasedSli.PerformanceThreshold good_total_ratio_threshold = 2;
   * </code>
   *
   * @return The goodTotalRatioThreshold.
   */
  com.google.monitoring.v3.WindowsBasedSli.PerformanceThreshold getGoodTotalRatioThreshold();
  /**
   *
   *
   * <pre>
   * A window is good if its `performance` is high enough.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.WindowsBasedSli.PerformanceThreshold good_total_ratio_threshold = 2;
   * </code>
   */
  com.google.monitoring.v3.WindowsBasedSli.PerformanceThresholdOrBuilder
      getGoodTotalRatioThresholdOrBuilder();

  /**
   *
   *
   * <pre>
   * A window is good if the metric's value is in a good range, averaged
   * across returned streams.
   * </pre>
   *
   * <code>.google.monitoring.v3.WindowsBasedSli.MetricRange metric_mean_in_range = 6;</code>
   *
   * @return Whether the metricMeanInRange field is set.
   */
  boolean hasMetricMeanInRange();
  /**
   *
   *
   * <pre>
   * A window is good if the metric's value is in a good range, averaged
   * across returned streams.
   * </pre>
   *
   * <code>.google.monitoring.v3.WindowsBasedSli.MetricRange metric_mean_in_range = 6;</code>
   *
   * @return The metricMeanInRange.
   */
  com.google.monitoring.v3.WindowsBasedSli.MetricRange getMetricMeanInRange();
  /**
   *
   *
   * <pre>
   * A window is good if the metric's value is in a good range, averaged
   * across returned streams.
   * </pre>
   *
   * <code>.google.monitoring.v3.WindowsBasedSli.MetricRange metric_mean_in_range = 6;</code>
   */
  com.google.monitoring.v3.WindowsBasedSli.MetricRangeOrBuilder getMetricMeanInRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * A window is good if the metric's value is in a good range, summed across
   * returned streams.
   * </pre>
   *
   * <code>.google.monitoring.v3.WindowsBasedSli.MetricRange metric_sum_in_range = 7;</code>
   *
   * @return Whether the metricSumInRange field is set.
   */
  boolean hasMetricSumInRange();
  /**
   *
   *
   * <pre>
   * A window is good if the metric's value is in a good range, summed across
   * returned streams.
   * </pre>
   *
   * <code>.google.monitoring.v3.WindowsBasedSli.MetricRange metric_sum_in_range = 7;</code>
   *
   * @return The metricSumInRange.
   */
  com.google.monitoring.v3.WindowsBasedSli.MetricRange getMetricSumInRange();
  /**
   *
   *
   * <pre>
   * A window is good if the metric's value is in a good range, summed across
   * returned streams.
   * </pre>
   *
   * <code>.google.monitoring.v3.WindowsBasedSli.MetricRange metric_sum_in_range = 7;</code>
   */
  com.google.monitoring.v3.WindowsBasedSli.MetricRangeOrBuilder getMetricSumInRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Duration over which window quality is evaluated. Must be an integer
   * fraction of a day and at least `60s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration window_period = 4;</code>
   *
   * @return Whether the windowPeriod field is set.
   */
  boolean hasWindowPeriod();
  /**
   *
   *
   * <pre>
   * Duration over which window quality is evaluated. Must be an integer
   * fraction of a day and at least `60s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration window_period = 4;</code>
   *
   * @return The windowPeriod.
   */
  com.google.protobuf.Duration getWindowPeriod();
  /**
   *
   *
   * <pre>
   * Duration over which window quality is evaluated. Must be an integer
   * fraction of a day and at least `60s`.
   * </pre>
   *
   * <code>.google.protobuf.Duration window_period = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getWindowPeriodOrBuilder();

  com.google.monitoring.v3.WindowsBasedSli.WindowCriterionCase getWindowCriterionCase();
}
