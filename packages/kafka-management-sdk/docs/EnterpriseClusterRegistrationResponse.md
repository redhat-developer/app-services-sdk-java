

# EnterpriseClusterRegistrationResponse

Enterprise Cluster registration response. It returns additional privileged information compared to The information returned by EnterpriseCluster

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**kind** | **String** |  | 
**href** | **String** |  | 
**accessKafkasViaPrivateNetwork** | **Boolean** | Indicates whether Kafkas created on this data plane cluster have to be accessed via private network | 
**clusterId** | **String** | The OCM&#39;s cluster id of the registered Enterprise cluster. |  [optional]
**status** | **String** | The status of Enterprise cluster registration |  [optional]
**cloudProvider** | **String** | The cloud provider for this cluster. This valus will be used as the Kafka&#39;s cloud provider value when a Kafka is created on this cluster |  [optional]
**region** | **String** | The region of this cluster. This valus will be used as the Kafka&#39;s region value when a Kafka is created on this cluster |  [optional]
**multiAz** | **Boolean** | A flag indicating whether this cluster is available on multiple availability zones or not | 
**supportedInstanceTypes** | **SupportedKafkaInstanceTypesList** |  |  [optional]
**capacityInformation** | [**EnterpriseClusterAllOfCapacityInformation**](EnterpriseClusterAllOfCapacityInformation.md) |  |  [optional]
**fleetshardParameters** | [**List&lt;FleetshardParameter&gt;**](FleetshardParameter.md) | Enterprise Cluster fleetshard parameters array |  [optional]



