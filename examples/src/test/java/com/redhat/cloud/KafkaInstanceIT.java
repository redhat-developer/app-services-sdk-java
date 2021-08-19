package com.redhat.cloud;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.openshift.cloud.api.kas.auth.TopicsApi;
import com.openshift.cloud.api.kas.auth.invoker.*;
import com.openshift.cloud.api.kas.auth.invoker.auth.OAuth;
import com.openshift.cloud.api.kas.auth.models.*;


public class KafkaInstanceIT {

    @Test
    public void testCreateExample() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/rest");
        
        OAuth oauth = (OAuth) defaultClient.getAuthentication("Bearer");
        oauth.setAccessToken("accessToken");

        TopicsApi apiInstance = new TopicsApi(defaultClient);
        
        try {
            TopicsList result = apiInstance.getTopics(null, null, null, null, null, null, null);
            assertNotNull(result);
            assertEquals(1, result.getItems().size());
        } catch (ApiException e) {
            System.err.println("Exception when calling TopicsApi#getTopics");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
