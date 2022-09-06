package com.openshift.cloud.api.kas.auth;

import com.openshift.cloud.api.kas.auth.invoker.ApiException;
import com.openshift.cloud.api.kas.auth.invoker.ApiClient;
import com.openshift.cloud.api.kas.auth.invoker.Configuration;
import com.openshift.cloud.api.kas.auth.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.kas.auth.models.AclBinding;
import com.openshift.cloud.api.kas.auth.models.AclBindingListPage;
import com.openshift.cloud.api.kas.auth.models.AclBindingOrderKey;
import com.openshift.cloud.api.kas.auth.models.AclOperationFilter;
import com.openshift.cloud.api.kas.auth.models.AclPatternTypeFilter;
import com.openshift.cloud.api.kas.auth.models.AclPermissionTypeFilter;
import com.openshift.cloud.api.kas.auth.models.AclResourceTypeFilter;
import com.openshift.cloud.api.kas.auth.models.Error;
import com.openshift.cloud.api.kas.auth.models.SortDirection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AclsApi {
  private ApiClient apiClient;

  public AclsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AclsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create ACL binding
   * Creates a new ACL binding for a Kafka instance.
   * @param aclBinding ACL to create. (required)
   * @throws ApiException if fails to make API call
   */
  public void createAcl(AclBinding aclBinding) throws ApiException {
    Object localVarPostBody = aclBinding;
    
    // verify the required parameter 'aclBinding' is set
    if (aclBinding == null) {
      throw new ApiException(400, "Missing the required parameter 'aclBinding' when calling createAcl");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/acls".replaceAll("\\{format\\}","json");

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete ACL bindings
   * Deletes ACL bindings that match the query parameters.
   * @param resourceType ACL Resource Type Filter (optional)
   * @param resourceName ACL Resource Name Filter (optional)
   * @param patternType ACL Pattern Type Filter (optional)
   * @param principal ACL Principal Filter. Either a specific user or the wildcard user &#x60;User:*&#x60; may be provided. - When fetching by a specific user, the results will also include ACL bindings that apply to all users. - When deleting, ACL bindings to be delete must match the provided &#x60;principal&#x60; exactly. (optional, default to )
   * @param operation ACL Operation Filter. The ACL binding operation provided should be valid for the resource type in the request, if not &#x60;ANY&#x60;. (optional)
   * @param permission ACL Permission Type Filter (optional)
   * @return a {@code AclBindingListPage}
   * @throws ApiException if fails to make API call
   */
  public AclBindingListPage deleteAcls(AclResourceTypeFilter resourceType, String resourceName, AclPatternTypeFilter patternType, String principal, AclOperationFilter operation, AclPermissionTypeFilter permission) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/acls".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resourceType", resourceType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resourceName", resourceName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "patternType", patternType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "principal", principal));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operation", operation));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "permission", permission));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer", "OAuth2" };

    GenericType<AclBindingListPage> localVarReturnType = new GenericType<AclBindingListPage>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Retrieve allowed ACL resources and operations
   * Retrieve the resources and associated operations that may have ACLs configured.
   * @return a {@code Map<String, List<String>>}
   * @throws ApiException if fails to make API call
   */
  public Map<String, List<String>> getAclResourceOperations() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/acls/resource-operations".replaceAll("\\{format\\}","json");

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

    GenericType<Map<String, List<String>>> localVarReturnType = new GenericType<Map<String, List<String>>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List ACL bindings
   * Returns a list of all of the available ACL bindings, or the list of bindings that meet the user&#39;s URL query parameters. If no parameters are specified, all ACL bindings known to the system will be returned (with paging).
   * @param resourceType ACL Resource Type Filter (optional)
   * @param resourceName ACL Resource Name Filter (optional)
   * @param patternType ACL Pattern Type Filter (optional)
   * @param principal ACL Principal Filter. Either a specific user or the wildcard user &#x60;User:*&#x60; may be provided. - When fetching by a specific user, the results will also include ACL bindings that apply to all users. - When deleting, ACL bindings to be delete must match the provided &#x60;principal&#x60; exactly. (optional, default to )
   * @param operation ACL Operation Filter. The ACL binding operation provided should be valid for the resource type in the request, if not &#x60;ANY&#x60;. (optional)
   * @param permission ACL Permission Type Filter (optional)
   * @param page Page number (optional)
   * @param size Number of records per page (optional)
   * @param order Order items are sorted (optional)
   * @param orderKey  (optional)
   * @return a {@code AclBindingListPage}
   * @throws ApiException if fails to make API call
   */
  public AclBindingListPage getAcls(AclResourceTypeFilter resourceType, String resourceName, AclPatternTypeFilter patternType, String principal, AclOperationFilter operation, AclPermissionTypeFilter permission, Integer page, Integer size, SortDirection order, AclBindingOrderKey orderKey) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/acls".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resourceType", resourceType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resourceName", resourceName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "patternType", patternType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "principal", principal));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "operation", operation));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "permission", permission));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
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

    GenericType<AclBindingListPage> localVarReturnType = new GenericType<AclBindingListPage>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
