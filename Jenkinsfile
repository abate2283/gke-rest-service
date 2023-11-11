pipeline {
       agent any
//     agent { docker {image 'maven:3.9.5'}}
//     agent { docker {image 'node:21.1'}}
        environment {
                dockerHome = tool 'abateDocker'
                mavenHome = tool 'abateMaven'
                PATH = "$dockerHome/bin:$mavenHome/bin:$PATH"
        }
    stages {
        stage('Build'){
            steps {
                sh "mvn --version"
                sh "docker --version"
                echo "Build"
                echo "PATH - $PATH"
                echo "BUILD_NUMBER - $env.BUILD_NUMBER"
                echo "BUILD_ID - $env.BUILD_ID"
                echo "JOB_NAME - $env.JOB_NAME"
                echo "BUILD_TAG - $env.BUILD_TAG"
                echo "BUILD_URL - $env.BUILD_URL"
            }
        }
        stage('Test'){
             steps {
                echo "Test"
            }
       }
        stage('Integration Test'){
              steps {
                  echo "Integration Test"
                }
            }
       }
       post {
            always {
                echo 'I am awesome, I run always'
       }
            success {
                 echo 'I run when you are successful'
           }
            failure {
                  echo 'I run when you are unsuccessful'
       }
    }
}