pipeline {
    agent any

    tools {
        maven 'Maven-3.9.15'
    }

    stages {
        stage('Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}
