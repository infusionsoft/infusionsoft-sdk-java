# FileApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFileUsingPOST**](FileApi.md#createFileUsingPOST) | **POST** /files | Upload File
[**deleteFileUsingDELETE**](FileApi.md#deleteFileUsingDELETE) | **DELETE** /files/{fileId} | Delete File
[**getFileUsingGET**](FileApi.md#getFileUsingGET) | **GET** /files/{fileId} | Retrieve File
[**listFilesUsingGET**](FileApi.md#listFilesUsingGET) | **GET** /files | List Files
[**updateFileUsingPUT**](FileApi.md#updateFileUsingPUT) | **PUT** /files/{fileId} | Replace File


<a name="createFileUsingPOST"></a>
# **createFileUsingPOST**
> InfusionsoftFileInformation createFileUsingPOST(fileUpload)

Upload File

Upload a base64 encoded file. &#x60;contact_id&#x60; is required only when &#x60;file_association&#x60; is &#x60;CONTACT&#x60;.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.FileApi;


FileApi apiInstance = new FileApi();
InfusionsoftFileUpload fileUpload = new InfusionsoftFileUpload(); // InfusionsoftFileUpload | fileUpload
try {
    InfusionsoftFileInformation result = apiInstance.createFileUsingPOST(fileUpload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#createFileUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileUpload** | [**InfusionsoftFileUpload**](InfusionsoftFileUpload.md)| fileUpload | [optional]

### Return type

[**InfusionsoftFileInformation**](InfusionsoftFileInformation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFileUsingDELETE"></a>
# **deleteFileUsingDELETE**
> deleteFileUsingDELETE(fileId)

Delete File

Deletes the specified file

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.FileApi;


FileApi apiInstance = new FileApi();
Long fileId = 789L; // Long | fileId
try {
    apiInstance.deleteFileUsingDELETE(fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#deleteFileUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **Long**| fileId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFileUsingGET"></a>
# **getFileUsingGET**
> InfusionsoftFileInformation getFileUsingGET(fileId, optionalProperties)

Retrieve File

Retrieves metadata about a specific file. Optionally returns the base64 encoded file data.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.FileApi;


FileApi apiInstance = new FileApi();
Long fileId = 789L; // Long | fileId
List<String> optionalProperties = Arrays.asList("optionalProperties_example"); // List<String> | Comma-delimited list of File properties to include in the response. (Some fields such as `file_data` aren't included, by default.)
try {
    InfusionsoftFileInformation result = apiInstance.getFileUsingGET(fileId, optionalProperties);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#getFileUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **Long**| fileId |
 **optionalProperties** | [**List&lt;String&gt;**](String.md)| Comma-delimited list of File properties to include in the response. (Some fields such as &#x60;file_data&#x60; aren&#39;t included, by default.) | [optional]

### Return type

[**InfusionsoftFileInformation**](InfusionsoftFileInformation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFilesUsingGET"></a>
# **listFilesUsingGET**
> InfusionsoftFileList listFilesUsingGET(limit, offset, viewable, permission, type, name, contactId)

List Files

Retrieves a list of all files

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.FileApi;


FileApi apiInstance = new FileApi();
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
String viewable = "viewable_example"; // String | Include public or private files in response (PUBLIC or PRIVATE), defaults to BOTH.
String permission = "permission_example"; // String | Filter based on the permission of files (USER or COMPANY), defaults to BOTH.
String type = "type_example"; // String | Filter based on the type of file.
String name = "name_example"; // String | Filter files based on name, with '*' preceding or following to indicate LIKE queries.
Long contactId = 789L; // Long | Filter based on Contact Id, if user has permission to see Contact files.
try {
    InfusionsoftFileList result = apiInstance.listFilesUsingGET(limit, offset, viewable, permission, type, name, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#listFilesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **viewable** | **String**| Include public or private files in response (PUBLIC or PRIVATE), defaults to BOTH. | [optional] [enum: PUBLIC, PRIVATE, BOTH]
 **permission** | **String**| Filter based on the permission of files (USER or COMPANY), defaults to BOTH. | [optional] [enum: USER, COMPANY, BOTH]
 **type** | **String**| Filter based on the type of file. | [optional] [enum: Application, Image, Fax, Attachment, Ticket, Contact, DigitalProduct, Import, Hidden, WebForm, StyledCart, ReSampledImage, TemplateThumbnail, Funnel, LogoThumbnail]
 **name** | **String**| Filter files based on name, with &#39;*&#39; preceding or following to indicate LIKE queries. | [optional]
 **contactId** | **Long**| Filter based on Contact Id, if user has permission to see Contact files. | [optional]

### Return type

[**InfusionsoftFileList**](InfusionsoftFileList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFileUsingPUT"></a>
# **updateFileUsingPUT**
> InfusionsoftFileInformation updateFileUsingPUT(fileId, fileUpload)

Replace File

Upload a base64 encoded file to replace an existing one. &#x60;contact_id&#x60; is required only when &#x60;file_association&#x60; is &#x60;CONTACT&#x60;.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.FileApi;


FileApi apiInstance = new FileApi();
Long fileId = 789L; // Long | fileId
InfusionsoftFileUpload fileUpload = new InfusionsoftFileUpload(); // InfusionsoftFileUpload | fileUpload
try {
    InfusionsoftFileInformation result = apiInstance.updateFileUsingPUT(fileId, fileUpload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#updateFileUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **Long**| fileId |
 **fileUpload** | [**InfusionsoftFileUpload**](InfusionsoftFileUpload.md)| fileUpload | [optional]

### Return type

[**InfusionsoftFileInformation**](InfusionsoftFileInformation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

