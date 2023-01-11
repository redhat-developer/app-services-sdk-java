# SinkConnectorsApi

All URIs are relative to *https://api.stage.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sinkConnectorsAPICreateSinkConnector**](SinkConnectorsApi.md#sinkConnectorsAPICreateSinkConnector) | **POST** /api/smartevents_mgmt/v2/bridges/{bridgeId}/sinks | Create a Sink Connector for a Bridge instance
[**sinkConnectorsAPIDeleteSinkConnector**](SinkConnectorsApi.md#sinkConnectorsAPIDeleteSinkConnector) | **DELETE** /api/smartevents_mgmt/v2/bridges/{bridgeId}/sinks/{sinkId} | Delete a Sink Connector of a Bridge instance
[**sinkConnectorsAPIGetSinkConnector**](SinkConnectorsApi.md#sinkConnectorsAPIGetSinkConnector) | **GET** /api/smartevents_mgmt/v2/bridges/{bridgeId}/sinks/{sinkId} | Get a Sink Connector of a Bridge instance
[**sinkConnectorsAPIGetSinkConnectors**](SinkConnectorsApi.md#sinkConnectorsAPIGetSinkConnectors) | **GET** /api/smartevents_mgmt/v2/bridges/{bridgeId}/sinks | Get the list of Sink Connectors for a Bridge
[**sinkConnectorsAPIUpdateSinkConnector**](SinkConnectorsApi.md#sinkConnectorsAPIUpdateSinkConnector) | **PUT** /api/smartevents_mgmt/v2/bridges/{bridgeId}/sinks/{sinkId} | Update a Sink Connector instance.



## sinkConnectorsAPICreateSinkConnector

> SinkConnectorResponse sinkConnectorsAPICreateSinkConnector(bridgeId, connectorRequest)

Create a Sink Connector for a Bridge instance

Create a Sink Connector of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SinkConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SinkConnectorsApi apiInstance = new SinkConnectorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        ConnectorRequest connectorRequest = new ConnectorRequest(); // ConnectorRequest | 
        try {
            SinkConnectorResponse result = apiInstance.sinkConnectorsAPICreateSinkConnector(bridgeId, connectorRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinkConnectorsApi#sinkConnectorsAPICreateSinkConnector");
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
 **bridgeId** | **String**|  |
 **connectorRequest** | [**ConnectorRequest**](ConnectorRequest.md)|  | [optional]

### Return type

[**SinkConnectorResponse**](SinkConnectorResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **402** | Not enough quota. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |


## sinkConnectorsAPIDeleteSinkConnector

> sinkConnectorsAPIDeleteSinkConnector(bridgeId, sinkId)

Delete a Sink Connector of a Bridge instance

Delete a Sink Connector of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SinkConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SinkConnectorsApi apiInstance = new SinkConnectorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String sinkId = "sinkId_example"; // String | 
        try {
            apiInstance.sinkConnectorsAPIDeleteSinkConnector(bridgeId, sinkId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinkConnectorsApi#sinkConnectorsAPIDeleteSinkConnector");
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
 **bridgeId** | **String**|  |
 **sinkId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |


## sinkConnectorsAPIGetSinkConnector

> SinkConnectorResponse sinkConnectorsAPIGetSinkConnector(bridgeId, sinkId)

Get a Sink Connector of a Bridge instance

Get a Sink Connector of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SinkConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SinkConnectorsApi apiInstance = new SinkConnectorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String sinkId = "sinkId_example"; // String | 
        try {
            SinkConnectorResponse result = apiInstance.sinkConnectorsAPIGetSinkConnector(bridgeId, sinkId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinkConnectorsApi#sinkConnectorsAPIGetSinkConnector");
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
 **bridgeId** | **String**|  |
 **sinkId** | **String**|  |

### Return type

[**SinkConnectorResponse**](SinkConnectorResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |


## sinkConnectorsAPIGetSinkConnectors

> SinkConnectorListResponse sinkConnectorsAPIGetSinkConnectors(bridgeId, name, page, size, status)

Get the list of Sink Connectors for a Bridge

Get the list of Sink Connector instances of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SinkConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SinkConnectorsApi apiInstance = new SinkConnectorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String name = "name_example"; // String | 
        Integer page = 0; // Integer | 
        Integer size = 100; // Integer | 
        Set<ManagedResourceStatus> status = Arrays.asList(); // Set<ManagedResourceStatus> | 
        try {
            SinkConnectorListResponse result = apiInstance.sinkConnectorsAPIGetSinkConnectors(bridgeId, name, page, size, status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinkConnectorsApi#sinkConnectorsAPIGetSinkConnectors");
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
 **bridgeId** | **String**|  |
 **name** | **String**|  | [optional]
 **page** | **Integer**|  | [optional] [default to 0]
 **size** | **Integer**|  | [optional] [default to 100]
 **status** | [**Set&lt;ManagedResourceStatus&gt;**](ManagedResourceStatus.md)|  | [optional]

### Return type

[**SinkConnectorListResponse**](SinkConnectorListResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |


## sinkConnectorsAPIUpdateSinkConnector

> SinkConnectorResponse sinkConnectorsAPIUpdateSinkConnector(bridgeId, sinkId, connectorRequest)

Update a Sink Connector instance.

Update a Sink Connector instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SinkConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SinkConnectorsApi apiInstance = new SinkConnectorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String sinkId = "sinkId_example"; // String | 
        ConnectorRequest connectorRequest = new ConnectorRequest(); // ConnectorRequest | 
        try {
            SinkConnectorResponse result = apiInstance.sinkConnectorsAPIUpdateSinkConnector(bridgeId, sinkId, connectorRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinkConnectorsApi#sinkConnectorsAPIUpdateSinkConnector");
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
 **bridgeId** | **String**|  |
 **sinkId** | **String**|  |
 **connectorRequest** | [**ConnectorRequest**](ConnectorRequest.md)|  | [optional]

### Return type

[**SinkConnectorResponse**](SinkConnectorResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **404** | Not found. |  -  |
| **500** | Internal error. |  -  |

