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
// source: google/cloud/eventarc/v1/google_channel_config.proto

package com.google.cloud.eventarc.v1;

public interface GoogleChannelConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.GoogleChannelConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the config. Must be in the format of,
   * `projects/{project}/locations/{location}/googleChannelConfig`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the config. Must be in the format of,
   * `projects/{project}/locations/{location}/googleChannelConfig`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last-modified time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Resource name of a KMS crypto key (managed by the user) used to
   * encrypt/decrypt their event data.
   *
   * It must match the pattern
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
   * </pre>
   *
   * <code>
   * string crypto_key_name = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The cryptoKeyName.
   */
  java.lang.String getCryptoKeyName();
  /**
   *
   *
   * <pre>
   * Optional. Resource name of a KMS crypto key (managed by the user) used to
   * encrypt/decrypt their event data.
   *
   * It must match the pattern
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
   * </pre>
   *
   * <code>
   * string crypto_key_name = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for cryptoKeyName.
   */
  com.google.protobuf.ByteString getCryptoKeyNameBytes();
}
