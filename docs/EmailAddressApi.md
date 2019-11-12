# EmailAddressApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**replaceEmailAddressUsingPUT**](EmailAddressApi.md#replaceEmailAddressUsingPUT) | **PUT** /emailAddresses/{email} | Replace an Email Address


<a name="replaceEmailAddressUsingPUT"></a>
# **replaceEmailAddressUsingPUT**
> InfusionsoftRestEmailAddress replaceEmailAddressUsingPUT(email, update)

Replace an Email Address

Replaces all of the values of a given email address

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.EmailAddressApi;


EmailAddressApi apiInstance = new EmailAddressApi();
String email = "email_example"; // String | email
InfusionsoftUpdateEmailAddress update = new InfusionsoftUpdateEmailAddress(); // InfusionsoftUpdateEmailAddress | update
try {
    InfusionsoftRestEmailAddress result = apiInstance.replaceEmailAddressUsingPUT(email, update);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailAddressApi#replaceEmailAddressUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| email |
 **update** | [**InfusionsoftUpdateEmailAddress**](InfusionsoftUpdateEmailAddress.md)| update |

### Return type

[**InfusionsoftRestEmailAddress**](InfusionsoftRestEmailAddress.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

