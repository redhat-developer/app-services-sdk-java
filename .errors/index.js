


module.exports ={
    kas: {
        definition: require("./errors_kafka_mgmt.json"),
        file: "packages/kafka-management-sdk/src/main/java/com/openshift/cloud/api/kas/ApiErrorType.java"
    },
    srs:  {
        definition: require("./errors_srs_mgmt.json"),
        file: "packages/registry-management-sdk/src/main/java/com/openshift/cloud/api/srs/ApiErrorType.java"
    },
    connector: {
        definition: require("./errors_connector_mgmt.json"),
        file: "packages/connector-management-sdk/src/main/java/com/openshift/cloud/api/connector/ApiErrorType.java"
    },
    kafkainstance: {
        definition: require("./errors_kafka_instance.json"),
        file: "packages/kafka-instance-sdk/src/errors.ts"
    },
}

