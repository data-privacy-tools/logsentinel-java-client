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

/**
 * UserRegistrationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T10:33:18.929+03:00")
public class UserRegistrationRequest {
  @SerializedName("applicationId")
  private String applicationId = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("expirationDate")
  private String expirationDate = null;

  @SerializedName("names")
  private String names = null;

  @SerializedName("organizationName")
  private String organizationName = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("position")
  private String position = null;

  /**
   * Gets or Sets role
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    ADMIN("ADMIN"),
    
    AUDITOR("AUDITOR"),
    
    DEVELOPER("DEVELOPER"),
    
    MANAGER("MANAGER");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RoleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("role")
  private RoleEnum role = null;

  @SerializedName("serverName")
  private String serverName = null;

  @SerializedName("subscriptionPlanCode")
  private String subscriptionPlanCode = null;

  @SerializedName("timezone")
  private String timezone = null;

  public UserRegistrationRequest applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  @ApiModelProperty(value = "")
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public UserRegistrationRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserRegistrationRequest expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public UserRegistrationRequest names(String names) {
    this.names = names;
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(value = "")
  public String getNames() {
    return names;
  }

  public void setNames(String names) {
    this.names = names;
  }

  public UserRegistrationRequest organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Get organizationName
   * @return organizationName
  **/
  @ApiModelProperty(value = "")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public UserRegistrationRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserRegistrationRequest position(String position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public UserRegistrationRequest role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public UserRegistrationRequest serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

   /**
   * Get serverName
   * @return serverName
  **/
  @ApiModelProperty(value = "")
  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public UserRegistrationRequest subscriptionPlanCode(String subscriptionPlanCode) {
    this.subscriptionPlanCode = subscriptionPlanCode;
    return this;
  }

   /**
   * Get subscriptionPlanCode
   * @return subscriptionPlanCode
  **/
  @ApiModelProperty(value = "")
  public String getSubscriptionPlanCode() {
    return subscriptionPlanCode;
  }

  public void setSubscriptionPlanCode(String subscriptionPlanCode) {
    this.subscriptionPlanCode = subscriptionPlanCode;
  }

  public UserRegistrationRequest timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRegistrationRequest userRegistrationRequest = (UserRegistrationRequest) o;
    return Objects.equals(this.applicationId, userRegistrationRequest.applicationId) &&
        Objects.equals(this.email, userRegistrationRequest.email) &&
        Objects.equals(this.expirationDate, userRegistrationRequest.expirationDate) &&
        Objects.equals(this.names, userRegistrationRequest.names) &&
        Objects.equals(this.organizationName, userRegistrationRequest.organizationName) &&
        Objects.equals(this.password, userRegistrationRequest.password) &&
        Objects.equals(this.position, userRegistrationRequest.position) &&
        Objects.equals(this.role, userRegistrationRequest.role) &&
        Objects.equals(this.serverName, userRegistrationRequest.serverName) &&
        Objects.equals(this.subscriptionPlanCode, userRegistrationRequest.subscriptionPlanCode) &&
        Objects.equals(this.timezone, userRegistrationRequest.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, email, expirationDate, names, organizationName, password, position, role, serverName, subscriptionPlanCode, timezone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRegistrationRequest {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    subscriptionPlanCode: ").append(toIndentedString(subscriptionPlanCode)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

