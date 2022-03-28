/*
 * Connector Service Fleet Manager
 * Connector Service Fleet Manager is a Rest API to manage connectors.
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.connector.models;

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
 * ConnectorNamespaceQuota
 */
@JsonPropertyOrder({
  ConnectorNamespaceQuota.JSON_PROPERTY_CONNECTORS,
  ConnectorNamespaceQuota.JSON_PROPERTY_MEMORY_REQUESTS,
  ConnectorNamespaceQuota.JSON_PROPERTY_MEMORY_LIMITS,
  ConnectorNamespaceQuota.JSON_PROPERTY_CPU_REQUESTS,
  ConnectorNamespaceQuota.JSON_PROPERTY_CPU_LIMITS
})
@JsonTypeName("ConnectorNamespaceQuota")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorNamespaceQuota {
  public static final String JSON_PROPERTY_CONNECTORS = "connectors";
  private Integer connectors;

  public static final String JSON_PROPERTY_MEMORY_REQUESTS = "memory_requests";
  private String memoryRequests;

  public static final String JSON_PROPERTY_MEMORY_LIMITS = "memory_limits";
  private String memoryLimits;

  public static final String JSON_PROPERTY_CPU_REQUESTS = "cpu_requests";
  private String cpuRequests;

  public static final String JSON_PROPERTY_CPU_LIMITS = "cpu_limits";
  private String cpuLimits;

  public ConnectorNamespaceQuota() { 
  }

  public ConnectorNamespaceQuota connectors(Integer connectors) {
    
    this.connectors = connectors;
    return this;
  }

   /**
   * Get connectors
   * @return connectors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConnectors() {
    return connectors;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectors(Integer connectors) {
    this.connectors = connectors;
  }


  public ConnectorNamespaceQuota memoryRequests(String memoryRequests) {
    
    this.memoryRequests = memoryRequests;
    return this;
  }

   /**
   * Memory quota for limits or requests
   * @return memoryRequests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Memory quota for limits or requests")
  @JsonProperty(JSON_PROPERTY_MEMORY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemoryRequests() {
    return memoryRequests;
  }


  @JsonProperty(JSON_PROPERTY_MEMORY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemoryRequests(String memoryRequests) {
    this.memoryRequests = memoryRequests;
  }


  public ConnectorNamespaceQuota memoryLimits(String memoryLimits) {
    
    this.memoryLimits = memoryLimits;
    return this;
  }

   /**
   * Memory quota for limits or requests
   * @return memoryLimits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Memory quota for limits or requests")
  @JsonProperty(JSON_PROPERTY_MEMORY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemoryLimits() {
    return memoryLimits;
  }


  @JsonProperty(JSON_PROPERTY_MEMORY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemoryLimits(String memoryLimits) {
    this.memoryLimits = memoryLimits;
  }


  public ConnectorNamespaceQuota cpuRequests(String cpuRequests) {
    
    this.cpuRequests = cpuRequests;
    return this;
  }

   /**
   * CPU quota for limits or requests
   * @return cpuRequests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CPU quota for limits or requests")
  @JsonProperty(JSON_PROPERTY_CPU_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCpuRequests() {
    return cpuRequests;
  }


  @JsonProperty(JSON_PROPERTY_CPU_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpuRequests(String cpuRequests) {
    this.cpuRequests = cpuRequests;
  }


  public ConnectorNamespaceQuota cpuLimits(String cpuLimits) {
    
    this.cpuLimits = cpuLimits;
    return this;
  }

   /**
   * CPU quota for limits or requests
   * @return cpuLimits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CPU quota for limits or requests")
  @JsonProperty(JSON_PROPERTY_CPU_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCpuLimits() {
    return cpuLimits;
  }


  @JsonProperty(JSON_PROPERTY_CPU_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpuLimits(String cpuLimits) {
    this.cpuLimits = cpuLimits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorNamespaceQuota connectorNamespaceQuota = (ConnectorNamespaceQuota) o;
    return Objects.equals(this.connectors, connectorNamespaceQuota.connectors) &&
        Objects.equals(this.memoryRequests, connectorNamespaceQuota.memoryRequests) &&
        Objects.equals(this.memoryLimits, connectorNamespaceQuota.memoryLimits) &&
        Objects.equals(this.cpuRequests, connectorNamespaceQuota.cpuRequests) &&
        Objects.equals(this.cpuLimits, connectorNamespaceQuota.cpuLimits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectors, memoryRequests, memoryLimits, cpuRequests, cpuLimits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorNamespaceQuota {\n");
    sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
    sb.append("    memoryRequests: ").append(toIndentedString(memoryRequests)).append("\n");
    sb.append("    memoryLimits: ").append(toIndentedString(memoryLimits)).append("\n");
    sb.append("    cpuRequests: ").append(toIndentedString(cpuRequests)).append("\n");
    sb.append("    cpuLimits: ").append(toIndentedString(cpuLimits)).append("\n");
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

