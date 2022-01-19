package com.redhat.cloud;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.openshift.cloud.api.kas.invoker.*;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

public class KafkaManagementIT {
    @Test
    public void testCreateExample() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Boolean async = true; // Boolean | Perform the action in an asynchronous manner
        KafkaRequestPayload kafkaRequestPayload = new KafkaRequestPayload(); // KafkaRequestPayload | Kafka data
        kafkaRequestPayload.setName("name");
        try {
            KafkaRequest result = apiInstance.createKafka(async, kafkaRequestPayload);
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

    @Test
    public void testListExample() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        
        try {
            KafkaRequestList result = apiInstance.getKafkas(null,null,null,null);
            
            assertNotNull(result);
            assertEquals(1, result.getItems().size());
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
