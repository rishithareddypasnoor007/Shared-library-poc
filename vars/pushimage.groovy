def push(String awsRepoURL, String awsCredentials, String tag, String image){
       print $tag
       docker.withRegistry("$awsRepoURL", "$awsCredentials"){
               image.push("$tag")
       }
}
