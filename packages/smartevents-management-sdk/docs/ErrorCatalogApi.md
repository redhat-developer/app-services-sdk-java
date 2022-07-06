# ErrorCatalogApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**errorsAPIGetError**](ErrorCatalogApi.md#errorsAPIGetError) | **GET** /api/v1/errors/{id} | Get an error from the error catalog.
[**errorsAPIGetErrorWithHttpInfo**](ErrorCatalogApi.md#errorsAPIGetErrorWithHttpInfo) | **GET** /api/v1/errors/{id} | Get an error from the error catalog.
[**errorsAPIGetErrors**](ErrorCatalogApi.md#errorsAPIGetErrors) | **GET** /api/v1/errors | Get the list of errors.
[**errorsAPIGetErrorsWithHttpInfo**](ErrorCatalogApi.md#errorsAPIGetErrorsWithHttpInfo) | **GET** /api/v1/errors | Get the list of errors.



## errorsAPIGetError

> BridgeError errorsAPIGetError(id)

Get an error from the error catalog.

Get an error from the error catalog.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.ErrorCatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ErrorCatalogApi apiInstance = new ErrorCatalogApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            BridgeError result = apiInstance.errorsAPIGetError(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ErrorCatalogApi#errorsAPIGetError");
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
 **id** | **Integer**|  |

### Return type

[**BridgeError**](BridgeError.md)


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
| **401** | Unauthorized. |  -  |
| **500** | Internal error. |  -  |

## errorsAPIGetErrorWithHttpInfo

> ApiResponse<BridgeError> errorsAPIGetError errorsAPIGetErrorWithHttpInfo(id)

Get an error from the error catalog.

Get an error from the error catalog.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiResponse;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.ErrorCatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ErrorCatalogApi apiInstance = new ErrorCatalogApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            ApiResponse<BridgeError> response = apiInstance.errorsAPIGetErrorWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ErrorCatalogApi#errorsAPIGetError");
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
 **id** | **Integer**|  |

### Return type

ApiResponse<[**BridgeError**](BridgeError.md)>


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
| **401** | Unauthorized. |  -  |
| **500** | Internal error. |  -  |


## errorsAPIGetErrors

> ErrorListResponse errorsAPIGetErrors(page, size)

Get the list of errors.

Get the list of errors from the error catalog.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.ErrorCatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ErrorCatalogApi apiInstance = new ErrorCatalogApi(defaultClient);
        Integer page = 0; // Integer | 
        Integer size = 100; // Integer | 
        try {
            ErrorListResponse result = apiInstance.errorsAPIGetErrors(page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ErrorCatalogApi#errorsAPIGetErrors");
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

[**ErrorListResponse**](ErrorListResponse.md)


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
| **401** | Unauthorized. |  -  |
| **500** | Internal error. |  -  |

## errorsAPIGetErrorsWithHttpInfo

> ApiResponse<ErrorListResponse> errorsAPIGetErrors errorsAPIGetErrorsWithHttpInfo(page, size)

Get the list of errors.

Get the list of errors from the error catalog.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiResponse;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.ErrorCatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ErrorCatalogApi apiInstance = new ErrorCatalogApi(defaultClient);
        Integer page = 0; // Integer | 
        Integer size = 100; // Integer | 
        try {
            ApiResponse<ErrorListResponse> response = apiInstance.errorsAPIGetErrorsWithHttpInfo(page, size);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ErrorCatalogApi#errorsAPIGetErrors");
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

ApiResponse<[**ErrorListResponse**](ErrorListResponse.md)>


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
| **401** | Unauthorized. |  -  |
| **500** | Internal error. |  -  |

