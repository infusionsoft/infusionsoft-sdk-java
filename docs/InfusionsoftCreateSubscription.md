
# InfusionsoftCreateSubscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowDuplicate** | **Boolean** | If true, it will disable the check to see if there is already an identical subscription for the contact. Default is false. |  [optional]
**allowTax** | **Boolean** | Only works if the product the product subscription is for is taxable. Default is false. |  [optional]
**autoCharge** | **Boolean** | Defaults to true. |  [optional]
**billingAmount** | **Double** | Must be 0 or greater. Default is the price in the product subscription. |  [optional]
**contactId** | **Long** |  | 
**creditCardId** | **Long** | Default is the contact&#39;s most recently used card, if auto charge is true. Default is 0 otherwise. |  [optional]
**firstBillDate** | [**LocalDate**](LocalDate.md) | The first day the subscription will bill, in EST. Must not be in the past. Default is today. |  [optional]
**paymentGatewayId** | **Long** | Default is the app&#39;s default merchant. |  [optional]
**quantity** | **Integer** | Must be greater than 0. Default is 1. |  [optional]
**saleAffiliateId** | **Long** |  |  [optional]
**subscriptionPlanId** | **Long** | Id of the product subscription. |  [optional]



