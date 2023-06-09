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
// source: google/devtools/artifactregistry/v1beta2/version.proto

package com.google.devtools.artifactregistry.v1beta2;

public final class VersionProto {
  private VersionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_Version_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_Version_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_GetVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_GetVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_DeleteVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_DeleteVersionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/devtools/artifactregistry/v1bet"
          + "a2/version.proto\022(google.devtools.artifa"
          + "ctregistry.v1beta2\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\0322"
          + "google/devtools/artifactregistry/v1beta2"
          + "/tag.proto\032\034google/protobuf/struct.proto"
          + "\032\037google/protobuf/timestamp.proto\"\235\003\n\007Ve"
          + "rsion\022\014\n\004name\030\001 \001(\t\022\023\n\013description\030\003 \001(\t"
          + "\022/\n\013create_time\030\005 \001(\0132\032.google.protobuf."
          + "Timestamp\022/\n\013update_time\030\006 \001(\0132\032.google."
          + "protobuf.Timestamp\022C\n\014related_tags\030\007 \003(\013"
          + "2-.google.devtools.artifactregistry.v1be"
          + "ta2.Tag\022/\n\010metadata\030\010 \001(\0132\027.google.proto"
          + "buf.StructB\004\342A\001\003:\226\001\352A\222\001\n\'artifactregistr"
          + "y.googleapis.com/Version\022gprojects/{proj"
          + "ect}/locations/{location}/repositories/{"
          + "repository}/packages/{package}/versions/"
          + "{version}\"\251\001\n\023ListVersionsRequest\022\016\n\006par"
          + "ent\030\001 \001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_tok"
          + "en\030\003 \001(\t\022C\n\004view\030\004 \001(\01625.google.devtools"
          + ".artifactregistry.v1beta2.VersionView\022\026\n"
          + "\010order_by\030\005 \001(\tB\004\342A\001\001\"t\n\024ListVersionsRes"
          + "ponse\022C\n\010versions\030\001 \003(\01321.google.devtool"
          + "s.artifactregistry.v1beta2.Version\022\027\n\017ne"
          + "xt_page_token\030\002 \001(\t\"f\n\021GetVersionRequest"
          + "\022\014\n\004name\030\001 \001(\t\022C\n\004view\030\002 \001(\01625.google.de"
          + "vtools.artifactregistry.v1beta2.VersionV"
          + "iew\"3\n\024DeleteVersionRequest\022\014\n\004name\030\001 \001("
          + "\t\022\r\n\005force\030\002 \001(\010*@\n\013VersionView\022\034\n\030VERSI"
          + "ON_VIEW_UNSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\010\n\004FULL"
          + "\020\002B\220\002\n,com.google.devtools.artifactregis"
          + "try.v1beta2B\014VersionProtoP\001ZUcloud.googl"
          + "e.com/go/artifactregistry/apiv1beta2/art"
          + "ifactregistrypb;artifactregistrypb\252\002%Goo"
          + "gle.Cloud.ArtifactRegistry.V1Beta2\312\002%Goo"
          + "gle\\Cloud\\ArtifactRegistry\\V1beta2\352\002(Goo"
          + "gle::Cloud::ArtifactRegistry::V1beta2b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.devtools.artifactregistry.v1beta2.TagProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1beta2_Version_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1beta2_Version_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_Version_descriptor,
            new java.lang.String[] {
              "Name", "Description", "CreateTime", "UpdateTime", "RelatedTags", "Metadata",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "View", "OrderBy",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_ListVersionsResponse_descriptor,
            new java.lang.String[] {
              "Versions", "NextPageToken",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_GetVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1beta2_GetVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_GetVersionRequest_descriptor,
            new java.lang.String[] {
              "Name", "View",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_DeleteVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1beta2_DeleteVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_DeleteVersionRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.devtools.artifactregistry.v1beta2.TagProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
