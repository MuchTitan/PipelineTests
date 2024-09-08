@Library("shared-library@main") _
pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                script {
                    containerRun(Image: "hello-world")
                }
            }
        }
    }
}
