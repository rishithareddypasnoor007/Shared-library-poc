def push(String awsRepoURL, String awsCredentials, String tag, String image){
       docker.withRegistry('$awsRepoURL', 'ecr:us-west-2:aws-credentials'){
               image.push('$tag')
       }
}
