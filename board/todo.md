# To do

- set up postgres with docker-compose
- post /urls
  - 1st iteration: use domain as short url key
- get /urls/{short-url}
- seed data with 3 shortened urls
- hash url using CRC32
- add a redis cache
    - set up redis with docker-compose
- k8s
    - add a load 
    - replicate data
    - shard data