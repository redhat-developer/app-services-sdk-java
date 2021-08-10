#!/usr/bin/env bash

cd ./packages/kafka-management-sdk
mvn clean install
cd ../..

cd ./packages/kafka-instance-sdk
mvn clean install
cd ../..

cd ./packages/registry-management-sdk
mvn clean install
cd ../..
