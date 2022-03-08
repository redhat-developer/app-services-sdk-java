

# Consumer

A Kafka consumer is responsible for reading records from one or more topics and one or more partitions of a topic.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **String** | Unique identifier for the consumer group to which this consumer belongs. | 
**topic** | **String** | The unique topic name to which this consumer belongs | 
**partition** | **Integer** | The partition number to which this consumer group is assigned to. | 
**offset** | **Long** | Offset denotes the position of the consumer in a partition. | 
**logEndOffset** | **Long** | The log end offset is the offset of the last message written to a log. |  [optional]
**lag** | **Long** | Offset Lag is the delta between the last produced message and the last consumer&#39;s committed offset. | 
**memberId** | **String** | The member ID is a unique identifier given to a consumer by the coordinator upon initially joining the group. |  [optional]



