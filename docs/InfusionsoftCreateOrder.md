
# InfusionsoftCreateOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contactId** | **Long** |  | 
**leadAffiliateId** | **Long** |  |  [optional]
**orderDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**orderItems** | [**List&lt;InfusionsoftCreateOrderItem&gt;**](InfusionsoftCreateOrderItem.md) |  | 
**orderTitle** | **String** |  | 
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) |  | 
**promoCodes** | **List&lt;String&gt;** | Uses multiple strings as promo codes. The corresponding discount will be applied to the order. |  [optional]
**salesAffiliateId** | **Long** |  |  [optional]
**shippingAddress** | [**InfusionsoftAddressInformation**](InfusionsoftAddressInformation.md) |  |  [optional]


<a name="OrderTypeEnum"></a>
## Enum: OrderTypeEnum
Name | Value
---- | -----
OFFLINE | &quot;Offline&quot;
ONLINE | &quot;Online&quot;



