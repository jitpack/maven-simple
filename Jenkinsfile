node {
 stage('scm checkout'){
   git 'https://github.com/razzpothula/maven-simple'
  stage('compile-package'){
     //Get maven home path
   def mvnhome = tool name: 'mvn', type: 'maven'
   sh "${mvnhome}/bin package"
    }
}
