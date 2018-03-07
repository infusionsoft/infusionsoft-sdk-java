/*
 * Infusionsoft REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: V1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infusionsoft.api;

import com.infusionsoft.ApiException;
import com.infusionsoft.model.InfusionsoftEmailSentCreate;
import com.infusionsoft.model.InfusionsoftEmailSentCreateList;
import com.infusionsoft.model.InfusionsoftEmailSentQueryResultList;
import com.infusionsoft.model.InfusionsoftEmailSentQueryResultWithContent;
import com.infusionsoft.model.InfusionsoftError;
import com.infusionsoft.model.InfusionsoftSetOfIds;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmailApi
 */
@Ignore
public class EmailApiTest {

    private final EmailApi api = new EmailApi();

    
    /**
     * Create an Email Record
     *
     * Create a record of an email sent to a contact
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEmailUsingPOSTTest() throws ApiException {
        InfusionsoftEmailSentCreate emailWithContent = null;
        InfusionsoftEmailSentCreate response = api.createEmailUsingPOST(emailWithContent);

        // TODO: test validations
    }
    
    /**
     * Create a set of Email Records
     *
     * Create a set of records of emails sent to contacts, maximum 1000 per transaction.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEmailsUsingPOSTTest() throws ApiException {
        InfusionsoftEmailSentCreateList emailWithContent = null;
        InfusionsoftEmailSentCreateList response = api.createEmailsUsingPOST(emailWithContent);

        // TODO: test validations
    }
    
    /**
     * Delete an Email Record
     *
     * Delete a specific email record
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEmailUsingDELETETest() throws ApiException {
        Long id = null;
        api.deleteEmailUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * Un-sync a batch of Email Records
     *
     * Un-syncs a batch of email records
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEmailsUsingPOSTTest() throws ApiException {
        InfusionsoftSetOfIds emailIds = null;
        Map<String, String> response = api.deleteEmailsUsingPOST(emailIds);

        // TODO: test validations
    }
    
    /**
     * Retrieve an Email
     *
     * Retrieves a single email that has been sent
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailUsingGETTest() throws ApiException {
        Long id = null;
        InfusionsoftEmailSentQueryResultWithContent response = api.getEmailUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List Emails
     *
     * Retrieve a list of emails that have been sent
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listEmailsUsingGETTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        Long contactId = null;
        String email = null;
        InfusionsoftEmailSentQueryResultList response = api.listEmailsUsingGET(limit, offset, contactId, email);

        // TODO: test validations
    }
    
    /**
     * Update an Email Record
     *
     * Update a record of an email sent to a contact
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEmailUsingPUTTest() throws ApiException {
        Long id = null;
        InfusionsoftEmailSentCreate emailWithContent = null;
        InfusionsoftEmailSentCreate response = api.updateEmailUsingPUT(id, emailWithContent);

        // TODO: test validations
    }
    
}
