/*
 * Service Registry Fleet Manager
 * Managed Service Registry cloud.redhat.com API Management API that lets you create new registry instances. Registry is a datastore for standard event schemas and API designs. Service Registry enables developers to manage and share the structure of their data using a REST interface. For example, client applications can dynamically push or pull the latest updates to or from the registry without needing to redeploy. Registry is an Managed version of upstream project called Apicurio Registry. Apicurio Registry also enables developers to create rules that govern how registry content can evolve over time. For example, this includes rules for content validation and version compatibility.
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
import com.openshift.cloud.api.srs.models.ObjectReference;
import com.openshift.cloud.api.srs.models.RegistryInstanceTypeValue;
import com.openshift.cloud.api.srs.models.RegistryStatusValue;
import com.openshift.cloud.api.srs.models.RootTypeForRegistry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Registry
 */
@JsonPropertyOrder({
  Registry.JSON_PROPERTY_ID,
  Registry.JSON_PROPERTY_KIND,
  Registry.JSON_PROPERTY_HREF,
  Registry.JSON_PROPERTY_STATUS,
  Registry.JSON_PROPERTY_REGISTRY_URL,
  Registry.JSON_PROPERTY_BROWSER_URL,
  Registry.JSON_PROPERTY_NAME,
  Registry.JSON_PROPERTY_REGISTRY_DEPLOYMENT_ID,
  Registry.JSON_PROPERTY_OWNER,
  Registry.JSON_PROPERTY_DESCRIPTION,
  Registry.JSON_PROPERTY_CREATED_AT,
  Registry.JSON_PROPERTY_UPDATED_AT,
  Registry.JSON_PROPERTY_INSTANCE_TYPE
})
@JsonTypeName("Registry")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Registry {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RegistryStatusValue status;

  public static final String JSON_PROPERTY_REGISTRY_URL = "registryUrl";
  private String registryUrl;

  public static final String JSON_PROPERTY_BROWSER_URL = "browserUrl";
  private String browserUrl;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REGISTRY_DEPLOYMENT_ID = "registryDeploymentId";
  private Integer registryDeploymentId;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_INSTANCE_TYPE = "instance_type";
  private RegistryInstanceTypeValue instanceType;


  public Registry id(String id) {
    
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


  public Registry kind(String kind) {
    
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


  public Registry href(String href) {
    
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


  public Registry status(RegistryStatusValue status) {
    
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

  public RegistryStatusValue getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(RegistryStatusValue status) {
    this.status = status;
  }


  public Registry registryUrl(String registryUrl) {
    
    this.registryUrl = registryUrl;
    return this;
  }

   /**
   * Get registryUrl
   * @return registryUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGISTRY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistryUrl() {
    return registryUrl;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistryUrl(String registryUrl) {
    this.registryUrl = registryUrl;
  }


  public Registry browserUrl(String browserUrl) {
    
    this.browserUrl = browserUrl;
    return this;
  }

   /**
   * Get browserUrl
   * @return browserUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BROWSER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrowserUrl() {
    return browserUrl;
  }


  @JsonProperty(JSON_PROPERTY_BROWSER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrowserUrl(String browserUrl) {
    this.browserUrl = browserUrl;
  }


  public Registry name(String name) {
    
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


  public Registry registryDeploymentId(Integer registryDeploymentId) {
    
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


  public Registry owner(String owner) {
    
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


  public Registry description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the Registry instance.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the Registry instance.")
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


  public Registry createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 UTC timestamp.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "ISO 8601 UTC timestamp.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Registry updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 UTC timestamp.
   * @return updatedAt
  **/
  @ApiModelProperty(required = true, value = "ISO 8601 UTC timestamp.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Registry instanceType(RegistryInstanceTypeValue instanceType) {
    
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INSTANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RegistryInstanceTypeValue getInstanceType() {
    return instanceType;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstanceType(RegistryInstanceTypeValue instanceType) {
    this.instanceType = instanceType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Registry registry = (Registry) o;
    return Objects.equals(this.id, registry.id) &&
        Objects.equals(this.kind, registry.kind) &&
        Objects.equals(this.href, registry.href) &&
        Objects.equals(this.status, registry.status) &&
        Objects.equals(this.registryUrl, registry.registryUrl) &&
        Objects.equals(this.browserUrl, registry.browserUrl) &&
        Objects.equals(this.name, registry.name) &&
        Objects.equals(this.registryDeploymentId, registry.registryDeploymentId) &&
        Objects.equals(this.owner, registry.owner) &&
        Objects.equals(this.description, registry.description) &&
        Objects.equals(this.createdAt, registry.createdAt) &&
        Objects.equals(this.updatedAt, registry.updatedAt) &&
        Objects.equals(this.instanceType, registry.instanceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kind, href, status, registryUrl, browserUrl, name, registryDeploymentId, owner, description, createdAt, updatedAt, instanceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Registry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    registryUrl: ").append(toIndentedString(registryUrl)).append("\n");
    sb.append("    browserUrl: ").append(toIndentedString(browserUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    registryDeploymentId: ").append(toIndentedString(registryDeploymentId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
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

