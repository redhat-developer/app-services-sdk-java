package com.openshift.cloud.api.registry.instance;

import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.registry.instance.models.ArtifactMetaData;
import com.openshift.cloud.api.registry.instance.models.ArtifactReference;
import com.openshift.cloud.api.registry.instance.models.ArtifactSearchResults;
import com.openshift.cloud.api.registry.instance.models.ArtifactType;
import com.openshift.cloud.api.registry.instance.models.ContentCreateRequest;
import com.openshift.cloud.api.registry.instance.models.Error;
import java.io.File;
import com.openshift.cloud.api.registry.instance.models.IfExists;
import com.openshift.cloud.api.registry.instance.models.RuleViolationError;
import com.openshift.cloud.api.registry.instance.models.SortBy;
import com.openshift.cloud.api.registry.instance.models.SortOrder;
import com.openshift.cloud.api.registry.instance.models.UpdateState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArtifactsApi {
  private ApiClient apiClient;

  public ArtifactsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ArtifactsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create artifact
   * Creates a new artifact by posting the artifact content.  The body of the request should be the raw content of the artifact.  This is typically in JSON format for *most* of the  supported types, but may be in another format for a few (for example, &#x60;PROTOBUF&#x60;).  The registry attempts to figure out what kind of artifact is being added from the following supported list:  * Avro (&#x60;AVRO&#x60;) * Protobuf (&#x60;PROTOBUF&#x60;) * JSON Schema (&#x60;JSON&#x60;) * Kafka Connect (&#x60;KCONNECT&#x60;) * OpenAPI (&#x60;OPENAPI&#x60;) * AsyncAPI (&#x60;ASYNCAPI&#x60;) * GraphQL (&#x60;GRAPHQL&#x60;) * Web Services Description Language (&#x60;WSDL&#x60;) * XML Schema (&#x60;XSD&#x60;)  Alternatively, you can specify the artifact type using the &#x60;X-Registry-ArtifactType&#x60;  HTTP request header, or include a hint in the request&#39;s &#x60;Content-Type&#x60;.  For example:  &#x60;&#x60;&#x60; Content-Type: application/json; artifactType&#x3D;AVRO &#x60;&#x60;&#x60;  An artifact is created using the content provided in the body of the request.  This content is created under a unique artifact ID that can be provided in the request using the &#x60;X-Registry-ArtifactId&#x60; request header.  If not provided in the request, the server generates a unique ID for the artifact.  It is typically recommended that callers provide the ID, because this is typically a meaningful identifier,  and for most use cases should be supplied by the caller.  If an artifact with the provided artifact ID already exists, the default behavior is for the server to reject the content with a 409 error.  However, the caller can supply the &#x60;ifExists&#x60; query parameter to alter this default behavior. The &#x60;ifExists&#x60; query parameter can have one of the following values:  * &#x60;FAIL&#x60; (*default*) - server rejects the content with a 409 error * &#x60;UPDATE&#x60; - server updates the existing artifact and returns the new metadata * &#x60;RETURN&#x60; - server does not create or add content to the server, but instead  returns the metadata for the existing artifact * &#x60;RETURN_OR_UPDATE&#x60; - server returns an existing **version** that matches the  provided content if such a version exists, otherwise a new version is created  This operation may fail for one of the following reasons:  * An invalid &#x60;ArtifactType&#x60; was indicated (HTTP error &#x60;400&#x60;) * No &#x60;ArtifactType&#x60; was indicated and the server could not determine one from the content (HTTP error &#x60;400&#x60;) * Provided content (request body) was empty (HTTP error &#x60;400&#x60;) * An artifact with the provided ID already exists (HTTP error &#x60;409&#x60;) * The content violates one of the configured global rules (HTTP error &#x60;409&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param groupId Unique ID of an artifact group. (required)
   * @param body The content of the artifact being created. This is often, but not always, JSON data representing one of the supported artifact types:  * Avro (&#x60;AVRO&#x60;) * Protobuf (&#x60;PROTOBUF&#x60;) * JSON Schema (&#x60;JSON&#x60;) * Kafka Connect (&#x60;KCONNECT&#x60;) * OpenAPI (&#x60;OPENAPI&#x60;) * AsyncAPI (&#x60;ASYNCAPI&#x60;) * GraphQL (&#x60;GRAPHQL&#x60;) * Web Services Description Language (&#x60;WSDL&#x60;) * XML Schema (&#x60;XSD&#x60;)  (required)
   * @param xRegistryArtifactType Specifies the type of the artifact being added. Possible values include:  * Avro (&#x60;AVRO&#x60;) * Protobuf (&#x60;PROTOBUF&#x60;) * JSON Schema (&#x60;JSON&#x60;) * Kafka Connect (&#x60;KCONNECT&#x60;) * OpenAPI (&#x60;OPENAPI&#x60;) * AsyncAPI (&#x60;ASYNCAPI&#x60;) * GraphQL (&#x60;GRAPHQL&#x60;) * Web Services Description Language (&#x60;WSDL&#x60;) * XML Schema (&#x60;XSD&#x60;) (optional)
   * @param xRegistryArtifactId A client-provided, globally unique identifier for the new artifact. (optional)
   * @param xRegistryVersion Specifies the version number of this initial version of the artifact content.  This would typically be a simple integer or a SemVer value.  If not provided, the server will assign a version number automatically (starting with version &#x60;1&#x60;). (optional)
   * @param ifExists Set this option to instruct the server on what to do if the artifact already exists. (optional)
   * @param canonical Used only when the &#x60;ifExists&#x60; query parameter is set to &#x60;RETURN_OR_UPDATE&#x60;, this parameter can be set to &#x60;true&#x60; to indicate that the server should \&quot;canonicalize\&quot; the content when searching for a matching version.  The canonicalization algorithm is unique to each artifact type, but typically involves removing extra whitespace and formatting the content in a consistent manner. (optional)
   * @param xRegistryDescription Specifies the description of artifact being added. Description must be ASCII-only string. If this is not provided, the server will extract the description from the artifact content. (optional)
   * @param xRegistryDescriptionEncoded Specifies the description of artifact being added. Value of this must be Base64 encoded string. If this is not provided, the server will extract the description from the artifact content. (optional)
   * @param xRegistryName Specifies the name of artifact being added. Name must be ASCII-only string. If this is not provided, the server will extract the name from the artifact content. (optional)
   * @param xRegistryNameEncoded Specifies the name of artifact being added. Value of this must be Base64 encoded string. If this is not provided, the server will extract the name from the artifact content. (optional)
   * @param xRegistryContentHash Specifies the (optional) hash of the artifact to be verified. (optional)
   * @param xRegistryHashAlgorithm The algorithm to use when checking the content validity. (available: SHA256, MD5; default: SHA256) (optional)
   * @return a {@code ArtifactMetaData}
   * @throws ApiException if fails to make API call
   */
  public ArtifactMetaData createArtifact(String groupId, File body, ArtifactType xRegistryArtifactType, String xRegistryArtifactId, String xRegistryVersion, IfExists ifExists, Boolean canonical, String xRegistryDescription, String xRegistryDescriptionEncoded, String xRegistryName, String xRegistryNameEncoded, String xRegistryContentHash, String xRegistryHashAlgorithm) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling createArtifact");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createArtifact");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ifExists", ifExists));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "canonical", canonical));

    if (xRegistryArtifactType != null)
      localVarHeaderParams.put("X-Registry-ArtifactType", apiClient.parameterToString(xRegistryArtifactType));
if (xRegistryArtifactId != null)
      localVarHeaderParams.put("X-Registry-ArtifactId", apiClient.parameterToString(xRegistryArtifactId));
if (xRegistryVersion != null)
      localVarHeaderParams.put("X-Registry-Version", apiClient.parameterToString(xRegistryVersion));
if (xRegistryDescription != null)
      localVarHeaderParams.put("X-Registry-Description", apiClient.parameterToString(xRegistryDescription));
if (xRegistryDescriptionEncoded != null)
      localVarHeaderParams.put("X-Registry-Description-Encoded", apiClient.parameterToString(xRegistryDescriptionEncoded));
if (xRegistryName != null)
      localVarHeaderParams.put("X-Registry-Name", apiClient.parameterToString(xRegistryName));
if (xRegistryNameEncoded != null)
      localVarHeaderParams.put("X-Registry-Name-Encoded", apiClient.parameterToString(xRegistryNameEncoded));
if (xRegistryContentHash != null)
      localVarHeaderParams.put("X-Registry-Content-Hash", apiClient.parameterToString(xRegistryContentHash));
if (xRegistryHashAlgorithm != null)
      localVarHeaderParams.put("X-Registry-Hash-Algorithm", apiClient.parameterToString(xRegistryHashAlgorithm));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ArtifactMetaData> localVarReturnType = new GenericType<ArtifactMetaData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete artifact
   * Deletes an artifact completely, resulting in all versions of the artifact also being deleted.  This may fail for one of the following reasons:  * No artifact with the &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;)
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteArtifact(String groupId, String artifactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteArtifact");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling deleteArtifact");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "artifactId" + "\\}", apiClient.escapeString(artifactId.toString()));

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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete artifacts in group
   * Deletes all of the artifacts that exist in a given group.
   * @param groupId Unique ID of an artifact group. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteArtifactsInGroup(String groupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteArtifactsInGroup");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get artifact by global ID
   * Gets the content for an artifact version in the registry using its globally unique identifier.  This operation may fail for one of the following reasons:  * No artifact version with this &#x60;globalId&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param globalId Global identifier for an artifact version. (required)
   * @param dereference Allows the user to specify if the content should be dereferenced when being returned (optional)
   * @return a {@code File}
   * @throws ApiException if fails to make API call
   */
  public File getContentByGlobalId(Long globalId, Boolean dereference) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'globalId' is set
    if (globalId == null) {
      throw new ApiException(400, "Missing the required parameter 'globalId' when calling getContentByGlobalId");
    }
    
    // create path and map variables
    String localVarPath = "/ids/globalIds/{globalId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "globalId" + "\\}", apiClient.escapeString(globalId.toString()));

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
   * Get artifact content by SHA-256 hash
   * Gets the content for an artifact version in the registry using the  SHA-256 hash of the content.  This content hash may be shared by multiple artifact versions in the case where the artifact versions have identical content.  This operation may fail for one of the following reasons:  * No content with this &#x60;contentHash&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param contentHash SHA-256 content hash for a single artifact content. (required)
   * @return a {@code File}
   * @throws ApiException if fails to make API call
   */
  public File getContentByHash(String contentHash) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contentHash' is set
    if (contentHash == null) {
      throw new ApiException(400, "Missing the required parameter 'contentHash' when calling getContentByHash");
    }
    
    // create path and map variables
    String localVarPath = "/ids/contentHashes/{contentHash}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contentHash" + "\\}", apiClient.escapeString(contentHash.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
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
   * Get artifact content by ID
   * Gets the content for an artifact version in the registry using the unique content identifier for that content.  This content ID may be shared by multiple artifact versions in the case where the artifact versions are identical.  This operation may fail for one of the following reasons:  * No content with this &#x60;contentId&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param contentId Global identifier for a single artifact content. (required)
   * @return a {@code File}
   * @throws ApiException if fails to make API call
   */
  public File getContentById(Long contentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contentId' is set
    if (contentId == null) {
      throw new ApiException(400, "Missing the required parameter 'contentId' when calling getContentById");
    }
    
    // create path and map variables
    String localVarPath = "/ids/contentIds/{contentId}/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contentId" + "\\}", apiClient.escapeString(contentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
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
   * Get latest artifact
   * Returns the latest version of the artifact in its raw form.  The &#x60;Content-Type&#x60; of the response depends on the artifact type.  In most cases, this is &#x60;application/json&#x60;, but  for some types it may be different (for example, &#x60;PROTOBUF&#x60;).  This operation may fail for one of the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param dereference Allows the user to specify if the content should be dereferenced when being returned (optional)
   * @return a {@code File}
   * @throws ApiException if fails to make API call
   */
  public File getLatestArtifact(String groupId, String artifactId, Boolean dereference) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getLatestArtifact");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling getLatestArtifact");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "artifactId" + "\\}", apiClient.escapeString(artifactId.toString()));

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
   * List artifacts in group
   * Returns a list of all artifacts in the group.  This list is paged.
   * @param groupId Unique ID of an artifact group. (required)
   * @param limit The number of artifacts to return.  Defaults to 20. (optional)
   * @param offset The number of artifacts to skip before starting the result set.  Defaults to 0. (optional)
   * @param order Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). (optional)
   * @param orderby The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60;  (optional)
   * @return a {@code ArtifactSearchResults}
   * @throws ApiException if fails to make API call
   */
  public ArtifactSearchResults listArtifactsInGroup(String groupId, Integer limit, Integer offset, SortOrder order, SortBy orderby) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling listArtifactsInGroup");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List artifact references by hash
   * Returns a list containing all the artifact references using the artifact content hash.  This operation may fail for one of the following reasons:  * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param contentHash SHA-256 content hash for a single artifact content. (required)
   * @return a {@code List<ArtifactReference>}
   * @throws ApiException if fails to make API call
   */
  public List<ArtifactReference> referencesByContentHash(String contentHash) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contentHash' is set
    if (contentHash == null) {
      throw new ApiException(400, "Missing the required parameter 'contentHash' when calling referencesByContentHash");
    }
    
    // create path and map variables
    String localVarPath = "/ids/contentHashes/{contentHash}/references".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contentHash" + "\\}", apiClient.escapeString(contentHash.toString()));

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
   * List artifact references by content ID
   * Returns a list containing all the artifact references using the artifact content ID.  This operation may fail for one of the following reasons:  * A server error occurred (HTTP error &#x60;500&#x60;)
   * @param contentId Global identifier for a single artifact content. (required)
   * @return a {@code List<ArtifactReference>}
   * @throws ApiException if fails to make API call
   */
  public List<ArtifactReference> referencesByContentId(Long contentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contentId' is set
    if (contentId == null) {
      throw new ApiException(400, "Missing the required parameter 'contentId' when calling referencesByContentId");
    }
    
    // create path and map variables
    String localVarPath = "/ids/contentIds/{contentId}/references".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "contentId" + "\\}", apiClient.escapeString(contentId.toString()));

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
   * Returns a list with all the references for the artifact with the given global id.
   * Returns a list containing all the artifact references using the artifact global id.  This operation may fail for one of the following reasons:  * A server error occurred (HTTP error &#x60;500&#x60;)
   * @param globalId Global identifier for an artifact version. (required)
   * @return a {@code List<ArtifactReference>}
   * @throws ApiException if fails to make API call
   */
  public List<ArtifactReference> referencesByGlobalId(Long globalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'globalId' is set
    if (globalId == null) {
      throw new ApiException(400, "Missing the required parameter 'globalId' when calling referencesByGlobalId");
    }
    
    // create path and map variables
    String localVarPath = "/ids/globalIds/{globalId}/references".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "globalId" + "\\}", apiClient.escapeString(globalId.toString()));

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
   * Update artifact
   * Updates an artifact by uploading new content.  The body of the request can be the raw content of the artifact or a JSON object containing both the raw content and a set of references to other artifacts..  This is typically in JSON format for *most* of the supported types, but may be in another format for a few (for example, &#x60;PROTOBUF&#x60;). The type of the content should be compatible with the artifact&#39;s type (it would be an error to update an &#x60;AVRO&#x60; artifact with new &#x60;OPENAPI&#x60; content, for example).  The update could fail for a number of reasons including:  * Provided content (request body) was empty (HTTP error &#x60;400&#x60;) * No artifact with the &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * The new content violates one of the rules configured for the artifact (HTTP error &#x60;409&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;)  When successful, this creates a new version of the artifact, making it the most recent (and therefore official) version of the artifact.
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param body The new content of the artifact being updated. This is often, but not always, JSON data representing one of the supported artifact types:  * Avro (&#x60;AVRO&#x60;) * Protobuf (&#x60;PROTOBUF&#x60;) * JSON Schema (&#x60;JSON&#x60;) * Kafka Connect (&#x60;KCONNECT&#x60;) * OpenAPI (&#x60;OPENAPI&#x60;) * AsyncAPI (&#x60;ASYNCAPI&#x60;) * GraphQL (&#x60;GRAPHQL&#x60;) * Web Services Description Language (&#x60;WSDL&#x60;) * XML Schema (&#x60;XSD&#x60;)  (required)
   * @param xRegistryVersion Specifies the version number of this new version of the artifact content.  This would typically be a simple integer or a SemVer value.  If not provided, the server will assign a version number automatically. (optional)
   * @param xRegistryName Specifies the artifact name of this new version of the artifact content. Name must be ASCII-only string. If this is not provided, the server will extract the name from the artifact content. (optional)
   * @param xRegistryNameEncoded Specifies the artifact name of this new version of the artifact content. Value of this must be Base64 encoded string. If this is not provided, the server will extract the name from the artifact content. (optional)
   * @param xRegistryDescription Specifies the artifact description of this new version of the artifact content. Description must be ASCII-only string. If this is not provided, the server will extract the description from the artifact content. (optional)
   * @param xRegistryDescriptionEncoded Specifies the artifact description of this new version of the artifact content. Value of this must be Base64 encoded string. If this is not provided, the server will extract the description from the artifact content. (optional)
   * @return a {@code ArtifactMetaData}
   * @throws ApiException if fails to make API call
   */
  public ArtifactMetaData updateArtifact(String groupId, String artifactId, Object body, String xRegistryVersion, String xRegistryName, String xRegistryNameEncoded, String xRegistryDescription, String xRegistryDescriptionEncoded) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling updateArtifact");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling updateArtifact");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateArtifact");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}".replaceAll("\\{format\\}","json")
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
if (xRegistryNameEncoded != null)
      localVarHeaderParams.put("X-Registry-Name-Encoded", apiClient.parameterToString(xRegistryNameEncoded));
if (xRegistryDescription != null)
      localVarHeaderParams.put("X-Registry-Description", apiClient.parameterToString(xRegistryDescription));
if (xRegistryDescriptionEncoded != null)
      localVarHeaderParams.put("X-Registry-Description-Encoded", apiClient.parameterToString(xRegistryDescriptionEncoded));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ArtifactMetaData> localVarReturnType = new GenericType<ArtifactMetaData>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update artifact state
   * Updates the state of the artifact.  For example, you can use this to mark the latest version of an artifact as &#x60;DEPRECATED&#x60;.  The operation changes the state of the latest  version of the artifact.  If multiple versions exist, only the most recent is changed.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param updateState  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateArtifactState(String groupId, String artifactId, UpdateState updateState) throws ApiException {
    Object localVarPostBody = updateState;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling updateArtifactState");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling updateArtifactState");
    }
    
    // verify the required parameter 'updateState' is set
    if (updateState == null) {
      throw new ApiException(400, "Missing the required parameter 'updateState' when calling updateArtifactState");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/state".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "artifactId" + "\\}", apiClient.escapeString(artifactId.toString()));

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
