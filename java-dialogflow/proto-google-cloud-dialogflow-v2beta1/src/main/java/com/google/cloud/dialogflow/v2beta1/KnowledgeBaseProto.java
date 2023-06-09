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
// source: google/cloud/dialogflow/v2beta1/knowledge_base.proto

package com.google.cloud.dialogflow.v2beta1;

public final class KnowledgeBaseProto {
  private KnowledgeBaseProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeBase_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeBase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetKnowledgeBaseRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetKnowledgeBaseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_DeleteKnowledgeBaseRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteKnowledgeBaseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_UpdateKnowledgeBaseRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateKnowledgeBaseRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/dialogflow/v2beta1/knowle"
          + "dge_base.proto\022\037google.cloud.dialogflow."
          + "v2beta1\032\034google/api/annotations.proto\032\027g"
          + "oogle/api/client.proto\032\037google/api/field"
          + "_behavior.proto\032\031google/api/resource.pro"
          + "to\032\033google/protobuf/empty.proto\032 google/"
          + "protobuf/field_mask.proto\"\375\001\n\rKnowledgeB"
          + "ase\022\014\n\004name\030\001 \001(\t\022\032\n\014display_name\030\002 \001(\tB"
          + "\004\342A\001\002\022\025\n\rlanguage_code\030\004 \001(\t:\252\001\352A\246\001\n\'dia"
          + "logflow.googleapis.com/KnowledgeBase\0222pr"
          + "ojects/{project}/knowledgeBases/{knowled"
          + "ge_base}\022Gprojects/{project}/locations/{"
          + "location}/knowledgeBases/{knowledge_base"
          + "}\"\224\001\n\031ListKnowledgeBasesRequest\022@\n\006paren"
          + "t\030\001 \001(\tB0\342A\001\002\372A)\022\'dialogflow.googleapis."
          + "com/KnowledgeBase\022\021\n\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\"~\n\032List"
          + "KnowledgeBasesResponse\022G\n\017knowledge_base"
          + "s\030\001 \003(\0132..google.cloud.dialogflow.v2beta"
          + "1.KnowledgeBase\022\027\n\017next_page_token\030\002 \001(\t"
          + "\"Y\n\027GetKnowledgeBaseRequest\022>\n\004name\030\001 \001("
          + "\tB0\342A\001\002\372A)\n\'dialogflow.googleapis.com/Kn"
          + "owledgeBase\"\254\001\n\032CreateKnowledgeBaseReque"
          + "st\022@\n\006parent\030\001 \001(\tB0\342A\001\002\372A)\022\'dialogflow."
          + "googleapis.com/KnowledgeBase\022L\n\016knowledg"
          + "e_base\030\002 \001(\0132..google.cloud.dialogflow.v"
          + "2beta1.KnowledgeBaseB\004\342A\001\002\"q\n\032DeleteKnow"
          + "ledgeBaseRequest\022>\n\004name\030\001 \001(\tB0\342A\001\002\372A)\n"
          + "\'dialogflow.googleapis.com/KnowledgeBase"
          + "\022\023\n\005force\030\002 \001(\010B\004\342A\001\001\"\241\001\n\032UpdateKnowledg"
          + "eBaseRequest\022L\n\016knowledge_base\030\001 \001(\0132..g"
          + "oogle.cloud.dialogflow.v2beta1.Knowledge"
          + "BaseB\004\342A\001\002\0225\n\013update_mask\030\002 \001(\0132\032.google"
          + ".protobuf.FieldMaskB\004\342A\001\0012\275\016\n\016KnowledgeB"
          + "ases\022\275\002\n\022ListKnowledgeBases\022:.google.clo"
          + "ud.dialogflow.v2beta1.ListKnowledgeBases"
          + "Request\032;.google.cloud.dialogflow.v2beta"
          + "1.ListKnowledgeBasesResponse\"\255\001\332A\006parent"
          + "\202\323\344\223\002\235\001\022+/v2beta1/{parent=projects/*}/kn"
          + "owledgeBasesZ9\0227/v2beta1/{parent=project"
          + "s/*/locations/*}/knowledgeBasesZ3\0221/v2be"
          + "ta1/{parent=projects/*/agent}/knowledgeB"
          + "ases\022\252\002\n\020GetKnowledgeBase\0228.google.cloud"
          + ".dialogflow.v2beta1.GetKnowledgeBaseRequ"
          + "est\032..google.cloud.dialogflow.v2beta1.Kn"
          + "owledgeBase\"\253\001\332A\004name\202\323\344\223\002\235\001\022+/v2beta1/{"
          + "name=projects/*/knowledgeBases/*}Z9\0227/v2"
          + "beta1/{name=projects/*/locations/*/knowl"
          + "edgeBases/*}Z3\0221/v2beta1/{name=projects/"
          + "*/agent/knowledgeBases/*}\022\361\002\n\023CreateKnow"
          + "ledgeBase\022;.google.cloud.dialogflow.v2be"
          + "ta1.CreateKnowledgeBaseRequest\032..google."
          + "cloud.dialogflow.v2beta1.KnowledgeBase\"\354"
          + "\001\332A\025parent,knowledge_base\202\323\344\223\002\315\001\"+/v2bet"
          + "a1/{parent=projects/*}/knowledgeBases:\016k"
          + "nowledge_baseZI\"7/v2beta1/{parent=projec"
          + "ts/*/locations/*}/knowledgeBases:\016knowle"
          + "dge_baseZC\"1/v2beta1/{parent=projects/*/"
          + "agent}/knowledgeBases:\016knowledge_base\022\230\002"
          + "\n\023DeleteKnowledgeBase\022;.google.cloud.dia"
          + "logflow.v2beta1.DeleteKnowledgeBaseReque"
          + "st\032\026.google.protobuf.Empty\"\253\001\332A\004name\202\323\344\223"
          + "\002\235\001*+/v2beta1/{name=projects/*/knowledge"
          + "Bases/*}Z9*7/v2beta1/{name=projects/*/lo"
          + "cations/*/knowledgeBases/*}Z3*1/v2beta1/"
          + "{name=projects/*/agent/knowledgeBases/*}"
          + "\022\264\003\n\023UpdateKnowledgeBase\022;.google.cloud."
          + "dialogflow.v2beta1.UpdateKnowledgeBaseRe"
          + "quest\032..google.cloud.dialogflow.v2beta1."
          + "KnowledgeBase\"\257\002\332A\032knowledge_base,update"
          + "_mask\332A\016knowledge_base\202\323\344\223\002\372\0012:/v2beta1/"
          + "{knowledge_base.name=projects/*/knowledg"
          + "eBases/*}:\016knowledge_baseZX2F/v2beta1/{k"
          + "nowledge_base.name=projects/*/locations/"
          + "*/knowledgeBases/*}:\016knowledge_baseZR2@/"
          + "v2beta1/{knowledge_base.name=projects/*/"
          + "agent/knowledgeBases/*}:\016knowledge_base\032"
          + "x\312A\031dialogflow.googleapis.com\322AYhttps://"
          + "www.googleapis.com/auth/cloud-platform,h"
          + "ttps://www.googleapis.com/auth/dialogflo"
          + "wB\252\001\n#com.google.cloud.dialogflow.v2beta"
          + "1B\022KnowledgeBaseProtoP\001ZCcloud.google.co"
          + "m/go/dialogflow/apiv2beta1/dialogflowpb;"
          + "dialogflowpb\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dial"
          + "ogflow.V2Beta1b\006proto3"
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
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeBase_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeBase_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_KnowledgeBase_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListKnowledgeBasesResponse_descriptor,
            new java.lang.String[] {
              "KnowledgeBases", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetKnowledgeBaseRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_GetKnowledgeBaseRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetKnowledgeBaseRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_descriptor,
            new java.lang.String[] {
              "Parent", "KnowledgeBase",
            });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteKnowledgeBaseRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteKnowledgeBaseRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_DeleteKnowledgeBaseRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateKnowledgeBaseRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateKnowledgeBaseRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_UpdateKnowledgeBaseRequest_descriptor,
            new java.lang.String[] {
              "KnowledgeBase", "UpdateMask",
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
