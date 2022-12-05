

# ConnectorNamespaceMeta


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**owner** | **String** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**modifiedAt** | **OffsetDateTime** |  |  [optional]
**name** | **String** | Namespace name must match pattern &#x60;^(([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9])?$&#x60;, or it may be empty to be auto-generated. |  [optional]
**annotations** | **Map&lt;String, String&gt;** | Name-value string annotations for resource |  [optional]
**resourceVersion** | **Long** |  |  [optional]
**quota** | [**ConnectorNamespaceQuota**](ConnectorNamespaceQuota.md) |  |  [optional]



