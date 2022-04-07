def call( AWS_ACCOUNT_ID, AWS_DEFAULT_REGION, IMAGE_REPO_NAME, IMAGE_TAG){
aws ecr get-login-password --region ${AWS_DEFAULT_REGION} | docker login --username AWS --password-stdin ${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_DEFAULT_REGION}.amazonaws.com"
}
