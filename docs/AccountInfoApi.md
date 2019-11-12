# AccountInfoApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountProfileUsingGET**](AccountInfoApi.md#getAccountProfileUsingGET) | **GET** /account/profile | Retrieve account profile
[**updateAccountInfoUsingPUT**](AccountInfoApi.md#updateAccountInfoUsingPUT) | **PUT** /account/profile | Updates an account profile


<a name="getAccountProfileUsingGET"></a>
# **getAccountProfileUsingGET**
> InfusionsoftAccountProfile getAccountProfileUsingGET()

Retrieve account profile

Retrieves profile/company info for an account.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.AccountInfoApi;


AccountInfoApi apiInstance = new AccountInfoApi();
try {
    InfusionsoftAccountProfile result = apiInstance.getAccountProfileUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInfoApi#getAccountProfileUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InfusionsoftAccountProfile**](InfusionsoftAccountProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccountInfoUsingPUT"></a>
# **updateAccountInfoUsingPUT**
> InfusionsoftAccountProfile updateAccountInfoUsingPUT(accountInfo)

Updates an account profile

Updates profile/company info for an account.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.AccountInfoApi;


AccountInfoApi apiInstance = new AccountInfoApi();
InfusionsoftAccountProfile accountInfo = new InfusionsoftAccountProfile(); // InfusionsoftAccountProfile | accountInfo
try {
    InfusionsoftAccountProfile result = apiInstance.updateAccountInfoUsingPUT(accountInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInfoApi#updateAccountInfoUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountInfo** | [**InfusionsoftAccountProfile**](InfusionsoftAccountProfile.md)| accountInfo |

### Return type

[**InfusionsoftAccountProfile**](InfusionsoftAccountProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

