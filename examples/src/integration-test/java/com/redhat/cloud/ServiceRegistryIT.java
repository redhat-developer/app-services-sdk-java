package com.redhat.cloud;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.openshift.cloud.api.srs.*;
import com.openshift.cloud.api.srs.invoker.*;
import com.openshift.cloud.api.srs.invoker.auth.*;
import com.openshift.cloud.api.srs.models.*;


public class ServiceRegistryIT {

    @Test
    public void testListExample() {
        var defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");
        
        var oauth = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        oauth.setBearerToken("bearerToken");

        var apiInstance = new RegistriesApi(defaultClient);
        
        try {
            RegistryList result = apiInstance.getRegistries(null, null, null, null);
            assertNotNull(result);
            assertEquals(1, result.getItems().size());
            return;
        } catch (ApiException e) {
            System.err.println("Exception when calling RegistriesApi#getRegistries");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
            Assertions.fail(e);    
        }
        
    }
}
