
# InfusionsoftCreateOrPatchContact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | [**List&lt;InfusionsoftContactAddress&gt;**](InfusionsoftContactAddress.md) |  |  [optional]
**anniversary** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**birthday** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**company** | [**InfusionsoftRequestCompanyReference**](InfusionsoftRequestCompanyReference.md) |  |  [optional]
**contactType** | **String** |  |  [optional]
**customFields** | [**List&lt;InfusionsoftCustomFieldValue&gt;**](InfusionsoftCustomFieldValue.md) |  |  [optional]
**emailAddresses** | [**List&lt;InfusionsoftEmailAddress&gt;**](InfusionsoftEmailAddress.md) |  |  [optional]
**familyName** | **String** |  |  [optional]
**faxNumbers** | [**List&lt;InfusionsoftFaxNumber&gt;**](InfusionsoftFaxNumber.md) |  |  [optional]
**givenName** | **String** |  |  [optional]
**jobTitle** | **String** |  |  [optional]
**leadSourceId** | **Long** |  |  [optional]
**middleName** | **String** |  |  [optional]
**optInReason** | **String** |  |  [optional]
**origin** | [**InfusionsoftCreateContactOrigin**](InfusionsoftCreateContactOrigin.md) |  |  [optional]
**ownerId** | **Long** |  |  [optional]
**phoneNumbers** | [**List&lt;InfusionsoftPhoneNumber&gt;**](InfusionsoftPhoneNumber.md) |  |  [optional]
**preferredLocale** | **String** |  |  [optional]
**preferredName** | **String** |  |  [optional]
**prefix** | **String** |  |  [optional]
**socialAccounts** | [**List&lt;InfusionsoftSocialAccount&gt;**](InfusionsoftSocialAccount.md) |  |  [optional]
**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  [optional]
**spouseName** | **String** |  |  [optional]
**suffix** | **String** |  |  [optional]
**timeZone** | **String** |  |  [optional]
**website** | **String** |  |  [optional]


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



