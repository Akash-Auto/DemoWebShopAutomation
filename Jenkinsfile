pipeline {
    agent any

    tools {
        maven 'Maven-3.9.15'
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn -version'
            }
        }
    }
}
