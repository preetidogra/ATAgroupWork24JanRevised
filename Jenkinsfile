pipeline {
    agent any
    tools {
        maven 'apache-maven-3.8.6'
        jdk 'JAVA_HOME'
    }
    stages {
	stage('Checkout code') {
        	steps {
		// Get some code from a GitHub repository
    	checkout([$class: 'GitSCM',
        branches: [[name: '*/POM-model']],
        extensions: [[$class: 'CloneOption', timeout: 120]],
        gitTool: 'Default', 
        userRemoteConfigs: [[url: 'https://github.com/preetidogra/ATAgroupWork_FinalProject']]
		 
    ])
           	checkout scm
		echo 'done Checkout'
		
        }
    }
		
	stage ('Build') {
		steps {
        withMaven {
      	bat "mvn clean verify"
    } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports
		echo 'Done build'	
		}}
	
			  
	
	stage("Cucumber Report"){
		steps{
			// Get some code from a GitHub repository
    		checkout([$class: 'GitSCM',
        	branches: [[name: '*/POM-model']],
        	extensions: [[$class: 'CloneOption', timeout: 120]],
        	gitTool: 'Default', 
        	userRemoteConfigs: [['https://github.com/preetidogra/ATAgroupWork_FinalProject']]
			
			   ]) 
		cucumber buildStatus: "UNSTABLE",
		fileIncludePattern: "**/*.json",
                jsonReportDirectory: 'target/JSonReports'}}
	  

}

}
