# Scurl - A small curl clone written in Scala

For educational purposes I wrote scurl, a small curl clone written in Scala. Currently scurl only support GET requests

## Installation

Checkout the repository and run

    sbt assembly

This command will make a "fat jar" including the scala standard library and makes it possible to start scurl using

    java -jar <path to scurl.jar>

Now you can place the jar file in the target/<scala-version> folder wherever you like.
