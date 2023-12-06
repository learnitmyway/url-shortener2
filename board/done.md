# done

- why can't I reach the web server?
    - with Docker Desktop you need to use localhost instead of the cluster ip
- why am I getting `curl: (52) Empty reply from server`?
    - Having `service` in the name seems to break it
    - There is a difference between curl localhost:30081/ and curl localhost:30081
    
