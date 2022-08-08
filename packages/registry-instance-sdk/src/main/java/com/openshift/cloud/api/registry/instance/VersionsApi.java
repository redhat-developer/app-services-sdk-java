package com.openshift.cloud.api.registry.instance;

import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.registry.instance.models.ArtifactReference;
import com.openshift.cloud.api.registry.instance.models.ContentCreateRequest;
import com.openshift.cloud.api.registry.instance.models.Error;
import java.io.File;
import com.openshift.cloud.api.registry.instance.models.RuleViolationError;
import com.openshift.cloud.api.registry.instance.models.UpdateState;
import com.openshift.cloud.api.registry.instance.models.VersionMetaData;
import com.openshift.cloud.api.registry.instance.models.VersionSearchResults;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VersionsApi {
  private ApiClient apiClient;

  public VersionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VersionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create artifact version
   * Creates a new version of the artifact by uploading new content.  The configured rules for the artifact are applied, and if they all pass, the new content is added as the most recent  version of the artifact.  If any of the rules fail, an error is returned.  The body of the request can be the raw content of the new artifact version, or the raw content  and a set of references pointing to other artifacts, and the type of that content should match the artifact&#39;s type (for example if the artifact type is &#x60;AVRO&#x60; then the content of the request should be an Apache Avro document).  This operation can fail for the following reasons:  * Provided content (request body) was empty (HTTP error &#x60;400&#x60;) * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * The new content violates one of the rules configured for the artifact (HTTP error &#x60;409&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param body The content of the artifact version being created or the content and a set of references to other artifacts. This is often, but not always, JSON data representing one of the supported artifact types:  * Avro (&#x60;AVRO&#x60;) * Protobuf (&#x60;PROTOBUF&#x60;) * JSON Schema (&#x60;JSON&#x60;) * Kafka Connect (&#x60;KCONNECT&#x60;) * OpenAPI (&#x60;OPENAPI&#x60;) * AsyncAPI (&#x60;ASYNCAPI&#x60;) * GraphQL (&#x60;GRAPHQL&#x60;) * Web Services Description Language (&#x60;WSDL&#x60;) * XML Schema (&#x60;XSD&#x60;)  (required)
   * @param xRegistryVersion Specifies the version number of this new version of the artifact content.  This would typically be a simple integer or a SemVer value.  It must be unique within the artifact.  If this is not provided, the server will generate a new, unique version number for this new updated content. (optional)
   * @param xRegistryName Specifies the artifact name of this new version of the artifact content. Name must be ASCII-only string. If this is not provided, the server will extract the name from the artifact content. (optional)
   * @param xRegistryDescription Specifies the artifact description of this new version of the artifact content. Description must be ASCII-only string. If this is not provided, the server will extract the description from the artifact content. (optional)
   * @param xRegistryDescriptionEncoded Specifies the artifact description of this new version of the artifact content. Value of this must be Base64 encoded string. If this is not provided, the server will extract the description from the artifact content. (optional)
   * @param xRegistryNameEncoded Specifies the artifact name of this new version of the artifact content. Value of this must be Base64 encoded string. If this is not provided, the server will extract the name from the artifact content. (optional)
   * @return a {@code VersionMetaData}
   * @throws ApiException if fails to make API call
   */
  public VersionMetaData createArtifactVersion(String groupId, String artifactId, Object body, String xRegistryVersion, String xRegistryName, String xRegistryDescription, String xRegistryDescriptionEncoded, String xRegistryNameEncoded) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling createArtifactVersion");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling createArtifactVersion");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createArtifactVersion");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/versions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "artifactId" + "\\}", apiClient.escapeString(artifactId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xRegistryVersion != null)
      localVarHeaderParams.put("X-Registry-Version", apiClient.parameterToString(xRegistryVersion));
if (xRegistryName != null)
      localVarHeaderParams.put("X-Registry-Name", apiClient.parameterToString(xRegistryName));
if (xRegistryDescription != null)
      localVarHeaderParams.put("X-Registry-Description", apiClient.parameterToString(xRegistryDescription));
if (xRegistryDescriptionEncoded != null)
      localVarHeaderParams.put("X-Registry-Description-Encoded", apiClient.parameterToString(xRegistryDescriptionEncoded));
if (xRegistryNameEncoded != null)
      localVarHeaderParams.put("X-Registry-Name-Encoded", apiClient.parameterToString(xRegistryNameEncoded));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<VersionMetaData> localVarReturnType = new GenericType<VersionMetaData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get artifact version
   * Retrieves a single version of the artifact content.  Both the &#x60;artifactId&#x60; and the unique &#x60;version&#x60; number must be provided.  The &#x60;Content-Type&#x60; of the response depends  on the artifact type.  In most cases, this is &#x60;application/json&#x60;, but for some types  it may be different (for example, &#x60;PROTOBUF&#x60;).  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * No version with this &#x60;version&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param version The unique identifier of a specific version of the artifact content. (required)
   * @param dereference Allows the user to specify if the content should be dereferenced when being returned (optional)
   * @return a {@code File}
   * @throws ApiException if fails to make API call
   */
  public File getArtifactVersion(String groupId, String artifactId, String version, Boolean dereference) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getArtifactVersion");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling getArtifactVersion");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling getArtifactVersion");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/versions/{version}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "artifactId" + "\\}", apiClient.escapeString(artifactId.toString()))
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dereference", dereference));

    
    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get artifact version
   * Retrieves a single version of the artifact content.  Both the &#x60;artifactId&#x60; and the unique &#x60;version&#x60; number must be provided.  The &#x60;Content-Type&#x60; of the response depends  on the artifact type.  In most cases, this is &#x60;application/json&#x60;, but for some types  it may be different (for example, &#x60;PROTOBUF&#x60;).  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * No version with this &#x60;version&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param version The unique identifier of a specific version of the artifact content. (required)
   * @return a {@code List<ArtifactReference>}
   * @throws ApiException if fails to make API call
   */
  public List<ArtifactReference> getArtifactVersionReferences(String groupId, String artifactId, String version) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getArtifactVersionReferences");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling getArtifactVersionReferences");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling getArtifactVersionReferences");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/versions/{version}/references".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "artifactId" + "\\}", apiClient.escapeString(artifactId.toString()))
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ArtifactReference>> localVarReturnType = new GenericType<List<ArtifactReference>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List artifact versions
   * Returns a list of all versions of the artifact.  The result set is paged.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param offset The number of versions to skip before starting to collect the result set.  Defaults to 0. (optional)
   * @param limit The number of versions to return.  Defaults to 20. (optional)
   * @return a {@code VersionSearchResults}
   * @throws ApiException if fails to make API call
   */
  public VersionSearchResults listArtifactVersions(String groupId, String artifactId, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling listArtifactVersions");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling listArtifactVersions");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/versions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "artifactId" + "\\}", apiClient.escapeString(artifactId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<VersionSearchResults> localVarReturnType = new GenericType<VersionSearchResults>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update artifact version state
   * Updates the state of a specific version of an artifact.  For example, you can use  this operation to disable a specific version.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * No version with this &#x60;version&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param version The unique identifier of a specific version of the artifact content. (required)
   * @param updateState  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateArtifactVersionState(String groupId, String artifactId, String version, UpdateState updateState) throws ApiException {
    Object localVarPostBody = updateState;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling updateArtifactVersionState");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling updateArtifactVersionState");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling updateArtifactVersionState");
    }
    
    // verify the required parameter 'updateState' is set
    if (updateState == null) {
      throw new ApiException(400, "Missing the required parameter 'updateState' when calling updateArtifactVersionState");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/versions/{version}/state".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "artifactId" + "\\}", apiClient.escapeString(artifactId.toString()))
      .replaceAll("\\{" + "version" + "\\}", apiClient.escapeString(version.toString()));

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

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
