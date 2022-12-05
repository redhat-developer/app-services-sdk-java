

# ConnectorRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**connectorTypeId** | **String** |  | 
**namespaceId** | **String** |  | 
**channel** | **Channel** |  |  [optional]
**desiredState** | **ConnectorDesiredState** |  | 
**annotations** | **Map&lt;String, String&gt;** | Name-value string annotations for resource |  [optional]
**kafka** | [**KafkaConnectionSettings**](KafkaConnectionSettings.md) |  | 
**serviceAccount** | [**ServiceAccount**](ServiceAccount.md) |  | 
**schemaRegistry** | [**SchemaRegistryConnectionSettings**](SchemaRegistryConnectionSettings.md) |  |  [optional]
**connector** | **Object** |  | 



