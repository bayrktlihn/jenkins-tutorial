def call(String project, String imageTag, String dockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'your_credentialsId', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPassword}"
  }

  sh "docker push ${dockerHubUser}/${project}:${imageTag}"
  
}
