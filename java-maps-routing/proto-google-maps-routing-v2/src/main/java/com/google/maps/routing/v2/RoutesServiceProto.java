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
// source: google/maps/routing/v2/routes_service.proto

package com.google.maps.routing.v2;

public final class RoutesServiceProto {
  private RoutesServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_ComputeRoutesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_ComputeRoutesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_ComputeRoutesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_ComputeRoutesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_ComputeRouteMatrixRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_ComputeRouteMatrixRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_RouteMatrixOrigin_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_RouteMatrixOrigin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_RouteMatrixDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_RouteMatrixDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_RouteMatrixElement_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_RouteMatrixElement_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/maps/routing/v2/routes_service."
          + "proto\022\026google.maps.routing.v2\032\034google/ap"
          + "i/annotations.proto\032\027google/api/client.p"
          + "roto\032\037google/api/field_behavior.proto\032*g"
          + "oogle/maps/routing/v2/fallback_info.prot"
          + "o\032.google/maps/routing/v2/geocoding_resu"
          + "lts.proto\032%google/maps/routing/v2/polyli"
          + "ne.proto\032\"google/maps/routing/v2/route.p"
          + "roto\032,google/maps/routing/v2/route_modif"
          + "iers.proto\032.google/maps/routing/v2/route"
          + "_travel_mode.proto\032/google/maps/routing/"
          + "v2/routing_preference.proto\032\"google/maps"
          + "/routing/v2/units.proto\032%google/maps/rou"
          + "ting/v2/waypoint.proto\032\036google/protobuf/"
          + "duration.proto\032\037google/protobuf/timestam"
          + "p.proto\032\027google/rpc/status.proto\"\206\t\n\024Com"
          + "puteRoutesRequest\0226\n\006origin\030\001 \001(\0132 .goog"
          + "le.maps.routing.v2.WaypointB\004\342A\001\002\022;\n\013des"
          + "tination\030\002 \001(\0132 .google.maps.routing.v2."
          + "WaypointB\004\342A\001\002\022=\n\rintermediates\030\003 \003(\0132 ."
          + "google.maps.routing.v2.WaypointB\004\342A\001\001\022B\n"
          + "\013travel_mode\030\004 \001(\0162\'.google.maps.routing"
          + ".v2.RouteTravelModeB\004\342A\001\001\022K\n\022routing_pre"
          + "ference\030\005 \001(\0162).google.maps.routing.v2.R"
          + "outingPreferenceB\004\342A\001\001\022G\n\020polyline_quali"
          + "ty\030\006 \001(\0162\'.google.maps.routing.v2.Polyli"
          + "neQualityB\004\342A\001\001\022I\n\021polyline_encoding\030\014 \001"
          + "(\0162(.google.maps.routing.v2.PolylineEnco"
          + "dingB\004\342A\001\001\0228\n\016departure_time\030\007 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\004\342A\001\001\022(\n\032compute_"
          + "alternative_routes\030\010 \001(\010B\004\342A\001\001\022E\n\017route_"
          + "modifiers\030\t \001(\0132&.google.maps.routing.v2"
          + ".RouteModifiersB\004\342A\001\001\022\033\n\rlanguage_code\030\n"
          + " \001(\tB\004\342A\001\001\022\031\n\013region_code\030\020 \001(\tB\004\342A\001\001\0222\n"
          + "\005units\030\013 \001(\0162\035.google.maps.routing.v2.Un"
          + "itsB\004\342A\001\001\022e\n\032requested_reference_routes\030"
          + "\016 \003(\0162;.google.maps.routing.v2.ComputeRo"
          + "utesRequest.ReferenceRouteB\004\342A\001\001\022_\n\022extr"
          + "a_computations\030\017 \003(\0162=.google.maps.routi"
          + "ng.v2.ComputeRoutesRequest.ExtraComputat"
          + "ionB\004\342A\001\001\"E\n\016ReferenceRoute\022\037\n\033REFERENCE"
          + "_ROUTE_UNSPECIFIED\020\000\022\022\n\016FUEL_EFFICIENT\020\001"
          + "\"o\n\020ExtraComputation\022!\n\035EXTRA_COMPUTATIO"
          + "N_UNSPECIFIED\020\000\022\t\n\005TOLLS\020\001\022\024\n\020FUEL_CONSU"
          + "MPTION\020\002\022\027\n\023TRAFFIC_ON_POLYLINE\020\003\"\310\001\n\025Co"
          + "mputeRoutesResponse\022-\n\006routes\030\001 \003(\0132\035.go"
          + "ogle.maps.routing.v2.Route\022;\n\rfallback_i"
          + "nfo\030\002 \001(\0132$.google.maps.routing.v2.Fallb"
          + "ackInfo\022C\n\021geocoding_results\030\003 \001(\0132(.goo"
          + "gle.maps.routing.v2.GeocodingResults\"\324\004\n"
          + "\031ComputeRouteMatrixRequest\022@\n\007origins\030\001 "
          + "\003(\0132).google.maps.routing.v2.RouteMatrix"
          + "OriginB\004\342A\001\002\022J\n\014destinations\030\002 \003(\0132..goo"
          + "gle.maps.routing.v2.RouteMatrixDestinati"
          + "onB\004\342A\001\002\022B\n\013travel_mode\030\003 \001(\0162\'.google.m"
          + "aps.routing.v2.RouteTravelModeB\004\342A\001\001\022K\n\022"
          + "routing_preference\030\004 \001(\0162).google.maps.r"
          + "outing.v2.RoutingPreferenceB\004\342A\001\001\0228\n\016dep"
          + "arture_time\030\005 \001(\0132\032.google.protobuf.Time"
          + "stampB\004\342A\001\001\022\033\n\rlanguage_code\030\006 \001(\tB\004\342A\001\001"
          + "\022\031\n\013region_code\030\t \001(\tB\004\342A\001\001\022d\n\022extra_com"
          + "putations\030\010 \003(\0162B.google.maps.routing.v2"
          + ".ComputeRouteMatrixRequest.ExtraComputat"
          + "ionB\004\342A\001\001\"@\n\020ExtraComputation\022!\n\035EXTRA_C"
          + "OMPUTATION_UNSPECIFIED\020\000\022\t\n\005TOLLS\020\001\"\224\001\n\021"
          + "RouteMatrixOrigin\0228\n\010waypoint\030\001 \001(\0132 .go"
          + "ogle.maps.routing.v2.WaypointB\004\342A\001\002\022E\n\017r"
          + "oute_modifiers\030\002 \001(\0132&.google.maps.routi"
          + "ng.v2.RouteModifiersB\004\342A\001\001\"R\n\026RouteMatri"
          + "xDestination\0228\n\010waypoint\030\001 \001(\0132 .google."
          + "maps.routing.v2.WaypointB\004\342A\001\002\"\337\003\n\022Route"
          + "MatrixElement\022\031\n\014origin_index\030\001 \001(\005H\000\210\001\001"
          + "\022\036\n\021destination_index\030\002 \001(\005H\001\210\001\001\022\"\n\006stat"
          + "us\030\003 \001(\0132\022.google.rpc.Status\022F\n\tconditio"
          + "n\030\t \001(\01623.google.maps.routing.v2.RouteMa"
          + "trixElementCondition\022\027\n\017distance_meters\030"
          + "\004 \001(\005\022+\n\010duration\030\005 \001(\0132\031.google.protobu"
          + "f.Duration\0222\n\017static_duration\030\006 \001(\0132\031.go"
          + "ogle.protobuf.Duration\022D\n\017travel_advisor"
          + "y\030\007 \001(\0132+.google.maps.routing.v2.RouteTr"
          + "avelAdvisory\022;\n\rfallback_info\030\010 \001(\0132$.go"
          + "ogle.maps.routing.v2.FallbackInfoB\017\n\r_or"
          + "igin_indexB\024\n\022_destination_index*t\n\033Rout"
          + "eMatrixElementCondition\022.\n*ROUTE_MATRIX_"
          + "ELEMENT_CONDITION_UNSPECIFIED\020\000\022\020\n\014ROUTE"
          + "_EXISTS\020\001\022\023\n\017ROUTE_NOT_FOUND\020\0022\344\002\n\006Route"
          + "s\022\225\001\n\rComputeRoutes\022,.google.maps.routin"
          + "g.v2.ComputeRoutesRequest\032-.google.maps."
          + "routing.v2.ComputeRoutesResponse\"\'\202\323\344\223\002!"
          + "\"\034/directions/v2:computeRoutes:\001*\022\247\001\n\022Co"
          + "mputeRouteMatrix\0221.google.maps.routing.v"
          + "2.ComputeRouteMatrixRequest\032*.google.map"
          + "s.routing.v2.RouteMatrixElement\"0\202\323\344\223\002*\""
          + "%/distanceMatrix/v2:computeRouteMatrix:\001"
          + "*0\001\032\030\312A\025routes.googleapis.comB\307\001\n\032com.go"
          + "ogle.maps.routing.v2B\022RoutesServiceProto"
          + "P\001Z:cloud.google.com/go/maps/routing/api"
          + "v2/routingpb;routingpb\370\001\001\242\002\005GMRV2\252\002\026Goog"
          + "le.Maps.Routing.V2\312\002\026Google\\Maps\\Routing"
          + "\\V2\352\002\031Google::Maps::Routing::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.maps.routing.v2.FallbackInfoProto.getDescriptor(),
              com.google.maps.routing.v2.GeocodingResultsProto.getDescriptor(),
              com.google.maps.routing.v2.PolylineProto.getDescriptor(),
              com.google.maps.routing.v2.RouteProto.getDescriptor(),
              com.google.maps.routing.v2.RouteModifiersProto.getDescriptor(),
              com.google.maps.routing.v2.RouteTravelModeProto.getDescriptor(),
              com.google.maps.routing.v2.RoutingPreferenceProto.getDescriptor(),
              com.google.maps.routing.v2.UnitsProto.getDescriptor(),
              com.google.maps.routing.v2.WaypointProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_maps_routing_v2_ComputeRoutesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_routing_v2_ComputeRoutesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_ComputeRoutesRequest_descriptor,
            new java.lang.String[] {
              "Origin",
              "Destination",
              "Intermediates",
              "TravelMode",
              "RoutingPreference",
              "PolylineQuality",
              "PolylineEncoding",
              "DepartureTime",
              "ComputeAlternativeRoutes",
              "RouteModifiers",
              "LanguageCode",
              "RegionCode",
              "Units",
              "RequestedReferenceRoutes",
              "ExtraComputations",
            });
    internal_static_google_maps_routing_v2_ComputeRoutesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_maps_routing_v2_ComputeRoutesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_ComputeRoutesResponse_descriptor,
            new java.lang.String[] {
              "Routes", "FallbackInfo", "GeocodingResults",
            });
    internal_static_google_maps_routing_v2_ComputeRouteMatrixRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_maps_routing_v2_ComputeRouteMatrixRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_ComputeRouteMatrixRequest_descriptor,
            new java.lang.String[] {
              "Origins",
              "Destinations",
              "TravelMode",
              "RoutingPreference",
              "DepartureTime",
              "LanguageCode",
              "RegionCode",
              "ExtraComputations",
            });
    internal_static_google_maps_routing_v2_RouteMatrixOrigin_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_maps_routing_v2_RouteMatrixOrigin_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_RouteMatrixOrigin_descriptor,
            new java.lang.String[] {
              "Waypoint", "RouteModifiers",
            });
    internal_static_google_maps_routing_v2_RouteMatrixDestination_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_maps_routing_v2_RouteMatrixDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_RouteMatrixDestination_descriptor,
            new java.lang.String[] {
              "Waypoint",
            });
    internal_static_google_maps_routing_v2_RouteMatrixElement_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_maps_routing_v2_RouteMatrixElement_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_RouteMatrixElement_descriptor,
            new java.lang.String[] {
              "OriginIndex",
              "DestinationIndex",
              "Status",
              "Condition",
              "DistanceMeters",
              "Duration",
              "StaticDuration",
              "TravelAdvisory",
              "FallbackInfo",
              "OriginIndex",
              "DestinationIndex",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.maps.routing.v2.FallbackInfoProto.getDescriptor();
    com.google.maps.routing.v2.GeocodingResultsProto.getDescriptor();
    com.google.maps.routing.v2.PolylineProto.getDescriptor();
    com.google.maps.routing.v2.RouteProto.getDescriptor();
    com.google.maps.routing.v2.RouteModifiersProto.getDescriptor();
    com.google.maps.routing.v2.RouteTravelModeProto.getDescriptor();
    com.google.maps.routing.v2.RoutingPreferenceProto.getDescriptor();
    com.google.maps.routing.v2.UnitsProto.getDescriptor();
    com.google.maps.routing.v2.WaypointProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
