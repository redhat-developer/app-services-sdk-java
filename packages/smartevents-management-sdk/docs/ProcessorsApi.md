# ProcessorsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**processorsAPIAddProcessorToBridge**](ProcessorsApi.md#processorsAPIAddProcessorToBridge) | **POST** /api/v1/bridges/{bridgeId}/processors | Create a Processor of a Bridge instance
[**processorsAPIAddProcessorToBridgeWithHttpInfo**](ProcessorsApi.md#processorsAPIAddProcessorToBridgeWithHttpInfo) | **POST** /api/v1/bridges/{bridgeId}/processors | Create a Processor of a Bridge instance
[**processorsAPIDeleteProcessor**](ProcessorsApi.md#processorsAPIDeleteProcessor) | **DELETE** /api/v1/bridges/{bridgeId}/processors/{processorId} | Delete a Processor of a Bridge instance
[**processorsAPIDeleteProcessorWithHttpInfo**](ProcessorsApi.md#processorsAPIDeleteProcessorWithHttpInfo) | **DELETE** /api/v1/bridges/{bridgeId}/processors/{processorId} | Delete a Processor of a Bridge instance
[**processorsAPIGetProcessor**](ProcessorsApi.md#processorsAPIGetProcessor) | **GET** /api/v1/bridges/{bridgeId}/processors/{processorId} | Get a Processor of a Bridge instance
[**processorsAPIGetProcessorWithHttpInfo**](ProcessorsApi.md#processorsAPIGetProcessorWithHttpInfo) | **GET** /api/v1/bridges/{bridgeId}/processors/{processorId} | Get a Processor of a Bridge instance
[**processorsAPIListProcessors**](ProcessorsApi.md#processorsAPIListProcessors) | **GET** /api/v1/bridges/{bridgeId}/processors | Get the list of Processors of a Bridge instance
[**processorsAPIListProcessorsWithHttpInfo**](ProcessorsApi.md#processorsAPIListProcessorsWithHttpInfo) | **GET** /api/v1/bridges/{bridgeId}/processors | Get the list of Processors of a Bridge instance
[**processorsAPIUpdateProcessor**](ProcessorsApi.md#processorsAPIUpdateProcessor) | **PUT** /api/v1/bridges/{bridgeId}/processors/{processorId} | Update a Processor instance Filter definition or Transformation template.
[**processorsAPIUpdateProcessorWithHttpInfo**](ProcessorsApi.md#processorsAPIUpdateProcessorWithHttpInfo) | **PUT** /api/v1/bridges/{bridgeId}/processors/{processorId} | Update a Processor instance Filter definition or Transformation template.



## processorsAPIAddProcessorToBridge

> CompletableFuture<ProcessorResponse> processorsAPIAddProcessorToBridge(bridgeId, processorRequest)

Create a Processor of a Bridge instance

Create a Processor of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.ProcessorsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        ProcessorRequest processorRequest = new ProcessorRequest(); // ProcessorRequest | 
        try {
            CompletableFuture<ProcessorResponse> result = apiInstance.processorsAPIAddProcessorToBridge(bridgeId, processorRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessorsApi#processorsAPIAddProcessorToBridge");
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
 **bridgeId** | **String**|  |
 **processorRequest** | [**ProcessorRequest**](ProcessorRequest.md)|  | [optional]

### Return type

CompletableFuture<[**ProcessorResponse**](ProcessorResponse.md)>


### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |

## processorsAPIAddProcessorToBridgeWithHttpInfo

> CompletableFuture<ApiResponse<ProcessorResponse>> processorsAPIAddProcessorToBridge processorsAPIAddProcessorToBridgeWithHttpInfo(bridgeId, processorRequest)

Create a Processor of a Bridge instance

Create a Processor of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiResponse;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.ProcessorsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        ProcessorRequest processorRequest = new ProcessorRequest(); // ProcessorRequest | 
        try {
            CompletableFuture<ApiResponse<ProcessorResponse>> response = apiInstance.processorsAPIAddProcessorToBridgeWithHttpInfo(bridgeId, processorRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProcessorsApi#processorsAPIAddProcessorToBridge");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessorsApi#processorsAPIAddProcessorToBridge");
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
 **bridgeId** | **String**|  |
 **processorRequest** | [**ProcessorRequest**](ProcessorRequest.md)|  | [optional]

### Return type

CompletableFuture<ApiResponse<[**ProcessorResponse**](ProcessorResponse.md)>>


### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |


## processorsAPIDeleteProcessor

> CompletableFuture<Void> processorsAPIDeleteProcessor(bridgeId, processorId)

Delete a Processor of a Bridge instance

Delete a Processor of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.ProcessorsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String processorId = "processorId_example"; // String | 
        try {
            CompletableFuture<Void> result = apiInstance.processorsAPIDeleteProcessor(bridgeId, processorId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessorsApi#processorsAPIDeleteProcessor");
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
 **bridgeId** | **String**|  |
 **processorId** | **String**|  |

### Return type


CompletableFuture<void> (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |

## processorsAPIDeleteProcessorWithHttpInfo

> CompletableFuture<ApiResponse<Void>> processorsAPIDeleteProcessor processorsAPIDeleteProcessorWithHttpInfo(bridgeId, processorId)

Delete a Processor of a Bridge instance

Delete a Processor of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiResponse;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.ProcessorsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String processorId = "processorId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<Void>> response = apiInstance.processorsAPIDeleteProcessorWithHttpInfo(bridgeId, processorId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProcessorsApi#processorsAPIDeleteProcessor");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessorsApi#processorsAPIDeleteProcessor");
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
 **bridgeId** | **String**|  |
 **processorId** | **String**|  |

### Return type


CompletableFuture<ApiResponse<Void>>

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |


## processorsAPIGetProcessor

> CompletableFuture<ProcessorResponse> processorsAPIGetProcessor(bridgeId, processorId)

Get a Processor of a Bridge instance

Get a Processor of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.ProcessorsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String processorId = "processorId_example"; // String | 
        try {
            CompletableFuture<ProcessorResponse> result = apiInstance.processorsAPIGetProcessor(bridgeId, processorId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessorsApi#processorsAPIGetProcessor");
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
 **bridgeId** | **String**|  |
 **processorId** | **String**|  |

### Return type

CompletableFuture<[**ProcessorResponse**](ProcessorResponse.md)>


### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |

## processorsAPIGetProcessorWithHttpInfo

> CompletableFuture<ApiResponse<ProcessorResponse>> processorsAPIGetProcessor processorsAPIGetProcessorWithHttpInfo(bridgeId, processorId)

Get a Processor of a Bridge instance

Get a Processor of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiResponse;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.ProcessorsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String processorId = "processorId_example"; // String | 
        try {
            CompletableFuture<ApiResponse<ProcessorResponse>> response = apiInstance.processorsAPIGetProcessorWithHttpInfo(bridgeId, processorId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProcessorsApi#processorsAPIGetProcessor");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessorsApi#processorsAPIGetProcessor");
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
 **bridgeId** | **String**|  |
 **processorId** | **String**|  |

### Return type

CompletableFuture<ApiResponse<[**ProcessorResponse**](ProcessorResponse.md)>>


### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |


## processorsAPIListProcessors

> CompletableFuture<ProcessorListResponse> processorsAPIListProcessors(bridgeId, name, page, size, status, type)

Get the list of Processors of a Bridge instance

Get the list of Processors of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.ProcessorsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String name = "name_example"; // String | 
        Integer page = 0; // Integer | 
        Integer size = 100; // Integer | 
        Set<ManagedResourceStatus> status = Arrays.asList(); // Set<ManagedResourceStatus> | 
        ProcessorType type = ProcessorType.fromValue("source"); // ProcessorType | 
        try {
            CompletableFuture<ProcessorListResponse> result = apiInstance.processorsAPIListProcessors(bridgeId, name, page, size, status, type);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessorsApi#processorsAPIListProcessors");
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
 **bridgeId** | **String**|  |
 **name** | **String**|  | [optional]
 **page** | **Integer**|  | [optional] [default to 0]
 **size** | **Integer**|  | [optional] [default to 100]
 **status** | [**Set&lt;ManagedResourceStatus&gt;**](ManagedResourceStatus.md)|  | [optional]
 **type** | [**ProcessorType**](.md)|  | [optional] [enum: source, sink, error_handler]

### Return type

CompletableFuture<[**ProcessorListResponse**](ProcessorListResponse.md)>


### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |

## processorsAPIListProcessorsWithHttpInfo

> CompletableFuture<ApiResponse<ProcessorListResponse>> processorsAPIListProcessors processorsAPIListProcessorsWithHttpInfo(bridgeId, name, page, size, status, type)

Get the list of Processors of a Bridge instance

Get the list of Processors of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiResponse;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.ProcessorsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String name = "name_example"; // String | 
        Integer page = 0; // Integer | 
        Integer size = 100; // Integer | 
        Set<ManagedResourceStatus> status = Arrays.asList(); // Set<ManagedResourceStatus> | 
        ProcessorType type = ProcessorType.fromValue("source"); // ProcessorType | 
        try {
            CompletableFuture<ApiResponse<ProcessorListResponse>> response = apiInstance.processorsAPIListProcessorsWithHttpInfo(bridgeId, name, page, size, status, type);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProcessorsApi#processorsAPIListProcessors");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessorsApi#processorsAPIListProcessors");
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
 **bridgeId** | **String**|  |
 **name** | **String**|  | [optional]
 **page** | **Integer**|  | [optional] [default to 0]
 **size** | **Integer**|  | [optional] [default to 100]
 **status** | [**Set&lt;ManagedResourceStatus&gt;**](ManagedResourceStatus.md)|  | [optional]
 **type** | [**ProcessorType**](.md)|  | [optional] [enum: source, sink, error_handler]

### Return type

CompletableFuture<ApiResponse<[**ProcessorListResponse**](ProcessorListResponse.md)>>


### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |


## processorsAPIUpdateProcessor

> CompletableFuture<ProcessorResponse> processorsAPIUpdateProcessor(bridgeId, processorId, processorRequest)

Update a Processor instance Filter definition or Transformation template.

Update a Processor instance Filter definition or Transformation template for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.ProcessorsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String processorId = "processorId_example"; // String | 
        ProcessorRequest processorRequest = new ProcessorRequest(); // ProcessorRequest | 
        try {
            CompletableFuture<ProcessorResponse> result = apiInstance.processorsAPIUpdateProcessor(bridgeId, processorId, processorRequest);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessorsApi#processorsAPIUpdateProcessor");
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
 **bridgeId** | **String**|  |
 **processorId** | **String**|  |
 **processorRequest** | [**ProcessorRequest**](ProcessorRequest.md)|  | [optional]

### Return type

CompletableFuture<[**ProcessorResponse**](ProcessorResponse.md)>


### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |

## processorsAPIUpdateProcessorWithHttpInfo

> CompletableFuture<ApiResponse<ProcessorResponse>> processorsAPIUpdateProcessor processorsAPIUpdateProcessorWithHttpInfo(bridgeId, processorId, processorRequest)

Update a Processor instance Filter definition or Transformation template.

Update a Processor instance Filter definition or Transformation template for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiResponse;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.ProcessorsApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String processorId = "processorId_example"; // String | 
        ProcessorRequest processorRequest = new ProcessorRequest(); // ProcessorRequest | 
        try {
            CompletableFuture<ApiResponse<ProcessorResponse>> response = apiInstance.processorsAPIUpdateProcessorWithHttpInfo(bridgeId, processorId, processorRequest);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ProcessorsApi#processorsAPIUpdateProcessor");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ProcessorsApi#processorsAPIUpdateProcessor");
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
 **bridgeId** | **String**|  |
 **processorId** | **String**|  |
 **processorRequest** | [**ProcessorRequest**](ProcessorRequest.md)|  | [optional]

### Return type

CompletableFuture<ApiResponse<[**ProcessorResponse**](ProcessorResponse.md)>>


### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |

