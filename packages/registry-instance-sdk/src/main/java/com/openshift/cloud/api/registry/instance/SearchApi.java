package com.openshift.cloud.api.registry.instance;

import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.registry.instance.models.ArtifactSearchResults;
import com.openshift.cloud.api.registry.instance.models.ArtifactType;
import com.openshift.cloud.api.registry.instance.models.Error;
import java.io.File;
import com.openshift.cloud.api.registry.instance.models.SortBy;
import com.openshift.cloud.api.registry.instance.models.SortOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchApi {
  private ApiClient apiClient;

  public SearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Search for artifacts
   * Returns a paginated list of all artifacts that match the provided filter criteria. 
   * @param name Filter by artifact name. (optional)
   * @param offset The number of artifacts to skip before starting to collect the result set.  Defaults to 0. (optional, default to 0)
   * @param limit The number of artifacts to return.  Defaults to 20. (optional, default to 20)
   * @param order Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). (optional)
   * @param orderby The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60;  (optional)
   * @param labels Filter by label.  Include one or more label to only return artifacts containing all of the specified labels. (optional)
   * @param properties Filter by one or more name/value property.  Separate each name/value pair using a colon.  For example &#x60;properties&#x3D;foo:bar&#x60; will return only artifacts with a custom property named &#x60;foo&#x60; and value &#x60;bar&#x60;. (optional)
   * @param description Filter by description. (optional)
   * @param group Filter by artifact group. (optional)
   * @param globalId Filter by globalId. (optional)
   * @param contentId Filter by contentId. (optional)
   * @return a {@code ArtifactSearchResults}
   * @throws ApiException if fails to make API call
   */
  public ArtifactSearchResults searchArtifacts(String name, Integer offset, Integer limit, SortOrder order, SortBy orderby, List<String> labels, List<String> properties, String description, String group, Long globalId, Long contentId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/search/artifacts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderby", orderby));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "labels", labels));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "properties", properties));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "group", group));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "globalId", globalId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentId", contentId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ArtifactSearchResults> localVarReturnType = new GenericType<ArtifactSearchResults>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search for artifacts by content
   * Returns a paginated list of all artifacts with at least one version that matches the posted content. 
   * @param body The content to search for. (required)
   * @param canonical Parameter that can be set to &#x60;true&#x60; to indicate that the server should \&quot;canonicalize\&quot; the content when searching for matching artifacts.  Canonicalization is unique to each artifact type, but typically involves removing any extra whitespace and formatting the content in a consistent manner.  Must be used along with the &#x60;artifactType&#x60; query parameter. (optional)
   * @param artifactType Indicates the type of artifact represented by the content being used for the search.  This is only needed when using the &#x60;canonical&#x60; query parameter, so that the server knows how to canonicalize the content prior to searching for matching artifacts. (optional)
   * @param offset The number of artifacts to skip before starting to collect the result set.  Defaults to 0. (optional, default to 0)
   * @param limit The number of artifacts to return.  Defaults to 20. (optional, default to 20)
   * @param order Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). (optional)
   * @param orderby The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60;  (optional)
   * @return a {@code ArtifactSearchResults}
   * @throws ApiException if fails to make API call
   */
  public ArtifactSearchResults searchArtifactsByContent(File body, Boolean canonical, ArtifactType artifactType, Integer offset, Integer limit, String order, String orderby) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling searchArtifactsByContent");
    }
    
    // create path and map variables
    String localVarPath = "/search/artifacts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "canonical", canonical));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "artifactType", artifactType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderby", orderby));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ArtifactSearchResults> localVarReturnType = new GenericType<ArtifactSearchResults>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
