def push(String awsRepoURL, String awsCredentials, String tag, Image image){
       docker.withRegistry('$awsRepoURL', '$awsCredentials'){
               $image.push('$tag')
       }
}
