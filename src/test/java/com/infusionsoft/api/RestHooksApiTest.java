/*
 * Infusionsoft REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.70.0.156820
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infusionsoft.api;

import com.infusionsoft.ApiException;
import com.infusionsoft.model.InfusionsoftError;
import com.infusionsoft.model.InfusionsoftRestHook;
import com.infusionsoft.model.InfusionsoftRestHookRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RestHooksApi
 */
@Ignore
public class RestHooksApiTest {

    private final RestHooksApi api = new RestHooksApi();

    
    /**
     * Create a Hook Subscription
     *
     * To receive hooks, you&#39;ll first need to subscribe to events one at a time *and* individually verify each subscription.  This operation is used to create hook subscriptions. During this process, Infusionsoft will attempt to verify your subscription. Continue reading to learn how that works.  To verify or reactivate a hook subscription, Infusionsoft will make a &#x60;POST&#x60; request with a temporary secret to the &#x60;hookUrl&#x60; you provided during creation. The secret is passed as the value of a header named &#x60;X-Hook-Secret&#x60;. Your response to that &#x60;POST&#x60; *must* have a status code of &#x60;200&#x60; and return the same &#x60;X-Hook-Secret&#x60; header and value pair. Once you&#39;ve done that, you&#39;ll begin receiving hooks. Don&#39;t worry if verification fails; you can always [request another verification attempt](#!/REST_Hooks/verify_a_hook_subscription).  NB: You will not receive events until the subscription is verified.  If the verification process seems confusing, head over to [RESTHooks.org](http://resthooks.org/docs/security/) for more on the concept.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAHookSubscriptionTest() throws ApiException {
        InfusionsoftRestHookRequest restHookRequest = null;
        InfusionsoftRestHook response = api.createAHookSubscription(restHookRequest);

        // TODO: test validations
    }
    
    /**
     * Delete a Hook Subscription
     *
     * Stop receiving hooks by deleting an existing hook subscription.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAHookSubscriptionTest() throws ApiException {
        String key = null;
        api.deleteAHookSubscription(key);

        // TODO: test validations
    }
    
    /**
     * List Hook Event Types
     *
     * ### _What are REST Hooks?_  _REST Hooks itself is not a specification, it is a collection of patterns that treat webhooks like subscriptions. These subscriptions are manipulated via a REST API just like any other resource._  _With most modern REST APIs, polling is the only way to detect changes. But it doesn&#39;t have to be. On average, 98.5% of polls are wasted. There is a better way. REST Hooks enable real-time communication and eliminate polling._ -- [RESTHooks.org](http://RESTHooks.org)  Infusionsoft offers a growing set of REST Hooks to keep you notified of changes in your data. To get started, use [List Hook Event Types](#!/REST_Hooks/list_hook_event_types) to discover event types. Event types are identified using _noun.verb dot syntax_, e.g.: &#x60;contact.add&#x60; or &#x60;invoice.delete&#x60;.  After you’ve read this documentation, you might be interested in the [REST Hook Event and Retry policies](https://developer.infusionsoft.com/rest-hook-documentation/).  NB: REST Hooks are **not** triggered by legacy action sets.  Once you&#39;ve chosen the events you&#39;re interested in, subscribe to them via [Create a Hook Subscription](#!/REST_Hooks/create_a_hook_subscription).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listHookEventTypesTest() throws ApiException {
        List<String> response = api.listHookEventTypes();

        // TODO: test validations
    }
    
    /**
     * List Stored Hook Subscriptions
     *
     * Lists your hook subscriptions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listStoredHookSubscriptionsTest() throws ApiException {
        List<InfusionsoftRestHook> response = api.listStoredHookSubscriptions();

        // TODO: test validations
    }
    
    /**
     * Retrieve a Hook Subscription
     *
     * Retrieves an existing hook subscription and its status.  If your hook subscription becomes inactive, you may request an activation attempt via [Verify a Hook Subscription](#!/REST_Hooks/verify_a_hook_subscription).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAHookSubscriptionTest() throws ApiException {
        String key = null;
        InfusionsoftRestHook response = api.retrieveAHookSubscription(key);

        // TODO: test validations
    }
    
    /**
     * Update a Hook Subscription
     *
     * Modify an existing hook subscription using the provided values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAHookSubscriptionTest() throws ApiException {
        String key = null;
        InfusionsoftRestHookRequest restHookRequest = null;
        InfusionsoftRestHook response = api.updateAHookSubscription(key, restHookRequest);

        // TODO: test validations
    }
    
    /**
     * Verify a Hook Subscription
     *
     * This operation is used to verify or reactivate a hook subscription using RESTHooks.org&#39;s [Immediate Confirmation](http://resthooks.org/docs/security/) pattern.  To verify or reactivate a hook subscription, Infusionsoft will make a &#x60;POST&#x60; request with a temporary secret to the &#x60;hookUrl&#x60; you provided during creation. The secret is passed as the value of a header named &#x60;X-Hook-Secret&#x60;. Your response to that &#x60;POST&#x60; *must* have a status code of &#x60;200&#x60; and return the same &#x60;X-Hook-Secret&#x60; header and value pair. Once you&#39;ve done that, you&#39;ll begin receiving hooks. Don&#39;t worry if verification fails; you can always [request another verification attempt](#!/REST_Hooks/verify_a_hook_subscription).  NB: You will not receive events until the subscription is verified.  If the verification process seems confusing, head over to [RESTHooks.org](http://resthooks.org/docs/security/) for more on the concept.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyAHookSubscriptionTest() throws ApiException {
        String key = null;
        InfusionsoftRestHook response = api.verifyAHookSubscription(key);

        // TODO: test validations
    }
    
    /**
     * Verify a Hook Subscription, Delayed
     *
     * This operation is used to verify or reactivate a hook subscription out-of-band using RESTHooks.org&#39;s [Delayed Confirmation](http://resthooks.org/docs/security/) pattern.  Use this verification method if you&#39;re not able to use the Immediate Confirmation provided through [Create a Hook Subscription](#!/REST_Hooks/create_a_hook_subscription) or [Verify a Hook Subscription](#!/REST_Hooks/verify_a_hook_subscription). This operation allows you to confirm a subscription by manually sending us the &#x60;X-Hook-Secret&#x60; you received.  NB: **The &#x60;X-Hook-Secret&#x60; _must_ be passed as a _header_.**  Don&#39;t worry if verification fails; you can always [request another verification attempt](#!/REST_Hooks/verify_a_hook_subscription).  NB: You will not receive events until the subscription is verified.  If the verification process seems confusing, head over to [RESTHooks.org](http://resthooks.org/docs/security/) for more on the concept.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyAHookSubscriptionDelayedTest() throws ApiException {
        String key = null;
        String xHookSecret = null;
        InfusionsoftRestHook response = api.verifyAHookSubscriptionDelayed(key, xHookSecret);

        // TODO: test validations
    }
    
}
