node{
stage('SCM Checkout'){
git url:'https://github.com/razzpothula/maven-simple.git'
} 
  }
stage('Compile'){
  def mvn/Home = tool name: 'mvn', type: 'maven'
  sh"${mvnHome}/bin/mvn compile"
}
