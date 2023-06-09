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
// source: google/cloud/aiplatform/v1beta1/schedule.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ScheduleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Schedule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Cron schedule (https://en.wikipedia.org/wiki/Cron) to launch scheduled
   * runs. To explicitly set a timezone to the cron tab, apply a prefix in the
   * cron tab: "CRON_TZ=${IANA_TIME_ZONE}" or "TZ=${IANA_TIME_ZONE}".
   * The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone
   * database. For example, "CRON_TZ=America/New_York 1 * * * *", or
   * "TZ=America/New_York 1 * * * *".
   * </pre>
   *
   * <code>string cron = 10;</code>
   *
   * @return Whether the cron field is set.
   */
  boolean hasCron();
  /**
   *
   *
   * <pre>
   * Cron schedule (https://en.wikipedia.org/wiki/Cron) to launch scheduled
   * runs. To explicitly set a timezone to the cron tab, apply a prefix in the
   * cron tab: "CRON_TZ=${IANA_TIME_ZONE}" or "TZ=${IANA_TIME_ZONE}".
   * The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone
   * database. For example, "CRON_TZ=America/New_York 1 * * * *", or
   * "TZ=America/New_York 1 * * * *".
   * </pre>
   *
   * <code>string cron = 10;</code>
   *
   * @return The cron.
   */
  java.lang.String getCron();
  /**
   *
   *
   * <pre>
   * Cron schedule (https://en.wikipedia.org/wiki/Cron) to launch scheduled
   * runs. To explicitly set a timezone to the cron tab, apply a prefix in the
   * cron tab: "CRON_TZ=${IANA_TIME_ZONE}" or "TZ=${IANA_TIME_ZONE}".
   * The ${IANA_TIME_ZONE} may only be a valid string from IANA time zone
   * database. For example, "CRON_TZ=America/New_York 1 * * * *", or
   * "TZ=America/New_York 1 * * * *".
   * </pre>
   *
   * <code>string cron = 10;</code>
   *
   * @return The bytes for cron.
   */
  com.google.protobuf.ByteString getCronBytes();

  /**
   *
   *
   * <pre>
   * Request for
   * [PipelineService.CreatePipelineJob][google.cloud.aiplatform.v1beta1.PipelineService.CreatePipelineJob].
   * CreatePipelineJobRequest.parent field is required (format:
   * projects/{project}/locations/{location}).
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest create_pipeline_job_request = 14;
   * </code>
   *
   * @return Whether the createPipelineJobRequest field is set.
   */
  boolean hasCreatePipelineJobRequest();
  /**
   *
   *
   * <pre>
   * Request for
   * [PipelineService.CreatePipelineJob][google.cloud.aiplatform.v1beta1.PipelineService.CreatePipelineJob].
   * CreatePipelineJobRequest.parent field is required (format:
   * projects/{project}/locations/{location}).
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest create_pipeline_job_request = 14;
   * </code>
   *
   * @return The createPipelineJobRequest.
   */
  com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest getCreatePipelineJobRequest();
  /**
   *
   *
   * <pre>
   * Request for
   * [PipelineService.CreatePipelineJob][google.cloud.aiplatform.v1beta1.PipelineService.CreatePipelineJob].
   * CreatePipelineJobRequest.parent field is required (format:
   * projects/{project}/locations/{location}).
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.CreatePipelineJobRequest create_pipeline_job_request = 14;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.CreatePipelineJobRequestOrBuilder
      getCreatePipelineJobRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Schedule.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Schedule.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. User provided name of the Schedule.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
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
   * Required. User provided name of the Schedule.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
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
   * Optional. Timestamp after which the first run can be scheduled.
   * Default to Schedule create time if not specified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Optional. Timestamp after which the first run can be scheduled.
   * Default to Schedule create time if not specified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Optional. Timestamp after which the first run can be scheduled.
   * Default to Schedule create time if not specified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Timestamp after which no new runs can be scheduled.
   * If specified, The schedule will be completed when either
   * end_time is reached or when scheduled_run_count &gt;= max_run_count.
   * If not specified, new runs will keep getting scheduled until this Schedule
   * is paused or deleted. Already scheduled runs will be allowed to complete.
   * Unset if not specified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Optional. Timestamp after which no new runs can be scheduled.
   * If specified, The schedule will be completed when either
   * end_time is reached or when scheduled_run_count &gt;= max_run_count.
   * If not specified, new runs will keep getting scheduled until this Schedule
   * is paused or deleted. Already scheduled runs will be allowed to complete.
   * Unset if not specified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Optional. Timestamp after which no new runs can be scheduled.
   * If specified, The schedule will be completed when either
   * end_time is reached or when scheduled_run_count &gt;= max_run_count.
   * If not specified, new runs will keep getting scheduled until this Schedule
   * is paused or deleted. Already scheduled runs will be allowed to complete.
   * Unset if not specified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Maximum run count of the schedule.
   * If specified, The schedule will be completed when either
   * started_run_count &gt;= max_run_count or when end_time is reached.
   * If not specified, new runs will keep getting scheduled until this Schedule
   * is paused or deleted. Already scheduled runs will be allowed to complete.
   * Unset if not specified.
   * </pre>
   *
   * <code>int64 max_run_count = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxRunCount.
   */
  long getMaxRunCount();

  /**
   *
   *
   * <pre>
   * Output only. The number of runs started by this schedule.
   * </pre>
   *
   * <code>int64 started_run_count = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The startedRunCount.
   */
  long getStartedRunCount();

  /**
   *
   *
   * <pre>
   * Output only. The state of this Schedule.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Schedule.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of this Schedule.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Schedule.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.aiplatform.v1beta1.Schedule.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule should schedule the next run.
   * Having a next_run_time in the past means the runs are being started
   * behind schedule.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_run_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the nextRunTime field is set.
   */
  boolean hasNextRunTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule should schedule the next run.
   * Having a next_run_time in the past means the runs are being started
   * behind schedule.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_run_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The nextRunTime.
   */
  com.google.protobuf.Timestamp getNextRunTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule should schedule the next run.
   * Having a next_run_time in the past means the runs are being started
   * behind schedule.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp next_run_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getNextRunTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule was last paused.
   * Unset if never paused.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_pause_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastPauseTime field is set.
   */
  boolean hasLastPauseTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule was last paused.
   * Unset if never paused.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_pause_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastPauseTime.
   */
  com.google.protobuf.Timestamp getLastPauseTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule was last paused.
   * Unset if never paused.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_pause_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getLastPauseTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule was last resumed.
   * Unset if never resumed from pause.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_resume_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastResumeTime field is set.
   */
  boolean hasLastResumeTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule was last resumed.
   * Unset if never resumed from pause.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_resume_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastResumeTime.
   */
  com.google.protobuf.Timestamp getLastResumeTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Schedule was last resumed.
   * Unset if never resumed from pause.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_resume_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getLastResumeTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Maximum number of runs that can be started concurrently for this
   * Schedule. This is the limit for starting the scheduled requests and not the
   * execution of the operations/jobs created by the requests (if applicable).
   * </pre>
   *
   * <code>int64 max_concurrent_run_count = 11 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The maxConcurrentRunCount.
   */
  long getMaxConcurrentRunCount();

  /**
   *
   *
   * <pre>
   * Optional. Whether new scheduled runs can be queued when max_concurrent_runs
   * limit is reached. If set to true, new runs will be queued instead of
   * skipped. Default to false.
   * </pre>
   *
   * <code>bool allow_queueing = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The allowQueueing.
   */
  boolean getAllowQueueing();

  /**
   *
   *
   * <pre>
   * Output only. Whether to backfill missed runs when the schedule is resumed
   * from PAUSED state. If set to true, all missed runs will be scheduled. New
   * runs will be scheduled after the backfill is complete. Default to false.
   * </pre>
   *
   * <code>bool catch_up = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The catchUp.
   */
  boolean getCatchUp();

  /**
   *
   *
   * <pre>
   * Output only. Response of the last scheduled run.
   * This is the response for starting the scheduled requests and not the
   * execution of the operations/jobs created by the requests (if applicable).
   * Unset if no run has been scheduled yet.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Schedule.RunResponse last_scheduled_run_response = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastScheduledRunResponse field is set.
   */
  boolean hasLastScheduledRunResponse();
  /**
   *
   *
   * <pre>
   * Output only. Response of the last scheduled run.
   * This is the response for starting the scheduled requests and not the
   * execution of the operations/jobs created by the requests (if applicable).
   * Unset if no run has been scheduled yet.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Schedule.RunResponse last_scheduled_run_response = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastScheduledRunResponse.
   */
  com.google.cloud.aiplatform.v1beta1.Schedule.RunResponse getLastScheduledRunResponse();
  /**
   *
   *
   * <pre>
   * Output only. Response of the last scheduled run.
   * This is the response for starting the scheduled requests and not the
   * execution of the operations/jobs created by the requests (if applicable).
   * Unset if no run has been scheduled yet.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Schedule.RunResponse last_scheduled_run_response = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.Schedule.RunResponseOrBuilder
      getLastScheduledRunResponseOrBuilder();

  com.google.cloud.aiplatform.v1beta1.Schedule.TimeSpecificationCase getTimeSpecificationCase();

  com.google.cloud.aiplatform.v1beta1.Schedule.RequestCase getRequestCase();
}
