package com.openshift.cloud.api.smartevents;

import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.smartevents.models.ErrorsList;
import com.openshift.cloud.api.smartevents.models.ManagedResourceStatus;
import com.openshift.cloud.api.smartevents.models.ProcessingErrorListResponse;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProcessingErrorsApi {
  private ApiClient apiClient;

  public ProcessingErrorsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProcessingErrorsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the list of errors for a particular Bridge instance
   * Get the list of errors for a particular Bridge instance for the authenticated user.
   * @param bridgeId  (required)
   * @param name  (optional)
   * @param page  (optional, default to 0)
   * @param size  (optional, default to 100)
   * @param status  (optional)
   * @return a {@code ProcessingErrorListResponse}
   * @throws ApiException if fails to make API call
   */
  public ProcessingErrorListResponse processingErrorsAPIGetBridgeErrors(String bridgeId, String name, Integer page, Integer size, Set<ManagedResourceStatus> status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling processingErrorsAPIGetBridgeErrors");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v1/bridges/{bridgeId}/errors".replaceAll("\\{format\\}","json")
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

    GenericType<ProcessingErrorListResponse> localVarReturnType = new GenericType<ProcessingErrorListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
