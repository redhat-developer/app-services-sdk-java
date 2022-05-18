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
import com.openshift.cloud.api.kas.models.ObjectReference;
import com.openshift.cloud.api.kas.models.ServiceAccountListItemAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ServiceAccountListItem
 */
@JsonPropertyOrder({
  ServiceAccountListItem.JSON_PROPERTY_ID,
  ServiceAccountListItem.JSON_PROPERTY_KIND,
  ServiceAccountListItem.JSON_PROPERTY_HREF,
  ServiceAccountListItem.JSON_PROPERTY_CLIENT_ID,
  ServiceAccountListItem.JSON_PROPERTY_NAME,
  ServiceAccountListItem.JSON_PROPERTY_CREATED_BY,
  ServiceAccountListItem.JSON_PROPERTY_CREATED_AT,
  ServiceAccountListItem.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("ServiceAccountListItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceAccountListItem {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public ServiceAccountListItem() { 
  }

  public ServiceAccountListItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * server generated unique id of the service account
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "server generated unique id of the service account")
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


  public ServiceAccountListItem kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public ServiceAccountListItem href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHref() {
    return href;
  }


  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHref(String href) {
    this.href = href;
  }


  public ServiceAccountListItem clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * client id of the service account
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "client id of the service account")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public ServiceAccountListItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of the service account
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name of the service account")
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


  public ServiceAccountListItem createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * service account created by the user
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "service account created by the user")
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public ServiceAccountListItem createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * service account creation timestamp
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "service account creation timestamp")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ServiceAccountListItem description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * description of the service account
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "description of the service account")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAccountListItem serviceAccountListItem = (ServiceAccountListItem) o;
    return Objects.equals(this.id, serviceAccountListItem.id) &&
        Objects.equals(this.kind, serviceAccountListItem.kind) &&
        Objects.equals(this.href, serviceAccountListItem.href) &&
        Objects.equals(this.clientId, serviceAccountListItem.clientId) &&
        Objects.equals(this.name, serviceAccountListItem.name) &&
        Objects.equals(this.createdBy, serviceAccountListItem.createdBy) &&
        Objects.equals(this.createdAt, serviceAccountListItem.createdAt) &&
        Objects.equals(this.description, serviceAccountListItem.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, href, clientId, name, createdBy, createdAt, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAccountListItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

