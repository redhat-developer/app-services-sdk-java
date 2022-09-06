# SchemaCatalogApi

All URIs are relative to *https://api.stage.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schemaAPIGetActionProcessorSchema**](SchemaCatalogApi.md#schemaAPIGetActionProcessorSchema) | **GET** /api/smartevents_mgmt/v1/schemas/actions/{id} | Get action processor schema
[**schemaAPIGetCatalog**](SchemaCatalogApi.md#schemaAPIGetCatalog) | **GET** /api/smartevents_mgmt/v1/schemas | Get processor catalog
[**schemaAPIGetSourceProcessorSchema**](SchemaCatalogApi.md#schemaAPIGetSourceProcessorSchema) | **GET** /api/smartevents_mgmt/v1/schemas/sources/{id} | Get source processor schema



## schemaAPIGetActionProcessorSchema

> Object schemaAPIGetActionProcessorSchema(id)

Get action processor schema

Get the action processor JSON schema.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SchemaCatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SchemaCatalogApi apiInstance = new SchemaCatalogApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            Object result = apiInstance.schemaAPIGetActionProcessorSchema(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaCatalogApi#schemaAPIGetActionProcessorSchema");
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
 **id** | **String**|  |

### Return type

**Object**

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
| **500** | Internal error. |  -  |


## schemaAPIGetCatalog

> ProcessorCatalogResponse schemaAPIGetCatalog()

Get processor catalog

Get the processor catalog with all the available sources and actions.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SchemaCatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SchemaCatalogApi apiInstance = new SchemaCatalogApi(defaultClient);
        try {
            ProcessorCatalogResponse result = apiInstance.schemaAPIGetCatalog();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaCatalogApi#schemaAPIGetCatalog");
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

[**ProcessorCatalogResponse**](ProcessorCatalogResponse.md)

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
| **500** | Internal error. |  -  |


## schemaAPIGetSourceProcessorSchema

> Object schemaAPIGetSourceProcessorSchema(id)

Get source processor schema

Get the source processor JSON schema.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.SchemaCatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        SchemaCatalogApi apiInstance = new SchemaCatalogApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            Object result = apiInstance.schemaAPIGetSourceProcessorSchema(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaCatalogApi#schemaAPIGetSourceProcessorSchema");
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
 **id** | **String**|  |

### Return type

**Object**

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
| **500** | Internal error. |  -  |

