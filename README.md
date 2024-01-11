# Url Shortener 2

A url shortener using:

- Kotlin
- Spring Boot
- Postgres
- Docker
- Kubernetes

## Disclaimer

This app isn't production ready:

- it only works on localhost
- test coverage is low
- ...

## local development

- start database(s) `docker-compose up`
- Interact with docker `docker exec --tty --interactive <container> <program>`
  - MongoDB Shell `mongosh`
- start server: with IntelliJ or `./gradlew bootRun`

### mongosh

- `use urls`
- `db.urls.find()`

## features

- add a url `./scripts/createUrl.sh "8081" "https://www.learnitmyway.com"`
- paste url in response in browser and get redirected

## local deployment with Kubernetes

1. start Kubernetes cluster with Docker Desktop
2. build jar, build docker image and push to docker hub: `./scripts/build-and-push.sh`
3. deploy everything `kubectl apply -f k8s`
  - ip address of url-service is `localhost:30081`
