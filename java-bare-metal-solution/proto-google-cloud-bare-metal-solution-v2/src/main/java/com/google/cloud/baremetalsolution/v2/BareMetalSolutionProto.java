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
// source: google/cloud/baremetalsolution/v2/baremetalsolution.proto

package com.google.cloud.baremetalsolution.v2;

public final class BareMetalSolutionProto {
  private BareMetalSolutionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/baremetalsolution/v2/bare"
          + "metalsolution.proto\022!google.cloud.bareme"
          + "talsolution.v2\032\034google/api/annotations.p"
          + "roto\032\027google/api/client.proto\032\037google/ap"
          + "i/field_behavior.proto\0320google/cloud/bar"
          + "emetalsolution/v2/instance.proto\032+google"
          + "/cloud/baremetalsolution/v2/lun.proto\032/g"
          + "oogle/cloud/baremetalsolution/v2/network"
          + ".proto\0321google/cloud/baremetalsolution/v"
          + "2/nfs_share.proto\032.google/cloud/baremeta"
          + "lsolution/v2/volume.proto\032#google/longru"
          + "nning/operations.proto\032\037google/protobuf/"
          + "timestamp.proto\"\207\002\n\021OperationMetadata\0225\n"
          + "\013create_time\030\001 \001(\0132\032.google.protobuf.Tim"
          + "estampB\004\342A\001\003\0222\n\010end_time\030\002 \001(\0132\032.google."
          + "protobuf.TimestampB\004\342A\001\003\022\024\n\006target\030\003 \001(\t"
          + "B\004\342A\001\003\022\022\n\004verb\030\004 \001(\tB\004\342A\001\003\022\034\n\016status_mes"
          + "sage\030\005 \001(\tB\004\342A\001\003\022$\n\026requested_cancellati"
          + "on\030\006 \001(\010B\004\342A\001\003\022\031\n\013api_version\030\007 \001(\tB\004\342A\001"
          + "\003\"\027\n\025ResetInstanceResponse2\335 \n\021BareMetal"
          + "Solution\022\302\001\n\rListInstances\0227.google.clou"
          + "d.baremetalsolution.v2.ListInstancesRequ"
          + "est\0328.google.cloud.baremetalsolution.v2."
          + "ListInstancesResponse\">\332A\006parent\202\323\344\223\002/\022-"
          + "/v2/{parent=projects/*/locations/*}/inst"
          + "ances\022\257\001\n\013GetInstance\0225.google.cloud.bar"
          + "emetalsolution.v2.GetInstanceRequest\032+.g"
          + "oogle.cloud.baremetalsolution.v2.Instanc"
          + "e\"<\332A\004name\202\323\344\223\002/\022-/v2/{name=projects/*/l"
          + "ocations/*/instances/*}\022\352\001\n\016UpdateInstan"
          + "ce\0228.google.cloud.baremetalsolution.v2.U"
          + "pdateInstanceRequest\032\035.google.longrunnin"
          + "g.Operation\"\177\312A\035\n\010Instance\022\021OperationMet"
          + "adata\332A\024instance,update_mask\202\323\344\223\002B26/v2/"
          + "{instance.name=projects/*/locations/*/in"
          + "stances/*}:\010instance\022\333\001\n\rResetInstance\0227"
          + ".google.cloud.baremetalsolution.v2.Reset"
          + "InstanceRequest\032\035.google.longrunning.Ope"
          + "ration\"r\312A*\n\025ResetInstanceResponse\022\021Oper"
          + "ationMetadata\332A\004name\202\323\344\223\0028\"3/v2/{name=pr"
          + "ojects/*/locations/*/instances/*}:reset:"
          + "\001*\022\333\001\n\rStartInstance\0227.google.cloud.bare"
          + "metalsolution.v2.StartInstanceRequest\032\035."
          + "google.longrunning.Operation\"r\312A*\n\025Start"
          + "InstanceResponse\022\021OperationMetadata\332A\004na"
          + "me\202\323\344\223\0028\"3/v2/{name=projects/*/locations"
          + "/*/instances/*}:start:\001*\022\327\001\n\014StopInstanc"
          + "e\0226.google.cloud.baremetalsolution.v2.St"
          + "opInstanceRequest\032\035.google.longrunning.O"
          + "peration\"p\312A)\n\024StopInstanceResponse\022\021Ope"
          + "rationMetadata\332A\004name\202\323\344\223\0027\"2/v2/{name=p"
          + "rojects/*/locations/*/instances/*}:stop:"
          + "\001*\022\326\001\n\tDetachLun\0223.google.cloud.baremeta"
          + "lsolution.v2.DetachLunRequest\032\035.google.l"
          + "ongrunning.Operation\"u\312A\035\n\010Instance\022\021Ope"
          + "rationMetadata\332A\014instance,lun\202\323\344\223\002@\";/v2"
          + "/{instance=projects/*/locations/*/instan"
          + "ces/*}:detachLun:\001*\022\272\001\n\013ListVolumes\0225.go"
          + "ogle.cloud.baremetalsolution.v2.ListVolu"
          + "mesRequest\0326.google.cloud.baremetalsolut"
          + "ion.v2.ListVolumesResponse\"<\332A\006parent\202\323\344"
          + "\223\002-\022+/v2/{parent=projects/*/locations/*}"
          + "/volumes\022\247\001\n\tGetVolume\0223.google.cloud.ba"
          + "remetalsolution.v2.GetVolumeRequest\032).go"
          + "ogle.cloud.baremetalsolution.v2.Volume\":"
          + "\332A\004name\202\323\344\223\002-\022+/v2/{name=projects/*/loca"
          + "tions/*/volumes/*}\022\334\001\n\014UpdateVolume\0226.go"
          + "ogle.cloud.baremetalsolution.v2.UpdateVo"
          + "lumeRequest\032\035.google.longrunning.Operati"
          + "on\"u\312A\033\n\006Volume\022\021OperationMetadata\332A\022vol"
          + "ume,update_mask\202\323\344\223\002<22/v2/{volume.name="
          + "projects/*/locations/*/volumes/*}:\006volum"
          + "e\022\326\001\n\014ResizeVolume\0226.google.cloud.bareme"
          + "talsolution.v2.ResizeVolumeRequest\032\035.goo"
          + "gle.longrunning.Operation\"o\312A\033\n\006Volume\022\021"
          + "OperationMetadata\332A\017volume,size_gib\202\323\344\223\002"
          + "9\"4/v2/{volume=projects/*/locations/*/vo"
          + "lumes/*}:resize:\001*\022\276\001\n\014ListNetworks\0226.go"
          + "ogle.cloud.baremetalsolution.v2.ListNetw"
          + "orksRequest\0327.google.cloud.baremetalsolu"
          + "tion.v2.ListNetworksResponse\"=\332A\006parent\202"
          + "\323\344\223\002.\022,/v2/{parent=projects/*/locations/"
          + "*}/networks\022\337\001\n\020ListNetworkUsage\022:.googl"
          + "e.cloud.baremetalsolution.v2.ListNetwork"
          + "UsageRequest\032;.google.cloud.baremetalsol"
          + "ution.v2.ListNetworkUsageResponse\"R\332A\010lo"
          + "cation\202\323\344\223\002A\022?/v2/{location=projects/*/l"
          + "ocations/*}/networks:listNetworkUsage\022\253\001"
          + "\n\nGetNetwork\0224.google.cloud.baremetalsol"
          + "ution.v2.GetNetworkRequest\032*.google.clou"
          + "d.baremetalsolution.v2.Network\";\332A\004name\202"
          + "\323\344\223\002.\022,/v2/{name=projects/*/locations/*/"
          + "networks/*}\022\343\001\n\rUpdateNetwork\0227.google.c"
          + "loud.baremetalsolution.v2.UpdateNetworkR"
          + "equest\032\035.google.longrunning.Operation\"z\312"
          + "A\034\n\007Network\022\021OperationMetadata\332A\023network"
          + ",update_mask\202\323\344\223\002?24/v2/{network.name=pr"
          + "ojects/*/locations/*/networks/*}:\007networ"
          + "k\022\245\001\n\006GetLun\0220.google.cloud.baremetalsol"
          + "ution.v2.GetLunRequest\032&.google.cloud.ba"
          + "remetalsolution.v2.Lun\"A\332A\004name\202\323\344\223\0024\0222/"
          + "v2/{name=projects/*/locations/*/volumes/"
          + "*/luns/*}\022\270\001\n\010ListLuns\0222.google.cloud.ba"
          + "remetalsolution.v2.ListLunsRequest\0323.goo"
          + "gle.cloud.baremetalsolution.v2.ListLunsR"
          + "esponse\"C\332A\006parent\202\323\344\223\0024\0222/v2/{parent=pr"
          + "ojects/*/locations/*/volumes/*}/luns\022\257\001\n"
          + "\013GetNfsShare\0225.google.cloud.baremetalsol"
          + "ution.v2.GetNfsShareRequest\032+.google.clo"
          + "ud.baremetalsolution.v2.NfsShare\"<\332A\004nam"
          + "e\202\323\344\223\002/\022-/v2/{name=projects/*/locations/"
          + "*/nfsShares/*}\022\302\001\n\rListNfsShares\0227.googl"
          + "e.cloud.baremetalsolution.v2.ListNfsShar"
          + "esRequest\0328.google.cloud.baremetalsoluti"
          + "on.v2.ListNfsSharesResponse\">\332A\006parent\202\323"
          + "\344\223\002/\022-/v2/{parent=projects/*/locations/*"
          + "}/nfsShares\022\356\001\n\016UpdateNfsShare\0228.google."
          + "cloud.baremetalsolution.v2.UpdateNfsShar"
          + "eRequest\032\035.google.longrunning.Operation\""
          + "\202\001\312A\035\n\010NfsShare\022\021OperationMetadata\332A\025nfs"
          + "_share,update_mask\202\323\344\223\002D27/v2/{nfs_share"
          + ".name=projects/*/locations/*/nfsShares/*"
          + "}:\tnfs_share\032T\312A baremetalsolution.googl"
          + "eapis.com\322A.https://www.googleapis.com/a"
          + "uth/cloud-platformB\205\002\n%com.google.cloud."
          + "baremetalsolution.v2B\026BareMetalSolutionP"
          + "rotoP\001ZScloud.google.com/go/baremetalsol"
          + "ution/apiv2/baremetalsolutionpb;baremeta"
          + "lsolutionpb\252\002!Google.Cloud.BareMetalSolu"
          + "tion.V2\312\002!Google\\Cloud\\BareMetalSolution"
          + "\\V2\352\002$Google::Cloud::BareMetalSolution::"
          + "V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.InstanceProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.LunProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.NetworkProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.NfsShareProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.VolumeProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ResetInstanceResponse_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.InstanceProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.LunProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.NetworkProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.NfsShareProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.VolumeProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
