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
// source: google/cloud/aiplatform/v1/feature.proto

package com.google.cloud.aiplatform.v1;

public final class FeatureProto {
  private FeatureProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Feature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Feature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Feature_MonitoringStatsAnomaly_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Feature_MonitoringStatsAnomaly_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Feature_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Feature_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/aiplatform/v1/feature.pro"
          + "to\022\032google.cloud.aiplatform.v1\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\0329google/cloud/aiplatform/v1/f"
          + "eature_monitoring_stats.proto\032\037google/pr"
          + "otobuf/timestamp.proto\"\346\010\n\007Feature\022\022\n\004na"
          + "me\030\001 \001(\tB\004\342A\001\005\022\023\n\013description\030\002 \001(\t\022H\n\nv"
          + "alue_type\030\003 \001(\0162-.google.cloud.aiplatfor"
          + "m.v1.Feature.ValueTypeB\005\342A\002\002\005\0225\n\013create_"
          + "time\030\004 \001(\0132\032.google.protobuf.TimestampB\004"
          + "\342A\001\003\0225\n\013update_time\030\005 \001(\0132\032.google.proto"
          + "buf.TimestampB\004\342A\001\003\022E\n\006labels\030\006 \003(\0132/.go"
          + "ogle.cloud.aiplatform.v1.Feature.LabelsE"
          + "ntryB\004\342A\001\001\022\014\n\004etag\030\007 \001(\t\022 \n\022disable_moni"
          + "toring\030\014 \001(\010B\004\342A\001\001\022d\n\032monitoring_stats_a"
          + "nomalies\030\013 \003(\0132:.google.cloud.aiplatform"
          + ".v1.Feature.MonitoringStatsAnomalyB\004\342A\001\003"
          + "\032\251\002\n\026MonitoringStatsAnomaly\022]\n\tobjective"
          + "\030\001 \001(\0162D.google.cloud.aiplatform.v1.Feat"
          + "ure.MonitoringStatsAnomaly.ObjectiveB\004\342A"
          + "\001\003\022T\n\025feature_stats_anomaly\030\002 \001(\0132/.goog"
          + "le.cloud.aiplatform.v1.FeatureStatsAnoma"
          + "lyB\004\342A\001\003\"Z\n\tObjective\022\031\n\025OBJECTIVE_UNSPE"
          + "CIFIED\020\000\022\033\n\027IMPORT_FEATURE_ANALYSIS\020\001\022\025\n"
          + "\021SNAPSHOT_ANALYSIS\020\002\032-\n\013LabelsEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\244\001\n\tValueTyp"
          + "e\022\032\n\026VALUE_TYPE_UNSPECIFIED\020\000\022\010\n\004BOOL\020\001\022"
          + "\016\n\nBOOL_ARRAY\020\002\022\n\n\006DOUBLE\020\003\022\020\n\014DOUBLE_AR"
          + "RAY\020\004\022\t\n\005INT64\020\t\022\017\n\013INT64_ARRAY\020\n\022\n\n\006STR"
          + "ING\020\013\022\020\n\014STRING_ARRAY\020\014\022\t\n\005BYTES\020\r:\232\001\352A\226"
          + "\001\n!aiplatform.googleapis.com/Feature\022qpr"
          + "ojects/{project}/locations/{location}/fe"
          + "aturestores/{featurestore}/entityTypes/{"
          + "entity_type}/features/{feature}B\312\001\n\036com."
          + "google.cloud.aiplatform.v1B\014FeatureProto"
          + "P\001Z>cloud.google.com/go/aiplatform/apiv1"
          + "/aiplatformpb;aiplatformpb\252\002\032Google.Clou"
          + "d.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatfor"
          + "m\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.FeatureMonitoringStatsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Feature_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Feature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Feature_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "ValueType",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Etag",
              "DisableMonitoring",
              "MonitoringStatsAnomalies",
            });
    internal_static_google_cloud_aiplatform_v1_Feature_MonitoringStatsAnomaly_descriptor =
        internal_static_google_cloud_aiplatform_v1_Feature_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Feature_MonitoringStatsAnomaly_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Feature_MonitoringStatsAnomaly_descriptor,
            new java.lang.String[] {
              "Objective", "FeatureStatsAnomaly",
            });
    internal_static_google_cloud_aiplatform_v1_Feature_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Feature_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_Feature_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Feature_LabelsEntry_descriptor,
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
    com.google.cloud.aiplatform.v1.FeatureMonitoringStatsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
