import sbt.Keys.testFrameworks

ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "dev.ligature"
ThisBuild / organizationName := "Ligature"

lazy val root = project
  .in(file("."))
  .settings(
    name := "ligature-ontology",
    scalaVersion := "3.0.0-M2",
    libraryDependencies += "dev.ligature" %% "ligature" % "0.1.0-SNAPSHOT",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.19" % Test,
    testFrameworks += new TestFramework("munit.Framework")
  )
