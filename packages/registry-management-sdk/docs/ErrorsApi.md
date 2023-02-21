# ErrorsApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getError**](ErrorsApi.md#getError) | **GET** /api/serviceregistry_mgmt/v1/errors/{id} | 
[**getErrors**](ErrorsApi.md#getErrors) | **GET** /api/serviceregistry_mgmt/v1/errors | 



## getError

> Error getError(id)



Get information about a specific error type

### Example

```java
// Import classes:
import com.openshift.cloud.api.srs.invoker.ApiClient;
import com.openshift.cloud.api.srs.invoker.ApiException;
import com.openshift.cloud.api.srs.invoker.Configuration;
import com.openshift.cloud.api.srs.invoker.models.*;
import com.openshift.cloud.api.srs.ErrorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");

        ErrorsApi apiInstance = new ErrorsApi(defaultClient);
        String id = "id_example"; // String | The id of the object you wish to interact with.
        try {
            Error result = apiInstance.getError(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ErrorsApi#getError");
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
 **id** | **String**| The id of the object you wish to interact with. |

### Return type

[**Error**](Error.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response - returns a single &#x60;Error&#x60;. |  -  |
| **401** | Authentication was not successful. Make sure the token is valid. |  -  |
| **403** | User is not authorized to perform the operation. |  -  |
| **404** | No Service Registry with the specified id exists. |  -  |
| **500** | Unexpected error occurred. |  -  |


## getErrors

> ErrorList getErrors(page, size)



Get the list of all errors

### Example

```java
// Import classes:
import com.openshift.cloud.api.srs.invoker.ApiClient;
import com.openshift.cloud.api.srs.invoker.ApiException;
import com.openshift.cloud.api.srs.invoker.Configuration;
import com.openshift.cloud.api.srs.invoker.models.*;
import com.openshift.cloud.api.srs.ErrorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");

        ErrorsApi apiInstance = new ErrorsApi(defaultClient);
        Integer page = 0; // Integer | Page index.
        Integer size = 100; // Integer | Number of items in each page.
        try {
            ErrorList result = apiInstance.getErrors(page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ErrorsApi#getErrors");
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
 **page** | **Integer**| Page index. | [optional]
 **size** | **Integer**| Number of items in each page. | [optional]

### Return type

[**ErrorList**](ErrorList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **400** | Invalid request content or parameters. |  -  |
| **401** | Authentication was not successful. Make sure the token is valid. |  -  |
| **403** | User is not authorized to perform the operation. |  -  |
| **500** | Unexpected error occurred. |  -  |

