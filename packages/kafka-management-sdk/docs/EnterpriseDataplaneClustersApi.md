# EnterpriseDataplaneClustersApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEnterpriseClusterById**](EnterpriseDataplaneClustersApi.md#deleteEnterpriseClusterById) | **DELETE** /api/kafkas_mgmt/v1/clusters/{id} | 
[**getEnterpriseClusterById**](EnterpriseDataplaneClustersApi.md#getEnterpriseClusterById) | **GET** /api/kafkas_mgmt/v1/clusters/{id} | 
[**getEnterpriseClusterWithAddonParameters**](EnterpriseDataplaneClustersApi.md#getEnterpriseClusterWithAddonParameters) | **GET** /api/kafkas_mgmt/v1/clusters/{id}/addon_parameters | 
[**getEnterpriseOsdClusters**](EnterpriseDataplaneClustersApi.md#getEnterpriseOsdClusters) | **GET** /api/kafkas_mgmt/v1/clusters | 
[**registerEnterpriseOsdCluster**](EnterpriseDataplaneClustersApi.md#registerEnterpriseOsdCluster) | **POST** /api/kafkas_mgmt/v1/clusters | 



## deleteEnterpriseClusterById

> Error deleteEnterpriseClusterById(async, id, force)



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
        Boolean async = true; // Boolean | Perform the action in an asynchronous manner
        String id = "id_example"; // String | ID of the enterprise data plane cluster
        Boolean force = true; // Boolean | When provided with value: true - enterprise cluster will be deleted alongside all kafkas present on the cluster. When skipped and enterprise cluster has any kafkas associated with it, the request will fail.
        try {
            Error result = apiInstance.deleteEnterpriseClusterById(async, id, force);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnterpriseDataplaneClustersApi#deleteEnterpriseClusterById");
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
 **async** | **Boolean**| Perform the action in an asynchronous manner |
 **id** | **String**| ID of the enterprise data plane cluster |
 **force** | **Boolean**| When provided with value: true - enterprise cluster will be deleted alongside all kafkas present on the cluster. When skipped and enterprise cluster has any kafkas associated with it, the request will fail. | [optional]

### Return type

[**Error**](Error.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Enterprise cluster deletion accepted |  -  |
| **400** | Validation errors occurred |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User not authorized to access the service |  -  |
| **404** | No Enterprise cluster with specified ID exists |  -  |
| **500** | Unexpected error occurred |  -  |


## getEnterpriseClusterById

> EnterpriseCluster getEnterpriseClusterById(id)



Returns enterprise data plane cluster by ID

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
        String id = "id_example"; // String | ID of the enterprise data plane cluster
        try {
            EnterpriseCluster result = apiInstance.getEnterpriseClusterById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnterpriseDataplaneClustersApi#getEnterpriseClusterById");
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
 **id** | **String**| ID of the enterprise data plane cluster |

### Return type

[**EnterpriseCluster**](EnterpriseCluster.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Found enterprise data plane cluster with provided ID |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User not authorized to access the service |  -  |
| **404** | No Enterprise data plane cluster with specified ID exists |  -  |
| **500** | Unexpected error occurred |  -  |


## getEnterpriseClusterWithAddonParameters

> EnterpriseClusterWithAddonParameters getEnterpriseClusterWithAddonParameters(id)



Returns enterprise data plane cluster by ID along with its addon parameters

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
        String id = "id_example"; // String | ID of the enterprise data plane cluster
        try {
            EnterpriseClusterWithAddonParameters result = apiInstance.getEnterpriseClusterWithAddonParameters(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnterpriseDataplaneClustersApi#getEnterpriseClusterWithAddonParameters");
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
 **id** | **String**| ID of the enterprise data plane cluster |

### Return type

[**EnterpriseClusterWithAddonParameters**](EnterpriseClusterWithAddonParameters.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the enterprise data plane cluster with addon parameters for an existing enterprise data plane cluster with provided ID |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User not authorized to access the service |  -  |
| **404** | No Enterprise data plane cluster with specified ID exists |  -  |
| **500** | Unexpected error occurred |  -  |


## getEnterpriseOsdClusters

> EnterpriseClusterList getEnterpriseOsdClusters()



List all Enterprise data plane clusters

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
| **200** | List Enterprise data plane clusters |  -  |
| **400** | Bad request |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User not authorized to access the service |  -  |
| **500** | Unexpected error occurred |  -  |


## registerEnterpriseOsdCluster

> EnterpriseClusterWithAddonParameters registerEnterpriseOsdCluster(enterpriseOsdClusterPayload)



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
            EnterpriseClusterWithAddonParameters result = apiInstance.registerEnterpriseOsdCluster(enterpriseOsdClusterPayload);
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

[**EnterpriseClusterWithAddonParameters**](EnterpriseClusterWithAddonParameters.md)

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

