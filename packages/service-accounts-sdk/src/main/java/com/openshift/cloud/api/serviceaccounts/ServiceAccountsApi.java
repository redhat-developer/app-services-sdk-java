package com.openshift.cloud.api.serviceaccounts;

import com.openshift.cloud.api.serviceaccounts.invoker.ApiException;
import com.openshift.cloud.api.serviceaccounts.invoker.ApiClient;
import com.openshift.cloud.api.serviceaccounts.invoker.Configuration;
import com.openshift.cloud.api.serviceaccounts.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.serviceaccounts.models.Error;
import com.openshift.cloud.api.serviceaccounts.models.RedHatErrorRepresentation;
import com.openshift.cloud.api.serviceaccounts.models.ServiceAccountCreateRequestData;
import com.openshift.cloud.api.serviceaccounts.models.ServiceAccountData;
import com.openshift.cloud.api.serviceaccounts.models.ServiceAccountRequestData;
import java.util.Set;
import com.openshift.cloud.api.serviceaccounts.models.ValidationExceptionData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceAccountsApi {
  private ApiClient apiClient;

  public ServiceAccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServiceAccountsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create service account
   * Create a service account. Created service account is associated with the user defined in the bearer token.
   * @param serviceAccountCreateRequestData &#39;name&#39; and &#39;description&#39; of the service account (required)
   * @return a {@code ServiceAccountData}
   * @throws ApiException if fails to make API call
   */
  public ServiceAccountData createServiceAccount(ServiceAccountCreateRequestData serviceAccountCreateRequestData) throws ApiException {
    Object localVarPostBody = serviceAccountCreateRequestData;
    
    // verify the required parameter 'serviceAccountCreateRequestData' is set
    if (serviceAccountCreateRequestData == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceAccountCreateRequestData' when calling createServiceAccount");
    }
    
    // create path and map variables
    String localVarPath = "/apis/service_accounts/v1".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] { "authFlow", "serviceAccounts" };

    GenericType<ServiceAccountData> localVarReturnType = new GenericType<ServiceAccountData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete service account by id
   * Delete service account by id. Throws not found exception if the service account is not found or the user does not have access to this service account
   * @param id  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteServiceAccount(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteServiceAccount");
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

    String[] localVarAuthNames = new String[] { "authFlow", "serviceAccounts" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
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

    String[] localVarAuthNames = new String[] { "authFlow", "serviceAccounts" };

    GenericType<ServiceAccountData> localVarReturnType = new GenericType<ServiceAccountData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List all service accounts
   * Returns a list of service accounts created by a user. User information is obtained from the bearer token. The list is paginated with starting index as &#39;first&#39; and page size as &#39;max&#39;.
   * @param first  (optional, default to 0)
   * @param max  (optional, default to 20)
   * @param clientId  (optional)
   * @return a {@code List<ServiceAccountData>}
   * @throws ApiException if fails to make API call
   */
  public List<ServiceAccountData> getServiceAccounts(Integer first, Integer max, Set<String> clientId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/apis/service_accounts/v1".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "first", first));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "max", max));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "clientId", clientId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "authFlow", "serviceAccounts" };

    GenericType<List<ServiceAccountData>> localVarReturnType = new GenericType<List<ServiceAccountData>>() {};
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

    String[] localVarAuthNames = new String[] { "authFlow", "serviceAccounts" };

    GenericType<ServiceAccountData> localVarReturnType = new GenericType<ServiceAccountData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update service account
   * Update a service account by id.
   * @param id  (required)
   * @param serviceAccountRequestData &#39;name&#39; and &#39;description&#39; of the service account (required)
   * @return a {@code ServiceAccountData}
   * @throws ApiException if fails to make API call
   */
  public ServiceAccountData updateServiceAccount(String id, ServiceAccountRequestData serviceAccountRequestData) throws ApiException {
    Object localVarPostBody = serviceAccountRequestData;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateServiceAccount");
    }
    
    // verify the required parameter 'serviceAccountRequestData' is set
    if (serviceAccountRequestData == null) {
      throw new ApiException(400, "Missing the required parameter 'serviceAccountRequestData' when calling updateServiceAccount");
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "authFlow", "serviceAccounts" };

    GenericType<ServiceAccountData> localVarReturnType = new GenericType<ServiceAccountData>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
