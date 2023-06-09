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
// source: google/monitoring/v3/notification.proto

package com.google.monitoring.v3;

public interface NotificationChannelDescriptorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.NotificationChannelDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full REST resource name for this descriptor. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/notificationChannelDescriptors/[TYPE]
   *
   * In the above, `[TYPE]` is the value of the `type` field.
   * </pre>
   *
   * <code>string name = 6;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The full REST resource name for this descriptor. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/notificationChannelDescriptors/[TYPE]
   *
   * In the above, `[TYPE]` is the value of the `type` field.
   * </pre>
   *
   * <code>string name = 6;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The type of notification channel, such as "email" and "sms". To view the
   * full list of channels, see
   * [Channel
   * descriptors](https://cloud.google.com/monitoring/alerts/using-channels-api#ncd).
   * Notification channel types are globally unique.
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * The type of notification channel, such as "email" and "sms". To view the
   * full list of channels, see
   * [Channel
   * descriptors](https://cloud.google.com/monitoring/alerts/using-channels-api#ncd).
   * Notification channel types are globally unique.
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * A human-readable name for the notification channel type.  This
   * form of the name is suitable for a user interface.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * A human-readable name for the notification channel type.  This
   * form of the name is suitable for a user interface.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * A human-readable description of the notification channel
   * type. The description may include a description of the properties
   * of the channel and pointers to external documentation.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A human-readable description of the notification channel
   * type. The description may include a description of the properties
   * of the channel and pointers to external documentation.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The set of labels that must be defined to identify a particular
   * channel of the corresponding type. Each label includes a
   * description for how that field should be populated.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 4;</code>
   */
  java.util.List<com.google.api.LabelDescriptor> getLabelsList();
  /**
   *
   *
   * <pre>
   * The set of labels that must be defined to identify a particular
   * channel of the corresponding type. Each label includes a
   * description for how that field should be populated.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 4;</code>
   */
  com.google.api.LabelDescriptor getLabels(int index);
  /**
   *
   *
   * <pre>
   * The set of labels that must be defined to identify a particular
   * channel of the corresponding type. Each label includes a
   * description for how that field should be populated.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The set of labels that must be defined to identify a particular
   * channel of the corresponding type. Each label includes a
   * description for how that field should be populated.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 4;</code>
   */
  java.util.List<? extends com.google.api.LabelDescriptorOrBuilder> getLabelsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The set of labels that must be defined to identify a particular
   * channel of the corresponding type. Each label includes a
   * description for how that field should be populated.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 4;</code>
   */
  com.google.api.LabelDescriptorOrBuilder getLabelsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The tiers that support this notification channel; the project service tier
   * must be one of the supported_tiers.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceTier supported_tiers = 5 [deprecated = true];
   * </code>
   *
   * @deprecated google.monitoring.v3.NotificationChannelDescriptor.supported_tiers is deprecated.
   *     See google/monitoring/v3/notification.proto;l=75
   * @return A list containing the supportedTiers.
   */
  @java.lang.Deprecated
  java.util.List<com.google.monitoring.v3.ServiceTier> getSupportedTiersList();
  /**
   *
   *
   * <pre>
   * The tiers that support this notification channel; the project service tier
   * must be one of the supported_tiers.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceTier supported_tiers = 5 [deprecated = true];
   * </code>
   *
   * @deprecated google.monitoring.v3.NotificationChannelDescriptor.supported_tiers is deprecated.
   *     See google/monitoring/v3/notification.proto;l=75
   * @return The count of supportedTiers.
   */
  @java.lang.Deprecated
  int getSupportedTiersCount();
  /**
   *
   *
   * <pre>
   * The tiers that support this notification channel; the project service tier
   * must be one of the supported_tiers.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceTier supported_tiers = 5 [deprecated = true];
   * </code>
   *
   * @deprecated google.monitoring.v3.NotificationChannelDescriptor.supported_tiers is deprecated.
   *     See google/monitoring/v3/notification.proto;l=75
   * @param index The index of the element to return.
   * @return The supportedTiers at the given index.
   */
  @java.lang.Deprecated
  com.google.monitoring.v3.ServiceTier getSupportedTiers(int index);
  /**
   *
   *
   * <pre>
   * The tiers that support this notification channel; the project service tier
   * must be one of the supported_tiers.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceTier supported_tiers = 5 [deprecated = true];
   * </code>
   *
   * @deprecated google.monitoring.v3.NotificationChannelDescriptor.supported_tiers is deprecated.
   *     See google/monitoring/v3/notification.proto;l=75
   * @return A list containing the enum numeric values on the wire for supportedTiers.
   */
  @java.lang.Deprecated
  java.util.List<java.lang.Integer> getSupportedTiersValueList();
  /**
   *
   *
   * <pre>
   * The tiers that support this notification channel; the project service tier
   * must be one of the supported_tiers.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceTier supported_tiers = 5 [deprecated = true];
   * </code>
   *
   * @deprecated google.monitoring.v3.NotificationChannelDescriptor.supported_tiers is deprecated.
   *     See google/monitoring/v3/notification.proto;l=75
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of supportedTiers at the given index.
   */
  @java.lang.Deprecated
  int getSupportedTiersValue(int index);

  /**
   *
   *
   * <pre>
   * The product launch stage for channels of this type.
   * </pre>
   *
   * <code>.google.api.LaunchStage launch_stage = 7;</code>
   *
   * @return The enum numeric value on the wire for launchStage.
   */
  int getLaunchStageValue();
  /**
   *
   *
   * <pre>
   * The product launch stage for channels of this type.
   * </pre>
   *
   * <code>.google.api.LaunchStage launch_stage = 7;</code>
   *
   * @return The launchStage.
   */
  com.google.api.LaunchStage getLaunchStage();
}
