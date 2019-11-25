/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logsentinel.client;

import com.logsentinel.ApiClient;
import com.logsentinel.ApiException;
import com.logsentinel.ApiResponse;
import com.logsentinel.Configuration;
import com.logsentinel.ProgressRequestBody;
import com.logsentinel.ProgressResponseBody;
import com.logsentinel.client.model.CreatePartnerRequest;
import com.logsentinel.client.model.Partner;

import com.google.gson.reflect.TypeToken;
import com.logsentinel.*;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

/**
 *
 * @author maris
 */
public class PartnerControllerApi {

    private ApiClient apiClient;

    public PartnerControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PartnerControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public Partner createPartner(CreatePartnerRequest partner) throws ApiException {
        ApiResponse<Partner> resp = createPartnerWithHttpInfo(partner);
        return resp.getData();
    }

    public ApiResponse<Partner> createPartnerWithHttpInfo(CreatePartnerRequest partner) throws ApiException {
        Call call = createPartnerValidateBeforeCall(partner, null, null);
        Type localVarReturnType = new TypeToken<Partner>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    @SuppressWarnings("rawtypes")
    private Call createPartnerValidateBeforeCall(CreatePartnerRequest partner, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'application' is set
        if (partner == null) {
            throw new ApiException("Missing the required parameter 'partner' when calling createPartner(Async)");
        }

        Call call = createPartnerCall(partner, progressListener, progressRequestListener);
        return call;

    }

    public Call createPartnerCall(CreatePartnerRequest partner, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = partner;

        // create path and map variables
        String localVarPath = "/api/partner/user/register";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"basicAuth"};
        return apiClient.buildCallNew(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

}
