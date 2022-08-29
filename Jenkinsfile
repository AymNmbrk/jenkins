pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                sh 'echo hello' 
            }
        }
        stage('Test') { 
            steps {
                sh 'ls'
            }
        }
        stage('Deploy') { 
            steps {
                sh 'pwd'
                sh 'echo the end' 
            }
        }
    }
}