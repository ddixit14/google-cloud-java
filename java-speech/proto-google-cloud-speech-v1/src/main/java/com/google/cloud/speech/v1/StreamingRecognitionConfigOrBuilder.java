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
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface StreamingRecognitionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.StreamingRecognitionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * Required. Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The config.
   */
  com.google.cloud.speech.v1.RecognitionConfig getConfig();
  /**
   *
   *
   * <pre>
   * Required. Provides information to the recognizer that specifies how to
   * process the request.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.RecognitionConfig config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.speech.v1.RecognitionConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * If `false` or omitted, the recognizer will perform continuous
   * recognition (continuing to wait for and process audio even if the user
   * pauses speaking) until the client closes the input stream (gRPC API) or
   * until the maximum time limit has been reached. May return multiple
   * `StreamingRecognitionResult`s with the `is_final` flag set to `true`.
   *
   * If `true`, the recognizer will detect a single spoken utterance. When it
   * detects that the user has paused or stopped speaking, it will return an
   * `END_OF_SINGLE_UTTERANCE` event and cease recognition. It will return no
   * more than one `StreamingRecognitionResult` with the `is_final` flag set to
   * `true`.
   *
   * The `single_utterance` field can only be used with specified models,
   * otherwise an error is thrown. The `model` field in [`RecognitionConfig`][]
   * must be set to:
   *
   * * `command_and_search`
   * * `phone_call` AND additional field `useEnhanced`=`true`
   * * The `model` field is left undefined. In this case the API auto-selects
   *   a model based on any other parameters that you set in
   *   `RecognitionConfig`.
   * </pre>
   *
   * <code>bool single_utterance = 2;</code>
   *
   * @return The singleUtterance.
   */
  boolean getSingleUtterance();

  /**
   *
   *
   * <pre>
   * If `true`, interim results (tentative hypotheses) may be
   * returned as they become available (these interim results are indicated with
   * the `is_final=false` flag).
   * If `false` or omitted, only `is_final=true` result(s) are returned.
   * </pre>
   *
   * <code>bool interim_results = 3;</code>
   *
   * @return The interimResults.
   */
  boolean getInterimResults();

  /**
   *
   *
   * <pre>
   * If `true`, responses with voice activity speech events will be returned as
   * they are detected.
   * </pre>
   *
   * <code>bool enable_voice_activity_events = 5;</code>
   *
   * @return The enableVoiceActivityEvents.
   */
  boolean getEnableVoiceActivityEvents();

  /**
   *
   *
   * <pre>
   * If set, the server will automatically close the stream after the specified
   * duration has elapsed after the last VOICE_ACTIVITY speech event has been
   * sent. The field `voice_activity_events` must also be set to true.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.StreamingRecognitionConfig.VoiceActivityTimeout voice_activity_timeout = 6;
   * </code>
   *
   * @return Whether the voiceActivityTimeout field is set.
   */
  boolean hasVoiceActivityTimeout();
  /**
   *
   *
   * <pre>
   * If set, the server will automatically close the stream after the specified
   * duration has elapsed after the last VOICE_ACTIVITY speech event has been
   * sent. The field `voice_activity_events` must also be set to true.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.StreamingRecognitionConfig.VoiceActivityTimeout voice_activity_timeout = 6;
   * </code>
   *
   * @return The voiceActivityTimeout.
   */
  com.google.cloud.speech.v1.StreamingRecognitionConfig.VoiceActivityTimeout
      getVoiceActivityTimeout();
  /**
   *
   *
   * <pre>
   * If set, the server will automatically close the stream after the specified
   * duration has elapsed after the last VOICE_ACTIVITY speech event has been
   * sent. The field `voice_activity_events` must also be set to true.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1.StreamingRecognitionConfig.VoiceActivityTimeout voice_activity_timeout = 6;
   * </code>
   */
  com.google.cloud.speech.v1.StreamingRecognitionConfig.VoiceActivityTimeoutOrBuilder
      getVoiceActivityTimeoutOrBuilder();
}
