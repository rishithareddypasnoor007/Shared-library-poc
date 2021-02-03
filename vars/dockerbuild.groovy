def gitLogin(String repo,String branch) {
	git url: "https://github.com/rishithareddypasnoor007/$repo", branch: "$branch"
	sh "ls"
}
def build(String tag) {
	sh "docker build -t $tag ."
}

