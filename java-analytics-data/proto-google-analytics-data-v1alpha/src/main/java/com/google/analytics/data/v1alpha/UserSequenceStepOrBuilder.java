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
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface UserSequenceStepOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.UserSequenceStep)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If true, the event satisfying this step must be the very next event
   * after the event satifying the last step. If false, this step indirectly
   * follows the prior step; for example, there may be events between the
   * prior step and this step. `isDirectlyFollowedBy` must be false for
   * the first step.
   * </pre>
   *
   * <code>bool is_directly_followed_by = 1;</code>
   *
   * @return The isDirectlyFollowedBy.
   */
  boolean getIsDirectlyFollowedBy();

  /**
   *
   *
   * <pre>
   * This sequence step must be satisfied in the scoping for the user to
   * match the sequence. For example if `sequenceScoping =
   * WITHIN_SAME_SESSION`, this sequence steps must complete within one
   * session for the user to match the sequence. `stepScoping =
   * ACROSS_ALL_SESSIONS` is only allowed if the `sequenceScoping =
   * ACROSS_ALL_SESSIONS`.
   *
   * Optional. If unspecified, `stepScoping` uses the same
   * `UserCriteriaScoping` as the `sequenceScoping`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserCriteriaScoping step_scoping = 2;</code>
   *
   * @return The enum numeric value on the wire for stepScoping.
   */
  int getStepScopingValue();
  /**
   *
   *
   * <pre>
   * This sequence step must be satisfied in the scoping for the user to
   * match the sequence. For example if `sequenceScoping =
   * WITHIN_SAME_SESSION`, this sequence steps must complete within one
   * session for the user to match the sequence. `stepScoping =
   * ACROSS_ALL_SESSIONS` is only allowed if the `sequenceScoping =
   * ACROSS_ALL_SESSIONS`.
   *
   * Optional. If unspecified, `stepScoping` uses the same
   * `UserCriteriaScoping` as the `sequenceScoping`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserCriteriaScoping step_scoping = 2;</code>
   *
   * @return The stepScoping.
   */
  com.google.analytics.data.v1alpha.UserCriteriaScoping getStepScoping();

  /**
   *
   *
   * <pre>
   * A user matches this sequence step if their events match this
   * expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 3;
   * </code>
   *
   * @return Whether the segmentFilterExpression field is set.
   */
  boolean hasSegmentFilterExpression();
  /**
   *
   *
   * <pre>
   * A user matches this sequence step if their events match this
   * expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 3;
   * </code>
   *
   * @return The segmentFilterExpression.
   */
  com.google.analytics.data.v1alpha.SegmentFilterExpression getSegmentFilterExpression();
  /**
   *
   *
   * <pre>
   * A user matches this sequence step if their events match this
   * expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 3;
   * </code>
   */
  com.google.analytics.data.v1alpha.SegmentFilterExpressionOrBuilder
      getSegmentFilterExpressionOrBuilder();
}
