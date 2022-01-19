package com.redhat.cloud;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.openshift.cloud.api.kas.SecurityApi;
import com.openshift.cloud.api.kas.invoker.Configuration;
import com.openshift.cloud.api.kas.models.ServiceAccount;
import com.openshift.cloud.api.kas.models.ServiceAccountRequest;
import com.openshift.cloud.api.kas.invoker.auth.HttpBearerAuth;
import com.openshift.cloud.api.kas.invoker.ApiClient;
import com.openshift.cloud.api.kas.invoker.ApiException;

public class ServiceAccountIT {

    @Test
    public void testCreateExample() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");
    
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("TOKEN");
    
        var apiInstance =  new SecurityApi(defaultClient);
        var serviceAccountRequest = new ServiceAccountRequest();
        serviceAccountRequest.setDescription("Description");
        serviceAccountRequest.setName("sa_name");
        try {
            ServiceAccount result = apiInstance.createServiceAccount(serviceAccountRequest);
            assertNotNull(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createKafka");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            Assertions.fail(e);    
        }
    }

    
}
