

# KafkaRequestPayload

Schema for the request body sent to /kafkas POST

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloudProvider** | **String** | The cloud provider where the Kafka cluster will be created in |  [optional]
**name** | **String** | The name of the Kafka cluster. It must consist of lower-case alphanumeric characters or &#39;-&#39;, start with an alphabetic character, and end with an alphanumeric character, and can not be longer than 32 characters. | 
**region** | **String** | The region where the Kafka cluster will be created in |  [optional]
**reauthenticationEnabled** | **Boolean** | Whether connection reauthentication is enabled or not. If set to true, connection reauthentication on the Kafka instance will be required every 5 minutes. The default value is true |  [optional]
**plan** | **String** | kafka plan in a format of &lt;instance_type&gt;.&lt;size_id&gt; |  [optional]
**billingCloudAccountId** | **String** | cloud account id used to purchase the instance |  [optional]
**marketplace** | **String** | marketplace where the instance is purchased on |  [optional]
**billingModel** | **String** | billing model to use |  [optional]



