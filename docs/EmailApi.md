# EmailApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmailUsingPOST**](EmailApi.md#createEmailUsingPOST) | **POST** /emails | Create an Email Record
[**createEmailsUsingPOST**](EmailApi.md#createEmailsUsingPOST) | **POST** /emails/sync | Create a set of Email Records
[**deleteEmailUsingDELETE**](EmailApi.md#deleteEmailUsingDELETE) | **DELETE** /emails/{id} | Delete an Email Record
[**deleteEmailsUsingPOST**](EmailApi.md#deleteEmailsUsingPOST) | **POST** /emails/unsync | Un-sync a batch of Email Records
[**getEmailUsingGET**](EmailApi.md#getEmailUsingGET) | **GET** /emails/{id} | Retrieve an Email
[**listEmailsUsingGET**](EmailApi.md#listEmailsUsingGET) | **GET** /emails | List Emails
[**sendEmailUsingPOST**](EmailApi.md#sendEmailUsingPOST) | **POST** /emails/queue | Send an Email
[**updateEmailUsingPUT**](EmailApi.md#updateEmailUsingPUT) | **PUT** /emails/{id} | Update an Email Record


<a name="createEmailUsingPOST"></a>
# **createEmailUsingPOST**
> InfusionsoftEmailSentCreate createEmailUsingPOST(emailWithContent)

Create an Email Record

Create a record of an email sent to a contact

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.EmailApi;


EmailApi apiInstance = new EmailApi();
InfusionsoftEmailSentCreate emailWithContent = new InfusionsoftEmailSentCreate(); // InfusionsoftEmailSentCreate | Email records to persist, with content.
try {
    InfusionsoftEmailSentCreate result = apiInstance.createEmailUsingPOST(emailWithContent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#createEmailUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailWithContent** | [**InfusionsoftEmailSentCreate**](InfusionsoftEmailSentCreate.md)| Email records to persist, with content. | [optional]

### Return type

[**InfusionsoftEmailSentCreate**](InfusionsoftEmailSentCreate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEmailsUsingPOST"></a>
# **createEmailsUsingPOST**
> InfusionsoftEmailSentCreateList createEmailsUsingPOST(emailWithContent)

Create a set of Email Records

Create a set of records of emails sent to contacts, maximum 1000 per transaction.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.EmailApi;


EmailApi apiInstance = new EmailApi();
InfusionsoftEmailSentCreateList emailWithContent = new InfusionsoftEmailSentCreateList(); // InfusionsoftEmailSentCreateList | Email records to persist, with content.
try {
    InfusionsoftEmailSentCreateList result = apiInstance.createEmailsUsingPOST(emailWithContent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#createEmailsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailWithContent** | [**InfusionsoftEmailSentCreateList**](InfusionsoftEmailSentCreateList.md)| Email records to persist, with content. | [optional]

### Return type

[**InfusionsoftEmailSentCreateList**](InfusionsoftEmailSentCreateList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmailUsingDELETE"></a>
# **deleteEmailUsingDELETE**
> deleteEmailUsingDELETE(id)

Delete an Email Record

Delete a specific email record

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.EmailApi;


EmailApi apiInstance = new EmailApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteEmailUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#deleteEmailUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmailsUsingPOST"></a>
# **deleteEmailsUsingPOST**
> Map&lt;String, String&gt; deleteEmailsUsingPOST(emailIds)

Un-sync a batch of Email Records

Un-syncs a batch of email records

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.EmailApi;


EmailApi apiInstance = new EmailApi();
InfusionsoftSetOfIds emailIds = new InfusionsoftSetOfIds(); // InfusionsoftSetOfIds | emailIds
try {
    Map<String, String> result = apiInstance.deleteEmailsUsingPOST(emailIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#deleteEmailsUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailIds** | [**InfusionsoftSetOfIds**](InfusionsoftSetOfIds.md)| emailIds |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailUsingGET"></a>
# **getEmailUsingGET**
> InfusionsoftEmailSentQueryResultWithContent getEmailUsingGET(id)

Retrieve an Email

Retrieves a single email that has been sent

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.EmailApi;


EmailApi apiInstance = new EmailApi();
Long id = 789L; // Long | id
try {
    InfusionsoftEmailSentQueryResultWithContent result = apiInstance.getEmailUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#getEmailUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**InfusionsoftEmailSentQueryResultWithContent**](InfusionsoftEmailSentQueryResultWithContent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listEmailsUsingGET"></a>
# **listEmailsUsingGET**
> InfusionsoftEmailSentQueryResultList listEmailsUsingGET(limit, offset, contactId, email, sinceSentDate, untilSentDate, ordered)

List Emails

Retrieve a list of emails that have been sent  Keap is currently investigating an issue with degraded performance of this endpoint with very large (millions of records) record sets

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.EmailApi;


EmailApi apiInstance = new EmailApi();
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
Long contactId = 789L; // Long | Optional Contact Id to find Emails for
String email = "email_example"; // String | Optional email address to query on
String sinceSentDate = "sinceSentDate_example"; // String | Optional date to query on, emails sent since the provided date, must be present if untilDate is provided
String untilSentDate = "untilSentDate_example"; // String | Optional date to query on, email sent until the provided date
Boolean ordered = true; // Boolean | Optional boolean to turn off ORDER BY in SQL query
try {
    InfusionsoftEmailSentQueryResultList result = apiInstance.listEmailsUsingGET(limit, offset, contactId, email, sinceSentDate, untilSentDate, ordered);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#listEmailsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **contactId** | **Long**| Optional Contact Id to find Emails for | [optional]
 **email** | **String**| Optional email address to query on | [optional]
 **sinceSentDate** | **String**| Optional date to query on, emails sent since the provided date, must be present if untilDate is provided | [optional]
 **untilSentDate** | **String**| Optional date to query on, email sent until the provided date | [optional]
 **ordered** | **Boolean**| Optional boolean to turn off ORDER BY in SQL query | [optional] [default to true]

### Return type

[**InfusionsoftEmailSentQueryResultList**](InfusionsoftEmailSentQueryResultList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendEmailUsingPOST"></a>
# **sendEmailUsingPOST**
> sendEmailUsingPOST(emailSendRequest)

Send an Email

Send an Email to a list of Contacts

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.EmailApi;


EmailApi apiInstance = new EmailApi();
InfusionsoftEmailSendRequest emailSendRequest = new InfusionsoftEmailSendRequest(); // InfusionsoftEmailSendRequest | emailSendRequest
try {
    apiInstance.sendEmailUsingPOST(emailSendRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#sendEmailUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailSendRequest** | [**InfusionsoftEmailSendRequest**](InfusionsoftEmailSendRequest.md)| emailSendRequest | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailUsingPUT"></a>
# **updateEmailUsingPUT**
> InfusionsoftEmailSentCreate updateEmailUsingPUT(id, emailWithContent)

Update an Email Record

Update a record of an email sent to a contact

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.EmailApi;


EmailApi apiInstance = new EmailApi();
Long id = 789L; // Long | id
InfusionsoftEmailSentCreate emailWithContent = new InfusionsoftEmailSentCreate(); // InfusionsoftEmailSentCreate | Email records to persist, with content.
try {
    InfusionsoftEmailSentCreate result = apiInstance.updateEmailUsingPUT(id, emailWithContent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#updateEmailUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |
 **emailWithContent** | [**InfusionsoftEmailSentCreate**](InfusionsoftEmailSentCreate.md)| Email records to persist, with content. | [optional]

### Return type

[**InfusionsoftEmailSentCreate**](InfusionsoftEmailSentCreate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

