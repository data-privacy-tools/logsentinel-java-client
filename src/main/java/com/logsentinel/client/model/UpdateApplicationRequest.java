/*
 * LogSentinel RESTful API
 * Read more at http://localhost:8080/docs
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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UpdateApplicationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T10:33:18.929+03:00")
public class UpdateApplicationRequest {
  @SerializedName("containsPersonalData")
  private Boolean containsPersonalData = null;

  @SerializedName("detailsTransformationScript")
  private String detailsTransformationScript = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("ipWhiteList")
  private List<String> ipWhiteList = null;

  @SerializedName("latestHashRecipientEmails")
  private List<String> latestHashRecipientEmails = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("partialVerificationPeriodMinutes")
  private Integer partialVerificationPeriodMinutes = null;

  @SerializedName("signatureVerificationPublicKeys")
  private List<String> signatureVerificationPublicKeys = null;

  @SerializedName("storeHashesInEthereum")
  private Boolean storeHashesInEthereum = null;

  @SerializedName("verificationFailureReportRecipientEmails")
  private List<String> verificationFailureReportRecipientEmails = null;

  @SerializedName("verificationPeriodMinutes")
  private Integer verificationPeriodMinutes = null;

  public UpdateApplicationRequest containsPersonalData(Boolean containsPersonalData) {
    this.containsPersonalData = containsPersonalData;
    return this;
  }

   /**
   * Get containsPersonalData
   * @return containsPersonalData
  **/
  @ApiModelProperty(value = "")
  public Boolean isContainsPersonalData() {
    return containsPersonalData;
  }

  public void setContainsPersonalData(Boolean containsPersonalData) {
    this.containsPersonalData = containsPersonalData;
  }

  public UpdateApplicationRequest detailsTransformationScript(String detailsTransformationScript) {
    this.detailsTransformationScript = detailsTransformationScript;
    return this;
  }

   /**
   * Get detailsTransformationScript
   * @return detailsTransformationScript
  **/
  @ApiModelProperty(value = "")
  public String getDetailsTransformationScript() {
    return detailsTransformationScript;
  }

  public void setDetailsTransformationScript(String detailsTransformationScript) {
    this.detailsTransformationScript = detailsTransformationScript;
  }

  public UpdateApplicationRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateApplicationRequest ipWhiteList(List<String> ipWhiteList) {
    this.ipWhiteList = ipWhiteList;
    return this;
  }

  public UpdateApplicationRequest addIpWhiteListItem(String ipWhiteListItem) {
    if (this.ipWhiteList == null) {
      this.ipWhiteList = new ArrayList<String>();
    }
    this.ipWhiteList.add(ipWhiteListItem);
    return this;
  }

   /**
   * Get ipWhiteList
   * @return ipWhiteList
  **/
  @ApiModelProperty(value = "")
  public List<String> getIpWhiteList() {
    return ipWhiteList;
  }

  public void setIpWhiteList(List<String> ipWhiteList) {
    this.ipWhiteList = ipWhiteList;
  }

  public UpdateApplicationRequest latestHashRecipientEmails(List<String> latestHashRecipientEmails) {
    this.latestHashRecipientEmails = latestHashRecipientEmails;
    return this;
  }

  public UpdateApplicationRequest addLatestHashRecipientEmailsItem(String latestHashRecipientEmailsItem) {
    if (this.latestHashRecipientEmails == null) {
      this.latestHashRecipientEmails = new ArrayList<String>();
    }
    this.latestHashRecipientEmails.add(latestHashRecipientEmailsItem);
    return this;
  }

   /**
   * Get latestHashRecipientEmails
   * @return latestHashRecipientEmails
  **/
  @ApiModelProperty(value = "")
  public List<String> getLatestHashRecipientEmails() {
    return latestHashRecipientEmails;
  }

  public void setLatestHashRecipientEmails(List<String> latestHashRecipientEmails) {
    this.latestHashRecipientEmails = latestHashRecipientEmails;
  }

  public UpdateApplicationRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateApplicationRequest partialVerificationPeriodMinutes(Integer partialVerificationPeriodMinutes) {
    this.partialVerificationPeriodMinutes = partialVerificationPeriodMinutes;
    return this;
  }

   /**
   * Get partialVerificationPeriodMinutes
   * @return partialVerificationPeriodMinutes
  **/
  @ApiModelProperty(value = "")
  public Integer getPartialVerificationPeriodMinutes() {
    return partialVerificationPeriodMinutes;
  }

  public void setPartialVerificationPeriodMinutes(Integer partialVerificationPeriodMinutes) {
    this.partialVerificationPeriodMinutes = partialVerificationPeriodMinutes;
  }

  public UpdateApplicationRequest signatureVerificationPublicKeys(List<String> signatureVerificationPublicKeys) {
    this.signatureVerificationPublicKeys = signatureVerificationPublicKeys;
    return this;
  }

  public UpdateApplicationRequest addSignatureVerificationPublicKeysItem(String signatureVerificationPublicKeysItem) {
    if (this.signatureVerificationPublicKeys == null) {
      this.signatureVerificationPublicKeys = new ArrayList<String>();
    }
    this.signatureVerificationPublicKeys.add(signatureVerificationPublicKeysItem);
    return this;
  }

   /**
   * Get signatureVerificationPublicKeys
   * @return signatureVerificationPublicKeys
  **/
  @ApiModelProperty(value = "")
  public List<String> getSignatureVerificationPublicKeys() {
    return signatureVerificationPublicKeys;
  }

  public void setSignatureVerificationPublicKeys(List<String> signatureVerificationPublicKeys) {
    this.signatureVerificationPublicKeys = signatureVerificationPublicKeys;
  }

  public UpdateApplicationRequest storeHashesInEthereum(Boolean storeHashesInEthereum) {
    this.storeHashesInEthereum = storeHashesInEthereum;
    return this;
  }

   /**
   * Get storeHashesInEthereum
   * @return storeHashesInEthereum
  **/
  @ApiModelProperty(value = "")
  public Boolean isStoreHashesInEthereum() {
    return storeHashesInEthereum;
  }

  public void setStoreHashesInEthereum(Boolean storeHashesInEthereum) {
    this.storeHashesInEthereum = storeHashesInEthereum;
  }

  public UpdateApplicationRequest verificationFailureReportRecipientEmails(List<String> verificationFailureReportRecipientEmails) {
    this.verificationFailureReportRecipientEmails = verificationFailureReportRecipientEmails;
    return this;
  }

  public UpdateApplicationRequest addVerificationFailureReportRecipientEmailsItem(String verificationFailureReportRecipientEmailsItem) {
    if (this.verificationFailureReportRecipientEmails == null) {
      this.verificationFailureReportRecipientEmails = new ArrayList<String>();
    }
    this.verificationFailureReportRecipientEmails.add(verificationFailureReportRecipientEmailsItem);
    return this;
  }

   /**
   * Get verificationFailureReportRecipientEmails
   * @return verificationFailureReportRecipientEmails
  **/
  @ApiModelProperty(value = "")
  public List<String> getVerificationFailureReportRecipientEmails() {
    return verificationFailureReportRecipientEmails;
  }

  public void setVerificationFailureReportRecipientEmails(List<String> verificationFailureReportRecipientEmails) {
    this.verificationFailureReportRecipientEmails = verificationFailureReportRecipientEmails;
  }

  public UpdateApplicationRequest verificationPeriodMinutes(Integer verificationPeriodMinutes) {
    this.verificationPeriodMinutes = verificationPeriodMinutes;
    return this;
  }

   /**
   * Get verificationPeriodMinutes
   * @return verificationPeriodMinutes
  **/
  @ApiModelProperty(value = "")
  public Integer getVerificationPeriodMinutes() {
    return verificationPeriodMinutes;
  }

  public void setVerificationPeriodMinutes(Integer verificationPeriodMinutes) {
    this.verificationPeriodMinutes = verificationPeriodMinutes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateApplicationRequest updateApplicationRequest = (UpdateApplicationRequest) o;
    return Objects.equals(this.containsPersonalData, updateApplicationRequest.containsPersonalData) &&
        Objects.equals(this.detailsTransformationScript, updateApplicationRequest.detailsTransformationScript) &&
        Objects.equals(this.id, updateApplicationRequest.id) &&
        Objects.equals(this.ipWhiteList, updateApplicationRequest.ipWhiteList) &&
        Objects.equals(this.latestHashRecipientEmails, updateApplicationRequest.latestHashRecipientEmails) &&
        Objects.equals(this.name, updateApplicationRequest.name) &&
        Objects.equals(this.partialVerificationPeriodMinutes, updateApplicationRequest.partialVerificationPeriodMinutes) &&
        Objects.equals(this.signatureVerificationPublicKeys, updateApplicationRequest.signatureVerificationPublicKeys) &&
        Objects.equals(this.storeHashesInEthereum, updateApplicationRequest.storeHashesInEthereum) &&
        Objects.equals(this.verificationFailureReportRecipientEmails, updateApplicationRequest.verificationFailureReportRecipientEmails) &&
        Objects.equals(this.verificationPeriodMinutes, updateApplicationRequest.verificationPeriodMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containsPersonalData, detailsTransformationScript, id, ipWhiteList, latestHashRecipientEmails, name, partialVerificationPeriodMinutes, signatureVerificationPublicKeys, storeHashesInEthereum, verificationFailureReportRecipientEmails, verificationPeriodMinutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateApplicationRequest {\n");
    
    sb.append("    containsPersonalData: ").append(toIndentedString(containsPersonalData)).append("\n");
    sb.append("    detailsTransformationScript: ").append(toIndentedString(detailsTransformationScript)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipWhiteList: ").append(toIndentedString(ipWhiteList)).append("\n");
    sb.append("    latestHashRecipientEmails: ").append(toIndentedString(latestHashRecipientEmails)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partialVerificationPeriodMinutes: ").append(toIndentedString(partialVerificationPeriodMinutes)).append("\n");
    sb.append("    signatureVerificationPublicKeys: ").append(toIndentedString(signatureVerificationPublicKeys)).append("\n");
    sb.append("    storeHashesInEthereum: ").append(toIndentedString(storeHashesInEthereum)).append("\n");
    sb.append("    verificationFailureReportRecipientEmails: ").append(toIndentedString(verificationFailureReportRecipientEmails)).append("\n");
    sb.append("    verificationPeriodMinutes: ").append(toIndentedString(verificationPeriodMinutes)).append("\n");
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

