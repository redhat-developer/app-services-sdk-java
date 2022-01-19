package com.redhat.cloud;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.openshift.cloud.api.kas.auth.TopicsApi;
import com.openshift.cloud.api.kas.auth.invoker.*;
import com.openshift.cloud.api.kas.auth.invoker.auth.OAuth;
import com.openshift.cloud.api.kas.auth.models.*;


public class KafkaInstanceIT {

    @Test
    public void testCreateExample() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/data/kafka");
        
        OAuth oauth = (OAuth) defaultClient.getAuthentication("Bearer");
        oauth.setAccessToken("accessToken");

        TopicsApi apiInstance = new TopicsApi(defaultClient);
        
        try {
            TopicsList result = apiInstance.getTopics(null, null, null, null, null);
            assertNotNull(result);
            assertEquals(4, result.getItems().size());
            assertEquals("topic-1", result.getItems().get(0).getName());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopicsApi#getTopics");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            Assertions.fail(e);    
        } 
    }
}
