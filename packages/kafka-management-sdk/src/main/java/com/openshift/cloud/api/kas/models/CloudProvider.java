/*
 * Kafka Service Fleet Manager
 * Kafka Service Fleet Manager is a Rest API to manage Kafka instances.
 *
 * The version of the OpenAPI document: 1.8.0
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
 * Cloud provider.
 */
@ApiModel(description = "Cloud provider.")
@JsonPropertyOrder({
  CloudProvider.JSON_PROPERTY_KIND,
  CloudProvider.JSON_PROPERTY_ID,
  CloudProvider.JSON_PROPERTY_DISPLAY_NAME,
  CloudProvider.JSON_PROPERTY_NAME,
  CloudProvider.JSON_PROPERTY_ENABLED
})
@JsonTypeName("CloudProvider")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CloudProvider {
  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public CloudProvider() { 
  }

  public CloudProvider kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Indicates the type of this object. Will be &#39;CloudProvider&#39; link.
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the type of this object. Will be 'CloudProvider' link.")
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


  public CloudProvider id(String id) {
    
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


  public CloudProvider displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Name of the cloud provider for display purposes.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the cloud provider for display purposes.")
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


  public CloudProvider name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Human friendly identifier of the cloud provider, for example &#x60;aws&#x60;.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human friendly identifier of the cloud provider, for example `aws`.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public CloudProvider enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the cloud provider is enabled for deploying an OSD cluster.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the cloud provider is enabled for deploying an OSD cluster.")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudProvider cloudProvider = (CloudProvider) o;
    return Objects.equals(this.kind, cloudProvider.kind) &&
        Objects.equals(this.id, cloudProvider.id) &&
        Objects.equals(this.displayName, cloudProvider.displayName) &&
        Objects.equals(this.name, cloudProvider.name) &&
        Objects.equals(this.enabled, cloudProvider.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, displayName, name, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudProvider {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

