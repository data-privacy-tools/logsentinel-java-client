package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.Consent;
import com.logsentinel.model.GDPRRequest;
import com.logsentinel.model.LogResponse;
import com.logsentinel.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GdprLoggingApi {
  private ApiClient apiClient;

  public GdprLoggingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GdprLoggingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Log the consent by a given user
   * Logs GDPR consent. Include any consent-related data (e.g. data subject ID, data subject names, processing activity or any other details). You can also log consent withdrawal (include \&quot;withdrawal\&quot; in the additional details field). 
   * @param consent Details about the consent. You should normally pass the data subject ID and the processing activity for which the consent is given. (required)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logConsent(Consent consent, String signature, List<String> encryptedKeywords) throws ApiException {
    Object localVarPostBody = consent;
    
    // verify the required parameter 'consent' is set
    if (consent == null) {
      throw new ApiException(400, "Missing the required parameter 'consent' when calling logConsent");
    }
    
    // create path and map variables
    String localVarPath = "/api/log-gdpr/consent";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "encryptedKeywords", encryptedKeywords));

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
   * Log a GDPR request by a given user
   * Log a request for data subject rights under GDPR. Include the data subject details as well as any relevant additional details.
   * @param gdprRequest gdprRequest (required)
   * @param requestType requestType (required)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logGdprRequest(GDPRRequest gdprRequest, String requestType, String signature, List<String> encryptedKeywords) throws ApiException {
    Object localVarPostBody = gdprRequest;
    
    // verify the required parameter 'gdprRequest' is set
    if (gdprRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gdprRequest' when calling logGdprRequest");
    }
    
    // verify the required parameter 'requestType' is set
    if (requestType == null) {
      throw new ApiException(400, "Missing the required parameter 'requestType' when calling logGdprRequest");
    }
    
    // create path and map variables
    String localVarPath = "/api/log-gdpr/request/{requestType}"
      .replaceAll("\\{" + "requestType" + "\\}", apiClient.escapeString(requestType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "encryptedKeywords", encryptedKeywords));

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
   * Push data about the result of a GDPR request
   * Log the result of handling a GDPR request. E.g. after manually reviewing a request for erasure or for data portability, you should log whether the request was approved and executed or not, including the reasons why.
   * @param requestType requestType (required)
   * @param result result (required)
   * @param signature Base64-encoded digital signature on the entry details (the request body) (optional)
   * @param encryptedKeywords If you are encrypting the parameters in your request, you can extract and encrypt keywords client-side and send them to us in order to make use of our search functionality over encrypted text (optional)
   * @return LogResponse
   * @throws ApiException if fails to make API call
   */
  public LogResponse logRequestResults(String requestType, Result result, String signature, List<String> encryptedKeywords) throws ApiException {
    Object localVarPostBody = result;
    
    // verify the required parameter 'requestType' is set
    if (requestType == null) {
      throw new ApiException(400, "Missing the required parameter 'requestType' when calling logRequestResults");
    }
    
    // verify the required parameter 'result' is set
    if (result == null) {
      throw new ApiException(400, "Missing the required parameter 'result' when calling logRequestResults");
    }
    
    // create path and map variables
    String localVarPath = "/api/log-gdpr/request-result/{requestType}"
      .replaceAll("\\{" + "requestType" + "\\}", apiClient.escapeString(requestType.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "encryptedKeywords", encryptedKeywords));

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
