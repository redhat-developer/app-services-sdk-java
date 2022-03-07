# ServiceaccountsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getServiceAccount**](ServiceaccountsApi.md#getServiceAccount) | **GET** /apis/service_accounts/v1/{id} | Get service account by id
[**resetServiceAccountSecret**](ServiceaccountsApi.md#resetServiceAccountSecret) | **POST** /apis/service_accounts/v1/{id}/resetSecret | Reset service account secret by id



## getServiceAccount

> ServiceAccountData getServiceAccount(id)

Get service account by id

Returns service account by id. Throws not found exception if the service account is not found or the user does not have access to this service account

### Example

```java
// Import classes:
import com.openshift.cloud.api.serviceaccounts.invoker.ApiClient;
import com.openshift.cloud.api.serviceaccounts.invoker.ApiException;
import com.openshift.cloud.api.serviceaccounts.invoker.Configuration;
import com.openshift.cloud.api.serviceaccounts.invoker.auth.*;
import com.openshift.cloud.api.serviceaccounts.invoker.models.*;
import com.openshift.cloud.api.serviceaccounts.ServiceaccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceaccountsApi apiInstance = new ServiceaccountsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ServiceAccountData result = apiInstance.getServiceAccount(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceaccountsApi#getServiceAccount");
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

[**ServiceAccountData**](ServiceAccountData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |


## resetServiceAccountSecret

> ServiceAccountData resetServiceAccountSecret(id)

Reset service account secret by id

Reset service account secret by id . Throws not found exception if the service account is not found or the user does not have access to this service account

### Example

```java
// Import classes:
import com.openshift.cloud.api.serviceaccounts.invoker.ApiClient;
import com.openshift.cloud.api.serviceaccounts.invoker.ApiException;
import com.openshift.cloud.api.serviceaccounts.invoker.Configuration;
import com.openshift.cloud.api.serviceaccounts.invoker.auth.*;
import com.openshift.cloud.api.serviceaccounts.invoker.models.*;
import com.openshift.cloud.api.serviceaccounts.ServiceaccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ServiceaccountsApi apiInstance = new ServiceaccountsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ServiceAccountData result = apiInstance.resetServiceAccountSecret(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceaccountsApi#resetServiceAccountSecret");
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

[**ServiceAccountData**](ServiceAccountData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **401** | Unauthorized |  -  |

