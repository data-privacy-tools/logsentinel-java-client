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
 * TreeHead
 */

public class TreeHead {
  @JsonProperty("rootHash")
  private byte[] rootHash = null;

  @JsonProperty("timestampToken")
  private String timestampToken = null;

  @JsonProperty("treeSize")
  private Integer treeSize = null;

  public TreeHead rootHash(byte[] rootHash) {
    this.rootHash = rootHash;
    return this;
  }

   /**
   * Get rootHash
   * @return rootHash
  **/
  @ApiModelProperty(value = "")
  public byte[] getRootHash() {
    return rootHash;
  }

  public void setRootHash(byte[] rootHash) {
    this.rootHash = rootHash;
  }

  public TreeHead timestampToken(String timestampToken) {
    this.timestampToken = timestampToken;
    return this;
  }

   /**
   * Get timestampToken
   * @return timestampToken
  **/
  @ApiModelProperty(value = "")
  public String getTimestampToken() {
    return timestampToken;
  }

  public void setTimestampToken(String timestampToken) {
    this.timestampToken = timestampToken;
  }

  public TreeHead treeSize(Integer treeSize) {
    this.treeSize = treeSize;
    return this;
  }

   /**
   * Get treeSize
   * @return treeSize
  **/
  @ApiModelProperty(value = "")
  public Integer getTreeSize() {
    return treeSize;
  }

  public void setTreeSize(Integer treeSize) {
    this.treeSize = treeSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreeHead treeHead = (TreeHead) o;
    return Objects.equals(this.rootHash, treeHead.rootHash) &&
        Objects.equals(this.timestampToken, treeHead.timestampToken) &&
        Objects.equals(this.treeSize, treeHead.treeSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootHash, timestampToken, treeSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreeHead {\n");
    
    sb.append("    rootHash: ").append(toIndentedString(rootHash)).append("\n");
    sb.append("    timestampToken: ").append(toIndentedString(timestampToken)).append("\n");
    sb.append("    treeSize: ").append(toIndentedString(treeSize)).append("\n");
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

