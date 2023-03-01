pipeline {
    agent any
    tools{
        maven 'maven-3.9'
    }
    stages {
        stage("Build jar") {
            steps {
                script {
                    echo "Building the application..."
                    sh 'mvn package'
                }
            }
        }
        stage("Build image") {
            steps {
                script {
                    echo "Building the Docker image..."
                    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        sh 'docker build -t 'git repo'
                        sh "echo $PASS | docker login -u $USER --password-stdin"
                        sh 'docker push '
                    }
                }
            }
        }
        stage("Deploy") {
            steps {
                script {
                    echo "Deploying the application"
                }
            }
        }
    }
}
