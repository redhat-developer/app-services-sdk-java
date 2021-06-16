/*
 * Kafka Admin REST API
 * An API to provide REST endpoints for query Kafka for admin operations
 *
 * The version of the OpenAPI document: 0.1.0
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

/**
 * Kafka topic partition
 */
@ApiModel(description = "Kafka topic partition")
@JsonPropertyOrder({
  Partition.JSON_PROPERTY_ID,
  Partition.JSON_PROPERTY_REPLICAS,
  Partition.JSON_PROPERTY_ISR,
  Partition.JSON_PROPERTY_LEADER
})
@JsonTypeName("Partition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Partition {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_REPLICAS = "replicas";
  private List<Object> replicas = null;

  public static final String JSON_PROPERTY_ISR = "isr";
  private List<Object> isr = null;

  public static final String JSON_PROPERTY_LEADER = "leader";
  private Object leader;


  public Partition id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Uniquie id for the partition
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Uniquie id for the partition")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Integer id) {
    this.id = id;
  }


  public Partition replicas(List<Object> replicas) {
    
    this.replicas = replicas;
    return this;
  }

  public Partition addReplicasItem(Object replicasItem) {
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

  public List<Object> getReplicas() {
    return replicas;
  }


  @JsonProperty(JSON_PROPERTY_REPLICAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplicas(List<Object> replicas) {
    this.replicas = replicas;
  }


  public Partition isr(List<Object> isr) {
    
    this.isr = isr;
    return this;
  }

  public Partition addIsrItem(Object isrItem) {
    if (this.isr == null) {
      this.isr = new ArrayList<>();
    }
    this.isr.add(isrItem);
    return this;
  }

   /**
   * List isync-replicas for this partition.
   * @return isr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List isync-replicas for this partition.")
  @JsonProperty(JSON_PROPERTY_ISR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getIsr() {
    return isr;
  }


  @JsonProperty(JSON_PROPERTY_ISR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsr(List<Object> isr) {
    this.isr = isr;
  }


  public Partition leader(Object leader) {
    
    this.leader = leader;
    return this;
  }

   /**
   * Kafka server / broker.
   * @return leader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kafka server / broker.")
  @JsonProperty(JSON_PROPERTY_LEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getLeader() {
    return leader;
  }


  @JsonProperty(JSON_PROPERTY_LEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeader(Object leader) {
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
    return Objects.equals(this.id, partition.id) &&
        Objects.equals(this.replicas, partition.replicas) &&
        Objects.equals(this.isr, partition.isr) &&
        Objects.equals(this.leader, partition.leader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, replicas, isr, leader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Partition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

