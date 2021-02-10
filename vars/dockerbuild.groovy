def build(String tag, String environment, String path) {
	docker.build("$tag", "--build-arg DEPLOY_AS=$environment -f ${env.WORKSPACE}/$path/Dockerfile .")
}

def push(String awsRepoURL, String awsCredentials, String tag, Image image){
       docker.withRegistry('$awsRepoURL', '$awsCredentials'){
               image.push('$tag')
       }
}

