

# ConsumerGroup


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the object. Not supported for all object kinds. |  [optional]
**kind** | **String** |  |  [optional] [readonly]
**href** | **String** | Link path to request the object. Not supported for all object kinds. |  [optional]
**groupId** | **String** | Unique identifier for the consumer group | 
**state** | **ConsumerGroupState** |  |  [optional]
**consumers** | [**List&lt;Consumer&gt;**](Consumer.md) | The list of consumers associated with this consumer group | 
**metrics** | [**ConsumerGroupMetrics**](ConsumerGroupMetrics.md) |  |  [optional]



