package com.openshift.cloud.api.registry.instance;

import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.registry.instance.models.Error;
import com.openshift.cloud.api.registry.instance.models.Rule;
import com.openshift.cloud.api.registry.instance.models.RuleType;
import com.openshift.cloud.api.registry.instance.models.RuleViolationError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArtifactRulesApi {
  private ApiClient apiClient;

  public ArtifactRulesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ArtifactRulesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create artifact rule
   * Adds a rule to the list of rules that get applied to the artifact when adding new versions.  All configured rules must pass to successfully add a new artifact version.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * Rule (named in the request body) is unknown (HTTP error &#x60;400&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;)
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param rule  (required)
   * @throws ApiException if fails to make API call
   */
  public void createArtifactRule(String groupId, String artifactId, Rule rule) throws ApiException {
    Object localVarPostBody = rule;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling createArtifactRule");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling createArtifactRule");
    }
    
    // verify the required parameter 'rule' is set
    if (rule == null) {
      throw new ApiException(400, "Missing the required parameter 'rule' when calling createArtifactRule");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/rules".replaceAll("\\{format\\}","json")
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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete artifact rule
   * Deletes a rule from the artifact.  This results in the rule no longer applying for this artifact.  If this is the only rule configured for the artifact, this is the  same as deleting **all** rules, and the globally configured rules now apply to this artifact.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * No rule with this name/type is configured for this artifact (HTTP error &#x60;404&#x60;) * Invalid rule type (HTTP error &#x60;400&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;)
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param rule The unique name/type of a rule. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteArtifactRule(String groupId, String artifactId, String rule) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteArtifactRule");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling deleteArtifactRule");
    }
    
    // verify the required parameter 'rule' is set
    if (rule == null) {
      throw new ApiException(400, "Missing the required parameter 'rule' when calling deleteArtifactRule");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/rules/{rule}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "artifactId" + "\\}", apiClient.escapeString(artifactId.toString()))
      .replaceAll("\\{" + "rule" + "\\}", apiClient.escapeString(rule.toString()));

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
   * Delete artifact rules
   * Deletes all of the rules configured for the artifact.  After this is done, the global rules apply to the artifact again.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;)
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteArtifactRules(String groupId, String artifactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling deleteArtifactRules");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling deleteArtifactRules");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/rules".replaceAll("\\{format\\}","json")
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
   * Get artifact rule configuration
   * Returns information about a single rule configured for an artifact.  This is useful when you want to know what the current configuration settings are for a specific rule.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * No rule with this name/type is configured for this artifact (HTTP error &#x60;404&#x60;) * Invalid rule type (HTTP error &#x60;400&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;)
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param rule The unique name/type of a rule. (required)
   * @return a {@code Rule}
   * @throws ApiException if fails to make API call
   */
  public Rule getArtifactRuleConfig(String groupId, String artifactId, String rule) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling getArtifactRuleConfig");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling getArtifactRuleConfig");
    }
    
    // verify the required parameter 'rule' is set
    if (rule == null) {
      throw new ApiException(400, "Missing the required parameter 'rule' when calling getArtifactRuleConfig");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/rules/{rule}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "artifactId" + "\\}", apiClient.escapeString(artifactId.toString()))
      .replaceAll("\\{" + "rule" + "\\}", apiClient.escapeString(rule.toString()));

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

    GenericType<Rule> localVarReturnType = new GenericType<Rule>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List artifact rules
   * Returns a list of all rules configured for the artifact.  The set of rules determines how the content of an artifact can evolve over time.  If no rules are configured for an artifact, the set of globally configured rules are used.  If no global rules  are defined, there are no restrictions on content evolution.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;)
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @return a {@code List<RuleType>}
   * @throws ApiException if fails to make API call
   */
  public List<RuleType> listArtifactRules(String groupId, String artifactId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling listArtifactRules");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling listArtifactRules");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/rules".replaceAll("\\{format\\}","json")
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

    GenericType<List<RuleType>> localVarReturnType = new GenericType<List<RuleType>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Test update artifact
   * Tests whether an update to the artifact&#39;s content *would* succeed for the provided content. Ultimately, this applies any rules configured for the artifact against the given content to determine whether the rules would pass or fail, but without actually updating the artifact content.  The body of the request should be the raw content of the artifact.  This is typically in  JSON format for *most* of the supported types, but may be in another format for a few  (for example, &#x60;PROTOBUF&#x60;).  The update could fail for a number of reasons including:  * Provided content (request body) was empty (HTTP error &#x60;400&#x60;) * No artifact with the &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * The new content violates one of the rules configured for the artifact (HTTP error &#x60;409&#x60;) * The provided artifact type is not recognized (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;)  When successful, this operation simply returns a *No Content* response.  This response indicates that the content is valid against the configured content rules for the  artifact (or the global rules if no artifact rules are enabled).
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param body The content of the artifact being tested. This is often, but not always, JSON data representing one of the supported artifact types:  * Avro (&#x60;AVRO&#x60;) * Protobuf (&#x60;PROTOBUF&#x60;) * JSON Schema (&#x60;JSON&#x60;) * Kafka Connect (&#x60;KCONNECT&#x60;) * OpenAPI (&#x60;OPENAPI&#x60;) * AsyncAPI (&#x60;ASYNCAPI&#x60;) * GraphQL (&#x60;GRAPHQL&#x60;) * Web Services Description Language (&#x60;WSDL&#x60;) * XML Schema (&#x60;XSD&#x60;)  (required)
   * @throws ApiException if fails to make API call
   */
  public void testUpdateArtifact(String groupId, String artifactId, Object body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling testUpdateArtifact");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling testUpdateArtifact");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling testUpdateArtifact");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/test".replaceAll("\\{format\\}","json")
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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update artifact rule configuration
   * Updates the configuration of a single rule for the artifact.  The configuration data is specific to each rule type, so the configuration of the &#x60;COMPATIBILITY&#x60; rule  is in a different format from the configuration of the &#x60;VALIDITY&#x60; rule.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * No rule with this name/type is configured for this artifact (HTTP error &#x60;404&#x60;) * Invalid rule type (HTTP error &#x60;400&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param groupId The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. (required)
   * @param artifactId The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. (required)
   * @param rule The unique name/type of a rule. (required)
   * @param rule2  (required)
   * @return a {@code Rule}
   * @throws ApiException if fails to make API call
   */
  public Rule updateArtifactRuleConfig(String groupId, String artifactId, String rule, Rule rule2) throws ApiException {
    Object localVarPostBody = rule2;
    
    // verify the required parameter 'groupId' is set
    if (groupId == null) {
      throw new ApiException(400, "Missing the required parameter 'groupId' when calling updateArtifactRuleConfig");
    }
    
    // verify the required parameter 'artifactId' is set
    if (artifactId == null) {
      throw new ApiException(400, "Missing the required parameter 'artifactId' when calling updateArtifactRuleConfig");
    }
    
    // verify the required parameter 'rule' is set
    if (rule == null) {
      throw new ApiException(400, "Missing the required parameter 'rule' when calling updateArtifactRuleConfig");
    }
    
    // verify the required parameter 'rule2' is set
    if (rule2 == null) {
      throw new ApiException(400, "Missing the required parameter 'rule2' when calling updateArtifactRuleConfig");
    }
    
    // create path and map variables
    String localVarPath = "/groups/{groupId}/artifacts/{artifactId}/rules/{rule}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "groupId" + "\\}", apiClient.escapeString(groupId.toString()))
      .replaceAll("\\{" + "artifactId" + "\\}", apiClient.escapeString(artifactId.toString()))
      .replaceAll("\\{" + "rule" + "\\}", apiClient.escapeString(rule.toString()));

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

    GenericType<Rule> localVarReturnType = new GenericType<Rule>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
