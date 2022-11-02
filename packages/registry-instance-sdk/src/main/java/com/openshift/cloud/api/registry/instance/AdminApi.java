package com.openshift.cloud.api.registry.instance;

import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.openshift.cloud.api.registry.instance.models.ConfigurationProperty;
import com.openshift.cloud.api.registry.instance.models.Error;
import java.io.File;
import com.openshift.cloud.api.registry.instance.models.LogConfiguration;
import com.openshift.cloud.api.registry.instance.models.NamedLogConfiguration;
import com.openshift.cloud.api.registry.instance.models.RoleMapping;
import com.openshift.cloud.api.registry.instance.models.UpdateConfigurationProperty;
import com.openshift.cloud.api.registry.instance.models.UpdateRole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdminApi {
  private ApiClient apiClient;

  public AdminApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdminApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a new role mapping
   * Creates a new mapping between a user/principal and a role.  This operation can fail for the following reasons:  * A server error occurred (HTTP error &#x60;500&#x60;)  
   * @param roleMapping  (required)
   * @throws ApiException if fails to make API call
   */
  public void createRoleMapping(RoleMapping roleMapping) throws ApiException {
    Object localVarPostBody = roleMapping;
    
    // verify the required parameter 'roleMapping' is set
    if (roleMapping == null) {
      throw new ApiException(400, "Missing the required parameter 'roleMapping' when calling createRoleMapping");
    }
    
    // create path and map variables
    String localVarPath = "/admin/roleMappings".replaceAll("\\{format\\}","json");

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
   * Delete a role mapping
   * Deletes a single role mapping, effectively denying access to a user/principal.  This operation can fail for the following reasons:  * No role mapping for the principalId exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param principalId Unique id of a principal (typically either a user or service account). (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRoleMapping(String principalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'principalId' is set
    if (principalId == null) {
      throw new ApiException(400, "Missing the required parameter 'principalId' when calling deleteRoleMapping");
    }
    
    // create path and map variables
    String localVarPath = "/admin/roleMappings/{principalId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "principalId" + "\\}", apiClient.escapeString(principalId.toString()));

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
   * Export registry data
   * Exports registry data as a ZIP archive.
   * @param accept  (optional)
   * @param forBrowser Indicates if the operation is done for a browser.  If true, the response will be a JSON payload with a property called &#x60;href&#x60;.  This &#x60;href&#x60; will be a single-use, naked download link suitable for use by a web browser to download the content. (optional)
   * @return a {@code File}
   * @throws ApiException if fails to make API call
   */
  public File exportData(String accept, Boolean forBrowser) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/admin/export".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "forBrowser", forBrowser));

    if (accept != null)
      localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));

    
    
    final String[] localVarAccepts = {
      "application/zip", "application/json"
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
   * Get configuration property value
   * Returns the value of a single configuration property.  This operation may fail for one of the following reasons:  * Property not found or not configured (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param propertyName The name of a configuration property. (required)
   * @return a {@code ConfigurationProperty}
   * @throws ApiException if fails to make API call
   */
  public ConfigurationProperty getConfigProperty(String propertyName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'propertyName' is set
    if (propertyName == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyName' when calling getConfigProperty");
    }
    
    // create path and map variables
    String localVarPath = "/admin/config/properties/{propertyName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(propertyName.toString()));

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

    GenericType<ConfigurationProperty> localVarReturnType = new GenericType<ConfigurationProperty>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single logger configuration
   * Returns the configured logger configuration for the provided logger name, if no logger configuration is persisted it will return the current default log configuration in the system.
   * @param logger The name of a single logger. (required)
   * @return a {@code NamedLogConfiguration}
   * @throws ApiException if fails to make API call
   */
  public NamedLogConfiguration getLogConfiguration(String logger) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'logger' is set
    if (logger == null) {
      throw new ApiException(400, "Missing the required parameter 'logger' when calling getLogConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/admin/loggers/{logger}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "logger" + "\\}", apiClient.escapeString(logger.toString()));

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

    GenericType<NamedLogConfiguration> localVarReturnType = new GenericType<NamedLogConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Return a single role mapping
   * Gets the details of a single role mapping (by &#x60;principalId&#x60;).  This operation can fail for the following reasons:  * No role mapping for the &#x60;principalId&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param principalId Unique id of a principal (typically either a user or service account). (required)
   * @return a {@code RoleMapping}
   * @throws ApiException if fails to make API call
   */
  public RoleMapping getRoleMapping(String principalId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'principalId' is set
    if (principalId == null) {
      throw new ApiException(400, "Missing the required parameter 'principalId' when calling getRoleMapping");
    }
    
    // create path and map variables
    String localVarPath = "/admin/roleMappings/{principalId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "principalId" + "\\}", apiClient.escapeString(principalId.toString()));

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

    GenericType<RoleMapping> localVarReturnType = new GenericType<RoleMapping>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Import registry data
   * Imports registry data that was previously exported using the &#x60;/admin/export&#x60; operation.
   * @param body The ZIP file representing the previously exported registry data. (required)
   * @param xRegistryPreserveGlobalId If this header is set to false, global ids of imported data will be ignored and replaced by next id in global id sequence. This allows to import any data even thought the global ids would cause a conflict. (optional)
   * @param xRegistryPreserveContentId If this header is set to false, content ids of imported data will be ignored and replaced by next id in content id sequence. The mapping between content and artifacts will be preserved. This allows to import any data even thought the content ids would cause a conflict. (optional)
   * @throws ApiException if fails to make API call
   */
  public void importData(File body, Boolean xRegistryPreserveGlobalId, Boolean xRegistryPreserveContentId) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling importData");
    }
    
    // create path and map variables
    String localVarPath = "/admin/import".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xRegistryPreserveGlobalId != null)
      localVarHeaderParams.put("X-Registry-Preserve-GlobalId", apiClient.parameterToString(xRegistryPreserveGlobalId));
if (xRegistryPreserveContentId != null)
      localVarHeaderParams.put("X-Registry-Preserve-ContentId", apiClient.parameterToString(xRegistryPreserveContentId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/zip"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * List all configuration properties
   * Returns a list of all configuration properties that have been set.  The list is not paged.  This operation may fail for one of the following reasons:  * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @return a {@code List<ConfigurationProperty>}
   * @throws ApiException if fails to make API call
   */
  public List<ConfigurationProperty> listConfigProperties() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/admin/config/properties".replaceAll("\\{format\\}","json");

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

    GenericType<List<ConfigurationProperty>> localVarReturnType = new GenericType<List<ConfigurationProperty>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List logging configurations
   * List all of the configured logging levels.  These override the default logging configuration.
   * @return a {@code List<NamedLogConfiguration>}
   * @throws ApiException if fails to make API call
   */
  public List<NamedLogConfiguration> listLogConfigurations() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/admin/loggers".replaceAll("\\{format\\}","json");

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

    GenericType<List<NamedLogConfiguration>> localVarReturnType = new GenericType<List<NamedLogConfiguration>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List all role mappings
   * Gets a list of all role mappings configured in the registry (if any).  This operation can fail for the following reasons:  * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @return a {@code List<RoleMapping>}
   * @throws ApiException if fails to make API call
   */
  public List<RoleMapping> listRoleMappings() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/admin/roleMappings".replaceAll("\\{format\\}","json");

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

    GenericType<List<RoleMapping>> localVarReturnType = new GenericType<List<RoleMapping>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Removes logger configuration
   * Removes the configured logger configuration (if any) for the given logger.
   * @param logger The name of a single logger. (required)
   * @return a {@code NamedLogConfiguration}
   * @throws ApiException if fails to make API call
   */
  public NamedLogConfiguration removeLogConfiguration(String logger) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'logger' is set
    if (logger == null) {
      throw new ApiException(400, "Missing the required parameter 'logger' when calling removeLogConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/admin/loggers/{logger}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "logger" + "\\}", apiClient.escapeString(logger.toString()));

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

    GenericType<NamedLogConfiguration> localVarReturnType = new GenericType<NamedLogConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Reset a configuration property
   * Resets the value of a single configuration property.  This will return the property to its default value (see external documentation for supported properties and their default values).  This operation may fail for one of the following reasons:  * Property not found or not configured (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param propertyName The name of a configuration property. (required)
   * @throws ApiException if fails to make API call
   */
  public void resetConfigProperty(String propertyName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'propertyName' is set
    if (propertyName == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyName' when calling resetConfigProperty");
    }
    
    // create path and map variables
    String localVarPath = "/admin/config/properties/{propertyName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(propertyName.toString()));

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
   * Set a logger&#39;s configuration
   * Configures the logger referenced by the provided logger name with the given configuration.
   * @param logger The name of a single logger. (required)
   * @param logConfiguration The new logger configuration. (required)
   * @return a {@code NamedLogConfiguration}
   * @throws ApiException if fails to make API call
   */
  public NamedLogConfiguration setLogConfiguration(String logger, LogConfiguration logConfiguration) throws ApiException {
    Object localVarPostBody = logConfiguration;
    
    // verify the required parameter 'logger' is set
    if (logger == null) {
      throw new ApiException(400, "Missing the required parameter 'logger' when calling setLogConfiguration");
    }
    
    // verify the required parameter 'logConfiguration' is set
    if (logConfiguration == null) {
      throw new ApiException(400, "Missing the required parameter 'logConfiguration' when calling setLogConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/admin/loggers/{logger}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "logger" + "\\}", apiClient.escapeString(logger.toString()));

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

    GenericType<NamedLogConfiguration> localVarReturnType = new GenericType<NamedLogConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a configuration property
   * Updates the value of a single configuration property.  This operation may fail for one of the following reasons:  * Property not found or not configured (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param propertyName The name of a configuration property. (required)
   * @param updateConfigurationProperty  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateConfigProperty(String propertyName, UpdateConfigurationProperty updateConfigurationProperty) throws ApiException {
    Object localVarPostBody = updateConfigurationProperty;
    
    // verify the required parameter 'propertyName' is set
    if (propertyName == null) {
      throw new ApiException(400, "Missing the required parameter 'propertyName' when calling updateConfigProperty");
    }
    
    // verify the required parameter 'updateConfigurationProperty' is set
    if (updateConfigurationProperty == null) {
      throw new ApiException(400, "Missing the required parameter 'updateConfigurationProperty' when calling updateConfigProperty");
    }
    
    // create path and map variables
    String localVarPath = "/admin/config/properties/{propertyName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "propertyName" + "\\}", apiClient.escapeString(propertyName.toString()));

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
   * Update a role mapping
   * Updates a single role mapping for one user/principal.  This operation can fail for the following reasons:  * No role mapping for the principalId exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 
   * @param principalId Unique id of a principal (typically either a user or service account). (required)
   * @param updateRole  (required)
   * @throws ApiException if fails to make API call
   */
  public void updateRoleMapping(String principalId, UpdateRole updateRole) throws ApiException {
    Object localVarPostBody = updateRole;
    
    // verify the required parameter 'principalId' is set
    if (principalId == null) {
      throw new ApiException(400, "Missing the required parameter 'principalId' when calling updateRoleMapping");
    }
    
    // verify the required parameter 'updateRole' is set
    if (updateRole == null) {
      throw new ApiException(400, "Missing the required parameter 'updateRole' when calling updateRoleMapping");
    }
    
    // create path and map variables
    String localVarPath = "/admin/roleMappings/{principalId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "principalId" + "\\}", apiClient.escapeString(principalId.toString()));

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
