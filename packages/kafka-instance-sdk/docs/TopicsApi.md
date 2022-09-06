# TopicsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTopic**](TopicsApi.md#createTopic) | **POST** /api/v1/topics | Creates a new topic
[**deleteTopic**](TopicsApi.md#deleteTopic) | **DELETE** /api/v1/topics/{topicName} | Deletes a topic
[**getTopic**](TopicsApi.md#getTopic) | **GET** /api/v1/topics/{topicName} | Retrieves a single topic
[**getTopics**](TopicsApi.md#getTopics) | **GET** /api/v1/topics | Retrieves a list of topics
[**updateTopic**](TopicsApi.md#updateTopic) | **PATCH** /api/v1/topics/{topicName} | Updates a single topic



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
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

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

[Bearer](../README.md#Bearer), [OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | The client request was invalid. One or more request parameters or the request body was rejected. Additional information may be found in the response. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **409** | The resource already exists. |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |
| **201** | Topic created successfully. |  -  |


## deleteTopic

> deleteTopic(topicName)

Deletes a topic

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
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        TopicsApi apiInstance = new TopicsApi(defaultClient);
        String topicName = "topicName_example"; // String | Name of the topic to delete
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
 **topicName** | **String**| Name of the topic to delete |

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
| **204** | Topic deleted successfully. |  -  |
| **401** | Request authentication missing or invalid |  -  |
| **403** | User is not authorized to access requested resource |  -  |
| **404** | The requested resource could not be found. |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |


## getTopic

> Topic getTopic(topicName)

Retrieves a single topic

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
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        TopicsApi apiInstance = new TopicsApi(defaultClient);
        String topicName = "topicName_example"; // String | Name of the topic to describe
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
 **topicName** | **String**| Name of the topic to describe |

### Return type

[**Topic**](Topic.md)

### Authorization

[Bearer](../README.md#Bearer), [OAuth2](../README.md#OAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Request authentication missing or invalid |  -  |
| **403** | User is not authorized to access requested resource |  -  |
| **404** | The requested resource could not be found. |  -  |
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |
| **200** | Kafka topic details |  -  |


## getTopics

> TopicsList getTopics(size, filter, page, order, orderKey)

Retrieves a list of topics

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
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        TopicsApi apiInstance = new TopicsApi(defaultClient);
        Integer size = 56; // Integer | Number of records per page
        String filter = "filter_example"; // String | Filter to apply when returning the list of topics
        Integer page = 56; // Integer | Page number
        SortDirection order = SortDirection.fromValue("asc"); // SortDirection | Order items are sorted
        TopicOrderKey orderKey = new TopicOrderKey(); // TopicOrderKey | Order key to sort the topics by.
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
 **size** | **Integer**| Number of records per page | [optional]
 **filter** | **String**| Filter to apply when returning the list of topics | [optional]
 **page** | **Integer**| Page number | [optional]
 **order** | [**SortDirection**](.md)| Order items are sorted | [optional] [enum: asc, desc]
 **orderKey** | [**TopicOrderKey**](.md)| Order key to sort the topics by. | [optional]

### Return type

[**TopicsList**](TopicsList.md)

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
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |
| **200** | List of topics matching the request query parameters. The topics returned are limited to those records the requestor is authorized to view. |  -  |


## updateTopic

> Topic updateTopic(topicName, topicSettings)

Updates a single topic

Update the configuration settings for a topic.

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
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        TopicsApi apiInstance = new TopicsApi(defaultClient);
        String topicName = "topicName_example"; // String | Name of the topic to update
        TopicSettings topicSettings = new TopicSettings(); // TopicSettings | 
        try {
            Topic result = apiInstance.updateTopic(topicName, topicSettings);
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
 **topicName** | **String**| Name of the topic to update |
 **topicSettings** | [**TopicSettings**](TopicSettings.md)|  |

### Return type

[**Topic**](Topic.md)

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
| **200** | Topic updated successfully. |  -  |

