/*
 * Kafka Service Fleet Manager
 * Kafka Service Fleet Manager is a Rest API to manage Kafka instances.
 *
 * The version of the OpenAPI document: 1.7.0
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
import com.openshift.cloud.api.kas.models.RegionCapacityListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Description of a region of a cloud provider.
 */
@ApiModel(description = "Description of a region of a cloud provider.")
@JsonPropertyOrder({
  CloudRegion.JSON_PROPERTY_KIND,
  CloudRegion.JSON_PROPERTY_ID,
  CloudRegion.JSON_PROPERTY_DISPLAY_NAME,
  CloudRegion.JSON_PROPERTY_ENABLED,
  CloudRegion.JSON_PROPERTY_CAPACITY
})
@JsonTypeName("CloudRegion")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CloudRegion {
  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled = false;

  public static final String JSON_PROPERTY_CAPACITY = "capacity";
  private List<RegionCapacityListItem> capacity = new ArrayList<>();

  public CloudRegion() { 
  }

  public CloudRegion kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#39;CloudRegion&#39;.
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the type of this object. Will be 'CloudRegion'.")
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKind(String kind) {
    this.kind = kind;
  }


  public CloudRegion id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the object.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public CloudRegion displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Name of the region for display purposes, for example &#x60;N. Virginia&#x60;.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the region for display purposes, for example `N. Virginia`.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CloudRegion enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the region is enabled for deploying an OSD cluster.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the region is enabled for deploying an OSD cluster.")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public CloudRegion capacity(List<RegionCapacityListItem> capacity) {
    
    this.capacity = capacity;
    return this;
  }

  public CloudRegion addCapacityItem(RegionCapacityListItem capacityItem) {
    this.capacity.add(capacityItem);
    return this;
  }

   /**
   * Indicates whether there is capacity left per instance type
   * @return capacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether there is capacity left per instance type")
  @JsonProperty(JSON_PROPERTY_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RegionCapacityListItem> getCapacity() {
    return capacity;
  }


  @JsonProperty(JSON_PROPERTY_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCapacity(List<RegionCapacityListItem> capacity) {
    this.capacity = capacity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudRegion cloudRegion = (CloudRegion) o;
    return Objects.equals(this.kind, cloudRegion.kind) &&
        Objects.equals(this.id, cloudRegion.id) &&
        Objects.equals(this.displayName, cloudRegion.displayName) &&
        Objects.equals(this.enabled, cloudRegion.enabled) &&
        Objects.equals(this.capacity, cloudRegion.capacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, displayName, enabled, capacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudRegion {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
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

