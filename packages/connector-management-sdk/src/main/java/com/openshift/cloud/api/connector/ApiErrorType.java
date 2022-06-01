package com.openshift.cloud.api.connector;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 *  Contains the possible error codes returned by API
 */
public enum ApiErrorType {
  
    /** Forbidden to perform this action*/
  ERROR_4("CONNECTOR-MGMT-4"), 

  /** Forbidden to create more instances than the maximum allowed*/
  ERROR_5("CONNECTOR-MGMT-5"), 

  /** An entity with the specified unique values already exists*/
  ERROR_6("CONNECTOR-MGMT-6"), 

  /** Resource not found*/
  ERROR_7("CONNECTOR-MGMT-7"), 

  /** General validation failure*/
  ERROR_8("CONNECTOR-MGMT-8"), 

  /** Unspecified error*/
  ERROR_9("CONNECTOR-MGMT-9"), 

  /** HTTP Method not implemented for this endpoint*/
  ERROR_10("CONNECTOR-MGMT-10"), 

  /** Account is unauthorized to perform this action*/
  ERROR_11("CONNECTOR-MGMT-11"), 

  /** Required terms have not been accepted*/
  ERROR_12("CONNECTOR-MGMT-12"), 

  /** Account authentication could not be verified*/
  ERROR_15("CONNECTOR-MGMT-15"), 

  /** Unable to read request body*/
  ERROR_17("CONNECTOR-MGMT-17"), 

  /** Bad request*/
  ERROR_21("CONNECTOR-MGMT-21"), 

  /** Failed to parse search query*/
  ERROR_23("CONNECTOR-MGMT-23"), 

  /** The maximum number of allowed kafka instances has been reached*/
  ERROR_24("CONNECTOR-MGMT-24"), 

  /** Resource gone*/
  ERROR_25("CONNECTOR-MGMT-25"), 

  /** Provider not supported*/
  ERROR_30("CONNECTOR-MGMT-30"), 

  /** Region not supported*/
  ERROR_31("CONNECTOR-MGMT-31"), 

  /** Kafka cluster name is invalid*/
  ERROR_32("CONNECTOR-MGMT-32"), 

  /** Minimum field length not reached*/
  ERROR_33("CONNECTOR-MGMT-33"), 

  /** Maximum field length has been depassed*/
  ERROR_34("CONNECTOR-MGMT-34"), 

  /** Only multiAZ Kafkas are supported, use multi_az=true*/
  ERROR_35("CONNECTOR-MGMT-35"), 

  /** Kafka cluster name is already used*/
  ERROR_36("CONNECTOR-MGMT-36"), 

  /** Field validation failed*/
  ERROR_37("CONNECTOR-MGMT-37"), 

  /** Service account name is invalid*/
  ERROR_38("CONNECTOR-MGMT-38"), 

  /** Service account desc is invalid*/
  ERROR_39("CONNECTOR-MGMT-39"), 

  /** Service account id is invalid*/
  ERROR_40("CONNECTOR-MGMT-40"), 

  /** Instance Type not supported*/
  ERROR_41("CONNECTOR-MGMT-41"), 

  /** Synchronous action is not supported, use async=true parameter*/
  ERROR_103("CONNECTOR-MGMT-103"), 

  /** Failed to create kafka client in the mas sso*/
  ERROR_106("CONNECTOR-MGMT-106"), 

  /** Failed to get kafka client secret from the mas sso*/
  ERROR_107("CONNECTOR-MGMT-107"), 

  /** Failed to get kafka client from the mas sso*/
  ERROR_108("CONNECTOR-MGMT-108"), 

  /** Failed to delete kafka client from the mas sso*/
  ERROR_109("CONNECTOR-MGMT-109"), 

  /** Failed to create service account*/
  ERROR_110("CONNECTOR-MGMT-110"), 

  /** Failed to get service account*/
  ERROR_111("CONNECTOR-MGMT-111"), 

  /** Failed to delete service account*/
  ERROR_112("CONNECTOR-MGMT-112"), 

  /** Failed to find service account*/
  ERROR_113("CONNECTOR-MGMT-113"), 

  /** Insufficient quota*/
  ERROR_120("CONNECTOR-MGMT-120"), 

  /** Failed to check quota*/
  ERROR_121("CONNECTOR-MGMT-121"), 

  /** Too Many requests*/
  ERROR_429("CONNECTOR-MGMT-429"), 

  /** An unexpected error happened, please check the log of the service for details*/
  ERROR_1000("CONNECTOR-MGMT-1000"); 


 
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

