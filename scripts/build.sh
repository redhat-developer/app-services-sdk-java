#!/usr/bin/env bash

cd "$(dirname "$0")"
cd ../packages/kafka-management-sdk
mvn package

cd "$(dirname "$0")"
cd ../packages/kafka-instance-sdk
mvn package

cd "$(dirname "$0")"
cd ../packages/registry-management-sdk
mvn package  
