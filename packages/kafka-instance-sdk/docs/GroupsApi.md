# GroupsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteConsumerGroupById**](GroupsApi.md#deleteConsumerGroupById) | **DELETE** /api/v1/consumer-groups/{consumerGroupId} | Delete a consumer group.
[**getConsumerGroupById**](GroupsApi.md#getConsumerGroupById) | **GET** /api/v1/consumer-groups/{consumerGroupId} | Get a single consumer group by its unique ID.
[**getConsumerGroups**](GroupsApi.md#getConsumerGroups) | **GET** /api/v1/consumer-groups | List of consumer groups in the Kafka instance.
[**resetConsumerGroupOffset**](GroupsApi.md#resetConsumerGroupOffset) | **POST** /api/v1/consumer-groups/{consumerGroupId}/reset-offset | Reset the offset for a consumer group.



## deleteConsumerGroupById

> deleteConsumerGroupById(consumerGroupId)

Delete a consumer group.

Delete a consumer group, along with its consumers.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.GroupsApi;

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

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String consumerGroupId = "consumerGroupId_example"; // String | Consumer group identifier
        try {
            apiInstance.deleteConsumerGroupById(consumerGroupId);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#deleteConsumerGroupById");
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
 **consumerGroupId** | **String**| Consumer group identifier |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer), [OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The consumer group was deleted successfully. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **403** | User is not authorized to access requested resource |  -  |
| **404** | The requested resource could not be found. |  -  |
| **423** | User cannot delete consumer group with active members. |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |


## getConsumerGroupById

> ConsumerGroup getConsumerGroupById(consumerGroupId, order, orderKey, partitionFilter, topic)

Get a single consumer group by its unique ID.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.GroupsApi;

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

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String consumerGroupId = "consumerGroupId_example"; // String | Consumer group identifier
        SortDirection order = SortDirection.fromValue("asc"); // SortDirection | Order items are sorted
        ConsumerGroupDescriptionOrderKey orderKey = new ConsumerGroupDescriptionOrderKey(); // ConsumerGroupDescriptionOrderKey | 
        Integer partitionFilter = 56; // Integer | Value of partition to include. Value -1 means filter is not active.
        String topic = "topic_example"; // String | Filter consumer groups for a specific topic
        try {
            ConsumerGroup result = apiInstance.getConsumerGroupById(consumerGroupId, order, orderKey, partitionFilter, topic);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#getConsumerGroupById");
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
 **consumerGroupId** | **String**| Consumer group identifier |
 **order** | [**SortDirection**](.md)| Order items are sorted | [optional] [enum: asc, desc]
 **orderKey** | [**ConsumerGroupDescriptionOrderKey**](.md)|  | [optional]
 **partitionFilter** | **Integer**| Value of partition to include. Value -1 means filter is not active. | [optional]
 **topic** | **String**| Filter consumer groups for a specific topic | [optional]

### Return type

[**ConsumerGroup**](ConsumerGroup.md)

### Authorization

[Bearer](../README.md#Bearer), [OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consumer group details. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **403** | User is not authorized to access requested resource |  -  |
| **404** | The requested resource could not be found. |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |


## getConsumerGroups

> ConsumerGroupList getConsumerGroups(size, page, topic, groupIdFilter, order, orderKey)

List of consumer groups in the Kafka instance.

Returns a list of all consumer groups for a particular Kafka instance. The consumer groups returned are limited to those records the requestor is authorized to view.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.GroupsApi;

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

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Integer size = 56; // Integer | Number of records per page
        Integer page = 56; // Integer | Page number
        String topic = "topic_example"; // String | Return consumer groups where the topic name contains this value
        String groupIdFilter = "groupIdFilter_example"; // String | Return the consumer groups where the ID contains this value
        SortDirection order = SortDirection.fromValue("asc"); // SortDirection | Order items are sorted
        ConsumerGroupOrderKey orderKey = new ConsumerGroupOrderKey(); // ConsumerGroupOrderKey | 
        try {
            ConsumerGroupList result = apiInstance.getConsumerGroups(size, page, topic, groupIdFilter, order, orderKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#getConsumerGroups");
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
 **size** | **Integer**| Number of records per page | [optional]
 **page** | **Integer**| Page number | [optional]
 **topic** | **String**| Return consumer groups where the topic name contains this value | [optional]
 **groupIdFilter** | **String**| Return the consumer groups where the ID contains this value | [optional]
 **order** | [**SortDirection**](.md)| Order items are sorted | [optional] [enum: asc, desc]
 **orderKey** | [**ConsumerGroupOrderKey**](.md)|  | [optional]

### Return type

[**ConsumerGroupList**](ConsumerGroupList.md)

### Authorization

[Bearer](../README.md#Bearer), [OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of consumer groups matching the request parameters. The consumer groups returned are limited to those records the requestor is authorized to view. |  -  |
| **400** | The client request was invalid. One or more request parameters or the request body was rejected. Additional information may be found in the response. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |


## resetConsumerGroupOffset

> ConsumerGroupResetOffsetResult resetConsumerGroupOffset(consumerGroupId, consumerGroupResetOffsetParameters)

Reset the offset for a consumer group.

Reset the offset for a particular consumer group.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.GroupsApi;

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

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String consumerGroupId = "consumerGroupId_example"; // String | Consumer group identifier
        ConsumerGroupResetOffsetParameters consumerGroupResetOffsetParameters = new ConsumerGroupResetOffsetParameters(); // ConsumerGroupResetOffsetParameters | 
        try {
            ConsumerGroupResetOffsetResult result = apiInstance.resetConsumerGroupOffset(consumerGroupId, consumerGroupResetOffsetParameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#resetConsumerGroupOffset");
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
 **consumerGroupId** | **String**| Consumer group identifier |
 **consumerGroupResetOffsetParameters** | [**ConsumerGroupResetOffsetParameters**](ConsumerGroupResetOffsetParameters.md)|  |

### Return type

[**ConsumerGroupResetOffsetResult**](ConsumerGroupResetOffsetResult.md)

### Authorization

[Bearer](../README.md#Bearer), [OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | The client request was invalid. One or more request parameters or the request body was rejected. Additional information may be found in the response. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **403** | User is not authorized to access requested resource |  -  |
| **404** | The requested resource could not be found. |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |
| **200** | The consumer group offsets have been reset. |  -  |

