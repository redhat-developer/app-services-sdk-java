/*
 * Red Hat Openshift SmartEvents Fleet Manager V2
 * The API exposed by the fleet manager of the SmartEvents service.
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: openbridge-dev@redhat.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.smartevents.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.smartevents.models.ManagedResourceStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SourceConnectorResponse
 */
@JsonPropertyOrder({
  SourceConnectorResponse.JSON_PROPERTY_KIND,
  SourceConnectorResponse.JSON_PROPERTY_ID,
  SourceConnectorResponse.JSON_PROPERTY_NAME,
  SourceConnectorResponse.JSON_PROPERTY_HREF,
  SourceConnectorResponse.JSON_PROPERTY_SUBMITTED_AT,
  SourceConnectorResponse.JSON_PROPERTY_PUBLISHED_AT,
  SourceConnectorResponse.JSON_PROPERTY_MODIFIED_AT,
  SourceConnectorResponse.JSON_PROPERTY_STATUS,
  SourceConnectorResponse.JSON_PROPERTY_OWNER,
  SourceConnectorResponse.JSON_PROPERTY_CONNECTOR_TYPE_ID,
  SourceConnectorResponse.JSON_PROPERTY_CONNECTOR,
  SourceConnectorResponse.JSON_PROPERTY_STATUS_MESSAGE
})
@JsonTypeName("SourceConnectorResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SourceConnectorResponse {
  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_SUBMITTED_AT = "submitted_at";
  private OffsetDateTime submittedAt;

  public static final String JSON_PROPERTY_PUBLISHED_AT = "published_at";
  private OffsetDateTime publishedAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ManagedResourceStatus status;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_CONNECTOR_TYPE_ID = "connector_type_id";
  private String connectorTypeId;

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private Object connector;

  public static final String JSON_PROPERTY_STATUS_MESSAGE = "status_message";
  private String statusMessage;

  public SourceConnectorResponse() { 
  }

  public SourceConnectorResponse kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * The kind (type) of this resource
   * @return kind
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The kind (type) of this resource")
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


  public SourceConnectorResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of this resource
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique identifier of this resource")
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


  public SourceConnectorResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this resource
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "resourceName1", value = "The name of this resource")
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


  public SourceConnectorResponse href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * The URL of this resource, without the protocol
   * @return href
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "example.com/resource", required = true, value = "The URL of this resource, without the protocol")
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


  public SourceConnectorResponse submittedAt(OffsetDateTime submittedAt) {
    
    this.submittedAt = submittedAt;
    return this;
  }

   /**
   * Get submittedAt
   * @return submittedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022-03-10T12:15:50-04:00", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUBMITTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getSubmittedAt() {
    return submittedAt;
  }


  @JsonProperty(JSON_PROPERTY_SUBMITTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubmittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
  }


  public SourceConnectorResponse publishedAt(OffsetDateTime publishedAt) {
    
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * Get publishedAt
   * @return publishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-03-10T12:15:50-04:00", value = "")
  @JsonProperty(JSON_PROPERTY_PUBLISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }


  @JsonProperty(JSON_PROPERTY_PUBLISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }


  public SourceConnectorResponse modifiedAt(OffsetDateTime modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Get modifiedAt
   * @return modifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-03-10T12:15:50-04:00", value = "")
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  public SourceConnectorResponse status(ManagedResourceStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ManagedResourceStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(ManagedResourceStatus status) {
    this.status = status;
  }


  public SourceConnectorResponse owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * The user that owns this resource
   * @return owner
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "userName", required = true, value = "The user that owns this resource")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOwner(String owner) {
    this.owner = owner;
  }


  public SourceConnectorResponse connectorTypeId(String connectorTypeId) {
    
    this.connectorTypeId = connectorTypeId;
    return this;
  }

   /**
   * The connector type
   * @return connectorTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "slack_sink_0.1", required = true, value = "The connector type")
  @JsonProperty(JSON_PROPERTY_CONNECTOR_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConnectorTypeId() {
    return connectorTypeId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectorTypeId(String connectorTypeId) {
    this.connectorTypeId = connectorTypeId;
  }


  public SourceConnectorResponse connector(Object connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * The Connector configuration payload
   * @return connector
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Connector configuration payload")
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnector(Object connector) {
    this.connector = connector;
  }


  public SourceConnectorResponse statusMessage(String statusMessage) {
    
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * A detailed status message in case there is a problem with the connector
   * @return statusMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A detailed status message in case there is a problem with the connector")
  @JsonProperty(JSON_PROPERTY_STATUS_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusMessage() {
    return statusMessage;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceConnectorResponse sourceConnectorResponse = (SourceConnectorResponse) o;
    return Objects.equals(this.kind, sourceConnectorResponse.kind) &&
        Objects.equals(this.id, sourceConnectorResponse.id) &&
        Objects.equals(this.name, sourceConnectorResponse.name) &&
        Objects.equals(this.href, sourceConnectorResponse.href) &&
        Objects.equals(this.submittedAt, sourceConnectorResponse.submittedAt) &&
        Objects.equals(this.publishedAt, sourceConnectorResponse.publishedAt) &&
        Objects.equals(this.modifiedAt, sourceConnectorResponse.modifiedAt) &&
        Objects.equals(this.status, sourceConnectorResponse.status) &&
        Objects.equals(this.owner, sourceConnectorResponse.owner) &&
        Objects.equals(this.connectorTypeId, sourceConnectorResponse.connectorTypeId) &&
        Objects.equals(this.connector, sourceConnectorResponse.connector) &&
        Objects.equals(this.statusMessage, sourceConnectorResponse.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, id, name, href, submittedAt, publishedAt, modifiedAt, status, owner, connectorTypeId, connector, statusMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceConnectorResponse {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    connectorTypeId: ").append(toIndentedString(connectorTypeId)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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

