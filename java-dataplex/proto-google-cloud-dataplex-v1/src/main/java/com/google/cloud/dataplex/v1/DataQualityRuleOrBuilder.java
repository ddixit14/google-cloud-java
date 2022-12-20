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
// source: google/cloud/dataplex/v1/data_quality.proto

package com.google.cloud.dataplex.v1;

public interface DataQualityRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.DataQualityRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * ColumnMap rule which evaluates whether each column value lies between a
   * specified range.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityRule.RangeExpectation range_expectation = 1;</code>
   *
   * @return Whether the rangeExpectation field is set.
   */
  boolean hasRangeExpectation();
  /**
   *
   *
   * <pre>
   * ColumnMap rule which evaluates whether each column value lies between a
   * specified range.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityRule.RangeExpectation range_expectation = 1;</code>
   *
   * @return The rangeExpectation.
   */
  com.google.cloud.dataplex.v1.DataQualityRule.RangeExpectation getRangeExpectation();
  /**
   *
   *
   * <pre>
   * ColumnMap rule which evaluates whether each column value lies between a
   * specified range.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityRule.RangeExpectation range_expectation = 1;</code>
   */
  com.google.cloud.dataplex.v1.DataQualityRule.RangeExpectationOrBuilder
      getRangeExpectationOrBuilder();

  /**
   *
   *
   * <pre>
   * ColumnMap rule which evaluates whether each column value is null.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityRule.NonNullExpectation non_null_expectation = 2;
   * </code>
   *
   * @return Whether the nonNullExpectation field is set.
   */
  boolean hasNonNullExpectation();
  /**
   *
   *
   * <pre>
   * ColumnMap rule which evaluates whether each column value is null.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityRule.NonNullExpectation non_null_expectation = 2;
   * </code>
   *
   * @return The nonNullExpectation.
   */
  com.google.cloud.dataplex.v1.DataQualityRule.NonNullExpectation getNonNullExpectation();
  /**
   *
   *
   * <pre>
   * ColumnMap rule which evaluates whether each column value is null.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityRule.NonNullExpectation non_null_expectation = 2;
   * </code>
   */
  com.google.cloud.dataplex.v1.DataQualityRule.NonNullExpectationOrBuilder
      getNonNullExpectationOrBuilder();

  /**
   *
   *
   * <pre>
   * ColumnMap rule which evaluates whether each column value is contained by
   * a specified set.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityRule.SetExpectation set_expectation = 3;</code>
   *
   * @return Whether the setExpectation field is set.
   */
  boolean hasSetExpectation();
  /**
   *
   *
   * <pre>
   * ColumnMap rule which evaluates whether each column value is contained by
   * a specified set.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityRule.SetExpectation set_expectation = 3;</code>
   *
   * @return The setExpectation.
   */
  com.google.cloud.dataplex.v1.DataQualityRule.SetExpectation getSetExpectation();
  /**
   *
   *
   * <pre>
   * ColumnMap rule which evaluates whether each column value is contained by
   * a specified set.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityRule.SetExpectation set_expectation = 3;</code>
   */
  com.google.cloud.dataplex.v1.DataQualityRule.SetExpectationOrBuilder getSetExpectationOrBuilder();

  /**
   *
   *
   * <pre>
   * ColumnMap rule which evaluates whether each column value matches a
   * specified regex.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityRule.RegexExpectation regex_expectation = 4;</code>
   *
   * @return Whether the regexExpectation field is set.
   */
  boolean hasRegexExpectation();
  /**
   *
   *
   * <pre>
   * ColumnMap rule which evaluates whether each column value matches a
   * specified regex.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityRule.RegexExpectation regex_expectation = 4;</code>
   *
   * @return The regexExpectation.
   */
  com.google.cloud.dataplex.v1.DataQualityRule.RegexExpectation getRegexExpectation();
  /**
   *
   *
   * <pre>
   * ColumnMap rule which evaluates whether each column value matches a
   * specified regex.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataQualityRule.RegexExpectation regex_expectation = 4;</code>
   */
  com.google.cloud.dataplex.v1.DataQualityRule.RegexExpectationOrBuilder
      getRegexExpectationOrBuilder();

  /**
   *
   *
   * <pre>
   * ColumnAggregate rule which evaluates whether the column has duplicates.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityRule.UniquenessExpectation uniqueness_expectation = 100;
   * </code>
   *
   * @return Whether the uniquenessExpectation field is set.
   */
  boolean hasUniquenessExpectation();
  /**
   *
   *
   * <pre>
   * ColumnAggregate rule which evaluates whether the column has duplicates.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityRule.UniquenessExpectation uniqueness_expectation = 100;
   * </code>
   *
   * @return The uniquenessExpectation.
   */
  com.google.cloud.dataplex.v1.DataQualityRule.UniquenessExpectation getUniquenessExpectation();
  /**
   *
   *
   * <pre>
   * ColumnAggregate rule which evaluates whether the column has duplicates.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityRule.UniquenessExpectation uniqueness_expectation = 100;
   * </code>
   */
  com.google.cloud.dataplex.v1.DataQualityRule.UniquenessExpectationOrBuilder
      getUniquenessExpectationOrBuilder();

  /**
   *
   *
   * <pre>
   * ColumnAggregate rule which evaluates whether the column aggregate
   * statistic lies between a specified range.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityRule.StatisticRangeExpectation statistic_range_expectation = 101;
   * </code>
   *
   * @return Whether the statisticRangeExpectation field is set.
   */
  boolean hasStatisticRangeExpectation();
  /**
   *
   *
   * <pre>
   * ColumnAggregate rule which evaluates whether the column aggregate
   * statistic lies between a specified range.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityRule.StatisticRangeExpectation statistic_range_expectation = 101;
   * </code>
   *
   * @return The statisticRangeExpectation.
   */
  com.google.cloud.dataplex.v1.DataQualityRule.StatisticRangeExpectation
      getStatisticRangeExpectation();
  /**
   *
   *
   * <pre>
   * ColumnAggregate rule which evaluates whether the column aggregate
   * statistic lies between a specified range.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityRule.StatisticRangeExpectation statistic_range_expectation = 101;
   * </code>
   */
  com.google.cloud.dataplex.v1.DataQualityRule.StatisticRangeExpectationOrBuilder
      getStatisticRangeExpectationOrBuilder();

  /**
   *
   *
   * <pre>
   * Table rule which evaluates whether each row passes the specified
   * condition.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityRule.RowConditionExpectation row_condition_expectation = 200;
   * </code>
   *
   * @return Whether the rowConditionExpectation field is set.
   */
  boolean hasRowConditionExpectation();
  /**
   *
   *
   * <pre>
   * Table rule which evaluates whether each row passes the specified
   * condition.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityRule.RowConditionExpectation row_condition_expectation = 200;
   * </code>
   *
   * @return The rowConditionExpectation.
   */
  com.google.cloud.dataplex.v1.DataQualityRule.RowConditionExpectation getRowConditionExpectation();
  /**
   *
   *
   * <pre>
   * Table rule which evaluates whether each row passes the specified
   * condition.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityRule.RowConditionExpectation row_condition_expectation = 200;
   * </code>
   */
  com.google.cloud.dataplex.v1.DataQualityRule.RowConditionExpectationOrBuilder
      getRowConditionExpectationOrBuilder();

  /**
   *
   *
   * <pre>
   * Table rule which evaluates whether the provided expression is true.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityRule.TableConditionExpectation table_condition_expectation = 201;
   * </code>
   *
   * @return Whether the tableConditionExpectation field is set.
   */
  boolean hasTableConditionExpectation();
  /**
   *
   *
   * <pre>
   * Table rule which evaluates whether the provided expression is true.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityRule.TableConditionExpectation table_condition_expectation = 201;
   * </code>
   *
   * @return The tableConditionExpectation.
   */
  com.google.cloud.dataplex.v1.DataQualityRule.TableConditionExpectation
      getTableConditionExpectation();
  /**
   *
   *
   * <pre>
   * Table rule which evaluates whether the provided expression is true.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityRule.TableConditionExpectation table_condition_expectation = 201;
   * </code>
   */
  com.google.cloud.dataplex.v1.DataQualityRule.TableConditionExpectationOrBuilder
      getTableConditionExpectationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The unnested column which this rule is evaluated against.
   * </pre>
   *
   * <code>string column = 500 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The column.
   */
  java.lang.String getColumn();
  /**
   *
   *
   * <pre>
   * Optional. The unnested column which this rule is evaluated against.
   * </pre>
   *
   * <code>string column = 500 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for column.
   */
  com.google.protobuf.ByteString getColumnBytes();

  /**
   *
   *
   * <pre>
   * Optional. Rows with null values will automatically fail a rule, unless
   * ignore_null is true. In that case, such null rows are trivially considered
   * passing. Only applicable to ColumnMap rules.
   * </pre>
   *
   * <code>bool ignore_null = 501 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The ignoreNull.
   */
  boolean getIgnoreNull();

  /**
   *
   *
   * <pre>
   * Required. The dimension a rule belongs to. Results are also aggregated at
   * the dimension-level. Supported dimensions are ["COMPLETENESS", "ACCURACY",
   * "CONSISTENCY", "VALIDITY", "UNIQUENESS", "INTEGRITY"]
   * </pre>
   *
   * <code>string dimension = 502 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dimension.
   */
  java.lang.String getDimension();
  /**
   *
   *
   * <pre>
   * Required. The dimension a rule belongs to. Results are also aggregated at
   * the dimension-level. Supported dimensions are ["COMPLETENESS", "ACCURACY",
   * "CONSISTENCY", "VALIDITY", "UNIQUENESS", "INTEGRITY"]
   * </pre>
   *
   * <code>string dimension = 502 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dimension.
   */
  com.google.protobuf.ByteString getDimensionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The minimum ratio of passing_rows / total_rows required to pass
   * this rule, with a range of [0.0, 1.0]
   * 0 indicates default value (i.e. 1.0)
   * </pre>
   *
   * <code>double threshold = 503 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The threshold.
   */
  double getThreshold();

  public com.google.cloud.dataplex.v1.DataQualityRule.RuleTypeCase getRuleTypeCase();
}
