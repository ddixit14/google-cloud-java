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
// source: google/devtools/artifactregistry/v1beta2/settings.proto

package com.google.devtools.artifactregistry.v1beta2;

public final class SettingsProto {
  private SettingsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_ProjectSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ProjectSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_GetProjectSettingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_GetProjectSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_UpdateProjectSettingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_UpdateProjectSettingsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/devtools/artifactregistry/v1bet"
          + "a2/settings.proto\022(google.devtools.artif"
          + "actregistry.v1beta2\032\037google/api/field_be"
          + "havior.proto\032\031google/api/resource.proto\032"
          + " google/protobuf/field_mask.proto\"\221\003\n\017Pr"
          + "ojectSettings\022\014\n\004name\030\001 \001(\t\022l\n\030legacy_re"
          + "direction_state\030\002 \001(\0162J.google.devtools."
          + "artifactregistry.v1beta2.ProjectSettings"
          + ".RedirectionState\"\247\001\n\020RedirectionState\022!"
          + "\n\035REDIRECTION_STATE_UNSPECIFIED\020\000\022$\n RED"
          + "IRECTION_FROM_GCR_IO_DISABLED\020\001\022#\n\037REDIR"
          + "ECTION_FROM_GCR_IO_ENABLED\020\002\022%\n!REDIRECT"
          + "ION_FROM_GCR_IO_FINALIZED\020\003:X\352AU\n/artifa"
          + "ctregistry.googleapis.com/ProjectSetting"
          + "s\022\"projects/{project}/projectSettings\"c\n"
          + "\031GetProjectSettingsRequest\022F\n\004name\030\001 \001(\t"
          + "B8\342A\001\002\372A1\n/artifactregistry.googleapis.c"
          + "om/ProjectSettings\"\244\001\n\034UpdateProjectSett"
          + "ingsRequest\022S\n\020project_settings\030\002 \001(\01329."
          + "google.devtools.artifactregistry.v1beta2"
          + ".ProjectSettings\022/\n\013update_mask\030\003 \001(\0132\032."
          + "google.protobuf.FieldMaskB\221\002\n,com.google"
          + ".devtools.artifactregistry.v1beta2B\rSett"
          + "ingsProtoP\001ZUcloud.google.com/go/artifac"
          + "tregistry/apiv1beta2/artifactregistrypb;"
          + "artifactregistrypb\252\002%Google.Cloud.Artifa"
          + "ctRegistry.V1Beta2\312\002%Google\\Cloud\\Artifa"
          + "ctRegistry\\V1beta2\352\002(Google::Cloud::Arti"
          + "factRegistry::V1beta2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1beta2_ProjectSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1beta2_ProjectSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_ProjectSettings_descriptor,
            new java.lang.String[] {
              "Name", "LegacyRedirectionState",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_GetProjectSettingsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1beta2_GetProjectSettingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_GetProjectSettingsRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_UpdateProjectSettingsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1beta2_UpdateProjectSettingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_UpdateProjectSettingsRequest_descriptor,
            new java.lang.String[] {
              "ProjectSettings", "UpdateMask",
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
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
