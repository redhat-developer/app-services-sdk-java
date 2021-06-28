package com.openshift.cloud.api.srs;

import com.openshift.cloud.api.srs.invoker.ApiException;
import com.openshift.cloud.api.srs.invoker.ApiClient;
import com.openshift.cloud.api.srs.invoker.Configuration;
import com.openshift.cloud.api.srs.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.srs.models.ErrorRest;
import com.openshift.cloud.api.srs.models.RegistryCreateRest;
import com.openshift.cloud.api.srs.models.RegistryListRest;
import com.openshift.cloud.api.srs.models.RegistryRest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RegistriesApi {
  private ApiClient apiClient;

  public RegistriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RegistriesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new Registry instance
   * 
   * @param registryCreateRest A new &#x60;Registry&#x60; to be created. (required)
   * @return a {@code RegistryRest}
   * @throws ApiException if fails to make API call
   */
  public RegistryRest createRegistry(RegistryCreateRest registryCreateRest) throws ApiException {
    Object localVarPostBody = registryCreateRest;
    
    // verify the required parameter 'registryCreateRest' is set
    if (registryCreateRest == null) {
      throw new ApiException(400, "Missing the required parameter 'registryCreateRest' when calling createRegistry");
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

    GenericType<RegistryRest> localVarReturnType = new GenericType<RegistryRest>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a Registry
   * Deletes an existing &#x60;Registry&#x60;.
   * @param id A unique identifier for a &#x60;Registry&#x60;. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRegistry(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteRegistry");
    }
    
    // create path and map variables
    String localVarPath = "/api/serviceregistry_mgmt/v1/registries/{id}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "Bearer" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get the list of all registries.
   * 
   * @param page Page index (optional)
   * @param size Number of items in each page (optional)
   * @param orderBy Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the _order by_ clause of an SQL statement. Each query can be ordered by any of the kafkaRequests fields. For example, in order to retrieve all kafkas ordered by their name:  &#x60;&#x60;&#x60;sql name asc &#x60;&#x60;&#x60;  Or in order to retrieve all kafkas ordered by their name _and_ created date:  &#x60;&#x60;&#x60;sql name asc, created_at asc &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then the results will be ordered by name. (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the _where_ clause of an SQL statement. Allowed fields in the search are: name, status. Allowed comparators are &#x60;&#x3D;&#x60; or &#x60;LIKE&#x60;. Allowed joins are &#x60;AND&#x60; and &#x60;OR&#x60;, however there is a limit of max 10 joins in the search query.  Examples:  To retrieve request with name equal &#x60;my-registry&#x60;  the value should be:  &#x60;&#x60;&#x60; name &#x3D; my-registry  &#x60;&#x60;&#x60;  To retrieve kafka request with its name starting with &#x60;my&#x60;, the value should be:  &#x60;&#x60;&#x60; name like my%25 &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then all the kafkas that the user has permission to see will be returned.  Note. If the query is invalid, an error will be returned  (optional)
   * @return a {@code RegistryListRest}
   * @throws ApiException if fails to make API call
   */
  public RegistryListRest getRegistries(Integer page, Integer size, String orderBy, String search) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/serviceregistry_mgmt/v1/registries".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<RegistryListRest> localVarReturnType = new GenericType<RegistryListRest>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a Registry
   * Gets the details of a single instance of a &#x60;Registry&#x60;.
   * @param id A unique identifier for a &#x60;Registry&#x60;. (required)
   * @return a {@code RegistryRest}
   * @throws ApiException if fails to make API call
   */
  public RegistryRest getRegistry(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getRegistry");
    }
    
    // create path and map variables
    String localVarPath = "/api/serviceregistry_mgmt/v1/registries/{id}".replaceAll("\\{format\\}","json")
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

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<RegistryRest> localVarReturnType = new GenericType<RegistryRest>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
