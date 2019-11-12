# CampaignApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addContactToCampaignSequenceUsingPOST**](CampaignApi.md#addContactToCampaignSequenceUsingPOST) | **POST** /campaigns/{campaignId}/sequences/{sequenceId}/contacts/{contactId} | Add to Campaign Sequence
[**addContactsToCampaignSequenceUsingPOST**](CampaignApi.md#addContactsToCampaignSequenceUsingPOST) | **POST** /campaigns/{campaignId}/sequences/{sequenceId}/contacts | Add Multiple to Campaign Sequence
[**createAchieveApiGoalEventUsingPOST**](CampaignApi.md#createAchieveApiGoalEventUsingPOST) | **POST** /campaigns/goals/{integration}/{callName} | Achieve API Goal
[**getCampaignUsingGET**](CampaignApi.md#getCampaignUsingGET) | **GET** /campaigns/{campaignId} | Retrieve a Campaign
[**listCampaignsUsingGET**](CampaignApi.md#listCampaignsUsingGET) | **GET** /campaigns | List Campaigns
[**removeContactFromCampaignSequenceUsingDELETE**](CampaignApi.md#removeContactFromCampaignSequenceUsingDELETE) | **DELETE** /campaigns/{campaignId}/sequences/{sequenceId}/contacts/{contactId} | Remove from Campaign Sequence
[**removeContactsFromCampaignSequenceUsingDELETE**](CampaignApi.md#removeContactsFromCampaignSequenceUsingDELETE) | **DELETE** /campaigns/{campaignId}/sequences/{sequenceId}/contacts | Remove Multiple from Campaign Sequence


<a name="addContactToCampaignSequenceUsingPOST"></a>
# **addContactToCampaignSequenceUsingPOST**
> addContactToCampaignSequenceUsingPOST(campaignId, sequenceId, contactId)

Add to Campaign Sequence

Adds a single contact to a campaign sequence

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
Long campaignId = 789L; // Long | campaignId
Long sequenceId = 789L; // Long | sequenceId
Long contactId = 789L; // Long | contactId
try {
    apiInstance.addContactToCampaignSequenceUsingPOST(campaignId, sequenceId, contactId);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#addContactToCampaignSequenceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| campaignId |
 **sequenceId** | **Long**| sequenceId |
 **contactId** | **Long**| contactId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addContactsToCampaignSequenceUsingPOST"></a>
# **addContactsToCampaignSequenceUsingPOST**
> Map&lt;String, String&gt; addContactsToCampaignSequenceUsingPOST(campaignId, sequenceId, ids)

Add Multiple to Campaign Sequence

Adds a list of contacts to a campaign sequence

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
Long campaignId = 789L; // Long | campaignId
Long sequenceId = 789L; // Long | sequenceId
InfusionsoftSetOfIds ids = new InfusionsoftSetOfIds(); // InfusionsoftSetOfIds | ids
try {
    Map<String, String> result = apiInstance.addContactsToCampaignSequenceUsingPOST(campaignId, sequenceId, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#addContactsToCampaignSequenceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| campaignId |
 **sequenceId** | **Long**| sequenceId |
 **ids** | [**InfusionsoftSetOfIds**](InfusionsoftSetOfIds.md)| ids |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAchieveApiGoalEventUsingPOST"></a>
# **createAchieveApiGoalEventUsingPOST**
> List&lt;InfusionsoftGoalEventResultDTO&gt; createAchieveApiGoalEventUsingPOST(integration, callName, goalEvent)

Achieve API Goal

Achieves API goal for campaigns with matching integration, callName for a given contactId

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
String integration = "integration_example"; // String | integration
String callName = "callName_example"; // String | callName
InfusionsoftAchieveApiGoalEvent goalEvent = new InfusionsoftAchieveApiGoalEvent(); // InfusionsoftAchieveApiGoalEvent | goalEvent
try {
    List<InfusionsoftGoalEventResultDTO> result = apiInstance.createAchieveApiGoalEventUsingPOST(integration, callName, goalEvent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#createAchieveApiGoalEventUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration** | **String**| integration |
 **callName** | **String**| callName |
 **goalEvent** | [**InfusionsoftAchieveApiGoalEvent**](InfusionsoftAchieveApiGoalEvent.md)| goalEvent |

### Return type

[**List&lt;InfusionsoftGoalEventResultDTO&gt;**](InfusionsoftGoalEventResultDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignUsingGET"></a>
# **getCampaignUsingGET**
> InfusionsoftCampaign getCampaignUsingGET(campaignId, optionalProperties)

Retrieve a Campaign

Retrieves a single campaign

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
Long campaignId = 789L; // Long | campaignId
List<String> optionalProperties = Arrays.asList("optionalProperties_example"); // List<String> | Comma-delimited list of Campaign properties to include in the response. (The fields `goals` and `sequences` aren't included, by default.)
try {
    InfusionsoftCampaign result = apiInstance.getCampaignUsingGET(campaignId, optionalProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#getCampaignUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| campaignId |
 **optionalProperties** | [**List&lt;String&gt;**](String.md)| Comma-delimited list of Campaign properties to include in the response. (The fields &#x60;goals&#x60; and &#x60;sequences&#x60; aren&#39;t included, by default.) | [optional]

### Return type

[**InfusionsoftCampaign**](InfusionsoftCampaign.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCampaignsUsingGET"></a>
# **listCampaignsUsingGET**
> InfusionsoftCampaignList listCampaignsUsingGET(limit, offset, searchText, order, orderDirection)

List Campaigns

Retrieves all campaigns for the authenticated user

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
String searchText = "searchText_example"; // String | Optional text to search
String order = "order_example"; // String | Attribute to order items by
String orderDirection = "orderDirection_example"; // String | How to order the data i.e. ascending (A-Z) or descending (Z-A)
try {
    InfusionsoftCampaignList result = apiInstance.listCampaignsUsingGET(limit, offset, searchText, order, orderDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#listCampaignsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **searchText** | **String**| Optional text to search | [optional]
 **order** | **String**| Attribute to order items by | [optional] [enum: name, published_date, id, completed_contact_count, active_contact_count, date_created]
 **orderDirection** | **String**| How to order the data i.e. ascending (A-Z) or descending (Z-A) | [optional] [enum: ascending, descending]

### Return type

[**InfusionsoftCampaignList**](InfusionsoftCampaignList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeContactFromCampaignSequenceUsingDELETE"></a>
# **removeContactFromCampaignSequenceUsingDELETE**
> removeContactFromCampaignSequenceUsingDELETE(campaignId, sequenceId, contactId)

Remove from Campaign Sequence

Removes a single contact from a campaign sequence

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
Long campaignId = 789L; // Long | campaignId
Long sequenceId = 789L; // Long | sequenceId
Long contactId = 789L; // Long | contactId
try {
    apiInstance.removeContactFromCampaignSequenceUsingDELETE(campaignId, sequenceId, contactId);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#removeContactFromCampaignSequenceUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| campaignId |
 **sequenceId** | **Long**| sequenceId |
 **contactId** | **Long**| contactId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeContactsFromCampaignSequenceUsingDELETE"></a>
# **removeContactsFromCampaignSequenceUsingDELETE**
> removeContactsFromCampaignSequenceUsingDELETE(campaignId, sequenceId, ids)

Remove Multiple from Campaign Sequence

Removes a list of contacts from a campaign sequence

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.CampaignApi;


CampaignApi apiInstance = new CampaignApi();
Long campaignId = 789L; // Long | campaignId
Long sequenceId = 789L; // Long | sequenceId
InfusionsoftSetOfIds ids = new InfusionsoftSetOfIds(); // InfusionsoftSetOfIds | ids
try {
    apiInstance.removeContactsFromCampaignSequenceUsingDELETE(campaignId, sequenceId, ids);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#removeContactsFromCampaignSequenceUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| campaignId |
 **sequenceId** | **Long**| sequenceId |
 **ids** | [**InfusionsoftSetOfIds**](InfusionsoftSetOfIds.md)| ids |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

