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

public interface DataQualitySpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.DataQualitySpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of rules to evaluate against a data source. At least one rule is
   * required.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
   */
  java.util.List<com.google.cloud.dataplex.v1.DataQualityRule> getRulesList();
  /**
   *
   *
   * <pre>
   * The list of rules to evaluate against a data source. At least one rule is
   * required.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
   */
  com.google.cloud.dataplex.v1.DataQualityRule getRules(int index);
  /**
   *
   *
   * <pre>
   * The list of rules to evaluate against a data source. At least one rule is
   * required.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
   */
  int getRulesCount();
  /**
   *
   *
   * <pre>
   * The list of rules to evaluate against a data source. At least one rule is
   * required.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dataplex.v1.DataQualityRuleOrBuilder>
      getRulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of rules to evaluate against a data source. At least one rule is
   * required.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRule rules = 1;</code>
   */
  com.google.cloud.dataplex.v1.DataQualityRuleOrBuilder getRulesOrBuilder(int index);
}
