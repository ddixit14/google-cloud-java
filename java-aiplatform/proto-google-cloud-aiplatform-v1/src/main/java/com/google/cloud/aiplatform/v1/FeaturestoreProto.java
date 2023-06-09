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
// source: google/cloud/aiplatform/v1/featurestore.proto

package com.google.cloud.aiplatform.v1;

public final class FeaturestoreProto {
  private FeaturestoreProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Featurestore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Featurestore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Featurestore_OnlineServingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Featurestore_OnlineServingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Featurestore_OnlineServingConfig_Scaling_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Featurestore_OnlineServingConfig_Scaling_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Featurestore_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Featurestore_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1/featurestor"
          + "e.proto\022\032google.cloud.aiplatform.v1\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\0320google/cloud/aiplatform"
          + "/v1/encryption_spec.proto\032\037google/protob"
          + "uf/timestamp.proto\"\326\007\n\014Featurestore\022\022\n\004n"
          + "ame\030\001 \001(\tB\004\342A\001\003\0225\n\013create_time\030\003 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\004\342A\001\003\0225\n\013update"
          + "_time\030\004 \001(\0132\032.google.protobuf.TimestampB"
          + "\004\342A\001\003\022\022\n\004etag\030\005 \001(\tB\004\342A\001\001\022J\n\006labels\030\006 \003("
          + "\01324.google.cloud.aiplatform.v1.Featurest"
          + "ore.LabelsEntryB\004\342A\001\001\022a\n\025online_serving_"
          + "config\030\007 \001(\0132<.google.cloud.aiplatform.v"
          + "1.Featurestore.OnlineServingConfigB\004\342A\001\001"
          + "\022C\n\005state\030\010 \001(\0162..google.cloud.aiplatfor"
          + "m.v1.Featurestore.StateB\004\342A\001\003\022%\n\027online_"
          + "storage_ttl_days\030\r \001(\005B\004\342A\001\001\022I\n\017encrypti"
          + "on_spec\030\n \001(\0132*.google.cloud.aiplatform."
          + "v1.EncryptionSpecB\004\342A\001\001\032\355\001\n\023OnlineServin"
          + "gConfig\022\030\n\020fixed_node_count\030\002 \001(\005\022U\n\007sca"
          + "ling\030\004 \001(\0132D.google.cloud.aiplatform.v1."
          + "Featurestore.OnlineServingConfig.Scaling"
          + "\032e\n\007Scaling\022\034\n\016min_node_count\030\001 \001(\005B\004\342A\001"
          + "\002\022\026\n\016max_node_count\030\002 \001(\005\022$\n\026cpu_utiliza"
          + "tion_target\030\003 \001(\005B\004\342A\001\001\032-\n\013LabelsEntry\022\013"
          + "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"8\n\005State\022"
          + "\025\n\021STATE_UNSPECIFIED\020\000\022\n\n\006STABLE\020\001\022\014\n\010UP"
          + "DATING\020\002:q\352An\n&aiplatform.googleapis.com"
          + "/Featurestore\022Dprojects/{project}/locati"
          + "ons/{location}/featurestores/{featuresto"
          + "re}B\317\001\n\036com.google.cloud.aiplatform.v1B\021"
          + "FeaturestoreProtoP\001Z>cloud.google.com/go"
          + "/aiplatform/apiv1/aiplatformpb;aiplatfor"
          + "mpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Googl"
          + "e\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::A"
          + "IPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Featurestore_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Featurestore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Featurestore_descriptor,
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
    internal_static_google_cloud_aiplatform_v1_Featurestore_OnlineServingConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1_Featurestore_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Featurestore_OnlineServingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Featurestore_OnlineServingConfig_descriptor,
            new java.lang.String[] {
              "FixedNodeCount", "Scaling",
            });
    internal_static_google_cloud_aiplatform_v1_Featurestore_OnlineServingConfig_Scaling_descriptor =
        internal_static_google_cloud_aiplatform_v1_Featurestore_OnlineServingConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_Featurestore_OnlineServingConfig_Scaling_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Featurestore_OnlineServingConfig_Scaling_descriptor,
            new java.lang.String[] {
              "MinNodeCount", "MaxNodeCount", "CpuUtilizationTarget",
            });
    internal_static_google_cloud_aiplatform_v1_Featurestore_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Featurestore_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_Featurestore_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Featurestore_LabelsEntry_descriptor,
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
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
