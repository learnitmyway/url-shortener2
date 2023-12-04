# Url Shortener 2

- Kotlin
- Spring Boot
- Postgres

## docker-compose

- `docker-compose up`
- Interact with docker `docker exec --tty --interactive <container> <program>`
    - MongoDB Shell `mongosh`

## useful commands

- start server `./gradlew bootRun` (easier to use IDE)
- create jar in `build/libs`: `./gradlew build`

### mongosh

- `use urls`
- `db.urls.find()`

## useful scripts

- add a url `./scripts/createUrl.sh "https://www.learnitmyway.com"`
