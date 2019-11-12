# CompanyApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompanyUsingPOST**](CompanyApi.md#createCompanyUsingPOST) | **POST** /companies | Create a Company
[**listCompaniesUsingGET**](CompanyApi.md#listCompaniesUsingGET) | **GET** /companies | List Companies
[**retrieveCompanyModelUsingGET**](CompanyApi.md#retrieveCompanyModelUsingGET) | **GET** /companies/model | Retrieve Company Model
[**updatePropertiesOnContactUsingPATCH**](CompanyApi.md#updatePropertiesOnContactUsingPATCH) | **PATCH** /company/{companyId} | Update a Company


<a name="createCompanyUsingPOST"></a>
# **createCompanyUsingPOST**
> InfusionsoftCompany createCompanyUsingPOST(company)

Create a Company

Creates a new company as the authenticated user. NB: Company must contain at least the company name. The &#x60;country_code&#x60; is required if &#x60;region&#x60; is specified.  You may opt-in or mark a Company as _Marketable_ by including the following field in the request JSON with an opt-in reason. (This field is also shown in the complete request body sample.) The reason you provide here will help with compliance. Example reasons: \&quot;Customer opted-in through webform\&quot;, \&quot;Company gave explicit permission.\&quot;  &#x60;&#x60;&#x60;json \&quot;opt_in_reason\&quot;: \&quot;your reason for opt-in\&quot; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
InfusionsoftCreateOrPatchCompany company = new InfusionsoftCreateOrPatchCompany(); // InfusionsoftCreateOrPatchCompany | company
try {
    InfusionsoftCompany result = apiInstance.createCompanyUsingPOST(company);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#createCompanyUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | [**InfusionsoftCreateOrPatchCompany**](InfusionsoftCreateOrPatchCompany.md)| company | [optional]

### Return type

[**InfusionsoftCompany**](InfusionsoftCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCompaniesUsingGET"></a>
# **listCompaniesUsingGET**
> InfusionsoftCompanyList listCompaniesUsingGET(limit, offset, companyName, order, orderDirection, optionalProperties)

List Companies

Retrieves a list of all companies

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
String companyName = "companyName_example"; // String | Optional company name to query on
String order = "order_example"; // String | Attribute to order items by
String orderDirection = "orderDirection_example"; // String | How to order the data i.e. ascending (A-Z) or descending (Z-A)
List<String> optionalProperties = Arrays.asList("optionalProperties_example"); // List<String> | Comma-delimited list of Company properties to include in the response. (Fields such as `notes`, `fax_number` and `custom_fields` aren't included, by default.)
try {
    InfusionsoftCompanyList result = apiInstance.listCompaniesUsingGET(limit, offset, companyName, order, orderDirection, optionalProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#listCompaniesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **companyName** | **String**| Optional company name to query on | [optional]
 **order** | **String**| Attribute to order items by | [optional] [enum: id, date_created, name]
 **orderDirection** | **String**| How to order the data i.e. ascending (A-Z) or descending (Z-A) | [optional] [enum: ascending, descending]
 **optionalProperties** | [**List&lt;String&gt;**](String.md)| Comma-delimited list of Company properties to include in the response. (Fields such as &#x60;notes&#x60;, &#x60;fax_number&#x60; and &#x60;custom_fields&#x60; aren&#39;t included, by default.) | [optional]

### Return type

[**InfusionsoftCompanyList**](InfusionsoftCompanyList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveCompanyModelUsingGET"></a>
# **retrieveCompanyModelUsingGET**
> InfusionsoftObjectModel retrieveCompanyModelUsingGET()

Retrieve Company Model

Get the custom fields and optional properties for the Company object

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
try {
    InfusionsoftObjectModel result = apiInstance.retrieveCompanyModelUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#retrieveCompanyModelUsingGET");
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

<a name="updatePropertiesOnContactUsingPATCH"></a>
# **updatePropertiesOnContactUsingPATCH**
> InfusionsoftCompany updatePropertiesOnContactUsingPATCH(companyId, company)

Update a Company

Updates a company with only the values provided in the request.  You may opt-in or mark a Company as _Marketable_ by including the following field in the request JSON with an opt-in reason. (This field is also shown in the complete request body sample.) The reason you provide here will help with compliance. Example reasons: \&quot;Customer opted-in through webform\&quot;, \&quot;Company gave explicit permission.\&quot;  &#x60;&#x60;&#x60;json \&quot;opt_in_reason\&quot;: \&quot;your reason for opt-in\&quot; &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
Long companyId = 789L; // Long | companyId
InfusionsoftCreateOrPatchCompany company = new InfusionsoftCreateOrPatchCompany(); // InfusionsoftCreateOrPatchCompany | company
try {
    InfusionsoftCompany result = apiInstance.updatePropertiesOnContactUsingPATCH(companyId, company);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#updatePropertiesOnContactUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Long**| companyId |
 **company** | [**InfusionsoftCreateOrPatchCompany**](InfusionsoftCreateOrPatchCompany.md)| company | [optional]

### Return type

[**InfusionsoftCompany**](InfusionsoftCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

