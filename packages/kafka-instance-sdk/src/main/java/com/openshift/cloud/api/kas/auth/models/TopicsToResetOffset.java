/*
 * Kafka Instance API
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * The version of the OpenAPI document: 0.12.0
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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TopicsToResetOffset
 */
@JsonPropertyOrder({
  TopicsToResetOffset.JSON_PROPERTY_TOPIC,
  TopicsToResetOffset.JSON_PROPERTY_PARTITIONS
})
@JsonTypeName("TopicsToResetOffset")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TopicsToResetOffset {
  public static final String JSON_PROPERTY_TOPIC = "topic";
  private String topic;

  public static final String JSON_PROPERTY_PARTITIONS = "partitions";
  private List<Integer> partitions = null;

  public TopicsToResetOffset() { 
  }

  public TopicsToResetOffset topic(String topic) {
    
    this.topic = topic;
    return this;
  }

   /**
   * Get topic
   * @return topic
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTopic() {
    return topic;
  }


  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTopic(String topic) {
    this.topic = topic;
  }


  public TopicsToResetOffset partitions(List<Integer> partitions) {
    
    this.partitions = partitions;
    return this;
  }

  public TopicsToResetOffset addPartitionsItem(Integer partitionsItem) {
    if (this.partitions == null) {
      this.partitions = new ArrayList<>();
    }
    this.partitions.add(partitionsItem);
    return this;
  }

   /**
   * Get partitions
   * @return partitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getPartitions() {
    return partitions;
  }


  @JsonProperty(JSON_PROPERTY_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartitions(List<Integer> partitions) {
    this.partitions = partitions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicsToResetOffset topicsToResetOffset = (TopicsToResetOffset) o;
    return Objects.equals(this.topic, topicsToResetOffset.topic) &&
        Objects.equals(this.partitions, topicsToResetOffset.partitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic, partitions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicsToResetOffset {\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
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

