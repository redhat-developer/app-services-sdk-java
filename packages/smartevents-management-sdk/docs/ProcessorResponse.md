

# ProcessorResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | The kind (type) of this resource | 
**id** | **String** | The unique identifier of this resource | 
**href** | **String** | The URL of this resource, without the protocol | 
**submittedAt** | **OffsetDateTime** |  | 
**publishedAt** | **OffsetDateTime** |  |  [optional]
**modifiedAt** | **OffsetDateTime** |  |  [optional]
**status** | [**ManagedResourceStatus**](ManagedResourceStatus.md) |  | 
**owner** | **String** | The user that owns this resource | 
**name** | **String** | The name of the processor | 
**flows** | **Object** | The Camel YAML DSL code, formatted as JSON, that defines the flows in the processor | 
**statusMessage** | **String** |  |  [optional]



