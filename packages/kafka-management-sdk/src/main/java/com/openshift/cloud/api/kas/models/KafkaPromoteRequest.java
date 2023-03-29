/*
 * Kafka Management API
 * Kafka Management API is a REST API to manage Kafka instances
 *
 * The version of the OpenAPI document: 1.16.0
 * Contact: rhosak-support@redhat.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * KafkaPromoteRequest
 */
@JsonPropertyOrder({
  KafkaPromoteRequest.JSON_PROPERTY_DESIRED_KAFKA_BILLING_MODEL,
  KafkaPromoteRequest.JSON_PROPERTY_DESIRED_MARKETPLACE,
  KafkaPromoteRequest.JSON_PROPERTY_DESIRED_BILLING_CLOUD_ACCOUNT_ID
})
@JsonTypeName("KafkaPromoteRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KafkaPromoteRequest {
  public static final String JSON_PROPERTY_DESIRED_KAFKA_BILLING_MODEL = "desired_kafka_billing_model";
  private String desiredKafkaBillingModel;

  public static final String JSON_PROPERTY_DESIRED_MARKETPLACE = "desired_marketplace";
  private String desiredMarketplace;

  public static final String JSON_PROPERTY_DESIRED_BILLING_CLOUD_ACCOUNT_ID = "desired_billing_cloud_account_id";
  private String desiredBillingCloudAccountId;

  public KafkaPromoteRequest() { 
  }

  public KafkaPromoteRequest desiredKafkaBillingModel(String desiredKafkaBillingModel) {
    
    this.desiredKafkaBillingModel = desiredKafkaBillingModel;
    return this;
  }

   /**
   * The desired Kafka billing model to promote the kafka instance to. Promotion is performed asynchronously. Accepted values: [&#39;marketplace&#39;, &#39;standard&#39;]
   * @return desiredKafkaBillingModel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The desired Kafka billing model to promote the kafka instance to. Promotion is performed asynchronously. Accepted values: ['marketplace', 'standard']")
  @JsonProperty(JSON_PROPERTY_DESIRED_KAFKA_BILLING_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDesiredKafkaBillingModel() {
    return desiredKafkaBillingModel;
  }


  @JsonProperty(JSON_PROPERTY_DESIRED_KAFKA_BILLING_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDesiredKafkaBillingModel(String desiredKafkaBillingModel) {
    this.desiredKafkaBillingModel = desiredKafkaBillingModel;
  }


  public KafkaPromoteRequest desiredMarketplace(String desiredMarketplace) {
    
    this.desiredMarketplace = desiredMarketplace;
    return this;
  }

   /**
   * The desired billing marketplace to promote the kafka instance to. Accepted values: [&#39;aws&#39;, &#39;rhm&#39;]. Only considered when desired_kafka_billing_model is &#39;marketplace&#39;
   * @return desiredMarketplace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The desired billing marketplace to promote the kafka instance to. Accepted values: ['aws', 'rhm']. Only considered when desired_kafka_billing_model is 'marketplace'")
  @JsonProperty(JSON_PROPERTY_DESIRED_MARKETPLACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesiredMarketplace() {
    return desiredMarketplace;
  }


  @JsonProperty(JSON_PROPERTY_DESIRED_MARKETPLACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesiredMarketplace(String desiredMarketplace) {
    this.desiredMarketplace = desiredMarketplace;
  }


  public KafkaPromoteRequest desiredBillingCloudAccountId(String desiredBillingCloudAccountId) {
    
    this.desiredBillingCloudAccountId = desiredBillingCloudAccountId;
    return this;
  }

   /**
   * The desired Kafka billing cloud account ID to promote the kafka instance to. Only considered when desired_kafka_billing_model is &#39;marketplace&#39;
   * @return desiredBillingCloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The desired Kafka billing cloud account ID to promote the kafka instance to. Only considered when desired_kafka_billing_model is 'marketplace'")
  @JsonProperty(JSON_PROPERTY_DESIRED_BILLING_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDesiredBillingCloudAccountId() {
    return desiredBillingCloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_DESIRED_BILLING_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesiredBillingCloudAccountId(String desiredBillingCloudAccountId) {
    this.desiredBillingCloudAccountId = desiredBillingCloudAccountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaPromoteRequest kafkaPromoteRequest = (KafkaPromoteRequest) o;
    return Objects.equals(this.desiredKafkaBillingModel, kafkaPromoteRequest.desiredKafkaBillingModel) &&
        Objects.equals(this.desiredMarketplace, kafkaPromoteRequest.desiredMarketplace) &&
        Objects.equals(this.desiredBillingCloudAccountId, kafkaPromoteRequest.desiredBillingCloudAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desiredKafkaBillingModel, desiredMarketplace, desiredBillingCloudAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaPromoteRequest {\n");
    sb.append("    desiredKafkaBillingModel: ").append(toIndentedString(desiredKafkaBillingModel)).append("\n");
    sb.append("    desiredMarketplace: ").append(toIndentedString(desiredMarketplace)).append("\n");
    sb.append("    desiredBillingCloudAccountId: ").append(toIndentedString(desiredBillingCloudAccountId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

