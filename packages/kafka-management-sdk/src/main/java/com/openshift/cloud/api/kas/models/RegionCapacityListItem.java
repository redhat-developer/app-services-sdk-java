/*
 * Kafka Service Fleet Manager
 * Kafka Service Fleet Manager is a Rest API to manage Kafka instances.
 *
 * The version of the OpenAPI document: 1.3.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * schema for a kafka instance type capacity in region
 */
@ApiModel(description = "schema for a kafka instance type capacity in region")
@JsonPropertyOrder({
  RegionCapacityListItem.JSON_PROPERTY_INSTANCE_TYPE,
  RegionCapacityListItem.JSON_PROPERTY_MAX_CAPACITY_REACHED
})
@JsonTypeName("RegionCapacityListItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RegionCapacityListItem {
  public static final String JSON_PROPERTY_INSTANCE_TYPE = "instance_type";
  private String instanceType;

  public static final String JSON_PROPERTY_MAX_CAPACITY_REACHED = "max_capacity_reached";
  private Boolean maxCapacityReached;

  public RegionCapacityListItem() { 
  }

  public RegionCapacityListItem instanceType(String instanceType) {
    
    this.instanceType = instanceType;
    return this;
  }

   /**
   * kafka instance type
   * @return instanceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "kafka instance type")
  @JsonProperty(JSON_PROPERTY_INSTANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstanceType() {
    return instanceType;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }


  public RegionCapacityListItem maxCapacityReached(Boolean maxCapacityReached) {
    
    this.maxCapacityReached = maxCapacityReached;
    return this;
  }

   /**
   * flag indicating whether the capacity for the instance type in the region is reached
   * @return maxCapacityReached
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "flag indicating whether the capacity for the instance type in the region is reached")
  @JsonProperty(JSON_PROPERTY_MAX_CAPACITY_REACHED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getMaxCapacityReached() {
    return maxCapacityReached;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CAPACITY_REACHED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxCapacityReached(Boolean maxCapacityReached) {
    this.maxCapacityReached = maxCapacityReached;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionCapacityListItem regionCapacityListItem = (RegionCapacityListItem) o;
    return Objects.equals(this.instanceType, regionCapacityListItem.instanceType) &&
        Objects.equals(this.maxCapacityReached, regionCapacityListItem.maxCapacityReached);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceType, maxCapacityReached);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionCapacityListItem {\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    maxCapacityReached: ").append(toIndentedString(maxCapacityReached)).append("\n");
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

