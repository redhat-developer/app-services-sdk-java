package com.redhat.cloud;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import com.openshift.cloud.api.kas.invoker.*;
import com.openshift.cloud.api.kas.invoker.auth.*;
import com.openshift.cloud.api.kas.models.*;
import com.openshift.cloud.api.kas.DefaultApi;

public class KafkaManagementIT {
    @Test
    public void testPass() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Boolean async = true; // Boolean | Perform the action in an asynchronous manner
        KafkaRequestPayload kafkaRequestPayload = new KafkaRequestPayload(); // KafkaRequestPayload | Kafka data
        kafkaRequestPayload.setName("name");
        try {
            KafkaRequest result = apiInstance.createKafka(async, kafkaRequestPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createKafka");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
