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
// source: google/cloud/securitycenter/v1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1beta1;

public interface UpdateFindingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1beta1.UpdateFindingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The finding resource to update or create if it does not already exist.
   * parent, security_marks, and update_time will be ignored.
   *
   * In the case of creation, the finding id portion of the name must
   * alphanumeric and less than or equal to 32 characters and greater than 0
   * characters in length.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the finding field is set.
   */
  boolean hasFinding();
  /**
   *
   *
   * <pre>
   * Required. The finding resource to update or create if it does not already exist.
   * parent, security_marks, and update_time will be ignored.
   *
   * In the case of creation, the finding id portion of the name must
   * alphanumeric and less than or equal to 32 characters and greater than 0
   * characters in length.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The finding.
   */
  com.google.cloud.securitycenter.v1beta1.Finding getFinding();
  /**
   *
   *
   * <pre>
   * Required. The finding resource to update or create if it does not already exist.
   * parent, security_marks, and update_time will be ignored.
   *
   * In the case of creation, the finding id portion of the name must
   * alphanumeric and less than or equal to 32 characters and greater than 0
   * characters in length.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1beta1.Finding finding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycenter.v1beta1.FindingOrBuilder getFindingOrBuilder();

  /**
   *
   *
   * <pre>
   * The FieldMask to use when updating the finding resource. This field should
   * not be specified when creating a finding.
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
   * The FieldMask to use when updating the finding resource. This field should
   * not be specified when creating a finding.
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
   * The FieldMask to use when updating the finding resource. This field should
   * not be specified when creating a finding.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
