#!/bin/bash

mvn clean package

java -jar ~/Documents/APPS/payara/payara-micro-5.193.jar --deploy jax-rs-restapi-api/target/jax-rs-restapi-api-1.0.war

