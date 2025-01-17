/*
 * LogSentinel RESTful API
 * Read more at https://logsentinel.com/docs
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * LogResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-24T18:34:16.973Z")
public class LogResponse {
  @SerializedName("lastKnownHash")
  private String lastKnownHash = null;

  @SerializedName("logEntryId")
  private String logEntryId = null;
  
  @SerializedName("standaloneHash")
  private String standaloneHash = null;
  
  public LogResponse lastKnownHash(String lastKnownHash) {
    this.lastKnownHash = lastKnownHash;
    return this;
  }

   /**
   * Get lastKnownHash
   * @return lastKnownHash
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastKnownHash() {
    return lastKnownHash;
  }

  public void setLastKnownHash(String lastKnownHash) {
    this.lastKnownHash = lastKnownHash;
  }

  public LogResponse logEntryId(String logEntryId) {
    this.logEntryId = logEntryId;
    return this;
  }

   /**
   * Get logEntryId
   * @return logEntryId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLogEntryId() {
    return logEntryId;
  }

  public void setLogEntryId(String logEntryId) {
    this.logEntryId = logEntryId;
  }

  @ApiModelProperty(example = "null", value = "")
  public String getStandaloneHash() {
    return standaloneHash;
  }

  public void setStandaloneHash(String standaloneHash) {
    this.standaloneHash = standaloneHash;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogResponse logResponse = (LogResponse) o;
    return Objects.equals(this.lastKnownHash, logResponse.lastKnownHash) &&
        Objects.equals(this.logEntryId, logResponse.logEntryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastKnownHash, logEntryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogResponse {\n");
    
    sb.append("    lastKnownHash: ").append(toIndentedString(lastKnownHash)).append("\n");
    sb.append("    logEntryId: ").append(toIndentedString(logEntryId)).append("\n");
    sb.append("    standaloneHash: ").append(toIndentedString(standaloneHash)).append("\n");
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

