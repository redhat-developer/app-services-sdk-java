

# AclBinding


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the object. Not supported for all object kinds. |  [optional]
**kind** | **String** |  |  [optional] [readonly]
**href** | **String** | Link path to request the object. Not supported for all object kinds. |  [optional]
**resourceType** | **AclResourceType** |  | 
**resourceName** | **String** |  | 
**patternType** | **AclPatternType** |  | 
**principal** | **String** | Identifies the user or service account to which an ACL entry is bound. The literal prefix value of &#x60;User:&#x60; is required. May be used to specify all users with value &#x60;User:*&#x60;. | 
**operation** | **AclOperation** |  | 
**permission** | **AclPermissionType** |  | 



