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

package com.google.cloud.dialogflow.cx.v3.samples;

// [START dialogflow_v3_generated_Versions_CreateVersion_sync]
import com.google.cloud.dialogflow.cx.v3.CreateVersionRequest;
import com.google.cloud.dialogflow.cx.v3.FlowName;
import com.google.cloud.dialogflow.cx.v3.Version;
import com.google.cloud.dialogflow.cx.v3.VersionsClient;

public class SyncCreateVersion {

  public static void main(String[] args) throws Exception {
    syncCreateVersion();
  }

  public static void syncCreateVersion() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (VersionsClient versionsClient = VersionsClient.create()) {
      CreateVersionRequest request =
          CreateVersionRequest.newBuilder()
              .setParent(FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]").toString())
              .setVersion(Version.newBuilder().build())
              .build();
      Version response = versionsClient.createVersionAsync(request).get();
    }
  }
}
// [END dialogflow_v3_generated_Versions_CreateVersion_sync]
