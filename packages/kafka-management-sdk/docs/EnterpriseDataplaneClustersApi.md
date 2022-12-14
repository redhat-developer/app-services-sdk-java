# EnterpriseDataplaneClustersApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEnterpriseOsdClusters**](EnterpriseDataplaneClustersApi.md#getEnterpriseOsdClusters) | **GET** /api/kafkas_mgmt/v1/clusters | 
[**registerEnterpriseOsdCluster**](EnterpriseDataplaneClustersApi.md#registerEnterpriseOsdCluster) | **POST** /api/kafkas_mgmt/v1/clusters | 



## getEnterpriseOsdClusters

> EnterpriseClusterList getEnterpriseOsdClusters()



List all Enterprise OSD clusters

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.EnterpriseDataplaneClustersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        EnterpriseDataplaneClustersApi apiInstance = new EnterpriseDataplaneClustersApi(defaultClient);
        try {
            EnterpriseClusterList result = apiInstance.getEnterpriseOsdClusters();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnterpriseDataplaneClustersApi#getEnterpriseOsdClusters");
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

[**EnterpriseClusterList**](EnterpriseClusterList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Enterprise OSD clusters |  -  |
| **400** | Bad request |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User not authorized to access the service |  -  |
| **500** | Unexpected error occurred |  -  |


## registerEnterpriseOsdCluster

> EnterpriseClusterRegistrationResponse registerEnterpriseOsdCluster(enterpriseOsdClusterPayload)



Register enterprise data plane cluster

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.EnterpriseDataplaneClustersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        EnterpriseDataplaneClustersApi apiInstance = new EnterpriseDataplaneClustersApi(defaultClient);
        EnterpriseOsdClusterPayload enterpriseOsdClusterPayload = new EnterpriseOsdClusterPayload(); // EnterpriseOsdClusterPayload | Enterprise data plane cluster details
        try {
            EnterpriseClusterRegistrationResponse result = apiInstance.registerEnterpriseOsdCluster(enterpriseOsdClusterPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnterpriseDataplaneClustersApi#registerEnterpriseOsdCluster");
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
 **enterpriseOsdClusterPayload** | [**EnterpriseOsdClusterPayload**](EnterpriseOsdClusterPayload.md)| Enterprise data plane cluster details |

### Return type

[**EnterpriseClusterRegistrationResponse**](EnterpriseClusterRegistrationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Enterprise cluster registered |  -  |
| **400** | Validation errors occurred |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User is not authorized to access the service |  -  |
| **409** | A conflict has been detected in the creation of this resource |  -  |
| **500** | An unexpected error occurred while registering Enterprise cluster |  -  |

