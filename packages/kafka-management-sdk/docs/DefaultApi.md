# DefaultApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKafka**](DefaultApi.md#createKafka) | **POST** /api/kafkas_mgmt/v1/kafkas | Creates a Kakfa request
[**deleteKafkaById**](DefaultApi.md#deleteKafkaById) | **DELETE** /api/kafkas_mgmt/v1/kafkas/{id} | Deletes a Kakfa request by ID
[**getCloudProviderRegions**](DefaultApi.md#getCloudProviderRegions) | **GET** /api/kafkas_mgmt/v1/cloud_providers/{id}/regions | Returns the list of supported regions of the supported cloud provider
[**getCloudProviders**](DefaultApi.md#getCloudProviders) | **GET** /api/kafkas_mgmt/v1/cloud_providers | Returns the list of supported cloud providers
[**getKafkaById**](DefaultApi.md#getKafkaById) | **GET** /api/kafkas_mgmt/v1/kafkas/{id} | Returns a Kakfa request by ID
[**getKafkas**](DefaultApi.md#getKafkas) | **GET** /api/kafkas_mgmt/v1/kafkas | Returns a list of Kafka requests
[**getMetricsByInstantQuery**](DefaultApi.md#getMetricsByInstantQuery) | **GET** /api/kafkas_mgmt/v1/kafkas/{id}/metrics/query | Returns metrics with instant query by Kakfa ID
[**getMetricsByRangeQuery**](DefaultApi.md#getMetricsByRangeQuery) | **GET** /api/kafkas_mgmt/v1/kafkas/{id}/metrics/query_range | Returns metrics with timeseries range query by Kakfa ID
[**getServiceStatus**](DefaultApi.md#getServiceStatus) | **GET** /api/kafkas_mgmt/v1/status | Returns the status of resources, such as whether maximum service capacity has been reached
[**getVersionMetadata**](DefaultApi.md#getVersionMetadata) | **GET** /api/kafkas_mgmt/v1 | Returns the version metadata


<a name="createKafka"></a>
# **createKafka**
> KafkaRequest createKafka(async, kafkaRequestPayload)

Creates a Kakfa request

### Example
```java
// Import classes:
import com.openshift.cloud.api.kas_admin.invoker.ApiClient;
import com.openshift.cloud.api.kas_admin.invoker.ApiException;
import com.openshift.cloud.api.kas_admin.invoker.Configuration;
import com.openshift.cloud.api.kas_admin.invoker.auth.*;
import com.openshift.cloud.api.kas_admin.invoker.models.*;
import com.openshift.cloud.api.kas_admin.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openshift.com");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Boolean async = true; // Boolean | Perform the action in an asynchronous manner
    KafkaRequestPayload kafkaRequestPayload = new KafkaRequestPayload(); // KafkaRequestPayload | Kafka data
    try {
      KafkaRequest result = apiInstance.createKafka(async, kafkaRequestPayload);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createKafka");
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
 **async** | **Boolean**| Perform the action in an asynchronous manner |
 **kafkaRequestPayload** | [**KafkaRequestPayload**](KafkaRequestPayload.md)| Kafka data |

### Return type

[**KafkaRequest**](KafkaRequest.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  -  |
**400** | Validation errors occurred |  -  |
**401** | Auth token is invalid |  -  |
**403** | User forbidden either because the user is not authorized to access the service or because the maximum number of instances that can be created by this user has been reached. |  -  |
**404** | The requested resource doesn&#39;t exist |  -  |
**409** | A conflict has been detected in the creation of this resource |  -  |
**500** | An unexpected error occurred while creating the Kafka request |  -  |

<a name="deleteKafkaById"></a>
# **deleteKafkaById**
> Error deleteKafkaById(id, async)

Deletes a Kakfa request by ID

### Example
```java
// Import classes:
import com.openshift.cloud.api.kas_admin.invoker.ApiClient;
import com.openshift.cloud.api.kas_admin.invoker.ApiException;
import com.openshift.cloud.api.kas_admin.invoker.Configuration;
import com.openshift.cloud.api.kas_admin.invoker.auth.*;
import com.openshift.cloud.api.kas_admin.invoker.models.*;
import com.openshift.cloud.api.kas_admin.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openshift.com");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String id = "id_example"; // String | The ID of record
    Boolean async = true; // Boolean | Perform the action in an asynchronous manner
    try {
      Error result = apiInstance.deleteKafkaById(id, async);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteKafkaById");
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
 **id** | **String**| The ID of record |
 **async** | **Boolean**| Perform the action in an asynchronous manner |

### Return type

[**Error**](Error.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Deleted |  -  |
**400** | Validation errors occurred |  -  |
**401** | Auth token is invalid |  -  |
**403** | User not authorized to access the service |  -  |
**404** | No Kakfa request with specified ID exists |  -  |
**500** | Unexpected error occurred |  -  |

<a name="getCloudProviderRegions"></a>
# **getCloudProviderRegions**
> CloudRegionList getCloudProviderRegions(id, page, size)

Returns the list of supported regions of the supported cloud provider

### Example
```java
// Import classes:
import com.openshift.cloud.api.kas_admin.invoker.ApiClient;
import com.openshift.cloud.api.kas_admin.invoker.ApiException;
import com.openshift.cloud.api.kas_admin.invoker.Configuration;
import com.openshift.cloud.api.kas_admin.invoker.auth.*;
import com.openshift.cloud.api.kas_admin.invoker.models.*;
import com.openshift.cloud.api.kas_admin.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openshift.com");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String id = "id_example"; // String | The ID of record
    String page = "1"; // String | Page index
    String size = "100"; // String | Number of items in each page
    try {
      CloudRegionList result = apiInstance.getCloudProviderRegions(id, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getCloudProviderRegions");
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
 **id** | **String**| The ID of record |
 **page** | **String**| Page index | [optional]
 **size** | **String**| Number of items in each page | [optional]

### Return type

[**CloudRegionList**](CloudRegionList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returned list of supported cloud provider regions |  -  |
**401** | Auth token is invalid |  -  |
**500** | Unexpected error occurred |  -  |

<a name="getCloudProviders"></a>
# **getCloudProviders**
> CloudProviderList getCloudProviders(page, size)

Returns the list of supported cloud providers

### Example
```java
// Import classes:
import com.openshift.cloud.api.kas_admin.invoker.ApiClient;
import com.openshift.cloud.api.kas_admin.invoker.ApiException;
import com.openshift.cloud.api.kas_admin.invoker.Configuration;
import com.openshift.cloud.api.kas_admin.invoker.auth.*;
import com.openshift.cloud.api.kas_admin.invoker.models.*;
import com.openshift.cloud.api.kas_admin.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openshift.com");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String page = "1"; // String | Page index
    String size = "100"; // String | Number of items in each page
    try {
      CloudProviderList result = apiInstance.getCloudProviders(page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getCloudProviders");
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

### Return type

[**CloudProviderList**](CloudProviderList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returned list of supported cloud providers |  -  |
**401** | Auth token is invalid |  -  |
**500** | Unexpected error occurred |  -  |

<a name="getKafkaById"></a>
# **getKafkaById**
> KafkaRequest getKafkaById(id)

Returns a Kakfa request by ID

### Example
```java
// Import classes:
import com.openshift.cloud.api.kas_admin.invoker.ApiClient;
import com.openshift.cloud.api.kas_admin.invoker.ApiException;
import com.openshift.cloud.api.kas_admin.invoker.Configuration;
import com.openshift.cloud.api.kas_admin.invoker.auth.*;
import com.openshift.cloud.api.kas_admin.invoker.models.*;
import com.openshift.cloud.api.kas_admin.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openshift.com");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String id = "id_example"; // String | The ID of record
    try {
      KafkaRequest result = apiInstance.getKafkaById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getKafkaById");
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
 **id** | **String**| The ID of record |

### Return type

[**KafkaRequest**](KafkaRequest.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Kafka request found by ID |  -  |
**401** | Auth token is invalid |  -  |
**403** | User not authorized to access the service |  -  |
**404** | No Kakfa request with specified ID exists |  -  |
**500** | Unexpected error occurred |  -  |

<a name="getKafkas"></a>
# **getKafkas**
> KafkaRequestList getKafkas(page, size, orderBy, search)

Returns a list of Kafka requests

### Example
```java
// Import classes:
import com.openshift.cloud.api.kas_admin.invoker.ApiClient;
import com.openshift.cloud.api.kas_admin.invoker.ApiException;
import com.openshift.cloud.api.kas_admin.invoker.Configuration;
import com.openshift.cloud.api.kas_admin.invoker.auth.*;
import com.openshift.cloud.api.kas_admin.invoker.models.*;
import com.openshift.cloud.api.kas_admin.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openshift.com");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String page = "1"; // String | Page index
    String size = "100"; // String | Number of items in each page
    String orderBy = "name asc"; // String | Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the `order by` clause of an SQL statement. Each query can be ordered by any of the `kafkaRequests` fields. For example, to return all Kakfa instances ordered by their name, use the following syntax:  ```sql name asc ```  To return all Kakfa instances ordered by their name _and_ created date, use the following syntax:  ```sql name asc, created_at asc ```  If the parameter isn't provided, or if the value is empty, then the results are ordered by name.
    String search = "name = my-kafka and cloud_provider = aws"; // String | Search criteria.  The syntax of this parameter is similar to the syntax of the `where` clause of an SQL statement. Allowed fields in the search are `cloud_provider`, `name`, `owner`, `region`, and `status`. Allowed comparators are `<>`, `=`, or `LIKE`. Allowed joins are `AND` and `OR`. However, you can use a maximum of 10 joins in a search query.  Examples:  To return a Kakfa instance with the name `my-kafka` and the region `aws`, use the following syntax:  ``` name = my-kafka and cloud_provider = aws ```[p-]  To return a Kakfa instance with a name that starts with `my`, use the following syntax:  ``` name like my%25 ```  If the parameter isn't provided, or if the value is empty, then all the Kakfa instances that the user has permission to see are returned.  Note. If the query is invalid, an error is returned. 
    try {
      KafkaRequestList result = apiInstance.getKafkas(page, size, orderBy, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getKafkas");
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
 **orderBy** | **String**| Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the &#x60;order by&#x60; clause of an SQL statement. Each query can be ordered by any of the &#x60;kafkaRequests&#x60; fields. For example, to return all Kakfa instances ordered by their name, use the following syntax:  &#x60;&#x60;&#x60;sql name asc &#x60;&#x60;&#x60;  To return all Kakfa instances ordered by their name _and_ created date, use the following syntax:  &#x60;&#x60;&#x60;sql name asc, created_at asc &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then the results are ordered by name. | [optional]
 **search** | **String**| Search criteria.  The syntax of this parameter is similar to the syntax of the &#x60;where&#x60; clause of an SQL statement. Allowed fields in the search are &#x60;cloud_provider&#x60;, &#x60;name&#x60;, &#x60;owner&#x60;, &#x60;region&#x60;, and &#x60;status&#x60;. Allowed comparators are &#x60;&lt;&gt;&#x60;, &#x60;&#x3D;&#x60;, or &#x60;LIKE&#x60;. Allowed joins are &#x60;AND&#x60; and &#x60;OR&#x60;. However, you can use a maximum of 10 joins in a search query.  Examples:  To return a Kakfa instance with the name &#x60;my-kafka&#x60; and the region &#x60;aws&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name &#x3D; my-kafka and cloud_provider &#x3D; aws &#x60;&#x60;&#x60;[p-]  To return a Kakfa instance with a name that starts with &#x60;my&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name like my%25 &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then all the Kakfa instances that the user has permission to see are returned.  Note. If the query is invalid, an error is returned.  | [optional]

### Return type

[**KafkaRequestList**](KafkaRequestList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Kafka requests |  -  |
**400** | Bad request |  -  |
**401** | Auth token is invalid |  -  |
**403** | User not authorized to access the service |  -  |
**500** | Unexpected error occurred |  -  |

<a name="getMetricsByInstantQuery"></a>
# **getMetricsByInstantQuery**
> MetricsInstantQueryList getMetricsByInstantQuery(id, filters)

Returns metrics with instant query by Kakfa ID

### Example
```java
// Import classes:
import com.openshift.cloud.api.kas_admin.invoker.ApiClient;
import com.openshift.cloud.api.kas_admin.invoker.ApiException;
import com.openshift.cloud.api.kas_admin.invoker.Configuration;
import com.openshift.cloud.api.kas_admin.invoker.auth.*;
import com.openshift.cloud.api.kas_admin.invoker.models.*;
import com.openshift.cloud.api.kas_admin.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openshift.com");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String id = "id_example"; // String | The ID of record
    List<String> filters = Arrays.asList(); // List<String> | List of metrics to fetch. Fetch all metrics when empty. List entries are Kakfa internal metric names.
    try {
      MetricsInstantQueryList result = apiInstance.getMetricsByInstantQuery(id, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getMetricsByInstantQuery");
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
 **id** | **String**| The ID of record |
 **filters** | [**List&lt;String&gt;**](String.md)| List of metrics to fetch. Fetch all metrics when empty. List entries are Kakfa internal metric names. | [optional]

### Return type

[**MetricsInstantQueryList**](MetricsInstantQueryList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returned JSON array of Prometheus metrics objects from observatorium |  -  |
**401** | Auth token is invalid |  -  |
**500** | Unexpected error occurred |  -  |

<a name="getMetricsByRangeQuery"></a>
# **getMetricsByRangeQuery**
> MetricsRangeQueryList getMetricsByRangeQuery(id, duration, interval, filters)

Returns metrics with timeseries range query by Kakfa ID

### Example
```java
// Import classes:
import com.openshift.cloud.api.kas_admin.invoker.ApiClient;
import com.openshift.cloud.api.kas_admin.invoker.ApiException;
import com.openshift.cloud.api.kas_admin.invoker.Configuration;
import com.openshift.cloud.api.kas_admin.invoker.auth.*;
import com.openshift.cloud.api.kas_admin.invoker.models.*;
import com.openshift.cloud.api.kas_admin.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openshift.com");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String id = "id_example"; // String | The ID of record
    Long duration = 5L; // Long | The length of time in minutes for which to return the metrics
    Long interval = 30L; // Long | The interval in seconds between data points
    List<String> filters = Arrays.asList(); // List<String> | List of metrics to fetch. Fetch all metrics when empty. List entries are Kakfa internal metric names.
    try {
      MetricsRangeQueryList result = apiInstance.getMetricsByRangeQuery(id, duration, interval, filters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getMetricsByRangeQuery");
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
 **id** | **String**| The ID of record |
 **duration** | **Long**| The length of time in minutes for which to return the metrics | [default to 5]
 **interval** | **Long**| The interval in seconds between data points | [default to 30]
 **filters** | [**List&lt;String&gt;**](String.md)| List of metrics to fetch. Fetch all metrics when empty. List entries are Kakfa internal metric names. | [optional]

### Return type

[**MetricsRangeQueryList**](MetricsRangeQueryList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returned JSON array of Prometheus metrics objects from observatorium |  -  |
**401** | Auth token is invalid |  -  |
**500** | Unexpected error occurred |  -  |

<a name="getServiceStatus"></a>
# **getServiceStatus**
> ServiceStatus getServiceStatus()

Returns the status of resources, such as whether maximum service capacity has been reached

### Example
```java
// Import classes:
import com.openshift.cloud.api.kas_admin.invoker.ApiClient;
import com.openshift.cloud.api.kas_admin.invoker.ApiException;
import com.openshift.cloud.api.kas_admin.invoker.Configuration;
import com.openshift.cloud.api.kas_admin.invoker.auth.*;
import com.openshift.cloud.api.kas_admin.invoker.models.*;
import com.openshift.cloud.api.kas_admin.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openshift.com");
    
    // Configure HTTP bearer authorization: Bearer
    HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      ServiceStatus result = apiInstance.getServiceStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getServiceStatus");
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

[**ServiceStatus**](ServiceStatus.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**500** | Unexpected error occurred |  -  |

<a name="getVersionMetadata"></a>
# **getVersionMetadata**
> VersionMetadata getVersionMetadata()

Returns the version metadata

### Example
```java
// Import classes:
import com.openshift.cloud.api.kas_admin.invoker.ApiClient;
import com.openshift.cloud.api.kas_admin.invoker.ApiException;
import com.openshift.cloud.api.kas_admin.invoker.Configuration;
import com.openshift.cloud.api.kas_admin.invoker.models.*;
import com.openshift.cloud.api.kas_admin.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openshift.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      VersionMetadata result = apiInstance.getVersionMetadata();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getVersionMetadata");
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

[**VersionMetadata**](VersionMetadata.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Version metadata |  -  |

