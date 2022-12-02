# BridgesApi

All URIs are relative to *https://api.stage.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bridgesAPICreateBridge**](BridgesApi.md#bridgesAPICreateBridge) | **POST** /api/smartevents_mgmt/v2/bridges | Create a Bridge instance
[**bridgesAPIDeleteBridge**](BridgesApi.md#bridgesAPIDeleteBridge) | **DELETE** /api/smartevents_mgmt/v2/bridges/{bridgeId} | Delete a Bridge instance
[**bridgesAPIGetBridge**](BridgesApi.md#bridgesAPIGetBridge) | **GET** /api/smartevents_mgmt/v2/bridges/{bridgeId} | Get a Bridge instance
[**bridgesAPIGetBridges**](BridgesApi.md#bridgesAPIGetBridges) | **GET** /api/smartevents_mgmt/v2/bridges | Get the list of Bridge instances
[**bridgesAPIUpdateBridge**](BridgesApi.md#bridgesAPIUpdateBridge) | **PUT** /api/smartevents_mgmt/v2/bridges/{bridgeId} | Update a Bridge instance



## bridgesAPICreateBridge

> BridgeResponse bridgesAPICreateBridge(bridgeRequest)

Create a Bridge instance

Create a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.BridgesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        BridgesApi apiInstance = new BridgesApi(defaultClient);
        BridgeRequest bridgeRequest = new BridgeRequest(); // BridgeRequest | 
        try {
            BridgeResponse result = apiInstance.bridgesAPICreateBridge(bridgeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BridgesApi#bridgesAPICreateBridge");
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
 **bridgeRequest** | [**BridgeRequest**](BridgeRequest.md)|  | [optional]

### Return type

[**BridgeResponse**](BridgeResponse.md)

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
| **500** | Internal error. |  -  |


## bridgesAPIDeleteBridge

> bridgesAPIDeleteBridge(bridgeId)

Delete a Bridge instance

Delete a Bridge instance of the authenticated user by ID.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.BridgesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        BridgesApi apiInstance = new BridgesApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        try {
            apiInstance.bridgesAPIDeleteBridge(bridgeId);
        } catch (ApiException e) {
            System.err.println("Exception when calling BridgesApi#bridgesAPIDeleteBridge");
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


## bridgesAPIGetBridge

> BridgeResponse bridgesAPIGetBridge(bridgeId)

Get a Bridge instance

Get a Bridge instance of the authenticated user by ID.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.BridgesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        BridgesApi apiInstance = new BridgesApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        try {
            BridgeResponse result = apiInstance.bridgesAPIGetBridge(bridgeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BridgesApi#bridgesAPIGetBridge");
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

### Return type

[**BridgeResponse**](BridgeResponse.md)

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


## bridgesAPIGetBridges

> BridgeListResponse bridgesAPIGetBridges(name, page, size, status)

Get the list of Bridge instances

Get the list of Bridge instances for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.BridgesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        BridgesApi apiInstance = new BridgesApi(defaultClient);
        String name = "name_example"; // String | 
        Integer page = 0; // Integer | 
        Integer size = 100; // Integer | 
        Set<ManagedResourceStatus> status = Arrays.asList(); // Set<ManagedResourceStatus> | 
        try {
            BridgeListResponse result = apiInstance.bridgesAPIGetBridges(name, page, size, status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BridgesApi#bridgesAPIGetBridges");
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
 **name** | **String**|  | [optional]
 **page** | **Integer**|  | [optional] [default to 0]
 **size** | **Integer**|  | [optional] [default to 100]
 **status** | [**Set&lt;ManagedResourceStatus&gt;**](ManagedResourceStatus.md)|  | [optional]

### Return type

[**BridgeListResponse**](BridgeListResponse.md)

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


## bridgesAPIUpdateBridge

> BridgeResponse bridgesAPIUpdateBridge(bridgeId, bridgeRequest)

Update a Bridge instance

Update a Bridge instance for the authenticated user.

### Example

```java
// Import classes:
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.auth.*;
import com.openshift.cloud.api.smartevents.invoker.models.*;
import com.openshift.cloud.api.smartevents.BridgesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stage.openshift.com");
        
        // Configure HTTP bearer authorization: bearer
        HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
        bearer.setBearerToken("BEARER TOKEN");

        BridgesApi apiInstance = new BridgesApi(defaultClient);
        String bridgeId = "bridgeId_example"; // String | 
        BridgeRequest bridgeRequest = new BridgeRequest(); // BridgeRequest | 
        try {
            BridgeResponse result = apiInstance.bridgesAPIUpdateBridge(bridgeId, bridgeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BridgesApi#bridgesAPIUpdateBridge");
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
 **bridgeRequest** | [**BridgeRequest**](BridgeRequest.md)|  | [optional]

### Return type

[**BridgeResponse**](BridgeResponse.md)

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

