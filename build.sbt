name := "sbt-ci-release-early-usage"
organization := "com.michaelpollmeier"

scalaVersion := "2.12.6"
crossScalaVersions := Seq(scalaVersion.value, "2.11.12")
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.3"

homepage := Some(url("https://github.com/mpollmeier/sbt-ci-release-early-usage"))
scmInfo := Some(ScmInfo(
    url("https://github.com/mpollmeier/sbt-ci-release-early-usage"),
    "scm:git@github.com:mpollmeier/sbt-ci-release-early-usage.git"))
licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
developers := List(Developer("mpollmeier", "Michael Pollmeier", "michael@michaelpollmeier.com", url("https://michaelpollmeier.com")))
publishTo := sonatypePublishTo.value

