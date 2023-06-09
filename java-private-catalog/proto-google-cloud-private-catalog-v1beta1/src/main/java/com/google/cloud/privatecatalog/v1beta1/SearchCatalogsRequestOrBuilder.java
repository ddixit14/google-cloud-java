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
// source: google/cloud/privatecatalog/v1beta1/private_catalog.proto

package com.google.cloud.privatecatalog.v1beta1;

public interface SearchCatalogsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.privatecatalog.v1beta1.SearchCatalogsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the resource context. It can be in following formats:
   *
   * * `projects/{project}`
   * * `folders/{folder}`
   * * `organizations/{organization}`
   * </pre>
   *
   * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   *
   *
   * <pre>
   * Required. The name of the resource context. It can be in following formats:
   *
   * * `projects/{project}`
   * * `folders/{folder}`
   * * `organizations/{organization}`
   * </pre>
   *
   * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * The query to filter the catalogs. The supported queries are:
   *
   * * Get a single catalog: `name=catalogs/{catalog}`
   * </pre>
   *
   * <code>string query = 2;</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * The query to filter the catalogs. The supported queries are:
   *
   * * Get a single catalog: `name=catalogs/{catalog}`
   * </pre>
   *
   * <code>string query = 2;</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of entries that are requested.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A pagination token returned from a previous call to SearchCatalogs that
   * indicates where this listing should continue from.
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
   * A pagination token returned from a previous call to SearchCatalogs that
   * indicates where this listing should continue from.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
