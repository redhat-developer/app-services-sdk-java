/*
 * Service Registry Fleet Manager
 * Managed Service Registry cloud.redhat.com API Management API that lets you create new registry instances. Registry is a datastore for standard event schemas and API designs. Service Registry enables developers to manage and share the structure of their data using a REST interface. For example, client applications can dynamically push or pull the latest updates to or from the registry without needing to redeploy. Registry is an Managed version of upstream project called Apicurio Registry. Apicurio Registry also enables developers to create rules that govern how registry content can evolve over time. For example, this includes rules for content validation and version compatibility.
 *
 * The version of the OpenAPI document: 0.0.5
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
import com.openshift.cloud.api.srs.models.ObjectReferenceRest;
import com.openshift.cloud.api.srs.models.RegistryStatusValueRest;
import com.openshift.cloud.api.srs.models.RootTypeForRegistry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * RegistryRest
 */
@JsonPropertyOrder({
  RegistryRest.JSON_PROPERTY_ID,
  RegistryRest.JSON_PROPERTY_KIND,
  RegistryRest.JSON_PROPERTY_HREF,
  RegistryRest.JSON_PROPERTY_STATUS,
  RegistryRest.JSON_PROPERTY_REGISTRY_URL,
  RegistryRest.JSON_PROPERTY_NAME,
  RegistryRest.JSON_PROPERTY_REGISTRY_DEPLOYMENT_ID,
  RegistryRest.JSON_PROPERTY_OWNER
})
@JsonTypeName("RegistryRest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RegistryRest {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RegistryStatusValueRest status;

  public static final String JSON_PROPERTY_REGISTRY_URL = "registryUrl";
  private String registryUrl;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REGISTRY_DEPLOYMENT_ID = "registryDeploymentId";
  private Integer registryDeploymentId;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;


  public RegistryRest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
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


  public RegistryRest kind(String kind) {
    
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


  public RegistryRest href(String href) {
    
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


  public RegistryRest status(RegistryStatusValueRest status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RegistryStatusValueRest getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(RegistryStatusValueRest status) {
    this.status = status;
  }


  public RegistryRest registryUrl(String registryUrl) {
    
    this.registryUrl = registryUrl;
    return this;
  }

   /**
   * Get registryUrl
   * @return registryUrl
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REGISTRY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRegistryUrl() {
    return registryUrl;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegistryUrl(String registryUrl) {
    this.registryUrl = registryUrl;
  }


  public RegistryRest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * User-defined Registry name. Does not have to be unique.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User-defined Registry name. Does not have to be unique.")
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


  public RegistryRest registryDeploymentId(Integer registryDeploymentId) {
    
    this.registryDeploymentId = registryDeploymentId;
    return this;
  }

   /**
   * Identifier of a multi-tenant deployment, where this Service Registry instance resides.
   * @return registryDeploymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of a multi-tenant deployment, where this Service Registry instance resides.")
  @JsonProperty(JSON_PROPERTY_REGISTRY_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRegistryDeploymentId() {
    return registryDeploymentId;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRY_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistryDeploymentId(Integer registryDeploymentId) {
    this.registryDeploymentId = registryDeploymentId;
  }


  public RegistryRest owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Registry instance owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Registry instance owner")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(String owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryRest registryRest = (RegistryRest) o;
    return Objects.equals(this.id, registryRest.id) &&
        Objects.equals(this.kind, registryRest.kind) &&
        Objects.equals(this.href, registryRest.href) &&
        Objects.equals(this.status, registryRest.status) &&
        Objects.equals(this.registryUrl, registryRest.registryUrl) &&
        Objects.equals(this.name, registryRest.name) &&
        Objects.equals(this.registryDeploymentId, registryRest.registryDeploymentId) &&
        Objects.equals(this.owner, registryRest.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, href, status, registryUrl, name, registryDeploymentId, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryRest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    registryUrl: ").append(toIndentedString(registryUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    registryDeploymentId: ").append(toIndentedString(registryDeploymentId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

