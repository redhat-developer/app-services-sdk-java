

# AclBinding

Represents a binding between a resource pattern and an access control entry

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**AclOperation**](AclOperation.md) |  | 
**patternType** | [**AclPatternType**](AclPatternType.md) |  | 
**permission** | [**AclPermissionType**](AclPermissionType.md) |  | 
**principal** | **String** | Identifies the user or service account to which an ACL entry is bound. The literal prefix value of &#x60;User:&#x60; is required. May be used to specify all users with value &#x60;User:*&#x60;. | 
**resourceName** | **String** |  | 
**resourceType** | [**AclResourceType**](AclResourceType.md) |  | 



