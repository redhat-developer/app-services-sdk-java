

# SearchedVersion

Models a single artifact from the result set returned when searching for artifacts.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**createdOn** | **String** |  | 
**createdBy** | **String** |  | 
**type** | **ArtifactType** |  | 
**labels** | **List&lt;String&gt;** |  |  [optional]
**state** | **ArtifactState** |  | 
**globalId** | **Long** |  | 
**version** | **String** |  | 
**properties** | **Map&lt;String, String&gt;** | User-defined name-value pairs. Name and value must be strings. |  [optional]
**contentId** | **Long** |  | 
**references** | [**List&lt;ArtifactReference&gt;**](ArtifactReference.md) |  | 



