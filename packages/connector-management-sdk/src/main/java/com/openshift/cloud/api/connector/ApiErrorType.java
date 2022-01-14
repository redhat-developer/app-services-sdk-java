package com.openshift.cloud.api.connector;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 *  Contains the possible error codes returned by API
 */
public enum ApiErrorType {
  
    /** Forbidden to perform this action*/
  ERROR_4("KAFKAS-MGMT-4"), 

  /** Forbidden to create more instances than the maximum allowed*/
  ERROR_5("KAFKAS-MGMT-5"), 

  /** An entity with the specified unique values already exists*/
  ERROR_6("KAFKAS-MGMT-6"), 

  /** Resource not found*/
  ERROR_7("KAFKAS-MGMT-7"), 

  /** General validation failure*/
  ERROR_8("KAFKAS-MGMT-8"), 

  /** Unspecified error*/
  ERROR_9("KAFKAS-MGMT-9"), 

  /** HTTP Method not implemented for this endpoint*/
  ERROR_10("KAFKAS-MGMT-10"), 

  /** Account is unauthorized to perform this action*/
  ERROR_11("KAFKAS-MGMT-11"), 

  /** Required terms have not been accepted*/
  ERROR_12("KAFKAS-MGMT-12"), 

  /** Account authentication could not be verified*/
  ERROR_15("KAFKAS-MGMT-15"), 

  /** Unable to read request body*/
  ERROR_17("KAFKAS-MGMT-17"), 

  /** Bad request*/
  ERROR_21("KAFKAS-MGMT-21"), 

  /** Failed to parse search query*/
  ERROR_23("KAFKAS-MGMT-23"), 

  /** The maximum number of allowed kafka instances has been reached*/
  ERROR_24("KAFKAS-MGMT-24"), 

  /** Resource gone*/
  ERROR_25("KAFKAS-MGMT-25"), 

  /** Provider not supported*/
  ERROR_30("KAFKAS-MGMT-30"), 

  /** Region not supported*/
  ERROR_31("KAFKAS-MGMT-31"), 

  /** Kafka cluster name is invalid*/
  ERROR_32("KAFKAS-MGMT-32"), 

  /** Minimum field length not reached*/
  ERROR_33("KAFKAS-MGMT-33"), 

  /** Maximum field length has been depassed*/
  ERROR_34("KAFKAS-MGMT-34"), 

  /** Only multiAZ Kafkas are supported, use multi_az=true*/
  ERROR_35("KAFKAS-MGMT-35"), 

  /** Kafka cluster name is already used*/
  ERROR_36("KAFKAS-MGMT-36"), 

  /** Field validation failed*/
  ERROR_37("KAFKAS-MGMT-37"), 

  /** Service account name is invalid*/
  ERROR_38("KAFKAS-MGMT-38"), 

  /** Service account desc is invalid*/
  ERROR_39("KAFKAS-MGMT-39"), 

  /** Service account id is invalid*/
  ERROR_40("KAFKAS-MGMT-40"), 

  /** Instance Type not supported*/
  ERROR_41("KAFKAS-MGMT-41"), 

  /** Synchronous action is not supported, use async=true parameter*/
  ERROR_103("KAFKAS-MGMT-103"), 

  /** Failed to create kafka client in the mas sso*/
  ERROR_106("KAFKAS-MGMT-106"), 

  /** Failed to get kafka client secret from the mas sso*/
  ERROR_107("KAFKAS-MGMT-107"), 

  /** Failed to get kafka client from the mas sso*/
  ERROR_108("KAFKAS-MGMT-108"), 

  /** Failed to delete kafka client from the mas sso*/
  ERROR_109("KAFKAS-MGMT-109"), 

  /** Failed to create service account*/
  ERROR_110("KAFKAS-MGMT-110"), 

  /** Failed to get service account*/
  ERROR_111("KAFKAS-MGMT-111"), 

  /** Failed to delete service account*/
  ERROR_112("KAFKAS-MGMT-112"), 

  /** Failed to find service account*/
  ERROR_113("KAFKAS-MGMT-113"), 

  /** Insufficient quota*/
  ERROR_120("KAFKAS-MGMT-120"), 

  /** Failed to check quota*/
  ERROR_121("KAFKAS-MGMT-121"), 

  /** Too Many requests*/
  ERROR_429("KAFKAS-MGMT-429"), 

  /** An unexpected error happened, please check the log of the service for details*/
  ERROR_1000("KAFKAS-MGMT-1000"); 


 
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

