pipeline
         node{
              stage('SCM Checkout'){
            git url :'https://github.com/razzpothula/maven-simple.git'
        }
                  stage('Compile'){
                   // get the maven path
                    def mvnhome = tool name: 'mvn', type: 'maven'
                           sh "${mvnhome}/bin/mvn compile"      
                  }    
    }
