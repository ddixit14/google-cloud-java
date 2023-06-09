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
// source: google/cloud/dialogflow/cx/v3beta1/response_message.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class ResponseMessageProto {
  private ResponseMessageProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_Text_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_Text_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_LiveAgentHandoff_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_LiveAgentHandoff_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_ConversationSuccess_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_ConversationSuccess_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_OutputAudioText_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_OutputAudioText_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_EndInteraction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_EndInteraction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_PlayAudio_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_PlayAudio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_Segment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_Segment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_TelephonyTransferCall_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_TelephonyTransferCall_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/dialogflow/cx/v3beta1/res"
          + "ponse_message.proto\022\"google.cloud.dialog"
          + "flow.cx.v3beta1\032\037google/api/field_behavi"
          + "or.proto\032\034google/protobuf/struct.proto\"\361"
          + "\013\n\017ResponseMessage\022H\n\004text\030\001 \001(\01328.googl"
          + "e.cloud.dialogflow.cx.v3beta1.ResponseMe"
          + "ssage.TextH\000\022*\n\007payload\030\002 \001(\0132\027.google.p"
          + "rotobuf.StructH\000\022g\n\024conversation_success"
          + "\030\t \001(\0132G.google.cloud.dialogflow.cx.v3be"
          + "ta1.ResponseMessage.ConversationSuccessH"
          + "\000\022`\n\021output_audio_text\030\010 \001(\0132C.google.cl"
          + "oud.dialogflow.cx.v3beta1.ResponseMessag"
          + "e.OutputAudioTextH\000\022b\n\022live_agent_handof"
          + "f\030\n \001(\0132D.google.cloud.dialogflow.cx.v3b"
          + "eta1.ResponseMessage.LiveAgentHandoffH\000\022"
          + "c\n\017end_interaction\030\013 \001(\0132B.google.cloud."
          + "dialogflow.cx.v3beta1.ResponseMessage.En"
          + "dInteractionB\004\342A\001\003H\000\022S\n\nplay_audio\030\014 \001(\013"
          + "2=.google.cloud.dialogflow.cx.v3beta1.Re"
          + "sponseMessage.PlayAudioH\000\022[\n\013mixed_audio"
          + "\030\r \001(\0132>.google.cloud.dialogflow.cx.v3be"
          + "ta1.ResponseMessage.MixedAudioB\004\342A\001\003H\000\022l"
          + "\n\027telephony_transfer_call\030\022 \001(\0132I.google"
          + ".cloud.dialogflow.cx.v3beta1.ResponseMes"
          + "sage.TelephonyTransferCallH\000\022\017\n\007channel\030"
          + "\023 \001(\t\032E\n\004Text\022\022\n\004text\030\001 \003(\tB\004\342A\001\002\022)\n\033all"
          + "ow_playback_interruption\030\002 \001(\010B\004\342A\001\003\032=\n\020"
          + "LiveAgentHandoff\022)\n\010metadata\030\001 \001(\0132\027.goo"
          + "gle.protobuf.Struct\032@\n\023ConversationSucce"
          + "ss\022)\n\010metadata\030\001 \001(\0132\027.google.protobuf.S"
          + "truct\032f\n\017OutputAudioText\022\016\n\004text\030\001 \001(\tH\000"
          + "\022\016\n\004ssml\030\002 \001(\tH\000\022)\n\033allow_playback_inter"
          + "ruption\030\003 \001(\010B\004\342A\001\003B\010\n\006source\032\020\n\016EndInte"
          + "raction\032O\n\tPlayAudio\022\027\n\taudio_uri\030\001 \001(\tB"
          + "\004\342A\001\002\022)\n\033allow_playback_interruption\030\002 \001"
          + "(\010B\004\342A\001\003\032\307\001\n\nMixedAudio\022X\n\010segments\030\001 \003("
          + "\0132F.google.cloud.dialogflow.cx.v3beta1.R"
          + "esponseMessage.MixedAudio.Segment\032_\n\007Seg"
          + "ment\022\017\n\005audio\030\001 \001(\014H\000\022\r\n\003uri\030\002 \001(\tH\000\022)\n\033"
          + "allow_playback_interruption\030\003 \001(\010B\004\342A\001\003B"
          + "\t\n\007content\032;\n\025TelephonyTransferCall\022\026\n\014p"
          + "hone_number\030\001 \001(\tH\000B\n\n\010endpointB\t\n\007messa"
          + "geB\316\001\n&com.google.cloud.dialogflow.cx.v3"
          + "beta1B\024ResponseMessageProtoP\001Z6cloud.goo"
          + "gle.com/go/dialogflow/cx/apiv3beta1/cxpb"
          + ";cxpb\370\001\001\242\002\002DF\252\002\"Google.Cloud.Dialogflow."
          + "Cx.V3Beta1\352\002&Google::Cloud::Dialogflow::"
          + "CX::V3beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor,
            new java.lang.String[] {
              "Text",
              "Payload",
              "ConversationSuccess",
              "OutputAudioText",
              "LiveAgentHandoff",
              "EndInteraction",
              "PlayAudio",
              "MixedAudio",
              "TelephonyTransferCall",
              "Channel",
              "Message",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_Text_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_Text_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_Text_descriptor,
            new java.lang.String[] {
              "Text", "AllowPlaybackInterruption",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_LiveAgentHandoff_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_LiveAgentHandoff_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_LiveAgentHandoff_descriptor,
            new java.lang.String[] {
              "Metadata",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_ConversationSuccess_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_ConversationSuccess_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_ConversationSuccess_descriptor,
            new java.lang.String[] {
              "Metadata",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_OutputAudioText_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_OutputAudioText_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_OutputAudioText_descriptor,
            new java.lang.String[] {
              "Text", "Ssml", "AllowPlaybackInterruption", "Source",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_EndInteraction_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_EndInteraction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_EndInteraction_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_PlayAudio_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_PlayAudio_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_PlayAudio_descriptor,
            new java.lang.String[] {
              "AudioUri", "AllowPlaybackInterruption",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor
            .getNestedTypes()
            .get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_descriptor,
            new java.lang.String[] {
              "Segments",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_Segment_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_Segment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_MixedAudio_Segment_descriptor,
            new java.lang.String[] {
              "Audio", "Uri", "AllowPlaybackInterruption", "Content",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_TelephonyTransferCall_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_descriptor
            .getNestedTypes()
            .get(7);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_TelephonyTransferCall_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ResponseMessage_TelephonyTransferCall_descriptor,
            new java.lang.String[] {
              "PhoneNumber", "Endpoint",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
