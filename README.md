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

## local deployment with Kubernetes

1. start Kubernetes cluster with Docker Desktop
2. build jar, build docker image and push to docker hub: `./scripts/build-and-push.sh`
3. deploy url-db to cluster `kubectl apply -f k8s/url-db.yaml`
4. deploy url-service to cluster `kubectl apply -f k8s/url-service.yaml`
  - ip address of url-service is `localhost:PORT>` where
    - `PORT` is the `nodePort` in the `yaml` file
5. get pods `kubectl get pods`
6. view logs `kubectl logs <pod>`
