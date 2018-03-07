# ECommerceApi

All URIs are relative to *https://api.infusiontest.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrderUsingGET**](ECommerceApi.md#getOrderUsingGET) | **GET** /orders/{orderId} | Retrieve an Order
[**getTransactionUsingGET**](ECommerceApi.md#getTransactionUsingGET) | **GET** /transactions/{transactionId} | Retrieve a Transaction
[**listOrdersUsingGET**](ECommerceApi.md#listOrdersUsingGET) | **GET** /orders | List Orders
[**listTransactionsForOrderUsingGET**](ECommerceApi.md#listTransactionsForOrderUsingGET) | **GET** /orders/{orderId}/transactions | Retrieve Order Transactions
[**listTransactionsUsingGET**](ECommerceApi.md#listTransactionsUsingGET) | **GET** /transactions | List Transactions


<a name="getOrderUsingGET"></a>
# **getOrderUsingGET**
> InfusionsoftOrder getOrderUsingGET(orderId)

Retrieve an Order

Retrieves a single order. The order may or may not have items.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
Long orderId = 789L; // Long | orderId
try {
    InfusionsoftOrder result = apiInstance.getOrderUsingGET(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#getOrderUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| orderId |

### Return type

[**InfusionsoftOrder**](InfusionsoftOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionUsingGET"></a>
# **getTransactionUsingGET**
> InfusionsoftTransaction getTransactionUsingGET(transactionId)

Retrieve a Transaction

Retrieves a single transaction

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
Long transactionId = 789L; // Long | transactionId
try {
    InfusionsoftTransaction result = apiInstance.getTransactionUsingGET(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#getTransactionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **Long**| transactionId |

### Return type

[**InfusionsoftTransaction**](InfusionsoftTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listOrdersUsingGET"></a>
# **listOrdersUsingGET**
> InfusionsoftOrderList listOrdersUsingGET(since, until, limit, offset, paid, order, contactId, productId)

List Orders

Retrieves a list of all orders using the specified search criteria. Each order may or may not have items.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
String since = "since_example"; // String | Date to start searching from ex. `2017-01-01T22:17:59.039Z`
String until = "until_example"; // String | Date to search to ex. `2017-01-01T22:17:59.039Z`
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
Boolean paid = true; // Boolean | Sets paid status of items to return
String order = "order_example"; // String | Attribute to order items by
Long contactId = 789L; // Long | Returns orders for the provided contact id
Long productId = 789L; // Long | Returns orders containing the provided product id
try {
    InfusionsoftOrderList result = apiInstance.listOrdersUsingGET(since, until, limit, offset, paid, order, contactId, productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#listOrdersUsingGET");
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
 **paid** | **Boolean**| Sets paid status of items to return | [optional]
 **order** | **String**| Attribute to order items by | [optional]
 **contactId** | **Long**| Returns orders for the provided contact id | [optional]
 **productId** | **Long**| Returns orders containing the provided product id | [optional]

### Return type

[**InfusionsoftOrderList**](InfusionsoftOrderList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTransactionsForOrderUsingGET"></a>
# **listTransactionsForOrderUsingGET**
> InfusionsoftTransactionList listTransactionsForOrderUsingGET(orderId, since, until, limit, offset, contactId)

Retrieve Order Transactions

Retrieves a list of all transactions on a given order using the specified search criteria

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
Long orderId = 789L; // Long | orderId
String since = "since_example"; // String | Date to start searching from ex. `2017-01-01T22:17:59.039Z`
String until = "until_example"; // String | Date to search to ex. `2017-01-01T22:17:59.039Z`
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
Long contactId = 789L; // Long | Returns transactions for the provided contact id
try {
    InfusionsoftTransactionList result = apiInstance.listTransactionsForOrderUsingGET(orderId, since, until, limit, offset, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#listTransactionsForOrderUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| orderId |
 **since** | **String**| Date to start searching from ex. &#x60;2017-01-01T22:17:59.039Z&#x60; | [optional]
 **until** | **String**| Date to search to ex. &#x60;2017-01-01T22:17:59.039Z&#x60; | [optional]
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **contactId** | **Long**| Returns transactions for the provided contact id | [optional]

### Return type

[**InfusionsoftTransactionList**](InfusionsoftTransactionList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTransactionsUsingGET"></a>
# **listTransactionsUsingGET**
> InfusionsoftTransactionList listTransactionsUsingGET(since, until, limit, offset, contactId)

List Transactions

Retrieves a list transactions for a given contact

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
String since = "since_example"; // String | Date to start searching from ex. `2017-01-01T22:17:59.039Z`
String until = "until_example"; // String | Date to search to ex. `2017-01-01T22:17:59.039Z`
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
Long contactId = 789L; // Long | Returns transactions for the provided contact id
try {
    InfusionsoftTransactionList result = apiInstance.listTransactionsUsingGET(since, until, limit, offset, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#listTransactionsUsingGET");
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
 **contactId** | **Long**| Returns transactions for the provided contact id | [optional]

### Return type

[**InfusionsoftTransactionList**](InfusionsoftTransactionList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

