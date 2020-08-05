def project="${JOB_NAME}".split('/')[0]
pipeline {
  agent any
  environment {
    PROJECT_NAME= "${project}"
  }
  stages {
    stage("build & SonarQube analysis") {
      agent any
      steps {
        withSonarQubeEnv('SonarQube') {
          sh 'mvn clean verify org.pitest:pitest-maven:mutationCoverage package sonar:sonar'
        }
      }
    }
    stage ("SonarQube analysis") { 
      agent none
      steps { 
        script{
          timeout(time: 1, unit: 'HOURS') { // Just in case something goes wrong, pipeline will be killed after a timeout
            def qualitygate = waitForQualityGate() 
              if (qualitygate.status != "OK") { 
                error "Pipeline aborted due to quality gate coverage failure: ${qualitygate.status}" 
              }
          } 
        }
	    }
    }
    stage ("Send Logs to Splunk") {
      agent none
      steps { 
        script {
            splunkins.archive("**/*.log", null, false, "10MB")
          }
      }
    }

  }
}
