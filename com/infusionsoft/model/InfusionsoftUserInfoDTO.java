/*
 * Infusionsoft REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: V1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infusionsoft.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InfusionsoftUserInfoDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:16:05.166Z")
public class InfusionsoftUserInfoDTO {
  @SerializedName("email")
  private String email = null;

  @SerializedName("family_name")
  private String familyName = null;

  @SerializedName("given_name")
  private String givenName = null;

  @SerializedName("global_user_id")
  private Long globalUserId = null;

  @SerializedName("infusionsoft_id")
  private String infusionsoftId = null;

  @SerializedName("middle_name")
  private String middleName = null;

  @SerializedName("preferred_name")
  private String preferredName = null;

  @SerializedName("sub")
  private String sub = null;

  public InfusionsoftUserInfoDTO email(String email) {
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

  public InfusionsoftUserInfoDTO familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public InfusionsoftUserInfoDTO givenName(String givenName) {
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

  public InfusionsoftUserInfoDTO globalUserId(Long globalUserId) {
    this.globalUserId = globalUserId;
    return this;
  }

   /**
   * Get globalUserId
   * @return globalUserId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getGlobalUserId() {
    return globalUserId;
  }

  public void setGlobalUserId(Long globalUserId) {
    this.globalUserId = globalUserId;
  }

  public InfusionsoftUserInfoDTO infusionsoftId(String infusionsoftId) {
    this.infusionsoftId = infusionsoftId;
    return this;
  }

   /**
   * Get infusionsoftId
   * @return infusionsoftId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getInfusionsoftId() {
    return infusionsoftId;
  }

  public void setInfusionsoftId(String infusionsoftId) {
    this.infusionsoftId = infusionsoftId;
  }

  public InfusionsoftUserInfoDTO middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @ApiModelProperty(value = "")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public InfusionsoftUserInfoDTO preferredName(String preferredName) {
    this.preferredName = preferredName;
    return this;
  }

   /**
   * Get preferredName
   * @return preferredName
  **/
  @ApiModelProperty(value = "")
  public String getPreferredName() {
    return preferredName;
  }

  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
  }

  public InfusionsoftUserInfoDTO sub(String sub) {
    this.sub = sub;
    return this;
  }

   /**
   * Get sub
   * @return sub
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftUserInfoDTO userInfoDTO = (InfusionsoftUserInfoDTO) o;
    return Objects.equals(this.email, userInfoDTO.email) &&
        Objects.equals(this.familyName, userInfoDTO.familyName) &&
        Objects.equals(this.givenName, userInfoDTO.givenName) &&
        Objects.equals(this.globalUserId, userInfoDTO.globalUserId) &&
        Objects.equals(this.infusionsoftId, userInfoDTO.infusionsoftId) &&
        Objects.equals(this.middleName, userInfoDTO.middleName) &&
        Objects.equals(this.preferredName, userInfoDTO.preferredName) &&
        Objects.equals(this.sub, userInfoDTO.sub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, familyName, givenName, globalUserId, infusionsoftId, middleName, preferredName, sub);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftUserInfoDTO {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    globalUserId: ").append(toIndentedString(globalUserId)).append("\n");
    sb.append("    infusionsoftId: ").append(toIndentedString(infusionsoftId)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    preferredName: ").append(toIndentedString(preferredName)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
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
