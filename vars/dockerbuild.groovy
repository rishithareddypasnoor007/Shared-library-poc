def build(String tag) {
	sh "docker build -t $tag ."
}

