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
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

public final class KmsResourcesProto {
  private KmsResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_KeyRing_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyRing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_CryptoKeyVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_PublicKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_PublicKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_ImportJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ImportJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/kms/v1/resources.proto\022\023g"
          + "oogle.cloud.kms.v1\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\032\036"
          + "google/protobuf/duration.proto\032\037google/p"
          + "rotobuf/timestamp.proto\032\036google/protobuf"
          + "/wrappers.proto\"\267\001\n\007KeyRing\022\022\n\004name\030\001 \001("
          + "\tB\004\342A\001\003\0225\n\013create_time\030\002 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\004\342A\001\003:a\352A^\n\037cloudkms.go"
          + "ogleapis.com/KeyRing\022;projects/{project}"
          + "/locations/{location}/keyRings/{key_ring"
          + "}\"\234\007\n\tCryptoKey\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022<\n\007p"
          + "rimary\030\002 \001(\0132%.google.cloud.kms.v1.Crypt"
          + "oKeyVersionB\004\342A\001\003\022F\n\007purpose\030\003 \001(\0162/.goo"
          + "gle.cloud.kms.v1.CryptoKey.CryptoKeyPurp"
          + "oseB\004\342A\001\005\0225\n\013create_time\030\005 \001(\0132\032.google."
          + "protobuf.TimestampB\004\342A\001\003\0226\n\022next_rotatio"
          + "n_time\030\007 \001(\0132\032.google.protobuf.Timestamp"
          + "\0224\n\017rotation_period\030\010 \001(\0132\031.google.proto"
          + "buf.DurationH\000\022G\n\020version_template\030\013 \001(\013"
          + "2-.google.cloud.kms.v1.CryptoKeyVersionT"
          + "emplate\022:\n\006labels\030\n \003(\0132*.google.cloud.k"
          + "ms.v1.CryptoKey.LabelsEntry\022\031\n\013import_on"
          + "ly\030\r \001(\010B\004\342A\001\005\022C\n\032destroy_scheduled_dura"
          + "tion\030\016 \001(\0132\031.google.protobuf.DurationB\004\342"
          + "A\001\005\022&\n\022crypto_key_backend\030\017 \001(\tB\n\342A\001\005\372A\003"
          + "\n\001*\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value"
          + "\030\002 \001(\t:\0028\001\"\201\001\n\020CryptoKeyPurpose\022\"\n\036CRYPT"
          + "O_KEY_PURPOSE_UNSPECIFIED\020\000\022\023\n\017ENCRYPT_D"
          + "ECRYPT\020\001\022\023\n\017ASYMMETRIC_SIGN\020\005\022\026\n\022ASYMMET"
          + "RIC_DECRYPT\020\006\022\007\n\003MAC\020\t:{\352Ax\n!cloudkms.go"
          + "ogleapis.com/CryptoKey\022Sprojects/{projec"
          + "t}/locations/{location}/keyRings/{key_ri"
          + "ng}/cryptoKeys/{crypto_key}B\023\n\021rotation_"
          + "schedule\"\264\001\n\030CryptoKeyVersionTemplate\022>\n"
          + "\020protection_level\030\001 \001(\0162$.google.cloud.k"
          + "ms.v1.ProtectionLevel\022X\n\talgorithm\030\003 \001(\016"
          + "2?.google.cloud.kms.v1.CryptoKeyVersion."
          + "CryptoKeyVersionAlgorithmB\004\342A\001\002\"\264\003\n\027KeyO"
          + "perationAttestation\022T\n\006format\030\004 \001(\0162>.go"
          + "ogle.cloud.kms.v1.KeyOperationAttestatio"
          + "n.AttestationFormatB\004\342A\001\003\022\025\n\007content\030\005 \001"
          + "(\014B\004\342A\001\003\022Y\n\013cert_chains\030\006 \001(\0132>.google.c"
          + "loud.kms.v1.KeyOperationAttestation.Cert"
          + "ificateChainsB\004\342A\001\003\032d\n\021CertificateChains"
          + "\022\024\n\014cavium_certs\030\001 \003(\t\022\031\n\021google_card_ce"
          + "rts\030\002 \003(\t\022\036\n\026google_partition_certs\030\003 \003("
          + "\t\"k\n\021AttestationFormat\022\"\n\036ATTESTATION_FO"
          + "RMAT_UNSPECIFIED\020\000\022\030\n\024CAVIUM_V1_COMPRESS"
          + "ED\020\003\022\030\n\024CAVIUM_V2_COMPRESSED\020\004\"\224\022\n\020Crypt"
          + "oKeyVersion\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022J\n\005state"
          + "\030\003 \001(\0162;.google.cloud.kms.v1.CryptoKeyVe"
          + "rsion.CryptoKeyVersionState\022D\n\020protectio"
          + "n_level\030\007 \001(\0162$.google.cloud.kms.v1.Prot"
          + "ectionLevelB\004\342A\001\003\022X\n\talgorithm\030\n \001(\0162?.g"
          + "oogle.cloud.kms.v1.CryptoKeyVersion.Cryp"
          + "toKeyVersionAlgorithmB\004\342A\001\003\022G\n\013attestati"
          + "on\030\010 \001(\0132,.google.cloud.kms.v1.KeyOperat"
          + "ionAttestationB\004\342A\001\003\0225\n\013create_time\030\004 \001("
          + "\0132\032.google.protobuf.TimestampB\004\342A\001\003\0227\n\rg"
          + "enerate_time\030\013 \001(\0132\032.google.protobuf.Tim"
          + "estampB\004\342A\001\003\0226\n\014destroy_time\030\005 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\004\342A\001\003\022<\n\022destroy_"
          + "event_time\030\006 \001(\0132\032.google.protobuf.Times"
          + "tampB\004\342A\001\003\022\030\n\nimport_job\030\016 \001(\tB\004\342A\001\003\0225\n\013"
          + "import_time\030\017 \001(\0132\032.google.protobuf.Time"
          + "stampB\004\342A\001\003\022#\n\025import_failure_reason\030\020 \001"
          + "(\tB\004\342A\001\003\022\'\n\031generation_failure_reason\030\023 "
          + "\001(\tB\004\342A\001\003\0221\n#external_destruction_failur"
          + "e_reason\030\024 \001(\tB\004\342A\001\003\022^\n!external_protect"
          + "ion_level_options\030\021 \001(\01323.google.cloud.k"
          + "ms.v1.ExternalProtectionLevelOptions\022\037\n\021"
          + "reimport_eligible\030\022 \001(\010B\004\342A\001\003\"\347\006\n\031Crypto"
          + "KeyVersionAlgorithm\022,\n(CRYPTO_KEY_VERSIO"
          + "N_ALGORITHM_UNSPECIFIED\020\000\022\037\n\033GOOGLE_SYMM"
          + "ETRIC_ENCRYPTION\020\001\022\034\n\030RSA_SIGN_PSS_2048_"
          + "SHA256\020\002\022\034\n\030RSA_SIGN_PSS_3072_SHA256\020\003\022\034"
          + "\n\030RSA_SIGN_PSS_4096_SHA256\020\004\022\034\n\030RSA_SIGN"
          + "_PSS_4096_SHA512\020\017\022\036\n\032RSA_SIGN_PKCS1_204"
          + "8_SHA256\020\005\022\036\n\032RSA_SIGN_PKCS1_3072_SHA256"
          + "\020\006\022\036\n\032RSA_SIGN_PKCS1_4096_SHA256\020\007\022\036\n\032RS"
          + "A_SIGN_PKCS1_4096_SHA512\020\020\022\033\n\027RSA_SIGN_R"
          + "AW_PKCS1_2048\020\034\022\033\n\027RSA_SIGN_RAW_PKCS1_30"
          + "72\020\035\022\033\n\027RSA_SIGN_RAW_PKCS1_4096\020\036\022 \n\034RSA"
          + "_DECRYPT_OAEP_2048_SHA256\020\010\022 \n\034RSA_DECRY"
          + "PT_OAEP_3072_SHA256\020\t\022 \n\034RSA_DECRYPT_OAE"
          + "P_4096_SHA256\020\n\022 \n\034RSA_DECRYPT_OAEP_4096"
          + "_SHA512\020\021\022\036\n\032RSA_DECRYPT_OAEP_2048_SHA1\020"
          + "%\022\036\n\032RSA_DECRYPT_OAEP_3072_SHA1\020&\022\036\n\032RSA"
          + "_DECRYPT_OAEP_4096_SHA1\020\'\022\027\n\023EC_SIGN_P25"
          + "6_SHA256\020\014\022\027\n\023EC_SIGN_P384_SHA384\020\r\022\034\n\030E"
          + "C_SIGN_SECP256K1_SHA256\020\037\022\017\n\013HMAC_SHA256"
          + "\020 \022\r\n\tHMAC_SHA1\020!\022\017\n\013HMAC_SHA384\020\"\022\017\n\013HM"
          + "AC_SHA512\020#\022\017\n\013HMAC_SHA224\020$\022!\n\035EXTERNAL"
          + "_SYMMETRIC_ENCRYPTION\020\022\"\233\002\n\025CryptoKeyVer"
          + "sionState\022(\n$CRYPTO_KEY_VERSION_STATE_UN"
          + "SPECIFIED\020\000\022\026\n\022PENDING_GENERATION\020\005\022\013\n\007E"
          + "NABLED\020\001\022\014\n\010DISABLED\020\002\022\r\n\tDESTROYED\020\003\022\025\n"
          + "\021DESTROY_SCHEDULED\020\004\022\022\n\016PENDING_IMPORT\020\006"
          + "\022\021\n\rIMPORT_FAILED\020\007\022\025\n\021GENERATION_FAILED"
          + "\020\010\022 \n\034PENDING_EXTERNAL_DESTRUCTION\020\t\022\037\n\033"
          + "EXTERNAL_DESTRUCTION_FAILED\020\n\"I\n\024CryptoK"
          + "eyVersionView\022\'\n#CRYPTO_KEY_VERSION_VIEW"
          + "_UNSPECIFIED\020\000\022\010\n\004FULL\020\001:\252\001\352A\246\001\n(cloudkm"
          + "s.googleapis.com/CryptoKeyVersion\022zproje"
          + "cts/{project}/locations/{location}/keyRi"
          + "ngs/{key_ring}/cryptoKeys/{crypto_key}/c"
          + "ryptoKeyVersions/{crypto_key_version}\"\234\003"
          + "\n\tPublicKey\022\013\n\003pem\030\001 \001(\t\022R\n\talgorithm\030\002 "
          + "\001(\0162?.google.cloud.kms.v1.CryptoKeyVersi"
          + "on.CryptoKeyVersionAlgorithm\022/\n\npem_crc3"
          + "2c\030\003 \001(\0132\033.google.protobuf.Int64Value\022\014\n"
          + "\004name\030\004 \001(\t\022>\n\020protection_level\030\005 \001(\0162$."
          + "google.cloud.kms.v1.ProtectionLevel:\256\001\352A"
          + "\252\001\n!cloudkms.googleapis.com/PublicKey\022\204\001"
          + "projects/{project}/locations/{location}/"
          + "keyRings/{key_ring}/cryptoKeys/{crypto_k"
          + "ey}/cryptoKeyVersions/{crypto_key_versio"
          + "n}/publicKey\"\332\010\n\tImportJob\022\022\n\004name\030\001 \001(\t"
          + "B\004\342A\001\003\022I\n\rimport_method\030\002 \001(\0162+.google.c"
          + "loud.kms.v1.ImportJob.ImportMethodB\005\342A\002\002"
          + "\005\022E\n\020protection_level\030\t \001(\0162$.google.clo"
          + "ud.kms.v1.ProtectionLevelB\005\342A\002\002\005\0225\n\013crea"
          + "te_time\030\003 \001(\0132\032.google.protobuf.Timestam"
          + "pB\004\342A\001\003\0227\n\rgenerate_time\030\004 \001(\0132\032.google."
          + "protobuf.TimestampB\004\342A\001\003\0225\n\013expire_time\030"
          + "\005 \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\022"
          + ";\n\021expire_event_time\030\n \001(\0132\032.google.prot"
          + "obuf.TimestampB\004\342A\001\003\022B\n\005state\030\006 \001(\0162-.go"
          + "ogle.cloud.kms.v1.ImportJob.ImportJobSta"
          + "teB\004\342A\001\003\022J\n\npublic_key\030\007 \001(\01320.google.cl"
          + "oud.kms.v1.ImportJob.WrappingPublicKeyB\004"
          + "\342A\001\003\022G\n\013attestation\030\010 \001(\0132,.google.cloud"
          + ".kms.v1.KeyOperationAttestationB\004\342A\001\003\032 \n"
          + "\021WrappingPublicKey\022\013\n\003pem\030\001 \001(\t\"\345\001\n\014Impo"
          + "rtMethod\022\035\n\031IMPORT_METHOD_UNSPECIFIED\020\000\022"
          + "\036\n\032RSA_OAEP_3072_SHA1_AES_256\020\001\022\036\n\032RSA_O"
          + "AEP_4096_SHA1_AES_256\020\002\022 \n\034RSA_OAEP_3072"
          + "_SHA256_AES_256\020\003\022 \n\034RSA_OAEP_4096_SHA25"
          + "6_AES_256\020\004\022\030\n\024RSA_OAEP_3072_SHA256\020\005\022\030\n"
          + "\024RSA_OAEP_4096_SHA256\020\006\"c\n\016ImportJobStat"
          + "e\022 \n\034IMPORT_JOB_STATE_UNSPECIFIED\020\000\022\026\n\022P"
          + "ENDING_GENERATION\020\001\022\n\n\006ACTIVE\020\002\022\013\n\007EXPIR"
          + "ED\020\003:{\352Ax\n!cloudkms.googleapis.com/Impor"
          + "tJob\022Sprojects/{project}/locations/{loca"
          + "tion}/keyRings/{key_ring}/importJobs/{im"
          + "port_job}\"[\n\036ExternalProtectionLevelOpti"
          + "ons\022\030\n\020external_key_uri\030\001 \001(\t\022\037\n\027ekm_con"
          + "nection_key_path\030\002 \001(\t*j\n\017ProtectionLeve"
          + "l\022 \n\034PROTECTION_LEVEL_UNSPECIFIED\020\000\022\014\n\010S"
          + "OFTWARE\020\001\022\007\n\003HSM\020\002\022\014\n\010EXTERNAL\020\003\022\020\n\014EXTE"
          + "RNAL_VPC\020\004B\210\001\n\027com.google.cloud.kms.v1B\021"
          + "KmsResourcesProtoP\001Z)cloud.google.com/go"
          + "/kms/apiv1/kmspb;kmspb\370\001\001\252\002\023Google.Cloud"
          + ".Kms.V1\312\002\023Google\\Cloud\\Kms\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_cloud_kms_v1_KeyRing_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_kms_v1_KeyRing_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_KeyRing_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime",
            });
    internal_static_google_cloud_kms_v1_CryptoKey_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_kms_v1_CryptoKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKey_descriptor,
            new java.lang.String[] {
              "Name",
              "Primary",
              "Purpose",
              "CreateTime",
              "NextRotationTime",
              "RotationPeriod",
              "VersionTemplate",
              "Labels",
              "ImportOnly",
              "DestroyScheduledDuration",
              "CryptoKeyBackend",
              "RotationSchedule",
            });
    internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor =
        internal_static_google_cloud_kms_v1_CryptoKey_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKey_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKeyVersionTemplate_descriptor,
            new java.lang.String[] {
              "ProtectionLevel", "Algorithm",
            });
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor,
            new java.lang.String[] {
              "Format", "Content", "CertChains",
            });
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_descriptor =
        internal_static_google_cloud_kms_v1_KeyOperationAttestation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_KeyOperationAttestation_CertificateChains_descriptor,
            new java.lang.String[] {
              "CaviumCerts", "GoogleCardCerts", "GooglePartitionCerts",
            });
    internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_kms_v1_CryptoKeyVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_CryptoKeyVersion_descriptor,
            new java.lang.String[] {
              "Name",
              "State",
              "ProtectionLevel",
              "Algorithm",
              "Attestation",
              "CreateTime",
              "GenerateTime",
              "DestroyTime",
              "DestroyEventTime",
              "ImportJob",
              "ImportTime",
              "ImportFailureReason",
              "GenerationFailureReason",
              "ExternalDestructionFailureReason",
              "ExternalProtectionLevelOptions",
              "ReimportEligible",
            });
    internal_static_google_cloud_kms_v1_PublicKey_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_kms_v1_PublicKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_PublicKey_descriptor,
            new java.lang.String[] {
              "Pem", "Algorithm", "PemCrc32C", "Name", "ProtectionLevel",
            });
    internal_static_google_cloud_kms_v1_ImportJob_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_kms_v1_ImportJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_ImportJob_descriptor,
            new java.lang.String[] {
              "Name",
              "ImportMethod",
              "ProtectionLevel",
              "CreateTime",
              "GenerateTime",
              "ExpireTime",
              "ExpireEventTime",
              "State",
              "PublicKey",
              "Attestation",
            });
    internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor =
        internal_static_google_cloud_kms_v1_ImportJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_ImportJob_WrappingPublicKey_descriptor,
            new java.lang.String[] {
              "Pem",
            });
    internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_v1_ExternalProtectionLevelOptions_descriptor,
            new java.lang.String[] {
              "ExternalKeyUri", "EkmConnectionKeyPath",
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
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
