

# Partition

Kafka topic partition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**partition** | **Integer** | The partition id, unique among partitions of the same topic | 
**replicas** | **List&lt;Object&gt;** | List of replicas for the partition |  [optional]
**isr** | **List&lt;Object&gt;** | List in-sync replicas for this partition. |  [optional]
**leader** | **Object** | Kafka server / broker. |  [optional]



