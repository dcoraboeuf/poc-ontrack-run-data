pipeline {
    agent any
    stages {
        stage("Setup") {
            steps {
                ontrackBranchSetup(project: 'poc-ontrack-run-data', branch: BRANCH_NAME, script: """
                    branch.config {
                        gitBranch '${BRANCH_NAME}', [
                            buildCommitLink: [
                                id: 'git-commit-property'
                            ]
                        ]
                    }
                """)
            }
        }
        stage("Build") {
            steps {
                ontrackBuild(project: 'poc-ontrack-run-data', branch: BRANCH_NAME, build: BUILD_NUMBER)
            }
        }
        stage("Tests") {
            steps {
                sh './gradlew clean test'
            }
            post {
                always {
                    def results = junit "build/test-results/test/*.xml"
                }
            }
        }
    }
}
