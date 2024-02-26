pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'Java17'
    }

   environment {
        IMAGE_NAME = 'mimaraslan/devops-application'
        IMAGE_USERNAME    = 'mimaraslan'
        GIT_URL = 'https://github.com/mimaraslan/Java_045_DevOpsPipeline'
    }

  stages {

        stage('My Test') {
            steps {
                //sh 'mvn test '
                bat 'mvn test'
            }
         }

        stage('Build Maven') {
            steps {
                 checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/mimaraslan/Java_045_DevOpsPipeline']])

                // TODO FIXME
               //   checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: ${GIT_URL}]])

                //sh 'mvn clean install'
                 bat 'mvn clean install'
            }
        }



        stage('Docker Image') {
            steps {
                // sh 'docker build -t mimaraslan/devops-application .'
                 bat 'docker build -t mimaraslan/devops-application .'

                // TODO - JENKINS ENV
              //  sh "docker build -t ${IMAGE_NAME} ."
              //  bat "docker build -t ${IMAGE_NAME} ."
            }
        }


        stage('Docker Image to DockerHub') {
            steps {
              script{
                  withCredentials([string(credentialsId: 'dockerhub', variable: 'dockerhub')]) {

                 //  sh 'echo docker login -u mimaraslan -p ${dockerhub}'
                 //  sh 'docker push mimaraslan/devops-application:latest'

                   bat 'echo docker login -u mimaraslan -p ${dockerhub}'
                 //   bat 'docker push mimaraslan/devops-application:${TAG_VERSION}'
                   bat 'docker push mimaraslan/devops-application:latest'
                }
              }
            }
        }

         stage('Cleanup Docker Image') {
                     steps {
                       script{
                           withCredentials([string(credentialsId: 'dockerhub', variable: 'dockerhub')]) {
                             //  sh "docker rmi mimaraslan/devops-application:latest"
                               bat 'docker rmi mimaraslan/devops-application:latest'
                         }
                       }
                     }
                 }


        stage('Deploy to Kubernetes') {
            steps {
              script{
                  kubernetesDeploy (configs: 'deploymentservice.yaml', kubeconfigId: 'kubernetes')
              }
            }
        }



    }
}