# MerchantApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchantAccountsUsingGET**](MerchantApi.md#getMerchantAccountsUsingGET) | **GET** /merchants | List Merchants


<a name="getMerchantAccountsUsingGET"></a>
# **getMerchantAccountsUsingGET**
> InfusionsoftRestMerchantAccountResponse getMerchantAccountsUsingGET()

List Merchants

Retrieves a list of all merchant accounts

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.MerchantApi;


MerchantApi apiInstance = new MerchantApi();
try {
    InfusionsoftRestMerchantAccountResponse result = apiInstance.getMerchantAccountsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantApi#getMerchantAccountsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InfusionsoftRestMerchantAccountResponse**](InfusionsoftRestMerchantAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

