/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery.reservation.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class CapacityCommitmentName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_CAPACITY_COMMITMENT =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/capacityCommitments/{capacity_commitment}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String capacityCommitment;

  @Deprecated
  protected CapacityCommitmentName() {
    project = null;
    location = null;
    capacityCommitment = null;
  }

  private CapacityCommitmentName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    capacityCommitment = Preconditions.checkNotNull(builder.getCapacityCommitment());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getCapacityCommitment() {
    return capacityCommitment;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CapacityCommitmentName of(
      String project, String location, String capacityCommitment) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setCapacityCommitment(capacityCommitment)
        .build();
  }

  public static String format(String project, String location, String capacityCommitment) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setCapacityCommitment(capacityCommitment)
        .build()
        .toString();
  }

  public static CapacityCommitmentName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_CAPACITY_COMMITMENT.validatedMatch(
            formattedString, "CapacityCommitmentName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"), matchMap.get("location"), matchMap.get("capacity_commitment"));
  }

  public static List<CapacityCommitmentName> parseList(List<String> formattedStrings) {
    List<CapacityCommitmentName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CapacityCommitmentName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CapacityCommitmentName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_CAPACITY_COMMITMENT.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (capacityCommitment != null) {
            fieldMapBuilder.put("capacity_commitment", capacityCommitment);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_LOCATION_CAPACITY_COMMITMENT.instantiate(
        "project", project, "location", location, "capacity_commitment", capacityCommitment);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      CapacityCommitmentName that = ((CapacityCommitmentName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.capacityCommitment, that.capacityCommitment);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(capacityCommitment);
    return h;
  }

  /**
   * Builder for projects/{project}/locations/{location}/capacityCommitments/{capacity_commitment}.
   */
  public static class Builder {
    private String project;
    private String location;
    private String capacityCommitment;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getCapacityCommitment() {
      return capacityCommitment;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setCapacityCommitment(String capacityCommitment) {
      this.capacityCommitment = capacityCommitment;
      return this;
    }

    private Builder(CapacityCommitmentName capacityCommitmentName) {
      this.project = capacityCommitmentName.project;
      this.location = capacityCommitmentName.location;
      this.capacityCommitment = capacityCommitmentName.capacityCommitment;
    }

    public CapacityCommitmentName build() {
      return new CapacityCommitmentName(this);
    }
  }
}
