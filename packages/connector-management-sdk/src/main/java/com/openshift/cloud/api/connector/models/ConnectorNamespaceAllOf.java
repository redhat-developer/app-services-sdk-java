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
import com.openshift.cloud.api.connector.models.ConnectorNamespaceStatus;
import com.openshift.cloud.api.connector.models.ConnectorNamespaceTenant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ConnectorNamespaceAllOf
 */
@JsonPropertyOrder({
  ConnectorNamespaceAllOf.JSON_PROPERTY_NAME,
  ConnectorNamespaceAllOf.JSON_PROPERTY_CLUSTER_ID,
  ConnectorNamespaceAllOf.JSON_PROPERTY_EXPIRATION,
  ConnectorNamespaceAllOf.JSON_PROPERTY_TENANT,
  ConnectorNamespaceAllOf.JSON_PROPERTY_STATUS
})
@JsonTypeName("ConnectorNamespace_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorNamespaceAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CLUSTER_ID = "cluster_id";
  private String clusterId;

  public static final String JSON_PROPERTY_EXPIRATION = "expiration";
  private String expiration;

  public static final String JSON_PROPERTY_TENANT = "tenant";
  private ConnectorNamespaceTenant tenant;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ConnectorNamespaceStatus status;

  public ConnectorNamespaceAllOf() { 
  }

  public ConnectorNamespaceAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ConnectorNamespaceAllOf clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClusterId() {
    return clusterId;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public ConnectorNamespaceAllOf expiration(String expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Namespace expiration timestamp in RFC 3339 format
   * @return expiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Namespace expiration timestamp in RFC 3339 format")
  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiration() {
    return expiration;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }


  public ConnectorNamespaceAllOf tenant(ConnectorNamespaceTenant tenant) {
    
    this.tenant = tenant;
    return this;
  }

   /**
   * Get tenant
   * @return tenant
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TENANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConnectorNamespaceTenant getTenant() {
    return tenant;
  }


  @JsonProperty(JSON_PROPERTY_TENANT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenant(ConnectorNamespaceTenant tenant) {
    this.tenant = tenant;
  }


  public ConnectorNamespaceAllOf status(ConnectorNamespaceStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConnectorNamespaceStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(ConnectorNamespaceStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorNamespaceAllOf connectorNamespaceAllOf = (ConnectorNamespaceAllOf) o;
    return Objects.equals(this.name, connectorNamespaceAllOf.name) &&
        Objects.equals(this.clusterId, connectorNamespaceAllOf.clusterId) &&
        Objects.equals(this.expiration, connectorNamespaceAllOf.expiration) &&
        Objects.equals(this.tenant, connectorNamespaceAllOf.tenant) &&
        Objects.equals(this.status, connectorNamespaceAllOf.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, clusterId, expiration, tenant, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorNamespaceAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
