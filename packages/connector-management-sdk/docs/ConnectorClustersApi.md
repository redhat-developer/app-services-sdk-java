# ConnectorClustersApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnectorCluster**](ConnectorClustersApi.md#createConnectorCluster) | **POST** /api/connector_mgmt/v1/kafka_connector_clusters | Create a new connector cluster
[**createConnectorClusterWithHttpInfo**](ConnectorClustersApi.md#createConnectorClusterWithHttpInfo) | **POST** /api/connector_mgmt/v1/kafka_connector_clusters | Create a new connector cluster
[**deleteConnectorCluster**](ConnectorClustersApi.md#deleteConnectorCluster) | **DELETE** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id} | Delete a connector cluster
[**deleteConnectorClusterWithHttpInfo**](ConnectorClustersApi.md#deleteConnectorClusterWithHttpInfo) | **DELETE** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id} | Delete a connector cluster
[**getConnectorCluster**](ConnectorClustersApi.md#getConnectorCluster) | **GET** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id} | Get a connector cluster
[**getConnectorClusterWithHttpInfo**](ConnectorClustersApi.md#getConnectorClusterWithHttpInfo) | **GET** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id} | Get a connector cluster
[**getConnectorClusterAddonParameters**](ConnectorClustersApi.md#getConnectorClusterAddonParameters) | **GET** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}/addon_parameters | Get a connector cluster&#39;s addon parameters
[**getConnectorClusterAddonParametersWithHttpInfo**](ConnectorClustersApi.md#getConnectorClusterAddonParametersWithHttpInfo) | **GET** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}/addon_parameters | Get a connector cluster&#39;s addon parameters
[**getConnectorClusterNamespaces**](ConnectorClustersApi.md#getConnectorClusterNamespaces) | **GET** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}/namespaces | Get a connector cluster&#39;s namespaces
[**getConnectorClusterNamespacesWithHttpInfo**](ConnectorClustersApi.md#getConnectorClusterNamespacesWithHttpInfo) | **GET** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}/namespaces | Get a connector cluster&#39;s namespaces
[**listConnectorClusters**](ConnectorClustersApi.md#listConnectorClusters) | **GET** /api/connector_mgmt/v1/kafka_connector_clusters | Returns a list of connector clusters
[**listConnectorClustersWithHttpInfo**](ConnectorClustersApi.md#listConnectorClustersWithHttpInfo) | **GET** /api/connector_mgmt/v1/kafka_connector_clusters | Returns a list of connector clusters
[**updateConnectorClusterById**](ConnectorClustersApi.md#updateConnectorClusterById) | **PUT** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id} | udpate a connector cluster
[**updateConnectorClusterByIdWithHttpInfo**](ConnectorClustersApi.md#updateConnectorClusterByIdWithHttpInfo) | **PUT** /api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id} | udpate a connector cluster



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

## createConnectorClusterWithHttpInfo

> ApiResponse<ConnectorCluster> createConnectorCluster createConnectorClusterWithHttpInfo(async, connectorClusterRequest)

Create a new connector cluster

Create a new connector cluster

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiResponse;
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
            ApiResponse<ConnectorCluster> response = apiInstance.createConnectorClusterWithHttpInfo(async, connectorClusterRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#createConnectorCluster");
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
 **async** | **Boolean**| Perform the action in an asynchronous manner |
 **connectorClusterRequest** | [**ConnectorClusterRequest**](ConnectorClusterRequest.md)| Connector cluster data |

### Return type

ApiResponse<[**ConnectorCluster**](ConnectorCluster.md)>


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

## deleteConnectorClusterWithHttpInfo

> ApiResponse<Error> deleteConnectorCluster deleteConnectorClusterWithHttpInfo(connectorClusterId)

Delete a connector cluster

Delete a connector cluster

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiResponse;
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
            ApiResponse<Error> response = apiInstance.deleteConnectorClusterWithHttpInfo(connectorClusterId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#deleteConnectorCluster");
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
 **connectorClusterId** | **String**| The id of the connector cluster |

### Return type

ApiResponse<[**Error**](Error.md)>


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
| **410** | The requested resource doesn&#39;t exist anymore |  -  |
| **500** | Unexpected error occurred |  -  |

## getConnectorClusterWithHttpInfo

> ApiResponse<ConnectorCluster> getConnectorCluster getConnectorClusterWithHttpInfo(connectorClusterId)

Get a connector cluster

Get a connector cluster

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiResponse;
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
            ApiResponse<ConnectorCluster> response = apiInstance.getConnectorClusterWithHttpInfo(connectorClusterId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#getConnectorCluster");
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
 **connectorClusterId** | **String**| The id of the connector cluster |

### Return type

ApiResponse<[**ConnectorCluster**](ConnectorCluster.md)>


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
| **410** | The requested resource doesn&#39;t exist anymore |  -  |
| **500** | Unexpected error occurred |  -  |


## getConnectorClusterAddonParameters

> List<AddonParameter> getConnectorClusterAddonParameters(connectorClusterId, resetCredentials)

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
        Boolean resetCredentials = true; // Boolean | Resets cluster service account credentials when true
        try {
            List<AddonParameter> result = apiInstance.getConnectorClusterAddonParameters(connectorClusterId, resetCredentials);
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
 **resetCredentials** | **Boolean**| Resets cluster service account credentials when true | [optional]

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
| **410** | The requested resource doesn&#39;t exist anymore |  -  |
| **500** | Unexpected error occurred |  -  |

## getConnectorClusterAddonParametersWithHttpInfo

> ApiResponse<List<AddonParameter>> getConnectorClusterAddonParameters getConnectorClusterAddonParametersWithHttpInfo(connectorClusterId, resetCredentials)

Get a connector cluster&#39;s addon parameters

Get a connector cluster&#39;s addon parameters

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiResponse;
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
        Boolean resetCredentials = true; // Boolean | Resets cluster service account credentials when true
        try {
            ApiResponse<List<AddonParameter>> response = apiInstance.getConnectorClusterAddonParametersWithHttpInfo(connectorClusterId, resetCredentials);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#getConnectorClusterAddonParameters");
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
 **connectorClusterId** | **String**| The id of the connector cluster |
 **resetCredentials** | **Boolean**| Resets cluster service account credentials when true | [optional]

### Return type

ApiResponse<[**List&lt;AddonParameter&gt;**](AddonParameter.md)>


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
| **410** | The requested resource doesn&#39;t exist anymore |  -  |
| **500** | Unexpected error occurred |  -  |


## getConnectorClusterNamespaces

> ConnectorNamespaceList getConnectorClusterNamespaces(connectorClusterId, page, size, orderBy, search)

Get a connector cluster&#39;s namespaces

Get a connector cluster&#39;s namespaces

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
        String page = "1"; // String | Page index
        String size = "100"; // String | Number of items in each page
        String orderBy = "name asc"; // String | Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the `order by` clause of an SQL statement. Each query can be ordered by any of the `ConnectorType` fields. For example, to return all Connector types ordered by their name, use the following syntax:  ```sql name asc ```  To return all Connector types ordered by their name _and_ version, use the following syntax:  ```sql name asc, version asc ```  If the parameter isn't provided, or if the value is empty, then the results are ordered by name.
        String search = "name = aws-sqs-source and channel = stable"; // String | Search criteria.  The syntax of this parameter is similar to the syntax of the `where` clause of a SQL statement. Allowed fields in the search are `name`, `description`, `version`, `label`, and `channel`. Allowed operators are `<>`, `=`, or `LIKE`. Allowed conjunctive operators are `AND` and `OR`. However, you can use a maximum of 10 conjunctions in a search query.  Examples:  To return a Connector Type with the name `aws-sqs-source` and the channel `stable`, use the following syntax:  ``` name = aws-sqs-source and channel = stable ```[p-]  To return a Kafka instance with a name that starts with `aws`, use the following syntax:  ``` name like aws%25 ```  If the parameter isn't provided, or if the value is empty, then all the Connector Type that the user has permission to see are returned.  Note. If the query is invalid, an error is returned. 
        try {
            ConnectorNamespaceList result = apiInstance.getConnectorClusterNamespaces(connectorClusterId, page, size, orderBy, search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#getConnectorClusterNamespaces");
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
 **page** | **String**| Page index | [optional]
 **size** | **String**| Number of items in each page | [optional]
 **orderBy** | **String**| Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the &#x60;order by&#x60; clause of an SQL statement. Each query can be ordered by any of the &#x60;ConnectorType&#x60; fields. For example, to return all Connector types ordered by their name, use the following syntax:  &#x60;&#x60;&#x60;sql name asc &#x60;&#x60;&#x60;  To return all Connector types ordered by their name _and_ version, use the following syntax:  &#x60;&#x60;&#x60;sql name asc, version asc &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then the results are ordered by name. | [optional]
 **search** | **String**| Search criteria.  The syntax of this parameter is similar to the syntax of the &#x60;where&#x60; clause of a SQL statement. Allowed fields in the search are &#x60;name&#x60;, &#x60;description&#x60;, &#x60;version&#x60;, &#x60;label&#x60;, and &#x60;channel&#x60;. Allowed operators are &#x60;&lt;&gt;&#x60;, &#x60;&#x3D;&#x60;, or &#x60;LIKE&#x60;. Allowed conjunctive operators are &#x60;AND&#x60; and &#x60;OR&#x60;. However, you can use a maximum of 10 conjunctions in a search query.  Examples:  To return a Connector Type with the name &#x60;aws-sqs-source&#x60; and the channel &#x60;stable&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name &#x3D; aws-sqs-source and channel &#x3D; stable &#x60;&#x60;&#x60;[p-]  To return a Kafka instance with a name that starts with &#x60;aws&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name like aws%25 &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then all the Connector Type that the user has permission to see are returned.  Note. If the query is invalid, an error is returned.  | [optional]

### Return type

[**ConnectorNamespaceList**](ConnectorNamespaceList.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The namespaces visible to user in the cluster. |  -  |
| **401** | Auth token is invalid |  -  |
| **404** | No matching connector cluster type exists |  -  |
| **500** | Unexpected error occurred |  -  |

## getConnectorClusterNamespacesWithHttpInfo

> ApiResponse<ConnectorNamespaceList> getConnectorClusterNamespaces getConnectorClusterNamespacesWithHttpInfo(connectorClusterId, page, size, orderBy, search)

Get a connector cluster&#39;s namespaces

Get a connector cluster&#39;s namespaces

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiResponse;
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
        String page = "1"; // String | Page index
        String size = "100"; // String | Number of items in each page
        String orderBy = "name asc"; // String | Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the `order by` clause of an SQL statement. Each query can be ordered by any of the `ConnectorType` fields. For example, to return all Connector types ordered by their name, use the following syntax:  ```sql name asc ```  To return all Connector types ordered by their name _and_ version, use the following syntax:  ```sql name asc, version asc ```  If the parameter isn't provided, or if the value is empty, then the results are ordered by name.
        String search = "name = aws-sqs-source and channel = stable"; // String | Search criteria.  The syntax of this parameter is similar to the syntax of the `where` clause of a SQL statement. Allowed fields in the search are `name`, `description`, `version`, `label`, and `channel`. Allowed operators are `<>`, `=`, or `LIKE`. Allowed conjunctive operators are `AND` and `OR`. However, you can use a maximum of 10 conjunctions in a search query.  Examples:  To return a Connector Type with the name `aws-sqs-source` and the channel `stable`, use the following syntax:  ``` name = aws-sqs-source and channel = stable ```[p-]  To return a Kafka instance with a name that starts with `aws`, use the following syntax:  ``` name like aws%25 ```  If the parameter isn't provided, or if the value is empty, then all the Connector Type that the user has permission to see are returned.  Note. If the query is invalid, an error is returned. 
        try {
            ApiResponse<ConnectorNamespaceList> response = apiInstance.getConnectorClusterNamespacesWithHttpInfo(connectorClusterId, page, size, orderBy, search);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#getConnectorClusterNamespaces");
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
 **connectorClusterId** | **String**| The id of the connector cluster |
 **page** | **String**| Page index | [optional]
 **size** | **String**| Number of items in each page | [optional]
 **orderBy** | **String**| Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the &#x60;order by&#x60; clause of an SQL statement. Each query can be ordered by any of the &#x60;ConnectorType&#x60; fields. For example, to return all Connector types ordered by their name, use the following syntax:  &#x60;&#x60;&#x60;sql name asc &#x60;&#x60;&#x60;  To return all Connector types ordered by their name _and_ version, use the following syntax:  &#x60;&#x60;&#x60;sql name asc, version asc &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then the results are ordered by name. | [optional]
 **search** | **String**| Search criteria.  The syntax of this parameter is similar to the syntax of the &#x60;where&#x60; clause of a SQL statement. Allowed fields in the search are &#x60;name&#x60;, &#x60;description&#x60;, &#x60;version&#x60;, &#x60;label&#x60;, and &#x60;channel&#x60;. Allowed operators are &#x60;&lt;&gt;&#x60;, &#x60;&#x3D;&#x60;, or &#x60;LIKE&#x60;. Allowed conjunctive operators are &#x60;AND&#x60; and &#x60;OR&#x60;. However, you can use a maximum of 10 conjunctions in a search query.  Examples:  To return a Connector Type with the name &#x60;aws-sqs-source&#x60; and the channel &#x60;stable&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name &#x3D; aws-sqs-source and channel &#x3D; stable &#x60;&#x60;&#x60;[p-]  To return a Kafka instance with a name that starts with &#x60;aws&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name like aws%25 &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then all the Connector Type that the user has permission to see are returned.  Note. If the query is invalid, an error is returned.  | [optional]

### Return type

ApiResponse<[**ConnectorNamespaceList**](ConnectorNamespaceList.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The namespaces visible to user in the cluster. |  -  |
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

## listConnectorClustersWithHttpInfo

> ApiResponse<ConnectorClusterList> listConnectorClusters listConnectorClustersWithHttpInfo(page, size)

Returns a list of connector clusters

Returns a list of connector clusters

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiResponse;
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
            ApiResponse<ConnectorClusterList> response = apiInstance.listConnectorClustersWithHttpInfo(page, size);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#listConnectorClusters");
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
 **page** | **String**| Page index | [optional]
 **size** | **String**| Number of items in each page | [optional]

### Return type

ApiResponse<[**ConnectorClusterList**](ConnectorClusterList.md)>


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

> void updateConnectorClusterById(connectorClusterId, connectorClusterRequest)

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

## updateConnectorClusterByIdWithHttpInfo

> ApiResponse<Void> updateConnectorClusterById updateConnectorClusterByIdWithHttpInfo(connectorClusterId, connectorClusterRequest)

udpate a connector cluster

udpate a connector cluster

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiResponse;
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
            ApiResponse<Void> response = apiInstance.updateConnectorClusterByIdWithHttpInfo(connectorClusterId, connectorClusterRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorClustersApi#updateConnectorClusterById");
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
 **connectorClusterId** | **String**| The id of the connector cluster |
 **connectorClusterRequest** | [**ConnectorClusterRequest**](ConnectorClusterRequest.md)| Data to updated connector with |

### Return type


ApiResponse<Void>

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

