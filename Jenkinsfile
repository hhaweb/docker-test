pipeline {
	agent any
	environment {
	    AWS_ACCOUNT_ID="078007239164"
		AWS_DEFAULT_REGION="ap-southeast-1"
		IMAGE_REPO_NAME="my-app"
		IMAGE_TAG="${env.BUILD_NUMBER}"
		REPOSITORY_URI = "${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_DEFAULT_REGION}.amazonaws.com"
	}

	stages {
	    stage("Logging into AWS ECR") {
            steps {
                withCredentials([aws(accessKeyVariable:'AWS_ACCESS_KEY_ID', credentialsId:'aws-credential',secretKeyVariable:'AWS_SECRET_ACCESS_KEY')]){
                sh "aws ecr get-login-password --region ${AWS_DEFAULT_REGION} | docker login --username AWS --password-stdin ${REPOSITORY_URI}"
               }
            }
        }

        stage("Building image") {
            steps{
                script {
                    dockerImage = docker.build("${IMAGE_REPO_NAME}:${IMAGE_TAG}")
                }
            }
        }

        stage("Pushing image to AWS ECR") {
            steps{
                sh "docker tag ${IMAGE_REPO_NAME}:${IMAGE_TAG} ${REPOSITORY_URI}/${IMAGE_REPO_NAME}:${IMAGE_TAG}"
                sh "docker push ${REPOSITORY_URI}/${IMAGE_REPO_NAME}:${IMAGE_TAG}"
            }
        }
	}
}
