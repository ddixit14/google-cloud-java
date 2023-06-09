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
// source: google/cloud/aiplatform/v1beta1/index_endpoint.proto

package com.google.cloud.aiplatform.v1beta1;

public final class IndexEndpointProto {
  private IndexEndpointProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/aiplatform/v1beta1/index_"
          + "endpoint.proto\022\037google.cloud.aiplatform."
          + "v1beta1\032\037google/api/field_behavior.proto"
          + "\032\031google/api/resource.proto\0327google/clou"
          + "d/aiplatform/v1beta1/machine_resources.p"
          + "roto\0328google/cloud/aiplatform/v1beta1/se"
          + "rvice_networking.proto\032\037google/protobuf/"
          + "timestamp.proto\"\227\006\n\rIndexEndpoint\022\022\n\004nam"
          + "e\030\001 \001(\tB\004\342A\001\003\022\032\n\014display_name\030\002 \001(\tB\004\342A\001"
          + "\002\022\023\n\013description\030\003 \001(\t\022N\n\020deployed_index"
          + "es\030\004 \003(\0132..google.cloud.aiplatform.v1bet"
          + "a1.DeployedIndexB\004\342A\001\003\022\014\n\004etag\030\005 \001(\t\022J\n\006"
          + "labels\030\006 \003(\0132:.google.cloud.aiplatform.v"
          + "1beta1.IndexEndpoint.LabelsEntry\0225\n\013crea"
          + "te_time\030\007 \001(\0132\032.google.protobuf.Timestam"
          + "pB\004\342A\001\003\0225\n\013update_time\030\010 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\004\342A\001\003\022\025\n\007network\030\t \001(\tB"
          + "\004\342A\001\001\022.\n\036enable_private_service_connect\030"
          + "\n \001(\010B\006\030\001\342A\001\001\022j\n\036private_service_connect"
          + "_config\030\014 \001(\0132<.google.cloud.aiplatform."
          + "v1beta1.PrivateServiceConnectConfigB\004\342A\001"
          + "\001\022%\n\027public_endpoint_enabled\030\r \001(\010B\004\342A\001\001"
          + "\022)\n\033public_endpoint_domain_name\030\016 \001(\tB\004\342"
          + "A\001\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value"
          + "\030\002 \001(\t:\0028\001:u\352Ar\n\'aiplatform.googleapis.c"
          + "om/IndexEndpoint\022Gprojects/{project}/loc"
          + "ations/{location}/indexEndpoints/{index_"
          + "endpoint}\"\266\005\n\rDeployedIndex\022\020\n\002id\030\001 \001(\tB"
          + "\004\342A\001\002\0227\n\005index\030\002 \001(\tB(\342A\001\002\372A!\n\037aiplatfor"
          + "m.googleapis.com/Index\022\024\n\014display_name\030\003"
          + " \001(\t\0225\n\013create_time\030\004 \001(\0132\032.google.proto"
          + "buf.TimestampB\004\342A\001\003\022W\n\021private_endpoints"
          + "\030\005 \001(\01326.google.cloud.aiplatform.v1beta1"
          + ".IndexPrivateEndpointsB\004\342A\001\003\0229\n\017index_sy"
          + "nc_time\030\006 \001(\0132\032.google.protobuf.Timestam"
          + "pB\004\342A\001\003\022V\n\023automatic_resources\030\007 \001(\01323.g"
          + "oogle.cloud.aiplatform.v1beta1.Automatic"
          + "ResourcesB\004\342A\001\001\022V\n\023dedicated_resources\030\020"
          + " \001(\01323.google.cloud.aiplatform.v1beta1.D"
          + "edicatedResourcesB\004\342A\001\001\022#\n\025enable_access"
          + "_logging\030\010 \001(\010B\004\342A\001\001\022b\n\032deployed_index_a"
          + "uth_config\030\t \001(\01328.google.cloud.aiplatfo"
          + "rm.v1beta1.DeployedIndexAuthConfigB\004\342A\001\001"
          + "\022 \n\022reserved_ip_ranges\030\n \003(\tB\004\342A\001\001\022\036\n\020de"
          + "ployment_group\030\013 \001(\tB\004\342A\001\001\"\263\001\n\027DeployedI"
          + "ndexAuthConfig\022\\\n\rauth_provider\030\001 \001(\0132E."
          + "google.cloud.aiplatform.v1beta1.Deployed"
          + "IndexAuthConfig.AuthProvider\032:\n\014AuthProv"
          + "ider\022\021\n\taudiences\030\001 \003(\t\022\027\n\017allowed_issue"
          + "rs\030\002 \003(\t\"[\n\025IndexPrivateEndpoints\022 \n\022mat"
          + "ch_grpc_address\030\001 \001(\tB\004\342A\001\003\022 \n\022service_a"
          + "ttachment\030\002 \001(\tB\004\342A\001\003B\351\001\n#com.google.clo"
          + "ud.aiplatform.v1beta1B\022IndexEndpointProt"
          + "oP\001ZCcloud.google.com/go/aiplatform/apiv"
          + "1beta1/aiplatformpb;aiplatformpb\252\002\037Googl"
          + "e.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Clou"
          + "d\\AIPlatform\\V1beta1\352\002\"Google::Cloud::AI"
          + "Platform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "DeployedIndexes",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "Network",
              "EnablePrivateServiceConnect",
              "PrivateServiceConnectConfig",
              "PublicEndpointEnabled",
              "PublicEndpointDomainName",
            });
    internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IndexEndpoint_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployedIndex_descriptor,
            new java.lang.String[] {
              "Id",
              "Index",
              "DisplayName",
              "CreateTime",
              "PrivateEndpoints",
              "IndexSyncTime",
              "AutomaticResources",
              "DedicatedResources",
              "EnableAccessLogging",
              "DeployedIndexAuthConfig",
              "ReservedIpRanges",
              "DeploymentGroup",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_descriptor,
            new java.lang.String[] {
              "AuthProvider",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployedIndexAuthConfig_AuthProvider_descriptor,
            new java.lang.String[] {
              "Audiences", "AllowedIssuers",
            });
    internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_IndexPrivateEndpoints_descriptor,
            new java.lang.String[] {
              "MatchGrpcAddress", "ServiceAttachment",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
