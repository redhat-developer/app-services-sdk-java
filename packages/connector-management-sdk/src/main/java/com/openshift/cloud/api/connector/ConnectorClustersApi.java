package com.openshift.cloud.api.connector;

import com.openshift.cloud.api.connector.invoker.ApiException;
import com.openshift.cloud.api.connector.invoker.ApiClient;
import com.openshift.cloud.api.connector.invoker.Configuration;
import com.openshift.cloud.api.connector.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.connector.models.AddonParameter;
import com.openshift.cloud.api.connector.models.ConnectorCluster;
import com.openshift.cloud.api.connector.models.ConnectorClusterList;
import com.openshift.cloud.api.connector.models.ConnectorClusterRequest;
import com.openshift.cloud.api.connector.models.ConnectorNamespaceList;
import com.openshift.cloud.api.connector.models.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorClustersApi {
  private ApiClient apiClient;

  public ConnectorClustersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConnectorClustersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new connector cluster
   * Create a new connector cluster
   * @param async Perform the action in an asynchronous manner (required)
   * @param connectorClusterRequest Connector cluster data (required)
   * @return a {@code ConnectorCluster}
   * @throws ApiException if fails to make API call
   */
  public ConnectorCluster createConnectorCluster(Boolean async, ConnectorClusterRequest connectorClusterRequest) throws ApiException {
    Object localVarPostBody = connectorClusterRequest;
    
    // verify the required parameter 'async' is set
    if (async == null) {
      throw new ApiException(400, "Missing the required parameter 'async' when calling createConnectorCluster");
    }
    
    // verify the required parameter 'connectorClusterRequest' is set
    if (connectorClusterRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorClusterRequest' when calling createConnectorCluster");
    }
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_clusters".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "async", async));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<ConnectorCluster> localVarReturnType = new GenericType<ConnectorCluster>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a connector cluster
   * Delete a connector cluster
   * @param connectorClusterId The id of the connector cluster (required)
   * @return a {@code Error}
   * @throws ApiException if fails to make API call
   */
  public Error deleteConnectorCluster(String connectorClusterId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectorClusterId' is set
    if (connectorClusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorClusterId' when calling deleteConnectorCluster");
    }
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector_cluster_id" + "\\}", apiClient.escapeString(connectorClusterId.toString()));

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

    GenericType<Error> localVarReturnType = new GenericType<Error>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a connector cluster
   * Get a connector cluster
   * @param connectorClusterId The id of the connector cluster (required)
   * @return a {@code ConnectorCluster}
   * @throws ApiException if fails to make API call
   */
  public ConnectorCluster getConnectorCluster(String connectorClusterId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectorClusterId' is set
    if (connectorClusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorClusterId' when calling getConnectorCluster");
    }
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector_cluster_id" + "\\}", apiClient.escapeString(connectorClusterId.toString()));

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

    GenericType<ConnectorCluster> localVarReturnType = new GenericType<ConnectorCluster>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a connector cluster&#39;s addon parameters
   * Get a connector cluster&#39;s addon parameters
   * @param connectorClusterId The id of the connector cluster (required)
   * @param resetCredentials Resets cluster service account credentials when true (optional)
   * @return a {@code List<AddonParameter>}
   * @throws ApiException if fails to make API call
   */
  public List<AddonParameter> getConnectorClusterAddonParameters(String connectorClusterId, Boolean resetCredentials) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectorClusterId' is set
    if (connectorClusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorClusterId' when calling getConnectorClusterAddonParameters");
    }
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}/addon_parameters".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector_cluster_id" + "\\}", apiClient.escapeString(connectorClusterId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reset_credentials", resetCredentials));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Bearer" };

    GenericType<List<AddonParameter>> localVarReturnType = new GenericType<List<AddonParameter>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a connector cluster&#39;s namespaces
   * Get a connector cluster&#39;s namespaces
   * @param connectorClusterId The id of the connector cluster (required)
   * @param page Page index (optional)
   * @param size Number of items in each page (optional)
   * @param orderBy Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the &#x60;order by&#x60; clause of an SQL statement. Each query can be ordered by any of the underlying resource fields supported in the search parameter. For example, to return all Connector types ordered by their name, use the following syntax:  &#x60;&#x60;&#x60;sql name asc &#x60;&#x60;&#x60;  To return all Connector types ordered by their name _and_ version, use the following syntax:  &#x60;&#x60;&#x60;sql name asc, version asc &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then the results are ordered by name. (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the &#x60;where&#x60; clause of a SQL statement.  Allowed fields in the search depend on the resource type:  * Cluster: id, created_at, updated_at, owner, organisation_id, name, state, client_id * Namespace: id, created_at, updated_at, name, cluster_id, owner, expiration, tenant_user_id, tenant_organisation_id, state * Connector Types: id, created_at, updated_at, version, name, description, label, channel, featured_rank, pricing_tier * Connectors: id, created_at, updated_at, name, owner, organisation_id, connector_type_id, desired_state, state, channel, namespace_id, kafka_id, kafka_bootstrap_server, service_account_client_id, schema_registry_id, schema_registry_url  Allowed operators are &#x60;&lt;&gt;&#x60;, &#x60;&#x3D;&#x60;, &#x60;LIKE&#x60;, or &#x60;ILIKE&#x60;. Allowed conjunctive operators are &#x60;AND&#x60; and &#x60;OR&#x60;. However, you can use a maximum of 10 conjunctions in a search query.  Examples:  To return a Connector Type with the name &#x60;aws-sqs-source&#x60; and the channel &#x60;stable&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name &#x3D; aws-sqs-source and channel &#x3D; stable &#x60;&#x60;&#x60;[p-]  To return a connector instance with a name that starts with &#x60;aws&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name like aws%25 &#x60;&#x60;&#x60;  To return a connector type with a name containing &#x60;aws&#x60; matching any character case combination, use the following syntax:  &#x60;&#x60;&#x60; name ilike %25aws%25 &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then all the resources that the user has permission to see are returned.  Note. If the query is invalid, an error is returned.  (optional)
   * @return a {@code ConnectorNamespaceList}
   * @throws ApiException if fails to make API call
   */
  public ConnectorNamespaceList getConnectorClusterNamespaces(String connectorClusterId, String page, String size, String orderBy, String search) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectorClusterId' is set
    if (connectorClusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorClusterId' when calling getConnectorClusterNamespaces");
    }
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}/namespaces".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector_cluster_id" + "\\}", apiClient.escapeString(connectorClusterId.toString()));

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
  /**
   * Returns a list of connector clusters
   * Returns a list of connector clusters
   * @param page Page index (optional)
   * @param size Number of items in each page (optional)
   * @param orderBy Specifies the order by criteria. The syntax of this parameter is similar to the syntax of the &#x60;order by&#x60; clause of an SQL statement. Each query can be ordered by any of the underlying resource fields supported in the search parameter. For example, to return all Connector types ordered by their name, use the following syntax:  &#x60;&#x60;&#x60;sql name asc &#x60;&#x60;&#x60;  To return all Connector types ordered by their name _and_ version, use the following syntax:  &#x60;&#x60;&#x60;sql name asc, version asc &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then the results are ordered by name. (optional)
   * @param search Search criteria.  The syntax of this parameter is similar to the syntax of the &#x60;where&#x60; clause of a SQL statement.  Allowed fields in the search depend on the resource type:  * Cluster: id, created_at, updated_at, owner, organisation_id, name, state, client_id * Namespace: id, created_at, updated_at, name, cluster_id, owner, expiration, tenant_user_id, tenant_organisation_id, state * Connector Types: id, created_at, updated_at, version, name, description, label, channel, featured_rank, pricing_tier * Connectors: id, created_at, updated_at, name, owner, organisation_id, connector_type_id, desired_state, state, channel, namespace_id, kafka_id, kafka_bootstrap_server, service_account_client_id, schema_registry_id, schema_registry_url  Allowed operators are &#x60;&lt;&gt;&#x60;, &#x60;&#x3D;&#x60;, &#x60;LIKE&#x60;, or &#x60;ILIKE&#x60;. Allowed conjunctive operators are &#x60;AND&#x60; and &#x60;OR&#x60;. However, you can use a maximum of 10 conjunctions in a search query.  Examples:  To return a Connector Type with the name &#x60;aws-sqs-source&#x60; and the channel &#x60;stable&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name &#x3D; aws-sqs-source and channel &#x3D; stable &#x60;&#x60;&#x60;[p-]  To return a connector instance with a name that starts with &#x60;aws&#x60;, use the following syntax:  &#x60;&#x60;&#x60; name like aws%25 &#x60;&#x60;&#x60;  To return a connector type with a name containing &#x60;aws&#x60; matching any character case combination, use the following syntax:  &#x60;&#x60;&#x60; name ilike %25aws%25 &#x60;&#x60;&#x60;  If the parameter isn&#39;t provided, or if the value is empty, then all the resources that the user has permission to see are returned.  Note. If the query is invalid, an error is returned.  (optional)
   * @return a {@code ConnectorClusterList}
   * @throws ApiException if fails to make API call
   */
  public ConnectorClusterList listConnectorClusters(String page, String size, String orderBy, String search) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_clusters".replaceAll("\\{format\\}","json");

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

    GenericType<ConnectorClusterList> localVarReturnType = new GenericType<ConnectorClusterList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * udpate a connector cluster
   * udpate a connector cluster
   * @param connectorClusterId The id of the connector cluster (required)
   * @param connectorClusterRequest Data to updated connector with (required)
   * @throws ApiException if fails to make API call
   */
  public void updateConnectorClusterById(String connectorClusterId, ConnectorClusterRequest connectorClusterRequest) throws ApiException {
    Object localVarPostBody = connectorClusterRequest;
    
    // verify the required parameter 'connectorClusterId' is set
    if (connectorClusterId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorClusterId' when calling updateConnectorClusterById");
    }
    
    // verify the required parameter 'connectorClusterRequest' is set
    if (connectorClusterRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'connectorClusterRequest' when calling updateConnectorClusterById");
    }
    
    // create path and map variables
    String localVarPath = "/api/connector_mgmt/v1/kafka_connector_clusters/{connector_cluster_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connector_cluster_id" + "\\}", apiClient.escapeString(connectorClusterId.toString()));

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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
