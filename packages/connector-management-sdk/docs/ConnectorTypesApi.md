# ConnectorTypesApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConnectorTypeByID**](ConnectorTypesApi.md#getConnectorTypeByID) | **GET** /api/connector_mgmt/v1/kafka_connector_types/{connector_type_id} | Get a connector type by id
[**listConnectorTypes**](ConnectorTypesApi.md#listConnectorTypes) | **GET** /api/connector_mgmt/v1/kafka_connector_types | Returns a list of connector types



## getConnectorTypeByID

> ConnectorType getConnectorTypeByID(connectorTypeId)

Get a connector type by id

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorTypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorTypesApi apiInstance = new ConnectorTypesApi(defaultClient);
        String connectorTypeId = "connectorTypeId_example"; // String | The id of the connector type
        try {
            ConnectorType result = apiInstance.getConnectorTypeByID(connectorTypeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorTypesApi#getConnectorTypeByID");
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
 **connectorTypeId** | **String**| The id of the connector type |

### Return type

[**ConnectorType**](ConnectorType.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The connector type matching the request |  -  |
| **401** | Auth token is invalid |  -  |
| **404** | No matching connector type exists |  -  |
| **500** | Unexpected error occurred |  -  |


## listConnectorTypes

> ConnectorTypeList listConnectorTypes(page, size)

Returns a list of connector types

### Example

```java
// Import classes:
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.auth.*;
import com.openshift.cloud.api.connector.invoker.models.*;
import com.openshift.cloud.api.connector.ConnectorTypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ConnectorTypesApi apiInstance = new ConnectorTypesApi(defaultClient);
        String page = "1"; // String | Page index
        String size = "100"; // String | Number of items in each page
        try {
            ConnectorTypeList result = apiInstance.listConnectorTypes(page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectorTypesApi#listConnectorTypes");
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

[**ConnectorTypeList**](ConnectorTypeList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of connector types |  -  |
| **401** | Auth token is invalid |  -  |
| **500** | Unexpected error occurred |  -  |

