/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/discoveryengine/v1/document_service.proto

package com.google.cloud.discoveryengine.v1;

public final class DocumentServiceProto {
  private DocumentServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_GetDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_GetDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ListDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ListDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ListDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ListDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_CreateDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_CreateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_UpdateDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_UpdateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_DeleteDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_DeleteDocumentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/discoveryengine/v1/docume"
          + "nt_service.proto\022\037google.cloud.discovery"
          + "engine.v1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032.google/cloud/discoveryengine/v1/do"
          + "cument.proto\0323google/cloud/discoveryengi"
          + "ne/v1/import_config.proto\0322google/cloud/"
          + "discoveryengine/v1/purge_config.proto\032#g"
          + "oogle/longrunning/operations.proto\032\033goog"
          + "le/protobuf/empty.proto\"T\n\022GetDocumentRe"
          + "quest\022>\n\004name\030\001 \001(\tB0\342A\001\002\372A)\n\'discoverye"
          + "ngine.googleapis.com/Document\"}\n\024ListDoc"
          + "umentsRequest\022>\n\006parent\030\001 \001(\tB.\342A\001\002\372A\'\n%"
          + "discoveryengine.googleapis.com/Branch\022\021\n"
          + "\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"n\n\025"
          + "ListDocumentsResponse\022<\n\tdocuments\030\001 \003(\013"
          + "2).google.cloud.discoveryengine.v1.Docum"
          + "ent\022\027\n\017next_page_token\030\002 \001(\t\"\265\001\n\025CreateD"
          + "ocumentRequest\022>\n\006parent\030\001 \001(\tB.\342A\001\002\372A\'\n"
          + "%discoveryengine.googleapis.com/Branch\022A"
          + "\n\010document\030\002 \001(\0132).google.cloud.discover"
          + "yengine.v1.DocumentB\004\342A\001\002\022\031\n\013document_id"
          + "\030\003 \001(\tB\004\342A\001\002\"q\n\025UpdateDocumentRequest\022A\n"
          + "\010document\030\001 \001(\0132).google.cloud.discovery"
          + "engine.v1.DocumentB\004\342A\001\002\022\025\n\rallow_missin"
          + "g\030\002 \001(\010\"W\n\025DeleteDocumentRequest\022>\n\004name"
          + "\030\001 \001(\tB0\342A\001\002\372A)\n\'discoveryengine.googlea"
          + "pis.com/Document2\220\023\n\017DocumentService\022\234\002\n"
          + "\013GetDocument\0223.google.cloud.discoveryeng"
          + "ine.v1.GetDocumentRequest\032).google.cloud"
          + ".discoveryengine.v1.Document\"\254\001\332A\004name\202\323"
          + "\344\223\002\236\001\022E/v1/{name=projects/*/locations/*/"
          + "dataStores/*/branches/*/documents/*}ZU\022S"
          + "/v1/{name=projects/*/locations/*/collect"
          + "ions/*/dataStores/*/branches/*/documents"
          + "/*}\022\257\002\n\rListDocuments\0225.google.cloud.dis"
          + "coveryengine.v1.ListDocumentsRequest\0326.g"
          + "oogle.cloud.discoveryengine.v1.ListDocum"
          + "entsResponse\"\256\001\332A\006parent\202\323\344\223\002\236\001\022E/v1/{pa"
          + "rent=projects/*/locations/*/dataStores/*"
          + "/branches/*}/documentsZU\022S/v1/{parent=pr"
          + "ojects/*/locations/*/collections/*/dataS"
          + "tores/*/branches/*}/documents\022\315\002\n\016Create"
          + "Document\0226.google.cloud.discoveryengine."
          + "v1.CreateDocumentRequest\032).google.cloud."
          + "discoveryengine.v1.Document\"\327\001\332A\033parent,"
          + "document,document_id\202\323\344\223\002\262\001\"E/v1/{parent"
          + "=projects/*/locations/*/dataStores/*/bra"
          + "nches/*}/documents:\010documentZ_\"S/v1/{par"
          + "ent=projects/*/locations/*/collections/*"
          + "/dataStores/*/branches/*}/documents:\010doc"
          + "ument\022\301\002\n\016UpdateDocument\0226.google.cloud."
          + "discoveryengine.v1.UpdateDocumentRequest"
          + "\032).google.cloud.discoveryengine.v1.Docum"
          + "ent\"\313\001\202\323\344\223\002\304\0012N/v1/{document.name=projec"
          + "ts/*/locations/*/dataStores/*/branches/*"
          + "/documents/*}:\010documentZh2\\/v1/{document"
          + ".name=projects/*/locations/*/collections"
          + "/*/dataStores/*/branches/*/documents/*}:"
          + "\010document\022\217\002\n\016DeleteDocument\0226.google.cl"
          + "oud.discoveryengine.v1.DeleteDocumentReq"
          + "uest\032\026.google.protobuf.Empty\"\254\001\332A\004name\202\323"
          + "\344\223\002\236\001*E/v1/{name=projects/*/locations/*/"
          + "dataStores/*/branches/*/documents/*}ZU*S"
          + "/v1/{name=projects/*/locations/*/collect"
          + "ions/*/dataStores/*/branches/*/documents"
          + "/*}\022\232\003\n\017ImportDocuments\0227.google.cloud.d"
          + "iscoveryengine.v1.ImportDocumentsRequest"
          + "\032\035.google.longrunning.Operation\"\256\002\312Ar\n7g"
          + "oogle.cloud.discoveryengine.v1.ImportDoc"
          + "umentsResponse\0227google.cloud.discoveryen"
          + "gine.v1.ImportDocumentsMetadata\202\323\344\223\002\262\001\"L"
          + "/v1/{parent=projects/*/locations/*/dataS"
          + "tores/*/branches/*}/documents:import:\001*Z"
          + "_\"Z/v1/{parent=projects/*/locations/*/co"
          + "llections/*/dataStores/*/branches/*}/doc"
          + "uments:import:\001*\022\224\003\n\016PurgeDocuments\0226.go"
          + "ogle.cloud.discoveryengine.v1.PurgeDocum"
          + "entsRequest\032\035.google.longrunning.Operati"
          + "on\"\252\002\312Ap\n6google.cloud.discoveryengine.v"
          + "1.PurgeDocumentsResponse\0226google.cloud.d"
          + "iscoveryengine.v1.PurgeDocumentsMetadata"
          + "\202\323\344\223\002\260\001\"K/v1/{parent=projects/*/location"
          + "s/*/dataStores/*/branches/*}/documents:p"
          + "urge:\001*Z^\"Y/v1/{parent=projects/*/locati"
          + "ons/*/collections/*/dataStores/*/branche"
          + "s/*}/documents:purge:\001*\032R\312A\036discoveryeng"
          + "ine.googleapis.com\322A.https://www.googlea"
          + "pis.com/auth/cloud-platformB\207\002\n#com.goog"
          + "le.cloud.discoveryengine.v1B\024DocumentSer"
          + "viceProtoP\001ZMcloud.google.com/go/discove"
          + "ryengine/apiv1/discoveryenginepb;discove"
          + "ryenginepb\242\002\017DISCOVERYENGINE\252\002\037Google.Cl"
          + "oud.DiscoveryEngine.V1\312\002\037Google\\Cloud\\Di"
          + "scoveryEngine\\V1\352\002\"Google::Cloud::Discov"
          + "eryEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.DocumentProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.ImportConfigProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.PurgeConfigProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_GetDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_GetDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_GetDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1_ListDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_ListDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ListDocumentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_discoveryengine_v1_ListDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1_ListDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ListDocumentsResponse_descriptor,
            new java.lang.String[] {
              "Documents", "NextPageToken",
            });
    internal_static_google_cloud_discoveryengine_v1_CreateDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1_CreateDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_CreateDocumentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Document", "DocumentId",
            });
    internal_static_google_cloud_discoveryengine_v1_UpdateDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1_UpdateDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_UpdateDocumentRequest_descriptor,
            new java.lang.String[] {
              "Document", "AllowMissing",
            });
    internal_static_google_cloud_discoveryengine_v1_DeleteDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1_DeleteDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_DeleteDocumentRequest_descriptor,
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
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1.DocumentProto.getDescriptor();
    com.google.cloud.discoveryengine.v1.ImportConfigProto.getDescriptor();
    com.google.cloud.discoveryengine.v1.PurgeConfigProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
