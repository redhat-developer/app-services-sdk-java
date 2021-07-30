

# ConsumerGroupResetOffsetParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** |  |  [optional]
**offset** | [**OffsetEnum**](#OffsetEnum) |  | 
**topics** | [**List&lt;TopicsToResetOffset&gt;**](TopicsToResetOffset.md) |  |  [optional]



## Enum: OffsetEnum

Name | Value
---- | -----
TIMESTAMP | &quot;timestamp&quot;
ABSOLUTE | &quot;absolute&quot;
LATEST | &quot;latest&quot;
EARLIEST | &quot;earliest&quot;



