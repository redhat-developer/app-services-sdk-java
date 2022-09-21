/*
 * Kafka Instance API
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * The version of the OpenAPI document: 0.13.0-SNAPSHOT
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
import com.openshift.cloud.api.kas.auth.models.Node;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Kafka topic partition
 */
@ApiModel(description = "Kafka topic partition")
@JsonPropertyOrder({
  Partition.JSON_PROPERTY_PARTITION,
  Partition.JSON_PROPERTY_REPLICAS,
  Partition.JSON_PROPERTY_ISR,
  Partition.JSON_PROPERTY_LEADER
})
@JsonTypeName("Partition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Partition {
  public static final String JSON_PROPERTY_PARTITION = "partition";
  private Integer partition;

  public static final String JSON_PROPERTY_REPLICAS = "replicas";
  private List<Node> replicas = null;

  public static final String JSON_PROPERTY_ISR = "isr";
  private List<Node> isr = null;

  public static final String JSON_PROPERTY_LEADER = "leader";
  private Node leader;

  public Partition() { 
  }

  public Partition partition(Integer partition) {
    
    this.partition = partition;
    return this;
  }

   /**
   * The partition id, unique among partitions of the same topic
   * @return partition
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The partition id, unique among partitions of the same topic")
  @JsonProperty(JSON_PROPERTY_PARTITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPartition() {
    return partition;
  }


  @JsonProperty(JSON_PROPERTY_PARTITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPartition(Integer partition) {
    this.partition = partition;
  }


  public Partition replicas(List<Node> replicas) {
    
    this.replicas = replicas;
    return this;
  }

  public Partition addReplicasItem(Node replicasItem) {
    if (this.replicas == null) {
      this.replicas = new ArrayList<>();
    }
    this.replicas.add(replicasItem);
    return this;
  }

   /**
   * List of replicas for the partition
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of replicas for the partition")
  @JsonProperty(JSON_PROPERTY_REPLICAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Node> getReplicas() {
    return replicas;
  }


  @JsonProperty(JSON_PROPERTY_REPLICAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplicas(List<Node> replicas) {
    this.replicas = replicas;
  }


  public Partition isr(List<Node> isr) {
    
    this.isr = isr;
    return this;
  }

  public Partition addIsrItem(Node isrItem) {
    if (this.isr == null) {
      this.isr = new ArrayList<>();
    }
    this.isr.add(isrItem);
    return this;
  }

   /**
   * List in-sync replicas for this partition.
   * @return isr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List in-sync replicas for this partition.")
  @JsonProperty(JSON_PROPERTY_ISR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Node> getIsr() {
    return isr;
  }


  @JsonProperty(JSON_PROPERTY_ISR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsr(List<Node> isr) {
    this.isr = isr;
  }


  public Partition leader(Node leader) {
    
    this.leader = leader;
    return this;
  }

   /**
   * Get leader
   * @return leader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Node getLeader() {
    return leader;
  }


  @JsonProperty(JSON_PROPERTY_LEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeader(Node leader) {
    this.leader = leader;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Partition partition = (Partition) o;
    return Objects.equals(this.partition, partition.partition) &&
        Objects.equals(this.replicas, partition.replicas) &&
        Objects.equals(this.isr, partition.isr) &&
        Objects.equals(this.leader, partition.leader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partition, replicas, isr, leader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Partition {\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    isr: ").append(toIndentedString(isr)).append("\n");
    sb.append("    leader: ").append(toIndentedString(leader)).append("\n");
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

