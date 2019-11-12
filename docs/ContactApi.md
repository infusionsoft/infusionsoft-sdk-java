# ContactApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyTagsToContactIdUsingPOST**](ContactApi.md#applyTagsToContactIdUsingPOST) | **POST** /contacts/{contactId}/tags | Apply Tags
[**createContactUsingPOST**](ContactApi.md#createContactUsingPOST) | **POST** /contacts | Create a Contact
[**createCreditCardUsingPOST**](ContactApi.md#createCreditCardUsingPOST) | **POST** /contacts/{contactId}/creditCards | Create a Credit Card
[**createCustomFieldUsingPOST**](ContactApi.md#createCustomFieldUsingPOST) | **POST** /contacts/model/customFields | Create a Custom Field
[**createEmailForContactUsingPOST**](ContactApi.md#createEmailForContactUsingPOST) | **POST** /contacts/{contactId}/emails | Create an Email Record
[**createOrUpdateContactUsingPUT**](ContactApi.md#createOrUpdateContactUsingPUT) | **PUT** /contacts | Create or Update a Contact
[**deleteContactUsingDELETE**](ContactApi.md#deleteContactUsingDELETE) | **DELETE** /contacts/{contactId} | Delete a Contact
[**getContactUsingGET**](ContactApi.md#getContactUsingGET) | **GET** /contacts/{id} | Retrieve a Contact
[**listAppliedTagsUsingGET**](ContactApi.md#listAppliedTagsUsingGET) | **GET** /contacts/{contactId}/tags | List Applied Tags
[**listContactsUsingGET**](ContactApi.md#listContactsUsingGET) | **GET** /contacts | List Contacts
[**listCreditCardsUsingGET**](ContactApi.md#listCreditCardsUsingGET) | **GET** /contacts/{contactId}/creditCards | Retrieve Credit Cards
[**listEmailsForContactUsingGET**](ContactApi.md#listEmailsForContactUsingGET) | **GET** /contacts/{contactId}/emails | List Emails
[**removeTagsFromContactUsingDELETE**](ContactApi.md#removeTagsFromContactUsingDELETE) | **DELETE** /contacts/{contactId}/tags | Remove Applied Tags
[**removeTagsFromContactUsingDELETE1**](ContactApi.md#removeTagsFromContactUsingDELETE1) | **DELETE** /contacts/{contactId}/tags/{tagId} | Remove Applied Tag
[**retrieveContactModelUsingGET**](ContactApi.md#retrieveContactModelUsingGET) | **GET** /contacts/model | Retrieve Contact Model
[**updatePropertiesOnContactUsingPATCH1**](ContactApi.md#updatePropertiesOnContactUsingPATCH1) | **PATCH** /contacts/{contactId} | Update a Contact


<a name="applyTagsToContactIdUsingPOST"></a>
# **applyTagsToContactIdUsingPOST**
> List&lt;InfusionsoftEntrylongstring&gt; applyTagsToContactIdUsingPOST(contactId, tagIds)

Apply Tags

Apply a list of tags to a given contact record

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
Long contactId = 789L; // Long | contactId
InfusionsoftTagId tagIds = new InfusionsoftTagId(); // InfusionsoftTagId | tagIds
try {
    List<InfusionsoftEntrylongstring> result = apiInstance.applyTagsToContactIdUsingPOST(contactId, tagIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#applyTagsToContactIdUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **Long**| contactId |
 **tagIds** | [**InfusionsoftTagId**](InfusionsoftTagId.md)| tagIds |

### Return type

[**List&lt;InfusionsoftEntrylongstring&gt;**](InfusionsoftEntrylongstring.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createContactUsingPOST"></a>
# **createContactUsingPOST**
> InfusionsoftFullContact createContactUsingPOST(contact)

Create a Contact

Creates a new contact as the authenticated user. NB: Contact must contain at least one item in &#x60;email_addresses&#x60; or &#x60;phone_numbers&#x60; and &#x60;country_code&#x60; is required if &#x60;region&#x60; is specified.  Please see the body schema for updates to the postal code field.  You may opt-in or mark a Contact as _Marketable_ by including the following field in the request JSON with an opt-in reason. (This field is also shown in the complete request body sample.) The reason you provide here will help with compliance. Example reasons: \&quot;Customer opted-in through webform\&quot;, \&quot;Contact gave explicit permission.\&quot;  &#x60;&#x60;&#x60;json \&quot;opt_in_reason\&quot;: \&quot;your reason for opt-in\&quot; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
InfusionsoftCreateOrPatchContact contact = new InfusionsoftCreateOrPatchContact(); // InfusionsoftCreateOrPatchContact | contact
try {
    InfusionsoftFullContact result = apiInstance.createContactUsingPOST(contact);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#createContactUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact** | [**InfusionsoftCreateOrPatchContact**](InfusionsoftCreateOrPatchContact.md)| contact | [optional]

### Return type

[**InfusionsoftFullContact**](InfusionsoftFullContact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCreditCardUsingPOST"></a>
# **createCreditCardUsingPOST**
> InfusionsoftCreditCardAdded createCreditCardUsingPOST(contactId, creditCard)

Create a Credit Card

Creates a new credit card associated to a contact

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
Long contactId = 789L; // Long | contactId
InfusionsoftCreditCard creditCard = new InfusionsoftCreditCard(); // InfusionsoftCreditCard | creditCard
try {
    InfusionsoftCreditCardAdded result = apiInstance.createCreditCardUsingPOST(contactId, creditCard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#createCreditCardUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **Long**| contactId |
 **creditCard** | [**InfusionsoftCreditCard**](InfusionsoftCreditCard.md)| creditCard | [optional]

### Return type

[**InfusionsoftCreditCardAdded**](InfusionsoftCreditCardAdded.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCustomFieldUsingPOST"></a>
# **createCustomFieldUsingPOST**
> InfusionsoftCustomFieldMetaData createCustomFieldUsingPOST(customField)

Create a Custom Field

Adds a custom field of the specified type and options to the Contact object.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
InfusionsoftCreateRestCustomField customField = new InfusionsoftCreateRestCustomField(); // InfusionsoftCreateRestCustomField | customField
try {
    InfusionsoftCustomFieldMetaData result = apiInstance.createCustomFieldUsingPOST(customField);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#createCustomFieldUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customField** | [**InfusionsoftCreateRestCustomField**](InfusionsoftCreateRestCustomField.md)| customField |

### Return type

[**InfusionsoftCustomFieldMetaData**](InfusionsoftCustomFieldMetaData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEmailForContactUsingPOST"></a>
# **createEmailForContactUsingPOST**
> InfusionsoftEmailSentCreate createEmailForContactUsingPOST(contactId, emailWithContent)

Create an Email Record

Create a record of an email sent to a contact

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
Long contactId = 789L; // Long | contactId
InfusionsoftEmailSentCreate emailWithContent = new InfusionsoftEmailSentCreate(); // InfusionsoftEmailSentCreate | Email records to persist, with content.
try {
    InfusionsoftEmailSentCreate result = apiInstance.createEmailForContactUsingPOST(contactId, emailWithContent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#createEmailForContactUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **Long**| contactId |
 **emailWithContent** | [**InfusionsoftEmailSentCreate**](InfusionsoftEmailSentCreate.md)| Email records to persist, with content. | [optional]

### Return type

[**InfusionsoftEmailSentCreate**](InfusionsoftEmailSentCreate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrUpdateContactUsingPUT"></a>
# **createOrUpdateContactUsingPUT**
> InfusionsoftFullContact createOrUpdateContactUsingPUT(contact)

Create or Update a Contact

Creates a new contact or updates a contact as the authenticated user. NB: New Contacts must contain at least one item in &#x60;email_addresses&#x60; or &#x60;phone_numbers&#x60; and &#x60;country_code&#x60; is required if &#x60;region&#x60; is specified. Existing Contacts are updated with only the values provided in the request. Accepts a &#x60;duplicate_option&#x60; which performs duplicate checking by one of the following options: &#x60;Email&#x60;, &#x60;EmailAndName&#x60;, if a match is found using the option provided, the existing contact will be updated. If an existing contact was not found using the &#x60;duplicate_option&#x60; provided, a new contact record will be created.  You may opt-in or mark a Contact as _Marketable_ by including the following field in the request JSON with an opt-in reason. (This field is also shown in the complete request body sample.) The reason you provide here will help with compliance. Example reasons: \&quot;Customer opted-in through webform\&quot;, \&quot;Contact gave explicit permission.\&quot;  &#x60;&#x60;&#x60;json \&quot;opt_in_reason\&quot;: \&quot;your reason for opt-in\&quot; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
InfusionsoftUpsertContact contact = new InfusionsoftUpsertContact(); // InfusionsoftUpsertContact | contact
try {
    InfusionsoftFullContact result = apiInstance.createOrUpdateContactUsingPUT(contact);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#createOrUpdateContactUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contact** | [**InfusionsoftUpsertContact**](InfusionsoftUpsertContact.md)| contact | [optional]

### Return type

[**InfusionsoftFullContact**](InfusionsoftFullContact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContactUsingDELETE"></a>
# **deleteContactUsingDELETE**
> deleteContactUsingDELETE(contactId)

Delete a Contact

Deletes the specified contact.   If a request header named &#x60;GDPR-Redact&#x60; is included, the contact will instead be redacted according to [GDPR guidlines](https://gdpr-info.eu/). Redacting a contact will remove all personally identifiable information and cannot be undone.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
Long contactId = 789L; // Long | contactId
try {
    apiInstance.deleteContactUsingDELETE(contactId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#deleteContactUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **Long**| contactId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactUsingGET"></a>
# **getContactUsingGET**
> InfusionsoftFullContact getContactUsingGET(id, optionalProperties)

Retrieve a Contact

Retrieves a single contact

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
Long id = 789L; // Long | id
List<String> optionalProperties = Arrays.asList("optionalProperties_example"); // List<String> | Comma-delimited list of Contact properties to include in the response. (Some fields such as `lead_source_id`, `custom_fields`, and `job_title` aren't included, by default.)
try {
    InfusionsoftFullContact result = apiInstance.getContactUsingGET(id, optionalProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getContactUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **optionalProperties** | [**List&lt;String&gt;**](String.md)| Comma-delimited list of Contact properties to include in the response. (Some fields such as &#x60;lead_source_id&#x60;, &#x60;custom_fields&#x60;, and &#x60;job_title&#x60; aren&#39;t included, by default.) | [optional]

### Return type

[**InfusionsoftFullContact**](InfusionsoftFullContact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAppliedTagsUsingGET"></a>
# **listAppliedTagsUsingGET**
> InfusionsoftContactTagList listAppliedTagsUsingGET(contactId, limit, offset)

List Applied Tags

Retrieves a list of tags applied to a given contact

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
Long contactId = 789L; // Long | contactId
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
try {
    InfusionsoftContactTagList result = apiInstance.listAppliedTagsUsingGET(contactId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#listAppliedTagsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **Long**| contactId |
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]

### Return type

[**InfusionsoftContactTagList**](InfusionsoftContactTagList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listContactsUsingGET"></a>
# **listContactsUsingGET**
> InfusionsoftContactList listContactsUsingGET(limit, offset, email, givenName, familyName, order, orderDirection, since, until)

List Contacts

Retrieves a list of all contacts

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
String email = "email_example"; // String | Optional email address to query on
String givenName = "givenName_example"; // String | Optional first name or forename to query on
String familyName = "familyName_example"; // String | Optional last name or surname to query on
String order = "order_example"; // String | Attribute to order items by
String orderDirection = "orderDirection_example"; // String | How to order the data i.e. ascending (A-Z) or descending (Z-A)
String since = "since_example"; // String | Date to start searching from on LastUpdated ex. `2017-01-01T22:17:59.039Z`
String until = "until_example"; // String | Date to search to on LastUpdated ex. `2017-01-01T22:17:59.039Z`
try {
    InfusionsoftContactList result = apiInstance.listContactsUsingGET(limit, offset, email, givenName, familyName, order, orderDirection, since, until);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#listContactsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **email** | **String**| Optional email address to query on | [optional]
 **givenName** | **String**| Optional first name or forename to query on | [optional]
 **familyName** | **String**| Optional last name or surname to query on | [optional]
 **order** | **String**| Attribute to order items by | [optional] [enum: id, date_created, name, email]
 **orderDirection** | **String**| How to order the data i.e. ascending (A-Z) or descending (Z-A) | [optional] [enum: ascending, descending]
 **since** | **String**| Date to start searching from on LastUpdated ex. &#x60;2017-01-01T22:17:59.039Z&#x60; | [optional]
 **until** | **String**| Date to search to on LastUpdated ex. &#x60;2017-01-01T22:17:59.039Z&#x60; | [optional]

### Return type

[**InfusionsoftContactList**](InfusionsoftContactList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCreditCardsUsingGET"></a>
# **listCreditCardsUsingGET**
> List&lt;InfusionsoftContactCreditCard&gt; listCreditCardsUsingGET(contactId)

Retrieve Credit Cards

List all Credit Cards on a contact

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
Long contactId = 789L; // Long | contactId
try {
    List<InfusionsoftContactCreditCard> result = apiInstance.listCreditCardsUsingGET(contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#listCreditCardsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **Long**| contactId |

### Return type

[**List&lt;InfusionsoftContactCreditCard&gt;**](InfusionsoftContactCreditCard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listEmailsForContactUsingGET"></a>
# **listEmailsForContactUsingGET**
> InfusionsoftEmailSentQueryResultList listEmailsForContactUsingGET(contactId, limit, offset, email)

List Emails

List Emails that have been sent to a Contact

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
Long contactId = 789L; // Long | contactId
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
String email = "email_example"; // String | Optional email address to query on
try {
    InfusionsoftEmailSentQueryResultList result = apiInstance.listEmailsForContactUsingGET(contactId, limit, offset, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#listEmailsForContactUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **Long**| contactId |
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **email** | **String**| Optional email address to query on | [optional]

### Return type

[**InfusionsoftEmailSentQueryResultList**](InfusionsoftEmailSentQueryResultList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeTagsFromContactUsingDELETE"></a>
# **removeTagsFromContactUsingDELETE**
> removeTagsFromContactUsingDELETE(contactId, ids)

Remove Applied Tags

Removes a list of tags from the given contact

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
Long contactId = 789L; // Long | contactId
String ids = "ids_example"; // String | ids
try {
    apiInstance.removeTagsFromContactUsingDELETE(contactId, ids);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#removeTagsFromContactUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **Long**| contactId |
 **ids** | **String**| ids |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeTagsFromContactUsingDELETE1"></a>
# **removeTagsFromContactUsingDELETE1**
> removeTagsFromContactUsingDELETE1(contactId, tagId)

Remove Applied Tag

Removes a tag from the given contact

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
Long contactId = 789L; // Long | contactId
Long tagId = 789L; // Long | tagId
try {
    apiInstance.removeTagsFromContactUsingDELETE1(contactId, tagId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#removeTagsFromContactUsingDELETE1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **Long**| contactId |
 **tagId** | **Long**| tagId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveContactModelUsingGET"></a>
# **retrieveContactModelUsingGET**
> InfusionsoftObjectModel retrieveContactModelUsingGET()

Retrieve Contact Model

Get the custom fields and optional properties for the Contact object

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
try {
    InfusionsoftObjectModel result = apiInstance.retrieveContactModelUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#retrieveContactModelUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InfusionsoftObjectModel**](InfusionsoftObjectModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePropertiesOnContactUsingPATCH1"></a>
# **updatePropertiesOnContactUsingPATCH1**
> InfusionsoftFullContact updatePropertiesOnContactUsingPATCH1(contactId, contact, updateMask)

Update a Contact

Updates a contact with only the values provided in the request.  You may opt-in or mark a Contact as _Marketable_ by including the following field in the request JSON with an opt-in reason. (This field is also shown in the complete request body sample.) The reason you provide here will help with compliance. Example reasons: \&quot;Customer opted-in through webform\&quot;, \&quot;Contact gave explicit permission.\&quot;  &#x60;&#x60;&#x60;json \&quot;opt_in_reason\&quot;: \&quot;your reason for opt-in\&quot; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ContactApi;


ContactApi apiInstance = new ContactApi();
Long contactId = 789L; // Long | contactId
InfusionsoftCreateOrPatchContact contact = new InfusionsoftCreateOrPatchContact(); // InfusionsoftCreateOrPatchContact | contact
List<String> updateMask = Arrays.asList("updateMask_example"); // List<String> | An optional list of properties to be updated. If set, only the provided properties will be updated and others will be skipped.
try {
    InfusionsoftFullContact result = apiInstance.updatePropertiesOnContactUsingPATCH1(contactId, contact, updateMask);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#updatePropertiesOnContactUsingPATCH1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **Long**| contactId |
 **contact** | [**InfusionsoftCreateOrPatchContact**](InfusionsoftCreateOrPatchContact.md)| contact | [optional]
 **updateMask** | [**List&lt;String&gt;**](String.md)| An optional list of properties to be updated. If set, only the provided properties will be updated and others will be skipped. | [optional]

### Return type

[**InfusionsoftFullContact**](InfusionsoftFullContact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

