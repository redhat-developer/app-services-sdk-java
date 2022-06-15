

# RecordAllOf

An individual record consumed from a topic or produced to a topic

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**partition** | **Integer** | The record&#39;s partition within the topic |  [optional]
**offset** | **Long** | The record&#39;s offset within the topic partition |  [optional] [readonly]
**timestamp** | **OffsetDateTime** | Timestamp associated with the record. The type is indicated by &#x60;timestampType&#x60;. When producing a record, this value will be used as the record&#39;s &#x60;CREATE_TIME&#x60;. |  [optional]
**timestampType** | **String** | Type of timestamp associated with the record |  [optional] [readonly]
**headers** | **Map&lt;String, String&gt;** | Record headers, key/value pairs |  [optional]
**key** | **String** | Record key |  [optional]
**value** | **String** | Record value | 



