# SearchApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchArtifacts**](SearchApi.md#searchArtifacts) | **GET** /search/artifacts | Search for artifacts
[**searchArtifactsByContent**](SearchApi.md#searchArtifactsByContent) | **POST** /search/artifacts | Search for artifacts by content



## searchArtifacts

> ArtifactSearchResults searchArtifacts(name, offset, limit, order, orderby, labels, properties, description, group, globalId, contentId)

Search for artifacts

Returns a paginated list of all artifacts that match the provided filter criteria. 

### Example

```java
// Import classes:
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.models.*;
import com.openshift.cloud.api.registry.instance.SearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SearchApi apiInstance = new SearchApi(defaultClient);
        String name = "name_example"; // String | Filter by artifact name.
        Integer offset = 0; // Integer | The number of artifacts to skip before starting to collect the result set.  Defaults to 0.
        Integer limit = 20; // Integer | The number of artifacts to return.  Defaults to 20.
        SortOrder order = SortOrder.fromValue("asc"); // SortOrder | Sort order, ascending (`asc`) or descending (`desc`).
        SortBy orderby = SortBy.fromValue("name"); // SortBy | The field to sort by.  Can be one of:  * `name` * `createdOn` 
        List<String> labels = Arrays.asList(); // List<String> | Filter by label.  Include one or more label to only return artifacts containing all of the specified labels.
        List<String> properties = Arrays.asList(); // List<String> | Filter by one or more name/value property.  Separate each name/value pair using a colon.  For example `properties=foo:bar` will return only artifacts with a custom property named `foo` and value `bar`.
        String description = "description_example"; // String | Filter by description.
        String group = "group_example"; // String | Filter by artifact group.
        Long globalId = 56L; // Long | Filter by globalId.
        Long contentId = 56L; // Long | Filter by contentId.
        try {
            ArtifactSearchResults result = apiInstance.searchArtifacts(name, offset, limit, order, orderby, labels, properties, description, group, globalId, contentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#searchArtifacts");
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
 **name** | **String**| Filter by artifact name. | [optional]
 **offset** | **Integer**| The number of artifacts to skip before starting to collect the result set.  Defaults to 0. | [optional] [default to 0]
 **limit** | **Integer**| The number of artifacts to return.  Defaults to 20. | [optional] [default to 20]
 **order** | [**SortOrder**](.md)| Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). | [optional] [enum: asc, desc]
 **orderby** | [**SortBy**](.md)| The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60;  | [optional] [enum: name, createdOn]
 **labels** | [**List&lt;String&gt;**](String.md)| Filter by label.  Include one or more label to only return artifacts containing all of the specified labels. | [optional]
 **properties** | [**List&lt;String&gt;**](String.md)| Filter by one or more name/value property.  Separate each name/value pair using a colon.  For example &#x60;properties&#x3D;foo:bar&#x60; will return only artifacts with a custom property named &#x60;foo&#x60; and value &#x60;bar&#x60;. | [optional]
 **description** | **String**| Filter by description. | [optional]
 **group** | **String**| Filter by artifact group. | [optional]
 **globalId** | **Long**| Filter by globalId. | [optional]
 **contentId** | **Long**| Filter by contentId. | [optional]

### Return type

[**ArtifactSearchResults**](ArtifactSearchResults.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | On a successful response, returns a result set of artifacts - one for each artifact in the registry that matches the criteria. |  -  |
| **500** | Common response for all operations that can fail with an unexpected server error. |  -  |


## searchArtifactsByContent

> ArtifactSearchResults searchArtifactsByContent(body, canonical, artifactType, offset, limit, order, orderby)

Search for artifacts by content

Returns a paginated list of all artifacts with at least one version that matches the posted content. 

### Example

```java
// Import classes:
import com.openshift.cloud.api.registry.instance.invoker.ApiClient;
import com.openshift.cloud.api.registry.instance.invoker.ApiException;
import com.openshift.cloud.api.registry.instance.invoker.Configuration;
import com.openshift.cloud.api.registry.instance.invoker.models.*;
import com.openshift.cloud.api.registry.instance.SearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SearchApi apiInstance = new SearchApi(defaultClient);
        File body = new File("/path/to/file"); // File | The content to search for.
        Boolean canonical = true; // Boolean | Parameter that can be set to `true` to indicate that the server should \"canonicalize\" the content when searching for matching artifacts.  Canonicalization is unique to each artifact type, but typically involves removing any extra whitespace and formatting the content in a consistent manner.  Must be used along with the `artifactType` query parameter.
        ArtifactType artifactType = ArtifactType.fromValue("AVRO"); // ArtifactType | Indicates the type of artifact represented by the content being used for the search.  This is only needed when using the `canonical` query parameter, so that the server knows how to canonicalize the content prior to searching for matching artifacts.
        Integer offset = 0; // Integer | The number of artifacts to skip before starting to collect the result set.  Defaults to 0.
        Integer limit = 20; // Integer | The number of artifacts to return.  Defaults to 20.
        String order = "asc"; // String | Sort order, ascending (`asc`) or descending (`desc`).
        String orderby = "name"; // String | The field to sort by.  Can be one of:  * `name` * `createdOn` 
        try {
            ArtifactSearchResults result = apiInstance.searchArtifactsByContent(body, canonical, artifactType, offset, limit, order, orderby);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#searchArtifactsByContent");
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
 **body** | **File**| The content to search for. |
 **canonical** | **Boolean**| Parameter that can be set to &#x60;true&#x60; to indicate that the server should \&quot;canonicalize\&quot; the content when searching for matching artifacts.  Canonicalization is unique to each artifact type, but typically involves removing any extra whitespace and formatting the content in a consistent manner.  Must be used along with the &#x60;artifactType&#x60; query parameter. | [optional]
 **artifactType** | [**ArtifactType**](.md)| Indicates the type of artifact represented by the content being used for the search.  This is only needed when using the &#x60;canonical&#x60; query parameter, so that the server knows how to canonicalize the content prior to searching for matching artifacts. | [optional] [enum: AVRO, PROTOBUF, JSON, OPENAPI, ASYNCAPI, GRAPHQL, KCONNECT, WSDL, XSD, XML]
 **offset** | **Integer**| The number of artifacts to skip before starting to collect the result set.  Defaults to 0. | [optional] [default to 0]
 **limit** | **Integer**| The number of artifacts to return.  Defaults to 20. | [optional] [default to 20]
 **order** | **String**| Sort order, ascending (&#x60;asc&#x60;) or descending (&#x60;desc&#x60;). | [optional] [enum: asc, desc]
 **orderby** | **String**| The field to sort by.  Can be one of:  * &#x60;name&#x60; * &#x60;createdOn&#x60;  | [optional] [enum: name, createdOn]

### Return type

[**ArtifactSearchResults**](ArtifactSearchResults.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | On a successful response, returns a result set of artifacts - one for each artifact in the registry that matches the criteria. |  -  |
| **500** | Common response for all operations that can fail with an unexpected server error. |  -  |

