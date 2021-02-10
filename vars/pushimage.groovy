def push(String awsRepoURL, String awsCredentials, String tag){
       docker.withRegistry('$awsRepoURL', '$awsCredentials'){
               image.push('$tag')
       }
}
