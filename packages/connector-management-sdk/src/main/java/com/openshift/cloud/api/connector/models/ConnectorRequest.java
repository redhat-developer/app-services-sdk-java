/*
 * Connector Management API
 * Connector Management API is a REST API to manage connectors.
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.connector.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.connector.models.Channel;
import com.openshift.cloud.api.connector.models.ConnectorConfiguration;
import com.openshift.cloud.api.connector.models.ConnectorDesiredState;
import com.openshift.cloud.api.connector.models.ConnectorRequestMeta;
import com.openshift.cloud.api.connector.models.KafkaConnectionSettings;
import com.openshift.cloud.api.connector.models.SchemaRegistryConnectionSettings;
import com.openshift.cloud.api.connector.models.ServiceAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ConnectorRequest
 */
@JsonPropertyOrder({
  ConnectorRequest.JSON_PROPERTY_NAME,
  ConnectorRequest.JSON_PROPERTY_CONNECTOR_TYPE_ID,
  ConnectorRequest.JSON_PROPERTY_NAMESPACE_ID,
  ConnectorRequest.JSON_PROPERTY_CHANNEL,
  ConnectorRequest.JSON_PROPERTY_DESIRED_STATE,
  ConnectorRequest.JSON_PROPERTY_KAFKA,
  ConnectorRequest.JSON_PROPERTY_SERVICE_ACCOUNT,
  ConnectorRequest.JSON_PROPERTY_SCHEMA_REGISTRY,
  ConnectorRequest.JSON_PROPERTY_CONNECTOR
})
@JsonTypeName("ConnectorRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CONNECTOR_TYPE_ID = "connector_type_id";
  private String connectorTypeId;

  public static final String JSON_PROPERTY_NAMESPACE_ID = "namespace_id";
  private String namespaceId;

  public static final String JSON_PROPERTY_CHANNEL = "channel";
  private Channel channel = Channel.STABLE;

  public static final String JSON_PROPERTY_DESIRED_STATE = "desired_state";
  private ConnectorDesiredState desiredState;

  public static final String JSON_PROPERTY_KAFKA = "kafka";
  private KafkaConnectionSettings kafka;

  public static final String JSON_PROPERTY_SERVICE_ACCOUNT = "service_account";
  private ServiceAccount serviceAccount;

  public static final String JSON_PROPERTY_SCHEMA_REGISTRY = "schema_registry";
  private SchemaRegistryConnectionSettings schemaRegistry;

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private Object connector;

  public ConnectorRequest() { 
  }

  public ConnectorRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ConnectorRequest connectorTypeId(String connectorTypeId) {
    
    this.connectorTypeId = connectorTypeId;
    return this;
  }

   /**
   * Get connectorTypeId
   * @return connectorTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public ConnectorRequest namespaceId(String namespaceId) {
    
    this.namespaceId = namespaceId;
    return this;
  }

   /**
   * Get namespaceId
   * @return namespaceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAMESPACE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNamespaceId() {
    return namespaceId;
  }


  @JsonProperty(JSON_PROPERTY_NAMESPACE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNamespaceId(String namespaceId) {
    this.namespaceId = namespaceId;
  }


  public ConnectorRequest channel(Channel channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Channel getChannel() {
    return channel;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannel(Channel channel) {
    this.channel = channel;
  }


  public ConnectorRequest desiredState(ConnectorDesiredState desiredState) {
    
    this.desiredState = desiredState;
    return this;
  }

   /**
   * Get desiredState
   * @return desiredState
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESIRED_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConnectorDesiredState getDesiredState() {
    return desiredState;
  }


  @JsonProperty(JSON_PROPERTY_DESIRED_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDesiredState(ConnectorDesiredState desiredState) {
    this.desiredState = desiredState;
  }


  public ConnectorRequest kafka(KafkaConnectionSettings kafka) {
    
    this.kafka = kafka;
    return this;
  }

   /**
   * Get kafka
   * @return kafka
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_KAFKA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KafkaConnectionSettings getKafka() {
    return kafka;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKafka(KafkaConnectionSettings kafka) {
    this.kafka = kafka;
  }


  public ConnectorRequest serviceAccount(ServiceAccount serviceAccount) {
    
    this.serviceAccount = serviceAccount;
    return this;
  }

   /**
   * Get serviceAccount
   * @return serviceAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ServiceAccount getServiceAccount() {
    return serviceAccount;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceAccount(ServiceAccount serviceAccount) {
    this.serviceAccount = serviceAccount;
  }


  public ConnectorRequest schemaRegistry(SchemaRegistryConnectionSettings schemaRegistry) {
    
    this.schemaRegistry = schemaRegistry;
    return this;
  }

   /**
   * Get schemaRegistry
   * @return schemaRegistry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEMA_REGISTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SchemaRegistryConnectionSettings getSchemaRegistry() {
    return schemaRegistry;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_REGISTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaRegistry(SchemaRegistryConnectionSettings schemaRegistry) {
    this.schemaRegistry = schemaRegistry;
  }


  public ConnectorRequest connector(Object connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * Get connector
   * @return connector
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorRequest connectorRequest = (ConnectorRequest) o;
    return Objects.equals(this.name, connectorRequest.name) &&
        Objects.equals(this.connectorTypeId, connectorRequest.connectorTypeId) &&
        Objects.equals(this.namespaceId, connectorRequest.namespaceId) &&
        Objects.equals(this.channel, connectorRequest.channel) &&
        Objects.equals(this.desiredState, connectorRequest.desiredState) &&
        Objects.equals(this.kafka, connectorRequest.kafka) &&
        Objects.equals(this.serviceAccount, connectorRequest.serviceAccount) &&
        Objects.equals(this.schemaRegistry, connectorRequest.schemaRegistry) &&
        Objects.equals(this.connector, connectorRequest.connector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, connectorTypeId, namespaceId, channel, desiredState, kafka, serviceAccount, schemaRegistry, connector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectorTypeId: ").append(toIndentedString(connectorTypeId)).append("\n");
    sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    desiredState: ").append(toIndentedString(desiredState)).append("\n");
    sb.append("    kafka: ").append(toIndentedString(kafka)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    schemaRegistry: ").append(toIndentedString(schemaRegistry)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
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

