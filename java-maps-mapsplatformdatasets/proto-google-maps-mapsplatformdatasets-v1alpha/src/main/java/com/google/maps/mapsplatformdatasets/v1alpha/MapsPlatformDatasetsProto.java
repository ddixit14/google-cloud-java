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
// source: google/maps/mapsplatformdatasets/v1alpha/maps_platform_datasets.proto

package com.google.maps.mapsplatformdatasets.v1alpha;

public final class MapsPlatformDatasetsProto {
  private MapsPlatformDatasetsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_mapsplatformdatasets_v1alpha_CreateDatasetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_mapsplatformdatasets_v1alpha_CreateDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_mapsplatformdatasets_v1alpha_UpdateDatasetMetadataRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_mapsplatformdatasets_v1alpha_UpdateDatasetMetadataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_mapsplatformdatasets_v1alpha_GetDatasetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_mapsplatformdatasets_v1alpha_GetDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetVersionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetVersionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_mapsplatformdatasets_v1alpha_DeleteDatasetRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_mapsplatformdatasets_v1alpha_DeleteDatasetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_mapsplatformdatasets_v1alpha_DeleteDatasetVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_mapsplatformdatasets_v1alpha_DeleteDatasetVersionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/maps/mapsplatformdatasets/v1alp"
          + "ha/maps_platform_datasets.proto\022(google."
          + "maps.mapsplatformdatasets.v1alpha\032\037googl"
          + "e/api/field_behavior.proto\032\031google/api/r"
          + "esource.proto\0326google/maps/mapsplatformd"
          + "atasets/v1alpha/dataset.proto\032 google/pr"
          + "otobuf/field_mask.proto\"\246\001\n\024CreateDatase"
          + "tRequest\022D\n\006parent\030\001 \001(\tB4\342A\001\002\372A-\n+cloud"
          + "resourcemanager.googleapis.com/Project\022H"
          + "\n\007dataset\030\002 \001(\01321.google.maps.mapsplatfo"
          + "rmdatasets.v1alpha.DatasetB\004\342A\001\002\"\231\001\n\034Upd"
          + "ateDatasetMetadataRequest\022H\n\007dataset\030\001 \001"
          + "(\01321.google.maps.mapsplatformdatasets.v1"
          + "alpha.DatasetB\004\342A\001\002\022/\n\013update_mask\030\002 \001(\013"
          + "2\032.google.protobuf.FieldMask\"\241\001\n\021GetData"
          + "setRequest\022B\n\004name\030\001 \001(\tB4\342A\001\002\372A-\n+mapsp"
          + "latformdatasets.googleapis.com/Dataset\022H"
          + "\n\017published_usage\030\002 \001(\0162/.google.maps.ma"
          + "psplatformdatasets.v1alpha.Usage\"\207\001\n\032Lis"
          + "tDatasetVersionsRequest\022B\n\004name\030\001 \001(\tB4\342"
          + "A\001\002\372A-\n+mapsplatformdatasets.googleapis."
          + "com/Dataset\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_t"
          + "oken\030\003 \001(\t\"{\n\033ListDatasetVersionsRespons"
          + "e\022C\n\010datasets\030\001 \003(\01321.google.maps.mapspl"
          + "atformdatasets.v1alpha.Dataset\022\027\n\017next_p"
          + "age_token\030\002 \001(\t\"\202\001\n\023ListDatasetsRequest\022"
          + "D\n\006parent\030\001 \001(\tB4\342A\001\002\372A-\n+cloudresourcem"
          + "anager.googleapis.com/Project\022\021\n\tpage_si"
          + "ze\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"t\n\024ListData"
          + "setsResponse\022C\n\010datasets\030\001 \003(\01321.google."
          + "maps.mapsplatformdatasets.v1alpha.Datase"
          + "t\022\027\n\017next_page_token\030\002 \001(\t\"i\n\024DeleteData"
          + "setRequest\022B\n\004name\030\001 \001(\tB4\342A\001\002\372A-\n+mapsp"
          + "latformdatasets.googleapis.com/Dataset\022\r"
          + "\n\005force\030\002 \001(\010\"a\n\033DeleteDatasetVersionReq"
          + "uest\022B\n\004name\030\001 \001(\tB4\342A\001\002\372A-\n+mapsplatfor"
          + "mdatasets.googleapis.com/DatasetB\211\002\n,com"
          + ".google.maps.mapsplatformdatasets.v1alph"
          + "aB\031MapsPlatformDatasetsProtoP\001Zfcloud.go"
          + "ogle.com/go/maps/mapsplatformdatasets/ap"
          + "iv1alpha/mapsplatformdatasetspb;mapsplat"
          + "formdatasetspb\252\002(Google.Maps.MapsPlatfor"
          + "mDatasets.V1Alpha\312\002(Google\\Maps\\MapsPlat"
          + "formDatasets\\V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.maps.mapsplatformdatasets.v1alpha.DatasetProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_maps_mapsplatformdatasets_v1alpha_CreateDatasetRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_mapsplatformdatasets_v1alpha_CreateDatasetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_mapsplatformdatasets_v1alpha_CreateDatasetRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Dataset",
            });
    internal_static_google_maps_mapsplatformdatasets_v1alpha_UpdateDatasetMetadataRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_maps_mapsplatformdatasets_v1alpha_UpdateDatasetMetadataRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_mapsplatformdatasets_v1alpha_UpdateDatasetMetadataRequest_descriptor,
            new java.lang.String[] {
              "Dataset", "UpdateMask",
            });
    internal_static_google_maps_mapsplatformdatasets_v1alpha_GetDatasetRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_maps_mapsplatformdatasets_v1alpha_GetDatasetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_mapsplatformdatasets_v1alpha_GetDatasetRequest_descriptor,
            new java.lang.String[] {
              "Name", "PublishedUsage",
            });
    internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetVersionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetVersionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetVersionsRequest_descriptor,
            new java.lang.String[] {
              "Name", "PageSize", "PageToken",
            });
    internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetVersionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetVersionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetVersionsResponse_descriptor,
            new java.lang.String[] {
              "Datasets", "NextPageToken",
            });
    internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_mapsplatformdatasets_v1alpha_ListDatasetsResponse_descriptor,
            new java.lang.String[] {
              "Datasets", "NextPageToken",
            });
    internal_static_google_maps_mapsplatformdatasets_v1alpha_DeleteDatasetRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_maps_mapsplatformdatasets_v1alpha_DeleteDatasetRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_mapsplatformdatasets_v1alpha_DeleteDatasetRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_maps_mapsplatformdatasets_v1alpha_DeleteDatasetVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_maps_mapsplatformdatasets_v1alpha_DeleteDatasetVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_mapsplatformdatasets_v1alpha_DeleteDatasetVersionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.maps.mapsplatformdatasets.v1alpha.DatasetProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
