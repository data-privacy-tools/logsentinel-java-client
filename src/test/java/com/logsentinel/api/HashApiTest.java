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
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HashApi
 */
@Ignore
public class HashApiTest {

    private final HashApi api = new HashApi();

    
    /**
     * Get the standalone (non-chained) hash for an entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHashTest() throws ApiException {
        String applicationId = null;
        UUID entryId = null;
        String response = api.getHash(applicationId, entryId);

        // TODO: test validations
    }
    
    /**
     * Get the content over which to compute the hash of a request for simple (minimial metadata) actions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHashableContentTest() throws ApiException {
        String applicationId = null;
        String action = null;
        String actorId = null;
        String auditLogEntryType = null;
        String signature = null;
        String actorDepartment = null;
        String actorDisplayName = null;
        List<String> actorRoles = null;
        String details = null;
        String logLevel = null;
        String response = api.getHashableContent(applicationId, action, actorId, auditLogEntryType, signature, actorDepartment, actorDisplayName, actorRoles, details, logLevel);

        // TODO: test validations
    }
    
    /**
     * Get the content over which to compute the hash of a request for auth actions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHashableContentForAuthActionTest() throws ApiException {
        String applicationId = null;
        String actorId = null;
        String authAction = null;
        String signature = null;
        String signedLoginChallenge = null;
        String userPublicKey = null;
        String actorDepartment = null;
        String actorDisplayName = null;
        List<String> actorRoles = null;
        String details = null;
        String response = api.getHashableContentForAuthAction(applicationId, actorId, authAction, signature, signedLoginChallenge, userPublicKey, actorDepartment, actorDisplayName, actorRoles, details);

        // TODO: test validations
    }
    
    /**
     * Get the content over which to compute the hash of a request for standard actions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHashableContentForStandardActionTest() throws ApiException {
        String applicationId = null;
        String action = null;
        String actorId = null;
        String entityId = null;
        String entityType = null;
        String auditLogEntryType = null;
        String signature = null;
        String actorDepartment = null;
        String actorDisplayName = null;
        List<String> actorRoles = null;
        String details = null;
        String logLevel = null;
        String response = api.getHashableContentForStandardAction(applicationId, action, actorId, entityId, entityType, auditLogEntryType, signature, actorDepartment, actorDisplayName, actorRoles, details, logLevel);

        // TODO: test validations
    }
    
    /**
     * Get the content over which to compute the hash of a request without any additional metadata (including encrypted request bodies)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHashableContentSimpleTest() throws ApiException {
        String applicationId = null;
        String auditLogEntryType = null;
        String signature = null;
        String details = null;
        String logLevel = null;
        String response = api.getHashableContentSimple(applicationId, auditLogEntryType, signature, details, logLevel);

        // TODO: test validations
    }
    
}
