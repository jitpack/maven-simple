pipeline {
    agent any
    
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

				}
			}
		}

}
