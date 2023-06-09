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
// source: google/monitoring/dashboard/v1/metrics.proto

package com.google.monitoring.dashboard.v1;

public final class MetricsProto {
  private MetricsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_TimeSeriesQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TimeSeriesQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_TimeSeriesFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TimeSeriesFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_RatioPart_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_RatioPart_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_Threshold_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_Threshold_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/monitoring/dashboard/v1/metrics"
          + ".proto\022\036google.monitoring.dashboard.v1\032\037"
          + "google/api/field_behavior.proto\032+google/"
          + "monitoring/dashboard/v1/common.proto\"\237\002\n"
          + "\017TimeSeriesQuery\022N\n\022time_series_filter\030\001"
          + " \001(\01320.google.monitoring.dashboard.v1.Ti"
          + "meSeriesFilterH\000\022Y\n\030time_series_filter_r"
          + "atio\030\002 \001(\01325.google.monitoring.dashboard"
          + ".v1.TimeSeriesFilterRatioH\000\022$\n\032time_seri"
          + "es_query_language\030\003 \001(\tH\000\022\032\n\020prometheus_"
          + "query\030\006 \001(\tH\000\022\025\n\runit_override\030\005 \001(\tB\010\n\006"
          + "source\"\213\003\n\020TimeSeriesFilter\022\024\n\006filter\030\001 "
          + "\001(\tB\004\342A\001\002\022@\n\013aggregation\030\002 \001(\0132+.google."
          + "monitoring.dashboard.v1.Aggregation\022J\n\025s"
          + "econdary_aggregation\030\003 \001(\0132+.google.moni"
          + "toring.dashboard.v1.Aggregation\022W\n\027pick_"
          + "time_series_filter\030\004 \001(\01324.google.monito"
          + "ring.dashboard.v1.PickTimeSeriesFilterH\000"
          + "\022i\n\036statistical_time_series_filter\030\005 \001(\013"
          + "2;.google.monitoring.dashboard.v1.Statis"
          + "ticalTimeSeriesFilterB\002\030\001H\000B\017\n\routput_fi"
          + "lter\"\307\004\n\025TimeSeriesFilterRatio\022R\n\tnumera"
          + "tor\030\001 \001(\0132?.google.monitoring.dashboard."
          + "v1.TimeSeriesFilterRatio.RatioPart\022T\n\013de"
          + "nominator\030\002 \001(\0132?.google.monitoring.dash"
          + "board.v1.TimeSeriesFilterRatio.RatioPart"
          + "\022J\n\025secondary_aggregation\030\003 \001(\0132+.google"
          + ".monitoring.dashboard.v1.Aggregation\022W\n\027"
          + "pick_time_series_filter\030\004 \001(\01324.google.m"
          + "onitoring.dashboard.v1.PickTimeSeriesFil"
          + "terH\000\022i\n\036statistical_time_series_filter\030"
          + "\005 \001(\0132;.google.monitoring.dashboard.v1.S"
          + "tatisticalTimeSeriesFilterB\002\030\001H\000\032c\n\tRati"
          + "oPart\022\024\n\006filter\030\001 \001(\tB\004\342A\001\002\022@\n\013aggregati"
          + "on\030\002 \001(\0132+.google.monitoring.dashboard.v"
          + "1.AggregationB\017\n\routput_filter\"\252\003\n\tThres"
          + "hold\022\r\n\005label\030\001 \001(\t\022\r\n\005value\030\002 \001(\001\022>\n\005co"
          + "lor\030\003 \001(\0162/.google.monitoring.dashboard."
          + "v1.Threshold.Color\022F\n\tdirection\030\004 \001(\01623."
          + "google.monitoring.dashboard.v1.Threshold"
          + ".Direction\022I\n\013target_axis\030\005 \001(\01624.google"
          + ".monitoring.dashboard.v1.Threshold.Targe"
          + "tAxis\"3\n\005Color\022\025\n\021COLOR_UNSPECIFIED\020\000\022\n\n"
          + "\006YELLOW\020\004\022\007\n\003RED\020\006\"<\n\tDirection\022\031\n\025DIREC"
          + "TION_UNSPECIFIED\020\000\022\t\n\005ABOVE\020\001\022\t\n\005BELOW\020\002"
          + "\"9\n\nTargetAxis\022\033\n\027TARGET_AXIS_UNSPECIFIE"
          + "D\020\000\022\006\n\002Y1\020\001\022\006\n\002Y2\020\002*Q\n\016SparkChartType\022 \n"
          + "\034SPARK_CHART_TYPE_UNSPECIFIED\020\000\022\016\n\nSPARK"
          + "_LINE\020\001\022\r\n\tSPARK_BAR\020\002B\365\001\n\"com.google.mo"
          + "nitoring.dashboard.v1B\014MetricsProtoP\001ZFc"
          + "loud.google.com/go/monitoring/dashboard/"
          + "apiv1/dashboardpb;dashboardpb\252\002$Google.C"
          + "loud.Monitoring.Dashboard.V1\312\002$Google\\Cl"
          + "oud\\Monitoring\\Dashboard\\V1\352\002(Google::Cl"
          + "oud::Monitoring::Dashboard::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.CommonProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_TimeSeriesQuery_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_TimeSeriesQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_TimeSeriesQuery_descriptor,
            new java.lang.String[] {
              "TimeSeriesFilter",
              "TimeSeriesFilterRatio",
              "TimeSeriesQueryLanguage",
              "PrometheusQuery",
              "UnitOverride",
              "Source",
            });
    internal_static_google_monitoring_dashboard_v1_TimeSeriesFilter_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_dashboard_v1_TimeSeriesFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_TimeSeriesFilter_descriptor,
            new java.lang.String[] {
              "Filter",
              "Aggregation",
              "SecondaryAggregation",
              "PickTimeSeriesFilter",
              "StatisticalTimeSeriesFilter",
              "OutputFilter",
            });
    internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_descriptor,
            new java.lang.String[] {
              "Numerator",
              "Denominator",
              "SecondaryAggregation",
              "PickTimeSeriesFilter",
              "StatisticalTimeSeriesFilter",
              "OutputFilter",
            });
    internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_RatioPart_descriptor =
        internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_RatioPart_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_TimeSeriesFilterRatio_RatioPart_descriptor,
            new java.lang.String[] {
              "Filter", "Aggregation",
            });
    internal_static_google_monitoring_dashboard_v1_Threshold_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_dashboard_v1_Threshold_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_Threshold_descriptor,
            new java.lang.String[] {
              "Label", "Value", "Color", "Direction", "TargetAxis",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.monitoring.dashboard.v1.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
