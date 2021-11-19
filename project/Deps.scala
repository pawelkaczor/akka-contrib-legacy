import sbt._

object Deps {

  object Version {
    val Akka                  = "2.6.15"
  }

  object Akka {
    val actor             = apply("actor")
    private def apply(moduleName: String) = "com.typesafe.akka" %% s"akka-$moduleName" % Version.Akka
  }

}
