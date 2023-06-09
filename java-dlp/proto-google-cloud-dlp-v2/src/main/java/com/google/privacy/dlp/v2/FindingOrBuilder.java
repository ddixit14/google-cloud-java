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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface FindingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.Finding)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name in format
   * projects/{project}/locations/{location}/findings/{finding} Populated only
   * when viewing persisted findings.
   * </pre>
   *
   * <code>string name = 14;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Resource name in format
   * projects/{project}/locations/{location}/findings/{finding} Populated only
   * when viewing persisted findings.
   * </pre>
   *
   * <code>string name = 14;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The content that was found. Even if the content is not textual, it
   * may be converted to a textual representation here.
   * Provided if `include_quote` is true and the finding is
   * less than or equal to 4096 bytes long. If the finding exceeds 4096 bytes
   * in length, the quote may be omitted.
   * </pre>
   *
   * <code>string quote = 1;</code>
   *
   * @return The quote.
   */
  java.lang.String getQuote();
  /**
   *
   *
   * <pre>
   * The content that was found. Even if the content is not textual, it
   * may be converted to a textual representation here.
   * Provided if `include_quote` is true and the finding is
   * less than or equal to 4096 bytes long. If the finding exceeds 4096 bytes
   * in length, the quote may be omitted.
   * </pre>
   *
   * <code>string quote = 1;</code>
   *
   * @return The bytes for quote.
   */
  com.google.protobuf.ByteString getQuoteBytes();

  /**
   *
   *
   * <pre>
   * The type of content that might have been found.
   * Provided if `excluded_types` is false.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 2;</code>
   *
   * @return Whether the infoType field is set.
   */
  boolean hasInfoType();
  /**
   *
   *
   * <pre>
   * The type of content that might have been found.
   * Provided if `excluded_types` is false.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 2;</code>
   *
   * @return The infoType.
   */
  com.google.privacy.dlp.v2.InfoType getInfoType();
  /**
   *
   *
   * <pre>
   * The type of content that might have been found.
   * Provided if `excluded_types` is false.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 2;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Confidence of how likely it is that the `info_type` is correct.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Likelihood likelihood = 3;</code>
   *
   * @return The enum numeric value on the wire for likelihood.
   */
  int getLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Confidence of how likely it is that the `info_type` is correct.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Likelihood likelihood = 3;</code>
   *
   * @return The likelihood.
   */
  com.google.privacy.dlp.v2.Likelihood getLikelihood();

  /**
   *
   *
   * <pre>
   * Where the content was found.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Location location = 4;</code>
   *
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   *
   *
   * <pre>
   * Where the content was found.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Location location = 4;</code>
   *
   * @return The location.
   */
  com.google.privacy.dlp.v2.Location getLocation();
  /**
   *
   *
   * <pre>
   * Where the content was found.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Location location = 4;</code>
   */
  com.google.privacy.dlp.v2.LocationOrBuilder getLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * Timestamp when finding was detected.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Timestamp when finding was detected.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Timestamp when finding was detected.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Contains data parsed from quotes. Only populated if include_quote was set
   * to true and a supported infoType was requested. Currently supported
   * infoTypes: DATE, DATE_OF_BIRTH and TIME.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.QuoteInfo quote_info = 7;</code>
   *
   * @return Whether the quoteInfo field is set.
   */
  boolean hasQuoteInfo();
  /**
   *
   *
   * <pre>
   * Contains data parsed from quotes. Only populated if include_quote was set
   * to true and a supported infoType was requested. Currently supported
   * infoTypes: DATE, DATE_OF_BIRTH and TIME.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.QuoteInfo quote_info = 7;</code>
   *
   * @return The quoteInfo.
   */
  com.google.privacy.dlp.v2.QuoteInfo getQuoteInfo();
  /**
   *
   *
   * <pre>
   * Contains data parsed from quotes. Only populated if include_quote was set
   * to true and a supported infoType was requested. Currently supported
   * infoTypes: DATE, DATE_OF_BIRTH and TIME.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.QuoteInfo quote_info = 7;</code>
   */
  com.google.privacy.dlp.v2.QuoteInfoOrBuilder getQuoteInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * The job that stored the finding.
   * </pre>
   *
   * <code>string resource_name = 8 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   *
   *
   * <pre>
   * The job that stored the finding.
   * </pre>
   *
   * <code>string resource_name = 8 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString getResourceNameBytes();

  /**
   *
   *
   * <pre>
   * Job trigger name, if applicable, for this finding.
   * </pre>
   *
   * <code>string trigger_name = 9 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The triggerName.
   */
  java.lang.String getTriggerName();
  /**
   *
   *
   * <pre>
   * Job trigger name, if applicable, for this finding.
   * </pre>
   *
   * <code>string trigger_name = 9 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for triggerName.
   */
  com.google.protobuf.ByteString getTriggerNameBytes();

  /**
   *
   *
   * <pre>
   * The labels associated with this `Finding`.
   *
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   *
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   *
   * No more than 10 labels can be associated with a given finding.
   *
   * Examples:
   * * `"environment" : "production"`
   * * `"pipeline" : "etl"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels associated with this `Finding`.
   *
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   *
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   *
   * No more than 10 labels can be associated with a given finding.
   *
   * Examples:
   * * `"environment" : "production"`
   * * `"pipeline" : "etl"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels associated with this `Finding`.
   *
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   *
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   *
   * No more than 10 labels can be associated with a given finding.
   *
   * Examples:
   * * `"environment" : "production"`
   * * `"pipeline" : "etl"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels associated with this `Finding`.
   *
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   *
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   *
   * No more than 10 labels can be associated with a given finding.
   *
   * Examples:
   * * `"environment" : "production"`
   * * `"pipeline" : "etl"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
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
   * The labels associated with this `Finding`.
   *
   * Label keys must be between 1 and 63 characters long and must conform
   * to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
   *
   * Label values must be between 0 and 63 characters long and must conform
   * to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
   *
   * No more than 10 labels can be associated with a given finding.
   *
   * Examples:
   * * `"environment" : "production"`
   * * `"pipeline" : "etl"`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Time the job started that produced this finding.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp job_create_time = 11;</code>
   *
   * @return Whether the jobCreateTime field is set.
   */
  boolean hasJobCreateTime();
  /**
   *
   *
   * <pre>
   * Time the job started that produced this finding.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp job_create_time = 11;</code>
   *
   * @return The jobCreateTime.
   */
  com.google.protobuf.Timestamp getJobCreateTime();
  /**
   *
   *
   * <pre>
   * Time the job started that produced this finding.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp job_create_time = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getJobCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The job that stored the finding.
   * </pre>
   *
   * <code>string job_name = 13 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The jobName.
   */
  java.lang.String getJobName();
  /**
   *
   *
   * <pre>
   * The job that stored the finding.
   * </pre>
   *
   * <code>string job_name = 13 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for jobName.
   */
  com.google.protobuf.ByteString getJobNameBytes();

  /**
   *
   *
   * <pre>
   * The unique finding id.
   * </pre>
   *
   * <code>string finding_id = 15;</code>
   *
   * @return The findingId.
   */
  java.lang.String getFindingId();
  /**
   *
   *
   * <pre>
   * The unique finding id.
   * </pre>
   *
   * <code>string finding_id = 15;</code>
   *
   * @return The bytes for findingId.
   */
  com.google.protobuf.ByteString getFindingIdBytes();
}
