/*
 * Kafka Admin REST API
 * An API to provide REST endpoints for query Kafka for admin operations
 *
 * The version of the OpenAPI document: 0.11.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.auth.models;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An individual record consumed from a topic or produced to a topic
 */
@ApiModel(description = "An individual record consumed from a topic or produced to a topic")
@JsonPropertyOrder({
  Record1.JSON_PROPERTY_PARTITION,
  Record1.JSON_PROPERTY_OFFSET,
  Record1.JSON_PROPERTY_TIMESTAMP,
  Record1.JSON_PROPERTY_TIMESTAMP_TYPE,
  Record1.JSON_PROPERTY_HEADERS,
  Record1.JSON_PROPERTY_KEY,
  Record1.JSON_PROPERTY_VALUE
})
@JsonTypeName("Record_1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Record1 {
  public static final String JSON_PROPERTY_PARTITION = "partition";
  private Integer partition;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Long offset;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_TIMESTAMP_TYPE = "timestampType";
  private String timestampType;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private Map<String, String> headers = null;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public Record1() { 
  }

  @JsonCreator
  public Record1(
    @JsonProperty(JSON_PROPERTY_OFFSET) Long offset, 
    @JsonProperty(JSON_PROPERTY_TIMESTAMP_TYPE) String timestampType
  ) {
    this();
    this.offset = offset;
    this.timestampType = timestampType;
  }

  public Record1 partition(Integer partition) {
    
    this.partition = partition;
    return this;
  }

   /**
   * The record&#39;s partition within the topic
   * @return partition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The record's partition within the topic")
  @JsonProperty(JSON_PROPERTY_PARTITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPartition() {
    return partition;
  }


  @JsonProperty(JSON_PROPERTY_PARTITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartition(Integer partition) {
    this.partition = partition;
  }


   /**
   * The record&#39;s offset within the topic partition
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The record's offset within the topic partition")
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOffset() {
    return offset;
  }




  public Record1 timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp associated with the record. The type is indicated by &#x60;timestampType&#x60;. When producing a record, this value will be used as the record&#39;s &#x60;CREATE_TIME&#x60;.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp associated with the record. The type is indicated by `timestampType`. When producing a record, this value will be used as the record's `CREATE_TIME`.")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


   /**
   * Type of timestamp associated with the record
   * @return timestampType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of timestamp associated with the record")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimestampType() {
    return timestampType;
  }




  public Record1 headers(Map<String, String> headers) {
    
    this.headers = headers;
    return this;
  }

  public Record1 putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Record headers, key/value pairs
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Record headers, key/value pairs")
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  public Record1 key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Record key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Record key")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  public Record1 value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Record value
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Record value")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Record1 record1 = (Record1) o;
    return Objects.equals(this.partition, record1.partition) &&
        Objects.equals(this.offset, record1.offset) &&
        Objects.equals(this.timestamp, record1.timestamp) &&
        Objects.equals(this.timestampType, record1.timestampType) &&
        Objects.equals(this.headers, record1.headers) &&
        Objects.equals(this.key, record1.key) &&
        Objects.equals(this.value, record1.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partition, offset, timestamp, timestampType, headers, key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Record1 {\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    timestampType: ").append(toIndentedString(timestampType)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

