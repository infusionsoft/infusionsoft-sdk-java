# ECommerceApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrderItemsOnOrderUsingPOST**](ECommerceApi.md#createOrderItemsOnOrderUsingPOST) | **POST** /orders/{orderId}/items | Create an Order Item
[**createOrderUsingPOST**](ECommerceApi.md#createOrderUsingPOST) | **POST** /orders | Create an Order
[**createPaymentOnOrderUsingPOST**](ECommerceApi.md#createPaymentOnOrderUsingPOST) | **POST** /orders/{orderId}/payments | Create a Payment
[**createSubscriptionUsingPOST**](ECommerceApi.md#createSubscriptionUsingPOST) | **POST** /subscriptions | Create Subscription
[**deleteOrderOrderItemUsingDELETE**](ECommerceApi.md#deleteOrderOrderItemUsingDELETE) | **DELETE** /orders/{orderId}/items/{orderItemId} | Delete an Order Item
[**deleteOrderUsingDELETE**](ECommerceApi.md#deleteOrderUsingDELETE) | **DELETE** /orders/{orderId} | Delete an Order
[**getOrderUsingGET**](ECommerceApi.md#getOrderUsingGET) | **GET** /orders/{orderId} | Retrieve an Order
[**getTransactionUsingGET**](ECommerceApi.md#getTransactionUsingGET) | **GET** /transactions/{transactionId} | Retrieve a Transaction
[**listOrdersUsingGET**](ECommerceApi.md#listOrdersUsingGET) | **GET** /orders | List Orders
[**listSubscriptionsUsingGET**](ECommerceApi.md#listSubscriptionsUsingGET) | **GET** /subscriptions | List Subscriptions
[**listTransactionsForOrderUsingGET**](ECommerceApi.md#listTransactionsForOrderUsingGET) | **GET** /orders/{orderId}/transactions | Retrieve Order Transactions
[**listTransactionsUsingGET**](ECommerceApi.md#listTransactionsUsingGET) | **GET** /transactions | List Transactions
[**loadOrderPaymentsUsingGET**](ECommerceApi.md#loadOrderPaymentsUsingGET) | **GET** /orders/{orderId}/payments | loadOrderPayments
[**replacePaymentPlanUsingPUT**](ECommerceApi.md#replacePaymentPlanUsingPUT) | **PUT** /orders/{orderId}/paymentPlan | Replace an Order Pay Plan
[**retrieveOrderModelUsingGET**](ECommerceApi.md#retrieveOrderModelUsingGET) | **GET** /orders/model | Retrieve Custom Order Model
[**retrieveSubscriptionModelUsingGET**](ECommerceApi.md#retrieveSubscriptionModelUsingGET) | **GET** /subscriptions/model | Retrieve Subscription Model


<a name="createOrderItemsOnOrderUsingPOST"></a>
# **createOrderItemsOnOrderUsingPOST**
> InfusionsoftOrderItem createOrderItemsOnOrderUsingPOST(createOrderItem, orderId)

Create an Order Item

Creates an order item on an existing order.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
InfusionsoftCreateOrderItem createOrderItem = new InfusionsoftCreateOrderItem(); // InfusionsoftCreateOrderItem | createOrderItem
Long orderId = 789L; // Long | orderId
try {
    InfusionsoftOrderItem result = apiInstance.createOrderItemsOnOrderUsingPOST(createOrderItem, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#createOrderItemsOnOrderUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createOrderItem** | [**InfusionsoftCreateOrderItem**](InfusionsoftCreateOrderItem.md)| createOrderItem |
 **orderId** | **Long**| orderId |

### Return type

[**InfusionsoftOrderItem**](InfusionsoftOrderItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOrderUsingPOST"></a>
# **createOrderUsingPOST**
> InfusionsoftOrder createOrderUsingPOST(createOrder)

Create an Order

Create a one time order with order items.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
InfusionsoftCreateOrder createOrder = new InfusionsoftCreateOrder(); // InfusionsoftCreateOrder | createOrder
try {
    InfusionsoftOrder result = apiInstance.createOrderUsingPOST(createOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#createOrderUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createOrder** | [**InfusionsoftCreateOrder**](InfusionsoftCreateOrder.md)| createOrder |

### Return type

[**InfusionsoftOrder**](InfusionsoftOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPaymentOnOrderUsingPOST"></a>
# **createPaymentOnOrderUsingPOST**
> InfusionsoftPaymentResult createPaymentOnOrderUsingPOST(orderId, createPayment)

Create a Payment

Creates a payment record that can charge a credit card. Alternatively, adds a record of historical or external payment of cash or credit card.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
Long orderId = 789L; // Long | orderId
InfusionsoftCreatePayment createPayment = new InfusionsoftCreatePayment(); // InfusionsoftCreatePayment | createPayment
try {
    InfusionsoftPaymentResult result = apiInstance.createPaymentOnOrderUsingPOST(orderId, createPayment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#createPaymentOnOrderUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| orderId |
 **createPayment** | [**InfusionsoftCreatePayment**](InfusionsoftCreatePayment.md)| createPayment | [optional]

### Return type

[**InfusionsoftPaymentResult**](InfusionsoftPaymentResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSubscriptionUsingPOST"></a>
# **createSubscriptionUsingPOST**
> InfusionsoftSubscription createSubscriptionUsingPOST(createSubscription)

Create Subscription

Creates a subscription with the specified product and product subscription id.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
InfusionsoftCreateSubscription createSubscription = new InfusionsoftCreateSubscription(); // InfusionsoftCreateSubscription | createSubscription
try {
    InfusionsoftSubscription result = apiInstance.createSubscriptionUsingPOST(createSubscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#createSubscriptionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createSubscription** | [**InfusionsoftCreateSubscription**](InfusionsoftCreateSubscription.md)| createSubscription |

### Return type

[**InfusionsoftSubscription**](InfusionsoftSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrderOrderItemUsingDELETE"></a>
# **deleteOrderOrderItemUsingDELETE**
> deleteOrderOrderItemUsingDELETE(orderId, orderItemId)

Delete an Order Item

Delete an order Item on specified Order

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
Long orderId = 789L; // Long | orderId
Long orderItemId = 789L; // Long | orderItemId
try {
    apiInstance.deleteOrderOrderItemUsingDELETE(orderId, orderItemId);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#deleteOrderOrderItemUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| orderId |
 **orderItemId** | **Long**| orderItemId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrderUsingDELETE"></a>
# **deleteOrderUsingDELETE**
> deleteOrderUsingDELETE(orderId)

Delete an Order

Delete an order that does not have a payment

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
Long orderId = 789L; // Long | orderId
try {
    apiInstance.deleteOrderUsingDELETE(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#deleteOrderUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| orderId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

<a name="listSubscriptionsUsingGET"></a>
# **listSubscriptionsUsingGET**
> InfusionsoftSubscriptionList listSubscriptionsUsingGET(limit, offset, contactId)

List Subscriptions

Retrieves a list of all subcriptions using the specified search criteria.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
Long contactId = 789L; // Long | Returns subscriptions for the provided contact id
try {
    InfusionsoftSubscriptionList result = apiInstance.listSubscriptionsUsingGET(limit, offset, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#listSubscriptionsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **contactId** | **Long**| Returns subscriptions for the provided contact id | [optional]

### Return type

[**InfusionsoftSubscriptionList**](InfusionsoftSubscriptionList.md)

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

<a name="loadOrderPaymentsUsingGET"></a>
# **loadOrderPaymentsUsingGET**
> List&lt;InfusionsoftInvoicePayment&gt; loadOrderPaymentsUsingGET(orderId)

loadOrderPayments

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
Long orderId = 789L; // Long | orderId
try {
    List<InfusionsoftInvoicePayment> result = apiInstance.loadOrderPaymentsUsingGET(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#loadOrderPaymentsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| orderId |

### Return type

[**List&lt;InfusionsoftInvoicePayment&gt;**](InfusionsoftInvoicePayment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replacePaymentPlanUsingPUT"></a>
# **replacePaymentPlanUsingPUT**
> InfusionsoftPaymentPlan replacePaymentPlanUsingPUT(orderId, paymentPlan)

Replace an Order Pay Plan

Replaces the order&#39;s payment plan with the given values.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
Long orderId = 789L; // Long | orderId
InfusionsoftPaymentPlan paymentPlan = new InfusionsoftPaymentPlan(); // InfusionsoftPaymentPlan | paymentPlan
try {
    InfusionsoftPaymentPlan result = apiInstance.replacePaymentPlanUsingPUT(orderId, paymentPlan);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#replacePaymentPlanUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| orderId |
 **paymentPlan** | [**InfusionsoftPaymentPlan**](InfusionsoftPaymentPlan.md)| paymentPlan |

### Return type

[**InfusionsoftPaymentPlan**](InfusionsoftPaymentPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOrderModelUsingGET"></a>
# **retrieveOrderModelUsingGET**
> InfusionsoftObjectModel retrieveOrderModelUsingGET()

Retrieve Custom Order Model

Get the custom fields for the Order object

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
try {
    InfusionsoftObjectModel result = apiInstance.retrieveOrderModelUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#retrieveOrderModelUsingGET");
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

<a name="retrieveSubscriptionModelUsingGET"></a>
# **retrieveSubscriptionModelUsingGET**
> InfusionsoftObjectModel retrieveSubscriptionModelUsingGET()

Retrieve Subscription Model

Get the custom fields for the Subscription object

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ECommerceApi;


ECommerceApi apiInstance = new ECommerceApi();
try {
    InfusionsoftObjectModel result = apiInstance.retrieveSubscriptionModelUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ECommerceApi#retrieveSubscriptionModelUsingGET");
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

