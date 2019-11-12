# UsersApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserUsingPOST**](UsersApi.md#createUserUsingPOST) | **POST** /users | Create a User
[**listUsersUsingGET**](UsersApi.md#listUsersUsingGET) | **GET** /users | List Users


<a name="createUserUsingPOST"></a>
# **createUserUsingPOST**
> InfusionsoftRestUser createUserUsingPOST(user)

Create a User

Creates a new user record. NB: Users will be invited to the application and remain in the \&quot;Invited\&quot; status until the user accepts the invite. \&quot;Inactive\&quot; users will not take up a user license.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.UsersApi;


UsersApi apiInstance = new UsersApi();
InfusionsoftCreateUser user = new InfusionsoftCreateUser(); // InfusionsoftCreateUser | user
try {
    InfusionsoftRestUser result = apiInstance.createUserUsingPOST(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#createUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**InfusionsoftCreateUser**](InfusionsoftCreateUser.md)| user | [optional]

### Return type

[**InfusionsoftRestUser**](InfusionsoftRestUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listUsersUsingGET"></a>
# **listUsersUsingGET**
> InfusionsoftUsers listUsersUsingGET(limit, offset, includeInactive, includePartners)

List Users

Retrieves a list of all users

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.UsersApi;


UsersApi apiInstance = new UsersApi();
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
Boolean includeInactive = true; // Boolean | Include users that are Inactive in results, defaults to TRUE
Boolean includePartners = true; // Boolean | Include partner users in results, defaults to TRUE
try {
    InfusionsoftUsers result = apiInstance.listUsersUsingGET(limit, offset, includeInactive, includePartners);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#listUsersUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **includeInactive** | **Boolean**| Include users that are Inactive in results, defaults to TRUE | [optional]
 **includePartners** | **Boolean**| Include partner users in results, defaults to TRUE | [optional]

### Return type

[**InfusionsoftUsers**](InfusionsoftUsers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

