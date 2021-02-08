def push(String awsRepoURL, String awsCredentials, String tag, String image){
        docker.withRegistry('$awsRepoURL', '$awsCredentials'){
                $image.push('$tag')
        }
}
