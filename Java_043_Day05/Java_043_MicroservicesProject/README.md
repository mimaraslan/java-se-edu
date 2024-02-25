# MICROSERVICES


```
docker run --name my-postgresdb -e POSTGRES_PASSWORD=123456789 -d -p 9999:5432 postgres
```

```
docker run --name my-zipkin -d -p 9411:9411 --memory=256m  openzipkin/zipkin
```

```
docker run -d --hostname my-rabbit --name my-rabbit -e RABBITMQ_DEFAULT_USER=user -e RABBITMQ_DEFAULT_PASS=user -p 15672:15672 -p 5672:5672  --memory=512m rabbitmq:3.13.0-management
```