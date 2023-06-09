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

package com.google.cloud.discoveryengine.v1beta.samples;

// [START discoveryengine_v1beta_generated_DocumentService_CreateDocument_BranchnameDocumentString_sync]
import com.google.cloud.discoveryengine.v1beta.BranchName;
import com.google.cloud.discoveryengine.v1beta.Document;
import com.google.cloud.discoveryengine.v1beta.DocumentServiceClient;

public class SyncCreateDocumentBranchnameDocumentString {

  public static void main(String[] args) throws Exception {
    syncCreateDocumentBranchnameDocumentString();
  }

  public static void syncCreateDocumentBranchnameDocumentString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DocumentServiceClient documentServiceClient = DocumentServiceClient.create()) {
      BranchName parent =
          BranchName.ofProjectLocationDataStoreBranchName(
              "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[BRANCH]");
      Document document = Document.newBuilder().build();
      String documentId = "documentId-814940266";
      Document response = documentServiceClient.createDocument(parent, document, documentId);
    }
  }
}
// [END discoveryengine_v1beta_generated_DocumentService_CreateDocument_BranchnameDocumentString_sync]
