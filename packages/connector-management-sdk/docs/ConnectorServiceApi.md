# ConnectorServiceApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVersionMetadata**](ConnectorServiceApi.md#getVersionMetadata) | **GET** /api/connector_mgmt/v1 | Returns the version metadata
[**getVersionMetadataWithHttpInfo**](ConnectorServiceApi.md#getVersionMetadataWithHttpInfo) | **GET** /api/connector_mgmt/v1 | Returns the version metadata



## getVersionMetadata

> CompletableFuture<VersionMetadata> getVersionMetadata()

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
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");

        ConnectorServiceApi apiInstance = new ConnectorServiceApi(defaultClient);
        try {
            CompletableFuture<VersionMetadata> result = apiInstance.getVersionMetadata();
            System.out.println(result.get());
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

CompletableFuture<[**VersionMetadata**](VersionMetadata.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Version metadata |  -  |

## getVersionMetadataWithHttpInfo

> CompletableFuture<ApiResponse<VersionMetadata>> getVersionMetadata getVersionMetadataWithHttpInfo()

Returns the version metadata

Returns the version metadata

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiResponse;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorServiceApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");

        ConnectorServiceApi apiInstance = new ConnectorServiceApi(defaultClient);
        try {
            CompletableFuture<ApiResponse<VersionMetadata>> response = apiInstance.getVersionMetadataWithHttpInfo();
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ConnectorServiceApi#getVersionMetadata");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorServiceApi#getVersionMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

CompletableFuture<ApiResponse<[**VersionMetadata**](VersionMetadata.md)>>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Version metadata |  -  |

