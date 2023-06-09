/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/discoveryengine/v1beta/search_service.proto

package com.google.cloud.discoveryengine.v1beta;

public interface SearchRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.SearchRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Search serving config, such as
   * `projects/&#42;&#47;locations/global/collections/default_collection/dataStores/default_data_store/servingConfigs/default_serving_config`.
   * This field is used to identify the serving configuration name, set
   * of models used to make the search.
   * </pre>
   *
   * <code>
   * string serving_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The servingConfig.
   */
  java.lang.String getServingConfig();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Search serving config, such as
   * `projects/&#42;&#47;locations/global/collections/default_collection/dataStores/default_data_store/servingConfigs/default_serving_config`.
   * This field is used to identify the serving configuration name, set
   * of models used to make the search.
   * </pre>
   *
   * <code>
   * string serving_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for servingConfig.
   */
  com.google.protobuf.ByteString getServingConfigBytes();

  /**
   *
   *
   * <pre>
   * The branch resource name, such as
   * `projects/&#42;&#47;locations/global/collections/default_collection/dataStores/default_data_store/branches/0`.
   *
   * Use `default_branch` as the branch ID or leave this field empty, to search
   * documents under the default branch.
   * </pre>
   *
   * <code>string branch = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The branch.
   */
  java.lang.String getBranch();
  /**
   *
   *
   * <pre>
   * The branch resource name, such as
   * `projects/&#42;&#47;locations/global/collections/default_collection/dataStores/default_data_store/branches/0`.
   *
   * Use `default_branch` as the branch ID or leave this field empty, to search
   * documents under the default branch.
   * </pre>
   *
   * <code>string branch = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for branch.
   */
  com.google.protobuf.ByteString getBranchBytes();

  /**
   *
   *
   * <pre>
   * Raw search query.
   * </pre>
   *
   * <code>string query = 3;</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Raw search query.
   * </pre>
   *
   * <code>string query = 3;</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Maximum number of [Document][google.cloud.discoveryengine.v1beta.Document]s
   * to return. If unspecified, defaults to a reasonable value. The maximum
   * allowed value is 100. Values above 100 will be coerced to 100.
   *
   * If this field is negative, an  `INVALID_ARGUMENT`  is returned.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token received from a previous
   * [SearchService.Search][google.cloud.discoveryengine.v1beta.SearchService.Search]
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * [SearchService.Search][google.cloud.discoveryengine.v1beta.SearchService.Search]
   * must match the call that provided the page token. Otherwise, an
   *  `INVALID_ARGUMENT`  error is returned.
   * </pre>
   *
   * <code>string page_token = 5;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A page token received from a previous
   * [SearchService.Search][google.cloud.discoveryengine.v1beta.SearchService.Search]
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to
   * [SearchService.Search][google.cloud.discoveryengine.v1beta.SearchService.Search]
   * must match the call that provided the page token. Otherwise, an
   *  `INVALID_ARGUMENT`  error is returned.
   * </pre>
   *
   * <code>string page_token = 5;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * A 0-indexed integer that specifies the current offset (that is, starting
   * result location, amongst the
   * [Document][google.cloud.discoveryengine.v1beta.Document]s deemed by the API
   * as relevant) in search results. This field is only considered if
   * [page_token][google.cloud.discoveryengine.v1beta.SearchRequest.page_token]
   * is unset.
   *
   * If this field is negative, an  `INVALID_ARGUMENT`  is returned.
   * </pre>
   *
   * <code>int32 offset = 6;</code>
   *
   * @return The offset.
   */
  int getOffset();

  /**
   *
   *
   * <pre>
   * The filter syntax consists of an expression language for constructing a
   * predicate from one or more fields of the documents being filtered. Filter
   * expression is case-sensitive.
   *
   * If this field is unrecognizable, an  `INVALID_ARGUMENT`  is returned.
   * </pre>
   *
   * <code>string filter = 7;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * The filter syntax consists of an expression language for constructing a
   * predicate from one or more fields of the documents being filtered. Filter
   * expression is case-sensitive.
   *
   * If this field is unrecognizable, an  `INVALID_ARGUMENT`  is returned.
   * </pre>
   *
   * <code>string filter = 7;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The order in which documents are returned. Document can be ordered by
   * a field in an [Document][google.cloud.discoveryengine.v1beta.Document]
   * object. Leave it unset if ordered by relevance. OrderBy expression is
   * case-sensitive.
   *
   * If this field is unrecognizable, an  `INVALID_ARGUMENT`  is returned.
   * </pre>
   *
   * <code>string order_by = 8;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * The order in which documents are returned. Document can be ordered by
   * a field in an [Document][google.cloud.discoveryengine.v1beta.Document]
   * object. Leave it unset if ordered by relevance. OrderBy expression is
   * case-sensitive.
   *
   * If this field is unrecognizable, an  `INVALID_ARGUMENT`  is returned.
   * </pre>
   *
   * <code>string order_by = 8;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * Information about the end user.
   * Highly recommended for analytics. The user_agent string in UserInfo will
   * be used to deduce device_type for analytics.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.UserInfo user_info = 21;</code>
   *
   * @return Whether the userInfo field is set.
   */
  boolean hasUserInfo();
  /**
   *
   *
   * <pre>
   * Information about the end user.
   * Highly recommended for analytics. The user_agent string in UserInfo will
   * be used to deduce device_type for analytics.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.UserInfo user_info = 21;</code>
   *
   * @return The userInfo.
   */
  com.google.cloud.discoveryengine.v1beta.UserInfo getUserInfo();
  /**
   *
   *
   * <pre>
   * Information about the end user.
   * Highly recommended for analytics. The user_agent string in UserInfo will
   * be used to deduce device_type for analytics.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.UserInfo user_info = 21;</code>
   */
  com.google.cloud.discoveryengine.v1beta.UserInfoOrBuilder getUserInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Facet specifications for faceted search. If empty, no facets are returned.
   *
   * A maximum of 100 values are allowed. Otherwise, an  `INVALID_ARGUMENT`
   * error is returned.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.SearchRequest.FacetSpec facet_specs = 9;
   * </code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1beta.SearchRequest.FacetSpec>
      getFacetSpecsList();
  /**
   *
   *
   * <pre>
   * Facet specifications for faceted search. If empty, no facets are returned.
   *
   * A maximum of 100 values are allowed. Otherwise, an  `INVALID_ARGUMENT`
   * error is returned.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.SearchRequest.FacetSpec facet_specs = 9;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.SearchRequest.FacetSpec getFacetSpecs(int index);
  /**
   *
   *
   * <pre>
   * Facet specifications for faceted search. If empty, no facets are returned.
   *
   * A maximum of 100 values are allowed. Otherwise, an  `INVALID_ARGUMENT`
   * error is returned.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.SearchRequest.FacetSpec facet_specs = 9;
   * </code>
   */
  int getFacetSpecsCount();
  /**
   *
   *
   * <pre>
   * Facet specifications for faceted search. If empty, no facets are returned.
   *
   * A maximum of 100 values are allowed. Otherwise, an  `INVALID_ARGUMENT`
   * error is returned.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.SearchRequest.FacetSpec facet_specs = 9;
   * </code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1beta.SearchRequest.FacetSpecOrBuilder>
      getFacetSpecsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Facet specifications for faceted search. If empty, no facets are returned.
   *
   * A maximum of 100 values are allowed. Otherwise, an  `INVALID_ARGUMENT`
   * error is returned.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.SearchRequest.FacetSpec facet_specs = 9;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.SearchRequest.FacetSpecOrBuilder getFacetSpecsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Boost specification to boost certain documents.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.SearchRequest.BoostSpec boost_spec = 10;</code>
   *
   * @return Whether the boostSpec field is set.
   */
  boolean hasBoostSpec();
  /**
   *
   *
   * <pre>
   * Boost specification to boost certain documents.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.SearchRequest.BoostSpec boost_spec = 10;</code>
   *
   * @return The boostSpec.
   */
  com.google.cloud.discoveryengine.v1beta.SearchRequest.BoostSpec getBoostSpec();
  /**
   *
   *
   * <pre>
   * Boost specification to boost certain documents.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.SearchRequest.BoostSpec boost_spec = 10;</code>
   */
  com.google.cloud.discoveryengine.v1beta.SearchRequest.BoostSpecOrBuilder getBoostSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional search parameters.
   *
   * For public website search only, supported values are:
   *
   * * `user_country_code`: string. Default empty. If set to non-empty, results
   *    are restricted or boosted based on the location provided.
   * * `search_type`: double. Default empty. Enables non-webpage searching
   *   depending on the value. The only valid non-default value is 1,
   *   which enables image searching.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 11;</code>
   */
  int getParamsCount();
  /**
   *
   *
   * <pre>
   * Additional search parameters.
   *
   * For public website search only, supported values are:
   *
   * * `user_country_code`: string. Default empty. If set to non-empty, results
   *    are restricted or boosted based on the location provided.
   * * `search_type`: double. Default empty. Enables non-webpage searching
   *   depending on the value. The only valid non-default value is 1,
   *   which enables image searching.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 11;</code>
   */
  boolean containsParams(java.lang.String key);
  /** Use {@link #getParamsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value> getParams();
  /**
   *
   *
   * <pre>
   * Additional search parameters.
   *
   * For public website search only, supported values are:
   *
   * * `user_country_code`: string. Default empty. If set to non-empty, results
   *    are restricted or boosted based on the location provided.
   * * `search_type`: double. Default empty. Enables non-webpage searching
   *   depending on the value. The only valid non-default value is 1,
   *   which enables image searching.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 11;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value> getParamsMap();
  /**
   *
   *
   * <pre>
   * Additional search parameters.
   *
   * For public website search only, supported values are:
   *
   * * `user_country_code`: string. Default empty. If set to non-empty, results
   *    are restricted or boosted based on the location provided.
   * * `search_type`: double. Default empty. Enables non-webpage searching
   *   depending on the value. The only valid non-default value is 1,
   *   which enables image searching.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 11;</code>
   */
  /* nullable */
  com.google.protobuf.Value getParamsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.protobuf.Value defaultValue);
  /**
   *
   *
   * <pre>
   * Additional search parameters.
   *
   * For public website search only, supported values are:
   *
   * * `user_country_code`: string. Default empty. If set to non-empty, results
   *    are restricted or boosted based on the location provided.
   * * `search_type`: double. Default empty. Enables non-webpage searching
   *   depending on the value. The only valid non-default value is 1,
   *   which enables image searching.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; params = 11;</code>
   */
  com.google.protobuf.Value getParamsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The query expansion specification that specifies the conditions under which
   * query expansion will occur.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SearchRequest.QueryExpansionSpec query_expansion_spec = 13;
   * </code>
   *
   * @return Whether the queryExpansionSpec field is set.
   */
  boolean hasQueryExpansionSpec();
  /**
   *
   *
   * <pre>
   * The query expansion specification that specifies the conditions under which
   * query expansion will occur.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SearchRequest.QueryExpansionSpec query_expansion_spec = 13;
   * </code>
   *
   * @return The queryExpansionSpec.
   */
  com.google.cloud.discoveryengine.v1beta.SearchRequest.QueryExpansionSpec getQueryExpansionSpec();
  /**
   *
   *
   * <pre>
   * The query expansion specification that specifies the conditions under which
   * query expansion will occur.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SearchRequest.QueryExpansionSpec query_expansion_spec = 13;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.SearchRequest.QueryExpansionSpecOrBuilder
      getQueryExpansionSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * The spell correction specification that specifies the mode under
   * which spell correction will take effect.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SearchRequest.SpellCorrectionSpec spell_correction_spec = 14;
   * </code>
   *
   * @return Whether the spellCorrectionSpec field is set.
   */
  boolean hasSpellCorrectionSpec();
  /**
   *
   *
   * <pre>
   * The spell correction specification that specifies the mode under
   * which spell correction will take effect.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SearchRequest.SpellCorrectionSpec spell_correction_spec = 14;
   * </code>
   *
   * @return The spellCorrectionSpec.
   */
  com.google.cloud.discoveryengine.v1beta.SearchRequest.SpellCorrectionSpec
      getSpellCorrectionSpec();
  /**
   *
   *
   * <pre>
   * The spell correction specification that specifies the mode under
   * which spell correction will take effect.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SearchRequest.SpellCorrectionSpec spell_correction_spec = 14;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.SearchRequest.SpellCorrectionSpecOrBuilder
      getSpellCorrectionSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * A unique identifier for tracking visitors. For example, this could be
   * implemented with an HTTP cookie, which should be able to uniquely identify
   * a visitor on a single device. This unique identifier should not change if
   * the visitor logs in or out of the website.
   *
   * This field should NOT have a fixed value such as `unknown_visitor`.
   *
   * This should be the same identifier as
   * [UserEvent.user_pseudo_id][google.cloud.discoveryengine.v1beta.UserEvent.user_pseudo_id]
   * and
   * [CompleteQueryRequest.user_pseudo_id][google.cloud.discoveryengine.v1beta.CompleteQueryRequest.user_pseudo_id]
   *
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an  `INVALID_ARGUMENT`  error is returned.
   * </pre>
   *
   * <code>string user_pseudo_id = 15;</code>
   *
   * @return The userPseudoId.
   */
  java.lang.String getUserPseudoId();
  /**
   *
   *
   * <pre>
   * A unique identifier for tracking visitors. For example, this could be
   * implemented with an HTTP cookie, which should be able to uniquely identify
   * a visitor on a single device. This unique identifier should not change if
   * the visitor logs in or out of the website.
   *
   * This field should NOT have a fixed value such as `unknown_visitor`.
   *
   * This should be the same identifier as
   * [UserEvent.user_pseudo_id][google.cloud.discoveryengine.v1beta.UserEvent.user_pseudo_id]
   * and
   * [CompleteQueryRequest.user_pseudo_id][google.cloud.discoveryengine.v1beta.CompleteQueryRequest.user_pseudo_id]
   *
   * The field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an  `INVALID_ARGUMENT`  error is returned.
   * </pre>
   *
   * <code>string user_pseudo_id = 15;</code>
   *
   * @return The bytes for userPseudoId.
   */
  com.google.protobuf.ByteString getUserPseudoIdBytes();

  /**
   *
   *
   * <pre>
   * The content search spec that configs the desired behavior of content
   * search.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SearchRequest.ContentSearchSpec content_search_spec = 24;
   * </code>
   *
   * @return Whether the contentSearchSpec field is set.
   */
  boolean hasContentSearchSpec();
  /**
   *
   *
   * <pre>
   * The content search spec that configs the desired behavior of content
   * search.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SearchRequest.ContentSearchSpec content_search_spec = 24;
   * </code>
   *
   * @return The contentSearchSpec.
   */
  com.google.cloud.discoveryengine.v1beta.SearchRequest.ContentSearchSpec getContentSearchSpec();
  /**
   *
   *
   * <pre>
   * The content search spec that configs the desired behavior of content
   * search.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.SearchRequest.ContentSearchSpec content_search_spec = 24;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.SearchRequest.ContentSearchSpecOrBuilder
      getContentSearchSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether to turn on safe search. This is only supported for
   * [ContentConfig.PUBLIC_WEBSITE][].
   * </pre>
   *
   * <code>bool safe_search = 20;</code>
   *
   * @return The safeSearch.
   */
  boolean getSafeSearch();

  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 22;</code>
   */
  int getUserLabelsCount();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 22;</code>
   */
  boolean containsUserLabels(java.lang.String key);
  /** Use {@link #getUserLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getUserLabels();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 22;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getUserLabelsMap();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 22;</code>
   */
  /* nullable */
  java.lang.String getUserLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 22;</code>
   */
  java.lang.String getUserLabelsOrThrow(java.lang.String key);
}
