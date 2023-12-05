# Url Shortener 2

- Kotlin
- Spring Boot
- Postgres
- Docker
- Kubernetes

## local development

- start database(s) `docker-compose up`
- Interact with docker `docker exec --tty --interactive <container> <program>`
  - MongoDB Shell `mongosh`
- start server: with IntelliJ or `./gradlew bootRun`

### mongosh

- `use urls`
- `db.urls.find()`

## features

- add a url `./scripts/createUrl.sh "https://www.learnitmyway.com"`
- paste url in response in browser and get redirected

## deployment

- build jar, build docker image and push to docker hub: `./scripts/build-and-push.sh`
