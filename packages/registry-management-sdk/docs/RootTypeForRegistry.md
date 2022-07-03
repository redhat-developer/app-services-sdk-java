

# RootTypeForRegistry

Service Registry instance in a multi-tenant deployment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**status** | **RegistryStatusValue** |  | 
**registryUrl** | **String** |  |  [optional]
**browserUrl** | **String** |  |  [optional]
**name** | **String** | User-defined Registry instance name. Does not have to be unique. | 
**registryDeploymentId** | **Integer** | Identifier of a multi-tenant deployment, where this Service Registry instance resides. |  [optional]
**owner** | **String** | Registry instance owner. | 
**description** | **String** | Description of the Registry instance. |  [optional]
**createdAt** | **OffsetDateTime** | ISO 8601 UTC timestamp. | 
**updatedAt** | **OffsetDateTime** | ISO 8601 UTC timestamp. | 
**instanceType** | **RegistryInstanceTypeValue** |  | 



