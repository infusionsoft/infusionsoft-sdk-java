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
import com.infusionsoft.model.InfusionsoftEmailSentCreate;
import com.infusionsoft.model.InfusionsoftEmailSentCreateError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftEmailSentCreateList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-12T23:10:31.052Z")
public class InfusionsoftEmailSentCreateList {
  @SerializedName("emails")
  private List<InfusionsoftEmailSentCreate> emails = null;

  @SerializedName("errors")
  private List<InfusionsoftEmailSentCreateError> errors = null;

  public InfusionsoftEmailSentCreateList emails(List<InfusionsoftEmailSentCreate> emails) {
    this.emails = emails;
    return this;
  }

  public InfusionsoftEmailSentCreateList addEmailsItem(InfusionsoftEmailSentCreate emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftEmailSentCreate> getEmails() {
    return emails;
  }

  public void setEmails(List<InfusionsoftEmailSentCreate> emails) {
    this.emails = emails;
  }

  public InfusionsoftEmailSentCreateList errors(List<InfusionsoftEmailSentCreateError> errors) {
    this.errors = errors;
    return this;
  }

  public InfusionsoftEmailSentCreateList addErrorsItem(InfusionsoftEmailSentCreateError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftEmailSentCreateError> getErrors() {
    return errors;
  }

  public void setErrors(List<InfusionsoftEmailSentCreateError> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftEmailSentCreateList emailSentCreateList = (InfusionsoftEmailSentCreateList) o;
    return Objects.equals(this.emails, emailSentCreateList.emails) &&
        Objects.equals(this.errors, emailSentCreateList.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftEmailSentCreateList {\n");
    
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

