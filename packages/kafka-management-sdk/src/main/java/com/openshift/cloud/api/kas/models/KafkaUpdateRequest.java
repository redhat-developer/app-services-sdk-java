/*
 * Kafka Management API
 * Kafka Management API is a REST API to manage Kafka instances
 *
 * The version of the OpenAPI document: 1.14.0
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * KafkaUpdateRequest
 */
@JsonPropertyOrder({
  KafkaUpdateRequest.JSON_PROPERTY_OWNER,
  KafkaUpdateRequest.JSON_PROPERTY_REAUTHENTICATION_ENABLED
})
@JsonTypeName("KafkaUpdateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KafkaUpdateRequest {
  public static final String JSON_PROPERTY_OWNER = "owner";
  private JsonNullable<String> owner = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REAUTHENTICATION_ENABLED = "reauthentication_enabled";
  private JsonNullable<Boolean> reauthenticationEnabled = JsonNullable.<Boolean>undefined();

  public KafkaUpdateRequest() { 
  }

  public KafkaUpdateRequest owner(String owner) {
    this.owner = JsonNullable.<String>of(owner);
    
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getOwner() {
        return owner.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOwner_JsonNullable() {
    return owner;
  }
  
  @JsonProperty(JSON_PROPERTY_OWNER)
  public void setOwner_JsonNullable(JsonNullable<String> owner) {
    this.owner = owner;
  }

  public void setOwner(String owner) {
    this.owner = JsonNullable.<String>of(owner);
  }


  public KafkaUpdateRequest reauthenticationEnabled(Boolean reauthenticationEnabled) {
    this.reauthenticationEnabled = JsonNullable.<Boolean>of(reauthenticationEnabled);
    
    return this;
  }

   /**
   * Whether connection reauthentication is enabled or not. If set to true, connection reauthentication on the Kafka instance will be required every 5 minutes.
   * @return reauthenticationEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether connection reauthentication is enabled or not. If set to true, connection reauthentication on the Kafka instance will be required every 5 minutes.")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KafkaUpdateRequest kafkaUpdateRequest = (KafkaUpdateRequest) o;
    return equalsNullable(this.owner, kafkaUpdateRequest.owner) &&
        equalsNullable(this.reauthenticationEnabled, kafkaUpdateRequest.reauthenticationEnabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(owner), hashCodeNullable(reauthenticationEnabled));
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
    sb.append("class KafkaUpdateRequest {\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

