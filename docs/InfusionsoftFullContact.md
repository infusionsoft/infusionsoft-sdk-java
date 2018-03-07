
# InfusionsoftFullContact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | [**List&lt;InfusionsoftAddress&gt;**](InfusionsoftAddress.md) |  |  [optional]
**anniversary** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**birthday** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**company** | [**InfusionsoftCompany**](InfusionsoftCompany.md) |  |  [optional]
**contactType** | **String** |  |  [optional]
**customFields** | [**List&lt;InfusionsoftCustomFieldValue&gt;**](InfusionsoftCustomFieldValue.md) |  |  [optional]
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**emailAddresses** | [**List&lt;InfusionsoftEmailAddress&gt;**](InfusionsoftEmailAddress.md) |  |  [optional]
**familyName** | **String** |  |  [optional]
**faxNumbers** | [**List&lt;InfusionsoftFaxNumber&gt;**](InfusionsoftFaxNumber.md) |  |  [optional]
**givenName** | **String** |  |  [optional]
**jobTitle** | **String** |  |  [optional]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**leadSourceId** | **Long** |  |  [optional]
**middleName** | **String** |  |  [optional]
**notes** | **String** |  |  [optional]
**optInReason** | **String** |  |  [optional]
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



