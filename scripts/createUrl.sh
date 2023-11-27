#!/usr/bin/env bash

curl --verbose \
	--header "Content-Type: application/json" \
	--data '{
    "longUrl": "'$1'"
  }' \
http://localhost:8081/v1/urls