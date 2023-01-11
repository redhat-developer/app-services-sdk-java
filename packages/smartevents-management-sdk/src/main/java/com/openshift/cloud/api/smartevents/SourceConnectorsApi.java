package com.openshift.cloud.api.smartevents;

import com.openshift.cloud.api.smartevents.invoker.ApiException;
import com.openshift.cloud.api.smartevents.invoker.ApiClient;
import com.openshift.cloud.api.smartevents.invoker.Configuration;
import com.openshift.cloud.api.smartevents.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.smartevents.models.ConnectorRequest;
import com.openshift.cloud.api.smartevents.models.ErrorsList;
import com.openshift.cloud.api.smartevents.models.ManagedResourceStatus;
import java.util.Set;
import com.openshift.cloud.api.smartevents.models.SourceConnectorListResponse;
import com.openshift.cloud.api.smartevents.models.SourceConnectorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SourceConnectorsApi {
  private ApiClient apiClient;

  public SourceConnectorsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SourceConnectorsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a Source Connector for a Bridge instance
   * Create a Source Connector of a Bridge instance for the authenticated user.
   * @param bridgeId  (required)
   * @param connectorRequest  (optional)
   * @return a {@code SourceConnectorResponse}
   * @throws ApiException if fails to make API call
   */
  public SourceConnectorResponse sourceConnectorsAPICreateSourceConnector(String bridgeId, ConnectorRequest connectorRequest) throws ApiException {
    Object localVarPostBody = connectorRequest;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling sourceConnectorsAPICreateSourceConnector");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/sources".replaceAll("\\{format\\}","json")
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

    GenericType<SourceConnectorResponse> localVarReturnType = new GenericType<SourceConnectorResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a Source Connector of a Bridge instance
   * Delete a Source Connector of a Bridge instance for the authenticated user.
   * @param bridgeId  (required)
   * @param sourceId  (required)
   * @throws ApiException if fails to make API call
   */
  public void sourceConnectorsAPIDeleteSourceConnector(String bridgeId, String sourceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling sourceConnectorsAPIDeleteSourceConnector");
    }
    
    // verify the required parameter 'sourceId' is set
    if (sourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceId' when calling sourceConnectorsAPIDeleteSourceConnector");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/sources/{sourceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bridgeId" + "\\}", apiClient.escapeString(bridgeId.toString()))
      .replaceAll("\\{" + "sourceId" + "\\}", apiClient.escapeString(sourceId.toString()));

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
   * Get a Source Connector of a Bridge instance
   * Get a Source Connector of a Bridge instance for the authenticated user.
   * @param bridgeId  (required)
   * @param sourceId  (required)
   * @return a {@code SourceConnectorResponse}
   * @throws ApiException if fails to make API call
   */
  public SourceConnectorResponse sourceConnectorsAPIGetSourceConnector(String bridgeId, String sourceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling sourceConnectorsAPIGetSourceConnector");
    }
    
    // verify the required parameter 'sourceId' is set
    if (sourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceId' when calling sourceConnectorsAPIGetSourceConnector");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/sources/{sourceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bridgeId" + "\\}", apiClient.escapeString(bridgeId.toString()))
      .replaceAll("\\{" + "sourceId" + "\\}", apiClient.escapeString(sourceId.toString()));

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

    GenericType<SourceConnectorResponse> localVarReturnType = new GenericType<SourceConnectorResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the list of Sink Connectors for a Bridge
   * Get the list of Source Connector instances of a Bridge instance instance for the authenticated user.
   * @param bridgeId  (required)
   * @param name  (optional)
   * @param page  (optional, default to 0)
   * @param size  (optional, default to 100)
   * @param status  (optional)
   * @return a {@code SourceConnectorListResponse}
   * @throws ApiException if fails to make API call
   */
  public SourceConnectorListResponse sourceConnectorsAPIGetSourceConnectors(String bridgeId, String name, Integer page, Integer size, Set<ManagedResourceStatus> status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling sourceConnectorsAPIGetSourceConnectors");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/sources".replaceAll("\\{format\\}","json")
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

    GenericType<SourceConnectorListResponse> localVarReturnType = new GenericType<SourceConnectorListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a Source Connector instance.
   * Update a Source Connector instance for the authenticated user.
   * @param bridgeId  (required)
   * @param sourceId  (required)
   * @param connectorRequest  (optional)
   * @return a {@code SourceConnectorResponse}
   * @throws ApiException if fails to make API call
   */
  public SourceConnectorResponse sourceConnectorsAPIUpdateSourceConnector(String bridgeId, String sourceId, ConnectorRequest connectorRequest) throws ApiException {
    Object localVarPostBody = connectorRequest;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling sourceConnectorsAPIUpdateSourceConnector");
    }
    
    // verify the required parameter 'sourceId' is set
    if (sourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceId' when calling sourceConnectorsAPIUpdateSourceConnector");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/sources/{sourceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bridgeId" + "\\}", apiClient.escapeString(bridgeId.toString()))
      .replaceAll("\\{" + "sourceId" + "\\}", apiClient.escapeString(sourceId.toString()));

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

    GenericType<SourceConnectorResponse> localVarReturnType = new GenericType<SourceConnectorResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
