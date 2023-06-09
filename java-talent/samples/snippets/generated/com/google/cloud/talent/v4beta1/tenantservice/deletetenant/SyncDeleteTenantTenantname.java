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

package com.google.cloud.talent.v4beta1.samples;

// [START jobs_v4beta1_generated_TenantService_DeleteTenant_Tenantname_sync]
import com.google.cloud.talent.v4beta1.TenantName;
import com.google.cloud.talent.v4beta1.TenantServiceClient;
import com.google.protobuf.Empty;

public class SyncDeleteTenantTenantname {

  public static void main(String[] args) throws Exception {
    syncDeleteTenantTenantname();
  }

  public static void syncDeleteTenantTenantname() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TenantServiceClient tenantServiceClient = TenantServiceClient.create()) {
      TenantName name = TenantName.of("[PROJECT]", "[TENANT]");
      tenantServiceClient.deleteTenant(name);
    }
  }
}
// [END jobs_v4beta1_generated_TenantService_DeleteTenant_Tenantname_sync]
