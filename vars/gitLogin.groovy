def login(String branch, String credentials) {
	git url: "https://github.com/Cowbell-Cyber/dairy.git", branch: "$branch", credentialsID: "$credentials"
}
