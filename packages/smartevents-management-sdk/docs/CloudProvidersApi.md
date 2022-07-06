# CloudProvidersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloudProviderAPIGetCloudProvider**](CloudProvidersApi.md#cloudProviderAPIGetCloudProvider) | **GET** /api/v1/cloud_providers/{id} | Get Cloud Provider.
[**cloudProviderAPIGetCloudProviderWithHttpInfo**](CloudProvidersApi.md#cloudProviderAPIGetCloudProviderWithHttpInfo) | **GET** /api/v1/cloud_providers/{id} | Get Cloud Provider.
[**cloudProviderAPIListCloudProviderRegions**](CloudProvidersApi.md#cloudProviderAPIListCloudProviderRegions) | **GET** /api/v1/cloud_providers/{id}/regions | List Supported Cloud Regions.
[**cloudProviderAPIListCloudProviderRegionsWithHttpInfo**](CloudProvidersApi.md#cloudProviderAPIListCloudProviderRegionsWithHttpInfo) | **GET** /api/v1/cloud_providers/{id}/regions | List Supported Cloud Regions.
[**cloudProviderAPIListCloudProviders**](CloudProvidersApi.md#cloudProviderAPIListCloudProviders) | **GET** /api/v1/cloud_providers | List Supported Cloud Providers.
[**cloudProviderAPIListCloudProvidersWithHttpInfo**](CloudProvidersApi.md#cloudProviderAPIListCloudProvidersWithHttpInfo) | **GET** /api/v1/cloud_providers | List Supported Cloud Providers.



## cloudProviderAPIGetCloudProvider

> CompletableFuture<CloudProviderListResponse> cloudProviderAPIGetCloudProvider(id)

Get Cloud Provider.

Get details of the Cloud Provider specified by id.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.CloudProvidersApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CloudProvidersApi apiInstance = new CloudProvidersApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            CompletableFuture<CloudProviderListResponse> result = apiInstance.cloudProviderAPIGetCloudProvider(id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudProvidersApi#cloudProviderAPIGetCloudProvider");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

CompletableFuture<[**CloudProviderListResponse**](CloudProviderListResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **500** | Internal error. |  -  |

## cloudProviderAPIGetCloudProviderWithHttpInfo

> CompletableFuture<ApiResponse<CloudProviderListResponse>> cloudProviderAPIGetCloudProvider cloudProviderAPIGetCloudProviderWithHttpInfo(id)

Get Cloud Provider.

Get details of the Cloud Provider specified by id.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiResponse;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.CloudProvidersApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CloudProvidersApi apiInstance = new CloudProvidersApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            CompletableFuture<ApiResponse<CloudProviderListResponse>> response = apiInstance.cloudProviderAPIGetCloudProviderWithHttpInfo(id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CloudProvidersApi#cloudProviderAPIGetCloudProvider");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudProvidersApi#cloudProviderAPIGetCloudProvider");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

CompletableFuture<ApiResponse<[**CloudProviderListResponse**](CloudProviderListResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **500** | Internal error. |  -  |


## cloudProviderAPIListCloudProviderRegions

> CompletableFuture<CloudRegionListResponse> cloudProviderAPIListCloudProviderRegions(id, page, size)

List Supported Cloud Regions.

Returns the list of supported Regions of the specified Cloud Provider.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.CloudProvidersApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CloudProvidersApi apiInstance = new CloudProvidersApi(defaultClient);
        String id = "id_example"; // String | 
        Integer page = 0; // Integer | 
        Integer size = 100; // Integer | 
        try {
            CompletableFuture<CloudRegionListResponse> result = apiInstance.cloudProviderAPIListCloudProviderRegions(id, page, size);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudProvidersApi#cloudProviderAPIListCloudProviderRegions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **page** | **Integer**|  | [optional] [default to 0]
 **size** | **Integer**|  | [optional] [default to 100]

### Return type

CompletableFuture<[**CloudRegionListResponse**](CloudRegionListResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **500** | Internal error. |  -  |

## cloudProviderAPIListCloudProviderRegionsWithHttpInfo

> CompletableFuture<ApiResponse<CloudRegionListResponse>> cloudProviderAPIListCloudProviderRegions cloudProviderAPIListCloudProviderRegionsWithHttpInfo(id, page, size)

List Supported Cloud Regions.

Returns the list of supported Regions of the specified Cloud Provider.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiResponse;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.CloudProvidersApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CloudProvidersApi apiInstance = new CloudProvidersApi(defaultClient);
        String id = "id_example"; // String | 
        Integer page = 0; // Integer | 
        Integer size = 100; // Integer | 
        try {
            CompletableFuture<ApiResponse<CloudRegionListResponse>> response = apiInstance.cloudProviderAPIListCloudProviderRegionsWithHttpInfo(id, page, size);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CloudProvidersApi#cloudProviderAPIListCloudProviderRegions");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudProvidersApi#cloudProviderAPIListCloudProviderRegions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **page** | **Integer**|  | [optional] [default to 0]
 **size** | **Integer**|  | [optional] [default to 100]

### Return type

CompletableFuture<ApiResponse<[**CloudRegionListResponse**](CloudRegionListResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **500** | Internal error. |  -  |


## cloudProviderAPIListCloudProviders

> CompletableFuture<CloudProviderListResponse> cloudProviderAPIListCloudProviders(page, size)

List Supported Cloud Providers.

Returns the list of supported Cloud Providers.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.CloudProvidersApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CloudProvidersApi apiInstance = new CloudProvidersApi(defaultClient);
        Integer page = 0; // Integer | 
        Integer size = 100; // Integer | 
        try {
            CompletableFuture<CloudProviderListResponse> result = apiInstance.cloudProviderAPIListCloudProviders(page, size);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudProvidersApi#cloudProviderAPIListCloudProviders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [optional] [default to 0]
 **size** | **Integer**|  | [optional] [default to 100]

### Return type

CompletableFuture<[**CloudProviderListResponse**](CloudProviderListResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **500** | Internal error. |  -  |

## cloudProviderAPIListCloudProvidersWithHttpInfo

> CompletableFuture<ApiResponse<CloudProviderListResponse>> cloudProviderAPIListCloudProviders cloudProviderAPIListCloudProvidersWithHttpInfo(page, size)

List Supported Cloud Providers.

Returns the list of supported Cloud Providers.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiResponse;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.CloudProvidersApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CloudProvidersApi apiInstance = new CloudProvidersApi(defaultClient);
        Integer page = 0; // Integer | 
        Integer size = 100; // Integer | 
        try {
            CompletableFuture<ApiResponse<CloudProviderListResponse>> response = apiInstance.cloudProviderAPIListCloudProvidersWithHttpInfo(page, size);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling CloudProvidersApi#cloudProviderAPIListCloudProviders");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudProvidersApi#cloudProviderAPIListCloudProviders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [optional] [default to 0]
 **size** | **Integer**|  | [optional] [default to 100]

### Return type

CompletableFuture<ApiResponse<[**CloudProviderListResponse**](CloudProviderListResponse.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **500** | Internal error. |  -  |

