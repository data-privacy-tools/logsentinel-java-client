package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.ApiClient;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;

import javax.ws.rs.core.GenericType;

import com.logsentinel.model.AuditLogEntry;
import com.logsentinel.model.SavedSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SavedSearchesApi {
  private ApiClient apiClient;

  public SavedSearchesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SavedSearchesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Fetches saved search ids of all users of an organization
   * 
   * @return List&lt;SavedSearch&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SavedSearch> getSavedSearchIds() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/search/saved/fetch";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/xml", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<SavedSearch>> localVarReturnType = new GenericType<List<SavedSearch>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Calls saved search by its id
   * 
   * @param savedSearchId savedSearchId (required)
   * @return List&lt;AuditLogEntry&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AuditLogEntry> performSavedSearch(String savedSearchId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'savedSearchId' is set
    if (savedSearchId == null) {
      throw new ApiException(400, "Missing the required parameter 'savedSearchId' when calling performSavedSearch");
    }
    
    // create path and map variables
    String localVarPath = "/api/search/saved";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "savedSearchId", savedSearchId));

    
    
    final String[] localVarAccepts = {
      "*/*", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "*/*"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<AuditLogEntry>> localVarReturnType = new GenericType<List<AuditLogEntry>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
