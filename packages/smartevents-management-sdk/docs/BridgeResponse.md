

# BridgeResponse


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
**name** | **String** | The name of the bridge | 
**endpoint** | **String** | The HTTPS endpoint on which the bridge accepts events |  [optional]
**cloudProvider** | **String** | The cloud provider where the bridge resides |  [optional]
**region** | **String** | The cloud provider region where the bridge resides |  [optional]
**statusMessage** | **String** | A detailed status message in case there is a problem with the bridge |  [optional]



