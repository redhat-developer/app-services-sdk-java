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
import com.openshift.cloud.api.kas.models.SupportedKafkaSizeBytesValueItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Supported Kafka Size
 */
@ApiModel(description = "Supported Kafka Size")
@JsonPropertyOrder({
  SupportedKafkaSize.JSON_PROPERTY_ID,
  SupportedKafkaSize.JSON_PROPERTY_DISPLAY_NAME,
  SupportedKafkaSize.JSON_PROPERTY_INGRESS_THROUGHPUT_PER_SEC,
  SupportedKafkaSize.JSON_PROPERTY_EGRESS_THROUGHPUT_PER_SEC,
  SupportedKafkaSize.JSON_PROPERTY_TOTAL_MAX_CONNECTIONS,
  SupportedKafkaSize.JSON_PROPERTY_MAX_DATA_RETENTION_SIZE,
  SupportedKafkaSize.JSON_PROPERTY_MAX_PARTITIONS,
  SupportedKafkaSize.JSON_PROPERTY_MAX_DATA_RETENTION_PERIOD,
  SupportedKafkaSize.JSON_PROPERTY_MAX_CONNECTION_ATTEMPTS_PER_SEC,
  SupportedKafkaSize.JSON_PROPERTY_MAX_MESSAGE_SIZE,
  SupportedKafkaSize.JSON_PROPERTY_MIN_IN_SYNC_REPLICAS,
  SupportedKafkaSize.JSON_PROPERTY_REPLICATION_FACTOR,
  SupportedKafkaSize.JSON_PROPERTY_SUPPORTED_AZ_MODES,
  SupportedKafkaSize.JSON_PROPERTY_LIFESPAN_SECONDS,
  SupportedKafkaSize.JSON_PROPERTY_QUOTA_CONSUMED,
  SupportedKafkaSize.JSON_PROPERTY_QUOTA_TYPE,
  SupportedKafkaSize.JSON_PROPERTY_CAPACITY_CONSUMED,
  SupportedKafkaSize.JSON_PROPERTY_MATURITY_STATUS
})
@JsonTypeName("SupportedKafkaSize")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SupportedKafkaSize {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_INGRESS_THROUGHPUT_PER_SEC = "ingress_throughput_per_sec";
  private SupportedKafkaSizeBytesValueItem ingressThroughputPerSec;

  public static final String JSON_PROPERTY_EGRESS_THROUGHPUT_PER_SEC = "egress_throughput_per_sec";
  private SupportedKafkaSizeBytesValueItem egressThroughputPerSec;

  public static final String JSON_PROPERTY_TOTAL_MAX_CONNECTIONS = "total_max_connections";
  private Integer totalMaxConnections;

  public static final String JSON_PROPERTY_MAX_DATA_RETENTION_SIZE = "max_data_retention_size";
  private SupportedKafkaSizeBytesValueItem maxDataRetentionSize;

  public static final String JSON_PROPERTY_MAX_PARTITIONS = "max_partitions";
  private Integer maxPartitions;

  public static final String JSON_PROPERTY_MAX_DATA_RETENTION_PERIOD = "max_data_retention_period";
  private String maxDataRetentionPeriod;

  public static final String JSON_PROPERTY_MAX_CONNECTION_ATTEMPTS_PER_SEC = "max_connection_attempts_per_sec";
  private Integer maxConnectionAttemptsPerSec;

  public static final String JSON_PROPERTY_MAX_MESSAGE_SIZE = "max_message_size";
  private SupportedKafkaSizeBytesValueItem maxMessageSize;

  public static final String JSON_PROPERTY_MIN_IN_SYNC_REPLICAS = "min_in_sync_replicas";
  private Integer minInSyncReplicas;

  public static final String JSON_PROPERTY_REPLICATION_FACTOR = "replication_factor";
  private Integer replicationFactor;

  public static final String JSON_PROPERTY_SUPPORTED_AZ_MODES = "supported_az_modes";
  private List<String> supportedAzModes = null;

  public static final String JSON_PROPERTY_LIFESPAN_SECONDS = "lifespan_seconds";
  private JsonNullable<Integer> lifespanSeconds = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_QUOTA_CONSUMED = "quota_consumed";
  private Integer quotaConsumed;

  public static final String JSON_PROPERTY_QUOTA_TYPE = "quota_type";
  private String quotaType;

  public static final String JSON_PROPERTY_CAPACITY_CONSUMED = "capacity_consumed";
  private Integer capacityConsumed;

  public static final String JSON_PROPERTY_MATURITY_STATUS = "maturity_status";
  private String maturityStatus;

  public SupportedKafkaSize() { 
  }

  public SupportedKafkaSize id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of this Kafka instance size.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of this Kafka instance size.")
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


  public SupportedKafkaSize displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of this Kafka instance size.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Display name of this Kafka instance size.")
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


  public SupportedKafkaSize ingressThroughputPerSec(SupportedKafkaSizeBytesValueItem ingressThroughputPerSec) {
    
    this.ingressThroughputPerSec = ingressThroughputPerSec;
    return this;
  }

   /**
   * Get ingressThroughputPerSec
   * @return ingressThroughputPerSec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INGRESS_THROUGHPUT_PER_SEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SupportedKafkaSizeBytesValueItem getIngressThroughputPerSec() {
    return ingressThroughputPerSec;
  }


  @JsonProperty(JSON_PROPERTY_INGRESS_THROUGHPUT_PER_SEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIngressThroughputPerSec(SupportedKafkaSizeBytesValueItem ingressThroughputPerSec) {
    this.ingressThroughputPerSec = ingressThroughputPerSec;
  }


  public SupportedKafkaSize egressThroughputPerSec(SupportedKafkaSizeBytesValueItem egressThroughputPerSec) {
    
    this.egressThroughputPerSec = egressThroughputPerSec;
    return this;
  }

   /**
   * Get egressThroughputPerSec
   * @return egressThroughputPerSec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EGRESS_THROUGHPUT_PER_SEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SupportedKafkaSizeBytesValueItem getEgressThroughputPerSec() {
    return egressThroughputPerSec;
  }


  @JsonProperty(JSON_PROPERTY_EGRESS_THROUGHPUT_PER_SEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEgressThroughputPerSec(SupportedKafkaSizeBytesValueItem egressThroughputPerSec) {
    this.egressThroughputPerSec = egressThroughputPerSec;
  }


  public SupportedKafkaSize totalMaxConnections(Integer totalMaxConnections) {
    
    this.totalMaxConnections = totalMaxConnections;
    return this;
  }

   /**
   * Maximum amount of total connections available to this Kafka instance size.
   * @return totalMaxConnections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum amount of total connections available to this Kafka instance size.")
  @JsonProperty(JSON_PROPERTY_TOTAL_MAX_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalMaxConnections() {
    return totalMaxConnections;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_MAX_CONNECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalMaxConnections(Integer totalMaxConnections) {
    this.totalMaxConnections = totalMaxConnections;
  }


  public SupportedKafkaSize maxDataRetentionSize(SupportedKafkaSizeBytesValueItem maxDataRetentionSize) {
    
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


  public SupportedKafkaSize maxPartitions(Integer maxPartitions) {
    
    this.maxPartitions = maxPartitions;
    return this;
  }

   /**
   * Maximum amount of total partitions available to this Kafka instance size.
   * @return maxPartitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum amount of total partitions available to this Kafka instance size.")
  @JsonProperty(JSON_PROPERTY_MAX_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxPartitions() {
    return maxPartitions;
  }


  @JsonProperty(JSON_PROPERTY_MAX_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxPartitions(Integer maxPartitions) {
    this.maxPartitions = maxPartitions;
  }


  public SupportedKafkaSize maxDataRetentionPeriod(String maxDataRetentionPeriod) {
    
    this.maxDataRetentionPeriod = maxDataRetentionPeriod;
    return this;
  }

   /**
   * Maximum data retention period available to this Kafka instance size.
   * @return maxDataRetentionPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum data retention period available to this Kafka instance size.")
  @JsonProperty(JSON_PROPERTY_MAX_DATA_RETENTION_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaxDataRetentionPeriod() {
    return maxDataRetentionPeriod;
  }


  @JsonProperty(JSON_PROPERTY_MAX_DATA_RETENTION_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxDataRetentionPeriod(String maxDataRetentionPeriod) {
    this.maxDataRetentionPeriod = maxDataRetentionPeriod;
  }


  public SupportedKafkaSize maxConnectionAttemptsPerSec(Integer maxConnectionAttemptsPerSec) {
    
    this.maxConnectionAttemptsPerSec = maxConnectionAttemptsPerSec;
    return this;
  }

   /**
   * Maximium connection attempts per second available to this Kafka instance size.
   * @return maxConnectionAttemptsPerSec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximium connection attempts per second available to this Kafka instance size.")
  @JsonProperty(JSON_PROPERTY_MAX_CONNECTION_ATTEMPTS_PER_SEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxConnectionAttemptsPerSec() {
    return maxConnectionAttemptsPerSec;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CONNECTION_ATTEMPTS_PER_SEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxConnectionAttemptsPerSec(Integer maxConnectionAttemptsPerSec) {
    this.maxConnectionAttemptsPerSec = maxConnectionAttemptsPerSec;
  }


  public SupportedKafkaSize maxMessageSize(SupportedKafkaSizeBytesValueItem maxMessageSize) {
    
    this.maxMessageSize = maxMessageSize;
    return this;
  }

   /**
   * Get maxMessageSize
   * @return maxMessageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_MESSAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SupportedKafkaSizeBytesValueItem getMaxMessageSize() {
    return maxMessageSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_MESSAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxMessageSize(SupportedKafkaSizeBytesValueItem maxMessageSize) {
    this.maxMessageSize = maxMessageSize;
  }


  public SupportedKafkaSize minInSyncReplicas(Integer minInSyncReplicas) {
    
    this.minInSyncReplicas = minInSyncReplicas;
    return this;
  }

   /**
   * Minimum number of in-sync replicas.
   * @return minInSyncReplicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum number of in-sync replicas.")
  @JsonProperty(JSON_PROPERTY_MIN_IN_SYNC_REPLICAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinInSyncReplicas() {
    return minInSyncReplicas;
  }


  @JsonProperty(JSON_PROPERTY_MIN_IN_SYNC_REPLICAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinInSyncReplicas(Integer minInSyncReplicas) {
    this.minInSyncReplicas = minInSyncReplicas;
  }


  public SupportedKafkaSize replicationFactor(Integer replicationFactor) {
    
    this.replicationFactor = replicationFactor;
    return this;
  }

   /**
   * Replication factor available to this Kafka instance size.
   * @return replicationFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Replication factor available to this Kafka instance size.")
  @JsonProperty(JSON_PROPERTY_REPLICATION_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReplicationFactor() {
    return replicationFactor;
  }


  @JsonProperty(JSON_PROPERTY_REPLICATION_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplicationFactor(Integer replicationFactor) {
    this.replicationFactor = replicationFactor;
  }


  public SupportedKafkaSize supportedAzModes(List<String> supportedAzModes) {
    
    this.supportedAzModes = supportedAzModes;
    return this;
  }

  public SupportedKafkaSize addSupportedAzModesItem(String supportedAzModesItem) {
    if (this.supportedAzModes == null) {
      this.supportedAzModes = new ArrayList<>();
    }
    this.supportedAzModes.add(supportedAzModesItem);
    return this;
  }

   /**
   * List of Availability Zone modes that this Kafka instance size supports. The possible values are \&quot;single\&quot;, \&quot;multi\&quot;.
   * @return supportedAzModes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of Availability Zone modes that this Kafka instance size supports. The possible values are \"single\", \"multi\".")
  @JsonProperty(JSON_PROPERTY_SUPPORTED_AZ_MODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSupportedAzModes() {
    return supportedAzModes;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORTED_AZ_MODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportedAzModes(List<String> supportedAzModes) {
    this.supportedAzModes = supportedAzModes;
  }


  public SupportedKafkaSize lifespanSeconds(Integer lifespanSeconds) {
    this.lifespanSeconds = JsonNullable.<Integer>of(lifespanSeconds);
    
    return this;
  }

   /**
   * The limit lifespan of the kafka instance in seconds. If not specified then the instance never expires.
   * @return lifespanSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The limit lifespan of the kafka instance in seconds. If not specified then the instance never expires.")
  @JsonIgnore

  public Integer getLifespanSeconds() {
        return lifespanSeconds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIFESPAN_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getLifespanSeconds_JsonNullable() {
    return lifespanSeconds;
  }
  
  @JsonProperty(JSON_PROPERTY_LIFESPAN_SECONDS)
  public void setLifespanSeconds_JsonNullable(JsonNullable<Integer> lifespanSeconds) {
    this.lifespanSeconds = lifespanSeconds;
  }

  public void setLifespanSeconds(Integer lifespanSeconds) {
    this.lifespanSeconds = JsonNullable.<Integer>of(lifespanSeconds);
  }


  public SupportedKafkaSize quotaConsumed(Integer quotaConsumed) {
    
    this.quotaConsumed = quotaConsumed;
    return this;
  }

   /**
   * Quota consumed by this Kafka instance size.
   * @return quotaConsumed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Quota consumed by this Kafka instance size.")
  @JsonProperty(JSON_PROPERTY_QUOTA_CONSUMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getQuotaConsumed() {
    return quotaConsumed;
  }


  @JsonProperty(JSON_PROPERTY_QUOTA_CONSUMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuotaConsumed(Integer quotaConsumed) {
    this.quotaConsumed = quotaConsumed;
  }


  public SupportedKafkaSize quotaType(String quotaType) {
    
    this.quotaType = quotaType;
    return this;
  }

   /**
   * Quota type used by this Kafka instance size.
   * @return quotaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Quota type used by this Kafka instance size.")
  @JsonProperty(JSON_PROPERTY_QUOTA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuotaType() {
    return quotaType;
  }


  @JsonProperty(JSON_PROPERTY_QUOTA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuotaType(String quotaType) {
    this.quotaType = quotaType;
  }


  public SupportedKafkaSize capacityConsumed(Integer capacityConsumed) {
    
    this.capacityConsumed = capacityConsumed;
    return this;
  }

   /**
   * Data plane cluster capacity consumed by this Kafka instance size.
   * @return capacityConsumed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data plane cluster capacity consumed by this Kafka instance size.")
  @JsonProperty(JSON_PROPERTY_CAPACITY_CONSUMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCapacityConsumed() {
    return capacityConsumed;
  }


  @JsonProperty(JSON_PROPERTY_CAPACITY_CONSUMED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapacityConsumed(Integer capacityConsumed) {
    this.capacityConsumed = capacityConsumed;
  }


  public SupportedKafkaSize maturityStatus(String maturityStatus) {
    
    this.maturityStatus = maturityStatus;
    return this;
  }

   /**
   * Maturity level of the size. Can be stable or tech preview.
   * @return maturityStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maturity level of the size. Can be stable or tech preview.")
  @JsonProperty(JSON_PROPERTY_MATURITY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaturityStatus() {
    return maturityStatus;
  }


  @JsonProperty(JSON_PROPERTY_MATURITY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaturityStatus(String maturityStatus) {
    this.maturityStatus = maturityStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedKafkaSize supportedKafkaSize = (SupportedKafkaSize) o;
    return Objects.equals(this.id, supportedKafkaSize.id) &&
        Objects.equals(this.displayName, supportedKafkaSize.displayName) &&
        Objects.equals(this.ingressThroughputPerSec, supportedKafkaSize.ingressThroughputPerSec) &&
        Objects.equals(this.egressThroughputPerSec, supportedKafkaSize.egressThroughputPerSec) &&
        Objects.equals(this.totalMaxConnections, supportedKafkaSize.totalMaxConnections) &&
        Objects.equals(this.maxDataRetentionSize, supportedKafkaSize.maxDataRetentionSize) &&
        Objects.equals(this.maxPartitions, supportedKafkaSize.maxPartitions) &&
        Objects.equals(this.maxDataRetentionPeriod, supportedKafkaSize.maxDataRetentionPeriod) &&
        Objects.equals(this.maxConnectionAttemptsPerSec, supportedKafkaSize.maxConnectionAttemptsPerSec) &&
        Objects.equals(this.maxMessageSize, supportedKafkaSize.maxMessageSize) &&
        Objects.equals(this.minInSyncReplicas, supportedKafkaSize.minInSyncReplicas) &&
        Objects.equals(this.replicationFactor, supportedKafkaSize.replicationFactor) &&
        Objects.equals(this.supportedAzModes, supportedKafkaSize.supportedAzModes) &&
        equalsNullable(this.lifespanSeconds, supportedKafkaSize.lifespanSeconds) &&
        Objects.equals(this.quotaConsumed, supportedKafkaSize.quotaConsumed) &&
        Objects.equals(this.quotaType, supportedKafkaSize.quotaType) &&
        Objects.equals(this.capacityConsumed, supportedKafkaSize.capacityConsumed) &&
        Objects.equals(this.maturityStatus, supportedKafkaSize.maturityStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, ingressThroughputPerSec, egressThroughputPerSec, totalMaxConnections, maxDataRetentionSize, maxPartitions, maxDataRetentionPeriod, maxConnectionAttemptsPerSec, maxMessageSize, minInSyncReplicas, replicationFactor, supportedAzModes, hashCodeNullable(lifespanSeconds), quotaConsumed, quotaType, capacityConsumed, maturityStatus);
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
    sb.append("class SupportedKafkaSize {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ingressThroughputPerSec: ").append(toIndentedString(ingressThroughputPerSec)).append("\n");
    sb.append("    egressThroughputPerSec: ").append(toIndentedString(egressThroughputPerSec)).append("\n");
    sb.append("    totalMaxConnections: ").append(toIndentedString(totalMaxConnections)).append("\n");
    sb.append("    maxDataRetentionSize: ").append(toIndentedString(maxDataRetentionSize)).append("\n");
    sb.append("    maxPartitions: ").append(toIndentedString(maxPartitions)).append("\n");
    sb.append("    maxDataRetentionPeriod: ").append(toIndentedString(maxDataRetentionPeriod)).append("\n");
    sb.append("    maxConnectionAttemptsPerSec: ").append(toIndentedString(maxConnectionAttemptsPerSec)).append("\n");
    sb.append("    maxMessageSize: ").append(toIndentedString(maxMessageSize)).append("\n");
    sb.append("    minInSyncReplicas: ").append(toIndentedString(minInSyncReplicas)).append("\n");
    sb.append("    replicationFactor: ").append(toIndentedString(replicationFactor)).append("\n");
    sb.append("    supportedAzModes: ").append(toIndentedString(supportedAzModes)).append("\n");
    sb.append("    lifespanSeconds: ").append(toIndentedString(lifespanSeconds)).append("\n");
    sb.append("    quotaConsumed: ").append(toIndentedString(quotaConsumed)).append("\n");
    sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
    sb.append("    capacityConsumed: ").append(toIndentedString(capacityConsumed)).append("\n");
    sb.append("    maturityStatus: ").append(toIndentedString(maturityStatus)).append("\n");
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

