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
// source: google/cloud/dialogflow/v2beta1/answer_record.proto

package com.google.cloud.dialogflow.v2beta1;

public final class AnswerRecordsProto {
  private AnswerRecordsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_AnswerRecord_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_AnswerRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantRecord_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_AnswerFeedback_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_AnswerFeedback_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantFeedback_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantFeedback_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantFeedback_SummarizationFeedback_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantFeedback_SummarizationFeedback_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetAnswerRecordRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetAnswerRecordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListAnswerRecordsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListAnswerRecordsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListAnswerRecordsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListAnswerRecordsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_UpdateAnswerRecordRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateAnswerRecordRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/dialogflow/v2beta1/answer"
          + "_record.proto\022\037google.cloud.dialogflow.v"
          + "2beta1\032\034google/api/annotations.proto\032\027go"
          + "ogle/api/client.proto\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\0321google/cloud/dialogflow/v2beta1/parti"
          + "cipant.proto\032 google/protobuf/field_mask"
          + ".proto\032\037google/protobuf/timestamp.proto\""
          + "\361\002\n\014AnswerRecord\022\014\n\004name\030\001 \001(\t\022H\n\017answer"
          + "_feedback\030\003 \001(\0132/.google.cloud.dialogflo"
          + "w.v2beta1.AnswerFeedback\022W\n\026agent_assist"
          + "ant_record\030\004 \001(\01325.google.cloud.dialogfl"
          + "ow.v2beta1.AgentAssistantRecordH\000:\245\001\352A\241\001"
          + "\n&dialogflow.googleapis.com/AnswerRecord"
          + "\0220projects/{project}/answerRecords/{answ"
          + "er_record}\022Eprojects/{project}/locations"
          + "/{location}/answerRecords/{answer_record"
          + "}B\010\n\006record\"\303\001\n\024AgentAssistantRecord\022Y\n\031"
          + "article_suggestion_answer\030\005 \001(\0132..google"
          + ".cloud.dialogflow.v2beta1.ArticleAnswerB"
          + "\004\342A\001\003H\000\022F\n\nfaq_answer\030\006 \001(\0132*.google.clo"
          + "ud.dialogflow.v2beta1.FaqAnswerB\004\342A\001\003H\000B"
          + "\010\n\006answer\"\334\003\n\016AnswerFeedback\022[\n\021correctn"
          + "ess_level\030\001 \001(\0162@.google.cloud.dialogflo"
          + "w.v2beta1.AnswerFeedback.CorrectnessLeve"
          + "l\022b\n\037agent_assistant_detail_feedback\030\002 \001"
          + "(\01327.google.cloud.dialogflow.v2beta1.Age"
          + "ntAssistantFeedbackH\000\022\017\n\007clicked\030\003 \001(\010\022."
          + "\n\nclick_time\030\005 \001(\0132\032.google.protobuf.Tim"
          + "estamp\022\021\n\tdisplayed\030\004 \001(\010\0220\n\014display_tim"
          + "e\030\006 \001(\0132\032.google.protobuf.Timestamp\"p\n\020C"
          + "orrectnessLevel\022!\n\035CORRECTNESS_LEVEL_UNS"
          + "PECIFIED\020\000\022\017\n\013NOT_CORRECT\020\001\022\025\n\021PARTIALLY"
          + "_CORRECT\020\002\022\021\n\rFULLY_CORRECT\020\003B\021\n\017detail_"
          + "feedback\"\340\006\n\026AgentAssistantFeedback\022a\n\020a"
          + "nswer_relevance\030\001 \001(\0162G.google.cloud.dia"
          + "logflow.v2beta1.AgentAssistantFeedback.A"
          + "nswerRelevance\022i\n\024document_correctness\030\002"
          + " \001(\0162K.google.cloud.dialogflow.v2beta1.A"
          + "gentAssistantFeedback.DocumentCorrectnes"
          + "s\022g\n\023document_efficiency\030\003 \001(\0162J.google."
          + "cloud.dialogflow.v2beta1.AgentAssistantF"
          + "eedback.DocumentEfficiency\022m\n\026summarizat"
          + "ion_feedback\030\004 \001(\0132M.google.cloud.dialog"
          + "flow.v2beta1.AgentAssistantFeedback.Summ"
          + "arizationFeedback\032\230\001\n\025SummarizationFeedb"
          + "ack\0223\n\017start_timestamp\030\001 \001(\0132\032.google.pr"
          + "otobuf.Timestamp\0224\n\020submit_timestamp\030\002 \001"
          + "(\0132\032.google.protobuf.Timestamp\022\024\n\014summar"
          + "y_text\030\003 \001(\t\"Q\n\017AnswerRelevance\022 \n\034ANSWE"
          + "R_RELEVANCE_UNSPECIFIED\020\000\022\016\n\nIRRELEVANT\020"
          + "\001\022\014\n\010RELEVANT\020\002\"W\n\023DocumentCorrectness\022$"
          + "\n DOCUMENT_CORRECTNESS_UNSPECIFIED\020\000\022\r\n\t"
          + "INCORRECT\020\001\022\013\n\007CORRECT\020\002\"Y\n\022DocumentEffi"
          + "ciency\022#\n\037DOCUMENT_EFFICIENCY_UNSPECIFIE"
          + "D\020\000\022\017\n\013INEFFICIENT\020\001\022\r\n\tEFFICIENT\020\002\"&\n\026G"
          + "etAnswerRecordRequest\022\014\n\004name\030\001 \001(\t\"\226\001\n\030"
          + "ListAnswerRecordsRequest\022;\n\006parent\030\001 \001(\t"
          + "B+\372A(\022&dialogflow.googleapis.com/AnswerR"
          + "ecord\022\026\n\006filter\030\002 \001(\tB\006\030\001\342A\001\001\022\021\n\tpage_si"
          + "ze\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\"{\n\031ListAnsw"
          + "erRecordsResponse\022E\n\016answer_records\030\001 \003("
          + "\0132-.google.cloud.dialogflow.v2beta1.Answ"
          + "erRecord\022\027\n\017next_page_token\030\002 \001(\t\"\230\001\n\031Up"
          + "dateAnswerRecordRequest\022J\n\ranswer_record"
          + "\030\001 \001(\0132-.google.cloud.dialogflow.v2beta1"
          + ".AnswerRecordB\004\342A\001\002\022/\n\013update_mask\030\002 \001(\013"
          + "2\032.google.protobuf.FieldMask2\302\007\n\rAnswerR"
          + "ecords\022\352\001\n\017GetAnswerRecord\0227.google.clou"
          + "d.dialogflow.v2beta1.GetAnswerRecordRequ"
          + "est\032-.google.cloud.dialogflow.v2beta1.An"
          + "swerRecord\"o\210\002\001\202\323\344\223\002f\022*/v2beta1/{name=pr"
          + "ojects/*/answerRecords/*}Z8\0226/v2beta1/{n"
          + "ame=projects/*/locations/*/answerRecords"
          + "/*}\022\201\002\n\021ListAnswerRecords\0229.google.cloud"
          + ".dialogflow.v2beta1.ListAnswerRecordsReq"
          + "uest\032:.google.cloud.dialogflow.v2beta1.L"
          + "istAnswerRecordsResponse\"u\332A\006parent\202\323\344\223\002"
          + "f\022*/v2beta1/{parent=projects/*}/answerRe"
          + "cordsZ8\0226/v2beta1/{parent=projects/*/loc"
          + "ations/*}/answerRecords\022\305\002\n\022UpdateAnswer"
          + "Record\022:.google.cloud.dialogflow.v2beta1"
          + ".UpdateAnswerRecordRequest\032-.google.clou"
          + "d.dialogflow.v2beta1.AnswerRecord\"\303\001\332A\031a"
          + "nswer_record,update_mask\202\323\344\223\002\240\00128/v2beta"
          + "1/{answer_record.name=projects/*/answerR"
          + "ecords/*}:\ranswer_recordZU2D/v2beta1/{an"
          + "swer_record.name=projects/*/locations/*/"
          + "answerRecords/*}:\ranswer_record\032x\312A\031dial"
          + "ogflow.googleapis.com\322AYhttps://www.goog"
          + "leapis.com/auth/cloud-platform,https://w"
          + "ww.googleapis.com/auth/dialogflowB\252\001\n#co"
          + "m.google.cloud.dialogflow.v2beta1B\022Answe"
          + "rRecordsProtoP\001ZCcloud.google.com/go/dia"
          + "logflow/apiv2beta1/dialogflowpb;dialogfl"
          + "owpb\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dialogflow.V"
          + "2Beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.v2beta1.ParticipantProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2beta1_AnswerRecord_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_AnswerRecord_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_AnswerRecord_descriptor,
            new java.lang.String[] {
              "Name", "AnswerFeedback", "AgentAssistantRecord", "Record",
            });
    internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantRecord_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantRecord_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantRecord_descriptor,
            new java.lang.String[] {
              "ArticleSuggestionAnswer", "FaqAnswer", "Answer",
            });
    internal_static_google_cloud_dialogflow_v2beta1_AnswerFeedback_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_AnswerFeedback_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_AnswerFeedback_descriptor,
            new java.lang.String[] {
              "CorrectnessLevel",
              "AgentAssistantDetailFeedback",
              "Clicked",
              "ClickTime",
              "Displayed",
              "DisplayTime",
              "DetailFeedback",
            });
    internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantFeedback_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantFeedback_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantFeedback_descriptor,
            new java.lang.String[] {
              "AnswerRelevance",
              "DocumentCorrectness",
              "DocumentEfficiency",
              "SummarizationFeedback",
            });
    internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantFeedback_SummarizationFeedback_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantFeedback_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantFeedback_SummarizationFeedback_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_AgentAssistantFeedback_SummarizationFeedback_descriptor,
            new java.lang.String[] {
              "StartTimestamp", "SubmitTimestamp", "SummaryText",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetAnswerRecordRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_GetAnswerRecordRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetAnswerRecordRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListAnswerRecordsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_ListAnswerRecordsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListAnswerRecordsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListAnswerRecordsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_ListAnswerRecordsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListAnswerRecordsResponse_descriptor,
            new java.lang.String[] {
              "AnswerRecords", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateAnswerRecordRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateAnswerRecordRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_UpdateAnswerRecordRequest_descriptor,
            new java.lang.String[] {
              "AnswerRecord", "UpdateMask",
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
    com.google.cloud.dialogflow.v2beta1.ParticipantProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
