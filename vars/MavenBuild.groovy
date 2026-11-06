
def call() {
    //echo 'Starting Maven build...'

    sh 'mvn clean package'

    //echo 'Maven build completed successfully!'
}
