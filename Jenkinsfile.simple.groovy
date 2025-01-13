node('agent01') {
    stage('Source') {
        git 'https://github.com/vicktorsk/unir-test.git'
    }
    stage('Build') {
        echo 'Building stage!'
    }
}