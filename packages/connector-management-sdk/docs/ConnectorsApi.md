# ConnectorsApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnector**](ConnectorsApi.md#createConnector) | **POST** /api/connector_mgmt/v1/kafka_connectors | Create a new connector
[**deleteConnector**](ConnectorsApi.md#deleteConnector) | **DELETE** /api/connector_mgmt/v1/kafka_connectors/{id} | Delete a connector
[**getConnector**](ConnectorsApi.md#getConnector) | **GET** /api/connector_mgmt/v1/kafka_connectors/{id} | Get a connector
[**listConnectors**](ConnectorsApi.md#listConnectors) | **GET** /api/connector_mgmt/v1/kafka_connectors | Returns a list of connector types
[**patchConnector**](ConnectorsApi.md#patchConnector) | **PATCH** /api/connector_mgmt/v1/kafka_connectors/{id} | patch a connector



## createConnector

> Connector createConnector(async, connector)

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
        Connector connector = new Connector(); // Connector | Connector data
        try {
            Connector result = apiInstance.createConnector(async, connector);
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
 **connector** | [**Connector**](Connector.md)| Connector data |

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

> Error deleteConnector(id, kafkaId)

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
        String kafkaId = "kafkaId_example"; // String | The kafka cluster id
        try {
            Error result = apiInstance.deleteConnector(id, kafkaId);
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
 **kafkaId** | **String**| The kafka cluster id | [optional]

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

> Connector getConnector(id, kafkaId)

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
        String kafkaId = "kafkaId_example"; // String | The kafka cluster id
        try {
            Connector result = apiInstance.getConnector(id, kafkaId);
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
 **kafkaId** | **String**| The kafka cluster id | [optional]

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
| **404** | No matching connector type exists |  -  |
| **500** | Unexpected error occurred |  -  |


## listConnectors

> ConnectorList listConnectors(page, size, kafkaId)

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
        String kafkaId = "kafkaId_example"; // String | The kafka cluster id
        try {
            ConnectorList result = apiInstance.listConnectors(page, size, kafkaId);
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
 **kafkaId** | **String**| The kafka cluster id | [optional]

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

> Connector patchConnector(id, connector, kafkaId)

patch a connector

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
        Connector connector = new Connector(); // Connector | Data to patch the connector with
        String kafkaId = "kafkaId_example"; // String | The kafka cluster id
        try {
            Connector result = apiInstance.patchConnector(id, connector, kafkaId);
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
 **connector** | [**Connector**](Connector.md)| Data to patch the connector with |
 **kafkaId** | **String**| The kafka cluster id | [optional]

### Return type

[**Connector**](Connector.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json, application/merge-patch+json, application/json-patch+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The connector matching the request |  -  |
| **401** | Auth token is invalid |  -  |
| **404** | No matching connector type exists |  -  |
| **500** | Unexpected error occurred |  -  |

