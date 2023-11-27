# To do

- post /urls
  - 1st iteration: use domain as short url key
- get /urls/{short-url}
- seed data with 3 shortened urls
- hash url using CRC32
- add a redis cache
    - set up redis with docker-compose
    - update architecture diagram
- k8s
    - add a load balancer (and update architecture diagram)
    - replicate data
    - shard data