# OpportunityApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOpportunityUsingPOST**](OpportunityApi.md#createOpportunityUsingPOST) | **POST** /opportunities | Create an Opportunity
[**getOpportunityUsingGET**](OpportunityApi.md#getOpportunityUsingGET) | **GET** /opportunities/{opportunityId} | Retrieve an Opportunity
[**listOpportunitiesUsingGET**](OpportunityApi.md#listOpportunitiesUsingGET) | **GET** /opportunities | List Opportunities
[**listOpportunityStagePipelinesUsingGET**](OpportunityApi.md#listOpportunityStagePipelinesUsingGET) | **GET** /opportunity/stage_pipeline | List Opportunity Stage Pipeline
[**retrieveOpportunityModelUsingGET**](OpportunityApi.md#retrieveOpportunityModelUsingGET) | **GET** /opportunities/model | Retrieve Opportunity Model
[**updateOpportunityUsingPUT**](OpportunityApi.md#updateOpportunityUsingPUT) | **PUT** /opportunities | Replace an Opportunity
[**updatePropertiesOnOpportunityUsingPATCH**](OpportunityApi.md#updatePropertiesOnOpportunityUsingPATCH) | **PATCH** /opportunities/{opportunityId} | Update an Opportunity


<a name="createOpportunityUsingPOST"></a>
# **createOpportunityUsingPOST**
> InfusionsoftOpportunity createOpportunityUsingPOST(opportunity)

Create an Opportunity

Creates a new opportunity as the authenticated user. NB: Opportunity must contain values for &#x60;opportunity_title&#x60;, &#x60;contact&#x60;, and &#x60;stage&#x60;.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.OpportunityApi;


OpportunityApi apiInstance = new OpportunityApi();
InfusionsoftOpportunity opportunity = new InfusionsoftOpportunity(); // InfusionsoftOpportunity | opportunity
try {
    InfusionsoftOpportunity result = apiInstance.createOpportunityUsingPOST(opportunity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunityApi#createOpportunityUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **opportunity** | [**InfusionsoftOpportunity**](InfusionsoftOpportunity.md)| opportunity | [optional]

### Return type

[**InfusionsoftOpportunity**](InfusionsoftOpportunity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOpportunityUsingGET"></a>
# **getOpportunityUsingGET**
> InfusionsoftOpportunity getOpportunityUsingGET(opportunityId, optionalProperties)

Retrieve an Opportunity

Retrives a single opportunity

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.OpportunityApi;


OpportunityApi apiInstance = new OpportunityApi();
Long opportunityId = 789L; // Long | opportunityId
List<String> optionalProperties = Arrays.asList("optionalProperties_example"); // List<String> | Comma-delimited list of Opportunity properties to include in the response. (Some fields such as `custom_fields` aren't included, by default.)
try {
    InfusionsoftOpportunity result = apiInstance.getOpportunityUsingGET(opportunityId, optionalProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunityApi#getOpportunityUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **opportunityId** | **Long**| opportunityId |
 **optionalProperties** | [**List&lt;String&gt;**](String.md)| Comma-delimited list of Opportunity properties to include in the response. (Some fields such as &#x60;custom_fields&#x60; aren&#39;t included, by default.) | [optional]

### Return type

[**InfusionsoftOpportunity**](InfusionsoftOpportunity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listOpportunitiesUsingGET"></a>
# **listOpportunitiesUsingGET**
> InfusionsoftOpportunityList listOpportunitiesUsingGET(limit, offset, userId, stageId, searchTerm, order)

List Opportunities

Retrieves a list of all opportunities.  Please note: the sample response erroneously shows properties, such as _stage reasons_, that are unavailable through the list endpoint. Such properties are only available through the retrieve operation. Future versions of the Opportunity resource will correct the oversight.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.OpportunityApi;


OpportunityApi apiInstance = new OpportunityApi();
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
Long userId = 789L; // Long | Returns opportunities for the provided user id
Long stageId = 789L; // Long | Returns opportunities for the provided stage id
String searchTerm = "searchTerm_example"; // String | Returns opportunities that match any of the contact's `given_name`, `family_name`, `company_name`, and `email_addresses` (searches `EMAIL1` only) fields as well as `opportunity_title`
String order = "order_example"; // String | Attribute to order items by
try {
    InfusionsoftOpportunityList result = apiInstance.listOpportunitiesUsingGET(limit, offset, userId, stageId, searchTerm, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunityApi#listOpportunitiesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **userId** | **Long**| Returns opportunities for the provided user id | [optional]
 **stageId** | **Long**| Returns opportunities for the provided stage id | [optional]
 **searchTerm** | **String**| Returns opportunities that match any of the contact&#39;s &#x60;given_name&#x60;, &#x60;family_name&#x60;, &#x60;company_name&#x60;, and &#x60;email_addresses&#x60; (searches &#x60;EMAIL1&#x60; only) fields as well as &#x60;opportunity_title&#x60; | [optional]
 **order** | **String**| Attribute to order items by | [optional] [enum: next_action, opportunity_name, contact_name, date_created]

### Return type

[**InfusionsoftOpportunityList**](InfusionsoftOpportunityList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listOpportunityStagePipelinesUsingGET"></a>
# **listOpportunityStagePipelinesUsingGET**
> List&lt;InfusionsoftSalesPipeline&gt; listOpportunityStagePipelinesUsingGET()

List Opportunity Stage Pipeline

Retrieves a list of all opportunity stages with pipeline details

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.OpportunityApi;


OpportunityApi apiInstance = new OpportunityApi();
try {
    List<InfusionsoftSalesPipeline> result = apiInstance.listOpportunityStagePipelinesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunityApi#listOpportunityStagePipelinesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InfusionsoftSalesPipeline&gt;**](InfusionsoftSalesPipeline.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOpportunityModelUsingGET"></a>
# **retrieveOpportunityModelUsingGET**
> InfusionsoftObjectModel retrieveOpportunityModelUsingGET()

Retrieve Opportunity Model

Get the custom fields for the Opportunity object

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.OpportunityApi;


OpportunityApi apiInstance = new OpportunityApi();
try {
    InfusionsoftObjectModel result = apiInstance.retrieveOpportunityModelUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunityApi#retrieveOpportunityModelUsingGET");
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

<a name="updateOpportunityUsingPUT"></a>
# **updateOpportunityUsingPUT**
> InfusionsoftOpportunity updateOpportunityUsingPUT(opportunity)

Replace an Opportunity

Replaces all values of a given opportunity

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.OpportunityApi;


OpportunityApi apiInstance = new OpportunityApi();
InfusionsoftOpportunity opportunity = new InfusionsoftOpportunity(); // InfusionsoftOpportunity | opportunity
try {
    InfusionsoftOpportunity result = apiInstance.updateOpportunityUsingPUT(opportunity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunityApi#updateOpportunityUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **opportunity** | [**InfusionsoftOpportunity**](InfusionsoftOpportunity.md)| opportunity | [optional]

### Return type

[**InfusionsoftOpportunity**](InfusionsoftOpportunity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePropertiesOnOpportunityUsingPATCH"></a>
# **updatePropertiesOnOpportunityUsingPATCH**
> InfusionsoftOpportunity updatePropertiesOnOpportunityUsingPATCH(opportunityId, opportunity)

Update an Opportunity

Updates an opportunity with only the values provided in the request.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.OpportunityApi;


OpportunityApi apiInstance = new OpportunityApi();
Long opportunityId = 789L; // Long | opportunityId
InfusionsoftOpportunity opportunity = new InfusionsoftOpportunity(); // InfusionsoftOpportunity | opportunity
try {
    InfusionsoftOpportunity result = apiInstance.updatePropertiesOnOpportunityUsingPATCH(opportunityId, opportunity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunityApi#updatePropertiesOnOpportunityUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **opportunityId** | **Long**| opportunityId |
 **opportunity** | [**InfusionsoftOpportunity**](InfusionsoftOpportunity.md)| opportunity | [optional]

### Return type

[**InfusionsoftOpportunity**](InfusionsoftOpportunity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

