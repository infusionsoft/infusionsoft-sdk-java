# SettingApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApplicationEnabledUsingGET**](SettingApi.md#getApplicationEnabledUsingGET) | **GET** /setting/application/enabled | Retrieve application status
[**getContactOptionTypesUsingGET**](SettingApi.md#getContactOptionTypesUsingGET) | **GET** /setting/contact/optionTypes | List Contact types


<a name="getApplicationEnabledUsingGET"></a>
# **getApplicationEnabledUsingGET**
> InfusionsoftSetting getApplicationEnabledUsingGET()

Retrieve application status

Retrieves whether the application is enabled

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.SettingApi;


SettingApi apiInstance = new SettingApi();
try {
    InfusionsoftSetting result = apiInstance.getApplicationEnabledUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingApi#getApplicationEnabledUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InfusionsoftSetting**](InfusionsoftSetting.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactOptionTypesUsingGET"></a>
# **getContactOptionTypesUsingGET**
> InfusionsoftSetting getContactOptionTypesUsingGET()

List Contact types

Lists the Contact types in a comma-separated list

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.SettingApi;


SettingApi apiInstance = new SettingApi();
try {
    InfusionsoftSetting result = apiInstance.getContactOptionTypesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingApi#getContactOptionTypesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InfusionsoftSetting**](InfusionsoftSetting.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

