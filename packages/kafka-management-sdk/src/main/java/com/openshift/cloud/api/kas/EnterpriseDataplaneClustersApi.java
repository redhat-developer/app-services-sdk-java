package com.openshift.cloud.api.kas;

import com.openshift.cloud.api.kas.invoker.ApiException;
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.kas.models.EnterpriseClusterList;
import com.openshift.cloud.api.kas.models.EnterpriseClusterRegistrationResponse;
import com.openshift.cloud.api.kas.models.EnterpriseOsdClusterPayload;
import com.openshift.cloud.api.kas.models.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnterpriseDataplaneClustersApi {
  private ApiClient apiClient;

  public EnterpriseDataplaneClustersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EnterpriseDataplaneClustersApi(ApiClient apiClient) {
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
   * List all Enterprise OSD clusters
   * @return a {@code EnterpriseClusterList}
   * @throws ApiException if fails to make API call
   */
  public EnterpriseClusterList getEnterpriseOsdClusters() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1/clusters".replaceAll("\\{format\\}","json");

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

    GenericType<EnterpriseClusterList> localVarReturnType = new GenericType<EnterpriseClusterList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Register enterprise data plane cluster
   * @param enterpriseOsdClusterPayload Enterprise data plane cluster details (required)
   * @return a {@code EnterpriseClusterRegistrationResponse}
   * @throws ApiException if fails to make API call
   */
  public EnterpriseClusterRegistrationResponse registerEnterpriseOsdCluster(EnterpriseOsdClusterPayload enterpriseOsdClusterPayload) throws ApiException {
    Object localVarPostBody = enterpriseOsdClusterPayload;
    
    // verify the required parameter 'enterpriseOsdClusterPayload' is set
    if (enterpriseOsdClusterPayload == null) {
      throw new ApiException(400, "Missing the required parameter 'enterpriseOsdClusterPayload' when calling registerEnterpriseOsdCluster");
    }
    
    // create path and map variables
    String localVarPath = "/api/kafkas_mgmt/v1/clusters".replaceAll("\\{format\\}","json");

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

    GenericType<EnterpriseClusterRegistrationResponse> localVarReturnType = new GenericType<EnterpriseClusterRegistrationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
