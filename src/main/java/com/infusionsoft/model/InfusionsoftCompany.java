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
import com.infusionsoft.model.InfusionsoftCompanyAddress;
import com.infusionsoft.model.InfusionsoftCompanyFaxNumber;
import com.infusionsoft.model.InfusionsoftCompanyPhoneNumber;
import com.infusionsoft.model.InfusionsoftCustomFieldValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InfusionsoftCompany
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-12T23:10:31.052Z")
public class InfusionsoftCompany {
  @SerializedName("address")
  private InfusionsoftCompanyAddress address = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("custom_fields")
  private List<InfusionsoftCustomFieldValue> customFields = null;

  @SerializedName("email_address")
  private String emailAddress = null;

  @SerializedName("email_opted_in")
  private Boolean emailOptedIn = null;

  /**
   * Gets or Sets emailStatus
   */
  @JsonAdapter(EmailStatusEnum.Adapter.class)
  public enum EmailStatusEnum {
    UNENGAGEDMARKETABLE("UnengagedMarketable"),
    
    SINGLEOPTIN("SingleOptIn"),
    
    DOUBLEOPTIN("DoubleOptin"),
    
    CONFIRMED("Confirmed"),
    
    UNENGAGEDNONMARKETABLE("UnengagedNonMarketable"),
    
    NONMARKETABLE("NonMarketable"),
    
    LOCKDOWN("Lockdown"),
    
    BOUNCE("Bounce"),
    
    HARDBOUNCE("HardBounce"),
    
    MANUAL("Manual"),
    
    ADMIN("Admin"),
    
    SYSTEM("System"),
    
    LISTUNSUBSCRIBE("ListUnsubscribe"),
    
    FEEDBACK("Feedback"),
    
    SPAM("Spam"),
    
    INVALID("Invalid"),
    
    DEACTIVATED("Deactivated");

    private String value;

    EmailStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmailStatusEnum fromValue(String text) {
      for (EmailStatusEnum b : EmailStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EmailStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmailStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmailStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EmailStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("email_status")
  private EmailStatusEnum emailStatus = null;

  @SerializedName("fax_number")
  private InfusionsoftCompanyFaxNumber faxNumber = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("phone_number")
  private InfusionsoftCompanyPhoneNumber phoneNumber = null;

  @SerializedName("website")
  private String website = null;

  public InfusionsoftCompany address(InfusionsoftCompanyAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftCompanyAddress getAddress() {
    return address;
  }

  public void setAddress(InfusionsoftCompanyAddress address) {
    this.address = address;
  }

  public InfusionsoftCompany companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public InfusionsoftCompany customFields(List<InfusionsoftCustomFieldValue> customFields) {
    this.customFields = customFields;
    return this;
  }

  public InfusionsoftCompany addCustomFieldsItem(InfusionsoftCustomFieldValue customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
  public List<InfusionsoftCustomFieldValue> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<InfusionsoftCustomFieldValue> customFields) {
    this.customFields = customFields;
  }

  public InfusionsoftCompany emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public InfusionsoftCompany emailOptedIn(Boolean emailOptedIn) {
    this.emailOptedIn = emailOptedIn;
    return this;
  }

   /**
   * Get emailOptedIn
   * @return emailOptedIn
  **/
  @ApiModelProperty(value = "")
  public Boolean isEmailOptedIn() {
    return emailOptedIn;
  }

  public void setEmailOptedIn(Boolean emailOptedIn) {
    this.emailOptedIn = emailOptedIn;
  }

  public InfusionsoftCompany emailStatus(EmailStatusEnum emailStatus) {
    this.emailStatus = emailStatus;
    return this;
  }

   /**
   * Get emailStatus
   * @return emailStatus
  **/
  @ApiModelProperty(value = "")
  public EmailStatusEnum getEmailStatus() {
    return emailStatus;
  }

  public void setEmailStatus(EmailStatusEnum emailStatus) {
    this.emailStatus = emailStatus;
  }

  public InfusionsoftCompany faxNumber(InfusionsoftCompanyFaxNumber faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * Get faxNumber
   * @return faxNumber
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftCompanyFaxNumber getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(InfusionsoftCompanyFaxNumber faxNumber) {
    this.faxNumber = faxNumber;
  }

  public InfusionsoftCompany id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InfusionsoftCompany notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public InfusionsoftCompany phoneNumber(InfusionsoftCompanyPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public InfusionsoftCompanyPhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(InfusionsoftCompanyPhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public InfusionsoftCompany website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftCompany company = (InfusionsoftCompany) o;
    return Objects.equals(this.address, company.address) &&
        Objects.equals(this.companyName, company.companyName) &&
        Objects.equals(this.customFields, company.customFields) &&
        Objects.equals(this.emailAddress, company.emailAddress) &&
        Objects.equals(this.emailOptedIn, company.emailOptedIn) &&
        Objects.equals(this.emailStatus, company.emailStatus) &&
        Objects.equals(this.faxNumber, company.faxNumber) &&
        Objects.equals(this.id, company.id) &&
        Objects.equals(this.notes, company.notes) &&
        Objects.equals(this.phoneNumber, company.phoneNumber) &&
        Objects.equals(this.website, company.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, companyName, customFields, emailAddress, emailOptedIn, emailStatus, faxNumber, id, notes, phoneNumber, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftCompany {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    emailOptedIn: ").append(toIndentedString(emailOptedIn)).append("\n");
    sb.append("    emailStatus: ").append(toIndentedString(emailStatus)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

