void call() {
    echo "✅ Running pre-build checks..."
    stage('Pre-Build Checks') {
        checkout([
            $class: 'GitSCM',
            branches: [[name: '*/main']],
            doGenerateSubmoduleConfigurations: false,
            extensions: [],
            userRemoteConfigs: [[
                url: 'git@gitlab.com:devplus-huuchinh/requirement.git',
                credentialsId: 'Git-get-agent'
            ]]
        ])
    }
}
