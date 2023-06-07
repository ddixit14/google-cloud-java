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
// source: google/cloud/filestore/v1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1;

public interface NetworkConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1.NetworkConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the Google Compute Engine
   * [VPC network](https://cloud.google.com/vpc/docs/vpc) to which the
   * instance is connected.
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * The name of the Google Compute Engine
   * [VPC network](https://cloud.google.com/vpc/docs/vpc) to which the
   * instance is connected.
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Internet protocol versions for which the instance has IP addresses
   * assigned. For this version, only MODE_IPV4 is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1.NetworkConfig.AddressMode modes = 3;</code>
   *
   * @return A list containing the modes.
   */
  java.util.List<com.google.cloud.filestore.v1.NetworkConfig.AddressMode> getModesList();
  /**
   *
   *
   * <pre>
   * Internet protocol versions for which the instance has IP addresses
   * assigned. For this version, only MODE_IPV4 is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1.NetworkConfig.AddressMode modes = 3;</code>
   *
   * @return The count of modes.
   */
  int getModesCount();
  /**
   *
   *
   * <pre>
   * Internet protocol versions for which the instance has IP addresses
   * assigned. For this version, only MODE_IPV4 is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1.NetworkConfig.AddressMode modes = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The modes at the given index.
   */
  com.google.cloud.filestore.v1.NetworkConfig.AddressMode getModes(int index);
  /**
   *
   *
   * <pre>
   * Internet protocol versions for which the instance has IP addresses
   * assigned. For this version, only MODE_IPV4 is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1.NetworkConfig.AddressMode modes = 3;</code>
   *
   * @return A list containing the enum numeric values on the wire for modes.
   */
  java.util.List<java.lang.Integer> getModesValueList();
  /**
   *
   *
   * <pre>
   * Internet protocol versions for which the instance has IP addresses
   * assigned. For this version, only MODE_IPV4 is supported.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1.NetworkConfig.AddressMode modes = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of modes at the given index.
   */
  int getModesValue(int index);

  /**
   *
   *
   * <pre>
   * Optional, reserved_ip_range can have one of the following two types of
   * values.
   *
   * * CIDR range value when using DIRECT_PEERING connect mode.
   * * [Allocated IP address
   * range](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-internal-ip-address)
   * when using PRIVATE_SERVICE_ACCESS connect mode.
   *
   * When the name of an allocated IP address range is specified, it must be one
   * of the ranges associated with the private service access connection.
   * When specified as a direct CIDR value, it must be a /29 CIDR block for
   * Basic tier, a /24 CIDR block for High Scale tier, or a /26 CIDR block for
   * Enterprise tier in one of the [internal IP address
   * ranges](https://www.arin.net/reference/research/statistics/address_filters/)
   * that identifies the range of IP addresses reserved for this instance. For
   * example, 10.0.0.0/29, 192.168.0.0/24 or 192.168.0.0/26, respectively. The
   * range you specify can't overlap with either existing subnets or assigned IP
   * address ranges for other Filestore instances in the selected VPC
   * network.
   * </pre>
   *
   * <code>string reserved_ip_range = 4;</code>
   *
   * @return The reservedIpRange.
   */
  java.lang.String getReservedIpRange();
  /**
   *
   *
   * <pre>
   * Optional, reserved_ip_range can have one of the following two types of
   * values.
   *
   * * CIDR range value when using DIRECT_PEERING connect mode.
   * * [Allocated IP address
   * range](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-internal-ip-address)
   * when using PRIVATE_SERVICE_ACCESS connect mode.
   *
   * When the name of an allocated IP address range is specified, it must be one
   * of the ranges associated with the private service access connection.
   * When specified as a direct CIDR value, it must be a /29 CIDR block for
   * Basic tier, a /24 CIDR block for High Scale tier, or a /26 CIDR block for
   * Enterprise tier in one of the [internal IP address
   * ranges](https://www.arin.net/reference/research/statistics/address_filters/)
   * that identifies the range of IP addresses reserved for this instance. For
   * example, 10.0.0.0/29, 192.168.0.0/24 or 192.168.0.0/26, respectively. The
   * range you specify can't overlap with either existing subnets or assigned IP
   * address ranges for other Filestore instances in the selected VPC
   * network.
   * </pre>
   *
   * <code>string reserved_ip_range = 4;</code>
   *
   * @return The bytes for reservedIpRange.
   */
  com.google.protobuf.ByteString getReservedIpRangeBytes();

  /**
   *
   *
   * <pre>
   * Output only. IPv4 addresses in the format
   * `{octet1}.{octet2}.{octet3}.{octet4}` or IPv6 addresses in the format
   * `{block1}:{block2}:{block3}:{block4}:{block5}:{block6}:{block7}:{block8}`.
   * </pre>
   *
   * <code>repeated string ip_addresses = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return A list containing the ipAddresses.
   */
  java.util.List<java.lang.String> getIpAddressesList();
  /**
   *
   *
   * <pre>
   * Output only. IPv4 addresses in the format
   * `{octet1}.{octet2}.{octet3}.{octet4}` or IPv6 addresses in the format
   * `{block1}:{block2}:{block3}:{block4}:{block5}:{block6}:{block7}:{block8}`.
   * </pre>
   *
   * <code>repeated string ip_addresses = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The count of ipAddresses.
   */
  int getIpAddressesCount();
  /**
   *
   *
   * <pre>
   * Output only. IPv4 addresses in the format
   * `{octet1}.{octet2}.{octet3}.{octet4}` or IPv6 addresses in the format
   * `{block1}:{block2}:{block3}:{block4}:{block5}:{block6}:{block7}:{block8}`.
   * </pre>
   *
   * <code>repeated string ip_addresses = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the element to return.
   * @return The ipAddresses at the given index.
   */
  java.lang.String getIpAddresses(int index);
  /**
   *
   *
   * <pre>
   * Output only. IPv4 addresses in the format
   * `{octet1}.{octet2}.{octet3}.{octet4}` or IPv6 addresses in the format
   * `{block1}:{block2}:{block3}:{block4}:{block5}:{block6}:{block7}:{block8}`.
   * </pre>
   *
   * <code>repeated string ip_addresses = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ipAddresses at the given index.
   */
  com.google.protobuf.ByteString getIpAddressesBytes(int index);

  /**
   *
   *
   * <pre>
   * The network connect mode of the Filestore instance.
   * If not provided, the connect mode defaults to DIRECT_PEERING.
   * </pre>
   *
   * <code>.google.cloud.filestore.v1.NetworkConfig.ConnectMode connect_mode = 6;</code>
   *
   * @return The enum numeric value on the wire for connectMode.
   */
  int getConnectModeValue();
  /**
   *
   *
   * <pre>
   * The network connect mode of the Filestore instance.
   * If not provided, the connect mode defaults to DIRECT_PEERING.
   * </pre>
   *
   * <code>.google.cloud.filestore.v1.NetworkConfig.ConnectMode connect_mode = 6;</code>
   *
   * @return The connectMode.
   */
  com.google.cloud.filestore.v1.NetworkConfig.ConnectMode getConnectMode();
}
