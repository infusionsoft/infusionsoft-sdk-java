# TaskApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaskCustomFieldUsingPOST**](TaskApi.md#createTaskCustomFieldUsingPOST) | **POST** /tasks/model/customFields | Create a Custom Field
[**createTaskUsingPOST**](TaskApi.md#createTaskUsingPOST) | **POST** /tasks | Create a Task
[**deleteTaskUsingDELETE**](TaskApi.md#deleteTaskUsingDELETE) | **DELETE** /tasks/{taskId} | Delete a Task
[**getTaskUsingGET**](TaskApi.md#getTaskUsingGET) | **GET** /tasks/{taskId} | Retrieve a Task
[**listTasksForCurrentUserUsingGET**](TaskApi.md#listTasksForCurrentUserUsingGET) | **GET** /tasks/search | Search Tasks
[**listTasksUsingGET**](TaskApi.md#listTasksUsingGET) | **GET** /tasks | List Tasks
[**retrieveTaskModelUsingGET**](TaskApi.md#retrieveTaskModelUsingGET) | **GET** /tasks/model | Retrieve Task Model
[**updatePropertiesOnTaskUsingPATCH**](TaskApi.md#updatePropertiesOnTaskUsingPATCH) | **PATCH** /tasks/{taskId} | Update a Task
[**updateTaskUsingPUT**](TaskApi.md#updateTaskUsingPUT) | **PUT** /tasks/{taskId} | Replace a Task


<a name="createTaskCustomFieldUsingPOST"></a>
# **createTaskCustomFieldUsingPOST**
> InfusionsoftCustomFieldMetaData createTaskCustomFieldUsingPOST(customField)

Create a Custom Field

Adds a custom field of the specified type and options to the Task object.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TaskApi;


TaskApi apiInstance = new TaskApi();
InfusionsoftCreateRestCustomField customField = new InfusionsoftCreateRestCustomField(); // InfusionsoftCreateRestCustomField | customField
try {
    InfusionsoftCustomFieldMetaData result = apiInstance.createTaskCustomFieldUsingPOST(customField);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#createTaskCustomFieldUsingPOST");
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

<a name="createTaskUsingPOST"></a>
# **createTaskUsingPOST**
> InfusionsoftTask createTaskUsingPOST(task)

Create a Task

Creates a new task as the authenticated user. NB: Contact must contain at least one item in the fields &#x60;title&#x60; and &#x60;due_date&#x60;. All other attributes are optional

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TaskApi;


TaskApi apiInstance = new TaskApi();
InfusionsoftTask task = new InfusionsoftTask(); // InfusionsoftTask | task
try {
    InfusionsoftTask result = apiInstance.createTaskUsingPOST(task);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#createTaskUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task** | [**InfusionsoftTask**](InfusionsoftTask.md)| task |

### Return type

[**InfusionsoftTask**](InfusionsoftTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTaskUsingDELETE"></a>
# **deleteTaskUsingDELETE**
> deleteTaskUsingDELETE(taskId)

Delete a Task

Permanently deletes a task

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String taskId = "taskId_example"; // String | taskId
try {
    apiInstance.deleteTaskUsingDELETE(taskId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#deleteTaskUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskUsingGET"></a>
# **getTaskUsingGET**
> InfusionsoftTask getTaskUsingGET(taskId)

Retrieve a Task

Retrieves a single task

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String taskId = "taskId_example"; // String | taskId
try {
    InfusionsoftTask result = apiInstance.getTaskUsingGET(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#getTaskUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |

### Return type

[**InfusionsoftTask**](InfusionsoftTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTasksForCurrentUserUsingGET"></a>
# **listTasksForCurrentUserUsingGET**
> InfusionsoftTaskList listTasksForCurrentUserUsingGET(contactId, hasDueDate, userId, since, until, completed, limit, offset, order)

Search Tasks

Retrieves Tasks belonging to the authenticated user using the specified search criteria

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long contactId = 789L; // Long | Returns tasks for the provided contact id
Boolean hasDueDate = true; // Boolean | Returns tasks that have an 'action date' when set to true
Long userId = 789L; // Long | Returns tasks for the provided user id
String since = "since_example"; // String | Date to start searching from ex. `2017-01-01T22:17:59.039Z`
String until = "until_example"; // String | Date to search to ex. `2017-01-01T22:17:59.039Z`
Boolean completed = true; // Boolean | Sets completed status of items to return
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
String order = "order_example"; // String | Attribute to order items by
try {
    InfusionsoftTaskList result = apiInstance.listTasksForCurrentUserUsingGET(contactId, hasDueDate, userId, since, until, completed, limit, offset, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#listTasksForCurrentUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **Long**| Returns tasks for the provided contact id | [optional]
 **hasDueDate** | **Boolean**| Returns tasks that have an &#39;action date&#39; when set to true | [optional]
 **userId** | **Long**| Returns tasks for the provided user id | [optional]
 **since** | **String**| Date to start searching from ex. &#x60;2017-01-01T22:17:59.039Z&#x60; | [optional]
 **until** | **String**| Date to search to ex. &#x60;2017-01-01T22:17:59.039Z&#x60; | [optional]
 **completed** | **Boolean**| Sets completed status of items to return | [optional]
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **order** | **String**| Attribute to order items by | [optional]

### Return type

[**InfusionsoftTaskList**](InfusionsoftTaskList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTasksUsingGET"></a>
# **listTasksUsingGET**
> InfusionsoftTaskList listTasksUsingGET(contactId, hasDueDate, userId, since, until, completed, limit, offset, order)

List Tasks

Retrieves a list of all tasks using the specified search criteria

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TaskApi;


TaskApi apiInstance = new TaskApi();
Long contactId = 789L; // Long | contact_id
Boolean hasDueDate = true; // Boolean | has_due_date
Long userId = 789L; // Long | user_id
String since = "since_example"; // String | Date to start searching from ex. `2017-01-01T22:17:59.039Z`
String until = "until_example"; // String | Date to search to ex. `2017-01-01T22:17:59.039Z`
Boolean completed = true; // Boolean | Sets completed status of items to return
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
String order = "order_example"; // String | Attribute to order items by
try {
    InfusionsoftTaskList result = apiInstance.listTasksUsingGET(contactId, hasDueDate, userId, since, until, completed, limit, offset, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#listTasksUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contactId** | **Long**| contact_id | [optional]
 **hasDueDate** | **Boolean**| has_due_date | [optional]
 **userId** | **Long**| user_id | [optional]
 **since** | **String**| Date to start searching from ex. &#x60;2017-01-01T22:17:59.039Z&#x60; | [optional]
 **until** | **String**| Date to search to ex. &#x60;2017-01-01T22:17:59.039Z&#x60; | [optional]
 **completed** | **Boolean**| Sets completed status of items to return | [optional]
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **order** | **String**| Attribute to order items by | [optional]

### Return type

[**InfusionsoftTaskList**](InfusionsoftTaskList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTaskModelUsingGET"></a>
# **retrieveTaskModelUsingGET**
> InfusionsoftObjectModel retrieveTaskModelUsingGET()

Retrieve Task Model

Get the custom fields for the Task object

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TaskApi;


TaskApi apiInstance = new TaskApi();
try {
    InfusionsoftObjectModel result = apiInstance.retrieveTaskModelUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#retrieveTaskModelUsingGET");
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

<a name="updatePropertiesOnTaskUsingPATCH"></a>
# **updatePropertiesOnTaskUsingPATCH**
> InfusionsoftTask updatePropertiesOnTaskUsingPATCH(taskId, task)

Update a Task

Updates a task with only the values provided in the request

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String taskId = "taskId_example"; // String | taskId
InfusionsoftTask task = new InfusionsoftTask(); // InfusionsoftTask | task
try {
    InfusionsoftTask result = apiInstance.updatePropertiesOnTaskUsingPATCH(taskId, task);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#updatePropertiesOnTaskUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **task** | [**InfusionsoftTask**](InfusionsoftTask.md)| task |

### Return type

[**InfusionsoftTask**](InfusionsoftTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaskUsingPUT"></a>
# **updateTaskUsingPUT**
> InfusionsoftTask updateTaskUsingPUT(taskId, task)

Replace a Task

Replaces a task with the values provided in the request

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.TaskApi;


TaskApi apiInstance = new TaskApi();
String taskId = "taskId_example"; // String | taskId
InfusionsoftTask task = new InfusionsoftTask(); // InfusionsoftTask | task
try {
    InfusionsoftTask result = apiInstance.updateTaskUsingPUT(taskId, task);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaskApi#updateTaskUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**| taskId |
 **task** | [**InfusionsoftTask**](InfusionsoftTask.md)| task |

### Return type

[**InfusionsoftTask**](InfusionsoftTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

