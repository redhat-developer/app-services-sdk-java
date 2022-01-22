# ConnectorClustersApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnectorCluster**](ConnectorClustersApi.md#createConnectorCluster) | **POST** /api/connector_mgmt/v1/kafka_connector_clusters | Create a new connector cluster
[**deleteConnectorCluster**](ConnectorClustersApi.md#deleteConnectorCluster) | **DELETE** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id} | Delete a connector cluster
[**getConnectorCluster**](ConnectorClustersApi.md#getConnectorCluster) | **GET** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id} | Get a connector cluster
[**getConnectorClusterAddonParameters**](ConnectorClustersApi.md#getConnectorClusterAddonParameters) | **GET** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}/addon_parameters | Get a connector cluster&#39;s addon parameters
[**listConnectorClusters**](ConnectorClustersApi.md#listConnectorClusters) | **GET** /api/connector_mgmt/v1/kafka_connector_clusters | Returns a list of connector clusters
[**updateConnectorClusterById**](ConnectorClustersApi.md#updateConnectorClusterById) | **PUT** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id} | udpate a connector cluster



## createConnectorCluster

> ConnectorCluster createConnectorCluster(async, connectorClusterRequest)

Create a new connector cluster

Create a new connector cluster

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorClustersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorClustersApi apiInstance = new ConnectorClustersApi(defaultClient);
        Boolean async = true; // Boolean | Perform the action in an asynchronous manner
        ConnectorClusterRequest connectorClusterRequest = new ConnectorClusterRequest(); // ConnectorClusterRequest | Connector cluster data
        try {
            ConnectorCluster result = apiInstance.createConnectorCluster(async, connectorClusterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#createConnectorCluster");
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
 **connectorClusterRequest** | [**ConnectorClusterRequest**](ConnectorClusterRequest.md)| Connector cluster data |

### Return type

[**ConnectorCluster**](ConnectorCluster.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Validation errors occurred |  -  |
| **401** | Auth token is invalid |  -  |
| **404** | The requested resource doesn&#39;t exist |  -  |
| **500** | An unexpected error occurred creating the connector cluster |  -  |


## deleteConnectorCluster

> Error deleteConnectorCluster(connectorClusterId)

Delete a connector cluster

Delete a connector cluster

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorClustersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorClustersApi apiInstance = new ConnectorClustersApi(defaultClient);
        String connectorClusterId = "connectorClusterId_example"; // String | The id of the connector cluster
        try {
            Error result = apiInstance.deleteConnectorCluster(connectorClusterId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#deleteConnectorCluster");
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
 **connectorClusterId** | **String**| The id of the connector cluster |

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
| **204** | Deleted |  -  |
| **401** | Auth token is invalid |  -  |
| **404** | No resource with specified ID exists |  -  |
| **500** | Unexpected error occurred |  -  |


## getConnectorCluster

> ConnectorCluster getConnectorCluster(connectorClusterId)

Get a connector cluster

Get a connector cluster

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorClustersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorClustersApi apiInstance = new ConnectorClustersApi(defaultClient);
        String connectorClusterId = "connectorClusterId_example"; // String | The id of the connector cluster
        try {
            ConnectorCluster result = apiInstance.getConnectorCluster(connectorClusterId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#getConnectorCluster");
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
 **connectorClusterId** | **String**| The id of the connector cluster |

### Return type

[**ConnectorCluster**](ConnectorCluster.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The connector cluster matching the request |  -  |
| **401** | Auth token is invalid |  -  |
| **404** | No matching connector cluster type exists |  -  |
| **500** | Unexpected error occurred |  -  |


## getConnectorClusterAddonParameters

> List&lt;AddonParameter&gt; getConnectorClusterAddonParameters(connectorClusterId)

Get a connector cluster&#39;s addon parameters

Get a connector cluster&#39;s addon parameters

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorClustersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorClustersApi apiInstance = new ConnectorClustersApi(defaultClient);
        String connectorClusterId = "connectorClusterId_example"; // String | The id of the connector cluster
        try {
            List<AddonParameter> result = apiInstance.getConnectorClusterAddonParameters(connectorClusterId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#getConnectorClusterAddonParameters");
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
 **connectorClusterId** | **String**| The id of the connector cluster |

### Return type

[**List&lt;AddonParameter&gt;**](AddonParameter.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The parameters that should be used to configure the managed connector addon on the cluster. |  -  |
| **401** | Auth token is invalid |  -  |
| **404** | No matching connector cluster type exists |  -  |
| **500** | Unexpected error occurred |  -  |


## listConnectorClusters

> ConnectorClusterList listConnectorClusters(page, size)

Returns a list of connector clusters

Returns a list of connector clusters

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorClustersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorClustersApi apiInstance = new ConnectorClustersApi(defaultClient);
        String page = "1"; // String | Page index
        String size = "100"; // String | Number of items in each page
        try {
            ConnectorClusterList result = apiInstance.listConnectorClusters(page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#listConnectorClusters");
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
 **page** | **String**| Page index | [optional]
 **size** | **String**| Number of items in each page | [optional]

### Return type

[**ConnectorClusterList**](ConnectorClusterList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of connector clusters |  -  |
| **401** | Auth token is invalid |  -  |
| **500** | Unexpected error occurred |  -  |


## updateConnectorClusterById

> updateConnectorClusterById(connectorClusterId, connectorClusterRequest)

udpate a connector cluster

udpate a connector cluster

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorClustersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorClustersApi apiInstance = new ConnectorClustersApi(defaultClient);
        String connectorClusterId = "connectorClusterId_example"; // String | The id of the connector cluster
        ConnectorClusterRequest connectorClusterRequest = new ConnectorClusterRequest(); // ConnectorClusterRequest | Data to updated connector with
        try {
            apiInstance.updateConnectorClusterById(connectorClusterId, connectorClusterRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#updateConnectorClusterById");
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
 **connectorClusterId** | **String**| The id of the connector cluster |
 **connectorClusterRequest** | [**ConnectorClusterRequest**](ConnectorClusterRequest.md)| Data to updated connector with |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Cluster status is updated |  -  |
| **401** | Auth token is invalid |  -  |
| **404** | No matching connector cluster exists |  -  |
| **500** | Unexpected error occurred |  -  |

