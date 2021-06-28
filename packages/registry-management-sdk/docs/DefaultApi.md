# DefaultApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSchema**](DefaultApi.md#getSchema) | **GET** /api/serviceregistry_mgmt/v1/openapi | Get an OpenAPI schema for this API.



## getSchema

> String getSchema()

Get an OpenAPI schema for this API.

### Example

```java
// Import classes:
import com.openshift.cloud.api.srs.invoker.ApiClient;
import com.openshift.cloud.api.srs.invoker.ApiException;
import com.openshift.cloud.api.srs.invoker.Configuration;
import com.openshift.cloud.api.srs.invoker.models.*;
import com.openshift.cloud.api.srs.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            String result = apiInstance.getSchema();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getSchema");
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

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |

