# DevOps

### Docker

docker build --build-arg JAR_FILE=target/java_044_devops_hello-1.0.3.jar  --tag mimaraslan/java_044_devops_hello:v003 .

docker build --build-arg JAR_FILE=target/java_044_devops_hello-1.0.3.jar  --tag mimaraslan/java_044_devops_hello:latest .


DIŞ_PORT : İÇ_PORT

docker run -d -p 8081:8080 mimaraslan/java_044_devops_hello:v001

docker run -d -p 8081:8080 mimaraslan/java_044_devops_hello:v002

docker run -d -p 8081:8080 mimaraslan/java_044_devops_hello

docker run -d -p 8081:8080 mimaraslan/java_044_devops_hello:latest


http://localhost:8080/api/v1/hello
http://localhost:8080/api/v1/metod2
http://localhost:8080/api/v1/metod3


docker pull mimaraslan/java_044_devops_hello:latest

docker pull postgres

docker run --name my-postgresdb -e POSTGRES_PASSWORD=123456789 -d postgres

docker run --name my-postgresdb -e POSTGRES_PASSWORD=123456789 -d -p 9999:5432 postgres



#### Kubernetes

#### DockerHub'dan Docker'a image'i container olarak çekip çalıştırmak.

docker run -d -p 8081:8080 mimaraslan/java_044_devops_hello:latest



kubectl get nodes

#### DockerHub'dan Kubenetes'teki Pod'a image'i container olarak çekip çalıştırmak.

kubectl run mypod1 --image=mimaraslan/java_044_devops_hello:latest
kubectl run mypod2 --image=mimaraslan/java_044_devops_hello:latest
kubectl run mypod3 --image=mimaraslan/java_044_devops_hello:latest
kubectl run mypod4 --image=mimaraslan/java_044_devops_hello:latest

kubectl run hello-service --image=ebrucinarr/docker_hello:v001
kubectl run agent-service --image=ebrucinarr/docker_hello:v001

kubectl get pods



docker run --name my-postgresdb -e POSTGRES_PASSWORD=123456789 -d -p 9999:5432 postgres

kubectl run postgres --image=postgres --env="POSTGRES_PASSWORD=123456789"
