

# CloudRegion

Description of a region of a cloud provider.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | Indicates the type of this object. Will be &#39;CloudRegion&#39;. |  [optional]
**id** | **String** | Unique identifier of the object. |  [optional]
**displayName** | **String** | Name of the region for display purposes, for example &#x60;N. Virginia&#x60;. |  [optional]
**enabled** | **Boolean** | Whether the region is enabled for deploying an OSD cluster. | 
**capacity** | [**List&lt;RegionCapacityListItem&gt;**](RegionCapacityListItem.md) | Indicates whether there is capacity left per instance type | 



