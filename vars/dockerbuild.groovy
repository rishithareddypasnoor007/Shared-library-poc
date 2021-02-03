def gitLogin(repo,branch) {
	git url: "https://github.com/rishithareddypasnoor007/${repo}" branch: "${branch}"
}
def build(tag) {
	sh "docker build -t "${tag}" ."
}

