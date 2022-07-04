# ErrorsApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getErrorById**](ErrorsApi.md#getErrorById) | **GET** /api/kafkas_mgmt/v1/errors/{id} | 
[**getErrors**](ErrorsApi.md#getErrors) | **GET** /api/kafkas_mgmt/v1/errors | 



## getErrorById

> Error getErrorById(id)



Returns the error by Id

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.ErrorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");

        ErrorsApi apiInstance = new ErrorsApi(defaultClient);
        String id = "id_example"; // String | The ID of record
        try {
            Error result = apiInstance.getErrorById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ErrorsApi#getErrorById");
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
 **id** | **String**| The ID of record |

### Return type

[**Error**](Error.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get error by Id |  -  |


## getErrors

> ErrorList getErrors()



Returns the list of possible API errors

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.ErrorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");

        ErrorsApi apiInstance = new ErrorsApi(defaultClient);
        try {
            ErrorList result = apiInstance.getErrors();
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

This endpoint does not need any parameter.

### Return type

[**ErrorList**](ErrorList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of possible errors |  -  |

