package com.openshift.cloud.api.kas.auth;

import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.kas.auth.models.Error;
import com.openshift.cloud.api.kas.auth.models.Record;
import com.openshift.cloud.api.kas.auth.models.RecordIncludedProperty;
import com.openshift.cloud.api.kas.auth.models.RecordList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecordsApi {
  private ApiClient apiClient;

  public RecordsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RecordsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Consume records from a topic
   * Consume a limited number of records from a topic, optionally specifying a partition and an absolute offset or timestamp as the starting point for message retrieval.
   * @param topicName Topic name (required)
   * @param include List of properties to include for each record in the response (optional)
   * @param limit Limit the number of records fetched and returned (optional)
   * @param maxValueLength Maximum length of string values returned in the response. Values with a length that exceeds this parameter will be truncated. When this parameter is not included in the request, the full string values will be returned. (optional)
   * @param offset Retrieve messages with an offset equal to or greater than this offset. If both &#x60;timestamp&#x60; and &#x60;offset&#x60; are requested, &#x60;timestamp&#x60; is given preference. (optional)
   * @param partition Retrieve messages only from this partition (optional)
   * @param timestamp Retrieve messages with a timestamp equal to or later than this timestamp. If both &#x60;timestamp&#x60; and &#x60;offset&#x60; are requested, &#x60;timestamp&#x60; is given preference. (optional)
   * @return a {@code RecordList}
   * @throws ApiException if fails to make API call
   */
  public RecordList consumeRecords(String topicName, List<RecordIncludedProperty> include, Integer limit, Integer maxValueLength, Integer offset, Integer partition, Object timestamp) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'topicName' is set
    if (topicName == null) {
      throw new ApiException(400, "Missing the required parameter 'topicName' when calling consumeRecords");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/topics/{topicName}/records".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "topicName" + "\\}", apiClient.escapeString(topicName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxValueLength", maxValueLength));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "partition", partition));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timestamp", timestamp));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer", "OAuth2" };

    GenericType<RecordList> localVarReturnType = new GenericType<RecordList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Send a record to a topic
   * Produce (write) a single record to a topic.
   * @param topicName Topic name (required)
   * @param record  (required)
   * @return a {@code Record}
   * @throws ApiException if fails to make API call
   */
  public Record produceRecord(String topicName, Record record) throws ApiException {
    Object localVarPostBody = record;
    
    // verify the required parameter 'topicName' is set
    if (topicName == null) {
      throw new ApiException(400, "Missing the required parameter 'topicName' when calling produceRecord");
    }
    
    // verify the required parameter 'record' is set
    if (record == null) {
      throw new ApiException(400, "Missing the required parameter 'record' when calling produceRecord");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/topics/{topicName}/records".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "topicName" + "\\}", apiClient.escapeString(topicName.toString()));

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

    String[] localVarAuthNames = new String[] { "Bearer", "OAuth2" };

    GenericType<Record> localVarReturnType = new GenericType<Record>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
