# junit-report-uploader-sample
A sample project for automatically uploading JUnit reports to Katalon TestOps using [katalon-testops-junit-plugin](https://github.com/katalon-studio/katalon-testops-junit-plugin).

# Instructions

Clone the repo:

Git:
```
$ git clone git@github.com:katalon-studio-samples/junit-report-uploader-sample.git
```

## Use Maven

Open a command window and run:
```sh
mvn test -Dtestops.apiKey=<Your Katalon TestOps API Key> -Dtestops.projectId=<Katalon TestOps Project Id>
```
