import sbt._

object Dependencies {

  val akka = "com.typesafe.akka" %% "akka-actor" % "2.5.3"
  val akkaCluster = "com.typesafe.akka" %% "akka-cluster" % "2.5.3"
  val akkaClusterManagement = "com.lightbend.akka" %% "akka-management-cluster-http" % "0.3"
  val akkaTools = "com.typesafe.akka" %% "akka-cluster-tools" % "2.5.3"
  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.3" % "test"
}
