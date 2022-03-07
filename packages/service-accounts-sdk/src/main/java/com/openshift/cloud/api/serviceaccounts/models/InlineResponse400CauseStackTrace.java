/*
 * Service Accounts API Documentation
 * This is the API documentation for Service Accounts
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.serviceaccounts.models;

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
 * InlineResponse400CauseStackTrace
 */
@JsonPropertyOrder({
  InlineResponse400CauseStackTrace.JSON_PROPERTY_METHOD_NAME,
  InlineResponse400CauseStackTrace.JSON_PROPERTY_FILE_NAME,
  InlineResponse400CauseStackTrace.JSON_PROPERTY_LINE_NUMBER,
  InlineResponse400CauseStackTrace.JSON_PROPERTY_CLASS_NAME,
  InlineResponse400CauseStackTrace.JSON_PROPERTY_NATIVE_METHOD
})
@JsonTypeName("inline_response_400_cause_stackTrace")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse400CauseStackTrace {
  public static final String JSON_PROPERTY_METHOD_NAME = "methodName";
  private String methodName;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_LINE_NUMBER = "lineNumber";
  private Integer lineNumber;

  public static final String JSON_PROPERTY_CLASS_NAME = "className";
  private String className;

  public static final String JSON_PROPERTY_NATIVE_METHOD = "nativeMethod";
  private Boolean nativeMethod;

  public InlineResponse400CauseStackTrace() { 
  }

  public InlineResponse400CauseStackTrace methodName(String methodName) {
    
    this.methodName = methodName;
    return this;
  }

   /**
   * Get methodName
   * @return methodName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METHOD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMethodName() {
    return methodName;
  }


  @JsonProperty(JSON_PROPERTY_METHOD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }


  public InlineResponse400CauseStackTrace fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public InlineResponse400CauseStackTrace lineNumber(Integer lineNumber) {
    
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * Get lineNumber
   * @return lineNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLineNumber() {
    return lineNumber;
  }


  @JsonProperty(JSON_PROPERTY_LINE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }


  public InlineResponse400CauseStackTrace className(String className) {
    
    this.className = className;
    return this;
  }

   /**
   * Get className
   * @return className
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClassName() {
    return className;
  }


  @JsonProperty(JSON_PROPERTY_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClassName(String className) {
    this.className = className;
  }


  public InlineResponse400CauseStackTrace nativeMethod(Boolean nativeMethod) {
    
    this.nativeMethod = nativeMethod;
    return this;
  }

   /**
   * Get nativeMethod
   * @return nativeMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NATIVE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNativeMethod() {
    return nativeMethod;
  }


  @JsonProperty(JSON_PROPERTY_NATIVE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400CauseStackTrace inlineResponse400CauseStackTrace = (InlineResponse400CauseStackTrace) o;
    return Objects.equals(this.methodName, inlineResponse400CauseStackTrace.methodName) &&
        Objects.equals(this.fileName, inlineResponse400CauseStackTrace.fileName) &&
        Objects.equals(this.lineNumber, inlineResponse400CauseStackTrace.lineNumber) &&
        Objects.equals(this.className, inlineResponse400CauseStackTrace.className) &&
        Objects.equals(this.nativeMethod, inlineResponse400CauseStackTrace.nativeMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodName, fileName, lineNumber, className, nativeMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400CauseStackTrace {\n");
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    nativeMethod: ").append(toIndentedString(nativeMethod)).append("\n");
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

