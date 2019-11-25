/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logsentinel.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 * @author maris
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T10:33:18.929+03:00")
public class Partner {

    @SerializedName("userId")
    private String userId = null;

    @SerializedName("organizationId")
    private String organizationId = null;

    @SerializedName("defaultApplicationId")
    private String defaultApplicationId = null;

    @SerializedName("secret")
    private String secret = null;

    @ApiModelProperty(value = "")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @ApiModelProperty(value = "")
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    @ApiModelProperty(value = "")
    public String getDefaultApplicationId() {
        return defaultApplicationId;
    }

    public void setDefaultApplicationId(String defaultApplicationId) {
        this.defaultApplicationId = defaultApplicationId;
    }

    @ApiModelProperty(value = "")
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

}
