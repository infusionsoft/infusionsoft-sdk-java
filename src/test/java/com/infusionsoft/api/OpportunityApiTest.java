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
import com.infusionsoft.model.InfusionsoftObjectModel;
import com.infusionsoft.model.InfusionsoftOpportunity;
import com.infusionsoft.model.InfusionsoftOpportunityList;
import com.infusionsoft.model.InfusionsoftSalesPipeline;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OpportunityApi
 */
@Ignore
public class OpportunityApiTest {

    private final OpportunityApi api = new OpportunityApi();

    
    /**
     * Create an Opportunity
     *
     * Creates a new opportunity as the authenticated user. NB: Opportunity must contain values for &#x60;opportunity_title&#x60;, &#x60;contact&#x60;, and &#x60;stage&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOpportunityUsingPOSTTest() throws ApiException {
        InfusionsoftOpportunity opportunity = null;
        InfusionsoftOpportunity response = api.createOpportunityUsingPOST(opportunity);

        // TODO: test validations
    }
    
    /**
     * Retrieve an Opportunity
     *
     * Retrives a single opportunity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunityUsingGETTest() throws ApiException {
        Long opportunityId = null;
        List<String> optionalProperties = null;
        InfusionsoftOpportunity response = api.getOpportunityUsingGET(opportunityId, optionalProperties);

        // TODO: test validations
    }
    
    /**
     * List Opportunities
     *
     * Retrieves a list of all opportunities.  Please note: the sample response erroneously shows properties, such as _stage reasons_, that are unavailable through the list endpoint. Such properties are only available through the retrieve operation. Future versions of the Opportunity resource will correct the oversight.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOpportunitiesUsingGETTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        Long userId = null;
        Long stageId = null;
        String searchTerm = null;
        String order = null;
        InfusionsoftOpportunityList response = api.listOpportunitiesUsingGET(limit, offset, userId, stageId, searchTerm, order);

        // TODO: test validations
    }
    
    /**
     * List Opportunity Stage Pipeline
     *
     * Retrieves a list of all opportunity stages with pipeline details
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOpportunityStagePipelinesUsingGETTest() throws ApiException {
        List<InfusionsoftSalesPipeline> response = api.listOpportunityStagePipelinesUsingGET();

        // TODO: test validations
    }
    
    /**
     * Retrieve Opportunity Model
     *
     * Get the custom fields for the Opportunity object
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveOpportunityModelUsingGETTest() throws ApiException {
        InfusionsoftObjectModel response = api.retrieveOpportunityModelUsingGET();

        // TODO: test validations
    }
    
    /**
     * Replace an Opportunity
     *
     * Replaces all values of a given opportunity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOpportunityUsingPUTTest() throws ApiException {
        InfusionsoftOpportunity opportunity = null;
        InfusionsoftOpportunity response = api.updateOpportunityUsingPUT(opportunity);

        // TODO: test validations
    }
    
    /**
     * Update an Opportunity
     *
     * Updates an opportunity with only the values provided in the request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePropertiesOnOpportunityUsingPATCHTest() throws ApiException {
        Long opportunityId = null;
        InfusionsoftOpportunity opportunity = null;
        InfusionsoftOpportunity response = api.updatePropertiesOnOpportunityUsingPATCH(opportunityId, opportunity);

        // TODO: test validations
    }
    
}
