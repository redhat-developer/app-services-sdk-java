/*
 * Kafka Instance API
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * The version of the OpenAPI document: 0.14.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.auth.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.kas.auth.models.Consumer;
import com.openshift.cloud.api.kas.auth.models.ConsumerGroupMetrics;
import com.openshift.cloud.api.kas.auth.models.ConsumerGroupState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A group of Kafka consumers
 */
@ApiModel(description = "A group of Kafka consumers")
@JsonPropertyOrder({
  ConsumerGroupAllOf.JSON_PROPERTY_GROUP_ID,
  ConsumerGroupAllOf.JSON_PROPERTY_STATE,
  ConsumerGroupAllOf.JSON_PROPERTY_CONSUMERS,
  ConsumerGroupAllOf.JSON_PROPERTY_METRICS
})
@JsonTypeName("ConsumerGroup_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConsumerGroupAllOf {
  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private String groupId;

  public static final String JSON_PROPERTY_STATE = "state";
  private ConsumerGroupState state;

  public static final String JSON_PROPERTY_CONSUMERS = "consumers";
  private List<Consumer> consumers = new ArrayList<>();

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private ConsumerGroupMetrics metrics;

  public ConsumerGroupAllOf() { 
  }

  public ConsumerGroupAllOf groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Unique identifier for the consumer group
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier for the consumer group")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ConsumerGroupAllOf state(ConsumerGroupState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConsumerGroupState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(ConsumerGroupState state) {
    this.state = state;
  }


  public ConsumerGroupAllOf consumers(List<Consumer> consumers) {
    
    this.consumers = consumers;
    return this;
  }

  public ConsumerGroupAllOf addConsumersItem(Consumer consumersItem) {
    this.consumers.add(consumersItem);
    return this;
  }

   /**
   * The list of consumers associated with this consumer group
   * @return consumers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of consumers associated with this consumer group")
  @JsonProperty(JSON_PROPERTY_CONSUMERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Consumer> getConsumers() {
    return consumers;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConsumers(List<Consumer> consumers) {
    this.consumers = consumers;
  }


  public ConsumerGroupAllOf metrics(ConsumerGroupMetrics metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConsumerGroupMetrics getMetrics() {
    return metrics;
  }


  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetrics(ConsumerGroupMetrics metrics) {
    this.metrics = metrics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerGroupAllOf consumerGroupAllOf = (ConsumerGroupAllOf) o;
    return Objects.equals(this.groupId, consumerGroupAllOf.groupId) &&
        Objects.equals(this.state, consumerGroupAllOf.state) &&
        Objects.equals(this.consumers, consumerGroupAllOf.consumers) &&
        Objects.equals(this.metrics, consumerGroupAllOf.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, state, consumers, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerGroupAllOf {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    consumers: ").append(toIndentedString(consumers)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

