

# Limits

List of limitations on used resources, that are applied on the current instance of Registry. Keys represent the resource type and are suffixed by the corresponding unit. Values are integers. Only non-negative values are allowed, with the exception of -1, which means that the limit is not applied.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxTotalSchemasCount** | **Long** |  |  [optional]
**maxSchemaSizeBytes** | **Long** |  |  [optional]
**maxArtifactsCount** | **Long** |  |  [optional]
**maxVersionsPerArtifactCount** | **Long** |  |  [optional]
**maxArtifactPropertiesCount** | **Long** |  |  [optional]
**maxPropertyKeySizeBytes** | **Long** |  |  [optional]
**maxPropertyValueSizeBytes** | **Long** |  |  [optional]
**maxArtifactLabelsCount** | **Long** |  |  [optional]
**maxLabelSizeBytes** | **Long** |  |  [optional]
**maxArtifactNameLengthChars** | **Long** |  |  [optional]
**maxArtifactDescriptionLengthChars** | **Long** |  |  [optional]
**maxRequestsPerSecondCount** | **Long** |  |  [optional]



