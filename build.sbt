lazy val root = (project in file(".")).
  settings(
    name := "lambda-demo",
    version := "0.1",
    scalaVersion := "2.13.0",
    retrieveManaged := true,
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-core" % "1.0.0",
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-events" % "1.0.0",
    libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.9"
  )

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case _ => MergeStrategy.first
}

logLevel in assembly := Level.Debug