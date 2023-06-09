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
// source: google/dataflow/v1beta3/environment.proto

package com.google.dataflow.v1beta3;

public final class EnvironmentProto {
  private EnvironmentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_Environment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_Package_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_Package_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_Disk_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_Disk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_WorkerSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_WorkerSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_TaskRunnerSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_TaskRunnerSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_AutoscalingSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_AutoscalingSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_SdkHarnessContainerImage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_SdkHarnessContainerImage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_WorkerPool_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_WorkerPool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_WorkerPool_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_WorkerPool_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_dataflow_v1beta3_DebugOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_dataflow_v1beta3_DebugOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/dataflow/v1beta3/environment.pr"
          + "oto\022\027google.dataflow.v1beta3\032\037google/api"
          + "/field_behavior.proto\032\031google/protobuf/a"
          + "ny.proto\032\034google/protobuf/struct.proto\"\320"
          + "\005\n\013Environment\022\033\n\023temp_storage_prefix\030\001 "
          + "\001(\t\022#\n\033cluster_manager_api_service\030\002 \001(\t"
          + "\022\023\n\013experiments\030\003 \003(\t\022\027\n\017service_options"
          + "\030\020 \003(\t\022\034\n\024service_kms_key_name\030\014 \001(\t\0229\n\014"
          + "worker_pools\030\004 \003(\0132#.google.dataflow.v1b"
          + "eta3.WorkerPool\022+\n\nuser_agent\030\005 \001(\0132\027.go"
          + "ogle.protobuf.Struct\022(\n\007version\030\006 \001(\0132\027."
          + "google.protobuf.Struct\022\017\n\007dataset\030\007 \001(\t\022"
          + "5\n\024sdk_pipeline_options\030\010 \001(\0132\027.google.p"
          + "rotobuf.Struct\0222\n\024internal_experiments\030\t"
          + " \001(\0132\024.google.protobuf.Any\022\035\n\025service_ac"
          + "count_email\030\n \001(\t\022Z\n\035flex_resource_sched"
          + "uling_goal\030\013 \001(\01623.google.dataflow.v1bet"
          + "a3.FlexResourceSchedulingGoal\022\025\n\rworker_"
          + "region\030\r \001(\t\022\023\n\013worker_zone\030\016 \001(\t\022@\n\014shu"
          + "ffle_mode\030\017 \001(\0162$.google.dataflow.v1beta"
          + "3.ShuffleModeB\004\342A\001\003\022<\n\rdebug_options\030\021 \001"
          + "(\0132%.google.dataflow.v1beta3.DebugOption"
          + "s\")\n\007Package\022\014\n\004name\030\001 \001(\t\022\020\n\010location\030\002"
          + " \001(\t\"?\n\004Disk\022\017\n\007size_gb\030\001 \001(\005\022\021\n\tdisk_ty"
          + "pe\030\002 \001(\t\022\023\n\013mount_point\030\003 \001(\t\"\241\001\n\016Worker"
          + "Settings\022\020\n\010base_url\030\001 \001(\t\022\031\n\021reporting_"
          + "enabled\030\002 \001(\010\022\024\n\014service_path\030\003 \001(\t\022\034\n\024s"
          + "huffle_service_path\030\004 \001(\t\022\021\n\tworker_id\030\005"
          + " \001(\t\022\033\n\023temp_storage_prefix\030\006 \001(\t\"\244\004\n\022Ta"
          + "skRunnerSettings\022\021\n\ttask_user\030\001 \001(\t\022\022\n\nt"
          + "ask_group\030\002 \001(\t\022\024\n\014oauth_scopes\030\003 \003(\t\022\020\n"
          + "\010base_url\030\004 \001(\t\022\034\n\024dataflow_api_version\030"
          + "\005 \001(\t\022I\n\030parallel_worker_settings\030\006 \001(\0132"
          + "\'.google.dataflow.v1beta3.WorkerSettings"
          + "\022\025\n\rbase_task_dir\030\007 \001(\t\022\035\n\025continue_on_e"
          + "xception\030\010 \001(\010\022\034\n\024log_to_serialconsole\030\t"
          + " \001(\010\022\027\n\017alsologtostderr\030\n \001(\010\022\033\n\023log_upl"
          + "oad_location\030\013 \001(\t\022\017\n\007log_dir\030\014 \001(\t\022\033\n\023t"
          + "emp_storage_prefix\030\r \001(\t\022\027\n\017harness_comm"
          + "and\030\016 \001(\t\022\032\n\022workflow_file_name\030\017 \001(\t\022\036\n"
          + "\026commandlines_file_name\030\020 \001(\t\022\r\n\005vm_id\030\021"
          + " \001(\t\022\025\n\rlanguage_hint\030\022 \001(\t\022#\n\033streaming"
          + "_worker_main_class\030\023 \001(\t\"p\n\023AutoscalingS"
          + "ettings\022@\n\talgorithm\030\001 \001(\0162-.google.data"
          + "flow.v1beta3.AutoscalingAlgorithm\022\027\n\017max"
          + "_num_workers\030\002 \001(\005\"\210\001\n\030SdkHarnessContain"
          + "erImage\022\027\n\017container_image\030\001 \001(\t\022%\n\035use_"
          + "single_core_per_container\030\002 \001(\010\022\026\n\016envir"
          + "onment_id\030\003 \001(\t\022\024\n\014capabilities\030\004 \003(\t\"\362\007"
          + "\n\nWorkerPool\022\014\n\004kind\030\001 \001(\t\022\023\n\013num_worker"
          + "s\030\002 \001(\005\0222\n\010packages\030\003 \003(\0132 .google.dataf"
          + "low.v1beta3.Package\022G\n\023default_package_s"
          + "et\030\004 \001(\0162*.google.dataflow.v1beta3.Defau"
          + "ltPackageSet\022\024\n\014machine_type\030\005 \001(\t\022@\n\017te"
          + "ardown_policy\030\006 \001(\0162\'.google.dataflow.v1"
          + "beta3.TeardownPolicy\022\024\n\014disk_size_gb\030\007 \001"
          + "(\005\022\021\n\tdisk_type\030\020 \001(\t\022\031\n\021disk_source_ima"
          + "ge\030\010 \001(\t\022\014\n\004zone\030\t \001(\t\022H\n\023taskrunner_set"
          + "tings\030\n \001(\0132+.google.dataflow.v1beta3.Ta"
          + "skRunnerSettings\022\033\n\023on_host_maintenance\030"
          + "\013 \001(\t\0221\n\ndata_disks\030\014 \003(\0132\035.google.dataf"
          + "low.v1beta3.Disk\022C\n\010metadata\030\r \003(\01321.goo"
          + "gle.dataflow.v1beta3.WorkerPool.Metadata"
          + "Entry\022J\n\024autoscaling_settings\030\016 \001(\0132,.go"
          + "ogle.dataflow.v1beta3.AutoscalingSetting"
          + "s\022\'\n\tpool_args\030\017 \001(\0132\024.google.protobuf.A"
          + "ny\022\017\n\007network\030\021 \001(\t\022\022\n\nsubnetwork\030\023 \001(\t\022"
          + "&\n\036worker_harness_container_image\030\022 \001(\t\022"
          + "\036\n\026num_threads_per_worker\030\024 \001(\005\022O\n\020ip_co"
          + "nfiguration\030\025 \001(\01625.google.dataflow.v1be"
          + "ta3.WorkerIPAddressConfiguration\022W\n\034sdk_"
          + "harness_container_images\030\026 \003(\01321.google."
          + "dataflow.v1beta3.SdkHarnessContainerImag"
          + "e\032/\n\rMetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value"
          + "\030\002 \001(\t:\0028\001\".\n\014DebugOptions\022\036\n\026enable_hot"
          + "_key_logging\030\001 \001(\010*K\n\007JobType\022\024\n\020JOB_TYP"
          + "E_UNKNOWN\020\000\022\022\n\016JOB_TYPE_BATCH\020\001\022\026\n\022JOB_T"
          + "YPE_STREAMING\020\002*k\n\032FlexResourceSchedulin"
          + "gGoal\022\026\n\022FLEXRS_UNSPECIFIED\020\000\022\032\n\026FLEXRS_"
          + "SPEED_OPTIMIZED\020\001\022\031\n\025FLEXRS_COST_OPTIMIZ"
          + "ED\020\002*o\n\016TeardownPolicy\022\033\n\027TEARDOWN_POLIC"
          + "Y_UNKNOWN\020\000\022\023\n\017TEARDOWN_ALWAYS\020\001\022\027\n\023TEAR"
          + "DOWN_ON_SUCCESS\020\002\022\022\n\016TEARDOWN_NEVER\020\003*\220\001"
          + "\n\021DefaultPackageSet\022\037\n\033DEFAULT_PACKAGE_S"
          + "ET_UNKNOWN\020\000\022\034\n\030DEFAULT_PACKAGE_SET_NONE"
          + "\020\001\022\034\n\030DEFAULT_PACKAGE_SET_JAVA\020\002\022\036\n\032DEFA"
          + "ULT_PACKAGE_SET_PYTHON\020\003*z\n\024AutoscalingA"
          + "lgorithm\022!\n\035AUTOSCALING_ALGORITHM_UNKNOW"
          + "N\020\000\022\036\n\032AUTOSCALING_ALGORITHM_NONE\020\001\022\037\n\033A"
          + "UTOSCALING_ALGORITHM_BASIC\020\002*f\n\034WorkerIP"
          + "AddressConfiguration\022\031\n\025WORKER_IP_UNSPEC"
          + "IFIED\020\000\022\024\n\020WORKER_IP_PUBLIC\020\001\022\025\n\021WORKER_"
          + "IP_PRIVATE\020\002*L\n\013ShuffleMode\022\034\n\030SHUFFLE_M"
          + "ODE_UNSPECIFIED\020\000\022\014\n\010VM_BASED\020\001\022\021\n\rSERVI"
          + "CE_BASED\020\002B\323\001\n\033com.google.dataflow.v1bet"
          + "a3B\020EnvironmentProtoP\001Z=cloud.google.com"
          + "/go/dataflow/apiv1beta3/dataflowpb;dataf"
          + "lowpb\252\002\035Google.Cloud.Dataflow.V1Beta3\312\002\035"
          + "Google\\Cloud\\Dataflow\\V1beta3\352\002 Google::"
          + "Cloud::Dataflow::V1beta3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_dataflow_v1beta3_Environment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_dataflow_v1beta3_Environment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_Environment_descriptor,
            new java.lang.String[] {
              "TempStoragePrefix",
              "ClusterManagerApiService",
              "Experiments",
              "ServiceOptions",
              "ServiceKmsKeyName",
              "WorkerPools",
              "UserAgent",
              "Version",
              "Dataset",
              "SdkPipelineOptions",
              "InternalExperiments",
              "ServiceAccountEmail",
              "FlexResourceSchedulingGoal",
              "WorkerRegion",
              "WorkerZone",
              "ShuffleMode",
              "DebugOptions",
            });
    internal_static_google_dataflow_v1beta3_Package_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_dataflow_v1beta3_Package_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_Package_descriptor,
            new java.lang.String[] {
              "Name", "Location",
            });
    internal_static_google_dataflow_v1beta3_Disk_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_dataflow_v1beta3_Disk_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_Disk_descriptor,
            new java.lang.String[] {
              "SizeGb", "DiskType", "MountPoint",
            });
    internal_static_google_dataflow_v1beta3_WorkerSettings_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_dataflow_v1beta3_WorkerSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_WorkerSettings_descriptor,
            new java.lang.String[] {
              "BaseUrl",
              "ReportingEnabled",
              "ServicePath",
              "ShuffleServicePath",
              "WorkerId",
              "TempStoragePrefix",
            });
    internal_static_google_dataflow_v1beta3_TaskRunnerSettings_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_dataflow_v1beta3_TaskRunnerSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_TaskRunnerSettings_descriptor,
            new java.lang.String[] {
              "TaskUser",
              "TaskGroup",
              "OauthScopes",
              "BaseUrl",
              "DataflowApiVersion",
              "ParallelWorkerSettings",
              "BaseTaskDir",
              "ContinueOnException",
              "LogToSerialconsole",
              "Alsologtostderr",
              "LogUploadLocation",
              "LogDir",
              "TempStoragePrefix",
              "HarnessCommand",
              "WorkflowFileName",
              "CommandlinesFileName",
              "VmId",
              "LanguageHint",
              "StreamingWorkerMainClass",
            });
    internal_static_google_dataflow_v1beta3_AutoscalingSettings_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_dataflow_v1beta3_AutoscalingSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_AutoscalingSettings_descriptor,
            new java.lang.String[] {
              "Algorithm", "MaxNumWorkers",
            });
    internal_static_google_dataflow_v1beta3_SdkHarnessContainerImage_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_dataflow_v1beta3_SdkHarnessContainerImage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_SdkHarnessContainerImage_descriptor,
            new java.lang.String[] {
              "ContainerImage", "UseSingleCorePerContainer", "EnvironmentId", "Capabilities",
            });
    internal_static_google_dataflow_v1beta3_WorkerPool_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_dataflow_v1beta3_WorkerPool_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_WorkerPool_descriptor,
            new java.lang.String[] {
              "Kind",
              "NumWorkers",
              "Packages",
              "DefaultPackageSet",
              "MachineType",
              "TeardownPolicy",
              "DiskSizeGb",
              "DiskType",
              "DiskSourceImage",
              "Zone",
              "TaskrunnerSettings",
              "OnHostMaintenance",
              "DataDisks",
              "Metadata",
              "AutoscalingSettings",
              "PoolArgs",
              "Network",
              "Subnetwork",
              "WorkerHarnessContainerImage",
              "NumThreadsPerWorker",
              "IpConfiguration",
              "SdkHarnessContainerImages",
            });
    internal_static_google_dataflow_v1beta3_WorkerPool_MetadataEntry_descriptor =
        internal_static_google_dataflow_v1beta3_WorkerPool_descriptor.getNestedTypes().get(0);
    internal_static_google_dataflow_v1beta3_WorkerPool_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_WorkerPool_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_dataflow_v1beta3_DebugOptions_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_dataflow_v1beta3_DebugOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_dataflow_v1beta3_DebugOptions_descriptor,
            new java.lang.String[] {
              "EnableHotKeyLogging",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
