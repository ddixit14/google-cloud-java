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
// source: google/cloud/gkehub/v1beta/service.proto

package com.google.cloud.gkehub.v1beta;

public final class ServiceProto {
  private ServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_ListFeaturesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_ListFeaturesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_ListFeaturesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_ListFeaturesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_GetFeatureRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_GetFeatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_CreateFeatureRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_CreateFeatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_DeleteFeatureRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_DeleteFeatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_UpdateFeatureRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_UpdateFeatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/gkehub/v1beta/service.pro"
          + "to\022\032google.cloud.gkehub.v1beta\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032("
          + "google/cloud/gkehub/v1beta/feature.proto"
          + "\032#google/longrunning/operations.proto\032 g"
          + "oogle/protobuf/field_mask.proto\032\037google/"
          + "protobuf/timestamp.proto\"n\n\023ListFeatures"
          + "Request\022\016\n\006parent\030\001 \001(\t\022\021\n\tpage_size\030\002 \001"
          + "(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020"
          + "\n\010order_by\030\005 \001(\t\"g\n\024ListFeaturesResponse"
          + "\0226\n\tresources\030\001 \003(\0132#.google.cloud.gkehu"
          + "b.v1beta.Feature\022\027\n\017next_page_token\030\002 \001("
          + "\t\"!\n\021GetFeatureRequest\022\014\n\004name\030\001 \001(\t\"\213\001\n"
          + "\024CreateFeatureRequest\022\016\n\006parent\030\001 \001(\t\022\022\n"
          + "\nfeature_id\030\002 \001(\t\0225\n\010resource\030\003 \001(\0132#.go"
          + "ogle.cloud.gkehub.v1beta.Feature\022\030\n\nrequ"
          + "est_id\030\004 \001(\tB\004\342A\001\001\"M\n\024DeleteFeatureReque"
          + "st\022\014\n\004name\030\001 \001(\t\022\r\n\005force\030\002 \001(\010\022\030\n\nreque"
          + "st_id\030\003 \001(\tB\004\342A\001\001\"\246\001\n\024UpdateFeatureReque"
          + "st\022\014\n\004name\030\001 \001(\t\022/\n\013update_mask\030\002 \001(\0132\032."
          + "google.protobuf.FieldMask\0225\n\010resource\030\003 "
          + "\001(\0132#.google.cloud.gkehub.v1beta.Feature"
          + "\022\030\n\nrequest_id\030\004 \001(\tB\004\342A\001\001\"\200\002\n\021Operation"
          + "Metadata\0225\n\013create_time\030\001 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\004\342A\001\003\0222\n\010end_time\030\002 \001("
          + "\0132\032.google.protobuf.TimestampB\004\342A\001\003\022\024\n\006t"
          + "arget\030\003 \001(\tB\004\342A\001\003\022\022\n\004verb\030\004 \001(\tB\004\342A\001\003\022\033\n"
          + "\rstatus_detail\030\005 \001(\tB\004\342A\001\003\022\036\n\020cancel_req"
          + "uested\030\006 \001(\010B\004\342A\001\003\022\031\n\013api_version\030\007 \001(\tB"
          + "\004\342A\001\0032\304\010\n\006GkeHub\022\264\001\n\014ListFeatures\022/.goog"
          + "le.cloud.gkehub.v1beta.ListFeaturesReque"
          + "st\0320.google.cloud.gkehub.v1beta.ListFeat"
          + "uresResponse\"A\332A\006parent\202\323\344\223\0022\0220/v1beta/{"
          + "parent=projects/*/locations/*}/features\022"
          + "\241\001\n\nGetFeature\022-.google.cloud.gkehub.v1b"
          + "eta.GetFeatureRequest\032#.google.cloud.gke"
          + "hub.v1beta.Feature\"?\332A\004name\202\323\344\223\0022\0220/v1be"
          + "ta/{name=projects/*/locations/*/features"
          + "/*}\022\340\001\n\rCreateFeature\0220.google.cloud.gke"
          + "hub.v1beta.CreateFeatureRequest\032\035.google"
          + ".longrunning.Operation\"~\312A\034\n\007Feature\022\021Op"
          + "erationMetadata\332A\032parent,resource,featur"
          + "e_id\202\323\344\223\002<\"0/v1beta/{parent=projects/*/l"
          + "ocations/*}/features:\010resource\022\316\001\n\rDelet"
          + "eFeature\0220.google.cloud.gkehub.v1beta.De"
          + "leteFeatureRequest\032\035.google.longrunning."
          + "Operation\"l\312A*\n\025google.protobuf.Empty\022\021O"
          + "perationMetadata\332A\004name\202\323\344\223\0022*0/v1beta/{"
          + "name=projects/*/locations/*/features/*}\022"
          + "\337\001\n\rUpdateFeature\0220.google.cloud.gkehub."
          + "v1beta.UpdateFeatureRequest\032\035.google.lon"
          + "grunning.Operation\"}\312A\034\n\007Feature\022\021Operat"
          + "ionMetadata\332A\031name,resource,update_mask\202"
          + "\323\344\223\002<20/v1beta/{name=projects/*/location"
          + "s/*/features/*}:\010resource\032I\312A\025gkehub.goo"
          + "gleapis.com\322A.https://www.googleapis.com"
          + "/auth/cloud-platformB\302\001\n\036com.google.clou"
          + "d.gkehub.v1betaB\014ServiceProtoP\001Z6cloud.g"
          + "oogle.com/go/gkehub/apiv1beta/gkehubpb;g"
          + "kehubpb\252\002\032Google.Cloud.GkeHub.V1Beta\312\002\032G"
          + "oogle\\Cloud\\GkeHub\\V1beta\352\002\035Google::Clou"
          + "d::GkeHub::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.gkehub.v1beta.FeatureProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gkehub_v1beta_ListFeaturesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkehub_v1beta_ListFeaturesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_ListFeaturesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_gkehub_v1beta_ListFeaturesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkehub_v1beta_ListFeaturesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_ListFeaturesResponse_descriptor,
            new java.lang.String[] {
              "Resources", "NextPageToken",
            });
    internal_static_google_cloud_gkehub_v1beta_GetFeatureRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkehub_v1beta_GetFeatureRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_GetFeatureRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gkehub_v1beta_CreateFeatureRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkehub_v1beta_CreateFeatureRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_CreateFeatureRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FeatureId", "Resource", "RequestId",
            });
    internal_static_google_cloud_gkehub_v1beta_DeleteFeatureRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gkehub_v1beta_DeleteFeatureRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_DeleteFeatureRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force", "RequestId",
            });
    internal_static_google_cloud_gkehub_v1beta_UpdateFeatureRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gkehub_v1beta_UpdateFeatureRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_UpdateFeatureRequest_descriptor,
            new java.lang.String[] {
              "Name", "UpdateMask", "Resource", "RequestId",
            });
    internal_static_google_cloud_gkehub_v1beta_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gkehub_v1beta_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusDetail",
              "CancelRequested",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.gkehub.v1beta.FeatureProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
