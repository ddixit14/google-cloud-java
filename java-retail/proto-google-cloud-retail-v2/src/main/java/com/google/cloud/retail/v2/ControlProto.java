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
// source: google/cloud/retail/v2/control.proto

package com.google.cloud.retail.v2;

public final class ControlProto {
  private ControlProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_Control_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_Control_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/cloud/retail/v2/control.proto\022\026"
          + "google.cloud.retail.v2\032\037google/api/field"
          + "_behavior.proto\032\031google/api/resource.pro"
          + "to\032#google/cloud/retail/v2/common.proto\""
          + "\250\003\n\007Control\022,\n\004rule\030\004 \001(\0132\034.google.cloud"
          + ".retail.v2.RuleH\000\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\022\032\n"
          + "\014display_name\030\002 \001(\tB\004\342A\001\002\022+\n\035associated_"
          + "serving_config_ids\030\005 \003(\tB\004\342A\001\003\022C\n\016soluti"
          + "on_types\030\006 \003(\0162$.google.cloud.retail.v2."
          + "SolutionTypeB\005\342A\002\002\005\022O\n\030search_solution_u"
          + "se_case\030\007 \003(\0162-.google.cloud.retail.v2.S"
          + "earchSolutionUseCase:q\352An\n\035retail.google"
          + "apis.com/Control\022Mprojects/{project}/loc"
          + "ations/{location}/catalogs/{catalog}/con"
          + "trols/{control}B\t\n\007controlB\267\001\n\032com.googl"
          + "e.cloud.retail.v2B\014ControlProtoP\001Z2cloud"
          + ".google.com/go/retail/apiv2/retailpb;ret"
          + "ailpb\242\002\006RETAIL\252\002\026Google.Cloud.Retail.V2\312"
          + "\002\026Google\\Cloud\\Retail\\V2\352\002\031Google::Cloud"
          + "::Retail::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2.CommonProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_Control_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_Control_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_Control_descriptor,
            new java.lang.String[] {
              "Rule",
              "Name",
              "DisplayName",
              "AssociatedServingConfigIds",
              "SolutionTypes",
              "SearchSolutionUseCase",
              "Control",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
