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
// source: google/devtools/clouderrorreporting/v1beta1/report_errors_service.proto

package com.google.devtools.clouderrorreporting.v1beta1;

public final class ReportErrorsServiceProto {
  private ReportErrorsServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/devtools/clouderrorreporting/v1"
          + "beta1/report_errors_service.proto\022+googl"
          + "e.devtools.clouderrorreporting.v1beta1\032\034"
          + "google/api/annotations.proto\032\027google/api"
          + "/client.proto\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\0328googl"
          + "e/devtools/clouderrorreporting/v1beta1/c"
          + "ommon.proto\032\037google/protobuf/timestamp.p"
          + "roto\"\273\001\n\027ReportErrorEventRequest\022J\n\014proj"
          + "ect_name\030\001 \001(\tB4\342A\001\002\372A-\n+cloudresourcema"
          + "nager.googleapis.com/Project\022T\n\005event\030\002 "
          + "\001(\0132?.google.devtools.clouderrorreportin"
          + "g.v1beta1.ReportedErrorEventB\004\342A\001\002\"\032\n\030Re"
          + "portErrorEventResponse\"\217\002\n\022ReportedError"
          + "Event\0224\n\nevent_time\030\001 \001(\0132\032.google.proto"
          + "buf.TimestampB\004\342A\001\001\022Z\n\017service_context\030\002"
          + " \001(\0132;.google.devtools.clouderrorreporti"
          + "ng.v1beta1.ServiceContextB\004\342A\001\002\022\025\n\007messa"
          + "ge\030\003 \001(\tB\004\342A\001\002\022P\n\007context\030\004 \001(\01329.google"
          + ".devtools.clouderrorreporting.v1beta1.Er"
          + "rorContextB\004\342A\001\0012\345\002\n\023ReportErrorsService"
          + "\022\365\001\n\020ReportErrorEvent\022D.google.devtools."
          + "clouderrorreporting.v1beta1.ReportErrorE"
          + "ventRequest\032E.google.devtools.clouderror"
          + "reporting.v1beta1.ReportErrorEventRespon"
          + "se\"T\332A\022project_name,event\202\323\344\223\0029\"0/v1beta"
          + "1/{project_name=projects/*}/events:repor"
          + "t:\005event\032V\312A\"clouderrorreporting.googlea"
          + "pis.com\322A.https://www.googleapis.com/aut"
          + "h/cloud-platformB\226\002\n/com.google.devtools"
          + ".clouderrorreporting.v1beta1B\030ReportErro"
          + "rsServiceProtoP\001ZOcloud.google.com/go/er"
          + "rorreporting/apiv1beta1/errorreportingpb"
          + ";errorreportingpb\370\001\001\252\002#Google.Cloud.Erro"
          + "rReporting.V1Beta1\312\002#Google\\Cloud\\ErrorR"
          + "eporting\\V1beta1\352\002&Google::Cloud::ErrorR"
          + "eporting::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.devtools.clouderrorreporting.v1beta1.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_descriptor,
            new java.lang.String[] {
              "ProjectName", "Event",
            });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_descriptor,
            new java.lang.String[] {
              "EventTime", "ServiceContext", "Message", "Context",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.devtools.clouderrorreporting.v1beta1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
