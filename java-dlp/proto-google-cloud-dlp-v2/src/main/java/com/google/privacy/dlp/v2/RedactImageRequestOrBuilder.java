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

public interface RedactImageRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.RedactImageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Parent resource name.
   *
   * The format of this value varies depending on whether you have [specified a
   * processing
   * location](https://cloud.google.com/dlp/docs/specifying-location):
   *
   * + Projects scope, location specified:&lt;br/&gt;
   *   `projects/`&lt;var&gt;PROJECT_ID&lt;/var&gt;`/locations/`&lt;var&gt;LOCATION_ID&lt;/var&gt;
   * + Projects scope, no location specified (defaults to global):&lt;br/&gt;
   *   `projects/`&lt;var&gt;PROJECT_ID&lt;/var&gt;
   *
   * The following example `parent` string specifies a parent project with the
   * identifier `example-project`, and specifies the `europe-west3` location
   * for processing data:
   *
   *     parent=projects/example-project/locations/europe-west3
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Parent resource name.
   *
   * The format of this value varies depending on whether you have [specified a
   * processing
   * location](https://cloud.google.com/dlp/docs/specifying-location):
   *
   * + Projects scope, location specified:&lt;br/&gt;
   *   `projects/`&lt;var&gt;PROJECT_ID&lt;/var&gt;`/locations/`&lt;var&gt;LOCATION_ID&lt;/var&gt;
   * + Projects scope, no location specified (defaults to global):&lt;br/&gt;
   *   `projects/`&lt;var&gt;PROJECT_ID&lt;/var&gt;
   *
   * The following example `parent` string specifies a parent project with the
   * identifier `example-project`, and specifies the `europe-west3` location
   * for processing data:
   *
   *     parent=projects/example-project/locations/europe-west3
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>string location_id = 8;</code>
   *
   * @return The locationId.
   */
  java.lang.String getLocationId();
  /**
   *
   *
   * <pre>
   * Deprecated. This field has no effect.
   * </pre>
   *
   * <code>string location_id = 8;</code>
   *
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString getLocationIdBytes();

  /**
   *
   *
   * <pre>
   * Configuration for the inspector.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   *
   * @return Whether the inspectConfig field is set.
   */
  boolean hasInspectConfig();
  /**
   *
   *
   * <pre>
   * Configuration for the inspector.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   *
   * @return The inspectConfig.
   */
  com.google.privacy.dlp.v2.InspectConfig getInspectConfig();
  /**
   *
   *
   * <pre>
   * Configuration for the inspector.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   */
  com.google.privacy.dlp.v2.InspectConfigOrBuilder getInspectConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The configuration for specifying what content to redact from images.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfig image_redaction_configs = 5;
   * </code>
   */
  java.util.List<com.google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfig>
      getImageRedactionConfigsList();
  /**
   *
   *
   * <pre>
   * The configuration for specifying what content to redact from images.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfig image_redaction_configs = 5;
   * </code>
   */
  com.google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfig getImageRedactionConfigs(
      int index);
  /**
   *
   *
   * <pre>
   * The configuration for specifying what content to redact from images.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfig image_redaction_configs = 5;
   * </code>
   */
  int getImageRedactionConfigsCount();
  /**
   *
   *
   * <pre>
   * The configuration for specifying what content to redact from images.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfig image_redaction_configs = 5;
   * </code>
   */
  java.util.List<
          ? extends com.google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfigOrBuilder>
      getImageRedactionConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The configuration for specifying what content to redact from images.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfig image_redaction_configs = 5;
   * </code>
   */
  com.google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfigOrBuilder
      getImageRedactionConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Whether the response should include findings along with the redacted
   * image.
   * </pre>
   *
   * <code>bool include_findings = 6;</code>
   *
   * @return The includeFindings.
   */
  boolean getIncludeFindings();

  /**
   *
   *
   * <pre>
   * The content must be PNG, JPEG, SVG or BMP.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ByteContentItem byte_item = 7;</code>
   *
   * @return Whether the byteItem field is set.
   */
  boolean hasByteItem();
  /**
   *
   *
   * <pre>
   * The content must be PNG, JPEG, SVG or BMP.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ByteContentItem byte_item = 7;</code>
   *
   * @return The byteItem.
   */
  com.google.privacy.dlp.v2.ByteContentItem getByteItem();
  /**
   *
   *
   * <pre>
   * The content must be PNG, JPEG, SVG or BMP.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ByteContentItem byte_item = 7;</code>
   */
  com.google.privacy.dlp.v2.ByteContentItemOrBuilder getByteItemOrBuilder();
}
