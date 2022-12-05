

# ConnectorNamespace

A connector namespace

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**kind** | **String** |  |  [optional]
**href** | **String** |  |  [optional]
**owner** | **String** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**modifiedAt** | **OffsetDateTime** |  |  [optional]
**name** | **String** |  | 
**annotations** | **Map&lt;String, String&gt;** | Name-value string annotations for resource |  [optional]
**resourceVersion** | **Long** |  | 
**quota** | [**ConnectorNamespaceQuota**](ConnectorNamespaceQuota.md) |  |  [optional]
**clusterId** | **String** |  | 
**expiration** | **String** | Namespace expiration timestamp in RFC 3339 format |  [optional]
**tenant** | [**ConnectorNamespaceTenant**](ConnectorNamespaceTenant.md) |  | 
**status** | [**ConnectorNamespaceStatus**](ConnectorNamespaceStatus.md) |  | 



