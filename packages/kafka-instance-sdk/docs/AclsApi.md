# AclsApi

All URIs are relative to */rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAcl**](AclsApi.md#createAcl) | **POST** /acls | Create ACL binding
[**deleteAcls**](AclsApi.md#deleteAcls) | **DELETE** /acls | Delete ACL bindings
[**getAclResourceOperations**](AclsApi.md#getAclResourceOperations) | **GET** /acls/resource-operations | Retrieve allowed ACL resources and operations
[**getAcls**](AclsApi.md#getAcls) | **GET** /acls | List ACL bindings



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
        defaultClient.setBasePath("/rest");
        
        // Configure OAuth2 access token for authorization: Bearer
        OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setAccessToken("YOUR ACCESS TOKEN");

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

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | ACL created successfully. |  -  |
| **400** | The client request was invalid |  -  |
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
        defaultClient.setBasePath("/rest");
        
        // Configure OAuth2 access token for authorization: Bearer
        OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setAccessToken("YOUR ACCESS TOKEN");

        AclsApi apiInstance = new AclsApi(defaultClient);
        AclResourceTypeFilter resourceType = AclResourceTypeFilter.fromValue("ANY"); // AclResourceTypeFilter | ACL Resource Type Filter
        String resourceName = "resourceName_example"; // String | ACL Resource Name Filter
        AclPatternTypeFilter patternType = AclPatternTypeFilter.fromValue("LITERAL"); // AclPatternTypeFilter | ACL Pattern Type Filter
        String principal = "User:*"; // String | ACL Principal Filter. Either a specific user or the wildcard user `User:*` may be provided. - When fetching by a specific user, the results will also include ACL bindings that apply to all users. - When deleting, ACL bindings to be delete must match the provided `principal` exactly.
        AclOperationFilter operation = AclOperationFilter.fromValue("ALL"); // AclOperationFilter | ACL Operation Filter. The ACL binding operation provided should be valid for the resource type in the request, if not `ANY`.
        AclPermissionTypeFilter permission = AclPermissionTypeFilter.fromValue("ALLOW"); // AclPermissionTypeFilter | ACL Permission Type Filter
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
 **resourceType** | [**AclResourceTypeFilter**](.md)| ACL Resource Type Filter | [optional] [default to ANY] [enum: ANY, GROUP, TOPIC, CLUSTER, TRANSACTIONAL_ID]
 **resourceName** | **String**| ACL Resource Name Filter | [optional]
 **patternType** | [**AclPatternTypeFilter**](.md)| ACL Pattern Type Filter | [optional] [default to ANY] [enum: LITERAL, PREFIXED, ANY, MATCH]
 **principal** | **String**| ACL Principal Filter. Either a specific user or the wildcard user &#x60;User:*&#x60; may be provided. - When fetching by a specific user, the results will also include ACL bindings that apply to all users. - When deleting, ACL bindings to be delete must match the provided &#x60;principal&#x60; exactly. | [optional]
 **operation** | [**AclOperationFilter**](.md)| ACL Operation Filter. The ACL binding operation provided should be valid for the resource type in the request, if not &#x60;ANY&#x60;. | [optional] [default to ANY] [enum: ALL, READ, WRITE, CREATE, DELETE, ALTER, DESCRIBE, DESCRIBE_CONFIGS, ALTER_CONFIGS, ANY]
 **permission** | [**AclPermissionTypeFilter**](.md)| ACL Permission Type Filter | [optional] [default to ANY] [enum: ALLOW, DENY, ANY]

### Return type

[**AclBindingListPage**](AclBindingListPage.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all ACL bindings matching the query parameters that were deleted. |  -  |
| **400** | The client request was invalid |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **403** | User is not authorized to access requested resource |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |


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
        defaultClient.setBasePath("/rest");
        
        // Configure OAuth2 access token for authorization: Bearer
        OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setAccessToken("YOUR ACCESS TOKEN");

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

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Map of allowed resources and operations for ACL creation |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **403** | User is not authorized to access requested resource |  -  |
| **500** | Internal server error |  -  |


## getAcls

> AclBindingListPage getAcls(resourceType, resourceName, patternType, principal, operation, permission, page, size, order, orderKey)

List ACL bindings

Returns a list of all of the available ACL bindings, or the list of bindings that meet the users URL Query Parameters. If no parameters are specified, all ACL bindings known to the system will be returned (with paging).

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
        defaultClient.setBasePath("/rest");
        
        // Configure OAuth2 access token for authorization: Bearer
        OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setAccessToken("YOUR ACCESS TOKEN");

        AclsApi apiInstance = new AclsApi(defaultClient);
        AclResourceTypeFilter resourceType = AclResourceTypeFilter.fromValue("ANY"); // AclResourceTypeFilter | ACL Resource Type Filter
        String resourceName = "resourceName_example"; // String | ACL Resource Name Filter
        AclPatternTypeFilter patternType = AclPatternTypeFilter.fromValue("LITERAL"); // AclPatternTypeFilter | ACL Pattern Type Filter
        String principal = "User:*"; // String | ACL Principal Filter. Either a specific user or the wildcard user `User:*` may be provided. - When fetching by a specific user, the results will also include ACL bindings that apply to all users. - When deleting, ACL bindings to be delete must match the provided `principal` exactly.
        AclOperationFilter operation = AclOperationFilter.fromValue("ALL"); // AclOperationFilter | ACL Operation Filter. The ACL binding operation provided should be valid for the resource type in the request, if not `ANY`.
        AclPermissionTypeFilter permission = AclPermissionTypeFilter.fromValue("ALLOW"); // AclPermissionTypeFilter | ACL Permission Type Filter
        BigDecimal page = new BigDecimal("1"); // BigDecimal | Page number for result lists
        BigDecimal size = new BigDecimal("10"); // BigDecimal | Page size for result lists
        String order = "asc"; // String | Order of the ACL binding sorting.
        String orderKey = "resourceType"; // String | Order key to sort the items by.
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
 **resourceType** | [**AclResourceTypeFilter**](.md)| ACL Resource Type Filter | [optional] [default to ANY] [enum: ANY, GROUP, TOPIC, CLUSTER, TRANSACTIONAL_ID]
 **resourceName** | **String**| ACL Resource Name Filter | [optional]
 **patternType** | [**AclPatternTypeFilter**](.md)| ACL Pattern Type Filter | [optional] [default to ANY] [enum: LITERAL, PREFIXED, ANY, MATCH]
 **principal** | **String**| ACL Principal Filter. Either a specific user or the wildcard user &#x60;User:*&#x60; may be provided. - When fetching by a specific user, the results will also include ACL bindings that apply to all users. - When deleting, ACL bindings to be delete must match the provided &#x60;principal&#x60; exactly. | [optional]
 **operation** | [**AclOperationFilter**](.md)| ACL Operation Filter. The ACL binding operation provided should be valid for the resource type in the request, if not &#x60;ANY&#x60;. | [optional] [default to ANY] [enum: ALL, READ, WRITE, CREATE, DELETE, ALTER, DESCRIBE, DESCRIBE_CONFIGS, ALTER_CONFIGS, ANY]
 **permission** | [**AclPermissionTypeFilter**](.md)| ACL Permission Type Filter | [optional] [default to ANY] [enum: ALLOW, DENY, ANY]
 **page** | **BigDecimal**| Page number for result lists | [optional] [default to 1]
 **size** | **BigDecimal**| Page size for result lists | [optional] [default to 10]
 **order** | **String**| Order of the ACL binding sorting. | [optional] [default to desc] [enum: asc, desc]
 **orderKey** | **String**| Order key to sort the items by. | [optional] [default to permission] [enum: resourceType, resourceName, patternType, principal, operation, permission]

### Return type

[**AclBindingListPage**](AclBindingListPage.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of ACL bindings matching the query parameters. |  -  |
| **400** | The client request was invalid |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **403** | User is not authorized to access requested resource |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |

