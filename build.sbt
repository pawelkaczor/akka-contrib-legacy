import Deps._
import sbt.Keys._
import java.net.URL

name := "akka-contrib-legacy"

version       := "0.1.0-SNAPSHOT"
organization  := "pl.newicom"
scalaVersion  := "2.12.3"

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
      publishTo := Some(if (isSnapshot.value) Opts.resolver.sonatypeSnapshots else Opts.resolver.sonatypeStaging)
    )
  )