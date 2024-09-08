@Library("shared-library@main") _
pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                script {
                    log.Info("Info")
                    log.Warning("Warning")
                    log.Debug("Debug")
                    log.Error("Error")
                }
            }
        }
    }
}
