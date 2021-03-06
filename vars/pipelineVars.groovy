class pipelineVars implements Serializable {
    String lintContext = "continuous-integration/jenkins/lint"
    String unitTestContext = "continuous-integration/jenkins/unittest"
    String pipInstallContext = "continuous-integration/jenkins/pipinstall"
    String swaggerContext = "continuous-integration/jenkins/swagger"
    String coverageContext = "continuous-integration/jenkins/coverage"
    String smokeContext = "continuous-integration/jenkins/e2e-smoke"

    String jenkinsSvcAccount = "jenkins"
    String defaultNameSpace = "jenkins"
    String defaultNodeImage = "docker-registry.default.svc:5000/jenkins/jenkins-slave-base-centos7-python36:latest"

    String gitSshCreds = "insightsdroid-ssh-git"

    String userPath = "~/.local/bin"
    String venvDir = "~/.venv"

    String smokeTestResourceLabel = "smoke_test_projects"
    String e2eDeployDir = 'e2e-deploy'
    String e2eDeployRepo = 'https://github.com/RedHatInsights/e2e-deploy.git'
    String e2eTestsDir = 'e2e-tests'
    String e2eTestsRepo = 'https://github.com/RedHatInsights/e2e-tests.git'
}
