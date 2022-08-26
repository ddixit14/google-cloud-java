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
// source: google/cloud/aiplatform/v1/schema/predict/instance/image_classification.proto

package com.google.cloud.aiplatform.v1.schema.predict.instance;

public final class ImageClassificationPredictionInstanceProto {
  private ImageClassificationPredictionInstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageClassificationPredictionInstance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageClassificationPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nMgoogle/cloud/aiplatform/v1/schema/pred"
          + "ict/instance/image_classification.proto\022"
          + "2google.cloud.aiplatform.v1.schema.predi"
          + "ct.instance\"K\n%ImageClassificationPredic"
          + "tionInstance\022\017\n\007content\030\001 \001(\t\022\021\n\tmime_ty"
          + "pe\030\002 \001(\tB\347\002\n6com.google.cloud.aiplatform"
          + ".v1.schema.predict.instanceB*ImageClassi"
          + "ficationPredictionInstanceProtoP\001ZZgoogl"
          + "e.golang.org/genproto/googleapis/cloud/a"
          + "iplatform/v1/schema/predict/instance;ins"
          + "tance\252\0022Google.Cloud.AIPlatform.V1.Schem"
          + "a.Predict.Instance\312\0022Google\\Cloud\\AIPlat"
          + "form\\V1\\Schema\\Predict\\Instance\352\0028Google"
          + "::Cloud::AIPlatform::V1::Schema::Predict"
          + "::Instanceb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageClassificationPredictionInstance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageClassificationPredictionInstance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageClassificationPredictionInstance_descriptor,
            new java.lang.String[] {
              "Content", "MimeType",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}