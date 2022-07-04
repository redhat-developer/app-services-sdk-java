# ServiceAccountsApi

All URIs are relative to *https://sso.redhat.com/auth/realms/redhat-external*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceAccount**](ServiceAccountsApi.md#createServiceAccount) | **POST** /apis/service_accounts/v1 | Create service account
[**deleteServiceAccount**](ServiceAccountsApi.md#deleteServiceAccount) | **DELETE** /apis/service_accounts/v1/{id} | Delete service account by id
[**getServiceAccount**](ServiceAccountsApi.md#getServiceAccount) | **GET** /apis/service_accounts/v1/{id} | Get service account by id
[**getServiceAccounts**](ServiceAccountsApi.md#getServiceAccounts) | **GET** /apis/service_accounts/v1 | List all service accounts
[**resetServiceAccountSecret**](ServiceAccountsApi.md#resetServiceAccountSecret) | **POST** /apis/service_accounts/v1/{id}/resetSecret | Reset service account secret by id
[**updateServiceAccount**](ServiceAccountsApi.md#updateServiceAccount) | **PATCH** /apis/service_accounts/v1/{id} | Update service account



## createServiceAccount

> ServiceAccountData createServiceAccount(serviceAccountCreateRequestData)

Create service account

Create a service account. Created service account is associated with the user defined in the bearer token.

### Example

```java
// Import classes:
import com.openshift.cloud.api.serviceaccounts.invoker.ApiClient;
import com.openshift.cloud.api.serviceaccounts.invoker.ApiException;
import com.openshift.cloud.api.serviceaccounts.invoker.Configuration;
import com.openshift.cloud.api.serviceaccounts.invoker.auth.*;
import com.openshift.cloud.api.serviceaccounts.invoker.models.*;
import com.openshift.cloud.api.serviceaccounts.ServiceAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sso.redhat.com/auth/realms/redhat-external");
        
        // Configure OAuth2 access token for authorization: authFlow
        OAuth authFlow = (OAuth) defaultClient.getAuthentication("authFlow");
        authFlow.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2 access token for authorization: serviceAccounts
        OAuth serviceAccounts = (OAuth) defaultClient.getAuthentication("serviceAccounts");
        serviceAccounts.setAccessToken("YOUR ACCESS TOKEN");

        ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
        ServiceAccountCreateRequestData serviceAccountCreateRequestData = new ServiceAccountCreateRequestData(); // ServiceAccountCreateRequestData | 'name' and 'description' of the service account
        try {
            ServiceAccountData result = apiInstance.createServiceAccount(serviceAccountCreateRequestData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceAccountsApi#createServiceAccount");
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
 **serviceAccountCreateRequestData** | [**ServiceAccountCreateRequestData**](ServiceAccountCreateRequestData.md)| &#39;name&#39; and &#39;description&#39; of the service account |

### Return type

[**ServiceAccountData**](ServiceAccountData.md)

### Authorization

[authFlow](../README.md#authFlow), [serviceAccounts](../README.md#serviceAccounts)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **400** | All fields did not pass validation. |  -  |
| **401** | Unauthorized |  -  |
| **403** | Exceeded account level threshold limits for creating service accounts. |  -  |


## deleteServiceAccount

> deleteServiceAccount(id)

Delete service account by id

Delete service account by id. Throws not found exception if the service account is not found or the user does not have access to this service account

### Example

```java
// Import classes:
import com.openshift.cloud.api.serviceaccounts.invoker.ApiClient;
import com.openshift.cloud.api.serviceaccounts.invoker.ApiException;
import com.openshift.cloud.api.serviceaccounts.invoker.Configuration;
import com.openshift.cloud.api.serviceaccounts.invoker.auth.*;
import com.openshift.cloud.api.serviceaccounts.invoker.models.*;
import com.openshift.cloud.api.serviceaccounts.ServiceAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sso.redhat.com/auth/realms/redhat-external");
        
        // Configure OAuth2 access token for authorization: authFlow
        OAuth authFlow = (OAuth) defaultClient.getAuthentication("authFlow");
        authFlow.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2 access token for authorization: serviceAccounts
        OAuth serviceAccounts = (OAuth) defaultClient.getAuthentication("serviceAccounts");
        serviceAccounts.setAccessToken("YOUR ACCESS TOKEN");

        ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            apiInstance.deleteServiceAccount(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceAccountsApi#deleteServiceAccount");
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

null (empty response body)

### Authorization

[authFlow](../README.md#authFlow), [serviceAccounts](../README.md#serviceAccounts)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |


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
import com.openshift.cloud.api.serviceaccounts.ServiceAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sso.redhat.com/auth/realms/redhat-external");
        
        // Configure OAuth2 access token for authorization: authFlow
        OAuth authFlow = (OAuth) defaultClient.getAuthentication("authFlow");
        authFlow.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2 access token for authorization: serviceAccounts
        OAuth serviceAccounts = (OAuth) defaultClient.getAuthentication("serviceAccounts");
        serviceAccounts.setAccessToken("YOUR ACCESS TOKEN");

        ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ServiceAccountData result = apiInstance.getServiceAccount(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceAccountsApi#getServiceAccount");
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

[authFlow](../README.md#authFlow), [serviceAccounts](../README.md#serviceAccounts)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |


## getServiceAccounts

> List&lt;ServiceAccountData&gt; getServiceAccounts(first, max, clientId)

List all service accounts

Returns a list of service accounts created by a user. User information is obtained from the bearer token. The list is paginated with starting index as &#39;first&#39; and page size as &#39;max&#39;.

### Example

```java
// Import classes:
import com.openshift.cloud.api.serviceaccounts.invoker.ApiClient;
import com.openshift.cloud.api.serviceaccounts.invoker.ApiException;
import com.openshift.cloud.api.serviceaccounts.invoker.Configuration;
import com.openshift.cloud.api.serviceaccounts.invoker.auth.*;
import com.openshift.cloud.api.serviceaccounts.invoker.models.*;
import com.openshift.cloud.api.serviceaccounts.ServiceAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sso.redhat.com/auth/realms/redhat-external");
        
        // Configure OAuth2 access token for authorization: authFlow
        OAuth authFlow = (OAuth) defaultClient.getAuthentication("authFlow");
        authFlow.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2 access token for authorization: serviceAccounts
        OAuth serviceAccounts = (OAuth) defaultClient.getAuthentication("serviceAccounts");
        serviceAccounts.setAccessToken("YOUR ACCESS TOKEN");

        ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
        Integer first = 0; // Integer | 
        Integer max = 20; // Integer | 
        Set<String> clientId = Arrays.asList(); // Set<String> | 
        try {
            List<ServiceAccountData> result = apiInstance.getServiceAccounts(first, max, clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceAccountsApi#getServiceAccounts");
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
 **first** | **Integer**|  | [optional] [default to 0]
 **max** | **Integer**|  | [optional] [default to 20]
 **clientId** | [**Set&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**List&lt;ServiceAccountData&gt;**](ServiceAccountData.md)

### Authorization

[authFlow](../README.md#authFlow), [serviceAccounts](../README.md#serviceAccounts)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request if page filters are invalid |  -  |
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
import com.openshift.cloud.api.serviceaccounts.ServiceAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sso.redhat.com/auth/realms/redhat-external");
        
        // Configure OAuth2 access token for authorization: authFlow
        OAuth authFlow = (OAuth) defaultClient.getAuthentication("authFlow");
        authFlow.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2 access token for authorization: serviceAccounts
        OAuth serviceAccounts = (OAuth) defaultClient.getAuthentication("serviceAccounts");
        serviceAccounts.setAccessToken("YOUR ACCESS TOKEN");

        ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            ServiceAccountData result = apiInstance.resetServiceAccountSecret(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceAccountsApi#resetServiceAccountSecret");
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

[authFlow](../README.md#authFlow), [serviceAccounts](../README.md#serviceAccounts)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |


## updateServiceAccount

> ServiceAccountData updateServiceAccount(id, serviceAccountRequestData)

Update service account

Update a service account by id.

### Example

```java
// Import classes:
import com.openshift.cloud.api.serviceaccounts.invoker.ApiClient;
import com.openshift.cloud.api.serviceaccounts.invoker.ApiException;
import com.openshift.cloud.api.serviceaccounts.invoker.Configuration;
import com.openshift.cloud.api.serviceaccounts.invoker.auth.*;
import com.openshift.cloud.api.serviceaccounts.invoker.models.*;
import com.openshift.cloud.api.serviceaccounts.ServiceAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sso.redhat.com/auth/realms/redhat-external");
        
        // Configure OAuth2 access token for authorization: authFlow
        OAuth authFlow = (OAuth) defaultClient.getAuthentication("authFlow");
        authFlow.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2 access token for authorization: serviceAccounts
        OAuth serviceAccounts = (OAuth) defaultClient.getAuthentication("serviceAccounts");
        serviceAccounts.setAccessToken("YOUR ACCESS TOKEN");

        ServiceAccountsApi apiInstance = new ServiceAccountsApi(defaultClient);
        String id = "id_example"; // String | 
        ServiceAccountRequestData serviceAccountRequestData = new ServiceAccountRequestData(); // ServiceAccountRequestData | 'name' and 'description' of the service account
        try {
            ServiceAccountData result = apiInstance.updateServiceAccount(id, serviceAccountRequestData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceAccountsApi#updateServiceAccount");
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
 **serviceAccountRequestData** | [**ServiceAccountRequestData**](ServiceAccountRequestData.md)| &#39;name&#39; and &#39;description&#39; of the service account |

### Return type

[**ServiceAccountData**](ServiceAccountData.md)

### Authorization

[authFlow](../README.md#authFlow), [serviceAccounts](../README.md#serviceAccounts)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |

