pipeline
    node{
        stage('SCM Checkout') {
            git url:'https://github.com/razzpothula/maven-simple.git'
        }
        stage('Compile'){
            //Get maven home path
            def mvnhome = tool name: 'mvn', type: 'maven'
            sh "${mvnhome}/bin/mvn compile"
        }
        stage('SonarQube Analysis'){
            def mvnhome = tool name: 'mvn', type: 'maven'
            withSonarQubeEnv('sonar'){
                        sh "${mvnhome}/bin/mvn sonar:sonar"
            }
        }
        stage("Quality Gate"){
            timeout(time: 1, unit: 'HOURS') { 
                // Just in case something goes wrong, pipeline will be killed after a timeout
                def qg = waitForQualityGate() 
                // Reuse taskId previously collected by withSonarQubeEnv
                if (qg.status != 'OK') {
                    error "Pipeline aborted due to quality gate failure: ${qg.status}"
                    }
                }
         }
        stage('Package'){
            def mvnhome = tool name: 'mvn', type: 'maven'
            sh "${mvnhome}/bin/mvn package"
        }
    }
