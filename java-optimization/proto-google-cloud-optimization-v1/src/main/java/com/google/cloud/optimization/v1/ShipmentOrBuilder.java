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
// source: google/cloud/optimization/v1/fleet_routing.proto

package com.google.cloud.optimization.v1;

public interface ShipmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.optimization.v1.Shipment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Set of pickup alternatives associated to the shipment. If not specified,
   * the vehicle only needs to visit a location corresponding to the deliveries.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.Shipment.VisitRequest pickups = 1;</code>
   */
  java.util.List<com.google.cloud.optimization.v1.Shipment.VisitRequest> getPickupsList();
  /**
   *
   *
   * <pre>
   * Set of pickup alternatives associated to the shipment. If not specified,
   * the vehicle only needs to visit a location corresponding to the deliveries.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.Shipment.VisitRequest pickups = 1;</code>
   */
  com.google.cloud.optimization.v1.Shipment.VisitRequest getPickups(int index);
  /**
   *
   *
   * <pre>
   * Set of pickup alternatives associated to the shipment. If not specified,
   * the vehicle only needs to visit a location corresponding to the deliveries.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.Shipment.VisitRequest pickups = 1;</code>
   */
  int getPickupsCount();
  /**
   *
   *
   * <pre>
   * Set of pickup alternatives associated to the shipment. If not specified,
   * the vehicle only needs to visit a location corresponding to the deliveries.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.Shipment.VisitRequest pickups = 1;</code>
   */
  java.util.List<? extends com.google.cloud.optimization.v1.Shipment.VisitRequestOrBuilder>
      getPickupsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Set of pickup alternatives associated to the shipment. If not specified,
   * the vehicle only needs to visit a location corresponding to the deliveries.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.Shipment.VisitRequest pickups = 1;</code>
   */
  com.google.cloud.optimization.v1.Shipment.VisitRequestOrBuilder getPickupsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Set of delivery alternatives associated to the shipment. If not specified,
   * the vehicle only needs to visit a location corresponding to the pickups.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.Shipment.VisitRequest deliveries = 2;</code>
   */
  java.util.List<com.google.cloud.optimization.v1.Shipment.VisitRequest> getDeliveriesList();
  /**
   *
   *
   * <pre>
   * Set of delivery alternatives associated to the shipment. If not specified,
   * the vehicle only needs to visit a location corresponding to the pickups.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.Shipment.VisitRequest deliveries = 2;</code>
   */
  com.google.cloud.optimization.v1.Shipment.VisitRequest getDeliveries(int index);
  /**
   *
   *
   * <pre>
   * Set of delivery alternatives associated to the shipment. If not specified,
   * the vehicle only needs to visit a location corresponding to the pickups.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.Shipment.VisitRequest deliveries = 2;</code>
   */
  int getDeliveriesCount();
  /**
   *
   *
   * <pre>
   * Set of delivery alternatives associated to the shipment. If not specified,
   * the vehicle only needs to visit a location corresponding to the pickups.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.Shipment.VisitRequest deliveries = 2;</code>
   */
  java.util.List<? extends com.google.cloud.optimization.v1.Shipment.VisitRequestOrBuilder>
      getDeliveriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Set of delivery alternatives associated to the shipment. If not specified,
   * the vehicle only needs to visit a location corresponding to the pickups.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.Shipment.VisitRequest deliveries = 2;</code>
   */
  com.google.cloud.optimization.v1.Shipment.VisitRequestOrBuilder getDeliveriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Load demands of the shipment (for example weight, volume, number of
   * pallets etc). The keys in the map should be identifiers describing the type
   * of the corresponding load, ideally also including the units.
   * For example: "weight_kg", "volume_gallons", "pallet_count", etc.
   * If a given key does not appear in the map, the corresponding load is
   * considered as null.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.optimization.v1.Shipment.Load&gt; load_demands = 14;</code>
   */
  int getLoadDemandsCount();
  /**
   *
   *
   * <pre>
   * Load demands of the shipment (for example weight, volume, number of
   * pallets etc). The keys in the map should be identifiers describing the type
   * of the corresponding load, ideally also including the units.
   * For example: "weight_kg", "volume_gallons", "pallet_count", etc.
   * If a given key does not appear in the map, the corresponding load is
   * considered as null.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.optimization.v1.Shipment.Load&gt; load_demands = 14;</code>
   */
  boolean containsLoadDemands(java.lang.String key);
  /** Use {@link #getLoadDemandsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.optimization.v1.Shipment.Load> getLoadDemands();
  /**
   *
   *
   * <pre>
   * Load demands of the shipment (for example weight, volume, number of
   * pallets etc). The keys in the map should be identifiers describing the type
   * of the corresponding load, ideally also including the units.
   * For example: "weight_kg", "volume_gallons", "pallet_count", etc.
   * If a given key does not appear in the map, the corresponding load is
   * considered as null.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.optimization.v1.Shipment.Load&gt; load_demands = 14;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.optimization.v1.Shipment.Load>
      getLoadDemandsMap();
  /**
   *
   *
   * <pre>
   * Load demands of the shipment (for example weight, volume, number of
   * pallets etc). The keys in the map should be identifiers describing the type
   * of the corresponding load, ideally also including the units.
   * For example: "weight_kg", "volume_gallons", "pallet_count", etc.
   * If a given key does not appear in the map, the corresponding load is
   * considered as null.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.optimization.v1.Shipment.Load&gt; load_demands = 14;</code>
   */
  /* nullable */
  com.google.cloud.optimization.v1.Shipment.Load getLoadDemandsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.optimization.v1.Shipment.Load defaultValue);
  /**
   *
   *
   * <pre>
   * Load demands of the shipment (for example weight, volume, number of
   * pallets etc). The keys in the map should be identifiers describing the type
   * of the corresponding load, ideally also including the units.
   * For example: "weight_kg", "volume_gallons", "pallet_count", etc.
   * If a given key does not appear in the map, the corresponding load is
   * considered as null.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.optimization.v1.Shipment.Load&gt; load_demands = 14;</code>
   */
  com.google.cloud.optimization.v1.Shipment.Load getLoadDemandsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * If the shipment is not completed, this penalty is added to the overall
   * cost of the routes. A shipment is considered completed if one of its pickup
   * and delivery alternatives is visited. The cost may be expressed in the
   * same unit used for all other cost-related fields in the model and must be
   * positive.
   *
   * *IMPORTANT*: If this penalty is not specified, it is considered infinite,
   * i.e. the shipment must be completed.
   * </pre>
   *
   * <code>optional double penalty_cost = 4;</code>
   *
   * @return Whether the penaltyCost field is set.
   */
  boolean hasPenaltyCost();
  /**
   *
   *
   * <pre>
   * If the shipment is not completed, this penalty is added to the overall
   * cost of the routes. A shipment is considered completed if one of its pickup
   * and delivery alternatives is visited. The cost may be expressed in the
   * same unit used for all other cost-related fields in the model and must be
   * positive.
   *
   * *IMPORTANT*: If this penalty is not specified, it is considered infinite,
   * i.e. the shipment must be completed.
   * </pre>
   *
   * <code>optional double penalty_cost = 4;</code>
   *
   * @return The penaltyCost.
   */
  double getPenaltyCost();

  /**
   *
   *
   * <pre>
   * The set of vehicles that may perform this shipment. If empty, all vehicles
   * may perform it. Vehicles are given by their index in the `ShipmentModel`'s
   * `vehicles` list.
   * </pre>
   *
   * <code>repeated int32 allowed_vehicle_indices = 5;</code>
   *
   * @return A list containing the allowedVehicleIndices.
   */
  java.util.List<java.lang.Integer> getAllowedVehicleIndicesList();
  /**
   *
   *
   * <pre>
   * The set of vehicles that may perform this shipment. If empty, all vehicles
   * may perform it. Vehicles are given by their index in the `ShipmentModel`'s
   * `vehicles` list.
   * </pre>
   *
   * <code>repeated int32 allowed_vehicle_indices = 5;</code>
   *
   * @return The count of allowedVehicleIndices.
   */
  int getAllowedVehicleIndicesCount();
  /**
   *
   *
   * <pre>
   * The set of vehicles that may perform this shipment. If empty, all vehicles
   * may perform it. Vehicles are given by their index in the `ShipmentModel`'s
   * `vehicles` list.
   * </pre>
   *
   * <code>repeated int32 allowed_vehicle_indices = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The allowedVehicleIndices at the given index.
   */
  int getAllowedVehicleIndices(int index);

  /**
   *
   *
   * <pre>
   * Specifies the cost that is incurred when this shipment is delivered by each
   * vehicle. If specified, it must have EITHER:
   *
   *   * the same number of elements as `costs_per_vehicle_indices`.
   *     `costs_per_vehicle[i]` corresponds to vehicle
   *     `costs_per_vehicle_indices[i]` of the model.
   *   * the same number of elements as there are vehicles in the model. The
   *     i-th element corresponds to vehicle #i of the model.
   *
   * These costs must be in the same unit as `penalty_cost` and must not be
   * negative. Leave this field empty, if there are no such costs.
   * </pre>
   *
   * <code>repeated double costs_per_vehicle = 6;</code>
   *
   * @return A list containing the costsPerVehicle.
   */
  java.util.List<java.lang.Double> getCostsPerVehicleList();
  /**
   *
   *
   * <pre>
   * Specifies the cost that is incurred when this shipment is delivered by each
   * vehicle. If specified, it must have EITHER:
   *
   *   * the same number of elements as `costs_per_vehicle_indices`.
   *     `costs_per_vehicle[i]` corresponds to vehicle
   *     `costs_per_vehicle_indices[i]` of the model.
   *   * the same number of elements as there are vehicles in the model. The
   *     i-th element corresponds to vehicle #i of the model.
   *
   * These costs must be in the same unit as `penalty_cost` and must not be
   * negative. Leave this field empty, if there are no such costs.
   * </pre>
   *
   * <code>repeated double costs_per_vehicle = 6;</code>
   *
   * @return The count of costsPerVehicle.
   */
  int getCostsPerVehicleCount();
  /**
   *
   *
   * <pre>
   * Specifies the cost that is incurred when this shipment is delivered by each
   * vehicle. If specified, it must have EITHER:
   *
   *   * the same number of elements as `costs_per_vehicle_indices`.
   *     `costs_per_vehicle[i]` corresponds to vehicle
   *     `costs_per_vehicle_indices[i]` of the model.
   *   * the same number of elements as there are vehicles in the model. The
   *     i-th element corresponds to vehicle #i of the model.
   *
   * These costs must be in the same unit as `penalty_cost` and must not be
   * negative. Leave this field empty, if there are no such costs.
   * </pre>
   *
   * <code>repeated double costs_per_vehicle = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The costsPerVehicle at the given index.
   */
  double getCostsPerVehicle(int index);

  /**
   *
   *
   * <pre>
   * Indices of the vehicles to which `costs_per_vehicle` applies. If non-empty,
   * it must have the same number of elements as `costs_per_vehicle`. A vehicle
   * index may not be specified more than once. If a vehicle is excluded from
   * `costs_per_vehicle_indices`, its cost is zero.
   * </pre>
   *
   * <code>repeated int32 costs_per_vehicle_indices = 7;</code>
   *
   * @return A list containing the costsPerVehicleIndices.
   */
  java.util.List<java.lang.Integer> getCostsPerVehicleIndicesList();
  /**
   *
   *
   * <pre>
   * Indices of the vehicles to which `costs_per_vehicle` applies. If non-empty,
   * it must have the same number of elements as `costs_per_vehicle`. A vehicle
   * index may not be specified more than once. If a vehicle is excluded from
   * `costs_per_vehicle_indices`, its cost is zero.
   * </pre>
   *
   * <code>repeated int32 costs_per_vehicle_indices = 7;</code>
   *
   * @return The count of costsPerVehicleIndices.
   */
  int getCostsPerVehicleIndicesCount();
  /**
   *
   *
   * <pre>
   * Indices of the vehicles to which `costs_per_vehicle` applies. If non-empty,
   * it must have the same number of elements as `costs_per_vehicle`. A vehicle
   * index may not be specified more than once. If a vehicle is excluded from
   * `costs_per_vehicle_indices`, its cost is zero.
   * </pre>
   *
   * <code>repeated int32 costs_per_vehicle_indices = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The costsPerVehicleIndices at the given index.
   */
  int getCostsPerVehicleIndices(int index);

  /**
   *
   *
   * <pre>
   * Specifies the maximum relative detour time compared to the shortest path
   * from pickup to delivery. If specified, it must be nonnegative, and the
   * shipment must contain at least a pickup and a delivery.
   *
   * For example, let t be the shortest time taken to go from the selected
   * pickup alternative directly to the selected delivery alternative. Then
   * setting `pickup_to_delivery_relative_detour_limit` enforces:
   *
   * ```
   * start_time(delivery) - start_time(pickup) &lt;=
   * std::ceil(t * (1.0 + pickup_to_delivery_relative_detour_limit))
   * ```
   *
   * If both relative and absolute limits are specified on the same shipment,
   * the more constraining limit is used for each possible pickup/delivery pair.
   * As of 2017/10, detours are only supported when travel durations do not
   * depend on vehicles.
   * </pre>
   *
   * <code>optional double pickup_to_delivery_relative_detour_limit = 8;</code>
   *
   * @return Whether the pickupToDeliveryRelativeDetourLimit field is set.
   */
  boolean hasPickupToDeliveryRelativeDetourLimit();
  /**
   *
   *
   * <pre>
   * Specifies the maximum relative detour time compared to the shortest path
   * from pickup to delivery. If specified, it must be nonnegative, and the
   * shipment must contain at least a pickup and a delivery.
   *
   * For example, let t be the shortest time taken to go from the selected
   * pickup alternative directly to the selected delivery alternative. Then
   * setting `pickup_to_delivery_relative_detour_limit` enforces:
   *
   * ```
   * start_time(delivery) - start_time(pickup) &lt;=
   * std::ceil(t * (1.0 + pickup_to_delivery_relative_detour_limit))
   * ```
   *
   * If both relative and absolute limits are specified on the same shipment,
   * the more constraining limit is used for each possible pickup/delivery pair.
   * As of 2017/10, detours are only supported when travel durations do not
   * depend on vehicles.
   * </pre>
   *
   * <code>optional double pickup_to_delivery_relative_detour_limit = 8;</code>
   *
   * @return The pickupToDeliveryRelativeDetourLimit.
   */
  double getPickupToDeliveryRelativeDetourLimit();

  /**
   *
   *
   * <pre>
   * Specifies the maximum absolute detour time compared to the shortest path
   * from pickup to delivery. If specified, it must be nonnegative, and the
   * shipment must contain at least a pickup and a delivery.
   *
   * For example, let t be the shortest time taken to go from the selected
   * pickup alternative directly to the selected delivery alternative. Then
   * setting `pickup_to_delivery_absolute_detour_limit` enforces:
   *
   * ```
   * start_time(delivery) - start_time(pickup) &lt;=
   * t + pickup_to_delivery_absolute_detour_limit
   * ```
   *
   * If both relative and absolute limits are specified on the same shipment,
   * the more constraining limit is used for each possible pickup/delivery pair.
   * As of 2017/10, detours are only supported when travel durations do not
   * depend on vehicles.
   * </pre>
   *
   * <code>.google.protobuf.Duration pickup_to_delivery_absolute_detour_limit = 9;</code>
   *
   * @return Whether the pickupToDeliveryAbsoluteDetourLimit field is set.
   */
  boolean hasPickupToDeliveryAbsoluteDetourLimit();
  /**
   *
   *
   * <pre>
   * Specifies the maximum absolute detour time compared to the shortest path
   * from pickup to delivery. If specified, it must be nonnegative, and the
   * shipment must contain at least a pickup and a delivery.
   *
   * For example, let t be the shortest time taken to go from the selected
   * pickup alternative directly to the selected delivery alternative. Then
   * setting `pickup_to_delivery_absolute_detour_limit` enforces:
   *
   * ```
   * start_time(delivery) - start_time(pickup) &lt;=
   * t + pickup_to_delivery_absolute_detour_limit
   * ```
   *
   * If both relative and absolute limits are specified on the same shipment,
   * the more constraining limit is used for each possible pickup/delivery pair.
   * As of 2017/10, detours are only supported when travel durations do not
   * depend on vehicles.
   * </pre>
   *
   * <code>.google.protobuf.Duration pickup_to_delivery_absolute_detour_limit = 9;</code>
   *
   * @return The pickupToDeliveryAbsoluteDetourLimit.
   */
  com.google.protobuf.Duration getPickupToDeliveryAbsoluteDetourLimit();
  /**
   *
   *
   * <pre>
   * Specifies the maximum absolute detour time compared to the shortest path
   * from pickup to delivery. If specified, it must be nonnegative, and the
   * shipment must contain at least a pickup and a delivery.
   *
   * For example, let t be the shortest time taken to go from the selected
   * pickup alternative directly to the selected delivery alternative. Then
   * setting `pickup_to_delivery_absolute_detour_limit` enforces:
   *
   * ```
   * start_time(delivery) - start_time(pickup) &lt;=
   * t + pickup_to_delivery_absolute_detour_limit
   * ```
   *
   * If both relative and absolute limits are specified on the same shipment,
   * the more constraining limit is used for each possible pickup/delivery pair.
   * As of 2017/10, detours are only supported when travel durations do not
   * depend on vehicles.
   * </pre>
   *
   * <code>.google.protobuf.Duration pickup_to_delivery_absolute_detour_limit = 9;</code>
   */
  com.google.protobuf.DurationOrBuilder getPickupToDeliveryAbsoluteDetourLimitOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the maximum duration from start of pickup to start of delivery of
   * a shipment. If specified, it must be nonnegative, and the shipment must
   * contain at least a pickup and a delivery. This does not depend on which
   * alternatives are selected for pickup and delivery, nor on vehicle speed.
   * This can be specified alongside maximum detour constraints: the solution
   * will respect both specifications.
   * </pre>
   *
   * <code>.google.protobuf.Duration pickup_to_delivery_time_limit = 10;</code>
   *
   * @return Whether the pickupToDeliveryTimeLimit field is set.
   */
  boolean hasPickupToDeliveryTimeLimit();
  /**
   *
   *
   * <pre>
   * Specifies the maximum duration from start of pickup to start of delivery of
   * a shipment. If specified, it must be nonnegative, and the shipment must
   * contain at least a pickup and a delivery. This does not depend on which
   * alternatives are selected for pickup and delivery, nor on vehicle speed.
   * This can be specified alongside maximum detour constraints: the solution
   * will respect both specifications.
   * </pre>
   *
   * <code>.google.protobuf.Duration pickup_to_delivery_time_limit = 10;</code>
   *
   * @return The pickupToDeliveryTimeLimit.
   */
  com.google.protobuf.Duration getPickupToDeliveryTimeLimit();
  /**
   *
   *
   * <pre>
   * Specifies the maximum duration from start of pickup to start of delivery of
   * a shipment. If specified, it must be nonnegative, and the shipment must
   * contain at least a pickup and a delivery. This does not depend on which
   * alternatives are selected for pickup and delivery, nor on vehicle speed.
   * This can be specified alongside maximum detour constraints: the solution
   * will respect both specifications.
   * </pre>
   *
   * <code>.google.protobuf.Duration pickup_to_delivery_time_limit = 10;</code>
   */
  com.google.protobuf.DurationOrBuilder getPickupToDeliveryTimeLimitOrBuilder();

  /**
   *
   *
   * <pre>
   * Non-empty string specifying a "type" for this shipment.
   * This feature can be used to define incompatibilities or requirements
   * between `shipment_types` (see `shipment_type_incompatibilities` and
   * `shipment_type_requirements` in `ShipmentModel`).
   *
   * Differs from `visit_types` which is specified for a single visit: All
   * pickup/deliveries belonging to the same shipment share the same
   * `shipment_type`.
   * </pre>
   *
   * <code>string shipment_type = 11;</code>
   *
   * @return The shipmentType.
   */
  java.lang.String getShipmentType();
  /**
   *
   *
   * <pre>
   * Non-empty string specifying a "type" for this shipment.
   * This feature can be used to define incompatibilities or requirements
   * between `shipment_types` (see `shipment_type_incompatibilities` and
   * `shipment_type_requirements` in `ShipmentModel`).
   *
   * Differs from `visit_types` which is specified for a single visit: All
   * pickup/deliveries belonging to the same shipment share the same
   * `shipment_type`.
   * </pre>
   *
   * <code>string shipment_type = 11;</code>
   *
   * @return The bytes for shipmentType.
   */
  com.google.protobuf.ByteString getShipmentTypeBytes();

  /**
   *
   *
   * <pre>
   * Specifies a label for this shipment. This label is reported in the response
   * in the `shipment_label` of the corresponding
   * [ShipmentRoute.Visit][google.cloud.optimization.v1.ShipmentRoute.Visit].
   * </pre>
   *
   * <code>string label = 12;</code>
   *
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   *
   *
   * <pre>
   * Specifies a label for this shipment. This label is reported in the response
   * in the `shipment_label` of the corresponding
   * [ShipmentRoute.Visit][google.cloud.optimization.v1.ShipmentRoute.Visit].
   * </pre>
   *
   * <code>string label = 12;</code>
   *
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString getLabelBytes();

  /**
   *
   *
   * <pre>
   * If true, skip this shipment, but don't apply a `penalty_cost`.
   *
   * Ignoring a shipment results in a validation error when there are any
   * `shipment_type_requirements` in the model.
   *
   * Ignoring a shipment that is performed in `injected_first_solution_routes`
   * or `injected_solution_constraint` is permitted; the solver removes the
   * related pickup/delivery visits from the performing route.
   * `precedence_rules` that reference ignored shipments will also be ignored.
   * </pre>
   *
   * <code>bool ignore = 13;</code>
   *
   * @return The ignore.
   */
  boolean getIgnore();

  /**
   *
   *
   * <pre>
   * Deprecated: Use
   * [Shipment.load_demands][google.cloud.optimization.v1.Shipment.load_demands]
   * instead.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.CapacityQuantity demands = 3 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<com.google.cloud.optimization.v1.CapacityQuantity> getDemandsList();
  /**
   *
   *
   * <pre>
   * Deprecated: Use
   * [Shipment.load_demands][google.cloud.optimization.v1.Shipment.load_demands]
   * instead.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.CapacityQuantity demands = 3 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.optimization.v1.CapacityQuantity getDemands(int index);
  /**
   *
   *
   * <pre>
   * Deprecated: Use
   * [Shipment.load_demands][google.cloud.optimization.v1.Shipment.load_demands]
   * instead.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.CapacityQuantity demands = 3 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  int getDemandsCount();
  /**
   *
   *
   * <pre>
   * Deprecated: Use
   * [Shipment.load_demands][google.cloud.optimization.v1.Shipment.load_demands]
   * instead.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.CapacityQuantity demands = 3 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<? extends com.google.cloud.optimization.v1.CapacityQuantityOrBuilder>
      getDemandsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Deprecated: Use
   * [Shipment.load_demands][google.cloud.optimization.v1.Shipment.load_demands]
   * instead.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.CapacityQuantity demands = 3 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.optimization.v1.CapacityQuantityOrBuilder getDemandsOrBuilder(int index);
}
