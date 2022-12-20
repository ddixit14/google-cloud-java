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
// source: google/cloud/dataplex/v1/metadata.proto

package com.google.cloud.dataplex.v1;

public interface StorageFormatOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.StorageFormat)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The data format associated with the stored data, which
   * represents content type values. The value is inferred from mime type.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat.Format format = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for format.
   */
  int getFormatValue();
  /**
   *
   *
   * <pre>
   * Output only. The data format associated with the stored data, which
   * represents content type values. The value is inferred from mime type.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat.Format format = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The format.
   */
  com.google.cloud.dataplex.v1.StorageFormat.Format getFormat();

  /**
   *
   *
   * <pre>
   * Optional. The compression type associated with the stored data.
   * If unspecified, the data is uncompressed.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat.CompressionFormat compression_format = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for compressionFormat.
   */
  int getCompressionFormatValue();
  /**
   *
   *
   * <pre>
   * Optional. The compression type associated with the stored data.
   * If unspecified, the data is uncompressed.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat.CompressionFormat compression_format = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The compressionFormat.
   */
  com.google.cloud.dataplex.v1.StorageFormat.CompressionFormat getCompressionFormat();

  /**
   *
   *
   * <pre>
   * Required. The mime type descriptor for the data. Must match the pattern
   * {type}/{subtype}. Supported values:
   * - application/x-parquet
   * - application/x-avro
   * - application/x-orc
   * - application/x-tfrecord
   * - application/x-parquet+iceberg
   * - application/x-avro+iceberg
   * - application/x-orc+iceberg
   * - application/json
   * - application/{subtypes}
   * - text/csv
   * - text/&lt;subtypes&gt;
   * - image/{image subtype}
   * - video/{video subtype}
   * - audio/{audio subtype}
   * </pre>
   *
   * <code>string mime_type = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * Required. The mime type descriptor for the data. Must match the pattern
   * {type}/{subtype}. Supported values:
   * - application/x-parquet
   * - application/x-avro
   * - application/x-orc
   * - application/x-tfrecord
   * - application/x-parquet+iceberg
   * - application/x-avro+iceberg
   * - application/x-orc+iceberg
   * - application/json
   * - application/{subtypes}
   * - text/csv
   * - text/&lt;subtypes&gt;
   * - image/{image subtype}
   * - video/{video subtype}
   * - audio/{audio subtype}
   * </pre>
   *
   * <code>string mime_type = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Additional information about CSV formatted data.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat.CsvOptions csv = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the csv field is set.
   */
  boolean hasCsv();
  /**
   *
   *
   * <pre>
   * Optional. Additional information about CSV formatted data.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat.CsvOptions csv = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The csv.
   */
  com.google.cloud.dataplex.v1.StorageFormat.CsvOptions getCsv();
  /**
   *
   *
   * <pre>
   * Optional. Additional information about CSV formatted data.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat.CsvOptions csv = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataplex.v1.StorageFormat.CsvOptionsOrBuilder getCsvOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Additional information about CSV formatted data.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat.JsonOptions json = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the json field is set.
   */
  boolean hasJson();
  /**
   *
   *
   * <pre>
   * Optional. Additional information about CSV formatted data.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat.JsonOptions json = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The json.
   */
  com.google.cloud.dataplex.v1.StorageFormat.JsonOptions getJson();
  /**
   *
   *
   * <pre>
   * Optional. Additional information about CSV formatted data.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat.JsonOptions json = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataplex.v1.StorageFormat.JsonOptionsOrBuilder getJsonOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Additional information about iceberg tables.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat.IcebergOptions iceberg = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the iceberg field is set.
   */
  boolean hasIceberg();
  /**
   *
   *
   * <pre>
   * Optional. Additional information about iceberg tables.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat.IcebergOptions iceberg = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The iceberg.
   */
  com.google.cloud.dataplex.v1.StorageFormat.IcebergOptions getIceberg();
  /**
   *
   *
   * <pre>
   * Optional. Additional information about iceberg tables.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.StorageFormat.IcebergOptions iceberg = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataplex.v1.StorageFormat.IcebergOptionsOrBuilder getIcebergOrBuilder();

  public com.google.cloud.dataplex.v1.StorageFormat.OptionsCase getOptionsCase();
}
