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
// source: google/cloud/gaming/v1/game_server_deployments_service.proto

package com.google.cloud.gaming.v1;

public final class GameServerDeploymentsServiceOuterClass {
  private GameServerDeploymentsServiceOuterClass() {}

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
      "\n<google/cloud/gaming/v1/game_server_dep"
          + "loyments_service.proto\022\026google.cloud.gam"
          + "ing.v1\032\034google/api/annotations.proto\032\027go"
          + "ogle/api/client.proto\0324google/cloud/gami"
          + "ng/v1/game_server_deployments.proto\032#goo"
          + "gle/longrunning/operations.proto2\350\022\n\034Gam"
          + "eServerDeploymentsService\022\334\001\n\031ListGameSe"
          + "rverDeployments\0228.google.cloud.gaming.v1"
          + ".ListGameServerDeploymentsRequest\0329.goog"
          + "le.cloud.gaming.v1.ListGameServerDeploym"
          + "entsResponse\"J\332A\006parent\202\323\344\223\002;\0229/v1/{pare"
          + "nt=projects/*/locations/*}/gameServerDep"
          + "loyments\022\311\001\n\027GetGameServerDeployment\0226.g"
          + "oogle.cloud.gaming.v1.GetGameServerDeplo"
          + "ymentRequest\032,.google.cloud.gaming.v1.Ga"
          + "meServerDeployment\"H\332A\004name\202\323\344\223\002;\0229/v1/{"
          + "name=projects/*/locations/*/gameServerDe"
          + "ployments/*}\022\236\002\n\032CreateGameServerDeploym"
          + "ent\0229.google.cloud.gaming.v1.CreateGameS"
          + "erverDeploymentRequest\032\035.google.longrunn"
          + "ing.Operation\"\245\001\312A)\n\024GameServerDeploymen"
          + "t\022\021OperationMetadata\332A\035parent,game_serve"
          + "r_deployment\202\323\344\223\002S\"9/v1/{parent=projects"
          + "/*/locations/*}/gameServerDeployments:\026g"
          + "ame_server_deployment\022\355\001\n\032DeleteGameServ"
          + "erDeployment\0229.google.cloud.gaming.v1.De"
          + "leteGameServerDeploymentRequest\032\035.google"
          + ".longrunning.Operation\"u\312A*\n\025google.prot"
          + "obuf.Empty\022\021OperationMetadata\332A\004name\202\323\344\223"
          + "\002;*9/v1/{name=projects/*/locations/*/gam"
          + "eServerDeployments/*}\022\272\002\n\032UpdateGameServ"
          + "erDeployment\0229.google.cloud.gaming.v1.Up"
          + "dateGameServerDeploymentRequest\032\035.google"
          + ".longrunning.Operation\"\301\001\312A)\n\024GameServer"
          + "Deployment\022\021OperationMetadata\332A\"game_ser"
          + "ver_deployment,update_mask\202\323\344\223\002j2P/v1/{g"
          + "ame_server_deployment.name=projects/*/lo"
          + "cations/*/gameServerDeployments/*}:\026game"
          + "_server_deployment\022\346\001\n\036GetGameServerDepl"
          + "oymentRollout\022=.google.cloud.gaming.v1.G"
          + "etGameServerDeploymentRolloutRequest\0323.g"
          + "oogle.cloud.gaming.v1.GameServerDeployme"
          + "ntRollout\"P\332A\004name\202\323\344\223\002C\022A/v1/{name=proj"
          + "ects/*/locations/*/gameServerDeployments"
          + "/*}/rollout\022\243\002\n!UpdateGameServerDeployme"
          + "ntRollout\022@.google.cloud.gaming.v1.Updat"
          + "eGameServerDeploymentRolloutRequest\032\035.go"
          + "ogle.longrunning.Operation\"\234\001\312A)\n\024GameSe"
          + "rverDeployment\022\021OperationMetadata\332A\023roll"
          + "out,update_mask\202\323\344\223\002T2I/v1/{rollout.name"
          + "=projects/*/locations/*/gameServerDeploy"
          + "ments/*}/rollout:\007rollout\022\217\002\n\"PreviewGam"
          + "eServerDeploymentRollout\022A.google.cloud."
          + "gaming.v1.PreviewGameServerDeploymentRol"
          + "loutRequest\032B.google.cloud.gaming.v1.Pre"
          + "viewGameServerDeploymentRolloutResponse\""
          + "b\202\323\344\223\002\\2Q/v1/{rollout.name=projects/*/lo"
          + "cations/*/gameServerDeployments/*}/rollo"
          + "ut:preview:\007rollout\022\334\001\n\024FetchDeploymentS"
          + "tate\0223.google.cloud.gaming.v1.FetchDeplo"
          + "ymentStateRequest\0324.google.cloud.gaming."
          + "v1.FetchDeploymentStateResponse\"Y\202\323\344\223\002S\""
          + "N/v1/{name=projects/*/locations/*/gameSe"
          + "rverDeployments/*}:fetchDeploymentState:"
          + "\001*\032O\312A\033gameservices.googleapis.com\322A.htt"
          + "ps://www.googleapis.com/auth/cloud-platf"
          + "ormBR\n\032com.google.cloud.gaming.v1P\001Z2clo"
          + "ud.google.com/go/gaming/apiv1/gamingpb;g"
          + "amingpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.cloud.gaming.v1.GameServerDeployments.getDescriptor(),
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
    com.google.cloud.gaming.v1.GameServerDeployments.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
