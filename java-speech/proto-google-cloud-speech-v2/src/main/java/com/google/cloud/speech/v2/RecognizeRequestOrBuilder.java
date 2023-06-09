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
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface RecognizeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.RecognizeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Recognizer to use during recognition. The
   * expected format is
   * `projects/{project}/locations/{location}/recognizers/{recognizer}`.
   * </pre>
   *
   * <code>
   * string recognizer = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The recognizer.
   */
  java.lang.String getRecognizer();
  /**
   *
   *
   * <pre>
   * Required. The name of the Recognizer to use during recognition. The
   * expected format is
   * `projects/{project}/locations/{location}/recognizers/{recognizer}`.
   * </pre>
   *
   * <code>
   * string recognizer = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for recognizer.
   */
  com.google.protobuf.ByteString getRecognizerBytes();

  /**
   *
   *
   * <pre>
   * Features and audio metadata to use for the Automatic Speech Recognition.
   * This field in combination with the
   * [config_mask][google.cloud.speech.v2.RecognizeRequest.config_mask] field
   * can be used to override parts of the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the Recognizer resource.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionConfig config = 1;</code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * Features and audio metadata to use for the Automatic Speech Recognition.
   * This field in combination with the
   * [config_mask][google.cloud.speech.v2.RecognizeRequest.config_mask] field
   * can be used to override parts of the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the Recognizer resource.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionConfig config = 1;</code>
   *
   * @return The config.
   */
  com.google.cloud.speech.v2.RecognitionConfig getConfig();
  /**
   *
   *
   * <pre>
   * Features and audio metadata to use for the Automatic Speech Recognition.
   * This field in combination with the
   * [config_mask][google.cloud.speech.v2.RecognizeRequest.config_mask] field
   * can be used to override parts of the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the Recognizer resource.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.RecognitionConfig config = 1;</code>
   */
  com.google.cloud.speech.v2.RecognitionConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields in
   * [config][google.cloud.speech.v2.RecognizeRequest.config] that override the
   * values in the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the recognizer during this recognition request. If no mask is provided,
   * all non-default valued fields in
   * [config][google.cloud.speech.v2.RecognizeRequest.config] override the
   * values in the recognizer for this recognition request. If a mask is
   * provided, only the fields listed in the mask override the config in the
   * recognizer for this recognition request. If a wildcard (`*`) is provided,
   * [config][google.cloud.speech.v2.RecognizeRequest.config] completely
   * overrides and replaces the config in the recognizer for this recognition
   * request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask config_mask = 8;</code>
   *
   * @return Whether the configMask field is set.
   */
  boolean hasConfigMask();
  /**
   *
   *
   * <pre>
   * The list of fields in
   * [config][google.cloud.speech.v2.RecognizeRequest.config] that override the
   * values in the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the recognizer during this recognition request. If no mask is provided,
   * all non-default valued fields in
   * [config][google.cloud.speech.v2.RecognizeRequest.config] override the
   * values in the recognizer for this recognition request. If a mask is
   * provided, only the fields listed in the mask override the config in the
   * recognizer for this recognition request. If a wildcard (`*`) is provided,
   * [config][google.cloud.speech.v2.RecognizeRequest.config] completely
   * overrides and replaces the config in the recognizer for this recognition
   * request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask config_mask = 8;</code>
   *
   * @return The configMask.
   */
  com.google.protobuf.FieldMask getConfigMask();
  /**
   *
   *
   * <pre>
   * The list of fields in
   * [config][google.cloud.speech.v2.RecognizeRequest.config] that override the
   * values in the
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config]
   * of the recognizer during this recognition request. If no mask is provided,
   * all non-default valued fields in
   * [config][google.cloud.speech.v2.RecognizeRequest.config] override the
   * values in the recognizer for this recognition request. If a mask is
   * provided, only the fields listed in the mask override the config in the
   * recognizer for this recognition request. If a wildcard (`*`) is provided,
   * [config][google.cloud.speech.v2.RecognizeRequest.config] completely
   * overrides and replaces the config in the recognizer for this recognition
   * request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask config_mask = 8;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getConfigMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * The audio data bytes encoded as specified in
   * [RecognitionConfig][google.cloud.speech.v2.RecognitionConfig]. As
   * with all bytes fields, proto buffers use a pure binary representation,
   * whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes content = 5;</code>
   *
   * @return Whether the content field is set.
   */
  boolean hasContent();
  /**
   *
   *
   * <pre>
   * The audio data bytes encoded as specified in
   * [RecognitionConfig][google.cloud.speech.v2.RecognitionConfig]. As
   * with all bytes fields, proto buffers use a pure binary representation,
   * whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes content = 5;</code>
   *
   * @return The content.
   */
  com.google.protobuf.ByteString getContent();

  /**
   *
   *
   * <pre>
   * URI that points to a file that contains audio data bytes as specified in
   * [RecognitionConfig][google.cloud.speech.v2.RecognitionConfig]. The file
   * must not be compressed (for example, gzip). Currently, only Google Cloud
   * Storage URIs are supported, which must be specified in the following
   * format: `gs://bucket_name/object_name` (other URI formats return
   * [INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]). For more
   * information, see [Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris).
   * </pre>
   *
   * <code>string uri = 6;</code>
   *
   * @return Whether the uri field is set.
   */
  boolean hasUri();
  /**
   *
   *
   * <pre>
   * URI that points to a file that contains audio data bytes as specified in
   * [RecognitionConfig][google.cloud.speech.v2.RecognitionConfig]. The file
   * must not be compressed (for example, gzip). Currently, only Google Cloud
   * Storage URIs are supported, which must be specified in the following
   * format: `gs://bucket_name/object_name` (other URI formats return
   * [INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]). For more
   * information, see [Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris).
   * </pre>
   *
   * <code>string uri = 6;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * URI that points to a file that contains audio data bytes as specified in
   * [RecognitionConfig][google.cloud.speech.v2.RecognitionConfig]. The file
   * must not be compressed (for example, gzip). Currently, only Google Cloud
   * Storage URIs are supported, which must be specified in the following
   * format: `gs://bucket_name/object_name` (other URI formats return
   * [INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]). For more
   * information, see [Request
   * URIs](https://cloud.google.com/storage/docs/reference-uris).
   * </pre>
   *
   * <code>string uri = 6;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  com.google.cloud.speech.v2.RecognizeRequest.AudioSourceCase getAudioSourceCase();
}
