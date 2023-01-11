# SourceConnectorsApi

All URIs are relative to *https://api.stage.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sourceConnectorsAPICreateSourceConnector**](SourceConnectorsApi.md#sourceConnectorsAPICreateSourceConnector) | **POST** /api/smartevents_mgmt/v2/bridges/{bridgeId}/sources | Create a Source Connector for a Bridge instance
[**sourceConnectorsAPIDeleteSourceConnector**](SourceConnectorsApi.md#sourceConnectorsAPIDeleteSourceConnector) | **DELETE** /api/smartevents_mgmt/v2/bridges/{bridgeId}/sources/{sourceId} | Delete a Source Connector of a Bridge instance
[**sourceConnectorsAPIGetSourceConnector**](SourceConnectorsApi.md#sourceConnectorsAPIGetSourceConnector) | **GET** /api/smartevents_mgmt/v2/bridges/{bridgeId}/sources/{sourceId} | Get a Source Connector of a Bridge instance
[**sourceConnectorsAPIGetSourceConnectors**](SourceConnectorsApi.md#sourceConnectorsAPIGetSourceConnectors) | **GET** /api/smartevents_mgmt/v2/bridges/{bridgeId}/sources | Get the list of Sink Connectors for a Bridge
[**sourceConnectorsAPIUpdateSourceConnector**](SourceConnectorsApi.md#sourceConnectorsAPIUpdateSourceConnector) | **PUT** /api/smartevents_mgmt/v2/bridges/{bridgeId}/sources/{sourceId} | Update a Source Connector instance.



## sourceConnectorsAPICreateSourceConnector

> SourceConnectorResponse sourceConnectorsAPICreateSourceConnector(bridgeId, connectorRequest)

Create a Source Connector for a Bridge instance

Create a Source Connector of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SourceConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SourceConnectorsApi apiInstance = new SourceConnectorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        ConnectorRequest connectorRequest = new ConnectorRequest(); // ConnectorRequest | 
        try {
            SourceConnectorResponse result = apiInstance.sourceConnectorsAPICreateSourceConnector(bridgeId, connectorRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourceConnectorsApi#sourceConnectorsAPICreateSourceConnector");
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

[**SourceConnectorResponse**](SourceConnectorResponse.md)

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


## sourceConnectorsAPIDeleteSourceConnector

> sourceConnectorsAPIDeleteSourceConnector(bridgeId, sourceId)

Delete a Source Connector of a Bridge instance

Delete a Source Connector of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SourceConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SourceConnectorsApi apiInstance = new SourceConnectorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String sourceId = "sourceId_example"; // String | 
        try {
            apiInstance.sourceConnectorsAPIDeleteSourceConnector(bridgeId, sourceId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourceConnectorsApi#sourceConnectorsAPIDeleteSourceConnector");
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
 **sourceId** | **String**|  |

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


## sourceConnectorsAPIGetSourceConnector

> SourceConnectorResponse sourceConnectorsAPIGetSourceConnector(bridgeId, sourceId)

Get a Source Connector of a Bridge instance

Get a Source Connector of a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SourceConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SourceConnectorsApi apiInstance = new SourceConnectorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String sourceId = "sourceId_example"; // String | 
        try {
            SourceConnectorResponse result = apiInstance.sourceConnectorsAPIGetSourceConnector(bridgeId, sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourceConnectorsApi#sourceConnectorsAPIGetSourceConnector");
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
 **sourceId** | **String**|  |

### Return type

[**SourceConnectorResponse**](SourceConnectorResponse.md)

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


## sourceConnectorsAPIGetSourceConnectors

> SourceConnectorListResponse sourceConnectorsAPIGetSourceConnectors(bridgeId, name, page, size, status)

Get the list of Sink Connectors for a Bridge

Get the list of Source Connector instances of a Bridge instance instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SourceConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SourceConnectorsApi apiInstance = new SourceConnectorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String name = "name_example"; // String | 
        Integer page = 0; // Integer | 
        Integer size = 100; // Integer | 
        Set<ManagedResourceStatus> status = Arrays.asList(); // Set<ManagedResourceStatus> | 
        try {
            SourceConnectorListResponse result = apiInstance.sourceConnectorsAPIGetSourceConnectors(bridgeId, name, page, size, status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourceConnectorsApi#sourceConnectorsAPIGetSourceConnectors");
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

[**SourceConnectorListResponse**](SourceConnectorListResponse.md)

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


## sourceConnectorsAPIUpdateSourceConnector

> SourceConnectorResponse sourceConnectorsAPIUpdateSourceConnector(bridgeId, sourceId, connectorRequest)

Update a Source Connector instance.

Update a Source Connector instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SourceConnectorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SourceConnectorsApi apiInstance = new SourceConnectorsApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        String sourceId = "sourceId_example"; // String | 
        ConnectorRequest connectorRequest = new ConnectorRequest(); // ConnectorRequest | 
        try {
            SourceConnectorResponse result = apiInstance.sourceConnectorsAPIUpdateSourceConnector(bridgeId, sourceId, connectorRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourceConnectorsApi#sourceConnectorsAPIUpdateSourceConnector");
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
 **sourceId** | **String**|  |
 **connectorRequest** | [**ConnectorRequest**](ConnectorRequest.md)|  | [optional]

### Return type

[**SourceConnectorResponse**](SourceConnectorResponse.md)

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

