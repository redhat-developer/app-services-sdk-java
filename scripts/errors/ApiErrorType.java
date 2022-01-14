package com.openshift.cloud.api.PACKAGE_REPLACE;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 *  Contains the possible error codes returned by API
 */
public enum ApiErrorType {
  
  PLACEHOLDER
 
  private String value;

  ApiErrorType(String value) {
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
  public static ApiErrorType fromValue(String value) {
    for (ApiErrorType b : ApiErrorType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

