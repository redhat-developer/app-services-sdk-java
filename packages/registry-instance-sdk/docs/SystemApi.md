# SystemApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResourceLimits**](SystemApi.md#getResourceLimits) | **GET** /system/limits | Get resource limits information
[**getSystemInfo**](SystemApi.md#getSystemInfo) | **GET** /system/info | Get system information



## getResourceLimits

> Limits getResourceLimits()

Get resource limits information

This operation retrieves the list of limitations on used resources, that are applied on the current instance of Registry.

### Example

```java
// Import classes:
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.models.*;
import com.openshift.cloud.api.registry.instance.SystemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SystemApi apiInstance = new SystemApi(defaultClient);
        try {
            Limits result = apiInstance.getResourceLimits();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemApi#getResourceLimits");
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

[**Limits**](Limits.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | On success, returns resource limits |  -  |
| **500** | Common response for all operations that can fail with an unexpected server error. |  -  |


## getSystemInfo

> SystemInfo getSystemInfo()

Get system information

This operation retrieves information about the running registry system, such as the version of the software and when it was built.

### Example

```java
// Import classes:
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.models.*;
import com.openshift.cloud.api.registry.instance.SystemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SystemApi apiInstance = new SystemApi(defaultClient);
        try {
            SystemInfo result = apiInstance.getSystemInfo();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemApi#getSystemInfo");
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

[**SystemInfo**](SystemInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | On success, returns the system information. |  -  |
| **500** | Common response for all operations that can fail with an unexpected server error. |  -  |

