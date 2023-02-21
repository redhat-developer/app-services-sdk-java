# RegistriesApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRegistry**](RegistriesApi.md#createRegistry) | **POST** /api/serviceregistry_mgmt/v1/registries | 
[**deleteRegistry**](RegistriesApi.md#deleteRegistry) | **DELETE** /api/serviceregistry_mgmt/v1/registries/{id} | Delete a Registry instance
[**getRegistries**](RegistriesApi.md#getRegistries) | **GET** /api/serviceregistry_mgmt/v1/registries | 
[**getRegistry**](RegistriesApi.md#getRegistry) | **GET** /api/serviceregistry_mgmt/v1/registries/{id} | Get a Registry instance



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
        RegistryCreate registryCreate = new RegistryCreate(); // RegistryCreate | A new `Registry` instance to be created.
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
 **registryCreate** | [**RegistryCreate**](RegistryCreate.md)| A new &#x60;Registry&#x60; instance to be created. |

### Return type

[**Registry**](Registry.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. The full request to create a new &#x60;Registry&#x60; instance is processed asynchronously. The user should verify the result of the operation by reading the &#x60;status&#x60; property of the created &#x60;Registry&#x60; instance. |  -  |
| **400** | Invalid request content or parameters. |  -  |
| **401** | Authentication was not successful. Make sure the token is valid. |  -  |
| **403** | User is not authorized to perform the operation. |  -  |
| **409** | Registry with the given name already exists, limit on the number of instances has been reached, or other precondition has not been met. |  -  |
| **415** | Unsupported media type. The server expects a JSON request. |  -  |
| **500** | Unexpected error occurred. |  -  |
| **503** | Service has temporary issues while processing your request, please try again. |  -  |


## deleteRegistry

> deleteRegistry(id)

Delete a Registry instance

Deletes an existing &#x60;Registry&#x60; instance and all of the data that it stores. Important: Users should export the registry data before deleting the instance, e.g., using the Service Registry web console, core REST API, or &#x60;rhoas&#x60; CLI.

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
        String id = "id_example"; // String | The id of the object you wish to interact with.
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
 **id** | **String**| The id of the object you wish to interact with. |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful response. |  -  |
| **401** | Authentication was not successful. Make sure the token is valid. |  -  |
| **403** | User is not authorized to perform the operation. |  -  |
| **404** | No Service Registry instance with the specified id exists |  -  |
| **500** | Unexpected error occurred. |  -  |


## getRegistries

> RegistryList getRegistries(page, size, orderBy, search)



Get the list of all Registry instances

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
        Integer page = 0; // Integer | Page index.
        Integer size = 100; // Integer | Number of items in each page.
        String orderBy = "name asc"; // String | Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the _order by_ clause of an SQL statement. Each query can be ordered by any of the request fields. For example, to retrieve all Registry instances ordered by their name:  ```sql name asc ```  Or to retrieve all Registry instances ordered by their name _and_ created date:  ```sql name asc, created_at asc ```  If the parameter isn't provided, or if the value is empty,  the results are ordered by name.
        String search = "name = example-registry and status = ready"; // String | Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement. Allowed fields in the search are: `name`, `status`. Allowed comparators are `=` or `LIKE`. Allowed joins are `AND` and `OR`, however there is a limit of max 10 joins in the search query.  Examples:  To retrieve a request with name equal `my-registry`, the value should be:  ``` name = my-registry  ```  To retrieve a request with its name starting with `my`, the value should be:  ``` name like my%25 ```  If the parameter isn't provided, or if the value is empty, all the Registry instances that the user has permission to see are returned.  Note: If the query is invalid, an error is returned. 
        try {
            RegistryList result = apiInstance.getRegistries(page, size, orderBy, search);
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
 **page** | **Integer**| Page index. | [optional]
 **size** | **Integer**| Number of items in each page. | [optional]
 **orderBy** | **String**| Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the _order by_ clause of an SQL statement. Each query can be ordered by any of the request fields. For example, to retrieve all Registry instances ordered by their name:  &#x60;&#x60;&#x60;sql name asc &#x60;&#x60;&#x60;  Or to retrieve all Registry instances ordered by their name _and_ created date:  &#x60;&#x60;&#x60;sql name asc, created_at asc &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty,  the results are ordered by name. | [optional]
 **search** | **String**| Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement. Allowed fields in the search are: &#x60;name&#x60;, &#x60;status&#x60;. Allowed comparators are &#x60;&#x3D;&#x60; or &#x60;LIKE&#x60;. Allowed joins are &#x60;AND&#x60; and &#x60;OR&#x60;, however there is a limit of max 10 joins in the search query.  Examples:  To retrieve a request with name equal &#x60;my-registry&#x60;, the value should be:  &#x60;&#x60;&#x60; name &#x3D; my-registry  &#x60;&#x60;&#x60;  To retrieve a request with its name starting with &#x60;my&#x60;, the value should be:  &#x60;&#x60;&#x60; name like my%25 &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, all the Registry instances that the user has permission to see are returned.  Note: If the query is invalid, an error is returned.  | [optional]

### Return type

[**RegistryList**](RegistryList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **400** | Invalid request content or parameters. |  -  |
| **401** | Authentication was not successful. Make sure the token is valid. |  -  |
| **403** | User is not authorized to perform the operation. |  -  |
| **500** | Unexpected error occurred. |  -  |


## getRegistry

> Registry getRegistry(id)

Get a Registry instance

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
        String id = "id_example"; // String | The id of the object you wish to interact with.
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
 **id** | **String**| The id of the object you wish to interact with. |

### Return type

[**Registry**](Registry.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response - returns a single &#x60;Registry&#x60; instance. |  -  |
| **401** | Authentication was not successful. Make sure the token is valid. |  -  |
| **403** | User is not authorized to perform the operation. |  -  |
| **404** | No Service Registry instance with specified id exists. |  -  |
| **500** | Unexpected error occurred. |  -  |

