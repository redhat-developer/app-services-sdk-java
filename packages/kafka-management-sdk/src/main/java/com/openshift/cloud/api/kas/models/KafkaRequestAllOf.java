/*
 * Kafka Management API
 * Kafka Management API is a REST API to manage Kafka instances
 *
 * The version of the OpenAPI document: 1.15.0
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
import com.openshift.cloud.api.kas.models.SupportedKafkaSizeBytesValueItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
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
  KafkaRequestAllOf.JSON_PROPERTY_ADMIN_API_SERVER_URL,
  KafkaRequestAllOf.JSON_PROPERTY_CREATED_AT,
  KafkaRequestAllOf.JSON_PROPERTY_EXPIRES_AT,
  KafkaRequestAllOf.JSON_PROPERTY_UPDATED_AT,
  KafkaRequestAllOf.JSON_PROPERTY_FAILED_REASON,
  KafkaRequestAllOf.JSON_PROPERTY_VERSION,
  KafkaRequestAllOf.JSON_PROPERTY_INSTANCE_TYPE,
  KafkaRequestAllOf.JSON_PROPERTY_REAUTHENTICATION_ENABLED,
  KafkaRequestAllOf.JSON_PROPERTY_MAX_DATA_RETENTION_SIZE,
  KafkaRequestAllOf.JSON_PROPERTY_BROWSER_URL,
  KafkaRequestAllOf.JSON_PROPERTY_SIZE_ID,
  KafkaRequestAllOf.JSON_PROPERTY_BILLING_CLOUD_ACCOUNT_ID,
  KafkaRequestAllOf.JSON_PROPERTY_MARKETPLACE,
  KafkaRequestAllOf.JSON_PROPERTY_BILLING_MODEL,
  KafkaRequestAllOf.JSON_PROPERTY_PROMOTION_STATUS,
  KafkaRequestAllOf.JSON_PROPERTY_PROMOTION_DETAILS
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

  public static final String JSON_PROPERTY_ADMIN_API_SERVER_URL = "admin_api_server_url";
  private String adminApiServerUrl;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EXPIRES_AT = "expires_at";
  private JsonNullable<OffsetDateTime> expiresAt = JsonNullable.<OffsetDateTime>undefined();

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

  public static final String JSON_PROPERTY_MAX_DATA_RETENTION_SIZE = "max_data_retention_size";
  private SupportedKafkaSizeBytesValueItem maxDataRetentionSize;

  public static final String JSON_PROPERTY_BROWSER_URL = "browser_url";
  private String browserUrl;

  public static final String JSON_PROPERTY_SIZE_ID = "size_id";
  private String sizeId;

  public static final String JSON_PROPERTY_BILLING_CLOUD_ACCOUNT_ID = "billing_cloud_account_id";
  private String billingCloudAccountId;

  public static final String JSON_PROPERTY_MARKETPLACE = "marketplace";
  private String marketplace;

  public static final String JSON_PROPERTY_BILLING_MODEL = "billing_model";
  private String billingModel;

  public static final String JSON_PROPERTY_PROMOTION_STATUS = "promotion_status";
  private String promotionStatus;

  public static final String JSON_PROPERTY_PROMOTION_DETAILS = "promotion_details";
  private String promotionDetails;

  public KafkaRequestAllOf() { 
  }

  public KafkaRequestAllOf status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Values: [accepted, preparing, provisioning, ready, failed, deprovision, deleting, suspending, suspended, resuming] 
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Values: [accepted, preparing, provisioning, ready, failed, deprovision, deleting, suspending, suspended, resuming] ")
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


  public KafkaRequestAllOf adminApiServerUrl(String adminApiServerUrl) {
    
    this.adminApiServerUrl = adminApiServerUrl;
    return this;
  }

   /**
   * The kafka admin server url to perform kafka admin operations e.g acl management etc. The value will be available when the Kafka has been fully provisioned i.e it reaches a &#39;ready&#39; state
   * @return adminApiServerUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The kafka admin server url to perform kafka admin operations e.g acl management etc. The value will be available when the Kafka has been fully provisioned i.e it reaches a 'ready' state")
  @JsonProperty(JSON_PROPERTY_ADMIN_API_SERVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdminApiServerUrl() {
    return adminApiServerUrl;
  }


  @JsonProperty(JSON_PROPERTY_ADMIN_API_SERVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdminApiServerUrl(String adminApiServerUrl) {
    this.adminApiServerUrl = adminApiServerUrl;
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


  public KafkaRequestAllOf expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = JsonNullable.<OffsetDateTime>of(expiresAt);
    
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getExpiresAt() {
        return expiresAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getExpiresAt_JsonNullable() {
    return expiresAt;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRES_AT)
  public void setExpiresAt_JsonNullable(JsonNullable<OffsetDateTime> expiresAt) {
    this.expiresAt = expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = JsonNullable.<OffsetDateTime>of(expiresAt);
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


  public KafkaRequestAllOf maxDataRetentionSize(SupportedKafkaSizeBytesValueItem maxDataRetentionSize) {
    
    this.maxDataRetentionSize = maxDataRetentionSize;
    return this;
  }

   /**
   * Get maxDataRetentionSize
   * @return maxDataRetentionSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_DATA_RETENTION_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SupportedKafkaSizeBytesValueItem getMaxDataRetentionSize() {
    return maxDataRetentionSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_DATA_RETENTION_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxDataRetentionSize(SupportedKafkaSizeBytesValueItem maxDataRetentionSize) {
    this.maxDataRetentionSize = maxDataRetentionSize;
  }


  public KafkaRequestAllOf browserUrl(String browserUrl) {
    
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


  public KafkaRequestAllOf sizeId(String sizeId) {
    
    this.sizeId = sizeId;
    return this;
  }

   /**
   * Get sizeId
   * @return sizeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIZE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSizeId() {
    return sizeId;
  }


  @JsonProperty(JSON_PROPERTY_SIZE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSizeId(String sizeId) {
    this.sizeId = sizeId;
  }


  public KafkaRequestAllOf billingCloudAccountId(String billingCloudAccountId) {
    
    this.billingCloudAccountId = billingCloudAccountId;
    return this;
  }

   /**
   * Get billingCloudAccountId
   * @return billingCloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingCloudAccountId() {
    return billingCloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingCloudAccountId(String billingCloudAccountId) {
    this.billingCloudAccountId = billingCloudAccountId;
  }


  public KafkaRequestAllOf marketplace(String marketplace) {
    
    this.marketplace = marketplace;
    return this;
  }

   /**
   * Get marketplace
   * @return marketplace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKETPLACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarketplace() {
    return marketplace;
  }


  @JsonProperty(JSON_PROPERTY_MARKETPLACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketplace(String marketplace) {
    this.marketplace = marketplace;
  }


  public KafkaRequestAllOf billingModel(String billingModel) {
    
    this.billingModel = billingModel;
    return this;
  }

   /**
   * Get billingModel
   * @return billingModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingModel() {
    return billingModel;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingModel(String billingModel) {
    this.billingModel = billingModel;
  }


  public KafkaRequestAllOf promotionStatus(String promotionStatus) {
    
    this.promotionStatus = promotionStatus;
    return this;
  }

   /**
   * Status of the Kafka request promotion. Possible values: [&#39;promoting&#39;, &#39;failed&#39;]. If unset it means no promotion is in progress.
   * @return promotionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the Kafka request promotion. Possible values: ['promoting', 'failed']. If unset it means no promotion is in progress.")
  @JsonProperty(JSON_PROPERTY_PROMOTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPromotionStatus() {
    return promotionStatus;
  }


  @JsonProperty(JSON_PROPERTY_PROMOTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPromotionStatus(String promotionStatus) {
    this.promotionStatus = promotionStatus;
  }


  public KafkaRequestAllOf promotionDetails(String promotionDetails) {
    
    this.promotionDetails = promotionDetails;
    return this;
  }

   /**
   * Details of the Kafka request promotion. It can be set when a Kafka request promotion is in progress or has failed
   * @return promotionDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the Kafka request promotion. It can be set when a Kafka request promotion is in progress or has failed")
  @JsonProperty(JSON_PROPERTY_PROMOTION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPromotionDetails() {
    return promotionDetails;
  }


  @JsonProperty(JSON_PROPERTY_PROMOTION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPromotionDetails(String promotionDetails) {
    this.promotionDetails = promotionDetails;
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
        Objects.equals(this.adminApiServerUrl, kafkaRequestAllOf.adminApiServerUrl) &&
        Objects.equals(this.createdAt, kafkaRequestAllOf.createdAt) &&
        equalsNullable(this.expiresAt, kafkaRequestAllOf.expiresAt) &&
        Objects.equals(this.updatedAt, kafkaRequestAllOf.updatedAt) &&
        Objects.equals(this.failedReason, kafkaRequestAllOf.failedReason) &&
        Objects.equals(this.version, kafkaRequestAllOf.version) &&
        Objects.equals(this.instanceType, kafkaRequestAllOf.instanceType) &&
        Objects.equals(this.reauthenticationEnabled, kafkaRequestAllOf.reauthenticationEnabled) &&
        Objects.equals(this.maxDataRetentionSize, kafkaRequestAllOf.maxDataRetentionSize) &&
        Objects.equals(this.browserUrl, kafkaRequestAllOf.browserUrl) &&
        Objects.equals(this.sizeId, kafkaRequestAllOf.sizeId) &&
        Objects.equals(this.billingCloudAccountId, kafkaRequestAllOf.billingCloudAccountId) &&
        Objects.equals(this.marketplace, kafkaRequestAllOf.marketplace) &&
        Objects.equals(this.billingModel, kafkaRequestAllOf.billingModel) &&
        Objects.equals(this.promotionStatus, kafkaRequestAllOf.promotionStatus) &&
        Objects.equals(this.promotionDetails, kafkaRequestAllOf.promotionDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, cloudProvider, multiAz, region, owner, name, bootstrapServerHost, adminApiServerUrl, createdAt, hashCodeNullable(expiresAt), updatedAt, failedReason, version, instanceType, reauthenticationEnabled, maxDataRetentionSize, browserUrl, sizeId, billingCloudAccountId, marketplace, billingModel, promotionStatus, promotionDetails);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
    sb.append("    adminApiServerUrl: ").append(toIndentedString(adminApiServerUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    reauthenticationEnabled: ").append(toIndentedString(reauthenticationEnabled)).append("\n");
    sb.append("    maxDataRetentionSize: ").append(toIndentedString(maxDataRetentionSize)).append("\n");
    sb.append("    browserUrl: ").append(toIndentedString(browserUrl)).append("\n");
    sb.append("    sizeId: ").append(toIndentedString(sizeId)).append("\n");
    sb.append("    billingCloudAccountId: ").append(toIndentedString(billingCloudAccountId)).append("\n");
    sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
    sb.append("    billingModel: ").append(toIndentedString(billingModel)).append("\n");
    sb.append("    promotionStatus: ").append(toIndentedString(promotionStatus)).append("\n");
    sb.append("    promotionDetails: ").append(toIndentedString(promotionDetails)).append("\n");
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

