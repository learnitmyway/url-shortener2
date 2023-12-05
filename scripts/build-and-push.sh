#!/usr/bin/env bash

./gradlew build
docker build -t developerdavo/url-shortener2 .
docker push developerdavo/url-shortener2
