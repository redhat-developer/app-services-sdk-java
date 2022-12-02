package com.openshift.cloud.api.smartevents;

import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.smartevents.models.ErrorsList;
import com.openshift.cloud.api.smartevents.models.ManagedResourceStatus;
import com.openshift.cloud.api.smartevents.models.ProcessorListResponse;
import com.openshift.cloud.api.smartevents.models.ProcessorRequest;
import com.openshift.cloud.api.smartevents.models.ProcessorResponse;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProcessorsApi {
  private ApiClient apiClient;

  public ProcessorsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProcessorsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a Processor of a Bridge instance
   * Create a Processor of a Bridge instance for the authenticated user.
   * @param bridgeId  (required)
   * @param processorRequest  (optional)
   * @return a {@code ProcessorResponse}
   * @throws ApiException if fails to make API call
   */
  public ProcessorResponse processorsAPICreateProcessor(String bridgeId, ProcessorRequest processorRequest) throws ApiException {
    Object localVarPostBody = processorRequest;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling processorsAPICreateProcessor");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/processors".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bridgeId" + "\\}", apiClient.escapeString(bridgeId.toString()));

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

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<ProcessorResponse> localVarReturnType = new GenericType<ProcessorResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a Processor of a Bridge instance
   * Delete a Processor of a Bridge instance for the authenticated user.
   * @param bridgeId  (required)
   * @param processorId  (required)
   * @throws ApiException if fails to make API call
   */
  public void processorsAPIDeleteProcessor(String bridgeId, String processorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling processorsAPIDeleteProcessor");
    }
    
    // verify the required parameter 'processorId' is set
    if (processorId == null) {
      throw new ApiException(400, "Missing the required parameter 'processorId' when calling processorsAPIDeleteProcessor");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/processors/{processorId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bridgeId" + "\\}", apiClient.escapeString(bridgeId.toString()))
      .replaceAll("\\{" + "processorId" + "\\}", apiClient.escapeString(processorId.toString()));

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

    String[] localVarAuthNames = new String[] { "bearer" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get a Processor of a Bridge instance
   * Get a Processor of a Bridge instance for the authenticated user.
   * @param bridgeId  (required)
   * @param processorId  (required)
   * @return a {@code ProcessorResponse}
   * @throws ApiException if fails to make API call
   */
  public ProcessorResponse processorsAPIGetProcessor(String bridgeId, String processorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling processorsAPIGetProcessor");
    }
    
    // verify the required parameter 'processorId' is set
    if (processorId == null) {
      throw new ApiException(400, "Missing the required parameter 'processorId' when calling processorsAPIGetProcessor");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/processors/{processorId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bridgeId" + "\\}", apiClient.escapeString(bridgeId.toString()))
      .replaceAll("\\{" + "processorId" + "\\}", apiClient.escapeString(processorId.toString()));

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

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<ProcessorResponse> localVarReturnType = new GenericType<ProcessorResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the list of Processors of a Bridge instance
   * Get the list of Processors of a Bridge instance for the authenticated user.
   * @param bridgeId  (required)
   * @param name  (optional)
   * @param page  (optional, default to 0)
   * @param size  (optional, default to 100)
   * @param status  (optional)
   * @return a {@code ProcessorListResponse}
   * @throws ApiException if fails to make API call
   */
  public ProcessorListResponse processorsAPIGetProcessors(String bridgeId, String name, Integer page, Integer size, Set<ManagedResourceStatus> status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling processorsAPIGetProcessors");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/processors".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bridgeId" + "\\}", apiClient.escapeString(bridgeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "status", status));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<ProcessorListResponse> localVarReturnType = new GenericType<ProcessorListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a Processor instance.
   * Update a Processor instance for the authenticated user.
   * @param bridgeId  (required)
   * @param processorId  (required)
   * @param processorRequest  (optional)
   * @return a {@code ProcessorResponse}
   * @throws ApiException if fails to make API call
   */
  public ProcessorResponse processorsAPIUpdateProcessor(String bridgeId, String processorId, ProcessorRequest processorRequest) throws ApiException {
    Object localVarPostBody = processorRequest;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling processorsAPIUpdateProcessor");
    }
    
    // verify the required parameter 'processorId' is set
    if (processorId == null) {
      throw new ApiException(400, "Missing the required parameter 'processorId' when calling processorsAPIUpdateProcessor");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/processors/{processorId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bridgeId" + "\\}", apiClient.escapeString(bridgeId.toString()))
      .replaceAll("\\{" + "processorId" + "\\}", apiClient.escapeString(processorId.toString()));

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

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<ProcessorResponse> localVarReturnType = new GenericType<ProcessorResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
