#!/bin/bash

cp target/*.jar docker/microservice.jar

docker build -t swarm-micro docker

docker run --rm -it -p 8080:8080 swarm-micro
