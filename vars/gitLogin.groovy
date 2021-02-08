def login(String repo,String branch, String credentials) {
	git url: "https://github.com/rishithareddypasnoor007/$repo", branch: "$branch", credentialsID: "$credentials"
}
