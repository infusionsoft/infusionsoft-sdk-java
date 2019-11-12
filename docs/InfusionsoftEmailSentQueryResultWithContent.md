
# InfusionsoftEmailSentQueryResultWithContent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clickedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**contactId** | **Long** |  |  [optional]
**headers** | **String** |  |  [optional]
**htmlContent** | **String** | Base64 encoded HTML |  [optional]
**id** | **Long** |  |  [optional]
**openedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**originalProvider** | [**OriginalProviderEnum**](#OriginalProviderEnum) |  |  [optional]
**originalProviderId** | **String** |  |  [optional]
**plainContent** | **String** | Base64 encoded plain text |  [optional]
**receivedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**sentDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**sentFromAddress** | **String** |  |  [optional]
**sentFromReplyAddress** | **String** |  |  [optional]
**sentToAddress** | **String** |  |  [optional]
**sentToBccAddresses** | **String** |  |  [optional]
**sentToCcAddresses** | **String** |  |  [optional]
**subject** | **String** |  |  [optional]


<a name="OriginalProviderEnum"></a>
## Enum: OriginalProviderEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
INFUSIONSOFT | &quot;INFUSIONSOFT&quot;
MICROSOFT | &quot;MICROSOFT&quot;
GOOGLE | &quot;GOOGLE&quot;



