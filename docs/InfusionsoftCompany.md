
# InfusionsoftCompany

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**InfusionsoftCompanyAddress**](InfusionsoftCompanyAddress.md) |  |  [optional]
**companyName** | **String** |  |  [optional]
**customFields** | [**List&lt;InfusionsoftCustomFieldValue&gt;**](InfusionsoftCustomFieldValue.md) |  |  [optional]
**emailAddress** | **String** |  |  [optional]
**emailOptedIn** | **Boolean** |  |  [optional]
**emailStatus** | [**EmailStatusEnum**](#EmailStatusEnum) |  |  [optional]
**faxNumber** | [**InfusionsoftCompanyFaxNumber**](InfusionsoftCompanyFaxNumber.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**notes** | **String** |  |  [optional]
**phoneNumber** | [**InfusionsoftCompanyPhoneNumber**](InfusionsoftCompanyPhoneNumber.md) |  |  [optional]
**website** | **String** |  |  [optional]


<a name="EmailStatusEnum"></a>
## Enum: EmailStatusEnum
Name | Value
---- | -----
UNENGAGEDMARKETABLE | &quot;UnengagedMarketable&quot;
SINGLEOPTIN | &quot;SingleOptIn&quot;
DOUBLEOPTIN | &quot;DoubleOptin&quot;
CONFIRMED | &quot;Confirmed&quot;
UNENGAGEDNONMARKETABLE | &quot;UnengagedNonMarketable&quot;
NONMARKETABLE | &quot;NonMarketable&quot;
LOCKDOWN | &quot;Lockdown&quot;
BOUNCE | &quot;Bounce&quot;
HARDBOUNCE | &quot;HardBounce&quot;
MANUAL | &quot;Manual&quot;
ADMIN | &quot;Admin&quot;
SYSTEM | &quot;System&quot;
LISTUNSUBSCRIBE | &quot;ListUnsubscribe&quot;
FEEDBACK | &quot;Feedback&quot;
SPAM | &quot;Spam&quot;
INVALID | &quot;Invalid&quot;
DEACTIVATED | &quot;Deactivated&quot;



