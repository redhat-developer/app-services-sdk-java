

# TopicSettings

The settings that are applicable to this topic. This includes partitions, configuration information, and number of replicas.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numPartitions** | **Integer** | Number of partitions for this topic. If not specified, the default for new topics is &#x60;1&#x60;. Number of partitions may not be reduced when updating existing topics |  [optional]
**config** | [**List&lt;ConfigEntry&gt;**](ConfigEntry.md) | Topic configuration entries. |  [optional]



