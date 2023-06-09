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

public interface UserSegmentSequenceGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.UserSegmentSequenceGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * All sequence steps must be satisfied in the scoping for the user to
   * match the sequence. For example if `sequenceScoping =
   * USER_CRITERIA_WITHIN_SAME_SESSION`, all sequence steps must complete within
   * one session for the user to match the sequence. `sequenceScoping =
   * USER_CRITERIA_WITHIN_SAME_EVENT` is not supported.
   *
   * Optional. If unspecified, `conditionScoping = ACROSS_ALL_SESSIONS` is
   * used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserCriteriaScoping sequence_scoping = 1;</code>
   *
   * @return The enum numeric value on the wire for sequenceScoping.
   */
  int getSequenceScopingValue();
  /**
   *
   *
   * <pre>
   * All sequence steps must be satisfied in the scoping for the user to
   * match the sequence. For example if `sequenceScoping =
   * USER_CRITERIA_WITHIN_SAME_SESSION`, all sequence steps must complete within
   * one session for the user to match the sequence. `sequenceScoping =
   * USER_CRITERIA_WITHIN_SAME_EVENT` is not supported.
   *
   * Optional. If unspecified, `conditionScoping = ACROSS_ALL_SESSIONS` is
   * used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserCriteriaScoping sequence_scoping = 1;</code>
   *
   * @return The sequenceScoping.
   */
  com.google.analytics.data.v1alpha.UserCriteriaScoping getSequenceScoping();

  /**
   *
   *
   * <pre>
   * Defines the time period in which the whole sequence must occur; for
   * example, 30 Minutes. `sequenceMaximumDuration` is inclusive
   * of the endpoint at the microsecond granularity. For example a sequence
   * with a maximum duration of 5 seconds can be completed at 4.9 or 5.0
   * seconds, but not 5 seconds and 1 microsecond.
   *
   * `sequenceMaximumDuration` is optional, and if unspecified, sequences can
   * be completed in any time duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration sequence_maximum_duration = 2;</code>
   *
   * @return Whether the sequenceMaximumDuration field is set.
   */
  boolean hasSequenceMaximumDuration();
  /**
   *
   *
   * <pre>
   * Defines the time period in which the whole sequence must occur; for
   * example, 30 Minutes. `sequenceMaximumDuration` is inclusive
   * of the endpoint at the microsecond granularity. For example a sequence
   * with a maximum duration of 5 seconds can be completed at 4.9 or 5.0
   * seconds, but not 5 seconds and 1 microsecond.
   *
   * `sequenceMaximumDuration` is optional, and if unspecified, sequences can
   * be completed in any time duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration sequence_maximum_duration = 2;</code>
   *
   * @return The sequenceMaximumDuration.
   */
  com.google.protobuf.Duration getSequenceMaximumDuration();
  /**
   *
   *
   * <pre>
   * Defines the time period in which the whole sequence must occur; for
   * example, 30 Minutes. `sequenceMaximumDuration` is inclusive
   * of the endpoint at the microsecond granularity. For example a sequence
   * with a maximum duration of 5 seconds can be completed at 4.9 or 5.0
   * seconds, but not 5 seconds and 1 microsecond.
   *
   * `sequenceMaximumDuration` is optional, and if unspecified, sequences can
   * be completed in any time duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration sequence_maximum_duration = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getSequenceMaximumDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * An ordered sequence of condition steps. A user's events must complete
   * each step in order for the user to match the
   * `UserSegmentSequenceGroup`.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.UserSequenceStep user_sequence_steps = 3;</code>
   */
  java.util.List<com.google.analytics.data.v1alpha.UserSequenceStep> getUserSequenceStepsList();
  /**
   *
   *
   * <pre>
   * An ordered sequence of condition steps. A user's events must complete
   * each step in order for the user to match the
   * `UserSegmentSequenceGroup`.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.UserSequenceStep user_sequence_steps = 3;</code>
   */
  com.google.analytics.data.v1alpha.UserSequenceStep getUserSequenceSteps(int index);
  /**
   *
   *
   * <pre>
   * An ordered sequence of condition steps. A user's events must complete
   * each step in order for the user to match the
   * `UserSegmentSequenceGroup`.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.UserSequenceStep user_sequence_steps = 3;</code>
   */
  int getUserSequenceStepsCount();
  /**
   *
   *
   * <pre>
   * An ordered sequence of condition steps. A user's events must complete
   * each step in order for the user to match the
   * `UserSegmentSequenceGroup`.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.UserSequenceStep user_sequence_steps = 3;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.UserSequenceStepOrBuilder>
      getUserSequenceStepsOrBuilderList();
  /**
   *
   *
   * <pre>
   * An ordered sequence of condition steps. A user's events must complete
   * each step in order for the user to match the
   * `UserSegmentSequenceGroup`.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.UserSequenceStep user_sequence_steps = 3;</code>
   */
  com.google.analytics.data.v1alpha.UserSequenceStepOrBuilder getUserSequenceStepsOrBuilder(
      int index);
}
