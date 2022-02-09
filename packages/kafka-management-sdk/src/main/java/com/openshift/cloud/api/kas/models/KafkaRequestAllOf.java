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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * KafkaRequestAllOf
 */
@JsonPropertyOrder({
  KafkaRequestAllOf.JSON_PROPERTY_STATUS,
  KafkaRequestAllOf.JSON_PROPERTY_CLOUD_PROVIDER,
  KafkaRequestAllOf.JSON_PROPERTY_MULTI_AZ,
  KafkaRequestAllOf.JSON_PROPERTY_REGION,
  KafkaRequestAllOf.JSON_PROPERTY_OWNER,
  KafkaRequestAllOf.JSON_PROPERTY_NAME,
  KafkaRequestAllOf.JSON_PROPERTY_BOOTSTRAP_SERVER_HOST,
  KafkaRequestAllOf.JSON_PROPERTY_CREATED_AT,
  KafkaRequestAllOf.JSON_PROPERTY_UPDATED_AT,
  KafkaRequestAllOf.JSON_PROPERTY_FAILED_REASON,
  KafkaRequestAllOf.JSON_PROPERTY_VERSION,
  KafkaRequestAllOf.JSON_PROPERTY_INSTANCE_TYPE,
  KafkaRequestAllOf.JSON_PROPERTY_REAUTHENTICATION_ENABLED
})
@JsonTypeName("KafkaRequest_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KafkaRequestAllOf {
  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_CLOUD_PROVIDER = "cloud_provider";
  private String cloudProvider;

  public static final String JSON_PROPERTY_MULTI_AZ = "multi_az";
  private Boolean multiAz;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_BOOTSTRAP_SERVER_HOST = "bootstrap_server_host";
  private String bootstrapServerHost;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_FAILED_REASON = "failed_reason";
  private String failedReason;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_INSTANCE_TYPE = "instance_type";
  private String instanceType;

  public static final String JSON_PROPERTY_REAUTHENTICATION_ENABLED = "reauthentication_enabled";
  private Boolean reauthenticationEnabled;

  public KafkaRequestAllOf() { 
  }

  public KafkaRequestAllOf status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Values: [accepted, preparing, provisioning, ready, failed, deprovision, deleting] 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Values: [accepted, preparing, provisioning, ready, failed, deprovision, deleting] ")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public KafkaRequestAllOf cloudProvider(String cloudProvider) {
    
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * Name of Cloud used to deploy. For example AWS
   * @return cloudProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of Cloud used to deploy. For example AWS")
  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudProvider() {
    return cloudProvider;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudProvider(String cloudProvider) {
    this.cloudProvider = cloudProvider;
  }


  public KafkaRequestAllOf multiAz(Boolean multiAz) {
    
    this.multiAz = multiAz;
    return this;
  }

   /**
   * Get multiAz
   * @return multiAz
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MULTI_AZ)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getMultiAz() {
    return multiAz;
  }


  @JsonProperty(JSON_PROPERTY_MULTI_AZ)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMultiAz(Boolean multiAz) {
    this.multiAz = multiAz;
  }


  public KafkaRequestAllOf region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Values will be regions of specific cloud provider. For example: us-east-1 for AWS
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Values will be regions of specific cloud provider. For example: us-east-1 for AWS")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public KafkaRequestAllOf owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public KafkaRequestAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public KafkaRequestAllOf bootstrapServerHost(String bootstrapServerHost) {
    
    this.bootstrapServerHost = bootstrapServerHost;
    return this;
  }

   /**
   * Get bootstrapServerHost
   * @return bootstrapServerHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOOTSTRAP_SERVER_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBootstrapServerHost() {
    return bootstrapServerHost;
  }


  @JsonProperty(JSON_PROPERTY_BOOTSTRAP_SERVER_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBootstrapServerHost(String bootstrapServerHost) {
    this.bootstrapServerHost = bootstrapServerHost;
  }


  public KafkaRequestAllOf createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public KafkaRequestAllOf updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public KafkaRequestAllOf failedReason(String failedReason) {
    
    this.failedReason = failedReason;
    return this;
  }

   /**
   * Get failedReason
   * @return failedReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAILED_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailedReason() {
    return failedReason;
  }


  @JsonProperty(JSON_PROPERTY_FAILED_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedReason(String failedReason) {
    this.failedReason = failedReason;
  }


  public KafkaRequestAllOf version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public KafkaRequestAllOf instanceType(String instanceType) {
    
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public KafkaRequestAllOf reauthenticationEnabled(Boolean reauthenticationEnabled) {
    
    this.reauthenticationEnabled = reauthenticationEnabled;
    return this;
  }

   /**
   * Get reauthenticationEnabled
   * @return reauthenticationEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REAUTHENTICATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getReauthenticationEnabled() {
    return reauthenticationEnabled;
  }


  @JsonProperty(JSON_PROPERTY_REAUTHENTICATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReauthenticationEnabled(Boolean reauthenticationEnabled) {
    this.reauthenticationEnabled = reauthenticationEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaRequestAllOf kafkaRequestAllOf = (KafkaRequestAllOf) o;
    return Objects.equals(this.status, kafkaRequestAllOf.status) &&
        Objects.equals(this.cloudProvider, kafkaRequestAllOf.cloudProvider) &&
        Objects.equals(this.multiAz, kafkaRequestAllOf.multiAz) &&
        Objects.equals(this.region, kafkaRequestAllOf.region) &&
        Objects.equals(this.owner, kafkaRequestAllOf.owner) &&
        Objects.equals(this.name, kafkaRequestAllOf.name) &&
        Objects.equals(this.bootstrapServerHost, kafkaRequestAllOf.bootstrapServerHost) &&
        Objects.equals(this.createdAt, kafkaRequestAllOf.createdAt) &&
        Objects.equals(this.updatedAt, kafkaRequestAllOf.updatedAt) &&
        Objects.equals(this.failedReason, kafkaRequestAllOf.failedReason) &&
        Objects.equals(this.version, kafkaRequestAllOf.version) &&
        Objects.equals(this.instanceType, kafkaRequestAllOf.instanceType) &&
        Objects.equals(this.reauthenticationEnabled, kafkaRequestAllOf.reauthenticationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, cloudProvider, multiAz, region, owner, name, bootstrapServerHost, createdAt, updatedAt, failedReason, version, instanceType, reauthenticationEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KafkaRequestAllOf {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    multiAz: ").append(toIndentedString(multiAz)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bootstrapServerHost: ").append(toIndentedString(bootstrapServerHost)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    reauthenticationEnabled: ").append(toIndentedString(reauthenticationEnabled)).append("\n");
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

