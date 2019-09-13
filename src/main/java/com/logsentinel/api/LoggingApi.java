package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.AuditLogEntry;
import com.logsentinel.model.BatchLogRequestEntry;
import com.logsentinel.model.LogResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LoggingApi {
  private ApiClient apiClient;

  public LoggingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LoggingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get entry by id
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param entryId ID of the audit log entry to verify (required)
   * @return AuditLogEntry
   * @throws ApiException if fails to make API call
   */
  public AuditLogEntry getEntryById(String applicationId, String entryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getEntryById");
    }
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling getEntryById");
    }
    
    // create path and map variables
    String localVarPath = "/api/getEntryById";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entryId", entryId));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<AuditLogEntry> localVarReturnType = new GenericType<AuditLogEntry>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getHashByEntryId
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param entryId ID of the audit log entry to verify (required)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse getHashByEntryId(String applicationId, String entryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling getHashByEntryId");
    }
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling getHashByEntryId");
    }
    
    // create path and map variables
    String localVarPath = "/api/getHashByEntryId";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entryId", entryId));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Log an event by a given actor
   * Log an event by specifying actor and action, as well as the request body. There are no limitations to the structure of the request body.
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param action The name of the action being logged (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param auditLogEntryType The type of the event (optional, default to BUSINESS_LOGIC_ENTRY)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param binaryContent binaryContent (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param directExternalPush directExternalPush (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param gdprCorrelationKey If the event is about GDPR-related action, you can correlate it with a process in the GDPR register (optional)
   * @param logLevel logLevel (optional)
   * @param process process (optional)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse log(String applicationId, String action, String actorId, String auditLogEntryType, String signature, String actorDepartment, String actorDisplayName, List<String> actorRoles, Boolean binaryContent, byte[] details, List<String> directExternalPush, List<String> encryptedKeywords, String gdprCorrelationKey, String logLevel, String process) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling log");
    }
    
    // verify the required parameter 'action' is set
    if (action == null) {
      throw new ApiException(400, "Missing the required parameter 'action' when calling log");
    }
    
    // verify the required parameter 'actorId' is set
    if (actorId == null) {
      throw new ApiException(400, "Missing the required parameter 'actorId' when calling log");
    }
    
    // create path and map variables
    String localVarPath = "/api/log/{actorId}/{action}"
      .replaceAll("\\{" + "action" + "\\}", apiClient.escapeString(action.toString()))
      .replaceAll("\\{" + "actorId" + "\\}", apiClient.escapeString(actorId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDepartment", actorDepartment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDisplayName", actorDisplayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "actorRoles", actorRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "binaryContent", binaryContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "directExternalPush", directExternalPush));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "encryptedKeywords", encryptedKeywords));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gdprCorrelationKey", gdprCorrelationKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logLevel", logLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "process", process));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));
if (auditLogEntryType != null)
      localVarHeaderParams.put("Audit-Log-Entry-Type", apiClient.parameterToString(auditLogEntryType));
if (signature != null)
      localVarHeaderParams.put("Signature", apiClient.parameterToString(signature));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Log an authentication event with the option to pass actor public key and signature
   * Log an authentication action (e.g. login, signup, logout, auto-login).
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param authAction Specific action related to user authentication (required)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param signedLoginChallenge Signed-Login-Challenge (optional)
   * @param userPublicKey User-Public-Key (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param binaryContent binaryContent (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param directExternalPush directExternalPush (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param gdprCorrelationKey If the event is about GDPR-related action, you can correlate it with a process in the GDPR register (optional)
   * @param process process (optional)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logAuthAction(String applicationId, String actorId, String authAction, String signature, String signedLoginChallenge, String userPublicKey, String actorDepartment, String actorDisplayName, List<String> actorRoles, Boolean binaryContent, byte[] details, List<String> directExternalPush, List<String> encryptedKeywords, String gdprCorrelationKey, String process) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling logAuthAction");
    }
    
    // verify the required parameter 'actorId' is set
    if (actorId == null) {
      throw new ApiException(400, "Missing the required parameter 'actorId' when calling logAuthAction");
    }
    
    // verify the required parameter 'authAction' is set
    if (authAction == null) {
      throw new ApiException(400, "Missing the required parameter 'authAction' when calling logAuthAction");
    }
    
    // create path and map variables
    String localVarPath = "/api/log/{actorId}/auth/{authAction}"
      .replaceAll("\\{" + "actorId" + "\\}", apiClient.escapeString(actorId.toString()))
      .replaceAll("\\{" + "authAction" + "\\}", apiClient.escapeString(authAction.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDepartment", actorDepartment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDisplayName", actorDisplayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "actorRoles", actorRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "binaryContent", binaryContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "directExternalPush", directExternalPush));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "encryptedKeywords", encryptedKeywords));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gdprCorrelationKey", gdprCorrelationKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "process", process));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));
if (signature != null)
      localVarHeaderParams.put("Signature", apiClient.parameterToString(signature));
if (signedLoginChallenge != null)
      localVarHeaderParams.put("Signed-Login-Challenge", apiClient.parameterToString(signedLoginChallenge));
if (userPublicKey != null)
      localVarHeaderParams.put("User-Public-Key", apiClient.parameterToString(userPublicKey));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Log multiple events at the same time. This should rarely be used, but allows background processes to push multiple events at the same time
   * 
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param requestData A list of log requests (required)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logBatch(String applicationId, List<BatchLogRequestEntry> requestData) throws ApiException {
    Object localVarPostBody = requestData;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling logBatch");
    }
    
    // verify the required parameter 'requestData' is set
    if (requestData == null) {
      throw new ApiException(400, "Missing the required parameter 'requestData' when calling logBatch");
    }
    
    // create path and map variables
    String localVarPath = "/api/log/batch";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Log an event by providing full details. Action can be INSERT/UPDATE/DELETE/GET or any custom action
   * Log a document action. If working with documents, use this to store all events relating to a particular document - creation, modification, deletion, retrieval. You can store the hash of the document in the request body to ensure its integrity.
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param action The name of the action being logged (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param details Any details in any format about the event that you want to store in the log (required)
   * @param documentId documentId (required)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param binaryContent binaryContent (optional, default to true)
   * @param directExternalPush directExternalPush (optional)
   * @param documentName documentName (optional)
   * @param documentType documentType (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param gdprCorrelationKey If the event is about GDPR-related action, you can correlate it with a process in the GDPR register (optional)
   * @param process process (optional)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logDocument(String applicationId, String action, String actorId, byte[] details, String documentId, String signature, String actorDepartment, String actorDisplayName, List<String> actorRoles, Boolean binaryContent, List<String> directExternalPush, String documentName, String documentType, List<String> encryptedKeywords, String gdprCorrelationKey, String process) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling logDocument");
    }
    
    // verify the required parameter 'action' is set
    if (action == null) {
      throw new ApiException(400, "Missing the required parameter 'action' when calling logDocument");
    }
    
    // verify the required parameter 'actorId' is set
    if (actorId == null) {
      throw new ApiException(400, "Missing the required parameter 'actorId' when calling logDocument");
    }
    
    // verify the required parameter 'details' is set
    if (details == null) {
      throw new ApiException(400, "Missing the required parameter 'details' when calling logDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling logDocument");
    }
    
    // create path and map variables
    String localVarPath = "/api/log/document/{actorId}/{action}/{documentId}"
      .replaceAll("\\{" + "action" + "\\}", apiClient.escapeString(action.toString()))
      .replaceAll("\\{" + "actorId" + "\\}", apiClient.escapeString(actorId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDepartment", actorDepartment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDisplayName", actorDisplayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "actorRoles", actorRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "binaryContent", binaryContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "directExternalPush", directExternalPush));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "documentName", documentName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "documentType", documentType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "encryptedKeywords", encryptedKeywords));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gdprCorrelationKey", gdprCorrelationKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "process", process));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));
if (signature != null)
      localVarHeaderParams.put("Signature", apiClient.parameterToString(signature));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Log an event by providing full details. Action can be INSERT/UPDATE/DELETE/GET or any custom action
   * Log an even by specifying all relevant details - actor, action and the entity about which the action is, as well as the request body. There are no limitations to the structure of the request body.
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param action The name of the action being logged (required)
   * @param actorId ID of the actor performing the action being logged (required)
   * @param entityId When the event is about a particular model entity, you can set its ID here (required)
   * @param entityType When the event is about a particular model entity, you can set its type here (required)
   * @param auditLogEntryType The type of the event (optional, default to BUSINESS_LOGIC_ENTRY)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param actorDepartment actorDepartment (optional)
   * @param actorDisplayName Display name of the actor (e.g. a name, in case ID is not human-readable) (optional)
   * @param actorRoles The roles of the actor (optional)
   * @param binaryContent binaryContent (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param directExternalPush directExternalPush (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param gdprCorrelationKey If the event is about GDPR-related action, you can correlate it with a process in the GDPR register (optional)
   * @param logLevel logLevel (optional)
   * @param process process (optional)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logFull(String applicationId, String action, String actorId, String entityId, String entityType, String auditLogEntryType, String signature, String actorDepartment, String actorDisplayName, List<String> actorRoles, Boolean binaryContent, byte[] details, List<String> directExternalPush, List<String> encryptedKeywords, String gdprCorrelationKey, String logLevel, String process) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling logFull");
    }
    
    // verify the required parameter 'action' is set
    if (action == null) {
      throw new ApiException(400, "Missing the required parameter 'action' when calling logFull");
    }
    
    // verify the required parameter 'actorId' is set
    if (actorId == null) {
      throw new ApiException(400, "Missing the required parameter 'actorId' when calling logFull");
    }
    
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling logFull");
    }
    
    // verify the required parameter 'entityType' is set
    if (entityType == null) {
      throw new ApiException(400, "Missing the required parameter 'entityType' when calling logFull");
    }
    
    // create path and map variables
    String localVarPath = "/api/log/{actorId}/{action}/{entityType}/{entityId}"
      .replaceAll("\\{" + "action" + "\\}", apiClient.escapeString(action.toString()))
      .replaceAll("\\{" + "actorId" + "\\}", apiClient.escapeString(actorId.toString()))
      .replaceAll("\\{" + "entityId" + "\\}", apiClient.escapeString(entityId.toString()))
      .replaceAll("\\{" + "entityType" + "\\}", apiClient.escapeString(entityType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDepartment", actorDepartment));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorDisplayName", actorDisplayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "actorRoles", actorRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "binaryContent", binaryContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "directExternalPush", directExternalPush));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "encryptedKeywords", encryptedKeywords));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gdprCorrelationKey", gdprCorrelationKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logLevel", logLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "process", process));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));
if (auditLogEntryType != null)
      localVarHeaderParams.put("Audit-Log-Entry-Type", apiClient.parameterToString(auditLogEntryType));
if (signature != null)
      localVarHeaderParams.put("Signature", apiClient.parameterToString(signature));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Log an event by providing just the body without any additional metadata. The body can be fully encrypted or can represent just the hash of the data/document
   * Log an event by just specifying the request body. There are no limitations to the structure of the request body.
   * @param applicationId Application ID, identifying a target application (obtained from the API credentials page) (required)
   * @param auditLogEntryType The type of the event (optional, default to BUSINESS_LOGIC_ENTRY)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param binaryContent binaryContent (optional)
   * @param details Any details in any format about the event that you want to store in the log (optional)
   * @param directExternalPush directExternalPush (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @param logLevel logLevel (optional)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logSimple(String applicationId, String auditLogEntryType, String signature, Boolean binaryContent, byte[] details, List<String> directExternalPush, List<String> encryptedKeywords, String logLevel) throws ApiException {
    Object localVarPostBody = details;
    
    // verify the required parameter 'applicationId' is set
    if (applicationId == null) {
      throw new ApiException(400, "Missing the required parameter 'applicationId' when calling logSimple");
    }
    
    // create path and map variables
    String localVarPath = "/api/log/simple";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "binaryContent", binaryContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "directExternalPush", directExternalPush));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "encryptedKeywords", encryptedKeywords));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logLevel", logLevel));

    if (applicationId != null)
      localVarHeaderParams.put("Application-Id", apiClient.parameterToString(applicationId));
if (auditLogEntryType != null)
      localVarHeaderParams.put("Audit-Log-Entry-Type", apiClient.parameterToString(auditLogEntryType));
if (signature != null)
      localVarHeaderParams.put("Signature", apiClient.parameterToString(signature));

    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<LogResponse> localVarReturnType = new GenericType<LogResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
