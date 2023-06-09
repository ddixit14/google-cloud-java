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
// source: google/cloud/functions/v1/functions.proto

package com.google.cloud.functions.v1;

public final class FunctionsProto {
  private FunctionsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_CloudFunction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_CloudFunction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_CloudFunction_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_CloudFunction_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_CloudFunction_EnvironmentVariablesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_CloudFunction_EnvironmentVariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_CloudFunction_BuildEnvironmentVariablesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_CloudFunction_BuildEnvironmentVariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_SourceRepository_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_SourceRepository_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_HttpsTrigger_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_HttpsTrigger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_EventTrigger_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_EventTrigger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_FailurePolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_FailurePolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_FailurePolicy_Retry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_FailurePolicy_Retry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_SecretEnvVar_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_SecretEnvVar_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_SecretVolume_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_SecretVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_SecretVolume_SecretVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_SecretVolume_SecretVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_CreateFunctionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_CreateFunctionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_UpdateFunctionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_UpdateFunctionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_GetFunctionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_GetFunctionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_ListFunctionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_ListFunctionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_ListFunctionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_ListFunctionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_DeleteFunctionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_DeleteFunctionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_CallFunctionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_CallFunctionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_CallFunctionResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_CallFunctionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_GenerateUploadUrlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_GenerateUploadUrlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_GenerateUploadUrlResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_GenerateUploadUrlResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_GenerateDownloadUrlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_GenerateDownloadUrlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_functions_v1_GenerateDownloadUrlResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_functions_v1_GenerateDownloadUrlResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/functions/v1/functions.pr"
          + "oto\022\031google.cloud.functions.v1\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032*google/cloud/"
          + "functions/v1/operations.proto\032\036google/ia"
          + "m/v1/iam_policy.proto\032\032google/iam/v1/pol"
          + "icy.proto\032#google/longrunning/operations"
          + ".proto\032\036google/protobuf/duration.proto\032\033"
          + "google/protobuf/empty.proto\032 google/prot"
          + "obuf/field_mask.proto\032\037google/protobuf/t"
          + "imestamp.proto\"\355\021\n\rCloudFunction\022\014\n\004name"
          + "\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022\034\n\022source_ar"
          + "chive_url\030\003 \001(\tH\000\022H\n\021source_repository\030\004"
          + " \001(\0132+.google.cloud.functions.v1.SourceR"
          + "epositoryH\000\022\033\n\021source_upload_url\030\020 \001(\tH\000"
          + "\022@\n\rhttps_trigger\030\005 \001(\0132\'.google.cloud.f"
          + "unctions.v1.HttpsTriggerH\001\022@\n\revent_trig"
          + "ger\030\006 \001(\0132\'.google.cloud.functions.v1.Ev"
          + "entTriggerH\001\022D\n\006status\030\007 \001(\0162..google.cl"
          + "oud.functions.v1.CloudFunctionStatusB\004\342A"
          + "\001\003\022\023\n\013entry_point\030\010 \001(\t\022\017\n\007runtime\030\023 \001(\t"
          + "\022*\n\007timeout\030\t \001(\0132\031.google.protobuf.Dura"
          + "tion\022\033\n\023available_memory_mb\030\n \001(\005\022\035\n\025ser"
          + "vice_account_email\030\013 \001(\t\0225\n\013update_time\030"
          + "\014 \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\022"
          + "\030\n\nversion_id\030\016 \001(\003B\004\342A\001\003\022D\n\006labels\030\017 \003("
          + "\01324.google.cloud.functions.v1.CloudFunct"
          + "ion.LabelsEntry\022a\n\025environment_variables"
          + "\030\021 \003(\0132B.google.cloud.functions.v1.Cloud"
          + "Function.EnvironmentVariablesEntry\022l\n\033bu"
          + "ild_environment_variables\030\034 \003(\0132G.google"
          + ".cloud.functions.v1.CloudFunction.BuildE"
          + "nvironmentVariablesEntry\022\017\n\007network\030\022 \001("
          + "\t\022\025\n\rmax_instances\030\024 \001(\005\022\025\n\rmin_instance"
          + "s\030  \001(\005\022\025\n\rvpc_connector\030\026 \001(\t\022j\n\035vpc_co"
          + "nnector_egress_settings\030\027 \001(\0162C.google.c"
          + "loud.functions.v1.CloudFunction.VpcConne"
          + "ctorEgressSettings\022R\n\020ingress_settings\030\030"
          + " \001(\01628.google.cloud.functions.v1.CloudFu"
          + "nction.IngressSettings\022<\n\014kms_key_name\030\031"
          + " \001(\tB&\372A#\n!cloudkms.googleapis.com/Crypt"
          + "oKey\022\031\n\021build_worker_pool\030\032 \001(\t\022\026\n\010build"
          + "_id\030\033 \001(\tB\004\342A\001\003\022\030\n\nbuild_name\030! \001(\tB\004\342A\001"
          + "\003\022M\n\034secret_environment_variables\030\035 \003(\0132"
          + "\'.google.cloud.functions.v1.SecretEnvVar"
          + "\022?\n\016secret_volumes\030\036 \003(\0132\'.google.cloud."
          + "functions.v1.SecretVolume\022\032\n\014source_toke"
          + "n\030\037 \001(\tB\004\342A\001\004\022J\n\021docker_repository\030\" \001(\t"
          + "B/\372A,\n*artifactregistry.googleapis.com/R"
          + "epository\022P\n\017docker_registry\030# \001(\01627.goo"
          + "gle.cloud.functions.v1.CloudFunction.Doc"
          + "kerRegistry\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\t:\0028\001\032;\n\031EnvironmentVariabl"
          + "esEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032"
          + "@\n\036BuildEnvironmentVariablesEntry\022\013\n\003key"
          + "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"u\n\032VpcConnecto"
          + "rEgressSettings\022-\n)VPC_CONNECTOR_EGRESS_"
          + "SETTINGS_UNSPECIFIED\020\000\022\027\n\023PRIVATE_RANGES"
          + "_ONLY\020\001\022\017\n\013ALL_TRAFFIC\020\002\"x\n\017IngressSetti"
          + "ngs\022 \n\034INGRESS_SETTINGS_UNSPECIFIED\020\000\022\r\n"
          + "\tALLOW_ALL\020\001\022\027\n\023ALLOW_INTERNAL_ONLY\020\002\022\033\n"
          + "\027ALLOW_INTERNAL_AND_GCLB\020\003\"`\n\016DockerRegi"
          + "stry\022\037\n\033DOCKER_REGISTRY_UNSPECIFIED\020\000\022\026\n"
          + "\022CONTAINER_REGISTRY\020\001\022\025\n\021ARTIFACT_REGIST"
          + "RY\020\002:n\352Ak\n+cloudfunctions.googleapis.com"
          + "/CloudFunction\022<projects/{project}/locat"
          + "ions/{location}/functions/{function}B\r\n\013"
          + "source_codeB\t\n\007trigger\";\n\020SourceReposito"
          + "ry\022\013\n\003url\030\001 \001(\t\022\032\n\014deployed_url\030\002 \001(\tB\004\342"
          + "A\001\003\"\311\001\n\014HttpsTrigger\022\021\n\003url\030\001 \001(\tB\004\342A\001\003\022"
          + "M\n\016security_level\030\002 \001(\01625.google.cloud.f"
          + "unctions.v1.HttpsTrigger.SecurityLevel\"W"
          + "\n\rSecurityLevel\022\036\n\032SECURITY_LEVEL_UNSPEC"
          + "IFIED\020\000\022\021\n\rSECURE_ALWAYS\020\001\022\023\n\017SECURE_OPT"
          + "IONAL\020\002\"\207\001\n\014EventTrigger\022\022\n\nevent_type\030\001"
          + " \001(\t\022\020\n\010resource\030\002 \001(\t\022\017\n\007service\030\003 \001(\t\022"
          + "@\n\016failure_policy\030\005 \001(\0132(.google.cloud.f"
          + "unctions.v1.FailurePolicy\"c\n\rFailurePoli"
          + "cy\022?\n\005retry\030\001 \001(\0132..google.cloud.functio"
          + "ns.v1.FailurePolicy.RetryH\000\032\007\n\005RetryB\010\n\006"
          + "action\"P\n\014SecretEnvVar\022\013\n\003key\030\001 \001(\t\022\022\n\np"
          + "roject_id\030\002 \001(\t\022\016\n\006secret\030\003 \001(\t\022\017\n\007versi"
          + "on\030\004 \001(\t\"\277\001\n\014SecretVolume\022\022\n\nmount_path\030"
          + "\001 \001(\t\022\022\n\nproject_id\030\002 \001(\t\022\016\n\006secret\030\003 \001("
          + "\t\022G\n\010versions\030\004 \003(\01325.google.cloud.funct"
          + "ions.v1.SecretVolume.SecretVersion\032.\n\rSe"
          + "cretVersion\022\017\n\007version\030\001 \001(\t\022\014\n\004path\030\002 \001"
          + "(\t\"\227\001\n\025CreateFunctionRequest\022<\n\010location"
          + "\030\001 \001(\tB*\342A\001\002\372A#\n!locations.googleapis.co"
          + "m/Location\022@\n\010function\030\002 \001(\0132(.google.cl"
          + "oud.functions.v1.CloudFunctionB\004\342A\001\002\"\212\001\n"
          + "\025UpdateFunctionRequest\022@\n\010function\030\001 \001(\013"
          + "2(.google.cloud.functions.v1.CloudFuncti"
          + "onB\004\342A\001\002\022/\n\013update_mask\030\002 \001(\0132\032.google.p"
          + "rotobuf.FieldMask\"X\n\022GetFunctionRequest\022"
          + "B\n\004name\030\001 \001(\tB4\342A\001\002\372A-\n+cloudfunctions.g"
          + "oogleapis.com/CloudFunction\"u\n\024ListFunct"
          + "ionsRequest\0226\n\006parent\030\001 \001(\tB&\372A#\n!locati"
          + "ons.googleapis.com/Location\022\021\n\tpage_size"
          + "\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\202\001\n\025ListFunct"
          + "ionsResponse\022;\n\tfunctions\030\001 \003(\0132(.google"
          + ".cloud.functions.v1.CloudFunction\022\027\n\017nex"
          + "t_page_token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\""
          + "[\n\025DeleteFunctionRequest\022B\n\004name\030\001 \001(\tB4"
          + "\342A\001\002\372A-\n+cloudfunctions.googleapis.com/C"
          + "loudFunction\"m\n\023CallFunctionRequest\022B\n\004n"
          + "ame\030\001 \001(\tB4\342A\001\002\372A-\n+cloudfunctions.googl"
          + "eapis.com/CloudFunction\022\022\n\004data\030\002 \001(\tB\004\342"
          + "A\001\002\"K\n\024CallFunctionResponse\022\024\n\014execution"
          + "_id\030\001 \001(\t\022\016\n\006result\030\002 \001(\t\022\r\n\005error\030\003 \001(\t"
          + "\"h\n\030GenerateUploadUrlRequest\022\016\n\006parent\030\001"
          + " \001(\t\022<\n\014kms_key_name\030\002 \001(\tB&\372A#\n!cloudkm"
          + "s.googleapis.com/CryptoKey\"/\n\031GenerateUp"
          + "loadUrlResponse\022\022\n\nupload_url\030\001 \001(\t\">\n\032G"
          + "enerateDownloadUrlRequest\022\014\n\004name\030\001 \001(\t\022"
          + "\022\n\nversion_id\030\002 \001(\004\"3\n\033GenerateDownloadU"
          + "rlResponse\022\024\n\014download_url\030\001 \001(\t*\222\001\n\023Clo"
          + "udFunctionStatus\022%\n!CLOUD_FUNCTION_STATU"
          + "S_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\013\n\007OFFLINE\020\002"
          + "\022\026\n\022DEPLOY_IN_PROGRESS\020\003\022\026\n\022DELETE_IN_PR"
          + "OGRESS\020\004\022\013\n\007UNKNOWN\020\0052\227\021\n\025CloudFunctions"
          + "Service\022\251\001\n\rListFunctions\022/.google.cloud"
          + ".functions.v1.ListFunctionsRequest\0320.goo"
          + "gle.cloud.functions.v1.ListFunctionsResp"
          + "onse\"5\202\323\344\223\002/\022-/v1/{parent=projects/*/loc"
          + "ations/*}/functions\022\244\001\n\013GetFunction\022-.go"
          + "ogle.cloud.functions.v1.GetFunctionReque"
          + "st\032(.google.cloud.functions.v1.CloudFunc"
          + "tion\"<\332A\004name\202\323\344\223\002/\022-/v1/{name=projects/"
          + "*/locations/*/functions/*}\022\337\001\n\016CreateFun"
          + "ction\0220.google.cloud.functions.v1.Create"
          + "FunctionRequest\032\035.google.longrunning.Ope"
          + "ration\"|\312A$\n\rCloudFunction\022\023OperationMet"
          + "adataV1\332A\021location,function\202\323\344\223\002;\"//v1/{"
          + "location=projects/*/locations/*}/functio"
          + "ns:\010function\022\335\001\n\016UpdateFunction\0220.google"
          + ".cloud.functions.v1.UpdateFunctionReques"
          + "t\032\035.google.longrunning.Operation\"z\312A$\n\rC"
          + "loudFunction\022\023OperationMetadataV1\332A\010func"
          + "tion\202\323\344\223\002B26/v1/{function.name=projects/"
          + "*/locations/*/functions/*}:\010function\022\316\001\n"
          + "\016DeleteFunction\0220.google.cloud.functions"
          + ".v1.DeleteFunctionRequest\032\035.google.longr"
          + "unning.Operation\"k\312A,\n\025google.protobuf.E"
          + "mpty\022\023OperationMetadataV1\332A\004name\202\323\344\223\002/*-"
          + "/v1/{name=projects/*/locations/*/functio"
          + "ns/*}\022\272\001\n\014CallFunction\022..google.cloud.fu"
          + "nctions.v1.CallFunctionRequest\032/.google."
          + "cloud.functions.v1.CallFunctionResponse\""
          + "I\332A\tname,data\202\323\344\223\0027\"2/v1/{name=projects/"
          + "*/locations/*/functions/*}:call:\001*\022\312\001\n\021G"
          + "enerateUploadUrl\0223.google.cloud.function"
          + "s.v1.GenerateUploadUrlRequest\0324.google.c"
          + "loud.functions.v1.GenerateUploadUrlRespo"
          + "nse\"J\202\323\344\223\002D\"?/v1/{parent=projects/*/loca"
          + "tions/*}/functions:generateUploadUrl:\001*\022"
          + "\322\001\n\023GenerateDownloadUrl\0225.google.cloud.f"
          + "unctions.v1.GenerateDownloadUrlRequest\0326"
          + ".google.cloud.functions.v1.GenerateDownl"
          + "oadUrlResponse\"L\202\323\344\223\002F\"A/v1/{name=projec"
          + "ts/*/locations/*/functions/*}:generateDo"
          + "wnloadUrl:\001*\022\224\001\n\014SetIamPolicy\022\".google.i"
          + "am.v1.SetIamPolicyRequest\032\025.google.iam.v"
          + "1.Policy\"I\202\323\344\223\002C\">/v1/{resource=projects"
          + "/*/locations/*/functions/*}:setIamPolicy"
          + ":\001*\022\221\001\n\014GetIamPolicy\022\".google.iam.v1.Get"
          + "IamPolicyRequest\032\025.google.iam.v1.Policy\""
          + "F\202\323\344\223\002@\022>/v1/{resource=projects/*/locati"
          + "ons/*/functions/*}:getIamPolicy\022\272\001\n\022Test"
          + "IamPermissions\022(.google.iam.v1.TestIamPe"
          + "rmissionsRequest\032).google.iam.v1.TestIam"
          + "PermissionsResponse\"O\202\323\344\223\002I\"D/v1/{resour"
          + "ce=projects/*/locations/*/functions/*}:t"
          + "estIamPermissions:\001*\032Q\312A\035cloudfunctions."
          + "googleapis.com\322A.https://www.googleapis."
          + "com/auth/cloud-platformB\341\002\n\035com.google.c"
          + "loud.functions.v1B\016FunctionsProtoP\001Z;clo"
          + "ud.google.com/go/functions/apiv1/functio"
          + "nspb;functionspb\242\002\003GCF\352Ao\n*artifactregis"
          + "try.googleapis.com/Repository\022Aprojects/"
          + "{project}/locations/{location}/repositor"
          + "ies/{repository}\352Ax\n!cloudkms.googleapis"
          + ".com/CryptoKey\022Sprojects/{project}/locat"
          + "ions/{location}/keyRings/{key_ring}/cryp"
          + "toKeys/{crypto_key}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.functions.v1.FunctionsOperationsProto.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_functions_v1_CloudFunction_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_functions_v1_CloudFunction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_CloudFunction_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "SourceArchiveUrl",
              "SourceRepository",
              "SourceUploadUrl",
              "HttpsTrigger",
              "EventTrigger",
              "Status",
              "EntryPoint",
              "Runtime",
              "Timeout",
              "AvailableMemoryMb",
              "ServiceAccountEmail",
              "UpdateTime",
              "VersionId",
              "Labels",
              "EnvironmentVariables",
              "BuildEnvironmentVariables",
              "Network",
              "MaxInstances",
              "MinInstances",
              "VpcConnector",
              "VpcConnectorEgressSettings",
              "IngressSettings",
              "KmsKeyName",
              "BuildWorkerPool",
              "BuildId",
              "BuildName",
              "SecretEnvironmentVariables",
              "SecretVolumes",
              "SourceToken",
              "DockerRepository",
              "DockerRegistry",
              "SourceCode",
              "Trigger",
            });
    internal_static_google_cloud_functions_v1_CloudFunction_LabelsEntry_descriptor =
        internal_static_google_cloud_functions_v1_CloudFunction_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_functions_v1_CloudFunction_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_CloudFunction_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_functions_v1_CloudFunction_EnvironmentVariablesEntry_descriptor =
        internal_static_google_cloud_functions_v1_CloudFunction_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_functions_v1_CloudFunction_EnvironmentVariablesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_CloudFunction_EnvironmentVariablesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_functions_v1_CloudFunction_BuildEnvironmentVariablesEntry_descriptor =
        internal_static_google_cloud_functions_v1_CloudFunction_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_functions_v1_CloudFunction_BuildEnvironmentVariablesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_CloudFunction_BuildEnvironmentVariablesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_functions_v1_SourceRepository_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_functions_v1_SourceRepository_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_SourceRepository_descriptor,
            new java.lang.String[] {
              "Url", "DeployedUrl",
            });
    internal_static_google_cloud_functions_v1_HttpsTrigger_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_functions_v1_HttpsTrigger_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_HttpsTrigger_descriptor,
            new java.lang.String[] {
              "Url", "SecurityLevel",
            });
    internal_static_google_cloud_functions_v1_EventTrigger_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_functions_v1_EventTrigger_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_EventTrigger_descriptor,
            new java.lang.String[] {
              "EventType", "Resource", "Service", "FailurePolicy",
            });
    internal_static_google_cloud_functions_v1_FailurePolicy_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_functions_v1_FailurePolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_FailurePolicy_descriptor,
            new java.lang.String[] {
              "Retry", "Action",
            });
    internal_static_google_cloud_functions_v1_FailurePolicy_Retry_descriptor =
        internal_static_google_cloud_functions_v1_FailurePolicy_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_functions_v1_FailurePolicy_Retry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_FailurePolicy_Retry_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_functions_v1_SecretEnvVar_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_functions_v1_SecretEnvVar_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_SecretEnvVar_descriptor,
            new java.lang.String[] {
              "Key", "ProjectId", "Secret", "Version",
            });
    internal_static_google_cloud_functions_v1_SecretVolume_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_functions_v1_SecretVolume_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_SecretVolume_descriptor,
            new java.lang.String[] {
              "MountPath", "ProjectId", "Secret", "Versions",
            });
    internal_static_google_cloud_functions_v1_SecretVolume_SecretVersion_descriptor =
        internal_static_google_cloud_functions_v1_SecretVolume_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_functions_v1_SecretVolume_SecretVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_SecretVolume_SecretVersion_descriptor,
            new java.lang.String[] {
              "Version", "Path",
            });
    internal_static_google_cloud_functions_v1_CreateFunctionRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_functions_v1_CreateFunctionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_CreateFunctionRequest_descriptor,
            new java.lang.String[] {
              "Location", "Function",
            });
    internal_static_google_cloud_functions_v1_UpdateFunctionRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_functions_v1_UpdateFunctionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_UpdateFunctionRequest_descriptor,
            new java.lang.String[] {
              "Function", "UpdateMask",
            });
    internal_static_google_cloud_functions_v1_GetFunctionRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_functions_v1_GetFunctionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_GetFunctionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_functions_v1_ListFunctionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_functions_v1_ListFunctionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_ListFunctionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_functions_v1_ListFunctionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_functions_v1_ListFunctionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_ListFunctionsResponse_descriptor,
            new java.lang.String[] {
              "Functions", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_functions_v1_DeleteFunctionRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_functions_v1_DeleteFunctionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_DeleteFunctionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_functions_v1_CallFunctionRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_functions_v1_CallFunctionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_CallFunctionRequest_descriptor,
            new java.lang.String[] {
              "Name", "Data",
            });
    internal_static_google_cloud_functions_v1_CallFunctionResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_functions_v1_CallFunctionResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_CallFunctionResponse_descriptor,
            new java.lang.String[] {
              "ExecutionId", "Result", "Error",
            });
    internal_static_google_cloud_functions_v1_GenerateUploadUrlRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_functions_v1_GenerateUploadUrlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_GenerateUploadUrlRequest_descriptor,
            new java.lang.String[] {
              "Parent", "KmsKeyName",
            });
    internal_static_google_cloud_functions_v1_GenerateUploadUrlResponse_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_functions_v1_GenerateUploadUrlResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_GenerateUploadUrlResponse_descriptor,
            new java.lang.String[] {
              "UploadUrl",
            });
    internal_static_google_cloud_functions_v1_GenerateDownloadUrlRequest_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_functions_v1_GenerateDownloadUrlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_GenerateDownloadUrlRequest_descriptor,
            new java.lang.String[] {
              "Name", "VersionId",
            });
    internal_static_google_cloud_functions_v1_GenerateDownloadUrlResponse_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_functions_v1_GenerateDownloadUrlResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_functions_v1_GenerateDownloadUrlResponse_descriptor,
            new java.lang.String[] {
              "DownloadUrl",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.functions.v1.FunctionsOperationsProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
