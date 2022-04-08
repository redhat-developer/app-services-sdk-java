

# Connector


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**kind** | **String** |  |  [optional]
**href** | **String** |  |  [optional]
**owner** | **String** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**modifiedAt** | **OffsetDateTime** |  |  [optional]
**name** | **String** |  | 
**connectorTypeId** | **String** |  | 
**namespaceId** | **String** |  | 
**channel** | **Channel** |  |  [optional]
**desiredState** | **ConnectorDesiredState** |  | 
**resourceVersion** | **Long** |  |  [optional]
**kafka** | [**KafkaConnectionSettings**](KafkaConnectionSettings.md) |  | 
**serviceAccount** | [**ServiceAccount**](ServiceAccount.md) |  | 
**schemaRegistry** | [**SchemaRegistryConnectionSettings**](SchemaRegistryConnectionSettings.md) |  |  [optional]
**connector** | **Object** |  | 
**status** | [**ConnectorStatusStatus**](ConnectorStatusStatus.md) |  |  [optional]



