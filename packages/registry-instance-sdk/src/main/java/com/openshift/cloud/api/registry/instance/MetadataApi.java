package com.openshift.cloud.api.registry.instance;

import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.registry.instance.models.ArtifactMetaData;
import com.openshift.cloud.api.registry.instance.models.ArtifactOwner;
import com.openshift.cloud.api.registry.instance.models.EditableMetaData;
import com.openshift.cloud.api.registry.instance.models.Error;
import com.openshift.cloud.api.registry.instance.models.VersionMetaData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MetadataApi {
  private ApiClient apiClient;

  public MetadataApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MetadataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete artifact version metadata
   * Deletes the user-editable metadata properties of the artifact version.  Any properties that are not user-editable are preserved.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * No version with this &#x60;version&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param version The unique identifier of a specific version of the artifact content. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteArtifactVersionMetaData(String groupId, String artifactId, String version) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteArtifactVersionMetaData");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling deleteArtifactVersionMetaData");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling deleteArtifactVersionMetaData");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/versions/{version}/meta".replaceAll("\\{format\\}","json")
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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get artifact metadata
   * Gets the metadata for an artifact in the registry.  The returned metadata includes both generated (read-only) and editable metadata (such as name and description).  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;)
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @return a {@code ArtifactMetaData}
   * @throws ApiException if fails to make API call
   */
  public ArtifactMetaData getArtifactMetaData(String groupId, String artifactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getArtifactMetaData");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling getArtifactMetaData");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/meta".replaceAll("\\{format\\}","json")
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

    GenericType<ArtifactMetaData> localVarReturnType = new GenericType<ArtifactMetaData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get artifact owner
   * Gets the owner of an artifact in the registry.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;)
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @return a {@code ArtifactOwner}
   * @throws ApiException if fails to make API call
   */
  public ArtifactOwner getArtifactOwner(String groupId, String artifactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getArtifactOwner");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling getArtifactOwner");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/owner".replaceAll("\\{format\\}","json")
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

    GenericType<ArtifactOwner> localVarReturnType = new GenericType<ArtifactOwner>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get artifact version metadata
   * Retrieves the metadata for a single version of the artifact.  The version metadata is  a subset of the artifact metadata and only includes the metadata that is specific to the version (for example, this doesn&#39;t include &#x60;modifiedOn&#x60;).  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * No version with this &#x60;version&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param version The unique identifier of a specific version of the artifact content. (required)
   * @return a {@code VersionMetaData}
   * @throws ApiException if fails to make API call
   */
  public VersionMetaData getArtifactVersionMetaData(String groupId, String artifactId, String version) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getArtifactVersionMetaData");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling getArtifactVersionMetaData");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling getArtifactVersionMetaData");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/versions/{version}/meta".replaceAll("\\{format\\}","json")
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

    GenericType<VersionMetaData> localVarReturnType = new GenericType<VersionMetaData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get artifact version metadata by content
   * Gets the metadata for an artifact that matches the raw content.  Searches the registry for a version of the given artifact matching the content provided in the body of the POST.  This operation can fail for the following reasons:  * Provided content (request body) was empty (HTTP error &#x60;400&#x60;) * No artifact with the &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * No artifact version matching the provided content exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param body The content of an artifact version. (required)
   * @param canonical Parameter that can be set to &#x60;true&#x60; to indicate that the server should \&quot;canonicalize\&quot; the content when searching for a matching version.  Canonicalization is unique to each artifact type, but typically involves removing any extra whitespace and formatting the content in a consistent manner. (optional)
   * @return a {@code VersionMetaData}
   * @throws ApiException if fails to make API call
   */
  public VersionMetaData getArtifactVersionMetaDataByContent(String groupId, String artifactId, Object body, Boolean canonical) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getArtifactVersionMetaDataByContent");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling getArtifactVersionMetaDataByContent");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling getArtifactVersionMetaDataByContent");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/meta".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "artifactId" + "\\}", apiClient.escapeString(artifactId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "canonical", canonical));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<VersionMetaData> localVarReturnType = new GenericType<VersionMetaData>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update artifact metadata
   * Updates the editable parts of the artifact&#39;s metadata.  Not all metadata fields can be updated.  For example, &#x60;createdOn&#x60; and &#x60;createdBy&#x60; are both read-only properties.  This operation can fail for the following reasons:  * No artifact with the &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;)
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param editableMetaData Updated artifact metadata. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateArtifactMetaData(String groupId, String artifactId, EditableMetaData editableMetaData) throws ApiException {
    Object localVarPostBody = editableMetaData;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling updateArtifactMetaData");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling updateArtifactMetaData");
    }
    
    // verify the required parameter 'editableMetaData' is set
    if (editableMetaData == null) {
      throw new ApiException(400, "Missing the required parameter 'editableMetaData' when calling updateArtifactMetaData");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/meta".replaceAll("\\{format\\}","json")
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
  /**
   * Update artifact owner
   * Changes the ownership of an artifact.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;)
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param artifactOwner  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateArtifactOwner(String groupId, String artifactId, ArtifactOwner artifactOwner) throws ApiException {
    Object localVarPostBody = artifactOwner;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling updateArtifactOwner");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling updateArtifactOwner");
    }
    
    // verify the required parameter 'artifactOwner' is set
    if (artifactOwner == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactOwner' when calling updateArtifactOwner");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/owner".replaceAll("\\{format\\}","json")
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
  /**
   * Update artifact version metadata
   * Updates the user-editable portion of the artifact version&#39;s metadata.  Only some of  the metadata fields are editable by the user.  For example, &#x60;description&#x60; is editable,  but &#x60;createdOn&#x60; is not.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * No version with this &#x60;version&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param version The unique identifier of a specific version of the artifact content. (required)
   * @param editableMetaData  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateArtifactVersionMetaData(String groupId, String artifactId, String version, EditableMetaData editableMetaData) throws ApiException {
    Object localVarPostBody = editableMetaData;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling updateArtifactVersionMetaData");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling updateArtifactVersionMetaData");
    }
    
    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(400, "Missing the required parameter 'version' when calling updateArtifactVersionMetaData");
    }
    
    // verify the required parameter 'editableMetaData' is set
    if (editableMetaData == null) {
      throw new ApiException(400, "Missing the required parameter 'editableMetaData' when calling updateArtifactVersionMetaData");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/versions/{version}/meta".replaceAll("\\{format\\}","json")
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
