# RegistriesApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRegistry**](RegistriesApi.md#createRegistry) | **POST** /api/serviceregistry_mgmt/v1/registries | Create a new Registry instance
[**deleteRegistry**](RegistriesApi.md#deleteRegistry) | **DELETE** /api/serviceregistry_mgmt/v1/{id} | Delete a Registry
[**getRegistries**](RegistriesApi.md#getRegistries) | **GET** /api/serviceregistry_mgmt/v1/registries | Get the list of all registries.
[**getRegistry**](RegistriesApi.md#getRegistry) | **GET** /api/serviceregistry_mgmt/v1/{id} | Get a Registry



## createRegistry

> Registry createRegistry(registryCreate)

Create a new Registry instance

### Example

```java
// Import classes:
import com.openshift.cloud.api.srs.invoker.ApiClient;
import com.openshift.cloud.api.srs.invoker.ApiException;
import com.openshift.cloud.api.srs.invoker.Configuration;
import com.openshift.cloud.api.srs.invoker.auth.*;
import com.openshift.cloud.api.srs.invoker.models.*;
import com.openshift.cloud.api.srs.RegistriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

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

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | A successful response. The full request to create a new &#x60;Registry&#x60; is processed asynchronously. User should verify the result of the operation by reading the &#x60;status&#x60; property of the created &#x60;Registry&#x60; entity. |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User not authorized to access the service. |  -  |
| **500** | Unexpected error occurred |  -  |


## deleteRegistry

> deleteRegistry(id)

Delete a Registry

Deletes an existing &#x60;Registry&#x60;.

### Example

```java
// Import classes:
import com.openshift.cloud.api.srs.invoker.ApiClient;
import com.openshift.cloud.api.srs.invoker.ApiException;
import com.openshift.cloud.api.srs.invoker.Configuration;
import com.openshift.cloud.api.srs.invoker.auth.*;
import com.openshift.cloud.api.srs.invoker.models.*;
import com.openshift.cloud.api.srs.RegistriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RegistriesApi apiInstance = new RegistriesApi(defaultClient);
        String id = "id_example"; // String | A unique identifier for a `Registry`.
        try {
            apiInstance.deleteRegistry(id);
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
 **id** | **String**| A unique identifier for a &#x60;Registry&#x60;. |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful response. |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User not authorized to access the service. |  -  |
| **404** | No Service Registry with specified id exists |  -  |


## getRegistries

> RegistryRestList getRegistries(page, size, orderBy, search)

Get the list of all registries.

### Example

```java
// Import classes:
import com.openshift.cloud.api.srs.invoker.ApiClient;
import com.openshift.cloud.api.srs.invoker.ApiException;
import com.openshift.cloud.api.srs.invoker.Configuration;
import com.openshift.cloud.api.srs.invoker.auth.*;
import com.openshift.cloud.api.srs.invoker.models.*;
import com.openshift.cloud.api.srs.RegistriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RegistriesApi apiInstance = new RegistriesApi(defaultClient);
        String page = "1"; // String | Page index
        String size = "100"; // String | Number of items in each page
        String orderBy = "name asc"; // String | Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the _order by_ clause of an SQL statement. Each query can be ordered by any of the kafkaRequests fields. For example, in order to retrieve all kafkas ordered by their name:  ```sql name asc ```  Or in order to retrieve all kafkas ordered by their name _and_ created date:  ```sql name asc, created_at asc ```  If the parameter isn't provided, or if the value is empty, then the results will be ordered by name.
        String search = "name = my-kafka and cloud_provider = aws"; // String | Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement. Allowed fields in the search are: cloud_provider, name, owner, region and status. Allowed comparators are `<>`, `=` or `LIKE`. Allowed joins are `AND` and `OR`, however there is a limit of max 10 joins in the search query.  Examples:  To retrieve kafka request with name equal `my-kafka` and region equal `aws`, the value should be:  ``` name = my-kafka and cloud_provider = aws ```  To retrieve kafka request with its name starting with `my`, the value should be:  ``` name like my%25 ```  If the parameter isn't provided, or if the value is empty, then all the kafkas that the user has permission to see will be returned.  Note. If the query is invalid, an error will be returned 
        try {
            RegistryRestList result = apiInstance.getRegistries(page, size, orderBy, search);
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


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **String**| Page index | [optional]
 **size** | **String**| Number of items in each page | [optional]
 **orderBy** | **String**| Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the _order by_ clause of an SQL statement. Each query can be ordered by any of the kafkaRequests fields. For example, in order to retrieve all kafkas ordered by their name:  &#x60;&#x60;&#x60;sql name asc &#x60;&#x60;&#x60;  Or in order to retrieve all kafkas ordered by their name _and_ created date:  &#x60;&#x60;&#x60;sql name asc, created_at asc &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then the results will be ordered by name. | [optional]
 **search** | **String**| Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement. Allowed fields in the search are: cloud_provider, name, owner, region and status. Allowed comparators are &#x60;&lt;&gt;&#x60;, &#x60;&#x3D;&#x60; or &#x60;LIKE&#x60;. Allowed joins are &#x60;AND&#x60; and &#x60;OR&#x60;, however there is a limit of max 10 joins in the search query.  Examples:  To retrieve kafka request with name equal &#x60;my-kafka&#x60; and region equal &#x60;aws&#x60;, the value should be:  &#x60;&#x60;&#x60; name &#x3D; my-kafka and cloud_provider &#x3D; aws &#x60;&#x60;&#x60;  To retrieve kafka request with its name starting with &#x60;my&#x60;, the value should be:  &#x60;&#x60;&#x60; name like my%25 &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then all the kafkas that the user has permission to see will be returned.  Note. If the query is invalid, an error will be returned  | [optional]

### Return type

[**RegistryRestList**](RegistryRestList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User not authorized to access the service. |  -  |
| **500** | Unexpected error occurred |  -  |


## getRegistry

> Registry getRegistry(id)

Get a Registry

Gets the details of a single instance of a &#x60;Registry&#x60;.

### Example

```java
// Import classes:
import com.openshift.cloud.api.srs.invoker.ApiClient;
import com.openshift.cloud.api.srs.invoker.ApiException;
import com.openshift.cloud.api.srs.invoker.Configuration;
import com.openshift.cloud.api.srs.invoker.auth.*;
import com.openshift.cloud.api.srs.invoker.models.*;
import com.openshift.cloud.api.srs.RegistriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RegistriesApi apiInstance = new RegistriesApi(defaultClient);
        String id = "id_example"; // String | A unique identifier for a `Registry`.
        try {
            Registry result = apiInstance.getRegistry(id);
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
 **id** | **String**| A unique identifier for a &#x60;Registry&#x60;. |

### Return type

[**Registry**](Registry.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response - returns a single &#x60;Registry&#x60;. |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User not authorized to access the service. |  -  |
| **404** | No service registry with specified id exists |  -  |

