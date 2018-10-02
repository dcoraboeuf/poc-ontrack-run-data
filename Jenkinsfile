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
    }
}
