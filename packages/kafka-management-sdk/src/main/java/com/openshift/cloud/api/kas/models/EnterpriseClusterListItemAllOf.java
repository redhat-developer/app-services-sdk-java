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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EnterpriseClusterListItemAllOf
 */
@JsonPropertyOrder({
  EnterpriseClusterListItemAllOf.JSON_PROPERTY_ACCESS_KAFKAS_VIA_PRIVATE_NETWORK,
  EnterpriseClusterListItemAllOf.JSON_PROPERTY_CLUSTER_ID,
  EnterpriseClusterListItemAllOf.JSON_PROPERTY_STATUS,
  EnterpriseClusterListItemAllOf.JSON_PROPERTY_CLOUD_PROVIDER,
  EnterpriseClusterListItemAllOf.JSON_PROPERTY_REGION,
  EnterpriseClusterListItemAllOf.JSON_PROPERTY_MULTI_AZ
})
@JsonTypeName("EnterpriseClusterListItem_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnterpriseClusterListItemAllOf {
  public static final String JSON_PROPERTY_ACCESS_KAFKAS_VIA_PRIVATE_NETWORK = "access_kafkas_via_private_network";
  private Boolean accessKafkasViaPrivateNetwork;

  public static final String JSON_PROPERTY_CLUSTER_ID = "cluster_id";
  private String clusterId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_CLOUD_PROVIDER = "cloud_provider";
  private String cloudProvider;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_MULTI_AZ = "multi_az";
  private Boolean multiAz;

  public EnterpriseClusterListItemAllOf() { 
  }

  public EnterpriseClusterListItemAllOf accessKafkasViaPrivateNetwork(Boolean accessKafkasViaPrivateNetwork) {
    
    this.accessKafkasViaPrivateNetwork = accessKafkasViaPrivateNetwork;
    return this;
  }

   /**
   * Indicates whether Kafkas created on this data plane cluster have to be accessed via private network
   * @return accessKafkasViaPrivateNetwork
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether Kafkas created on this data plane cluster have to be accessed via private network")
  @JsonProperty(JSON_PROPERTY_ACCESS_KAFKAS_VIA_PRIVATE_NETWORK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAccessKafkasViaPrivateNetwork() {
    return accessKafkasViaPrivateNetwork;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_KAFKAS_VIA_PRIVATE_NETWORK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccessKafkasViaPrivateNetwork(Boolean accessKafkasViaPrivateNetwork) {
    this.accessKafkasViaPrivateNetwork = accessKafkasViaPrivateNetwork;
  }


  public EnterpriseClusterListItemAllOf clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * The OCM&#39;s cluster id of the registered Enterprise cluster.
   * @return clusterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The OCM's cluster id of the registered Enterprise cluster.")
  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClusterId() {
    return clusterId;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public EnterpriseClusterListItemAllOf status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of Enterprise cluster registration
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of Enterprise cluster registration")
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


  public EnterpriseClusterListItemAllOf cloudProvider(String cloudProvider) {
    
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * The cloud provider for this cluster. This valus will be used as the Kafka&#39;s cloud provider value when a Kafka is created on this cluster
   * @return cloudProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cloud provider for this cluster. This valus will be used as the Kafka's cloud provider value when a Kafka is created on this cluster")
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


  public EnterpriseClusterListItemAllOf region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The region of this cluster. This valus will be used as the Kafka&#39;s region value when a Kafka is created on this cluster
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The region of this cluster. This valus will be used as the Kafka's region value when a Kafka is created on this cluster")
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


  public EnterpriseClusterListItemAllOf multiAz(Boolean multiAz) {
    
    this.multiAz = multiAz;
    return this;
  }

   /**
   * A flag indicating whether this cluster is available on multiple availability zones or not
   * @return multiAz
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A flag indicating whether this cluster is available on multiple availability zones or not")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseClusterListItemAllOf enterpriseClusterListItemAllOf = (EnterpriseClusterListItemAllOf) o;
    return Objects.equals(this.accessKafkasViaPrivateNetwork, enterpriseClusterListItemAllOf.accessKafkasViaPrivateNetwork) &&
        Objects.equals(this.clusterId, enterpriseClusterListItemAllOf.clusterId) &&
        Objects.equals(this.status, enterpriseClusterListItemAllOf.status) &&
        Objects.equals(this.cloudProvider, enterpriseClusterListItemAllOf.cloudProvider) &&
        Objects.equals(this.region, enterpriseClusterListItemAllOf.region) &&
        Objects.equals(this.multiAz, enterpriseClusterListItemAllOf.multiAz);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKafkasViaPrivateNetwork, clusterId, status, cloudProvider, region, multiAz);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseClusterListItemAllOf {\n");
    sb.append("    accessKafkasViaPrivateNetwork: ").append(toIndentedString(accessKafkasViaPrivateNetwork)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    multiAz: ").append(toIndentedString(multiAz)).append("\n");
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
