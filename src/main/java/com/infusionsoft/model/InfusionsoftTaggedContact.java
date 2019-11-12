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
import com.infusionsoft.model.InfusionsoftBasicContact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * InfusionsoftTaggedContact
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-12T23:10:31.052Z")
public class InfusionsoftTaggedContact {
  @SerializedName("contact")
  private InfusionsoftBasicContact contact = null;

  @SerializedName("date_applied")
  private OffsetDateTime dateApplied = null;

  public InfusionsoftTaggedContact contact(InfusionsoftBasicContact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftBasicContact getContact() {
    return contact;
  }

  public void setContact(InfusionsoftBasicContact contact) {
    this.contact = contact;
  }

  public InfusionsoftTaggedContact dateApplied(OffsetDateTime dateApplied) {
    this.dateApplied = dateApplied;
    return this;
  }

   /**
   * Get dateApplied
   * @return dateApplied
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateApplied() {
    return dateApplied;
  }

  public void setDateApplied(OffsetDateTime dateApplied) {
    this.dateApplied = dateApplied;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftTaggedContact taggedContact = (InfusionsoftTaggedContact) o;
    return Objects.equals(this.contact, taggedContact.contact) &&
        Objects.equals(this.dateApplied, taggedContact.dateApplied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, dateApplied);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftTaggedContact {\n");
    
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    dateApplied: ").append(toIndentedString(dateApplied)).append("\n");
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

