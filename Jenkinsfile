pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    checkout scm
                }
            }
        }

        stage('Deploy to Minikube') {
            steps {
                script {
                    // Print the current directory
                    echo "Current Directory: ${pwd()}"

                    // List the contents of the current directory
                    sh 'ls -la'
                    sh 'envsubst < ${WORKSPACE}/deployment.yaml | kubectl apply -f -'
                }
            }
        }
    }
}