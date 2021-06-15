package com.openshift.cloud.api.kas.auth;

import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.kas.auth.models.ConsumerGroup;
import com.openshift.cloud.api.kas.auth.models.ConsumerGroupList;
import com.openshift.cloud.api.kas.auth.models.NewTopicInput;
import com.openshift.cloud.api.kas.auth.models.Topic;
import com.openshift.cloud.api.kas.auth.models.TopicsList;
import com.openshift.cloud.api.kas.auth.models.UpdateTopicInput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-11T11:25:50.899282543-04:00[America/New_York]")
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
    String localVarPath = "/topics".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<Topic> localVarReturnType = new GenericType<Topic>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a consumer group.
   * Delete a consumer group, along with its consumers.
   * @param consumerGroupId The unique ID of the cobsumer group. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteConsumerGroupById(String consumerGroupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consumerGroupId' is set
    if (consumerGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'consumerGroupId' when calling deleteConsumerGroupById");
    }
    
    // create path and map variables
    String localVarPath = "/consumer-groups/{consumerGroupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "consumerGroupId" + "\\}", apiClient.escapeString(consumerGroupId.toString()));

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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Deletes a  topic
   * Deletes the topic with the specified name.
   * @param topicName The topic name to delete. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTopic(String topicName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'topicName' is set
    if (topicName == null) {
      throw new ApiException(400, "Missing the required parameter 'topicName' when calling deleteTopic");
    }
    
    // create path and map variables
    String localVarPath = "/topics/{topicName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "topicName" + "\\}", apiClient.escapeString(topicName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get a single consumer group by its unique ID.
   * 
   * @param consumerGroupId The unique ID of the consumer group (required)
   * @param topic Filter consumer groups for a specific topic (optional)
   * @return a {@code ConsumerGroup}
   * @throws ApiException if fails to make API call
   */
  public ConsumerGroup getConsumerGroupById(String consumerGroupId, String topic) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'consumerGroupId' is set
    if (consumerGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'consumerGroupId' when calling getConsumerGroupById");
    }
    
    // create path and map variables
    String localVarPath = "/consumer-groups/{consumerGroupId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "consumerGroupId" + "\\}", apiClient.escapeString(consumerGroupId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "topic", topic));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ConsumerGroup> localVarReturnType = new GenericType<ConsumerGroup>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List of consumer groups in the Kafka instance.
   * Returns a list of all consumer groups for a particular Kafka instance.
   * @param limit Maximum number of consumer groups to returnd (optional)
   * @param offset The page offset when returning the list of consumer groups (optional)
   * @param topic Return consumer groups for this topic (optional)
   * @param groupIdFilter Return the consumer groups where the ID begins with this value (optional)
   * @return a {@code ConsumerGroupList}
   * @throws ApiException if fails to make API call
   */
  public ConsumerGroupList getConsumerGroups(Integer limit, Integer offset, String topic, String groupIdFilter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/consumer-groups".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "topic", topic));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group-id-filter", groupIdFilter));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ConsumerGroupList> localVarReturnType = new GenericType<ConsumerGroupList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieves the topic with the specified name.
   * Topic
   * @param topicName The topic name to retrieve. (required)
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
    String localVarPath = "/topics/{topicName}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] {  };

    GenericType<Topic> localVarReturnType = new GenericType<Topic>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List of topics
   * Returns a list of all of the available topics, or the list of topics that meet the users URL Query Parameters.
   * @param limit Maximum number of topics to return (optional)
   * @param filter Filter to apply when returning the list of topics (optional)
   * @param offset The page offset when returning the limit of requested topics. (optional)
   * @param order Order of the items sorting. If \&quot;asc\&quot; is set as a value, ascending order is used, descending otherwise. (optional)
   * @return a {@code TopicsList}
   * @throws ApiException if fails to make API call
   */
  public TopicsList getTopics(Integer limit, String filter, Integer offset, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/topics".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TopicsList> localVarReturnType = new GenericType<TopicsList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates the topic with the specified name.
   * updates the topic with the new data.
   * @param topicName The topic name which is its unique id. (required)
   * @param updateTopicInput  (required)
   * @return a {@code Topic}
   * @throws ApiException if fails to make API call
   */
  public Topic updateTopic(String topicName, UpdateTopicInput updateTopicInput) throws ApiException {
    Object localVarPostBody = updateTopicInput;
    
    // verify the required parameter 'topicName' is set
    if (topicName == null) {
      throw new ApiException(400, "Missing the required parameter 'topicName' when calling updateTopic");
    }
    
    // verify the required parameter 'updateTopicInput' is set
    if (updateTopicInput == null) {
      throw new ApiException(400, "Missing the required parameter 'updateTopicInput' when calling updateTopic");
    }
    
    // create path and map variables
    String localVarPath = "/topics/{topicName}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] {  };

    GenericType<Topic> localVarReturnType = new GenericType<Topic>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
