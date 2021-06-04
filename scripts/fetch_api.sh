#!/usr/bin/env bash

# get the download URL of the OpenAPI spec file
OPENAPI_FILE_URL=$1
OPENAPI_FILE_NAME=$(dirname $0)/../.openapi/$(basename $OPENAPI_FILE_URL)

# download the OpenAPI file
curl -H "Authorization: token $BF2_TOKEN" "$OPENAPI_FILE_URL" --output $OPENAPI_FILE_NAME
if [ $? != 0 ]; then
  exit $?
fi


