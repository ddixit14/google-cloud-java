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
// source: google/cloud/dialogflow/v2/answer_record.proto

package com.google.cloud.dialogflow.v2;

public final class AnswerRecordsProto {
  private AnswerRecordsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AnswerRecord_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AnswerRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UpdateAnswerRecordRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UpdateAnswerRecordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AnswerFeedback_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AnswerFeedback_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_SummarizationFeedback_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_SummarizationFeedback_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/dialogflow/v2/answer_reco"
          + "rd.proto\022\032google.cloud.dialogflow.v2\032\034go"
          + "ogle/api/annotations.proto\032\027google/api/c"
          + "lient.proto\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\032,google/"
          + "cloud/dialogflow/v2/participant.proto\032 g"
          + "oogle/protobuf/field_mask.proto\032\037google/"
          + "protobuf/timestamp.proto\"\363\002\n\014AnswerRecor"
          + "d\022\014\n\004name\030\001 \001(\t\022I\n\017answer_feedback\030\002 \001(\013"
          + "2*.google.cloud.dialogflow.v2.AnswerFeed"
          + "backB\004\342A\001\002\022X\n\026agent_assistant_record\030\004 \001"
          + "(\01320.google.cloud.dialogflow.v2.AgentAss"
          + "istantRecordB\004\342A\001\003H\000:\245\001\352A\241\001\n&dialogflow."
          + "googleapis.com/AnswerRecord\0220projects/{p"
          + "roject}/answerRecords/{answer_record}\022Ep"
          + "rojects/{project}/locations/{location}/a"
          + "nswerRecords/{answer_record}B\010\n\006record\"\246"
          + "\001\n\030ListAnswerRecordsRequest\022?\n\006parent\030\001 "
          + "\001(\tB/\342A\001\002\372A(\022&dialogflow.googleapis.com/"
          + "AnswerRecord\022\026\n\006filter\030\002 \001(\tB\006\030\001\342A\001\001\022\027\n\t"
          + "page_size\030\003 \001(\005B\004\342A\001\001\022\030\n\npage_token\030\004 \001("
          + "\tB\004\342A\001\001\"v\n\031ListAnswerRecordsResponse\022@\n\016"
          + "answer_records\030\001 \003(\0132(.google.cloud.dial"
          + "ogflow.v2.AnswerRecord\022\027\n\017next_page_toke"
          + "n\030\002 \001(\t\"\231\001\n\031UpdateAnswerRecordRequest\022E\n"
          + "\ranswer_record\030\001 \001(\0132(.google.cloud.dial"
          + "ogflow.v2.AnswerRecordB\004\342A\001\002\0225\n\013update_m"
          + "ask\030\002 \001(\0132\032.google.protobuf.FieldMaskB\004\342"
          + "A\001\002\"\322\003\n\016AnswerFeedback\022V\n\021correctness_le"
          + "vel\030\001 \001(\0162;.google.cloud.dialogflow.v2.A"
          + "nswerFeedback.CorrectnessLevel\022]\n\037agent_"
          + "assistant_detail_feedback\030\002 \001(\01322.google"
          + ".cloud.dialogflow.v2.AgentAssistantFeedb"
          + "ackH\000\022\017\n\007clicked\030\003 \001(\010\022.\n\nclick_time\030\005 \001"
          + "(\0132\032.google.protobuf.Timestamp\022\021\n\tdispla"
          + "yed\030\004 \001(\010\0220\n\014display_time\030\006 \001(\0132\032.google"
          + ".protobuf.Timestamp\"p\n\020CorrectnessLevel\022"
          + "!\n\035CORRECTNESS_LEVEL_UNSPECIFIED\020\000\022\017\n\013NO"
          + "T_CORRECT\020\001\022\025\n\021PARTIALLY_CORRECT\020\002\022\021\n\rFU"
          + "LLY_CORRECT\020\003B\021\n\017detail_feedback\"\332\006\n\026Age"
          + "ntAssistantFeedback\022b\n\020answer_relevance\030"
          + "\001 \001(\0162B.google.cloud.dialogflow.v2.Agent"
          + "AssistantFeedback.AnswerRelevanceB\004\342A\001\001\022"
          + "j\n\024document_correctness\030\002 \001(\0162F.google.c"
          + "loud.dialogflow.v2.AgentAssistantFeedbac"
          + "k.DocumentCorrectnessB\004\342A\001\001\022h\n\023document_"
          + "efficiency\030\003 \001(\0162E.google.cloud.dialogfl"
          + "ow.v2.AgentAssistantFeedback.DocumentEff"
          + "iciencyB\004\342A\001\001\022n\n\026summarization_feedback\030"
          + "\004 \001(\0132H.google.cloud.dialogflow.v2.Agent"
          + "AssistantFeedback.SummarizationFeedbackB"
          + "\004\342A\001\001\032\216\001\n\025SummarizationFeedback\022.\n\nstart"
          + "_time\030\001 \001(\0132\032.google.protobuf.Timestamp\022"
          + "/\n\013submit_time\030\002 \001(\0132\032.google.protobuf.T"
          + "imestamp\022\024\n\014summary_text\030\003 \001(\t\"Q\n\017Answer"
          + "Relevance\022 \n\034ANSWER_RELEVANCE_UNSPECIFIE"
          + "D\020\000\022\016\n\nIRRELEVANT\020\001\022\014\n\010RELEVANT\020\002\"W\n\023Doc"
          + "umentCorrectness\022$\n DOCUMENT_CORRECTNESS"
          + "_UNSPECIFIED\020\000\022\r\n\tINCORRECT\020\001\022\013\n\007CORRECT"
          + "\020\002\"Y\n\022DocumentEfficiency\022#\n\037DOCUMENT_EFF"
          + "ICIENCY_UNSPECIFIED\020\000\022\017\n\013INEFFICIENT\020\001\022\r"
          + "\n\tEFFICIENT\020\002\"\271\001\n\024AgentAssistantRecord\022T"
          + "\n\031article_suggestion_answer\030\005 \001(\0132).goog"
          + "le.cloud.dialogflow.v2.ArticleAnswerB\004\342A"
          + "\001\003H\000\022A\n\nfaq_answer\030\006 \001(\0132%.google.cloud."
          + "dialogflow.v2.FaqAnswerB\004\342A\001\003H\000B\010\n\006answe"
          + "r2\255\005\n\rAnswerRecords\022\355\001\n\021ListAnswerRecord"
          + "s\0224.google.cloud.dialogflow.v2.ListAnswe"
          + "rRecordsRequest\0325.google.cloud.dialogflo"
          + "w.v2.ListAnswerRecordsResponse\"k\332A\006paren"
          + "t\202\323\344\223\002\\\022%/v2/{parent=projects/*}/answerR"
          + "ecordsZ3\0221/v2/{parent=projects/*/locatio"
          + "ns/*}/answerRecords\022\261\002\n\022UpdateAnswerReco"
          + "rd\0225.google.cloud.dialogflow.v2.UpdateAn"
          + "swerRecordRequest\032(.google.cloud.dialogf"
          + "low.v2.AnswerRecord\"\271\001\332A\031answer_record,u"
          + "pdate_mask\202\323\344\223\002\226\00123/v2/{answer_record.na"
          + "me=projects/*/answerRecords/*}:\ranswer_r"
          + "ecordZP2?/v2/{answer_record.name=project"
          + "s/*/locations/*/answerRecords/*}:\ranswer"
          + "_record\032x\312A\031dialogflow.googleapis.com\322AY"
          + "https://www.googleapis.com/auth/cloud-pl"
          + "atform,https://www.googleapis.com/auth/d"
          + "ialogflowB\233\001\n\036com.google.cloud.dialogflo"
          + "w.v2B\022AnswerRecordsProtoP\001Z>cloud.google"
          + ".com/go/dialogflow/apiv2/dialogflowpb;di"
          + "alogflowpb\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialog"
          + "flow.V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.v2.ParticipantProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_AnswerRecord_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_AnswerRecord_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AnswerRecord_descriptor,
            new java.lang.String[] {
              "Name", "AnswerFeedback", "AgentAssistantRecord", "Record",
            });
    internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListAnswerRecordsResponse_descriptor,
            new java.lang.String[] {
              "AnswerRecords", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_UpdateAnswerRecordRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_UpdateAnswerRecordRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UpdateAnswerRecordRequest_descriptor,
            new java.lang.String[] {
              "AnswerRecord", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_AnswerFeedback_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_AnswerFeedback_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AnswerFeedback_descriptor,
            new java.lang.String[] {
              "CorrectnessLevel",
              "AgentAssistantDetailFeedback",
              "Clicked",
              "ClickTime",
              "Displayed",
              "DisplayTime",
              "DetailFeedback",
            });
    internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_descriptor,
            new java.lang.String[] {
              "AnswerRelevance",
              "DocumentCorrectness",
              "DocumentEfficiency",
              "SummarizationFeedback",
            });
    internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_SummarizationFeedback_descriptor =
        internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_SummarizationFeedback_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AgentAssistantFeedback_SummarizationFeedback_descriptor,
            new java.lang.String[] {
              "StartTime", "SubmitTime", "SummaryText",
            });
    internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_AgentAssistantRecord_descriptor,
            new java.lang.String[] {
              "ArticleSuggestionAnswer", "FaqAnswer", "Answer",
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
    com.google.cloud.dialogflow.v2.ParticipantProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
