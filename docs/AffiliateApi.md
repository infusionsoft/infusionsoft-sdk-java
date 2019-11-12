# AffiliateApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAffiliateModelUsingGET**](AffiliateApi.md#retrieveAffiliateModelUsingGET) | **GET** /affiliates/model | Retrieve Affiliate Model
[**searchCommissionsUsingGET**](AffiliateApi.md#searchCommissionsUsingGET) | **GET** /affiliates/commissions | Retrieve Commissions


<a name="retrieveAffiliateModelUsingGET"></a>
# **retrieveAffiliateModelUsingGET**
> InfusionsoftObjectModel retrieveAffiliateModelUsingGET()

Retrieve Affiliate Model

Get the custom fields for the Affiliate object

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.AffiliateApi;


AffiliateApi apiInstance = new AffiliateApi();
try {
    InfusionsoftObjectModel result = apiInstance.retrieveAffiliateModelUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AffiliateApi#retrieveAffiliateModelUsingGET");
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

<a name="searchCommissionsUsingGET"></a>
# **searchCommissionsUsingGET**
> InfusionsoftAffiliateCommissionList searchCommissionsUsingGET(since, until, limit, offset, affiliateId)

Retrieve Commissions

Retrieve a list of Commissions based on Affiliate or Date Range

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.AffiliateApi;


AffiliateApi apiInstance = new AffiliateApi();
String since = "since_example"; // String | Date to start searching from ex. `2017-01-01T22:17:59.039Z`
String until = "until_example"; // String | Date to search to ex. `2017-01-01T22:17:59.039Z`
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
Long affiliateId = 789L; // Long | Affiliate to retrieve commissions for
try {
    InfusionsoftAffiliateCommissionList result = apiInstance.searchCommissionsUsingGET(since, until, limit, offset, affiliateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AffiliateApi#searchCommissionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **String**| Date to start searching from ex. &#x60;2017-01-01T22:17:59.039Z&#x60; | [optional]
 **until** | **String**| Date to search to ex. &#x60;2017-01-01T22:17:59.039Z&#x60; | [optional]
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **affiliateId** | **Long**| Affiliate to retrieve commissions for | [optional]

### Return type

[**InfusionsoftAffiliateCommissionList**](InfusionsoftAffiliateCommissionList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

