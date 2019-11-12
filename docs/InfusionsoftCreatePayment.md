
# InfusionsoftCreatePayment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applyToCommissions** | **Boolean** |  |  [optional]
**chargeNow** | **Boolean** |  |  [optional]
**creditCardId** | **Long** |  |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Used when charge_now:false or inserting historical data. ex &#x60;2017-01-01T22:17:59.039Z&#x60; |  [optional]
**notes** | **String** |  |  [optional]
**paymentAmount** | **String** |  |  [optional]
**paymentGatewayId** | **String** |  |  [optional]
**paymentMethodType** | [**PaymentMethodTypeEnum**](#PaymentMethodTypeEnum) |  |  [optional]


<a name="PaymentMethodTypeEnum"></a>
## Enum: PaymentMethodTypeEnum
Name | Value
---- | -----
CREDIT_CARD | &quot;CREDIT_CARD&quot;
CASH | &quot;CASH&quot;
CHECK | &quot;CHECK&quot;



