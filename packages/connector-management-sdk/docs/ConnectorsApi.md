# ConnectorsApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnector**](ConnectorsApi.md#createConnector) | **POST** /api/connector_mgmt/v1/kafka_connectors | Create a new connector
[**deleteConnector**](ConnectorsApi.md#deleteConnector) | **DELETE** /api/connector_mgmt/v1/kafka_connectors/{id} | Delete a connector
[**getConnector**](ConnectorsApi.md#getConnector) | **GET** /api/connector_mgmt/v1/kafka_connectors/{id} | Get a connector
[**listConnectors**](ConnectorsApi.md#listConnectors) | **GET** /api/connector_mgmt/v1/kafka_connectors | Returns a list of connector types
[**patchConnector**](ConnectorsApi.md#patchConnector) | **PATCH** /api/connector_mgmt/v1/kafka_connectors/{id} | Patch a connector



## createConnector

> Connector createConnector(async, connectorRequest)

Create a new connector

Create a new connector

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorsApi apiInstance = new ConnectorsApi(defaultClient);
        Boolean async = true; // Boolean | Perform the action in an asynchronous manner
        ConnectorRequest connectorRequest = new ConnectorRequest(); // ConnectorRequest | Connector data
        try {
            Connector result = apiInstance.createConnector(async, connectorRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorsApi#createConnector");
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
 **connectorRequest** | [**ConnectorRequest**](ConnectorRequest.md)| Connector data |

### Return type

[**Connector**](Connector.md)

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
| **500** | An unexpected error occurred creating the connector |  -  |


## deleteConnector

> Error deleteConnector(id)

Delete a connector

Delete a connector

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorsApi apiInstance = new ConnectorsApi(defaultClient);
        String id = "id_example"; // String | The ID of record
        try {
            Error result = apiInstance.deleteConnector(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorsApi#deleteConnector");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleted |  -  |
| **401** | Auth token is invalid |  -  |
| **404** | No kafka request with specified ID exists |  -  |
| **500** | Unexpected error occurred |  -  |


## getConnector

> Connector getConnector(id)

Get a connector

Get a connector

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorsApi apiInstance = new ConnectorsApi(defaultClient);
        String id = "id_example"; // String | The ID of record
        try {
            Connector result = apiInstance.getConnector(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorsApi#getConnector");
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

[**Connector**](Connector.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The connector matching the request |  -  |
| **401** | Auth token is invalid |  -  |
| **404** | No matching connector exists |  -  |
| **410** | The requested resource doesn&#39;t exist anymore |  -  |
| **500** | Unexpected error occurred |  -  |


## listConnectors

> ConnectorList listConnectors(page, size, orderBy, search)

Returns a list of connector types

Returns a list of connector types

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorsApi apiInstance = new ConnectorsApi(defaultClient);
        String page = "1"; // String | Page index
        String size = "100"; // String | Number of items in each page
        String orderBy = "name asc"; // String | Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the `order by` clause of an SQL statement. Each query can be ordered by any of the underlying resource fields supported in the search parameter. For example, to return all Connector types ordered by their name, use the following syntax:  ```sql name asc ```  To return all Connector types ordered by their name _and_ version, use the following syntax:  ```sql name asc, version asc ```  To return connector types with labels `category-featured` AND `source`, use the following syntax:  ``` label like %25category-featured%25source% ```  NOTE: The AND operator does not work for multiple labels. Instead use an alphabetically ascending order pattern with the LIKE operator to match an aggregated list of ',' separated label names.  If the parameter isn't provided, or if the value is empty, then the results are ordered by name.
        String search = "name = aws-sqs-source and channel = stable"; // String | Search criteria.  The syntax of this parameter is similar to the syntax of the `where` clause of a SQL statement.  Allowed fields in the search depend on the resource type:  * Cluster: id, created_at, updated_at, owner, organisation_id, name, state, client_id * Namespace: id, created_at, updated_at, name, cluster_id, owner, expiration, tenant_user_id, tenant_organisation_id, state * Connector Types: id, created_at, updated_at, version, name, description, label, channel, featured_rank, pricing_tier * Connectors: id, created_at, updated_at, name, owner, organisation_id, connector_type_id, desired_state, state, channel, namespace_id, kafka_id, kafka_bootstrap_server, service_account_client_id, schema_registry_id, schema_registry_url  Allowed operators are `<>`, `=`, `LIKE`, or `ILIKE`. Allowed conjunctive operators are `AND` and `OR`. However, you can use a maximum of 10 conjunctions in a search query.  Examples:  To return a Connector Type with the name `aws-sqs-source` and the channel `stable`, use the following syntax:  ``` name = aws-sqs-source and channel = stable ```  To return a connector instance with a name that starts with `aws`, use the following syntax:  ``` name like aws%25 ```  To return a connector type with a name containing `aws` matching any character case combination, use the following syntax:  ``` name ilike %25aws%25 ```  To return connector types with labels `category-featured` AND `source`, use the following syntax:  ``` label like %25category-featured%25source% ```  NOTE: The AND operator does not work for multiple labels. Instead use an alphabetically ascending order pattern with the LIKE operator to match an aggregated list of ',' separated label names.  If the parameter isn't provided, or if the value is empty, then all the resources that the user has permission to see are returned.  Note. If the query is invalid, an error is returned. 
        try {
            ConnectorList result = apiInstance.listConnectors(page, size, orderBy, search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorsApi#listConnectors");
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
 **orderBy** | **String**| Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the &#x60;order by&#x60; clause of an SQL statement. Each query can be ordered by any of the underlying resource fields supported in the search parameter. For example, to return all Connector types ordered by their name, use the following syntax:  &#x60;&#x60;&#x60;sql name asc &#x60;&#x60;&#x60;  To return all Connector types ordered by their name _and_ version, use the following syntax:  &#x60;&#x60;&#x60;sql name asc, version asc &#x60;&#x60;&#x60;  To return connector types with labels &#x60;category-featured&#x60; AND &#x60;source&#x60;, use the following syntax:  &#x60;&#x60;&#x60; label like %25category-featured%25source% &#x60;&#x60;&#x60;  NOTE: The AND operator does not work for multiple labels. Instead use an alphabetically ascending order pattern with the LIKE operator to match an aggregated list of &#39;,&#39; separated label names.  If the parameter isn&#39;t provided, or if the value is empty, then the results are ordered by name. | [optional]
 **search** | **String**| Search criteria.  The syntax of this parameter is similar to the syntax of the &#x60;where&#x60; clause of a SQL statement.  Allowed fields in the search depend on the resource type:  * Cluster: id, created_at, updated_at, owner, organisation_id, name, state, client_id * Namespace: id, created_at, updated_at, name, cluster_id, owner, expiration, tenant_user_id, tenant_organisation_id, state * Connector Types: id, created_at, updated_at, version, name, description, label, channel, featured_rank, pricing_tier * Connectors: id, created_at, updated_at, name, owner, organisation_id, connector_type_id, desired_state, state, channel, namespace_id, kafka_id, kafka_bootstrap_server, service_account_client_id, schema_registry_id, schema_registry_url  Allowed operators are &#x60;&lt;&gt;&#x60;, &#x60;&#x3D;&#x60;, &#x60;LIKE&#x60;, or &#x60;ILIKE&#x60;. Allowed conjunctive operators are &#x60;AND&#x60; and &#x60;OR&#x60;. However, you can use a maximum of 10 conjunctions in a search query.  Examples:  To return a Connector Type with the name &#x60;aws-sqs-source&#x60; and the channel &#x60;stable&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name &#x3D; aws-sqs-source and channel &#x3D; stable &#x60;&#x60;&#x60;  To return a connector instance with a name that starts with &#x60;aws&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name like aws%25 &#x60;&#x60;&#x60;  To return a connector type with a name containing &#x60;aws&#x60; matching any character case combination, use the following syntax:  &#x60;&#x60;&#x60; name ilike %25aws%25 &#x60;&#x60;&#x60;  To return connector types with labels &#x60;category-featured&#x60; AND &#x60;source&#x60;, use the following syntax:  &#x60;&#x60;&#x60; label like %25category-featured%25source% &#x60;&#x60;&#x60;  NOTE: The AND operator does not work for multiple labels. Instead use an alphabetically ascending order pattern with the LIKE operator to match an aggregated list of &#39;,&#39; separated label names.  If the parameter isn&#39;t provided, or if the value is empty, then all the resources that the user has permission to see are returned.  Note. If the query is invalid, an error is returned.  | [optional]

### Return type

[**ConnectorList**](ConnectorList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of connectors |  -  |
| **401** | Auth token is invalid |  -  |
| **500** | Unexpected error occurred |  -  |


## patchConnector

> Connector patchConnector(id, body)

Patch a connector

Patch a connector

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorsApi apiInstance = new ConnectorsApi(defaultClient);
        String id = "id_example"; // String | The ID of record
        Object body = null; // Object | Data to patch the connector with
        try {
            Connector result = apiInstance.patchConnector(id, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorsApi#patchConnector");
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
 **body** | **Object**| Data to patch the connector with |

### Return type

[**Connector**](Connector.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/merge-patch+json, application/json-patch+json, application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The connector matching the request |  -  |
| **401** | Auth token is invalid |  -  |
| **404** | No matching resource exists |  -  |
| **410** | The requested resource doesn&#39;t exist anymore |  -  |
| **500** | Unexpected error occurred |  -  |

