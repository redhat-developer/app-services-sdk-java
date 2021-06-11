package com.openshift.cloud.api.srs;

import com.openshift.cloud.api.srs.invoker.ApiException;
import com.openshift.cloud.api.srs.invoker.ApiClient;
import com.openshift.cloud.api.srs.invoker.Configuration;
import com.openshift.cloud.api.srs.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.srs.models.ErrorInfo1;
import com.openshift.cloud.api.srs.models.Registry;
import com.openshift.cloud.api.srs.models.RegistryCreate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-06-11T11:25:37.542472544-04:00[America/New_York]")
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
   * Create a Registry.
   * 
   * @param registryCreate A new &#x60;Registry&#x60; to be created. (required)
   * @return a {@code Registry}
   * @throws ApiException if fails to make API call
   */
  public Registry createRegistry(RegistryCreate registryCreate) throws ApiException {
    Object localVarPostBody = registryCreate;
    
    // verify the required parameter 'registryCreate' is set
    if (registryCreate == null) {
      throw new ApiException(400, "Missing the required parameter 'registryCreate' when calling createRegistry");
    }
    
    // create path and map variables
    String localVarPath = "/api/serviceregistry_mgmt/v1/registries".replaceAll("\\{format\\}","json");

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

    GenericType<Registry> localVarReturnType = new GenericType<Registry>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a Registry
   * Deletes an existing &#x60;Registry&#x60;.
   * @param registryId A unique identifier for a &#x60;Registry&#x60;. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistry(String registryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registryId' is set
    if (registryId == null) {
      throw new ApiException(400, "Missing the required parameter 'registryId' when calling deleteRegistry");
    }
    
    // create path and map variables
    String localVarPath = "/api/serviceregistry_mgmt/v1/registries/{registryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registryId" + "\\}", apiClient.escapeString(registryId.toString()));

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
   * Get the list of all registries.
   * 
   * @return a {@code List<Registry>}
   * @throws ApiException if fails to make API call
   */
  public List<Registry> getRegistries() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/serviceregistry_mgmt/v1/registries".replaceAll("\\{format\\}","json");

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

    GenericType<List<Registry>> localVarReturnType = new GenericType<List<Registry>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a Registry
   * Gets the details of a single instance of a &#x60;Registry&#x60;.
   * @param registryId A unique identifier for a &#x60;Registry&#x60;. (required)
   * @return a {@code Registry}
   * @throws ApiException if fails to make API call
   */
  public Registry getRegistry(String registryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'registryId' is set
    if (registryId == null) {
      throw new ApiException(400, "Missing the required parameter 'registryId' when calling getRegistry");
    }
    
    // create path and map variables
    String localVarPath = "/api/serviceregistry_mgmt/v1/registries/{registryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "registryId" + "\\}", apiClient.escapeString(registryId.toString()));

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

    GenericType<Registry> localVarReturnType = new GenericType<Registry>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
