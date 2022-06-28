/*
 * Service Registry Management API
 * Service Registry Management API is a REST API for managing Service Registry instances. Service Registry is a datastore for event schemas and API designs, which is based on the open source Apicurio Registry project.
 *
 * The version of the OpenAPI document: 0.0.6
 * Contact: rhosak-eval-support@redhat.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.srs.models;

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
 * Schema for the service status response body
 */
@ApiModel(description = "Schema for the service status response body")
@JsonPropertyOrder({
  ServiceStatus.JSON_PROPERTY_MAX_INSTANCES_REACHED
})
@JsonTypeName("ServiceStatus")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceStatus {
  public static final String JSON_PROPERTY_MAX_INSTANCES_REACHED = "max_instances_reached";
  private Boolean maxInstancesReached;

  public ServiceStatus() { 
  }

  public ServiceStatus maxInstancesReached(Boolean maxInstancesReached) {
    
    this.maxInstancesReached = maxInstancesReached;
    return this;
  }

   /**
   * Boolean property indicating if the maximum number of total Registry instances have been reached, therefore creation of more instances should not be allowed.
   * @return maxInstancesReached
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean property indicating if the maximum number of total Registry instances have been reached, therefore creation of more instances should not be allowed.")
  @JsonProperty(JSON_PROPERTY_MAX_INSTANCES_REACHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMaxInstancesReached() {
    return maxInstancesReached;
  }


  @JsonProperty(JSON_PROPERTY_MAX_INSTANCES_REACHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxInstancesReached(Boolean maxInstancesReached) {
    this.maxInstancesReached = maxInstancesReached;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceStatus serviceStatus = (ServiceStatus) o;
    return Objects.equals(this.maxInstancesReached, serviceStatus.maxInstancesReached);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxInstancesReached);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceStatus {\n");
    sb.append("    maxInstancesReached: ").append(toIndentedString(maxInstancesReached)).append("\n");
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

