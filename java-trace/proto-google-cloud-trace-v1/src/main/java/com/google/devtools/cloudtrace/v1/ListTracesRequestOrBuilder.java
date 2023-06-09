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
// source: google/devtools/cloudtrace/v1/trace.proto

package com.google.devtools.cloudtrace.v1;

public interface ListTracesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v1.ListTracesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Type of data returned for traces in the list. Default is
   * `MINIMAL`.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudtrace.v1.ListTracesRequest.ViewType view = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * Optional. Type of data returned for traces in the list. Default is
   * `MINIMAL`.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudtrace.v1.ListTracesRequest.ViewType view = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The view.
   */
  com.google.devtools.cloudtrace.v1.ListTracesRequest.ViewType getView();

  /**
   *
   *
   * <pre>
   * Optional. Maximum number of traces to return. If not specified or &lt;= 0, the
   * implementation selects a reasonable value.  The implementation may
   * return fewer traces than the requested page size.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Token identifying the page of results to return. If provided, use the
   * value of the `next_page_token` field from a previous request.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Token identifying the page of results to return. If provided, use the
   * value of the `next_page_token` field from a previous request.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Start of the time interval (inclusive) during which the trace data was
   * collected from the application.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Start of the time interval (inclusive) during which the trace data was
   * collected from the application.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Start of the time interval (inclusive) during which the trace data was
   * collected from the application.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * End of the time interval (inclusive) during which the trace data was
   * collected from the application.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * End of the time interval (inclusive) during which the trace data was
   * collected from the application.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * End of the time interval (inclusive) during which the trace data was
   * collected from the application.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A filter against labels for the request.
   *
   * By default, searches use prefix matching. To specify exact match, prepend
   * a plus symbol (`+`) to the search term.
   * Multiple terms are ANDed. Syntax:
   *
   * *   `root:NAME_PREFIX` or `NAME_PREFIX`: Return traces where any root
   *     span starts with `NAME_PREFIX`.
   * *   `+root:NAME` or `+NAME`: Return traces where any root span's name is
   *     exactly `NAME`.
   * *   `span:NAME_PREFIX`: Return traces where any span starts with
   *     `NAME_PREFIX`.
   * *   `+span:NAME`: Return traces where any span's name is exactly
   *     `NAME`.
   * *   `latency:DURATION`: Return traces whose overall latency is
   *     greater or equal to than `DURATION`. Accepted units are nanoseconds
   *     (`ns`), milliseconds (`ms`), and seconds (`s`). Default is `ms`. For
   *     example, `latency:24ms` returns traces whose overall latency
   *     is greater than or equal to 24 milliseconds.
   * *   `label:LABEL_KEY`: Return all traces containing the specified
   *     label key (exact match, case-sensitive) regardless of the key:value
   *     pair's value (including empty values).
   * *   `LABEL_KEY:VALUE_PREFIX`: Return all traces containing the specified
   *     label key (exact match, case-sensitive) whose value starts with
   *     `VALUE_PREFIX`. Both a key and a value must be specified.
   * *   `+LABEL_KEY:VALUE`: Return all traces containing a key:value pair
   *     exactly matching the specified text. Both a key and a value must be
   *     specified.
   * *   `method:VALUE`: Equivalent to `/http/method:VALUE`.
   * *   `url:VALUE`: Equivalent to `/http/url:VALUE`.
   * </pre>
   *
   * <code>string filter = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. A filter against labels for the request.
   *
   * By default, searches use prefix matching. To specify exact match, prepend
   * a plus symbol (`+`) to the search term.
   * Multiple terms are ANDed. Syntax:
   *
   * *   `root:NAME_PREFIX` or `NAME_PREFIX`: Return traces where any root
   *     span starts with `NAME_PREFIX`.
   * *   `+root:NAME` or `+NAME`: Return traces where any root span's name is
   *     exactly `NAME`.
   * *   `span:NAME_PREFIX`: Return traces where any span starts with
   *     `NAME_PREFIX`.
   * *   `+span:NAME`: Return traces where any span's name is exactly
   *     `NAME`.
   * *   `latency:DURATION`: Return traces whose overall latency is
   *     greater or equal to than `DURATION`. Accepted units are nanoseconds
   *     (`ns`), milliseconds (`ms`), and seconds (`s`). Default is `ms`. For
   *     example, `latency:24ms` returns traces whose overall latency
   *     is greater than or equal to 24 milliseconds.
   * *   `label:LABEL_KEY`: Return all traces containing the specified
   *     label key (exact match, case-sensitive) regardless of the key:value
   *     pair's value (including empty values).
   * *   `LABEL_KEY:VALUE_PREFIX`: Return all traces containing the specified
   *     label key (exact match, case-sensitive) whose value starts with
   *     `VALUE_PREFIX`. Both a key and a value must be specified.
   * *   `+LABEL_KEY:VALUE`: Return all traces containing a key:value pair
   *     exactly matching the specified text. Both a key and a value must be
   *     specified.
   * *   `method:VALUE`: Equivalent to `/http/method:VALUE`.
   * *   `url:VALUE`: Equivalent to `/http/url:VALUE`.
   * </pre>
   *
   * <code>string filter = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Field used to sort the returned traces.
   * Can be one of the following:
   *
   * *   `trace_id`
   * *   `name` (`name` field of root span in the trace)
   * *   `duration` (difference between `end_time` and `start_time` fields of
   *      the root span)
   * *   `start` (`start_time` field of the root span)
   *
   * Descending order can be specified by appending `desc` to the sort field
   * (for example, `name desc`).
   *
   * Only one sort field is permitted.
   * </pre>
   *
   * <code>string order_by = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional. Field used to sort the returned traces.
   * Can be one of the following:
   *
   * *   `trace_id`
   * *   `name` (`name` field of root span in the trace)
   * *   `duration` (difference between `end_time` and `start_time` fields of
   *      the root span)
   * *   `start` (`start_time` field of the root span)
   *
   * Descending order can be specified by appending `desc` to the sort field
   * (for example, `name desc`).
   *
   * Only one sort field is permitted.
   * </pre>
   *
   * <code>string order_by = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
