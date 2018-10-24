#!groovy
pipeline{
    agent any
    stages{
            stage('Checkout'){
                steps {
                    script {
                    //git branch: 'master', url: 'https://github.com/pavanhitesh/alexaSelenium.git'
                    gitInfo = checkout scm
		    sh 'ls -lrth'
                }    
                }
                
            }
    }
    
}
