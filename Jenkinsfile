pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    environment {
        NEW_VERSION = '1.0.0'
        SERVER_CREDENTIALS = credentials('server-credentials')
    }
    stages {
        stage("Build") {
            steps {
                echo 'building the application...'
            }
        }
        stage("Test") {
            steps {
                echo 'Testing the application...'
                echo "Building version ${NEW_VERSION}"
            }
        }
        stage("Deploy") {
             steps {
                echo 'Deploying the application...'
##              withCredentials([
##                   usernamePassword(credentials: 'server-credentials',usernameVariable: USER, passwordVariable: PWD)
                ] ) {
##                    sh "script.sh ${USER} ${PWD}"
                }
            }
        }
    }
}

node {
    // groovy script
}