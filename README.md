# Word Counter

Welcome to the word counter application. The purpose
of this application is to take a relative path to
a text file and return a map of the words that 
appear in the file, and the number of times they
occur, in descending order by number of occurances.

## Testing the application

Pre-requisites: Java 21, Groovy, and Gradle

This application can be tested from the repo in the
following way:

`./gradlew clean test`

## Building the application

Pre-requisites: Java 21, Groovy, and Gradle

The application can be built with the following
command:

`./gradlew clean build`

This will output a jar file in
`./app/build/libs/app.jar`