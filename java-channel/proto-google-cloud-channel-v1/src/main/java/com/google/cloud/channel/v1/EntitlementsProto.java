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
// source: google/cloud/channel/v1/entitlements.proto

package com.google.cloud.channel.v1;

public final class EntitlementsProto {
  private EntitlementsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_Entitlement_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_Entitlement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_Parameter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_AssociationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_AssociationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_ProvisionedService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_ProvisionedService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_CommitmentSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_CommitmentSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_RenewalSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_RenewalSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_TrialSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_TrialSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_TransferableSku_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_TransferableSku_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_channel_v1_TransferEligibility_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_channel_v1_TransferEligibility_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/channel/v1/entitlements.p"
          + "roto\022\027google.cloud.channel.v1\032\037google/ap"
          + "i/field_behavior.proto\032\031google/api/resou"
          + "rce.proto\032$google/cloud/channel/v1/commo"
          + "n.proto\032$google/cloud/channel/v1/offers."
          + "proto\032&google/cloud/channel/v1/products."
          + "proto\032\037google/protobuf/timestamp.proto\"\205"
          + "\t\n\013Entitlement\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\0225\n\013cr"
          + "eate_time\030\005 \001(\0132\032.google.protobuf.Timest"
          + "ampB\004\342A\001\003\0225\n\013update_time\030\006 \001(\0132\032.google."
          + "protobuf.TimestampB\004\342A\001\003\0229\n\005offer\030\010 \001(\tB"
          + "*\342A\001\002\372A#\n!cloudchannel.googleapis.com/Of"
          + "fer\022H\n\023commitment_settings\030\014 \001(\0132+.googl"
          + "e.cloud.channel.v1.CommitmentSettings\022X\n"
          + "\022provisioning_state\030\r \001(\01626.google.cloud"
          + ".channel.v1.Entitlement.ProvisioningStat"
          + "eB\004\342A\001\003\022N\n\023provisioned_service\030\020 \001(\0132+.g"
          + "oogle.cloud.channel.v1.ProvisionedServic"
          + "eB\004\342A\001\003\022W\n\022suspension_reasons\030\022 \003(\01625.go"
          + "ogle.cloud.channel.v1.Entitlement.Suspen"
          + "sionReasonB\004\342A\001\003\022\037\n\021purchase_order_id\030\023 "
          + "\001(\tB\004\342A\001\001\022D\n\016trial_settings\030\025 \001(\0132&.goog"
          + "le.cloud.channel.v1.TrialSettingsB\004\342A\001\003\022"
          + "B\n\020association_info\030\027 \001(\0132(.google.cloud"
          + ".channel.v1.AssociationInfo\0226\n\nparameter"
          + "s\030\032 \003(\0132\".google.cloud.channel.v1.Parame"
          + "ter\022\035\n\017billing_account\030\034 \001(\tB\004\342A\001\001\"R\n\021Pr"
          + "ovisioningState\022\"\n\036PROVISIONING_STATE_UN"
          + "SPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\r\n\tSUSPENDED\020\005\"\243"
          + "\001\n\020SuspensionReason\022!\n\035SUSPENSION_REASON"
          + "_UNSPECIFIED\020\000\022\026\n\022RESELLER_INITIATED\020\001\022\017"
          + "\n\013TRIAL_ENDED\020\002\022\034\n\030RENEWAL_WITH_TYPE_CAN"
          + "CEL\020\003\022\032\n\026PENDING_TOS_ACCEPTANCE\020\004\022\t\n\005OTH"
          + "ER\020d:p\352Am\n\'cloudchannel.googleapis.com/E"
          + "ntitlement\022Baccounts/{account}/customers"
          + "/{customer}/entitlements/{entitlement}\"`"
          + "\n\tParameter\022\014\n\004name\030\001 \001(\t\022-\n\005value\030\002 \001(\013"
          + "2\036.google.cloud.channel.v1.Value\022\026\n\010edit"
          + "able\030\003 \001(\010B\004\342A\001\003\"Y\n\017AssociationInfo\022F\n\020b"
          + "ase_entitlement\030\001 \001(\tB,\372A)\n\'cloudchannel"
          + ".googleapis.com/Entitlement\"c\n\022Provision"
          + "edService\022\035\n\017provisioning_id\030\001 \001(\tB\004\342A\001\003"
          + "\022\030\n\nproduct_id\030\002 \001(\tB\004\342A\001\003\022\024\n\006sku_id\030\003 \001"
          + "(\tB\004\342A\001\003\"\310\001\n\022CommitmentSettings\0224\n\nstart"
          + "_time\030\001 \001(\0132\032.google.protobuf.TimestampB"
          + "\004\342A\001\003\0222\n\010end_time\030\002 \001(\0132\032.google.protobu"
          + "f.TimestampB\004\342A\001\003\022H\n\020renewal_settings\030\004 "
          + "\001(\0132(.google.cloud.channel.v1.RenewalSet"
          + "tingsB\004\342A\001\001\"\270\001\n\017RenewalSettings\022\026\n\016enabl"
          + "e_renewal\030\001 \001(\010\022\031\n\021resize_unit_count\030\002 \001"
          + "(\010\022:\n\014payment_plan\030\005 \001(\0162$.google.cloud."
          + "channel.v1.PaymentPlan\0226\n\rpayment_cycle\030"
          + "\006 \001(\0132\037.google.cloud.channel.v1.Period\"L"
          + "\n\rTrialSettings\022\r\n\005trial\030\001 \001(\010\022,\n\010end_ti"
          + "me\030\002 \001(\0132\032.google.protobuf.Timestamp\"\300\001\n"
          + "\017TransferableSku\022J\n\024transfer_eligibility"
          + "\030\t \001(\0132,.google.cloud.channel.v1.Transfe"
          + "rEligibility\022)\n\003sku\030\013 \001(\0132\034.google.cloud"
          + ".channel.v1.Sku\0226\n\nlegacy_sku\030\014 \001(\0132\034.go"
          + "ogle.cloud.channel.v1.SkuB\004\342A\001\001\"\371\001\n\023Tran"
          + "sferEligibility\022\023\n\013is_eligible\030\001 \001(\010\022\023\n\013"
          + "description\030\002 \001(\t\022Q\n\024ineligibility_reaso"
          + "n\030\003 \001(\01623.google.cloud.channel.v1.Transf"
          + "erEligibility.Reason\"e\n\006Reason\022\026\n\022REASON"
          + "_UNSPECIFIED\020\000\022\032\n\026PENDING_TOS_ACCEPTANCE"
          + "\020\001\022\024\n\020SKU_NOT_ELIGIBLE\020\002\022\021\n\rSKU_SUSPENDE"
          + "D\020\003Bi\n\033com.google.cloud.channel.v1B\021Enti"
          + "tlementsProtoP\001Z5cloud.google.com/go/cha"
          + "nnel/apiv1/channelpb;channelpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.channel.v1.CommonProto.getDescriptor(),
              com.google.cloud.channel.v1.OffersProto.getDescriptor(),
              com.google.cloud.channel.v1.ProductsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_channel_v1_Entitlement_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_channel_v1_Entitlement_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_Entitlement_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Offer",
              "CommitmentSettings",
              "ProvisioningState",
              "ProvisionedService",
              "SuspensionReasons",
              "PurchaseOrderId",
              "TrialSettings",
              "AssociationInfo",
              "Parameters",
              "BillingAccount",
            });
    internal_static_google_cloud_channel_v1_Parameter_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_channel_v1_Parameter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_Parameter_descriptor,
            new java.lang.String[] {
              "Name", "Value", "Editable",
            });
    internal_static_google_cloud_channel_v1_AssociationInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_channel_v1_AssociationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_AssociationInfo_descriptor,
            new java.lang.String[] {
              "BaseEntitlement",
            });
    internal_static_google_cloud_channel_v1_ProvisionedService_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_channel_v1_ProvisionedService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_ProvisionedService_descriptor,
            new java.lang.String[] {
              "ProvisioningId", "ProductId", "SkuId",
            });
    internal_static_google_cloud_channel_v1_CommitmentSettings_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_channel_v1_CommitmentSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_CommitmentSettings_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime", "RenewalSettings",
            });
    internal_static_google_cloud_channel_v1_RenewalSettings_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_channel_v1_RenewalSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_RenewalSettings_descriptor,
            new java.lang.String[] {
              "EnableRenewal", "ResizeUnitCount", "PaymentPlan", "PaymentCycle",
            });
    internal_static_google_cloud_channel_v1_TrialSettings_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_channel_v1_TrialSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_TrialSettings_descriptor,
            new java.lang.String[] {
              "Trial", "EndTime",
            });
    internal_static_google_cloud_channel_v1_TransferableSku_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_channel_v1_TransferableSku_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_TransferableSku_descriptor,
            new java.lang.String[] {
              "TransferEligibility", "Sku", "LegacySku",
            });
    internal_static_google_cloud_channel_v1_TransferEligibility_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_channel_v1_TransferEligibility_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_channel_v1_TransferEligibility_descriptor,
            new java.lang.String[] {
              "IsEligible", "Description", "IneligibilityReason",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.channel.v1.CommonProto.getDescriptor();
    com.google.cloud.channel.v1.OffersProto.getDescriptor();
    com.google.cloud.channel.v1.ProductsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
