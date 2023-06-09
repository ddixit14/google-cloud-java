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
// source: google/cloud/aiplatform/v1beta1/featurestore.proto

package com.google.cloud.aiplatform.v1beta1;

public final class FeaturestoreProto {
  private FeaturestoreProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_Scaling_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_Scaling_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/aiplatform/v1beta1/featur"
          + "estore.proto\022\037google.cloud.aiplatform.v1"
          + "beta1\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\0325google/cloud/"
          + "aiplatform/v1beta1/encryption_spec.proto"
          + "\032\037google/protobuf/timestamp.proto\"\357\007\n\014Fe"
          + "aturestore\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\0225\n\013create"
          + "_time\030\003 \001(\0132\032.google.protobuf.TimestampB"
          + "\004\342A\001\003\0225\n\013update_time\030\004 \001(\0132\032.google.prot"
          + "obuf.TimestampB\004\342A\001\003\022\022\n\004etag\030\005 \001(\tB\004\342A\001\001"
          + "\022O\n\006labels\030\006 \003(\01329.google.cloud.aiplatfo"
          + "rm.v1beta1.Featurestore.LabelsEntryB\004\342A\001"
          + "\001\022f\n\025online_serving_config\030\007 \001(\0132A.googl"
          + "e.cloud.aiplatform.v1beta1.Featurestore."
          + "OnlineServingConfigB\004\342A\001\001\022H\n\005state\030\010 \001(\016"
          + "23.google.cloud.aiplatform.v1beta1.Featu"
          + "restore.StateB\004\342A\001\003\022%\n\027online_storage_tt"
          + "l_days\030\r \001(\005B\004\342A\001\001\022N\n\017encryption_spec\030\n "
          + "\001(\0132/.google.cloud.aiplatform.v1beta1.En"
          + "cryptionSpecB\004\342A\001\001\032\362\001\n\023OnlineServingConf"
          + "ig\022\030\n\020fixed_node_count\030\002 \001(\005\022Z\n\007scaling\030"
          + "\004 \001(\0132I.google.cloud.aiplatform.v1beta1."
          + "Featurestore.OnlineServingConfig.Scaling"
          + "\032e\n\007Scaling\022\034\n\016min_node_count\030\001 \001(\005B\004\342A\001"
          + "\002\022\026\n\016max_node_count\030\002 \001(\005\022$\n\026cpu_utiliza"
          + "tion_target\030\003 \001(\005B\004\342A\001\001\032-\n\013LabelsEntry\022\013"
          + "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"8\n\005State\022"
          + "\025\n\021STATE_UNSPECIFIED\020\000\022\n\n\006STABLE\020\001\022\014\n\010UP"
          + "DATING\020\002:q\352An\n&aiplatform.googleapis.com"
          + "/Featurestore\022Dprojects/{project}/locati"
          + "ons/{location}/featurestores/{featuresto"
          + "re}B\350\001\n#com.google.cloud.aiplatform.v1be"
          + "ta1B\021FeaturestoreProtoP\001ZCcloud.google.c"
          + "om/go/aiplatform/apiv1beta1/aiplatformpb"
          + ";aiplatformpb\252\002\037Google.Cloud.AIPlatform."
          + "V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta"
          + "1\352\002\"Google::Cloud::AIPlatform::V1beta1b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "Labels",
              "OnlineServingConfig",
              "State",
              "OnlineStorageTtlDays",
              "EncryptionSpec",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_descriptor,
            new java.lang.String[] {
              "FixedNodeCount", "Scaling",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_Scaling_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_Scaling_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_Scaling_descriptor,
            new java.lang.String[] {
              "MinNodeCount", "MaxNodeCount", "CpuUtilizationTarget",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
