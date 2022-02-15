
pipeline {
    agent any
    parameters {
        booleanParam(name: 'DeployFromBranch', defaultValue:false,
        description:  'The Develop branch is deployed automatically. ' +
						'If there is a need to deploy from the other branch, enable this parameter. ' +
						'The docker image will be released with generated version and deployed to DEV only.')
    }
tools { 
        maven 'Mavenglobalname'
    }
environment {
		SERVICE_NAME = 'fromi-otp-service'
	
    }
    stages {    
	    stage('Checkout') {
    steps {
     checkout([  
            $class: 'GitSCM', 
            branches: [[name: 'refs/heads/master']], 
            doGenerateSubmoduleConfigurations: false, 
            extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'helmchart']], 
            submoduleCfg: [], 
            userRemoteConfigs: [[credentialsId: '13d412be-0d91-447a-b125-db7f5800cdb2', url: 'https://github.com/Gopalakrishnan997/helm-chart.git']]
        ])
    }
}
		stage("Adjust version") {
			when {
				not {
					branch 'develop'
				}
			}
			steps {
				script {
					echo "The branch name - ${env.BRANCH_NAME}"
				        def startOfTheBranchName = env.BRANCH_NAME.indexOf('/') // get the branch name without feature/hotfix/etc
					// new name to have first 20 chars from the branch name
					def branchSubstring = env.BRANCH_NAME.substring(startOfTheBranchName + 1, startOfTheBranchName + 21)
                                        echo "${branchSubstring}"
					def branchNewVersion = getVersion() + "_" + env.BUILD_NUMBER + "_" + branchSubstring
					echo "Version to be released from branch - ${branchNewVersion}"
					sh "mvn versions:set -DnewVersion=${branchNewVersion}"
					echo "New version in pom.xml - " + getVersion()
				}
			}
		}
	    stage("Build") {
			steps {
				sh "mvn clean verify"
			}
			
		}
	    stage('Check Helmchart config') {
	    when { changeset "helm-chart/*"}
            steps {
                   sh "helm lint ${WORKSPACE}/helm-chart/oc-deployment"
	  		}	
		}
	    stage("Release helmchart") {
            when { changeset "helm-chart/*"}
            steps {
               script {
		       def pomVersion = getVersion()
                 def chart = readYaml (file: 'helm-chart/oc-deployment/Chart.yaml')
def chartVersion = chart.version.toString()
			 echo "Helmchart version  - ${chartVersion}"
			 echo "App version - " + getVersion()
                       sh "helm package ${WORKSPACE}/helm --version ${chartVersion} --app-version ${chartVersion}"
                       rtUpload(
                       serverId: 'jfroginstance',
                       spec: '''{
                           "files": [{
                           "pattern": "*.tgz",
                           "target": "default-helm"
                           }]
                        }
                        '''
                       )
                }
            }
        }
	    	stage("Deploy to DEV from branch") {
			when {
				allOf {
					not {
						branch 'develop'
					}
					expression {
						return params.DeployFromBranch
					}
				}
			}
			steps {
				script {
					echo "Build and push docker with new version"

				}
			}
		}
    }

}
	
def getVersion() {
	return sh(returnStdout: true,
script: 'mvn org.apache.maven.plugins:maven-help-plugin:3.1.0:evaluate -Dexpression=project.version -q -DforceStdout --batch-mode -U -e -Dsurefire.useFile=false'
	).trim()
}
