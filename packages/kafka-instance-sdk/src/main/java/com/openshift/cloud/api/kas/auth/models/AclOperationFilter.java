/*
 * Kafka Instance API
 * API for interacting with Kafka Instance. Includes Produce, Consume and Admin APIs
 *
 * The version of the OpenAPI document: 0.12.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.auth.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AclOperationFilter
 */
public enum AclOperationFilter {
  
  ALL("ALL"),
  
  READ("READ"),
  
  WRITE("WRITE"),
  
  CREATE("CREATE"),
  
  DELETE("DELETE"),
  
  ALTER("ALTER"),
  
  DESCRIBE("DESCRIBE"),
  
  DESCRIBE_CONFIGS("DESCRIBE_CONFIGS"),
  
  ALTER_CONFIGS("ALTER_CONFIGS"),
  
  ANY("ANY");

  private String value;

  AclOperationFilter(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AclOperationFilter fromValue(String value) {
    for (AclOperationFilter b : AclOperationFilter.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

