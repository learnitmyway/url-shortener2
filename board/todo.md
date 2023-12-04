# To do

- why am I able to query by shortUrl? Is it the same as a scan in DynamoDB?
- rename shortUrl to urlKey and make it the PK?
  - prevent duplicates
- k8s
    - add a load balancer (and update architecture diagram)
    - replicate data
    - shard data
- add a redis cache
  - set up redis with docker-compose
  - update architecture diagram
- redirect from / to /v1/urls
- redirect with 301 instead of 302
- seed data with 3 shortened urls
- how to handle www or no www?
- validate long url exists
- persist https and http?
