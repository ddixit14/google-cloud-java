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
// source: google/cloud/networksecurity/v1beta1/network_security.proto

package com.google.cloud.networksecurity.v1beta1;

public final class NetworkSecurityOuterClass {
  private NetworkSecurityOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/cloud/networksecurity/v1beta1/n"
          + "etwork_security.proto\022$google.cloud.netw"
          + "orksecurity.v1beta1\032\034google/api/annotati"
          + "ons.proto\032\027google/api/client.proto\032?goog"
          + "le/cloud/networksecurity/v1beta1/authori"
          + "zation_policy.proto\032<google/cloud/networ"
          + "ksecurity/v1beta1/client_tls_policy.prot"
          + "o\032<google/cloud/networksecurity/v1beta1/"
          + "server_tls_policy.proto\032#google/longrunn"
          + "ing/operations.proto2\336\"\n\017NetworkSecurity"
          + "\022\375\001\n\031ListAuthorizationPolicies\022F.google."
          + "cloud.networksecurity.v1beta1.ListAuthor"
          + "izationPoliciesRequest\032G.google.cloud.ne"
          + "tworksecurity.v1beta1.ListAuthorizationP"
          + "oliciesResponse\"O\332A\006parent\202\323\344\223\002@\022>/v1bet"
          + "a1/{parent=projects/*/locations/*}/autho"
          + "rizationPolicies\022\347\001\n\026GetAuthorizationPol"
          + "icy\022C.google.cloud.networksecurity.v1bet"
          + "a1.GetAuthorizationPolicyRequest\0329.googl"
          + "e.cloud.networksecurity.v1beta1.Authoriz"
          + "ationPolicy\"M\332A\004name\202\323\344\223\002@\022>/v1beta1/{na"
          + "me=projects/*/locations/*/authorizationP"
          + "olicies/*}\022\347\002\n\031CreateAuthorizationPolicy"
          + "\022F.google.cloud.networksecurity.v1beta1."
          + "CreateAuthorizationPolicyRequest\032\035.googl"
          + "e.longrunning.Operation\"\342\001\312AM\n\023Authoriza"
          + "tionPolicy\0226google.cloud.networksecurity"
          + ".v1beta1.OperationMetadata\332A3parent,auth"
          + "orization_policy,authorization_policy_id"
          + "\202\323\344\223\002V\">/v1beta1/{parent=projects/*/loca"
          + "tions/*}/authorizationPolicies:\024authoriz"
          + "ation_policy\022\351\002\n\031UpdateAuthorizationPoli"
          + "cy\022F.google.cloud.networksecurity.v1beta"
          + "1.UpdateAuthorizationPolicyRequest\032\035.goo"
          + "gle.longrunning.Operation\"\344\001\312AM\n\023Authori"
          + "zationPolicy\0226google.cloud.networksecuri"
          + "ty.v1beta1.OperationMetadata\332A authoriza"
          + "tion_policy,update_mask\202\323\344\223\002k2S/v1beta1/"
          + "{authorization_policy.name=projects/*/lo"
          + "cations/*/authorizationPolicies/*}:\024auth"
          + "orization_policy\022\244\002\n\031DeleteAuthorization"
          + "Policy\022F.google.cloud.networksecurity.v1"
          + "beta1.DeleteAuthorizationPolicyRequest\032\035"
          + ".google.longrunning.Operation\"\237\001\312AO\n\025goo"
          + "gle.protobuf.Empty\0226google.cloud.network"
          + "security.v1beta1.OperationMetadata\332A\004nam"
          + "e\202\323\344\223\002@*>/v1beta1/{name=projects/*/locat"
          + "ions/*/authorizationPolicies/*}\022\355\001\n\025List"
          + "ServerTlsPolicies\022B.google.cloud.network"
          + "security.v1beta1.ListServerTlsPoliciesRe"
          + "quest\032C.google.cloud.networksecurity.v1b"
          + "eta1.ListServerTlsPoliciesResponse\"K\332A\006p"
          + "arent\202\323\344\223\002<\022:/v1beta1/{parent=projects/*"
          + "/locations/*}/serverTlsPolicies\022\327\001\n\022GetS"
          + "erverTlsPolicy\022?.google.cloud.networksec"
          + "urity.v1beta1.GetServerTlsPolicyRequest\032"
          + "5.google.cloud.networksecurity.v1beta1.S"
          + "erverTlsPolicy\"I\332A\004name\202\323\344\223\002<\022:/v1beta1/"
          + "{name=projects/*/locations/*/serverTlsPo"
          + "licies/*}\022\316\002\n\025CreateServerTlsPolicy\022B.go"
          + "ogle.cloud.networksecurity.v1beta1.Creat"
          + "eServerTlsPolicyRequest\032\035.google.longrun"
          + "ning.Operation\"\321\001\312AI\n\017ServerTlsPolicy\0226g"
          + "oogle.cloud.networksecurity.v1beta1.Oper"
          + "ationMetadata\332A-parent,server_tls_policy"
          + ",server_tls_policy_id\202\323\344\223\002O\":/v1beta1/{p"
          + "arent=projects/*/locations/*}/serverTlsP"
          + "olicies:\021server_tls_policy\022\320\002\n\025UpdateSer"
          + "verTlsPolicy\022B.google.cloud.networksecur"
          + "ity.v1beta1.UpdateServerTlsPolicyRequest"
          + "\032\035.google.longrunning.Operation\"\323\001\312AI\n\017S"
          + "erverTlsPolicy\0226google.cloud.networksecu"
          + "rity.v1beta1.OperationMetadata\332A\035server_"
          + "tls_policy,update_mask\202\323\344\223\002a2L/v1beta1/{"
          + "server_tls_policy.name=projects/*/locati"
          + "ons/*/serverTlsPolicies/*}:\021server_tls_p"
          + "olicy\022\230\002\n\025DeleteServerTlsPolicy\022B.google"
          + ".cloud.networksecurity.v1beta1.DeleteSer"
          + "verTlsPolicyRequest\032\035.google.longrunning"
          + ".Operation\"\233\001\312AO\n\025google.protobuf.Empty\022"
          + "6google.cloud.networksecurity.v1beta1.Op"
          + "erationMetadata\332A\004name\202\323\344\223\002<*:/v1beta1/{"
          + "name=projects/*/locations/*/serverTlsPol"
          + "icies/*}\022\355\001\n\025ListClientTlsPolicies\022B.goo"
          + "gle.cloud.networksecurity.v1beta1.ListCl"
          + "ientTlsPoliciesRequest\032C.google.cloud.ne"
          + "tworksecurity.v1beta1.ListClientTlsPolic"
          + "iesResponse\"K\332A\006parent\202\323\344\223\002<\022:/v1beta1/{"
          + "parent=projects/*/locations/*}/clientTls"
          + "Policies\022\327\001\n\022GetClientTlsPolicy\022?.google"
          + ".cloud.networksecurity.v1beta1.GetClient"
          + "TlsPolicyRequest\0325.google.cloud.networks"
          + "ecurity.v1beta1.ClientTlsPolicy\"I\332A\004name"
          + "\202\323\344\223\002<\022:/v1beta1/{name=projects/*/locati"
          + "ons/*/clientTlsPolicies/*}\022\316\002\n\025CreateCli"
          + "entTlsPolicy\022B.google.cloud.networksecur"
          + "ity.v1beta1.CreateClientTlsPolicyRequest"
          + "\032\035.google.longrunning.Operation\"\321\001\312AI\n\017C"
          + "lientTlsPolicy\0226google.cloud.networksecu"
          + "rity.v1beta1.OperationMetadata\332A-parent,"
          + "client_tls_policy,client_tls_policy_id\202\323"
          + "\344\223\002O\":/v1beta1/{parent=projects/*/locati"
          + "ons/*}/clientTlsPolicies:\021client_tls_pol"
          + "icy\022\320\002\n\025UpdateClientTlsPolicy\022B.google.c"
          + "loud.networksecurity.v1beta1.UpdateClien"
          + "tTlsPolicyRequest\032\035.google.longrunning.O"
          + "peration\"\323\001\312AI\n\017ClientTlsPolicy\0226google."
          + "cloud.networksecurity.v1beta1.OperationM"
          + "etadata\332A\035client_tls_policy,update_mask\202"
          + "\323\344\223\002a2L/v1beta1/{client_tls_policy.name="
          + "projects/*/locations/*/clientTlsPolicies"
          + "/*}:\021client_tls_policy\022\230\002\n\025DeleteClientT"
          + "lsPolicy\022B.google.cloud.networksecurity."
          + "v1beta1.DeleteClientTlsPolicyRequest\032\035.g"
          + "oogle.longrunning.Operation\"\233\001\312AO\n\025googl"
          + "e.protobuf.Empty\0226google.cloud.networkse"
          + "curity.v1beta1.OperationMetadata\332A\004name\202"
          + "\323\344\223\002<*:/v1beta1/{name=projects/*/locatio"
          + "ns/*/clientTlsPolicies/*}\032R\312A\036networksec"
          + "urity.googleapis.com\322A.https://www.googl"
          + "eapis.com/auth/cloud-platformB\370\001\n(com.go"
          + "ogle.cloud.networksecurity.v1beta1P\001ZRcl"
          + "oud.google.com/go/networksecurity/apiv1b"
          + "eta1/networksecuritypb;networksecuritypb"
          + "\252\002$Google.Cloud.NetworkSecurity.V1Beta1\312"
          + "\002$Google\\Cloud\\NetworkSecurity\\V1beta1\352\002"
          + "\'Google::Cloud::NetworkSecurity::V1beta1"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyProto.getDescriptor(),
              com.google.cloud.networksecurity.v1beta1.ClientTlsPolicyProto.getDescriptor(),
              com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyProto.getDescriptor();
    com.google.cloud.networksecurity.v1beta1.ClientTlsPolicyProto.getDescriptor();
    com.google.cloud.networksecurity.v1beta1.ServerTlsPolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
