#!groovy
pipeline {
	agent any

	parameters {
		booleanParam(name: 'DeployFromBranch', defaultValue: false,
				description: 'The Develop branch is deployed automatically. ' +
						'If there is a need to deploy from the other branch, enable this parameter. ' +
						'The docker image will be released with generated version and deployed to DEV only.')
	}

    tools {
        jdk 'Zulu-JDK-11'
    }

    environment {
		ARTIFACTORY    = credentials('tpvas')
		SERVICE_NAME = 'fromi-otp-service'
		JENKINS_WEBHOOK_DEPLOYMENT_TOKEN = 'FROMI_Deployment_gkaiwcxsd'
		PATH = '/var/lib/jenkins/jobs/CI/workspace'
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
					def branchNewVersion = getVersion() + "_" + env.BUILD_NUMBER + "_" + branchSubstring
					echo "Version to be released from branch - ${branchNewVersion}"

					sh "mvn versions:set -DnewVersion=${branchNewVersion}"
					echo "New version in pom.xml - " + getVersion()
				}
			}
		}

		stage("Build") {
			steps {
				sendBuildStatus('INPROGRESS')
				sh "mvn clean verify"
			}
			post {
				failure {
					notify("Build")
					sendBuildStatus('FAILED')
				}
			}
		}

		stage('SonarQube analysis') {
		    steps {
				withSonarQubeEnv('sonarQube') {
					sh "mvn sonar:sonar " +
							"-Dsonar.projectKey=${SERVICE_NAME} " +
							"-Dsonar.projectVersion=${getVersion()} "
				}
			}
			post {
				failure {
					notify("SonarQube analysis")
					sendBuildStatus('FAILED')
				}
			}
		}

		stage("Quality Gate") {
		    options {
				timeout(time: 5, unit: 'MINUTES')
				retry(2)
			}
			steps {
				waitForQualityGate abortPipeline: true
			}
			post {
				success {
					sendBuildStatus('SUCCESSFUL')
				}
				failure {
					notify("Quality Gate")
					sendBuildStatus('FAILED')
				}
            }
		}

		stage('helm-lint') {
            steps {
                   sh "helm lint ${PATH}/oc-deployment"
            post {
                success {
					sendBuildStatus('SUCCESSFUL')
                    echo "helm lint success"
                }
                failure {
                    notify("helm-lint")
		  	        sendBuildStatus('FAILED')
                }
            }
        }
        stage("helm-push") {
            steps {
               script {
                       def pomVersion = readMavenPom file: 'oc-deployment/pom.xml'
					   echo "pom version ${pomVersion.version}"
                       sh "helm package ${PATH}/oc-deployment --version $pomVersion.version"
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
            post {
               success {
			     sendBuildStatus('SUCCESSFUL')
                 echo "helm chart pushed to jfrog repository"
               }
               failure {
               notify("helm-push")
               }
            }
        }

		stage("Release and deploy to DEV") {
		   	when {
				branch 'develop'
            }
			steps {
				sh "mvn scm:tag"
				sh "mvn docker:build docker:push"
			}
			post {
				success {
					triggerDeploymentInOpenShift()
				}
				failure {
					notify("Release and deploy to DEV")
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
					sh "mvn docker:build docker:push"

					triggerDeploymentInOpenShift()
				}
			}
			post {
				failure {
					notify("Deploy to DEV from branch")
				}
			}
		}
	}
}

def notify(stageName) {
	emailext (
			subject: "Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' failed ",
			body: "Job '${env.JOB_NAME} with build #[${env.BUILD_NUMBER}] failed at stage [${stageName}]. " +
					"See the build output <a href='${env.BUILD_URL}/console'>here</a>",
			mimeType: 'text/html',
			recipientProviders: [[$class: 'DevelopersRecipientProvider']],
			to: "devops-fsl@six-group.com"
	)
}

def getVersion() {
	return sh(returnStdout: true,
			script: 'mvn org.apache.maven.plugins:maven-help-plugin:3.1.0:evaluate -Dexpression=project.version -q -DforceStdout --batch-mode -U -e -Dsurefire.useFile=false'
	).trim()
}

def sendBuildStatus(status) {
	notifyBitbucket(
			credentialsId: 'tpvas',
			buildStatus: status,
			stashServerBaseUrl: 'https://stash.six-group.net')
}

def triggerDeploymentInOpenShift() {
	echo "Try to trigger deployment pipeline in OpenShift on DEV environment"
	sh "curl --fail -X POST --header \"Content-Type: application/json\" --data \"{'service':'${SERVICE_NAME}', 'version':'${getVersion()}', 'environment':'fromi-user-migration-dev'}\" https://jenkins-value-added-services-dev.v11.np01.ocp.six-group.net/generic-webhook-trigger/invoke?token=${JENKINS_WEBHOOK_DEPLOYMENT_TOKEN}"
}