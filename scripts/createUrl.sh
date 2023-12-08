#!/usr/bin/env bash

curl --verbose \
	--header "Content-Type: application/json" \
	--data '{
    "longUrl": "'$2'"
  }' \
"http://localhost:${1}/v1/urls"