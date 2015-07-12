
scalaVersion := "2.11.7"

name := "MyTimeTable"

libraryDependencies ++= Seq(
  "net.liftweb" %% "lift-util" % "2.6.2",
  "org.json4s" %% "json4s-native" % "3.2.11",
  "org.json4s" %% "json4s-ext" % "3.2.11",
  "com.github.scala-incubator.io" %% "scala-io-core" % "0.4.3-1",
  "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3-1",
  "org.slf4j" % "slf4j-log4j12" % "1.7.2",
  "org.scalatest" %% "scalatest" % "2.2.5" % "test"
)

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")
