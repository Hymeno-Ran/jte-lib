
pipeline_template = "test-template-ci"

libraries{
    merge = true
    lib
}

stages {
    build()
    deploy()
}