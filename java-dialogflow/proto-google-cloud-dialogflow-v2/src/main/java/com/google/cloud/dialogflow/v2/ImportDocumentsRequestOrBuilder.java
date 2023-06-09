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
// source: google/cloud/dialogflow/v2/document.proto

package com.google.cloud.dialogflow.v2;

public interface ImportDocumentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.ImportDocumentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The knowledge base to import documents into.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The knowledge base to import documents into.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for the documents.
   * The path can include a wildcard.
   *
   * These URIs may have the forms
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * `gs://&lt;bucket-name&gt;/&lt;object-path&gt;/&#42;.&lt;extension&gt;`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsSources gcs_source = 2;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for the documents.
   * The path can include a wildcard.
   *
   * These URIs may have the forms
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * `gs://&lt;bucket-name&gt;/&lt;object-path&gt;/&#42;.&lt;extension&gt;`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsSources gcs_source = 2;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.dialogflow.v2.GcsSources getGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for the documents.
   * The path can include a wildcard.
   *
   * These URIs may have the forms
   * `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * `gs://&lt;bucket-name&gt;/&lt;object-path&gt;/&#42;.&lt;extension&gt;`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.GcsSources gcs_source = 2;</code>
   */
  com.google.cloud.dialogflow.v2.GcsSourcesOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Document template used for importing all the documents.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ImportDocumentTemplate document_template = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the documentTemplate field is set.
   */
  boolean hasDocumentTemplate();
  /**
   *
   *
   * <pre>
   * Required. Document template used for importing all the documents.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ImportDocumentTemplate document_template = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The documentTemplate.
   */
  com.google.cloud.dialogflow.v2.ImportDocumentTemplate getDocumentTemplate();
  /**
   *
   *
   * <pre>
   * Required. Document template used for importing all the documents.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.ImportDocumentTemplate document_template = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.ImportDocumentTemplateOrBuilder getDocumentTemplateOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether to import custom metadata from Google Cloud Storage.
   * Only valid when the document source is Google Cloud Storage URI.
   * </pre>
   *
   * <code>bool import_gcs_custom_metadata = 4;</code>
   *
   * @return The importGcsCustomMetadata.
   */
  boolean getImportGcsCustomMetadata();

  com.google.cloud.dialogflow.v2.ImportDocumentsRequest.SourceCase getSourceCase();
}
