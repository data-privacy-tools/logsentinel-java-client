/*
 * LogSentinel RESTful API
 * Read more at https://docs.logsentinel.com/en/latest/index.html
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * GDPRRequest
 */

public class GDPRRequest {
  @JsonProperty("additionalDetails")
  private String additionalDetails = null;

  @JsonProperty("dataSubjectId")
  private String dataSubjectId = null;

  @JsonProperty("dataSubjectName")
  private String dataSubjectName = null;

  @JsonProperty("timestamp")
  private Long timestamp = null;

  public GDPRRequest additionalDetails(String additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

   /**
   * Get additionalDetails
   * @return additionalDetails
  **/
  @ApiModelProperty(value = "")
  public String getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(String additionalDetails) {
    this.additionalDetails = additionalDetails;
  }

  public GDPRRequest dataSubjectId(String dataSubjectId) {
    this.dataSubjectId = dataSubjectId;
    return this;
  }

   /**
   * Get dataSubjectId
   * @return dataSubjectId
  **/
  @ApiModelProperty(value = "")
  public String getDataSubjectId() {
    return dataSubjectId;
  }

  public void setDataSubjectId(String dataSubjectId) {
    this.dataSubjectId = dataSubjectId;
  }

  public GDPRRequest dataSubjectName(String dataSubjectName) {
    this.dataSubjectName = dataSubjectName;
    return this;
  }

   /**
   * Get dataSubjectName
   * @return dataSubjectName
  **/
  @ApiModelProperty(value = "")
  public String getDataSubjectName() {
    return dataSubjectName;
  }

  public void setDataSubjectName(String dataSubjectName) {
    this.dataSubjectName = dataSubjectName;
  }

  public GDPRRequest timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GDPRRequest gdPRRequest = (GDPRRequest) o;
    return Objects.equals(this.additionalDetails, gdPRRequest.additionalDetails) &&
        Objects.equals(this.dataSubjectId, gdPRRequest.dataSubjectId) &&
        Objects.equals(this.dataSubjectName, gdPRRequest.dataSubjectName) &&
        Objects.equals(this.timestamp, gdPRRequest.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalDetails, dataSubjectId, dataSubjectName, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GDPRRequest {\n");
    
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
    sb.append("    dataSubjectId: ").append(toIndentedString(dataSubjectId)).append("\n");
    sb.append("    dataSubjectName: ").append(toIndentedString(dataSubjectName)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

