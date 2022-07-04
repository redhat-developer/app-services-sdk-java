# SecurityApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceAccount**](SecurityApi.md#createServiceAccount) | **POST** /api/kafkas_mgmt/v1/service_accounts | 
[**deleteServiceAccountById**](SecurityApi.md#deleteServiceAccountById) | **DELETE** /api/kafkas_mgmt/v1/service_accounts/{id} | 
[**getServiceAccountById**](SecurityApi.md#getServiceAccountById) | **GET** /api/kafkas_mgmt/v1/service_accounts/{id} | 
[**getServiceAccounts**](SecurityApi.md#getServiceAccounts) | **GET** /api/kafkas_mgmt/v1/service_accounts | 
[**getSsoProviders**](SecurityApi.md#getSsoProviders) | **GET** /api/kafkas_mgmt/v1/sso_providers | 
[**resetServiceAccountCreds**](SecurityApi.md#resetServiceAccountCreds) | **POST** /api/kafkas_mgmt/v1/service_accounts/{id}/reset_credentials | 



## createServiceAccount

> ServiceAccount createServiceAccount(serviceAccountRequest)



Creates a service account

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.SecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SecurityApi apiInstance = new SecurityApi(defaultClient);
        ServiceAccountRequest serviceAccountRequest = new ServiceAccountRequest(); // ServiceAccountRequest | Service account request
        try {
            ServiceAccount result = apiInstance.createServiceAccount(serviceAccountRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityApi#createServiceAccount");
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
 **serviceAccountRequest** | [**ServiceAccountRequest**](ServiceAccountRequest.md)| Service account request |

### Return type

[**ServiceAccount**](ServiceAccount.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Service account created |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | List of service accounts |  -  |
| **500** | Unexpected error occurred |  -  |


## deleteServiceAccountById

> Error deleteServiceAccountById(id)



Deletes a service account by ID

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.SecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SecurityApi apiInstance = new SecurityApi(defaultClient);
        String id = "id_example"; // String | The ID of record
        try {
            Error result = apiInstance.deleteServiceAccountById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityApi#deleteServiceAccountById");
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
| **403** | User not authorized to access the service |  -  |
| **500** | Unexpected error occurred |  -  |


## getServiceAccountById

> ServiceAccount getServiceAccountById(id)



Returned service account by ID

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.SecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SecurityApi apiInstance = new SecurityApi(defaultClient);
        String id = "id_example"; // String | The ID of record
        try {
            ServiceAccount result = apiInstance.getServiceAccountById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityApi#getServiceAccountById");
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

[**ServiceAccount**](ServiceAccount.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a service account by ID |  -  |


## getServiceAccounts

> ServiceAccountList getServiceAccounts(clientId)



Returns a list of service accounts

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.SecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SecurityApi apiInstance = new SecurityApi(defaultClient);
        String clientId = "clientId_example"; // String | client_id of the service account to be retrieved
        try {
            ServiceAccountList result = apiInstance.getServiceAccounts(clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityApi#getServiceAccounts");
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
 **clientId** | **String**| client_id of the service account to be retrieved | [optional]

### Return type

[**ServiceAccountList**](ServiceAccountList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned list of service accounts |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User not authorized to access the service |  -  |
| **500** | Unexpected error occurred |  -  |


## getSsoProviders

> SsoProvider getSsoProviders()



Return sso provider info

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.SecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");

        SecurityApi apiInstance = new SecurityApi(defaultClient);
        try {
            SsoProvider result = apiInstance.getSsoProviders();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityApi#getSsoProviders");
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

[**SsoProvider**](SsoProvider.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned list of supported cloud providers |  -  |
| **401** | Auth token is invalid |  -  |
| **500** | Unexpected error occurred |  -  |


## resetServiceAccountCreds

> ServiceAccount resetServiceAccountCreds(id)



Resets the credentials for a service account by ID

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.SecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SecurityApi apiInstance = new SecurityApi(defaultClient);
        String id = "id_example"; // String | The ID of record
        try {
            ServiceAccount result = apiInstance.resetServiceAccountCreds(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecurityApi#resetServiceAccountCreds");
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

[**ServiceAccount**](ServiceAccount.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reset credentials |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User not authorized to access the service |  -  |
| **500** | Unexpected error occurred |  -  |

