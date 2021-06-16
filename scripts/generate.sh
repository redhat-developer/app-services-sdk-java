#!/usr/bin/env bash
## OPENAPI_FILENAME=yourapi generate_js.sh 

npx @openapitools/openapi-generator-cli version-manager set 5.1.1
echo "Generating SDKs"

GROUP_ID="cloud.redhat.com"
ARTIFACT_ID="kafka-management-sdk"
OPENAPI_FILENAME=".openapi/kas-fleet-manager.yaml"
PACKAGE_NAME="com.openshift.cloud.api.kas"
OUTPUT_PATH="packages/kafka-management-sdk"
TEMPLATES_DIR="$(dirname $0)/templates"


echo "Generating based on ${OPENAPI_FILENAME}"
yq e 'del(.. | select(has("deprecated")))' "${OPENAPI_FILENAME}" > "${OPENAPI_FILENAME}.processed"
rm -Rf $OUTPUT_PATH/src $OUTPUT_PATH/target

npx @openapitools/openapi-generator-cli generate -g java --library resteasy -t "$TEMPLATES_DIR"  -i \
    "$OPENAPI_FILENAME.processed" -o "$OUTPUT_PATH" \
    --package-name="${PACKAGE_NAME}" \
    --additional-properties="apiTests=false,modelTests=false,hideGenerationTimestamp=true,groupId=${GROUP_ID},artifactId=${ARTIFACT_ID},modelPackage=${PACKAGE_NAME}.models,invokerPackage=${PACKAGE_NAME}.invoker,apiPackage=${PACKAGE_NAME},dateLibrary=java8,licenseName=Apache-2.0,licenseUrl=https://www.apache.org/licenses/LICENSE-2.0.txt" \
    --ignore-file-override=.openapi-generator-ignore

GROUP_ID="cloud.redhat.com"
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

GROUP_ID="cloud.redhat.com"
ARTIFACT_ID="kafka-instance-sdk"
OPENAPI_FILENAME=".openapi/kafka-admin-rest.yml"
PACKAGE_NAME="com.openshift.cloud.api.kas.auth"
OUTPUT_PATH="packages/kafka-instance-sdk/"
yq e 'del(.. | select(has("deprecated")))' "${OPENAPI_FILENAME}" > "${OPENAPI_FILENAME}.processed"
rm -Rf $OUTPUT_PATH/src $OUTPUT_PATH/target

echo "Generating based on ${OPENAPI_FILENAME}"

npx @openapitools/openapi-generator-cli generate -g java --library resteasy  -t "$TEMPLATES_DIR"  -i \
    "$OPENAPI_FILENAME.processed" -o "$OUTPUT_PATH" \
    --package-name="${PACKAGE_NAME}" \
    --additional-properties="apiTests=false,modelTests=false,hideGenerationTimestamp=true,groupId=${GROUP_ID},artifactId=${ARTIFACT_ID},modelPackage=${PACKAGE_NAME}.models,invokerPackage=${PACKAGE_NAME}.invoker,apiPackage=${PACKAGE_NAME},dateLibrary=java8,licenseName=Apache-2.0,licenseUrl=https://www.apache.org/licenses/LICENSE-2.0.txt" \
    --ignore-file-override=.openapi-generator-ignore




