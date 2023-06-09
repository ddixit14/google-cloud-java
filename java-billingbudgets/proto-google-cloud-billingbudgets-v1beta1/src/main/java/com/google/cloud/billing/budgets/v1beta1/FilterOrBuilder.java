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
// source: google/cloud/billing/budgets/v1beta1/budget_model.proto

package com.google.cloud.billing.budgets.v1beta1;

public interface FilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.budgets.v1beta1.Filter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A set of projects of the form `projects/{project}`,
   * specifying that usage from only this set of projects should be
   * included in the budget. If omitted, the report will include all usage for
   * the billing account, regardless of which project the usage occurred on.
   * </pre>
   *
   * <code>repeated string projects = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the projects.
   */
  java.util.List<java.lang.String> getProjectsList();
  /**
   *
   *
   * <pre>
   * Optional. A set of projects of the form `projects/{project}`,
   * specifying that usage from only this set of projects should be
   * included in the budget. If omitted, the report will include all usage for
   * the billing account, regardless of which project the usage occurred on.
   * </pre>
   *
   * <code>repeated string projects = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of projects.
   */
  int getProjectsCount();
  /**
   *
   *
   * <pre>
   * Optional. A set of projects of the form `projects/{project}`,
   * specifying that usage from only this set of projects should be
   * included in the budget. If omitted, the report will include all usage for
   * the billing account, regardless of which project the usage occurred on.
   * </pre>
   *
   * <code>repeated string projects = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The projects at the given index.
   */
  java.lang.String getProjects(int index);
  /**
   *
   *
   * <pre>
   * Optional. A set of projects of the form `projects/{project}`,
   * specifying that usage from only this set of projects should be
   * included in the budget. If omitted, the report will include all usage for
   * the billing account, regardless of which project the usage occurred on.
   * </pre>
   *
   * <code>repeated string projects = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the projects at the given index.
   */
  com.google.protobuf.ByteString getProjectsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. A set of folder and organization names of the form
   * `folders/{folderId}` or `organizations/{organizationId}`, specifying that
   * usage from only this set of folders and organizations should be included in
   * the budget. If omitted, the report includes all usage for all
   * organizations, regardless of which organization the usage occurred on.
   * </pre>
   *
   * <code>repeated string resource_ancestors = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the resourceAncestors.
   */
  java.util.List<java.lang.String> getResourceAncestorsList();
  /**
   *
   *
   * <pre>
   * Optional. A set of folder and organization names of the form
   * `folders/{folderId}` or `organizations/{organizationId}`, specifying that
   * usage from only this set of folders and organizations should be included in
   * the budget. If omitted, the report includes all usage for all
   * organizations, regardless of which organization the usage occurred on.
   * </pre>
   *
   * <code>repeated string resource_ancestors = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of resourceAncestors.
   */
  int getResourceAncestorsCount();
  /**
   *
   *
   * <pre>
   * Optional. A set of folder and organization names of the form
   * `folders/{folderId}` or `organizations/{organizationId}`, specifying that
   * usage from only this set of folders and organizations should be included in
   * the budget. If omitted, the report includes all usage for all
   * organizations, regardless of which organization the usage occurred on.
   * </pre>
   *
   * <code>repeated string resource_ancestors = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The resourceAncestors at the given index.
   */
  java.lang.String getResourceAncestors(int index);
  /**
   *
   *
   * <pre>
   * Optional. A set of folder and organization names of the form
   * `folders/{folderId}` or `organizations/{organizationId}`, specifying that
   * usage from only this set of folders and organizations should be included in
   * the budget. If omitted, the report includes all usage for all
   * organizations, regardless of which organization the usage occurred on.
   * </pre>
   *
   * <code>repeated string resource_ancestors = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourceAncestors at the given index.
   */
  com.google.protobuf.ByteString getResourceAncestorsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. If
   * [Filter.credit_types_treatment][google.cloud.billing.budgets.v1beta1.Filter.credit_types_treatment]
   * is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be
   * subtracted from gross cost to determine the spend for threshold
   * calculations. See [a list of acceptable credit type
   * values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type).
   *
   * If
   * [Filter.credit_types_treatment][google.cloud.billing.budgets.v1beta1.Filter.credit_types_treatment]
   * is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty.
   * </pre>
   *
   * <code>repeated string credit_types = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the creditTypes.
   */
  java.util.List<java.lang.String> getCreditTypesList();
  /**
   *
   *
   * <pre>
   * Optional. If
   * [Filter.credit_types_treatment][google.cloud.billing.budgets.v1beta1.Filter.credit_types_treatment]
   * is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be
   * subtracted from gross cost to determine the spend for threshold
   * calculations. See [a list of acceptable credit type
   * values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type).
   *
   * If
   * [Filter.credit_types_treatment][google.cloud.billing.budgets.v1beta1.Filter.credit_types_treatment]
   * is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty.
   * </pre>
   *
   * <code>repeated string credit_types = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of creditTypes.
   */
  int getCreditTypesCount();
  /**
   *
   *
   * <pre>
   * Optional. If
   * [Filter.credit_types_treatment][google.cloud.billing.budgets.v1beta1.Filter.credit_types_treatment]
   * is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be
   * subtracted from gross cost to determine the spend for threshold
   * calculations. See [a list of acceptable credit type
   * values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type).
   *
   * If
   * [Filter.credit_types_treatment][google.cloud.billing.budgets.v1beta1.Filter.credit_types_treatment]
   * is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty.
   * </pre>
   *
   * <code>repeated string credit_types = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The creditTypes at the given index.
   */
  java.lang.String getCreditTypes(int index);
  /**
   *
   *
   * <pre>
   * Optional. If
   * [Filter.credit_types_treatment][google.cloud.billing.budgets.v1beta1.Filter.credit_types_treatment]
   * is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be
   * subtracted from gross cost to determine the spend for threshold
   * calculations. See [a list of acceptable credit type
   * values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type).
   *
   * If
   * [Filter.credit_types_treatment][google.cloud.billing.budgets.v1beta1.Filter.credit_types_treatment]
   * is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty.
   * </pre>
   *
   * <code>repeated string credit_types = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the creditTypes at the given index.
   */
  com.google.protobuf.ByteString getCreditTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.Filter.CreditTypesTreatment credit_types_treatment = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for creditTypesTreatment.
   */
  int getCreditTypesTreatmentValue();
  /**
   *
   *
   * <pre>
   * Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.Filter.CreditTypesTreatment credit_types_treatment = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The creditTypesTreatment.
   */
  com.google.cloud.billing.budgets.v1beta1.Filter.CreditTypesTreatment getCreditTypesTreatment();

  /**
   *
   *
   * <pre>
   * Optional. A set of services of the form `services/{service_id}`,
   * specifying that usage from only this set of services should be
   * included in the budget. If omitted, the report will include usage for
   * all the services.
   * The service names are available through the Catalog API:
   * https://cloud.google.com/billing/v1/how-tos/catalog-api.
   * </pre>
   *
   * <code>repeated string services = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the services.
   */
  java.util.List<java.lang.String> getServicesList();
  /**
   *
   *
   * <pre>
   * Optional. A set of services of the form `services/{service_id}`,
   * specifying that usage from only this set of services should be
   * included in the budget. If omitted, the report will include usage for
   * all the services.
   * The service names are available through the Catalog API:
   * https://cloud.google.com/billing/v1/how-tos/catalog-api.
   * </pre>
   *
   * <code>repeated string services = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of services.
   */
  int getServicesCount();
  /**
   *
   *
   * <pre>
   * Optional. A set of services of the form `services/{service_id}`,
   * specifying that usage from only this set of services should be
   * included in the budget. If omitted, the report will include usage for
   * all the services.
   * The service names are available through the Catalog API:
   * https://cloud.google.com/billing/v1/how-tos/catalog-api.
   * </pre>
   *
   * <code>repeated string services = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The services at the given index.
   */
  java.lang.String getServices(int index);
  /**
   *
   *
   * <pre>
   * Optional. A set of services of the form `services/{service_id}`,
   * specifying that usage from only this set of services should be
   * included in the budget. If omitted, the report will include usage for
   * all the services.
   * The service names are available through the Catalog API:
   * https://cloud.google.com/billing/v1/how-tos/catalog-api.
   * </pre>
   *
   * <code>repeated string services = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the services at the given index.
   */
  com.google.protobuf.ByteString getServicesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. A set of subaccounts of the form `billingAccounts/{account_id}`,
   * specifying that usage from only this set of subaccounts should be included
   * in the budget. If a subaccount is set to the name of the parent account,
   * usage from the parent account will be included. If omitted, the
   * report will include usage from the parent account and all
   * subaccounts, if they exist.
   * </pre>
   *
   * <code>repeated string subaccounts = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the subaccounts.
   */
  java.util.List<java.lang.String> getSubaccountsList();
  /**
   *
   *
   * <pre>
   * Optional. A set of subaccounts of the form `billingAccounts/{account_id}`,
   * specifying that usage from only this set of subaccounts should be included
   * in the budget. If a subaccount is set to the name of the parent account,
   * usage from the parent account will be included. If omitted, the
   * report will include usage from the parent account and all
   * subaccounts, if they exist.
   * </pre>
   *
   * <code>repeated string subaccounts = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of subaccounts.
   */
  int getSubaccountsCount();
  /**
   *
   *
   * <pre>
   * Optional. A set of subaccounts of the form `billingAccounts/{account_id}`,
   * specifying that usage from only this set of subaccounts should be included
   * in the budget. If a subaccount is set to the name of the parent account,
   * usage from the parent account will be included. If omitted, the
   * report will include usage from the parent account and all
   * subaccounts, if they exist.
   * </pre>
   *
   * <code>repeated string subaccounts = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The subaccounts at the given index.
   */
  java.lang.String getSubaccounts(int index);
  /**
   *
   *
   * <pre>
   * Optional. A set of subaccounts of the form `billingAccounts/{account_id}`,
   * specifying that usage from only this set of subaccounts should be included
   * in the budget. If a subaccount is set to the name of the parent account,
   * usage from the parent account will be included. If omitted, the
   * report will include usage from the parent account and all
   * subaccounts, if they exist.
   * </pre>
   *
   * <code>repeated string subaccounts = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the subaccounts at the given index.
   */
  com.google.protobuf.ByteString getSubaccountsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. A single label and value pair specifying that usage from only
   * this set of labeled resources should be included in the budget. If omitted,
   * the report will include all labeled and unlabeled usage.
   *
   * An object containing a single `"key": value` pair. Example: `{ "name":
   * "wrench" }`.
   *
   *  _Currently, multiple entries or multiple values per entry are not
   *  allowed._
   * </pre>
   *
   * <code>
   * map&lt;string, .google.protobuf.ListValue&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. A single label and value pair specifying that usage from only
   * this set of labeled resources should be included in the budget. If omitted,
   * the report will include all labeled and unlabeled usage.
   *
   * An object containing a single `"key": value` pair. Example: `{ "name":
   * "wrench" }`.
   *
   *  _Currently, multiple entries or multiple values per entry are not
   *  allowed._
   * </pre>
   *
   * <code>
   * map&lt;string, .google.protobuf.ListValue&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.ListValue> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. A single label and value pair specifying that usage from only
   * this set of labeled resources should be included in the budget. If omitted,
   * the report will include all labeled and unlabeled usage.
   *
   * An object containing a single `"key": value` pair. Example: `{ "name":
   * "wrench" }`.
   *
   *  _Currently, multiple entries or multiple values per entry are not
   *  allowed._
   * </pre>
   *
   * <code>
   * map&lt;string, .google.protobuf.ListValue&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.ListValue> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. A single label and value pair specifying that usage from only
   * this set of labeled resources should be included in the budget. If omitted,
   * the report will include all labeled and unlabeled usage.
   *
   * An object containing a single `"key": value` pair. Example: `{ "name":
   * "wrench" }`.
   *
   *  _Currently, multiple entries or multiple values per entry are not
   *  allowed._
   * </pre>
   *
   * <code>
   * map&lt;string, .google.protobuf.ListValue&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  com.google.protobuf.ListValue getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.protobuf.ListValue defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. A single label and value pair specifying that usage from only
   * this set of labeled resources should be included in the budget. If omitted,
   * the report will include all labeled and unlabeled usage.
   *
   * An object containing a single `"key": value` pair. Example: `{ "name":
   * "wrench" }`.
   *
   *  _Currently, multiple entries or multiple values per entry are not
   *  allowed._
   * </pre>
   *
   * <code>
   * map&lt;string, .google.protobuf.ListValue&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.ListValue getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Specifies to track usage for recurring calendar period.
   * For example, assume that CalendarPeriod.QUARTER is set. The budget will
   * track usage from April 1 to June 30, when the current calendar month is
   * April, May, June. After that, it will track usage from July 1 to
   * September 30 when the current calendar month is July, August, September,
   * so on.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.CalendarPeriod calendar_period = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the calendarPeriod field is set.
   */
  boolean hasCalendarPeriod();
  /**
   *
   *
   * <pre>
   * Optional. Specifies to track usage for recurring calendar period.
   * For example, assume that CalendarPeriod.QUARTER is set. The budget will
   * track usage from April 1 to June 30, when the current calendar month is
   * April, May, June. After that, it will track usage from July 1 to
   * September 30 when the current calendar month is July, August, September,
   * so on.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.CalendarPeriod calendar_period = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for calendarPeriod.
   */
  int getCalendarPeriodValue();
  /**
   *
   *
   * <pre>
   * Optional. Specifies to track usage for recurring calendar period.
   * For example, assume that CalendarPeriod.QUARTER is set. The budget will
   * track usage from April 1 to June 30, when the current calendar month is
   * April, May, June. After that, it will track usage from July 1 to
   * September 30 when the current calendar month is July, August, September,
   * so on.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.CalendarPeriod calendar_period = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The calendarPeriod.
   */
  com.google.cloud.billing.budgets.v1beta1.CalendarPeriod getCalendarPeriod();

  /**
   *
   *
   * <pre>
   * Optional. Specifies to track usage from any start date (required) to any
   * end date (optional). This time period is static, it does not recur.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.CustomPeriod custom_period = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the customPeriod field is set.
   */
  boolean hasCustomPeriod();
  /**
   *
   *
   * <pre>
   * Optional. Specifies to track usage from any start date (required) to any
   * end date (optional). This time period is static, it does not recur.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.CustomPeriod custom_period = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The customPeriod.
   */
  com.google.cloud.billing.budgets.v1beta1.CustomPeriod getCustomPeriod();
  /**
   *
   *
   * <pre>
   * Optional. Specifies to track usage from any start date (required) to any
   * end date (optional). This time period is static, it does not recur.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1beta1.CustomPeriod custom_period = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.billing.budgets.v1beta1.CustomPeriodOrBuilder getCustomPeriodOrBuilder();

  com.google.cloud.billing.budgets.v1beta1.Filter.UsagePeriodCase getUsagePeriodCase();
}
