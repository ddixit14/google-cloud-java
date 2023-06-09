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
// source: google/cloud/recommendationengine/v1beta1/prediction_service.proto

package com.google.cloud.recommendationengine.v1beta1;

public final class PredictionServiceOuterClass {
  private PredictionServiceOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_ParamsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_PredictionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_PredictionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_PredictionResult_ItemMetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_PredictionResult_ItemMetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/cloud/recommendationengine/v1be"
          + "ta1/prediction_service.proto\022)google.clo"
          + "ud.recommendationengine.v1beta1\032\034google/"
          + "api/annotations.proto\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\032:google/cloud/recommendationengine/v1b"
          + "eta1/user_event.proto\032\034google/protobuf/s"
          + "truct.proto\032\027google/api/client.proto\"\266\004\n"
          + "\016PredictRequest\022D\n\004name\030\001 \001(\tB6\342A\001\002\372A/\n-"
          + "recommendationengine.googleapis.com/Plac"
          + "ement\022N\n\nuser_event\030\002 \001(\01324.google.cloud"
          + ".recommendationengine.v1beta1.UserEventB"
          + "\004\342A\001\002\022\027\n\tpage_size\030\007 \001(\005B\004\342A\001\001\022\030\n\npage_t"
          + "oken\030\010 \001(\tB\004\342A\001\001\022\024\n\006filter\030\003 \001(\tB\004\342A\001\001\022\025"
          + "\n\007dry_run\030\004 \001(\010B\004\342A\001\001\022[\n\006params\030\006 \003(\0132E."
          + "google.cloud.recommendationengine.v1beta"
          + "1.PredictRequest.ParamsEntryB\004\342A\001\001\022[\n\006la"
          + "bels\030\t \003(\0132E.google.cloud.recommendation"
          + "engine.v1beta1.PredictRequest.LabelsEntr"
          + "yB\004\342A\001\001\032E\n\013ParamsEntry\022\013\n\003key\030\001 \001(\t\022%\n\005v"
          + "alue\030\002 \001(\0132\026.google.protobuf.Value:\0028\001\032-"
          + "\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001("
          + "\t:\0028\001\"\342\004\n\017PredictResponse\022\\\n\007results\030\001 \003"
          + "(\0132K.google.cloud.recommendationengine.v"
          + "1beta1.PredictResponse.PredictionResult\022"
          + "\034\n\024recommendation_token\030\002 \001(\t\022 \n\030items_m"
          + "issing_in_catalog\030\003 \003(\t\022\017\n\007dry_run\030\004 \001(\010"
          + "\022Z\n\010metadata\030\005 \003(\0132H.google.cloud.recomm"
          + "endationengine.v1beta1.PredictResponse.M"
          + "etadataEntry\022\027\n\017next_page_token\030\006 \001(\t\032\341\001"
          + "\n\020PredictionResult\022\n\n\002id\030\001 \001(\t\022t\n\ritem_m"
          + "etadata\030\002 \003(\0132].google.cloud.recommendat"
          + "ionengine.v1beta1.PredictResponse.Predic"
          + "tionResult.ItemMetadataEntry\032K\n\021ItemMeta"
          + "dataEntry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026."
          + "google.protobuf.Value:\0028\001\032G\n\rMetadataEnt"
          + "ry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.google."
          + "protobuf.Value:\0028\0012\342\002\n\021PredictionService"
          + "\022\363\001\n\007Predict\0229.google.cloud.recommendati"
          + "onengine.v1beta1.PredictRequest\032:.google"
          + ".cloud.recommendationengine.v1beta1.Pred"
          + "ictResponse\"q\332A\017name,user_event\202\323\344\223\002Y\"T/"
          + "v1beta1/{name=projects/*/locations/*/cat"
          + "alogs/*/eventStores/*/placements/*}:pred"
          + "ict:\001*\032W\312A#recommendationengine.googleap"
          + "is.com\322A.https://www.googleapis.com/auth"
          + "/cloud-platformB\243\002\n-com.google.cloud.rec"
          + "ommendationengine.v1beta1P\001Zacloud.googl"
          + "e.com/go/recommendationengine/apiv1beta1"
          + "/recommendationenginepb;recommendationen"
          + "ginepb\242\002\005RECAI\252\002)Google.Cloud.Recommenda"
          + "tionEngine.V1Beta1\312\002)Google\\Cloud\\Recomm"
          + "endationEngine\\V1beta1\352\002,Google::Cloud::"
          + "RecommendationEngine::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.recommendationengine.v1beta1.UserEventOuterClass.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_descriptor,
            new java.lang.String[] {
              "Name", "UserEvent", "PageSize", "PageToken", "Filter", "DryRun", "Params", "Labels",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_ParamsEntry_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_ParamsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_ParamsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_LabelsEntry_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PredictRequest_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_descriptor,
            new java.lang.String[] {
              "Results",
              "RecommendationToken",
              "ItemsMissingInCatalog",
              "DryRun",
              "Metadata",
              "NextPageToken",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_PredictionResult_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_PredictionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_PredictionResult_descriptor,
            new java.lang.String[] {
              "Id", "ItemMetadata",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_PredictionResult_ItemMetadataEntry_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_PredictionResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_PredictionResult_ItemMetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_PredictionResult_ItemMetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_MetadataEntry_descriptor =
        internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PredictResponse_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.recommendationengine.v1beta1.UserEventOuterClass.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
