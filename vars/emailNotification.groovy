
def successEmail() {
    emailext(
        to: 'divakarsanikommu28@gmail.com',
        subject: "SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
        mimeType: 'text/html',
        body: """
            <h2 style="color:green;">Build Successful!</h2>
            <p>Hello Divakar,</p>
            <p>Your Jenkins build completed successfully.</p>
            <p>Project: ${env.JOB_NAME}</p>
            <p>Build Number: ${env.BUILD_NUMBER}</p>
            <p>Build URL: <a href="${env.BUILD_URL}">View Build</a></p>
        """
    )
}

def failureEmail() {
    emailext(
        to: 'divakarsanikommu28@gmail.com',
        subject: "FAILURE: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
        mimeType: 'text/html',
        body: """
            <h2 style="color:red;">Build Failed!</h2>
            <p>Hello Divakar,</p>
            <p>Your Jenkins build has failed.</p>
            <p>Project: ${env.JOB_NAME}</p>
            <p>Build Number: ${env.BUILD_NUMBER}</p>
            <p>Build URL: <a href="${env.BUILD_URL}">View Build Logs</a></p>
        """
    )
}
