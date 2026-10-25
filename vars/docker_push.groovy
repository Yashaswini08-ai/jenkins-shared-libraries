
def call(String Project, String ImageTag, String dockerHubUser) {
    withCredentials([usernamePassword(
        credentialsId: 'dockerhubCred',
        usernameVariable: 'dockerHubUser',
        passwordVariable: 'dockerHubPass'
    )]) {
        sh 'echo "$dockerHubPass" | docker login -u "$dockerHubUser" --password-stdin'
        sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
    }
}
