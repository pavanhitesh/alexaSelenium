#!groovy
pipeline{
    agent any
    stages{
            stage('Checkout'){
                steps {
                    script {
                    //git branch: 'master', url: 'https://github.com/pavanhitesh/alexaSelenium.git'
                    gitInfo = checkout scm
		    
                }    
                }
                
            }
        stage ('Build'){
                steps{
                       script{
                        bat 'mvn clean install -DskipTests=true'
                        }
                }
                }

	stage ('Test'){
		steps{
			script{
			//bat 'mvn test -Dcucumber.options="/src/test/java/Feature/example.feature"'
			bat 'mvn test'
			}
		}
		}
	
    }
    
}
