# To do

- k8s
    - add a load balancer (and update architecture diagram)
    - replicate data
    - shard data
- add a redis cache
  - set up redis with docker-compose
  - update architecture diagram
- shard db
- fix: no exception is thrown if there is a duplicate key
  - using mongosh I get `MongoServerError: E11000 duplicate key error collection: urls.urls index: _id_ dup key: { _id: "40616eb8" }`
- redirect from / to /v1/urls
- redirect with 301 instead of 302
- seed data with 3 shortened urls
- how to handle www or no www?
- validate long url exists
- persist https and http?
