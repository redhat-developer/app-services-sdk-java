/*
 * Kafka Admin REST API
 * An API to provide REST endpoints for query Kafka for admin operations
 *
 * The version of the OpenAPI document: 0.11.1
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
 * ConsumerGroupResetOffsetResultItem
 */
@JsonPropertyOrder({
  ConsumerGroupResetOffsetResultItem.JSON_PROPERTY_TOPIC,
  ConsumerGroupResetOffsetResultItem.JSON_PROPERTY_PARTITION,
  ConsumerGroupResetOffsetResultItem.JSON_PROPERTY_OFFSET
})
@JsonTypeName("ConsumerGroupResetOffsetResultItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConsumerGroupResetOffsetResultItem {
  public static final String JSON_PROPERTY_TOPIC = "topic";
  private String topic;

  public static final String JSON_PROPERTY_PARTITION = "partition";
  private Integer partition;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Long offset;

  public ConsumerGroupResetOffsetResultItem() { 
  }

  public ConsumerGroupResetOffsetResultItem topic(String topic) {
    
    this.topic = topic;
    return this;
  }

   /**
   * Get topic
   * @return topic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTopic() {
    return topic;
  }


  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopic(String topic) {
    this.topic = topic;
  }


  public ConsumerGroupResetOffsetResultItem partition(Integer partition) {
    
    this.partition = partition;
    return this;
  }

   /**
   * Get partition
   * @return partition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARTITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPartition() {
    return partition;
  }


  @JsonProperty(JSON_PROPERTY_PARTITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartition(Integer partition) {
    this.partition = partition;
  }


  public ConsumerGroupResetOffsetResultItem offset(Long offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOffset() {
    return offset;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffset(Long offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerGroupResetOffsetResultItem consumerGroupResetOffsetResultItem = (ConsumerGroupResetOffsetResultItem) o;
    return Objects.equals(this.topic, consumerGroupResetOffsetResultItem.topic) &&
        Objects.equals(this.partition, consumerGroupResetOffsetResultItem.partition) &&
        Objects.equals(this.offset, consumerGroupResetOffsetResultItem.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic, partition, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerGroupResetOffsetResultItem {\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

