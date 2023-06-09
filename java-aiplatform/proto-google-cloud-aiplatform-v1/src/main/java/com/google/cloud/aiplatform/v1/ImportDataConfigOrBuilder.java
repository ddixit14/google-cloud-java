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
// source: google/cloud/aiplatform/v1/dataset.proto

package com.google.cloud.aiplatform.v1;

public interface ImportDataConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ImportDataConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.aiplatform.v1.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.aiplatform.v1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels that will be applied to newly imported DataItems. If an identical
   * DataItem as one being imported already exists in the Dataset, then these
   * labels will be appended to these of the already existing one, and if labels
   * with identical key is imported before, the old label value will be
   * overwritten. If two DataItems are identical in the same import data
   * operation, the labels will be combined and if key collision happens in this
   * case, one of the values will be picked randomly. Two DataItems are
   * considered identical if their content bytes are identical (e.g. image bytes
   * or pdf bytes).
   * These labels will be overridden by Annotation labels specified inside index
   * file referenced by
   * [import_schema_uri][google.cloud.aiplatform.v1.ImportDataConfig.import_schema_uri],
   * e.g. jsonl file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; data_item_labels = 2;</code>
   */
  int getDataItemLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels that will be applied to newly imported DataItems. If an identical
   * DataItem as one being imported already exists in the Dataset, then these
   * labels will be appended to these of the already existing one, and if labels
   * with identical key is imported before, the old label value will be
   * overwritten. If two DataItems are identical in the same import data
   * operation, the labels will be combined and if key collision happens in this
   * case, one of the values will be picked randomly. Two DataItems are
   * considered identical if their content bytes are identical (e.g. image bytes
   * or pdf bytes).
   * These labels will be overridden by Annotation labels specified inside index
   * file referenced by
   * [import_schema_uri][google.cloud.aiplatform.v1.ImportDataConfig.import_schema_uri],
   * e.g. jsonl file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; data_item_labels = 2;</code>
   */
  boolean containsDataItemLabels(java.lang.String key);
  /** Use {@link #getDataItemLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getDataItemLabels();
  /**
   *
   *
   * <pre>
   * Labels that will be applied to newly imported DataItems. If an identical
   * DataItem as one being imported already exists in the Dataset, then these
   * labels will be appended to these of the already existing one, and if labels
   * with identical key is imported before, the old label value will be
   * overwritten. If two DataItems are identical in the same import data
   * operation, the labels will be combined and if key collision happens in this
   * case, one of the values will be picked randomly. Two DataItems are
   * considered identical if their content bytes are identical (e.g. image bytes
   * or pdf bytes).
   * These labels will be overridden by Annotation labels specified inside index
   * file referenced by
   * [import_schema_uri][google.cloud.aiplatform.v1.ImportDataConfig.import_schema_uri],
   * e.g. jsonl file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; data_item_labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getDataItemLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels that will be applied to newly imported DataItems. If an identical
   * DataItem as one being imported already exists in the Dataset, then these
   * labels will be appended to these of the already existing one, and if labels
   * with identical key is imported before, the old label value will be
   * overwritten. If two DataItems are identical in the same import data
   * operation, the labels will be combined and if key collision happens in this
   * case, one of the values will be picked randomly. Two DataItems are
   * considered identical if their content bytes are identical (e.g. image bytes
   * or pdf bytes).
   * These labels will be overridden by Annotation labels specified inside index
   * file referenced by
   * [import_schema_uri][google.cloud.aiplatform.v1.ImportDataConfig.import_schema_uri],
   * e.g. jsonl file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; data_item_labels = 2;</code>
   */
  /* nullable */
  java.lang.String getDataItemLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels that will be applied to newly imported DataItems. If an identical
   * DataItem as one being imported already exists in the Dataset, then these
   * labels will be appended to these of the already existing one, and if labels
   * with identical key is imported before, the old label value will be
   * overwritten. If two DataItems are identical in the same import data
   * operation, the labels will be combined and if key collision happens in this
   * case, one of the values will be picked randomly. Two DataItems are
   * considered identical if their content bytes are identical (e.g. image bytes
   * or pdf bytes).
   * These labels will be overridden by Annotation labels specified inside index
   * file referenced by
   * [import_schema_uri][google.cloud.aiplatform.v1.ImportDataConfig.import_schema_uri],
   * e.g. jsonl file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; data_item_labels = 2;</code>
   */
  java.lang.String getDataItemLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Labels that will be applied to newly imported Annotations. If two
   * Annotations are identical, one of them will be deduped. Two Annotations are
   * considered identical if their
   * [payload][google.cloud.aiplatform.v1.Annotation.payload],
   * [payload_schema_uri][google.cloud.aiplatform.v1.Annotation.payload_schema_uri]
   * and all of their [labels][google.cloud.aiplatform.v1.Annotation.labels] are
   * the same. These labels will be overridden by Annotation labels specified
   * inside index file referenced by
   * [import_schema_uri][google.cloud.aiplatform.v1.ImportDataConfig.import_schema_uri],
   * e.g. jsonl file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotation_labels = 3;</code>
   */
  int getAnnotationLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels that will be applied to newly imported Annotations. If two
   * Annotations are identical, one of them will be deduped. Two Annotations are
   * considered identical if their
   * [payload][google.cloud.aiplatform.v1.Annotation.payload],
   * [payload_schema_uri][google.cloud.aiplatform.v1.Annotation.payload_schema_uri]
   * and all of their [labels][google.cloud.aiplatform.v1.Annotation.labels] are
   * the same. These labels will be overridden by Annotation labels specified
   * inside index file referenced by
   * [import_schema_uri][google.cloud.aiplatform.v1.ImportDataConfig.import_schema_uri],
   * e.g. jsonl file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotation_labels = 3;</code>
   */
  boolean containsAnnotationLabels(java.lang.String key);
  /** Use {@link #getAnnotationLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotationLabels();
  /**
   *
   *
   * <pre>
   * Labels that will be applied to newly imported Annotations. If two
   * Annotations are identical, one of them will be deduped. Two Annotations are
   * considered identical if their
   * [payload][google.cloud.aiplatform.v1.Annotation.payload],
   * [payload_schema_uri][google.cloud.aiplatform.v1.Annotation.payload_schema_uri]
   * and all of their [labels][google.cloud.aiplatform.v1.Annotation.labels] are
   * the same. These labels will be overridden by Annotation labels specified
   * inside index file referenced by
   * [import_schema_uri][google.cloud.aiplatform.v1.ImportDataConfig.import_schema_uri],
   * e.g. jsonl file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotation_labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels that will be applied to newly imported Annotations. If two
   * Annotations are identical, one of them will be deduped. Two Annotations are
   * considered identical if their
   * [payload][google.cloud.aiplatform.v1.Annotation.payload],
   * [payload_schema_uri][google.cloud.aiplatform.v1.Annotation.payload_schema_uri]
   * and all of their [labels][google.cloud.aiplatform.v1.Annotation.labels] are
   * the same. These labels will be overridden by Annotation labels specified
   * inside index file referenced by
   * [import_schema_uri][google.cloud.aiplatform.v1.ImportDataConfig.import_schema_uri],
   * e.g. jsonl file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotation_labels = 3;</code>
   */
  /* nullable */
  java.lang.String getAnnotationLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels that will be applied to newly imported Annotations. If two
   * Annotations are identical, one of them will be deduped. Two Annotations are
   * considered identical if their
   * [payload][google.cloud.aiplatform.v1.Annotation.payload],
   * [payload_schema_uri][google.cloud.aiplatform.v1.Annotation.payload_schema_uri]
   * and all of their [labels][google.cloud.aiplatform.v1.Annotation.labels] are
   * the same. These labels will be overridden by Annotation labels specified
   * inside index file referenced by
   * [import_schema_uri][google.cloud.aiplatform.v1.ImportDataConfig.import_schema_uri],
   * e.g. jsonl file.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotation_labels = 3;</code>
   */
  java.lang.String getAnnotationLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Points to a YAML file stored on Google Cloud Storage describing
   * the import format. Validation will be done against the schema. The schema
   * is defined as an [OpenAPI 3.0.2 Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * </pre>
   *
   * <code>string import_schema_uri = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The importSchemaUri.
   */
  java.lang.String getImportSchemaUri();
  /**
   *
   *
   * <pre>
   * Required. Points to a YAML file stored on Google Cloud Storage describing
   * the import format. Validation will be done against the schema. The schema
   * is defined as an [OpenAPI 3.0.2 Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * </pre>
   *
   * <code>string import_schema_uri = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for importSchemaUri.
   */
  com.google.protobuf.ByteString getImportSchemaUriBytes();

  com.google.cloud.aiplatform.v1.ImportDataConfig.SourceCase getSourceCase();
}
