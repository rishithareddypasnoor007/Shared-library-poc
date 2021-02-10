def build(String imagename, String environment, String path, String awsRepoURL, String awsCredentials, String imagetag) {
        docker.withRegistry("$awsRepoURL", "$awsCredentials"){
                (docker.build("$imagename", "--build-arg DEPLOY_AS=$environment -f ${env.WORKSPACE}/$path/Dockerfile .")).push("$imagetag")   
        }

}

