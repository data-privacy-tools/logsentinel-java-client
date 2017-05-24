/*
 * LogSentinel RESTful API
 * Read more at https://logsentinel.com/docs
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.client;

import com.logsentinel.ApiException;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for HashControllerApi
 */
@Ignore
public class HashControllerApiTest {

    private final HashControllerApi api = new HashControllerApi();

    
    /**
     * Get the hash of a request for auth actions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHashableContentForAuthActionTest() throws ApiException {
        String actorId = null;
        String authAction = null;
        String details = null;
        String applicationId = null;
        String userId = null;
        String signedLoginChallenge = null;
        String userPublicKey = null;
        String actorDisplayName = null;
        String actorRole = null;
        String response = api.getHashableContentForAuthAction(actorId, authAction, details, applicationId, userId, signedLoginChallenge, userPublicKey, actorDisplayName, actorRole);

        // TODO: test validations
    }
    
    /**
     * Get the hash of a request for standard actions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHashableContentForStandardActionTest() throws ApiException {
        String actorId = null;
        String action = null;
        String entityType = null;
        String entityId = null;
        String details = null;
        String applicationId = null;
        String actorDisplayName = null;
        String actorRole = null;
        String response = api.getHashableContentForStandardAction(actorId, action, entityType, entityId, details, applicationId, actorDisplayName, actorRole);

        // TODO: test validations
    }
    
    /**
     * Get the hash of a request without any additional metadata (including encrypted request bodies)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHashableContentSimpleTest() throws ApiException {
        String details = null;
        String applicationId = null;
        String response = api.getHashableContentSimple(details, applicationId);

        // TODO: test validations
    }
    
    /**
     * Get the hash of a request for simple (minimial metadata) actions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHashableContentTest() throws ApiException {
        String actorId = null;
        String action = null;
        String details = null;
        String applicationId = null;
        String actorDisplayName = null;
        String actorRole = null;
        String response = api.getHashableContent(actorId, action, details, applicationId, actorDisplayName, actorRole);

        // TODO: test validations
    }
    
}
