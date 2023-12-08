# done

- k8s
  - why can't I reach the web server?
      - with Docker Desktop you need to use localhost instead of the cluster ip
  - why am I getting `curl: (52) Empty reply from server`?
      - Having `service` in the name seems to break it
      - There is a difference between curl localhost:30081/ and curl localhost:30081
      - `app` instead of `app.kubernetes.io/name`
  - why am I getting "Exception in monitor thread while connecting to server localhost:27017"?
    - I could try sshing into the url-service and see if it's available https://www.phind.com/search?cache=ez7c1wwyer2cmupytjzvd7w2
      - `curl http://mongo-service:27017/` results in: `It looks like you are trying to access MongoDB over HTTP on the native driver port.`
        - does this mean I have a connection?
    - TBC: it's because it's requesting it from localhost and not `url-db-service`
    
