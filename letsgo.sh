#!/bin/bash

mvn clean package -DskipTests && docker-compose up -d --build sias && docker-compose up -d