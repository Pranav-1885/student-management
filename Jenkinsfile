pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Maven Build and Test') {
            steps {
                bat 'mvnw.cmd clean test package'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t student-management:latest .'
            }
        }

        stage('Deploy') {
            steps {
                bat 'docker stop student-management-container || exit 0'
                bat 'docker rm student-management-container || exit 0'
                bat 'docker run -d --name student-management-container -p 8080:8081 student-management:latest'
            }
        }
    }
}