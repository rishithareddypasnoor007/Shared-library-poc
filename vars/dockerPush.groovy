def push(String awsRepoURL, String awsCredentials, String tag, String image){
        docker.withRegistry('$URL', '$credentials'){
        docker.withRegistry('$awsRepoURL', '$awsCredentials'){
                $image.push('$tag')
        }
}
