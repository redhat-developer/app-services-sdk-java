package com.openshift.cloud.api.kas.auth;

import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.kas.auth.models.ConsumerGroup;
import com.openshift.cloud.api.kas.auth.models.ConsumerGroupList;
import com.openshift.cloud.api.kas.auth.models.ConsumerGroupResetOffsetParameters;
import com.openshift.cloud.api.kas.auth.models.ConsumerGroupResetOffsetResult;
import com.openshift.cloud.api.kas.auth.models.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupsApi {
  private ApiClient apiClient;

  public GroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GroupsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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

    String[] localVarAuthNames = new String[] { "Bearer" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get a single consumer group by its unique ID.
   * 
   * @param consumerGroupId The unique ID of the consumer group (required)
   * @param order Order of the items sorting. Ascending order is used as default. (optional)
   * @param orderKey Order key to sort the topics by. (optional)
   * @param partitionFilter Value of partition to include. Value -1 means filter is not active. (optional)
   * @param topic Filter consumer groups for a specific topic (optional)
   * @return a {@code ConsumerGroup}
   * @throws ApiException if fails to make API call
   */
  public ConsumerGroup getConsumerGroupById(String consumerGroupId, String order, String orderKey, Integer partitionFilter, String topic) throws ApiException {
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

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderKey", orderKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "partitionFilter", partitionFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "topic", topic));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<ConsumerGroup> localVarReturnType = new GenericType<ConsumerGroup>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List of consumer groups in the Kafka instance.
   * Returns a list of all consumer groups for a particular Kafka instance. The consumer groups returned are limited to those records the requestor is authorized to view.
   * @param size Maximum number of consumer groups to return on single page (optional)
   * @param page The page when returning the list of consumer groups (optional)
   * @param topic Return consumer groups where the topic name contains with this value (optional)
   * @param groupIdFilter Return the consumer groups where the ID contains with this value (optional)
   * @param order Order of the consumer groups sorting. Ascending order is used as default. (optional)
   * @param orderKey Order key to sort the items by. Only the value &#39;name&#39; is currently applicable. (optional)
   * @return a {@code ConsumerGroupList}
   * @throws ApiException if fails to make API call
   */
  public ConsumerGroupList getConsumerGroups(Integer size, Integer page, String topic, String groupIdFilter, String order, String orderKey) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/consumer-groups".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "topic", topic));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group-id-filter", groupIdFilter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderKey", orderKey));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<ConsumerGroupList> localVarReturnType = new GenericType<ConsumerGroupList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Reset the offset for a consumer group.
   * Reset the offset for a particular consumer group.
   * @param consumerGroupId The ID of the consumer group. (required)
   * @param consumerGroupResetOffsetParameters  (required)
   * @return a {@code ConsumerGroupResetOffsetResult}
   * @throws ApiException if fails to make API call
   */
  public ConsumerGroupResetOffsetResult resetConsumerGroupOffset(String consumerGroupId, ConsumerGroupResetOffsetParameters consumerGroupResetOffsetParameters) throws ApiException {
    Object localVarPostBody = consumerGroupResetOffsetParameters;
    
    // verify the required parameter 'consumerGroupId' is set
    if (consumerGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'consumerGroupId' when calling resetConsumerGroupOffset");
    }
    
    // verify the required parameter 'consumerGroupResetOffsetParameters' is set
    if (consumerGroupResetOffsetParameters == null) {
      throw new ApiException(400, "Missing the required parameter 'consumerGroupResetOffsetParameters' when calling resetConsumerGroupOffset");
    }
    
    // create path and map variables
    String localVarPath = "/consumer-groups/{consumerGroupId}/reset-offset".replaceAll("\\{format\\}","json")
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<ConsumerGroupResetOffsetResult> localVarReturnType = new GenericType<ConsumerGroupResetOffsetResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
