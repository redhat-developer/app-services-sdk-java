/*
 * Kafka Management API
 * Kafka Management API is a REST API to manage Kafka instances
 *
 * The version of the OpenAPI document: 1.13.0
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
import com.openshift.cloud.api.kas.models.ObjectReference;
import com.openshift.cloud.api.kas.models.VersionMetadataAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VersionMetadata
 */
@JsonPropertyOrder({
  VersionMetadata.JSON_PROPERTY_ID,
  VersionMetadata.JSON_PROPERTY_KIND,
  VersionMetadata.JSON_PROPERTY_HREF,
  VersionMetadata.JSON_PROPERTY_SERVER_VERSION,
  VersionMetadata.JSON_PROPERTY_COLLECTIONS
})
@JsonTypeName("VersionMetadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VersionMetadata {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_SERVER_VERSION = "server_version";
  private String serverVersion;

  public static final String JSON_PROPERTY_COLLECTIONS = "collections";
  private List<ObjectReference> collections = null;

  public VersionMetadata() { 
  }

  public VersionMetadata id(String id) {
    
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


  public VersionMetadata kind(String kind) {
    
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


  public VersionMetadata href(String href) {
    
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


  public VersionMetadata serverVersion(String serverVersion) {
    
    this.serverVersion = serverVersion;
    return this;
  }

   /**
   * Get serverVersion
   * @return serverVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerVersion() {
    return serverVersion;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerVersion(String serverVersion) {
    this.serverVersion = serverVersion;
  }


  public VersionMetadata collections(List<ObjectReference> collections) {
    
    this.collections = collections;
    return this;
  }

  public VersionMetadata addCollectionsItem(ObjectReference collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

   /**
   * Get collections
   * @return collections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ObjectReference> getCollections() {
    return collections;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollections(List<ObjectReference> collections) {
    this.collections = collections;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionMetadata versionMetadata = (VersionMetadata) o;
    return Objects.equals(this.id, versionMetadata.id) &&
        Objects.equals(this.kind, versionMetadata.kind) &&
        Objects.equals(this.href, versionMetadata.href) &&
        Objects.equals(this.serverVersion, versionMetadata.serverVersion) &&
        Objects.equals(this.collections, versionMetadata.collections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, href, serverVersion, collections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionMetadata {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    serverVersion: ").append(toIndentedString(serverVersion)).append("\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
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

