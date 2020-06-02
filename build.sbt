val Http4sVersion = "0.20.0-RC1"

lazy val root = (project in file("."))
  .settings(
    organization := "me.demi",
    name := "hello-http4s",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.8",
    libraryDependencies ++= Seq(
      "org.http4s" %% "http4s-dsl" % Http4sVersion,
     "org.scalatest" %% "scalatest" % "3.0.8" % Test
    )
  )


