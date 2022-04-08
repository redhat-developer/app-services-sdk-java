package com.openshift.cloud.api.connector;

import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.connector.models.ConnectorNamespace;
import com.openshift.cloud.api.connector.models.ConnectorNamespaceEvalRequest;
import com.openshift.cloud.api.connector.models.ConnectorNamespaceList;
import com.openshift.cloud.api.connector.models.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorNamespacesApi {
  private ApiClient apiClient;

  public ConnectorNamespacesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConnectorNamespacesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new short lived evaluation connector namespace
   * Create a new evaluation connector namespace
   * @param connectorNamespaceEvalRequest Connector namespace data (required)
   * @return a {@code ConnectorNamespace}
   * @throws ApiException if fails to make API call
   */
  public ConnectorNamespace createEvaluationNamespace(ConnectorNamespaceEvalRequest connectorNamespaceEvalRequest) throws ApiException {
    Object localVarPostBody = connectorNamespaceEvalRequest;
    
    // verify the required parameter 'connectorNamespaceEvalRequest' is set
    if (connectorNamespaceEvalRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorNamespaceEvalRequest' when calling createEvaluationNamespace");
    }
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_namespaces/eval".replaceAll("\\{format\\}","json");

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

    GenericType<ConnectorNamespace> localVarReturnType = new GenericType<ConnectorNamespace>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a connector namespace
   * Get a connector namespace
   * @param connectorNamespaceId The id of the connector namespace (required)
   * @return a {@code ConnectorNamespace}
   * @throws ApiException if fails to make API call
   */
  public ConnectorNamespace getConnectorNamespace(String connectorNamespaceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectorNamespaceId' is set
    if (connectorNamespaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorNamespaceId' when calling getConnectorNamespace");
    }
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_namespaces/{connector_namespace_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector_namespace_id" + "\\}", apiClient.escapeString(connectorNamespaceId.toString()));

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

    GenericType<ConnectorNamespace> localVarReturnType = new GenericType<ConnectorNamespace>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Returns a list of connector namespaces
   * Returns a list of connector namespaces
   * @param page Page index (optional)
   * @param size Number of items in each page (optional)
   * @param orderBy Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the &#x60;order by&#x60; clause of an SQL statement. Each query can be ordered by any of the &#x60;ConnectorType&#x60; fields. For example, to return all Connector types ordered by their name, use the following syntax:  &#x60;&#x60;&#x60;sql name asc &#x60;&#x60;&#x60;  To return all Connector types ordered by their name _and_ version, use the following syntax:  &#x60;&#x60;&#x60;sql name asc, version asc &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then the results are ordered by name. (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the &#x60;where&#x60; clause of a SQL statement. Allowed fields in the search are &#x60;name&#x60;, &#x60;description&#x60;, &#x60;version&#x60;, &#x60;label&#x60;, and &#x60;channel&#x60;. Allowed operators are &#x60;&lt;&gt;&#x60;, &#x60;&#x3D;&#x60;, or &#x60;LIKE&#x60;. Allowed conjunctive operators are &#x60;AND&#x60; and &#x60;OR&#x60;. However, you can use a maximum of 10 conjunctions in a search query.  Examples:  To return a Connector Type with the name &#x60;aws-sqs-source&#x60; and the channel &#x60;stable&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name &#x3D; aws-sqs-source and channel &#x3D; stable &#x60;&#x60;&#x60;[p-]  To return a Kafka instance with a name that starts with &#x60;aws&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name like aws%25 &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then all the Connector Type that the user has permission to see are returned.  Note. If the query is invalid, an error is returned.  (optional)
   * @return a {@code ConnectorNamespaceList}
   * @throws ApiException if fails to make API call
   */
  public ConnectorNamespaceList listConnectorNamespaces(String page, String size, String orderBy, String search) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_namespaces".replaceAll("\\{format\\}","json");

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

    GenericType<ConnectorNamespaceList> localVarReturnType = new GenericType<ConnectorNamespaceList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
