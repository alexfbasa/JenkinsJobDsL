pipelineJob('hello-world-pipeline') {
    displayName('Hello World Pipeline')
    description('Pipeline to launch hello-world from https://github.com/alexfbasa/gradle-hello-world.git')

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('https://github.com/alexfbasa/gradle-hello-world.git')
                        credentials('github-token')
                    }
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}
