

# KafkaRequestAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Values: [accepted, preparing, provisioning, ready, failed, deprovision, deleting]  |  [optional]
**cloudProvider** | **String** | Name of Cloud used to deploy. For example AWS |  [optional]
**multiAz** | **Boolean** |  | 
**region** | **String** | Values will be regions of specific cloud provider. For example: us-east-1 for AWS |  [optional]
**owner** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**bootstrapServerHost** | **String** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**expiresAt** | **OffsetDateTime** |  |  [optional]
**updatedAt** | **OffsetDateTime** |  |  [optional]
**failedReason** | **String** |  |  [optional]
**version** | **String** |  |  [optional]
**instanceType** | **String** |  |  [optional]
**instanceTypeName** | **String** |  |  [optional]
**reauthenticationEnabled** | **Boolean** |  | 
**kafkaStorageSize** | **String** |  |  [optional]
**browserUrl** | **String** |  |  [optional]
**sizeId** | **String** |  |  [optional]
**ingressThroughputPerSec** | **String** |  |  [optional]
**egressThroughputPerSec** | **String** |  |  [optional]
**totalMaxConnections** | **Integer** |  |  [optional]
**maxPartitions** | **Integer** |  |  [optional]
**maxDataRetentionPeriod** | **String** |  |  [optional]
**maxConnectionAttemptsPerSec** | **Integer** |  |  [optional]



