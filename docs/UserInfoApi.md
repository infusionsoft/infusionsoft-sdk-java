# UserInfoApi

All URIs are relative to *https://api.infusiontest.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserInfoUsingGET**](UserInfoApi.md#getUserInfoUsingGET) | **GET** /oauth/connect/userinfo | Retrieve User Info


<a name="getUserInfoUsingGET"></a>
# **getUserInfoUsingGET**
> InfusionsoftUserInfoDTO getUserInfoUsingGET()

Retrieve User Info

Retrieves information for the current authenticated end-user, as outlined by the [OpenID Connect specification](http://openid.net/specs/openid-connect-core-1_0.html#UserInfo).

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.UserInfoApi;


UserInfoApi apiInstance = new UserInfoApi();
try {
    InfusionsoftUserInfoDTO result = apiInstance.getUserInfoUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInfoApi#getUserInfoUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InfusionsoftUserInfoDTO**](InfusionsoftUserInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

