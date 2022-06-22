/*
 * Kafka Service Fleet Manager
 * Kafka Service Fleet Manager is a Rest API to manage Kafka instances.
 *
 * The version of the OpenAPI document: 1.10.0
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
 * SsoProviderAllOf
 */
@JsonPropertyOrder({
  SsoProviderAllOf.JSON_PROPERTY_NAME,
  SsoProviderAllOf.JSON_PROPERTY_BASE_URL,
  SsoProviderAllOf.JSON_PROPERTY_TOKEN_URL,
  SsoProviderAllOf.JSON_PROPERTY_JWKS,
  SsoProviderAllOf.JSON_PROPERTY_VALID_ISSUER
})
@JsonTypeName("SsoProvider_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SsoProviderAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_BASE_URL = "base_url";
  private String baseUrl;

  public static final String JSON_PROPERTY_TOKEN_URL = "token_url";
  private String tokenUrl;

  public static final String JSON_PROPERTY_JWKS = "jwks";
  private String jwks;

  public static final String JSON_PROPERTY_VALID_ISSUER = "valid_issuer";
  private String validIssuer;

  public SsoProviderAllOf() { 
  }

  public SsoProviderAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of the sso provider
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name of the sso provider")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public SsoProviderAllOf baseUrl(String baseUrl) {
    
    this.baseUrl = baseUrl;
    return this;
  }

   /**
   * base url
   * @return baseUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "base url")
  @JsonProperty(JSON_PROPERTY_BASE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBaseUrl() {
    return baseUrl;
  }


  @JsonProperty(JSON_PROPERTY_BASE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }


  public SsoProviderAllOf tokenUrl(String tokenUrl) {
    
    this.tokenUrl = tokenUrl;
    return this;
  }

   /**
   * Get tokenUrl
   * @return tokenUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenUrl() {
    return tokenUrl;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenUrl(String tokenUrl) {
    this.tokenUrl = tokenUrl;
  }


  public SsoProviderAllOf jwks(String jwks) {
    
    this.jwks = jwks;
    return this;
  }

   /**
   * Get jwks
   * @return jwks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JWKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJwks() {
    return jwks;
  }


  @JsonProperty(JSON_PROPERTY_JWKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJwks(String jwks) {
    this.jwks = jwks;
  }


  public SsoProviderAllOf validIssuer(String validIssuer) {
    
    this.validIssuer = validIssuer;
    return this;
  }

   /**
   * Get validIssuer
   * @return validIssuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALID_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidIssuer() {
    return validIssuer;
  }


  @JsonProperty(JSON_PROPERTY_VALID_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidIssuer(String validIssuer) {
    this.validIssuer = validIssuer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoProviderAllOf ssoProviderAllOf = (SsoProviderAllOf) o;
    return Objects.equals(this.name, ssoProviderAllOf.name) &&
        Objects.equals(this.baseUrl, ssoProviderAllOf.baseUrl) &&
        Objects.equals(this.tokenUrl, ssoProviderAllOf.tokenUrl) &&
        Objects.equals(this.jwks, ssoProviderAllOf.jwks) &&
        Objects.equals(this.validIssuer, ssoProviderAllOf.validIssuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, baseUrl, tokenUrl, jwks, validIssuer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsoProviderAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
    sb.append("    jwks: ").append(toIndentedString(jwks)).append("\n");
    sb.append("    validIssuer: ").append(toIndentedString(validIssuer)).append("\n");
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

