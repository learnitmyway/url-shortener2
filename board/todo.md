# To do

- k8s
  - ingress rule
  - healthcheck
  - replicate and persist data
    - using a StatefulSet and Volume?

- shard db

- add a redis cache
  - set up redis with docker-compose
  - add to k8s
  - update architecture diagram

- handle hash collisions
- k8s namespace
- fix: no exception is thrown if there is a duplicate key
  - using mongosh I get `MongoServerError: E11000 duplicate key error collection: urls.urls index: _id_ dup key: { _id: "40616eb8" }`
- redirect with 301 instead of 302
- seed data with 3 shortened urls
- how to handle www or no www?
- validate long url exists
- check if long url is already in the db
- persist `https` and `http` as part of `longUrl`?
- separate spring profile for production
