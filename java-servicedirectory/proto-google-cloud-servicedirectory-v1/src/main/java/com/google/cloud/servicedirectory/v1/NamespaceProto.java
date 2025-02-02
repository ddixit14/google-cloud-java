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
// source: google/cloud/servicedirectory/v1/namespace.proto

package com.google.cloud.servicedirectory.v1;

public final class NamespaceProto {
  private NamespaceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicedirectory_v1_Namespace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1_Namespace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicedirectory_v1_Namespace_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1_Namespace_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/servicedirectory/v1/names"
          + "pace.proto\022 google.cloud.servicedirector"
          + "y.v1\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\"\215\002\n\tNamespace\022\022"
          + "\n\004name\030\001 \001(\tB\004\342A\001\005\022M\n\006labels\030\002 \003(\01327.goo"
          + "gle.cloud.servicedirectory.v1.Namespace."
          + "LabelsEntryB\004\342A\001\001\032-\n\013LabelsEntry\022\013\n\003key\030"
          + "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:n\352Ak\n)servicedi"
          + "rectory.googleapis.com/Namespace\022>projec"
          + "ts/{project}/locations/{location}/namesp"
          + "aces/{namespace}B\371\001\n$com.google.cloud.se"
          + "rvicedirectory.v1B\016NamespaceProtoP\001ZPclo"
          + "ud.google.com/go/servicedirectory/apiv1/"
          + "servicedirectorypb;servicedirectorypb\370\001\001"
          + "\252\002 Google.Cloud.ServiceDirectory.V1\312\002 Go"
          + "ogle\\Cloud\\ServiceDirectory\\V1\352\002#Google:"
          + ":Cloud::ServiceDirectory::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_servicedirectory_v1_Namespace_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1_Namespace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicedirectory_v1_Namespace_descriptor,
            new java.lang.String[] {
              "Name", "Labels",
            });
    internal_static_google_cloud_servicedirectory_v1_Namespace_LabelsEntry_descriptor =
        internal_static_google_cloud_servicedirectory_v1_Namespace_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_servicedirectory_v1_Namespace_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicedirectory_v1_Namespace_LabelsEntry_descriptor,
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
