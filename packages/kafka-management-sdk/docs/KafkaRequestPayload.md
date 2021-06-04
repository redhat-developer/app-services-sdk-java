

# KafkaRequestPayload

Schema for the request body sent to /kafkas POST

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloudProvider** | **String** | The cloud provider where the Kafka cluster will be created in |  [optional]
**multiAz** | **Boolean** | Set this to true to configure the Kafka cluster to be multiAZ |  [optional]
**name** | **String** | The name of the Kafka cluster. It must consist of lower-case alphanumeric characters or &#39;-&#39;, start with an alphabetic character, and end with an alphanumeric character, and can not be longer than 32 characters. | 
**region** | **String** | The region where the Kafka cluster will be created in |  [optional]



