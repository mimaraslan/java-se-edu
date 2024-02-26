# DevOps Pipeline Project
## Spring Boot, Jenkins, Jenkinsfile, Git, GitHub, Maven, Docker, Dockerfile, DockerHub, Minikube, Kubernetes (K8s)

### Spring Boot Project - GitHub URL
https://github.com/mimaraslan/Java_045_DevOpsPipeline
### Dockerfile
https://github.com/mimaraslan/Java_045_DevOpsPipeline/blob/master/Dockerfile

### Jenkinsfile
https://github.com/mimaraslan/Java_045_DevOpsPipeline/blob/master/Jenkinsfile


### TERMINAL 1 for Jenkins
```
cd D:\my-jenkins

java -jar jenkins.war  --httpPort=9999
```


### TERMINAL 2 for Minikube
```
minikube start

kubectl cluster-info

kubectl get nodes -o wide

kubectl get pods -o wide

kubectl get deployments
```



### TERMINAL 3 for Spring Boot Project

```
kubectl get nodes -o wide

kubectl get pods -o wide

kubectl logs my-devops-application-deployment-POD_NAME

minikube service my-devops-application-service --url

http://127.0.0.1:YOUR_PORT_NUMBER
```

