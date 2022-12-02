package com.openshift.cloud.api.smartevents;

import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.smartevents.models.BridgeListResponse;
import com.openshift.cloud.api.smartevents.models.BridgeRequest;
import com.openshift.cloud.api.smartevents.models.BridgeResponse;
import com.openshift.cloud.api.smartevents.models.ErrorsList;
import com.openshift.cloud.api.smartevents.models.ManagedResourceStatus;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BridgesApi {
  private ApiClient apiClient;

  public BridgesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BridgesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a Bridge instance
   * Create a Bridge instance for the authenticated user.
   * @param bridgeRequest  (optional)
   * @return a {@code BridgeResponse}
   * @throws ApiException if fails to make API call
   */
  public BridgeResponse bridgesAPICreateBridge(BridgeRequest bridgeRequest) throws ApiException {
    Object localVarPostBody = bridgeRequest;
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges".replaceAll("\\{format\\}","json");

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

    GenericType<BridgeResponse> localVarReturnType = new GenericType<BridgeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a Bridge instance
   * Delete a Bridge instance of the authenticated user by ID.
   * @param bridgeId  (required)
   * @throws ApiException if fails to make API call
   */
  public void bridgesAPIDeleteBridge(String bridgeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling bridgesAPIDeleteBridge");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}".replaceAll("\\{format\\}","json")
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get a Bridge instance
   * Get a Bridge instance of the authenticated user by ID.
   * @param bridgeId  (required)
   * @return a {@code BridgeResponse}
   * @throws ApiException if fails to make API call
   */
  public BridgeResponse bridgesAPIGetBridge(String bridgeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling bridgesAPIGetBridge");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}".replaceAll("\\{format\\}","json")
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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearer" };

    GenericType<BridgeResponse> localVarReturnType = new GenericType<BridgeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the list of Bridge instances
   * Get the list of Bridge instances for the authenticated user.
   * @param name  (optional)
   * @param page  (optional, default to 0)
   * @param size  (optional, default to 100)
   * @param status  (optional)
   * @return a {@code BridgeListResponse}
   * @throws ApiException if fails to make API call
   */
  public BridgeListResponse bridgesAPIGetBridges(String name, Integer page, Integer size, Set<ManagedResourceStatus> status) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges".replaceAll("\\{format\\}","json");

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

    GenericType<BridgeListResponse> localVarReturnType = new GenericType<BridgeListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a Bridge instance
   * Update a Bridge instance for the authenticated user.
   * @param bridgeId  (required)
   * @param bridgeRequest  (optional)
   * @return a {@code BridgeResponse}
   * @throws ApiException if fails to make API call
   */
  public BridgeResponse bridgesAPIUpdateBridge(String bridgeId, BridgeRequest bridgeRequest) throws ApiException {
    Object localVarPostBody = bridgeRequest;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling bridgesAPIUpdateBridge");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}".replaceAll("\\{format\\}","json")
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

    GenericType<BridgeResponse> localVarReturnType = new GenericType<BridgeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
