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

package com.google.cloud.edgecontainer.v1.samples;

// [START edgecontainer_v1_generated_EdgeContainer_GetCluster_sync]
import com.google.cloud.edgecontainer.v1.Cluster;
import com.google.cloud.edgecontainer.v1.ClusterName;
import com.google.cloud.edgecontainer.v1.EdgeContainerClient;
import com.google.cloud.edgecontainer.v1.GetClusterRequest;

public class SyncGetCluster {

  public static void main(String[] args) throws Exception {
    syncGetCluster();
  }

  public static void syncGetCluster() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (EdgeContainerClient edgeContainerClient = EdgeContainerClient.create()) {
      GetClusterRequest request =
          GetClusterRequest.newBuilder()
              .setName(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
              .build();
      Cluster response = edgeContainerClient.getCluster(request);
    }
  }
}
// [END edgecontainer_v1_generated_EdgeContainer_GetCluster_sync]
