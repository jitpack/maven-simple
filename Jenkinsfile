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
        stage('Package'){
            def mvnhome = tool name: 'mvn', type: 'maven'
            sh "${mvnhome}/bin/mvn package"
        }
        stage('E-Mail Notification'){
            mail bcc: '', body: '''Email notification for job
thanks
rajesh
''', cc: '', from: '', replyTo: '', subject: 'Jenkinsfile', to: 'rajeshpothula.bj@gmail.com'
     }
        
    }
