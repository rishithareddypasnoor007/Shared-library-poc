def gitLogin(repo,branch,credentialId) {
	git url: "https://github.com/Cowbell-Cyber/${repo}" branch: "${branch}" credentialId: "${credentialId}"
}
def build(tag) {
	sh "docker build -t "${tag}" ."
}

