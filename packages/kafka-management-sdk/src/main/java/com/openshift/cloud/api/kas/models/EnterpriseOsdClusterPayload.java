/*
 * Kafka Management API
 * Kafka Management API is a REST API to manage Kafka instances
 *
 * The version of the OpenAPI document: 1.16.0
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
 * Schema for the request body sent to /clusters POST
 */
@ApiModel(description = "Schema for the request body sent to /clusters POST")
@JsonPropertyOrder({
  EnterpriseOsdClusterPayload.JSON_PROPERTY_ACCESS_KAFKAS_VIA_PRIVATE_NETWORK,
  EnterpriseOsdClusterPayload.JSON_PROPERTY_CLUSTER_ID,
  EnterpriseOsdClusterPayload.JSON_PROPERTY_CLUSTER_INGRESS_DNS_NAME,
  EnterpriseOsdClusterPayload.JSON_PROPERTY_KAFKA_MACHINE_POOL_NODE_COUNT
})
@JsonTypeName("EnterpriseOsdClusterPayload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnterpriseOsdClusterPayload {
  public static final String JSON_PROPERTY_ACCESS_KAFKAS_VIA_PRIVATE_NETWORK = "access_kafkas_via_private_network";
  private Boolean accessKafkasViaPrivateNetwork;

  public static final String JSON_PROPERTY_CLUSTER_ID = "cluster_id";
  private String clusterId;

  public static final String JSON_PROPERTY_CLUSTER_INGRESS_DNS_NAME = "cluster_ingress_dns_name";
  private String clusterIngressDnsName;

  public static final String JSON_PROPERTY_KAFKA_MACHINE_POOL_NODE_COUNT = "kafka_machine_pool_node_count";
  private Integer kafkaMachinePoolNodeCount;

  public EnterpriseOsdClusterPayload() { 
  }

  public EnterpriseOsdClusterPayload accessKafkasViaPrivateNetwork(Boolean accessKafkasViaPrivateNetwork) {
    
    this.accessKafkasViaPrivateNetwork = accessKafkasViaPrivateNetwork;
    return this;
  }

   /**
   * Sets whether Kafkas created on this data plane cluster have to be accessed via private network
   * @return accessKafkasViaPrivateNetwork
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Sets whether Kafkas created on this data plane cluster have to be accessed via private network")
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


  public EnterpriseOsdClusterPayload clusterId(String clusterId) {
    
    this.clusterId = clusterId;
    return this;
  }

   /**
   * The data plane cluster ID. This is the ID of the cluster obtained from OpenShift Cluster Manager (OCM) API
   * @return clusterId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The data plane cluster ID. This is the ID of the cluster obtained from OpenShift Cluster Manager (OCM) API")
  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClusterId() {
    return clusterId;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }


  public EnterpriseOsdClusterPayload clusterIngressDnsName(String clusterIngressDnsName) {
    
    this.clusterIngressDnsName = clusterIngressDnsName;
    return this;
  }

   /**
   * dns name of the cluster. Can be obtained from the response JSON of the /api/clusters_mgmt/v1/clusters/&lt;cluster_id&gt;/ingresses (dns_name)
   * @return clusterIngressDnsName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "dns name of the cluster. Can be obtained from the response JSON of the /api/clusters_mgmt/v1/clusters/<cluster_id>/ingresses (dns_name)")
  @JsonProperty(JSON_PROPERTY_CLUSTER_INGRESS_DNS_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClusterIngressDnsName() {
    return clusterIngressDnsName;
  }


  @JsonProperty(JSON_PROPERTY_CLUSTER_INGRESS_DNS_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClusterIngressDnsName(String clusterIngressDnsName) {
    this.clusterIngressDnsName = clusterIngressDnsName;
  }


  public EnterpriseOsdClusterPayload kafkaMachinePoolNodeCount(Integer kafkaMachinePoolNodeCount) {
    
    this.kafkaMachinePoolNodeCount = kafkaMachinePoolNodeCount;
    return this;
  }

   /**
   * The node count given to the created kafka machine pool.  The machine pool must be created via /api/clusters_mgmt/v1/clusters/&lt;cluster_id&gt;/machine_pools prior to passing this value. The created machine pool must have a &#x60;bf2.org/kafkaInstanceProfileType&#x3D;standard&#x60; label and a &#x60;bf2.org/kafkaInstanceProfileType&#x3D;standard:NoExecute&#x60; taint. The name of the machine pool must be &#x60;kafka-standard&#x60;  The node count value has to be a multiple of 3 with a minimum of 3 nodes.
   * @return kafkaMachinePoolNodeCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The node count given to the created kafka machine pool.  The machine pool must be created via /api/clusters_mgmt/v1/clusters/<cluster_id>/machine_pools prior to passing this value. The created machine pool must have a `bf2.org/kafkaInstanceProfileType=standard` label and a `bf2.org/kafkaInstanceProfileType=standard:NoExecute` taint. The name of the machine pool must be `kafka-standard`  The node count value has to be a multiple of 3 with a minimum of 3 nodes.")
  @JsonProperty(JSON_PROPERTY_KAFKA_MACHINE_POOL_NODE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getKafkaMachinePoolNodeCount() {
    return kafkaMachinePoolNodeCount;
  }


  @JsonProperty(JSON_PROPERTY_KAFKA_MACHINE_POOL_NODE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKafkaMachinePoolNodeCount(Integer kafkaMachinePoolNodeCount) {
    this.kafkaMachinePoolNodeCount = kafkaMachinePoolNodeCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseOsdClusterPayload enterpriseOsdClusterPayload = (EnterpriseOsdClusterPayload) o;
    return Objects.equals(this.accessKafkasViaPrivateNetwork, enterpriseOsdClusterPayload.accessKafkasViaPrivateNetwork) &&
        Objects.equals(this.clusterId, enterpriseOsdClusterPayload.clusterId) &&
        Objects.equals(this.clusterIngressDnsName, enterpriseOsdClusterPayload.clusterIngressDnsName) &&
        Objects.equals(this.kafkaMachinePoolNodeCount, enterpriseOsdClusterPayload.kafkaMachinePoolNodeCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKafkasViaPrivateNetwork, clusterId, clusterIngressDnsName, kafkaMachinePoolNodeCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseOsdClusterPayload {\n");
    sb.append("    accessKafkasViaPrivateNetwork: ").append(toIndentedString(accessKafkasViaPrivateNetwork)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    clusterIngressDnsName: ").append(toIndentedString(clusterIngressDnsName)).append("\n");
    sb.append("    kafkaMachinePoolNodeCount: ").append(toIndentedString(kafkaMachinePoolNodeCount)).append("\n");
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

