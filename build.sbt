import Deps._
import sbt.Keys._
import java.net.URL

name := "akka-contrib-legacy"

version       := "0.2.1"
organization  := "pl.newicom"
scalaVersion  := "2.13.6"

scalacOptions  := Seq("-encoding", "utf8", "-deprecation", "-feature", "-unchecked")

publishMavenStyle  := true
homepage           := Some(new URL("http://github.com/pawelkaczor/akka-contrib-legacy"))
licenses           := ("Apache2", new URL("http://raw.githubusercontent.com/pawelkaczor/akka-contrib-legacy/master/LICENSE.md")) :: Nil
startYear := Some(2017)

sonatypeProfileName := "pl.newicom"

libraryDependencies += Akka.actor

lazy val root = (project in file("."))
  .settings(
    Publish.settings ++ Seq(
      publishTo := sonatypePublishToBundle.value
    )
  )