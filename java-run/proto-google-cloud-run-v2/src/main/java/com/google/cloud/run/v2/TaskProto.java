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
// source: google/cloud/run/v2/task.proto

package com.google.cloud.run.v2;

public final class TaskProto {
  private TaskProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_GetTaskRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_GetTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_ListTasksRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_ListTasksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_ListTasksResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_ListTasksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_Task_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_Task_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_Task_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_Task_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_Task_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_TaskAttemptResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_TaskAttemptResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\036google/cloud/run/v2/task.proto\022\023google"
          + ".cloud.run.v2\032\034google/api/annotations.pr"
          + "oto\032\027google/api/client.proto\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\032#google/cloud/run/v2/condition."
          + "proto\032!google/cloud/run/v2/k8s.min.proto"
          + "\032)google/cloud/run/v2/vendor_settings.pr"
          + "oto\032\036google/protobuf/duration.proto\032\037goo"
          + "gle/protobuf/timestamp.proto\032\027google/rpc"
          + "/status.proto\"@\n\016GetTaskRequest\022.\n\004name\030"
          + "\001 \001(\tB \342A\001\002\372A\031\n\027run.googleapis.com/Task\""
          + "\201\001\n\020ListTasksRequest\0220\n\006parent\030\001 \001(\tB \342A"
          + "\001\002\372A\031\022\027run.googleapis.com/Task\022\021\n\tpage_s"
          + "ize\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\024\n\014show_de"
          + "leted\030\004 \001(\010\"V\n\021ListTasksResponse\022(\n\005task"
          + "s\030\001 \003(\0132\031.google.cloud.run.v2.Task\022\027\n\017ne"
          + "xt_page_token\030\002 \001(\t\"\227\014\n\004Task\022\022\n\004name\030\001 \001"
          + "(\tB\004\342A\001\003\022\021\n\003uid\030\002 \001(\tB\004\342A\001\003\022\030\n\ngeneratio"
          + "n\030\003 \001(\003B\004\342A\001\003\022;\n\006labels\030\004 \003(\0132%.google.c"
          + "loud.run.v2.Task.LabelsEntryB\004\342A\001\003\022E\n\013an"
          + "notations\030\005 \003(\0132*.google.cloud.run.v2.Ta"
          + "sk.AnnotationsEntryB\004\342A\001\003\0225\n\013create_time"
          + "\030\006 \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003"
          + "\0224\n\nstart_time\030\033 \001(\0132\032.google.protobuf.T"
          + "imestampB\004\342A\001\003\0229\n\017completion_time\030\007 \001(\0132"
          + "\032.google.protobuf.TimestampB\004\342A\001\003\0225\n\013upd"
          + "ate_time\030\010 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\004\342A\001\003\0225\n\013delete_time\030\t \001(\0132\032.google.p"
          + "rotobuf.TimestampB\004\342A\001\003\0225\n\013expire_time\030\n"
          + " \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\022,"
          + "\n\003job\030\014 \001(\tB\037\342A\001\003\372A\030\n\026run.googleapis.com"
          + "/Job\0228\n\texecution\030\r \001(\tB%\342A\001\003\372A\036\n\034run.go"
          + "ogleapis.com/Execution\0222\n\ncontainers\030\016 \003"
          + "(\0132\036.google.cloud.run.v2.Container\022,\n\007vo"
          + "lumes\030\017 \003(\0132\033.google.cloud.run.v2.Volume"
          + "\022\023\n\013max_retries\030\020 \001(\005\022*\n\007timeout\030\021 \001(\0132\031"
          + ".google.protobuf.Duration\022\027\n\017service_acc"
          + "ount\030\022 \001(\t\022H\n\025execution_environment\030\024 \001("
          + "\0162).google.cloud.run.v2.ExecutionEnviron"
          + "ment\022\031\n\013reconciling\030\025 \001(\010B\004\342A\001\003\0228\n\ncondi"
          + "tions\030\026 \003(\0132\036.google.cloud.run.v2.Condit"
          + "ionB\004\342A\001\003\022!\n\023observed_generation\030\027 \001(\003B\004"
          + "\342A\001\003\022\023\n\005index\030\030 \001(\005B\004\342A\001\003\022\025\n\007retried\030\031 \001"
          + "(\005B\004\342A\001\003\022I\n\023last_attempt_result\030\032 \001(\0132&."
          + "google.cloud.run.v2.TaskAttemptResultB\004\342"
          + "A\001\003\022B\n\016encryption_key\030\034 \001(\tB*\342A\001\003\372A#\n!cl"
          + "oudkms.googleapis.com/CryptoKey\0228\n\nvpc_a"
          + "ccess\030\035 \001(\0132\036.google.cloud.run.v2.VpcAcc"
          + "essB\004\342A\001\003\022\025\n\007log_uri\030  \001(\tB\004\342A\001\003\022\033\n\rsati"
          + "sfies_pzs\030! \001(\010B\004\342A\001\003\022\022\n\004etag\030c \001(\tB\004\342A\001"
          + "\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001\0322\n\020AnnotationsEntry\022\013\n\003key\030\001 \001("
          + "\t\022\r\n\005value\030\002 \001(\t:\0028\001:w\352At\n\027run.googleapi"
          + "s.com/Task\022Vprojects/{project}/locations"
          + "/{location}/jobs/{job}/executions/{execu"
          + "tion}/tasks/{task}R\001\001\"V\n\021TaskAttemptResu"
          + "lt\022(\n\006status\030\001 \001(\0132\022.google.rpc.StatusB\004"
          + "\342A\001\003\022\027\n\texit_code\030\002 \001(\005B\004\342A\001\0032\226\003\n\005Tasks\022"
          + "\227\001\n\007GetTask\022#.google.cloud.run.v2.GetTas"
          + "kRequest\032\031.google.cloud.run.v2.Task\"L\332A\004"
          + "name\202\323\344\223\002?\022=/v2/{name=projects/*/locatio"
          + "ns/*/jobs/*/executions/*/tasks/*}\022\252\001\n\tLi"
          + "stTasks\022%.google.cloud.run.v2.ListTasksR"
          + "equest\032&.google.cloud.run.v2.ListTasksRe"
          + "sponse\"N\332A\006parent\202\323\344\223\002?\022=/v2/{parent=pro"
          + "jects/*/locations/*/jobs/*/executions/*}"
          + "/tasks\032F\312A\022run.googleapis.com\322A.https://"
          + "www.googleapis.com/auth/cloud-platformBQ"
          + "\n\027com.google.cloud.run.v2B\tTaskProtoP\001Z)"
          + "cloud.google.com/go/run/apiv2/runpb;runp"
          + "bb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.run.v2.ConditionProto.getDescriptor(),
              com.google.cloud.run.v2.K8sMinProto.getDescriptor(),
              com.google.cloud.run.v2.VendorSettingsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_run_v2_GetTaskRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_run_v2_GetTaskRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_GetTaskRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_run_v2_ListTasksRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_run_v2_ListTasksRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_ListTasksRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "ShowDeleted",
            });
    internal_static_google_cloud_run_v2_ListTasksResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_run_v2_ListTasksResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_ListTasksResponse_descriptor,
            new java.lang.String[] {
              "Tasks", "NextPageToken",
            });
    internal_static_google_cloud_run_v2_Task_descriptor = getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_run_v2_Task_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_Task_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "Generation",
              "Labels",
              "Annotations",
              "CreateTime",
              "StartTime",
              "CompletionTime",
              "UpdateTime",
              "DeleteTime",
              "ExpireTime",
              "Job",
              "Execution",
              "Containers",
              "Volumes",
              "MaxRetries",
              "Timeout",
              "ServiceAccount",
              "ExecutionEnvironment",
              "Reconciling",
              "Conditions",
              "ObservedGeneration",
              "Index",
              "Retried",
              "LastAttemptResult",
              "EncryptionKey",
              "VpcAccess",
              "LogUri",
              "SatisfiesPzs",
              "Etag",
            });
    internal_static_google_cloud_run_v2_Task_LabelsEntry_descriptor =
        internal_static_google_cloud_run_v2_Task_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_run_v2_Task_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_Task_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_run_v2_Task_AnnotationsEntry_descriptor =
        internal_static_google_cloud_run_v2_Task_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_run_v2_Task_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_Task_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_run_v2_TaskAttemptResult_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_run_v2_TaskAttemptResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_TaskAttemptResult_descriptor,
            new java.lang.String[] {
              "Status", "ExitCode",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.run.v2.ConditionProto.getDescriptor();
    com.google.cloud.run.v2.K8sMinProto.getDescriptor();
    com.google.cloud.run.v2.VendorSettingsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
