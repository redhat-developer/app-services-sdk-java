# TopicsApi

All URIs are relative to *http://localhost/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTopic**](TopicsApi.md#createTopic) | **POST** /topics | Creates a new topic
[**deleteTopic**](TopicsApi.md#deleteTopic) | **DELETE** /topics/{topicName} | Deletes a  topic
[**getTopic**](TopicsApi.md#getTopic) | **GET** /topics/{topicName} | Retrieves the topic with the specified name.
[**getTopics**](TopicsApi.md#getTopics) | **GET** /topics | List of topics
[**updateTopic**](TopicsApi.md#updateTopic) | **PATCH** /topics/{topicName} | Updates the topic with the specified name.



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
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.TopicsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/rest");
        
        // Configure OAuth2 access token for authorization: Bearer
        OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setAccessToken("YOUR ACCESS TOKEN");

        TopicsApi apiInstance = new TopicsApi(defaultClient);
        NewTopicInput newTopicInput = new NewTopicInput(); // NewTopicInput | Topic to create.
        try {
            Topic result = apiInstance.createTopic(newTopicInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopicsApi#createTopic");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Topic created successfully. |  -  |
| **400** | The client request was invalid |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **409** | The resource already exists. |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |


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
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.TopicsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/rest");
        
        // Configure OAuth2 access token for authorization: Bearer
        OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setAccessToken("YOUR ACCESS TOKEN");

        TopicsApi apiInstance = new TopicsApi(defaultClient);
        String topicName = "topicName_example"; // String | The topic name to delete.
        try {
            apiInstance.deleteTopic(topicName);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopicsApi#deleteTopic");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Topic deleted successfully. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **404** | Topic not found. |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |


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
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.TopicsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/rest");
        
        // Configure OAuth2 access token for authorization: Bearer
        OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setAccessToken("YOUR ACCESS TOKEN");

        TopicsApi apiInstance = new TopicsApi(defaultClient);
        String topicName = "topicName_example"; // String | The topic name to retrieve.
        try {
            Topic result = apiInstance.getTopic(topicName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopicsApi#getTopic");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Kafka topic details. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **404** | Topic not found. |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |


## getTopics

> TopicsList getTopics(size, filter, page, order, orderKey)

List of topics

Returns a list of all of the available topics, or the list of topics that meet the request query parameters. The topics returned are limited to those records the requestor is authorized to view.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.TopicsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/rest");
        
        // Configure OAuth2 access token for authorization: Bearer
        OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setAccessToken("YOUR ACCESS TOKEN");

        TopicsApi apiInstance = new TopicsApi(defaultClient);
        Integer size = 56; // Integer | Maximum number of topics to return on single page
        String filter = "filter_example"; // String | Filter to apply when returning the list of topics
        Integer page = 56; // Integer | The page when returning the limit of requested topics.
        String order = "order_example"; // String | Order of the items sorting. Ascending order is used as default.
        String orderKey = "orderKey_example"; // String | Order key to sort the topics by.
        try {
            TopicsList result = apiInstance.getTopics(size, filter, page, order, orderKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopicsApi#getTopics");
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
 **size** | **Integer**| Maximum number of topics to return on single page | [optional]
 **filter** | **String**| Filter to apply when returning the list of topics | [optional]
 **page** | **Integer**| The page when returning the limit of requested topics. | [optional]
 **order** | **String**| Order of the items sorting. Ascending order is used as default. | [optional] [enum: asc, desc]
 **orderKey** | **String**| Order key to sort the topics by. | [optional] [enum: name, partitions, retention.ms, retention.bytes]

### Return type

[**TopicsList**](TopicsList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of topics matching the request query parameters. The topics returned are limited to those records the requestor is authorized to view. |  -  |
| **400** | Unable to retrieve topics. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |


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
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.TopicsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost/rest");
        
        // Configure OAuth2 access token for authorization: Bearer
        OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setAccessToken("YOUR ACCESS TOKEN");

        TopicsApi apiInstance = new TopicsApi(defaultClient);
        String topicName = "topicName_example"; // String | The topic name which is its unique id.
        UpdateTopicInput updateTopicInput = new UpdateTopicInput(); // UpdateTopicInput | 
        try {
            Topic result = apiInstance.updateTopic(topicName, updateTopicInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopicsApi#updateTopic");
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

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Topic updated successfully. |  -  |
| **400** | The client request was invalid |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **404** | Topic not found. |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |

