/*
 * Kafka Instance API
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * The version of the OpenAPI document: 0.12.2
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ConsumerGroupMetrics
 */
@JsonPropertyOrder({
  ConsumerGroupMetrics.JSON_PROPERTY_LAGGING_PARTITIONS,
  ConsumerGroupMetrics.JSON_PROPERTY_ACTIVE_CONSUMERS,
  ConsumerGroupMetrics.JSON_PROPERTY_UNASSIGNED_PARTITIONS
})
@JsonTypeName("ConsumerGroupMetrics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConsumerGroupMetrics {
  public static final String JSON_PROPERTY_LAGGING_PARTITIONS = "laggingPartitions";
  private Integer laggingPartitions;

  public static final String JSON_PROPERTY_ACTIVE_CONSUMERS = "activeConsumers";
  private Integer activeConsumers;

  public static final String JSON_PROPERTY_UNASSIGNED_PARTITIONS = "unassignedPartitions";
  private Integer unassignedPartitions;

  public ConsumerGroupMetrics() { 
  }

  public ConsumerGroupMetrics laggingPartitions(Integer laggingPartitions) {
    
    this.laggingPartitions = laggingPartitions;
    return this;
  }

   /**
   * Get laggingPartitions
   * @return laggingPartitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAGGING_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLaggingPartitions() {
    return laggingPartitions;
  }


  @JsonProperty(JSON_PROPERTY_LAGGING_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLaggingPartitions(Integer laggingPartitions) {
    this.laggingPartitions = laggingPartitions;
  }


  public ConsumerGroupMetrics activeConsumers(Integer activeConsumers) {
    
    this.activeConsumers = activeConsumers;
    return this;
  }

   /**
   * Get activeConsumers
   * @return activeConsumers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVE_CONSUMERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getActiveConsumers() {
    return activeConsumers;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_CONSUMERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveConsumers(Integer activeConsumers) {
    this.activeConsumers = activeConsumers;
  }


  public ConsumerGroupMetrics unassignedPartitions(Integer unassignedPartitions) {
    
    this.unassignedPartitions = unassignedPartitions;
    return this;
  }

   /**
   * Get unassignedPartitions
   * @return unassignedPartitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNASSIGNED_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUnassignedPartitions() {
    return unassignedPartitions;
  }


  @JsonProperty(JSON_PROPERTY_UNASSIGNED_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnassignedPartitions(Integer unassignedPartitions) {
    this.unassignedPartitions = unassignedPartitions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerGroupMetrics consumerGroupMetrics = (ConsumerGroupMetrics) o;
    return Objects.equals(this.laggingPartitions, consumerGroupMetrics.laggingPartitions) &&
        Objects.equals(this.activeConsumers, consumerGroupMetrics.activeConsumers) &&
        Objects.equals(this.unassignedPartitions, consumerGroupMetrics.unassignedPartitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(laggingPartitions, activeConsumers, unassignedPartitions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerGroupMetrics {\n");
    sb.append("    laggingPartitions: ").append(toIndentedString(laggingPartitions)).append("\n");
    sb.append("    activeConsumers: ").append(toIndentedString(activeConsumers)).append("\n");
    sb.append("    unassignedPartitions: ").append(toIndentedString(unassignedPartitions)).append("\n");
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

