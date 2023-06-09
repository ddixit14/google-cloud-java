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
// source: google/cloud/phishingprotection/v1beta1/phishingprotection.proto

package com.google.phishingprotection.v1beta1;

public final class PhishingProtectionProto {
  private PhishingProtectionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n@google/cloud/phishingprotection/v1beta"
          + "1/phishingprotection.proto\022\'google.cloud"
          + ".phishingprotection.v1beta1\032\034google/api/"
          + "annotations.proto\032\027google/api/client.pro"
          + "to\032\037google/api/field_behavior.proto\032\031goo"
          + "gle/api/resource.proto\"p\n\025ReportPhishing"
          + "Request\022D\n\006parent\030\001 \001(\tB4\342A\001\002\372A-\n+cloudr"
          + "esourcemanager.googleapis.com/Project\022\021\n"
          + "\003uri\030\002 \001(\tB\004\342A\001\002\"\030\n\026ReportPhishingRespon"
          + "se2\323\002\n PhishingProtectionServiceV1Beta1\022"
          + "\327\001\n\016ReportPhishing\022>.google.cloud.phishi"
          + "ngprotection.v1beta1.ReportPhishingReque"
          + "st\032?.google.cloud.phishingprotection.v1b"
          + "eta1.ReportPhishingResponse\"D\332A\nparent,u"
          + "ri\202\323\344\223\0021\",/v1beta1/{parent=projects/*}/p"
          + "hishing:report:\001*\032U\312A!phishingprotection"
          + ".googleapis.com\322A.https://www.googleapis"
          + ".com/auth/cloud-platformB\247\002\n%com.google."
          + "phishingprotection.v1beta1B\027PhishingProt"
          + "ectionProtoP\001Z[cloud.google.com/go/phish"
          + "ingprotection/apiv1beta1/phishingprotect"
          + "ionpb;phishingprotectionpb\242\002\004GCPP\252\002\'Goog"
          + "le.Cloud.PhishingProtection.V1Beta1\312\002\'Go"
          + "ogle\\Cloud\\PhishingProtection\\V1beta1\352\002*"
          + "Google::Cloud::PhishingProtection::V1bet"
          + "a1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Uri",
            });
    internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingResponse_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
