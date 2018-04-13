import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "data-reproducibility",
    resolvers += "jitpack" at "https://jitpack.io",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "com.github.springernature" %% "samatra-extras" % "v1.8.3",
    libraryDependencies += "org.json4s" %% "json4s-native" % "3.5.0"
  )

enablePlugins(JavaAppPackaging)