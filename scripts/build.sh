#!/usr/bin/env bash

cd "$(dirname "$0")"
cd ../packages/kafka-management-sdk
mvn clean package

cd "$(dirname "$0")"
cd ../packages/kafka-instance-sdk
mvn clean package

cd "$(dirname "$0")"
cd ../packages/registry-management-sdk
mvn clean package  

cd "$(dirname "$0")"
cd ../packages/connector-management-sdk
mvn clean package  
