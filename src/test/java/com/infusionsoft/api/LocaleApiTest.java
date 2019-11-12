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
import com.infusionsoft.model.InfusionsoftCountriesByCode;
import com.infusionsoft.model.InfusionsoftError;
import com.infusionsoft.model.InfusionsoftProvincesByCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocaleApi
 */
@Ignore
public class LocaleApiTest {

    private final LocaleApi api = new LocaleApi();

    
    /**
     * List Countries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCountriesUsingGETTest() throws ApiException {
        InfusionsoftCountriesByCode response = api.listCountriesUsingGET();

        // TODO: test validations
    }
    
    /**
     * List a Country&#39;s Provinces
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCountriesUsingGET1Test() throws ApiException {
        String countryCode = null;
        InfusionsoftProvincesByCode response = api.listCountriesUsingGET1(countryCode);

        // TODO: test validations
    }
    
}
