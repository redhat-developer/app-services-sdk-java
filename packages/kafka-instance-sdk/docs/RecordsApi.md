# RecordsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**consumeRecords**](RecordsApi.md#consumeRecords) | **GET** /api/v1/topics/{topicName}/records | Consume records from a topic
[**produceRecord**](RecordsApi.md#produceRecord) | **POST** /api/v1/topics/{topicName}/records | Send a record to a topic



## consumeRecords

> RecordList consumeRecords(topicName, include, limit, maxValueLength, offset, partition, timestamp)

Consume records from a topic

Consume a limited number of records from a topic, optionally specifying a partition and an absolute offset or timestamp as the starting point for message retrieval.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.RecordsApi;

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

        RecordsApi apiInstance = new RecordsApi(defaultClient);
        String topicName = "topicName_example"; // String | Topic name
        List<RecordIncludedProperty> include = Arrays.asList(); // List<RecordIncludedProperty> | List of properties to include for each record in the response
        Integer limit = 56; // Integer | Limit the number of records fetched and returned
        Integer maxValueLength = 56; // Integer | Maximum length of string values returned in the response. Values with a length that exceeds this parameter will be truncated. When this parameter is not included in the request, the full string values will be returned.
        Integer offset = 56; // Integer | Retrieve messages with an offset equal to or greater than this offset. If both `timestamp` and `offset` are requested, `timestamp` is given preference.
        Integer partition = 56; // Integer | Retrieve messages only from this partition
        Object timestamp = null; // Object | Retrieve messages with a timestamp equal to or later than this timestamp. If both `timestamp` and `offset` are requested, `timestamp` is given preference.
        try {
            RecordList result = apiInstance.consumeRecords(topicName, include, limit, maxValueLength, offset, partition, timestamp);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordsApi#consumeRecords");
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
 **topicName** | **String**| Topic name |
 **include** | [**List&lt;RecordIncludedProperty&gt;**](RecordIncludedProperty.md)| List of properties to include for each record in the response | [optional]
 **limit** | **Integer**| Limit the number of records fetched and returned | [optional]
 **maxValueLength** | **Integer**| Maximum length of string values returned in the response. Values with a length that exceeds this parameter will be truncated. When this parameter is not included in the request, the full string values will be returned. | [optional]
 **offset** | **Integer**| Retrieve messages with an offset equal to or greater than this offset. If both &#x60;timestamp&#x60; and &#x60;offset&#x60; are requested, &#x60;timestamp&#x60; is given preference. | [optional]
 **partition** | **Integer**| Retrieve messages only from this partition | [optional]
 **timestamp** | [**Object**](.md)| Retrieve messages with a timestamp equal to or later than this timestamp. If both &#x60;timestamp&#x60; and &#x60;offset&#x60; are requested, &#x60;timestamp&#x60; is given preference. | [optional]

### Return type

[**RecordList**](RecordList.md)

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
| **200** | List of records matching the request query parameters. |  -  |


## produceRecord

> Record produceRecord(topicName, record)

Send a record to a topic

Produce (write) a single record to a topic.

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.auth.*;
import com.openshift.cloud.api.kas.auth.invoker.models.*;
import com.openshift.cloud.api.kas.auth.RecordsApi;

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

        RecordsApi apiInstance = new RecordsApi(defaultClient);
        String topicName = "topicName_example"; // String | Topic name
        Record record = new Record(); // Record | 
        try {
            Record result = apiInstance.produceRecord(topicName, record);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecordsApi#produceRecord");
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
 **topicName** | **String**| Topic name |
 **record** | [**Record**](Record.md)|  |

### Return type

[**Record**](Record.md)

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
| **500** | Internal server error |  -  |
| **503** | Kafka service unavailable |  -  |
| **201** | Record was successfully sent to the topic |  -  |

