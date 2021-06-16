# RegistriesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRegistry**](RegistriesApi.md#createRegistry) | **POST** /api/serviceregistry_mgmt/v1/registries | Create a Registry.
[**deleteRegistry**](RegistriesApi.md#deleteRegistry) | **DELETE** /api/serviceregistry_mgmt/v1/registries/{registryId} | Delete a Registry
[**getRegistries**](RegistriesApi.md#getRegistries) | **GET** /api/serviceregistry_mgmt/v1/registries | Get the list of all registries.
[**getRegistry**](RegistriesApi.md#getRegistry) | **GET** /api/serviceregistry_mgmt/v1/registries/{registryId} | Get a Registry



## createRegistry

> Registry createRegistry(registryCreate)

Create a Registry.

### Example

```java
// Import classes:
import com.openshift.cloud.api.srs.invoker.ApiClient;
import com.openshift.cloud.api.srs.invoker.ApiException;
import com.openshift.cloud.api.srs.invoker.Configuration;
import com.openshift.cloud.api.srs.invoker.models.*;
import com.openshift.cloud.api.srs.RegistriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RegistriesApi apiInstance = new RegistriesApi(defaultClient);
        RegistryCreate registryCreate = new RegistryCreate(); // RegistryCreate | A new `Registry` to be created.
        try {
            Registry result = apiInstance.createRegistry(registryCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistriesApi#createRegistry");
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
 **registryCreate** | [**RegistryCreate**](RegistryCreate.md)| A new &#x60;Registry&#x60; to be created. |

### Return type

[**Registry**](Registry.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A successful response. The full request to create a new &#x60;Registry&#x60; is processed asynchronously. User should verify the result of the operation by reading the &#x60;status&#x60; property of the created &#x60;Registry&#x60; entity. |  -  |
| **500** | The response sent from the server when an unexpected error occurs (for example  a database connection error). |  -  |


## deleteRegistry

> deleteRegistry(registryId)

Delete a Registry

Deletes an existing &#x60;Registry&#x60;.

### Example

```java
// Import classes:
import com.openshift.cloud.api.srs.invoker.ApiClient;
import com.openshift.cloud.api.srs.invoker.ApiException;
import com.openshift.cloud.api.srs.invoker.Configuration;
import com.openshift.cloud.api.srs.invoker.models.*;
import com.openshift.cloud.api.srs.RegistriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RegistriesApi apiInstance = new RegistriesApi(defaultClient);
        Integer registryId = 56; // Integer | A unique identifier for a `Registry`.
        try {
            apiInstance.deleteRegistry(registryId);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistriesApi#deleteRegistry");
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
 **registryId** | **Integer**| A unique identifier for a &#x60;Registry&#x60;. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful response. |  -  |
| **404** | The response returned when something is requested but cannot be found. |  -  |
| **500** | The response sent from the server when an unexpected error occurs (for example  a database connection error). |  -  |


## getRegistries

> List&lt;Registry&gt; getRegistries()

Get the list of all registries.

### Example

```java
// Import classes:
import com.openshift.cloud.api.srs.invoker.ApiClient;
import com.openshift.cloud.api.srs.invoker.ApiException;
import com.openshift.cloud.api.srs.invoker.Configuration;
import com.openshift.cloud.api.srs.invoker.models.*;
import com.openshift.cloud.api.srs.RegistriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RegistriesApi apiInstance = new RegistriesApi(defaultClient);
        try {
            List<Registry> result = apiInstance.getRegistries();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistriesApi#getRegistries");
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

[**List&lt;Registry&gt;**](Registry.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **500** | The response sent from the server when an unexpected error occurs (for example  a database connection error). |  -  |


## getRegistry

> Registry getRegistry(registryId)

Get a Registry

Gets the details of a single instance of a &#x60;Registry&#x60;.

### Example

```java
// Import classes:
import com.openshift.cloud.api.srs.invoker.ApiClient;
import com.openshift.cloud.api.srs.invoker.ApiException;
import com.openshift.cloud.api.srs.invoker.Configuration;
import com.openshift.cloud.api.srs.invoker.models.*;
import com.openshift.cloud.api.srs.RegistriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        RegistriesApi apiInstance = new RegistriesApi(defaultClient);
        Integer registryId = 56; // Integer | A unique identifier for a `Registry`.
        try {
            Registry result = apiInstance.getRegistry(registryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistriesApi#getRegistry");
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
 **registryId** | **Integer**| A unique identifier for a &#x60;Registry&#x60;. |

### Return type

[**Registry**](Registry.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response - returns a single &#x60;Registry&#x60;. |  -  |
| **404** | The response returned when something is requested but cannot be found. |  -  |
| **500** | The response sent from the server when an unexpected error occurs (for example  a database connection error). |  -  |

