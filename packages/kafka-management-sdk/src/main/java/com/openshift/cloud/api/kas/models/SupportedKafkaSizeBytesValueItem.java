/*
 * Kafka Service Fleet Manager
 * Kafka Service Fleet Manager is a Rest API to manage Kafka instances.
 *
 * The version of the OpenAPI document: 1.8.0
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SupportedKafkaSizeBytesValueItem
 */
@JsonPropertyOrder({
  SupportedKafkaSizeBytesValueItem.JSON_PROPERTY_BYTES
})
@JsonTypeName("SupportedKafkaSizeBytesValueItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SupportedKafkaSizeBytesValueItem {
  public static final String JSON_PROPERTY_BYTES = "bytes";
  private Long bytes;

  public SupportedKafkaSizeBytesValueItem() { 
  }

  public SupportedKafkaSizeBytesValueItem bytes(Long bytes) {
    
    this.bytes = bytes;
    return this;
  }

   /**
   * Get bytes
   * @return bytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBytes() {
    return bytes;
  }


  @JsonProperty(JSON_PROPERTY_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBytes(Long bytes) {
    this.bytes = bytes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedKafkaSizeBytesValueItem supportedKafkaSizeBytesValueItem = (SupportedKafkaSizeBytesValueItem) o;
    return Objects.equals(this.bytes, supportedKafkaSizeBytesValueItem.bytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedKafkaSizeBytesValueItem {\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
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

