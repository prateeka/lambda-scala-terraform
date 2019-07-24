name := "lambda-scala-terraform"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies ++= List(
  "com.amazonaws" % "aws-java-sdk-lambda" % "1.11.596",
  "com.amazonaws" % "aws-lambda-java-core" % "1.2.0",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.9")