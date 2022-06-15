

# ConsumerGroupResetOffsetParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offset** | **OffsetType** |  | 
**value** | **String** | Value associated with the given &#x60;offset&#x60;. Not used for &#x60;offset&#x60; values &#x60;earliest&#x60; and &#x60;latest&#x60;. When &#x60;offset&#x60; is &#x60;timestamp&#x60; then &#x60;value&#x60; must be a valid timestamp representing the point in time to reset the consumer group. When &#x60;offset&#x60; is &#x60;absolute&#x60; then &#x60;value&#x60; must be the integer offset to which the consumer group will be reset. |  [optional]
**topics** | [**List&lt;TopicsToResetOffset&gt;**](TopicsToResetOffset.md) |  |  [optional]



