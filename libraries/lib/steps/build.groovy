void call() {
    stage('Build') {
        echo "${WORKSPACE}"
        // Check if the build step is enabled
        if (env.BUILD_STEP_ENABLED != 'true') {
            // Execute the build script
            echo "🔧 Building application..."
            // sh "echo 'Compiling source code...'"
        } 
        else {
            echo 'Build step is disabled, skipping...'
        }

    }
}
