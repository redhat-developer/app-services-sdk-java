# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTopic**](DefaultApi.md#createTopic) | **POST** /topics | Creates a new topic
[**deleteConsumerGroupById**](DefaultApi.md#deleteConsumerGroupById) | **DELETE** /consumer-groups/{consumerGroupId} | Delete a consumer group.
[**deleteTopic**](DefaultApi.md#deleteTopic) | **DELETE** /topics/{topicName} | Deletes a  topic
[**getConsumerGroupById**](DefaultApi.md#getConsumerGroupById) | **GET** /consumer-groups/{consumerGroupId} | Get a single consumer group by its unique ID.
[**getConsumerGroups**](DefaultApi.md#getConsumerGroups) | **GET** /consumer-groups | List of consumer groups in the Kafka instance.
[**getTopic**](DefaultApi.md#getTopic) | **GET** /topics/{topicName} | Retrieves the topic with the specified name.
[**getTopics**](DefaultApi.md#getTopics) | **GET** /topics | List of topics
[**updateTopic**](DefaultApi.md#updateTopic) | **PATCH** /topics/{topicName} | Updates the topic with the specified name.



## createTopic

> Topic createTopic(newTopicInput)

Creates a new topic

Creates a new topic for Kafka.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        NewTopicInput newTopicInput = new NewTopicInput(); // NewTopicInput | Topic to create.
        try {
            Topic result = apiInstance.createTopic(newTopicInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createTopic");
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
 **newTopicInput** | [**NewTopicInput**](NewTopicInput.md)| Topic to create. |

### Return type

[**Topic**](Topic.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Topic created successfully. |  -  |
| **400** | Unable to create topic. |  -  |
| **401** | Unauthorized, Unable to create topic. |  -  |
| **409** | Entry already exisits |  -  |
| **500** | Internal server error. |  -  |
| **503** | Unable to connect to the Kafka cluster. |  -  |


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
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String consumerGroupId = "consumerGroupId_example"; // String | The unique ID of the cobsumer group.
        try {
            apiInstance.deleteConsumerGroupById(consumerGroupId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteConsumerGroupById");
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

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The consumer group was deleted successfully. |  -  |
| **401** | Unauthorized, request has not been applied because it lacks valid authentication credentials. |  -  |
| **403** | Forbidden to delete this consumer group. |  -  |
| **404** | The consumer group does not exist. |  -  |
| **423** | User cannot delete consumer group with active members. |  -  |
| **500** | Internal Server Error. |  -  |
| **503** | Unable to connect to the Kafka cluster. |  -  |


## deleteTopic

> deleteTopic(topicName)

Deletes a  topic

Deletes the topic with the specified name.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String topicName = "topicName_example"; // String | The topic name to delete.
        try {
            apiInstance.deleteTopic(topicName);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteTopic");
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
 **topicName** | **String**| The topic name to delete. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Topic deleted successfully. |  -  |
| **401** | Unathorized, unable to delete topic. |  -  |
| **404** | Topic not found. |  -  |
| **500** | Internal server error. |  -  |
| **503** | Unable to connect to the Kafka cluster. |  -  |


## getConsumerGroupById

> ConsumerGroup getConsumerGroupById(consumerGroupId, topic)

Get a single consumer group by its unique ID.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String consumerGroupId = "consumerGroupId_example"; // String | The unique ID of the consumer group
        String topic = "{\"groupId\":\"consumer_group_1\",\"consumers\":[{\"groupId\":\"consumer_group_1\",\"topic\":\"topic-1\",\"partition\":0,\"memberId\":\"consumer_group_member1\",\"offset\":5,\"lag\":0,\"logEndOffset\":5},{\"groupId\":\"consumer_group_1\",\"topic\":\"topic-1\",\"partition\":1,\"memberId\":\"consumer_group_member2\",\"offset\":3,\"lag\":0,\"logEndOffset\":3},{\"groupId\":\"consumer_group_1\",\"topic\":\"topic-1\",\"partition\":2,\"memberId\":\"consumer_group_member3\",\"offset\":6,\"lag\":1,\"logEndOffset\":5}]}"; // String | Filter consumer groups for a specific topic
        try {
            ConsumerGroup result = apiInstance.getConsumerGroupById(consumerGroupId, topic);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getConsumerGroupById");
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
 **topic** | **String**| Filter consumer groups for a specific topic | [optional]

### Return type

[**ConsumerGroup**](ConsumerGroup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consumer group details. |  -  |
| **401** | Unauthorized, request has not been applied because it lacks valid authentication credentials. |  -  |
| **403** | User is forbidden this view this consumer group. |  -  |
| **404** | Consumer group not found. |  -  |
| **500** | Internal server error. |  -  |
| **503** | Unable to connect to the Kafka cluster. |  -  |


## getConsumerGroups

> ConsumerGroupList getConsumerGroups(limit, offset, topic, groupIdFilter)

List of consumer groups in the Kafka instance.

Returns a list of all consumer groups for a particular Kafka instance.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer limit = 56; // Integer | Maximum number of consumer groups to returnd
        Integer offset = 56; // Integer | The page offset when returning the list of consumer groups
        String topic = "topic_example"; // String | Return consumer groups for this topic
        String groupIdFilter = "groupIdFilter_example"; // String | Return the consumer groups where the ID begins with this value
        try {
            ConsumerGroupList result = apiInstance.getConsumerGroups(limit, offset, topic, groupIdFilter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getConsumerGroups");
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
 **limit** | **Integer**| Maximum number of consumer groups to returnd | [optional]
 **offset** | **Integer**| The page offset when returning the list of consumer groups | [optional]
 **topic** | **String**| Return consumer groups for this topic | [optional]
 **groupIdFilter** | **String**| Return the consumer groups where the ID begins with this value | [optional]

### Return type

[**ConsumerGroupList**](ConsumerGroupList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of consumer groups matching the request parameters. |  -  |
| **400** | The server cannot or will not process the request due to something that is perceived to be a client error such as malformed request syntax. |  -  |
| **401** | Unauthorized, request has not been applied because it lacks valid authentication credentials. |  -  |
| **403** | User is forbidden to retrieve the list of consumer groups. |  -  |
| **500** | An internal server error occurred. |  -  |
| **503** | Unable to connect to the Kafka cluster. |  -  |


## getTopic

> Topic getTopic(topicName)

Retrieves the topic with the specified name.

Topic

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String topicName = "topicName_example"; // String | The topic name to retrieve.
        try {
            Topic result = apiInstance.getTopic(topicName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getTopic");
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
 **topicName** | **String**| The topic name to retrieve. |

### Return type

[**Topic**](Topic.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kakfa topic details. |  -  |
| **401** | Unauthorized, unable to retrieve topics. |  -  |
| **404** | Topic not found. |  -  |
| **500** | Internal server error. |  -  |
| **503** | Unable to connect to the Kafka cluster. |  -  |


## getTopics

> TopicsList getTopics(limit, filter, offset, order)

List of topics

Returns a list of all of the available topics, or the list of topics that meet the users URL Query Parameters.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer limit = 56; // Integer | Maximum number of topics to return
        String filter = "filter_example"; // String | Filter to apply when returning the list of topics
        Integer offset = 56; // Integer | The page offset when returning the limit of requested topics.
        String order = "order_example"; // String | Order of the items sorting. If \"asc\" is set as a value, ascending order is used, descending otherwise.
        try {
            TopicsList result = apiInstance.getTopics(limit, filter, offset, order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getTopics");
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
 **limit** | **Integer**| Maximum number of topics to return | [optional]
 **filter** | **String**| Filter to apply when returning the list of topics | [optional]
 **offset** | **Integer**| The page offset when returning the limit of requested topics. | [optional]
 **order** | **String**| Order of the items sorting. If \&quot;asc\&quot; is set as a value, ascending order is used, descending otherwise. | [optional]

### Return type

[**TopicsList**](TopicsList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of topics matching the users query paramters. |  -  |
| **400** | Unable to retreive topics. |  -  |
| **401** | Unauthorized, unable to retrive topics. |  -  |
| **500** | Internal server error. |  -  |
| **503** | Unable to connect to the Kafka cluster. |  -  |


## updateTopic

> Topic updateTopic(topicName, updateTopicInput)

Updates the topic with the specified name.

updates the topic with the new data.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String topicName = "topicName_example"; // String | The topic name which is its unique id.
        UpdateTopicInput updateTopicInput = new UpdateTopicInput(); // UpdateTopicInput | 
        try {
            Topic result = apiInstance.updateTopic(topicName, updateTopicInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateTopic");
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
 **topicName** | **String**| The topic name which is its unique id. |
 **updateTopicInput** | [**UpdateTopicInput**](UpdateTopicInput.md)|  |

### Return type

[**Topic**](Topic.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Topic updated successfully. |  -  |
| **400** | Unable to update topic. |  -  |
| **401** | Unauthroized, unable to update topic. |  -  |
| **404** | Topic not found. |  -  |
| **500** | Internal server error. |  -  |
| **503** | Unable to connect to the Kafka cluster. |  -  |

