package com.openshift.cloud.api.connector;

import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.connector.models.ConnectorType;
import com.openshift.cloud.api.connector.models.ConnectorTypeList;
import com.openshift.cloud.api.connector.models.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorTypesApi {
  private ApiClient apiClient;

  public ConnectorTypesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConnectorTypesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a connector type by id
   * 
   * @param connectorTypeId The id of the connector type (required)
   * @return a {@code ConnectorType}
   * @throws ApiException if fails to make API call
   */
  public ConnectorType getConnectorTypeByID(String connectorTypeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectorTypeId' is set
    if (connectorTypeId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorTypeId' when calling getConnectorTypeByID");
    }
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_types/{connector_type_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector_type_id" + "\\}", apiClient.escapeString(connectorTypeId.toString()));

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

    GenericType<ConnectorType> localVarReturnType = new GenericType<ConnectorType>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a list of connector types
   * 
   * @param page Page index (optional)
   * @param size Number of items in each page (optional)
   * @return a {@code ConnectorTypeList}
   * @throws ApiException if fails to make API call
   */
  public ConnectorTypeList listConnectorTypes(String page, String size) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_types".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<ConnectorTypeList> localVarReturnType = new GenericType<ConnectorTypeList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
