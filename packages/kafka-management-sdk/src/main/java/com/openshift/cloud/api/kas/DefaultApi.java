package com.openshift.cloud.api.kas;

import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.kas.models.CloudProviderList;
import com.openshift.cloud.api.kas.models.CloudRegionList;
import com.openshift.cloud.api.kas.models.Error;
import com.openshift.cloud.api.kas.models.KafkaPromoteRequest;
import com.openshift.cloud.api.kas.models.KafkaRequest;
import com.openshift.cloud.api.kas.models.KafkaRequestList;
import com.openshift.cloud.api.kas.models.KafkaRequestPayload;
import com.openshift.cloud.api.kas.models.KafkaUpdateRequest;
import com.openshift.cloud.api.kas.models.MetricsInstantQueryList;
import com.openshift.cloud.api.kas.models.MetricsRangeQueryList;
import com.openshift.cloud.api.kas.models.SupportedKafkaInstanceTypesList;
import com.openshift.cloud.api.kas.models.VersionMetadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * Creates a Kafka request
   * @param async Perform the action in an asynchronous manner (required)
   * @param kafkaRequestPayload Kafka data (required)
   * @return a {@code KafkaRequest}
   * @throws ApiException if fails to make API call
   */
  public KafkaRequest createKafka(Boolean async, KafkaRequestPayload kafkaRequestPayload) throws ApiException {
    Object localVarPostBody = kafkaRequestPayload;
    
    // verify the required parameter 'async' is set
    if (async == null) {
      throw new ApiException(400, "Missing the required parameter 'async' when calling createKafka");
    }
    
    // verify the required parameter 'kafkaRequestPayload' is set
    if (kafkaRequestPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'kafkaRequestPayload' when calling createKafka");
    }
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1/kafkas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "async", async));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<KafkaRequest> localVarReturnType = new GenericType<KafkaRequest>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Deletes a Kafka request by ID
   * @param id The ID of record (required)
   * @param async Perform the action in an asynchronous manner (required)
   * @return a {@code Error}
   * @throws ApiException if fails to make API call
   */
  public Error deleteKafkaById(String id, Boolean async) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteKafkaById");
    }
    
    // verify the required parameter 'async' is set
    if (async == null) {
      throw new ApiException(400, "Missing the required parameter 'async' when calling deleteKafkaById");
    }
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1/kafkas/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "async", async));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Returns all metrics in scrapeable format for a given kafka id
   * @param id The ID of record (required)
   * @return a {@code String}
   * @throws ApiException if fails to make API call
   */
  public String federateMetrics(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling federateMetrics");
    }
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1/kafkas/{id}/metrics/federate".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "text/plain", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Returns the list of supported regions of the supported cloud provider
   * @param id The ID of record (required)
   * @param page Page index (optional)
   * @param size Number of items in each page (optional)
   * @return a {@code CloudRegionList}
   * @throws ApiException if fails to make API call
   */
  public CloudRegionList getCloudProviderRegions(String id, String page, String size) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getCloudProviderRegions");
    }
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1/cloud_providers/{id}/regions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<CloudRegionList> localVarReturnType = new GenericType<CloudRegionList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Returns the list of supported cloud providers
   * @param page Page index (optional)
   * @param size Number of items in each page (optional)
   * @return a {@code CloudProviderList}
   * @throws ApiException if fails to make API call
   */
  public CloudProviderList getCloudProviders(String page, String size) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1/cloud_providers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<CloudProviderList> localVarReturnType = new GenericType<CloudProviderList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Returns the list of supported Kafka instance types and sizes filtered by cloud provider and region
   * @param cloudProvider ID of the supported cloud provider (required)
   * @param cloudRegion Name of the supported cloud provider region (required)
   * @return a {@code SupportedKafkaInstanceTypesList}
   * @throws ApiException if fails to make API call
   */
  public SupportedKafkaInstanceTypesList getInstanceTypesByCloudProviderAndRegion(String cloudProvider, String cloudRegion) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'cloudProvider' is set
    if (cloudProvider == null) {
      throw new ApiException(400, "Missing the required parameter 'cloudProvider' when calling getInstanceTypesByCloudProviderAndRegion");
    }
    
    // verify the required parameter 'cloudRegion' is set
    if (cloudRegion == null) {
      throw new ApiException(400, "Missing the required parameter 'cloudRegion' when calling getInstanceTypesByCloudProviderAndRegion");
    }
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1/instance_types/{cloud_provider}/{cloud_region}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cloud_provider" + "\\}", apiClient.escapeString(cloudProvider.toString()))
      .replaceAll("\\{" + "cloud_region" + "\\}", apiClient.escapeString(cloudRegion.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<SupportedKafkaInstanceTypesList> localVarReturnType = new GenericType<SupportedKafkaInstanceTypesList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Returns a Kafka request by ID
   * @param id The ID of record (required)
   * @return a {@code KafkaRequest}
   * @throws ApiException if fails to make API call
   */
  public KafkaRequest getKafkaById(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getKafkaById");
    }
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1/kafkas/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<KafkaRequest> localVarReturnType = new GenericType<KafkaRequest>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Returns a list of Kafka requests
   * @param page Page index (optional)
   * @param size Number of items in each page (optional)
   * @param orderBy Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the &#x60;order by&#x60; clause of an SQL statement. Each query can be ordered by any of the following &#x60;kafkaRequests&#x60; fields:  * bootstrap_server_host * admin_api_server_url * cloud_provider * cluster_id * created_at * href * id * instance_type * multi_az * name * organisation_id * owner * reauthentication_enabled * region * status * updated_at * version  For example, to return all Kafka instances ordered by their name, use the following syntax:  &#x60;&#x60;&#x60;sql name asc &#x60;&#x60;&#x60;  To return all Kafka instances ordered by their name _and_ created date, use the following syntax:  &#x60;&#x60;&#x60;sql name asc, created_at asc &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then the results are ordered by name. (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the &#x60;where&#x60; clause of an SQL statement. Allowed fields in the search are &#x60;cloud_provider&#x60;, &#x60;name&#x60;, &#x60;owner&#x60;, &#x60;region&#x60;, and &#x60;status&#x60;. Allowed comparators are &#x60;&lt;&gt;&#x60;, &#x60;&#x3D;&#x60;, &#x60;LIKE&#x60;, or &#x60;ILIKE&#x60;. Allowed joins are &#x60;AND&#x60; and &#x60;OR&#x60;. However, you can use a maximum of 10 joins in a search query.  Examples:  To return a Kafka instance with the name &#x60;my-kafka&#x60; and the region &#x60;aws&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name &#x3D; my-kafka and cloud_provider &#x3D; aws &#x60;&#x60;&#x60;  To return a Kafka instance with a name that starts with &#x60;my&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name like my%25 &#x60;&#x60;&#x60;  To return a Kafka instance with a name containing &#x60;test&#x60; matching any character case combinations, use the following syntax:  &#x60;&#x60;&#x60; name ilike %25test%25 &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then all the Kafka instances that the user has permission to see are returned.  Note. If the query is invalid, an error is returned.  (optional)
   * @return a {@code KafkaRequestList}
   * @throws ApiException if fails to make API call
   */
  public KafkaRequestList getKafkas(String page, String size, String orderBy, String search) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1/kafkas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<KafkaRequestList> localVarReturnType = new GenericType<KafkaRequestList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Returns metrics with instant query by Kafka ID
   * @param id The ID of record (required)
   * @param filters List of metrics to fetch. Fetch all metrics when empty. List entries are Kafka internal metric names. (optional, default to [])
   * @return a {@code MetricsInstantQueryList}
   * @throws ApiException if fails to make API call
   */
  public MetricsInstantQueryList getMetricsByInstantQuery(String id, List<String> filters) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMetricsByInstantQuery");
    }
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1/kafkas/{id}/metrics/query".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters", filters));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<MetricsInstantQueryList> localVarReturnType = new GenericType<MetricsInstantQueryList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Returns metrics with timeseries range query by Kafka ID
   * @param id The ID of record (required)
   * @param duration The length of time in minutes for which to return the metrics (required)
   * @param interval The interval in seconds between data points (required)
   * @param filters List of metrics to fetch. Fetch all metrics when empty. List entries are Kafka internal metric names. (optional, default to [])
   * @return a {@code MetricsRangeQueryList}
   * @throws ApiException if fails to make API call
   */
  public MetricsRangeQueryList getMetricsByRangeQuery(String id, Long duration, Long interval, List<String> filters) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMetricsByRangeQuery");
    }
    
    // verify the required parameter 'duration' is set
    if (duration == null) {
      throw new ApiException(400, "Missing the required parameter 'duration' when calling getMetricsByRangeQuery");
    }
    
    // verify the required parameter 'interval' is set
    if (interval == null) {
      throw new ApiException(400, "Missing the required parameter 'interval' when calling getMetricsByRangeQuery");
    }
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1/kafkas/{id}/metrics/query_range".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "interval", interval));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters", filters));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<MetricsRangeQueryList> localVarReturnType = new GenericType<MetricsRangeQueryList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Returns the kafka Service Fleet Manager API version metadata
   * @return a {@code VersionMetadata}
   * @throws ApiException if fails to make API call
   */
  public VersionMetadata getVersionMetadata() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<VersionMetadata> localVarReturnType = new GenericType<VersionMetadata>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Promote a Kafka instance. Promotion is performed asynchronously. The &#x60;async&#x60; query parameter has to be set to &#x60;true&#x60;. Only kafka instances with an &#x60;eval&#x60; billing_model are supported
   * @param id The ID of record (required)
   * @param async Perform the action in an asynchronous manner. False by default. (required)
   * @param kafkaPromoteRequest Kafka promotion request (required)
   * @throws ApiException if fails to make API call
   */
  public void promoteKafka(String id, Boolean async, KafkaPromoteRequest kafkaPromoteRequest) throws ApiException {
    Object localVarPostBody = kafkaPromoteRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling promoteKafka");
    }
    
    // verify the required parameter 'async' is set
    if (async == null) {
      throw new ApiException(400, "Missing the required parameter 'async' when calling promoteKafka");
    }
    
    // verify the required parameter 'kafkaPromoteRequest' is set
    if (kafkaPromoteRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'kafkaPromoteRequest' when calling promoteKafka");
    }
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1/kafkas/{id}/promote".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "async", async));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * Update a Kafka instance by id
   * @param id The ID of record (required)
   * @param kafkaUpdateRequest Update owner of kafka (required)
   * @return a {@code KafkaRequest}
   * @throws ApiException if fails to make API call
   */
  public KafkaRequest updateKafkaById(String id, KafkaUpdateRequest kafkaUpdateRequest) throws ApiException {
    Object localVarPostBody = kafkaUpdateRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateKafkaById");
    }
    
    // verify the required parameter 'kafkaUpdateRequest' is set
    if (kafkaUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'kafkaUpdateRequest' when calling updateKafkaById");
    }
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1/kafkas/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<KafkaRequest> localVarReturnType = new GenericType<KafkaRequest>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
