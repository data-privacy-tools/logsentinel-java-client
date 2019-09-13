# LogSpecialApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logFhirEvent**](LogSpecialApi.md#logFhirEvent) | **POST** /api/fhir/log | Logs a FHIR audit event in order to help with HIPAA compliance
[**logProvenance**](LogSpecialApi.md#logProvenance) | **POST** /api/provenance/log | Logs a Provenance document


<a name="logFhirEvent"></a>
# **logFhirEvent**
> LogResponse logFhirEvent(applicationId, fhirAuditEvent)

Logs a FHIR audit event in order to help with HIPAA compliance

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LogSpecialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LogSpecialApi apiInstance = new LogSpecialApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String fhirAuditEvent = "fhirAuditEvent_example"; // String | A record of an FHIR event made for purposes of maintaining a security log. See https://www.hl7.org/fhir/auditevent.html
try {
    LogResponse result = apiInstance.logFhirEvent(applicationId, fhirAuditEvent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogSpecialApi#logFhirEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **fhirAuditEvent** | **String**| A record of an FHIR event made for purposes of maintaining a security log. See https://www.hl7.org/fhir/auditevent.html |

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

<a name="logProvenance"></a>
# **logProvenance**
> LogResponse logProvenance(applicationId, provenanceDocument)

Logs a Provenance document

### Example
```java
// Import classes:
//import com.logsentinel.ApiClient;
//import com.logsentinel.ApiException;
//import com.logsentinel.Configuration;
//import com.logsentinel.auth.*;
//import com.logsentinel.api.LogSpecialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LogSpecialApi apiInstance = new LogSpecialApi();
String applicationId = "applicationId_example"; // String | Application ID, identifying a target application (obtained from the API credentials page)
String provenanceDocument = "provenanceDocument_example"; // String | Provenance model document, representing event that serves security log purposes. See https://www.w3.org/TR/2013/NOTE-prov-primer-20130430/
try {
    LogResponse result = apiInstance.logProvenance(applicationId, provenanceDocument);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogSpecialApi#logProvenance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| Application ID, identifying a target application (obtained from the API credentials page) |
 **provenanceDocument** | **String**| Provenance model document, representing event that serves security log purposes. See https://www.w3.org/TR/2013/NOTE-prov-primer-20130430/ |

### Return type

[**LogResponse**](LogResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, */*
 - **Accept**: application/xml, application/json

