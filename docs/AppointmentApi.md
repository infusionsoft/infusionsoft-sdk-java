# AppointmentApi

All URIs are relative to *https://api.infusiontest.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAppointmentUsingPOST**](AppointmentApi.md#createAppointmentUsingPOST) | **POST** /appointments | Create an Appointment
[**deleteAppointmentUsingDELETE**](AppointmentApi.md#deleteAppointmentUsingDELETE) | **DELETE** /appointments/{appointmentId} | Delete an Appointment
[**getAppointmentUsingGET**](AppointmentApi.md#getAppointmentUsingGET) | **GET** /appointments/{appointmentId} | Retrieve an Appointment
[**listAppointmentsUsingGET**](AppointmentApi.md#listAppointmentsUsingGET) | **GET** /appointments | List Appointments
[**updateAppointmentUsingPUT**](AppointmentApi.md#updateAppointmentUsingPUT) | **PUT** /appointments/{appointmentId} | Replace an Appointment
[**updatePropertiesOnAppointmentUsingPATCH**](AppointmentApi.md#updatePropertiesOnAppointmentUsingPATCH) | **PATCH** /appointments/{appointmentId} | Update an Appointment


<a name="createAppointmentUsingPOST"></a>
# **createAppointmentUsingPOST**
> InfusionsoftAppointment createAppointmentUsingPOST(appointment)

Create an Appointment

Creates a new appointment as the authenticated user

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.AppointmentApi;


AppointmentApi apiInstance = new AppointmentApi();
InfusionsoftAppointment appointment = new InfusionsoftAppointment(); // InfusionsoftAppointment | appointment
try {
    InfusionsoftAppointment result = apiInstance.createAppointmentUsingPOST(appointment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentApi#createAppointmentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointment** | [**InfusionsoftAppointment**](InfusionsoftAppointment.md)| appointment |

### Return type

[**InfusionsoftAppointment**](InfusionsoftAppointment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAppointmentUsingDELETE"></a>
# **deleteAppointmentUsingDELETE**
> deleteAppointmentUsingDELETE(appointmentId)

Delete an Appointment

Deletes the specified appointment

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.AppointmentApi;


AppointmentApi apiInstance = new AppointmentApi();
Long appointmentId = 789L; // Long | appointmentId
try {
    apiInstance.deleteAppointmentUsingDELETE(appointmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentApi#deleteAppointmentUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointmentId** | **Long**| appointmentId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppointmentUsingGET"></a>
# **getAppointmentUsingGET**
> InfusionsoftAppointment getAppointmentUsingGET(appointmentId)

Retrieve an Appointment

Retrieves a specific appointment belonging to the authenticated user

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.AppointmentApi;


AppointmentApi apiInstance = new AppointmentApi();
Long appointmentId = 789L; // Long | appointmentId
try {
    InfusionsoftAppointment result = apiInstance.getAppointmentUsingGET(appointmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentApi#getAppointmentUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointmentId** | **Long**| appointmentId |

### Return type

[**InfusionsoftAppointment**](InfusionsoftAppointment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAppointmentsUsingGET"></a>
# **listAppointmentsUsingGET**
> InfusionsoftAppointmentList listAppointmentsUsingGET(since, until, limit, offset, contactId)

List Appointments

Retrieves all appointments for the authenticated user

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.AppointmentApi;


AppointmentApi apiInstance = new AppointmentApi();
String since = "since_example"; // String | Date to start searching from ex. `2017-01-01T22:17:59.039Z`
String until = "until_example"; // String | Date to search to ex. `2017-01-01T22:17:59.039Z`
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
Long contactId = 789L; // Long | Optionally find appointments with a contact
try {
    InfusionsoftAppointmentList result = apiInstance.listAppointmentsUsingGET(since, until, limit, offset, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentApi#listAppointmentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **String**| Date to start searching from ex. &#x60;2017-01-01T22:17:59.039Z&#x60; | [optional]
 **until** | **String**| Date to search to ex. &#x60;2017-01-01T22:17:59.039Z&#x60; | [optional]
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **contactId** | **Long**| Optionally find appointments with a contact | [optional]

### Return type

[**InfusionsoftAppointmentList**](InfusionsoftAppointmentList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAppointmentUsingPUT"></a>
# **updateAppointmentUsingPUT**
> InfusionsoftAppointment updateAppointmentUsingPUT(appointmentId, appointmentDTO)

Replace an Appointment

Replaces all values of a given appointment

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.AppointmentApi;


AppointmentApi apiInstance = new AppointmentApi();
Long appointmentId = 789L; // Long | appointmentId
InfusionsoftAppointment appointmentDTO = new InfusionsoftAppointment(); // InfusionsoftAppointment | appointmentDTO
try {
    InfusionsoftAppointment result = apiInstance.updateAppointmentUsingPUT(appointmentId, appointmentDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentApi#updateAppointmentUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointmentId** | **Long**| appointmentId |
 **appointmentDTO** | [**InfusionsoftAppointment**](InfusionsoftAppointment.md)| appointmentDTO |

### Return type

[**InfusionsoftAppointment**](InfusionsoftAppointment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePropertiesOnAppointmentUsingPATCH"></a>
# **updatePropertiesOnAppointmentUsingPATCH**
> InfusionsoftAppointment updatePropertiesOnAppointmentUsingPATCH(appointmentId, appointmentDTO)

Update an Appointment

Updates the provided values of a given appointment

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.AppointmentApi;


AppointmentApi apiInstance = new AppointmentApi();
Long appointmentId = 789L; // Long | appointmentId
InfusionsoftAppointment appointmentDTO = new InfusionsoftAppointment(); // InfusionsoftAppointment | appointmentDTO
try {
    InfusionsoftAppointment result = apiInstance.updatePropertiesOnAppointmentUsingPATCH(appointmentId, appointmentDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentApi#updatePropertiesOnAppointmentUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appointmentId** | **Long**| appointmentId |
 **appointmentDTO** | [**InfusionsoftAppointment**](InfusionsoftAppointment.md)| appointmentDTO |

### Return type

[**InfusionsoftAppointment**](InfusionsoftAppointment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

