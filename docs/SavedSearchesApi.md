# SavedSearchesApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSavedSearchIds**](SavedSearchesApi.md#getSavedSearchIds) | **GET** /api/search/saved/fetch | Fetches saved search ids of all users of an organization
[**performSavedSearch**](SavedSearchesApi.md#performSavedSearch) | **GET** /api/search/saved | Calls saved search by its id


<a name="getSavedSearchIds"></a>
# **getSavedSearchIds**
> List&lt;SavedSearch&gt; getSavedSearchIds()

Fetches saved search ids of all users of an organization

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.SavedSearchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SavedSearchesApi apiInstance = new SavedSearchesApi();
try {
    List<SavedSearch> result = apiInstance.getSavedSearchIds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedSearchesApi#getSavedSearchIds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SavedSearch&gt;**](SavedSearch.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/xml, application/json

<a name="performSavedSearch"></a>
# **performSavedSearch**
> List&lt;AuditLogEntry&gt; performSavedSearch(savedSearchId)

Calls saved search by its id

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.SavedSearchesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SavedSearchesApi apiInstance = new SavedSearchesApi();
String savedSearchId = "savedSearchId_example"; // String | savedSearchId
try {
    List<AuditLogEntry> result = apiInstance.performSavedSearch(savedSearchId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavedSearchesApi#performSavedSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savedSearchId** | **String**| savedSearchId |

### Return type

[**List&lt;AuditLogEntry&gt;**](AuditLogEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*, application/json

