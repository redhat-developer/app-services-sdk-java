# VersionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createArtifactVersion**](VersionsApi.md#createArtifactVersion) | **POST** /groups/{groupId}/artifacts/{artifactId}/versions | Create artifact version
[**getArtifactVersion**](VersionsApi.md#getArtifactVersion) | **GET** /groups/{groupId}/artifacts/{artifactId}/versions/{version} | Get artifact version
[**getArtifactVersionReferences**](VersionsApi.md#getArtifactVersionReferences) | **GET** /groups/{groupId}/artifacts/{artifactId}/versions/{version}/references | Get artifact version
[**listArtifactVersions**](VersionsApi.md#listArtifactVersions) | **GET** /groups/{groupId}/artifacts/{artifactId}/versions | List artifact versions
[**updateArtifactVersionState**](VersionsApi.md#updateArtifactVersionState) | **PUT** /groups/{groupId}/artifacts/{artifactId}/versions/{version}/state | Update artifact version state



## createArtifactVersion

> VersionMetaData createArtifactVersion(groupId, artifactId, body, xRegistryVersion, xRegistryName, xRegistryDescription, xRegistryDescriptionEncoded, xRegistryNameEncoded)

Create artifact version

Creates a new version of the artifact by uploading new content.  The configured rules for the artifact are applied, and if they all pass, the new content is added as the most recent  version of the artifact.  If any of the rules fail, an error is returned.  The body of the request can be the raw content of the new artifact version, or the raw content  and a set of references pointing to other artifacts, and the type of that content should match the artifact&#39;s type (for example if the artifact type is &#x60;AVRO&#x60; then the content of the request should be an Apache Avro document).  This operation can fail for the following reasons:  * Provided content (request body) was empty (HTTP error &#x60;400&#x60;) * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * The new content violates one of the rules configured for the artifact (HTTP error &#x60;409&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 

### Example

```java
// Import classes:
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.models.*;
import com.openshift.cloud.api.registry.instance.VersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VersionsApi apiInstance = new VersionsApi(defaultClient);
        String groupId = "groupId_example"; // String | The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts.
        String artifactId = "artifactId_example"; // String | The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier.
        Object body = {"openapi":"3.0.2","info":{"title":"Empty API","version":"1.0.7","description":"An example API design using OpenAPI."},"paths":{"/widgets":{"get":{"responses":{"200":{"content":{"application/json":{"schema":{"type":"array","items":{"type":"string"}}}},"description":"All widgets"}},"summary":"Get widgets"}}},"components":{"schemas":{"Widget":{"title":"Root Type for Widget","description":"A sample data type.","type":"object","properties":{"property-1":{"type":"string"},"property-2":{"type":"boolean"}},"example":{"property-1":"value1","property-2":true}}}}}; // Object | The content of the artifact version being created or the content and a set of references to other artifacts. This is often, but not always, JSON data representing one of the supported artifact types:  * Avro (`AVRO`) * Protobuf (`PROTOBUF`) * JSON Schema (`JSON`) * Kafka Connect (`KCONNECT`) * OpenAPI (`OPENAPI`) * AsyncAPI (`ASYNCAPI`) * GraphQL (`GRAPHQL`) * Web Services Description Language (`WSDL`) * XML Schema (`XSD`) 
        String xRegistryVersion = "xRegistryVersion_example"; // String | Specifies the version number of this new version of the artifact content.  This would typically be a simple integer or a SemVer value.  It must be unique within the artifact.  If this is not provided, the server will generate a new, unique version number for this new updated content.
        String xRegistryName = "xRegistryName_example"; // String | Specifies the artifact name of this new version of the artifact content. Name must be ASCII-only string. If this is not provided, the server will extract the name from the artifact content.
        String xRegistryDescription = "xRegistryDescription_example"; // String | Specifies the artifact description of this new version of the artifact content. Description must be ASCII-only string. If this is not provided, the server will extract the description from the artifact content.
        String xRegistryDescriptionEncoded = "xRegistryDescriptionEncoded_example"; // String | Specifies the artifact description of this new version of the artifact content. Value of this must be Base64 encoded string. If this is not provided, the server will extract the description from the artifact content.
        String xRegistryNameEncoded = "xRegistryNameEncoded_example"; // String | Specifies the artifact name of this new version of the artifact content. Value of this must be Base64 encoded string. If this is not provided, the server will extract the name from the artifact content.
        try {
            VersionMetaData result = apiInstance.createArtifactVersion(groupId, artifactId, body, xRegistryVersion, xRegistryName, xRegistryDescription, xRegistryDescriptionEncoded, xRegistryNameEncoded);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VersionsApi#createArtifactVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. |
 **artifactId** | **String**| The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. |
 **body** | **Object**| The content of the artifact version being created or the content and a set of references to other artifacts. This is often, but not always, JSON data representing one of the supported artifact types:  * Avro (&#x60;AVRO&#x60;) * Protobuf (&#x60;PROTOBUF&#x60;) * JSON Schema (&#x60;JSON&#x60;) * Kafka Connect (&#x60;KCONNECT&#x60;) * OpenAPI (&#x60;OPENAPI&#x60;) * AsyncAPI (&#x60;ASYNCAPI&#x60;) * GraphQL (&#x60;GRAPHQL&#x60;) * Web Services Description Language (&#x60;WSDL&#x60;) * XML Schema (&#x60;XSD&#x60;)  |
 **xRegistryVersion** | **String**| Specifies the version number of this new version of the artifact content.  This would typically be a simple integer or a SemVer value.  It must be unique within the artifact.  If this is not provided, the server will generate a new, unique version number for this new updated content. | [optional]
 **xRegistryName** | **String**| Specifies the artifact name of this new version of the artifact content. Name must be ASCII-only string. If this is not provided, the server will extract the name from the artifact content. | [optional]
 **xRegistryDescription** | **String**| Specifies the artifact description of this new version of the artifact content. Description must be ASCII-only string. If this is not provided, the server will extract the description from the artifact content. | [optional]
 **xRegistryDescriptionEncoded** | **String**| Specifies the artifact description of this new version of the artifact content. Value of this must be Base64 encoded string. If this is not provided, the server will extract the description from the artifact content. | [optional]
 **xRegistryNameEncoded** | **String**| Specifies the artifact name of this new version of the artifact content. Value of this must be Base64 encoded string. If this is not provided, the server will extract the name from the artifact content. | [optional]

### Return type

[**VersionMetaData**](VersionMetaData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The artifact version was successfully created. |  -  |
| **404** | Common response for all operations that can return a &#x60;404&#x60; error. |  -  |
| **409** | Common response used when an input conflicts with existing data. |  -  |
| **500** | Common response for all operations that can fail with an unexpected server error. |  -  |


## getArtifactVersion

> File getArtifactVersion(groupId, artifactId, version, dereference)

Get artifact version

Retrieves a single version of the artifact content.  Both the &#x60;artifactId&#x60; and the unique &#x60;version&#x60; number must be provided.  The &#x60;Content-Type&#x60; of the response depends  on the artifact type.  In most cases, this is &#x60;application/json&#x60;, but for some types  it may be different (for example, &#x60;PROTOBUF&#x60;).  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * No version with this &#x60;version&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 

### Example

```java
// Import classes:
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.models.*;
import com.openshift.cloud.api.registry.instance.VersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VersionsApi apiInstance = new VersionsApi(defaultClient);
        String groupId = "groupId_example"; // String | The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts.
        String artifactId = "artifactId_example"; // String | The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier.
        String version = "version_example"; // String | The unique identifier of a specific version of the artifact content.
        Boolean dereference = true; // Boolean | Allows the user to specify if the content should be dereferenced when being returned
        try {
            File result = apiInstance.getArtifactVersion(groupId, artifactId, version, dereference);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VersionsApi#getArtifactVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. |
 **artifactId** | **String**| The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. |
 **version** | **String**| The unique identifier of a specific version of the artifact content. |
 **dereference** | **Boolean**| Allows the user to specify if the content should be dereferenced when being returned | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The content of one version of one artifact. |  -  |
| **404** | Common response for all operations that can return a &#x60;404&#x60; error. |  -  |
| **500** | Common response for all operations that can fail with an unexpected server error. |  -  |


## getArtifactVersionReferences

> List&lt;ArtifactReference&gt; getArtifactVersionReferences(groupId, artifactId, version)

Get artifact version

Retrieves a single version of the artifact content.  Both the &#x60;artifactId&#x60; and the unique &#x60;version&#x60; number must be provided.  The &#x60;Content-Type&#x60; of the response depends  on the artifact type.  In most cases, this is &#x60;application/json&#x60;, but for some types  it may be different (for example, &#x60;PROTOBUF&#x60;).  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * No version with this &#x60;version&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 

### Example

```java
// Import classes:
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.models.*;
import com.openshift.cloud.api.registry.instance.VersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VersionsApi apiInstance = new VersionsApi(defaultClient);
        String groupId = "groupId_example"; // String | The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts.
        String artifactId = "artifactId_example"; // String | The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier.
        String version = "version_example"; // String | The unique identifier of a specific version of the artifact content.
        try {
            List<ArtifactReference> result = apiInstance.getArtifactVersionReferences(groupId, artifactId, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VersionsApi#getArtifactVersionReferences");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. |
 **artifactId** | **String**| The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. |
 **version** | **String**| The unique identifier of a specific version of the artifact content. |

### Return type

[**List&lt;ArtifactReference&gt;**](ArtifactReference.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all the artifact references for this artifact. |  -  |
| **404** | Common response for all operations that can return a &#x60;404&#x60; error. |  -  |
| **500** | Common response for all operations that can fail with an unexpected server error. |  -  |


## listArtifactVersions

> VersionSearchResults listArtifactVersions(groupId, artifactId, offset, limit)

List artifact versions

Returns a list of all versions of the artifact.  The result set is paged.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 

### Example

```java
// Import classes:
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.models.*;
import com.openshift.cloud.api.registry.instance.VersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VersionsApi apiInstance = new VersionsApi(defaultClient);
        String groupId = "groupId_example"; // String | The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts.
        String artifactId = "artifactId_example"; // String | The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier.
        Integer offset = 56; // Integer | The number of versions to skip before starting to collect the result set.  Defaults to 0.
        Integer limit = 56; // Integer | The number of versions to return.  Defaults to 20.
        try {
            VersionSearchResults result = apiInstance.listArtifactVersions(groupId, artifactId, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VersionsApi#listArtifactVersions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. |
 **artifactId** | **String**| The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. |
 **offset** | **Integer**| The number of versions to skip before starting to collect the result set.  Defaults to 0. | [optional]
 **limit** | **Integer**| The number of versions to return.  Defaults to 20. | [optional]

### Return type

[**VersionSearchResults**](VersionSearchResults.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all artifact versions. |  -  |
| **404** | Common response for all operations that can return a &#x60;404&#x60; error. |  -  |
| **500** | Common response for all operations that can fail with an unexpected server error. |  -  |


## updateArtifactVersionState

> updateArtifactVersionState(groupId, artifactId, version, updateState)

Update artifact version state

Updates the state of a specific version of an artifact.  For example, you can use  this operation to disable a specific version.  This operation can fail for the following reasons:  * No artifact with this &#x60;artifactId&#x60; exists (HTTP error &#x60;404&#x60;) * No version with this &#x60;version&#x60; exists (HTTP error &#x60;404&#x60;) * A server error occurred (HTTP error &#x60;500&#x60;) 

### Example

```java
// Import classes:
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.models.*;
import com.openshift.cloud.api.registry.instance.VersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        VersionsApi apiInstance = new VersionsApi(defaultClient);
        String groupId = "groupId_example"; // String | The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts.
        String artifactId = "artifactId_example"; // String | The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier.
        String version = "version_example"; // String | The unique identifier of a specific version of the artifact content.
        UpdateState updateState = new UpdateState(); // UpdateState | 
        try {
            apiInstance.updateArtifactVersionState(groupId, artifactId, version, updateState);
        } catch (ApiException e) {
            System.err.println("Exception when calling VersionsApi#updateArtifactVersionState");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**| The artifact group ID.  Must be a string provided by the client, representing the name of the grouping of artifacts. |
 **artifactId** | **String**| The artifact ID.  Can be a string (client-provided) or UUID (server-generated), representing the unique artifact identifier. |
 **version** | **String**| The unique identifier of a specific version of the artifact content. |
 **updateState** | [**UpdateState**](UpdateState.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned when the update was successful. |  -  |
| **400** | Common response for all operations that can return a &#x60;400&#x60; error. |  -  |
| **404** | Common response for all operations that can return a &#x60;404&#x60; error. |  -  |
| **500** | Common response for all operations that can fail with an unexpected server error. |  -  |

