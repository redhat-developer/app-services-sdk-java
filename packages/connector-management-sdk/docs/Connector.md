

# Connector

A connector holds the configuration to connect a Kafka topic to another system.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**kind** | **String** |  |  [optional]
**href** | **String** |  |  [optional]
**metadata** | [**ConnectorAllOfMetadata**](ConnectorAllOfMetadata.md) |  |  [optional]
**deploymentLocation** | [**ClusterTarget**](ClusterTarget.md) |  |  [optional]
**kafka** | [**KafkaConnectionSettings**](KafkaConnectionSettings.md) |  |  [optional]
**connectorTypeId** | **String** |  |  [optional]
**connectorSpec** | **Object** |  |  [optional]
**channel** | **String** |  |  [optional]
**desiredState** | **String** |  |  [optional]
**status** | **String** |  |  [optional]



