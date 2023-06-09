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
// source: google/cloud/notebooks/v1/diagnostic_config.proto

package com.google.cloud.notebooks.v1;

public final class DiagnosticConfigProto {
  private DiagnosticConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_notebooks_v1_DiagnosticConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_notebooks_v1_DiagnosticConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/notebooks/v1/diagnostic_c"
          + "onfig.proto\022\031google.cloud.notebooks.v1\032\037"
          + "google/api/field_behavior.proto\"\303\001\n\020Diag"
          + "nosticConfig\022\030\n\ngcs_bucket\030\001 \001(\tB\004\342A\001\002\022\033"
          + "\n\rrelative_path\030\002 \001(\tB\004\342A\001\001\022!\n\023repair_fl"
          + "ag_enabled\030\003 \001(\010B\004\342A\001\001\022)\n\033packet_capture"
          + "_flag_enabled\030\004 \001(\010B\004\342A\001\001\022*\n\034copy_home_f"
          + "iles_flag_enabled\030\005 \001(\010B\004\342A\001\001Bu\n\035com.goo"
          + "gle.cloud.notebooks.v1B\025DiagnosticConfig"
          + "ProtoP\001Z;cloud.google.com/go/notebooks/a"
          + "piv1/notebookspb;notebookspbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_notebooks_v1_DiagnosticConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_notebooks_v1_DiagnosticConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_notebooks_v1_DiagnosticConfig_descriptor,
            new java.lang.String[] {
              "GcsBucket",
              "RelativePath",
              "RepairFlagEnabled",
              "PacketCaptureFlagEnabled",
              "CopyHomeFilesFlagEnabled",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
