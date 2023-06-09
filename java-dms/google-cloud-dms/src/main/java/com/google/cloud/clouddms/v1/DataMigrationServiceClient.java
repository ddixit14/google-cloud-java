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

package com.google.cloud.clouddms.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.clouddms.v1.stub.DataMigrationServiceStub;
import com.google.cloud.clouddms.v1.stub.DataMigrationServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Database Migration service
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (DataMigrationServiceClient dataMigrationServiceClient =
 *     DataMigrationServiceClient.create()) {
 *   MigrationJobName name = MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]");
 *   MigrationJob response = dataMigrationServiceClient.getMigrationJob(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the DataMigrationServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of DataMigrationServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * DataMigrationServiceSettings dataMigrationServiceSettings =
 *     DataMigrationServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * DataMigrationServiceClient dataMigrationServiceClient =
 *     DataMigrationServiceClient.create(dataMigrationServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * DataMigrationServiceSettings dataMigrationServiceSettings =
 *     DataMigrationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * DataMigrationServiceClient dataMigrationServiceClient =
 *     DataMigrationServiceClient.create(dataMigrationServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class DataMigrationServiceClient implements BackgroundResource {
  private final DataMigrationServiceSettings settings;
  private final DataMigrationServiceStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of DataMigrationServiceClient with default settings. */
  public static final DataMigrationServiceClient create() throws IOException {
    return create(DataMigrationServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of DataMigrationServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final DataMigrationServiceClient create(DataMigrationServiceSettings settings)
      throws IOException {
    return new DataMigrationServiceClient(settings);
  }

  /**
   * Constructs an instance of DataMigrationServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(DataMigrationServiceSettings).
   */
  public static final DataMigrationServiceClient create(DataMigrationServiceStub stub) {
    return new DataMigrationServiceClient(stub);
  }

  /**
   * Constructs an instance of DataMigrationServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected DataMigrationServiceClient(DataMigrationServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((DataMigrationServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  protected DataMigrationServiceClient(DataMigrationServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final DataMigrationServiceSettings getSettings() {
    return settings;
  }

  public DataMigrationServiceStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists migration jobs in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (MigrationJob element :
   *       dataMigrationServiceClient.listMigrationJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent which owns this collection of migrationJobs.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMigrationJobsPagedResponse listMigrationJobs(LocationName parent) {
    ListMigrationJobsRequest request =
        ListMigrationJobsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listMigrationJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists migration jobs in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (MigrationJob element :
   *       dataMigrationServiceClient.listMigrationJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent which owns this collection of migrationJobs.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMigrationJobsPagedResponse listMigrationJobs(String parent) {
    ListMigrationJobsRequest request =
        ListMigrationJobsRequest.newBuilder().setParent(parent).build();
    return listMigrationJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists migration jobs in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ListMigrationJobsRequest request =
   *       ListMigrationJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (MigrationJob element :
   *       dataMigrationServiceClient.listMigrationJobs(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMigrationJobsPagedResponse listMigrationJobs(ListMigrationJobsRequest request) {
    return listMigrationJobsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists migration jobs in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ListMigrationJobsRequest request =
   *       ListMigrationJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<MigrationJob> future =
   *       dataMigrationServiceClient.listMigrationJobsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (MigrationJob element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListMigrationJobsRequest, ListMigrationJobsPagedResponse>
      listMigrationJobsPagedCallable() {
    return stub.listMigrationJobsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists migration jobs in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ListMigrationJobsRequest request =
   *       ListMigrationJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     ListMigrationJobsResponse response =
   *         dataMigrationServiceClient.listMigrationJobsCallable().call(request);
   *     for (MigrationJob element : response.getMigrationJobsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListMigrationJobsRequest, ListMigrationJobsResponse>
      listMigrationJobsCallable() {
    return stub.listMigrationJobsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   MigrationJobName name = MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]");
   *   MigrationJob response = dataMigrationServiceClient.getMigrationJob(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the migration job resource to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MigrationJob getMigrationJob(MigrationJobName name) {
    GetMigrationJobRequest request =
        GetMigrationJobRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getMigrationJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String name = MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString();
   *   MigrationJob response = dataMigrationServiceClient.getMigrationJob(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the migration job resource to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MigrationJob getMigrationJob(String name) {
    GetMigrationJobRequest request = GetMigrationJobRequest.newBuilder().setName(name).build();
    return getMigrationJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   GetMigrationJobRequest request =
   *       GetMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   MigrationJob response = dataMigrationServiceClient.getMigrationJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MigrationJob getMigrationJob(GetMigrationJobRequest request) {
    return getMigrationJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   GetMigrationJobRequest request =
   *       GetMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   ApiFuture<MigrationJob> future =
   *       dataMigrationServiceClient.getMigrationJobCallable().futureCall(request);
   *   // Do something.
   *   MigrationJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetMigrationJobRequest, MigrationJob> getMigrationJobCallable() {
    return stub.getMigrationJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new migration job in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   MigrationJob migrationJob = MigrationJob.newBuilder().build();
   *   String migrationJobId = "migrationJobId1870575242";
   *   MigrationJob response =
   *       dataMigrationServiceClient
   *           .createMigrationJobAsync(parent, migrationJob, migrationJobId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent which owns this collection of migration jobs.
   * @param migrationJob Required. Represents a [migration
   *     job](https://cloud.google.com/database-migration/docs/reference/rest/v1/projects.locations.migrationJobs)
   *     object.
   * @param migrationJobId Required. The ID of the instance to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<MigrationJob, OperationMetadata> createMigrationJobAsync(
      LocationName parent, MigrationJob migrationJob, String migrationJobId) {
    CreateMigrationJobRequest request =
        CreateMigrationJobRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setMigrationJob(migrationJob)
            .setMigrationJobId(migrationJobId)
            .build();
    return createMigrationJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new migration job in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   MigrationJob migrationJob = MigrationJob.newBuilder().build();
   *   String migrationJobId = "migrationJobId1870575242";
   *   MigrationJob response =
   *       dataMigrationServiceClient
   *           .createMigrationJobAsync(parent, migrationJob, migrationJobId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent which owns this collection of migration jobs.
   * @param migrationJob Required. Represents a [migration
   *     job](https://cloud.google.com/database-migration/docs/reference/rest/v1/projects.locations.migrationJobs)
   *     object.
   * @param migrationJobId Required. The ID of the instance to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<MigrationJob, OperationMetadata> createMigrationJobAsync(
      String parent, MigrationJob migrationJob, String migrationJobId) {
    CreateMigrationJobRequest request =
        CreateMigrationJobRequest.newBuilder()
            .setParent(parent)
            .setMigrationJob(migrationJob)
            .setMigrationJobId(migrationJobId)
            .build();
    return createMigrationJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new migration job in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CreateMigrationJobRequest request =
   *       CreateMigrationJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setMigrationJobId("migrationJobId1870575242")
   *           .setMigrationJob(MigrationJob.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   MigrationJob response = dataMigrationServiceClient.createMigrationJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<MigrationJob, OperationMetadata> createMigrationJobAsync(
      CreateMigrationJobRequest request) {
    return createMigrationJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new migration job in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CreateMigrationJobRequest request =
   *       CreateMigrationJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setMigrationJobId("migrationJobId1870575242")
   *           .setMigrationJob(MigrationJob.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<MigrationJob, OperationMetadata> future =
   *       dataMigrationServiceClient.createMigrationJobOperationCallable().futureCall(request);
   *   // Do something.
   *   MigrationJob response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateMigrationJobRequest, MigrationJob, OperationMetadata>
      createMigrationJobOperationCallable() {
    return stub.createMigrationJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new migration job in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CreateMigrationJobRequest request =
   *       CreateMigrationJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setMigrationJobId("migrationJobId1870575242")
   *           .setMigrationJob(MigrationJob.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.createMigrationJobCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateMigrationJobRequest, Operation> createMigrationJobCallable() {
    return stub.createMigrationJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   MigrationJob migrationJob = MigrationJob.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   MigrationJob response =
   *       dataMigrationServiceClient.updateMigrationJobAsync(migrationJob, updateMask).get();
   * }
   * }</pre>
   *
   * @param migrationJob Required. The migration job parameters to update.
   * @param updateMask Required. Field mask is used to specify the fields to be overwritten by the
   *     update in the conversion workspace resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<MigrationJob, OperationMetadata> updateMigrationJobAsync(
      MigrationJob migrationJob, FieldMask updateMask) {
    UpdateMigrationJobRequest request =
        UpdateMigrationJobRequest.newBuilder()
            .setMigrationJob(migrationJob)
            .setUpdateMask(updateMask)
            .build();
    return updateMigrationJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   UpdateMigrationJobRequest request =
   *       UpdateMigrationJobRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setMigrationJob(MigrationJob.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   MigrationJob response = dataMigrationServiceClient.updateMigrationJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<MigrationJob, OperationMetadata> updateMigrationJobAsync(
      UpdateMigrationJobRequest request) {
    return updateMigrationJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   UpdateMigrationJobRequest request =
   *       UpdateMigrationJobRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setMigrationJob(MigrationJob.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<MigrationJob, OperationMetadata> future =
   *       dataMigrationServiceClient.updateMigrationJobOperationCallable().futureCall(request);
   *   // Do something.
   *   MigrationJob response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<UpdateMigrationJobRequest, MigrationJob, OperationMetadata>
      updateMigrationJobOperationCallable() {
    return stub.updateMigrationJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   UpdateMigrationJobRequest request =
   *       UpdateMigrationJobRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setMigrationJob(MigrationJob.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.updateMigrationJobCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateMigrationJobRequest, Operation> updateMigrationJobCallable() {
    return stub.updateMigrationJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   MigrationJobName name = MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]");
   *   dataMigrationServiceClient.deleteMigrationJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Name of the migration job resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteMigrationJobAsync(
      MigrationJobName name) {
    DeleteMigrationJobRequest request =
        DeleteMigrationJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteMigrationJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String name = MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString();
   *   dataMigrationServiceClient.deleteMigrationJobAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Name of the migration job resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteMigrationJobAsync(String name) {
    DeleteMigrationJobRequest request =
        DeleteMigrationJobRequest.newBuilder().setName(name).build();
    return deleteMigrationJobAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DeleteMigrationJobRequest request =
   *       DeleteMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .setRequestId("requestId693933066")
   *           .setForce(true)
   *           .build();
   *   dataMigrationServiceClient.deleteMigrationJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteMigrationJobAsync(
      DeleteMigrationJobRequest request) {
    return deleteMigrationJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DeleteMigrationJobRequest request =
   *       DeleteMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .setRequestId("requestId693933066")
   *           .setForce(true)
   *           .build();
   *   OperationFuture<Empty, OperationMetadata> future =
   *       dataMigrationServiceClient.deleteMigrationJobOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteMigrationJobRequest, Empty, OperationMetadata>
      deleteMigrationJobOperationCallable() {
    return stub.deleteMigrationJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DeleteMigrationJobRequest request =
   *       DeleteMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .setRequestId("requestId693933066")
   *           .setForce(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.deleteMigrationJobCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteMigrationJobRequest, Operation> deleteMigrationJobCallable() {
    return stub.deleteMigrationJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Start an already created migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   StartMigrationJobRequest request =
   *       StartMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   MigrationJob response = dataMigrationServiceClient.startMigrationJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<MigrationJob, OperationMetadata> startMigrationJobAsync(
      StartMigrationJobRequest request) {
    return startMigrationJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Start an already created migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   StartMigrationJobRequest request =
   *       StartMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   OperationFuture<MigrationJob, OperationMetadata> future =
   *       dataMigrationServiceClient.startMigrationJobOperationCallable().futureCall(request);
   *   // Do something.
   *   MigrationJob response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<StartMigrationJobRequest, MigrationJob, OperationMetadata>
      startMigrationJobOperationCallable() {
    return stub.startMigrationJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Start an already created migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   StartMigrationJobRequest request =
   *       StartMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.startMigrationJobCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<StartMigrationJobRequest, Operation> startMigrationJobCallable() {
    return stub.startMigrationJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops a running migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   StopMigrationJobRequest request =
   *       StopMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   MigrationJob response = dataMigrationServiceClient.stopMigrationJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<MigrationJob, OperationMetadata> stopMigrationJobAsync(
      StopMigrationJobRequest request) {
    return stopMigrationJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops a running migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   StopMigrationJobRequest request =
   *       StopMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   OperationFuture<MigrationJob, OperationMetadata> future =
   *       dataMigrationServiceClient.stopMigrationJobOperationCallable().futureCall(request);
   *   // Do something.
   *   MigrationJob response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<StopMigrationJobRequest, MigrationJob, OperationMetadata>
      stopMigrationJobOperationCallable() {
    return stub.stopMigrationJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops a running migration job.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   StopMigrationJobRequest request =
   *       StopMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.stopMigrationJobCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<StopMigrationJobRequest, Operation> stopMigrationJobCallable() {
    return stub.stopMigrationJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resume a migration job that is currently stopped and is resumable (was stopped during CDC
   * phase).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ResumeMigrationJobRequest request =
   *       ResumeMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   MigrationJob response = dataMigrationServiceClient.resumeMigrationJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<MigrationJob, OperationMetadata> resumeMigrationJobAsync(
      ResumeMigrationJobRequest request) {
    return resumeMigrationJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resume a migration job that is currently stopped and is resumable (was stopped during CDC
   * phase).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ResumeMigrationJobRequest request =
   *       ResumeMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   OperationFuture<MigrationJob, OperationMetadata> future =
   *       dataMigrationServiceClient.resumeMigrationJobOperationCallable().futureCall(request);
   *   // Do something.
   *   MigrationJob response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<ResumeMigrationJobRequest, MigrationJob, OperationMetadata>
      resumeMigrationJobOperationCallable() {
    return stub.resumeMigrationJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Resume a migration job that is currently stopped and is resumable (was stopped during CDC
   * phase).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ResumeMigrationJobRequest request =
   *       ResumeMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.resumeMigrationJobCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ResumeMigrationJobRequest, Operation> resumeMigrationJobCallable() {
    return stub.resumeMigrationJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promote a migration job, stopping replication to the destination and promoting the destination
   * to be a standalone database.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   PromoteMigrationJobRequest request =
   *       PromoteMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   MigrationJob response = dataMigrationServiceClient.promoteMigrationJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<MigrationJob, OperationMetadata> promoteMigrationJobAsync(
      PromoteMigrationJobRequest request) {
    return promoteMigrationJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promote a migration job, stopping replication to the destination and promoting the destination
   * to be a standalone database.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   PromoteMigrationJobRequest request =
   *       PromoteMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   OperationFuture<MigrationJob, OperationMetadata> future =
   *       dataMigrationServiceClient.promoteMigrationJobOperationCallable().futureCall(request);
   *   // Do something.
   *   MigrationJob response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<PromoteMigrationJobRequest, MigrationJob, OperationMetadata>
      promoteMigrationJobOperationCallable() {
    return stub.promoteMigrationJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Promote a migration job, stopping replication to the destination and promoting the destination
   * to be a standalone database.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   PromoteMigrationJobRequest request =
   *       PromoteMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.promoteMigrationJobCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<PromoteMigrationJobRequest, Operation> promoteMigrationJobCallable() {
    return stub.promoteMigrationJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Verify a migration job, making sure the destination can reach the source and that all
   * configuration and prerequisites are met.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   VerifyMigrationJobRequest request =
   *       VerifyMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   MigrationJob response = dataMigrationServiceClient.verifyMigrationJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<MigrationJob, OperationMetadata> verifyMigrationJobAsync(
      VerifyMigrationJobRequest request) {
    return verifyMigrationJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Verify a migration job, making sure the destination can reach the source and that all
   * configuration and prerequisites are met.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   VerifyMigrationJobRequest request =
   *       VerifyMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   OperationFuture<MigrationJob, OperationMetadata> future =
   *       dataMigrationServiceClient.verifyMigrationJobOperationCallable().futureCall(request);
   *   // Do something.
   *   MigrationJob response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<VerifyMigrationJobRequest, MigrationJob, OperationMetadata>
      verifyMigrationJobOperationCallable() {
    return stub.verifyMigrationJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Verify a migration job, making sure the destination can reach the source and that all
   * configuration and prerequisites are met.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   VerifyMigrationJobRequest request =
   *       VerifyMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.verifyMigrationJobCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<VerifyMigrationJobRequest, Operation> verifyMigrationJobCallable() {
    return stub.verifyMigrationJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Restart a stopped or failed migration job, resetting the destination instance to its original
   * state and starting the migration process from scratch.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   RestartMigrationJobRequest request =
   *       RestartMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   MigrationJob response = dataMigrationServiceClient.restartMigrationJobAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<MigrationJob, OperationMetadata> restartMigrationJobAsync(
      RestartMigrationJobRequest request) {
    return restartMigrationJobOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Restart a stopped or failed migration job, resetting the destination instance to its original
   * state and starting the migration process from scratch.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   RestartMigrationJobRequest request =
   *       RestartMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   OperationFuture<MigrationJob, OperationMetadata> future =
   *       dataMigrationServiceClient.restartMigrationJobOperationCallable().futureCall(request);
   *   // Do something.
   *   MigrationJob response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<RestartMigrationJobRequest, MigrationJob, OperationMetadata>
      restartMigrationJobOperationCallable() {
    return stub.restartMigrationJobOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Restart a stopped or failed migration job, resetting the destination instance to its original
   * state and starting the migration process from scratch.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   RestartMigrationJobRequest request =
   *       RestartMigrationJobRequest.newBuilder()
   *           .setName(MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.restartMigrationJobCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<RestartMigrationJobRequest, Operation> restartMigrationJobCallable() {
    return stub.restartMigrationJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generate a SSH configuration script to configure the reverse SSH connectivity.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   GenerateSshScriptRequest request =
   *       GenerateSshScriptRequest.newBuilder()
   *           .setMigrationJob(
   *               MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .setVm("vm3767")
   *           .setVmPort(563010825)
   *           .build();
   *   SshScript response = dataMigrationServiceClient.generateSshScript(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SshScript generateSshScript(GenerateSshScriptRequest request) {
    return generateSshScriptCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generate a SSH configuration script to configure the reverse SSH connectivity.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   GenerateSshScriptRequest request =
   *       GenerateSshScriptRequest.newBuilder()
   *           .setMigrationJob(
   *               MigrationJobName.of("[PROJECT]", "[LOCATION]", "[MIGRATION_JOB]").toString())
   *           .setVm("vm3767")
   *           .setVmPort(563010825)
   *           .build();
   *   ApiFuture<SshScript> future =
   *       dataMigrationServiceClient.generateSshScriptCallable().futureCall(request);
   *   // Do something.
   *   SshScript response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateSshScriptRequest, SshScript> generateSshScriptCallable() {
    return stub.generateSshScriptCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of all connection profiles in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (ConnectionProfile element :
   *       dataMigrationServiceClient.listConnectionProfiles(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent which owns this collection of connection profiles.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListConnectionProfilesPagedResponse listConnectionProfiles(LocationName parent) {
    ListConnectionProfilesRequest request =
        ListConnectionProfilesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listConnectionProfiles(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of all connection profiles in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (ConnectionProfile element :
   *       dataMigrationServiceClient.listConnectionProfiles(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent which owns this collection of connection profiles.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListConnectionProfilesPagedResponse listConnectionProfiles(String parent) {
    ListConnectionProfilesRequest request =
        ListConnectionProfilesRequest.newBuilder().setParent(parent).build();
    return listConnectionProfiles(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of all connection profiles in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ListConnectionProfilesRequest request =
   *       ListConnectionProfilesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (ConnectionProfile element :
   *       dataMigrationServiceClient.listConnectionProfiles(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListConnectionProfilesPagedResponse listConnectionProfiles(
      ListConnectionProfilesRequest request) {
    return listConnectionProfilesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of all connection profiles in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ListConnectionProfilesRequest request =
   *       ListConnectionProfilesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<ConnectionProfile> future =
   *       dataMigrationServiceClient.listConnectionProfilesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (ConnectionProfile element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListConnectionProfilesRequest, ListConnectionProfilesPagedResponse>
      listConnectionProfilesPagedCallable() {
    return stub.listConnectionProfilesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of all connection profiles in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ListConnectionProfilesRequest request =
   *       ListConnectionProfilesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     ListConnectionProfilesResponse response =
   *         dataMigrationServiceClient.listConnectionProfilesCallable().call(request);
   *     for (ConnectionProfile element : response.getConnectionProfilesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListConnectionProfilesRequest, ListConnectionProfilesResponse>
      listConnectionProfilesCallable() {
    return stub.listConnectionProfilesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single connection profile.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ConnectionProfileName name =
   *       ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]");
   *   ConnectionProfile response = dataMigrationServiceClient.getConnectionProfile(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the connection profile resource to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConnectionProfile getConnectionProfile(ConnectionProfileName name) {
    GetConnectionProfileRequest request =
        GetConnectionProfileRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getConnectionProfile(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single connection profile.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String name =
   *       ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]").toString();
   *   ConnectionProfile response = dataMigrationServiceClient.getConnectionProfile(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the connection profile resource to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConnectionProfile getConnectionProfile(String name) {
    GetConnectionProfileRequest request =
        GetConnectionProfileRequest.newBuilder().setName(name).build();
    return getConnectionProfile(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single connection profile.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   GetConnectionProfileRequest request =
   *       GetConnectionProfileRequest.newBuilder()
   *           .setName(
   *               ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]")
   *                   .toString())
   *           .build();
   *   ConnectionProfile response = dataMigrationServiceClient.getConnectionProfile(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConnectionProfile getConnectionProfile(GetConnectionProfileRequest request) {
    return getConnectionProfileCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single connection profile.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   GetConnectionProfileRequest request =
   *       GetConnectionProfileRequest.newBuilder()
   *           .setName(
   *               ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<ConnectionProfile> future =
   *       dataMigrationServiceClient.getConnectionProfileCallable().futureCall(request);
   *   // Do something.
   *   ConnectionProfile response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetConnectionProfileRequest, ConnectionProfile>
      getConnectionProfileCallable() {
    return stub.getConnectionProfileCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new connection profile in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ConnectionProfileName parent =
   *       ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]");
   *   ConnectionProfile connectionProfile = ConnectionProfile.newBuilder().build();
   *   String connectionProfileId = "connectionProfileId597575526";
   *   ConnectionProfile response =
   *       dataMigrationServiceClient
   *           .createConnectionProfileAsync(parent, connectionProfile, connectionProfileId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent which owns this collection of connection profiles.
   * @param connectionProfile Required. The create request body including the connection profile
   *     data
   * @param connectionProfileId Required. The connection profile identifier.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConnectionProfile, OperationMetadata> createConnectionProfileAsync(
      ConnectionProfileName parent,
      ConnectionProfile connectionProfile,
      String connectionProfileId) {
    CreateConnectionProfileRequest request =
        CreateConnectionProfileRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setConnectionProfile(connectionProfile)
            .setConnectionProfileId(connectionProfileId)
            .build();
    return createConnectionProfileAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new connection profile in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String parent =
   *       ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]").toString();
   *   ConnectionProfile connectionProfile = ConnectionProfile.newBuilder().build();
   *   String connectionProfileId = "connectionProfileId597575526";
   *   ConnectionProfile response =
   *       dataMigrationServiceClient
   *           .createConnectionProfileAsync(parent, connectionProfile, connectionProfileId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent which owns this collection of connection profiles.
   * @param connectionProfile Required. The create request body including the connection profile
   *     data
   * @param connectionProfileId Required. The connection profile identifier.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConnectionProfile, OperationMetadata> createConnectionProfileAsync(
      String parent, ConnectionProfile connectionProfile, String connectionProfileId) {
    CreateConnectionProfileRequest request =
        CreateConnectionProfileRequest.newBuilder()
            .setParent(parent)
            .setConnectionProfile(connectionProfile)
            .setConnectionProfileId(connectionProfileId)
            .build();
    return createConnectionProfileAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new connection profile in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CreateConnectionProfileRequest request =
   *       CreateConnectionProfileRequest.newBuilder()
   *           .setParent(
   *               ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]")
   *                   .toString())
   *           .setConnectionProfileId("connectionProfileId597575526")
   *           .setConnectionProfile(ConnectionProfile.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .setValidateOnly(true)
   *           .setSkipValidation(true)
   *           .build();
   *   ConnectionProfile response =
   *       dataMigrationServiceClient.createConnectionProfileAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConnectionProfile, OperationMetadata> createConnectionProfileAsync(
      CreateConnectionProfileRequest request) {
    return createConnectionProfileOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new connection profile in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CreateConnectionProfileRequest request =
   *       CreateConnectionProfileRequest.newBuilder()
   *           .setParent(
   *               ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]")
   *                   .toString())
   *           .setConnectionProfileId("connectionProfileId597575526")
   *           .setConnectionProfile(ConnectionProfile.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .setValidateOnly(true)
   *           .setSkipValidation(true)
   *           .build();
   *   OperationFuture<ConnectionProfile, OperationMetadata> future =
   *       dataMigrationServiceClient.createConnectionProfileOperationCallable().futureCall(request);
   *   // Do something.
   *   ConnectionProfile response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CreateConnectionProfileRequest, ConnectionProfile, OperationMetadata>
      createConnectionProfileOperationCallable() {
    return stub.createConnectionProfileOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new connection profile in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CreateConnectionProfileRequest request =
   *       CreateConnectionProfileRequest.newBuilder()
   *           .setParent(
   *               ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]")
   *                   .toString())
   *           .setConnectionProfileId("connectionProfileId597575526")
   *           .setConnectionProfile(ConnectionProfile.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .setValidateOnly(true)
   *           .setSkipValidation(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.createConnectionProfileCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateConnectionProfileRequest, Operation>
      createConnectionProfileCallable() {
    return stub.createConnectionProfileCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update the configuration of a single connection profile.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ConnectionProfile connectionProfile = ConnectionProfile.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   ConnectionProfile response =
   *       dataMigrationServiceClient
   *           .updateConnectionProfileAsync(connectionProfile, updateMask)
   *           .get();
   * }
   * }</pre>
   *
   * @param connectionProfile Required. The connection profile parameters to update.
   * @param updateMask Required. Field mask is used to specify the fields to be overwritten by the
   *     update in the conversion workspace resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConnectionProfile, OperationMetadata> updateConnectionProfileAsync(
      ConnectionProfile connectionProfile, FieldMask updateMask) {
    UpdateConnectionProfileRequest request =
        UpdateConnectionProfileRequest.newBuilder()
            .setConnectionProfile(connectionProfile)
            .setUpdateMask(updateMask)
            .build();
    return updateConnectionProfileAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update the configuration of a single connection profile.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   UpdateConnectionProfileRequest request =
   *       UpdateConnectionProfileRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setConnectionProfile(ConnectionProfile.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .setValidateOnly(true)
   *           .setSkipValidation(true)
   *           .build();
   *   ConnectionProfile response =
   *       dataMigrationServiceClient.updateConnectionProfileAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConnectionProfile, OperationMetadata> updateConnectionProfileAsync(
      UpdateConnectionProfileRequest request) {
    return updateConnectionProfileOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update the configuration of a single connection profile.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   UpdateConnectionProfileRequest request =
   *       UpdateConnectionProfileRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setConnectionProfile(ConnectionProfile.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .setValidateOnly(true)
   *           .setSkipValidation(true)
   *           .build();
   *   OperationFuture<ConnectionProfile, OperationMetadata> future =
   *       dataMigrationServiceClient.updateConnectionProfileOperationCallable().futureCall(request);
   *   // Do something.
   *   ConnectionProfile response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          UpdateConnectionProfileRequest, ConnectionProfile, OperationMetadata>
      updateConnectionProfileOperationCallable() {
    return stub.updateConnectionProfileOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update the configuration of a single connection profile.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   UpdateConnectionProfileRequest request =
   *       UpdateConnectionProfileRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setConnectionProfile(ConnectionProfile.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .setValidateOnly(true)
   *           .setSkipValidation(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.updateConnectionProfileCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateConnectionProfileRequest, Operation>
      updateConnectionProfileCallable() {
    return stub.updateConnectionProfileCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Database Migration Service connection profile. A connection profile can only
   * be deleted if it is not in use by any active migration jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ConnectionProfileName name =
   *       ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]");
   *   dataMigrationServiceClient.deleteConnectionProfileAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Name of the connection profile resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteConnectionProfileAsync(
      ConnectionProfileName name) {
    DeleteConnectionProfileRequest request =
        DeleteConnectionProfileRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteConnectionProfileAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Database Migration Service connection profile. A connection profile can only
   * be deleted if it is not in use by any active migration jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String name =
   *       ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]").toString();
   *   dataMigrationServiceClient.deleteConnectionProfileAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Name of the connection profile resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteConnectionProfileAsync(String name) {
    DeleteConnectionProfileRequest request =
        DeleteConnectionProfileRequest.newBuilder().setName(name).build();
    return deleteConnectionProfileAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Database Migration Service connection profile. A connection profile can only
   * be deleted if it is not in use by any active migration jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DeleteConnectionProfileRequest request =
   *       DeleteConnectionProfileRequest.newBuilder()
   *           .setName(
   *               ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]")
   *                   .toString())
   *           .setRequestId("requestId693933066")
   *           .setForce(true)
   *           .build();
   *   dataMigrationServiceClient.deleteConnectionProfileAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteConnectionProfileAsync(
      DeleteConnectionProfileRequest request) {
    return deleteConnectionProfileOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Database Migration Service connection profile. A connection profile can only
   * be deleted if it is not in use by any active migration jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DeleteConnectionProfileRequest request =
   *       DeleteConnectionProfileRequest.newBuilder()
   *           .setName(
   *               ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]")
   *                   .toString())
   *           .setRequestId("requestId693933066")
   *           .setForce(true)
   *           .build();
   *   OperationFuture<Empty, OperationMetadata> future =
   *       dataMigrationServiceClient.deleteConnectionProfileOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteConnectionProfileRequest, Empty, OperationMetadata>
      deleteConnectionProfileOperationCallable() {
    return stub.deleteConnectionProfileOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Database Migration Service connection profile. A connection profile can only
   * be deleted if it is not in use by any active migration jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DeleteConnectionProfileRequest request =
   *       DeleteConnectionProfileRequest.newBuilder()
   *           .setName(
   *               ConnectionProfileName.of("[PROJECT]", "[LOCATION]", "[CONNECTION_PROFILE]")
   *                   .toString())
   *           .setRequestId("requestId693933066")
   *           .setForce(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.deleteConnectionProfileCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteConnectionProfileRequest, Operation>
      deleteConnectionProfileCallable() {
    return stub.deleteConnectionProfileCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new private connection in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   PrivateConnection privateConnection = PrivateConnection.newBuilder().build();
   *   String privateConnectionId = "privateConnectionId-1926654532";
   *   PrivateConnection response =
   *       dataMigrationServiceClient
   *           .createPrivateConnectionAsync(parent, privateConnection, privateConnectionId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent that owns the collection of PrivateConnections.
   * @param privateConnection Required. The private connection resource to create.
   * @param privateConnectionId Required. The private connection identifier.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<PrivateConnection, OperationMetadata> createPrivateConnectionAsync(
      LocationName parent, PrivateConnection privateConnection, String privateConnectionId) {
    CreatePrivateConnectionRequest request =
        CreatePrivateConnectionRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setPrivateConnection(privateConnection)
            .setPrivateConnectionId(privateConnectionId)
            .build();
    return createPrivateConnectionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new private connection in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   PrivateConnection privateConnection = PrivateConnection.newBuilder().build();
   *   String privateConnectionId = "privateConnectionId-1926654532";
   *   PrivateConnection response =
   *       dataMigrationServiceClient
   *           .createPrivateConnectionAsync(parent, privateConnection, privateConnectionId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent that owns the collection of PrivateConnections.
   * @param privateConnection Required. The private connection resource to create.
   * @param privateConnectionId Required. The private connection identifier.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<PrivateConnection, OperationMetadata> createPrivateConnectionAsync(
      String parent, PrivateConnection privateConnection, String privateConnectionId) {
    CreatePrivateConnectionRequest request =
        CreatePrivateConnectionRequest.newBuilder()
            .setParent(parent)
            .setPrivateConnection(privateConnection)
            .setPrivateConnectionId(privateConnectionId)
            .build();
    return createPrivateConnectionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new private connection in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CreatePrivateConnectionRequest request =
   *       CreatePrivateConnectionRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPrivateConnectionId("privateConnectionId-1926654532")
   *           .setPrivateConnection(PrivateConnection.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .setSkipValidation(true)
   *           .build();
   *   PrivateConnection response =
   *       dataMigrationServiceClient.createPrivateConnectionAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<PrivateConnection, OperationMetadata> createPrivateConnectionAsync(
      CreatePrivateConnectionRequest request) {
    return createPrivateConnectionOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new private connection in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CreatePrivateConnectionRequest request =
   *       CreatePrivateConnectionRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPrivateConnectionId("privateConnectionId-1926654532")
   *           .setPrivateConnection(PrivateConnection.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .setSkipValidation(true)
   *           .build();
   *   OperationFuture<PrivateConnection, OperationMetadata> future =
   *       dataMigrationServiceClient.createPrivateConnectionOperationCallable().futureCall(request);
   *   // Do something.
   *   PrivateConnection response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CreatePrivateConnectionRequest, PrivateConnection, OperationMetadata>
      createPrivateConnectionOperationCallable() {
    return stub.createPrivateConnectionOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new private connection in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CreatePrivateConnectionRequest request =
   *       CreatePrivateConnectionRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPrivateConnectionId("privateConnectionId-1926654532")
   *           .setPrivateConnection(PrivateConnection.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .setSkipValidation(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.createPrivateConnectionCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreatePrivateConnectionRequest, Operation>
      createPrivateConnectionCallable() {
    return stub.createPrivateConnectionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single private connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   PrivateConnectionName name =
   *       PrivateConnectionName.of("[PROJECT]", "[LOCATION]", "[PRIVATE_CONNECTION]");
   *   PrivateConnection response = dataMigrationServiceClient.getPrivateConnection(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the private connection to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PrivateConnection getPrivateConnection(PrivateConnectionName name) {
    GetPrivateConnectionRequest request =
        GetPrivateConnectionRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getPrivateConnection(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single private connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String name =
   *       PrivateConnectionName.of("[PROJECT]", "[LOCATION]", "[PRIVATE_CONNECTION]").toString();
   *   PrivateConnection response = dataMigrationServiceClient.getPrivateConnection(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the private connection to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PrivateConnection getPrivateConnection(String name) {
    GetPrivateConnectionRequest request =
        GetPrivateConnectionRequest.newBuilder().setName(name).build();
    return getPrivateConnection(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single private connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   GetPrivateConnectionRequest request =
   *       GetPrivateConnectionRequest.newBuilder()
   *           .setName(
   *               PrivateConnectionName.of("[PROJECT]", "[LOCATION]", "[PRIVATE_CONNECTION]")
   *                   .toString())
   *           .build();
   *   PrivateConnection response = dataMigrationServiceClient.getPrivateConnection(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PrivateConnection getPrivateConnection(GetPrivateConnectionRequest request) {
    return getPrivateConnectionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single private connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   GetPrivateConnectionRequest request =
   *       GetPrivateConnectionRequest.newBuilder()
   *           .setName(
   *               PrivateConnectionName.of("[PROJECT]", "[LOCATION]", "[PRIVATE_CONNECTION]")
   *                   .toString())
   *           .build();
   *   ApiFuture<PrivateConnection> future =
   *       dataMigrationServiceClient.getPrivateConnectionCallable().futureCall(request);
   *   // Do something.
   *   PrivateConnection response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetPrivateConnectionRequest, PrivateConnection>
      getPrivateConnectionCallable() {
    return stub.getPrivateConnectionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of private connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (PrivateConnection element :
   *       dataMigrationServiceClient.listPrivateConnections(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent that owns the collection of private connections.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPrivateConnectionsPagedResponse listPrivateConnections(LocationName parent) {
    ListPrivateConnectionsRequest request =
        ListPrivateConnectionsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listPrivateConnections(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of private connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (PrivateConnection element :
   *       dataMigrationServiceClient.listPrivateConnections(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent that owns the collection of private connections.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPrivateConnectionsPagedResponse listPrivateConnections(String parent) {
    ListPrivateConnectionsRequest request =
        ListPrivateConnectionsRequest.newBuilder().setParent(parent).build();
    return listPrivateConnections(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of private connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ListPrivateConnectionsRequest request =
   *       ListPrivateConnectionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (PrivateConnection element :
   *       dataMigrationServiceClient.listPrivateConnections(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPrivateConnectionsPagedResponse listPrivateConnections(
      ListPrivateConnectionsRequest request) {
    return listPrivateConnectionsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of private connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ListPrivateConnectionsRequest request =
   *       ListPrivateConnectionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<PrivateConnection> future =
   *       dataMigrationServiceClient.listPrivateConnectionsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (PrivateConnection element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListPrivateConnectionsRequest, ListPrivateConnectionsPagedResponse>
      listPrivateConnectionsPagedCallable() {
    return stub.listPrivateConnectionsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of private connections in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ListPrivateConnectionsRequest request =
   *       ListPrivateConnectionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     ListPrivateConnectionsResponse response =
   *         dataMigrationServiceClient.listPrivateConnectionsCallable().call(request);
   *     for (PrivateConnection element : response.getPrivateConnectionsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListPrivateConnectionsRequest, ListPrivateConnectionsResponse>
      listPrivateConnectionsCallable() {
    return stub.listPrivateConnectionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Database Migration Service private connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   PrivateConnectionName name =
   *       PrivateConnectionName.of("[PROJECT]", "[LOCATION]", "[PRIVATE_CONNECTION]");
   *   dataMigrationServiceClient.deletePrivateConnectionAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the private connection to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deletePrivateConnectionAsync(
      PrivateConnectionName name) {
    DeletePrivateConnectionRequest request =
        DeletePrivateConnectionRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deletePrivateConnectionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Database Migration Service private connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String name =
   *       PrivateConnectionName.of("[PROJECT]", "[LOCATION]", "[PRIVATE_CONNECTION]").toString();
   *   dataMigrationServiceClient.deletePrivateConnectionAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the private connection to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deletePrivateConnectionAsync(String name) {
    DeletePrivateConnectionRequest request =
        DeletePrivateConnectionRequest.newBuilder().setName(name).build();
    return deletePrivateConnectionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Database Migration Service private connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DeletePrivateConnectionRequest request =
   *       DeletePrivateConnectionRequest.newBuilder()
   *           .setName(
   *               PrivateConnectionName.of("[PROJECT]", "[LOCATION]", "[PRIVATE_CONNECTION]")
   *                   .toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   dataMigrationServiceClient.deletePrivateConnectionAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deletePrivateConnectionAsync(
      DeletePrivateConnectionRequest request) {
    return deletePrivateConnectionOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Database Migration Service private connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DeletePrivateConnectionRequest request =
   *       DeletePrivateConnectionRequest.newBuilder()
   *           .setName(
   *               PrivateConnectionName.of("[PROJECT]", "[LOCATION]", "[PRIVATE_CONNECTION]")
   *                   .toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Empty, OperationMetadata> future =
   *       dataMigrationServiceClient.deletePrivateConnectionOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeletePrivateConnectionRequest, Empty, OperationMetadata>
      deletePrivateConnectionOperationCallable() {
    return stub.deletePrivateConnectionOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Database Migration Service private connection.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DeletePrivateConnectionRequest request =
   *       DeletePrivateConnectionRequest.newBuilder()
   *           .setName(
   *               PrivateConnectionName.of("[PROJECT]", "[LOCATION]", "[PRIVATE_CONNECTION]")
   *                   .toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.deletePrivateConnectionCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeletePrivateConnectionRequest, Operation>
      deletePrivateConnectionCallable() {
    return stub.deletePrivateConnectionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ConversionWorkspaceName name =
   *       ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]");
   *   ConversionWorkspace response = dataMigrationServiceClient.getConversionWorkspace(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the conversion workspace resource to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConversionWorkspace getConversionWorkspace(ConversionWorkspaceName name) {
    GetConversionWorkspaceRequest request =
        GetConversionWorkspaceRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getConversionWorkspace(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String name =
   *       ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *           .toString();
   *   ConversionWorkspace response = dataMigrationServiceClient.getConversionWorkspace(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the conversion workspace resource to get.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConversionWorkspace getConversionWorkspace(String name) {
    GetConversionWorkspaceRequest request =
        GetConversionWorkspaceRequest.newBuilder().setName(name).build();
    return getConversionWorkspace(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   GetConversionWorkspaceRequest request =
   *       GetConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .build();
   *   ConversionWorkspace response = dataMigrationServiceClient.getConversionWorkspace(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ConversionWorkspace getConversionWorkspace(GetConversionWorkspaceRequest request) {
    return getConversionWorkspaceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   GetConversionWorkspaceRequest request =
   *       GetConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<ConversionWorkspace> future =
   *       dataMigrationServiceClient.getConversionWorkspaceCallable().futureCall(request);
   *   // Do something.
   *   ConversionWorkspace response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetConversionWorkspaceRequest, ConversionWorkspace>
      getConversionWorkspaceCallable() {
    return stub.getConversionWorkspaceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists conversion workspaces in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (ConversionWorkspace element :
   *       dataMigrationServiceClient.listConversionWorkspaces(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent which owns this collection of conversion workspaces.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListConversionWorkspacesPagedResponse listConversionWorkspaces(LocationName parent) {
    ListConversionWorkspacesRequest request =
        ListConversionWorkspacesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listConversionWorkspaces(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists conversion workspaces in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (ConversionWorkspace element :
   *       dataMigrationServiceClient.listConversionWorkspaces(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent which owns this collection of conversion workspaces.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListConversionWorkspacesPagedResponse listConversionWorkspaces(String parent) {
    ListConversionWorkspacesRequest request =
        ListConversionWorkspacesRequest.newBuilder().setParent(parent).build();
    return listConversionWorkspaces(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists conversion workspaces in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ListConversionWorkspacesRequest request =
   *       ListConversionWorkspacesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   for (ConversionWorkspace element :
   *       dataMigrationServiceClient.listConversionWorkspaces(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListConversionWorkspacesPagedResponse listConversionWorkspaces(
      ListConversionWorkspacesRequest request) {
    return listConversionWorkspacesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists conversion workspaces in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ListConversionWorkspacesRequest request =
   *       ListConversionWorkspacesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   ApiFuture<ConversionWorkspace> future =
   *       dataMigrationServiceClient.listConversionWorkspacesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (ConversionWorkspace element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListConversionWorkspacesRequest, ListConversionWorkspacesPagedResponse>
      listConversionWorkspacesPagedCallable() {
    return stub.listConversionWorkspacesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists conversion workspaces in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ListConversionWorkspacesRequest request =
   *       ListConversionWorkspacesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   while (true) {
   *     ListConversionWorkspacesResponse response =
   *         dataMigrationServiceClient.listConversionWorkspacesCallable().call(request);
   *     for (ConversionWorkspace element : response.getConversionWorkspacesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListConversionWorkspacesRequest, ListConversionWorkspacesResponse>
      listConversionWorkspacesCallable() {
    return stub.listConversionWorkspacesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new conversion workspace in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   ConversionWorkspace conversionWorkspace = ConversionWorkspace.newBuilder().build();
   *   String conversionWorkspaceId = "conversionWorkspaceId-928604774";
   *   ConversionWorkspace response =
   *       dataMigrationServiceClient
   *           .createConversionWorkspaceAsync(parent, conversionWorkspace, conversionWorkspaceId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent which owns this collection of conversion workspaces.
   * @param conversionWorkspace Required. Represents a conversion workspace object.
   * @param conversionWorkspaceId Required. The ID of the conversion workspace to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConversionWorkspace, OperationMetadata>
      createConversionWorkspaceAsync(
          LocationName parent,
          ConversionWorkspace conversionWorkspace,
          String conversionWorkspaceId) {
    CreateConversionWorkspaceRequest request =
        CreateConversionWorkspaceRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setConversionWorkspace(conversionWorkspace)
            .setConversionWorkspaceId(conversionWorkspaceId)
            .build();
    return createConversionWorkspaceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new conversion workspace in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   ConversionWorkspace conversionWorkspace = ConversionWorkspace.newBuilder().build();
   *   String conversionWorkspaceId = "conversionWorkspaceId-928604774";
   *   ConversionWorkspace response =
   *       dataMigrationServiceClient
   *           .createConversionWorkspaceAsync(parent, conversionWorkspace, conversionWorkspaceId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent which owns this collection of conversion workspaces.
   * @param conversionWorkspace Required. Represents a conversion workspace object.
   * @param conversionWorkspaceId Required. The ID of the conversion workspace to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConversionWorkspace, OperationMetadata>
      createConversionWorkspaceAsync(
          String parent, ConversionWorkspace conversionWorkspace, String conversionWorkspaceId) {
    CreateConversionWorkspaceRequest request =
        CreateConversionWorkspaceRequest.newBuilder()
            .setParent(parent)
            .setConversionWorkspace(conversionWorkspace)
            .setConversionWorkspaceId(conversionWorkspaceId)
            .build();
    return createConversionWorkspaceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new conversion workspace in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CreateConversionWorkspaceRequest request =
   *       CreateConversionWorkspaceRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setConversionWorkspaceId("conversionWorkspaceId-928604774")
   *           .setConversionWorkspace(ConversionWorkspace.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ConversionWorkspace response =
   *       dataMigrationServiceClient.createConversionWorkspaceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConversionWorkspace, OperationMetadata>
      createConversionWorkspaceAsync(CreateConversionWorkspaceRequest request) {
    return createConversionWorkspaceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new conversion workspace in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CreateConversionWorkspaceRequest request =
   *       CreateConversionWorkspaceRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setConversionWorkspaceId("conversionWorkspaceId-928604774")
   *           .setConversionWorkspace(ConversionWorkspace.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<ConversionWorkspace, OperationMetadata> future =
   *       dataMigrationServiceClient
   *           .createConversionWorkspaceOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   ConversionWorkspace response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CreateConversionWorkspaceRequest, ConversionWorkspace, OperationMetadata>
      createConversionWorkspaceOperationCallable() {
    return stub.createConversionWorkspaceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new conversion workspace in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CreateConversionWorkspaceRequest request =
   *       CreateConversionWorkspaceRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setConversionWorkspaceId("conversionWorkspaceId-928604774")
   *           .setConversionWorkspace(ConversionWorkspace.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.createConversionWorkspaceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateConversionWorkspaceRequest, Operation>
      createConversionWorkspaceCallable() {
    return stub.createConversionWorkspaceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ConversionWorkspace conversionWorkspace = ConversionWorkspace.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   ConversionWorkspace response =
   *       dataMigrationServiceClient
   *           .updateConversionWorkspaceAsync(conversionWorkspace, updateMask)
   *           .get();
   * }
   * }</pre>
   *
   * @param conversionWorkspace Required. The conversion workspace parameters to update.
   * @param updateMask Required. Field mask is used to specify the fields to be overwritten by the
   *     update in the conversion workspace resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConversionWorkspace, OperationMetadata>
      updateConversionWorkspaceAsync(
          ConversionWorkspace conversionWorkspace, FieldMask updateMask) {
    UpdateConversionWorkspaceRequest request =
        UpdateConversionWorkspaceRequest.newBuilder()
            .setConversionWorkspace(conversionWorkspace)
            .setUpdateMask(updateMask)
            .build();
    return updateConversionWorkspaceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   UpdateConversionWorkspaceRequest request =
   *       UpdateConversionWorkspaceRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setConversionWorkspace(ConversionWorkspace.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ConversionWorkspace response =
   *       dataMigrationServiceClient.updateConversionWorkspaceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConversionWorkspace, OperationMetadata>
      updateConversionWorkspaceAsync(UpdateConversionWorkspaceRequest request) {
    return updateConversionWorkspaceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   UpdateConversionWorkspaceRequest request =
   *       UpdateConversionWorkspaceRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setConversionWorkspace(ConversionWorkspace.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<ConversionWorkspace, OperationMetadata> future =
   *       dataMigrationServiceClient
   *           .updateConversionWorkspaceOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   ConversionWorkspace response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          UpdateConversionWorkspaceRequest, ConversionWorkspace, OperationMetadata>
      updateConversionWorkspaceOperationCallable() {
    return stub.updateConversionWorkspaceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the parameters of a single conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   UpdateConversionWorkspaceRequest request =
   *       UpdateConversionWorkspaceRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setConversionWorkspace(ConversionWorkspace.newBuilder().build())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.updateConversionWorkspaceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateConversionWorkspaceRequest, Operation>
      updateConversionWorkspaceCallable() {
    return stub.updateConversionWorkspaceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ConversionWorkspaceName name =
   *       ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]");
   *   dataMigrationServiceClient.deleteConversionWorkspaceAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Name of the conversion workspace resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteConversionWorkspaceAsync(
      ConversionWorkspaceName name) {
    DeleteConversionWorkspaceRequest request =
        DeleteConversionWorkspaceRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteConversionWorkspaceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String name =
   *       ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *           .toString();
   *   dataMigrationServiceClient.deleteConversionWorkspaceAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Name of the conversion workspace resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteConversionWorkspaceAsync(
      String name) {
    DeleteConversionWorkspaceRequest request =
        DeleteConversionWorkspaceRequest.newBuilder().setName(name).build();
    return deleteConversionWorkspaceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DeleteConversionWorkspaceRequest request =
   *       DeleteConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   dataMigrationServiceClient.deleteConversionWorkspaceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteConversionWorkspaceAsync(
      DeleteConversionWorkspaceRequest request) {
    return deleteConversionWorkspaceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DeleteConversionWorkspaceRequest request =
   *       DeleteConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Empty, OperationMetadata> future =
   *       dataMigrationServiceClient
   *           .deleteConversionWorkspaceOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteConversionWorkspaceRequest, Empty, OperationMetadata>
      deleteConversionWorkspaceOperationCallable() {
    return stub.deleteConversionWorkspaceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DeleteConversionWorkspaceRequest request =
   *       DeleteConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.deleteConversionWorkspaceCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteConversionWorkspaceRequest, Operation>
      deleteConversionWorkspaceCallable() {
    return stub.deleteConversionWorkspaceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Imports a snapshot of the source database into the conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   SeedConversionWorkspaceRequest request =
   *       SeedConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setAutoCommit(true)
   *           .build();
   *   ConversionWorkspace response =
   *       dataMigrationServiceClient.seedConversionWorkspaceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConversionWorkspace, OperationMetadata> seedConversionWorkspaceAsync(
      SeedConversionWorkspaceRequest request) {
    return seedConversionWorkspaceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Imports a snapshot of the source database into the conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   SeedConversionWorkspaceRequest request =
   *       SeedConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setAutoCommit(true)
   *           .build();
   *   OperationFuture<ConversionWorkspace, OperationMetadata> future =
   *       dataMigrationServiceClient.seedConversionWorkspaceOperationCallable().futureCall(request);
   *   // Do something.
   *   ConversionWorkspace response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          SeedConversionWorkspaceRequest, ConversionWorkspace, OperationMetadata>
      seedConversionWorkspaceOperationCallable() {
    return stub.seedConversionWorkspaceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Imports a snapshot of the source database into the conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   SeedConversionWorkspaceRequest request =
   *       SeedConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setAutoCommit(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.seedConversionWorkspaceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SeedConversionWorkspaceRequest, Operation>
      seedConversionWorkspaceCallable() {
    return stub.seedConversionWorkspaceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Imports the mapping rules for a given conversion workspace. Supports various formats of
   * external rules files.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ImportMappingRulesRequest request =
   *       ImportMappingRulesRequest.newBuilder()
   *           .setParent(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setRulesFormat(ImportRulesFileFormat.forNumber(0))
   *           .addAllRulesFiles(new ArrayList<ImportMappingRulesRequest.RulesFile>())
   *           .setAutoCommit(true)
   *           .build();
   *   ConversionWorkspace response =
   *       dataMigrationServiceClient.importMappingRulesAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConversionWorkspace, OperationMetadata> importMappingRulesAsync(
      ImportMappingRulesRequest request) {
    return importMappingRulesOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Imports the mapping rules for a given conversion workspace. Supports various formats of
   * external rules files.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ImportMappingRulesRequest request =
   *       ImportMappingRulesRequest.newBuilder()
   *           .setParent(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setRulesFormat(ImportRulesFileFormat.forNumber(0))
   *           .addAllRulesFiles(new ArrayList<ImportMappingRulesRequest.RulesFile>())
   *           .setAutoCommit(true)
   *           .build();
   *   OperationFuture<ConversionWorkspace, OperationMetadata> future =
   *       dataMigrationServiceClient.importMappingRulesOperationCallable().futureCall(request);
   *   // Do something.
   *   ConversionWorkspace response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<ImportMappingRulesRequest, ConversionWorkspace, OperationMetadata>
      importMappingRulesOperationCallable() {
    return stub.importMappingRulesOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Imports the mapping rules for a given conversion workspace. Supports various formats of
   * external rules files.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ImportMappingRulesRequest request =
   *       ImportMappingRulesRequest.newBuilder()
   *           .setParent(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setRulesFormat(ImportRulesFileFormat.forNumber(0))
   *           .addAllRulesFiles(new ArrayList<ImportMappingRulesRequest.RulesFile>())
   *           .setAutoCommit(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.importMappingRulesCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ImportMappingRulesRequest, Operation> importMappingRulesCallable() {
    return stub.importMappingRulesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a draft tree schema for the destination database.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ConvertConversionWorkspaceRequest request =
   *       ConvertConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setAutoCommit(true)
   *           .setFilter("filter-1274492040")
   *           .build();
   *   ConversionWorkspace response =
   *       dataMigrationServiceClient.convertConversionWorkspaceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConversionWorkspace, OperationMetadata>
      convertConversionWorkspaceAsync(ConvertConversionWorkspaceRequest request) {
    return convertConversionWorkspaceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a draft tree schema for the destination database.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ConvertConversionWorkspaceRequest request =
   *       ConvertConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setAutoCommit(true)
   *           .setFilter("filter-1274492040")
   *           .build();
   *   OperationFuture<ConversionWorkspace, OperationMetadata> future =
   *       dataMigrationServiceClient
   *           .convertConversionWorkspaceOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   ConversionWorkspace response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          ConvertConversionWorkspaceRequest, ConversionWorkspace, OperationMetadata>
      convertConversionWorkspaceOperationCallable() {
    return stub.convertConversionWorkspaceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a draft tree schema for the destination database.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ConvertConversionWorkspaceRequest request =
   *       ConvertConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setAutoCommit(true)
   *           .setFilter("filter-1274492040")
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.convertConversionWorkspaceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ConvertConversionWorkspaceRequest, Operation>
      convertConversionWorkspaceCallable() {
    return stub.convertConversionWorkspaceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks all the data in the conversion workspace as committed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CommitConversionWorkspaceRequest request =
   *       CommitConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setCommitName("commitName1018078306")
   *           .build();
   *   ConversionWorkspace response =
   *       dataMigrationServiceClient.commitConversionWorkspaceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConversionWorkspace, OperationMetadata>
      commitConversionWorkspaceAsync(CommitConversionWorkspaceRequest request) {
    return commitConversionWorkspaceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks all the data in the conversion workspace as committed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CommitConversionWorkspaceRequest request =
   *       CommitConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setCommitName("commitName1018078306")
   *           .build();
   *   OperationFuture<ConversionWorkspace, OperationMetadata> future =
   *       dataMigrationServiceClient
   *           .commitConversionWorkspaceOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   ConversionWorkspace response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CommitConversionWorkspaceRequest, ConversionWorkspace, OperationMetadata>
      commitConversionWorkspaceOperationCallable() {
    return stub.commitConversionWorkspaceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks all the data in the conversion workspace as committed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   CommitConversionWorkspaceRequest request =
   *       CommitConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setCommitName("commitName1018078306")
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.commitConversionWorkspaceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CommitConversionWorkspaceRequest, Operation>
      commitConversionWorkspaceCallable() {
    return stub.commitConversionWorkspaceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Rolls back a conversion workspace to the last committed snapshot.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   RollbackConversionWorkspaceRequest request =
   *       RollbackConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .build();
   *   ConversionWorkspace response =
   *       dataMigrationServiceClient.rollbackConversionWorkspaceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConversionWorkspace, OperationMetadata>
      rollbackConversionWorkspaceAsync(RollbackConversionWorkspaceRequest request) {
    return rollbackConversionWorkspaceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Rolls back a conversion workspace to the last committed snapshot.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   RollbackConversionWorkspaceRequest request =
   *       RollbackConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .build();
   *   OperationFuture<ConversionWorkspace, OperationMetadata> future =
   *       dataMigrationServiceClient
   *           .rollbackConversionWorkspaceOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   ConversionWorkspace response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          RollbackConversionWorkspaceRequest, ConversionWorkspace, OperationMetadata>
      rollbackConversionWorkspaceOperationCallable() {
    return stub.rollbackConversionWorkspaceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Rolls back a conversion workspace to the last committed snapshot.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   RollbackConversionWorkspaceRequest request =
   *       RollbackConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.rollbackConversionWorkspaceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<RollbackConversionWorkspaceRequest, Operation>
      rollbackConversionWorkspaceCallable() {
    return stub.rollbackConversionWorkspaceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Applies draft tree onto a specific destination database.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ApplyConversionWorkspaceRequest request =
   *       ApplyConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .build();
   *   ConversionWorkspace response =
   *       dataMigrationServiceClient.applyConversionWorkspaceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<ConversionWorkspace, OperationMetadata>
      applyConversionWorkspaceAsync(ApplyConversionWorkspaceRequest request) {
    return applyConversionWorkspaceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Applies draft tree onto a specific destination database.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ApplyConversionWorkspaceRequest request =
   *       ApplyConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .build();
   *   OperationFuture<ConversionWorkspace, OperationMetadata> future =
   *       dataMigrationServiceClient
   *           .applyConversionWorkspaceOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   ConversionWorkspace response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          ApplyConversionWorkspaceRequest, ConversionWorkspace, OperationMetadata>
      applyConversionWorkspaceOperationCallable() {
    return stub.applyConversionWorkspaceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Applies draft tree onto a specific destination database.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   ApplyConversionWorkspaceRequest request =
   *       ApplyConversionWorkspaceRequest.newBuilder()
   *           .setName(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setFilter("filter-1274492040")
   *           .build();
   *   ApiFuture<Operation> future =
   *       dataMigrationServiceClient.applyConversionWorkspaceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ApplyConversionWorkspaceRequest, Operation>
      applyConversionWorkspaceCallable() {
    return stub.applyConversionWorkspaceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Describes the database entities tree for a specific conversion workspace and a specific tree
   * type.
   *
   * <p>Database entities are not resources like conversion workspaces or mapping rules, and they
   * can't be created, updated or deleted. Instead, they are simple data objects describing the
   * structure of the client database.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DescribeDatabaseEntitiesRequest request =
   *       DescribeDatabaseEntitiesRequest.newBuilder()
   *           .setConversionWorkspace(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setUncommitted(true)
   *           .setCommitId("commitId-602292046")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   for (DatabaseEntity element :
   *       dataMigrationServiceClient.describeDatabaseEntities(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DescribeDatabaseEntitiesPagedResponse describeDatabaseEntities(
      DescribeDatabaseEntitiesRequest request) {
    return describeDatabaseEntitiesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Describes the database entities tree for a specific conversion workspace and a specific tree
   * type.
   *
   * <p>Database entities are not resources like conversion workspaces or mapping rules, and they
   * can't be created, updated or deleted. Instead, they are simple data objects describing the
   * structure of the client database.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DescribeDatabaseEntitiesRequest request =
   *       DescribeDatabaseEntitiesRequest.newBuilder()
   *           .setConversionWorkspace(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setUncommitted(true)
   *           .setCommitId("commitId-602292046")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   ApiFuture<DatabaseEntity> future =
   *       dataMigrationServiceClient.describeDatabaseEntitiesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (DatabaseEntity element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<DescribeDatabaseEntitiesRequest, DescribeDatabaseEntitiesPagedResponse>
      describeDatabaseEntitiesPagedCallable() {
    return stub.describeDatabaseEntitiesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Describes the database entities tree for a specific conversion workspace and a specific tree
   * type.
   *
   * <p>Database entities are not resources like conversion workspaces or mapping rules, and they
   * can't be created, updated or deleted. Instead, they are simple data objects describing the
   * structure of the client database.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DescribeDatabaseEntitiesRequest request =
   *       DescribeDatabaseEntitiesRequest.newBuilder()
   *           .setConversionWorkspace(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setUncommitted(true)
   *           .setCommitId("commitId-602292046")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   while (true) {
   *     DescribeDatabaseEntitiesResponse response =
   *         dataMigrationServiceClient.describeDatabaseEntitiesCallable().call(request);
   *     for (DatabaseEntity element : response.getDatabaseEntitiesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<DescribeDatabaseEntitiesRequest, DescribeDatabaseEntitiesResponse>
      describeDatabaseEntitiesCallable() {
    return stub.describeDatabaseEntitiesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches/lists the background jobs for a specific conversion workspace.
   *
   * <p>The background jobs are not resources like conversion workspaces or mapping rules, and they
   * can't be created, updated or deleted. Instead, they are a way to expose the data plane jobs
   * log.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   SearchBackgroundJobsRequest request =
   *       SearchBackgroundJobsRequest.newBuilder()
   *           .setConversionWorkspace(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setReturnMostRecentPerJobType(true)
   *           .setMaxSize(408072700)
   *           .setCompletedUntilTime(Timestamp.newBuilder().build())
   *           .build();
   *   SearchBackgroundJobsResponse response =
   *       dataMigrationServiceClient.searchBackgroundJobs(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchBackgroundJobsResponse searchBackgroundJobs(
      SearchBackgroundJobsRequest request) {
    return searchBackgroundJobsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches/lists the background jobs for a specific conversion workspace.
   *
   * <p>The background jobs are not resources like conversion workspaces or mapping rules, and they
   * can't be created, updated or deleted. Instead, they are a way to expose the data plane jobs
   * log.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   SearchBackgroundJobsRequest request =
   *       SearchBackgroundJobsRequest.newBuilder()
   *           .setConversionWorkspace(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setReturnMostRecentPerJobType(true)
   *           .setMaxSize(408072700)
   *           .setCompletedUntilTime(Timestamp.newBuilder().build())
   *           .build();
   *   ApiFuture<SearchBackgroundJobsResponse> future =
   *       dataMigrationServiceClient.searchBackgroundJobsCallable().futureCall(request);
   *   // Do something.
   *   SearchBackgroundJobsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SearchBackgroundJobsRequest, SearchBackgroundJobsResponse>
      searchBackgroundJobsCallable() {
    return stub.searchBackgroundJobsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of committed revisions of a specific conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DescribeConversionWorkspaceRevisionsRequest request =
   *       DescribeConversionWorkspaceRevisionsRequest.newBuilder()
   *           .setConversionWorkspace(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setCommitId("commitId-602292046")
   *           .build();
   *   DescribeConversionWorkspaceRevisionsResponse response =
   *       dataMigrationServiceClient.describeConversionWorkspaceRevisions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DescribeConversionWorkspaceRevisionsResponse describeConversionWorkspaceRevisions(
      DescribeConversionWorkspaceRevisionsRequest request) {
    return describeConversionWorkspaceRevisionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of committed revisions of a specific conversion workspace.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   DescribeConversionWorkspaceRevisionsRequest request =
   *       DescribeConversionWorkspaceRevisionsRequest.newBuilder()
   *           .setConversionWorkspace(
   *               ConversionWorkspaceName.of("[PROJECT]", "[LOCATION]", "[CONVERSION_WORKSPACE]")
   *                   .toString())
   *           .setCommitId("commitId-602292046")
   *           .build();
   *   ApiFuture<DescribeConversionWorkspaceRevisionsResponse> future =
   *       dataMigrationServiceClient
   *           .describeConversionWorkspaceRevisionsCallable()
   *           .futureCall(request);
   *   // Do something.
   *   DescribeConversionWorkspaceRevisionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          DescribeConversionWorkspaceRevisionsRequest, DescribeConversionWorkspaceRevisionsResponse>
      describeConversionWorkspaceRevisionsCallable() {
    return stub.describeConversionWorkspaceRevisionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches a set of static IP addresses that need to be allowlisted by the customer when using the
   * static-IP connectivity method.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   LocationName name = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (String element : dataMigrationServiceClient.fetchStaticIps(name).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param name Required. The resource name for the location for which static IPs should be
   *     returned. Must be in the format `projects/&#42;/locations/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FetchStaticIpsPagedResponse fetchStaticIps(LocationName name) {
    FetchStaticIpsRequest request =
        FetchStaticIpsRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return fetchStaticIps(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches a set of static IP addresses that need to be allowlisted by the customer when using the
   * static-IP connectivity method.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   String name = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (String element : dataMigrationServiceClient.fetchStaticIps(name).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param name Required. The resource name for the location for which static IPs should be
   *     returned. Must be in the format `projects/&#42;/locations/&#42;`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FetchStaticIpsPagedResponse fetchStaticIps(String name) {
    FetchStaticIpsRequest request = FetchStaticIpsRequest.newBuilder().setName(name).build();
    return fetchStaticIps(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches a set of static IP addresses that need to be allowlisted by the customer when using the
   * static-IP connectivity method.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   FetchStaticIpsRequest request =
   *       FetchStaticIpsRequest.newBuilder()
   *           .setName(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (String element : dataMigrationServiceClient.fetchStaticIps(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FetchStaticIpsPagedResponse fetchStaticIps(FetchStaticIpsRequest request) {
    return fetchStaticIpsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches a set of static IP addresses that need to be allowlisted by the customer when using the
   * static-IP connectivity method.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   FetchStaticIpsRequest request =
   *       FetchStaticIpsRequest.newBuilder()
   *           .setName(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<String> future =
   *       dataMigrationServiceClient.fetchStaticIpsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (String element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<FetchStaticIpsRequest, FetchStaticIpsPagedResponse>
      fetchStaticIpsPagedCallable() {
    return stub.fetchStaticIpsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Fetches a set of static IP addresses that need to be allowlisted by the customer when using the
   * static-IP connectivity method.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataMigrationServiceClient dataMigrationServiceClient =
   *     DataMigrationServiceClient.create()) {
   *   FetchStaticIpsRequest request =
   *       FetchStaticIpsRequest.newBuilder()
   *           .setName(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     FetchStaticIpsResponse response =
   *         dataMigrationServiceClient.fetchStaticIpsCallable().call(request);
   *     for (String element : response.getStaticIpsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<FetchStaticIpsRequest, FetchStaticIpsResponse>
      fetchStaticIpsCallable() {
    return stub.fetchStaticIpsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListMigrationJobsPagedResponse
      extends AbstractPagedListResponse<
          ListMigrationJobsRequest,
          ListMigrationJobsResponse,
          MigrationJob,
          ListMigrationJobsPage,
          ListMigrationJobsFixedSizeCollection> {

    public static ApiFuture<ListMigrationJobsPagedResponse> createAsync(
        PageContext<ListMigrationJobsRequest, ListMigrationJobsResponse, MigrationJob> context,
        ApiFuture<ListMigrationJobsResponse> futureResponse) {
      ApiFuture<ListMigrationJobsPage> futurePage =
          ListMigrationJobsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListMigrationJobsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListMigrationJobsPagedResponse(ListMigrationJobsPage page) {
      super(page, ListMigrationJobsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListMigrationJobsPage
      extends AbstractPage<
          ListMigrationJobsRequest,
          ListMigrationJobsResponse,
          MigrationJob,
          ListMigrationJobsPage> {

    private ListMigrationJobsPage(
        PageContext<ListMigrationJobsRequest, ListMigrationJobsResponse, MigrationJob> context,
        ListMigrationJobsResponse response) {
      super(context, response);
    }

    private static ListMigrationJobsPage createEmptyPage() {
      return new ListMigrationJobsPage(null, null);
    }

    @Override
    protected ListMigrationJobsPage createPage(
        PageContext<ListMigrationJobsRequest, ListMigrationJobsResponse, MigrationJob> context,
        ListMigrationJobsResponse response) {
      return new ListMigrationJobsPage(context, response);
    }

    @Override
    public ApiFuture<ListMigrationJobsPage> createPageAsync(
        PageContext<ListMigrationJobsRequest, ListMigrationJobsResponse, MigrationJob> context,
        ApiFuture<ListMigrationJobsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListMigrationJobsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListMigrationJobsRequest,
          ListMigrationJobsResponse,
          MigrationJob,
          ListMigrationJobsPage,
          ListMigrationJobsFixedSizeCollection> {

    private ListMigrationJobsFixedSizeCollection(
        List<ListMigrationJobsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListMigrationJobsFixedSizeCollection createEmptyCollection() {
      return new ListMigrationJobsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListMigrationJobsFixedSizeCollection createCollection(
        List<ListMigrationJobsPage> pages, int collectionSize) {
      return new ListMigrationJobsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListConnectionProfilesPagedResponse
      extends AbstractPagedListResponse<
          ListConnectionProfilesRequest,
          ListConnectionProfilesResponse,
          ConnectionProfile,
          ListConnectionProfilesPage,
          ListConnectionProfilesFixedSizeCollection> {

    public static ApiFuture<ListConnectionProfilesPagedResponse> createAsync(
        PageContext<
                ListConnectionProfilesRequest, ListConnectionProfilesResponse, ConnectionProfile>
            context,
        ApiFuture<ListConnectionProfilesResponse> futureResponse) {
      ApiFuture<ListConnectionProfilesPage> futurePage =
          ListConnectionProfilesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListConnectionProfilesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListConnectionProfilesPagedResponse(ListConnectionProfilesPage page) {
      super(page, ListConnectionProfilesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListConnectionProfilesPage
      extends AbstractPage<
          ListConnectionProfilesRequest,
          ListConnectionProfilesResponse,
          ConnectionProfile,
          ListConnectionProfilesPage> {

    private ListConnectionProfilesPage(
        PageContext<
                ListConnectionProfilesRequest, ListConnectionProfilesResponse, ConnectionProfile>
            context,
        ListConnectionProfilesResponse response) {
      super(context, response);
    }

    private static ListConnectionProfilesPage createEmptyPage() {
      return new ListConnectionProfilesPage(null, null);
    }

    @Override
    protected ListConnectionProfilesPage createPage(
        PageContext<
                ListConnectionProfilesRequest, ListConnectionProfilesResponse, ConnectionProfile>
            context,
        ListConnectionProfilesResponse response) {
      return new ListConnectionProfilesPage(context, response);
    }

    @Override
    public ApiFuture<ListConnectionProfilesPage> createPageAsync(
        PageContext<
                ListConnectionProfilesRequest, ListConnectionProfilesResponse, ConnectionProfile>
            context,
        ApiFuture<ListConnectionProfilesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListConnectionProfilesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListConnectionProfilesRequest,
          ListConnectionProfilesResponse,
          ConnectionProfile,
          ListConnectionProfilesPage,
          ListConnectionProfilesFixedSizeCollection> {

    private ListConnectionProfilesFixedSizeCollection(
        List<ListConnectionProfilesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListConnectionProfilesFixedSizeCollection createEmptyCollection() {
      return new ListConnectionProfilesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListConnectionProfilesFixedSizeCollection createCollection(
        List<ListConnectionProfilesPage> pages, int collectionSize) {
      return new ListConnectionProfilesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListPrivateConnectionsPagedResponse
      extends AbstractPagedListResponse<
          ListPrivateConnectionsRequest,
          ListPrivateConnectionsResponse,
          PrivateConnection,
          ListPrivateConnectionsPage,
          ListPrivateConnectionsFixedSizeCollection> {

    public static ApiFuture<ListPrivateConnectionsPagedResponse> createAsync(
        PageContext<
                ListPrivateConnectionsRequest, ListPrivateConnectionsResponse, PrivateConnection>
            context,
        ApiFuture<ListPrivateConnectionsResponse> futureResponse) {
      ApiFuture<ListPrivateConnectionsPage> futurePage =
          ListPrivateConnectionsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListPrivateConnectionsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListPrivateConnectionsPagedResponse(ListPrivateConnectionsPage page) {
      super(page, ListPrivateConnectionsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListPrivateConnectionsPage
      extends AbstractPage<
          ListPrivateConnectionsRequest,
          ListPrivateConnectionsResponse,
          PrivateConnection,
          ListPrivateConnectionsPage> {

    private ListPrivateConnectionsPage(
        PageContext<
                ListPrivateConnectionsRequest, ListPrivateConnectionsResponse, PrivateConnection>
            context,
        ListPrivateConnectionsResponse response) {
      super(context, response);
    }

    private static ListPrivateConnectionsPage createEmptyPage() {
      return new ListPrivateConnectionsPage(null, null);
    }

    @Override
    protected ListPrivateConnectionsPage createPage(
        PageContext<
                ListPrivateConnectionsRequest, ListPrivateConnectionsResponse, PrivateConnection>
            context,
        ListPrivateConnectionsResponse response) {
      return new ListPrivateConnectionsPage(context, response);
    }

    @Override
    public ApiFuture<ListPrivateConnectionsPage> createPageAsync(
        PageContext<
                ListPrivateConnectionsRequest, ListPrivateConnectionsResponse, PrivateConnection>
            context,
        ApiFuture<ListPrivateConnectionsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListPrivateConnectionsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListPrivateConnectionsRequest,
          ListPrivateConnectionsResponse,
          PrivateConnection,
          ListPrivateConnectionsPage,
          ListPrivateConnectionsFixedSizeCollection> {

    private ListPrivateConnectionsFixedSizeCollection(
        List<ListPrivateConnectionsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListPrivateConnectionsFixedSizeCollection createEmptyCollection() {
      return new ListPrivateConnectionsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListPrivateConnectionsFixedSizeCollection createCollection(
        List<ListPrivateConnectionsPage> pages, int collectionSize) {
      return new ListPrivateConnectionsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListConversionWorkspacesPagedResponse
      extends AbstractPagedListResponse<
          ListConversionWorkspacesRequest,
          ListConversionWorkspacesResponse,
          ConversionWorkspace,
          ListConversionWorkspacesPage,
          ListConversionWorkspacesFixedSizeCollection> {

    public static ApiFuture<ListConversionWorkspacesPagedResponse> createAsync(
        PageContext<
                ListConversionWorkspacesRequest,
                ListConversionWorkspacesResponse,
                ConversionWorkspace>
            context,
        ApiFuture<ListConversionWorkspacesResponse> futureResponse) {
      ApiFuture<ListConversionWorkspacesPage> futurePage =
          ListConversionWorkspacesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListConversionWorkspacesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListConversionWorkspacesPagedResponse(ListConversionWorkspacesPage page) {
      super(page, ListConversionWorkspacesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListConversionWorkspacesPage
      extends AbstractPage<
          ListConversionWorkspacesRequest,
          ListConversionWorkspacesResponse,
          ConversionWorkspace,
          ListConversionWorkspacesPage> {

    private ListConversionWorkspacesPage(
        PageContext<
                ListConversionWorkspacesRequest,
                ListConversionWorkspacesResponse,
                ConversionWorkspace>
            context,
        ListConversionWorkspacesResponse response) {
      super(context, response);
    }

    private static ListConversionWorkspacesPage createEmptyPage() {
      return new ListConversionWorkspacesPage(null, null);
    }

    @Override
    protected ListConversionWorkspacesPage createPage(
        PageContext<
                ListConversionWorkspacesRequest,
                ListConversionWorkspacesResponse,
                ConversionWorkspace>
            context,
        ListConversionWorkspacesResponse response) {
      return new ListConversionWorkspacesPage(context, response);
    }

    @Override
    public ApiFuture<ListConversionWorkspacesPage> createPageAsync(
        PageContext<
                ListConversionWorkspacesRequest,
                ListConversionWorkspacesResponse,
                ConversionWorkspace>
            context,
        ApiFuture<ListConversionWorkspacesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListConversionWorkspacesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListConversionWorkspacesRequest,
          ListConversionWorkspacesResponse,
          ConversionWorkspace,
          ListConversionWorkspacesPage,
          ListConversionWorkspacesFixedSizeCollection> {

    private ListConversionWorkspacesFixedSizeCollection(
        List<ListConversionWorkspacesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListConversionWorkspacesFixedSizeCollection createEmptyCollection() {
      return new ListConversionWorkspacesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListConversionWorkspacesFixedSizeCollection createCollection(
        List<ListConversionWorkspacesPage> pages, int collectionSize) {
      return new ListConversionWorkspacesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class DescribeDatabaseEntitiesPagedResponse
      extends AbstractPagedListResponse<
          DescribeDatabaseEntitiesRequest,
          DescribeDatabaseEntitiesResponse,
          DatabaseEntity,
          DescribeDatabaseEntitiesPage,
          DescribeDatabaseEntitiesFixedSizeCollection> {

    public static ApiFuture<DescribeDatabaseEntitiesPagedResponse> createAsync(
        PageContext<
                DescribeDatabaseEntitiesRequest, DescribeDatabaseEntitiesResponse, DatabaseEntity>
            context,
        ApiFuture<DescribeDatabaseEntitiesResponse> futureResponse) {
      ApiFuture<DescribeDatabaseEntitiesPage> futurePage =
          DescribeDatabaseEntitiesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new DescribeDatabaseEntitiesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private DescribeDatabaseEntitiesPagedResponse(DescribeDatabaseEntitiesPage page) {
      super(page, DescribeDatabaseEntitiesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class DescribeDatabaseEntitiesPage
      extends AbstractPage<
          DescribeDatabaseEntitiesRequest,
          DescribeDatabaseEntitiesResponse,
          DatabaseEntity,
          DescribeDatabaseEntitiesPage> {

    private DescribeDatabaseEntitiesPage(
        PageContext<
                DescribeDatabaseEntitiesRequest, DescribeDatabaseEntitiesResponse, DatabaseEntity>
            context,
        DescribeDatabaseEntitiesResponse response) {
      super(context, response);
    }

    private static DescribeDatabaseEntitiesPage createEmptyPage() {
      return new DescribeDatabaseEntitiesPage(null, null);
    }

    @Override
    protected DescribeDatabaseEntitiesPage createPage(
        PageContext<
                DescribeDatabaseEntitiesRequest, DescribeDatabaseEntitiesResponse, DatabaseEntity>
            context,
        DescribeDatabaseEntitiesResponse response) {
      return new DescribeDatabaseEntitiesPage(context, response);
    }

    @Override
    public ApiFuture<DescribeDatabaseEntitiesPage> createPageAsync(
        PageContext<
                DescribeDatabaseEntitiesRequest, DescribeDatabaseEntitiesResponse, DatabaseEntity>
            context,
        ApiFuture<DescribeDatabaseEntitiesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class DescribeDatabaseEntitiesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          DescribeDatabaseEntitiesRequest,
          DescribeDatabaseEntitiesResponse,
          DatabaseEntity,
          DescribeDatabaseEntitiesPage,
          DescribeDatabaseEntitiesFixedSizeCollection> {

    private DescribeDatabaseEntitiesFixedSizeCollection(
        List<DescribeDatabaseEntitiesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static DescribeDatabaseEntitiesFixedSizeCollection createEmptyCollection() {
      return new DescribeDatabaseEntitiesFixedSizeCollection(null, 0);
    }

    @Override
    protected DescribeDatabaseEntitiesFixedSizeCollection createCollection(
        List<DescribeDatabaseEntitiesPage> pages, int collectionSize) {
      return new DescribeDatabaseEntitiesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class FetchStaticIpsPagedResponse
      extends AbstractPagedListResponse<
          FetchStaticIpsRequest,
          FetchStaticIpsResponse,
          String,
          FetchStaticIpsPage,
          FetchStaticIpsFixedSizeCollection> {

    public static ApiFuture<FetchStaticIpsPagedResponse> createAsync(
        PageContext<FetchStaticIpsRequest, FetchStaticIpsResponse, String> context,
        ApiFuture<FetchStaticIpsResponse> futureResponse) {
      ApiFuture<FetchStaticIpsPage> futurePage =
          FetchStaticIpsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new FetchStaticIpsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private FetchStaticIpsPagedResponse(FetchStaticIpsPage page) {
      super(page, FetchStaticIpsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class FetchStaticIpsPage
      extends AbstractPage<
          FetchStaticIpsRequest, FetchStaticIpsResponse, String, FetchStaticIpsPage> {

    private FetchStaticIpsPage(
        PageContext<FetchStaticIpsRequest, FetchStaticIpsResponse, String> context,
        FetchStaticIpsResponse response) {
      super(context, response);
    }

    private static FetchStaticIpsPage createEmptyPage() {
      return new FetchStaticIpsPage(null, null);
    }

    @Override
    protected FetchStaticIpsPage createPage(
        PageContext<FetchStaticIpsRequest, FetchStaticIpsResponse, String> context,
        FetchStaticIpsResponse response) {
      return new FetchStaticIpsPage(context, response);
    }

    @Override
    public ApiFuture<FetchStaticIpsPage> createPageAsync(
        PageContext<FetchStaticIpsRequest, FetchStaticIpsResponse, String> context,
        ApiFuture<FetchStaticIpsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class FetchStaticIpsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          FetchStaticIpsRequest,
          FetchStaticIpsResponse,
          String,
          FetchStaticIpsPage,
          FetchStaticIpsFixedSizeCollection> {

    private FetchStaticIpsFixedSizeCollection(List<FetchStaticIpsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static FetchStaticIpsFixedSizeCollection createEmptyCollection() {
      return new FetchStaticIpsFixedSizeCollection(null, 0);
    }

    @Override
    protected FetchStaticIpsFixedSizeCollection createCollection(
        List<FetchStaticIpsPage> pages, int collectionSize) {
      return new FetchStaticIpsFixedSizeCollection(pages, collectionSize);
    }
  }
}
