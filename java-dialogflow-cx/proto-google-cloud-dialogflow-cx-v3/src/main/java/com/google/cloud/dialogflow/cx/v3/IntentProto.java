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
// source: google/cloud/dialogflow/cx/v3/intent.proto

package com.google.cloud.dialogflow.cx.v3;

public final class IntentProto {
  private IntentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Intent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Intent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Intent_TrainingPhrase_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Intent_TrainingPhrase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Intent_TrainingPhrase_Part_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Intent_TrainingPhrase_Part_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Intent_Parameter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Intent_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_Intent_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_Intent_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListIntentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListIntentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_ListIntentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_ListIntentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_GetIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_GetIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_CreateIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_CreateIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_UpdateIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_UpdateIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DeleteIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DeleteIntentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/dialogflow/cx/v3/intent.p"
          + "roto\022\035google.cloud.dialogflow.cx.v3\032\034goo"
          + "gle/api/annotations.proto\032\027google/api/cl"
          + "ient.proto\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032\033google/p"
          + "rotobuf/empty.proto\032 google/protobuf/fie"
          + "ld_mask.proto\"\241\006\n\006Intent\022\014\n\004name\030\001 \001(\t\022\032"
          + "\n\014display_name\030\002 \001(\tB\004\342A\001\002\022N\n\020training_p"
          + "hrases\030\003 \003(\01324.google.cloud.dialogflow.c"
          + "x.v3.Intent.TrainingPhrase\022C\n\nparameters"
          + "\030\004 \003(\0132/.google.cloud.dialogflow.cx.v3.I"
          + "ntent.Parameter\022\020\n\010priority\030\005 \001(\005\022\023\n\013is_"
          + "fallback\030\006 \001(\010\022A\n\006labels\030\007 \003(\01321.google."
          + "cloud.dialogflow.cx.v3.Intent.LabelsEntr"
          + "y\022\023\n\013description\030\010 \001(\t\032\264\001\n\016TrainingPhras"
          + "e\022\n\n\002id\030\001 \001(\t\022N\n\005parts\030\002 \003(\01329.google.cl"
          + "oud.dialogflow.cx.v3.Intent.TrainingPhra"
          + "se.PartB\004\342A\001\002\022\024\n\014repeat_count\030\003 \001(\005\0320\n\004P"
          + "art\022\022\n\004text\030\001 \001(\tB\004\342A\001\002\022\024\n\014parameter_id\030"
          + "\002 \001(\t\032\202\001\n\tParameter\022\020\n\002id\030\001 \001(\tB\004\342A\001\002\022B\n"
          + "\013entity_type\030\002 \001(\tB-\342A\001\002\372A&\n$dialogflow."
          + "googleapis.com/EntityType\022\017\n\007is_list\030\003 \001"
          + "(\010\022\016\n\006redact\030\004 \001(\010\032-\n\013LabelsEntry\022\013\n\003key"
          + "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:n\352Ak\n dialogfl"
          + "ow.googleapis.com/Intent\022Gprojects/{proj"
          + "ect}/locations/{location}/agents/{agent}"
          + "/intents/{intent}\"\315\001\n\022ListIntentsRequest"
          + "\0229\n\006parent\030\001 \001(\tB)\342A\001\002\372A\"\022 dialogflow.go"
          + "ogleapis.com/Intent\022\025\n\rlanguage_code\030\002 \001"
          + "(\t\022>\n\013intent_view\030\005 \001(\0162).google.cloud.d"
          + "ialogflow.cx.v3.IntentView\022\021\n\tpage_size\030"
          + "\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"f\n\023ListIntents"
          + "Response\0226\n\007intents\030\001 \003(\0132%.google.cloud"
          + ".dialogflow.cx.v3.Intent\022\027\n\017next_page_to"
          + "ken\030\002 \001(\t\"b\n\020GetIntentRequest\0227\n\004name\030\001 "
          + "\001(\tB)\342A\001\002\372A\"\n dialogflow.googleapis.com/"
          + "Intent\022\025\n\rlanguage_code\030\002 \001(\t\"\244\001\n\023Create"
          + "IntentRequest\0229\n\006parent\030\001 \001(\tB)\342A\001\002\372A\"\022 "
          + "dialogflow.googleapis.com/Intent\022;\n\006inte"
          + "nt\030\002 \001(\0132%.google.cloud.dialogflow.cx.v3"
          + ".IntentB\004\342A\001\002\022\025\n\rlanguage_code\030\003 \001(\t\"\232\001\n"
          + "\023UpdateIntentRequest\022;\n\006intent\030\001 \001(\0132%.g"
          + "oogle.cloud.dialogflow.cx.v3.IntentB\004\342A\001"
          + "\002\022\025\n\rlanguage_code\030\002 \001(\t\022/\n\013update_mask\030"
          + "\003 \001(\0132\032.google.protobuf.FieldMask\"N\n\023Del"
          + "eteIntentRequest\0227\n\004name\030\001 \001(\tB)\342A\001\002\372A\"\n"
          + " dialogflow.googleapis.com/Intent*X\n\nInt"
          + "entView\022\033\n\027INTENT_VIEW_UNSPECIFIED\020\000\022\027\n\023"
          + "INTENT_VIEW_PARTIAL\020\001\022\024\n\020INTENT_VIEW_FUL"
          + "L\020\0022\236\010\n\007Intents\022\273\001\n\013ListIntents\0221.google"
          + ".cloud.dialogflow.cx.v3.ListIntentsReque"
          + "st\0322.google.cloud.dialogflow.cx.v3.ListI"
          + "ntentsResponse\"E\332A\006parent\202\323\344\223\0026\0224/v3/{pa"
          + "rent=projects/*/locations/*/agents/*}/in"
          + "tents\022\250\001\n\tGetIntent\022/.google.cloud.dialo"
          + "gflow.cx.v3.GetIntentRequest\032%.google.cl"
          + "oud.dialogflow.cx.v3.Intent\"C\332A\004name\202\323\344\223"
          + "\0026\0224/v3/{name=projects/*/locations/*/age"
          + "nts/*/intents/*}\022\277\001\n\014CreateIntent\0222.goog"
          + "le.cloud.dialogflow.cx.v3.CreateIntentRe"
          + "quest\032%.google.cloud.dialogflow.cx.v3.In"
          + "tent\"T\332A\rparent,intent\202\323\344\223\002>\"4/v3/{paren"
          + "t=projects/*/locations/*/agents/*}/inten"
          + "ts:\006intent\022\313\001\n\014UpdateIntent\0222.google.clo"
          + "ud.dialogflow.cx.v3.UpdateIntentRequest\032"
          + "%.google.cloud.dialogflow.cx.v3.Intent\"`"
          + "\332A\022intent,update_mask\202\323\344\223\002E2;/v3/{intent"
          + ".name=projects/*/locations/*/agents/*/in"
          + "tents/*}:\006intent\022\237\001\n\014DeleteIntent\0222.goog"
          + "le.cloud.dialogflow.cx.v3.DeleteIntentRe"
          + "quest\032\026.google.protobuf.Empty\"C\332A\004name\202\323"
          + "\344\223\0026*4/v3/{name=projects/*/locations/*/a"
          + "gents/*/intents/*}\032x\312A\031dialogflow.google"
          + "apis.com\322AYhttps://www.googleapis.com/au"
          + "th/cloud-platform,https://www.googleapis"
          + ".com/auth/dialogflowB\261\001\n!com.google.clou"
          + "d.dialogflow.cx.v3B\013IntentProtoP\001Z1cloud"
          + ".google.com/go/dialogflow/cx/apiv3/cxpb;"
          + "cxpb\370\001\001\242\002\002DF\252\002\035Google.Cloud.Dialogflow.C"
          + "x.V3\352\002!Google::Cloud::Dialogflow::CX::V3"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_Intent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Intent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Intent_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "TrainingPhrases",
              "Parameters",
              "Priority",
              "IsFallback",
              "Labels",
              "Description",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Intent_TrainingPhrase_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Intent_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Intent_TrainingPhrase_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Intent_TrainingPhrase_descriptor,
            new java.lang.String[] {
              "Id", "Parts", "RepeatCount",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Intent_TrainingPhrase_Part_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Intent_TrainingPhrase_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_Intent_TrainingPhrase_Part_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Intent_TrainingPhrase_Part_descriptor,
            new java.lang.String[] {
              "Text", "ParameterId",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Intent_Parameter_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Intent_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_Intent_Parameter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Intent_Parameter_descriptor,
            new java.lang.String[] {
              "Id", "EntityType", "IsList", "Redact",
            });
    internal_static_google_cloud_dialogflow_cx_v3_Intent_LabelsEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_Intent_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_Intent_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_Intent_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListIntentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_ListIntentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListIntentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LanguageCode", "IntentView", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_ListIntentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_ListIntentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_ListIntentsResponse_descriptor,
            new java.lang.String[] {
              "Intents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3_GetIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_GetIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_GetIntentRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_CreateIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_CreateIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_CreateIntentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Intent", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_UpdateIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3_UpdateIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_UpdateIntentRequest_descriptor,
            new java.lang.String[] {
              "Intent", "LanguageCode", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DeleteIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3_DeleteIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DeleteIntentRequest_descriptor,
            new java.lang.String[] {
              "Name",
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
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
