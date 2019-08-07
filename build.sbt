ThisBuild / name := "lambda-scala-terraform-demo"
ThisBuild / version := "0.1"
ThisBuild / scalaVersion := "2.13.0"

lazy val root = (project in file(".")).
  settings(
    retrieveManaged := true,
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-core" % "1.0.0",
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-events" % "1.0.0",
    libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.9",
    assemblyJarName in assembly := s"${(ThisBuild / name).value}.jar"
  )

//assembly plugin config
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case _ => MergeStrategy.first
}

//s3 plugin config
enablePlugins(S3Plugin)
mappings in s3Upload := Seq((new java.io.File(s"target/scala-2.13/${(ThisBuild / name).value}.jar"),
  s"${(ThisBuild / name).value}.jar"))
s3Host in s3Upload := "lambda-scala-terraform-demo" //bucket name

//logLevel in assembly := Level.Debug