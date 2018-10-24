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
        stage ('Build'){
                steps{
                       scripts{
                        bat 'mvn clean install -DskipTests=true'
                        }
                }
                }

	stage ('Test'){
		steps{
			scripts{
			bat 'mvn test -Dcucumber.options="/src/test/java/Feature/example.feature"'
			}
		}
		}
	
    }
    
}
