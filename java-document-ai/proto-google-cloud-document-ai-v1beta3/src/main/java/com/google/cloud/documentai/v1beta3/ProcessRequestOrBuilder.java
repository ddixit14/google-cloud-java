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
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

public interface ProcessRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.ProcessRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document inline_document = 4;</code>
   *
   * @return Whether the inlineDocument field is set.
   */
  boolean hasInlineDocument();
  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document inline_document = 4;</code>
   *
   * @return The inlineDocument.
   */
  com.google.cloud.documentai.v1beta3.Document getInlineDocument();
  /**
   *
   *
   * <pre>
   * An inline document proto.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document inline_document = 4;</code>
   */
  com.google.cloud.documentai.v1beta3.DocumentOrBuilder getInlineDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * A raw document content (bytes).
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.RawDocument raw_document = 5;</code>
   *
   * @return Whether the rawDocument field is set.
   */
  boolean hasRawDocument();
  /**
   *
   *
   * <pre>
   * A raw document content (bytes).
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.RawDocument raw_document = 5;</code>
   *
   * @return The rawDocument.
   */
  com.google.cloud.documentai.v1beta3.RawDocument getRawDocument();
  /**
   *
   *
   * <pre>
   * A raw document content (bytes).
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.RawDocument raw_document = 5;</code>
   */
  com.google.cloud.documentai.v1beta3.RawDocumentOrBuilder getRawDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [Processor][google.cloud.documentai.v1beta3.Processor] or
   * [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion]
   * to use for processing. If a
   * [Processor][google.cloud.documentai.v1beta3.Processor] is specified, the
   * server will use its [default
   * version][google.cloud.documentai.v1beta3.Processor.default_processor_version].
   * Format: `projects/{project}/locations/{location}/processors/{processor}`,
   * or
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [Processor][google.cloud.documentai.v1beta3.Processor] or
   * [ProcessorVersion][google.cloud.documentai.v1beta3.ProcessorVersion]
   * to use for processing. If a
   * [Processor][google.cloud.documentai.v1beta3.Processor] is specified, the
   * server will use its [default
   * version][google.cloud.documentai.v1beta3.Processor.default_processor_version].
   * Format: `projects/{project}/locations/{location}/processors/{processor}`,
   * or
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The document payload, the [content] and [mime_type] fields must be set.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document document = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.documentai.v1beta3.ProcessRequest.document is deprecated. See
   *     google/cloud/documentai/v1beta3/document_processor_service.proto;l=373
   * @return Whether the document field is set.
   */
  @java.lang.Deprecated
  boolean hasDocument();
  /**
   *
   *
   * <pre>
   * The document payload, the [content] and [mime_type] fields must be set.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document document = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.documentai.v1beta3.ProcessRequest.document is deprecated. See
   *     google/cloud/documentai/v1beta3/document_processor_service.proto;l=373
   * @return The document.
   */
  @java.lang.Deprecated
  com.google.cloud.documentai.v1beta3.Document getDocument();
  /**
   *
   *
   * <pre>
   * The document payload, the [content] and [mime_type] fields must be set.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document document = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.cloud.documentai.v1beta3.DocumentOrBuilder getDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether Human Review feature should be skipped for this request. Default to
   * false.
   * </pre>
   *
   * <code>bool skip_human_review = 3;</code>
   *
   * @return The skipHumanReview.
   */
  boolean getSkipHumanReview();

  /**
   *
   *
   * <pre>
   * Specifies which fields to include in ProcessResponse's document.
   * Only supports top level document and pages field so it must be in the form
   * of `{document_field_name}` or `pages.{page_field_name}`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 6;</code>
   *
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   *
   *
   * <pre>
   * Specifies which fields to include in ProcessResponse's document.
   * Only supports top level document and pages field so it must be in the form
   * of `{document_field_name}` or `pages.{page_field_name}`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 6;</code>
   *
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   *
   *
   * <pre>
   * Specifies which fields to include in ProcessResponse's document.
   * Only supports top level document and pages field so it must be in the form
   * of `{document_field_name}` or `pages.{page_field_name}`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 6;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Inference-time options for the process API
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ProcessOptions process_options = 7;</code>
   *
   * @return Whether the processOptions field is set.
   */
  boolean hasProcessOptions();
  /**
   *
   *
   * <pre>
   * Inference-time options for the process API
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ProcessOptions process_options = 7;</code>
   *
   * @return The processOptions.
   */
  com.google.cloud.documentai.v1beta3.ProcessOptions getProcessOptions();
  /**
   *
   *
   * <pre>
   * Inference-time options for the process API
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.ProcessOptions process_options = 7;</code>
   */
  com.google.cloud.documentai.v1beta3.ProcessOptionsOrBuilder getProcessOptionsOrBuilder();

  com.google.cloud.documentai.v1beta3.ProcessRequest.SourceCase getSourceCase();
}
