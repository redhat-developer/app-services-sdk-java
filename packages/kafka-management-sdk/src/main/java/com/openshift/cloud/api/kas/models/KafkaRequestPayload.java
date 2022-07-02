/*
 * Kafka Service Fleet Manager
 * Kafka Service Fleet Manager is a Rest API to manage Kafka instances.
 *
 * The version of the OpenAPI document: 1.11.0
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Schema for the request body sent to /kafkas POST
 */
@ApiModel(description = "Schema for the request body sent to /kafkas POST")
@JsonPropertyOrder({
  KafkaRequestPayload.JSON_PROPERTY_CLOUD_PROVIDER,
  KafkaRequestPayload.JSON_PROPERTY_NAME,
  KafkaRequestPayload.JSON_PROPERTY_REGION,
  KafkaRequestPayload.JSON_PROPERTY_REAUTHENTICATION_ENABLED,
  KafkaRequestPayload.JSON_PROPERTY_PLAN,
  KafkaRequestPayload.JSON_PROPERTY_BILLING_CLOUD_ACCOUNT_ID,
  KafkaRequestPayload.JSON_PROPERTY_MARKETPLACE,
  KafkaRequestPayload.JSON_PROPERTY_BILLING_MODEL
})
@JsonTypeName("KafkaRequestPayload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KafkaRequestPayload {
  public static final String JSON_PROPERTY_CLOUD_PROVIDER = "cloud_provider";
  private String cloudProvider;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_REAUTHENTICATION_ENABLED = "reauthentication_enabled";
  private JsonNullable<Boolean> reauthenticationEnabled = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_PLAN = "plan";
  private String plan;

  public static final String JSON_PROPERTY_BILLING_CLOUD_ACCOUNT_ID = "billing_cloud_account_id";
  private JsonNullable<String> billingCloudAccountId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MARKETPLACE = "marketplace";
  private JsonNullable<String> marketplace = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BILLING_MODEL = "billing_model";
  private JsonNullable<String> billingModel = JsonNullable.<String>undefined();

  public KafkaRequestPayload() { 
  }

  public KafkaRequestPayload cloudProvider(String cloudProvider) {
    
    this.cloudProvider = cloudProvider;
    return this;
  }

   /**
   * The cloud provider where the Kafka cluster will be created in
   * @return cloudProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cloud provider where the Kafka cluster will be created in")
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


  public KafkaRequestPayload name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the Kafka cluster. It must consist of lower-case alphanumeric characters or &#39;-&#39;, start with an alphabetic character, and end with an alphanumeric character, and can not be longer than 32 characters.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the Kafka cluster. It must consist of lower-case alphanumeric characters or '-', start with an alphabetic character, and end with an alphanumeric character, and can not be longer than 32 characters.")
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


  public KafkaRequestPayload region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The region where the Kafka cluster will be created in
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The region where the Kafka cluster will be created in")
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


  public KafkaRequestPayload reauthenticationEnabled(Boolean reauthenticationEnabled) {
    this.reauthenticationEnabled = JsonNullable.<Boolean>of(reauthenticationEnabled);
    
    return this;
  }

   /**
   * Whether connection reauthentication is enabled or not. If set to true, connection reauthentication on the Kafka instance will be required every 5 minutes. The default value is true
   * @return reauthenticationEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether connection reauthentication is enabled or not. If set to true, connection reauthentication on the Kafka instance will be required every 5 minutes. The default value is true")
  @JsonIgnore

  public Boolean getReauthenticationEnabled() {
        return reauthenticationEnabled.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REAUTHENTICATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getReauthenticationEnabled_JsonNullable() {
    return reauthenticationEnabled;
  }
  
  @JsonProperty(JSON_PROPERTY_REAUTHENTICATION_ENABLED)
  public void setReauthenticationEnabled_JsonNullable(JsonNullable<Boolean> reauthenticationEnabled) {
    this.reauthenticationEnabled = reauthenticationEnabled;
  }

  public void setReauthenticationEnabled(Boolean reauthenticationEnabled) {
    this.reauthenticationEnabled = JsonNullable.<Boolean>of(reauthenticationEnabled);
  }


  public KafkaRequestPayload plan(String plan) {
    
    this.plan = plan;
    return this;
  }

   /**
   * kafka plan in a format of &lt;instance_type&gt;.&lt;size_id&gt;
   * @return plan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "kafka plan in a format of <instance_type>.<size_id>")
  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlan() {
    return plan;
  }


  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlan(String plan) {
    this.plan = plan;
  }


  public KafkaRequestPayload billingCloudAccountId(String billingCloudAccountId) {
    this.billingCloudAccountId = JsonNullable.<String>of(billingCloudAccountId);
    
    return this;
  }

   /**
   * cloud account id used to purchase the instance
   * @return billingCloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "cloud account id used to purchase the instance")
  @JsonIgnore

  public String getBillingCloudAccountId() {
        return billingCloudAccountId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BILLING_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBillingCloudAccountId_JsonNullable() {
    return billingCloudAccountId;
  }
  
  @JsonProperty(JSON_PROPERTY_BILLING_CLOUD_ACCOUNT_ID)
  public void setBillingCloudAccountId_JsonNullable(JsonNullable<String> billingCloudAccountId) {
    this.billingCloudAccountId = billingCloudAccountId;
  }

  public void setBillingCloudAccountId(String billingCloudAccountId) {
    this.billingCloudAccountId = JsonNullable.<String>of(billingCloudAccountId);
  }


  public KafkaRequestPayload marketplace(String marketplace) {
    this.marketplace = JsonNullable.<String>of(marketplace);
    
    return this;
  }

   /**
   * marketplace where the instance is purchased on
   * @return marketplace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "marketplace where the instance is purchased on")
  @JsonIgnore

  public String getMarketplace() {
        return marketplace.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MARKETPLACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMarketplace_JsonNullable() {
    return marketplace;
  }
  
  @JsonProperty(JSON_PROPERTY_MARKETPLACE)
  public void setMarketplace_JsonNullable(JsonNullable<String> marketplace) {
    this.marketplace = marketplace;
  }

  public void setMarketplace(String marketplace) {
    this.marketplace = JsonNullable.<String>of(marketplace);
  }


  public KafkaRequestPayload billingModel(String billingModel) {
    this.billingModel = JsonNullable.<String>of(billingModel);
    
    return this;
  }

   /**
   * billing model to use
   * @return billingModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "billing model to use")
  @JsonIgnore

  public String getBillingModel() {
        return billingModel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BILLING_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBillingModel_JsonNullable() {
    return billingModel;
  }
  
  @JsonProperty(JSON_PROPERTY_BILLING_MODEL)
  public void setBillingModel_JsonNullable(JsonNullable<String> billingModel) {
    this.billingModel = billingModel;
  }

  public void setBillingModel(String billingModel) {
    this.billingModel = JsonNullable.<String>of(billingModel);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaRequestPayload kafkaRequestPayload = (KafkaRequestPayload) o;
    return Objects.equals(this.cloudProvider, kafkaRequestPayload.cloudProvider) &&
        Objects.equals(this.name, kafkaRequestPayload.name) &&
        Objects.equals(this.region, kafkaRequestPayload.region) &&
        equalsNullable(this.reauthenticationEnabled, kafkaRequestPayload.reauthenticationEnabled) &&
        Objects.equals(this.plan, kafkaRequestPayload.plan) &&
        equalsNullable(this.billingCloudAccountId, kafkaRequestPayload.billingCloudAccountId) &&
        equalsNullable(this.marketplace, kafkaRequestPayload.marketplace) &&
        equalsNullable(this.billingModel, kafkaRequestPayload.billingModel);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudProvider, name, region, hashCodeNullable(reauthenticationEnabled), plan, hashCodeNullable(billingCloudAccountId), hashCodeNullable(marketplace), hashCodeNullable(billingModel));
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
    sb.append("class KafkaRequestPayload {\n");
    sb.append("    cloudProvider: ").append(toIndentedString(cloudProvider)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    reauthenticationEnabled: ").append(toIndentedString(reauthenticationEnabled)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    billingCloudAccountId: ").append(toIndentedString(billingCloudAccountId)).append("\n");
    sb.append("    marketplace: ").append(toIndentedString(marketplace)).append("\n");
    sb.append("    billingModel: ").append(toIndentedString(billingModel)).append("\n");
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

