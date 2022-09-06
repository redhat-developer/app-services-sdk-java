# AclsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAcl**](AclsApi.md#createAcl) | **POST** /api/v1/acls | Create ACL binding
[**deleteAcls**](AclsApi.md#deleteAcls) | **DELETE** /api/v1/acls | Delete ACL bindings
[**getAclResourceOperations**](AclsApi.md#getAclResourceOperations) | **GET** /api/v1/acls/resource-operations | Retrieve allowed ACL resources and operations
[**getAcls**](AclsApi.md#getAcls) | **GET** /api/v1/acls | List ACL bindings



## createAcl

> createAcl(aclBinding)

Create ACL binding

Creates a new ACL binding for a Kafka instance.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AclsApi apiInstance = new AclsApi(defaultClient);
        AclBinding aclBinding = new AclBinding(); // AclBinding | ACL to create.
        try {
            apiInstance.createAcl(aclBinding);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#createAcl");
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
 **aclBinding** | [**AclBinding**](AclBinding.md)| ACL to create. |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer), [OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | ACL created successfully. |  -  |
| **400** | The client request was invalid. One or more request parameters or the request body was rejected. Additional information may be found in the response. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **403** | User is not authorized to access requested resource |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |


## deleteAcls

> AclBindingListPage deleteAcls(resourceType, resourceName, patternType, principal, operation, permission)

Delete ACL bindings

Deletes ACL bindings that match the query parameters.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AclsApi apiInstance = new AclsApi(defaultClient);
        AclResourceTypeFilter resourceType = new AclResourceTypeFilter(); // AclResourceTypeFilter | ACL Resource Type Filter
        String resourceName = "resourceName_example"; // String | ACL Resource Name Filter
        AclPatternTypeFilter patternType = new AclPatternTypeFilter(); // AclPatternTypeFilter | ACL Pattern Type Filter
        String principal = ""; // String | ACL Principal Filter. Either a specific user or the wildcard user `User:*` may be provided. - When fetching by a specific user, the results will also include ACL bindings that apply to all users. - When deleting, ACL bindings to be delete must match the provided `principal` exactly.
        AclOperationFilter operation = new AclOperationFilter(); // AclOperationFilter | ACL Operation Filter. The ACL binding operation provided should be valid for the resource type in the request, if not `ANY`.
        AclPermissionTypeFilter permission = new AclPermissionTypeFilter(); // AclPermissionTypeFilter | ACL Permission Type Filter
        try {
            AclBindingListPage result = apiInstance.deleteAcls(resourceType, resourceName, patternType, principal, operation, permission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#deleteAcls");
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
 **resourceType** | [**AclResourceTypeFilter**](.md)| ACL Resource Type Filter | [optional]
 **resourceName** | **String**| ACL Resource Name Filter | [optional]
 **patternType** | [**AclPatternTypeFilter**](.md)| ACL Pattern Type Filter | [optional]
 **principal** | **String**| ACL Principal Filter. Either a specific user or the wildcard user &#x60;User:*&#x60; may be provided. - When fetching by a specific user, the results will also include ACL bindings that apply to all users. - When deleting, ACL bindings to be delete must match the provided &#x60;principal&#x60; exactly. | [optional] [default to ]
 **operation** | [**AclOperationFilter**](.md)| ACL Operation Filter. The ACL binding operation provided should be valid for the resource type in the request, if not &#x60;ANY&#x60;. | [optional]
 **permission** | [**AclPermissionTypeFilter**](.md)| ACL Permission Type Filter | [optional]

### Return type

[**AclBindingListPage**](AclBindingListPage.md)

### Authorization

[Bearer](../README.md#Bearer), [OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | The client request was invalid. One or more request parameters or the request body was rejected. Additional information may be found in the response. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **403** | User is not authorized to access requested resource |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |
| **200** | List of all ACL bindings matching the query parameters that were deleted. |  -  |


## getAclResourceOperations

> Map&lt;String, List&lt;String&gt;&gt; getAclResourceOperations()

Retrieve allowed ACL resources and operations

Retrieve the resources and associated operations that may have ACLs configured.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AclsApi apiInstance = new AclsApi(defaultClient);
        try {
            Map<String, List<String>> result = apiInstance.getAclResourceOperations();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#getAclResourceOperations");
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

[**Map&lt;String, List&lt;String&gt;&gt;**](List.md)

### Authorization

[Bearer](../README.md#Bearer), [OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Map of allowed resources and operations for ACL creation |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **500** | Internal server error |  -  |


## getAcls

> AclBindingListPage getAcls(resourceType, resourceName, patternType, principal, operation, permission, page, size, order, orderKey)

List ACL bindings

Returns a list of all of the available ACL bindings, or the list of bindings that meet the user&#39;s URL query parameters. If no parameters are specified, all ACL bindings known to the system will be returned (with paging).

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        AclsApi apiInstance = new AclsApi(defaultClient);
        AclResourceTypeFilter resourceType = new AclResourceTypeFilter(); // AclResourceTypeFilter | ACL Resource Type Filter
        String resourceName = "resourceName_example"; // String | ACL Resource Name Filter
        AclPatternTypeFilter patternType = new AclPatternTypeFilter(); // AclPatternTypeFilter | ACL Pattern Type Filter
        String principal = ""; // String | ACL Principal Filter. Either a specific user or the wildcard user `User:*` may be provided. - When fetching by a specific user, the results will also include ACL bindings that apply to all users. - When deleting, ACL bindings to be delete must match the provided `principal` exactly.
        AclOperationFilter operation = new AclOperationFilter(); // AclOperationFilter | ACL Operation Filter. The ACL binding operation provided should be valid for the resource type in the request, if not `ANY`.
        AclPermissionTypeFilter permission = new AclPermissionTypeFilter(); // AclPermissionTypeFilter | ACL Permission Type Filter
        Integer page = 56; // Integer | Page number
        Integer size = 56; // Integer | Number of records per page
        SortDirection order = SortDirection.fromValue("asc"); // SortDirection | Order items are sorted
        AclBindingOrderKey orderKey = new AclBindingOrderKey(); // AclBindingOrderKey | 
        try {
            AclBindingListPage result = apiInstance.getAcls(resourceType, resourceName, patternType, principal, operation, permission, page, size, order, orderKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#getAcls");
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
 **resourceType** | [**AclResourceTypeFilter**](.md)| ACL Resource Type Filter | [optional]
 **resourceName** | **String**| ACL Resource Name Filter | [optional]
 **patternType** | [**AclPatternTypeFilter**](.md)| ACL Pattern Type Filter | [optional]
 **principal** | **String**| ACL Principal Filter. Either a specific user or the wildcard user &#x60;User:*&#x60; may be provided. - When fetching by a specific user, the results will also include ACL bindings that apply to all users. - When deleting, ACL bindings to be delete must match the provided &#x60;principal&#x60; exactly. | [optional] [default to ]
 **operation** | [**AclOperationFilter**](.md)| ACL Operation Filter. The ACL binding operation provided should be valid for the resource type in the request, if not &#x60;ANY&#x60;. | [optional]
 **permission** | [**AclPermissionTypeFilter**](.md)| ACL Permission Type Filter | [optional]
 **page** | **Integer**| Page number | [optional]
 **size** | **Integer**| Number of records per page | [optional]
 **order** | [**SortDirection**](.md)| Order items are sorted | [optional] [enum: asc, desc]
 **orderKey** | [**AclBindingOrderKey**](.md)|  | [optional]

### Return type

[**AclBindingListPage**](AclBindingListPage.md)

### Authorization

[Bearer](../README.md#Bearer), [OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | The client request was invalid. One or more request parameters or the request body was rejected. Additional information may be found in the response. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **403** | User is not authorized to access requested resource |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |
| **200** | List of ACL bindings matching the query parameters. |  -  |

