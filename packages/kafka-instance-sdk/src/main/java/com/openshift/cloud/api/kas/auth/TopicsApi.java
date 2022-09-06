package com.openshift.cloud.api.kas.auth;

import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.kas.auth.models.Error;
import com.openshift.cloud.api.kas.auth.models.NewTopicInput;
import com.openshift.cloud.api.kas.auth.models.SortDirection;
import com.openshift.cloud.api.kas.auth.models.Topic;
import com.openshift.cloud.api.kas.auth.models.TopicOrderKey;
import com.openshift.cloud.api.kas.auth.models.TopicSettings;
import com.openshift.cloud.api.kas.auth.models.TopicsList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TopicsApi {
  private ApiClient apiClient;

  public TopicsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TopicsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates a new topic
   * Creates a new topic for Kafka.
   * @param newTopicInput Topic to create. (required)
   * @return a {@code Topic}
   * @throws ApiException if fails to make API call
   */
  public Topic createTopic(NewTopicInput newTopicInput) throws ApiException {
    Object localVarPostBody = newTopicInput;
    
    // verify the required parameter 'newTopicInput' is set
    if (newTopicInput == null) {
      throw new ApiException(400, "Missing the required parameter 'newTopicInput' when calling createTopic");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/topics".replaceAll("\\{format\\}","json");

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

    GenericType<Topic> localVarReturnType = new GenericType<Topic>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deletes a topic
   * Deletes the topic with the specified name.
   * @param topicName Name of the topic to delete (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTopic(String topicName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'topicName' is set
    if (topicName == null) {
      throw new ApiException(400, "Missing the required parameter 'topicName' when calling deleteTopic");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/topics/{topicName}".replaceAll("\\{format\\}","json")
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer", "OAuth2" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Retrieves a single topic
   * Topic
   * @param topicName Name of the topic to describe (required)
   * @return a {@code Topic}
   * @throws ApiException if fails to make API call
   */
  public Topic getTopic(String topicName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'topicName' is set
    if (topicName == null) {
      throw new ApiException(400, "Missing the required parameter 'topicName' when calling getTopic");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/topics/{topicName}".replaceAll("\\{format\\}","json")
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer", "OAuth2" };

    GenericType<Topic> localVarReturnType = new GenericType<Topic>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieves a list of topics
   * Returns a list of all of the available topics, or the list of topics that meet the request query parameters. The topics returned are limited to those records the requestor is authorized to view.
   * @param size Number of records per page (optional)
   * @param filter Filter to apply when returning the list of topics (optional)
   * @param page Page number (optional)
   * @param order Order items are sorted (optional)
   * @param orderKey Order key to sort the topics by. (optional)
   * @return a {@code TopicsList}
   * @throws ApiException if fails to make API call
   */
  public TopicsList getTopics(Integer size, String filter, Integer page, SortDirection order, TopicOrderKey orderKey) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/topics".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderKey", orderKey));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer", "OAuth2" };

    GenericType<TopicsList> localVarReturnType = new GenericType<TopicsList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates a single topic
   * Update the configuration settings for a topic.
   * @param topicName Name of the topic to update (required)
   * @param topicSettings  (required)
   * @return a {@code Topic}
   * @throws ApiException if fails to make API call
   */
  public Topic updateTopic(String topicName, TopicSettings topicSettings) throws ApiException {
    Object localVarPostBody = topicSettings;
    
    // verify the required parameter 'topicName' is set
    if (topicName == null) {
      throw new ApiException(400, "Missing the required parameter 'topicName' when calling updateTopic");
    }
    
    // verify the required parameter 'topicSettings' is set
    if (topicSettings == null) {
      throw new ApiException(400, "Missing the required parameter 'topicSettings' when calling updateTopic");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/topics/{topicName}".replaceAll("\\{format\\}","json")
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

    GenericType<Topic> localVarReturnType = new GenericType<Topic>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
