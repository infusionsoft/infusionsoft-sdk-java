# LocaleApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCountriesUsingGET**](LocaleApi.md#listCountriesUsingGET) | **GET** /locales/countries | List Countries
[**listCountriesUsingGET1**](LocaleApi.md#listCountriesUsingGET1) | **GET** /locales/countries/{countryCode}/provinces | List a Country&#39;s Provinces


<a name="listCountriesUsingGET"></a>
# **listCountriesUsingGET**
> InfusionsoftCountriesByCode listCountriesUsingGET()

List Countries

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.LocaleApi;


LocaleApi apiInstance = new LocaleApi();
try {
    InfusionsoftCountriesByCode result = apiInstance.listCountriesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocaleApi#listCountriesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InfusionsoftCountriesByCode**](InfusionsoftCountriesByCode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCountriesUsingGET1"></a>
# **listCountriesUsingGET1**
> InfusionsoftProvincesByCode listCountriesUsingGET1(countryCode)

List a Country&#39;s Provinces

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.LocaleApi;


LocaleApi apiInstance = new LocaleApi();
String countryCode = "countryCode_example"; // String | countryCode
try {
    InfusionsoftProvincesByCode result = apiInstance.listCountriesUsingGET1(countryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocaleApi#listCountriesUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**| countryCode |

### Return type

[**InfusionsoftProvincesByCode**](InfusionsoftProvincesByCode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

