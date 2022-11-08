

# SupportedKafkaSize

Supported Kafka Size

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of this Kafka instance size. |  [optional]
**displayName** | **String** | Display name of this Kafka instance size. |  [optional]
**ingressThroughputPerSec** | **SupportedKafkaSizeBytesValueItem** |  |  [optional]
**egressThroughputPerSec** | **SupportedKafkaSizeBytesValueItem** |  |  [optional]
**totalMaxConnections** | **Integer** | Maximum amount of total connections available to this Kafka instance size. |  [optional]
**maxDataRetentionSize** | **SupportedKafkaSizeBytesValueItem** |  |  [optional]
**maxPartitions** | **Integer** | Maximum amount of total partitions available to this Kafka instance size. |  [optional]
**maxDataRetentionPeriod** | **String** | Maximum data retention period available to this Kafka instance size. |  [optional]
**maxConnectionAttemptsPerSec** | **Integer** | Maximium connection attempts per second available to this Kafka instance size. |  [optional]
**maxMessageSize** | **SupportedKafkaSizeBytesValueItem** |  |  [optional]
**minInSyncReplicas** | **Integer** | Minimum number of in-sync replicas. |  [optional]
**replicationFactor** | **Integer** | Replication factor available to this Kafka instance size. |  [optional]
**supportedAzModes** | **List&lt;String&gt;** | List of Availability Zone modes that this Kafka instance size supports. The possible values are \&quot;single\&quot;, \&quot;multi\&quot;. |  [optional]
**lifespanSeconds** | **Integer** | The limit lifespan of the kafka instance in seconds. If not specified then the instance never expires. |  [optional]
**quotaConsumed** | **Integer** | Quota consumed by this Kafka instance size. |  [optional]
**capacityConsumed** | **Integer** | Data plane cluster capacity consumed by this Kafka instance size. |  [optional]
**maturityStatus** | **String** | Maturity level of the size. Can be \&quot;stable\&quot; or \&quot;preview\&quot;. |  [optional]



