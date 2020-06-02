//val Http4sVersion = "0.20.0-RC1"
//val CirceVersion = "0.11.1"
//val Specs2Version = "4.1.0"
//val LogbackVersion = "1.2.3"
//val DoobieVersion = "0.6.0"

lazy val root = (project in file("."))
  .settings(
    organization := "me.demi",
    name := "hello-http4s",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.13.2",
    libraryDependencies ++= Seq(
     "org.scalatest" %% "scalatest" % "3.0.8" % Test,
      "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
    )
  )

//scalacOptions ++= Seq(
//  "-deprecation",
//  "-encoding", "UTF-8",
//  "-language:higherKinds",
//  "-language:postfixOps",
//  "-feature",
//  "-Ypartial-unification",
//  "-Xfatal-warnings",
//)
