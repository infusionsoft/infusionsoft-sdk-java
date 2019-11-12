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
 * InfusionsoftContactAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-12T23:10:31.052Z")
public class InfusionsoftContactAddress {
  @SerializedName("country_code")
  private String countryCode = null;

  /**
   * Gets or Sets field
   */
  @JsonAdapter(FieldEnum.Adapter.class)
  public enum FieldEnum {
    BILLING("BILLING"),
    
    SHIPPING("SHIPPING"),
    
    OTHER("OTHER");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FieldEnum fromValue(String text) {
      for (FieldEnum b : FieldEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FieldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FieldEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("field")
  private FieldEnum field = null;

  @SerializedName("line1")
  private String line1 = null;

  @SerializedName("line2")
  private String line2 = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("zip_code")
  private String zipCode = null;

  @SerializedName("zip_four")
  private String zipFour = null;

  public InfusionsoftContactAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public InfusionsoftContactAddress field(FieldEnum field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(required = true, value = "")
  public FieldEnum getField() {
    return field;
  }

  public void setField(FieldEnum field) {
    this.field = field;
  }

  public InfusionsoftContactAddress line1(String line1) {
    this.line1 = line1;
    return this;
  }

   /**
   * Get line1
   * @return line1
  **/
  @ApiModelProperty(value = "")
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public InfusionsoftContactAddress line2(String line2) {
    this.line2 = line2;
    return this;
  }

   /**
   * Get line2
   * @return line2
  **/
  @ApiModelProperty(value = "")
  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public InfusionsoftContactAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Get locality
   * @return locality
  **/
  @ApiModelProperty(value = "")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public InfusionsoftContactAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Field used to store postal codes containing a combination of letters and numbers ex. &#39;EC1A&#39;, &#39;S1 2HE&#39;, &#39;75000&#39;
   * @return postalCode
  **/
  @ApiModelProperty(value = "Field used to store postal codes containing a combination of letters and numbers ex. 'EC1A', 'S1 2HE', '75000'")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public InfusionsoftContactAddress region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(value = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public InfusionsoftContactAddress zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Mainly used in the United States, this is typically numeric. ex. &#39;85001&#39;, &#39;90002&#39; Note: this is to be used instead of &#39;postal_code&#39;, not in addition to.
   * @return zipCode
  **/
  @ApiModelProperty(value = "Mainly used in the United States, this is typically numeric. ex. '85001', '90002' Note: this is to be used instead of 'postal_code', not in addition to.")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public InfusionsoftContactAddress zipFour(String zipFour) {
    this.zipFour = zipFour;
    return this;
  }

   /**
   * Last four of a full zip code ex. &#39;8244&#39;, &#39;4320&#39;. This field is supplemental to the zip_code field, otherwise will be ignored.
   * @return zipFour
  **/
  @ApiModelProperty(value = "Last four of a full zip code ex. '8244', '4320'. This field is supplemental to the zip_code field, otherwise will be ignored.")
  public String getZipFour() {
    return zipFour;
  }

  public void setZipFour(String zipFour) {
    this.zipFour = zipFour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftContactAddress contactAddress = (InfusionsoftContactAddress) o;
    return Objects.equals(this.countryCode, contactAddress.countryCode) &&
        Objects.equals(this.field, contactAddress.field) &&
        Objects.equals(this.line1, contactAddress.line1) &&
        Objects.equals(this.line2, contactAddress.line2) &&
        Objects.equals(this.locality, contactAddress.locality) &&
        Objects.equals(this.postalCode, contactAddress.postalCode) &&
        Objects.equals(this.region, contactAddress.region) &&
        Objects.equals(this.zipCode, contactAddress.zipCode) &&
        Objects.equals(this.zipFour, contactAddress.zipFour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, field, line1, line2, locality, postalCode, region, zipCode, zipFour);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftContactAddress {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    zipFour: ").append(toIndentedString(zipFour)).append("\n");
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

