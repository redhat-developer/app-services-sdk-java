

# EnterpriseOsdClusterPayload

Schema for the request body sent to /clusters POST

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterId** | **String** | OSD cluster ID | 
**clusterExternalId** | **String** | external cluster ID. Can be obtained from the response JSON of ocm get /api/clusters_mgmt/v1/clusters/&lt;cluster_id&gt; | 
**clusterIngressDnsName** | **String** | dns name of the cluster. Can be obtained from the response JSON of the /api/clusters_mgmt/v1/clusters/&lt;cluster_id&gt;/ingresses (dns_name) | 



