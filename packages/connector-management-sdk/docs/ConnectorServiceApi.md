# ConnectorServiceApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVersionMetadata**](ConnectorServiceApi.md#getVersionMetadata) | **GET** /api/connector_mgmt/v1 | Returns the version metadata



## getVersionMetadata

> VersionMetadata getVersionMetadata()

Returns the version metadata

Returns the version metadata

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");

        ConnectorServiceApi apiInstance = new ConnectorServiceApi(defaultClient);
        try {
            VersionMetadata result = apiInstance.getVersionMetadata();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorServiceApi#getVersionMetadata");
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

[**VersionMetadata**](VersionMetadata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Version metadata |  -  |

