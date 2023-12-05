# Url Shortener 2

- Kotlin
- Spring Boot
- Postgres

## docker-compose

- `docker-compose up`
- Interact with docker `docker exec --tty --interactive <container> <program>`
    - MongoDB Shell `mongosh`

## useful commands

- start server: with IntelliJ or `./gradlew bootRun`
- create jar in `build/libs`: `./gradlew build`

### mongosh

- `use urls`
- `db.urls.find()`

## useful scripts

- add a url `./scripts/createUrl.sh "https://www.learnitmyway.com"`
- build and push docker image: `./scripts/build-and-push.sh`
