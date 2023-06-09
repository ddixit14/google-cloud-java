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

package com.google.cloud.deploy.v1.samples;

// [START clouddeploy_v1_generated_CloudDeploy_IgnoreJob_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.deploy.v1.CloudDeployClient;
import com.google.cloud.deploy.v1.IgnoreJobRequest;
import com.google.cloud.deploy.v1.IgnoreJobResponse;
import com.google.cloud.deploy.v1.RolloutName;

public class AsyncIgnoreJob {

  public static void main(String[] args) throws Exception {
    asyncIgnoreJob();
  }

  public static void asyncIgnoreJob() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudDeployClient cloudDeployClient = CloudDeployClient.create()) {
      IgnoreJobRequest request =
          IgnoreJobRequest.newBuilder()
              .setRollout(
                  RolloutName.of(
                          "[PROJECT]",
                          "[LOCATION]",
                          "[DELIVERY_PIPELINE]",
                          "[RELEASE]",
                          "[ROLLOUT]")
                      .toString())
              .setPhaseId("phaseId-608264202")
              .setJobId("jobId101296568")
              .build();
      ApiFuture<IgnoreJobResponse> future =
          cloudDeployClient.ignoreJobCallable().futureCall(request);
      // Do something.
      IgnoreJobResponse response = future.get();
    }
  }
}
// [END clouddeploy_v1_generated_CloudDeploy_IgnoreJob_async]
