

# ConsumerGroup

A group of Kafka consumers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupId** | **String** | Unique identifier for the consumer group | 
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**consumers** | [**List&lt;Consumer&gt;**](Consumer.md) | The list of consumers associated with this consumer group | 



## Enum: StateEnum

Name | Value
---- | -----
STABLE | &quot;STABLE&quot;
DEAD | &quot;DEAD&quot;
EMPTY | &quot;EMPTY&quot;
COMPLETING_REBALANCE | &quot;COMPLETING_REBALANCE&quot;
PREPARING_REBALANCE | &quot;PREPARING_REBALANCE&quot;
UNKNOWN | &quot;UNKNOWN&quot;



