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
// source: google/cloud/discoveryengine/v1beta/common.proto

package com.google.cloud.discoveryengine.v1beta;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_Interval_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_Interval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_UserInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_UserInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/discoveryengine/v1beta/co"
          + "mmon.proto\022#google.cloud.discoveryengine"
          + ".v1beta\032\031google/api/resource.proto\"x\n\010In"
          + "terval\022\021\n\007minimum\030\001 \001(\001H\000\022\033\n\021exclusive_m"
          + "inimum\030\002 \001(\001H\000\022\021\n\007maximum\030\003 \001(\001H\001\022\033\n\021exc"
          + "lusive_maximum\030\004 \001(\001H\001B\005\n\003minB\005\n\003max\"0\n\017"
          + "CustomAttribute\022\014\n\004text\030\001 \003(\t\022\017\n\007numbers"
          + "\030\002 \003(\001\"/\n\010UserInfo\022\017\n\007user_id\030\001 \001(\t\022\022\n\nu"
          + "ser_agent\030\002 \001(\tB\322\007\n\'com.google.cloud.dis"
          + "coveryengine.v1betaB\013CommonProtoP\001ZQclou"
          + "d.google.com/go/discoveryengine/apiv1bet"
          + "a/discoveryenginepb;discoveryenginepb\242\002\017"
          + "DISCOVERYENGINE\252\002#Google.Cloud.Discovery"
          + "Engine.V1Beta\312\002#Google\\Cloud\\DiscoveryEn"
          + "gine\\V1beta\352\002&Google::Cloud::DiscoveryEn"
          + "gine::V1beta\352A\346\001\n%discoveryengine.google"
          + "apis.com/Branch\022Qprojects/{project}/loca"
          + "tions/{location}/dataStores/{data_store}"
          + "/branches/{branch}\022jprojects/{project}/l"
          + "ocations/{location}/collections/{collect"
          + "ion}/dataStores/{data_store}/branches/{b"
          + "ranch}\352A\305\001\n(discoveryengine.googleapis.c"
          + "om/DataStore\022?projects/{project}/locatio"
          + "ns/{location}/dataStores/{data_store}\022Xp"
          + "rojects/{project}/locations/{location}/c"
          + "ollections/{collection}/dataStores/{data"
          + "_store}\352A\211\002\n,discoveryengine.googleapis."
          + "com/ServingConfig\022_projects/{project}/lo"
          + "cations/{location}/dataStores/{data_stor"
          + "e}/servingConfigs/{serving_config}\022xproj"
          + "ects/{project}/locations/{location}/coll"
          + "ections/{collection}/dataStores/{data_st"
          + "ore}/servingConfigs/{serving_config}b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_Interval_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_Interval_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_Interval_descriptor,
            new java.lang.String[] {
              "Minimum", "ExclusiveMinimum", "Maximum", "ExclusiveMaximum", "Min", "Max",
            });
    internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_descriptor,
            new java.lang.String[] {
              "Text", "Numbers",
            });
    internal_static_google_cloud_discoveryengine_v1beta_UserInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1beta_UserInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_UserInfo_descriptor,
            new java.lang.String[] {
              "UserId", "UserAgent",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
