/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logsentinel.client.model;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author maris
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T10:33:18.929+03:00")
public class CreatePartnerRequest {

    @SerializedName("email")
    private String email = null;

    @SerializedName("names")
    private String names = null;

    @SerializedName("organizationName")
    private String organizationName = null;

    @SerializedName("password")
    private String password = null;
    
    @SerializedName("position")
    private String position = null;    
    
    @SerializedName("role")
    private String role = null;        

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    

}
