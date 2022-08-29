pipeline {
  agent any
  stages {
    stage('BUILD') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('TEST') {
      steps {
        sh 'echo Test'
      }
    }

    stage('POST BUILD') {
      steps {
        archiveArtifacts(artifacts: '*/*.war', onlyIfSuccessful: true)
      }
    }

    stage('DEPLOY') {
      steps {
        sh 'rm -r /var/lib/tomcat9/webapps/spark*'
        sh 'cp target/*war /usr/lib/tomcat9/webapps/spark.war'
      }
    }

  }
}
