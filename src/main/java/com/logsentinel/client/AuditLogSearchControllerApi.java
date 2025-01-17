/*
 * LogSentinel RESTful API
 * Read more at http://localhost:8080/docs
 *
 * OpenAPI spec version: 1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.client;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.logsentinel.ApiCallback;
import com.logsentinel.ApiClient;
import com.logsentinel.ApiException;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.Pair;
import com.logsentinel.ProgressRequestBody;
import com.logsentinel.ProgressResponseBody;
import com.logsentinel.client.model.AuditLogEntry;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Response;

/**
 * Code generated client for LogSentinel RESTful API
 * Search controller
 * Read more at https://logsentinel.com/documentation/
 */
public class AuditLogSearchControllerApi {
    private ApiClient apiClient;

    public AuditLogSearchControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuditLogSearchControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getBatch
     *
     * @param values                  Values that match the specified field (required)
     * @param field                   Field to search in for the supplied values (required)
     * @param applicationId           Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @param entityType              When the event is about a particular model entity, you can set its type here (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call getBatchCall(List<String> values, String field, String entityType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/search/batch";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (values != null)
            localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "values", values));
        if (field != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("field", field));
        if (entityType != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("entityType", entityType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json", "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"basicAuth"};
        return apiClient.buildCallNew(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call getBatchValidateBeforeCall(List<String> values, String field, String entityType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'values' is set
        if (values == null) {
            throw new ApiException("Missing the required parameter 'values' when calling getBatch(Async)");
        }

        // verify the required parameter 'field' is set
        if (field == null) {
            throw new ApiException("Missing the required parameter 'field' when calling getBatch(Async)");
        }


        Call call = getBatchCall(values, field, entityType, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get entries in batches by field
     *
     * @param values        Values that match the specified field (required)
     * @param field         Field to search in for the supplied values (required)
     * @param entityType    When the event is about a particular model entity, you can set its type here (optional)
     * @return List&lt;AuditLogEntry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AuditLogEntry> getBatch(List<String> values, String field, String entityType) throws ApiException {
        ApiResponse<List<AuditLogEntry>> resp = getBatchWithHttpInfo(values, field, entityType);
        return resp.getData();
    }

    /**
     * Get entries in batches by field
     *
     * @param values        Values that match the specified field (required)
     * @param field         Field to search in for the supplied values (required)
     * @param entityType    When the event is about a particular model entity, you can set its type here (optional)
     * @return ApiResponse&lt;List&lt;AuditLogEntry&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AuditLogEntry>> getBatchWithHttpInfo(List<String> values, String field, String entityType) throws ApiException {
        Call call = getBatchValidateBeforeCall(values, field, entityType, null, null);
        Type localVarReturnType = new TypeToken<List<AuditLogEntry>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get entries in batches by field (asynchronously)
     *
     * @param values        Values that match the specified field (required)
     * @param field         Field to search in for the supplied values (required)
     * @param entityType    When the event is about a particular model entity, you can set its type here (optional)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getBatchAsync(List<String> values, String field, String entityType, final ApiCallback<List<AuditLogEntry>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = getBatchValidateBeforeCall(values, field, entityType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AuditLogEntry>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getEntityHistory
     *
     * @param entityId                When the event is about a particular model entity, you can set its ID here (required)
     * @param entityType              When the event is about a particular model entity, you can set its type here (required)
     * @param applicationId           Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call getEntityHistoryCall(String entityId, String entityType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/search/entityHistory";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (entityId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("entityId", entityId));
        if (entityType != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("entityType", entityType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json", "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"basicAuth"};
        return apiClient.buildCallNew(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call getEntityHistoryValidateBeforeCall(String entityId, String entityType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new ApiException("Missing the required parameter 'entityId' when calling getEntityHistory(Async)");
        }

        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling getEntityHistory(Async)");
        }


        Call call = getEntityHistoryCall(entityId, entityType, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get entity history
     *
     * @param entityId      When the event is about a particular model entity, you can set its ID here (required)
     * @param entityType    When the event is about a particular model entity, you can set its type here (required)
     * @return List&lt;AuditLogEntry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AuditLogEntry> getEntityHistory(String entityId, String entityType) throws ApiException {
        ApiResponse<List<AuditLogEntry>> resp = getEntityHistoryWithHttpInfo(entityId, entityType);
        return resp.getData();
    }

    /**
     * Get entity history
     *
     * @param entityId      When the event is about a particular model entity, you can set its ID here (required)
     * @param entityType    When the event is about a particular model entity, you can set its type here (required)
     * @return ApiResponse&lt;List&lt;AuditLogEntry&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AuditLogEntry>> getEntityHistoryWithHttpInfo(String entityId, String entityType) throws ApiException {
        Call call = getEntityHistoryValidateBeforeCall(entityId, entityType, null, null);
        Type localVarReturnType = new TypeToken<List<AuditLogEntry>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get entity history (asynchronously)
     *
     * @param entityId      When the event is about a particular model entity, you can set its ID here (required)
     * @param entityType    When the event is about a particular model entity, you can set its type here (required)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call getEntityHistoryAsync(String entityId, String entityType, final ApiCallback<List<AuditLogEntry>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = getEntityHistoryValidateBeforeCall(entityId, entityType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AuditLogEntry>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for search
     *
     * @param query                   query (required)
     * @param startTime               startTime (required)
     * @param endTime                 endTime (required)
     * @param page                    page (required)
     * @param pageSize                pageSize (required)
     * @param applicationId           Application ID, identifying a target application (obtained from the API credentials page) (required)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    private Call searchCall(String query, Long startTime, Long endTime, Integer page, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (query != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("query", query));
        if (startTime != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("startTime", startTime));
        if (endTime != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("endTime", endTime));
        if (page != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (pageSize != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json", "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"basicAuth"};
        return apiClient.buildCallNew(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call searchValidateBeforeCall(String query, Long startTime, Long endTime, Integer page, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling search(Async)");
        }

        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling search(Async)");
        }

        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling search(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling search(Async)");
        }

        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling search(Async)");
        }

        Call call = searchCall(query, startTime, endTime, page, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search logged entries
     *
     * @param query         query (required)
     * @param startTime     startTime (required)
     * @param endTime       endTime (required)
     * @param page          page (required)
     * @param pageSize      pageSize (required)
     * @return List&lt;AuditLogEntry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AuditLogEntry> search(String query, Long startTime, Long endTime, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<List<AuditLogEntry>> resp = searchWithHttpInfo(query, startTime, endTime, page, pageSize);
        return resp.getData();
    }

    /**
     * Search logged entries
     *
     * @param query         query (required)
     * @param startTime     startTime (required)
     * @param endTime       endTime (required)
     * @param page          page (required)
     * @param pageSize      pageSize (required)
     * @return ApiResponse&lt;List&lt;AuditLogEntry&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AuditLogEntry>> searchWithHttpInfo(String query, Long startTime, Long endTime, Integer page, Integer pageSize) throws ApiException {
        Call call = searchValidateBeforeCall(query, startTime, endTime, page, pageSize, null, null);
        Type localVarReturnType = new TypeToken<List<AuditLogEntry>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search logged entries (asynchronously)
     *
     * @param query         query (required)
     * @param startTime     startTime (required)
     * @param endTime       endTime (required)
     * @param page          page (required)
     * @param pageSize      pageSize (required)
     * @param callback      The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call searchAsync(String query, Long startTime, Long endTime, Integer page, Integer pageSize, final ApiCallback<List<AuditLogEntry>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = searchValidateBeforeCall(query, startTime, endTime, page, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AuditLogEntry>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
