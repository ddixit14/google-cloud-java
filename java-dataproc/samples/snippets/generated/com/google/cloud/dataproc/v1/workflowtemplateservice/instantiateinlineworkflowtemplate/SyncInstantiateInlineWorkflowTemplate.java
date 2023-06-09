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

package com.google.cloud.dataproc.v1.samples;

// [START dataproc_v1_generated_WorkflowTemplateService_InstantiateInlineWorkflowTemplate_sync]
import com.google.cloud.dataproc.v1.InstantiateInlineWorkflowTemplateRequest;
import com.google.cloud.dataproc.v1.RegionName;
import com.google.cloud.dataproc.v1.WorkflowTemplate;
import com.google.cloud.dataproc.v1.WorkflowTemplateServiceClient;
import com.google.protobuf.Empty;

public class SyncInstantiateInlineWorkflowTemplate {

  public static void main(String[] args) throws Exception {
    syncInstantiateInlineWorkflowTemplate();
  }

  public static void syncInstantiateInlineWorkflowTemplate() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (WorkflowTemplateServiceClient workflowTemplateServiceClient =
        WorkflowTemplateServiceClient.create()) {
      InstantiateInlineWorkflowTemplateRequest request =
          InstantiateInlineWorkflowTemplateRequest.newBuilder()
              .setParent(RegionName.of("[PROJECT]", "[REGION]").toString())
              .setTemplate(WorkflowTemplate.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      workflowTemplateServiceClient.instantiateInlineWorkflowTemplateAsync(request).get();
    }
  }
}
// [END dataproc_v1_generated_WorkflowTemplateService_InstantiateInlineWorkflowTemplate_sync]
