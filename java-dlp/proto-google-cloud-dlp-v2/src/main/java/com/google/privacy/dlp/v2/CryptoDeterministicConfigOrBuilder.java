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

public interface CryptoDeterministicConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CryptoDeterministicConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The key used by the encryption function. For deterministic encryption
   * using AES-SIV, the provided key is internally expanded to 64 bytes prior to
   * use.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
   *
   * @return Whether the cryptoKey field is set.
   */
  boolean hasCryptoKey();
  /**
   *
   *
   * <pre>
   * The key used by the encryption function. For deterministic encryption
   * using AES-SIV, the provided key is internally expanded to 64 bytes prior to
   * use.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
   *
   * @return The cryptoKey.
   */
  com.google.privacy.dlp.v2.CryptoKey getCryptoKey();
  /**
   *
   *
   * <pre>
   * The key used by the encryption function. For deterministic encryption
   * using AES-SIV, the provided key is internally expanded to 64 bytes prior to
   * use.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
   */
  com.google.privacy.dlp.v2.CryptoKeyOrBuilder getCryptoKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * The custom info type to annotate the surrogate with.
   * This annotation will be applied to the surrogate by prefixing it with
   * the name of the custom info type followed by the number of
   * characters comprising the surrogate. The following scheme defines the
   * format: {info type name}({surrogate character count}):{surrogate}
   *
   * For example, if the name of custom info type is 'MY_TOKEN_INFO_TYPE' and
   * the surrogate is 'abc', the full replacement value
   * will be: 'MY_TOKEN_INFO_TYPE(3):abc'
   *
   * This annotation identifies the surrogate when inspecting content using the
   * custom info type 'Surrogate'. This facilitates reversal of the
   * surrogate when it occurs in free text.
   *
   * Note: For record transformations where the entire cell in a table is being
   * transformed, surrogates are not mandatory. Surrogates are used to denote
   * the location of the token and are necessary for re-identification in free
   * form text.
   *
   * In order for inspection to work properly, the name of this info type must
   * not occur naturally anywhere in your data; otherwise, inspection may either
   *
   * - reverse a surrogate that does not correspond to an actual identifier
   * - be unable to parse the surrogate and result in an error
   *
   * Therefore, choose your custom info type name carefully after considering
   * what your data looks like. One way to select a name that has a high chance
   * of yielding reliable detection is to include one or more unicode characters
   * that are highly improbable to exist in your data.
   * For example, assuming your data is entered from a regular ASCII keyboard,
   * the symbol with the hex code point 29DD might be used like so:
   * ⧝MY_TOKEN_TYPE.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType surrogate_info_type = 2;</code>
   *
   * @return Whether the surrogateInfoType field is set.
   */
  boolean hasSurrogateInfoType();
  /**
   *
   *
   * <pre>
   * The custom info type to annotate the surrogate with.
   * This annotation will be applied to the surrogate by prefixing it with
   * the name of the custom info type followed by the number of
   * characters comprising the surrogate. The following scheme defines the
   * format: {info type name}({surrogate character count}):{surrogate}
   *
   * For example, if the name of custom info type is 'MY_TOKEN_INFO_TYPE' and
   * the surrogate is 'abc', the full replacement value
   * will be: 'MY_TOKEN_INFO_TYPE(3):abc'
   *
   * This annotation identifies the surrogate when inspecting content using the
   * custom info type 'Surrogate'. This facilitates reversal of the
   * surrogate when it occurs in free text.
   *
   * Note: For record transformations where the entire cell in a table is being
   * transformed, surrogates are not mandatory. Surrogates are used to denote
   * the location of the token and are necessary for re-identification in free
   * form text.
   *
   * In order for inspection to work properly, the name of this info type must
   * not occur naturally anywhere in your data; otherwise, inspection may either
   *
   * - reverse a surrogate that does not correspond to an actual identifier
   * - be unable to parse the surrogate and result in an error
   *
   * Therefore, choose your custom info type name carefully after considering
   * what your data looks like. One way to select a name that has a high chance
   * of yielding reliable detection is to include one or more unicode characters
   * that are highly improbable to exist in your data.
   * For example, assuming your data is entered from a regular ASCII keyboard,
   * the symbol with the hex code point 29DD might be used like so:
   * ⧝MY_TOKEN_TYPE.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType surrogate_info_type = 2;</code>
   *
   * @return The surrogateInfoType.
   */
  com.google.privacy.dlp.v2.InfoType getSurrogateInfoType();
  /**
   *
   *
   * <pre>
   * The custom info type to annotate the surrogate with.
   * This annotation will be applied to the surrogate by prefixing it with
   * the name of the custom info type followed by the number of
   * characters comprising the surrogate. The following scheme defines the
   * format: {info type name}({surrogate character count}):{surrogate}
   *
   * For example, if the name of custom info type is 'MY_TOKEN_INFO_TYPE' and
   * the surrogate is 'abc', the full replacement value
   * will be: 'MY_TOKEN_INFO_TYPE(3):abc'
   *
   * This annotation identifies the surrogate when inspecting content using the
   * custom info type 'Surrogate'. This facilitates reversal of the
   * surrogate when it occurs in free text.
   *
   * Note: For record transformations where the entire cell in a table is being
   * transformed, surrogates are not mandatory. Surrogates are used to denote
   * the location of the token and are necessary for re-identification in free
   * form text.
   *
   * In order for inspection to work properly, the name of this info type must
   * not occur naturally anywhere in your data; otherwise, inspection may either
   *
   * - reverse a surrogate that does not correspond to an actual identifier
   * - be unable to parse the surrogate and result in an error
   *
   * Therefore, choose your custom info type name carefully after considering
   * what your data looks like. One way to select a name that has a high chance
   * of yielding reliable detection is to include one or more unicode characters
   * that are highly improbable to exist in your data.
   * For example, assuming your data is entered from a regular ASCII keyboard,
   * the symbol with the hex code point 29DD might be used like so:
   * ⧝MY_TOKEN_TYPE.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType surrogate_info_type = 2;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeOrBuilder getSurrogateInfoTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * A context may be used for higher security and maintaining
   * referential integrity such that the same identifier in two different
   * contexts will be given a distinct surrogate. The context is appended to
   * plaintext value being encrypted. On decryption the provided context is
   * validated against the value used during encryption. If a context was
   * provided during encryption, same context must be provided during decryption
   * as well.
   *
   * If the context is not set, plaintext would be used as is for encryption.
   * If the context is set but:
   *
   * 1. there is no record present when transforming a given value or
   * 2. the field is not present when transforming a given value,
   *
   * plaintext would be used as is for encryption.
   *
   * Note that case (1) is expected when an `InfoTypeTransformation` is
   * applied to both structured and unstructured `ContentItem`s.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId context = 3;</code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * A context may be used for higher security and maintaining
   * referential integrity such that the same identifier in two different
   * contexts will be given a distinct surrogate. The context is appended to
   * plaintext value being encrypted. On decryption the provided context is
   * validated against the value used during encryption. If a context was
   * provided during encryption, same context must be provided during decryption
   * as well.
   *
   * If the context is not set, plaintext would be used as is for encryption.
   * If the context is set but:
   *
   * 1. there is no record present when transforming a given value or
   * 2. the field is not present when transforming a given value,
   *
   * plaintext would be used as is for encryption.
   *
   * Note that case (1) is expected when an `InfoTypeTransformation` is
   * applied to both structured and unstructured `ContentItem`s.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId context = 3;</code>
   *
   * @return The context.
   */
  com.google.privacy.dlp.v2.FieldId getContext();
  /**
   *
   *
   * <pre>
   * A context may be used for higher security and maintaining
   * referential integrity such that the same identifier in two different
   * contexts will be given a distinct surrogate. The context is appended to
   * plaintext value being encrypted. On decryption the provided context is
   * validated against the value used during encryption. If a context was
   * provided during encryption, same context must be provided during decryption
   * as well.
   *
   * If the context is not set, plaintext would be used as is for encryption.
   * If the context is set but:
   *
   * 1. there is no record present when transforming a given value or
   * 2. the field is not present when transforming a given value,
   *
   * plaintext would be used as is for encryption.
   *
   * Note that case (1) is expected when an `InfoTypeTransformation` is
   * applied to both structured and unstructured `ContentItem`s.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId context = 3;</code>
   */
  com.google.privacy.dlp.v2.FieldIdOrBuilder getContextOrBuilder();
}
