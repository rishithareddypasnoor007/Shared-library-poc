def build(String tag, String environment, String path) {
	docker.build("$tag", "--build-arg DEPLOY_AS=$environment -f ${env.WORKSPACE}/$path .")
}

