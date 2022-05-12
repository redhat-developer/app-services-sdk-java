

# SupportedKafkaSize

Supported Kafka Size

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of this Kafka instance size. |  [optional]
**ingressThroughputPerSec** | **SupportedKafkaSizeBytesValueItem** |  |  [optional]
**egressThroughputPerSec** | **SupportedKafkaSizeBytesValueItem** |  |  [optional]
**totalMaxConnections** | **Integer** | Maximum amount of total connections available to this Kafka instance size. |  [optional]
**maxDataRetentionSize** | **SupportedKafkaSizeBytesValueItem** |  |  [optional]
**maxPartitions** | **Integer** | Maximum amount of total partitions available to this Kafka instance size. |  [optional]
**maxDataRetentionPeriod** | **String** | Maximum data retention period available to this Kafka instance size. |  [optional]
**maxConnectionAttemptsPerSec** | **Integer** | Maximium connection attempts per second available to this Kafka instance size. |  [optional]
**quotaConsumed** | **Integer** | Quota consumed by this Kafka instance size. |  [optional]
**quotaType** | **String** | Quota type used by this Kafka instance size. |  [optional]
**capacityConsumed** | **Integer** | Data plane cluster capacity consumed by this Kafka instance size. |  [optional]



