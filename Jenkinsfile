 node{
 stage('Scm Checkout'){
   git 'https://github.com/razzpothula/maven-simple'
  stage('Compile-Package'){
     //Get maven home path
   def mvnhome = tool name: 'mvn', type: 'maven'
   sh "${mvnHome}/bin/mvn package"
    }
}
