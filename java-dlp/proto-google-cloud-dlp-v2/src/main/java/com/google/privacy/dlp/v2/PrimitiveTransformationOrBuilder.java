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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface PrimitiveTransformationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.PrimitiveTransformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Replace with a specified value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ReplaceValueConfig replace_config = 1;</code>
   *
   * @return Whether the replaceConfig field is set.
   */
  boolean hasReplaceConfig();
  /**
   *
   *
   * <pre>
   * Replace with a specified value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ReplaceValueConfig replace_config = 1;</code>
   *
   * @return The replaceConfig.
   */
  com.google.privacy.dlp.v2.ReplaceValueConfig getReplaceConfig();
  /**
   *
   *
   * <pre>
   * Replace with a specified value.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ReplaceValueConfig replace_config = 1;</code>
   */
  com.google.privacy.dlp.v2.ReplaceValueConfigOrBuilder getReplaceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Redact
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RedactConfig redact_config = 2;</code>
   *
   * @return Whether the redactConfig field is set.
   */
  boolean hasRedactConfig();
  /**
   *
   *
   * <pre>
   * Redact
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RedactConfig redact_config = 2;</code>
   *
   * @return The redactConfig.
   */
  com.google.privacy.dlp.v2.RedactConfig getRedactConfig();
  /**
   *
   *
   * <pre>
   * Redact
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RedactConfig redact_config = 2;</code>
   */
  com.google.privacy.dlp.v2.RedactConfigOrBuilder getRedactConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Mask
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CharacterMaskConfig character_mask_config = 3;</code>
   *
   * @return Whether the characterMaskConfig field is set.
   */
  boolean hasCharacterMaskConfig();
  /**
   *
   *
   * <pre>
   * Mask
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CharacterMaskConfig character_mask_config = 3;</code>
   *
   * @return The characterMaskConfig.
   */
  com.google.privacy.dlp.v2.CharacterMaskConfig getCharacterMaskConfig();
  /**
   *
   *
   * <pre>
   * Mask
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CharacterMaskConfig character_mask_config = 3;</code>
   */
  com.google.privacy.dlp.v2.CharacterMaskConfigOrBuilder getCharacterMaskConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Ffx-Fpe
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoReplaceFfxFpeConfig crypto_replace_ffx_fpe_config = 4;
   * </code>
   *
   * @return Whether the cryptoReplaceFfxFpeConfig field is set.
   */
  boolean hasCryptoReplaceFfxFpeConfig();
  /**
   *
   *
   * <pre>
   * Ffx-Fpe
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoReplaceFfxFpeConfig crypto_replace_ffx_fpe_config = 4;
   * </code>
   *
   * @return The cryptoReplaceFfxFpeConfig.
   */
  com.google.privacy.dlp.v2.CryptoReplaceFfxFpeConfig getCryptoReplaceFfxFpeConfig();
  /**
   *
   *
   * <pre>
   * Ffx-Fpe
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoReplaceFfxFpeConfig crypto_replace_ffx_fpe_config = 4;
   * </code>
   */
  com.google.privacy.dlp.v2.CryptoReplaceFfxFpeConfigOrBuilder
      getCryptoReplaceFfxFpeConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Fixed size bucketing
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FixedSizeBucketingConfig fixed_size_bucketing_config = 5;</code>
   *
   * @return Whether the fixedSizeBucketingConfig field is set.
   */
  boolean hasFixedSizeBucketingConfig();
  /**
   *
   *
   * <pre>
   * Fixed size bucketing
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FixedSizeBucketingConfig fixed_size_bucketing_config = 5;</code>
   *
   * @return The fixedSizeBucketingConfig.
   */
  com.google.privacy.dlp.v2.FixedSizeBucketingConfig getFixedSizeBucketingConfig();
  /**
   *
   *
   * <pre>
   * Fixed size bucketing
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FixedSizeBucketingConfig fixed_size_bucketing_config = 5;</code>
   */
  com.google.privacy.dlp.v2.FixedSizeBucketingConfigOrBuilder
      getFixedSizeBucketingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Bucketing
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BucketingConfig bucketing_config = 6;</code>
   *
   * @return Whether the bucketingConfig field is set.
   */
  boolean hasBucketingConfig();
  /**
   *
   *
   * <pre>
   * Bucketing
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BucketingConfig bucketing_config = 6;</code>
   *
   * @return The bucketingConfig.
   */
  com.google.privacy.dlp.v2.BucketingConfig getBucketingConfig();
  /**
   *
   *
   * <pre>
   * Bucketing
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BucketingConfig bucketing_config = 6;</code>
   */
  com.google.privacy.dlp.v2.BucketingConfigOrBuilder getBucketingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Replace with infotype
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ReplaceWithInfoTypeConfig replace_with_info_type_config = 7;
   * </code>
   *
   * @return Whether the replaceWithInfoTypeConfig field is set.
   */
  boolean hasReplaceWithInfoTypeConfig();
  /**
   *
   *
   * <pre>
   * Replace with infotype
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ReplaceWithInfoTypeConfig replace_with_info_type_config = 7;
   * </code>
   *
   * @return The replaceWithInfoTypeConfig.
   */
  com.google.privacy.dlp.v2.ReplaceWithInfoTypeConfig getReplaceWithInfoTypeConfig();
  /**
   *
   *
   * <pre>
   * Replace with infotype
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ReplaceWithInfoTypeConfig replace_with_info_type_config = 7;
   * </code>
   */
  com.google.privacy.dlp.v2.ReplaceWithInfoTypeConfigOrBuilder
      getReplaceWithInfoTypeConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Time extraction
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TimePartConfig time_part_config = 8;</code>
   *
   * @return Whether the timePartConfig field is set.
   */
  boolean hasTimePartConfig();
  /**
   *
   *
   * <pre>
   * Time extraction
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TimePartConfig time_part_config = 8;</code>
   *
   * @return The timePartConfig.
   */
  com.google.privacy.dlp.v2.TimePartConfig getTimePartConfig();
  /**
   *
   *
   * <pre>
   * Time extraction
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TimePartConfig time_part_config = 8;</code>
   */
  com.google.privacy.dlp.v2.TimePartConfigOrBuilder getTimePartConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Crypto
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoHashConfig crypto_hash_config = 9;</code>
   *
   * @return Whether the cryptoHashConfig field is set.
   */
  boolean hasCryptoHashConfig();
  /**
   *
   *
   * <pre>
   * Crypto
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoHashConfig crypto_hash_config = 9;</code>
   *
   * @return The cryptoHashConfig.
   */
  com.google.privacy.dlp.v2.CryptoHashConfig getCryptoHashConfig();
  /**
   *
   *
   * <pre>
   * Crypto
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoHashConfig crypto_hash_config = 9;</code>
   */
  com.google.privacy.dlp.v2.CryptoHashConfigOrBuilder getCryptoHashConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Date Shift
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateShiftConfig date_shift_config = 11;</code>
   *
   * @return Whether the dateShiftConfig field is set.
   */
  boolean hasDateShiftConfig();
  /**
   *
   *
   * <pre>
   * Date Shift
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateShiftConfig date_shift_config = 11;</code>
   *
   * @return The dateShiftConfig.
   */
  com.google.privacy.dlp.v2.DateShiftConfig getDateShiftConfig();
  /**
   *
   *
   * <pre>
   * Date Shift
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DateShiftConfig date_shift_config = 11;</code>
   */
  com.google.privacy.dlp.v2.DateShiftConfigOrBuilder getDateShiftConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Deterministic Crypto
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoDeterministicConfig crypto_deterministic_config = 12;</code>
   *
   * @return Whether the cryptoDeterministicConfig field is set.
   */
  boolean hasCryptoDeterministicConfig();
  /**
   *
   *
   * <pre>
   * Deterministic Crypto
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoDeterministicConfig crypto_deterministic_config = 12;</code>
   *
   * @return The cryptoDeterministicConfig.
   */
  com.google.privacy.dlp.v2.CryptoDeterministicConfig getCryptoDeterministicConfig();
  /**
   *
   *
   * <pre>
   * Deterministic Crypto
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoDeterministicConfig crypto_deterministic_config = 12;</code>
   */
  com.google.privacy.dlp.v2.CryptoDeterministicConfigOrBuilder
      getCryptoDeterministicConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Replace with a value randomly drawn (with replacement) from a dictionary.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ReplaceDictionaryConfig replace_dictionary_config = 13;</code>
   *
   * @return Whether the replaceDictionaryConfig field is set.
   */
  boolean hasReplaceDictionaryConfig();
  /**
   *
   *
   * <pre>
   * Replace with a value randomly drawn (with replacement) from a dictionary.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ReplaceDictionaryConfig replace_dictionary_config = 13;</code>
   *
   * @return The replaceDictionaryConfig.
   */
  com.google.privacy.dlp.v2.ReplaceDictionaryConfig getReplaceDictionaryConfig();
  /**
   *
   *
   * <pre>
   * Replace with a value randomly drawn (with replacement) from a dictionary.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ReplaceDictionaryConfig replace_dictionary_config = 13;</code>
   */
  com.google.privacy.dlp.v2.ReplaceDictionaryConfigOrBuilder getReplaceDictionaryConfigOrBuilder();

  com.google.privacy.dlp.v2.PrimitiveTransformation.TransformationCase getTransformationCase();
}
