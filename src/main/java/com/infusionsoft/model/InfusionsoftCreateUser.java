/*
 * Infusionsoft REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.70.0.156820
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infusionsoft.model;

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
 * InfusionsoftCreateUser
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-12T23:10:31.052Z")
public class InfusionsoftCreateUser {
  @SerializedName("admin")
  private Boolean admin = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("given_name")
  private String givenName = null;

  @SerializedName("partner")
  private Boolean partner = null;

  public InfusionsoftCreateUser admin(Boolean admin) {
    this.admin = admin;
    return this;
  }

   /**
   * Get admin
   * @return admin
  **/
  @ApiModelProperty(value = "")
  public Boolean isAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public InfusionsoftCreateUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InfusionsoftCreateUser givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public InfusionsoftCreateUser partner(Boolean partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @ApiModelProperty(value = "")
  public Boolean isPartner() {
    return partner;
  }

  public void setPartner(Boolean partner) {
    this.partner = partner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftCreateUser createUser = (InfusionsoftCreateUser) o;
    return Objects.equals(this.admin, createUser.admin) &&
        Objects.equals(this.email, createUser.email) &&
        Objects.equals(this.givenName, createUser.givenName) &&
        Objects.equals(this.partner, createUser.partner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, email, givenName, partner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftCreateUser {\n");
    
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
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

