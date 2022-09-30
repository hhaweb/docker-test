pipeline {
    agent any
    environment {
        AWS_ACCESS_KEY_ID = credentials('	AWSAccessKeyId')
        AWS_SECRET_ACCESS_KEY = credentials('AWSSecretKey')
    }
    stages {
        stage('Build') {
            steps {
                sh 'echo "Building"'
                sh 'echo $AWS_ACCESS_KEY_ID'
                sh 'echo $AWS_SECRET_ACCESS_KEY'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Testing"'
            }
        }
        stage('Publish') {
            steps {
                sh 'echo "Publishing"'
            }
            post {
                success {
                    sh 'echo "Deploying to EB"'
                    sh 'sudo chmod 775 ./deploy_app.sh'
                    sh './deploy_app.sh'
                }
            }
        }
    }
}
