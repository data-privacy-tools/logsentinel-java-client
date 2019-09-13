/*
 * LogSentinel RESTful API
 * Read more at https://docs.logsentinel.com/en/latest/index.html
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.model.AuditLogEntry;
import com.logsentinel.model.SavedSearch;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SavedSearchesApi
 */
@Ignore
public class SavedSearchesApiTest {

    private final SavedSearchesApi api = new SavedSearchesApi();

    
    /**
     * Fetches saved search ids of all users of an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSavedSearchIdsTest() throws ApiException {
        List<SavedSearch> response = api.getSavedSearchIds();

        // TODO: test validations
    }
    
    /**
     * Calls saved search by its id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void performSavedSearchTest() throws ApiException {
        String savedSearchId = null;
        List<AuditLogEntry> response = api.performSavedSearch(savedSearchId);

        // TODO: test validations
    }
    
}
