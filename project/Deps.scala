import sbt._

object Deps {

  object Version {
    val Akka                  = "2.6.15"

    val Enumeratum            = "1.5.12"

    val json4s                = "3.5.3"

    // test
    val ScalaTest             = "3.0.1"
    val ScalaCheck            = "1.13.4"

    val LogbackClassic        = "1.1.7"
    val nScalaTime            = "2.16.0"
  }

  object Akka {
    val actor             = apply("actor")
    val clusterTools      = apply("cluster-tools")
    val clusterSharding   = apply("cluster-sharding")
    val contributions     = apply("contrib")
    val multiNodeTestkit  = apply("multi-node-testkit")
    val persistence       = apply("persistence")
    val persistenceQuery  = apply("persistence-query")
    val slf4j             = apply("slf4j")
    val stream            = apply("stream")
    val testkit           = apply("testkit")

    private def apply(moduleName: String) = "com.typesafe.akka" %% s"akka-$moduleName" % Version.Akka
  }

  object Json {
    val `4s`  = Seq(Json4s.native, Json4s.ext, Enum.jsonSupport)
  }

  object Enum {
    val enumeratum  = "com.beachape" %% "enumeratum" % Version.Enumeratum
    val jsonSupport = "com.beachape" %% "enumeratum-json4s" % Version.Enumeratum
  }

  object Json4s {
    val native  = apply("native")
    val ext     = apply("ext")

    private def apply(moduleName: String) = "org.json4s" %% s"json4s-$moduleName" % Version.json4s
  }

  object TestFrameworks {
    val scalaTest     = "org.scalatest" %% "scalatest" % Version.ScalaTest
    val scalaCheck    = "org.scalacheck" %% "scalacheck" % Version.ScalaCheck
  }

  val logbackClassic  = "ch.qos.logback" % "logback-classic" % Version.LogbackClassic
  val nscalaTime      = "com.github.nscala-time" %% "nscala-time" % Version.nScalaTime
}
