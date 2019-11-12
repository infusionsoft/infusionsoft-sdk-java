
# InfusionsoftFullContact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | [**List&lt;InfusionsoftContactAddress&gt;**](InfusionsoftContactAddress.md) |  |  [optional]
**anniversary** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**birthday** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**company** | [**InfusionsoftCompanyReference**](InfusionsoftCompanyReference.md) |  |  [optional]
**contactType** | **String** |  |  [optional]
**customFields** | [**List&lt;InfusionsoftCustomFieldValue&gt;**](InfusionsoftCustomFieldValue.md) |  |  [optional]
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**emailAddresses** | [**List&lt;InfusionsoftEmailAddress&gt;**](InfusionsoftEmailAddress.md) |  |  [optional]
**emailOptedIn** | **Boolean** |  |  [optional]
**emailStatus** | [**EmailStatusEnum**](#EmailStatusEnum) |  |  [optional]
**familyName** | **String** |  |  [optional]
**faxNumbers** | [**List&lt;InfusionsoftFaxNumber&gt;**](InfusionsoftFaxNumber.md) |  |  [optional]
**givenName** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**jobTitle** | **String** |  |  [optional]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**leadSourceId** | **Long** |  |  [optional]
**middleName** | **String** |  |  [optional]
**optInReason** | **String** |  |  [optional]
**origin** | [**InfusionsoftContactOrigin**](InfusionsoftContactOrigin.md) |  |  [optional]
**ownerId** | **Long** |  |  [optional]
**phoneNumbers** | [**List&lt;InfusionsoftPhoneNumber&gt;**](InfusionsoftPhoneNumber.md) |  |  [optional]
**preferredLocale** | **String** |  |  [optional]
**preferredName** | **String** |  |  [optional]
**prefix** | **String** |  |  [optional]
**relationships** | [**List&lt;InfusionsoftRelationship&gt;**](InfusionsoftRelationship.md) |  |  [optional]
**socialAccounts** | [**List&lt;InfusionsoftSocialAccount&gt;**](InfusionsoftSocialAccount.md) |  |  [optional]
**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  [optional]
**spouseName** | **String** |  |  [optional]
**suffix** | **String** |  |  [optional]
**tagIds** | **List&lt;Long&gt;** |  |  [optional]
**timeZone** | **String** |  |  [optional]
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


<a name="SourceTypeEnum"></a>
## Enum: SourceTypeEnum
Name | Value
---- | -----
WEBFORM | &quot;WEBFORM&quot;
LANDINGPAGE | &quot;LANDINGPAGE&quot;
IMPORT | &quot;IMPORT&quot;
MANUAL | &quot;MANUAL&quot;
API | &quot;API&quot;
OTHER | &quot;OTHER&quot;
UNKNOWN | &quot;UNKNOWN&quot;



