pipeline {
    agent any
    tools { 
        maven 'Mavenglobalname'
    }
    parameters {
        booleanParam(name: 'DeployFromBranch', defaultValue:false,
        description:  'The Develop branch is deployed automatically. ' +
						'If there is a need to deploy from the other branch, enable this parameter. ' +
						'The docker image will be released with generated version and deployed to DEV only.')

    }
environment {
		SERVICE_NAME = 'fromi-otp-service'
	
    }
    stages {
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
    }

}
def getVersion() {
	return sh(returnStdout: true,
script: 'mvn org.apache.maven.plugins:maven-help-plugin:3.1.0:evaluate -Dexpression=project.version -q -DforceStdout --batch-mode -U -e -Dsurefire.useFile=false'
	).trim()
}
