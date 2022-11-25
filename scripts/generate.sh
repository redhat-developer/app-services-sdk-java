#!/usr/bin/env bash
## OPENAPI_FILENAME=yourapi generate_js.sh 

set -e

npx @openapitools/openapi-generator-cli version-manager set 5.4.0
echo "Generating SDKs"

TEMPLATES_DIR="$(dirname $0)/templates"

GROUP_ID="com.redhat.cloud"
ARTIFACT_ID="kafka-management-sdk"
OPENAPI_FILENAME=".openapi/kas-fleet-manager.yaml"
PACKAGE_NAME="com.openshift.cloud.api.kas"
OUTPUT_PATH="packages/kafka-management-sdk"

echo "Generating based on ${OPENAPI_FILENAME}"
yq e 'del(.. | select(has("deprecated")))' "${OPENAPI_FILENAME}" > "${OPENAPI_FILENAME}.processed"
rm -Rf $OUTPUT_PATH/src $OUTPUT_PATH/target

npx @openapitools/openapi-generator-cli generate -g java --library resteasy -t "$TEMPLATES_DIR"  -i \
    "$OPENAPI_FILENAME.processed" -o "$OUTPUT_PATH" \
    --package-name="${PACKAGE_NAME}" \
    --additional-properties="apiTests=false,modelTests=false,hideGenerationTimestamp=true,groupId=${GROUP_ID},artifactId=${ARTIFACT_ID},modelPackage=${PACKAGE_NAME}.models,invokerPackage=${PACKAGE_NAME}.invoker,apiPackage=${PACKAGE_NAME},dateLibrary=java8,licenseName=Apache-2.0,licenseUrl=https://www.apache.org/licenses/LICENSE-2.0.txt" \
    --ignore-file-override=.openapi-generator-ignore

GROUP_ID="com.redhat.cloud"
ARTIFACT_ID="registry-management-sdk"
OPENAPI_FILENAME=".openapi/srs-fleet-manager.json"
PACKAGE_NAME="com.openshift.cloud.api.srs"
OUTPUT_PATH="packages/registry-management-sdk/"

echo "Generating based on ${OPENAPI_FILENAME}"

yq e 'del(.. | select(has("deprecated")))' "${OPENAPI_FILENAME}" > "${OPENAPI_FILENAME}.processed"
rm -Rf $OUTPUT_PATH/src $OUTPUT_PATH/target

npx @openapitools/openapi-generator-cli generate -g java --library resteasy -t "$TEMPLATES_DIR"  -i \
    "$OPENAPI_FILENAME.processed" -o "$OUTPUT_PATH" \
    --package-name="${PACKAGE_NAME}" \
    --additional-properties="apiTests=false,modelTests=false,hideGenerationTimestamp=true,groupId=${GROUP_ID},artifactId=${ARTIFACT_ID},modelPackage=${PACKAGE_NAME}.models,invokerPackage=${PACKAGE_NAME}.invoker,apiPackage=${PACKAGE_NAME},dateLibrary=java8,licenseName=Apache-2.0,licenseUrl=https://www.apache.org/licenses/LICENSE-2.0.txt" \
    --ignore-file-override=.openapi-generator-ignore

GROUP_ID="com.redhat.cloud"
ARTIFACT_ID="kafka-instance-sdk"
OPENAPI_FILENAME=".openapi/kafka-admin-rest.yaml"
PACKAGE_NAME="com.openshift.cloud.api.kas.auth"
OUTPUT_PATH="packages/kafka-instance-sdk/"
yq e 'del(.. | select(has("deprecated")))' "${OPENAPI_FILENAME}" > "${OPENAPI_FILENAME}.processed"
rm -Rf $OUTPUT_PATH/src $OUTPUT_PATH/target

echo "Generating based on ${OPENAPI_FILENAME}"

npx @openapitools/openapi-generator-cli generate -g java --library resteasy  -t "$TEMPLATES_DIR"  -i \
    "$OPENAPI_FILENAME.processed" -o "$OUTPUT_PATH" \
    --package-name="${PACKAGE_NAME}" \
    --additional-properties="openApiNullable=false,apiTests=false,modelTests=false,hideGenerationTimestamp=true,groupId=${GROUP_ID},artifactId=${ARTIFACT_ID},modelPackage=${PACKAGE_NAME}.models,invokerPackage=${PACKAGE_NAME}.invoker,apiPackage=${PACKAGE_NAME},dateLibrary=java8,licenseName=Apache-2.0,licenseUrl=https://www.apache.org/licenses/LICENSE-2.0.txt" \
    --ignore-file-override=.openapi-generator-ignore

GROUP_ID="com.redhat.cloud"
ARTIFACT_ID="connector-management-sdk"
OPENAPI_FILENAME=".openapi/connector_mgmt.yaml"
PACKAGE_NAME="com.openshift.cloud.api.connector"
OUTPUT_PATH="packages/connector-management-sdk/"
yq e 'del(.. | select(has("deprecated")))' "${OPENAPI_FILENAME}" > "${OPENAPI_FILENAME}.processed"
yq e 'del(.. | select(has("deprecated")))' "${OPENAPI_FILENAME}" > "${OPENAPI_FILENAME}.processed"
rm -Rf $OUTPUT_PATH/src $OUTPUT_PATH/target

echo "Generating based on ${OPENAPI_FILENAME}"

npx @openapitools/openapi-generator-cli generate -g java --library resteasy  -t "$TEMPLATES_DIR"  -i \
    "$OPENAPI_FILENAME.processed" -o "$OUTPUT_PATH" \
    --package-name="${PACKAGE_NAME}" \
    --additional-properties="apiTests=false,modelTests=false,hideGenerationTimestamp=true,groupId=${GROUP_ID},artifactId=${ARTIFACT_ID},modelPackage=${PACKAGE_NAME}.models,invokerPackage=${PACKAGE_NAME}.invoker,apiPackage=${PACKAGE_NAME},dateLibrary=java8,licenseName=Apache-2.0,licenseUrl=https://www.apache.org/licenses/LICENSE-2.0.txt" \
    --ignore-file-override=.openapi-generator-ignore

GROUP_ID="com.redhat.cloud"
ARTIFACT_ID="service-accounts-sdk"
OPENAPI_FILENAME=".openapi/service-accounts.yaml"
PACKAGE_NAME="com.openshift.cloud.api.serviceaccounts"
OUTPUT_PATH="packages/service-accounts-sdk/"

echo "Generating based on ${OPENAPI_FILENAME}"
rm -Rf $OUTPUT_PATH/src $OUTPUT_PATH/target

npx @openapitools/openapi-generator-cli generate -g java \
    --library resteasy -t "$TEMPLATES_DIR" \
    -i "$OPENAPI_FILENAME" -o "$OUTPUT_PATH" \
    --package-name="${PACKAGE_NAME}" \
    --additional-properties="apiTests=false,modelTests=false,hideGenerationTimestamp=true,groupId=${GROUP_ID},artifactId=${ARTIFACT_ID},modelPackage=${PACKAGE_NAME}.models,invokerPackage=${PACKAGE_NAME}.invoker,apiPackage=${PACKAGE_NAME},dateLibrary=java8,licenseName=Apache-2.0,licenseUrl=https://www.apache.org/licenses/LICENSE-2.0.txt" \
    --ignore-file-override=.openapi-generator-ignore

GROUP_ID="com.redhat.cloud"
ARTIFACT_ID="smartevents-management-sdk"
OPENAPI_FILENAME=".openapi/smartevents_mgmt_v2.yaml"
PACKAGE_NAME="com.openshift.cloud.api.smartevents"
OUTPUT_PATH="packages/smartevents-management-sdk/"

echo "Generating based on ${OPENAPI_FILENAME}"
rm -Rf $OUTPUT_PATH/src $OUTPUT_PATH/target

npx @openapitools/openapi-generator-cli generate -g java \
    --library resteasy -t "$TEMPLATES_DIR" \
    -i "$OPENAPI_FILENAME" -o "$OUTPUT_PATH" \
    --package-name="${PACKAGE_NAME}" \
    --additional-properties="apiTests=false,modelTests=false,hideGenerationTimestamp=true,groupId=${GROUP_ID},artifactId=${ARTIFACT_ID},modelPackage=${PACKAGE_NAME}.models,invokerPackage=${PACKAGE_NAME}.invoker,apiPackage=${PACKAGE_NAME},dateLibrary=java8,licenseName=Apache-2.0,licenseUrl=https://www.apache.org/licenses/LICENSE-2.0.txt" \
    --ignore-file-override=.openapi-generator-ignore

GROUP_ID="com.redhat.cloud"
OPENAPI_FILENAME=".openapi/registry-instance.json"
ARTIFACT_ID="registry-instance-sdk"
OPENAPI_FILENAME=".openapi/registry-instance.json"
PACKAGE_NAME="com.openshift.cloud.api.registry.instance"
OUTPUT_PATH="packages/registry-instance-sdk/"

echo "Generating based on ${OPENAPI_FILENAME}"
rm -Rf $OUTPUT_PATH/src $OUTPUT_PATH/target

npx @openapitools/openapi-generator-cli generate -g java \
    --library resteasy -t "$TEMPLATES_DIR" \
    -i "$OPENAPI_FILENAME" -o "$OUTPUT_PATH" \
    --package-name="${PACKAGE_NAME}" \
    --additional-properties="apiTests=false,modelTests=false,hideGenerationTimestamp=true,groupId=${GROUP_ID},artifactId=${ARTIFACT_ID},modelPackage=${PACKAGE_NAME}.models,invokerPackage=${PACKAGE_NAME}.invoker,apiPackage=${PACKAGE_NAME},dateLibrary=java8,licenseName=Apache-2.0,licenseUrl=https://www.apache.org/licenses/LICENSE-2.0.txt" \
    --ignore-file-override=.openapi-generator-ignore

