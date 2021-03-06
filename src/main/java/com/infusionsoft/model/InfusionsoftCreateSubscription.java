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
import java.time.LocalDate;

/**
 * InfusionsoftCreateSubscription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-12T23:10:31.052Z")
public class InfusionsoftCreateSubscription {
  @SerializedName("allow_duplicate")
  private Boolean allowDuplicate = null;

  @SerializedName("allow_tax")
  private Boolean allowTax = null;

  @SerializedName("auto_charge")
  private Boolean autoCharge = null;

  @SerializedName("billing_amount")
  private Double billingAmount = null;

  @SerializedName("contact_id")
  private Long contactId = null;

  @SerializedName("credit_card_id")
  private Long creditCardId = null;

  @SerializedName("first_bill_date")
  private LocalDate firstBillDate = null;

  @SerializedName("payment_gateway_id")
  private Long paymentGatewayId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("sale_affiliate_id")
  private Long saleAffiliateId = null;

  @SerializedName("subscription_plan_id")
  private Long subscriptionPlanId = null;

  public InfusionsoftCreateSubscription allowDuplicate(Boolean allowDuplicate) {
    this.allowDuplicate = allowDuplicate;
    return this;
  }

   /**
   * If true, it will disable the check to see if there is already an identical subscription for the contact. Default is false.
   * @return allowDuplicate
  **/
  @ApiModelProperty(example = "false", value = "If true, it will disable the check to see if there is already an identical subscription for the contact. Default is false.")
  public Boolean isAllowDuplicate() {
    return allowDuplicate;
  }

  public void setAllowDuplicate(Boolean allowDuplicate) {
    this.allowDuplicate = allowDuplicate;
  }

  public InfusionsoftCreateSubscription allowTax(Boolean allowTax) {
    this.allowTax = allowTax;
    return this;
  }

   /**
   * Only works if the product the product subscription is for is taxable. Default is false.
   * @return allowTax
  **/
  @ApiModelProperty(example = "false", value = "Only works if the product the product subscription is for is taxable. Default is false.")
  public Boolean isAllowTax() {
    return allowTax;
  }

  public void setAllowTax(Boolean allowTax) {
    this.allowTax = allowTax;
  }

  public InfusionsoftCreateSubscription autoCharge(Boolean autoCharge) {
    this.autoCharge = autoCharge;
    return this;
  }

   /**
   * Defaults to true.
   * @return autoCharge
  **/
  @ApiModelProperty(example = "false", value = "Defaults to true.")
  public Boolean isAutoCharge() {
    return autoCharge;
  }

  public void setAutoCharge(Boolean autoCharge) {
    this.autoCharge = autoCharge;
  }

  public InfusionsoftCreateSubscription billingAmount(Double billingAmount) {
    this.billingAmount = billingAmount;
    return this;
  }

   /**
   * Must be 0 or greater. Default is the price in the product subscription.
   * @return billingAmount
  **/
  @ApiModelProperty(value = "Must be 0 or greater. Default is the price in the product subscription.")
  public Double getBillingAmount() {
    return billingAmount;
  }

  public void setBillingAmount(Double billingAmount) {
    this.billingAmount = billingAmount;
  }

  public InfusionsoftCreateSubscription contactId(Long contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * Get contactId
   * @return contactId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getContactId() {
    return contactId;
  }

  public void setContactId(Long contactId) {
    this.contactId = contactId;
  }

  public InfusionsoftCreateSubscription creditCardId(Long creditCardId) {
    this.creditCardId = creditCardId;
    return this;
  }

   /**
   * Default is the contact&#39;s most recently used card, if auto charge is true. Default is 0 otherwise.
   * @return creditCardId
  **/
  @ApiModelProperty(value = "Default is the contact's most recently used card, if auto charge is true. Default is 0 otherwise.")
  public Long getCreditCardId() {
    return creditCardId;
  }

  public void setCreditCardId(Long creditCardId) {
    this.creditCardId = creditCardId;
  }

  public InfusionsoftCreateSubscription firstBillDate(LocalDate firstBillDate) {
    this.firstBillDate = firstBillDate;
    return this;
  }

   /**
   * The first day the subscription will bill, in EST. Must not be in the past. Default is today.
   * @return firstBillDate
  **/
  @ApiModelProperty(value = "The first day the subscription will bill, in EST. Must not be in the past. Default is today.")
  public LocalDate getFirstBillDate() {
    return firstBillDate;
  }

  public void setFirstBillDate(LocalDate firstBillDate) {
    this.firstBillDate = firstBillDate;
  }

  public InfusionsoftCreateSubscription paymentGatewayId(Long paymentGatewayId) {
    this.paymentGatewayId = paymentGatewayId;
    return this;
  }

   /**
   * Default is the app&#39;s default merchant.
   * @return paymentGatewayId
  **/
  @ApiModelProperty(value = "Default is the app's default merchant.")
  public Long getPaymentGatewayId() {
    return paymentGatewayId;
  }

  public void setPaymentGatewayId(Long paymentGatewayId) {
    this.paymentGatewayId = paymentGatewayId;
  }

  public InfusionsoftCreateSubscription quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Must be greater than 0. Default is 1.
   * @return quantity
  **/
  @ApiModelProperty(value = "Must be greater than 0. Default is 1.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public InfusionsoftCreateSubscription saleAffiliateId(Long saleAffiliateId) {
    this.saleAffiliateId = saleAffiliateId;
    return this;
  }

   /**
   * Get saleAffiliateId
   * @return saleAffiliateId
  **/
  @ApiModelProperty(value = "")
  public Long getSaleAffiliateId() {
    return saleAffiliateId;
  }

  public void setSaleAffiliateId(Long saleAffiliateId) {
    this.saleAffiliateId = saleAffiliateId;
  }

  public InfusionsoftCreateSubscription subscriptionPlanId(Long subscriptionPlanId) {
    this.subscriptionPlanId = subscriptionPlanId;
    return this;
  }

   /**
   * Id of the product subscription.
   * @return subscriptionPlanId
  **/
  @ApiModelProperty(value = "Id of the product subscription.")
  public Long getSubscriptionPlanId() {
    return subscriptionPlanId;
  }

  public void setSubscriptionPlanId(Long subscriptionPlanId) {
    this.subscriptionPlanId = subscriptionPlanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfusionsoftCreateSubscription createSubscription = (InfusionsoftCreateSubscription) o;
    return Objects.equals(this.allowDuplicate, createSubscription.allowDuplicate) &&
        Objects.equals(this.allowTax, createSubscription.allowTax) &&
        Objects.equals(this.autoCharge, createSubscription.autoCharge) &&
        Objects.equals(this.billingAmount, createSubscription.billingAmount) &&
        Objects.equals(this.contactId, createSubscription.contactId) &&
        Objects.equals(this.creditCardId, createSubscription.creditCardId) &&
        Objects.equals(this.firstBillDate, createSubscription.firstBillDate) &&
        Objects.equals(this.paymentGatewayId, createSubscription.paymentGatewayId) &&
        Objects.equals(this.quantity, createSubscription.quantity) &&
        Objects.equals(this.saleAffiliateId, createSubscription.saleAffiliateId) &&
        Objects.equals(this.subscriptionPlanId, createSubscription.subscriptionPlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowDuplicate, allowTax, autoCharge, billingAmount, contactId, creditCardId, firstBillDate, paymentGatewayId, quantity, saleAffiliateId, subscriptionPlanId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfusionsoftCreateSubscription {\n");
    
    sb.append("    allowDuplicate: ").append(toIndentedString(allowDuplicate)).append("\n");
    sb.append("    allowTax: ").append(toIndentedString(allowTax)).append("\n");
    sb.append("    autoCharge: ").append(toIndentedString(autoCharge)).append("\n");
    sb.append("    billingAmount: ").append(toIndentedString(billingAmount)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    creditCardId: ").append(toIndentedString(creditCardId)).append("\n");
    sb.append("    firstBillDate: ").append(toIndentedString(firstBillDate)).append("\n");
    sb.append("    paymentGatewayId: ").append(toIndentedString(paymentGatewayId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    saleAffiliateId: ").append(toIndentedString(saleAffiliateId)).append("\n");
    sb.append("    subscriptionPlanId: ").append(toIndentedString(subscriptionPlanId)).append("\n");
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

