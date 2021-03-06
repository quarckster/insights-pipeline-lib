// Run a lint check using either flake8 or pylama (with the pytest plugin)


def call(parameters = [:]) {
    pylama = parameters.get('pylama', false)

    withStatusContext.lint {
        if (pylama) {
            sh "${pipelineVars.userPath}/pipenv run python -m pytest --pylama --junitxml=lint-results.xml --ignore=tests/"
        } else {
            sh "${pipelineVars.userPath}/pipenv run flake8 . --output-file lint-results.txt"
        }
    }

    try {
        if (fileExists("lint-results.txt")) {
            sh "${pipelineVars.userPath}/pipenv run flake8_junit lint-results.txt lint-results.xml"
        }
        junit 'lint-results.xml'
    } catch (evalErr) {
        // allow the unit tests to run even if evaluating lint results failed...
        echo evalErr.getMessage()
    }
}
