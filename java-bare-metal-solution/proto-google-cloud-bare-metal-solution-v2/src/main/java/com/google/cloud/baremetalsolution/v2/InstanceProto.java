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
// source: google/cloud/baremetalsolution/v2/instance.proto

package com.google.cloud.baremetalsolution.v2;

public final class InstanceProto {
  private InstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_GetInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListInstancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListInstancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_UpdateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_UpdateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ResetInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ResetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_StartInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_StartInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_StopInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_StopInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_LogicalInterface_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_LogicalInterface_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_StartInstanceResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_StartInstanceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_StopInstanceResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_StopInstanceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/baremetalsolution/v2/inst"
          + "ance.proto\022!google.cloud.baremetalsoluti"
          + "on.v2\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032+google/cloud/"
          + "baremetalsolution/v2/lun.proto\032/google/c"
          + "loud/baremetalsolution/v2/network.proto\032"
          + " google/protobuf/field_mask.proto\032\037googl"
          + "e/protobuf/timestamp.proto\"\257\007\n\010Instance\022"
          + "\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\n\n\002id\030\013 \001(\t\0225\n\013creat"
          + "e_time\030\002 \001(\0132\032.google.protobuf.Timestamp"
          + "B\004\342A\001\003\0225\n\013update_time\030\003 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\004\342A\001\003\022\024\n\014machine_type\030\004 "
          + "\001(\t\022@\n\005state\030\005 \001(\01621.google.cloud.bareme"
          + "talsolution.v2.Instance.State\022\036\n\026hyperth"
          + "reading_enabled\030\006 \001(\010\022G\n\006labels\030\007 \003(\01327."
          + "google.cloud.baremetalsolution.v2.Instan"
          + "ce.LabelsEntry\0224\n\004luns\030\010 \003(\0132&.google.cl"
          + "oud.baremetalsolution.v2.Lun\022<\n\010networks"
          + "\030\t \003(\0132*.google.cloud.baremetalsolution."
          + "v2.Network\022*\n\"interactive_serial_console"
          + "_enabled\030\n \001(\010\022\020\n\010os_image\030\014 \001(\t\022\021\n\003pod\030"
          + "\r \001(\tB\004\342A\001\005\022U\n\020network_template\030\016 \001(\tB;\372"
          + "A8\n6baremetalsolution.googleapis.com/Ser"
          + "verNetworkTemplate\022O\n\022logical_interfaces"
          + "\030\017 \003(\01323.google.cloud.baremetalsolution."
          + "v2.LogicalInterface\032-\n\013LabelsEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"J\n\005State\022\025\n\021S"
          + "TATE_UNSPECIFIED\020\000\022\020\n\014PROVISIONING\020\001\022\013\n\007"
          + "RUNNING\020\002\022\013\n\007DELETED\020\003:l\352Ai\n)baremetalso"
          + "lution.googleapis.com/Instance\022<projects"
          + "/{project}/locations/{location}/instance"
          + "s/{instance}\"V\n\022GetInstanceRequest\022@\n\004na"
          + "me\030\001 \001(\tB2\342A\001\002\372A+\n)baremetalsolution.goo"
          + "gleapis.com/Instance\"\211\001\n\024ListInstancesRe"
          + "quest\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\n!location"
          + "s.googleapis.com/Location\022\021\n\tpage_size\030\002"
          + " \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t"
          + "\"\205\001\n\025ListInstancesResponse\022>\n\tinstances\030"
          + "\001 \003(\0132+.google.cloud.baremetalsolution.v"
          + "2.Instance\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013u"
          + "nreachable\030\003 \003(\t\"\215\001\n\025UpdateInstanceReque"
          + "st\022C\n\010instance\030\001 \001(\0132+.google.cloud.bare"
          + "metalsolution.v2.InstanceB\004\342A\001\002\022/\n\013updat"
          + "e_mask\030\002 \001(\0132\032.google.protobuf.FieldMask"
          + "\"X\n\024ResetInstanceRequest\022@\n\004name\030\001 \001(\tB2"
          + "\342A\001\002\372A+\n)baremetalsolution.googleapis.co"
          + "m/Instance\"X\n\024StartInstanceRequest\022@\n\004na"
          + "me\030\001 \001(\tB2\342A\001\002\372A+\n)baremetalsolution.goo"
          + "gleapis.com/Instance\"W\n\023StopInstanceRequ"
          + "est\022@\n\004name\030\001 \001(\tB2\342A\001\002\372A+\n)baremetalsol"
          + "ution.googleapis.com/Instance\"\224\001\n\020Detach"
          + "LunRequest\022D\n\010instance\030\001 \001(\tB2\342A\001\002\372A+\n)b"
          + "aremetalsolution.googleapis.com/Instance"
          + "\022:\n\003lun\030\002 \001(\tB-\342A\001\002\372A&\n$baremetalsolutio"
          + "n.googleapis.com/Lun\"\255\004\n\025ServerNetworkTe"
          + "mplate\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022!\n\031applicable"
          + "_instance_types\030\002 \003(\t\022e\n\022logical_interfa"
          + "ces\030\003 \003(\0132I.google.cloud.baremetalsoluti"
          + "on.v2.ServerNetworkTemplate.LogicalInter"
          + "face\032\335\001\n\020LogicalInterface\022\014\n\004name\030\001 \001(\t\022"
          + "e\n\004type\030\002 \001(\0162W.google.cloud.baremetalso"
          + "lution.v2.ServerNetworkTemplate.LogicalI"
          + "nterface.InterfaceType\022\020\n\010required\030\003 \001(\010"
          + "\"B\n\rInterfaceType\022\036\n\032INTERFACE_TYPE_UNSP"
          + "ECIFIED\020\000\022\010\n\004BOND\020\001\022\007\n\003NIC\020\002:\225\001\352A\221\001\n6bar"
          + "emetalsolution.googleapis.com/ServerNetw"
          + "orkTemplate\022Wprojects/{project}/location"
          + "s/{location}/serverNetworkTemplate/{serv"
          + "er_network_template}\"\027\n\025StartInstanceRes"
          + "ponse\"\026\n\024StopInstanceResponseB\374\001\n%com.go"
          + "ogle.cloud.baremetalsolution.v2B\rInstanc"
          + "eProtoP\001ZScloud.google.com/go/baremetals"
          + "olution/apiv2/baremetalsolutionpb;bareme"
          + "talsolutionpb\252\002!Google.Cloud.BareMetalSo"
          + "lution.V2\312\002!Google\\Cloud\\BareMetalSoluti"
          + "on\\V2\352\002$Google::Cloud::BareMetalSolution"
          + "::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.LunProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.NetworkProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_baremetalsolution_v2_Instance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_baremetalsolution_v2_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_Instance_descriptor,
            new java.lang.String[] {
              "Name",
              "Id",
              "CreateTime",
              "UpdateTime",
              "MachineType",
              "State",
              "HyperthreadingEnabled",
              "Labels",
              "Luns",
              "Networks",
              "InteractiveSerialConsoleEnabled",
              "OsImage",
              "Pod",
              "NetworkTemplate",
              "LogicalInterfaces",
            });
    internal_static_google_cloud_baremetalsolution_v2_Instance_LabelsEntry_descriptor =
        internal_static_google_cloud_baremetalsolution_v2_Instance_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_baremetalsolution_v2_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_baremetalsolution_v2_GetInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_baremetalsolution_v2_GetInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_GetInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListInstancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_baremetalsolution_v2_ListInstancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListInstancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListInstancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_baremetalsolution_v2_ListInstancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListInstancesResponse_descriptor,
            new java.lang.String[] {
              "Instances", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_baremetalsolution_v2_UpdateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_baremetalsolution_v2_UpdateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_UpdateInstanceRequest_descriptor,
            new java.lang.String[] {
              "Instance", "UpdateMask",
            });
    internal_static_google_cloud_baremetalsolution_v2_ResetInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_baremetalsolution_v2_ResetInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ResetInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_StartInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_baremetalsolution_v2_StartInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_StartInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_StopInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_baremetalsolution_v2_StopInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_StopInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_descriptor,
            new java.lang.String[] {
              "Instance", "Lun",
            });
    internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_descriptor,
            new java.lang.String[] {
              "Name", "ApplicableInstanceTypes", "LogicalInterfaces",
            });
    internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_LogicalInterface_descriptor =
        internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_LogicalInterface_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_LogicalInterface_descriptor,
            new java.lang.String[] {
              "Name", "Type", "Required",
            });
    internal_static_google_cloud_baremetalsolution_v2_StartInstanceResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_baremetalsolution_v2_StartInstanceResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_StartInstanceResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_baremetalsolution_v2_StopInstanceResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_baremetalsolution_v2_StopInstanceResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_StopInstanceResponse_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.LunProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.NetworkProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
