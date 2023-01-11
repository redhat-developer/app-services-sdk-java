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
import com.openshift.cloud.api.smartevents.models.SinkConnectorListResponse;
import com.openshift.cloud.api.smartevents.models.SinkConnectorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SinkConnectorsApi {
  private ApiClient apiClient;

  public SinkConnectorsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SinkConnectorsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a Sink Connector for a Bridge instance
   * Create a Sink Connector of a Bridge instance for the authenticated user.
   * @param bridgeId  (required)
   * @param connectorRequest  (optional)
   * @return a {@code SinkConnectorResponse}
   * @throws ApiException if fails to make API call
   */
  public SinkConnectorResponse sinkConnectorsAPICreateSinkConnector(String bridgeId, ConnectorRequest connectorRequest) throws ApiException {
    Object localVarPostBody = connectorRequest;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling sinkConnectorsAPICreateSinkConnector");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/sinks".replaceAll("\\{format\\}","json")
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

    GenericType<SinkConnectorResponse> localVarReturnType = new GenericType<SinkConnectorResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a Sink Connector of a Bridge instance
   * Delete a Sink Connector of a Bridge instance for the authenticated user.
   * @param bridgeId  (required)
   * @param sinkId  (required)
   * @throws ApiException if fails to make API call
   */
  public void sinkConnectorsAPIDeleteSinkConnector(String bridgeId, String sinkId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling sinkConnectorsAPIDeleteSinkConnector");
    }
    
    // verify the required parameter 'sinkId' is set
    if (sinkId == null) {
      throw new ApiException(400, "Missing the required parameter 'sinkId' when calling sinkConnectorsAPIDeleteSinkConnector");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/sinks/{sinkId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bridgeId" + "\\}", apiClient.escapeString(bridgeId.toString()))
      .replaceAll("\\{" + "sinkId" + "\\}", apiClient.escapeString(sinkId.toString()));

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
   * Get a Sink Connector of a Bridge instance
   * Get a Sink Connector of a Bridge instance for the authenticated user.
   * @param bridgeId  (required)
   * @param sinkId  (required)
   * @return a {@code SinkConnectorResponse}
   * @throws ApiException if fails to make API call
   */
  public SinkConnectorResponse sinkConnectorsAPIGetSinkConnector(String bridgeId, String sinkId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling sinkConnectorsAPIGetSinkConnector");
    }
    
    // verify the required parameter 'sinkId' is set
    if (sinkId == null) {
      throw new ApiException(400, "Missing the required parameter 'sinkId' when calling sinkConnectorsAPIGetSinkConnector");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/sinks/{sinkId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bridgeId" + "\\}", apiClient.escapeString(bridgeId.toString()))
      .replaceAll("\\{" + "sinkId" + "\\}", apiClient.escapeString(sinkId.toString()));

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

    GenericType<SinkConnectorResponse> localVarReturnType = new GenericType<SinkConnectorResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the list of Sink Connectors for a Bridge
   * Get the list of Sink Connector instances of a Bridge instance for the authenticated user.
   * @param bridgeId  (required)
   * @param name  (optional)
   * @param page  (optional, default to 0)
   * @param size  (optional, default to 100)
   * @param status  (optional)
   * @return a {@code SinkConnectorListResponse}
   * @throws ApiException if fails to make API call
   */
  public SinkConnectorListResponse sinkConnectorsAPIGetSinkConnectors(String bridgeId, String name, Integer page, Integer size, Set<ManagedResourceStatus> status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling sinkConnectorsAPIGetSinkConnectors");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/sinks".replaceAll("\\{format\\}","json")
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

    GenericType<SinkConnectorListResponse> localVarReturnType = new GenericType<SinkConnectorListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a Sink Connector instance.
   * Update a Sink Connector instance for the authenticated user.
   * @param bridgeId  (required)
   * @param sinkId  (required)
   * @param connectorRequest  (optional)
   * @return a {@code SinkConnectorResponse}
   * @throws ApiException if fails to make API call
   */
  public SinkConnectorResponse sinkConnectorsAPIUpdateSinkConnector(String bridgeId, String sinkId, ConnectorRequest connectorRequest) throws ApiException {
    Object localVarPostBody = connectorRequest;
    
    // verify the required parameter 'bridgeId' is set
    if (bridgeId == null) {
      throw new ApiException(400, "Missing the required parameter 'bridgeId' when calling sinkConnectorsAPIUpdateSinkConnector");
    }
    
    // verify the required parameter 'sinkId' is set
    if (sinkId == null) {
      throw new ApiException(400, "Missing the required parameter 'sinkId' when calling sinkConnectorsAPIUpdateSinkConnector");
    }
    
    // create path and map variables
    String localVarPath = "/api/smartevents_mgmt/v2/bridges/{bridgeId}/sinks/{sinkId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bridgeId" + "\\}", apiClient.escapeString(bridgeId.toString()))
      .replaceAll("\\{" + "sinkId" + "\\}", apiClient.escapeString(sinkId.toString()));

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

    GenericType<SinkConnectorResponse> localVarReturnType = new GenericType<SinkConnectorResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
