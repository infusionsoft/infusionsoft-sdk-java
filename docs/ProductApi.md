# ProductApi

All URIs are relative to *https://api.infusionsoft.com/crm/rest/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProductImageUsingPOST**](ProductApi.md#createProductImageUsingPOST) | **POST** /products/{productId}/image | Upload a product image
[**createProductSubscriptionUsingPOST**](ProductApi.md#createProductSubscriptionUsingPOST) | **POST** /products/{productId}/subscriptions | Create a Product Subscription
[**createProductUsingPOST**](ProductApi.md#createProductUsingPOST) | **POST** /products | Create a Product
[**deleteProductImageUsingDELETE**](ProductApi.md#deleteProductImageUsingDELETE) | **DELETE** /products/{productId}/image | Delete a product image
[**deleteProductSubscriptionUsingDELETE**](ProductApi.md#deleteProductSubscriptionUsingDELETE) | **DELETE** /products/{productId}/subscriptions/{subscriptionId} | Delete a Product Subscription
[**deleteProductUsingDELETE**](ProductApi.md#deleteProductUsingDELETE) | **DELETE** /products/{productId} | Delete a Product
[**listProductsFromSyncTokenUsingGET**](ProductApi.md#listProductsFromSyncTokenUsingGET) | **GET** /products/sync | Retrieve Synced Products
[**listProductsUsingGET**](ProductApi.md#listProductsUsingGET) | **GET** /products | List Products
[**retrieveProductSubscriptionUsingGET**](ProductApi.md#retrieveProductSubscriptionUsingGET) | **GET** /products/{productId}/subscriptions/{subscriptionId} | Retrieve a Product Subscription
[**retrieveProductUsingGET**](ProductApi.md#retrieveProductUsingGET) | **GET** /products/{productId} | Retrieve a Product
[**updateProductUsingPATCH**](ProductApi.md#updateProductUsingPATCH) | **PATCH** /products/{productId} | Update a Product


<a name="createProductImageUsingPOST"></a>
# **createProductImageUsingPOST**
> createProductImageUsingPOST(productId, restProductImage)

Upload a product image

Max payload 3 megabytes, the &#x60;file_data&#x60; is base64 encoded.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Long productId = 789L; // Long | productId
InfusionsoftCreateProductImage restProductImage = new InfusionsoftCreateProductImage(); // InfusionsoftCreateProductImage | restProductImage
try {
    apiInstance.createProductImageUsingPOST(productId, restProductImage);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#createProductImageUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |
 **restProductImage** | [**InfusionsoftCreateProductImage**](InfusionsoftCreateProductImage.md)| restProductImage |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProductSubscriptionUsingPOST"></a>
# **createProductSubscriptionUsingPOST**
> InfusionsoftProductSubscription createProductSubscriptionUsingPOST(productId, createProductSubscription)

Create a Product Subscription

Creates a new product subscription

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Long productId = 789L; // Long | productId
InfusionsoftCreateProductSubscription createProductSubscription = new InfusionsoftCreateProductSubscription(); // InfusionsoftCreateProductSubscription | createProductSubscription
try {
    InfusionsoftProductSubscription result = apiInstance.createProductSubscriptionUsingPOST(productId, createProductSubscription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#createProductSubscriptionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |
 **createProductSubscription** | [**InfusionsoftCreateProductSubscription**](InfusionsoftCreateProductSubscription.md)| createProductSubscription |

### Return type

[**InfusionsoftProductSubscription**](InfusionsoftProductSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProductUsingPOST"></a>
# **createProductUsingPOST**
> InfusionsoftProduct createProductUsingPOST(createProduct)

Create a Product

Creates a new product

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ProductApi;


ProductApi apiInstance = new ProductApi();
InfusionsoftCreateProduct createProduct = new InfusionsoftCreateProduct(); // InfusionsoftCreateProduct | createProduct
try {
    InfusionsoftProduct result = apiInstance.createProductUsingPOST(createProduct);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#createProductUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createProduct** | [**InfusionsoftCreateProduct**](InfusionsoftCreateProduct.md)| createProduct |

### Return type

[**InfusionsoftProduct**](InfusionsoftProduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProductImageUsingDELETE"></a>
# **deleteProductImageUsingDELETE**
> deleteProductImageUsingDELETE(productId)

Delete a product image

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Long productId = 789L; // Long | productId
try {
    apiInstance.deleteProductImageUsingDELETE(productId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#deleteProductImageUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProductSubscriptionUsingDELETE"></a>
# **deleteProductSubscriptionUsingDELETE**
> deleteProductSubscriptionUsingDELETE(productId, subscriptionId)

Delete a Product Subscription

Deletes a product subscription

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Long productId = 789L; // Long | productId
Long subscriptionId = 789L; // Long | subscriptionId
try {
    apiInstance.deleteProductSubscriptionUsingDELETE(productId, subscriptionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#deleteProductSubscriptionUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |
 **subscriptionId** | **Long**| subscriptionId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProductUsingDELETE"></a>
# **deleteProductUsingDELETE**
> deleteProductUsingDELETE(productId)

Delete a Product

Deletes a product and its subscriptions

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Long productId = 789L; // Long | productId
try {
    apiInstance.deleteProductUsingDELETE(productId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#deleteProductUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProductsFromSyncTokenUsingGET"></a>
# **listProductsFromSyncTokenUsingGET**
> InfusionsoftProductStatusList listProductsFromSyncTokenUsingGET(syncToken, limit, offset)

Retrieve Synced Products

The Sync endpoint returns a set of products that have been updated or created since the last result set was retrieved, minus any products that have been deleted.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ProductApi;


ProductApi apiInstance = new ProductApi();
String syncToken = "syncToken_example"; // String | sync_token
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
try {
    InfusionsoftProductStatusList result = apiInstance.listProductsFromSyncTokenUsingGET(syncToken, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#listProductsFromSyncTokenUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncToken** | **String**| sync_token | [optional]
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]

### Return type

[**InfusionsoftProductStatusList**](InfusionsoftProductStatusList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProductsUsingGET"></a>
# **listProductsUsingGET**
> InfusionsoftProductList listProductsUsingGET(limit, offset, active)

List Products

Retrieves a list of all products

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Integer limit = 56; // Integer | Sets a total of items to return
Integer offset = 56; // Integer | Sets a beginning range of items to return
Boolean active = true; // Boolean | Sets status of items to return
try {
    InfusionsoftProductList result = apiInstance.listProductsUsingGET(limit, offset, active);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#listProductsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Sets a total of items to return | [optional]
 **offset** | **Integer**| Sets a beginning range of items to return | [optional]
 **active** | **Boolean**| Sets status of items to return | [optional]

### Return type

[**InfusionsoftProductList**](InfusionsoftProductList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveProductSubscriptionUsingGET"></a>
# **retrieveProductSubscriptionUsingGET**
> InfusionsoftProductSubscription retrieveProductSubscriptionUsingGET(productId, subscriptionId)

Retrieve a Product Subscription

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Long productId = 789L; // Long | productId
Long subscriptionId = 789L; // Long | subscriptionId
try {
    InfusionsoftProductSubscription result = apiInstance.retrieveProductSubscriptionUsingGET(productId, subscriptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#retrieveProductSubscriptionUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |
 **subscriptionId** | **Long**| subscriptionId |

### Return type

[**InfusionsoftProductSubscription**](InfusionsoftProductSubscription.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveProductUsingGET"></a>
# **retrieveProductUsingGET**
> InfusionsoftProduct retrieveProductUsingGET(productId)

Retrieve a Product

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Long productId = 789L; // Long | productId
try {
    InfusionsoftProduct result = apiInstance.retrieveProductUsingGET(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#retrieveProductUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**InfusionsoftProduct**](InfusionsoftProduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProductUsingPATCH"></a>
# **updateProductUsingPATCH**
> InfusionsoftProduct updateProductUsingPATCH(productId, createProduct)

Update a Product

Updates a Product with only the values provided in the request.

### Example
```java
// Import classes:
//import com.infusionsoft.ApiException;
//import com.infusionsoft.api.ProductApi;


ProductApi apiInstance = new ProductApi();
Long productId = 789L; // Long | productId
InfusionsoftCreateProduct createProduct = new InfusionsoftCreateProduct(); // InfusionsoftCreateProduct | createProduct
try {
    InfusionsoftProduct result = apiInstance.updateProductUsingPATCH(productId, createProduct);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#updateProductUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |
 **createProduct** | [**InfusionsoftCreateProduct**](InfusionsoftCreateProduct.md)| createProduct |

### Return type

[**InfusionsoftProduct**](InfusionsoftProduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

