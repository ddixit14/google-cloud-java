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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

package com.google.cloud.migrationcenter.v1;

public interface NetworkAddressOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.NetworkAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Assigned or configured IP Address.
   * </pre>
   *
   * <code>string ip_address = 1;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   *
   *
   * <pre>
   * Assigned or configured IP Address.
   * </pre>
   *
   * <code>string ip_address = 1;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * Subnet mask.
   * </pre>
   *
   * <code>string subnet_mask = 2;</code>
   *
   * @return The subnetMask.
   */
  java.lang.String getSubnetMask();
  /**
   *
   *
   * <pre>
   * Subnet mask.
   * </pre>
   *
   * <code>string subnet_mask = 2;</code>
   *
   * @return The bytes for subnetMask.
   */
  com.google.protobuf.ByteString getSubnetMaskBytes();

  /**
   *
   *
   * <pre>
   * Broadcast address.
   * </pre>
   *
   * <code>string bcast = 3;</code>
   *
   * @return The bcast.
   */
  java.lang.String getBcast();
  /**
   *
   *
   * <pre>
   * Broadcast address.
   * </pre>
   *
   * <code>string bcast = 3;</code>
   *
   * @return The bytes for bcast.
   */
  com.google.protobuf.ByteString getBcastBytes();

  /**
   *
   *
   * <pre>
   * Fully qualified domain name.
   * </pre>
   *
   * <code>string fqdn = 4;</code>
   *
   * @return The fqdn.
   */
  java.lang.String getFqdn();
  /**
   *
   *
   * <pre>
   * Fully qualified domain name.
   * </pre>
   *
   * <code>string fqdn = 4;</code>
   *
   * @return The bytes for fqdn.
   */
  com.google.protobuf.ByteString getFqdnBytes();

  /**
   *
   *
   * <pre>
   * Whether DHCP is used to assign addresses.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.NetworkAddress.AddressAssignment assignment = 5;</code>
   *
   * @return The enum numeric value on the wire for assignment.
   */
  int getAssignmentValue();
  /**
   *
   *
   * <pre>
   * Whether DHCP is used to assign addresses.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.NetworkAddress.AddressAssignment assignment = 5;</code>
   *
   * @return The assignment.
   */
  com.google.cloud.migrationcenter.v1.NetworkAddress.AddressAssignment getAssignment();
}
