pipelineJob('hello-world-pipeline') {
    displayName('Hello World Pipeline')
    description('Pipeline to launch hello-world from https://github.com/alexfbasa/gradle-hello-world.git')

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/alexfbasa/gradle-hello-world.git'
                    }
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
    triggers {
        cron('*/1 * * * *')
    }
}
pipelineJob('lum-monitoring-minikube-stack') {
    displayName('Monitoring all the current Minikube nodes and jobs')
    description('Pipeline to monitoring Minikube from https://github.com/alexfbasa/JenkinsJobDsL.git')

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/alexfbasa/gradle-hello-world.git'
                    }
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
    triggers {
        cron('*/1 * * * *')
    }
}
