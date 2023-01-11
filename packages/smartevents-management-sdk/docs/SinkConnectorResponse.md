

# SinkConnectorResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | The kind (type) of this resource | 
**id** | **String** | The unique identifier of this resource | 
**name** | **String** | The name of this resource |  [optional]
**href** | **String** | The URL of this resource, without the protocol | 
**submittedAt** | **OffsetDateTime** |  | 
**publishedAt** | **OffsetDateTime** |  |  [optional]
**modifiedAt** | **OffsetDateTime** |  |  [optional]
**status** | [**ManagedResourceStatus**](ManagedResourceStatus.md) |  | 
**owner** | **String** | The user that owns this resource | 
**connectorTypeId** | **String** | The connector type | 
**connector** | **Object** | The Connector configuration payload | 
**statusMessage** | **String** | A detailed status message in case there is a problem with the connector |  [optional]
**uriDsl** | **String** | The URI to be used in Camel DSL to send data to this sink | 



