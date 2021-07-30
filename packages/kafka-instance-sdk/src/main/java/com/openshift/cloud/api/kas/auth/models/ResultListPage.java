/*
 * Kafka Admin REST API
 * An API to provide REST endpoints for query Kafka for admin operations
 *
 * The version of the OpenAPI document: 0.3.0
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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ResultListPage
 */
@JsonPropertyOrder({
  ResultListPage.JSON_PROPERTY_TOTAL,
  ResultListPage.JSON_PROPERTY_PAGE,
  ResultListPage.JSON_PROPERTY_SIZE
})
@JsonTypeName("ResultListPage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResultListPage {
  public static final String JSON_PROPERTY_TOTAL = "total";
  private BigDecimal total;

  public static final String JSON_PROPERTY_PAGE = "page";
  private Integer page;

  public static final String JSON_PROPERTY_SIZE = "size";
  private BigDecimal size;


  public ResultListPage total(BigDecimal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total number of entries in the full result set
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of entries in the full result set")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public ResultListPage page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Current page number
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current page number")
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(Integer page) {
    this.page = page;
  }


  public ResultListPage size(BigDecimal size) {
    
    this.size = size;
    return this;
  }

   /**
   * Number of entries per page
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of entries per page")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(BigDecimal size) {
    this.size = size;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultListPage resultListPage = (ResultListPage) o;
    return Objects.equals(this.total, resultListPage.total) &&
        Objects.equals(this.page, resultListPage.page) &&
        Objects.equals(this.size, resultListPage.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, page, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListPage {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

