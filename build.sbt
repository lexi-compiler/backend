import Dependencies._

ThisBuild / scalaVersion     := "2.13.4"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "io.lexi-compiler"
ThisBuild / organizationName := "lexi-backend"

lazy val root = (project in file("."))
  .settings(
    name := "lexi-backend",
    libraryDependencies ++= Seq(
      asm,
      Cats.core,
      scalaTest % Test
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.