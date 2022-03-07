package com.openshift.cloud.api.serviceaccounts;

import com.openshift.cloud.api.serviceaccounts.invoker.ApiException;
import com.openshift.cloud.api.serviceaccounts.invoker.ApiClient;
import com.openshift.cloud.api.serviceaccounts.invoker.Configuration;
import com.openshift.cloud.api.serviceaccounts.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.serviceaccounts.models.Error;
import com.openshift.cloud.api.serviceaccounts.models.ServiceAccountData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceaccountsApi {
  private ApiClient apiClient;

  public ServiceaccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServiceaccountsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get service account by id
   * Returns service account by id. Throws not found exception if the service account is not found or the user does not have access to this service account
   * @param id  (required)
   * @return a {@code ServiceAccountData}
   * @throws ApiException if fails to make API call
   */
  public ServiceAccountData getServiceAccount(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getServiceAccount");
    }
    
    // create path and map variables
    String localVarPath = "/apis/service_accounts/v1/{id}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ServiceAccountData> localVarReturnType = new GenericType<ServiceAccountData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Reset service account secret by id
   * Reset service account secret by id . Throws not found exception if the service account is not found or the user does not have access to this service account
   * @param id  (required)
   * @return a {@code ServiceAccountData}
   * @throws ApiException if fails to make API call
   */
  public ServiceAccountData resetServiceAccountSecret(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling resetServiceAccountSecret");
    }
    
    // create path and map variables
    String localVarPath = "/apis/service_accounts/v1/{id}/resetSecret".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    GenericType<ServiceAccountData> localVarReturnType = new GenericType<ServiceAccountData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
