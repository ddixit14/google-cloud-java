/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/automl/v1beta1/model.proto

package com.google.cloud.automl.v1beta1;

public final class ModelOuterClass {
  private ModelOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_Model_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_Model_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/automl/v1beta1/model.prot"
          + "o\022\033google.cloud.automl.v1beta1\032\'google/c"
          + "loud/automl/v1beta1/image.proto\032(google/"
          + "cloud/automl/v1beta1/tables.proto\032&googl"
          + "e/cloud/automl/v1beta1/text.proto\032-googl"
          + "e/cloud/automl/v1beta1/translation.proto"
          + "\032\'google/cloud/automl/v1beta1/video.prot"
          + "o\032\037google/protobuf/timestamp.proto\032\034goog"
          + "le/api/annotations.proto\"\362\t\n\005Model\022[\n\032tr"
          + "anslation_model_metadata\030\017 \001(\01325.google."
          + "cloud.automl.v1beta1.TranslationModelMet"
          + "adataH\000\022l\n#image_classification_model_me"
          + "tadata\030\r \001(\0132=.google.cloud.automl.v1bet"
          + "a1.ImageClassificationModelMetadataH\000\022j\n"
          + "\"text_classification_model_metadata\030\016 \001("
          + "\0132<.google.cloud.automl.v1beta1.TextClas"
          + "sificationModelMetadataH\000\022o\n%image_objec"
          + "t_detection_model_metadata\030\024 \001(\0132>.googl"
          + "e.cloud.automl.v1beta1.ImageObjectDetect"
          + "ionModelMetadataH\000\022l\n#video_classificati"
          + "on_model_metadata\030\027 \001(\0132=.google.cloud.a"
          + "utoml.v1beta1.VideoClassificationModelMe"
          + "tadataH\000\022m\n$video_object_tracking_model_"
          + "metadata\030\025 \001(\0132=.google.cloud.automl.v1b"
          + "eta1.VideoObjectTrackingModelMetadataH\000\022"
          + "b\n\036text_extraction_model_metadata\030\023 \001(\0132"
          + "8.google.cloud.automl.v1beta1.TextExtrac"
          + "tionModelMetadataH\000\022Q\n\025tables_model_meta"
          + "data\030\030 \001(\01320.google.cloud.automl.v1beta1"
          + ".TablesModelMetadataH\000\022`\n\035text_sentiment"
          + "_model_metadata\030\026 \001(\01327.google.cloud.aut"
          + "oml.v1beta1.TextSentimentModelMetadataH\000"
          + "\022\014\n\004name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022\022\n\n"
          + "dataset_id\030\003 \001(\t\022/\n\013create_time\030\007 \001(\0132\032."
          + "google.protobuf.Timestamp\022/\n\013update_time"
          + "\030\013 \001(\0132\032.google.protobuf.Timestamp\022L\n\020de"
          + "ployment_state\030\010 \001(\01622.google.cloud.auto"
          + "ml.v1beta1.Model.DeploymentState\"Q\n\017Depl"
          + "oymentState\022 \n\034DEPLOYMENT_STATE_UNSPECIF"
          + "IED\020\000\022\014\n\010DEPLOYED\020\001\022\016\n\nUNDEPLOYED\020\002B\020\n\016m"
          + "odel_metadataB\245\001\n\037com.google.cloud.autom"
          + "l.v1beta1P\001ZAgoogle.golang.org/genproto/"
          + "googleapis/cloud/automl/v1beta1;automl\312\002"
          + "\033Google\\Cloud\\AutoMl\\V1beta1\352\002\036Google::C"
          + "loud::AutoML::V1beta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.automl.v1beta1.ImageProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.Tables.getDescriptor(),
          com.google.cloud.automl.v1beta1.TextProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.VideoProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_automl_v1beta1_Model_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_Model_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_Model_descriptor,
            new java.lang.String[] {
              "TranslationModelMetadata",
              "ImageClassificationModelMetadata",
              "TextClassificationModelMetadata",
              "ImageObjectDetectionModelMetadata",
              "VideoClassificationModelMetadata",
              "VideoObjectTrackingModelMetadata",
              "TextExtractionModelMetadata",
              "TablesModelMetadata",
              "TextSentimentModelMetadata",
              "Name",
              "DisplayName",
              "DatasetId",
              "CreateTime",
              "UpdateTime",
              "DeploymentState",
              "ModelMetadata",
            });
    com.google.cloud.automl.v1beta1.ImageProto.getDescriptor();
    com.google.cloud.automl.v1beta1.Tables.getDescriptor();
    com.google.cloud.automl.v1beta1.TextProto.getDescriptor();
    com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor();
    com.google.cloud.automl.v1beta1.VideoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
