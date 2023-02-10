# DefaultApi

All URIs are relative to *https://api.openshift.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKafka**](DefaultApi.md#createKafka) | **POST** /api/kafkas_mgmt/v1/kafkas | 
[**deleteKafkaById**](DefaultApi.md#deleteKafkaById) | **DELETE** /api/kafkas_mgmt/v1/kafkas/{id} | 
[**federateMetrics**](DefaultApi.md#federateMetrics) | **GET** /api/kafkas_mgmt/v1/kafkas/{id}/metrics/federate | 
[**getCloudProviderRegions**](DefaultApi.md#getCloudProviderRegions) | **GET** /api/kafkas_mgmt/v1/cloud_providers/{id}/regions | 
[**getCloudProviders**](DefaultApi.md#getCloudProviders) | **GET** /api/kafkas_mgmt/v1/cloud_providers | 
[**getInstanceTypesByCloudProviderAndRegion**](DefaultApi.md#getInstanceTypesByCloudProviderAndRegion) | **GET** /api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region} | 
[**getKafkaById**](DefaultApi.md#getKafkaById) | **GET** /api/kafkas_mgmt/v1/kafkas/{id} | 
[**getKafkas**](DefaultApi.md#getKafkas) | **GET** /api/kafkas_mgmt/v1/kafkas | 
[**getMetricsByInstantQuery**](DefaultApi.md#getMetricsByInstantQuery) | **GET** /api/kafkas_mgmt/v1/kafkas/{id}/metrics/query | 
[**getMetricsByRangeQuery**](DefaultApi.md#getMetricsByRangeQuery) | **GET** /api/kafkas_mgmt/v1/kafkas/{id}/metrics/query_range | 
[**getVersionMetadata**](DefaultApi.md#getVersionMetadata) | **GET** /api/kafkas_mgmt/v1 | 
[**promoteKafka**](DefaultApi.md#promoteKafka) | **POST** /api/kafkas_mgmt/v1/kafkas/{id}/promote | 
[**updateKafkaById**](DefaultApi.md#updateKafkaById) | **PATCH** /api/kafkas_mgmt/v1/kafkas/{id} | 



## createKafka

> KafkaRequest createKafka(async, kafkaRequestPayload)



Creates a Kafka request

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

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
| **202** | Accepted |  -  |
| **400** | Validation errors occurred |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User forbidden either because the user is not authorized to access the service or because the maximum number of instances that can be created by this user has been reached. |  -  |
| **404** | The requested resource doesn&#39;t exist |  -  |
| **409** | A conflict has been detected in the creation of this resource |  -  |
| **500** | An unexpected error occurred while creating the Kafka request |  -  |


## deleteKafkaById

> Error deleteKafkaById(id, async)



Deletes a Kafka request by ID

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

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
| **202** | Deleted |  -  |
| **400** | Validation errors occurred |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User not authorized to access the service |  -  |
| **404** | No Kafka request with specified ID exists |  -  |
| **500** | Unexpected error occurred |  -  |


## federateMetrics

> String federateMetrics(id)



Returns all metrics in scrapeable format for a given kafka id

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

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
            String result = apiInstance.federateMetrics(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#federateMetrics");
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

**String**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned Kafka metrics in a Prometheus text format |  -  |
| **400** | Bad request |  -  |
| **401** | Auth token is invalid |  -  |
| **404** | Kafka id not found |  -  |
| **500** | Unexpected error occurred |  -  |


## getCloudProviderRegions

> CloudRegionList getCloudProviderRegions(id, page, size)



Returns the list of supported regions of the supported cloud provider

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

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
| **200** | Returned list of supported cloud provider regions |  -  |
| **401** | Auth token is invalid |  -  |
| **500** | Unexpected error occurred |  -  |


## getCloudProviders

> CloudProviderList getCloudProviders(page, size)



Returns the list of supported cloud providers

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

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
| **200** | Returned list of supported cloud providers |  -  |
| **401** | Auth token is invalid |  -  |
| **500** | Unexpected error occurred |  -  |


## getInstanceTypesByCloudProviderAndRegion

> SupportedKafkaInstanceTypesList getInstanceTypesByCloudProviderAndRegion(cloudProvider, cloudRegion)



Returns the list of supported Kafka instance types and sizes filtered by cloud provider and region

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String cloudProvider = "cloudProvider_example"; // String | ID of the supported cloud provider
        String cloudRegion = "cloudRegion_example"; // String | Name of the supported cloud provider region
        try {
            SupportedKafkaInstanceTypesList result = apiInstance.getInstanceTypesByCloudProviderAndRegion(cloudProvider, cloudRegion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getInstanceTypesByCloudProviderAndRegion");
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
 **cloudProvider** | **String**| ID of the supported cloud provider |
 **cloudRegion** | **String**| Name of the supported cloud provider region |

### Return type

[**SupportedKafkaInstanceTypesList**](SupportedKafkaInstanceTypesList.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned list of supported Kafka instance types and sizes filtered by cloud provider and region |  -  |
| **400** | Cloud provider or region is not supported |  -  |
| **401** | Auth token is invalid |  -  |
| **500** | Unexpected error occurred |  -  |


## getKafkaById

> KafkaRequest getKafkaById(id)



Returns a Kafka request by ID

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

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
| **200** | Kafka request found by ID |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User not authorized to access the service |  -  |
| **404** | No Kafka request with specified ID exists |  -  |
| **500** | Unexpected error occurred |  -  |


## getKafkas

> KafkaRequestList getKafkas(page, size, orderBy, search)



Returns a list of Kafka requests

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

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
        String orderBy = "name asc"; // String | Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the `order by` clause of an SQL statement. Each query can be ordered by any of the following `kafkaRequests` fields:  * bootstrap_server_host * admin_api_server_url * cloud_provider * cluster_id * created_at * href * id * instance_type * multi_az * name * organisation_id * owner * reauthentication_enabled * region * status * updated_at * version  For example, to return all Kafka instances ordered by their name, use the following syntax:  ```sql name asc ```  To return all Kafka instances ordered by their name _and_ created date, use the following syntax:  ```sql name asc, created_at asc ```  If the parameter isn't provided, or if the value is empty, then the results are ordered by name.
        String search = "name = my-kafka and cloud_provider = aws"; // String | Search criteria.  The syntax of this parameter is similar to the syntax of the `where` clause of an SQL statement. Allowed fields in the search are `cloud_provider`, `name`, `owner`, `region`, `status` and `cluster_id`. Allowed comparators are `<>`, `=`, `LIKE`, or `ILIKE`. Allowed joins are `AND` and `OR`. However, you can use a maximum of 10 joins in a search query.  Examples:  To return a Kafka instance with the name `my-kafka` and the region `aws`, use the following syntax:  ``` name = my-kafka and cloud_provider = aws ```  To return a Kafka instance with a name that starts with `my`, use the following syntax:  ``` name like my%25 ```  To return a Kafka instance with a name containing `test` matching any character case combinations, use the following syntax:  ``` name ilike %25test%25 ```  If the parameter isn't provided, or if the value is empty, then all the Kafka instances that the user has permission to see are returned.  Note. If the query is invalid, an error is returned. 
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
 **orderBy** | **String**| Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the &#x60;order by&#x60; clause of an SQL statement. Each query can be ordered by any of the following &#x60;kafkaRequests&#x60; fields:  * bootstrap_server_host * admin_api_server_url * cloud_provider * cluster_id * created_at * href * id * instance_type * multi_az * name * organisation_id * owner * reauthentication_enabled * region * status * updated_at * version  For example, to return all Kafka instances ordered by their name, use the following syntax:  &#x60;&#x60;&#x60;sql name asc &#x60;&#x60;&#x60;  To return all Kafka instances ordered by their name _and_ created date, use the following syntax:  &#x60;&#x60;&#x60;sql name asc, created_at asc &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then the results are ordered by name. | [optional]
 **search** | **String**| Search criteria.  The syntax of this parameter is similar to the syntax of the &#x60;where&#x60; clause of an SQL statement. Allowed fields in the search are &#x60;cloud_provider&#x60;, &#x60;name&#x60;, &#x60;owner&#x60;, &#x60;region&#x60;, &#x60;status&#x60; and &#x60;cluster_id&#x60;. Allowed comparators are &#x60;&lt;&gt;&#x60;, &#x60;&#x3D;&#x60;, &#x60;LIKE&#x60;, or &#x60;ILIKE&#x60;. Allowed joins are &#x60;AND&#x60; and &#x60;OR&#x60;. However, you can use a maximum of 10 joins in a search query.  Examples:  To return a Kafka instance with the name &#x60;my-kafka&#x60; and the region &#x60;aws&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name &#x3D; my-kafka and cloud_provider &#x3D; aws &#x60;&#x60;&#x60;  To return a Kafka instance with a name that starts with &#x60;my&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name like my%25 &#x60;&#x60;&#x60;  To return a Kafka instance with a name containing &#x60;test&#x60; matching any character case combinations, use the following syntax:  &#x60;&#x60;&#x60; name ilike %25test%25 &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then all the Kafka instances that the user has permission to see are returned.  Note. If the query is invalid, an error is returned.  | [optional]

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
| **200** | A list of Kafka requests |  -  |
| **400** | Bad request |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User not authorized to access the service |  -  |
| **500** | Unexpected error occurred |  -  |


## getMetricsByInstantQuery

> MetricsInstantQueryList getMetricsByInstantQuery(id, filters)



Returns metrics with instant query by Kafka ID

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | The ID of record
        List<String> filters = Arrays.asList(); // List<String> | List of metrics to fetch. Fetch all metrics when empty. List entries are Kafka internal metric names.
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
 **filters** | [**List&lt;String&gt;**](String.md)| List of metrics to fetch. Fetch all metrics when empty. List entries are Kafka internal metric names. | [optional]

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
| **200** | Returned JSON array of Prometheus metrics objects from observatorium |  -  |
| **401** | Auth token is invalid |  -  |
| **500** | Unexpected error occurred |  -  |


## getMetricsByRangeQuery

> MetricsRangeQueryList getMetricsByRangeQuery(id, duration, interval, filters)



Returns metrics with timeseries range query by Kafka ID

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

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
        List<String> filters = Arrays.asList(); // List<String> | List of metrics to fetch. Fetch all metrics when empty. List entries are Kafka internal metric names.
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
 **filters** | [**List&lt;String&gt;**](String.md)| List of metrics to fetch. Fetch all metrics when empty. List entries are Kafka internal metric names. | [optional]

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
| **200** | Returned JSON array of Prometheus metrics objects from observatorium |  -  |
| **401** | Auth token is invalid |  -  |
| **500** | Unexpected error occurred |  -  |


## getVersionMetadata

> VersionMetadata getVersionMetadata()



Returns the kafka Service Fleet Manager API version metadata

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

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
| **200** | Version metadata |  -  |


## promoteKafka

> promoteKafka(id, async, kafkaPromoteRequest)



Promote a Kafka instance. Promotion is performed asynchronously. The &#x60;async&#x60; query parameter has to be set to &#x60;true&#x60;. Only kafka instances with an &#x60;eval&#x60; billing_model are supported

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | The ID of record
        Boolean async = true; // Boolean | Perform the action in an asynchronous manner. False by default.
        KafkaPromoteRequest kafkaPromoteRequest = new KafkaPromoteRequest(); // KafkaPromoteRequest | Kafka promotion request
        try {
            apiInstance.promoteKafka(id, async, kafkaPromoteRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#promoteKafka");
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
 **async** | **Boolean**| Perform the action in an asynchronous manner. False by default. |
 **kafkaPromoteRequest** | [**KafkaPromoteRequest**](KafkaPromoteRequest.md)| Kafka promotion request |

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
| **202** | Kafka promotion request accepted |  -  |
| **400** | Validation errors occurred |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User forbidden either because the user is not authorized to access the service. |  -  |
| **404** | The requested resource doesn&#39;t exist |  -  |
| **409** | A conflict has been detected with the usage of this resource |  -  |
| **500** | A server error occurred while promoting the Kafka request |  -  |


## updateKafkaById

> KafkaRequest updateKafkaById(id, kafkaUpdateRequest)



Update a Kafka instance by id

### Example

```java
// Import classes:
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.invoker.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.openshift.com");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | The ID of record
        KafkaUpdateRequest kafkaUpdateRequest = new KafkaUpdateRequest(); // KafkaUpdateRequest | Update owner of kafka
        try {
            KafkaRequest result = apiInstance.updateKafkaById(id, kafkaUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateKafkaById");
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
 **kafkaUpdateRequest** | [**KafkaUpdateRequest**](KafkaUpdateRequest.md)| Update owner of kafka |

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
| **200** | Kafka updated by ID |  -  |
| **400** | Bad request |  -  |
| **401** | Auth token is invalid |  -  |
| **403** | User is not authorised to access the service |  -  |
| **404** | No Kafka found with the specified ID |  -  |
| **500** | Unexpected error occurred |  -  |

