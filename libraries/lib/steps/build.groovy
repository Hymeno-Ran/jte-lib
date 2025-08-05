void call(String a, String b, String c, String d) {
    stage('Build') {
        steps {
            echo "${WORKSPACE}"
            pre_build(a, b, c, d)
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
    stage('Run') {
        steps {
            echo "${WORKSPACE}"
            pre_build(a, b, c, d)
            echo "🔧 Building application..."
        }
    }
}
