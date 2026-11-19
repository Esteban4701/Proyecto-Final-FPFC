ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.9.0"

lazy val root = (project in file("."))
  .settings(
    name := "Proyecto-Final-FPFC",
    libraryDependencies += "org.scala-lang.modules" %% "scala-parallel-collections" % "1.3.0"
  )