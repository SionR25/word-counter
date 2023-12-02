# Word Counter

Welcome to the word counter application. The purpose
of this application is to take a relative path to
a text file and return a map of the words that 
appear in the file, and the number of times they
occur, in descending order by number of occurrences.

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

### Notes

I decided to use Groovy and Gradle as my previous experience has been pure Java and
Maven, so just wanted to get a feel for something different. I know it was mentioned
that you do a lot in Groovy so thought it would be good to get some exposure of it. It
did mean I probably had to spend a bit longer than I would if I was already familiar
with it (especially getting the gradle build right).

I made an assumption that it would be text files that it would be reading, so haven't
tested with any other files.

I decided to do more functional programming than OOP. Because the case was quite defined
and limited to one function, I though classes would be too much. If there were future 
requirements to maybe interact with the file or the word map, I would look to refactor
to classes and include class methods for the interaction with the file/word map.

Apologies if the commits look a bit scattered, I was just grabbing bits of the day as
and when I could.