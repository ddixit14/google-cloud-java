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

package com.google.cloud.dataplex.v1.samples;

// [START dataplex_v1_generated_DataplexService_ListSessions_Environmentname_sync]
import com.google.cloud.dataplex.v1.DataplexServiceClient;
import com.google.cloud.dataplex.v1.EnvironmentName;
import com.google.cloud.dataplex.v1.Session;

public class SyncListSessionsEnvironmentname {

  public static void main(String[] args) throws Exception {
    syncListSessionsEnvironmentname();
  }

  public static void syncListSessionsEnvironmentname() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataplexServiceClient dataplexServiceClient = DataplexServiceClient.create()) {
      EnvironmentName parent =
          EnvironmentName.of("[PROJECT]", "[LOCATION]", "[LAKE]", "[ENVIRONMENT]");
      for (Session element : dataplexServiceClient.listSessions(parent).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END dataplex_v1_generated_DataplexService_ListSessions_Environmentname_sync]
