
def successEmail() {
    emailext(
        to: 'divakarsanikommu28@gmail.com',
        subject: "SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
        mimeType: 'text/html',
        body: """
            <html>
            <body>
                <h2 style="color:green;">Build Successful!</h2>
                <p>Hello Divakar,</p>
                <p>Your Jenkins pipeline completed successfully.</p>
                <p><b>Project:</b> ${env.JOB_NAME}</p>
                <p><b>Build Number:</b> ${env.BUILD_NUMBER}</p>
                <p><b>Status:</b> SUCCESS</p>
                <p><a href="${env.BUILD_URL}">View Build</a></p>
            </body>
            </html>
        """
    )
}

def failureEmail() {
    emailext(
        to: 'divakarsanikommu28@gmail.com',
        subject: "FAILURE: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
        mimeType: 'text/html',
        body: """
            <html>
            <body>
                <h2 style="color:red;">Build Failed!</h2>
                <p>Hello Divakar,</p>
                <p>Your Jenkins pipeline has failed.</p>
                <p><b>Project:</b> ${env.JOB_NAME}</p>
                <p><b>Build Number:</b> ${env.BUILD_NUMBER}</p>
                <p><b>Status:</b> FAILURE</p>
                <p><a href="${env.BUILD_URL}">View Build Logs</a></p>
            </body>
            </html>
        """
    )
}
