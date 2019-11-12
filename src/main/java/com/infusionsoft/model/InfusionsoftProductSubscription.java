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
 * InfusionsoftProductSubscription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-12T23:10:31.052Z")
public class InfusionsoftProductSubscription {
  @SerializedName("active")
  private Boolean active = null;

  /**
   * Gets or Sets cycleType
   */
  @JsonAdapter(CycleTypeEnum.Adapter.class)
  public enum CycleTypeEnum {
    YEAR("YEAR"),
    
    MONTH("MONTH"),
    
    WEEK("WEEK"),
    
    DAY("DAY");

    private String value;

    CycleTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CycleTypeEnum fromValue(String text) {
      for (CycleTypeEnum b : CycleTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CycleTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CycleTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CycleTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CycleTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("cycle_type")
  private CycleTypeEnum cycleType = null;

  @SerializedName("frequency")
  private Integer frequency = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("number_of_cycles")
  private Integer numberOfCycles = null;

  @SerializedName("plan_price")
  private Double planPrice = null;

  @SerializedName("subscription_plan_index")
  private Integer subscriptionPlanIndex = null;

  @SerializedName("subscription_plan_name")
  private String subscriptionPlanName = null;

  @SerializedName("url")
  private String url = null;

  public InfusionsoftProductSubscription active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public InfusionsoftProductSubscription cycleType(CycleTypeEnum cycleType) {
    this.cycleType = cycleType;
    return this;
  }

   /**
   * Get cycleType
   * @return cycleType
  **/
  @ApiModelProperty(required = true, value = "")
  public CycleTypeEnum getCycleType() {
    return cycleType;
  }

  public void setCycleType(CycleTypeEnum cycleType) {
    this.cycleType = cycleType;
  }

  public InfusionsoftProductSubscription frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(value = "")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public InfusionsoftProductSubscription id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public InfusionsoftProductSubscription numberOfCycles(Integer numberOfCycles) {
    this.numberOfCycles = numberOfCycles;
    return this;
  }

   /**
   * Get numberOfCycles
   * @return numberOfCycles
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfCycles() {
    return numberOfCycles;
  }

  public void setNumberOfCycles(Integer numberOfCycles) {
    this.numberOfCycles = numberOfCycles;
  }

  public InfusionsoftProductSubscription planPrice(Double planPrice) {
    this.planPrice = planPrice;
    return this;
  }

   /**
   * Get planPrice
   * @return planPrice
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getPlanPrice() {
    return planPrice;
  }

  public void setPlanPrice(Double planPrice) {
    this.planPrice = planPrice;
  }

  public InfusionsoftProductSubscription subscriptionPlanIndex(Integer subscriptionPlanIndex) {
    this.subscriptionPlanIndex = subscriptionPlanIndex;
    return this;
  }

   /**
   * Get subscriptionPlanIndex
   * @return subscriptionPlanIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getSubscriptionPlanIndex() {
    return subscriptionPlanIndex;
  }

  public void setSubscriptionPlanIndex(Integer subscriptionPlanIndex) {
    this.subscriptionPlanIndex = subscriptionPlanIndex;
  }

  public InfusionsoftProductSubscription subscriptionPlanName(String subscriptionPlanName) {
    this.subscriptionPlanName = subscriptionPlanName;
    return this;
  }

   /**
   * Get subscriptionPlanName
   * @return subscriptionPlanName
  **/
  @ApiModelProperty(value = "")
  public String getSubscriptionPlanName() {
    return subscriptionPlanName;
  }

  public void setSubscriptionPlanName(String subscriptionPlanName) {
    this.subscriptionPlanName = subscriptionPlanName;
  }

  public InfusionsoftProductSubscription url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftProductSubscription productSubscription = (InfusionsoftProductSubscription) o;
    return Objects.equals(this.active, productSubscription.active) &&
        Objects.equals(this.cycleType, productSubscription.cycleType) &&
        Objects.equals(this.frequency, productSubscription.frequency) &&
        Objects.equals(this.id, productSubscription.id) &&
        Objects.equals(this.numberOfCycles, productSubscription.numberOfCycles) &&
        Objects.equals(this.planPrice, productSubscription.planPrice) &&
        Objects.equals(this.subscriptionPlanIndex, productSubscription.subscriptionPlanIndex) &&
        Objects.equals(this.subscriptionPlanName, productSubscription.subscriptionPlanName) &&
        Objects.equals(this.url, productSubscription.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, cycleType, frequency, id, numberOfCycles, planPrice, subscriptionPlanIndex, subscriptionPlanName, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftProductSubscription {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    cycleType: ").append(toIndentedString(cycleType)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numberOfCycles: ").append(toIndentedString(numberOfCycles)).append("\n");
    sb.append("    planPrice: ").append(toIndentedString(planPrice)).append("\n");
    sb.append("    subscriptionPlanIndex: ").append(toIndentedString(subscriptionPlanIndex)).append("\n");
    sb.append("    subscriptionPlanName: ").append(toIndentedString(subscriptionPlanName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

