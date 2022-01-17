

# ConnectorTypeAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the connector type. |  [optional]
**version** | **String** | Version of the connector type. |  [optional]
**channels** | **List&lt;String&gt;** | Channels of the connector type. |  [optional]
**description** | **String** | A description of the connector. |  [optional]
**iconHref** | **String** | URL to an icon of the connector. |  [optional]
**labels** | [**List&lt;LabelsEnum&gt;**](#List&lt;LabelsEnum&gt;) | Labels used to categorize the connector |  [optional]
**schema** | **Object** | A json schema that can be used to validate a connectors connector_spec field. |  [optional]
**jsonSchema** | **Object** | A json schema that can be used to validate a connectors connector_spec field. |  [optional]



## Enum: List&lt;LabelsEnum&gt;

Name | Value
---- | -----
SINK | &quot;sink&quot;
SOURCE | &quot;source&quot;



