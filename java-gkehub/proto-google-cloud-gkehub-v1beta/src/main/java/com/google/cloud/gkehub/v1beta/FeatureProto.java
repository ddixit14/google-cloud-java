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
// source: google/cloud/gkehub/v1beta/feature.proto

package com.google.cloud.gkehub.v1beta;

public final class FeatureProto {
  private FeatureProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_Feature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_Feature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_Feature_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_Feature_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_Feature_MembershipSpecsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_Feature_MembershipSpecsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_Feature_MembershipStatesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_Feature_MembershipStatesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_FeatureResourceState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_FeatureResourceState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_FeatureState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_FeatureState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_CommonFeatureSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_CommonFeatureSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_CommonFeatureState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_CommonFeatureState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_MembershipFeatureSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_MembershipFeatureSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta_MembershipFeatureState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta_MembershipFeatureState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/gkehub/v1beta/feature.pro"
          + "to\022\032google.cloud.gkehub.v1beta\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\032Bgoogle/cloud/gkehub/v1beta/c"
          + "onfigmanagement/configmanagement.proto\0322"
          + "google/cloud/gkehub/v1beta/metering/mete"
          + "ring.proto\032Hgoogle/cloud/gkehub/v1beta/m"
          + "ulticlusteringress/multiclusteringress.p"
          + "roto\032\037google/protobuf/timestamp.proto\"\370\007"
          + "\n\007Feature\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022?\n\006labels\030"
          + "\002 \003(\0132/.google.cloud.gkehub.v1beta.Featu"
          + "re.LabelsEntry\022N\n\016resource_state\030\003 \001(\01320"
          + ".google.cloud.gkehub.v1beta.FeatureResou"
          + "rceStateB\004\342A\001\003\022A\n\004spec\030\004 \001(\0132-.google.cl"
          + "oud.gkehub.v1beta.CommonFeatureSpecB\004\342A\001"
          + "\001\022X\n\020membership_specs\030\005 \003(\01328.google.clo"
          + "ud.gkehub.v1beta.Feature.MembershipSpecs"
          + "EntryB\004\342A\001\001\022C\n\005state\030\006 \001(\0132..google.clou"
          + "d.gkehub.v1beta.CommonFeatureStateB\004\342A\001\003"
          + "\022Z\n\021membership_states\030\007 \003(\01329.google.clo"
          + "ud.gkehub.v1beta.Feature.MembershipState"
          + "sEntryB\004\342A\001\003\0225\n\013create_time\030\010 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\004\342A\001\003\0225\n\013update_ti"
          + "me\030\t \001(\0132\032.google.protobuf.TimestampB\004\342A"
          + "\001\003\0225\n\013delete_time\030\n \001(\0132\032.google.protobu"
          + "f.TimestampB\004\342A\001\003\032-\n\013LabelsEntry\022\013\n\003key\030"
          + "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032i\n\024MembershipSp"
          + "ecsEntry\022\013\n\003key\030\001 \001(\t\022@\n\005value\030\002 \001(\01321.g"
          + "oogle.cloud.gkehub.v1beta.MembershipFeat"
          + "ureSpec:\0028\001\032k\n\025MembershipStatesEntry\022\013\n\003"
          + "key\030\001 \001(\t\022A\n\005value\030\002 \001(\01322.google.cloud."
          + "gkehub.v1beta.MembershipFeatureState:\0028\001"
          + ":^\352A[\n\035gkehub.googleapis.com/Feature\022:pr"
          + "ojects/{project}/locations/{location}/fe"
          + "atures/{feature}\"\312\001\n\024FeatureResourceStat"
          + "e\022E\n\005state\030\001 \001(\01626.google.cloud.gkehub.v"
          + "1beta.FeatureResourceState.State\"k\n\005Stat"
          + "e\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010ENABLING\020\001\022\n"
          + "\n\006ACTIVE\020\002\022\r\n\tDISABLING\020\003\022\014\n\010UPDATING\020\004\022"
          + "\024\n\020SERVICE_UPDATING\020\005\"\317\001\n\014FeatureState\022;"
          + "\n\004code\030\001 \001(\0162-.google.cloud.gkehub.v1bet"
          + "a.FeatureState.Code\022\023\n\013description\030\002 \001(\t"
          + "\022/\n\013update_time\030\003 \001(\0132\032.google.protobuf."
          + "Timestamp\"<\n\004Code\022\024\n\020CODE_UNSPECIFIED\020\000\022"
          + "\006\n\002OK\020\001\022\013\n\007WARNING\020\002\022\t\n\005ERROR\020\003\"\177\n\021Commo"
          + "nFeatureSpec\022Z\n\023multiclusteringress\030f \001("
          + "\0132;.google.cloud.gkehub.multiclusteringr"
          + "ess.v1beta.FeatureSpecH\000B\016\n\014feature_spec"
          + "\"S\n\022CommonFeatureState\022=\n\005state\030\001 \001(\0132(."
          + "google.cloud.gkehub.v1beta.FeatureStateB"
          + "\004\342A\001\003\"\200\001\n\025MembershipFeatureSpec\022W\n\020confi"
          + "gmanagement\030j \001(\0132;.google.cloud.gkehub."
          + "configmanagement.v1beta.MembershipSpecH\000"
          + "B\016\n\014feature_spec\"\206\002\n\026MembershipFeatureSt"
          + "ate\022H\n\010metering\030h \001(\01324.google.cloud.gke"
          + "hub.metering.v1beta.MembershipStateH\000\022X\n"
          + "\020configmanagement\030j \001(\0132<.google.cloud.g"
          + "kehub.configmanagement.v1beta.Membership"
          + "StateH\000\0227\n\005state\030\001 \001(\0132(.google.cloud.gk"
          + "ehub.v1beta.FeatureStateB\017\n\rfeature_stat"
          + "eB\302\001\n\036com.google.cloud.gkehub.v1betaB\014Fe"
          + "atureProtoP\001Z6cloud.google.com/go/gkehub"
          + "/apiv1beta/gkehubpb;gkehubpb\252\002\032Google.Cl"
          + "oud.GkeHub.V1Beta\312\002\032Google\\Cloud\\GkeHub\\"
          + "V1beta\352\002\035Google::Cloud::GkeHub::V1betab\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto.getDescriptor(),
              com.google.cloud.gkehub.metering.v1beta.MeteringProto.getDescriptor(),
              com.google.cloud.gkehub.multiclusteringress.v1beta.MultiClusterIngressProto
                  .getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gkehub_v1beta_Feature_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkehub_v1beta_Feature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_Feature_descriptor,
            new java.lang.String[] {
              "Name",
              "Labels",
              "ResourceState",
              "Spec",
              "MembershipSpecs",
              "State",
              "MembershipStates",
              "CreateTime",
              "UpdateTime",
              "DeleteTime",
            });
    internal_static_google_cloud_gkehub_v1beta_Feature_LabelsEntry_descriptor =
        internal_static_google_cloud_gkehub_v1beta_Feature_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkehub_v1beta_Feature_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_Feature_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gkehub_v1beta_Feature_MembershipSpecsEntry_descriptor =
        internal_static_google_cloud_gkehub_v1beta_Feature_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_gkehub_v1beta_Feature_MembershipSpecsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_Feature_MembershipSpecsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gkehub_v1beta_Feature_MembershipStatesEntry_descriptor =
        internal_static_google_cloud_gkehub_v1beta_Feature_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_gkehub_v1beta_Feature_MembershipStatesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_Feature_MembershipStatesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gkehub_v1beta_FeatureResourceState_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkehub_v1beta_FeatureResourceState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_FeatureResourceState_descriptor,
            new java.lang.String[] {
              "State",
            });
    internal_static_google_cloud_gkehub_v1beta_FeatureState_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkehub_v1beta_FeatureState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_FeatureState_descriptor,
            new java.lang.String[] {
              "Code", "Description", "UpdateTime",
            });
    internal_static_google_cloud_gkehub_v1beta_CommonFeatureSpec_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkehub_v1beta_CommonFeatureSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_CommonFeatureSpec_descriptor,
            new java.lang.String[] {
              "Multiclusteringress", "FeatureSpec",
            });
    internal_static_google_cloud_gkehub_v1beta_CommonFeatureState_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gkehub_v1beta_CommonFeatureState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_CommonFeatureState_descriptor,
            new java.lang.String[] {
              "State",
            });
    internal_static_google_cloud_gkehub_v1beta_MembershipFeatureSpec_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gkehub_v1beta_MembershipFeatureSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_MembershipFeatureSpec_descriptor,
            new java.lang.String[] {
              "Configmanagement", "FeatureSpec",
            });
    internal_static_google_cloud_gkehub_v1beta_MembershipFeatureState_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gkehub_v1beta_MembershipFeatureState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta_MembershipFeatureState_descriptor,
            new java.lang.String[] {
              "Metering", "Configmanagement", "State", "FeatureState",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto.getDescriptor();
    com.google.cloud.gkehub.metering.v1beta.MeteringProto.getDescriptor();
    com.google.cloud.gkehub.multiclusteringress.v1beta.MultiClusterIngressProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
