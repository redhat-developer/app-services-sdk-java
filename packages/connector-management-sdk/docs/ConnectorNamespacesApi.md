# ConnectorNamespacesApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEvaluationNamespace**](ConnectorNamespacesApi.md#createEvaluationNamespace) | **POST** /api/connector_mgmt/v1/kafka_connector_namespaces/eval | Create a new short lived evaluation connector namespace
[**createEvaluationNamespaceWithHttpInfo**](ConnectorNamespacesApi.md#createEvaluationNamespaceWithHttpInfo) | **POST** /api/connector_mgmt/v1/kafka_connector_namespaces/eval | Create a new short lived evaluation connector namespace
[**getConnectorNamespace**](ConnectorNamespacesApi.md#getConnectorNamespace) | **GET** /api/connector_mgmt/v1/kafka_connector_namespaces/{connector_namespace_id} | Get a connector namespace
[**getConnectorNamespaceWithHttpInfo**](ConnectorNamespacesApi.md#getConnectorNamespaceWithHttpInfo) | **GET** /api/connector_mgmt/v1/kafka_connector_namespaces/{connector_namespace_id} | Get a connector namespace
[**listConnectorNamespaces**](ConnectorNamespacesApi.md#listConnectorNamespaces) | **GET** /api/connector_mgmt/v1/kafka_connector_namespaces | Returns a list of connector namespaces
[**listConnectorNamespacesWithHttpInfo**](ConnectorNamespacesApi.md#listConnectorNamespacesWithHttpInfo) | **GET** /api/connector_mgmt/v1/kafka_connector_namespaces | Returns a list of connector namespaces



## createEvaluationNamespace

> ConnectorNamespace createEvaluationNamespace(connectorNamespaceEvalRequest)

Create a new short lived evaluation connector namespace

Create a new evaluation connector namespace

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorNamespacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorNamespacesApi apiInstance = new ConnectorNamespacesApi(defaultClient);
        ConnectorNamespaceEvalRequest connectorNamespaceEvalRequest = new ConnectorNamespaceEvalRequest(); // ConnectorNamespaceEvalRequest | Connector namespace data
        try {
            ConnectorNamespace result = apiInstance.createEvaluationNamespace(connectorNamespaceEvalRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorNamespacesApi#createEvaluationNamespace");
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
 **connectorNamespaceEvalRequest** | [**ConnectorNamespaceEvalRequest**](ConnectorNamespaceEvalRequest.md)| Connector namespace data |

### Return type

[**ConnectorNamespace**](ConnectorNamespace.md)


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
| **500** | An unexpected error occurred creating the connector namespace |  -  |

## createEvaluationNamespaceWithHttpInfo

> ApiResponse<ConnectorNamespace> createEvaluationNamespace createEvaluationNamespaceWithHttpInfo(connectorNamespaceEvalRequest)

Create a new short lived evaluation connector namespace

Create a new evaluation connector namespace

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiResponse;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorNamespacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorNamespacesApi apiInstance = new ConnectorNamespacesApi(defaultClient);
        ConnectorNamespaceEvalRequest connectorNamespaceEvalRequest = new ConnectorNamespaceEvalRequest(); // ConnectorNamespaceEvalRequest | Connector namespace data
        try {
            ApiResponse<ConnectorNamespace> response = apiInstance.createEvaluationNamespaceWithHttpInfo(connectorNamespaceEvalRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorNamespacesApi#createEvaluationNamespace");
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
 **connectorNamespaceEvalRequest** | [**ConnectorNamespaceEvalRequest**](ConnectorNamespaceEvalRequest.md)| Connector namespace data |

### Return type

ApiResponse<[**ConnectorNamespace**](ConnectorNamespace.md)>


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
| **500** | An unexpected error occurred creating the connector namespace |  -  |


## getConnectorNamespace

> ConnectorNamespace getConnectorNamespace(connectorNamespaceId)

Get a connector namespace

Get a connector namespace

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorNamespacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorNamespacesApi apiInstance = new ConnectorNamespacesApi(defaultClient);
        String connectorNamespaceId = "connectorNamespaceId_example"; // String | The id of the connector namespace
        try {
            ConnectorNamespace result = apiInstance.getConnectorNamespace(connectorNamespaceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorNamespacesApi#getConnectorNamespace");
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
 **connectorNamespaceId** | **String**| The id of the connector namespace |

### Return type

[**ConnectorNamespace**](ConnectorNamespace.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The connector namespace matching the request |  -  |
| **401** | Auth token is invalid |  -  |
| **404** | No matching connector namespace type exists |  -  |
| **500** | Unexpected error occurred |  -  |

## getConnectorNamespaceWithHttpInfo

> ApiResponse<ConnectorNamespace> getConnectorNamespace getConnectorNamespaceWithHttpInfo(connectorNamespaceId)

Get a connector namespace

Get a connector namespace

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiResponse;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorNamespacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorNamespacesApi apiInstance = new ConnectorNamespacesApi(defaultClient);
        String connectorNamespaceId = "connectorNamespaceId_example"; // String | The id of the connector namespace
        try {
            ApiResponse<ConnectorNamespace> response = apiInstance.getConnectorNamespaceWithHttpInfo(connectorNamespaceId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorNamespacesApi#getConnectorNamespace");
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
 **connectorNamespaceId** | **String**| The id of the connector namespace |

### Return type

ApiResponse<[**ConnectorNamespace**](ConnectorNamespace.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The connector namespace matching the request |  -  |
| **401** | Auth token is invalid |  -  |
| **404** | No matching connector namespace type exists |  -  |
| **500** | Unexpected error occurred |  -  |


## listConnectorNamespaces

> ConnectorNamespaceList listConnectorNamespaces(page, size, orderBy, search)

Returns a list of connector namespaces

Returns a list of connector namespaces

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorNamespacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorNamespacesApi apiInstance = new ConnectorNamespacesApi(defaultClient);
        String page = "1"; // String | Page index
        String size = "100"; // String | Number of items in each page
        String orderBy = "name asc"; // String | Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the `order by` clause of an SQL statement. Each query can be ordered by any of the `ConnectorType` fields. For example, to return all Connector types ordered by their name, use the following syntax:  ```sql name asc ```  To return all Connector types ordered by their name _and_ version, use the following syntax:  ```sql name asc, version asc ```  If the parameter isn't provided, or if the value is empty, then the results are ordered by name.
        String search = "name = aws-sqs-source and channel = stable"; // String | Search criteria.  The syntax of this parameter is similar to the syntax of the `where` clause of a SQL statement. Allowed fields in the search are `name`, `description`, `version`, `label`, and `channel`. Allowed operators are `<>`, `=`, or `LIKE`. Allowed conjunctive operators are `AND` and `OR`. However, you can use a maximum of 10 conjunctions in a search query.  Examples:  To return a Connector Type with the name `aws-sqs-source` and the channel `stable`, use the following syntax:  ``` name = aws-sqs-source and channel = stable ```[p-]  To return a Kafka instance with a name that starts with `aws`, use the following syntax:  ``` name like aws%25 ```  If the parameter isn't provided, or if the value is empty, then all the Connector Type that the user has permission to see are returned.  Note. If the query is invalid, an error is returned. 
        try {
            ConnectorNamespaceList result = apiInstance.listConnectorNamespaces(page, size, orderBy, search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorNamespacesApi#listConnectorNamespaces");
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
| **200** | A list of connector namespaces |  -  |
| **401** | Auth token is invalid |  -  |
| **500** | Unexpected error occurred |  -  |

## listConnectorNamespacesWithHttpInfo

> ApiResponse<ConnectorNamespaceList> listConnectorNamespaces listConnectorNamespacesWithHttpInfo(page, size, orderBy, search)

Returns a list of connector namespaces

Returns a list of connector namespaces

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiResponse;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorNamespacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorNamespacesApi apiInstance = new ConnectorNamespacesApi(defaultClient);
        String page = "1"; // String | Page index
        String size = "100"; // String | Number of items in each page
        String orderBy = "name asc"; // String | Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the `order by` clause of an SQL statement. Each query can be ordered by any of the `ConnectorType` fields. For example, to return all Connector types ordered by their name, use the following syntax:  ```sql name asc ```  To return all Connector types ordered by their name _and_ version, use the following syntax:  ```sql name asc, version asc ```  If the parameter isn't provided, or if the value is empty, then the results are ordered by name.
        String search = "name = aws-sqs-source and channel = stable"; // String | Search criteria.  The syntax of this parameter is similar to the syntax of the `where` clause of a SQL statement. Allowed fields in the search are `name`, `description`, `version`, `label`, and `channel`. Allowed operators are `<>`, `=`, or `LIKE`. Allowed conjunctive operators are `AND` and `OR`. However, you can use a maximum of 10 conjunctions in a search query.  Examples:  To return a Connector Type with the name `aws-sqs-source` and the channel `stable`, use the following syntax:  ``` name = aws-sqs-source and channel = stable ```[p-]  To return a Kafka instance with a name that starts with `aws`, use the following syntax:  ``` name like aws%25 ```  If the parameter isn't provided, or if the value is empty, then all the Connector Type that the user has permission to see are returned.  Note. If the query is invalid, an error is returned. 
        try {
            ApiResponse<ConnectorNamespaceList> response = apiInstance.listConnectorNamespacesWithHttpInfo(page, size, orderBy, search);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorNamespacesApi#listConnectorNamespaces");
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
| **200** | A list of connector namespaces |  -  |
| **401** | Auth token is invalid |  -  |
| **500** | Unexpected error occurred |  -  |

