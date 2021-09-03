# GroupsApi

All URIs are relative to *http://localhost/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteConsumerGroupById**](GroupsApi.md#deleteConsumerGroupById) | **DELETE** /consumer-groups/{consumerGroupId} | Delete a consumer group.
[**getConsumerGroupById**](GroupsApi.md#getConsumerGroupById) | **GET** /consumer-groups/{consumerGroupId} | Get a single consumer group by its unique ID.
[**getConsumerGroups**](GroupsApi.md#getConsumerGroups) | **GET** /consumer-groups | List of consumer groups in the Kafka instance.
[**resetConsumerGroupOffset**](GroupsApi.md#resetConsumerGroupOffset) | **POST** /consumer-groups/{consumerGroupId}/reset-offset | Reset the offset for a consumer group.



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
        defaultClient.setBasePath("http://localhost/rest");
        
        // Configure OAuth2 access token for authorization: Bearer
        OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setAccessToken("YOUR ACCESS TOKEN");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String consumerGroupId = "consumerGroupId_example"; // String | The unique ID of the cobsumer group.
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
 **consumerGroupId** | **String**| The unique ID of the cobsumer group. |

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
| **204** | The consumer group was deleted successfully. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **403** | Forbidden to delete this consumer group. |  -  |
| **404** | The consumer group does not exist. |  -  |
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
        defaultClient.setBasePath("http://localhost/rest");
        
        // Configure OAuth2 access token for authorization: Bearer
        OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setAccessToken("YOUR ACCESS TOKEN");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String consumerGroupId = "consumerGroupId_example"; // String | The unique ID of the consumer group
        String order = "order_example"; // String | Order of the items sorting. Ascending order is used as default.
        String orderKey = "orderKey_example"; // String | Order key to sort the topics by.
        Integer partitionFilter = 56; // Integer | Value of partition to include. Value -1 means filter is not active.
        String topic = "{\"groupId\":\"consumer_group_1\",\"consumers\":[{\"groupId\":\"consumer_group_1\",\"topic\":\"topic-1\",\"partition\":0,\"memberId\":\"consumer_group_member1\",\"offset\":5,\"lag\":0,\"logEndOffset\":5},{\"groupId\":\"consumer_group_1\",\"topic\":\"topic-1\",\"partition\":1,\"memberId\":\"consumer_group_member2\",\"offset\":3,\"lag\":0,\"logEndOffset\":3},{\"groupId\":\"consumer_group_1\",\"topic\":\"topic-1\",\"partition\":2,\"memberId\":\"consumer_group_member3\",\"offset\":6,\"lag\":1,\"logEndOffset\":5}]}"; // String | Filter consumer groups for a specific topic
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
 **consumerGroupId** | **String**| The unique ID of the consumer group |
 **order** | **String**| Order of the items sorting. Ascending order is used as default. | [optional] [enum: asc, desc]
 **orderKey** | **String**| Order key to sort the topics by. | [optional] [enum: offset, endOffset, lag, partition]
 **partitionFilter** | **Integer**| Value of partition to include. Value -1 means filter is not active. | [optional]
 **topic** | **String**| Filter consumer groups for a specific topic | [optional]

### Return type

[**ConsumerGroup**](ConsumerGroup.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consumer group details. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **403** | User is forbidden this view this consumer group. |  -  |
| **404** | Consumer group not found. |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |


## getConsumerGroups

> ConsumerGroupList getConsumerGroups(offset, limit, size, page, topic, groupIdFilter, order, orderKey)

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
        defaultClient.setBasePath("http://localhost/rest");
        
        // Configure OAuth2 access token for authorization: Bearer
        OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setAccessToken("YOUR ACCESS TOKEN");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Integer offset = 56; // Integer | The page offset
        Integer limit = 56; // Integer | Maximum number of consumer groups to return
        Integer size = 56; // Integer | Maximum number of consumer groups to return on single page
        Integer page = 56; // Integer | The page when returning the list of consumer groups
        String topic = "topic_example"; // String | Return consumer groups for this topic
        String groupIdFilter = "groupIdFilter_example"; // String | Return the consumer groups where the ID begins with this value
        String order = "order_example"; // String | Order of the consumer groups sorting. Ascending order is used as default.
        String orderKey = "orderKey_example"; // String | Order key to sort the items by. Only the value 'name' is currently applicable.
        try {
            ConsumerGroupList result = apiInstance.getConsumerGroups(offset, limit, size, page, topic, groupIdFilter, order, orderKey);
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
 **offset** | **Integer**| The page offset | [optional]
 **limit** | **Integer**| Maximum number of consumer groups to return | [optional]
 **size** | **Integer**| Maximum number of consumer groups to return on single page | [optional]
 **page** | **Integer**| The page when returning the list of consumer groups | [optional]
 **topic** | **String**| Return consumer groups for this topic | [optional]
 **groupIdFilter** | **String**| Return the consumer groups where the ID begins with this value | [optional]
 **order** | **String**| Order of the consumer groups sorting. Ascending order is used as default. | [optional] [enum: asc, desc]
 **orderKey** | **String**| Order key to sort the items by. Only the value &#39;name&#39; is currently applicable. | [optional] [enum: name]

### Return type

[**ConsumerGroupList**](ConsumerGroupList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of consumer groups matching the request parameters. The consumer groups returned are limited to those records the requestor is authorized to view. |  -  |
| **400** | The server cannot or will not process the request due to something that is perceived to be a client error such as malformed request syntax. |  -  |
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
        defaultClient.setBasePath("http://localhost/rest");
        
        // Configure OAuth2 access token for authorization: Bearer
        OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setAccessToken("YOUR ACCESS TOKEN");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        String consumerGroupId = "consumerGroupId_example"; // String | The ID of the consumer group.
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
 **consumerGroupId** | **String**| The ID of the consumer group. |
 **consumerGroupResetOffsetParameters** | [**ConsumerGroupResetOffsetParameters**](ConsumerGroupResetOffsetParameters.md)|  |

### Return type

[**ConsumerGroupResetOffsetResult**](ConsumerGroupResetOffsetResult.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The consumer group offsets have been reset. |  -  |
| **400** | The consumer group to reset the offset does have active consumers. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **403** | Forbidden to delete this consumer group. |  -  |
| **404** | Specified topic or its partition does not exist. |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |

