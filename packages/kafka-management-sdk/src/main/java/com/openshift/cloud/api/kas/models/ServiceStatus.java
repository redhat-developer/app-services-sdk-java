/*
 * Kafka Service Fleet Manager
 * Kafka Service Fleet Manager is a Rest API to manage Kafka instances.
 *
 * The version of the OpenAPI document: 1.2.0
 * 
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
import com.openshift.cloud.api.kas.models.ServiceStatusKafkas;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Schema for the service status response body
 */
@ApiModel(description = "Schema for the service status response body")
@JsonPropertyOrder({
  ServiceStatus.JSON_PROPERTY_KAFKAS
})
@JsonTypeName("ServiceStatus")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceStatus {
  public static final String JSON_PROPERTY_KAFKAS = "kafkas";
  private ServiceStatusKafkas kafkas;


  public ServiceStatus kafkas(ServiceStatusKafkas kafkas) {
    
    this.kafkas = kafkas;
    return this;
  }

   /**
   * Get kafkas
   * @return kafkas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KAFKAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceStatusKafkas getKafkas() {
    return kafkas;
  }


  @JsonProperty(JSON_PROPERTY_KAFKAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKafkas(ServiceStatusKafkas kafkas) {
    this.kafkas = kafkas;
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
    return Objects.equals(this.kafkas, serviceStatus.kafkas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kafkas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceStatus {\n");
    sb.append("    kafkas: ").append(toIndentedString(kafkas)).append("\n");
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

