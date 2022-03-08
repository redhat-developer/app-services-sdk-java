

# Partition

Kafka topic partition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**partition** | **Integer** | The partition id, unique among partitions of the same topic | 
**replicas** | [**List&lt;Node&gt;**](Node.md) | List of replicas for the partition |  [optional]
**isr** | [**List&lt;Node&gt;**](Node.md) | List in-sync replicas for this partition. |  [optional]
**leader** | [**Node**](Node.md) |  |  [optional]



