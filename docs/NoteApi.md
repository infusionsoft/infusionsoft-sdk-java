# NoteApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNoteCustomFieldUsingPOST**](NoteApi.md#createNoteCustomFieldUsingPOST) | **POST** /notes/model/customFields | Create a Custom Field
[**createNoteUsingPOST**](NoteApi.md#createNoteUsingPOST) | **POST** /notes | Create a Note
[**deleteNoteUsingDELETE**](NoteApi.md#deleteNoteUsingDELETE) | **DELETE** /notes/{noteId} | Delete a Note
[**getNoteUsingGET**](NoteApi.md#getNoteUsingGET) | **GET** /notes/{noteId} | Retrieve a Note
[**listNotesUsingGET**](NoteApi.md#listNotesUsingGET) | **GET** /notes | List Notes
[**retrieveNoteModelUsingGET**](NoteApi.md#retrieveNoteModelUsingGET) | **GET** /notes/model | Retrieve Note Model
[**updateNoteUsingPUT**](NoteApi.md#updateNoteUsingPUT) | **PUT** /notes/{noteId} | Replace a Note
[**updatePropertiesOnNoteUsingPATCH**](NoteApi.md#updatePropertiesOnNoteUsingPATCH) | **PATCH** /notes/{noteId} | Update a Note


<a name="createNoteCustomFieldUsingPOST"></a>
# **createNoteCustomFieldUsingPOST**
> InfusionsoftCustomFieldMetaData createNoteCustomFieldUsingPOST(customField)

Create a Custom Field

Adds a custom field of the specified type and options to the Note object.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.NoteApi;


NoteApi apiInstance = new NoteApi();
InfusionsoftCreateRestCustomField customField = new InfusionsoftCreateRestCustomField(); // InfusionsoftCreateRestCustomField | customField
try {
    InfusionsoftCustomFieldMetaData result = apiInstance.createNoteCustomFieldUsingPOST(customField);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NoteApi#createNoteCustomFieldUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customField** | [**InfusionsoftCreateRestCustomField**](InfusionsoftCreateRestCustomField.md)| customField |

### Return type

[**InfusionsoftCustomFieldMetaData**](InfusionsoftCustomFieldMetaData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNoteUsingPOST"></a>
# **createNoteUsingPOST**
> InfusionsoftNote createNoteUsingPOST(createNote)

Create a Note

Creates a new note as the authenticated user. Either a \&quot;title\&quot; or \&quot;body\&quot; is required

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.NoteApi;


NoteApi apiInstance = new NoteApi();
InfusionsoftRequestNote createNote = new InfusionsoftRequestNote(); // InfusionsoftRequestNote | createNote
try {
    InfusionsoftNote result = apiInstance.createNoteUsingPOST(createNote);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NoteApi#createNoteUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createNote** | [**InfusionsoftRequestNote**](InfusionsoftRequestNote.md)| createNote |

### Return type

[**InfusionsoftNote**](InfusionsoftNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNoteUsingDELETE"></a>
# **deleteNoteUsingDELETE**
> deleteNoteUsingDELETE(noteId)

Delete a Note

Deletes a note

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.NoteApi;


NoteApi apiInstance = new NoteApi();
Long noteId = 789L; // Long | noteId
try {
    apiInstance.deleteNoteUsingDELETE(noteId);
} catch (ApiException e) {
    System.err.println("Exception when calling NoteApi#deleteNoteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **noteId** | **Long**| noteId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNoteUsingGET"></a>
# **getNoteUsingGET**
> InfusionsoftNote getNoteUsingGET(noteId)

Retrieve a Note

Retrieves a single note

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.NoteApi;


NoteApi apiInstance = new NoteApi();
Long noteId = 789L; // Long | noteId
try {
    InfusionsoftNote result = apiInstance.getNoteUsingGET(noteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NoteApi#getNoteUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **noteId** | **Long**| noteId |

### Return type

[**InfusionsoftNote**](InfusionsoftNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNotesUsingGET"></a>
# **listNotesUsingGET**
> InfusionsoftNoteList listNotesUsingGET(limit, offset, userId, contactId)

List Notes

Retrieves a list of all notes

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.NoteApi;


NoteApi apiInstance = new NoteApi();
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
Long userId = 789L; // Long | Filter based on the user id assigned to the note.
Long contactId = 789L; // Long | Filter based on the contact id assigned to the note.
try {
    InfusionsoftNoteList result = apiInstance.listNotesUsingGET(limit, offset, userId, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NoteApi#listNotesUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **userId** | **Long**| Filter based on the user id assigned to the note. | [optional]
 **contactId** | **Long**| Filter based on the contact id assigned to the note. | [optional]

### Return type

[**InfusionsoftNoteList**](InfusionsoftNoteList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveNoteModelUsingGET"></a>
# **retrieveNoteModelUsingGET**
> InfusionsoftObjectModel retrieveNoteModelUsingGET()

Retrieve Note Model

Get the custom fields for the Note object

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.NoteApi;


NoteApi apiInstance = new NoteApi();
try {
    InfusionsoftObjectModel result = apiInstance.retrieveNoteModelUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NoteApi#retrieveNoteModelUsingGET");
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

<a name="updateNoteUsingPUT"></a>
# **updateNoteUsingPUT**
> InfusionsoftNote updateNoteUsingPUT(note, requestNote)

Replace a Note

Replaces all values of a given note

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.NoteApi;


NoteApi apiInstance = new NoteApi();
Long note = 789L; // Long | note
InfusionsoftRequestNote requestNote = new InfusionsoftRequestNote(); // InfusionsoftRequestNote | requestNote
try {
    InfusionsoftNote result = apiInstance.updateNoteUsingPUT(note, requestNote);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NoteApi#updateNoteUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **note** | **Long**| note |
 **requestNote** | [**InfusionsoftRequestNote**](InfusionsoftRequestNote.md)| requestNote |

### Return type

[**InfusionsoftNote**](InfusionsoftNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePropertiesOnNoteUsingPATCH"></a>
# **updatePropertiesOnNoteUsingPATCH**
> InfusionsoftNote updatePropertiesOnNoteUsingPATCH(noteId, note)

Update a Note

Updates a note with only the values provided in the request

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.NoteApi;


NoteApi apiInstance = new NoteApi();
Long noteId = 789L; // Long | noteId
InfusionsoftUpdateNote note = new InfusionsoftUpdateNote(); // InfusionsoftUpdateNote | note
try {
    InfusionsoftNote result = apiInstance.updatePropertiesOnNoteUsingPATCH(noteId, note);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NoteApi#updatePropertiesOnNoteUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **noteId** | **Long**| noteId |
 **note** | [**InfusionsoftUpdateNote**](InfusionsoftUpdateNote.md)| note | [optional]

### Return type

[**InfusionsoftNote**](InfusionsoftNote.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

