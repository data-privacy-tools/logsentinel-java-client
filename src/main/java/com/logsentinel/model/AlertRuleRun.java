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
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * AlertRuleRun
 */

public class AlertRuleRun {
  @JsonProperty("actualValue")
  private Double actualValue = null;

  @JsonProperty("alertRuleId")
  private UUID alertRuleId = null;

  @JsonProperty("alertRuleName")
  private String alertRuleName = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("executionDuration")
  private Long executionDuration = null;

  @JsonProperty("fired")
  private Boolean fired = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("organizationId")
  private UUID organizationId = null;

  @JsonProperty("threshold")
  private Double threshold = null;

  /**
   * Gets or Sets thresholdType
   */
  public enum ThresholdTypeEnum {
    ABOVE("ABOVE"),
    
    BELOW("BELOW"),
    
    BOTH("BOTH");

    private String value;

    ThresholdTypeEnum(String value) {
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
    public static ThresholdTypeEnum fromValue(String text) {
      for (ThresholdTypeEnum b : ThresholdTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("thresholdType")
  private ThresholdTypeEnum thresholdType = null;

  public AlertRuleRun actualValue(Double actualValue) {
    this.actualValue = actualValue;
    return this;
  }

   /**
   * Get actualValue
   * @return actualValue
  **/
  @ApiModelProperty(value = "")
  public Double getActualValue() {
    return actualValue;
  }

  public void setActualValue(Double actualValue) {
    this.actualValue = actualValue;
  }

  public AlertRuleRun alertRuleId(UUID alertRuleId) {
    this.alertRuleId = alertRuleId;
    return this;
  }

   /**
   * Get alertRuleId
   * @return alertRuleId
  **/
  @ApiModelProperty(value = "")
  public UUID getAlertRuleId() {
    return alertRuleId;
  }

  public void setAlertRuleId(UUID alertRuleId) {
    this.alertRuleId = alertRuleId;
  }

  public AlertRuleRun alertRuleName(String alertRuleName) {
    this.alertRuleName = alertRuleName;
    return this;
  }

   /**
   * Get alertRuleName
   * @return alertRuleName
  **/
  @ApiModelProperty(value = "")
  public String getAlertRuleName() {
    return alertRuleName;
  }

  public void setAlertRuleName(String alertRuleName) {
    this.alertRuleName = alertRuleName;
  }

  public AlertRuleRun created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public AlertRuleRun executionDuration(Long executionDuration) {
    this.executionDuration = executionDuration;
    return this;
  }

   /**
   * Get executionDuration
   * @return executionDuration
  **/
  @ApiModelProperty(value = "")
  public Long getExecutionDuration() {
    return executionDuration;
  }

  public void setExecutionDuration(Long executionDuration) {
    this.executionDuration = executionDuration;
  }

  public AlertRuleRun fired(Boolean fired) {
    this.fired = fired;
    return this;
  }

   /**
   * Get fired
   * @return fired
  **/
  @ApiModelProperty(value = "")
  public Boolean isFired() {
    return fired;
  }

  public void setFired(Boolean fired) {
    this.fired = fired;
  }

  public AlertRuleRun id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public AlertRuleRun organizationId(UUID organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(value = "")
  public UUID getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }

  public AlertRuleRun threshold(Double threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @ApiModelProperty(value = "")
  public Double getThreshold() {
    return threshold;
  }

  public void setThreshold(Double threshold) {
    this.threshold = threshold;
  }

  public AlertRuleRun thresholdType(ThresholdTypeEnum thresholdType) {
    this.thresholdType = thresholdType;
    return this;
  }

   /**
   * Get thresholdType
   * @return thresholdType
  **/
  @ApiModelProperty(value = "")
  public ThresholdTypeEnum getThresholdType() {
    return thresholdType;
  }

  public void setThresholdType(ThresholdTypeEnum thresholdType) {
    this.thresholdType = thresholdType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertRuleRun alertRuleRun = (AlertRuleRun) o;
    return Objects.equals(this.actualValue, alertRuleRun.actualValue) &&
        Objects.equals(this.alertRuleId, alertRuleRun.alertRuleId) &&
        Objects.equals(this.alertRuleName, alertRuleRun.alertRuleName) &&
        Objects.equals(this.created, alertRuleRun.created) &&
        Objects.equals(this.executionDuration, alertRuleRun.executionDuration) &&
        Objects.equals(this.fired, alertRuleRun.fired) &&
        Objects.equals(this.id, alertRuleRun.id) &&
        Objects.equals(this.organizationId, alertRuleRun.organizationId) &&
        Objects.equals(this.threshold, alertRuleRun.threshold) &&
        Objects.equals(this.thresholdType, alertRuleRun.thresholdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualValue, alertRuleId, alertRuleName, created, executionDuration, fired, id, organizationId, threshold, thresholdType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertRuleRun {\n");
    
    sb.append("    actualValue: ").append(toIndentedString(actualValue)).append("\n");
    sb.append("    alertRuleId: ").append(toIndentedString(alertRuleId)).append("\n");
    sb.append("    alertRuleName: ").append(toIndentedString(alertRuleName)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    executionDuration: ").append(toIndentedString(executionDuration)).append("\n");
    sb.append("    fired: ").append(toIndentedString(fired)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    thresholdType: ").append(toIndentedString(thresholdType)).append("\n");
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

