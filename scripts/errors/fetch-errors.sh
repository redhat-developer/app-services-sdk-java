ERRORS_FOLDER=.errors

echo "Fetching error specifications from backends"

curl https://api.stage.openshift.com/api/kafkas_mgmt/v1/errors | jq > $ERRORS_FOLDER/errors_kafka_mgmt.json

curl https://api.stage.openshift.com/api/serviceregistry_mgmt/v1/errors?size=100 | jq > $ERRORS_FOLDER/errors_srs_mgmt.json

## Not enabled yet
# curl https://api.stage.openshift.com/api/connector_mgmt/v1/errors | jq > errors_connector_mgmt.json
 
echo "Successfully fetched errors"
