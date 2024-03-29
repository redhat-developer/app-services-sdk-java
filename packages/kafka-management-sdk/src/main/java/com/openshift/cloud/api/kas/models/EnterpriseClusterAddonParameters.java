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
import com.openshift.cloud.api.kas.models.EnterpriseClusterFleetshardParameters;
import com.openshift.cloud.api.kas.models.FleetshardParameter;
import com.openshift.cloud.api.kas.models.ObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Enterprise Cluster get addon parameters response
 */
@ApiModel(description = "Enterprise Cluster get addon parameters response")
@JsonPropertyOrder({
  EnterpriseClusterAddonParameters.JSON_PROPERTY_ID,
  EnterpriseClusterAddonParameters.JSON_PROPERTY_KIND,
  EnterpriseClusterAddonParameters.JSON_PROPERTY_HREF,
  EnterpriseClusterAddonParameters.JSON_PROPERTY_FLEETSHARD_PARAMETERS
})
@JsonTypeName("EnterpriseClusterAddonParameters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnterpriseClusterAddonParameters {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_FLEETSHARD_PARAMETERS = "fleetshard_parameters";
  private List<FleetshardParameter> fleetshardParameters = null;

  public EnterpriseClusterAddonParameters() { 
  }

  public EnterpriseClusterAddonParameters id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public EnterpriseClusterAddonParameters kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKind(String kind) {
    this.kind = kind;
  }


  public EnterpriseClusterAddonParameters href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHref(String href) {
    this.href = href;
  }


  public EnterpriseClusterAddonParameters fleetshardParameters(List<FleetshardParameter> fleetshardParameters) {
    
    this.fleetshardParameters = fleetshardParameters;
    return this;
  }

  public EnterpriseClusterAddonParameters addFleetshardParametersItem(FleetshardParameter fleetshardParametersItem) {
    if (this.fleetshardParameters == null) {
      this.fleetshardParameters = new ArrayList<>();
    }
    this.fleetshardParameters.add(fleetshardParametersItem);
    return this;
  }

   /**
   * Enterprise Cluster fleetshard parameters array
   * @return fleetshardParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enterprise Cluster fleetshard parameters array")
  @JsonProperty(JSON_PROPERTY_FLEETSHARD_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FleetshardParameter> getFleetshardParameters() {
    return fleetshardParameters;
  }


  @JsonProperty(JSON_PROPERTY_FLEETSHARD_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFleetshardParameters(List<FleetshardParameter> fleetshardParameters) {
    this.fleetshardParameters = fleetshardParameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseClusterAddonParameters enterpriseClusterAddonParameters = (EnterpriseClusterAddonParameters) o;
    return Objects.equals(this.id, enterpriseClusterAddonParameters.id) &&
        Objects.equals(this.kind, enterpriseClusterAddonParameters.kind) &&
        Objects.equals(this.href, enterpriseClusterAddonParameters.href) &&
        Objects.equals(this.fleetshardParameters, enterpriseClusterAddonParameters.fleetshardParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, href, fleetshardParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseClusterAddonParameters {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    fleetshardParameters: ").append(toIndentedString(fleetshardParameters)).append("\n");
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

