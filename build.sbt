name := "akka-californium"

version := "1.0"

crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.1")

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.eclipse.californium" % "californium-core" % "2.0.0-M2",
  "com.typesafe.akka" %% "akka-stream" % "2.4.14"
)