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
// source: google/cloud/securitycenter/settings/v1beta1/billing_settings.proto

package com.google.cloud.securitycenter.settings.v1beta1;

public final class BillingSettingsProto {
  private BillingSettingsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_settings_v1beta1_BillingSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_settings_v1beta1_BillingSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/cloud/securitycenter/settings/v"
          + "1beta1/billing_settings.proto\022,google.cl"
          + "oud.securitycenter.settings.v1beta1\032\037goo"
          + "gle/api/field_behavior.proto\032\037google/pro"
          + "tobuf/timestamp.proto\"\254\002\n\017BillingSetting"
          + "s\022U\n\014billing_tier\030\001 \001(\01629.google.cloud.s"
          + "ecuritycenter.settings.v1beta1.BillingTi"
          + "erB\004\342A\001\003\022U\n\014billing_type\030\002 \001(\01629.google."
          + "cloud.securitycenter.settings.v1beta1.Bi"
          + "llingTypeB\004\342A\001\003\0224\n\nstart_time\030\003 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\004\342A\001\003\0225\n\013expire_"
          + "time\030\004 \001(\0132\032.google.protobuf.TimestampB\004"
          + "\342A\001\003*F\n\013BillingTier\022\034\n\030BILLING_TIER_UNSP"
          + "ECIFIED\020\000\022\014\n\010STANDARD\020\001\022\013\n\007PREMIUM\020\002*`\n\013"
          + "BillingType\022\034\n\030BILLING_TYPE_UNSPECIFIED\020"
          + "\000\022\020\n\014SUBSCRIPTION\020\001\022\026\n\022TRIAL_SUBSCRIPTIO"
          + "N\020\002\022\t\n\005ALPHA\020\003B\254\002\n0com.google.cloud.secu"
          + "ritycenter.settings.v1beta1B\024BillingSett"
          + "ingsProtoP\001ZLcloud.google.com/go/securit"
          + "ycenter/settings/apiv1beta1/settingspb;s"
          + "ettingspb\370\001\001\252\002,Google.Cloud.SecurityCent"
          + "er.Settings.V1Beta1\312\002,Google\\Cloud\\Secur"
          + "ityCenter\\Settings\\V1beta1\352\0020Google::Clo"
          + "ud::SecurityCenter::Settings::V1beta1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_settings_v1beta1_BillingSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_settings_v1beta1_BillingSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_settings_v1beta1_BillingSettings_descriptor,
            new java.lang.String[] {
              "BillingTier", "BillingType", "StartTime", "ExpireTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
