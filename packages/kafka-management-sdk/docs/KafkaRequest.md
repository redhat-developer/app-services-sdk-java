

# KafkaRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**kind** | **String** |  | 
**href** | **String** |  | 
**status** | **String** | Values: [accepted, preparing, provisioning, ready, failed, deprovision, deleting]  |  [optional]
**cloudProvider** | **String** | Name of Cloud used to deploy. For example AWS |  [optional]
**multiAz** | **Boolean** |  | 
**region** | **String** | Values will be regions of specific cloud provider. For example: us-east-1 for AWS |  [optional]
**owner** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**bootstrapServerHost** | **String** |  |  [optional]
**adminApiServerUrl** | **String** | The kafka admin server url to perform kafka admin operations e.g acl management etc. The value will be available when the Kafka has been fully provisioned i.e it reaches a &#39;ready&#39; state |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**expiresAt** | **OffsetDateTime** |  |  [optional]
**updatedAt** | **OffsetDateTime** |  |  [optional]
**failedReason** | **String** |  |  [optional]
**version** | **String** |  |  [optional]
**instanceType** | **String** |  |  [optional]
**instanceTypeName** | **String** |  |  [optional]
**reauthenticationEnabled** | **Boolean** |  | 
**maxDataRetentionSize** | [**SupportedKafkaSizeBytesValueItem**](SupportedKafkaSizeBytesValueItem.md) |  |  [optional]
**browserUrl** | **String** |  |  [optional]
**sizeId** | **String** |  |  [optional]
**ingressThroughputPerSec** | **String** |  |  [optional]
**egressThroughputPerSec** | **String** |  |  [optional]
**totalMaxConnections** | **Integer** |  |  [optional]
**maxPartitions** | **Integer** |  |  [optional]
**maxDataRetentionPeriod** | **String** |  |  [optional]
**maxConnectionAttemptsPerSec** | **Integer** |  |  [optional]
**billingCloudAccountId** | **String** |  |  [optional]
**marketplace** | **String** |  |  [optional]
**billingModel** | **String** |  |  [optional]



