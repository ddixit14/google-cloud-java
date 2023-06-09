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
// source: google/cloud/talent/v4beta1/tenant_service.proto

package com.google.cloud.talent.v4beta1;

public interface UpdateTenantRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.UpdateTenantRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The tenant resource to replace the current resource in the
   * system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tenant field is set.
   */
  boolean hasTenant();
  /**
   *
   *
   * <pre>
   * Required. The tenant resource to replace the current resource in the
   * system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tenant.
   */
  com.google.cloud.talent.v4beta1.Tenant getTenant();
  /**
   *
   *
   * <pre>
   * Required. The tenant resource to replace the current resource in the
   * system.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Tenant tenant = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.talent.v4beta1.TenantOrBuilder getTenantOrBuilder();

  /**
   *
   *
   * <pre>
   * Strongly recommended for the best service experience.
   *
   * If
   * [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask]
   * is provided, only the specified fields in
   * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are
   * updated. Otherwise all the fields are updated.
   *
   * A field mask to specify the tenant fields to be updated. Only
   * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Strongly recommended for the best service experience.
   *
   * If
   * [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask]
   * is provided, only the specified fields in
   * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are
   * updated. Otherwise all the fields are updated.
   *
   * A field mask to specify the tenant fields to be updated. Only
   * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Strongly recommended for the best service experience.
   *
   * If
   * [update_mask][google.cloud.talent.v4beta1.UpdateTenantRequest.update_mask]
   * is provided, only the specified fields in
   * [tenant][google.cloud.talent.v4beta1.UpdateTenantRequest.tenant] are
   * updated. Otherwise all the fields are updated.
   *
   * A field mask to specify the tenant fields to be updated. Only
   * top level fields of [Tenant][google.cloud.talent.v4beta1.Tenant] are
   * supported.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
