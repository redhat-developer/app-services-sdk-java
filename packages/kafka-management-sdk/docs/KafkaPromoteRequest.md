

# KafkaPromoteRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**desiredKafkaBillingModel** | **String** | The desired Kafka billing model to promote the kafka instance to. Promotion is performed asynchronously. Accepted values: [&#39;marketplace&#39;, &#39;standard&#39;] | 
**desiredMarketplace** | **String** | The desired billing marketplace to promote the kafka instance to. Accepted values: [&#39;aws&#39;, &#39;rhm&#39;]. Only considered when desired_kafka_billing_model is &#39;marketplace&#39; |  [optional]
**desiredBillingCloudAccountId** | **String** | The desired Kafka billing cloud account ID to promote the kafka instance to. Only considered when desired_kafka_billing_model is &#39;marketplace&#39; |  [optional]



